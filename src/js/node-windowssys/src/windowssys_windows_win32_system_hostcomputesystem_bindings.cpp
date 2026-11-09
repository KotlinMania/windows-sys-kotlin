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

static Napi::Value windowssys_windows_win32_system_hostcomputesystem_HcsAddResourceToOperation_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* operation = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t type = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* uri = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* handle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HcsAddResourceToOperation")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(operation, type, uri, handle) : -1;
#else
    (void)operation;
    (void)type;
    (void)uri;
    (void)handle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hostcomputesystem_HcsAttachLayerStorageFilter_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* layerpath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* layerdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("computestorage.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HcsAttachLayerStorageFilter")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(layerpath, layerdata) : -1;
#else
    (void)layerpath;
    (void)layerdata;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hostcomputesystem_HcsCancelOperation_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* operation = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HcsCancelOperation")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(operation) : -1;
#else
    (void)operation;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hostcomputesystem_HcsCloseComputeSystem_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* computesystem = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HcsCloseComputeSystem")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(computesystem);
#else
    (void)computesystem;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_hostcomputesystem_HcsCloseOperation_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* operation = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HcsCloseOperation")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(operation);
#else
    (void)operation;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_hostcomputesystem_HcsCloseProcess_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* process = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HcsCloseProcess")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(process);
#else
    (void)process;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_hostcomputesystem_HcsCrashComputeSystem_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* computesystem = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* operation = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* options = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HcsCrashComputeSystem")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(computesystem, operation, options) : -1;
#else
    (void)computesystem;
    (void)operation;
    (void)options;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hostcomputesystem_HcsCreateComputeSystem_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* id = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* configuration = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* operation = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* securitydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* computesystem = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HcsCreateComputeSystem")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(id, configuration, operation, securitydescriptor, computesystem) : -1;
#else
    (void)id;
    (void)configuration;
    (void)operation;
    (void)securitydescriptor;
    (void)computesystem;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hostcomputesystem_HcsCreateComputeSystemInNamespace_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* idnamespace = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* id = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* configuration = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* operation = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* options = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* computesystem = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HcsCreateComputeSystemInNamespace")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(idnamespace, id, configuration, operation, options, computesystem) : -1;
#else
    (void)idnamespace;
    (void)id;
    (void)configuration;
    (void)operation;
    (void)options;
    (void)computesystem;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hostcomputesystem_HcsCreateEmptyGuestStateFile_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* gueststatefilepath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HcsCreateEmptyGuestStateFile")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(gueststatefilepath) : -1;
#else
    (void)gueststatefilepath;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hostcomputesystem_HcsCreateEmptyRuntimeStateFile_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* runtimestatefilepath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HcsCreateEmptyRuntimeStateFile")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(runtimestatefilepath) : -1;
#else
    (void)runtimestatefilepath;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hostcomputesystem_HcsCreateOperation_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* context = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* callback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HcsCreateOperation")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(context, callback) : NULL;
#else
    (void)context;
    (void)callback;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_hostcomputesystem_HcsCreateOperationWithNotifications_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t eventtypes = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* context = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* callback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HcsCreateOperationWithNotifications")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(eventtypes, context, callback) : NULL;
#else
    (void)eventtypes;
    (void)context;
    (void)callback;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_hostcomputesystem_HcsCreateProcess_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* computesystem = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* processparameters = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* operation = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* securitydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* process = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HcsCreateProcess")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(computesystem, processparameters, operation, securitydescriptor, process) : -1;
#else
    (void)computesystem;
    (void)processparameters;
    (void)operation;
    (void)securitydescriptor;
    (void)process;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hostcomputesystem_HcsDestroyLayer_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* layerpath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("computestorage.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HcsDestroyLayer")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(layerpath) : -1;
#else
    (void)layerpath;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hostcomputesystem_HcsDetachLayerStorageFilter_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* layerpath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("computestorage.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HcsDetachLayerStorageFilter")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(layerpath) : -1;
#else
    (void)layerpath;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hostcomputesystem_HcsEnumerateComputeSystems_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* query = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* operation = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HcsEnumerateComputeSystems")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(query, operation) : -1;
