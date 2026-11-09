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

static Napi::Value windowssys_windows_win32_security_credentials_CredDeleteA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* targetname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t type = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CredDeleteA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(targetname, type, flags) : -1;
#else
    (void)targetname;
    (void)type;
    (void)flags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_credentials_CredDeleteW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* targetname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t type = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CredDeleteW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(targetname, type, flags) : -1;
#else
    (void)targetname;
    (void)type;
    (void)flags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_credentials_CredEnumerateA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* filter = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* count = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* credential = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CredEnumerateA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(filter, flags, count, credential) : -1;
#else
    (void)filter;
    (void)flags;
    (void)count;
    (void)credential;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_credentials_CredEnumerateW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* filter = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* count = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* credential = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CredEnumerateW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(filter, flags, count, credential) : -1;
#else
    (void)filter;
    (void)flags;
    (void)count;
    (void)credential;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_credentials_CredFindBestCredentialA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* targetname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t type = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* credential = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CredFindBestCredentialA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(targetname, type, flags, credential) : -1;
#else
    (void)targetname;
    (void)type;
    (void)flags;
    (void)credential;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_credentials_CredFindBestCredentialW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* targetname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t type = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* credential = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CredFindBestCredentialW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(targetname, type, flags, credential) : -1;
#else
    (void)targetname;
    (void)type;
    (void)flags;
    (void)credential;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_credentials_CredFree_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CredFree")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(buffer);
#else
    (void)buffer;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_security_credentials_CredGetSessionTypes_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t maximumpersistcount = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* maximumpersist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CredGetSessionTypes")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(maximumpersistcount, maximumpersist) : -1;
#else
    (void)maximumpersistcount;
    (void)maximumpersist;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_credentials_CredGetTargetInfoA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* targetname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* targetinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CredGetTargetInfoA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(targetname, flags, targetinfo) : -1;
#else
    (void)targetname;
    (void)flags;
    (void)targetinfo;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_credentials_CredGetTargetInfoW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* targetname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* targetinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CredGetTargetInfoW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(targetname, flags, targetinfo) : -1;
#else
    (void)targetname;
    (void)flags;
    (void)targetinfo;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_credentials_CredIsMarshaledCredentialA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* marshaledcredential = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CredIsMarshaledCredentialA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(marshaledcredential) : -1;
#else
    (void)marshaledcredential;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_credentials_CredIsMarshaledCredentialW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* marshaledcredential = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CredIsMarshaledCredentialW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(marshaledcredential) : -1;
#else
    (void)marshaledcredential;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_credentials_CredIsProtectedA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pszprotectedcredentials = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pprotectiontype = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CredIsProtectedA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pszprotectedcredentials, pprotectiontype) : -1;
#else
    (void)pszprotectedcredentials;
    (void)pprotectiontype;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_credentials_CredIsProtectedW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pszprotectedcredentials = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pprotectiontype = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CredIsProtectedW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pszprotectedcredentials, pprotectiontype) : -1;
#else
    (void)pszprotectedcredentials;
    (void)pprotectiontype;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_credentials_CredMarshalCredentialA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t credtype = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* credential = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* marshaledcredential = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CredMarshalCredentialA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(credtype, credential, marshaledcredential) : -1;
#else
    (void)credtype;
    (void)credential;
    (void)marshaledcredential;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_credentials_CredMarshalCredentialW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t credtype = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* credential = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* marshaledcredential = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CredMarshalCredentialW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(credtype, credential, marshaledcredential) : -1;
