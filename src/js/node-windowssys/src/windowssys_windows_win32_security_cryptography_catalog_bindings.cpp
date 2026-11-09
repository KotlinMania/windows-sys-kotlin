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

static Napi::Value windowssys_windows_win32_security_cryptography_catalog_CryptCATAdminAcquireContext_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* phcatadmin = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pgsubsystem = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wintrust.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptCATAdminAcquireContext")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(phcatadmin, pgsubsystem, dwflags) : -1;
#else
    (void)phcatadmin;
    (void)pgsubsystem;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_catalog_CryptCATAdminAcquireContext2_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* phcatadmin = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pgsubsystem = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pwszhashalgorithm = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pstronghashpolicy = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wintrust.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptCATAdminAcquireContext2")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(phcatadmin, pgsubsystem, pwszhashalgorithm, pstronghashpolicy, dwflags) : -1;
#else
    (void)phcatadmin;
    (void)pgsubsystem;
    (void)pwszhashalgorithm;
    (void)pstronghashpolicy;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_catalog_CryptCATAdminAddCatalog_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hcatadmin = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* pwszcatalogfile = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pwszselectbasename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wintrust.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptCATAdminAddCatalog")));
    }
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcatadmin, pwszcatalogfile, pwszselectbasename, dwflags) : -1;
#else
    (void)hcatadmin;
    (void)pwszcatalogfile;
    (void)pwszselectbasename;
    (void)dwflags;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_security_cryptography_catalog_CryptCATAdminCalcHashFromFileHandle_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hfile = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pcbhash = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pbhash = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wintrust.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptCATAdminCalcHashFromFileHandle")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hfile, pcbhash, pbhash, dwflags) : -1;
#else
    (void)hfile;
    (void)pcbhash;
    (void)pbhash;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_catalog_CryptCATAdminCalcHashFromFileHandle2_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hcatadmin = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* hfile = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pcbhash = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pbhash = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wintrust.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptCATAdminCalcHashFromFileHandle2")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcatadmin, hfile, pcbhash, pbhash, dwflags) : -1;
#else
    (void)hcatadmin;
    (void)hfile;
    (void)pcbhash;
    (void)pbhash;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_catalog_CryptCATAdminEnumCatalogFromHash_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hcatadmin = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* pbhash = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t cbhash = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* phprevcatinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wintrust.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptCATAdminEnumCatalogFromHash")));
    }
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcatadmin, pbhash, cbhash, dwflags, phprevcatinfo) : -1;
#else
    (void)hcatadmin;
    (void)pbhash;
    (void)cbhash;
    (void)dwflags;
    (void)phprevcatinfo;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_security_cryptography_catalog_CryptCATAdminPauseServiceForBackup_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    int32_t fresume = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wintrust.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptCATAdminPauseServiceForBackup")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwflags, fresume) : -1;
#else
    (void)dwflags;
    (void)fresume;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_catalog_CryptCATAdminReleaseCatalogContext_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hcatadmin = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t hcatinfo = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wintrust.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptCATAdminReleaseCatalogContext")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcatadmin, hcatinfo, dwflags) : -1;
#else
    (void)hcatadmin;
    (void)hcatinfo;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_catalog_CryptCATAdminReleaseContext_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hcatadmin = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wintrust.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptCATAdminReleaseContext")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcatadmin, dwflags) : -1;
#else
    (void)hcatadmin;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_catalog_CryptCATAdminRemoveCatalog_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hcatadmin = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* pwszcatalogfile = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wintrust.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptCATAdminRemoveCatalog")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcatadmin, pwszcatalogfile, dwflags) : -1;
#else
    (void)hcatadmin;
    (void)pwszcatalogfile;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_catalog_CryptCATAdminResolveCatalogPath_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hcatadmin = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* pwszcatalogfile = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pscatinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wintrust.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptCATAdminResolveCatalogPath")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcatadmin, pwszcatalogfile, pscatinfo, dwflags) : -1;
#else
    (void)hcatadmin;
    (void)pwszcatalogfile;
    (void)pscatinfo;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_catalog_CryptCATAllocSortedMemberInfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hcatalog = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pwszreferencetag = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wintrust.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptCATAllocSortedMemberInfo")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcatalog, pwszreferencetag) : NULL;