#else
    (void)query;
    (void)operation;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hostcomputesystem_HcsEnumerateComputeSystemsInNamespace_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* idnamespace = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* query = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* operation = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HcsEnumerateComputeSystemsInNamespace")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(idnamespace, query, operation) : -1;
#else
    (void)idnamespace;
    (void)query;
    (void)operation;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hostcomputesystem_HcsExportLayer_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* layerpath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* exportfolderpath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* layerdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* options = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("computestorage.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HcsExportLayer")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(layerpath, exportfolderpath, layerdata, options) : -1;
#else
    (void)layerpath;
    (void)exportfolderpath;
    (void)layerdata;
    (void)options;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hostcomputesystem_HcsExportLegacyWritableLayer_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* writablelayermountpath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* writablelayerfolderpath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* exportfolderpath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* layerdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("computestorage.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HcsExportLegacyWritableLayer")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(writablelayermountpath, writablelayerfolderpath, exportfolderpath, layerdata) : -1;
#else
    (void)writablelayermountpath;
    (void)writablelayerfolderpath;
    (void)exportfolderpath;
    (void)layerdata;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hostcomputesystem_HcsFormatWritableLayerVhd_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* vhdhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("computestorage.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HcsFormatWritableLayerVhd")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(vhdhandle) : -1;
#else
    (void)vhdhandle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hostcomputesystem_HcsGetComputeSystemFromOperation_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* operation = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HcsGetComputeSystemFromOperation")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(operation) : NULL;
#else
    (void)operation;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_hostcomputesystem_HcsGetComputeSystemProperties_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* computesystem = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* operation = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* propertyquery = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HcsGetComputeSystemProperties")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(computesystem, operation, propertyquery) : -1;
#else
    (void)computesystem;
    (void)operation;
    (void)propertyquery;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hostcomputesystem_HcsGetLayerVhdMountPath_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* vhdhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* mountpath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("computestorage.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HcsGetLayerVhdMountPath")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(vhdhandle, mountpath) : -1;
#else
    (void)vhdhandle;
    (void)mountpath;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hostcomputesystem_HcsGetOperationContext_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* operation = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HcsGetOperationContext")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(operation) : NULL;
#else
    (void)operation;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_hostcomputesystem_HcsGetOperationId_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* operation = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HcsGetOperationId")));
    }
    uint64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(operation) : 0;
#else
    (void)operation;
    uint64_t km_res = 0;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<uint64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_system_hostcomputesystem_HcsGetOperationResult_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* operation = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* resultdocument = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HcsGetOperationResult")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(operation, resultdocument) : -1;
#else
    (void)operation;
    (void)resultdocument;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hostcomputesystem_HcsGetOperationResultAndProcessInfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* operation = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* processinformation = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* resultdocument = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HcsGetOperationResultAndProcessInfo")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(operation, processinformation, resultdocument) : -1;
#else
    (void)operation;
    (void)processinformation;
    (void)resultdocument;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hostcomputesystem_HcsGetOperationType_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* operation = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HcsGetOperationType")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(operation) : -1;
#else
    (void)operation;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hostcomputesystem_HcsGetProcessFromOperation_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* operation = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HcsGetProcessFromOperation")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(operation) : NULL;
#else
    (void)operation;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_hostcomputesystem_HcsGetProcessInfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* process = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* operation = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HcsGetProcessInfo")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(process, operation) : -1;
#else
    (void)process;
    (void)operation;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hostcomputesystem_HcsGetProcessProperties_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* process = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* operation = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* propertyquery = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HcsGetProcessProperties")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(process, operation, propertyquery) : -1;
#else
    (void)process;
    (void)operation;
    (void)propertyquery;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hostcomputesystem_HcsGetProcessorCompatibilityFromSavedState_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* runtimefilename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* processorfeaturesstring = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HcsGetProcessorCompatibilityFromSavedState")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(runtimefilename, processorfeaturesstring) : -1;