#else
    (void)credtype;
    (void)credential;
    (void)marshaledcredential;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_credentials_CredPackAuthenticationBufferA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* pszusername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pszpassword = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* ppackedcredentials = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pcbpackedcredentials = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("credui.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CredPackAuthenticationBufferA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwflags, pszusername, pszpassword, ppackedcredentials, pcbpackedcredentials) : -1;
#else
    (void)dwflags;
    (void)pszusername;
    (void)pszpassword;
    (void)ppackedcredentials;
    (void)pcbpackedcredentials;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_credentials_CredPackAuthenticationBufferW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* pszusername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pszpassword = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* ppackedcredentials = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pcbpackedcredentials = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("credui.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CredPackAuthenticationBufferW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwflags, pszusername, pszpassword, ppackedcredentials, pcbpackedcredentials) : -1;
#else
    (void)dwflags;
    (void)pszusername;
    (void)pszpassword;
    (void)ppackedcredentials;
    (void)pcbpackedcredentials;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_credentials_CredProtectA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t fasself = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* pszcredentials = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t cchcredentials = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pszprotectedcredentials = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pcchmaxchars = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* protectiontype = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CredProtectA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(fasself, pszcredentials, cchcredentials, pszprotectedcredentials, pcchmaxchars, protectiontype) : -1;
#else
    (void)fasself;
    (void)pszcredentials;
    (void)cchcredentials;
    (void)pszprotectedcredentials;
    (void)pcchmaxchars;
    (void)protectiontype;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_credentials_CredProtectW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t fasself = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* pszcredentials = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t cchcredentials = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pszprotectedcredentials = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pcchmaxchars = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* protectiontype = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CredProtectW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(fasself, pszcredentials, cchcredentials, pszprotectedcredentials, pcchmaxchars, protectiontype) : -1;
#else
    (void)fasself;
    (void)pszcredentials;
    (void)cchcredentials;
    (void)pszprotectedcredentials;
    (void)pcchmaxchars;
    (void)protectiontype;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_credentials_CredReadA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* targetname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t type = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* credential = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CredReadA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(targetname, type, flags, credential) : -1;
#else
    (void)targetname;
    (void)type;
    (void)flags;
    (void)credential;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_credentials_CredReadDomainCredentialsA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* targetinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* count = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* credential = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CredReadDomainCredentialsA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(targetinfo, flags, count, credential) : -1;
#else
    (void)targetinfo;
    (void)flags;
    (void)count;
    (void)credential;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_credentials_CredReadDomainCredentialsW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* targetinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* count = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* credential = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CredReadDomainCredentialsW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(targetinfo, flags, count, credential) : -1;
#else
    (void)targetinfo;
    (void)flags;
    (void)count;
    (void)credential;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_credentials_CredReadW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* targetname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t type = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* credential = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CredReadW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(targetname, type, flags, credential) : -1;
#else
    (void)targetname;
    (void)type;
    (void)flags;
    (void)credential;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_credentials_CredRenameA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* oldtargetname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* newtargetname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t type = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CredRenameA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(oldtargetname, newtargetname, type, flags) : -1;
#else
    (void)oldtargetname;
    (void)newtargetname;
    (void)type;
    (void)flags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_credentials_CredRenameW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* oldtargetname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* newtargetname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t type = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CredRenameW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(oldtargetname, newtargetname, type, flags) : -1;
#else
    (void)oldtargetname;
    (void)newtargetname;
    (void)type;
    (void)flags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_credentials_CredUICmdLinePromptForCredentialsA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* psztargetname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwautherror = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* username = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t uluserbuffersize = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* pszpassword = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    uint32_t ulpasswordbuffersize = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    void* pfsave = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 8 ? km_info[8].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("credui.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CredUICmdLinePromptForCredentialsA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(psztargetname, pcontext, dwautherror, username, uluserbuffersize, pszpassword, ulpasswordbuffersize, pfsave, dwflags) : 0;
#else
    (void)psztargetname;
    (void)pcontext;
    (void)dwautherror;
    (void)username;
    (void)uluserbuffersize;
    (void)pszpassword;
    (void)ulpasswordbuffersize;
    (void)pfsave;
    (void)dwflags;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_credentials_CredUICmdLinePromptForCredentialsW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* psztargetname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwautherror = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* username = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t uluserbuffersize = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* pszpassword = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    uint32_t ulpasswordbuffersize = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    void* pfsave = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 8 ? km_info[8].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("credui.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CredUICmdLinePromptForCredentialsW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(psztargetname, pcontext, dwautherror, username, uluserbuffersize, pszpassword, ulpasswordbuffersize, pfsave, dwflags) : 0;
#else
    (void)psztargetname;
    (void)pcontext;
    (void)dwautherror;
    (void)username;
    (void)uluserbuffersize;
    (void)pszpassword;
    (void)ulpasswordbuffersize;
    (void)pfsave;
    (void)dwflags;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_credentials_CredUIConfirmCredentialsA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* psztargetname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t bconfirm = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("credui.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CredUIConfirmCredentialsA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(psztargetname, bconfirm) : 0;
#else
    (void)psztargetname;
    (void)bconfirm;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_credentials_CredUIConfirmCredentialsW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* psztargetname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t bconfirm = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("credui.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CredUIConfirmCredentialsW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(psztargetname, bconfirm) : 0;
#else
    (void)psztargetname;
    (void)bconfirm;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_credentials_CredUIParseUserNameA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* username = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* user = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t userbuffersize = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* domain = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t domainbuffersize = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("credui.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CredUIParseUserNameA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(username, user, userbuffersize, domain, domainbuffersize) : 0;
#else
    (void)username;
    (void)user;
    (void)userbuffersize;
    (void)domain;
    (void)domainbuffersize;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_credentials_CredUIParseUserNameW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* username = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* user = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t userbuffersize = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* domain = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t domainbuffersize = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("credui.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CredUIParseUserNameW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(username, user, userbuffersize, domain, domainbuffersize) : 0;
#else
    (void)username;
    (void)user;
    (void)userbuffersize;
    (void)domain;
    (void)domainbuffersize;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_credentials_CredUIPromptForCredentialsA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* puiinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* psztargetname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t dwautherror = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* pszusername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t ulusernamebuffersize = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* pszpassword = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    uint32_t ulpasswordbuffersize = static_cast<uint32_t>(km_info.Length() > 7 ? km_info[7].ToNumber().Int32Value() : 0);
    void* save = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 9 ? km_info[9].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, uint32_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("credui.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CredUIPromptForCredentialsA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(puiinfo, psztargetname, pcontext, dwautherror, pszusername, ulusernamebuffersize, pszpassword, ulpasswordbuffersize, save, dwflags) : 0;
#else
    (void)puiinfo;
    (void)psztargetname;
    (void)pcontext;
    (void)dwautherror;
    (void)pszusername;
    (void)ulusernamebuffersize;
    (void)pszpassword;
    (void)ulpasswordbuffersize;
    (void)save;
    (void)dwflags;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_credentials_CredUIPromptForCredentialsW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* puiinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* psztargetname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t dwautherror = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* pszusername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t ulusernamebuffersize = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* pszpassword = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    uint32_t ulpasswordbuffersize = static_cast<uint32_t>(km_info.Length() > 7 ? km_info[7].ToNumber().Int32Value() : 0);
    void* save = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 9 ? km_info[9].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, uint32_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("credui.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CredUIPromptForCredentialsW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(puiinfo, psztargetname, pcontext, dwautherror, pszusername, ulusernamebuffersize, pszpassword, ulpasswordbuffersize, save, dwflags) : 0;
#else
    (void)puiinfo;
    (void)psztargetname;
    (void)pcontext;
    (void)dwautherror;
    (void)pszusername;
    (void)ulusernamebuffersize;
    (void)pszpassword;
    (void)ulpasswordbuffersize;
    (void)save;
    (void)dwflags;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_credentials_CredUIPromptForWindowsCredentialsA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* puiinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwautherror = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pulauthpackage = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pvinauthbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t ulinauthbuffersize = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* ppvoutauthbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* puloutauthbuffersize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* pfsave = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 8 ? km_info[8].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("credui.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CredUIPromptForWindowsCredentialsA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(puiinfo, dwautherror, pulauthpackage, pvinauthbuffer, ulinauthbuffersize, ppvoutauthbuffer, puloutauthbuffersize, pfsave, dwflags) : 0;
#else
    (void)puiinfo;
    (void)dwautherror;
    (void)pulauthpackage;
    (void)pvinauthbuffer;
    (void)ulinauthbuffersize;
    (void)ppvoutauthbuffer;
    (void)puloutauthbuffersize;
    (void)pfsave;
    (void)dwflags;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_credentials_CredUIPromptForWindowsCredentialsW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* puiinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwautherror = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pulauthpackage = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pvinauthbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t ulinauthbuffersize = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* ppvoutauthbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* puloutauthbuffersize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* pfsave = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 8 ? km_info[8].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("credui.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CredUIPromptForWindowsCredentialsW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(puiinfo, dwautherror, pulauthpackage, pvinauthbuffer, ulinauthbuffersize, ppvoutauthbuffer, puloutauthbuffersize, pfsave, dwflags) : 0;
#else
    (void)puiinfo;
    (void)dwautherror;
    (void)pulauthpackage;
    (void)pvinauthbuffer;
    (void)ulinauthbuffersize;
    (void)ppvoutauthbuffer;
    (void)puloutauthbuffersize;
    (void)pfsave;
    (void)dwflags;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_credentials_CredUIReadSSOCredW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pszrealm = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ppszusername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("credui.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CredUIReadSSOCredW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pszrealm, ppszusername) : 0;
#else
    (void)pszrealm;
    (void)ppszusername;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_credentials_CredUIStoreSSOCredW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pszrealm = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pszusername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pszpassword = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int32_t bpersist = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("credui.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CredUIStoreSSOCredW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pszrealm, pszusername, pszpassword, bpersist) : 0;
#else
    (void)pszrealm;
    (void)pszusername;
    (void)pszpassword;
    (void)bpersist;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_credentials_CredUnPackAuthenticationBufferA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* pauthbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t cbauthbuffer = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pszusername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pcchlmaxusername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* pszdomainname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* pcchmaxdomainname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* pszpassword = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    void* pcchmaxpassword = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("credui.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CredUnPackAuthenticationBufferA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwflags, pauthbuffer, cbauthbuffer, pszusername, pcchlmaxusername, pszdomainname, pcchmaxdomainname, pszpassword, pcchmaxpassword) : -1;
#else
    (void)dwflags;
    (void)pauthbuffer;
    (void)cbauthbuffer;
    (void)pszusername;
    (void)pcchlmaxusername;
    (void)pszdomainname;
    (void)pcchmaxdomainname;
    (void)pszpassword;
    (void)pcchmaxpassword;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_credentials_CredUnPackAuthenticationBufferW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* pauthbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t cbauthbuffer = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pszusername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pcchmaxusername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* pszdomainname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* pcchmaxdomainname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* pszpassword = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    void* pcchmaxpassword = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("credui.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CredUnPackAuthenticationBufferW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwflags, pauthbuffer, cbauthbuffer, pszusername, pcchmaxusername, pszdomainname, pcchmaxdomainname, pszpassword, pcchmaxpassword) : -1;
#else
    (void)dwflags;
    (void)pauthbuffer;
    (void)cbauthbuffer;
    (void)pszusername;
    (void)pcchmaxusername;
    (void)pszdomainname;
    (void)pcchmaxdomainname;
    (void)pszpassword;
    (void)pcchmaxpassword;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_credentials_CredUnmarshalCredentialA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* marshaledcredential = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* credtype = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* credential = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CredUnmarshalCredentialA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(marshaledcredential, credtype, credential) : -1;
#else
    (void)marshaledcredential;
    (void)credtype;
    (void)credential;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_credentials_CredUnmarshalCredentialW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* marshaledcredential = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* credtype = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* credential = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CredUnmarshalCredentialW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(marshaledcredential, credtype, credential) : -1;
#else
    (void)marshaledcredential;
    (void)credtype;
    (void)credential;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_credentials_CredUnprotectA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t fasself = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* pszprotectedcredentials = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t cchprotectedcredentials = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pszcredentials = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pcchmaxchars = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CredUnprotectA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(fasself, pszprotectedcredentials, cchprotectedcredentials, pszcredentials, pcchmaxchars) : -1;
#else
    (void)fasself;
    (void)pszprotectedcredentials;
    (void)cchprotectedcredentials;
    (void)pszcredentials;
    (void)pcchmaxchars;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_credentials_CredUnprotectW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t fasself = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* pszprotectedcredentials = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t cchprotectedcredentials = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pszcredentials = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pcchmaxchars = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CredUnprotectW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(fasself, pszprotectedcredentials, cchprotectedcredentials, pszcredentials, pcchmaxchars) : -1;
#else
    (void)fasself;
    (void)pszprotectedcredentials;
    (void)cchprotectedcredentials;
    (void)pszcredentials;
    (void)pcchmaxchars;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_credentials_CredWriteA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* credential = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CredWriteA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(credential, flags) : -1;
#else
    (void)credential;
    (void)flags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_credentials_CredWriteDomainCredentialsA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* targetinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* credential = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CredWriteDomainCredentialsA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(targetinfo, credential, flags) : -1;
#else
    (void)targetinfo;
    (void)credential;
    (void)flags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_credentials_CredWriteDomainCredentialsW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* targetinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* credential = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CredWriteDomainCredentialsW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(targetinfo, credential, flags) : -1;
#else
    (void)targetinfo;
    (void)credential;
    (void)flags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_credentials_CredWriteW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* credential = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CredWriteW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(credential, flags) : -1;
#else
    (void)credential;
    (void)flags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_credentials_GetOpenCardNameA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* param0 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("scarddlg.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetOpenCardNameA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(param0) : -1;
#else
    (void)param0;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_credentials_GetOpenCardNameW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* param0 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("scarddlg.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetOpenCardNameW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(param0) : -1;
#else
    (void)param0;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_credentials_KeyCredentialManagerFreeInformation_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* keycredentialmanagerinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("keycredmgr.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "KeyCredentialManagerFreeInformation")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(keycredentialmanagerinfo);
#else
    (void)keycredentialmanagerinfo;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_security_credentials_KeyCredentialManagerGetInformation_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* keycredentialmanagerinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("keycredmgr.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "KeyCredentialManagerGetInformation")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(keycredentialmanagerinfo) : -1;
#else
    (void)keycredentialmanagerinfo;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_credentials_KeyCredentialManagerGetOperationErrorStates_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t keycredentialmanageroperationtype = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* isready = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* keycredentialmanageroperationerrorstates = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("keycredmgr.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "KeyCredentialManagerGetOperationErrorStates")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(keycredentialmanageroperationtype, isready, keycredentialmanageroperationerrorstates) : -1;
#else
    (void)keycredentialmanageroperationtype;
    (void)isready;
    (void)keycredentialmanageroperationerrorstates;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_credentials_KeyCredentialManagerShowUIOperation_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hwndowner = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t keycredentialmanageroperationtype = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("keycredmgr.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "KeyCredentialManagerShowUIOperation")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hwndowner, keycredentialmanageroperationtype) : -1;
#else
    (void)hwndowner;
    (void)keycredentialmanageroperationtype;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_credentials_SCardAccessStartedEvent_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SCardAccessStartedEvent")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr() : NULL;
#else
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_security_credentials_SCardAddReaderToGroupA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hcontext = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* szreadername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* szgroupname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SCardAddReaderToGroupA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcontext, szreadername, szgroupname) : -1;
#else
    (void)hcontext;
    (void)szreadername;
    (void)szgroupname;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_credentials_SCardAddReaderToGroupW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hcontext = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* szreadername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* szgroupname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SCardAddReaderToGroupW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcontext, szreadername, szgroupname) : -1;
#else
    (void)hcontext;
    (void)szreadername;
    (void)szgroupname;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_credentials_SCardAudit_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hcontext = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint32_t dwevent = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SCardAudit")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcontext, dwevent) : -1;
#else
    (void)hcontext;
    (void)dwevent;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_credentials_SCardBeginTransaction_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hcard = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SCardBeginTransaction")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcard) : -1;
#else
    (void)hcard;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_credentials_SCardCancel_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hcontext = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SCardCancel")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcontext) : -1;
#else
    (void)hcontext;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_credentials_SCardConnectA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hcontext = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* szreader = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwsharemode = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t dwpreferredprotocols = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* phcard = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* pdwactiveprotocol = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SCardConnectA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcontext, szreader, dwsharemode, dwpreferredprotocols, phcard, pdwactiveprotocol) : -1;
#else
    (void)hcontext;
    (void)szreader;
    (void)dwsharemode;
    (void)dwpreferredprotocols;
    (void)phcard;
    (void)pdwactiveprotocol;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_credentials_SCardConnectW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hcontext = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* szreader = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwsharemode = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t dwpreferredprotocols = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* phcard = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* pdwactiveprotocol = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SCardConnectW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcontext, szreader, dwsharemode, dwpreferredprotocols, phcard, pdwactiveprotocol) : -1;
#else
    (void)hcontext;
    (void)szreader;
    (void)dwsharemode;
    (void)dwpreferredprotocols;
    (void)phcard;
    (void)pdwactiveprotocol;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_credentials_SCardControl_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hcard = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint32_t dwcontrolcode = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* lpinbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t cbinbuffersize = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* lpoutbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t cboutbuffersize = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* lpbytesreturned = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SCardControl")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcard, dwcontrolcode, lpinbuffer, cbinbuffersize, lpoutbuffer, cboutbuffersize, lpbytesreturned) : -1;
#else
    (void)hcard;
    (void)dwcontrolcode;
    (void)lpinbuffer;
    (void)cbinbuffersize;
    (void)lpoutbuffer;
    (void)cboutbuffersize;
    (void)lpbytesreturned;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_credentials_SCardDisconnect_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hcard = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint32_t dwdisposition = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SCardDisconnect")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcard, dwdisposition) : -1;
#else
    (void)hcard;
    (void)dwdisposition;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_credentials_SCardDlgExtendedError_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("scarddlg.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SCardDlgExtendedError")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_credentials_SCardEndTransaction_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hcard = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint32_t dwdisposition = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SCardEndTransaction")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcard, dwdisposition) : -1;
#else
    (void)hcard;
    (void)dwdisposition;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_credentials_SCardEstablishContext_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwscope = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* pvreserved1 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pvreserved2 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* phcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SCardEstablishContext")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwscope, pvreserved1, pvreserved2, phcontext) : -1;
#else
    (void)dwscope;
    (void)pvreserved1;
    (void)pvreserved2;
    (void)phcontext;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_credentials_SCardForgetCardTypeA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hcontext = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* szcardname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SCardForgetCardTypeA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcontext, szcardname) : -1;
#else
    (void)hcontext;
    (void)szcardname;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_credentials_SCardForgetCardTypeW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hcontext = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* szcardname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SCardForgetCardTypeW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcontext, szcardname) : -1;
#else
    (void)hcontext;
    (void)szcardname;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_credentials_SCardForgetReaderA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hcontext = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* szreadername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SCardForgetReaderA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcontext, szreadername) : -1;
#else
    (void)hcontext;
    (void)szreadername;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_credentials_SCardForgetReaderGroupA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hcontext = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* szgroupname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SCardForgetReaderGroupA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcontext, szgroupname) : -1;
#else
    (void)hcontext;
    (void)szgroupname;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_credentials_SCardForgetReaderGroupW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hcontext = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* szgroupname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SCardForgetReaderGroupW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcontext, szgroupname) : -1;
#else
    (void)hcontext;
    (void)szgroupname;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_credentials_SCardForgetReaderW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hcontext = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* szreadername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SCardForgetReaderW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcontext, szreadername) : -1;
#else
    (void)hcontext;
    (void)szreadername;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_credentials_SCardFreeMemory_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hcontext = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* pvmem = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SCardFreeMemory")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcontext, pvmem) : -1;
#else
    (void)hcontext;
    (void)pvmem;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_credentials_SCardGetAttrib_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hcard = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint32_t dwattrid = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pbattr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pcbattrlen = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SCardGetAttrib")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcard, dwattrid, pbattr, pcbattrlen) : -1;
#else
    (void)hcard;
    (void)dwattrid;
    (void)pbattr;
    (void)pcbattrlen;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_credentials_SCardGetCardTypeProviderNameA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hcontext = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* szcardname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwproviderid = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* szprovider = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pcchprovider = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SCardGetCardTypeProviderNameA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcontext, szcardname, dwproviderid, szprovider, pcchprovider) : -1;
#else
    (void)hcontext;
    (void)szcardname;
    (void)dwproviderid;
    (void)szprovider;
    (void)pcchprovider;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_credentials_SCardGetCardTypeProviderNameW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hcontext = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* szcardname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwproviderid = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* szprovider = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pcchprovider = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SCardGetCardTypeProviderNameW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcontext, szcardname, dwproviderid, szprovider, pcchprovider) : -1;
#else
    (void)hcontext;
    (void)szcardname;
    (void)dwproviderid;
    (void)szprovider;
    (void)pcchprovider;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_credentials_SCardGetDeviceTypeIdA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hcontext = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* szreadername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pdwdevicetypeid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SCardGetDeviceTypeIdA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcontext, szreadername, pdwdevicetypeid) : -1;
#else
    (void)hcontext;
    (void)szreadername;
    (void)pdwdevicetypeid;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_credentials_SCardGetDeviceTypeIdW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hcontext = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* szreadername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pdwdevicetypeid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SCardGetDeviceTypeIdW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcontext, szreadername, pdwdevicetypeid) : -1;
#else
    (void)hcontext;
    (void)szreadername;
    (void)pdwdevicetypeid;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_credentials_SCardGetProviderIdA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hcontext = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* szcard = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pguidproviderid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SCardGetProviderIdA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcontext, szcard, pguidproviderid) : -1;
#else
    (void)hcontext;
    (void)szcard;
    (void)pguidproviderid;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_credentials_SCardGetProviderIdW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hcontext = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* szcard = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pguidproviderid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SCardGetProviderIdW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcontext, szcard, pguidproviderid) : -1;
#else
    (void)hcontext;
    (void)szcard;
    (void)pguidproviderid;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_credentials_SCardGetReaderDeviceInstanceIdA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hcontext = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* szreadername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* szdeviceinstanceid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pcchdeviceinstanceid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SCardGetReaderDeviceInstanceIdA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcontext, szreadername, szdeviceinstanceid, pcchdeviceinstanceid) : -1;
#else
    (void)hcontext;
    (void)szreadername;
    (void)szdeviceinstanceid;
    (void)pcchdeviceinstanceid;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_credentials_SCardGetReaderDeviceInstanceIdW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hcontext = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* szreadername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* szdeviceinstanceid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pcchdeviceinstanceid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SCardGetReaderDeviceInstanceIdW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcontext, szreadername, szdeviceinstanceid, pcchdeviceinstanceid) : -1;
#else
    (void)hcontext;
    (void)szreadername;
    (void)szdeviceinstanceid;
    (void)pcchdeviceinstanceid;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_credentials_SCardGetReaderIconA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hcontext = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* szreadername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pbicon = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pcbicon = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SCardGetReaderIconA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcontext, szreadername, pbicon, pcbicon) : -1;
#else
    (void)hcontext;
    (void)szreadername;
    (void)pbicon;
    (void)pcbicon;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_credentials_SCardGetReaderIconW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hcontext = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* szreadername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pbicon = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pcbicon = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SCardGetReaderIconW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcontext, szreadername, pbicon, pcbicon) : -1;
#else
    (void)hcontext;
    (void)szreadername;
    (void)pbicon;
    (void)pcbicon;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_credentials_SCardGetStatusChangeA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hcontext = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint32_t dwtimeout = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* rgreaderstates = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t creaders = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SCardGetStatusChangeA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcontext, dwtimeout, rgreaderstates, creaders) : -1;
#else
    (void)hcontext;
    (void)dwtimeout;
    (void)rgreaderstates;
    (void)creaders;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_credentials_SCardGetStatusChangeW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hcontext = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint32_t dwtimeout = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* rgreaderstates = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t creaders = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SCardGetStatusChangeW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcontext, dwtimeout, rgreaderstates, creaders) : -1;
