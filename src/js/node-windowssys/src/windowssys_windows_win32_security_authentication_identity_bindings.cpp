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

static Napi::Value windowssys_windows_win32_security_authentication_identity_AcceptSecurityContext_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* phcredential = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* phcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pinput = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t fcontextreq = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t targetdatarep = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* phnewcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* poutput = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* pfcontextattr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    void* ptsexpiry = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "AcceptSecurityContext")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(phcredential, phcontext, pinput, fcontextreq, targetdatarep, phnewcontext, poutput, pfcontextattr, ptsexpiry) : -1;
#else
    (void)phcredential;
    (void)phcontext;
    (void)pinput;
    (void)fcontextreq;
    (void)targetdatarep;
    (void)phnewcontext;
    (void)poutput;
    (void)pfcontextattr;
    (void)ptsexpiry;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_AcquireCredentialsHandleA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pszprincipal = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pszpackage = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t fcredentialuse = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pvlogonid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pauthdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* pgetkeyfn = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* pvgetkeyargument = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* phcredential = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    void* ptsexpiry = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "AcquireCredentialsHandleA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pszprincipal, pszpackage, fcredentialuse, pvlogonid, pauthdata, pgetkeyfn, pvgetkeyargument, phcredential, ptsexpiry) : -1;
#else
    (void)pszprincipal;
    (void)pszpackage;
    (void)fcredentialuse;
    (void)pvlogonid;
    (void)pauthdata;
    (void)pgetkeyfn;
    (void)pvgetkeyargument;
    (void)phcredential;
    (void)ptsexpiry;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_AcquireCredentialsHandleW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pszprincipal = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pszpackage = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t fcredentialuse = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pvlogonid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pauthdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* pgetkeyfn = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* pvgetkeyargument = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* phcredential = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    void* ptsexpiry = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "AcquireCredentialsHandleW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pszprincipal, pszpackage, fcredentialuse, pvlogonid, pauthdata, pgetkeyfn, pvgetkeyargument, phcredential, ptsexpiry) : -1;
#else
    (void)pszprincipal;
    (void)pszpackage;
    (void)fcredentialuse;
    (void)pvlogonid;
    (void)pauthdata;
    (void)pgetkeyfn;
    (void)pvgetkeyargument;
    (void)phcredential;
    (void)ptsexpiry;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_AddCredentialsA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hcredentials = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pszprincipal = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pszpackage = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t fcredentialuse = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* pauthdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* pgetkeyfn = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* pvgetkeyargument = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* ptsexpiry = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "AddCredentialsA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcredentials, pszprincipal, pszpackage, fcredentialuse, pauthdata, pgetkeyfn, pvgetkeyargument, ptsexpiry) : -1;
#else
    (void)hcredentials;
    (void)pszprincipal;
    (void)pszpackage;
    (void)fcredentialuse;
    (void)pauthdata;
    (void)pgetkeyfn;
    (void)pvgetkeyargument;
    (void)ptsexpiry;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_AddCredentialsW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hcredentials = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pszprincipal = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pszpackage = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t fcredentialuse = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* pauthdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* pgetkeyfn = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* pvgetkeyargument = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* ptsexpiry = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "AddCredentialsW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcredentials, pszprincipal, pszpackage, fcredentialuse, pauthdata, pgetkeyfn, pvgetkeyargument, ptsexpiry) : -1;
#else
    (void)hcredentials;
    (void)pszprincipal;
    (void)pszpackage;
    (void)fcredentialuse;
    (void)pauthdata;
    (void)pgetkeyfn;
    (void)pvgetkeyargument;
    (void)ptsexpiry;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_AddSecurityPackageA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pszpackagename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* poptions = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "AddSecurityPackageA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pszpackagename, poptions) : -1;
#else
    (void)pszpackagename;
    (void)poptions;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_AddSecurityPackageW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pszpackagename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* poptions = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "AddSecurityPackageW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pszpackagename, poptions) : -1;
#else
    (void)pszpackagename;
    (void)poptions;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_ApplyControlToken_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* phcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pinput = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ApplyControlToken")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(phcontext, pinput) : -1;
#else
    (void)phcontext;
    (void)pinput;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_AuditComputeEffectivePolicyBySid_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* psid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* psubcategoryguids = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwpolicycount = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* ppauditpolicy = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "AuditComputeEffectivePolicyBySid")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(psid, psubcategoryguids, dwpolicycount, ppauditpolicy) : false;
#else
    (void)psid;
    (void)psubcategoryguids;
    (void)dwpolicycount;
    (void)ppauditpolicy;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_AuditComputeEffectivePolicyByToken_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* htokenhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* psubcategoryguids = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwpolicycount = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* ppauditpolicy = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "AuditComputeEffectivePolicyByToken")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(htokenhandle, psubcategoryguids, dwpolicycount, ppauditpolicy) : false;
#else
    (void)htokenhandle;
    (void)psubcategoryguids;
    (void)dwpolicycount;
    (void)ppauditpolicy;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_AuditEnumerateCategories_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ppauditcategoriesarray = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pdwcountreturned = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "AuditEnumerateCategories")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(ppauditcategoriesarray, pdwcountreturned) : false;
#else
    (void)ppauditcategoriesarray;
    (void)pdwcountreturned;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_AuditEnumeratePerUserPolicy_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ppauditsidarray = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "AuditEnumeratePerUserPolicy")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(ppauditsidarray) : false;
#else
    (void)ppauditsidarray;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_AuditEnumerateSubCategories_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pauditcategoryguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    bool bretrieveallsubcategories = km_info.Length() > 1 ? km_info[1].ToBoolean().Value() : false;
    void* ppauditsubcategoriesarray = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pdwcountreturned = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, bool, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "AuditEnumerateSubCategories")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pauditcategoryguid, bretrieveallsubcategories, ppauditsubcategoriesarray, pdwcountreturned) : false;
#else
    (void)pauditcategoryguid;
    (void)bretrieveallsubcategories;
    (void)ppauditsubcategoriesarray;
    (void)pdwcountreturned;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_AuditFree_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "AuditFree")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(buffer);
#else
    (void)buffer;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_AuditLookupCategoryGuidFromCategoryId_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t auditcategoryid = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* pauditcategoryguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "AuditLookupCategoryGuidFromCategoryId")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(auditcategoryid, pauditcategoryguid) : false;
#else
    (void)auditcategoryid;
    (void)pauditcategoryguid;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_AuditLookupCategoryIdFromCategoryGuid_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pauditcategoryguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pauditcategoryid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "AuditLookupCategoryIdFromCategoryGuid")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pauditcategoryguid, pauditcategoryid) : false;
#else
    (void)pauditcategoryguid;
    (void)pauditcategoryid;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_AuditLookupCategoryNameA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pauditcategoryguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ppszcategoryname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "AuditLookupCategoryNameA")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pauditcategoryguid, ppszcategoryname) : false;
#else
    (void)pauditcategoryguid;
    (void)ppszcategoryname;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_AuditLookupCategoryNameW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pauditcategoryguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ppszcategoryname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "AuditLookupCategoryNameW")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pauditcategoryguid, ppszcategoryname) : false;
#else
    (void)pauditcategoryguid;
    (void)ppszcategoryname;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_AuditLookupSubCategoryNameA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pauditsubcategoryguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ppszsubcategoryname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "AuditLookupSubCategoryNameA")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pauditsubcategoryguid, ppszsubcategoryname) : false;
#else
    (void)pauditsubcategoryguid;
    (void)ppszsubcategoryname;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_AuditLookupSubCategoryNameW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pauditsubcategoryguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ppszsubcategoryname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "AuditLookupSubCategoryNameW")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pauditsubcategoryguid, ppszsubcategoryname) : false;
#else
    (void)pauditsubcategoryguid;
    (void)ppszsubcategoryname;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_AuditQueryGlobalSaclA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* objecttypename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* acl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "AuditQueryGlobalSaclA")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(objecttypename, acl) : false;
#else
    (void)objecttypename;
    (void)acl;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_AuditQueryGlobalSaclW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* objecttypename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* acl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "AuditQueryGlobalSaclW")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(objecttypename, acl) : false;
#else
    (void)objecttypename;
    (void)acl;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_AuditQueryPerUserPolicy_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* psid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* psubcategoryguids = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwpolicycount = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* ppauditpolicy = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "AuditQueryPerUserPolicy")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(psid, psubcategoryguids, dwpolicycount, ppauditpolicy) : false;
#else
    (void)psid;
    (void)psubcategoryguids;
    (void)dwpolicycount;
    (void)ppauditpolicy;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_AuditQuerySecurity_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t securityinformation = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* ppsecuritydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "AuditQuerySecurity")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(securityinformation, ppsecuritydescriptor) : false;
#else
    (void)securityinformation;
    (void)ppsecuritydescriptor;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_AuditQuerySystemPolicy_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* psubcategoryguids = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwpolicycount = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* ppauditpolicy = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "AuditQuerySystemPolicy")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(psubcategoryguids, dwpolicycount, ppauditpolicy) : false;
#else
    (void)psubcategoryguids;
    (void)dwpolicycount;
    (void)ppauditpolicy;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_AuditSetGlobalSaclA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* objecttypename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* acl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "AuditSetGlobalSaclA")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(objecttypename, acl) : false;
#else
    (void)objecttypename;
    (void)acl;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_AuditSetGlobalSaclW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* objecttypename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* acl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "AuditSetGlobalSaclW")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(objecttypename, acl) : false;
#else
    (void)objecttypename;
    (void)acl;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_AuditSetPerUserPolicy_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* psid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pauditpolicy = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwpolicycount = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "AuditSetPerUserPolicy")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(psid, pauditpolicy, dwpolicycount) : false;
#else
    (void)psid;
    (void)pauditpolicy;
    (void)dwpolicycount;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_AuditSetSecurity_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t securityinformation = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* psecuritydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "AuditSetSecurity")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(securityinformation, psecuritydescriptor) : false;
#else
    (void)securityinformation;
    (void)psecuritydescriptor;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_AuditSetSystemPolicy_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pauditpolicy = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwpolicycount = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "AuditSetSystemPolicy")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pauditpolicy, dwpolicycount) : false;
#else
    (void)pauditpolicy;
    (void)dwpolicycount;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_ChangeAccountPasswordA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pszpackagename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pszdomainname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pszaccountname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pszoldpassword = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* psznewpassword = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    bool bimpersonating = km_info.Length() > 5 ? km_info[5].ToBoolean().Value() : false;
    uint32_t dwreserved = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    void* poutput = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, bool, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ChangeAccountPasswordA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pszpackagename, pszdomainname, pszaccountname, pszoldpassword, psznewpassword, bimpersonating, dwreserved, poutput) : -1;
