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

static Napi::Value windowssys_windows_win32_storage_vhd_AddVirtualDiskParent_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* virtualdiskhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* parentpath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("virtdisk.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "AddVirtualDiskParent")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(virtualdiskhandle, parentpath) : 0;
#else
    (void)virtualdiskhandle;
    (void)parentpath;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_vhd_ApplySnapshotVhdSet_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* virtualdiskhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* parameters = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t flags = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("virtdisk.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ApplySnapshotVhdSet")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(virtualdiskhandle, parameters, flags) : 0;
#else
    (void)virtualdiskhandle;
    (void)parameters;
    (void)flags;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_vhd_AttachVirtualDisk_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* virtualdiskhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* securitydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t flags = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t providerspecificflags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* parameters = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* overlapped = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("virtdisk.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "AttachVirtualDisk")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(virtualdiskhandle, securitydescriptor, flags, providerspecificflags, parameters, overlapped) : 0;
#else
    (void)virtualdiskhandle;
    (void)securitydescriptor;
    (void)flags;
    (void)providerspecificflags;
    (void)parameters;
    (void)overlapped;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_vhd_BreakMirrorVirtualDisk_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* virtualdiskhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("virtdisk.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "BreakMirrorVirtualDisk")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(virtualdiskhandle) : 0;
#else
    (void)virtualdiskhandle;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_vhd_CompactVirtualDisk_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* virtualdiskhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t flags = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* parameters = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* overlapped = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("virtdisk.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CompactVirtualDisk")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(virtualdiskhandle, flags, parameters, overlapped) : 0;
#else
    (void)virtualdiskhandle;
    (void)flags;
    (void)parameters;
    (void)overlapped;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_vhd_CompleteForkVirtualDisk_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* virtualdiskhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("virtdisk.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CompleteForkVirtualDisk")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(virtualdiskhandle) : 0;
#else
    (void)virtualdiskhandle;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_vhd_CreateVirtualDisk_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* virtualstoragetype = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* path = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t virtualdiskaccessmask = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* securitydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    int32_t flags = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    uint32_t providerspecificflags = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* parameters = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* overlapped = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    void* handle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, int32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("virtdisk.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CreateVirtualDisk")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(virtualstoragetype, path, virtualdiskaccessmask, securitydescriptor, flags, providerspecificflags, parameters, overlapped, handle) : 0;
#else
    (void)virtualstoragetype;
    (void)path;
    (void)virtualdiskaccessmask;
    (void)securitydescriptor;
    (void)flags;
    (void)providerspecificflags;
    (void)parameters;
    (void)overlapped;
    (void)handle;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_vhd_DeleteSnapshotVhdSet_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* virtualdiskhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* parameters = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t flags = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("virtdisk.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DeleteSnapshotVhdSet")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(virtualdiskhandle, parameters, flags) : 0;
#else
    (void)virtualdiskhandle;
    (void)parameters;
    (void)flags;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_vhd_DeleteVirtualDiskMetadata_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* virtualdiskhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* item = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("virtdisk.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DeleteVirtualDiskMetadata")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(virtualdiskhandle, item) : 0;
#else
    (void)virtualdiskhandle;
    (void)item;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_vhd_DetachVirtualDisk_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* virtualdiskhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t flags = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t providerspecificflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("virtdisk.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DetachVirtualDisk")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(virtualdiskhandle, flags, providerspecificflags) : 0;
#else
    (void)virtualdiskhandle;
    (void)flags;
    (void)providerspecificflags;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_vhd_EnumerateVirtualDiskMetadata_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* virtualdiskhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* numberofitems = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* items = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("virtdisk.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "EnumerateVirtualDiskMetadata")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(virtualdiskhandle, numberofitems, items) : 0;
#else
    (void)virtualdiskhandle;
    (void)numberofitems;
    (void)items;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_vhd_ExpandVirtualDisk_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* virtualdiskhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t flags = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* parameters = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* overlapped = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("virtdisk.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ExpandVirtualDisk")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(virtualdiskhandle, flags, parameters, overlapped) : 0;
#else
    (void)virtualdiskhandle;
    (void)flags;
    (void)parameters;
    (void)overlapped;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_vhd_ForkVirtualDisk_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* virtualdiskhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t flags = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* parameters = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* overlapped = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("virtdisk.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ForkVirtualDisk")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(virtualdiskhandle, flags, parameters, overlapped) : 0;
#else
    (void)virtualdiskhandle;
    (void)flags;
    (void)parameters;
    (void)overlapped;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_vhd_GetAllAttachedVirtualDiskPhysicalPaths_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pathsbuffersizeinbytes = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pathsbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("virtdisk.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetAllAttachedVirtualDiskPhysicalPaths")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pathsbuffersizeinbytes, pathsbuffer) : 0;
#else
    (void)pathsbuffersizeinbytes;
    (void)pathsbuffer;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_vhd_GetStorageDependencyInformation_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* objecthandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t flags = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t storagedependencyinfosize = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* storagedependencyinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* sizeused = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("virtdisk.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetStorageDependencyInformation")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(objecthandle, flags, storagedependencyinfosize, storagedependencyinfo, sizeused) : 0;
#else
    (void)objecthandle;
    (void)flags;
    (void)storagedependencyinfosize;
    (void)storagedependencyinfo;
    (void)sizeused;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_vhd_GetVirtualDiskInformation_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* virtualdiskhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* virtualdiskinfosize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* virtualdiskinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* sizeused = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("virtdisk.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetVirtualDiskInformation")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(virtualdiskhandle, virtualdiskinfosize, virtualdiskinfo, sizeused) : 0;
#else
    (void)virtualdiskhandle;
    (void)virtualdiskinfosize;
    (void)virtualdiskinfo;
    (void)sizeused;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_vhd_GetVirtualDiskMetadata_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* virtualdiskhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* item = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* metadatasize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* metadata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("virtdisk.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetVirtualDiskMetadata")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(virtualdiskhandle, item, metadatasize, metadata) : 0;
#else
    (void)virtualdiskhandle;
    (void)item;
    (void)metadatasize;
    (void)metadata;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_vhd_GetVirtualDiskOperationProgress_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* virtualdiskhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* overlapped = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* progress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("virtdisk.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetVirtualDiskOperationProgress")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(virtualdiskhandle, overlapped, progress) : 0;
#else
    (void)virtualdiskhandle;
    (void)overlapped;
    (void)progress;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_vhd_GetVirtualDiskPhysicalPath_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* virtualdiskhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* diskpathsizeinbytes = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* diskpath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("virtdisk.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetVirtualDiskPhysicalPath")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(virtualdiskhandle, diskpathsizeinbytes, diskpath) : 0;
#else
    (void)virtualdiskhandle;
    (void)diskpathsizeinbytes;
    (void)diskpath;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_vhd_MergeVirtualDisk_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* virtualdiskhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t flags = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* parameters = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* overlapped = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("virtdisk.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MergeVirtualDisk")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(virtualdiskhandle, flags, parameters, overlapped) : 0;
#else
    (void)virtualdiskhandle;
    (void)flags;
    (void)parameters;
    (void)overlapped;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_vhd_MirrorVirtualDisk_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* virtualdiskhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t flags = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* parameters = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* overlapped = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("virtdisk.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MirrorVirtualDisk")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(virtualdiskhandle, flags, parameters, overlapped) : 0;
#else
    (void)virtualdiskhandle;
    (void)flags;
    (void)parameters;
    (void)overlapped;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_vhd_ModifyVhdSet_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* virtualdiskhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* parameters = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t flags = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("virtdisk.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ModifyVhdSet")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(virtualdiskhandle, parameters, flags) : 0;
#else
    (void)virtualdiskhandle;
    (void)parameters;
    (void)flags;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_vhd_OpenVirtualDisk_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* virtualstoragetype = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* path = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t virtualdiskaccessmask = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t flags = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* parameters = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* handle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("virtdisk.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "OpenVirtualDisk")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(virtualstoragetype, path, virtualdiskaccessmask, flags, parameters, handle) : 0;
#else
    (void)virtualstoragetype;
    (void)path;
    (void)virtualdiskaccessmask;
    (void)flags;
    (void)parameters;
    (void)handle;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_vhd_QueryChangesVirtualDisk_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* virtualdiskhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* changetrackingid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint64_t byteoffset = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
    uint64_t bytelength = km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0;
    int32_t flags = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* ranges = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* rangecount = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* processedlength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint64_t, uint64_t, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("virtdisk.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "QueryChangesVirtualDisk")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(virtualdiskhandle, changetrackingid, byteoffset, bytelength, flags, ranges, rangecount, processedlength) : 0;
#else
    (void)virtualdiskhandle;
    (void)changetrackingid;
    (void)byteoffset;
    (void)bytelength;
    (void)flags;
    (void)ranges;
    (void)rangecount;
    (void)processedlength;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_vhd_RawSCSIVirtualDisk_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* virtualdiskhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* parameters = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t flags = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* response = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("virtdisk.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RawSCSIVirtualDisk")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(virtualdiskhandle, parameters, flags, response) : 0;
#else
    (void)virtualdiskhandle;
    (void)parameters;
    (void)flags;
    (void)response;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_vhd_ResizeVirtualDisk_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* virtualdiskhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t flags = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* parameters = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* overlapped = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("virtdisk.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ResizeVirtualDisk")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(virtualdiskhandle, flags, parameters, overlapped) : 0;
#else
    (void)virtualdiskhandle;
    (void)flags;
    (void)parameters;
    (void)overlapped;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_vhd_SetVirtualDiskInformation_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* virtualdiskhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* virtualdiskinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("virtdisk.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetVirtualDiskInformation")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(virtualdiskhandle, virtualdiskinfo) : 0;
#else
    (void)virtualdiskhandle;
    (void)virtualdiskinfo;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_vhd_SetVirtualDiskMetadata_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* virtualdiskhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* item = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t metadatasize = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* metadata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("virtdisk.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetVirtualDiskMetadata")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(virtualdiskhandle, item, metadatasize, metadata) : 0;
#else
    (void)virtualdiskhandle;
    (void)item;
    (void)metadatasize;
    (void)metadata;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_vhd_TakeSnapshotVhdSet_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* virtualdiskhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* parameters = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t flags = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("virtdisk.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "TakeSnapshotVhdSet")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(virtualdiskhandle, parameters, flags) : 0;
#else
    (void)virtualdiskhandle;
    (void)parameters;
    (void)flags;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static void register_windows_win32_storage_vhd_napi(Napi::Env env, Napi::Object exports) {
    exports.Set("windowssys_windows_win32_storage_vhd_AddVirtualDiskParent", Napi::Function::New(env, windowssys_windows_win32_storage_vhd_AddVirtualDiskParent_napi));
    exports.Set("windowssys_windows_win32_storage_vhd_ApplySnapshotVhdSet", Napi::Function::New(env, windowssys_windows_win32_storage_vhd_ApplySnapshotVhdSet_napi));
    exports.Set("windowssys_windows_win32_storage_vhd_AttachVirtualDisk", Napi::Function::New(env, windowssys_windows_win32_storage_vhd_AttachVirtualDisk_napi));
    exports.Set("windowssys_windows_win32_storage_vhd_BreakMirrorVirtualDisk", Napi::Function::New(env, windowssys_windows_win32_storage_vhd_BreakMirrorVirtualDisk_napi));
    exports.Set("windowssys_windows_win32_storage_vhd_CompactVirtualDisk", Napi::Function::New(env, windowssys_windows_win32_storage_vhd_CompactVirtualDisk_napi));
    exports.Set("windowssys_windows_win32_storage_vhd_CompleteForkVirtualDisk", Napi::Function::New(env, windowssys_windows_win32_storage_vhd_CompleteForkVirtualDisk_napi));
    exports.Set("windowssys_windows_win32_storage_vhd_CreateVirtualDisk", Napi::Function::New(env, windowssys_windows_win32_storage_vhd_CreateVirtualDisk_napi));
    exports.Set("windowssys_windows_win32_storage_vhd_DeleteSnapshotVhdSet", Napi::Function::New(env, windowssys_windows_win32_storage_vhd_DeleteSnapshotVhdSet_napi));
    exports.Set("windowssys_windows_win32_storage_vhd_DeleteVirtualDiskMetadata", Napi::Function::New(env, windowssys_windows_win32_storage_vhd_DeleteVirtualDiskMetadata_napi));
    exports.Set("windowssys_windows_win32_storage_vhd_DetachVirtualDisk", Napi::Function::New(env, windowssys_windows_win32_storage_vhd_DetachVirtualDisk_napi));
    exports.Set("windowssys_windows_win32_storage_vhd_EnumerateVirtualDiskMetadata", Napi::Function::New(env, windowssys_windows_win32_storage_vhd_EnumerateVirtualDiskMetadata_napi));
    exports.Set("windowssys_windows_win32_storage_vhd_ExpandVirtualDisk", Napi::Function::New(env, windowssys_windows_win32_storage_vhd_ExpandVirtualDisk_napi));
    exports.Set("windowssys_windows_win32_storage_vhd_ForkVirtualDisk", Napi::Function::New(env, windowssys_windows_win32_storage_vhd_ForkVirtualDisk_napi));
    exports.Set("windowssys_windows_win32_storage_vhd_GetAllAttachedVirtualDiskPhysicalPaths", Napi::Function::New(env, windowssys_windows_win32_storage_vhd_GetAllAttachedVirtualDiskPhysicalPaths_napi));
    exports.Set("windowssys_windows_win32_storage_vhd_GetStorageDependencyInformation", Napi::Function::New(env, windowssys_windows_win32_storage_vhd_GetStorageDependencyInformation_napi));
    exports.Set("windowssys_windows_win32_storage_vhd_GetVirtualDiskInformation", Napi::Function::New(env, windowssys_windows_win32_storage_vhd_GetVirtualDiskInformation_napi));
    exports.Set("windowssys_windows_win32_storage_vhd_GetVirtualDiskMetadata", Napi::Function::New(env, windowssys_windows_win32_storage_vhd_GetVirtualDiskMetadata_napi));
    exports.Set("windowssys_windows_win32_storage_vhd_GetVirtualDiskOperationProgress", Napi::Function::New(env, windowssys_windows_win32_storage_vhd_GetVirtualDiskOperationProgress_napi));
    exports.Set("windowssys_windows_win32_storage_vhd_GetVirtualDiskPhysicalPath", Napi::Function::New(env, windowssys_windows_win32_storage_vhd_GetVirtualDiskPhysicalPath_napi));
    exports.Set("windowssys_windows_win32_storage_vhd_MergeVirtualDisk", Napi::Function::New(env, windowssys_windows_win32_storage_vhd_MergeVirtualDisk_napi));
    exports.Set("windowssys_windows_win32_storage_vhd_MirrorVirtualDisk", Napi::Function::New(env, windowssys_windows_win32_storage_vhd_MirrorVirtualDisk_napi));
    exports.Set("windowssys_windows_win32_storage_vhd_ModifyVhdSet", Napi::Function::New(env, windowssys_windows_win32_storage_vhd_ModifyVhdSet_napi));
    exports.Set("windowssys_windows_win32_storage_vhd_OpenVirtualDisk", Napi::Function::New(env, windowssys_windows_win32_storage_vhd_OpenVirtualDisk_napi));
    exports.Set("windowssys_windows_win32_storage_vhd_QueryChangesVirtualDisk", Napi::Function::New(env, windowssys_windows_win32_storage_vhd_QueryChangesVirtualDisk_napi));
    exports.Set("windowssys_windows_win32_storage_vhd_RawSCSIVirtualDisk", Napi::Function::New(env, windowssys_windows_win32_storage_vhd_RawSCSIVirtualDisk_napi));
    exports.Set("windowssys_windows_win32_storage_vhd_ResizeVirtualDisk", Napi::Function::New(env, windowssys_windows_win32_storage_vhd_ResizeVirtualDisk_napi));
    exports.Set("windowssys_windows_win32_storage_vhd_SetVirtualDiskInformation", Napi::Function::New(env, windowssys_windows_win32_storage_vhd_SetVirtualDiskInformation_napi));
    exports.Set("windowssys_windows_win32_storage_vhd_SetVirtualDiskMetadata", Napi::Function::New(env, windowssys_windows_win32_storage_vhd_SetVirtualDiskMetadata_napi));
    exports.Set("windowssys_windows_win32_storage_vhd_TakeSnapshotVhdSet", Napi::Function::New(env, windowssys_windows_win32_storage_vhd_TakeSnapshotVhdSet_napi));
}

static KmNapiRegistrarNode registrar_node = { &register_windows_win32_storage_vhd_napi, nullptr };
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
