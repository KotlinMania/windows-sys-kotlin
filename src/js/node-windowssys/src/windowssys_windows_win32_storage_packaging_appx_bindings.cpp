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

static Napi::Value windowssys_windows_win32_storage_packaging_appx_ActivatePackageVirtualizationContext_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* context = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* cookie = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ActivatePackageVirtualizationContext")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(context, cookie) : -1;
#else
    (void)context;
    (void)cookie;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_packaging_appx_AddPackageDependency_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* packagedependencyid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t rank = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t options = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* packagedependencycontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* packagefullname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernelbase.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "AddPackageDependency")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(packagedependencyid, rank, options, packagedependencycontext, packagefullname) : -1;
#else
    (void)packagedependencyid;
    (void)rank;
    (void)options;
    (void)packagedependencycontext;
    (void)packagefullname;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_packaging_appx_AppPolicyGetClrCompat_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* processtoken = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* policy = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "AppPolicyGetClrCompat")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(processtoken, policy) : 0;
#else
    (void)processtoken;
    (void)policy;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_packaging_appx_AppPolicyGetCreateFileAccess_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* processtoken = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* policy = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "AppPolicyGetCreateFileAccess")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(processtoken, policy) : 0;
#else
    (void)processtoken;
    (void)policy;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_packaging_appx_AppPolicyGetLifecycleManagement_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* processtoken = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* policy = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "AppPolicyGetLifecycleManagement")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(processtoken, policy) : 0;
#else
    (void)processtoken;
    (void)policy;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_packaging_appx_AppPolicyGetMediaFoundationCodecLoading_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* processtoken = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* policy = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "AppPolicyGetMediaFoundationCodecLoading")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(processtoken, policy) : 0;
#else
    (void)processtoken;
    (void)policy;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_packaging_appx_AppPolicyGetProcessTerminationMethod_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* processtoken = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* policy = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "AppPolicyGetProcessTerminationMethod")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(processtoken, policy) : 0;
#else
    (void)processtoken;
    (void)policy;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_packaging_appx_AppPolicyGetShowDeveloperDiagnostic_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* processtoken = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* policy = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "AppPolicyGetShowDeveloperDiagnostic")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(processtoken, policy) : 0;
#else
    (void)processtoken;
    (void)policy;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_packaging_appx_AppPolicyGetThreadInitializationType_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* processtoken = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* policy = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "AppPolicyGetThreadInitializationType")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(processtoken, policy) : 0;
#else
    (void)processtoken;
    (void)policy;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_packaging_appx_AppPolicyGetWindowingModel_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* processtoken = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* policy = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "AppPolicyGetWindowingModel")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(processtoken, policy) : 0;
#else
    (void)processtoken;
    (void)policy;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_packaging_appx_CheckIsMSIXPackage_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* packagefullname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ismsixpackage = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CheckIsMSIXPackage")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(packagefullname, ismsixpackage) : -1;
#else
    (void)packagefullname;
    (void)ismsixpackage;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_packaging_appx_ClosePackageInfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* packageinforeference = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ClosePackageInfo")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(packageinforeference) : 0;
#else
    (void)packageinforeference;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_packaging_appx_CreatePackageVirtualizationContext_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* packagefamilyname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* context = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CreatePackageVirtualizationContext")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(packagefamilyname, context) : -1;
#else
    (void)packagefamilyname;
    (void)context;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_packaging_appx_DeactivatePackageVirtualizationContext_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t cookie = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DeactivatePackageVirtualizationContext")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(cookie);
#else
    (void)cookie;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_storage_packaging_appx_DeletePackageDependency_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* packagedependencyid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernelbase.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DeletePackageDependency")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(packagedependencyid) : -1;
#else
    (void)packagedependencyid;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_packaging_appx_DuplicatePackageVirtualizationContext_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* sourcecontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* destcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DuplicatePackageVirtualizationContext")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sourcecontext, destcontext) : -1;
#else
    (void)sourcecontext;
    (void)destcontext;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_packaging_appx_FindPackagesByPackageFamily_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* packagefamilyname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t packagefilters = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* count = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* packagefullnames = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* bufferlength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* packageproperties = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FindPackagesByPackageFamily")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(packagefamilyname, packagefilters, count, packagefullnames, bufferlength, buffer, packageproperties) : 0;