#else
    (void)pszpackagename;
    (void)pszdomainname;
    (void)pszaccountname;
    (void)pszoldpassword;
    (void)psznewpassword;
    (void)bimpersonating;
    (void)dwreserved;
    (void)poutput;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_ChangeAccountPasswordW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pszpackagename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pszdomainname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pszaccountname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pszoldpassword = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* psznewpassword = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    bool bimpersonating = km_info.Length() > 5 ? km_info[5].ToBoolean().Value() : false;
    uint32_t dwreserved = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    void* poutput = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, bool, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ChangeAccountPasswordW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pszpackagename, pszdomainname, pszaccountname, pszoldpassword, psznewpassword, bimpersonating, dwreserved, poutput) : -1;
#else
    (void)pszpackagename;
    (void)pszdomainname;
    (void)pszaccountname;
    (void)pszoldpassword;
    (void)psznewpassword;
    (void)bimpersonating;
    (void)dwreserved;
    (void)poutput;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_CompleteAuthToken_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* phcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ptoken = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CompleteAuthToken")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(phcontext, ptoken) : -1;
#else
    (void)phcontext;
    (void)ptoken;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_CredMarshalTargetInfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* intargetinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* buffersize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CredMarshalTargetInfo")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(intargetinfo, buffer, buffersize) : -1;
#else
    (void)intargetinfo;
    (void)buffer;
    (void)buffersize;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_CredUnmarshalTargetInfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t buffersize = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* rettargetinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* retactualsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CredUnmarshalTargetInfo")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(buffer, buffersize, rettargetinfo, retactualsize) : -1;
#else
    (void)buffer;
    (void)buffersize;
    (void)rettargetinfo;
    (void)retactualsize;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_DecryptMessage_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* phcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pmessage = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t messageseqno = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pfqop = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DecryptMessage")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(phcontext, pmessage, messageseqno, pfqop) : -1;
#else
    (void)phcontext;
    (void)pmessage;
    (void)messageseqno;
    (void)pfqop;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_DeleteSecurityContext_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* phcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DeleteSecurityContext")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(phcontext) : -1;
#else
    (void)phcontext;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_DeleteSecurityPackageA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pszpackagename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DeleteSecurityPackageA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pszpackagename) : -1;
#else
    (void)pszpackagename;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_DeleteSecurityPackageW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pszpackagename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DeleteSecurityPackageW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pszpackagename) : -1;
#else
    (void)pszpackagename;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_EncryptMessage_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* phcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t fqop = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pmessage = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t messageseqno = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "EncryptMessage")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(phcontext, fqop, pmessage, messageseqno) : -1;
#else
    (void)phcontext;
    (void)fqop;
    (void)pmessage;
    (void)messageseqno;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_EnumerateSecurityPackagesA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pcpackages = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pppackageinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "EnumerateSecurityPackagesA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pcpackages, pppackageinfo) : -1;
#else
    (void)pcpackages;
    (void)pppackageinfo;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_EnumerateSecurityPackagesW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pcpackages = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pppackageinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "EnumerateSecurityPackagesW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pcpackages, pppackageinfo) : -1;
#else
    (void)pcpackages;
    (void)pppackageinfo;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_ExportSecurityContext_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* phcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t fflags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* ppackedcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* ptoken = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ExportSecurityContext")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(phcontext, fflags, ppackedcontext, ptoken) : -1;
#else
    (void)phcontext;
    (void)fflags;
    (void)ppackedcontext;
    (void)ptoken;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_FreeContextBuffer_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pvcontextbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FreeContextBuffer")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pvcontextbuffer) : -1;
#else
    (void)pvcontextbuffer;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_FreeCredentialsHandle_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* phcredential = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FreeCredentialsHandle")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(phcredential) : -1;
#else
    (void)phcredential;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_GetComputerObjectNameA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t nameformat = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* lpnamebuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* nsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(int32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetComputerObjectNameA")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(nameformat, lpnamebuffer, nsize) : false;
#else
    (void)nameformat;
    (void)lpnamebuffer;
    (void)nsize;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_GetComputerObjectNameW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t nameformat = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* lpnamebuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* nsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(int32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetComputerObjectNameW")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(nameformat, lpnamebuffer, nsize) : false;
#else
    (void)nameformat;
    (void)lpnamebuffer;
    (void)nsize;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_GetUserNameExA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t nameformat = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* lpnamebuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* nsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(int32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetUserNameExA")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(nameformat, lpnamebuffer, nsize) : false;
#else
    (void)nameformat;
    (void)lpnamebuffer;
    (void)nsize;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_GetUserNameExW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t nameformat = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* lpnamebuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* nsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(int32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetUserNameExW")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(nameformat, lpnamebuffer, nsize) : false;
#else
    (void)nameformat;
    (void)lpnamebuffer;
    (void)nsize;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_ImpersonateSecurityContext_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* phcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ImpersonateSecurityContext")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(phcontext) : -1;
#else
    (void)phcontext;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_ImportSecurityContextA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pszpackage = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ppackedcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* token = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* phcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ImportSecurityContextA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pszpackage, ppackedcontext, token, phcontext) : -1;
#else
    (void)pszpackage;
    (void)ppackedcontext;
    (void)token;
    (void)phcontext;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_ImportSecurityContextW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pszpackage = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ppackedcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* token = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* phcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ImportSecurityContextW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pszpackage, ppackedcontext, token, phcontext) : -1;
#else
    (void)pszpackage;
    (void)ppackedcontext;
    (void)token;
    (void)phcontext;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_InitSecurityInterfaceA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "InitSecurityInterfaceA")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr() : NULL;
#else
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_InitSecurityInterfaceW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "InitSecurityInterfaceW")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr() : NULL;
#else
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_InitializeSecurityContextA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* phcredential = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* phcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* psztargetname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t fcontextreq = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t reserved1 = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    uint32_t targetdatarep = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* pinput = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    uint32_t reserved2 = static_cast<uint32_t>(km_info.Length() > 7 ? km_info[7].ToNumber().Int32Value() : 0);
    void* phnewcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
    void* poutput = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 9 ? km_napi_arg_u64(km_info[9]) : 0));
    void* pfcontextattr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 10 ? km_napi_arg_u64(km_info[10]) : 0));
    void* ptsexpiry = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 11 ? km_napi_arg_u64(km_info[11]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, uint32_t, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "InitializeSecurityContextA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(phcredential, phcontext, psztargetname, fcontextreq, reserved1, targetdatarep, pinput, reserved2, phnewcontext, poutput, pfcontextattr, ptsexpiry) : -1;
#else
    (void)phcredential;
    (void)phcontext;
    (void)psztargetname;
    (void)fcontextreq;
    (void)reserved1;
    (void)targetdatarep;
    (void)pinput;
    (void)reserved2;
    (void)phnewcontext;
    (void)poutput;
    (void)pfcontextattr;
    (void)ptsexpiry;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_InitializeSecurityContextW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* phcredential = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* phcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* psztargetname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t fcontextreq = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t reserved1 = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    uint32_t targetdatarep = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* pinput = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    uint32_t reserved2 = static_cast<uint32_t>(km_info.Length() > 7 ? km_info[7].ToNumber().Int32Value() : 0);
    void* phnewcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
    void* poutput = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 9 ? km_napi_arg_u64(km_info[9]) : 0));
    void* pfcontextattr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 10 ? km_napi_arg_u64(km_info[10]) : 0));
    void* ptsexpiry = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 11 ? km_napi_arg_u64(km_info[11]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, uint32_t, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "InitializeSecurityContextW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(phcredential, phcontext, psztargetname, fcontextreq, reserved1, targetdatarep, pinput, reserved2, phnewcontext, poutput, pfcontextattr, ptsexpiry) : -1;
#else
    (void)phcredential;
    (void)phcontext;
    (void)psztargetname;
    (void)fcontextreq;
    (void)reserved1;
    (void)targetdatarep;
    (void)pinput;
    (void)reserved2;
    (void)phnewcontext;
    (void)poutput;
    (void)pfcontextattr;
    (void)ptsexpiry;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_LsaAddAccountRights_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t policyhandle = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* accountsid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* userrights = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t countofrights = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "LsaAddAccountRights")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(policyhandle, accountsid, userrights, countofrights) : -1;
#else
    (void)policyhandle;
    (void)accountsid;
    (void)userrights;
    (void)countofrights;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_LsaCallAuthenticationPackage_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lsahandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t authenticationpackage = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* protocolsubmitbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t submitbufferlength = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* protocolreturnbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* returnbufferlength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* protocolstatus = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "LsaCallAuthenticationPackage")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lsahandle, authenticationpackage, protocolsubmitbuffer, submitbufferlength, protocolreturnbuffer, returnbufferlength, protocolstatus) : -1;
#else
    (void)lsahandle;
    (void)authenticationpackage;
    (void)protocolsubmitbuffer;
    (void)submitbufferlength;
    (void)protocolreturnbuffer;
    (void)returnbufferlength;
    (void)protocolstatus;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_LsaClose_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t objecthandle = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "LsaClose")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(objecthandle) : -1;
#else
    (void)objecthandle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_LsaConnectUntrusted_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lsahandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "LsaConnectUntrusted")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lsahandle) : -1;
#else
    (void)lsahandle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_LsaCreateTrustedDomainEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t policyhandle = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* trusteddomaininformation = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* authenticationinformation = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t desiredaccess = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* trusteddomainhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "LsaCreateTrustedDomainEx")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(policyhandle, trusteddomaininformation, authenticationinformation, desiredaccess, trusteddomainhandle) : -1;
#else
    (void)policyhandle;
    (void)trusteddomaininformation;
    (void)authenticationinformation;
    (void)desiredaccess;
    (void)trusteddomainhandle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_LsaDeleteTrustedDomain_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t policyhandle = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* trusteddomainsid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "LsaDeleteTrustedDomain")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(policyhandle, trusteddomainsid) : -1;
#else
    (void)policyhandle;
    (void)trusteddomainsid;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_LsaDeregisterLogonProcess_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lsahandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "LsaDeregisterLogonProcess")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lsahandle) : -1;
#else
    (void)lsahandle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_LsaEnumerateAccountRights_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t policyhandle = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* accountsid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* userrights = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* countofrights = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "LsaEnumerateAccountRights")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(policyhandle, accountsid, userrights, countofrights) : -1;
#else
    (void)policyhandle;
    (void)accountsid;
    (void)userrights;
    (void)countofrights;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_LsaEnumerateAccountsWithUserRight_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t policyhandle = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* userright = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* countreturned = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "LsaEnumerateAccountsWithUserRight")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(policyhandle, userright, buffer, countreturned) : -1;
#else
    (void)policyhandle;
    (void)userright;
    (void)buffer;
    (void)countreturned;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_LsaEnumerateLogonSessions_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* logonsessioncount = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* logonsessionlist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "LsaEnumerateLogonSessions")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(logonsessioncount, logonsessionlist) : -1;