#else
    (void)runtimefilename;
    (void)processorfeaturesstring;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hostcomputesystem_HcsGetServiceProperties_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* propertyquery = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* result = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HcsGetServiceProperties")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(propertyquery, result) : -1;
#else
    (void)propertyquery;
    (void)result;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hostcomputesystem_HcsGrantVmAccess_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* vmid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* filepath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HcsGrantVmAccess")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(vmid, filepath) : -1;
#else
    (void)vmid;
    (void)filepath;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hostcomputesystem_HcsGrantVmGroupAccess_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* filepath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HcsGrantVmGroupAccess")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(filepath) : -1;
#else
    (void)filepath;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hostcomputesystem_HcsImportLayer_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* layerpath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* sourcefolderpath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* layerdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("computestorage.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HcsImportLayer")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(layerpath, sourcefolderpath, layerdata) : -1;
#else
    (void)layerpath;
    (void)sourcefolderpath;
    (void)layerdata;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hostcomputesystem_HcsInitializeLegacyWritableLayer_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* writablelayermountpath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* writablelayerfolderpath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* layerdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* options = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("computestorage.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HcsInitializeLegacyWritableLayer")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(writablelayermountpath, writablelayerfolderpath, layerdata, options) : -1;
#else
    (void)writablelayermountpath;
    (void)writablelayerfolderpath;
    (void)layerdata;
    (void)options;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hostcomputesystem_HcsInitializeWritableLayer_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* writablelayerpath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* layerdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* options = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("computestorage.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HcsInitializeWritableLayer")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(writablelayerpath, layerdata, options) : -1;
#else
    (void)writablelayerpath;
    (void)layerdata;
    (void)options;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hostcomputesystem_HcsModifyComputeSystem_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* computesystem = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* operation = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* configuration = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* identity = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HcsModifyComputeSystem")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(computesystem, operation, configuration, identity) : -1;
#else
    (void)computesystem;
    (void)operation;
    (void)configuration;
    (void)identity;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hostcomputesystem_HcsModifyProcess_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* process = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* operation = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* settings = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HcsModifyProcess")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(process, operation, settings) : -1;
#else
    (void)process;
    (void)operation;
    (void)settings;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hostcomputesystem_HcsModifyServiceSettings_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* settings = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* result = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HcsModifyServiceSettings")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(settings, result) : -1;
#else
    (void)settings;
    (void)result;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hostcomputesystem_HcsOpenComputeSystem_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* id = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t requestedaccess = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* computesystem = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HcsOpenComputeSystem")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(id, requestedaccess, computesystem) : -1;
#else
    (void)id;
    (void)requestedaccess;
    (void)computesystem;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hostcomputesystem_HcsOpenComputeSystemInNamespace_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* idnamespace = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* id = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t requestedaccess = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* computesystem = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HcsOpenComputeSystemInNamespace")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(idnamespace, id, requestedaccess, computesystem) : -1;
#else
    (void)idnamespace;
    (void)id;
    (void)requestedaccess;
    (void)computesystem;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hostcomputesystem_HcsOpenProcess_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* computesystem = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t processid = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t requestedaccess = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* process = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HcsOpenProcess")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(computesystem, processid, requestedaccess, process) : -1;
#else
    (void)computesystem;
    (void)processid;
    (void)requestedaccess;
    (void)process;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hostcomputesystem_HcsPauseComputeSystem_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* computesystem = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* operation = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* options = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HcsPauseComputeSystem")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(computesystem, operation, options) : -1;
#else
    (void)computesystem;
    (void)operation;
    (void)options;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hostcomputesystem_HcsResumeComputeSystem_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* computesystem = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* operation = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* options = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HcsResumeComputeSystem")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(computesystem, operation, options) : -1;
#else
    (void)computesystem;
    (void)operation;
    (void)options;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hostcomputesystem_HcsRevokeVmAccess_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* vmid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* filepath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HcsRevokeVmAccess")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(vmid, filepath) : -1;
#else
    (void)vmid;
    (void)filepath;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hostcomputesystem_HcsRevokeVmGroupAccess_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* filepath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HcsRevokeVmGroupAccess")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(filepath) : -1;