#else
    (void)hcatalog;
    (void)pwszreferencetag;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_security_cryptography_catalog_CryptCATCDFClose_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pcdf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wintrust.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptCATCDFClose")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pcdf) : -1;
#else
    (void)pcdf;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_catalog_CryptCATCDFEnumAttributes_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pcdf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pmember = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pprevattr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pfnparseerror = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wintrust.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptCATCDFEnumAttributes")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pcdf, pmember, pprevattr, pfnparseerror) : NULL;
#else
    (void)pcdf;
    (void)pmember;
    (void)pprevattr;
    (void)pfnparseerror;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_security_cryptography_catalog_CryptCATCDFEnumAttributesWithCDFTag_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pcdf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pwszmembertag = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pmember = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pprevattr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pfnparseerror = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wintrust.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptCATCDFEnumAttributesWithCDFTag")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pcdf, pwszmembertag, pmember, pprevattr, pfnparseerror) : NULL;
#else
    (void)pcdf;
    (void)pwszmembertag;
    (void)pmember;
    (void)pprevattr;
    (void)pfnparseerror;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_security_cryptography_catalog_CryptCATCDFEnumCatAttributes_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pcdf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pprevattr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pfnparseerror = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wintrust.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptCATCDFEnumCatAttributes")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pcdf, pprevattr, pfnparseerror) : NULL;
#else
    (void)pcdf;
    (void)pprevattr;
    (void)pfnparseerror;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_security_cryptography_catalog_CryptCATCDFEnumMembers_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pcdf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pprevmember = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pfnparseerror = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wintrust.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptCATCDFEnumMembers")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pcdf, pprevmember, pfnparseerror) : NULL;
#else
    (void)pcdf;
    (void)pprevmember;
    (void)pfnparseerror;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_security_cryptography_catalog_CryptCATCDFEnumMembersByCDFTagEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pcdf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pwszprevcdftag = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pfnparseerror = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* ppmember = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    int32_t fcontinueonerror = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* pvreserved = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wintrust.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptCATCDFEnumMembersByCDFTagEx")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pcdf, pwszprevcdftag, pfnparseerror, ppmember, fcontinueonerror, pvreserved) : NULL;
#else
    (void)pcdf;
    (void)pwszprevcdftag;
    (void)pfnparseerror;
    (void)ppmember;
    (void)fcontinueonerror;
    (void)pvreserved;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_security_cryptography_catalog_CryptCATCDFOpen_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pwszfilepath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pfnparseerror = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wintrust.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptCATCDFOpen")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pwszfilepath, pfnparseerror) : NULL;
#else
    (void)pwszfilepath;
    (void)pfnparseerror;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_security_cryptography_catalog_CryptCATCatalogInfoFromContext_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hcatinfo = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* pscatinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wintrust.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptCATCatalogInfoFromContext")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcatinfo, pscatinfo, dwflags) : -1;
#else
    (void)hcatinfo;
    (void)pscatinfo;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_catalog_CryptCATClose_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hcatalog = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wintrust.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptCATClose")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcatalog) : -1;
#else
    (void)hcatalog;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_catalog_CryptCATEnumerateAttr_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hcatalog = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pcatmember = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pprevattr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wintrust.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptCATEnumerateAttr")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcatalog, pcatmember, pprevattr) : NULL;
#else
    (void)hcatalog;
    (void)pcatmember;
    (void)pprevattr;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_security_cryptography_catalog_CryptCATEnumerateCatAttr_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hcatalog = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pprevattr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wintrust.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptCATEnumerateCatAttr")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcatalog, pprevattr) : NULL;
#else
    (void)hcatalog;
    (void)pprevattr;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_security_cryptography_catalog_CryptCATEnumerateMember_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hcatalog = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pprevmember = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wintrust.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptCATEnumerateMember")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcatalog, pprevmember) : NULL;
#else
    (void)hcatalog;
    (void)pprevmember;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_security_cryptography_catalog_CryptCATFreeSortedMemberInfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hcatalog = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pcatmember = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wintrust.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptCATFreeSortedMemberInfo")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(hcatalog, pcatmember);
