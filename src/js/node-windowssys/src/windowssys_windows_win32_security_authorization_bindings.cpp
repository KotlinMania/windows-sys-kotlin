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

static Napi::Value windowssys_windows_win32_security_authorization_AuthzAccessCheck_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* hauthzclientcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* prequest = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* hauditevent = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* psecuritydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* optionalsecuritydescriptorarray = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    uint32_t optionalsecuritydescriptorcount = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    void* preply = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    void* phaccesscheckresults = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("authz.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "AuthzAccessCheck")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(flags, hauthzclientcontext, prequest, hauditevent, psecuritydescriptor, optionalsecuritydescriptorarray, optionalsecuritydescriptorcount, preply, phaccesscheckresults) : -1;
#else
    (void)flags;
    (void)hauthzclientcontext;
    (void)prequest;
    (void)hauditevent;
    (void)psecuritydescriptor;
    (void)optionalsecuritydescriptorarray;
    (void)optionalsecuritydescriptorcount;
    (void)preply;
    (void)phaccesscheckresults;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authorization_AuthzAddSidsToContext_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hauthzclientcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* sids = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t sidcount = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* restrictedsids = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t restrictedsidcount = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* phnewauthzclientcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("authz.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "AuthzAddSidsToContext")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hauthzclientcontext, sids, sidcount, restrictedsids, restrictedsidcount, phnewauthzclientcontext) : -1;
#else
    (void)hauthzclientcontext;
    (void)sids;
    (void)sidcount;
    (void)restrictedsids;
    (void)restrictedsidcount;
    (void)phnewauthzclientcontext;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authorization_AuthzCachedAccessCheck_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* haccesscheckresults = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* prequest = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* hauditevent = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* preply = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("authz.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "AuthzCachedAccessCheck")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(flags, haccesscheckresults, prequest, hauditevent, preply) : -1;
#else
    (void)flags;
    (void)haccesscheckresults;
    (void)prequest;
    (void)hauditevent;
    (void)preply;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authorization_AuthzEnumerateSecurityEventSources_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pdwcount = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pdwlength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("authz.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "AuthzEnumerateSecurityEventSources")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwflags, buffer, pdwcount, pdwlength) : -1;
#else
    (void)dwflags;
    (void)buffer;
    (void)pdwcount;
    (void)pdwlength;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authorization_AuthzEvaluateSacl_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* authzclientcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* prequest = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* sacl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t grantedaccess = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    int32_t accessgranted = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* pbgenerateaudit = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("authz.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "AuthzEvaluateSacl")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(authzclientcontext, prequest, sacl, grantedaccess, accessgranted, pbgenerateaudit) : -1;
#else
    (void)authzclientcontext;
    (void)prequest;
    (void)sacl;
    (void)grantedaccess;
    (void)accessgranted;
    (void)pbgenerateaudit;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authorization_AuthzFreeAuditEvent_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hauditevent = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("authz.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "AuthzFreeAuditEvent")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hauditevent) : -1;
#else
    (void)hauditevent;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authorization_AuthzFreeCentralAccessPolicyCache_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("authz.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "AuthzFreeCentralAccessPolicyCache")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authorization_AuthzFreeContext_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hauthzclientcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("authz.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "AuthzFreeContext")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hauthzclientcontext) : -1;
#else
    (void)hauthzclientcontext;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authorization_AuthzFreeHandle_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* haccesscheckresults = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("authz.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "AuthzFreeHandle")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(haccesscheckresults) : -1;
#else
    (void)haccesscheckresults;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authorization_AuthzFreeResourceManager_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hauthzresourcemanager = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("authz.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "AuthzFreeResourceManager")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hauthzresourcemanager) : -1;
#else
    (void)hauthzresourcemanager;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authorization_AuthzGetInformationFromContext_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hauthzclientcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t infoclass = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t buffersize = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* psizerequired = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("authz.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "AuthzGetInformationFromContext")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hauthzclientcontext, infoclass, buffersize, psizerequired, buffer) : -1;
#else
    (void)hauthzclientcontext;
    (void)infoclass;
    (void)buffersize;
    (void)psizerequired;
    (void)buffer;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authorization_AuthzInitializeCompoundContext_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* usercontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* devicecontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* phcompoundcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("authz.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "AuthzInitializeCompoundContext")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(usercontext, devicecontext, phcompoundcontext) : -1;
#else
    (void)usercontext;
    (void)devicecontext;
    (void)phcompoundcontext;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authorization_AuthzInitializeRemoteResourceManager_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* prpcinitinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* phauthzresourcemanager = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("authz.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "AuthzInitializeRemoteResourceManager")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(prpcinitinfo, phauthzresourcemanager) : -1;
#else
    (void)prpcinitinfo;
    (void)phauthzresourcemanager;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authorization_AuthzInitializeResourceManager_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* pfndynamicaccesscheck = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pfncomputedynamicgroups = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pfnfreedynamicgroups = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* szresourcemanagername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* phauthzresourcemanager = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("authz.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "AuthzInitializeResourceManager")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(flags, pfndynamicaccesscheck, pfncomputedynamicgroups, pfnfreedynamicgroups, szresourcemanagername, phauthzresourcemanager) : -1;
#else
    (void)flags;
    (void)pfndynamicaccesscheck;
    (void)pfncomputedynamicgroups;
    (void)pfnfreedynamicgroups;
    (void)szresourcemanagername;
    (void)phauthzresourcemanager;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authorization_AuthzInitializeResourceManagerEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* pauthzinitinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* phauthzresourcemanager = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("authz.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "AuthzInitializeResourceManagerEx")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(flags, pauthzinitinfo, phauthzresourcemanager) : -1;
#else
    (void)flags;
    (void)pauthzinitinfo;
    (void)phauthzresourcemanager;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authorization_AuthzInstallSecurityEventSource_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* pregistration = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("authz.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "AuthzInstallSecurityEventSource")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwflags, pregistration) : -1;
#else
    (void)dwflags;
    (void)pregistration;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authorization_AuthzModifyClaims_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hauthzclientcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t claimclass = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pclaimoperations = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pclaims = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("authz.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "AuthzModifyClaims")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hauthzclientcontext, claimclass, pclaimoperations, pclaims) : -1;
#else
    (void)hauthzclientcontext;
    (void)claimclass;
    (void)pclaimoperations;
    (void)pclaims;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authorization_AuthzModifySecurityAttributes_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hauthzclientcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* poperations = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pattributes = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("authz.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "AuthzModifySecurityAttributes")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hauthzclientcontext, poperations, pattributes) : -1;
#else
    (void)hauthzclientcontext;
    (void)poperations;
    (void)pattributes;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authorization_AuthzModifySids_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hauthzclientcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t sidclass = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* psidoperations = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* psids = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("authz.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "AuthzModifySids")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hauthzclientcontext, sidclass, psidoperations, psids) : -1;
#else
    (void)hauthzclientcontext;
    (void)sidclass;
    (void)psidoperations;
    (void)psids;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authorization_AuthzOpenObjectAudit_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* hauthzclientcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* prequest = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* hauditevent = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* psecuritydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* optionalsecuritydescriptorarray = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    uint32_t optionalsecuritydescriptorcount = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    void* preply = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("authz.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "AuthzOpenObjectAudit")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(flags, hauthzclientcontext, prequest, hauditevent, psecuritydescriptor, optionalsecuritydescriptorarray, optionalsecuritydescriptorcount, preply) : -1;
#else
    (void)flags;
    (void)hauthzclientcontext;
    (void)prequest;
    (void)hauditevent;
    (void)psecuritydescriptor;
    (void)optionalsecuritydescriptorarray;
    (void)optionalsecuritydescriptorcount;
    (void)preply;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authorization_AuthzRegisterSecurityEventSource_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* szeventsourcename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pheventprovider = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("authz.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "AuthzRegisterSecurityEventSource")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwflags, szeventsourcename, pheventprovider) : -1;
#else
    (void)dwflags;
    (void)szeventsourcename;
    (void)pheventprovider;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authorization_AuthzReportSecurityEventFromParams_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* heventprovider = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwauditid = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pusersid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pparams = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("authz.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "AuthzReportSecurityEventFromParams")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwflags, heventprovider, dwauditid, pusersid, pparams) : -1;
#else
    (void)dwflags;
    (void)heventprovider;
    (void)dwauditid;
    (void)pusersid;
    (void)pparams;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authorization_AuthzSetAppContainerInformation_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hauthzclientcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pappcontainersid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t capabilitycount = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pcapabilitysids = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("authz.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "AuthzSetAppContainerInformation")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hauthzclientcontext, pappcontainersid, capabilitycount, pcapabilitysids) : -1;
#else
    (void)hauthzclientcontext;
    (void)pappcontainersid;
    (void)capabilitycount;
    (void)pcapabilitysids;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authorization_AuthzUninstallSecurityEventSource_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* szeventsourcename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("authz.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "AuthzUninstallSecurityEventSource")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwflags, szeventsourcename) : -1;
#else
    (void)dwflags;
    (void)szeventsourcename;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authorization_AuthzUnregisterCapChangeNotification_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hcapchangesubscription = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("authz.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "AuthzUnregisterCapChangeNotification")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcapchangesubscription) : -1;
#else
    (void)hcapchangesubscription;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authorization_AuthzUnregisterSecurityEventSource_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* pheventprovider = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("authz.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "AuthzUnregisterSecurityEventSource")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwflags, pheventprovider) : -1;
#else
    (void)dwflags;
    (void)pheventprovider;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authorization_BuildExplicitAccessWithNameA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pexplicitaccess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ptrusteename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t accesspermissions = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t accessmode = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t inheritance = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, uint32_t, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "BuildExplicitAccessWithNameA")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(pexplicitaccess, ptrusteename, accesspermissions, accessmode, inheritance);
#else
    (void)pexplicitaccess;
    (void)ptrusteename;
    (void)accesspermissions;
    (void)accessmode;
    (void)inheritance;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_security_authorization_BuildExplicitAccessWithNameW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pexplicitaccess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ptrusteename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t accesspermissions = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t accessmode = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t inheritance = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, uint32_t, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "BuildExplicitAccessWithNameW")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(pexplicitaccess, ptrusteename, accesspermissions, accessmode, inheritance);
#else
    (void)pexplicitaccess;
    (void)ptrusteename;
    (void)accesspermissions;
    (void)accessmode;
    (void)inheritance;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_security_authorization_BuildImpersonateExplicitAccessWithNameA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pexplicitaccess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ptrusteename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* ptrustee = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t accesspermissions = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    int32_t accessmode = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    uint32_t inheritance = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "BuildImpersonateExplicitAccessWithNameA")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(pexplicitaccess, ptrusteename, ptrustee, accesspermissions, accessmode, inheritance);
#else
    (void)pexplicitaccess;
    (void)ptrusteename;
    (void)ptrustee;
    (void)accesspermissions;
    (void)accessmode;
    (void)inheritance;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_security_authorization_BuildImpersonateExplicitAccessWithNameW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pexplicitaccess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ptrusteename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* ptrustee = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t accesspermissions = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    int32_t accessmode = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    uint32_t inheritance = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "BuildImpersonateExplicitAccessWithNameW")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(pexplicitaccess, ptrusteename, ptrustee, accesspermissions, accessmode, inheritance);
#else
    (void)pexplicitaccess;
    (void)ptrusteename;
    (void)ptrustee;
    (void)accesspermissions;
    (void)accessmode;
    (void)inheritance;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_security_authorization_BuildImpersonateTrusteeA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ptrustee = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pimpersonatetrustee = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "BuildImpersonateTrusteeA")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(ptrustee, pimpersonatetrustee);
#else
    (void)ptrustee;
    (void)pimpersonatetrustee;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_security_authorization_BuildImpersonateTrusteeW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ptrustee = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pimpersonatetrustee = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "BuildImpersonateTrusteeW")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(ptrustee, pimpersonatetrustee);
#else
    (void)ptrustee;
    (void)pimpersonatetrustee;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_security_authorization_BuildSecurityDescriptorA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* powner = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pgroup = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t ccountofaccessentries = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* plistofaccessentries = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t ccountofauditentries = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* plistofauditentries = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* poldsd = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* psizenewsd = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    void* pnewsd = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "BuildSecurityDescriptorA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(powner, pgroup, ccountofaccessentries, plistofaccessentries, ccountofauditentries, plistofauditentries, poldsd, psizenewsd, pnewsd) : 0;
#else
    (void)powner;
    (void)pgroup;
    (void)ccountofaccessentries;
    (void)plistofaccessentries;
    (void)ccountofauditentries;
    (void)plistofauditentries;
    (void)poldsd;
    (void)psizenewsd;
    (void)pnewsd;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authorization_BuildSecurityDescriptorW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* powner = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pgroup = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t ccountofaccessentries = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* plistofaccessentries = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t ccountofauditentries = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* plistofauditentries = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* poldsd = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* psizenewsd = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    void* pnewsd = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "BuildSecurityDescriptorW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(powner, pgroup, ccountofaccessentries, plistofaccessentries, ccountofauditentries, plistofauditentries, poldsd, psizenewsd, pnewsd) : 0;
#else
    (void)powner;
    (void)pgroup;
    (void)ccountofaccessentries;
    (void)plistofaccessentries;
    (void)ccountofauditentries;
    (void)plistofauditentries;
    (void)poldsd;
    (void)psizenewsd;
    (void)pnewsd;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authorization_BuildTrusteeWithNameA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ptrustee = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "BuildTrusteeWithNameA")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(ptrustee, pname);
#else
    (void)ptrustee;
    (void)pname;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_security_authorization_BuildTrusteeWithNameW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ptrustee = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "BuildTrusteeWithNameW")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(ptrustee, pname);
#else
    (void)ptrustee;
    (void)pname;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_security_authorization_BuildTrusteeWithObjectsAndNameA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ptrustee = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pobjname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t objecttype = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* objecttypename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* inheritedobjecttypename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* name = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "BuildTrusteeWithObjectsAndNameA")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(ptrustee, pobjname, objecttype, objecttypename, inheritedobjecttypename, name);
#else
    (void)ptrustee;
    (void)pobjname;
    (void)objecttype;
    (void)objecttypename;
    (void)inheritedobjecttypename;
    (void)name;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_security_authorization_BuildTrusteeWithObjectsAndNameW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ptrustee = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pobjname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t objecttype = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* objecttypename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* inheritedobjecttypename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* name = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "BuildTrusteeWithObjectsAndNameW")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(ptrustee, pobjname, objecttype, objecttypename, inheritedobjecttypename, name);
#else
    (void)ptrustee;
    (void)pobjname;
    (void)objecttype;
    (void)objecttypename;
    (void)inheritedobjecttypename;
    (void)name;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_security_authorization_BuildTrusteeWithObjectsAndSidA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ptrustee = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pobjsid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pobjectguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pinheritedobjectguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* psid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "BuildTrusteeWithObjectsAndSidA")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(ptrustee, pobjsid, pobjectguid, pinheritedobjectguid, psid);
#else
    (void)ptrustee;
    (void)pobjsid;
    (void)pobjectguid;
    (void)pinheritedobjectguid;
    (void)psid;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_security_authorization_BuildTrusteeWithObjectsAndSidW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ptrustee = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pobjsid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pobjectguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pinheritedobjectguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* psid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "BuildTrusteeWithObjectsAndSidW")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(ptrustee, pobjsid, pobjectguid, pinheritedobjectguid, psid);
#else
    (void)ptrustee;
    (void)pobjsid;
    (void)pobjectguid;
    (void)pinheritedobjectguid;
    (void)psid;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_security_authorization_BuildTrusteeWithSidA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ptrustee = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* psid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "BuildTrusteeWithSidA")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(ptrustee, psid);
#else
    (void)ptrustee;
    (void)psid;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_security_authorization_BuildTrusteeWithSidW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ptrustee = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* psid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "BuildTrusteeWithSidW")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(ptrustee, psid);
#else
    (void)ptrustee;
    (void)psid;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_security_authorization_ConvertSecurityDescriptorToStringSecurityDescriptorA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* securitydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t requestedstringsdrevision = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t securityinformation = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* stringsecuritydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* stringsecuritydescriptorlen = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ConvertSecurityDescriptorToStringSecurityDescriptorA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(securitydescriptor, requestedstringsdrevision, securityinformation, stringsecuritydescriptor, stringsecuritydescriptorlen) : -1;
#else
    (void)securitydescriptor;
    (void)requestedstringsdrevision;
    (void)securityinformation;
    (void)stringsecuritydescriptor;
    (void)stringsecuritydescriptorlen;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authorization_ConvertSecurityDescriptorToStringSecurityDescriptorW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* securitydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t requestedstringsdrevision = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t securityinformation = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* stringsecuritydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* stringsecuritydescriptorlen = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ConvertSecurityDescriptorToStringSecurityDescriptorW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(securitydescriptor, requestedstringsdrevision, securityinformation, stringsecuritydescriptor, stringsecuritydescriptorlen) : -1;
#else
    (void)securitydescriptor;
    (void)requestedstringsdrevision;
    (void)securityinformation;
    (void)stringsecuritydescriptor;
    (void)stringsecuritydescriptorlen;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authorization_ConvertSidToStringSidA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* sid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* stringsid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ConvertSidToStringSidA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sid, stringsid) : -1;
#else
    (void)sid;
    (void)stringsid;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authorization_ConvertSidToStringSidW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* sid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* stringsid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ConvertSidToStringSidW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sid, stringsid) : -1;
#else
    (void)sid;
    (void)stringsid;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authorization_ConvertStringSecurityDescriptorToSecurityDescriptorA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* stringsecuritydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t stringsdrevision = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* securitydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* securitydescriptorsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ConvertStringSecurityDescriptorToSecurityDescriptorA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(stringsecuritydescriptor, stringsdrevision, securitydescriptor, securitydescriptorsize) : -1;
#else
    (void)stringsecuritydescriptor;
    (void)stringsdrevision;
    (void)securitydescriptor;
    (void)securitydescriptorsize;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authorization_ConvertStringSecurityDescriptorToSecurityDescriptorW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* stringsecuritydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t stringsdrevision = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* securitydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* securitydescriptorsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ConvertStringSecurityDescriptorToSecurityDescriptorW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(stringsecuritydescriptor, stringsdrevision, securitydescriptor, securitydescriptorsize) : -1;
#else
    (void)stringsecuritydescriptor;
    (void)stringsdrevision;
    (void)securitydescriptor;
    (void)securitydescriptorsize;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authorization_ConvertStringSidToSidA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* stringsid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* sid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ConvertStringSidToSidA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(stringsid, sid) : -1;
#else
    (void)stringsid;
    (void)sid;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authorization_ConvertStringSidToSidW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* stringsid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* sid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ConvertStringSidToSidW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(stringsid, sid) : -1;
#else
    (void)stringsid;
    (void)sid;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authorization_FreeInheritedFromArray_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pinheritarray = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint16_t acecnt = static_cast<uint16_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pfnarray = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint16_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FreeInheritedFromArray")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pinheritarray, acecnt, pfnarray) : 0;
#else
    (void)pinheritarray;
    (void)acecnt;
    (void)pfnarray;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authorization_GetAuditedPermissionsFromAclA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pacl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ptrustee = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* psuccessfulauditedrights = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pfailedauditrights = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetAuditedPermissionsFromAclA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pacl, ptrustee, psuccessfulauditedrights, pfailedauditrights) : 0;
#else
    (void)pacl;
    (void)ptrustee;
    (void)psuccessfulauditedrights;
    (void)pfailedauditrights;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authorization_GetAuditedPermissionsFromAclW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pacl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ptrustee = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* psuccessfulauditedrights = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pfailedauditrights = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetAuditedPermissionsFromAclW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pacl, ptrustee, psuccessfulauditedrights, pfailedauditrights) : 0;
#else
    (void)pacl;
    (void)ptrustee;
    (void)psuccessfulauditedrights;
    (void)pfailedauditrights;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authorization_GetEffectiveRightsFromAclA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pacl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ptrustee = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* paccessrights = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetEffectiveRightsFromAclA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pacl, ptrustee, paccessrights) : 0;
#else
    (void)pacl;
    (void)ptrustee;
    (void)paccessrights;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authorization_GetEffectiveRightsFromAclW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pacl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ptrustee = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* paccessrights = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetEffectiveRightsFromAclW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pacl, ptrustee, paccessrights) : 0;
#else
    (void)pacl;
    (void)ptrustee;
    (void)paccessrights;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authorization_GetExplicitEntriesFromAclA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pacl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pccountofexplicitentries = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* plistofexplicitentries = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetExplicitEntriesFromAclA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pacl, pccountofexplicitentries, plistofexplicitentries) : 0;
#else
    (void)pacl;
    (void)pccountofexplicitentries;
    (void)plistofexplicitentries;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authorization_GetExplicitEntriesFromAclW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pacl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pccountofexplicitentries = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* plistofexplicitentries = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetExplicitEntriesFromAclW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pacl, pccountofexplicitentries, plistofexplicitentries) : 0;
#else
    (void)pacl;
    (void)pccountofexplicitentries;
    (void)plistofexplicitentries;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authorization_GetInheritanceSourceA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pobjectname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t objecttype = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t securityinfo = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t container = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* pobjectclassguids = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t guidcount = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* pacl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* pfnarray = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    void* pgenericmapping = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
    void* pinheritarray = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 9 ? km_napi_arg_u64(km_info[9]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, int32_t, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetInheritanceSourceA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pobjectname, objecttype, securityinfo, container, pobjectclassguids, guidcount, pacl, pfnarray, pgenericmapping, pinheritarray) : 0;
#else
    (void)pobjectname;
    (void)objecttype;
    (void)securityinfo;
    (void)container;
    (void)pobjectclassguids;
    (void)guidcount;
    (void)pacl;
    (void)pfnarray;
    (void)pgenericmapping;
    (void)pinheritarray;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authorization_GetInheritanceSourceW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pobjectname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t objecttype = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t securityinfo = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t container = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* pobjectclassguids = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t guidcount = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* pacl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* pfnarray = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    void* pgenericmapping = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
    void* pinheritarray = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 9 ? km_napi_arg_u64(km_info[9]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, int32_t, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetInheritanceSourceW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pobjectname, objecttype, securityinfo, container, pobjectclassguids, guidcount, pacl, pfnarray, pgenericmapping, pinheritarray) : 0;
#else
    (void)pobjectname;
    (void)objecttype;
    (void)securityinfo;
    (void)container;
    (void)pobjectclassguids;
    (void)guidcount;
    (void)pacl;
    (void)pfnarray;
    (void)pgenericmapping;
    (void)pinheritarray;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authorization_GetMultipleTrusteeA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ptrustee = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetMultipleTrusteeA")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(ptrustee) : NULL;
#else
    (void)ptrustee;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_security_authorization_GetMultipleTrusteeOperationA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ptrustee = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetMultipleTrusteeOperationA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(ptrustee) : -1;
#else
    (void)ptrustee;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authorization_GetMultipleTrusteeOperationW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ptrustee = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetMultipleTrusteeOperationW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(ptrustee) : -1;
#else
    (void)ptrustee;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authorization_GetMultipleTrusteeW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ptrustee = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetMultipleTrusteeW")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(ptrustee) : NULL;
#else
    (void)ptrustee;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_security_authorization_GetNamedSecurityInfoA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pobjectname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t objecttype = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t securityinfo = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* ppsidowner = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* ppsidgroup = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* ppdacl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* ppsacl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* ppsecuritydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetNamedSecurityInfoA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pobjectname, objecttype, securityinfo, ppsidowner, ppsidgroup, ppdacl, ppsacl, ppsecuritydescriptor) : 0;