#else
    (void)filepath;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hostcomputesystem_HcsSaveComputeSystem_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* computesystem = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* operation = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* options = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HcsSaveComputeSystem")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(computesystem, operation, options) : -1;
#else
    (void)computesystem;
    (void)operation;
    (void)options;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hostcomputesystem_HcsSetComputeSystemCallback_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* computesystem = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t callbackoptions = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* context = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* callback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HcsSetComputeSystemCallback")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(computesystem, callbackoptions, context, callback) : -1;
#else
    (void)computesystem;
    (void)callbackoptions;
    (void)context;
    (void)callback;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hostcomputesystem_HcsSetOperationCallback_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* operation = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* context = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* callback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HcsSetOperationCallback")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(operation, context, callback) : -1;
#else
    (void)operation;
    (void)context;
    (void)callback;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hostcomputesystem_HcsSetOperationContext_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* operation = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* context = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HcsSetOperationContext")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(operation, context) : -1;
#else
    (void)operation;
    (void)context;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hostcomputesystem_HcsSetProcessCallback_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* process = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t callbackoptions = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* context = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* callback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HcsSetProcessCallback")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(process, callbackoptions, context, callback) : -1;
#else
    (void)process;
    (void)callbackoptions;
    (void)context;
    (void)callback;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hostcomputesystem_HcsSetupBaseOSLayer_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* layerpath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* vhdhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* options = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("computestorage.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HcsSetupBaseOSLayer")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(layerpath, vhdhandle, options) : -1;
#else
    (void)layerpath;
    (void)vhdhandle;
    (void)options;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hostcomputesystem_HcsSetupBaseOSVolume_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* layerpath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* volumepath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* options = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("computestorage.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HcsSetupBaseOSVolume")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(layerpath, volumepath, options) : -1;
#else
    (void)layerpath;
    (void)volumepath;
    (void)options;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hostcomputesystem_HcsShutDownComputeSystem_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* computesystem = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* operation = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* options = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HcsShutDownComputeSystem")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(computesystem, operation, options) : -1;
#else
    (void)computesystem;
    (void)operation;
    (void)options;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hostcomputesystem_HcsSignalProcess_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* process = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* operation = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* options = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HcsSignalProcess")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(process, operation, options) : -1;
#else
    (void)process;
    (void)operation;
    (void)options;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hostcomputesystem_HcsStartComputeSystem_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* computesystem = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* operation = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* options = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HcsStartComputeSystem")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(computesystem, operation, options) : -1;
#else
    (void)computesystem;
    (void)operation;
    (void)options;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hostcomputesystem_HcsSubmitWerReport_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* settings = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HcsSubmitWerReport")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(settings) : -1;
#else
    (void)settings;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hostcomputesystem_HcsTerminateComputeSystem_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* computesystem = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* operation = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* options = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HcsTerminateComputeSystem")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(computesystem, operation, options) : -1;
#else
    (void)computesystem;
    (void)operation;
    (void)options;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hostcomputesystem_HcsTerminateProcess_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* process = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* operation = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* options = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HcsTerminateProcess")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(process, operation, options) : -1;
#else
    (void)process;
    (void)operation;
    (void)options;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hostcomputesystem_HcsWaitForComputeSystemExit_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* computesystem = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t timeoutms = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* result = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HcsWaitForComputeSystemExit")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(computesystem, timeoutms, result) : -1;
#else
    (void)computesystem;
    (void)timeoutms;
    (void)result;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hostcomputesystem_HcsWaitForOperationResult_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* operation = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t timeoutms = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* resultdocument = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HcsWaitForOperationResult")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(operation, timeoutms, resultdocument) : -1;
#else
    (void)operation;
    (void)timeoutms;
    (void)resultdocument;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hostcomputesystem_HcsWaitForOperationResultAndProcessInfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* operation = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t timeoutms = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* processinformation = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* resultdocument = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HcsWaitForOperationResultAndProcessInfo")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(operation, timeoutms, processinformation, resultdocument) : -1;