#else
    (void)packagefamilyname;
    (void)packagefilters;
    (void)count;
    (void)packagefullnames;
    (void)bufferlength;
    (void)buffer;
    (void)packageproperties;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_packaging_appx_FormatApplicationUserModelId_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* packagefamilyname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* packagerelativeapplicationid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* applicationusermodelidlength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* applicationusermodelid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FormatApplicationUserModelId")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(packagefamilyname, packagerelativeapplicationid, applicationusermodelidlength, applicationusermodelid) : 0;
#else
    (void)packagefamilyname;
    (void)packagerelativeapplicationid;
    (void)applicationusermodelidlength;
    (void)applicationusermodelid;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_packaging_appx_GetApplicationUserModelId_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* applicationusermodelidlength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* applicationusermodelid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetApplicationUserModelId")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, applicationusermodelidlength, applicationusermodelid) : 0;
#else
    (void)hprocess;
    (void)applicationusermodelidlength;
    (void)applicationusermodelid;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_packaging_appx_GetApplicationUserModelIdFromToken_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* token = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* applicationusermodelidlength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* applicationusermodelid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-appmodel-runtime-l1-1-1.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetApplicationUserModelIdFromToken")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(token, applicationusermodelidlength, applicationusermodelid) : 0;
#else
    (void)token;
    (void)applicationusermodelidlength;
    (void)applicationusermodelid;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_packaging_appx_GetCurrentApplicationUserModelId_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* applicationusermodelidlength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* applicationusermodelid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetCurrentApplicationUserModelId")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(applicationusermodelidlength, applicationusermodelid) : 0;
#else
    (void)applicationusermodelidlength;
    (void)applicationusermodelid;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_packaging_appx_GetCurrentPackageFamilyName_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* packagefamilynamelength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* packagefamilyname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetCurrentPackageFamilyName")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(packagefamilynamelength, packagefamilyname) : 0;
#else
    (void)packagefamilynamelength;
    (void)packagefamilyname;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_packaging_appx_GetCurrentPackageFullName_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* packagefullnamelength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* packagefullname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetCurrentPackageFullName")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(packagefullnamelength, packagefullname) : 0;
#else
    (void)packagefullnamelength;
    (void)packagefullname;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_packaging_appx_GetCurrentPackageId_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* bufferlength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetCurrentPackageId")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(bufferlength, buffer) : 0;
#else
    (void)bufferlength;
    (void)buffer;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_packaging_appx_GetCurrentPackageInfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* bufferlength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* count = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetCurrentPackageInfo")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(flags, bufferlength, buffer, count) : 0;
#else
    (void)flags;
    (void)bufferlength;
    (void)buffer;
    (void)count;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_packaging_appx_GetCurrentPackageInfo2_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    int32_t packagepathtype = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* bufferlength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* count = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-appmodel-runtime-l1-1-3.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetCurrentPackageInfo2")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(flags, packagepathtype, bufferlength, buffer, count) : 0;
#else
    (void)flags;
    (void)packagepathtype;
    (void)bufferlength;
    (void)buffer;
    (void)count;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_packaging_appx_GetCurrentPackageInfo3_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    int32_t packageinfotype = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* bufferlength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* count = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetCurrentPackageInfo3")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(flags, packageinfotype, bufferlength, buffer, count) : -1;
#else
    (void)flags;
    (void)packageinfotype;
    (void)bufferlength;
    (void)buffer;
    (void)count;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_packaging_appx_GetCurrentPackagePath_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pathlength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* path = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetCurrentPackagePath")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pathlength, path) : 0;
#else
    (void)pathlength;
    (void)path;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_packaging_appx_GetCurrentPackagePath2_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t packagepathtype = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* pathlength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* path = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-appmodel-runtime-l1-1-3.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetCurrentPackagePath2")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(packagepathtype, pathlength, path) : 0;
#else
    (void)packagepathtype;
    (void)pathlength;
    (void)path;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_packaging_appx_GetCurrentPackageVirtualizationContext_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetCurrentPackageVirtualizationContext")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr() : NULL;