#else
    (void)pobjectname;
    (void)objecttype;
    (void)securityinfo;
    (void)ppsidowner;
    (void)ppsidgroup;
    (void)ppdacl;
    (void)ppsacl;
    (void)ppsecuritydescriptor;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authorization_GetNamedSecurityInfoW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pobjectname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t objecttype = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t securityinfo = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* ppsidowner = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* ppsidgroup = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* ppdacl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* ppsacl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* ppsecuritydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetNamedSecurityInfoW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pobjectname, objecttype, securityinfo, ppsidowner, ppsidgroup, ppdacl, ppsacl, ppsecuritydescriptor) : 0;
#else
    (void)pobjectname;
    (void)objecttype;
    (void)securityinfo;
    (void)ppsidowner;
    (void)ppsidgroup;
    (void)ppdacl;
    (void)ppsacl;
    (void)ppsecuritydescriptor;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authorization_GetSecurityInfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* handle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t objecttype = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t securityinfo = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* ppsidowner = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* ppsidgroup = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* ppdacl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* ppsacl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* ppsecuritydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetSecurityInfo")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(handle, objecttype, securityinfo, ppsidowner, ppsidgroup, ppdacl, ppsacl, ppsecuritydescriptor) : 0;
#else
    (void)handle;
    (void)objecttype;
    (void)securityinfo;
    (void)ppsidowner;
    (void)ppsidgroup;
    (void)ppdacl;
    (void)ppsacl;
    (void)ppsecuritydescriptor;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authorization_GetTrusteeFormA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ptrustee = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetTrusteeFormA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(ptrustee) : -1;