#else
    (void)logonsessioncount;
    (void)logonsessionlist;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_LsaEnumerateTrustedDomains_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t policyhandle = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* enumerationcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t preferedmaximumlength = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* countreturned = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "LsaEnumerateTrustedDomains")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(policyhandle, enumerationcontext, buffer, preferedmaximumlength, countreturned) : -1;
#else
    (void)policyhandle;
    (void)enumerationcontext;
    (void)buffer;
    (void)preferedmaximumlength;
    (void)countreturned;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_LsaEnumerateTrustedDomainsEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t policyhandle = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* enumerationcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t preferedmaximumlength = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* countreturned = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "LsaEnumerateTrustedDomainsEx")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(policyhandle, enumerationcontext, buffer, preferedmaximumlength, countreturned) : -1;
#else
    (void)policyhandle;
    (void)enumerationcontext;
    (void)buffer;
    (void)preferedmaximumlength;
    (void)countreturned;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_LsaFreeMemory_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "LsaFreeMemory")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(buffer) : -1;
#else
    (void)buffer;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_LsaFreeReturnBuffer_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "LsaFreeReturnBuffer")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(buffer) : -1;
#else
    (void)buffer;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_LsaGetAppliedCAPIDs_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* systemname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* capids = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* capidcount = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "LsaGetAppliedCAPIDs")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(systemname, capids, capidcount) : -1;
#else
    (void)systemname;
    (void)capids;
    (void)capidcount;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_LsaGetLogonSessionData_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* logonid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pplogonsessiondata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "LsaGetLogonSessionData")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(logonid, pplogonsessiondata) : -1;
#else
    (void)logonid;
    (void)pplogonsessiondata;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_LsaLookupAuthenticationPackage_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lsahandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* packagename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* authenticationpackage = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "LsaLookupAuthenticationPackage")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lsahandle, packagename, authenticationpackage) : -1;
#else
    (void)lsahandle;
    (void)packagename;
    (void)authenticationpackage;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_LsaLookupNames_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t policyhandle = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint32_t count = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* names = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* referenceddomains = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* sids = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "LsaLookupNames")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(policyhandle, count, names, referenceddomains, sids) : -1;
#else
    (void)policyhandle;
    (void)count;
    (void)names;
    (void)referenceddomains;
    (void)sids;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_LsaLookupNames2_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t policyhandle = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t count = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* names = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* referenceddomains = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* sids = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "LsaLookupNames2")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(policyhandle, flags, count, names, referenceddomains, sids) : -1;
#else
    (void)policyhandle;
    (void)flags;
    (void)count;
    (void)names;
    (void)referenceddomains;
    (void)sids;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_LsaLookupSids_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t policyhandle = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint32_t count = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* sids = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* referenceddomains = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* names = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "LsaLookupSids")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(policyhandle, count, sids, referenceddomains, names) : -1;
#else
    (void)policyhandle;
    (void)count;
    (void)sids;
    (void)referenceddomains;
    (void)names;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_LsaLookupSids2_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t policyhandle = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint32_t lookupoptions = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t count = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* sids = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* referenceddomains = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* names = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "LsaLookupSids2")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(policyhandle, lookupoptions, count, sids, referenceddomains, names) : -1;
#else
    (void)policyhandle;
    (void)lookupoptions;
    (void)count;
    (void)sids;
    (void)referenceddomains;
    (void)names;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_LsaNtStatusToWinError_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t status = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "LsaNtStatusToWinError")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(status) : 0;
#else
    (void)status;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_LsaOpenPolicy_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* systemname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* objectattributes = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t desiredaccess = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* policyhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "LsaOpenPolicy")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(systemname, objectattributes, desiredaccess, policyhandle) : -1;
#else
    (void)systemname;
    (void)objectattributes;
    (void)desiredaccess;
    (void)policyhandle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_LsaOpenTrustedDomainByName_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t policyhandle = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* trusteddomainname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t desiredaccess = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* trusteddomainhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "LsaOpenTrustedDomainByName")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(policyhandle, trusteddomainname, desiredaccess, trusteddomainhandle) : -1;
#else
    (void)policyhandle;
    (void)trusteddomainname;
    (void)desiredaccess;
    (void)trusteddomainhandle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_LsaQueryCAPs_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* capids = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t capidcount = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* caps = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* capcount = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "LsaQueryCAPs")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(capids, capidcount, caps, capcount) : -1;
#else
    (void)capids;
    (void)capidcount;
    (void)caps;
    (void)capcount;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_LsaQueryDomainInformationPolicy_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t policyhandle = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int32_t informationclass = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "LsaQueryDomainInformationPolicy")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(policyhandle, informationclass, buffer) : -1;
#else
    (void)policyhandle;
    (void)informationclass;
    (void)buffer;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_LsaQueryForestTrustInformation_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t policyhandle = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* trusteddomainname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* foresttrustinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "LsaQueryForestTrustInformation")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(policyhandle, trusteddomainname, foresttrustinfo) : -1;
#else
    (void)policyhandle;
    (void)trusteddomainname;
    (void)foresttrustinfo;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_LsaQueryForestTrustInformation2_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t policyhandle = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* trusteddomainname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t highestrecordtype = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* foresttrustinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "LsaQueryForestTrustInformation2")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(policyhandle, trusteddomainname, highestrecordtype, foresttrustinfo) : -1;
#else
    (void)policyhandle;
    (void)trusteddomainname;
    (void)highestrecordtype;
    (void)foresttrustinfo;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_LsaQueryInformationPolicy_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t policyhandle = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int32_t informationclass = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "LsaQueryInformationPolicy")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(policyhandle, informationclass, buffer) : -1;
#else
    (void)policyhandle;
    (void)informationclass;
    (void)buffer;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_LsaQueryTrustedDomainInfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t policyhandle = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* trusteddomainsid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t informationclass = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "LsaQueryTrustedDomainInfo")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(policyhandle, trusteddomainsid, informationclass, buffer) : -1;
#else
    (void)policyhandle;
    (void)trusteddomainsid;
    (void)informationclass;
    (void)buffer;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_LsaQueryTrustedDomainInfoByName_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t policyhandle = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* trusteddomainname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t informationclass = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "LsaQueryTrustedDomainInfoByName")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(policyhandle, trusteddomainname, informationclass, buffer) : -1;
#else
    (void)policyhandle;
    (void)trusteddomainname;
    (void)informationclass;
    (void)buffer;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_LsaRegisterLogonProcess_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* logonprocessname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lsahandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* securitymode = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "LsaRegisterLogonProcess")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(logonprocessname, lsahandle, securitymode) : -1;
#else
    (void)logonprocessname;
    (void)lsahandle;
    (void)securitymode;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_LsaRegisterPolicyChangeNotification_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t informationclass = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* notificationeventhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "LsaRegisterPolicyChangeNotification")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(informationclass, notificationeventhandle) : -1;
#else
    (void)informationclass;
    (void)notificationeventhandle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_LsaRemoveAccountRights_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t policyhandle = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* accountsid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    bool allrights = km_info.Length() > 2 ? km_info[2].ToBoolean().Value() : false;
    void* userrights = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t countofrights = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, bool, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "LsaRemoveAccountRights")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(policyhandle, accountsid, allrights, userrights, countofrights) : -1;
#else
    (void)policyhandle;
    (void)accountsid;
    (void)allrights;
    (void)userrights;
    (void)countofrights;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_LsaRetrievePrivateData_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t policyhandle = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* keyname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* privatedata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "LsaRetrievePrivateData")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(policyhandle, keyname, privatedata) : -1;
#else
    (void)policyhandle;
    (void)keyname;
    (void)privatedata;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_LsaSetCAPs_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* capdns = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t capdncount = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "LsaSetCAPs")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(capdns, capdncount, flags) : -1;
#else
    (void)capdns;
    (void)capdncount;
    (void)flags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_LsaSetDomainInformationPolicy_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t policyhandle = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int32_t informationclass = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "LsaSetDomainInformationPolicy")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(policyhandle, informationclass, buffer) : -1;
#else
    (void)policyhandle;
    (void)informationclass;
    (void)buffer;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_LsaSetForestTrustInformation_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t policyhandle = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* trusteddomainname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* foresttrustinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    bool checkonly = km_info.Length() > 3 ? km_info[3].ToBoolean().Value() : false;
    void* collisioninfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, bool, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "LsaSetForestTrustInformation")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(policyhandle, trusteddomainname, foresttrustinfo, checkonly, collisioninfo) : -1;
#else
    (void)policyhandle;
    (void)trusteddomainname;
    (void)foresttrustinfo;
    (void)checkonly;
    (void)collisioninfo;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_LsaSetForestTrustInformation2_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t policyhandle = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* trusteddomainname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t highestrecordtype = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* foresttrustinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    bool checkonly = km_info.Length() > 4 ? km_info[4].ToBoolean().Value() : false;
    void* collisioninfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, int32_t, void*, bool, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "LsaSetForestTrustInformation2")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(policyhandle, trusteddomainname, highestrecordtype, foresttrustinfo, checkonly, collisioninfo) : -1;
#else
    (void)policyhandle;
    (void)trusteddomainname;
    (void)highestrecordtype;
    (void)foresttrustinfo;
    (void)checkonly;
    (void)collisioninfo;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_LsaSetInformationPolicy_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t policyhandle = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int32_t informationclass = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "LsaSetInformationPolicy")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(policyhandle, informationclass, buffer) : -1;
#else
    (void)policyhandle;
    (void)informationclass;
    (void)buffer;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_LsaSetTrustedDomainInfoByName_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t policyhandle = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* trusteddomainname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t informationclass = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "LsaSetTrustedDomainInfoByName")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(policyhandle, trusteddomainname, informationclass, buffer) : -1;
#else
    (void)policyhandle;
    (void)trusteddomainname;
    (void)informationclass;
    (void)buffer;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_LsaSetTrustedDomainInformation_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t policyhandle = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* trusteddomainsid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t informationclass = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "LsaSetTrustedDomainInformation")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(policyhandle, trusteddomainsid, informationclass, buffer) : -1;
#else
    (void)policyhandle;
    (void)trusteddomainsid;
    (void)informationclass;
    (void)buffer;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_LsaStorePrivateData_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t policyhandle = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* keyname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* privatedata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "LsaStorePrivateData")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(policyhandle, keyname, privatedata) : -1;
#else
    (void)policyhandle;
    (void)keyname;
    (void)privatedata;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_LsaUnregisterPolicyChangeNotification_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t informationclass = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* notificationeventhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "LsaUnregisterPolicyChangeNotification")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(informationclass, notificationeventhandle) : -1;
#else
    (void)informationclass;
    (void)notificationeventhandle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_MakeSignature_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* phcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t fqop = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pmessage = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t messageseqno = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MakeSignature")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(phcontext, fqop, pmessage, messageseqno) : -1;