#else
    (void)hcontext;
    (void)dwtimeout;
    (void)rgreaderstates;
    (void)creaders;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_credentials_SCardGetTransmitCount_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hcard = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* pctransmitcount = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SCardGetTransmitCount")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcard, pctransmitcount) : -1;
#else
    (void)hcard;
    (void)pctransmitcount;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_credentials_SCardIntroduceCardTypeA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hcontext = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* szcardname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pguidprimaryprovider = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* rgguidinterfaces = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t dwinterfacecount = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* pbatr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* pbatrmask = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    uint32_t cbatrlen = static_cast<uint32_t>(km_info.Length() > 7 ? km_info[7].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, void*, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SCardIntroduceCardTypeA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcontext, szcardname, pguidprimaryprovider, rgguidinterfaces, dwinterfacecount, pbatr, pbatrmask, cbatrlen) : -1;
#else
    (void)hcontext;
    (void)szcardname;
    (void)pguidprimaryprovider;
    (void)rgguidinterfaces;
    (void)dwinterfacecount;
    (void)pbatr;
    (void)pbatrmask;
    (void)cbatrlen;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_credentials_SCardIntroduceCardTypeW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hcontext = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* szcardname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pguidprimaryprovider = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* rgguidinterfaces = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t dwinterfacecount = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* pbatr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* pbatrmask = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    uint32_t cbatrlen = static_cast<uint32_t>(km_info.Length() > 7 ? km_info[7].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, void*, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SCardIntroduceCardTypeW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcontext, szcardname, pguidprimaryprovider, rgguidinterfaces, dwinterfacecount, pbatr, pbatrmask, cbatrlen) : -1;