#else
    (void)ptrustee;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authorization_GetTrusteeFormW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ptrustee = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetTrusteeFormW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(ptrustee) : -1;
#else
    (void)ptrustee;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authorization_GetTrusteeNameA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ptrustee = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetTrusteeNameA")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(ptrustee) : NULL;
#else
    (void)ptrustee;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_security_authorization_GetTrusteeNameW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ptrustee = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetTrusteeNameW")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(ptrustee) : NULL;
#else
    (void)ptrustee;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_security_authorization_GetTrusteeTypeA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ptrustee = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetTrusteeTypeA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(ptrustee) : -1;
#else
    (void)ptrustee;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authorization_GetTrusteeTypeW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ptrustee = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetTrusteeTypeW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(ptrustee) : -1;
#else
    (void)ptrustee;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authorization_LookupSecurityDescriptorPartsA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ppowner = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ppgroup = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pccountofaccessentries = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pplistofaccessentries = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pccountofauditentries = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* pplistofauditentries = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* psd = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "LookupSecurityDescriptorPartsA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(ppowner, ppgroup, pccountofaccessentries, pplistofaccessentries, pccountofauditentries, pplistofauditentries, psd) : 0;
#else
    (void)ppowner;
    (void)ppgroup;
    (void)pccountofaccessentries;
    (void)pplistofaccessentries;
    (void)pccountofauditentries;
    (void)pplistofauditentries;
    (void)psd;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authorization_LookupSecurityDescriptorPartsW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ppowner = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ppgroup = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pccountofaccessentries = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pplistofaccessentries = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pccountofauditentries = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* pplistofauditentries = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* psd = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "LookupSecurityDescriptorPartsW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(ppowner, ppgroup, pccountofaccessentries, pplistofaccessentries, pccountofauditentries, pplistofauditentries, psd) : 0;