#else
    (void)phcontext;
    (void)fqop;
    (void)pmessage;
    (void)messageseqno;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_QueryContextAttributesA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* phcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t ulattribute = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "QueryContextAttributesA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(phcontext, ulattribute, pbuffer) : -1;
#else
    (void)phcontext;
    (void)ulattribute;
    (void)pbuffer;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_QueryContextAttributesExA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* phcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t ulattribute = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t cbbuffer = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("sspicli.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "QueryContextAttributesExA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(phcontext, ulattribute, pbuffer, cbbuffer) : -1;
#else
    (void)phcontext;
    (void)ulattribute;
    (void)pbuffer;
    (void)cbbuffer;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_QueryContextAttributesExW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* phcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t ulattribute = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t cbbuffer = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("sspicli.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "QueryContextAttributesExW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(phcontext, ulattribute, pbuffer, cbbuffer) : -1;
#else
    (void)phcontext;
    (void)ulattribute;
    (void)pbuffer;
    (void)cbbuffer;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_QueryContextAttributesW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* phcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t ulattribute = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "QueryContextAttributesW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(phcontext, ulattribute, pbuffer) : -1;
#else
    (void)phcontext;
    (void)ulattribute;
    (void)pbuffer;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_QueryCredentialsAttributesA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* phcredential = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t ulattribute = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "QueryCredentialsAttributesA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(phcredential, ulattribute, pbuffer) : -1;
#else
    (void)phcredential;
    (void)ulattribute;
    (void)pbuffer;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_QueryCredentialsAttributesExA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* phcredential = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t ulattribute = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t cbbuffer = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("sspicli.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "QueryCredentialsAttributesExA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(phcredential, ulattribute, pbuffer, cbbuffer) : -1;
#else
    (void)phcredential;
    (void)ulattribute;
    (void)pbuffer;
    (void)cbbuffer;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_QueryCredentialsAttributesExW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* phcredential = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t ulattribute = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t cbbuffer = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("sspicli.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "QueryCredentialsAttributesExW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(phcredential, ulattribute, pbuffer, cbbuffer) : -1;
#else
    (void)phcredential;
    (void)ulattribute;
    (void)pbuffer;
    (void)cbbuffer;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_QueryCredentialsAttributesW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* phcredential = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t ulattribute = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "QueryCredentialsAttributesW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(phcredential, ulattribute, pbuffer) : -1;
#else
    (void)phcredential;
    (void)ulattribute;
    (void)pbuffer;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_QuerySecurityContextToken_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* phcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* token = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "QuerySecurityContextToken")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(phcontext, token) : -1;
#else
    (void)phcontext;
    (void)token;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_QuerySecurityPackageInfoA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pszpackagename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pppackageinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "QuerySecurityPackageInfoA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pszpackagename, pppackageinfo) : -1;
#else
    (void)pszpackagename;
    (void)pppackageinfo;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_QuerySecurityPackageInfoW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pszpackagename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pppackageinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "QuerySecurityPackageInfoW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pszpackagename, pppackageinfo) : -1;
#else
    (void)pszpackagename;
    (void)pppackageinfo;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_RevertSecurityContext_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* phcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RevertSecurityContext")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(phcontext) : -1;
#else
    (void)phcontext;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_RtlDecryptMemory_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* memory = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t memorysize = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t optionflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SystemFunction041")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(memory, memorysize, optionflags) : -1;
#else
    (void)memory;
    (void)memorysize;
    (void)optionflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_RtlEncryptMemory_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* memory = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t memorysize = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t optionflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SystemFunction040")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(memory, memorysize, optionflags) : -1;
#else
    (void)memory;
    (void)memorysize;
    (void)optionflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_RtlGenRandom_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* randombuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t randombufferlength = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SystemFunction036")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(randombuffer, randombufferlength) : false;
#else
    (void)randombuffer;
    (void)randombufferlength;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_SLAcquireGenuineTicket_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ppticketblob = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pcbticketblob = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pwsztemplateid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pwszserverurl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pwszclienttoken = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("slcext.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SLAcquireGenuineTicket")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(ppticketblob, pcbticketblob, pwsztemplateid, pwszserverurl, pwszclienttoken) : -1;
#else
    (void)ppticketblob;
    (void)pcbticketblob;
    (void)pwsztemplateid;
    (void)pwszserverurl;
    (void)pwszclienttoken;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_SLActivateProduct_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hslc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pproductskuid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t cbappspecificdata = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pvappspecificdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pactivationinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* pwszproxyserver = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    uint16_t wproxyport = static_cast<uint16_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, uint16_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("slcext.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SLActivateProduct")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hslc, pproductskuid, cbappspecificdata, pvappspecificdata, pactivationinfo, pwszproxyserver, wproxyport) : -1;
#else
    (void)hslc;
    (void)pproductskuid;
    (void)cbappspecificdata;
    (void)pvappspecificdata;
    (void)pactivationinfo;
    (void)pwszproxyserver;
    (void)wproxyport;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_SLClose_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hslc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("slc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SLClose")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hslc) : -1;
#else
    (void)hslc;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_SLConsumeRight_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hslc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pappid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pproductskuid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pwszrightname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pvreserved = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("slc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SLConsumeRight")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hslc, pappid, pproductskuid, pwszrightname, pvreserved) : -1;
#else
    (void)hslc;
    (void)pappid;
    (void)pproductskuid;
    (void)pwszrightname;
    (void)pvreserved;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_SLDepositOfflineConfirmationId_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hslc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pproductskuid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pwszinstallationid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pwszconfirmationid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("slc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SLDepositOfflineConfirmationId")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hslc, pproductskuid, pwszinstallationid, pwszconfirmationid) : -1;
#else
    (void)hslc;
    (void)pproductskuid;
    (void)pwszinstallationid;
    (void)pwszconfirmationid;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_SLDepositOfflineConfirmationIdEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hslc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pproductskuid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pactivationinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pwszinstallationid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pwszconfirmationid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("slc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SLDepositOfflineConfirmationIdEx")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hslc, pproductskuid, pactivationinfo, pwszinstallationid, pwszconfirmationid) : -1;
#else
    (void)hslc;
    (void)pproductskuid;
    (void)pactivationinfo;
    (void)pwszinstallationid;
    (void)pwszconfirmationid;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_SLFireEvent_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hslc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pwszeventid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* papplicationid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("slc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SLFireEvent")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hslc, pwszeventid, papplicationid) : -1;
#else
    (void)hslc;
    (void)pwszeventid;
    (void)papplicationid;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_SLGenerateOfflineInstallationId_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hslc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pproductskuid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* ppwszinstallationid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("slc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SLGenerateOfflineInstallationId")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hslc, pproductskuid, ppwszinstallationid) : -1;
#else
    (void)hslc;
    (void)pproductskuid;
    (void)ppwszinstallationid;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_SLGenerateOfflineInstallationIdEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hslc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pproductskuid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pactivationinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* ppwszinstallationid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("slc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SLGenerateOfflineInstallationIdEx")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hslc, pproductskuid, pactivationinfo, ppwszinstallationid) : -1;
#else
    (void)hslc;
    (void)pproductskuid;
    (void)pactivationinfo;
    (void)ppwszinstallationid;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_SLGetApplicationInformation_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hslc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* papplicationid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pwszvaluename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pedatatype = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pcbvalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* ppbvalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("slc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SLGetApplicationInformation")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hslc, papplicationid, pwszvaluename, pedatatype, pcbvalue, ppbvalue) : -1;
#else
    (void)hslc;
    (void)papplicationid;
    (void)pwszvaluename;
    (void)pedatatype;
    (void)pcbvalue;
    (void)ppbvalue;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_SLGetGenuineInformation_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pqueryid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pwszvaluename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pedatatype = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pcbvalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* ppbvalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("slc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SLGetGenuineInformation")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pqueryid, pwszvaluename, pedatatype, pcbvalue, ppbvalue) : -1;
#else
    (void)pqueryid;
    (void)pwszvaluename;
    (void)pedatatype;
    (void)pcbvalue;
    (void)ppbvalue;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_SLGetInstalledProductKeyIds_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hslc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pproductskuid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pnproductkeyids = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* ppproductkeyids = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("slc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SLGetInstalledProductKeyIds")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hslc, pproductskuid, pnproductkeyids, ppproductkeyids) : -1;
#else
    (void)hslc;
    (void)pproductskuid;
    (void)pnproductkeyids;
    (void)ppproductkeyids;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_SLGetLicense_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hslc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* plicensefileid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pcblicensefile = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* ppblicensefile = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("slc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SLGetLicense")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hslc, plicensefileid, pcblicensefile, ppblicensefile) : -1;
#else
    (void)hslc;
    (void)plicensefileid;
    (void)pcblicensefile;
    (void)ppblicensefile;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_SLGetLicenseFileId_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hslc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t cblicenseblob = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pblicenseblob = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* plicensefileid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("slc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SLGetLicenseFileId")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hslc, cblicenseblob, pblicenseblob, plicensefileid) : -1;
#else
    (void)hslc;
    (void)cblicenseblob;
    (void)pblicenseblob;
    (void)plicensefileid;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_SLGetLicenseInformation_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hslc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* psllicenseid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pwszvaluename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pedatatype = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pcbvalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* ppbvalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("slc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SLGetLicenseInformation")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hslc, psllicenseid, pwszvaluename, pedatatype, pcbvalue, ppbvalue) : -1;
#else
    (void)hslc;
    (void)psllicenseid;
    (void)pwszvaluename;
    (void)pedatatype;
    (void)pcbvalue;
    (void)ppbvalue;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_SLGetLicensingStatusInformation_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hslc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pappid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pproductskuid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pwszrightname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pnstatuscount = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* pplicensingstatus = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("slc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SLGetLicensingStatusInformation")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hslc, pappid, pproductskuid, pwszrightname, pnstatuscount, pplicensingstatus) : -1;
#else
    (void)hslc;
    (void)pappid;
    (void)pproductskuid;
    (void)pwszrightname;
    (void)pnstatuscount;
    (void)pplicensingstatus;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_SLGetPKeyId_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hslc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pwszpkeyalgorithm = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pwszpkeystring = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t cbpkeyspecificdata = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* pbpkeyspecificdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* ppkeyid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("slc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SLGetPKeyId")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hslc, pwszpkeyalgorithm, pwszpkeystring, cbpkeyspecificdata, pbpkeyspecificdata, ppkeyid) : -1;
#else
    (void)hslc;
    (void)pwszpkeyalgorithm;
    (void)pwszpkeystring;
    (void)cbpkeyspecificdata;
    (void)pbpkeyspecificdata;
    (void)ppkeyid;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_SLGetPKeyInformation_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hslc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ppkeyid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pwszvaluename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pedatatype = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pcbvalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* ppbvalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("slc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SLGetPKeyInformation")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hslc, ppkeyid, pwszvaluename, pedatatype, pcbvalue, ppbvalue) : -1;