#else
    (void)hcontext;
    (void)szcardname;
    (void)pguidprimaryprovider;
    (void)rgguidinterfaces;
    (void)dwinterfacecount;
    (void)pbatr;
    (void)pbatrmask;
    (void)cbatrlen;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_credentials_SCardIntroduceReaderA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hcontext = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* szreadername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* szdevicename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SCardIntroduceReaderA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcontext, szreadername, szdevicename) : -1;
#else
    (void)hcontext;
    (void)szreadername;
    (void)szdevicename;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_credentials_SCardIntroduceReaderGroupA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hcontext = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* szgroupname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SCardIntroduceReaderGroupA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcontext, szgroupname) : -1;
#else
    (void)hcontext;
    (void)szgroupname;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_credentials_SCardIntroduceReaderGroupW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hcontext = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* szgroupname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SCardIntroduceReaderGroupW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcontext, szgroupname) : -1;
#else
    (void)hcontext;
    (void)szgroupname;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_credentials_SCardIntroduceReaderW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hcontext = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* szreadername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* szdevicename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SCardIntroduceReaderW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcontext, szreadername, szdevicename) : -1;
#else
    (void)hcontext;
    (void)szreadername;
    (void)szdevicename;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_credentials_SCardIsValidContext_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hcontext = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SCardIsValidContext")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcontext) : -1;
#else
    (void)hcontext;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_credentials_SCardListCardsA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hcontext = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* pbatr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* rgquidinterfaces = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t cguidinterfacecount = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* mszcards = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* pcchcards = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SCardListCardsA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcontext, pbatr, rgquidinterfaces, cguidinterfacecount, mszcards, pcchcards) : -1;
#else
    (void)hcontext;
    (void)pbatr;
    (void)rgquidinterfaces;
    (void)cguidinterfacecount;
    (void)mszcards;
    (void)pcchcards;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_credentials_SCardListCardsW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hcontext = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* pbatr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* rgquidinterfaces = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t cguidinterfacecount = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* mszcards = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* pcchcards = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SCardListCardsW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcontext, pbatr, rgquidinterfaces, cguidinterfacecount, mszcards, pcchcards) : -1;
#else
    (void)hcontext;
    (void)pbatr;
    (void)rgquidinterfaces;
    (void)cguidinterfacecount;
    (void)mszcards;
    (void)pcchcards;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_credentials_SCardListInterfacesA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hcontext = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* szcard = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pguidinterfaces = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pcguidinterfaces = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SCardListInterfacesA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcontext, szcard, pguidinterfaces, pcguidinterfaces) : -1;
#else
    (void)hcontext;
    (void)szcard;
    (void)pguidinterfaces;
    (void)pcguidinterfaces;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_credentials_SCardListInterfacesW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hcontext = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* szcard = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pguidinterfaces = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pcguidinterfaces = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SCardListInterfacesW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcontext, szcard, pguidinterfaces, pcguidinterfaces) : -1;
#else
    (void)hcontext;
    (void)szcard;
    (void)pguidinterfaces;
    (void)pcguidinterfaces;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_credentials_SCardListReaderGroupsA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hcontext = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* mszgroups = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pcchgroups = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SCardListReaderGroupsA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcontext, mszgroups, pcchgroups) : -1;
#else
    (void)hcontext;
    (void)mszgroups;
    (void)pcchgroups;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_credentials_SCardListReaderGroupsW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hcontext = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* mszgroups = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pcchgroups = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SCardListReaderGroupsW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcontext, mszgroups, pcchgroups) : -1;
#else
    (void)hcontext;
    (void)mszgroups;
    (void)pcchgroups;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_credentials_SCardListReadersA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hcontext = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* mszgroups = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* mszreaders = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pcchreaders = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SCardListReadersA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcontext, mszgroups, mszreaders, pcchreaders) : -1;
#else
    (void)hcontext;
    (void)mszgroups;
    (void)mszreaders;
    (void)pcchreaders;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_credentials_SCardListReadersW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hcontext = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* mszgroups = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* mszreaders = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pcchreaders = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SCardListReadersW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcontext, mszgroups, mszreaders, pcchreaders) : -1;
#else
    (void)hcontext;
    (void)mszgroups;
    (void)mszreaders;
    (void)pcchreaders;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_credentials_SCardListReadersWithDeviceInstanceIdA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hcontext = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* szdeviceinstanceid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* mszreaders = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pcchreaders = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SCardListReadersWithDeviceInstanceIdA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcontext, szdeviceinstanceid, mszreaders, pcchreaders) : -1;