#else
    (void)hcatalog;
    (void)pcatmember;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_security_cryptography_catalog_CryptCATGetAttrInfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hcatalog = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pcatmember = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pwszreferencetag = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wintrust.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptCATGetAttrInfo")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcatalog, pcatmember, pwszreferencetag) : NULL;
#else
    (void)hcatalog;
    (void)pcatmember;
    (void)pwszreferencetag;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_security_cryptography_catalog_CryptCATGetCatAttrInfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hcatalog = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pwszreferencetag = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wintrust.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptCATGetCatAttrInfo")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcatalog, pwszreferencetag) : NULL;
#else
    (void)hcatalog;
    (void)pwszreferencetag;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_security_cryptography_catalog_CryptCATGetMemberInfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hcatalog = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pwszreferencetag = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wintrust.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptCATGetMemberInfo")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcatalog, pwszreferencetag) : NULL;
#else
    (void)hcatalog;
    (void)pwszreferencetag;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_security_cryptography_catalog_CryptCATHandleFromStore_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pcatstore = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wintrust.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptCATHandleFromStore")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pcatstore) : NULL;
#else
    (void)pcatstore;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_security_cryptography_catalog_CryptCATOpen_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pwszfilename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t fdwopenflags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint64_t hprov = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
    uint32_t dwpublicversion = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t dwencodingtype = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, uint64_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wintrust.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptCATOpen")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pwszfilename, fdwopenflags, hprov, dwpublicversion, dwencodingtype) : NULL;
#else
    (void)pwszfilename;
    (void)fdwopenflags;
    (void)hprov;
    (void)dwpublicversion;
    (void)dwencodingtype;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_security_cryptography_catalog_CryptCATPersistStore_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hcatalog = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wintrust.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptCATPersistStore")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcatalog) : -1;
#else
    (void)hcatalog;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_catalog_CryptCATPutAttrInfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hcatalog = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pcatmember = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pwszreferencetag = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t dwattrtypeandaction = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t cbdata = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* pbdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wintrust.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptCATPutAttrInfo")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcatalog, pcatmember, pwszreferencetag, dwattrtypeandaction, cbdata, pbdata) : NULL;
#else
    (void)hcatalog;
    (void)pcatmember;
    (void)pwszreferencetag;
    (void)dwattrtypeandaction;
    (void)cbdata;
    (void)pbdata;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_security_cryptography_catalog_CryptCATPutCatAttrInfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hcatalog = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pwszreferencetag = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwattrtypeandaction = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t cbdata = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* pbdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wintrust.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptCATPutCatAttrInfo")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcatalog, pwszreferencetag, dwattrtypeandaction, cbdata, pbdata) : NULL;
#else
    (void)hcatalog;
    (void)pwszreferencetag;
    (void)dwattrtypeandaction;
    (void)cbdata;
    (void)pbdata;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_security_cryptography_catalog_CryptCATPutMemberInfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hcatalog = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pwszfilename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pwszreferencetag = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pgsubjecttype = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t dwcertversion = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    uint32_t cbsipindirectdata = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* pbsipindirectdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wintrust.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptCATPutMemberInfo")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcatalog, pwszfilename, pwszreferencetag, pgsubjecttype, dwcertversion, cbsipindirectdata, pbsipindirectdata) : NULL;
#else
    (void)hcatalog;
    (void)pwszfilename;
    (void)pwszreferencetag;
    (void)pgsubjecttype;
    (void)dwcertversion;
    (void)cbsipindirectdata;
    (void)pbsipindirectdata;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_security_cryptography_catalog_CryptCATStoreFromHandle_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hcatalog = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wintrust.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptCATStoreFromHandle")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcatalog) : NULL;
#else
    (void)hcatalog;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_security_cryptography_catalog_IsCatalogFile_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hfile = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pwszfilename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wintrust.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IsCatalogFile")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hfile, pwszfilename) : -1;