#else
    (void)hslc;
    (void)ppkeyid;
    (void)pwszvaluename;
    (void)pedatatype;
    (void)pcbvalue;
    (void)ppbvalue;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_SLGetPolicyInformation_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hslc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pwszvaluename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pedatatype = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pcbvalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* ppbvalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("slc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SLGetPolicyInformation")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hslc, pwszvaluename, pedatatype, pcbvalue, ppbvalue) : -1;
#else
    (void)hslc;
    (void)pwszvaluename;
    (void)pedatatype;
    (void)pcbvalue;
    (void)ppbvalue;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_SLGetPolicyInformationDWORD_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hslc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pwszvaluename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pdwvalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("slc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SLGetPolicyInformationDWORD")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hslc, pwszvaluename, pdwvalue) : -1;
#else
    (void)hslc;
    (void)pwszvaluename;
    (void)pdwvalue;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_SLGetProductSkuInformation_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hslc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pproductskuid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pwszvaluename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pedatatype = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pcbvalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* ppbvalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("slc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SLGetProductSkuInformation")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hslc, pproductskuid, pwszvaluename, pedatatype, pcbvalue, ppbvalue) : -1;
#else
    (void)hslc;
    (void)pproductskuid;
    (void)pwszvaluename;
    (void)pedatatype;
    (void)pcbvalue;
    (void)ppbvalue;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_SLGetReferralInformation_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hslc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t ereferraltype = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pskuorappid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pwszvaluename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* ppwszvalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("slcext.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SLGetReferralInformation")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hslc, ereferraltype, pskuorappid, pwszvaluename, ppwszvalue) : -1;
#else
    (void)hslc;
    (void)ereferraltype;
    (void)pskuorappid;
    (void)pwszvaluename;
    (void)ppwszvalue;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_SLGetSLIDList_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hslc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t equeryidtype = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pqueryid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int32_t ereturnidtype = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* pnreturnids = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* ppreturnids = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("slc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SLGetSLIDList")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hslc, equeryidtype, pqueryid, ereturnidtype, pnreturnids, ppreturnids) : -1;
#else
    (void)hslc;
    (void)equeryidtype;
    (void)pqueryid;
    (void)ereturnidtype;
    (void)pnreturnids;
    (void)ppreturnids;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_SLGetServerStatus_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pwszserverurl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pwszacquisitiontype = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pwszproxyserver = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint16_t wproxyport = static_cast<uint16_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* phrstatus = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint16_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("slcext.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SLGetServerStatus")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pwszserverurl, pwszacquisitiontype, pwszproxyserver, wproxyport, phrstatus) : -1;
#else
    (void)pwszserverurl;
    (void)pwszacquisitiontype;
    (void)pwszproxyserver;
    (void)wproxyport;
    (void)phrstatus;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_SLGetServiceInformation_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hslc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pwszvaluename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pedatatype = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pcbvalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* ppbvalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("slc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SLGetServiceInformation")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hslc, pwszvaluename, pedatatype, pcbvalue, ppbvalue) : -1;
#else
    (void)hslc;
    (void)pwszvaluename;
    (void)pedatatype;
    (void)pcbvalue;
    (void)ppbvalue;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_SLGetWindowsInformation_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pwszvaluename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pedatatype = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pcbvalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* ppbvalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("slc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SLGetWindowsInformation")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pwszvaluename, pedatatype, pcbvalue, ppbvalue) : -1;
#else
    (void)pwszvaluename;
    (void)pedatatype;
    (void)pcbvalue;
    (void)ppbvalue;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_SLGetWindowsInformationDWORD_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pwszvaluename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pdwvalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("slc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SLGetWindowsInformationDWORD")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pwszvaluename, pdwvalue) : -1;
#else
    (void)pwszvaluename;
    (void)pdwvalue;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_SLInstallLicense_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hslc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t cblicenseblob = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pblicenseblob = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* plicensefileid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("slc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SLInstallLicense")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hslc, cblicenseblob, pblicenseblob, plicensefileid) : -1;
#else
    (void)hslc;
    (void)cblicenseblob;
    (void)pblicenseblob;
    (void)plicensefileid;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_SLInstallProofOfPurchase_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hslc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pwszpkeyalgorithm = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pwszpkeystring = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t cbpkeyspecificdata = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* pbpkeyspecificdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* ppkeyid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("slc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SLInstallProofOfPurchase")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hslc, pwszpkeyalgorithm, pwszpkeystring, cbpkeyspecificdata, pbpkeyspecificdata, ppkeyid) : -1;
#else
    (void)hslc;
    (void)pwszpkeyalgorithm;
    (void)pwszpkeystring;
    (void)cbpkeyspecificdata;
    (void)pbpkeyspecificdata;
    (void)ppkeyid;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_SLIsGenuineLocal_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pappid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pgenuinestate = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* puioptions = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("slwga.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SLIsGenuineLocal")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pappid, pgenuinestate, puioptions) : -1;
#else
    (void)pappid;
    (void)pgenuinestate;
    (void)puioptions;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_SLOpen_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* phslc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("slc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SLOpen")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(phslc) : -1;
#else
    (void)phslc;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_SLQueryLicenseValueFromApp_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* valuename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* valuetype = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* databuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t datasize = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* resultdatasize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-slapi-l1-1-0.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SLQueryLicenseValueFromApp")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(valuename, valuetype, databuffer, datasize, resultdatasize) : -1;
#else
    (void)valuename;
    (void)valuetype;
    (void)databuffer;
    (void)datasize;
    (void)resultdatasize;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_SLRegisterEvent_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hslc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pwszeventid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* papplicationid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* hevent = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("slc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SLRegisterEvent")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hslc, pwszeventid, papplicationid, hevent) : -1;
#else
    (void)hslc;
    (void)pwszeventid;
    (void)papplicationid;
    (void)hevent;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_SLSetCurrentProductKey_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hslc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pproductskuid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pproductkeyid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("slc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SLSetCurrentProductKey")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hslc, pproductskuid, pproductkeyid) : -1;
#else
    (void)hslc;
    (void)pproductskuid;
    (void)pproductkeyid;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_SLSetGenuineInformation_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pqueryid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pwszvaluename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t edatatype = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t cbvalue = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* pbvalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("slc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SLSetGenuineInformation")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pqueryid, pwszvaluename, edatatype, cbvalue, pbvalue) : -1;
#else
    (void)pqueryid;
    (void)pwszvaluename;
    (void)edatatype;
    (void)cbvalue;
    (void)pbvalue;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_SLUninstallLicense_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hslc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* plicensefileid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("slc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SLUninstallLicense")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hslc, plicensefileid) : -1;
#else
    (void)hslc;
    (void)plicensefileid;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_SLUninstallProofOfPurchase_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hslc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ppkeyid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("slc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SLUninstallProofOfPurchase")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hslc, ppkeyid) : -1;
#else
    (void)hslc;
    (void)ppkeyid;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_SLUnregisterEvent_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hslc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pwszeventid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* papplicationid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* hevent = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("slc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SLUnregisterEvent")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hslc, pwszeventid, papplicationid, hevent) : -1;
#else
    (void)hslc;
    (void)pwszeventid;
    (void)papplicationid;
    (void)hevent;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_SaslAcceptSecurityContext_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* phcredential = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* phcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pinput = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t fcontextreq = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t targetdatarep = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* phnewcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* poutput = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* pfcontextattr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    void* ptsexpiry = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SaslAcceptSecurityContext")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(phcredential, phcontext, pinput, fcontextreq, targetdatarep, phnewcontext, poutput, pfcontextattr, ptsexpiry) : -1;
#else
    (void)phcredential;
    (void)phcontext;
    (void)pinput;
    (void)fcontextreq;
    (void)targetdatarep;
    (void)phnewcontext;
    (void)poutput;
    (void)pfcontextattr;
    (void)ptsexpiry;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_SaslEnumerateProfilesA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* profilelist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* profilecount = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SaslEnumerateProfilesA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(profilelist, profilecount) : -1;
#else
    (void)profilelist;
    (void)profilecount;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_SaslEnumerateProfilesW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* profilelist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* profilecount = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SaslEnumerateProfilesW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(profilelist, profilecount) : -1;
#else
    (void)profilelist;
    (void)profilecount;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_SaslGetContextOption_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* contexthandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t option = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* value = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t size = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* needed = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SaslGetContextOption")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(contexthandle, option, value, size, needed) : -1;
#else
    (void)contexthandle;
    (void)option;
    (void)value;
    (void)size;
    (void)needed;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_SaslGetProfilePackageA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* profilename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* packageinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SaslGetProfilePackageA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(profilename, packageinfo) : -1;
#else
    (void)profilename;
    (void)packageinfo;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_SaslGetProfilePackageW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* profilename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* packageinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SaslGetProfilePackageW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(profilename, packageinfo) : -1;
#else
    (void)profilename;
    (void)packageinfo;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_SaslIdentifyPackageA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pinput = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* packageinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SaslIdentifyPackageA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pinput, packageinfo) : -1;
#else
    (void)pinput;
    (void)packageinfo;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_SaslIdentifyPackageW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pinput = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* packageinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SaslIdentifyPackageW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pinput, packageinfo) : -1;