#else
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_storage_packaging_appx_GetIdForPackageDependencyContext_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* packagedependencycontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* packagedependencyid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernelbase.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetIdForPackageDependencyContext")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(packagedependencycontext, packagedependencyid) : -1;
#else
    (void)packagedependencycontext;
    (void)packagedependencyid;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_packaging_appx_GetPackageApplicationIds_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* packageinforeference = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* bufferlength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* count = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetPackageApplicationIds")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(packageinforeference, bufferlength, buffer, count) : 0;
#else
    (void)packageinforeference;
    (void)bufferlength;
    (void)buffer;
    (void)count;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_packaging_appx_GetPackageFamilyName_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* packagefamilynamelength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* packagefamilyname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetPackageFamilyName")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, packagefamilynamelength, packagefamilyname) : 0;
#else
    (void)hprocess;
    (void)packagefamilynamelength;
    (void)packagefamilyname;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_packaging_appx_GetPackageFamilyNameFromToken_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* token = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* packagefamilynamelength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* packagefamilyname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-appmodel-runtime-l1-1-1.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetPackageFamilyNameFromToken")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(token, packagefamilynamelength, packagefamilyname) : 0;
#else
    (void)token;
    (void)packagefamilynamelength;
    (void)packagefamilyname;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_packaging_appx_GetPackageFullName_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* packagefullnamelength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* packagefullname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetPackageFullName")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, packagefullnamelength, packagefullname) : 0;
#else
    (void)hprocess;
    (void)packagefullnamelength;
    (void)packagefullname;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_packaging_appx_GetPackageFullNameFromToken_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* token = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* packagefullnamelength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* packagefullname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-appmodel-runtime-l1-1-1.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetPackageFullNameFromToken")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(token, packagefullnamelength, packagefullname) : 0;
#else
    (void)token;
    (void)packagefullnamelength;
    (void)packagefullname;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_packaging_appx_GetPackageGraphRevisionId_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-appmodel-runtime-l1-1-6.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetPackageGraphRevisionId")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr() : 0;
#else
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_packaging_appx_GetPackageId_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* bufferlength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetPackageId")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, bufferlength, buffer) : 0;
#else
    (void)hprocess;
    (void)bufferlength;
    (void)buffer;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_packaging_appx_GetPackageInfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* packageinforeference = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* bufferlength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* count = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetPackageInfo")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(packageinforeference, flags, bufferlength, buffer, count) : 0;
#else
    (void)packageinforeference;
    (void)flags;
    (void)bufferlength;
    (void)buffer;
    (void)count;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_packaging_appx_GetPackageInfo2_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* packageinforeference = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t packagepathtype = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* bufferlength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* count = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-appmodel-runtime-l1-1-3.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetPackageInfo2")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(packageinforeference, flags, packagepathtype, bufferlength, buffer, count) : 0;
#else
    (void)packageinforeference;
    (void)flags;
    (void)packagepathtype;
    (void)bufferlength;
    (void)buffer;
    (void)count;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_packaging_appx_GetPackagePath_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* packageid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t reserved = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pathlength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* path = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetPackagePath")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(packageid, reserved, pathlength, path) : 0;
#else
    (void)packageid;
    (void)reserved;
    (void)pathlength;
    (void)path;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_packaging_appx_GetPackagePathByFullName_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* packagefullname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pathlength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* path = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetPackagePathByFullName")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(packagefullname, pathlength, path) : 0;
#else
    (void)packagefullname;
    (void)pathlength;
    (void)path;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_packaging_appx_GetPackagePathByFullName2_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* packagefullname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t packagepathtype = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pathlength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* path = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-appmodel-runtime-l1-1-3.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetPackagePathByFullName2")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(packagefullname, packagepathtype, pathlength, path) : 0;
#else
    (void)packagefullname;
    (void)packagepathtype;
    (void)pathlength;
    (void)path;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_packaging_appx_GetPackagesByPackageFamily_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* packagefamilyname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* count = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* packagefullnames = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* bufferlength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetPackagesByPackageFamily")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(packagefamilyname, count, packagefullnames, bufferlength, buffer) : 0;
#else
    (void)packagefamilyname;
    (void)count;
    (void)packagefullnames;
    (void)bufferlength;
    (void)buffer;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_packaging_appx_GetProcessesInVirtualizationContext_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* packagefamilyname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* count = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* processes = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetProcessesInVirtualizationContext")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(packagefamilyname, count, processes) : -1;