#else
    (void)operation;
    (void)timeoutms;
    (void)processinformation;
    (void)resultdocument;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hostcomputesystem_HcsWaitForProcessExit_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* computesystem = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t timeoutms = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* result = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HcsWaitForProcessExit")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(computesystem, timeoutms, result) : -1;
#else
    (void)computesystem;
    (void)timeoutms;
    (void)result;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static void register_windows_win32_system_hostcomputesystem_napi(Napi::Env env, Napi::Object exports) {
    exports.Set("windowssys_windows_win32_system_hostcomputesystem_HcsAddResourceToOperation", Napi::Function::New(env, windowssys_windows_win32_system_hostcomputesystem_HcsAddResourceToOperation_napi));
    exports.Set("windowssys_windows_win32_system_hostcomputesystem_HcsAttachLayerStorageFilter", Napi::Function::New(env, windowssys_windows_win32_system_hostcomputesystem_HcsAttachLayerStorageFilter_napi));
    exports.Set("windowssys_windows_win32_system_hostcomputesystem_HcsCancelOperation", Napi::Function::New(env, windowssys_windows_win32_system_hostcomputesystem_HcsCancelOperation_napi));
    exports.Set("windowssys_windows_win32_system_hostcomputesystem_HcsCloseComputeSystem", Napi::Function::New(env, windowssys_windows_win32_system_hostcomputesystem_HcsCloseComputeSystem_napi));
    exports.Set("windowssys_windows_win32_system_hostcomputesystem_HcsCloseOperation", Napi::Function::New(env, windowssys_windows_win32_system_hostcomputesystem_HcsCloseOperation_napi));
    exports.Set("windowssys_windows_win32_system_hostcomputesystem_HcsCloseProcess", Napi::Function::New(env, windowssys_windows_win32_system_hostcomputesystem_HcsCloseProcess_napi));
    exports.Set("windowssys_windows_win32_system_hostcomputesystem_HcsCrashComputeSystem", Napi::Function::New(env, windowssys_windows_win32_system_hostcomputesystem_HcsCrashComputeSystem_napi));
    exports.Set("windowssys_windows_win32_system_hostcomputesystem_HcsCreateComputeSystem", Napi::Function::New(env, windowssys_windows_win32_system_hostcomputesystem_HcsCreateComputeSystem_napi));
    exports.Set("windowssys_windows_win32_system_hostcomputesystem_HcsCreateComputeSystemInNamespace", Napi::Function::New(env, windowssys_windows_win32_system_hostcomputesystem_HcsCreateComputeSystemInNamespace_napi));
    exports.Set("windowssys_windows_win32_system_hostcomputesystem_HcsCreateEmptyGuestStateFile", Napi::Function::New(env, windowssys_windows_win32_system_hostcomputesystem_HcsCreateEmptyGuestStateFile_napi));
    exports.Set("windowssys_windows_win32_system_hostcomputesystem_HcsCreateEmptyRuntimeStateFile", Napi::Function::New(env, windowssys_windows_win32_system_hostcomputesystem_HcsCreateEmptyRuntimeStateFile_napi));
    exports.Set("windowssys_windows_win32_system_hostcomputesystem_HcsCreateOperation", Napi::Function::New(env, windowssys_windows_win32_system_hostcomputesystem_HcsCreateOperation_napi));
    exports.Set("windowssys_windows_win32_system_hostcomputesystem_HcsCreateOperationWithNotifications", Napi::Function::New(env, windowssys_windows_win32_system_hostcomputesystem_HcsCreateOperationWithNotifications_napi));
    exports.Set("windowssys_windows_win32_system_hostcomputesystem_HcsCreateProcess", Napi::Function::New(env, windowssys_windows_win32_system_hostcomputesystem_HcsCreateProcess_napi));
    exports.Set("windowssys_windows_win32_system_hostcomputesystem_HcsDestroyLayer", Napi::Function::New(env, windowssys_windows_win32_system_hostcomputesystem_HcsDestroyLayer_napi));
    exports.Set("windowssys_windows_win32_system_hostcomputesystem_HcsDetachLayerStorageFilter", Napi::Function::New(env, windowssys_windows_win32_system_hostcomputesystem_HcsDetachLayerStorageFilter_napi));
    exports.Set("windowssys_windows_win32_system_hostcomputesystem_HcsEnumerateComputeSystems", Napi::Function::New(env, windowssys_windows_win32_system_hostcomputesystem_HcsEnumerateComputeSystems_napi));
    exports.Set("windowssys_windows_win32_system_hostcomputesystem_HcsEnumerateComputeSystemsInNamespace", Napi::Function::New(env, windowssys_windows_win32_system_hostcomputesystem_HcsEnumerateComputeSystemsInNamespace_napi));
    exports.Set("windowssys_windows_win32_system_hostcomputesystem_HcsExportLayer", Napi::Function::New(env, windowssys_windows_win32_system_hostcomputesystem_HcsExportLayer_napi));
    exports.Set("windowssys_windows_win32_system_hostcomputesystem_HcsExportLegacyWritableLayer", Napi::Function::New(env, windowssys_windows_win32_system_hostcomputesystem_HcsExportLegacyWritableLayer_napi));
    exports.Set("windowssys_windows_win32_system_hostcomputesystem_HcsFormatWritableLayerVhd", Napi::Function::New(env, windowssys_windows_win32_system_hostcomputesystem_HcsFormatWritableLayerVhd_napi));
    exports.Set("windowssys_windows_win32_system_hostcomputesystem_HcsGetComputeSystemFromOperation", Napi::Function::New(env, windowssys_windows_win32_system_hostcomputesystem_HcsGetComputeSystemFromOperation_napi));
    exports.Set("windowssys_windows_win32_system_hostcomputesystem_HcsGetComputeSystemProperties", Napi::Function::New(env, windowssys_windows_win32_system_hostcomputesystem_HcsGetComputeSystemProperties_napi));
    exports.Set("windowssys_windows_win32_system_hostcomputesystem_HcsGetLayerVhdMountPath", Napi::Function::New(env, windowssys_windows_win32_system_hostcomputesystem_HcsGetLayerVhdMountPath_napi));
    exports.Set("windowssys_windows_win32_system_hostcomputesystem_HcsGetOperationContext", Napi::Function::New(env, windowssys_windows_win32_system_hostcomputesystem_HcsGetOperationContext_napi));
    exports.Set("windowssys_windows_win32_system_hostcomputesystem_HcsGetOperationId", Napi::Function::New(env, windowssys_windows_win32_system_hostcomputesystem_HcsGetOperationId_napi));
    exports.Set("windowssys_windows_win32_system_hostcomputesystem_HcsGetOperationResult", Napi::Function::New(env, windowssys_windows_win32_system_hostcomputesystem_HcsGetOperationResult_napi));
    exports.Set("windowssys_windows_win32_system_hostcomputesystem_HcsGetOperationResultAndProcessInfo", Napi::Function::New(env, windowssys_windows_win32_system_hostcomputesystem_HcsGetOperationResultAndProcessInfo_napi));
    exports.Set("windowssys_windows_win32_system_hostcomputesystem_HcsGetOperationType", Napi::Function::New(env, windowssys_windows_win32_system_hostcomputesystem_HcsGetOperationType_napi));
    exports.Set("windowssys_windows_win32_system_hostcomputesystem_HcsGetProcessFromOperation", Napi::Function::New(env, windowssys_windows_win32_system_hostcomputesystem_HcsGetProcessFromOperation_napi));
    exports.Set("windowssys_windows_win32_system_hostcomputesystem_HcsGetProcessInfo", Napi::Function::New(env, windowssys_windows_win32_system_hostcomputesystem_HcsGetProcessInfo_napi));
    exports.Set("windowssys_windows_win32_system_hostcomputesystem_HcsGetProcessProperties", Napi::Function::New(env, windowssys_windows_win32_system_hostcomputesystem_HcsGetProcessProperties_napi));
    exports.Set("windowssys_windows_win32_system_hostcomputesystem_HcsGetProcessorCompatibilityFromSavedState", Napi::Function::New(env, windowssys_windows_win32_system_hostcomputesystem_HcsGetProcessorCompatibilityFromSavedState_napi));
    exports.Set("windowssys_windows_win32_system_hostcomputesystem_HcsGetServiceProperties", Napi::Function::New(env, windowssys_windows_win32_system_hostcomputesystem_HcsGetServiceProperties_napi));
    exports.Set("windowssys_windows_win32_system_hostcomputesystem_HcsGrantVmAccess", Napi::Function::New(env, windowssys_windows_win32_system_hostcomputesystem_HcsGrantVmAccess_napi));
    exports.Set("windowssys_windows_win32_system_hostcomputesystem_HcsGrantVmGroupAccess", Napi::Function::New(env, windowssys_windows_win32_system_hostcomputesystem_HcsGrantVmGroupAccess_napi));
    exports.Set("windowssys_windows_win32_system_hostcomputesystem_HcsImportLayer", Napi::Function::New(env, windowssys_windows_win32_system_hostcomputesystem_HcsImportLayer_napi));
    exports.Set("windowssys_windows_win32_system_hostcomputesystem_HcsInitializeLegacyWritableLayer", Napi::Function::New(env, windowssys_windows_win32_system_hostcomputesystem_HcsInitializeLegacyWritableLayer_napi));
    exports.Set("windowssys_windows_win32_system_hostcomputesystem_HcsInitializeWritableLayer", Napi::Function::New(env, windowssys_windows_win32_system_hostcomputesystem_HcsInitializeWritableLayer_napi));
    exports.Set("windowssys_windows_win32_system_hostcomputesystem_HcsModifyComputeSystem", Napi::Function::New(env, windowssys_windows_win32_system_hostcomputesystem_HcsModifyComputeSystem_napi));
    exports.Set("windowssys_windows_win32_system_hostcomputesystem_HcsModifyProcess", Napi::Function::New(env, windowssys_windows_win32_system_hostcomputesystem_HcsModifyProcess_napi));
    exports.Set("windowssys_windows_win32_system_hostcomputesystem_HcsModifyServiceSettings", Napi::Function::New(env, windowssys_windows_win32_system_hostcomputesystem_HcsModifyServiceSettings_napi));
    exports.Set("windowssys_windows_win32_system_hostcomputesystem_HcsOpenComputeSystem", Napi::Function::New(env, windowssys_windows_win32_system_hostcomputesystem_HcsOpenComputeSystem_napi));
    exports.Set("windowssys_windows_win32_system_hostcomputesystem_HcsOpenComputeSystemInNamespace", Napi::Function::New(env, windowssys_windows_win32_system_hostcomputesystem_HcsOpenComputeSystemInNamespace_napi));
    exports.Set("windowssys_windows_win32_system_hostcomputesystem_HcsOpenProcess", Napi::Function::New(env, windowssys_windows_win32_system_hostcomputesystem_HcsOpenProcess_napi));
    exports.Set("windowssys_windows_win32_system_hostcomputesystem_HcsPauseComputeSystem", Napi::Function::New(env, windowssys_windows_win32_system_hostcomputesystem_HcsPauseComputeSystem_napi));
    exports.Set("windowssys_windows_win32_system_hostcomputesystem_HcsResumeComputeSystem", Napi::Function::New(env, windowssys_windows_win32_system_hostcomputesystem_HcsResumeComputeSystem_napi));
    exports.Set("windowssys_windows_win32_system_hostcomputesystem_HcsRevokeVmAccess", Napi::Function::New(env, windowssys_windows_win32_system_hostcomputesystem_HcsRevokeVmAccess_napi));
    exports.Set("windowssys_windows_win32_system_hostcomputesystem_HcsRevokeVmGroupAccess", Napi::Function::New(env, windowssys_windows_win32_system_hostcomputesystem_HcsRevokeVmGroupAccess_napi));
    exports.Set("windowssys_windows_win32_system_hostcomputesystem_HcsSaveComputeSystem", Napi::Function::New(env, windowssys_windows_win32_system_hostcomputesystem_HcsSaveComputeSystem_napi));
    exports.Set("windowssys_windows_win32_system_hostcomputesystem_HcsSetComputeSystemCallback", Napi::Function::New(env, windowssys_windows_win32_system_hostcomputesystem_HcsSetComputeSystemCallback_napi));
    exports.Set("windowssys_windows_win32_system_hostcomputesystem_HcsSetOperationCallback", Napi::Function::New(env, windowssys_windows_win32_system_hostcomputesystem_HcsSetOperationCallback_napi));
    exports.Set("windowssys_windows_win32_system_hostcomputesystem_HcsSetOperationContext", Napi::Function::New(env, windowssys_windows_win32_system_hostcomputesystem_HcsSetOperationContext_napi));
    exports.Set("windowssys_windows_win32_system_hostcomputesystem_HcsSetProcessCallback", Napi::Function::New(env, windowssys_windows_win32_system_hostcomputesystem_HcsSetProcessCallback_napi));
    exports.Set("windowssys_windows_win32_system_hostcomputesystem_HcsSetupBaseOSLayer", Napi::Function::New(env, windowssys_windows_win32_system_hostcomputesystem_HcsSetupBaseOSLayer_napi));
    exports.Set("windowssys_windows_win32_system_hostcomputesystem_HcsSetupBaseOSVolume", Napi::Function::New(env, windowssys_windows_win32_system_hostcomputesystem_HcsSetupBaseOSVolume_napi));
    exports.Set("windowssys_windows_win32_system_hostcomputesystem_HcsShutDownComputeSystem", Napi::Function::New(env, windowssys_windows_win32_system_hostcomputesystem_HcsShutDownComputeSystem_napi));
    exports.Set("windowssys_windows_win32_system_hostcomputesystem_HcsSignalProcess", Napi::Function::New(env, windowssys_windows_win32_system_hostcomputesystem_HcsSignalProcess_napi));
    exports.Set("windowssys_windows_win32_system_hostcomputesystem_HcsStartComputeSystem", Napi::Function::New(env, windowssys_windows_win32_system_hostcomputesystem_HcsStartComputeSystem_napi));
    exports.Set("windowssys_windows_win32_system_hostcomputesystem_HcsSubmitWerReport", Napi::Function::New(env, windowssys_windows_win32_system_hostcomputesystem_HcsSubmitWerReport_napi));
    exports.Set("windowssys_windows_win32_system_hostcomputesystem_HcsTerminateComputeSystem", Napi::Function::New(env, windowssys_windows_win32_system_hostcomputesystem_HcsTerminateComputeSystem_napi));
    exports.Set("windowssys_windows_win32_system_hostcomputesystem_HcsTerminateProcess", Napi::Function::New(env, windowssys_windows_win32_system_hostcomputesystem_HcsTerminateProcess_napi));
    exports.Set("windowssys_windows_win32_system_hostcomputesystem_HcsWaitForComputeSystemExit", Napi::Function::New(env, windowssys_windows_win32_system_hostcomputesystem_HcsWaitForComputeSystemExit_napi));
    exports.Set("windowssys_windows_win32_system_hostcomputesystem_HcsWaitForOperationResult", Napi::Function::New(env, windowssys_windows_win32_system_hostcomputesystem_HcsWaitForOperationResult_napi));
    exports.Set("windowssys_windows_win32_system_hostcomputesystem_HcsWaitForOperationResultAndProcessInfo", Napi::Function::New(env, windowssys_windows_win32_system_hostcomputesystem_HcsWaitForOperationResultAndProcessInfo_napi));
    exports.Set("windowssys_windows_win32_system_hostcomputesystem_HcsWaitForProcessExit", Napi::Function::New(env, windowssys_windows_win32_system_hostcomputesystem_HcsWaitForProcessExit_napi));
}

static KmNapiRegistrarNode registrar_node = { &register_windows_win32_system_hostcomputesystem_napi, nullptr };
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