#else
    (void)hfile;
    (void)pwszfilename;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static void register_windows_win32_security_cryptography_catalog_napi(Napi::Env env, Napi::Object exports) {
    exports.Set("windowssys_windows_win32_security_cryptography_catalog_CryptCATAdminAcquireContext", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_catalog_CryptCATAdminAcquireContext_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_catalog_CryptCATAdminAcquireContext2", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_catalog_CryptCATAdminAcquireContext2_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_catalog_CryptCATAdminAddCatalog", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_catalog_CryptCATAdminAddCatalog_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_catalog_CryptCATAdminCalcHashFromFileHandle", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_catalog_CryptCATAdminCalcHashFromFileHandle_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_catalog_CryptCATAdminCalcHashFromFileHandle2", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_catalog_CryptCATAdminCalcHashFromFileHandle2_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_catalog_CryptCATAdminEnumCatalogFromHash", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_catalog_CryptCATAdminEnumCatalogFromHash_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_catalog_CryptCATAdminPauseServiceForBackup", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_catalog_CryptCATAdminPauseServiceForBackup_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_catalog_CryptCATAdminReleaseCatalogContext", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_catalog_CryptCATAdminReleaseCatalogContext_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_catalog_CryptCATAdminReleaseContext", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_catalog_CryptCATAdminReleaseContext_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_catalog_CryptCATAdminRemoveCatalog", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_catalog_CryptCATAdminRemoveCatalog_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_catalog_CryptCATAdminResolveCatalogPath", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_catalog_CryptCATAdminResolveCatalogPath_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_catalog_CryptCATAllocSortedMemberInfo", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_catalog_CryptCATAllocSortedMemberInfo_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_catalog_CryptCATCDFClose", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_catalog_CryptCATCDFClose_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_catalog_CryptCATCDFEnumAttributes", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_catalog_CryptCATCDFEnumAttributes_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_catalog_CryptCATCDFEnumAttributesWithCDFTag", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_catalog_CryptCATCDFEnumAttributesWithCDFTag_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_catalog_CryptCATCDFEnumCatAttributes", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_catalog_CryptCATCDFEnumCatAttributes_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_catalog_CryptCATCDFEnumMembers", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_catalog_CryptCATCDFEnumMembers_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_catalog_CryptCATCDFEnumMembersByCDFTagEx", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_catalog_CryptCATCDFEnumMembersByCDFTagEx_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_catalog_CryptCATCDFOpen", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_catalog_CryptCATCDFOpen_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_catalog_CryptCATCatalogInfoFromContext", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_catalog_CryptCATCatalogInfoFromContext_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_catalog_CryptCATClose", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_catalog_CryptCATClose_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_catalog_CryptCATEnumerateAttr", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_catalog_CryptCATEnumerateAttr_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_catalog_CryptCATEnumerateCatAttr", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_catalog_CryptCATEnumerateCatAttr_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_catalog_CryptCATEnumerateMember", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_catalog_CryptCATEnumerateMember_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_catalog_CryptCATFreeSortedMemberInfo", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_catalog_CryptCATFreeSortedMemberInfo_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_catalog_CryptCATGetAttrInfo", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_catalog_CryptCATGetAttrInfo_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_catalog_CryptCATGetCatAttrInfo", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_catalog_CryptCATGetCatAttrInfo_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_catalog_CryptCATGetMemberInfo", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_catalog_CryptCATGetMemberInfo_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_catalog_CryptCATHandleFromStore", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_catalog_CryptCATHandleFromStore_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_catalog_CryptCATOpen", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_catalog_CryptCATOpen_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_catalog_CryptCATPersistStore", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_catalog_CryptCATPersistStore_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_catalog_CryptCATPutAttrInfo", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_catalog_CryptCATPutAttrInfo_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_catalog_CryptCATPutCatAttrInfo", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_catalog_CryptCATPutCatAttrInfo_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_catalog_CryptCATPutMemberInfo", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_catalog_CryptCATPutMemberInfo_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_catalog_CryptCATStoreFromHandle", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_catalog_CryptCATStoreFromHandle_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_catalog_IsCatalogFile", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_catalog_IsCatalogFile_napi));
}

static KmNapiRegistrarNode registrar_node = { &register_windows_win32_security_cryptography_catalog_napi, nullptr };
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