#else
    (void)packagefamilyname;
    (void)count;
    (void)processes;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_packaging_appx_GetResolvedPackageFullNameForPackageDependency_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* packagedependencyid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* packagefullname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernelbase.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetResolvedPackageFullNameForPackageDependency")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(packagedependencyid, packagefullname) : -1;
#else
    (void)packagedependencyid;
    (void)packagefullname;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_packaging_appx_GetStagedPackageOrigin_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* packagefullname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* origin = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-appmodel-runtime-l1-1-1.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetStagedPackageOrigin")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(packagefullname, origin) : 0;
#else
    (void)packagefullname;
    (void)origin;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_packaging_appx_GetStagedPackagePathByFullName_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* packagefullname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pathlength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* path = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetStagedPackagePathByFullName")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(packagefullname, pathlength, path) : 0;
#else
    (void)packagefullname;
    (void)pathlength;
    (void)path;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_packaging_appx_GetStagedPackagePathByFullName2_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* packagefullname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t packagepathtype = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pathlength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* path = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-appmodel-runtime-l1-1-3.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetStagedPackagePathByFullName2")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(packagefullname, packagepathtype, pathlength, path) : 0;
#else
    (void)packagefullname;
    (void)packagepathtype;
    (void)pathlength;
    (void)path;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_packaging_appx_OpenPackageInfoByFullName_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* packagefullname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t reserved = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* packageinforeference = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "OpenPackageInfoByFullName")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(packagefullname, reserved, packageinforeference) : 0;
#else
    (void)packagefullname;
    (void)reserved;
    (void)packageinforeference;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_packaging_appx_OpenPackageInfoByFullNameForUser_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* usersid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* packagefullname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t reserved = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* packageinforeference = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-appmodel-runtime-l1-1-1.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "OpenPackageInfoByFullNameForUser")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(usersid, packagefullname, reserved, packageinforeference) : 0;
#else
    (void)usersid;
    (void)packagefullname;
    (void)reserved;
    (void)packageinforeference;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_packaging_appx_PackageFamilyNameFromFullName_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* packagefullname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* packagefamilynamelength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* packagefamilyname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PackageFamilyNameFromFullName")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(packagefullname, packagefamilynamelength, packagefamilyname) : 0;
#else
    (void)packagefullname;
    (void)packagefamilynamelength;
    (void)packagefamilyname;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_packaging_appx_PackageFamilyNameFromId_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* packageid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* packagefamilynamelength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* packagefamilyname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PackageFamilyNameFromId")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(packageid, packagefamilynamelength, packagefamilyname) : 0;
#else
    (void)packageid;
    (void)packagefamilynamelength;
    (void)packagefamilyname;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_packaging_appx_PackageFullNameFromId_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* packageid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* packagefullnamelength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* packagefullname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PackageFullNameFromId")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(packageid, packagefullnamelength, packagefullname) : 0;
#else
    (void)packageid;
    (void)packagefullnamelength;
    (void)packagefullname;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_packaging_appx_PackageIdFromFullName_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* packagefullname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* bufferlength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PackageIdFromFullName")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(packagefullname, flags, bufferlength, buffer) : 0;
#else
    (void)packagefullname;
    (void)flags;
    (void)bufferlength;
    (void)buffer;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_packaging_appx_PackageNameAndPublisherIdFromFamilyName_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* packagefamilyname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* packagenamelength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* packagename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* packagepublisheridlength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* packagepublisherid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PackageNameAndPublisherIdFromFamilyName")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(packagefamilyname, packagenamelength, packagename, packagepublisheridlength, packagepublisherid) : 0;
#else
    (void)packagefamilyname;
    (void)packagenamelength;
    (void)packagename;
    (void)packagepublisheridlength;
    (void)packagepublisherid;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_packaging_appx_ParseApplicationUserModelId_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* applicationusermodelid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* packagefamilynamelength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* packagefamilyname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* packagerelativeapplicationidlength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* packagerelativeapplicationid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ParseApplicationUserModelId")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(applicationusermodelid, packagefamilynamelength, packagefamilyname, packagerelativeapplicationidlength, packagerelativeapplicationid) : 0;