#else
    (void)hcontext;
    (void)szdeviceinstanceid;
    (void)mszreaders;
    (void)pcchreaders;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_credentials_SCardListReadersWithDeviceInstanceIdW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hcontext = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* szdeviceinstanceid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* mszreaders = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pcchreaders = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SCardListReadersWithDeviceInstanceIdW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcontext, szdeviceinstanceid, mszreaders, pcchreaders) : -1;
#else
    (void)hcontext;
    (void)szdeviceinstanceid;
    (void)mszreaders;
    (void)pcchreaders;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_credentials_SCardLocateCardsA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hcontext = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* mszcards = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* rgreaderstates = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t creaders = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SCardLocateCardsA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcontext, mszcards, rgreaderstates, creaders) : -1;
#else
    (void)hcontext;
    (void)mszcards;
    (void)rgreaderstates;
    (void)creaders;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_credentials_SCardLocateCardsByATRA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hcontext = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* rgatrmasks = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t catrs = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* rgreaderstates = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t creaders = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SCardLocateCardsByATRA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcontext, rgatrmasks, catrs, rgreaderstates, creaders) : -1;
#else
    (void)hcontext;
    (void)rgatrmasks;
    (void)catrs;
    (void)rgreaderstates;
    (void)creaders;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_credentials_SCardLocateCardsByATRW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hcontext = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* rgatrmasks = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t catrs = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* rgreaderstates = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t creaders = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SCardLocateCardsByATRW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcontext, rgatrmasks, catrs, rgreaderstates, creaders) : -1;
#else
    (void)hcontext;
    (void)rgatrmasks;
    (void)catrs;
    (void)rgreaderstates;
    (void)creaders;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_credentials_SCardLocateCardsW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hcontext = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* mszcards = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* rgreaderstates = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t creaders = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SCardLocateCardsW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcontext, mszcards, rgreaderstates, creaders) : -1;
#else
    (void)hcontext;
    (void)mszcards;
    (void)rgreaderstates;
    (void)creaders;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_credentials_SCardReadCacheA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hcontext = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* cardidentifier = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t freshnesscounter = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* lookupname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* data = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* datalen = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SCardReadCacheA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcontext, cardidentifier, freshnesscounter, lookupname, data, datalen) : -1;
#else
    (void)hcontext;
    (void)cardidentifier;
    (void)freshnesscounter;
    (void)lookupname;
    (void)data;
    (void)datalen;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_credentials_SCardReadCacheW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hcontext = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* cardidentifier = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t freshnesscounter = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* lookupname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* data = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* datalen = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SCardReadCacheW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcontext, cardidentifier, freshnesscounter, lookupname, data, datalen) : -1;
#else
    (void)hcontext;
    (void)cardidentifier;
    (void)freshnesscounter;
    (void)lookupname;
    (void)data;
    (void)datalen;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_credentials_SCardReconnect_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hcard = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint32_t dwsharemode = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t dwpreferredprotocols = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t dwinitialization = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* pdwactiveprotocol = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SCardReconnect")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcard, dwsharemode, dwpreferredprotocols, dwinitialization, pdwactiveprotocol) : -1;
#else
    (void)hcard;
    (void)dwsharemode;
    (void)dwpreferredprotocols;
    (void)dwinitialization;
    (void)pdwactiveprotocol;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_credentials_SCardReleaseContext_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hcontext = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SCardReleaseContext")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcontext) : -1;
#else
    (void)hcontext;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_credentials_SCardReleaseStartedEvent_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SCardReleaseStartedEvent")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr();
#else
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_security_credentials_SCardRemoveReaderFromGroupA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hcontext = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* szreadername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* szgroupname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SCardRemoveReaderFromGroupA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcontext, szreadername, szgroupname) : -1;
#else
    (void)hcontext;
    (void)szreadername;
    (void)szgroupname;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_credentials_SCardRemoveReaderFromGroupW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hcontext = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* szreadername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* szgroupname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SCardRemoveReaderFromGroupW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcontext, szreadername, szgroupname) : -1;
#else
    (void)hcontext;
    (void)szreadername;
    (void)szgroupname;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_credentials_SCardSetAttrib_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hcard = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint32_t dwattrid = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pbattr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t cbattrlen = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SCardSetAttrib")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcard, dwattrid, pbattr, cbattrlen) : -1;
#else
    (void)hcard;
    (void)dwattrid;
    (void)pbattr;
    (void)cbattrlen;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_credentials_SCardSetCardTypeProviderNameA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hcontext = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* szcardname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwproviderid = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* szprovider = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SCardSetCardTypeProviderNameA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcontext, szcardname, dwproviderid, szprovider) : -1;
#else
    (void)hcontext;
    (void)szcardname;
    (void)dwproviderid;
    (void)szprovider;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_credentials_SCardSetCardTypeProviderNameW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hcontext = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* szcardname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwproviderid = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* szprovider = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SCardSetCardTypeProviderNameW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcontext, szcardname, dwproviderid, szprovider) : -1;
#else
    (void)hcontext;
    (void)szcardname;
    (void)dwproviderid;
    (void)szprovider;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_credentials_SCardState_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hcard = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* pdwstate = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pdwprotocol = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pbatr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pcbatrlen = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SCardState")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcard, pdwstate, pdwprotocol, pbatr, pcbatrlen) : -1;
#else
    (void)hcard;
    (void)pdwstate;
    (void)pdwprotocol;
    (void)pbatr;
    (void)pcbatrlen;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_credentials_SCardStatusA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hcard = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* mszreadernames = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pcchreaderlen = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pdwstate = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pdwprotocol = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* pbatr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* pcbatrlen = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SCardStatusA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcard, mszreadernames, pcchreaderlen, pdwstate, pdwprotocol, pbatr, pcbatrlen) : -1;
#else
    (void)hcard;
    (void)mszreadernames;
    (void)pcchreaderlen;
    (void)pdwstate;
    (void)pdwprotocol;
    (void)pbatr;
    (void)pcbatrlen;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_credentials_SCardStatusW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hcard = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* mszreadernames = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pcchreaderlen = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pdwstate = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pdwprotocol = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* pbatr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* pcbatrlen = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SCardStatusW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcard, mszreadernames, pcchreaderlen, pdwstate, pdwprotocol, pbatr, pcbatrlen) : -1;
#else
    (void)hcard;
    (void)mszreadernames;
    (void)pcchreaderlen;
    (void)pdwstate;
    (void)pdwprotocol;
    (void)pbatr;
    (void)pcbatrlen;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_credentials_SCardTransmit_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hcard = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* piosendpci = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pbsendbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t cbsendlength = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* piorecvpci = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* pbrecvbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* pcbrecvlength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SCardTransmit")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcard, piosendpci, pbsendbuffer, cbsendlength, piorecvpci, pbrecvbuffer, pcbrecvlength) : -1;
#else
    (void)hcard;
    (void)piosendpci;
    (void)pbsendbuffer;
    (void)cbsendlength;
    (void)piorecvpci;
    (void)pbrecvbuffer;
    (void)pcbrecvlength;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_credentials_SCardUIDlgSelectCardA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* param0 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("scarddlg.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SCardUIDlgSelectCardA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(param0) : -1;
#else
    (void)param0;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_credentials_SCardUIDlgSelectCardW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* param0 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("scarddlg.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SCardUIDlgSelectCardW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(param0) : -1;
#else
    (void)param0;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_credentials_SCardWriteCacheA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hcontext = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* cardidentifier = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t freshnesscounter = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* lookupname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* data = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t datalen = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SCardWriteCacheA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcontext, cardidentifier, freshnesscounter, lookupname, data, datalen) : -1;
#else
    (void)hcontext;
    (void)cardidentifier;
    (void)freshnesscounter;
    (void)lookupname;
    (void)data;
    (void)datalen;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_credentials_SCardWriteCacheW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hcontext = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* cardidentifier = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t freshnesscounter = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* lookupname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* data = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t datalen = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SCardWriteCacheW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcontext, cardidentifier, freshnesscounter, lookupname, data, datalen) : -1;