#else
    (void)pinput;
    (void)packageinfo;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_SaslInitializeSecurityContextA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* phcredential = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* phcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* psztargetname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t fcontextreq = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t reserved1 = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    uint32_t targetdatarep = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* pinput = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    uint32_t reserved2 = static_cast<uint32_t>(km_info.Length() > 7 ? km_info[7].ToNumber().Int32Value() : 0);
    void* phnewcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
    void* poutput = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 9 ? km_napi_arg_u64(km_info[9]) : 0));
    void* pfcontextattr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 10 ? km_napi_arg_u64(km_info[10]) : 0));
    void* ptsexpiry = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 11 ? km_napi_arg_u64(km_info[11]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, uint32_t, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SaslInitializeSecurityContextA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(phcredential, phcontext, psztargetname, fcontextreq, reserved1, targetdatarep, pinput, reserved2, phnewcontext, poutput, pfcontextattr, ptsexpiry) : -1;
#else
    (void)phcredential;
    (void)phcontext;
    (void)psztargetname;
    (void)fcontextreq;
    (void)reserved1;
    (void)targetdatarep;
    (void)pinput;
    (void)reserved2;
    (void)phnewcontext;
    (void)poutput;
    (void)pfcontextattr;
    (void)ptsexpiry;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_SaslInitializeSecurityContextW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* phcredential = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* phcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* psztargetname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t fcontextreq = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t reserved1 = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    uint32_t targetdatarep = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* pinput = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    uint32_t reserved2 = static_cast<uint32_t>(km_info.Length() > 7 ? km_info[7].ToNumber().Int32Value() : 0);
    void* phnewcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
    void* poutput = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 9 ? km_napi_arg_u64(km_info[9]) : 0));
    void* pfcontextattr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 10 ? km_napi_arg_u64(km_info[10]) : 0));
    void* ptsexpiry = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 11 ? km_napi_arg_u64(km_info[11]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, uint32_t, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SaslInitializeSecurityContextW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(phcredential, phcontext, psztargetname, fcontextreq, reserved1, targetdatarep, pinput, reserved2, phnewcontext, poutput, pfcontextattr, ptsexpiry) : -1;
#else
    (void)phcredential;
    (void)phcontext;
    (void)psztargetname;
    (void)fcontextreq;
    (void)reserved1;
    (void)targetdatarep;
    (void)pinput;
    (void)reserved2;
    (void)phnewcontext;
    (void)poutput;
    (void)pfcontextattr;
    (void)ptsexpiry;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_SaslSetContextOption_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* contexthandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t option = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* value = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t size = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SaslSetContextOption")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(contexthandle, option, value, size) : -1;
#else
    (void)contexthandle;
    (void)option;
    (void)value;
    (void)size;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_SendSAS_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t asuser = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("sas.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SendSAS")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(asuser);
#else
    (void)asuser;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_SetContextAttributesA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* phcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t ulattribute = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t cbbuffer = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetContextAttributesA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(phcontext, ulattribute, pbuffer, cbbuffer) : -1;
#else
    (void)phcontext;
    (void)ulattribute;
    (void)pbuffer;
    (void)cbbuffer;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_SetContextAttributesW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* phcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t ulattribute = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t cbbuffer = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetContextAttributesW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(phcontext, ulattribute, pbuffer, cbbuffer) : -1;
#else
    (void)phcontext;
    (void)ulattribute;
    (void)pbuffer;
    (void)cbbuffer;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_SetCredentialsAttributesA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* phcredential = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t ulattribute = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t cbbuffer = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetCredentialsAttributesA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(phcredential, ulattribute, pbuffer, cbbuffer) : -1;
#else
    (void)phcredential;
    (void)ulattribute;
    (void)pbuffer;
    (void)cbbuffer;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_SetCredentialsAttributesW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* phcredential = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t ulattribute = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t cbbuffer = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetCredentialsAttributesW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(phcredential, ulattribute, pbuffer, cbbuffer) : -1;
#else
    (void)phcredential;
    (void)ulattribute;
    (void)pbuffer;
    (void)cbbuffer;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_SslCrackCertificate_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pbcertificate = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t cbcertificate = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* ppcertificate = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("schannel.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SslCrackCertificate")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pbcertificate, cbcertificate, dwflags, ppcertificate) : -1;