#else
    (void)applicationusermodelid;
    (void)packagefamilynamelength;
    (void)packagefamilyname;
    (void)packagerelativeapplicationidlength;
    (void)packagerelativeapplicationid;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_packaging_appx_ReleasePackageVirtualizationContext_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* context = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ReleasePackageVirtualizationContext")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(context);
#else
    (void)context;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_storage_packaging_appx_RemovePackageDependency_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* packagedependencycontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernelbase.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RemovePackageDependency")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(packagedependencycontext) : -1;
#else
    (void)packagedependencycontext;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_packaging_appx_VerifyApplicationUserModelId_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* applicationusermodelid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-appmodel-runtime-l1-1-1.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "VerifyApplicationUserModelId")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(applicationusermodelid) : 0;
#else
    (void)applicationusermodelid;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_packaging_appx_VerifyPackageFamilyName_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* packagefamilyname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-appmodel-runtime-l1-1-1.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "VerifyPackageFamilyName")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(packagefamilyname) : 0;
#else
    (void)packagefamilyname;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_packaging_appx_VerifyPackageFullName_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* packagefullname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-appmodel-runtime-l1-1-1.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "VerifyPackageFullName")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(packagefullname) : 0;
#else
    (void)packagefullname;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_packaging_appx_VerifyPackageId_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* packageid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-appmodel-runtime-l1-1-1.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "VerifyPackageId")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(packageid) : 0;
#else
    (void)packageid;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_packaging_appx_VerifyPackageRelativeApplicationId_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* packagerelativeapplicationid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-appmodel-runtime-l1-1-1.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "VerifyPackageRelativeApplicationId")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(packagerelativeapplicationid) : 0;