#else
    (void)hcontext;
    (void)cardidentifier;
    (void)freshnesscounter;
    (void)lookupname;
    (void)data;
    (void)datalen;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static void register_windows_win32_security_credentials_napi(Napi::Env env, Napi::Object exports) {
    exports.Set("windowssys_windows_win32_security_credentials_CredDeleteA", Napi::Function::New(env, windowssys_windows_win32_security_credentials_CredDeleteA_napi));
    exports.Set("windowssys_windows_win32_security_credentials_CredDeleteW", Napi::Function::New(env, windowssys_windows_win32_security_credentials_CredDeleteW_napi));
    exports.Set("windowssys_windows_win32_security_credentials_CredEnumerateA", Napi::Function::New(env, windowssys_windows_win32_security_credentials_CredEnumerateA_napi));
    exports.Set("windowssys_windows_win32_security_credentials_CredEnumerateW", Napi::Function::New(env, windowssys_windows_win32_security_credentials_CredEnumerateW_napi));
    exports.Set("windowssys_windows_win32_security_credentials_CredFindBestCredentialA", Napi::Function::New(env, windowssys_windows_win32_security_credentials_CredFindBestCredentialA_napi));
    exports.Set("windowssys_windows_win32_security_credentials_CredFindBestCredentialW", Napi::Function::New(env, windowssys_windows_win32_security_credentials_CredFindBestCredentialW_napi));
    exports.Set("windowssys_windows_win32_security_credentials_CredFree", Napi::Function::New(env, windowssys_windows_win32_security_credentials_CredFree_napi));
    exports.Set("windowssys_windows_win32_security_credentials_CredGetSessionTypes", Napi::Function::New(env, windowssys_windows_win32_security_credentials_CredGetSessionTypes_napi));
    exports.Set("windowssys_windows_win32_security_credentials_CredGetTargetInfoA", Napi::Function::New(env, windowssys_windows_win32_security_credentials_CredGetTargetInfoA_napi));
    exports.Set("windowssys_windows_win32_security_credentials_CredGetTargetInfoW", Napi::Function::New(env, windowssys_windows_win32_security_credentials_CredGetTargetInfoW_napi));
    exports.Set("windowssys_windows_win32_security_credentials_CredIsMarshaledCredentialA", Napi::Function::New(env, windowssys_windows_win32_security_credentials_CredIsMarshaledCredentialA_napi));
    exports.Set("windowssys_windows_win32_security_credentials_CredIsMarshaledCredentialW", Napi::Function::New(env, windowssys_windows_win32_security_credentials_CredIsMarshaledCredentialW_napi));
    exports.Set("windowssys_windows_win32_security_credentials_CredIsProtectedA", Napi::Function::New(env, windowssys_windows_win32_security_credentials_CredIsProtectedA_napi));
    exports.Set("windowssys_windows_win32_security_credentials_CredIsProtectedW", Napi::Function::New(env, windowssys_windows_win32_security_credentials_CredIsProtectedW_napi));
    exports.Set("windowssys_windows_win32_security_credentials_CredMarshalCredentialA", Napi::Function::New(env, windowssys_windows_win32_security_credentials_CredMarshalCredentialA_napi));
    exports.Set("windowssys_windows_win32_security_credentials_CredMarshalCredentialW", Napi::Function::New(env, windowssys_windows_win32_security_credentials_CredMarshalCredentialW_napi));
    exports.Set("windowssys_windows_win32_security_credentials_CredPackAuthenticationBufferA", Napi::Function::New(env, windowssys_windows_win32_security_credentials_CredPackAuthenticationBufferA_napi));
    exports.Set("windowssys_windows_win32_security_credentials_CredPackAuthenticationBufferW", Napi::Function::New(env, windowssys_windows_win32_security_credentials_CredPackAuthenticationBufferW_napi));
    exports.Set("windowssys_windows_win32_security_credentials_CredProtectA", Napi::Function::New(env, windowssys_windows_win32_security_credentials_CredProtectA_napi));
    exports.Set("windowssys_windows_win32_security_credentials_CredProtectW", Napi::Function::New(env, windowssys_windows_win32_security_credentials_CredProtectW_napi));
    exports.Set("windowssys_windows_win32_security_credentials_CredReadA", Napi::Function::New(env, windowssys_windows_win32_security_credentials_CredReadA_napi));
    exports.Set("windowssys_windows_win32_security_credentials_CredReadDomainCredentialsA", Napi::Function::New(env, windowssys_windows_win32_security_credentials_CredReadDomainCredentialsA_napi));
    exports.Set("windowssys_windows_win32_security_credentials_CredReadDomainCredentialsW", Napi::Function::New(env, windowssys_windows_win32_security_credentials_CredReadDomainCredentialsW_napi));
    exports.Set("windowssys_windows_win32_security_credentials_CredReadW", Napi::Function::New(env, windowssys_windows_win32_security_credentials_CredReadW_napi));
    exports.Set("windowssys_windows_win32_security_credentials_CredRenameA", Napi::Function::New(env, windowssys_windows_win32_security_credentials_CredRenameA_napi));
    exports.Set("windowssys_windows_win32_security_credentials_CredRenameW", Napi::Function::New(env, windowssys_windows_win32_security_credentials_CredRenameW_napi));
    exports.Set("windowssys_windows_win32_security_credentials_CredUICmdLinePromptForCredentialsA", Napi::Function::New(env, windowssys_windows_win32_security_credentials_CredUICmdLinePromptForCredentialsA_napi));
    exports.Set("windowssys_windows_win32_security_credentials_CredUICmdLinePromptForCredentialsW", Napi::Function::New(env, windowssys_windows_win32_security_credentials_CredUICmdLinePromptForCredentialsW_napi));
    exports.Set("windowssys_windows_win32_security_credentials_CredUIConfirmCredentialsA", Napi::Function::New(env, windowssys_windows_win32_security_credentials_CredUIConfirmCredentialsA_napi));
    exports.Set("windowssys_windows_win32_security_credentials_CredUIConfirmCredentialsW", Napi::Function::New(env, windowssys_windows_win32_security_credentials_CredUIConfirmCredentialsW_napi));
    exports.Set("windowssys_windows_win32_security_credentials_CredUIParseUserNameA", Napi::Function::New(env, windowssys_windows_win32_security_credentials_CredUIParseUserNameA_napi));
    exports.Set("windowssys_windows_win32_security_credentials_CredUIParseUserNameW", Napi::Function::New(env, windowssys_windows_win32_security_credentials_CredUIParseUserNameW_napi));
    exports.Set("windowssys_windows_win32_security_credentials_CredUIPromptForCredentialsA", Napi::Function::New(env, windowssys_windows_win32_security_credentials_CredUIPromptForCredentialsA_napi));
    exports.Set("windowssys_windows_win32_security_credentials_CredUIPromptForCredentialsW", Napi::Function::New(env, windowssys_windows_win32_security_credentials_CredUIPromptForCredentialsW_napi));
    exports.Set("windowssys_windows_win32_security_credentials_CredUIPromptForWindowsCredentialsA", Napi::Function::New(env, windowssys_windows_win32_security_credentials_CredUIPromptForWindowsCredentialsA_napi));
    exports.Set("windowssys_windows_win32_security_credentials_CredUIPromptForWindowsCredentialsW", Napi::Function::New(env, windowssys_windows_win32_security_credentials_CredUIPromptForWindowsCredentialsW_napi));
    exports.Set("windowssys_windows_win32_security_credentials_CredUIReadSSOCredW", Napi::Function::New(env, windowssys_windows_win32_security_credentials_CredUIReadSSOCredW_napi));
    exports.Set("windowssys_windows_win32_security_credentials_CredUIStoreSSOCredW", Napi::Function::New(env, windowssys_windows_win32_security_credentials_CredUIStoreSSOCredW_napi));
    exports.Set("windowssys_windows_win32_security_credentials_CredUnPackAuthenticationBufferA", Napi::Function::New(env, windowssys_windows_win32_security_credentials_CredUnPackAuthenticationBufferA_napi));
    exports.Set("windowssys_windows_win32_security_credentials_CredUnPackAuthenticationBufferW", Napi::Function::New(env, windowssys_windows_win32_security_credentials_CredUnPackAuthenticationBufferW_napi));
    exports.Set("windowssys_windows_win32_security_credentials_CredUnmarshalCredentialA", Napi::Function::New(env, windowssys_windows_win32_security_credentials_CredUnmarshalCredentialA_napi));
    exports.Set("windowssys_windows_win32_security_credentials_CredUnmarshalCredentialW", Napi::Function::New(env, windowssys_windows_win32_security_credentials_CredUnmarshalCredentialW_napi));
    exports.Set("windowssys_windows_win32_security_credentials_CredUnprotectA", Napi::Function::New(env, windowssys_windows_win32_security_credentials_CredUnprotectA_napi));
    exports.Set("windowssys_windows_win32_security_credentials_CredUnprotectW", Napi::Function::New(env, windowssys_windows_win32_security_credentials_CredUnprotectW_napi));
    exports.Set("windowssys_windows_win32_security_credentials_CredWriteA", Napi::Function::New(env, windowssys_windows_win32_security_credentials_CredWriteA_napi));
    exports.Set("windowssys_windows_win32_security_credentials_CredWriteDomainCredentialsA", Napi::Function::New(env, windowssys_windows_win32_security_credentials_CredWriteDomainCredentialsA_napi));
    exports.Set("windowssys_windows_win32_security_credentials_CredWriteDomainCredentialsW", Napi::Function::New(env, windowssys_windows_win32_security_credentials_CredWriteDomainCredentialsW_napi));
    exports.Set("windowssys_windows_win32_security_credentials_CredWriteW", Napi::Function::New(env, windowssys_windows_win32_security_credentials_CredWriteW_napi));
    exports.Set("windowssys_windows_win32_security_credentials_GetOpenCardNameA", Napi::Function::New(env, windowssys_windows_win32_security_credentials_GetOpenCardNameA_napi));
    exports.Set("windowssys_windows_win32_security_credentials_GetOpenCardNameW", Napi::Function::New(env, windowssys_windows_win32_security_credentials_GetOpenCardNameW_napi));
    exports.Set("windowssys_windows_win32_security_credentials_KeyCredentialManagerFreeInformation", Napi::Function::New(env, windowssys_windows_win32_security_credentials_KeyCredentialManagerFreeInformation_napi));
    exports.Set("windowssys_windows_win32_security_credentials_KeyCredentialManagerGetInformation", Napi::Function::New(env, windowssys_windows_win32_security_credentials_KeyCredentialManagerGetInformation_napi));
    exports.Set("windowssys_windows_win32_security_credentials_KeyCredentialManagerGetOperationErrorStates", Napi::Function::New(env, windowssys_windows_win32_security_credentials_KeyCredentialManagerGetOperationErrorStates_napi));
    exports.Set("windowssys_windows_win32_security_credentials_KeyCredentialManagerShowUIOperation", Napi::Function::New(env, windowssys_windows_win32_security_credentials_KeyCredentialManagerShowUIOperation_napi));
    exports.Set("windowssys_windows_win32_security_credentials_SCardAccessStartedEvent", Napi::Function::New(env, windowssys_windows_win32_security_credentials_SCardAccessStartedEvent_napi));
    exports.Set("windowssys_windows_win32_security_credentials_SCardAddReaderToGroupA", Napi::Function::New(env, windowssys_windows_win32_security_credentials_SCardAddReaderToGroupA_napi));
    exports.Set("windowssys_windows_win32_security_credentials_SCardAddReaderToGroupW", Napi::Function::New(env, windowssys_windows_win32_security_credentials_SCardAddReaderToGroupW_napi));
    exports.Set("windowssys_windows_win32_security_credentials_SCardAudit", Napi::Function::New(env, windowssys_windows_win32_security_credentials_SCardAudit_napi));
    exports.Set("windowssys_windows_win32_security_credentials_SCardBeginTransaction", Napi::Function::New(env, windowssys_windows_win32_security_credentials_SCardBeginTransaction_napi));
    exports.Set("windowssys_windows_win32_security_credentials_SCardCancel", Napi::Function::New(env, windowssys_windows_win32_security_credentials_SCardCancel_napi));
    exports.Set("windowssys_windows_win32_security_credentials_SCardConnectA", Napi::Function::New(env, windowssys_windows_win32_security_credentials_SCardConnectA_napi));
    exports.Set("windowssys_windows_win32_security_credentials_SCardConnectW", Napi::Function::New(env, windowssys_windows_win32_security_credentials_SCardConnectW_napi));
    exports.Set("windowssys_windows_win32_security_credentials_SCardControl", Napi::Function::New(env, windowssys_windows_win32_security_credentials_SCardControl_napi));
    exports.Set("windowssys_windows_win32_security_credentials_SCardDisconnect", Napi::Function::New(env, windowssys_windows_win32_security_credentials_SCardDisconnect_napi));
    exports.Set("windowssys_windows_win32_security_credentials_SCardDlgExtendedError", Napi::Function::New(env, windowssys_windows_win32_security_credentials_SCardDlgExtendedError_napi));
    exports.Set("windowssys_windows_win32_security_credentials_SCardEndTransaction", Napi::Function::New(env, windowssys_windows_win32_security_credentials_SCardEndTransaction_napi));
    exports.Set("windowssys_windows_win32_security_credentials_SCardEstablishContext", Napi::Function::New(env, windowssys_windows_win32_security_credentials_SCardEstablishContext_napi));
    exports.Set("windowssys_windows_win32_security_credentials_SCardForgetCardTypeA", Napi::Function::New(env, windowssys_windows_win32_security_credentials_SCardForgetCardTypeA_napi));
    exports.Set("windowssys_windows_win32_security_credentials_SCardForgetCardTypeW", Napi::Function::New(env, windowssys_windows_win32_security_credentials_SCardForgetCardTypeW_napi));
    exports.Set("windowssys_windows_win32_security_credentials_SCardForgetReaderA", Napi::Function::New(env, windowssys_windows_win32_security_credentials_SCardForgetReaderA_napi));
    exports.Set("windowssys_windows_win32_security_credentials_SCardForgetReaderGroupA", Napi::Function::New(env, windowssys_windows_win32_security_credentials_SCardForgetReaderGroupA_napi));
    exports.Set("windowssys_windows_win32_security_credentials_SCardForgetReaderGroupW", Napi::Function::New(env, windowssys_windows_win32_security_credentials_SCardForgetReaderGroupW_napi));
    exports.Set("windowssys_windows_win32_security_credentials_SCardForgetReaderW", Napi::Function::New(env, windowssys_windows_win32_security_credentials_SCardForgetReaderW_napi));
    exports.Set("windowssys_windows_win32_security_credentials_SCardFreeMemory", Napi::Function::New(env, windowssys_windows_win32_security_credentials_SCardFreeMemory_napi));
    exports.Set("windowssys_windows_win32_security_credentials_SCardGetAttrib", Napi::Function::New(env, windowssys_windows_win32_security_credentials_SCardGetAttrib_napi));
    exports.Set("windowssys_windows_win32_security_credentials_SCardGetCardTypeProviderNameA", Napi::Function::New(env, windowssys_windows_win32_security_credentials_SCardGetCardTypeProviderNameA_napi));
    exports.Set("windowssys_windows_win32_security_credentials_SCardGetCardTypeProviderNameW", Napi::Function::New(env, windowssys_windows_win32_security_credentials_SCardGetCardTypeProviderNameW_napi));
    exports.Set("windowssys_windows_win32_security_credentials_SCardGetDeviceTypeIdA", Napi::Function::New(env, windowssys_windows_win32_security_credentials_SCardGetDeviceTypeIdA_napi));
    exports.Set("windowssys_windows_win32_security_credentials_SCardGetDeviceTypeIdW", Napi::Function::New(env, windowssys_windows_win32_security_credentials_SCardGetDeviceTypeIdW_napi));
    exports.Set("windowssys_windows_win32_security_credentials_SCardGetProviderIdA", Napi::Function::New(env, windowssys_windows_win32_security_credentials_SCardGetProviderIdA_napi));
    exports.Set("windowssys_windows_win32_security_credentials_SCardGetProviderIdW", Napi::Function::New(env, windowssys_windows_win32_security_credentials_SCardGetProviderIdW_napi));
    exports.Set("windowssys_windows_win32_security_credentials_SCardGetReaderDeviceInstanceIdA", Napi::Function::New(env, windowssys_windows_win32_security_credentials_SCardGetReaderDeviceInstanceIdA_napi));
    exports.Set("windowssys_windows_win32_security_credentials_SCardGetReaderDeviceInstanceIdW", Napi::Function::New(env, windowssys_windows_win32_security_credentials_SCardGetReaderDeviceInstanceIdW_napi));
    exports.Set("windowssys_windows_win32_security_credentials_SCardGetReaderIconA", Napi::Function::New(env, windowssys_windows_win32_security_credentials_SCardGetReaderIconA_napi));
    exports.Set("windowssys_windows_win32_security_credentials_SCardGetReaderIconW", Napi::Function::New(env, windowssys_windows_win32_security_credentials_SCardGetReaderIconW_napi));
    exports.Set("windowssys_windows_win32_security_credentials_SCardGetStatusChangeA", Napi::Function::New(env, windowssys_windows_win32_security_credentials_SCardGetStatusChangeA_napi));
    exports.Set("windowssys_windows_win32_security_credentials_SCardGetStatusChangeW", Napi::Function::New(env, windowssys_windows_win32_security_credentials_SCardGetStatusChangeW_napi));
    exports.Set("windowssys_windows_win32_security_credentials_SCardGetTransmitCount", Napi::Function::New(env, windowssys_windows_win32_security_credentials_SCardGetTransmitCount_napi));
    exports.Set("windowssys_windows_win32_security_credentials_SCardIntroduceCardTypeA", Napi::Function::New(env, windowssys_windows_win32_security_credentials_SCardIntroduceCardTypeA_napi));
    exports.Set("windowssys_windows_win32_security_credentials_SCardIntroduceCardTypeW", Napi::Function::New(env, windowssys_windows_win32_security_credentials_SCardIntroduceCardTypeW_napi));
    exports.Set("windowssys_windows_win32_security_credentials_SCardIntroduceReaderA", Napi::Function::New(env, windowssys_windows_win32_security_credentials_SCardIntroduceReaderA_napi));
    exports.Set("windowssys_windows_win32_security_credentials_SCardIntroduceReaderGroupA", Napi::Function::New(env, windowssys_windows_win32_security_credentials_SCardIntroduceReaderGroupA_napi));
    exports.Set("windowssys_windows_win32_security_credentials_SCardIntroduceReaderGroupW", Napi::Function::New(env, windowssys_windows_win32_security_credentials_SCardIntroduceReaderGroupW_napi));
    exports.Set("windowssys_windows_win32_security_credentials_SCardIntroduceReaderW", Napi::Function::New(env, windowssys_windows_win32_security_credentials_SCardIntroduceReaderW_napi));
    exports.Set("windowssys_windows_win32_security_credentials_SCardIsValidContext", Napi::Function::New(env, windowssys_windows_win32_security_credentials_SCardIsValidContext_napi));
    exports.Set("windowssys_windows_win32_security_credentials_SCardListCardsA", Napi::Function::New(env, windowssys_windows_win32_security_credentials_SCardListCardsA_napi));
    exports.Set("windowssys_windows_win32_security_credentials_SCardListCardsW", Napi::Function::New(env, windowssys_windows_win32_security_credentials_SCardListCardsW_napi));
    exports.Set("windowssys_windows_win32_security_credentials_SCardListInterfacesA", Napi::Function::New(env, windowssys_windows_win32_security_credentials_SCardListInterfacesA_napi));
    exports.Set("windowssys_windows_win32_security_credentials_SCardListInterfacesW", Napi::Function::New(env, windowssys_windows_win32_security_credentials_SCardListInterfacesW_napi));
    exports.Set("windowssys_windows_win32_security_credentials_SCardListReaderGroupsA", Napi::Function::New(env, windowssys_windows_win32_security_credentials_SCardListReaderGroupsA_napi));
    exports.Set("windowssys_windows_win32_security_credentials_SCardListReaderGroupsW", Napi::Function::New(env, windowssys_windows_win32_security_credentials_SCardListReaderGroupsW_napi));
    exports.Set("windowssys_windows_win32_security_credentials_SCardListReadersA", Napi::Function::New(env, windowssys_windows_win32_security_credentials_SCardListReadersA_napi));
    exports.Set("windowssys_windows_win32_security_credentials_SCardListReadersW", Napi::Function::New(env, windowssys_windows_win32_security_credentials_SCardListReadersW_napi));
    exports.Set("windowssys_windows_win32_security_credentials_SCardListReadersWithDeviceInstanceIdA", Napi::Function::New(env, windowssys_windows_win32_security_credentials_SCardListReadersWithDeviceInstanceIdA_napi));
    exports.Set("windowssys_windows_win32_security_credentials_SCardListReadersWithDeviceInstanceIdW", Napi::Function::New(env, windowssys_windows_win32_security_credentials_SCardListReadersWithDeviceInstanceIdW_napi));
    exports.Set("windowssys_windows_win32_security_credentials_SCardLocateCardsA", Napi::Function::New(env, windowssys_windows_win32_security_credentials_SCardLocateCardsA_napi));
    exports.Set("windowssys_windows_win32_security_credentials_SCardLocateCardsByATRA", Napi::Function::New(env, windowssys_windows_win32_security_credentials_SCardLocateCardsByATRA_napi));
    exports.Set("windowssys_windows_win32_security_credentials_SCardLocateCardsByATRW", Napi::Function::New(env, windowssys_windows_win32_security_credentials_SCardLocateCardsByATRW_napi));
    exports.Set("windowssys_windows_win32_security_credentials_SCardLocateCardsW", Napi::Function::New(env, windowssys_windows_win32_security_credentials_SCardLocateCardsW_napi));
    exports.Set("windowssys_windows_win32_security_credentials_SCardReadCacheA", Napi::Function::New(env, windowssys_windows_win32_security_credentials_SCardReadCacheA_napi));
    exports.Set("windowssys_windows_win32_security_credentials_SCardReadCacheW", Napi::Function::New(env, windowssys_windows_win32_security_credentials_SCardReadCacheW_napi));
    exports.Set("windowssys_windows_win32_security_credentials_SCardReconnect", Napi::Function::New(env, windowssys_windows_win32_security_credentials_SCardReconnect_napi));
    exports.Set("windowssys_windows_win32_security_credentials_SCardReleaseContext", Napi::Function::New(env, windowssys_windows_win32_security_credentials_SCardReleaseContext_napi));
    exports.Set("windowssys_windows_win32_security_credentials_SCardReleaseStartedEvent", Napi::Function::New(env, windowssys_windows_win32_security_credentials_SCardReleaseStartedEvent_napi));
    exports.Set("windowssys_windows_win32_security_credentials_SCardRemoveReaderFromGroupA", Napi::Function::New(env, windowssys_windows_win32_security_credentials_SCardRemoveReaderFromGroupA_napi));
    exports.Set("windowssys_windows_win32_security_credentials_SCardRemoveReaderFromGroupW", Napi::Function::New(env, windowssys_windows_win32_security_credentials_SCardRemoveReaderFromGroupW_napi));
    exports.Set("windowssys_windows_win32_security_credentials_SCardSetAttrib", Napi::Function::New(env, windowssys_windows_win32_security_credentials_SCardSetAttrib_napi));
    exports.Set("windowssys_windows_win32_security_credentials_SCardSetCardTypeProviderNameA", Napi::Function::New(env, windowssys_windows_win32_security_credentials_SCardSetCardTypeProviderNameA_napi));
    exports.Set("windowssys_windows_win32_security_credentials_SCardSetCardTypeProviderNameW", Napi::Function::New(env, windowssys_windows_win32_security_credentials_SCardSetCardTypeProviderNameW_napi));
    exports.Set("windowssys_windows_win32_security_credentials_SCardState", Napi::Function::New(env, windowssys_windows_win32_security_credentials_SCardState_napi));
    exports.Set("windowssys_windows_win32_security_credentials_SCardStatusA", Napi::Function::New(env, windowssys_windows_win32_security_credentials_SCardStatusA_napi));
    exports.Set("windowssys_windows_win32_security_credentials_SCardStatusW", Napi::Function::New(env, windowssys_windows_win32_security_credentials_SCardStatusW_napi));
    exports.Set("windowssys_windows_win32_security_credentials_SCardTransmit", Napi::Function::New(env, windowssys_windows_win32_security_credentials_SCardTransmit_napi));
    exports.Set("windowssys_windows_win32_security_credentials_SCardUIDlgSelectCardA", Napi::Function::New(env, windowssys_windows_win32_security_credentials_SCardUIDlgSelectCardA_napi));
    exports.Set("windowssys_windows_win32_security_credentials_SCardUIDlgSelectCardW", Napi::Function::New(env, windowssys_windows_win32_security_credentials_SCardUIDlgSelectCardW_napi));
    exports.Set("windowssys_windows_win32_security_credentials_SCardWriteCacheA", Napi::Function::New(env, windowssys_windows_win32_security_credentials_SCardWriteCacheA_napi));
    exports.Set("windowssys_windows_win32_security_credentials_SCardWriteCacheW", Napi::Function::New(env, windowssys_windows_win32_security_credentials_SCardWriteCacheW_napi));
}

static KmNapiRegistrarNode registrar_node = { &register_windows_win32_security_credentials_napi, nullptr };
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