#else
    (void)pbcertificate;
    (void)cbcertificate;
    (void)dwflags;
    (void)ppcertificate;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_SslEmptyCacheA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* psztargetname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("schannel.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SslEmptyCacheA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(psztargetname, dwflags) : -1;
#else
    (void)psztargetname;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_SslEmptyCacheW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* psztargetname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("schannel.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SslEmptyCacheW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(psztargetname, dwflags) : -1;
#else
    (void)psztargetname;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_SslFreeCertificate_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pcertificate = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("schannel.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SslFreeCertificate")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(pcertificate);
#else
    (void)pcertificate;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_SslGenerateRandomBits_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* prandomdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t crandomdata = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("schannel.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SslGenerateRandomBits")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(prandomdata, crandomdata);
#else
    (void)prandomdata;
    (void)crandomdata;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_SslGetExtensions_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* clienthello = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t clienthellobytesize = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* genericextensions = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint8_t genericextensionscount = static_cast<uint8_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* bytestoread = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    int32_t flags = static_cast<int32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint8_t, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("schannel.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SslGetExtensions")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(clienthello, clienthellobytesize, genericextensions, genericextensionscount, bytestoread, flags) : -1;
#else
    (void)clienthello;
    (void)clienthellobytesize;
    (void)genericextensions;
    (void)genericextensionscount;
    (void)bytestoread;
    (void)flags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_SslGetMaximumKeySize_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t reserved = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("schannel.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SslGetMaximumKeySize")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(reserved) : 0;
#else
    (void)reserved;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_SslGetServerIdentity_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* clienthello = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t clienthellosize = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* serveridentity = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* serveridentitysize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("schannel.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SslGetServerIdentity")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(clienthello, clienthellosize, serveridentity, serveridentitysize, flags) : -1;
#else
    (void)clienthello;
    (void)clienthellosize;
    (void)serveridentity;
    (void)serveridentitysize;
    (void)flags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_SspiCompareAuthIdentities_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* authidentity1 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* authidentity2 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* samesupplieduser = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* samesuppliedidentity = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SspiCompareAuthIdentities")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(authidentity1, authidentity2, samesupplieduser, samesuppliedidentity) : -1;
#else
    (void)authidentity1;
    (void)authidentity2;
    (void)samesupplieduser;
    (void)samesuppliedidentity;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_SspiCopyAuthIdentity_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* authdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* authdatacopy = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SspiCopyAuthIdentity")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(authdata, authdatacopy) : -1;
#else
    (void)authdata;
    (void)authdatacopy;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_SspiDecryptAuthIdentity_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* encryptedauthdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SspiDecryptAuthIdentity")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(encryptedauthdata) : -1;
#else
    (void)encryptedauthdata;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_SspiDecryptAuthIdentityEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t options = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* encryptedauthdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("sspicli.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SspiDecryptAuthIdentityEx")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(options, encryptedauthdata) : -1;
#else
    (void)options;
    (void)encryptedauthdata;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_SspiEncodeAuthIdentityAsStrings_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pauthidentity = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ppszusername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* ppszdomainname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* ppszpackedcredentialsstring = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SspiEncodeAuthIdentityAsStrings")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pauthidentity, ppszusername, ppszdomainname, ppszpackedcredentialsstring) : -1;
#else
    (void)pauthidentity;
    (void)ppszusername;
    (void)ppszdomainname;
    (void)ppszpackedcredentialsstring;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_SspiEncodeStringsAsAuthIdentity_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pszusername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pszdomainname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pszpackedcredentialsstring = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* ppauthidentity = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SspiEncodeStringsAsAuthIdentity")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pszusername, pszdomainname, pszpackedcredentialsstring, ppauthidentity) : -1;
#else
    (void)pszusername;
    (void)pszdomainname;
    (void)pszpackedcredentialsstring;
    (void)ppauthidentity;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_SspiEncryptAuthIdentity_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* authdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SspiEncryptAuthIdentity")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(authdata) : -1;
#else
    (void)authdata;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_SspiEncryptAuthIdentityEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t options = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* authdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("sspicli.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SspiEncryptAuthIdentityEx")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(options, authdata) : -1;
#else
    (void)options;
    (void)authdata;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_SspiExcludePackage_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* authidentity = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pszpackagename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* ppnewauthidentity = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SspiExcludePackage")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(authidentity, pszpackagename, ppnewauthidentity) : -1;
#else
    (void)authidentity;
    (void)pszpackagename;
    (void)ppnewauthidentity;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_SspiFreeAuthIdentity_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* authdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SspiFreeAuthIdentity")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(authdata);
#else
    (void)authdata;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_SspiGetTargetHostName_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* psztargetname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pszhostname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SspiGetTargetHostName")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(psztargetname, pszhostname) : -1;
#else
    (void)psztargetname;
    (void)pszhostname;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_SspiIsAuthIdentityEncrypted_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* encryptedauthdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SspiIsAuthIdentityEncrypted")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(encryptedauthdata) : false;
#else
    (void)encryptedauthdata;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_SspiIsPromptingNeeded_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t errororntstatus = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("credui.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SspiIsPromptingNeeded")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(errororntstatus) : false;
#else
    (void)errororntstatus;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_SspiLocalFree_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* databuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SspiLocalFree")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(databuffer);
#else
    (void)databuffer;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_SspiMarshalAuthIdentity_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* authidentity = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* authidentitylength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* authidentitybytearray = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SspiMarshalAuthIdentity")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(authidentity, authidentitylength, authidentitybytearray) : -1;
#else
    (void)authidentity;
    (void)authidentitylength;
    (void)authidentitybytearray;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_SspiPrepareForCredRead_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* authidentity = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* psztargetname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pcredmancredentialtype = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* ppszcredmantargetname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SspiPrepareForCredRead")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(authidentity, psztargetname, pcredmancredentialtype, ppszcredmantargetname) : -1;
#else
    (void)authidentity;
    (void)psztargetname;
    (void)pcredmancredentialtype;
    (void)ppszcredmantargetname;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_SspiPrepareForCredWrite_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* authidentity = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* psztargetname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pcredmancredentialtype = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* ppszcredmantargetname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* ppszcredmanusername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* ppcredentialblob = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* pcredentialblobsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SspiPrepareForCredWrite")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(authidentity, psztargetname, pcredmancredentialtype, ppszcredmantargetname, ppszcredmanusername, ppcredentialblob, pcredentialblobsize) : -1;
#else
    (void)authidentity;
    (void)psztargetname;
    (void)pcredmancredentialtype;
    (void)ppszcredmantargetname;
    (void)ppszcredmanusername;
    (void)ppcredentialblob;
    (void)pcredentialblobsize;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_SspiPromptForCredentialsA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* psztargetname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* puiinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwautherror = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pszpackage = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pinputauthidentity = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* ppauthidentity = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* pfsave = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 7 ? km_info[7].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("credui.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SspiPromptForCredentialsA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(psztargetname, puiinfo, dwautherror, pszpackage, pinputauthidentity, ppauthidentity, pfsave, dwflags) : 0;
#else
    (void)psztargetname;
    (void)puiinfo;
    (void)dwautherror;
    (void)pszpackage;
    (void)pinputauthidentity;
    (void)ppauthidentity;
    (void)pfsave;
    (void)dwflags;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_SspiPromptForCredentialsW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* psztargetname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* puiinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwautherror = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pszpackage = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pinputauthidentity = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* ppauthidentity = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* pfsave = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 7 ? km_info[7].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("credui.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SspiPromptForCredentialsW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(psztargetname, puiinfo, dwautherror, pszpackage, pinputauthidentity, ppauthidentity, pfsave, dwflags) : 0;
#else
    (void)psztargetname;
    (void)puiinfo;
    (void)dwautherror;
    (void)pszpackage;
    (void)pinputauthidentity;
    (void)ppauthidentity;
    (void)pfsave;
    (void)dwflags;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_SspiSetChannelBindingFlags_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pbindings = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("sspicli.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SspiSetChannelBindingFlags")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pbindings, flags) : -1;
#else
    (void)pbindings;
    (void)flags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_SspiUnmarshalAuthIdentity_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t authidentitylength = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* authidentitybytearray = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* ppauthidentity = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SspiUnmarshalAuthIdentity")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(authidentitylength, authidentitybytearray, ppauthidentity) : -1;
#else
    (void)authidentitylength;
    (void)authidentitybytearray;
    (void)ppauthidentity;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_SspiValidateAuthIdentity_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* authdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SspiValidateAuthIdentity")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(authdata) : -1;
#else
    (void)authdata;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_SspiZeroAuthIdentity_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* authdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SspiZeroAuthIdentity")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(authdata);
#else
    (void)authdata;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_TokenBindingDeleteAllBindings_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("tokenbinding.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "TokenBindingDeleteAllBindings")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_TokenBindingDeleteBinding_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* targeturl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("tokenbinding.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "TokenBindingDeleteBinding")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(targeturl) : -1;
#else
    (void)targeturl;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_TokenBindingGenerateBinding_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t keytype = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* targeturl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t bindingtype = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* tlsekm = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t tlsekmsize = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    int32_t extensionformat = static_cast<int32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* extensiondata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* tokenbinding = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    void* tokenbindingsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
    void* resultdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 9 ? km_napi_arg_u64(km_info[9]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, int32_t, void*, uint32_t, int32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("tokenbinding.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "TokenBindingGenerateBinding")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(keytype, targeturl, bindingtype, tlsekm, tlsekmsize, extensionformat, extensiondata, tokenbinding, tokenbindingsize, resultdata) : -1;
#else
    (void)keytype;
    (void)targeturl;
    (void)bindingtype;
    (void)tlsekm;
    (void)tlsekmsize;
    (void)extensionformat;
    (void)extensiondata;
    (void)tokenbinding;
    (void)tokenbindingsize;
    (void)resultdata;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_TokenBindingGenerateID_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t keytype = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* publickey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t publickeysize = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* resultdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("tokenbinding.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "TokenBindingGenerateID")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(keytype, publickey, publickeysize, resultdata) : -1;
#else
    (void)keytype;
    (void)publickey;
    (void)publickeysize;
    (void)resultdata;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_TokenBindingGenerateIDForUri_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t keytype = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* targeturi = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* resultdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("tokenbinding.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "TokenBindingGenerateIDForUri")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(keytype, targeturi, resultdata) : -1;
#else
    (void)keytype;
    (void)targeturi;
    (void)resultdata;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_TokenBindingGenerateMessage_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* tokenbindings = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* tokenbindingssize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t tokenbindingscount = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* tokenbindingmessage = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* tokenbindingmessagesize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("tokenbinding.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "TokenBindingGenerateMessage")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(tokenbindings, tokenbindingssize, tokenbindingscount, tokenbindingmessage, tokenbindingmessagesize) : -1;
#else
    (void)tokenbindings;
    (void)tokenbindingssize;
    (void)tokenbindingscount;
    (void)tokenbindingmessage;
    (void)tokenbindingmessagesize;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_TokenBindingGetHighestSupportedVersion_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* majorversion = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* minorversion = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("tokenbinding.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "TokenBindingGetHighestSupportedVersion")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(majorversion, minorversion) : -1;
#else
    (void)majorversion;
    (void)minorversion;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_TokenBindingGetKeyTypesClient_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* keytypes = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("tokenbinding.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "TokenBindingGetKeyTypesClient")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(keytypes) : -1;
#else
    (void)keytypes;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_TokenBindingGetKeyTypesServer_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* keytypes = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("tokenbinding.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "TokenBindingGetKeyTypesServer")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(keytypes) : -1;
#else
    (void)keytypes;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_TokenBindingVerifyMessage_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* tokenbindingmessage = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t tokenbindingmessagesize = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t keytype = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* tlsekm = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t tlsekmsize = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* resultlist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("tokenbinding.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "TokenBindingVerifyMessage")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(tokenbindingmessage, tokenbindingmessagesize, keytype, tlsekm, tlsekmsize, resultlist) : -1;
#else
    (void)tokenbindingmessage;
    (void)tokenbindingmessagesize;
    (void)keytype;
    (void)tlsekm;
    (void)tlsekmsize;
    (void)resultlist;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_TranslateNameA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpaccountname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t accountnameformat = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t desirednameformat = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* lptranslatedname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* nsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "TranslateNameA")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpaccountname, accountnameformat, desirednameformat, lptranslatedname, nsize) : false;
#else
    (void)lpaccountname;
    (void)accountnameformat;
    (void)desirednameformat;
    (void)lptranslatedname;
    (void)nsize;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_TranslateNameW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpaccountname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t accountnameformat = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t desirednameformat = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* lptranslatedname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* nsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "TranslateNameW")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpaccountname, accountnameformat, desirednameformat, lptranslatedname, nsize) : false;
#else
    (void)lpaccountname;
    (void)accountnameformat;
    (void)desirednameformat;
    (void)lptranslatedname;
    (void)nsize;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_win32_security_authentication_identity_VerifySignature_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* phcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pmessage = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t messageseqno = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pfqop = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "VerifySignature")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(phcontext, pmessage, messageseqno, pfqop) : -1;
#else
    (void)phcontext;
    (void)pmessage;
    (void)messageseqno;
    (void)pfqop;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static void register_windows_win32_security_authentication_identity_napi(Napi::Env env, Napi::Object exports) {
    exports.Set("windowssys_windows_win32_security_authentication_identity_AcceptSecurityContext", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_AcceptSecurityContext_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_AcquireCredentialsHandleA", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_AcquireCredentialsHandleA_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_AcquireCredentialsHandleW", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_AcquireCredentialsHandleW_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_AddCredentialsA", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_AddCredentialsA_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_AddCredentialsW", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_AddCredentialsW_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_AddSecurityPackageA", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_AddSecurityPackageA_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_AddSecurityPackageW", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_AddSecurityPackageW_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_ApplyControlToken", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_ApplyControlToken_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_AuditComputeEffectivePolicyBySid", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_AuditComputeEffectivePolicyBySid_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_AuditComputeEffectivePolicyByToken", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_AuditComputeEffectivePolicyByToken_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_AuditEnumerateCategories", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_AuditEnumerateCategories_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_AuditEnumeratePerUserPolicy", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_AuditEnumeratePerUserPolicy_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_AuditEnumerateSubCategories", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_AuditEnumerateSubCategories_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_AuditFree", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_AuditFree_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_AuditLookupCategoryGuidFromCategoryId", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_AuditLookupCategoryGuidFromCategoryId_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_AuditLookupCategoryIdFromCategoryGuid", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_AuditLookupCategoryIdFromCategoryGuid_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_AuditLookupCategoryNameA", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_AuditLookupCategoryNameA_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_AuditLookupCategoryNameW", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_AuditLookupCategoryNameW_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_AuditLookupSubCategoryNameA", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_AuditLookupSubCategoryNameA_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_AuditLookupSubCategoryNameW", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_AuditLookupSubCategoryNameW_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_AuditQueryGlobalSaclA", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_AuditQueryGlobalSaclA_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_AuditQueryGlobalSaclW", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_AuditQueryGlobalSaclW_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_AuditQueryPerUserPolicy", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_AuditQueryPerUserPolicy_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_AuditQuerySecurity", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_AuditQuerySecurity_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_AuditQuerySystemPolicy", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_AuditQuerySystemPolicy_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_AuditSetGlobalSaclA", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_AuditSetGlobalSaclA_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_AuditSetGlobalSaclW", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_AuditSetGlobalSaclW_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_AuditSetPerUserPolicy", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_AuditSetPerUserPolicy_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_AuditSetSecurity", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_AuditSetSecurity_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_AuditSetSystemPolicy", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_AuditSetSystemPolicy_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_ChangeAccountPasswordA", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_ChangeAccountPasswordA_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_ChangeAccountPasswordW", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_ChangeAccountPasswordW_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_CompleteAuthToken", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_CompleteAuthToken_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_CredMarshalTargetInfo", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_CredMarshalTargetInfo_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_CredUnmarshalTargetInfo", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_CredUnmarshalTargetInfo_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_DecryptMessage", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_DecryptMessage_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_DeleteSecurityContext", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_DeleteSecurityContext_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_DeleteSecurityPackageA", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_DeleteSecurityPackageA_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_DeleteSecurityPackageW", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_DeleteSecurityPackageW_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_EncryptMessage", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_EncryptMessage_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_EnumerateSecurityPackagesA", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_EnumerateSecurityPackagesA_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_EnumerateSecurityPackagesW", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_EnumerateSecurityPackagesW_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_ExportSecurityContext", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_ExportSecurityContext_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_FreeContextBuffer", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_FreeContextBuffer_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_FreeCredentialsHandle", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_FreeCredentialsHandle_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_GetComputerObjectNameA", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_GetComputerObjectNameA_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_GetComputerObjectNameW", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_GetComputerObjectNameW_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_GetUserNameExA", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_GetUserNameExA_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_GetUserNameExW", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_GetUserNameExW_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_ImpersonateSecurityContext", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_ImpersonateSecurityContext_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_ImportSecurityContextA", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_ImportSecurityContextA_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_ImportSecurityContextW", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_ImportSecurityContextW_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_InitSecurityInterfaceA", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_InitSecurityInterfaceA_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_InitSecurityInterfaceW", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_InitSecurityInterfaceW_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_InitializeSecurityContextA", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_InitializeSecurityContextA_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_InitializeSecurityContextW", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_InitializeSecurityContextW_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_LsaAddAccountRights", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_LsaAddAccountRights_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_LsaCallAuthenticationPackage", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_LsaCallAuthenticationPackage_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_LsaClose", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_LsaClose_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_LsaConnectUntrusted", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_LsaConnectUntrusted_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_LsaCreateTrustedDomainEx", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_LsaCreateTrustedDomainEx_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_LsaDeleteTrustedDomain", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_LsaDeleteTrustedDomain_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_LsaDeregisterLogonProcess", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_LsaDeregisterLogonProcess_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_LsaEnumerateAccountRights", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_LsaEnumerateAccountRights_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_LsaEnumerateAccountsWithUserRight", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_LsaEnumerateAccountsWithUserRight_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_LsaEnumerateLogonSessions", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_LsaEnumerateLogonSessions_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_LsaEnumerateTrustedDomains", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_LsaEnumerateTrustedDomains_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_LsaEnumerateTrustedDomainsEx", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_LsaEnumerateTrustedDomainsEx_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_LsaFreeMemory", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_LsaFreeMemory_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_LsaFreeReturnBuffer", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_LsaFreeReturnBuffer_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_LsaGetAppliedCAPIDs", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_LsaGetAppliedCAPIDs_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_LsaGetLogonSessionData", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_LsaGetLogonSessionData_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_LsaLookupAuthenticationPackage", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_LsaLookupAuthenticationPackage_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_LsaLookupNames", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_LsaLookupNames_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_LsaLookupNames2", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_LsaLookupNames2_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_LsaLookupSids", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_LsaLookupSids_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_LsaLookupSids2", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_LsaLookupSids2_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_LsaNtStatusToWinError", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_LsaNtStatusToWinError_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_LsaOpenPolicy", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_LsaOpenPolicy_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_LsaOpenTrustedDomainByName", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_LsaOpenTrustedDomainByName_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_LsaQueryCAPs", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_LsaQueryCAPs_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_LsaQueryDomainInformationPolicy", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_LsaQueryDomainInformationPolicy_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_LsaQueryForestTrustInformation", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_LsaQueryForestTrustInformation_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_LsaQueryForestTrustInformation2", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_LsaQueryForestTrustInformation2_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_LsaQueryInformationPolicy", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_LsaQueryInformationPolicy_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_LsaQueryTrustedDomainInfo", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_LsaQueryTrustedDomainInfo_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_LsaQueryTrustedDomainInfoByName", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_LsaQueryTrustedDomainInfoByName_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_LsaRegisterLogonProcess", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_LsaRegisterLogonProcess_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_LsaRegisterPolicyChangeNotification", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_LsaRegisterPolicyChangeNotification_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_LsaRemoveAccountRights", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_LsaRemoveAccountRights_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_LsaRetrievePrivateData", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_LsaRetrievePrivateData_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_LsaSetCAPs", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_LsaSetCAPs_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_LsaSetDomainInformationPolicy", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_LsaSetDomainInformationPolicy_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_LsaSetForestTrustInformation", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_LsaSetForestTrustInformation_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_LsaSetForestTrustInformation2", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_LsaSetForestTrustInformation2_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_LsaSetInformationPolicy", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_LsaSetInformationPolicy_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_LsaSetTrustedDomainInfoByName", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_LsaSetTrustedDomainInfoByName_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_LsaSetTrustedDomainInformation", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_LsaSetTrustedDomainInformation_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_LsaStorePrivateData", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_LsaStorePrivateData_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_LsaUnregisterPolicyChangeNotification", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_LsaUnregisterPolicyChangeNotification_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_MakeSignature", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_MakeSignature_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_QueryContextAttributesA", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_QueryContextAttributesA_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_QueryContextAttributesExA", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_QueryContextAttributesExA_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_QueryContextAttributesExW", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_QueryContextAttributesExW_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_QueryContextAttributesW", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_QueryContextAttributesW_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_QueryCredentialsAttributesA", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_QueryCredentialsAttributesA_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_QueryCredentialsAttributesExA", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_QueryCredentialsAttributesExA_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_QueryCredentialsAttributesExW", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_QueryCredentialsAttributesExW_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_QueryCredentialsAttributesW", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_QueryCredentialsAttributesW_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_QuerySecurityContextToken", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_QuerySecurityContextToken_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_QuerySecurityPackageInfoA", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_QuerySecurityPackageInfoA_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_QuerySecurityPackageInfoW", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_QuerySecurityPackageInfoW_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_RevertSecurityContext", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_RevertSecurityContext_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_RtlDecryptMemory", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_RtlDecryptMemory_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_RtlEncryptMemory", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_RtlEncryptMemory_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_RtlGenRandom", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_RtlGenRandom_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_SLAcquireGenuineTicket", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_SLAcquireGenuineTicket_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_SLActivateProduct", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_SLActivateProduct_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_SLClose", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_SLClose_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_SLConsumeRight", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_SLConsumeRight_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_SLDepositOfflineConfirmationId", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_SLDepositOfflineConfirmationId_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_SLDepositOfflineConfirmationIdEx", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_SLDepositOfflineConfirmationIdEx_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_SLFireEvent", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_SLFireEvent_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_SLGenerateOfflineInstallationId", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_SLGenerateOfflineInstallationId_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_SLGenerateOfflineInstallationIdEx", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_SLGenerateOfflineInstallationIdEx_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_SLGetApplicationInformation", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_SLGetApplicationInformation_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_SLGetGenuineInformation", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_SLGetGenuineInformation_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_SLGetInstalledProductKeyIds", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_SLGetInstalledProductKeyIds_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_SLGetLicense", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_SLGetLicense_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_SLGetLicenseFileId", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_SLGetLicenseFileId_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_SLGetLicenseInformation", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_SLGetLicenseInformation_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_SLGetLicensingStatusInformation", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_SLGetLicensingStatusInformation_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_SLGetPKeyId", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_SLGetPKeyId_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_SLGetPKeyInformation", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_SLGetPKeyInformation_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_SLGetPolicyInformation", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_SLGetPolicyInformation_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_SLGetPolicyInformationDWORD", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_SLGetPolicyInformationDWORD_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_SLGetProductSkuInformation", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_SLGetProductSkuInformation_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_SLGetReferralInformation", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_SLGetReferralInformation_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_SLGetSLIDList", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_SLGetSLIDList_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_SLGetServerStatus", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_SLGetServerStatus_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_SLGetServiceInformation", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_SLGetServiceInformation_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_SLGetWindowsInformation", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_SLGetWindowsInformation_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_SLGetWindowsInformationDWORD", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_SLGetWindowsInformationDWORD_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_SLInstallLicense", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_SLInstallLicense_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_SLInstallProofOfPurchase", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_SLInstallProofOfPurchase_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_SLIsGenuineLocal", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_SLIsGenuineLocal_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_SLOpen", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_SLOpen_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_SLQueryLicenseValueFromApp", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_SLQueryLicenseValueFromApp_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_SLRegisterEvent", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_SLRegisterEvent_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_SLSetCurrentProductKey", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_SLSetCurrentProductKey_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_SLSetGenuineInformation", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_SLSetGenuineInformation_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_SLUninstallLicense", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_SLUninstallLicense_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_SLUninstallProofOfPurchase", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_SLUninstallProofOfPurchase_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_SLUnregisterEvent", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_SLUnregisterEvent_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_SaslAcceptSecurityContext", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_SaslAcceptSecurityContext_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_SaslEnumerateProfilesA", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_SaslEnumerateProfilesA_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_SaslEnumerateProfilesW", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_SaslEnumerateProfilesW_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_SaslGetContextOption", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_SaslGetContextOption_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_SaslGetProfilePackageA", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_SaslGetProfilePackageA_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_SaslGetProfilePackageW", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_SaslGetProfilePackageW_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_SaslIdentifyPackageA", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_SaslIdentifyPackageA_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_SaslIdentifyPackageW", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_SaslIdentifyPackageW_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_SaslInitializeSecurityContextA", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_SaslInitializeSecurityContextA_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_SaslInitializeSecurityContextW", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_SaslInitializeSecurityContextW_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_SaslSetContextOption", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_SaslSetContextOption_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_SendSAS", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_SendSAS_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_SetContextAttributesA", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_SetContextAttributesA_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_SetContextAttributesW", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_SetContextAttributesW_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_SetCredentialsAttributesA", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_SetCredentialsAttributesA_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_SetCredentialsAttributesW", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_SetCredentialsAttributesW_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_SslCrackCertificate", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_SslCrackCertificate_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_SslEmptyCacheA", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_SslEmptyCacheA_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_SslEmptyCacheW", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_SslEmptyCacheW_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_SslFreeCertificate", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_SslFreeCertificate_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_SslGenerateRandomBits", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_SslGenerateRandomBits_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_SslGetExtensions", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_SslGetExtensions_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_SslGetMaximumKeySize", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_SslGetMaximumKeySize_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_SslGetServerIdentity", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_SslGetServerIdentity_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_SspiCompareAuthIdentities", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_SspiCompareAuthIdentities_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_SspiCopyAuthIdentity", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_SspiCopyAuthIdentity_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_SspiDecryptAuthIdentity", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_SspiDecryptAuthIdentity_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_SspiDecryptAuthIdentityEx", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_SspiDecryptAuthIdentityEx_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_SspiEncodeAuthIdentityAsStrings", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_SspiEncodeAuthIdentityAsStrings_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_SspiEncodeStringsAsAuthIdentity", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_SspiEncodeStringsAsAuthIdentity_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_SspiEncryptAuthIdentity", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_SspiEncryptAuthIdentity_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_SspiEncryptAuthIdentityEx", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_SspiEncryptAuthIdentityEx_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_SspiExcludePackage", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_SspiExcludePackage_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_SspiFreeAuthIdentity", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_SspiFreeAuthIdentity_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_SspiGetTargetHostName", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_SspiGetTargetHostName_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_SspiIsAuthIdentityEncrypted", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_SspiIsAuthIdentityEncrypted_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_SspiIsPromptingNeeded", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_SspiIsPromptingNeeded_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_SspiLocalFree", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_SspiLocalFree_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_SspiMarshalAuthIdentity", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_SspiMarshalAuthIdentity_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_SspiPrepareForCredRead", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_SspiPrepareForCredRead_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_SspiPrepareForCredWrite", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_SspiPrepareForCredWrite_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_SspiPromptForCredentialsA", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_SspiPromptForCredentialsA_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_SspiPromptForCredentialsW", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_SspiPromptForCredentialsW_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_SspiSetChannelBindingFlags", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_SspiSetChannelBindingFlags_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_SspiUnmarshalAuthIdentity", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_SspiUnmarshalAuthIdentity_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_SspiValidateAuthIdentity", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_SspiValidateAuthIdentity_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_SspiZeroAuthIdentity", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_SspiZeroAuthIdentity_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_TokenBindingDeleteAllBindings", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_TokenBindingDeleteAllBindings_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_TokenBindingDeleteBinding", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_TokenBindingDeleteBinding_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_TokenBindingGenerateBinding", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_TokenBindingGenerateBinding_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_TokenBindingGenerateID", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_TokenBindingGenerateID_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_TokenBindingGenerateIDForUri", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_TokenBindingGenerateIDForUri_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_TokenBindingGenerateMessage", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_TokenBindingGenerateMessage_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_TokenBindingGetHighestSupportedVersion", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_TokenBindingGetHighestSupportedVersion_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_TokenBindingGetKeyTypesClient", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_TokenBindingGetKeyTypesClient_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_TokenBindingGetKeyTypesServer", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_TokenBindingGetKeyTypesServer_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_TokenBindingVerifyMessage", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_TokenBindingVerifyMessage_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_TranslateNameA", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_TranslateNameA_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_TranslateNameW", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_TranslateNameW_napi));
    exports.Set("windowssys_windows_win32_security_authentication_identity_VerifySignature", Napi::Function::New(env, windowssys_windows_win32_security_authentication_identity_VerifySignature_napi));
}

static KmNapiRegistrarNode registrar_node = { &register_windows_win32_security_authentication_identity_napi, nullptr };
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