#else
    (void)ppowner;
    (void)ppgroup;
    (void)pccountofaccessentries;
    (void)pplistofaccessentries;
    (void)pccountofauditentries;
    (void)pplistofauditentries;
    (void)psd;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authorization_SetEntriesInAclA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t ccountofexplicitentries = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* plistofexplicitentries = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* oldacl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* newacl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetEntriesInAclA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(ccountofexplicitentries, plistofexplicitentries, oldacl, newacl) : 0;
#else
    (void)ccountofexplicitentries;
    (void)plistofexplicitentries;
    (void)oldacl;
    (void)newacl;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authorization_SetEntriesInAclW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t ccountofexplicitentries = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* plistofexplicitentries = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* oldacl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* newacl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetEntriesInAclW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(ccountofexplicitentries, plistofexplicitentries, oldacl, newacl) : 0;
#else
    (void)ccountofexplicitentries;
    (void)plistofexplicitentries;
    (void)oldacl;
    (void)newacl;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authorization_SetNamedSecurityInfoA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pobjectname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t objecttype = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t securityinfo = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* psidowner = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* psidgroup = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* pdacl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* psacl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetNamedSecurityInfoA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pobjectname, objecttype, securityinfo, psidowner, psidgroup, pdacl, psacl) : 0;
#else
    (void)pobjectname;
    (void)objecttype;
    (void)securityinfo;
    (void)psidowner;
    (void)psidgroup;
    (void)pdacl;
    (void)psacl;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authorization_SetNamedSecurityInfoW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pobjectname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t objecttype = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t securityinfo = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* psidowner = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* psidgroup = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* pdacl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* psacl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetNamedSecurityInfoW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pobjectname, objecttype, securityinfo, psidowner, psidgroup, pdacl, psacl) : 0;