#else
    (void)packagerelativeapplicationid;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static void register_windows_win32_storage_packaging_appx_napi(Napi::Env env, Napi::Object exports) {
    exports.Set("windowssys_windows_win32_storage_packaging_appx_ActivatePackageVirtualizationContext", Napi::Function::New(env, windowssys_windows_win32_storage_packaging_appx_ActivatePackageVirtualizationContext_napi));
    exports.Set("windowssys_windows_win32_storage_packaging_appx_AddPackageDependency", Napi::Function::New(env, windowssys_windows_win32_storage_packaging_appx_AddPackageDependency_napi));
    exports.Set("windowssys_windows_win32_storage_packaging_appx_AppPolicyGetClrCompat", Napi::Function::New(env, windowssys_windows_win32_storage_packaging_appx_AppPolicyGetClrCompat_napi));
    exports.Set("windowssys_windows_win32_storage_packaging_appx_AppPolicyGetCreateFileAccess", Napi::Function::New(env, windowssys_windows_win32_storage_packaging_appx_AppPolicyGetCreateFileAccess_napi));
    exports.Set("windowssys_windows_win32_storage_packaging_appx_AppPolicyGetLifecycleManagement", Napi::Function::New(env, windowssys_windows_win32_storage_packaging_appx_AppPolicyGetLifecycleManagement_napi));
    exports.Set("windowssys_windows_win32_storage_packaging_appx_AppPolicyGetMediaFoundationCodecLoading", Napi::Function::New(env, windowssys_windows_win32_storage_packaging_appx_AppPolicyGetMediaFoundationCodecLoading_napi));
    exports.Set("windowssys_windows_win32_storage_packaging_appx_AppPolicyGetProcessTerminationMethod", Napi::Function::New(env, windowssys_windows_win32_storage_packaging_appx_AppPolicyGetProcessTerminationMethod_napi));
    exports.Set("windowssys_windows_win32_storage_packaging_appx_AppPolicyGetShowDeveloperDiagnostic", Napi::Function::New(env, windowssys_windows_win32_storage_packaging_appx_AppPolicyGetShowDeveloperDiagnostic_napi));
    exports.Set("windowssys_windows_win32_storage_packaging_appx_AppPolicyGetThreadInitializationType", Napi::Function::New(env, windowssys_windows_win32_storage_packaging_appx_AppPolicyGetThreadInitializationType_napi));
    exports.Set("windowssys_windows_win32_storage_packaging_appx_AppPolicyGetWindowingModel", Napi::Function::New(env, windowssys_windows_win32_storage_packaging_appx_AppPolicyGetWindowingModel_napi));
    exports.Set("windowssys_windows_win32_storage_packaging_appx_CheckIsMSIXPackage", Napi::Function::New(env, windowssys_windows_win32_storage_packaging_appx_CheckIsMSIXPackage_napi));
    exports.Set("windowssys_windows_win32_storage_packaging_appx_ClosePackageInfo", Napi::Function::New(env, windowssys_windows_win32_storage_packaging_appx_ClosePackageInfo_napi));
    exports.Set("windowssys_windows_win32_storage_packaging_appx_CreatePackageVirtualizationContext", Napi::Function::New(env, windowssys_windows_win32_storage_packaging_appx_CreatePackageVirtualizationContext_napi));
    exports.Set("windowssys_windows_win32_storage_packaging_appx_DeactivatePackageVirtualizationContext", Napi::Function::New(env, windowssys_windows_win32_storage_packaging_appx_DeactivatePackageVirtualizationContext_napi));
    exports.Set("windowssys_windows_win32_storage_packaging_appx_DeletePackageDependency", Napi::Function::New(env, windowssys_windows_win32_storage_packaging_appx_DeletePackageDependency_napi));
    exports.Set("windowssys_windows_win32_storage_packaging_appx_DuplicatePackageVirtualizationContext", Napi::Function::New(env, windowssys_windows_win32_storage_packaging_appx_DuplicatePackageVirtualizationContext_napi));
    exports.Set("windowssys_windows_win32_storage_packaging_appx_FindPackagesByPackageFamily", Napi::Function::New(env, windowssys_windows_win32_storage_packaging_appx_FindPackagesByPackageFamily_napi));
    exports.Set("windowssys_windows_win32_storage_packaging_appx_FormatApplicationUserModelId", Napi::Function::New(env, windowssys_windows_win32_storage_packaging_appx_FormatApplicationUserModelId_napi));
    exports.Set("windowssys_windows_win32_storage_packaging_appx_GetApplicationUserModelId", Napi::Function::New(env, windowssys_windows_win32_storage_packaging_appx_GetApplicationUserModelId_napi));
    exports.Set("windowssys_windows_win32_storage_packaging_appx_GetApplicationUserModelIdFromToken", Napi::Function::New(env, windowssys_windows_win32_storage_packaging_appx_GetApplicationUserModelIdFromToken_napi));
    exports.Set("windowssys_windows_win32_storage_packaging_appx_GetCurrentApplicationUserModelId", Napi::Function::New(env, windowssys_windows_win32_storage_packaging_appx_GetCurrentApplicationUserModelId_napi));
    exports.Set("windowssys_windows_win32_storage_packaging_appx_GetCurrentPackageFamilyName", Napi::Function::New(env, windowssys_windows_win32_storage_packaging_appx_GetCurrentPackageFamilyName_napi));
    exports.Set("windowssys_windows_win32_storage_packaging_appx_GetCurrentPackageFullName", Napi::Function::New(env, windowssys_windows_win32_storage_packaging_appx_GetCurrentPackageFullName_napi));
    exports.Set("windowssys_windows_win32_storage_packaging_appx_GetCurrentPackageId", Napi::Function::New(env, windowssys_windows_win32_storage_packaging_appx_GetCurrentPackageId_napi));
    exports.Set("windowssys_windows_win32_storage_packaging_appx_GetCurrentPackageInfo", Napi::Function::New(env, windowssys_windows_win32_storage_packaging_appx_GetCurrentPackageInfo_napi));
    exports.Set("windowssys_windows_win32_storage_packaging_appx_GetCurrentPackageInfo2", Napi::Function::New(env, windowssys_windows_win32_storage_packaging_appx_GetCurrentPackageInfo2_napi));
    exports.Set("windowssys_windows_win32_storage_packaging_appx_GetCurrentPackageInfo3", Napi::Function::New(env, windowssys_windows_win32_storage_packaging_appx_GetCurrentPackageInfo3_napi));
    exports.Set("windowssys_windows_win32_storage_packaging_appx_GetCurrentPackagePath", Napi::Function::New(env, windowssys_windows_win32_storage_packaging_appx_GetCurrentPackagePath_napi));
    exports.Set("windowssys_windows_win32_storage_packaging_appx_GetCurrentPackagePath2", Napi::Function::New(env, windowssys_windows_win32_storage_packaging_appx_GetCurrentPackagePath2_napi));
    exports.Set("windowssys_windows_win32_storage_packaging_appx_GetCurrentPackageVirtualizationContext", Napi::Function::New(env, windowssys_windows_win32_storage_packaging_appx_GetCurrentPackageVirtualizationContext_napi));
    exports.Set("windowssys_windows_win32_storage_packaging_appx_GetIdForPackageDependencyContext", Napi::Function::New(env, windowssys_windows_win32_storage_packaging_appx_GetIdForPackageDependencyContext_napi));
    exports.Set("windowssys_windows_win32_storage_packaging_appx_GetPackageApplicationIds", Napi::Function::New(env, windowssys_windows_win32_storage_packaging_appx_GetPackageApplicationIds_napi));
    exports.Set("windowssys_windows_win32_storage_packaging_appx_GetPackageFamilyName", Napi::Function::New(env, windowssys_windows_win32_storage_packaging_appx_GetPackageFamilyName_napi));
    exports.Set("windowssys_windows_win32_storage_packaging_appx_GetPackageFamilyNameFromToken", Napi::Function::New(env, windowssys_windows_win32_storage_packaging_appx_GetPackageFamilyNameFromToken_napi));
    exports.Set("windowssys_windows_win32_storage_packaging_appx_GetPackageFullName", Napi::Function::New(env, windowssys_windows_win32_storage_packaging_appx_GetPackageFullName_napi));
    exports.Set("windowssys_windows_win32_storage_packaging_appx_GetPackageFullNameFromToken", Napi::Function::New(env, windowssys_windows_win32_storage_packaging_appx_GetPackageFullNameFromToken_napi));
    exports.Set("windowssys_windows_win32_storage_packaging_appx_GetPackageGraphRevisionId", Napi::Function::New(env, windowssys_windows_win32_storage_packaging_appx_GetPackageGraphRevisionId_napi));
    exports.Set("windowssys_windows_win32_storage_packaging_appx_GetPackageId", Napi::Function::New(env, windowssys_windows_win32_storage_packaging_appx_GetPackageId_napi));
    exports.Set("windowssys_windows_win32_storage_packaging_appx_GetPackageInfo", Napi::Function::New(env, windowssys_windows_win32_storage_packaging_appx_GetPackageInfo_napi));
    exports.Set("windowssys_windows_win32_storage_packaging_appx_GetPackageInfo2", Napi::Function::New(env, windowssys_windows_win32_storage_packaging_appx_GetPackageInfo2_napi));
    exports.Set("windowssys_windows_win32_storage_packaging_appx_GetPackagePath", Napi::Function::New(env, windowssys_windows_win32_storage_packaging_appx_GetPackagePath_napi));
    exports.Set("windowssys_windows_win32_storage_packaging_appx_GetPackagePathByFullName", Napi::Function::New(env, windowssys_windows_win32_storage_packaging_appx_GetPackagePathByFullName_napi));
    exports.Set("windowssys_windows_win32_storage_packaging_appx_GetPackagePathByFullName2", Napi::Function::New(env, windowssys_windows_win32_storage_packaging_appx_GetPackagePathByFullName2_napi));
    exports.Set("windowssys_windows_win32_storage_packaging_appx_GetPackagesByPackageFamily", Napi::Function::New(env, windowssys_windows_win32_storage_packaging_appx_GetPackagesByPackageFamily_napi));
    exports.Set("windowssys_windows_win32_storage_packaging_appx_GetProcessesInVirtualizationContext", Napi::Function::New(env, windowssys_windows_win32_storage_packaging_appx_GetProcessesInVirtualizationContext_napi));
    exports.Set("windowssys_windows_win32_storage_packaging_appx_GetResolvedPackageFullNameForPackageDependency", Napi::Function::New(env, windowssys_windows_win32_storage_packaging_appx_GetResolvedPackageFullNameForPackageDependency_napi));
    exports.Set("windowssys_windows_win32_storage_packaging_appx_GetStagedPackageOrigin", Napi::Function::New(env, windowssys_windows_win32_storage_packaging_appx_GetStagedPackageOrigin_napi));
    exports.Set("windowssys_windows_win32_storage_packaging_appx_GetStagedPackagePathByFullName", Napi::Function::New(env, windowssys_windows_win32_storage_packaging_appx_GetStagedPackagePathByFullName_napi));
    exports.Set("windowssys_windows_win32_storage_packaging_appx_GetStagedPackagePathByFullName2", Napi::Function::New(env, windowssys_windows_win32_storage_packaging_appx_GetStagedPackagePathByFullName2_napi));
    exports.Set("windowssys_windows_win32_storage_packaging_appx_OpenPackageInfoByFullName", Napi::Function::New(env, windowssys_windows_win32_storage_packaging_appx_OpenPackageInfoByFullName_napi));
    exports.Set("windowssys_windows_win32_storage_packaging_appx_OpenPackageInfoByFullNameForUser", Napi::Function::New(env, windowssys_windows_win32_storage_packaging_appx_OpenPackageInfoByFullNameForUser_napi));
    exports.Set("windowssys_windows_win32_storage_packaging_appx_PackageFamilyNameFromFullName", Napi::Function::New(env, windowssys_windows_win32_storage_packaging_appx_PackageFamilyNameFromFullName_napi));
    exports.Set("windowssys_windows_win32_storage_packaging_appx_PackageFamilyNameFromId", Napi::Function::New(env, windowssys_windows_win32_storage_packaging_appx_PackageFamilyNameFromId_napi));
    exports.Set("windowssys_windows_win32_storage_packaging_appx_PackageFullNameFromId", Napi::Function::New(env, windowssys_windows_win32_storage_packaging_appx_PackageFullNameFromId_napi));
    exports.Set("windowssys_windows_win32_storage_packaging_appx_PackageIdFromFullName", Napi::Function::New(env, windowssys_windows_win32_storage_packaging_appx_PackageIdFromFullName_napi));
    exports.Set("windowssys_windows_win32_storage_packaging_appx_PackageNameAndPublisherIdFromFamilyName", Napi::Function::New(env, windowssys_windows_win32_storage_packaging_appx_PackageNameAndPublisherIdFromFamilyName_napi));
    exports.Set("windowssys_windows_win32_storage_packaging_appx_ParseApplicationUserModelId", Napi::Function::New(env, windowssys_windows_win32_storage_packaging_appx_ParseApplicationUserModelId_napi));
    exports.Set("windowssys_windows_win32_storage_packaging_appx_ReleasePackageVirtualizationContext", Napi::Function::New(env, windowssys_windows_win32_storage_packaging_appx_ReleasePackageVirtualizationContext_napi));
    exports.Set("windowssys_windows_win32_storage_packaging_appx_RemovePackageDependency", Napi::Function::New(env, windowssys_windows_win32_storage_packaging_appx_RemovePackageDependency_napi));
    exports.Set("windowssys_windows_win32_storage_packaging_appx_VerifyApplicationUserModelId", Napi::Function::New(env, windowssys_windows_win32_storage_packaging_appx_VerifyApplicationUserModelId_napi));
    exports.Set("windowssys_windows_win32_storage_packaging_appx_VerifyPackageFamilyName", Napi::Function::New(env, windowssys_windows_win32_storage_packaging_appx_VerifyPackageFamilyName_napi));
    exports.Set("windowssys_windows_win32_storage_packaging_appx_VerifyPackageFullName", Napi::Function::New(env, windowssys_windows_win32_storage_packaging_appx_VerifyPackageFullName_napi));
    exports.Set("windowssys_windows_win32_storage_packaging_appx_VerifyPackageId", Napi::Function::New(env, windowssys_windows_win32_storage_packaging_appx_VerifyPackageId_napi));
    exports.Set("windowssys_windows_win32_storage_packaging_appx_VerifyPackageRelativeApplicationId", Napi::Function::New(env, windowssys_windows_win32_storage_packaging_appx_VerifyPackageRelativeApplicationId_napi));
}

static KmNapiRegistrarNode registrar_node = { &register_windows_win32_storage_packaging_appx_napi, nullptr };
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