#else
    (void)pobjectname;
    (void)objecttype;
    (void)securityinfo;
    (void)psidowner;
    (void)psidgroup;
    (void)pdacl;
    (void)psacl;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authorization_SetSecurityInfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* handle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t objecttype = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t securityinfo = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* psidowner = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* psidgroup = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* pdacl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* psacl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetSecurityInfo")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(handle, objecttype, securityinfo, psidowner, psidgroup, pdacl, psacl) : 0;
#else
    (void)handle;
    (void)objecttype;
    (void)securityinfo;
    (void)psidowner;
    (void)psidgroup;
    (void)pdacl;
    (void)psacl;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authorization_TreeResetNamedSecurityInfoA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pobjectname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t objecttype = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t securityinfo = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* powner = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pgroup = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* pdacl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* psacl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    int32_t keepexplicit = static_cast<int32_t>(km_info.Length() > 7 ? km_info[7].ToNumber().Int32Value() : 0);
    void* fnprogress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
    int32_t progressinvokesetting = static_cast<int32_t>(km_info.Length() > 9 ? km_info[9].ToNumber().Int32Value() : 0);
    void* args = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 10 ? km_napi_arg_u64(km_info[10]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, void*, void*, void*, void*, int32_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "TreeResetNamedSecurityInfoA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pobjectname, objecttype, securityinfo, powner, pgroup, pdacl, psacl, keepexplicit, fnprogress, progressinvokesetting, args) : 0;
#else
    (void)pobjectname;
    (void)objecttype;
    (void)securityinfo;
    (void)powner;
    (void)pgroup;
    (void)pdacl;
    (void)psacl;
    (void)keepexplicit;
    (void)fnprogress;
    (void)progressinvokesetting;
    (void)args;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authorization_TreeResetNamedSecurityInfoW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pobjectname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t objecttype = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t securityinfo = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* powner = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pgroup = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* pdacl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* psacl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    int32_t keepexplicit = static_cast<int32_t>(km_info.Length() > 7 ? km_info[7].ToNumber().Int32Value() : 0);
    void* fnprogress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
    int32_t progressinvokesetting = static_cast<int32_t>(km_info.Length() > 9 ? km_info[9].ToNumber().Int32Value() : 0);
    void* args = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 10 ? km_napi_arg_u64(km_info[10]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, void*, void*, void*, void*, int32_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "TreeResetNamedSecurityInfoW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pobjectname, objecttype, securityinfo, powner, pgroup, pdacl, psacl, keepexplicit, fnprogress, progressinvokesetting, args) : 0;
#else
    (void)pobjectname;
    (void)objecttype;
    (void)securityinfo;
    (void)powner;
    (void)pgroup;
    (void)pdacl;
    (void)psacl;
    (void)keepexplicit;
    (void)fnprogress;
    (void)progressinvokesetting;
    (void)args;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authorization_TreeSetNamedSecurityInfoA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pobjectname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t objecttype = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t securityinfo = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* powner = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pgroup = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* pdacl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* psacl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    uint32_t dwaction = static_cast<uint32_t>(km_info.Length() > 7 ? km_info[7].ToNumber().Int32Value() : 0);
    void* fnprogress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
    int32_t progressinvokesetting = static_cast<int32_t>(km_info.Length() > 9 ? km_info[9].ToNumber().Int32Value() : 0);
    void* args = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 10 ? km_napi_arg_u64(km_info[10]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, void*, void*, void*, void*, uint32_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "TreeSetNamedSecurityInfoA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pobjectname, objecttype, securityinfo, powner, pgroup, pdacl, psacl, dwaction, fnprogress, progressinvokesetting, args) : 0;
#else
    (void)pobjectname;
    (void)objecttype;
    (void)securityinfo;
    (void)powner;
    (void)pgroup;
    (void)pdacl;
    (void)psacl;
    (void)dwaction;
    (void)fnprogress;
    (void)progressinvokesetting;
    (void)args;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_authorization_TreeSetNamedSecurityInfoW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pobjectname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t objecttype = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t securityinfo = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* powner = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pgroup = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* pdacl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* psacl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    uint32_t dwaction = static_cast<uint32_t>(km_info.Length() > 7 ? km_info[7].ToNumber().Int32Value() : 0);
    void* fnprogress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
    int32_t progressinvokesetting = static_cast<int32_t>(km_info.Length() > 9 ? km_info[9].ToNumber().Int32Value() : 0);
    void* args = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 10 ? km_napi_arg_u64(km_info[10]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, void*, void*, void*, void*, uint32_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "TreeSetNamedSecurityInfoW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pobjectname, objecttype, securityinfo, powner, pgroup, pdacl, psacl, dwaction, fnprogress, progressinvokesetting, args) : 0;
#else
    (void)pobjectname;
    (void)objecttype;
    (void)securityinfo;
    (void)powner;
    (void)pgroup;
    (void)pdacl;
    (void)psacl;
    (void)dwaction;
    (void)fnprogress;
    (void)progressinvokesetting;
    (void)args;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static void register_windows_win32_security_authorization_napi(Napi::Env env, Napi::Object exports) {
    exports.Set("windowssys_windows_win32_security_authorization_AuthzAccessCheck", Napi::Function::New(env, windowssys_windows_win32_security_authorization_AuthzAccessCheck_napi));
    exports.Set("windowssys_windows_win32_security_authorization_AuthzAddSidsToContext", Napi::Function::New(env, windowssys_windows_win32_security_authorization_AuthzAddSidsToContext_napi));
    exports.Set("windowssys_windows_win32_security_authorization_AuthzCachedAccessCheck", Napi::Function::New(env, windowssys_windows_win32_security_authorization_AuthzCachedAccessCheck_napi));
    exports.Set("windowssys_windows_win32_security_authorization_AuthzEnumerateSecurityEventSources", Napi::Function::New(env, windowssys_windows_win32_security_authorization_AuthzEnumerateSecurityEventSources_napi));
    exports.Set("windowssys_windows_win32_security_authorization_AuthzEvaluateSacl", Napi::Function::New(env, windowssys_windows_win32_security_authorization_AuthzEvaluateSacl_napi));
    exports.Set("windowssys_windows_win32_security_authorization_AuthzFreeAuditEvent", Napi::Function::New(env, windowssys_windows_win32_security_authorization_AuthzFreeAuditEvent_napi));
    exports.Set("windowssys_windows_win32_security_authorization_AuthzFreeCentralAccessPolicyCache", Napi::Function::New(env, windowssys_windows_win32_security_authorization_AuthzFreeCentralAccessPolicyCache_napi));
    exports.Set("windowssys_windows_win32_security_authorization_AuthzFreeContext", Napi::Function::New(env, windowssys_windows_win32_security_authorization_AuthzFreeContext_napi));
    exports.Set("windowssys_windows_win32_security_authorization_AuthzFreeHandle", Napi::Function::New(env, windowssys_windows_win32_security_authorization_AuthzFreeHandle_napi));
    exports.Set("windowssys_windows_win32_security_authorization_AuthzFreeResourceManager", Napi::Function::New(env, windowssys_windows_win32_security_authorization_AuthzFreeResourceManager_napi));
    exports.Set("windowssys_windows_win32_security_authorization_AuthzGetInformationFromContext", Napi::Function::New(env, windowssys_windows_win32_security_authorization_AuthzGetInformationFromContext_napi));
    exports.Set("windowssys_windows_win32_security_authorization_AuthzInitializeCompoundContext", Napi::Function::New(env, windowssys_windows_win32_security_authorization_AuthzInitializeCompoundContext_napi));
    exports.Set("windowssys_windows_win32_security_authorization_AuthzInitializeRemoteResourceManager", Napi::Function::New(env, windowssys_windows_win32_security_authorization_AuthzInitializeRemoteResourceManager_napi));
    exports.Set("windowssys_windows_win32_security_authorization_AuthzInitializeResourceManager", Napi::Function::New(env, windowssys_windows_win32_security_authorization_AuthzInitializeResourceManager_napi));
    exports.Set("windowssys_windows_win32_security_authorization_AuthzInitializeResourceManagerEx", Napi::Function::New(env, windowssys_windows_win32_security_authorization_AuthzInitializeResourceManagerEx_napi));
    exports.Set("windowssys_windows_win32_security_authorization_AuthzInstallSecurityEventSource", Napi::Function::New(env, windowssys_windows_win32_security_authorization_AuthzInstallSecurityEventSource_napi));
    exports.Set("windowssys_windows_win32_security_authorization_AuthzModifyClaims", Napi::Function::New(env, windowssys_windows_win32_security_authorization_AuthzModifyClaims_napi));
    exports.Set("windowssys_windows_win32_security_authorization_AuthzModifySecurityAttributes", Napi::Function::New(env, windowssys_windows_win32_security_authorization_AuthzModifySecurityAttributes_napi));
    exports.Set("windowssys_windows_win32_security_authorization_AuthzModifySids", Napi::Function::New(env, windowssys_windows_win32_security_authorization_AuthzModifySids_napi));
    exports.Set("windowssys_windows_win32_security_authorization_AuthzOpenObjectAudit", Napi::Function::New(env, windowssys_windows_win32_security_authorization_AuthzOpenObjectAudit_napi));
    exports.Set("windowssys_windows_win32_security_authorization_AuthzRegisterSecurityEventSource", Napi::Function::New(env, windowssys_windows_win32_security_authorization_AuthzRegisterSecurityEventSource_napi));
    exports.Set("windowssys_windows_win32_security_authorization_AuthzReportSecurityEventFromParams", Napi::Function::New(env, windowssys_windows_win32_security_authorization_AuthzReportSecurityEventFromParams_napi));
    exports.Set("windowssys_windows_win32_security_authorization_AuthzSetAppContainerInformation", Napi::Function::New(env, windowssys_windows_win32_security_authorization_AuthzSetAppContainerInformation_napi));
    exports.Set("windowssys_windows_win32_security_authorization_AuthzUninstallSecurityEventSource", Napi::Function::New(env, windowssys_windows_win32_security_authorization_AuthzUninstallSecurityEventSource_napi));
    exports.Set("windowssys_windows_win32_security_authorization_AuthzUnregisterCapChangeNotification", Napi::Function::New(env, windowssys_windows_win32_security_authorization_AuthzUnregisterCapChangeNotification_napi));
    exports.Set("windowssys_windows_win32_security_authorization_AuthzUnregisterSecurityEventSource", Napi::Function::New(env, windowssys_windows_win32_security_authorization_AuthzUnregisterSecurityEventSource_napi));
    exports.Set("windowssys_windows_win32_security_authorization_BuildExplicitAccessWithNameA", Napi::Function::New(env, windowssys_windows_win32_security_authorization_BuildExplicitAccessWithNameA_napi));
    exports.Set("windowssys_windows_win32_security_authorization_BuildExplicitAccessWithNameW", Napi::Function::New(env, windowssys_windows_win32_security_authorization_BuildExplicitAccessWithNameW_napi));
    exports.Set("windowssys_windows_win32_security_authorization_BuildImpersonateExplicitAccessWithNameA", Napi::Function::New(env, windowssys_windows_win32_security_authorization_BuildImpersonateExplicitAccessWithNameA_napi));
    exports.Set("windowssys_windows_win32_security_authorization_BuildImpersonateExplicitAccessWithNameW", Napi::Function::New(env, windowssys_windows_win32_security_authorization_BuildImpersonateExplicitAccessWithNameW_napi));
    exports.Set("windowssys_windows_win32_security_authorization_BuildImpersonateTrusteeA", Napi::Function::New(env, windowssys_windows_win32_security_authorization_BuildImpersonateTrusteeA_napi));
    exports.Set("windowssys_windows_win32_security_authorization_BuildImpersonateTrusteeW", Napi::Function::New(env, windowssys_windows_win32_security_authorization_BuildImpersonateTrusteeW_napi));
    exports.Set("windowssys_windows_win32_security_authorization_BuildSecurityDescriptorA", Napi::Function::New(env, windowssys_windows_win32_security_authorization_BuildSecurityDescriptorA_napi));
    exports.Set("windowssys_windows_win32_security_authorization_BuildSecurityDescriptorW", Napi::Function::New(env, windowssys_windows_win32_security_authorization_BuildSecurityDescriptorW_napi));
    exports.Set("windowssys_windows_win32_security_authorization_BuildTrusteeWithNameA", Napi::Function::New(env, windowssys_windows_win32_security_authorization_BuildTrusteeWithNameA_napi));
    exports.Set("windowssys_windows_win32_security_authorization_BuildTrusteeWithNameW", Napi::Function::New(env, windowssys_windows_win32_security_authorization_BuildTrusteeWithNameW_napi));
    exports.Set("windowssys_windows_win32_security_authorization_BuildTrusteeWithObjectsAndNameA", Napi::Function::New(env, windowssys_windows_win32_security_authorization_BuildTrusteeWithObjectsAndNameA_napi));
    exports.Set("windowssys_windows_win32_security_authorization_BuildTrusteeWithObjectsAndNameW", Napi::Function::New(env, windowssys_windows_win32_security_authorization_BuildTrusteeWithObjectsAndNameW_napi));
    exports.Set("windowssys_windows_win32_security_authorization_BuildTrusteeWithObjectsAndSidA", Napi::Function::New(env, windowssys_windows_win32_security_authorization_BuildTrusteeWithObjectsAndSidA_napi));
    exports.Set("windowssys_windows_win32_security_authorization_BuildTrusteeWithObjectsAndSidW", Napi::Function::New(env, windowssys_windows_win32_security_authorization_BuildTrusteeWithObjectsAndSidW_napi));
    exports.Set("windowssys_windows_win32_security_authorization_BuildTrusteeWithSidA", Napi::Function::New(env, windowssys_windows_win32_security_authorization_BuildTrusteeWithSidA_napi));
    exports.Set("windowssys_windows_win32_security_authorization_BuildTrusteeWithSidW", Napi::Function::New(env, windowssys_windows_win32_security_authorization_BuildTrusteeWithSidW_napi));
    exports.Set("windowssys_windows_win32_security_authorization_ConvertSecurityDescriptorToStringSecurityDescriptorA", Napi::Function::New(env, windowssys_windows_win32_security_authorization_ConvertSecurityDescriptorToStringSecurityDescriptorA_napi));
    exports.Set("windowssys_windows_win32_security_authorization_ConvertSecurityDescriptorToStringSecurityDescriptorW", Napi::Function::New(env, windowssys_windows_win32_security_authorization_ConvertSecurityDescriptorToStringSecurityDescriptorW_napi));
    exports.Set("windowssys_windows_win32_security_authorization_ConvertSidToStringSidA", Napi::Function::New(env, windowssys_windows_win32_security_authorization_ConvertSidToStringSidA_napi));
    exports.Set("windowssys_windows_win32_security_authorization_ConvertSidToStringSidW", Napi::Function::New(env, windowssys_windows_win32_security_authorization_ConvertSidToStringSidW_napi));
    exports.Set("windowssys_windows_win32_security_authorization_ConvertStringSecurityDescriptorToSecurityDescriptorA", Napi::Function::New(env, windowssys_windows_win32_security_authorization_ConvertStringSecurityDescriptorToSecurityDescriptorA_napi));
    exports.Set("windowssys_windows_win32_security_authorization_ConvertStringSecurityDescriptorToSecurityDescriptorW", Napi::Function::New(env, windowssys_windows_win32_security_authorization_ConvertStringSecurityDescriptorToSecurityDescriptorW_napi));
    exports.Set("windowssys_windows_win32_security_authorization_ConvertStringSidToSidA", Napi::Function::New(env, windowssys_windows_win32_security_authorization_ConvertStringSidToSidA_napi));
    exports.Set("windowssys_windows_win32_security_authorization_ConvertStringSidToSidW", Napi::Function::New(env, windowssys_windows_win32_security_authorization_ConvertStringSidToSidW_napi));
    exports.Set("windowssys_windows_win32_security_authorization_FreeInheritedFromArray", Napi::Function::New(env, windowssys_windows_win32_security_authorization_FreeInheritedFromArray_napi));
    exports.Set("windowssys_windows_win32_security_authorization_GetAuditedPermissionsFromAclA", Napi::Function::New(env, windowssys_windows_win32_security_authorization_GetAuditedPermissionsFromAclA_napi));
    exports.Set("windowssys_windows_win32_security_authorization_GetAuditedPermissionsFromAclW", Napi::Function::New(env, windowssys_windows_win32_security_authorization_GetAuditedPermissionsFromAclW_napi));
    exports.Set("windowssys_windows_win32_security_authorization_GetEffectiveRightsFromAclA", Napi::Function::New(env, windowssys_windows_win32_security_authorization_GetEffectiveRightsFromAclA_napi));
    exports.Set("windowssys_windows_win32_security_authorization_GetEffectiveRightsFromAclW", Napi::Function::New(env, windowssys_windows_win32_security_authorization_GetEffectiveRightsFromAclW_napi));
    exports.Set("windowssys_windows_win32_security_authorization_GetExplicitEntriesFromAclA", Napi::Function::New(env, windowssys_windows_win32_security_authorization_GetExplicitEntriesFromAclA_napi));
    exports.Set("windowssys_windows_win32_security_authorization_GetExplicitEntriesFromAclW", Napi::Function::New(env, windowssys_windows_win32_security_authorization_GetExplicitEntriesFromAclW_napi));
    exports.Set("windowssys_windows_win32_security_authorization_GetInheritanceSourceA", Napi::Function::New(env, windowssys_windows_win32_security_authorization_GetInheritanceSourceA_napi));
    exports.Set("windowssys_windows_win32_security_authorization_GetInheritanceSourceW", Napi::Function::New(env, windowssys_windows_win32_security_authorization_GetInheritanceSourceW_napi));
    exports.Set("windowssys_windows_win32_security_authorization_GetMultipleTrusteeA", Napi::Function::New(env, windowssys_windows_win32_security_authorization_GetMultipleTrusteeA_napi));
    exports.Set("windowssys_windows_win32_security_authorization_GetMultipleTrusteeOperationA", Napi::Function::New(env, windowssys_windows_win32_security_authorization_GetMultipleTrusteeOperationA_napi));
    exports.Set("windowssys_windows_win32_security_authorization_GetMultipleTrusteeOperationW", Napi::Function::New(env, windowssys_windows_win32_security_authorization_GetMultipleTrusteeOperationW_napi));
    exports.Set("windowssys_windows_win32_security_authorization_GetMultipleTrusteeW", Napi::Function::New(env, windowssys_windows_win32_security_authorization_GetMultipleTrusteeW_napi));
    exports.Set("windowssys_windows_win32_security_authorization_GetNamedSecurityInfoA", Napi::Function::New(env, windowssys_windows_win32_security_authorization_GetNamedSecurityInfoA_napi));
    exports.Set("windowssys_windows_win32_security_authorization_GetNamedSecurityInfoW", Napi::Function::New(env, windowssys_windows_win32_security_authorization_GetNamedSecurityInfoW_napi));
    exports.Set("windowssys_windows_win32_security_authorization_GetSecurityInfo", Napi::Function::New(env, windowssys_windows_win32_security_authorization_GetSecurityInfo_napi));
    exports.Set("windowssys_windows_win32_security_authorization_GetTrusteeFormA", Napi::Function::New(env, windowssys_windows_win32_security_authorization_GetTrusteeFormA_napi));
    exports.Set("windowssys_windows_win32_security_authorization_GetTrusteeFormW", Napi::Function::New(env, windowssys_windows_win32_security_authorization_GetTrusteeFormW_napi));
    exports.Set("windowssys_windows_win32_security_authorization_GetTrusteeNameA", Napi::Function::New(env, windowssys_windows_win32_security_authorization_GetTrusteeNameA_napi));
    exports.Set("windowssys_windows_win32_security_authorization_GetTrusteeNameW", Napi::Function::New(env, windowssys_windows_win32_security_authorization_GetTrusteeNameW_napi));
    exports.Set("windowssys_windows_win32_security_authorization_GetTrusteeTypeA", Napi::Function::New(env, windowssys_windows_win32_security_authorization_GetTrusteeTypeA_napi));
    exports.Set("windowssys_windows_win32_security_authorization_GetTrusteeTypeW", Napi::Function::New(env, windowssys_windows_win32_security_authorization_GetTrusteeTypeW_napi));
    exports.Set("windowssys_windows_win32_security_authorization_LookupSecurityDescriptorPartsA", Napi::Function::New(env, windowssys_windows_win32_security_authorization_LookupSecurityDescriptorPartsA_napi));
    exports.Set("windowssys_windows_win32_security_authorization_LookupSecurityDescriptorPartsW", Napi::Function::New(env, windowssys_windows_win32_security_authorization_LookupSecurityDescriptorPartsW_napi));
    exports.Set("windowssys_windows_win32_security_authorization_SetEntriesInAclA", Napi::Function::New(env, windowssys_windows_win32_security_authorization_SetEntriesInAclA_napi));
    exports.Set("windowssys_windows_win32_security_authorization_SetEntriesInAclW", Napi::Function::New(env, windowssys_windows_win32_security_authorization_SetEntriesInAclW_napi));
    exports.Set("windowssys_windows_win32_security_authorization_SetNamedSecurityInfoA", Napi::Function::New(env, windowssys_windows_win32_security_authorization_SetNamedSecurityInfoA_napi));
    exports.Set("windowssys_windows_win32_security_authorization_SetNamedSecurityInfoW", Napi::Function::New(env, windowssys_windows_win32_security_authorization_SetNamedSecurityInfoW_napi));
    exports.Set("windowssys_windows_win32_security_authorization_SetSecurityInfo", Napi::Function::New(env, windowssys_windows_win32_security_authorization_SetSecurityInfo_napi));
    exports.Set("windowssys_windows_win32_security_authorization_TreeResetNamedSecurityInfoA", Napi::Function::New(env, windowssys_windows_win32_security_authorization_TreeResetNamedSecurityInfoA_napi));
    exports.Set("windowssys_windows_win32_security_authorization_TreeResetNamedSecurityInfoW", Napi::Function::New(env, windowssys_windows_win32_security_authorization_TreeResetNamedSecurityInfoW_napi));
    exports.Set("windowssys_windows_win32_security_authorization_TreeSetNamedSecurityInfoA", Napi::Function::New(env, windowssys_windows_win32_security_authorization_TreeSetNamedSecurityInfoA_napi));
    exports.Set("windowssys_windows_win32_security_authorization_TreeSetNamedSecurityInfoW", Napi::Function::New(env, windowssys_windows_win32_security_authorization_TreeSetNamedSecurityInfoW_napi));
}

static KmNapiRegistrarNode registrar_node = { &register_windows_win32_security_authorization_napi, nullptr };
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
