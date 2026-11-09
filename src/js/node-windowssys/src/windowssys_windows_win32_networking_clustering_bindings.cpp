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

static Napi::Value windowssys_windows_win32_networking_clustering_AddClusterGroupDependency_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hdependentgroup = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t hprovidergroup = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "AddClusterGroupDependency")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hdependentgroup, hprovidergroup) : 0;
#else
    (void)hdependentgroup;
    (void)hprovidergroup;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_AddClusterGroupDependencyEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hdependentgroup = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t hprovidergroup = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
    void* lpszreason = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "AddClusterGroupDependencyEx")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hdependentgroup, hprovidergroup, lpszreason) : 0;
#else
    (void)hdependentgroup;
    (void)hprovidergroup;
    (void)lpszreason;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_AddClusterGroupSetDependency_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hdependentgroupset = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t hprovidergroupset = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "AddClusterGroupSetDependency")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hdependentgroupset, hprovidergroupset) : 0;
#else
    (void)hdependentgroupset;
    (void)hprovidergroupset;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_AddClusterGroupSetDependencyEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hdependentgroupset = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t hprovidergroupset = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
    void* lpszreason = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "AddClusterGroupSetDependencyEx")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hdependentgroupset, hprovidergroupset, lpszreason) : 0;
#else
    (void)hdependentgroupset;
    (void)hprovidergroupset;
    (void)lpszreason;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_AddClusterGroupToGroupSetDependency_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hdependentgroup = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t hprovidergroupset = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "AddClusterGroupToGroupSetDependency")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hdependentgroup, hprovidergroupset) : 0;
#else
    (void)hdependentgroup;
    (void)hprovidergroupset;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_AddClusterGroupToGroupSetDependencyEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hdependentgroup = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t hprovidergroupset = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
    void* lpszreason = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "AddClusterGroupToGroupSetDependencyEx")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hdependentgroup, hprovidergroupset, lpszreason) : 0;
#else
    (void)hdependentgroup;
    (void)hprovidergroupset;
    (void)lpszreason;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_AddClusterNode_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hcluster = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* lpsznodename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pfnprogresscallback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pvcallbackarg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "AddClusterNode")));
    }
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcluster, lpsznodename, pfnprogresscallback, pvcallbackarg) : -1;
#else
    (void)hcluster;
    (void)lpsznodename;
    (void)pfnprogresscallback;
    (void)pvcallbackarg;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_networking_clustering_AddClusterNodeEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hcluster = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* lpsznodename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pfnprogresscallback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pvcallbackarg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "AddClusterNodeEx")));
    }
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcluster, lpsznodename, dwflags, pfnprogresscallback, pvcallbackarg) : -1;
#else
    (void)hcluster;
    (void)lpsznodename;
    (void)dwflags;
    (void)pfnprogresscallback;
    (void)pvcallbackarg;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_networking_clustering_AddClusterResourceDependency_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hresource = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t hdependson = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "AddClusterResourceDependency")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hresource, hdependson) : 0;
#else
    (void)hresource;
    (void)hdependson;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_AddClusterResourceDependencyEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hresource = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t hdependson = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
    void* lpszreason = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "AddClusterResourceDependencyEx")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hresource, hdependson, lpszreason) : 0;
#else
    (void)hresource;
    (void)hdependson;
    (void)lpszreason;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_AddClusterResourceNode_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hresource = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t hnode = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "AddClusterResourceNode")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hresource, hnode) : 0;
#else
    (void)hresource;
    (void)hnode;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_AddClusterResourceNodeEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hresource = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t hnode = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
    void* lpszreason = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "AddClusterResourceNodeEx")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hresource, hnode, lpszreason) : 0;
#else
    (void)hresource;
    (void)hnode;
    (void)lpszreason;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_AddClusterStorageNode_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hcluster = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* lpsznodename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pfnprogresscallback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pvcallbackarg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* lpszclusterstoragenodedescription = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* lpszclusterstoragenodelocation = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "AddClusterStorageNode")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcluster, lpsznodename, pfnprogresscallback, pvcallbackarg, lpszclusterstoragenodedescription, lpszclusterstoragenodelocation) : 0;
#else
    (void)hcluster;
    (void)lpsznodename;
    (void)pfnprogresscallback;
    (void)pvcallbackarg;
    (void)lpszclusterstoragenodedescription;
    (void)lpszclusterstoragenodelocation;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_AddCrossClusterGroupSetDependency_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hdependentgroupset = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* lpremoteclustername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* lpremotegroupsetname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "AddCrossClusterGroupSetDependency")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hdependentgroupset, lpremoteclustername, lpremotegroupsetname) : 0;
#else
    (void)hdependentgroupset;
    (void)lpremoteclustername;
    (void)lpremotegroupsetname;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_AddResourceToClusterSharedVolumes_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hresource = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "AddResourceToClusterSharedVolumes")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hresource) : 0;
#else
    (void)hresource;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_BackupClusterDatabase_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hcluster = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* lpszpathname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "BackupClusterDatabase")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcluster, lpszpathname) : 0;
#else
    (void)hcluster;
    (void)lpszpathname;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_CanResourceBeDependent_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hresource = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t hresourcedependent = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CanResourceBeDependent")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hresource, hresourcedependent) : -1;
#else
    (void)hresource;
    (void)hresourcedependent;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_CancelClusterGroupOperation_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hgroup = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint32_t dwcancelflags_reserved = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CancelClusterGroupOperation")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hgroup, dwcancelflags_reserved) : 0;
#else
    (void)hgroup;
    (void)dwcancelflags_reserved;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ChangeClusterResourceGroup_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hresource = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t hgroup = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ChangeClusterResourceGroup")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hresource, hgroup) : 0;
#else
    (void)hresource;
    (void)hgroup;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ChangeClusterResourceGroupEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hresource = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t hgroup = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
    uint64_t flags = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ChangeClusterResourceGroupEx")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hresource, hgroup, flags) : 0;
#else
    (void)hresource;
    (void)hgroup;
    (void)flags;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ChangeClusterResourceGroupEx2_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hresource = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t hgroup = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
    uint64_t flags = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
    void* lpszreason = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, uint64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ChangeClusterResourceGroupEx2")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hresource, hgroup, flags, lpszreason) : 0;
#else
    (void)hresource;
    (void)hgroup;
    (void)flags;
    (void)lpszreason;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_CloseCluster_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hcluster = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CloseCluster")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcluster) : -1;
#else
    (void)hcluster;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_CloseClusterCryptProvider_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hcluscryptprovider = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CloseClusterCryptProvider")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcluscryptprovider) : 0;
#else
    (void)hcluscryptprovider;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_CloseClusterGroup_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hgroup = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CloseClusterGroup")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hgroup) : -1;
#else
    (void)hgroup;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_CloseClusterGroupSet_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hgroupset = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CloseClusterGroupSet")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hgroupset) : -1;
#else
    (void)hgroupset;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_CloseClusterNetInterface_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hnetinterface = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CloseClusterNetInterface")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hnetinterface) : -1;
#else
    (void)hnetinterface;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_CloseClusterNetwork_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hnetwork = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CloseClusterNetwork")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hnetwork) : -1;
#else
    (void)hnetwork;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_CloseClusterNode_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hnode = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CloseClusterNode")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hnode) : -1;
#else
    (void)hnode;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_CloseClusterNotifyPort_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hchange = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CloseClusterNotifyPort")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hchange) : -1;
#else
    (void)hchange;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_CloseClusterResource_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hresource = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CloseClusterResource")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hresource) : -1;
#else
    (void)hresource;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ClusAddClusterHealthFault_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hcluster = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* failure = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t param2 = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ClusAddClusterHealthFault")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcluster, failure, param2) : 0;
#else
    (void)hcluster;
    (void)failure;
    (void)param2;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ClusGetClusterHealthFaults_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hcluster = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* objects = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ClusGetClusterHealthFaults")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcluster, objects, flags) : 0;
#else
    (void)hcluster;
    (void)objects;
    (void)flags;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ClusRemoveClusterHealthFault_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hcluster = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* id = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ClusRemoveClusterHealthFault")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcluster, id, flags) : 0;
#else
    (void)hcluster;
    (void)id;
    (void)flags;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ClusWorkerCheckTerminate_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpworker = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ClusWorkerCheckTerminate")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpworker) : -1;
#else
    (void)lpworker;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ClusWorkerCreate_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpworker = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpstartaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* lpparameter = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ClusWorkerCreate")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpworker, lpstartaddress, lpparameter) : 0;
#else
    (void)lpworker;
    (void)lpstartaddress;
    (void)lpparameter;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ClusWorkerTerminate_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpworker = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ClusWorkerTerminate")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(lpworker);
#else
    (void)lpworker;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_networking_clustering_ClusWorkerTerminateEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* clusworker = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t timeoutinmilliseconds = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t waitonly = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ClusWorkerTerminateEx")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(clusworker, timeoutinmilliseconds, waitonly) : 0;
#else
    (void)clusworker;
    (void)timeoutinmilliseconds;
    (void)waitonly;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ClusWorkersTerminate_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* clusworkers = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t clusworkerscount = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    uint32_t timeoutinmilliseconds = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t waitonly = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ClusWorkersTerminate")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(clusworkers, clusworkerscount, timeoutinmilliseconds, waitonly) : 0;
#else
    (void)clusworkers;
    (void)clusworkerscount;
    (void)timeoutinmilliseconds;
    (void)waitonly;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ClusapiSetReasonHandler_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lphandler = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ClusapiSetReasonHandler")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lphandler) : NULL;
#else
    (void)lphandler;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ClusterAddGroupToAffinityRule_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hcluster = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* rulename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int64_t hgroup = km_info.Length() > 2 ? km_napi_arg_i64(km_info[2]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ClusterAddGroupToAffinityRule")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcluster, rulename, hgroup) : 0;
#else
    (void)hcluster;
    (void)rulename;
    (void)hgroup;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ClusterAddGroupToGroupSet_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hgroupset = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t hgroup = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ClusterAddGroupToGroupSet")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hgroupset, hgroup) : 0;
#else
    (void)hgroupset;
    (void)hgroup;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ClusterAddGroupToGroupSetWithDomains_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hgroupset = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t hgroup = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
    uint32_t faultdomain = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t updatedomain = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ClusterAddGroupToGroupSetWithDomains")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hgroupset, hgroup, faultdomain, updatedomain) : 0;
#else
    (void)hgroupset;
    (void)hgroup;
    (void)faultdomain;
    (void)updatedomain;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ClusterAddGroupToGroupSetWithDomainsEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hgroupset = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t hgroup = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
    uint32_t faultdomain = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t updatedomain = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* lpszreason = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ClusterAddGroupToGroupSetWithDomainsEx")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hgroupset, hgroup, faultdomain, updatedomain, lpszreason) : 0;
#else
    (void)hgroupset;
    (void)hgroup;
    (void)faultdomain;
    (void)updatedomain;
    (void)lpszreason;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ClusterAffinityRuleControl_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hcluster = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* affinityrulename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int64_t hhostnode = km_info.Length() > 2 ? km_napi_arg_i64(km_info[2]) : 0;
    uint32_t dwcontrolcode = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* lpinbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t cbinbuffersize = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* lpoutbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    uint32_t cboutbuffersize = static_cast<uint32_t>(km_info.Length() > 7 ? km_info[7].ToNumber().Int32Value() : 0);
    void* lpbytesreturned = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, int64_t, uint32_t, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ClusterAffinityRuleControl")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcluster, affinityrulename, hhostnode, dwcontrolcode, lpinbuffer, cbinbuffersize, lpoutbuffer, cboutbuffersize, lpbytesreturned) : 0;
#else
    (void)hcluster;
    (void)affinityrulename;
    (void)hhostnode;
    (void)dwcontrolcode;
    (void)lpinbuffer;
    (void)cbinbuffersize;
    (void)lpoutbuffer;
    (void)cboutbuffersize;
    (void)lpbytesreturned;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ClusterClearBackupStateForSharedVolume_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpszvolumepathname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ClusterClearBackupStateForSharedVolume")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpszvolumepathname) : 0;
#else
    (void)lpszvolumepathname;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ClusterCloseEnum_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t henum = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ClusterCloseEnum")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(henum) : 0;
#else
    (void)henum;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ClusterCloseEnumEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hclusterenum = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ClusterCloseEnumEx")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hclusterenum) : 0;
#else
    (void)hclusterenum;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ClusterControl_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hcluster = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t hhostnode = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
    uint32_t dwcontrolcode = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* lpinbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t ninbuffersize = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* lpoutbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    uint32_t noutbuffersize = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    void* lpbytesreturned = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, uint32_t, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ClusterControl")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcluster, hhostnode, dwcontrolcode, lpinbuffer, ninbuffersize, lpoutbuffer, noutbuffersize, lpbytesreturned) : 0;
#else
    (void)hcluster;
    (void)hhostnode;
    (void)dwcontrolcode;
    (void)lpinbuffer;
    (void)ninbuffersize;
    (void)lpoutbuffer;
    (void)noutbuffersize;
    (void)lpbytesreturned;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ClusterControlEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hcluster = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t hhostnode = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
    uint32_t dwcontrolcode = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* lpinbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t ninbuffersize = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* lpoutbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    uint32_t noutbuffersize = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    void* lpbytesreturned = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    void* lpszreason = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, uint32_t, void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ClusterControlEx")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcluster, hhostnode, dwcontrolcode, lpinbuffer, ninbuffersize, lpoutbuffer, noutbuffersize, lpbytesreturned, lpszreason) : 0;
#else
    (void)hcluster;
    (void)hhostnode;
    (void)dwcontrolcode;
    (void)lpinbuffer;
    (void)ninbuffersize;
    (void)lpoutbuffer;
    (void)noutbuffersize;
    (void)lpbytesreturned;
    (void)lpszreason;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ClusterCreateAffinityRule_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hcluster = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* rulename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t ruletype = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ClusterCreateAffinityRule")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcluster, rulename, ruletype) : 0;
#else
    (void)hcluster;
    (void)rulename;
    (void)ruletype;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ClusterDecrypt_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hcluscryptprovider = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* pcryptinput = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t cbcryptinput = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* ppcryptoutput = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pcbcryptoutput = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ClusterDecrypt")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcluscryptprovider, pcryptinput, cbcryptinput, ppcryptoutput, pcbcryptoutput) : 0;
#else
    (void)hcluscryptprovider;
    (void)pcryptinput;
    (void)cbcryptinput;
    (void)ppcryptoutput;
    (void)pcbcryptoutput;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ClusterEncrypt_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hcluscryptprovider = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* pdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t cbdata = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* ppdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pcbdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ClusterEncrypt")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcluscryptprovider, pdata, cbdata, ppdata, pcbdata) : 0;
#else
    (void)hcluscryptprovider;
    (void)pdata;
    (void)cbdata;
    (void)ppdata;
    (void)pcbdata;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ClusterEnum_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t henum = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint32_t dwindex = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* lpdwtype = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* lpszname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* lpcchname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ClusterEnum")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(henum, dwindex, lpdwtype, lpszname, lpcchname) : 0;
#else
    (void)henum;
    (void)dwindex;
    (void)lpdwtype;
    (void)lpszname;
    (void)lpcchname;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ClusterEnumEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hclusterenum = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint32_t dwindex = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pitem = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* cbitem = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ClusterEnumEx")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hclusterenum, dwindex, pitem, cbitem) : 0;
#else
    (void)hclusterenum;
    (void)dwindex;
    (void)pitem;
    (void)cbitem;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ClusterGetEnumCount_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t henum = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ClusterGetEnumCount")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(henum) : 0;
#else
    (void)henum;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ClusterGetEnumCountEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hclusterenum = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ClusterGetEnumCountEx")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hclusterenum) : 0;
#else
    (void)hclusterenum;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ClusterGetVolumeNameForVolumeMountPoint_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpszvolumemountpoint = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpszvolumename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t cchbufferlength = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ClusterGetVolumeNameForVolumeMountPoint")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpszvolumemountpoint, lpszvolumename, cchbufferlength) : -1;
#else
    (void)lpszvolumemountpoint;
    (void)lpszvolumename;
    (void)cchbufferlength;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ClusterGetVolumePathName_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpszfilename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpszvolumepathname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t cchbufferlength = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ClusterGetVolumePathName")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpszfilename, lpszvolumepathname, cchbufferlength) : -1;
#else
    (void)lpszfilename;
    (void)lpszvolumepathname;
    (void)cchbufferlength;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ClusterGroupCloseEnum_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hgroupenum = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ClusterGroupCloseEnum")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hgroupenum) : 0;
#else
    (void)hgroupenum;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ClusterGroupCloseEnumEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hgroupenumex = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ClusterGroupCloseEnumEx")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hgroupenumex) : 0;
#else
    (void)hgroupenumex;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ClusterGroupControl_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hgroup = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t hhostnode = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
    uint32_t dwcontrolcode = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* lpinbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t ninbuffersize = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* lpoutbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    uint32_t noutbuffersize = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    void* lpbytesreturned = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, uint32_t, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ClusterGroupControl")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hgroup, hhostnode, dwcontrolcode, lpinbuffer, ninbuffersize, lpoutbuffer, noutbuffersize, lpbytesreturned) : 0;
#else
    (void)hgroup;
    (void)hhostnode;
    (void)dwcontrolcode;
    (void)lpinbuffer;
    (void)ninbuffersize;
    (void)lpoutbuffer;
    (void)noutbuffersize;
    (void)lpbytesreturned;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ClusterGroupControlEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hgroup = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t hhostnode = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
    uint32_t dwcontrolcode = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* lpinbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t ninbuffersize = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* lpoutbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    uint32_t noutbuffersize = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    void* lpbytesreturned = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    void* lpszreason = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, uint32_t, void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ClusterGroupControlEx")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hgroup, hhostnode, dwcontrolcode, lpinbuffer, ninbuffersize, lpoutbuffer, noutbuffersize, lpbytesreturned, lpszreason) : 0;
#else
    (void)hgroup;
    (void)hhostnode;
    (void)dwcontrolcode;
    (void)lpinbuffer;
    (void)ninbuffersize;
    (void)lpoutbuffer;
    (void)noutbuffersize;
    (void)lpbytesreturned;
    (void)lpszreason;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ClusterGroupEnum_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hgroupenum = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint32_t dwindex = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* lpdwtype = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* lpszresourcename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* lpcchname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ClusterGroupEnum")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hgroupenum, dwindex, lpdwtype, lpszresourcename, lpcchname) : 0;
#else
    (void)hgroupenum;
    (void)dwindex;
    (void)lpdwtype;
    (void)lpszresourcename;
    (void)lpcchname;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ClusterGroupEnumEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hgroupenumex = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint32_t dwindex = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pitem = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* cbitem = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ClusterGroupEnumEx")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hgroupenumex, dwindex, pitem, cbitem) : 0;
#else
    (void)hgroupenumex;
    (void)dwindex;
    (void)pitem;
    (void)cbitem;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ClusterGroupGetEnumCount_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hgroupenum = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ClusterGroupGetEnumCount")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hgroupenum) : 0;
#else
    (void)hgroupenum;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ClusterGroupGetEnumCountEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hgroupenumex = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ClusterGroupGetEnumCountEx")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hgroupenumex) : 0;
#else
    (void)hgroupenumex;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ClusterGroupOpenEnum_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hgroup = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint32_t dwtype = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ClusterGroupOpenEnum")));
    }
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hgroup, dwtype) : -1;
#else
    (void)hgroup;
    (void)dwtype;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ClusterGroupOpenEnumEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hcluster = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* lpszproperties = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t cbproperties = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* lpszroproperties = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t cbroproperties = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ClusterGroupOpenEnumEx")));
    }
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcluster, lpszproperties, cbproperties, lpszroproperties, cbroproperties, dwflags) : -1;
#else
    (void)hcluster;
    (void)lpszproperties;
    (void)cbproperties;
    (void)lpszroproperties;
    (void)cbroproperties;
    (void)dwflags;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ClusterGroupSetCloseEnum_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hgroupsetenum = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ClusterGroupSetCloseEnum")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hgroupsetenum) : 0;
#else
    (void)hgroupsetenum;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ClusterGroupSetControl_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hgroupset = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t hhostnode = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
    uint32_t dwcontrolcode = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* lpinbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t cbinbuffersize = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* lpoutbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    uint32_t cboutbuffersize = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    void* lpbytesreturned = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, uint32_t, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ClusterGroupSetControl")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hgroupset, hhostnode, dwcontrolcode, lpinbuffer, cbinbuffersize, lpoutbuffer, cboutbuffersize, lpbytesreturned) : 0;
#else
    (void)hgroupset;
    (void)hhostnode;
    (void)dwcontrolcode;
    (void)lpinbuffer;
    (void)cbinbuffersize;
    (void)lpoutbuffer;
    (void)cboutbuffersize;
    (void)lpbytesreturned;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ClusterGroupSetControlEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hgroupset = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t hhostnode = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
    uint32_t dwcontrolcode = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* lpinbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t cbinbuffersize = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* lpoutbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    uint32_t cboutbuffersize = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    void* lpbytesreturned = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    void* lpszreason = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, uint32_t, void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ClusterGroupSetControlEx")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hgroupset, hhostnode, dwcontrolcode, lpinbuffer, cbinbuffersize, lpoutbuffer, cboutbuffersize, lpbytesreturned, lpszreason) : 0;
#else
    (void)hgroupset;
    (void)hhostnode;
    (void)dwcontrolcode;
    (void)lpinbuffer;
    (void)cbinbuffersize;
    (void)lpoutbuffer;
    (void)cboutbuffersize;
    (void)lpbytesreturned;
    (void)lpszreason;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ClusterGroupSetEnum_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hgroupsetenum = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint32_t dwindex = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* lpszname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* lpcchname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ClusterGroupSetEnum")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hgroupsetenum, dwindex, lpszname, lpcchname) : 0;
#else
    (void)hgroupsetenum;
    (void)dwindex;
    (void)lpszname;
    (void)lpcchname;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ClusterGroupSetGetEnumCount_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hgroupsetenum = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ClusterGroupSetGetEnumCount")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hgroupsetenum) : 0;
#else
    (void)hgroupsetenum;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ClusterGroupSetOpenEnum_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hcluster = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ClusterGroupSetOpenEnum")));
    }
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcluster) : -1;
#else
    (void)hcluster;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ClusterIsPathOnSharedVolume_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpszpathname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ClusterIsPathOnSharedVolume")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpszpathname) : -1;
#else
    (void)lpszpathname;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ClusterNetInterfaceCloseEnum_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hnetinterfaceenum = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ClusterNetInterfaceCloseEnum")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hnetinterfaceenum) : 0;
#else
    (void)hnetinterfaceenum;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ClusterNetInterfaceControl_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hnetinterface = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t hhostnode = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
    uint32_t dwcontrolcode = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* lpinbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t ninbuffersize = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* lpoutbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    uint32_t noutbuffersize = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    void* lpbytesreturned = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, uint32_t, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ClusterNetInterfaceControl")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hnetinterface, hhostnode, dwcontrolcode, lpinbuffer, ninbuffersize, lpoutbuffer, noutbuffersize, lpbytesreturned) : 0;
#else
    (void)hnetinterface;
    (void)hhostnode;
    (void)dwcontrolcode;
    (void)lpinbuffer;
    (void)ninbuffersize;
    (void)lpoutbuffer;
    (void)noutbuffersize;
    (void)lpbytesreturned;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ClusterNetInterfaceControlEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hnetinterface = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t hhostnode = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
    uint32_t dwcontrolcode = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* lpinbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t ninbuffersize = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* lpoutbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    uint32_t noutbuffersize = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    void* lpbytesreturned = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    void* lpszreason = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, uint32_t, void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ClusterNetInterfaceControlEx")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hnetinterface, hhostnode, dwcontrolcode, lpinbuffer, ninbuffersize, lpoutbuffer, noutbuffersize, lpbytesreturned, lpszreason) : 0;
#else
    (void)hnetinterface;
    (void)hhostnode;
    (void)dwcontrolcode;
    (void)lpinbuffer;
    (void)ninbuffersize;
    (void)lpoutbuffer;
    (void)noutbuffersize;
    (void)lpbytesreturned;
    (void)lpszreason;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ClusterNetInterfaceEnum_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hnetinterfaceenum = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint32_t dwindex = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* lpszname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* lpcchname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ClusterNetInterfaceEnum")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hnetinterfaceenum, dwindex, lpszname, lpcchname) : 0;
#else
    (void)hnetinterfaceenum;
    (void)dwindex;
    (void)lpszname;
    (void)lpcchname;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ClusterNetInterfaceOpenEnum_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hcluster = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* lpsznodename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* lpsznetworkname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ClusterNetInterfaceOpenEnum")));
    }
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcluster, lpsznodename, lpsznetworkname) : -1;
#else
    (void)hcluster;
    (void)lpsznodename;
    (void)lpsznetworkname;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ClusterNetworkCloseEnum_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hnetworkenum = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ClusterNetworkCloseEnum")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hnetworkenum) : 0;
#else
    (void)hnetworkenum;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ClusterNetworkControl_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hnetwork = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t hhostnode = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
    uint32_t dwcontrolcode = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* lpinbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t ninbuffersize = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* lpoutbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    uint32_t noutbuffersize = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    void* lpbytesreturned = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, uint32_t, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ClusterNetworkControl")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hnetwork, hhostnode, dwcontrolcode, lpinbuffer, ninbuffersize, lpoutbuffer, noutbuffersize, lpbytesreturned) : 0;
#else
    (void)hnetwork;
    (void)hhostnode;
    (void)dwcontrolcode;
    (void)lpinbuffer;
    (void)ninbuffersize;
    (void)lpoutbuffer;
    (void)noutbuffersize;
    (void)lpbytesreturned;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ClusterNetworkControlEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hnetwork = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t hhostnode = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
    uint32_t dwcontrolcode = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* lpinbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t ninbuffersize = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* lpoutbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    uint32_t noutbuffersize = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    void* lpbytesreturned = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    void* lpszreason = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, uint32_t, void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ClusterNetworkControlEx")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hnetwork, hhostnode, dwcontrolcode, lpinbuffer, ninbuffersize, lpoutbuffer, noutbuffersize, lpbytesreturned, lpszreason) : 0;
#else
    (void)hnetwork;
    (void)hhostnode;
    (void)dwcontrolcode;
    (void)lpinbuffer;
    (void)ninbuffersize;
    (void)lpoutbuffer;
    (void)noutbuffersize;
    (void)lpbytesreturned;
    (void)lpszreason;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ClusterNetworkEnum_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hnetworkenum = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint32_t dwindex = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* lpdwtype = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* lpszname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* lpcchname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ClusterNetworkEnum")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hnetworkenum, dwindex, lpdwtype, lpszname, lpcchname) : 0;
#else
    (void)hnetworkenum;
    (void)dwindex;
    (void)lpdwtype;
    (void)lpszname;
    (void)lpcchname;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ClusterNetworkGetEnumCount_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hnetworkenum = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ClusterNetworkGetEnumCount")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hnetworkenum) : 0;
#else
    (void)hnetworkenum;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ClusterNetworkOpenEnum_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hnetwork = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint32_t dwtype = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ClusterNetworkOpenEnum")));
    }
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hnetwork, dwtype) : -1;
#else
    (void)hnetwork;
    (void)dwtype;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ClusterNodeCloseEnum_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hnodeenum = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ClusterNodeCloseEnum")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hnodeenum) : 0;
#else
    (void)hnodeenum;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ClusterNodeCloseEnumEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hnodeenum = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ClusterNodeCloseEnumEx")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hnodeenum) : 0;
#else
    (void)hnodeenum;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ClusterNodeControl_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hnode = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t hhostnode = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
    uint32_t dwcontrolcode = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* lpinbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t ninbuffersize = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* lpoutbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    uint32_t noutbuffersize = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    void* lpbytesreturned = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, uint32_t, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ClusterNodeControl")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hnode, hhostnode, dwcontrolcode, lpinbuffer, ninbuffersize, lpoutbuffer, noutbuffersize, lpbytesreturned) : 0;
#else
    (void)hnode;
    (void)hhostnode;
    (void)dwcontrolcode;
    (void)lpinbuffer;
    (void)ninbuffersize;
    (void)lpoutbuffer;
    (void)noutbuffersize;
    (void)lpbytesreturned;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ClusterNodeControlEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hnode = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t hhostnode = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
    uint32_t dwcontrolcode = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* lpinbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t ninbuffersize = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* lpoutbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    uint32_t noutbuffersize = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    void* lpbytesreturned = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    void* lpszreason = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, uint32_t, void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ClusterNodeControlEx")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hnode, hhostnode, dwcontrolcode, lpinbuffer, ninbuffersize, lpoutbuffer, noutbuffersize, lpbytesreturned, lpszreason) : 0;
#else
    (void)hnode;
    (void)hhostnode;
    (void)dwcontrolcode;
    (void)lpinbuffer;
    (void)ninbuffersize;
    (void)lpoutbuffer;
    (void)noutbuffersize;
    (void)lpbytesreturned;
    (void)lpszreason;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ClusterNodeEnum_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hnodeenum = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint32_t dwindex = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* lpdwtype = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* lpszname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* lpcchname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ClusterNodeEnum")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hnodeenum, dwindex, lpdwtype, lpszname, lpcchname) : 0;
#else
    (void)hnodeenum;
    (void)dwindex;
    (void)lpdwtype;
    (void)lpszname;
    (void)lpcchname;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ClusterNodeEnumEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hnodeenum = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint32_t dwindex = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pitem = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* cbitem = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ClusterNodeEnumEx")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hnodeenum, dwindex, pitem, cbitem) : 0;
#else
    (void)hnodeenum;
    (void)dwindex;
    (void)pitem;
    (void)cbitem;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ClusterNodeGetEnumCount_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hnodeenum = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ClusterNodeGetEnumCount")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hnodeenum) : 0;
#else
    (void)hnodeenum;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ClusterNodeGetEnumCountEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hnodeenum = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ClusterNodeGetEnumCountEx")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hnodeenum) : 0;
#else
    (void)hnodeenum;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ClusterNodeOpenEnum_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hnode = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint32_t dwtype = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ClusterNodeOpenEnum")));
    }
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hnode, dwtype) : -1;
#else
    (void)hnode;
    (void)dwtype;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ClusterNodeOpenEnumEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hnode = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint32_t dwtype = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* poptions = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ClusterNodeOpenEnumEx")));
    }
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hnode, dwtype, poptions) : -1;
#else
    (void)hnode;
    (void)dwtype;
    (void)poptions;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ClusterNodeReplacement_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hcluster = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* lpsznodenamecurrent = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* lpsznodenamenew = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ClusterNodeReplacement")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcluster, lpsznodenamecurrent, lpsznodenamenew) : 0;
#else
    (void)hcluster;
    (void)lpsznodenamecurrent;
    (void)lpsznodenamenew;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ClusterOpenEnum_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hcluster = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint32_t dwtype = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ClusterOpenEnum")));
    }
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcluster, dwtype) : -1;
#else
    (void)hcluster;
    (void)dwtype;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ClusterOpenEnumEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hcluster = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint32_t dwtype = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* poptions = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ClusterOpenEnumEx")));
    }
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcluster, dwtype, poptions) : -1;
#else
    (void)hcluster;
    (void)dwtype;
    (void)poptions;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ClusterPrepareSharedVolumeForBackup_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpszfilename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpszvolumepathname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* lpcchvolumepathname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* lpszvolumename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* lpcchvolumename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ClusterPrepareSharedVolumeForBackup")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpszfilename, lpszvolumepathname, lpcchvolumepathname, lpszvolumename, lpcchvolumename) : 0;
#else
    (void)lpszfilename;
    (void)lpszvolumepathname;
    (void)lpcchvolumepathname;
    (void)lpszvolumename;
    (void)lpcchvolumename;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ClusterRegBatchAddCommand_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hregbatch = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int32_t dwcommand = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* wzname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t dwoptions = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* lpdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t cbdata = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ClusterRegBatchAddCommand")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hregbatch, dwcommand, wzname, dwoptions, lpdata, cbdata) : -1;
#else
    (void)hregbatch;
    (void)dwcommand;
    (void)wzname;
    (void)dwoptions;
    (void)lpdata;
    (void)cbdata;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ClusterRegBatchCloseNotification_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hbatchnotification = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ClusterRegBatchCloseNotification")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hbatchnotification) : -1;
#else
    (void)hbatchnotification;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ClusterRegBatchReadCommand_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hbatchnotification = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* pbatchcommand = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ClusterRegBatchReadCommand")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hbatchnotification, pbatchcommand) : -1;
#else
    (void)hbatchnotification;
    (void)pbatchcommand;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ClusterRegCloseBatch_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hregbatch = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int32_t bcommit = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* failedcommandnumber = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ClusterRegCloseBatch")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hregbatch, bcommit, failedcommandnumber) : -1;
#else
    (void)hregbatch;
    (void)bcommit;
    (void)failedcommandnumber;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ClusterRegCloseBatchEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hregbatch = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* failedcommandnumber = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ClusterRegCloseBatchEx")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hregbatch, flags, failedcommandnumber) : -1;
#else
    (void)hregbatch;
    (void)flags;
    (void)failedcommandnumber;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ClusterRegCloseBatchNotifyPort_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hbatchnotifyport = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ClusterRegCloseBatchNotifyPort")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hbatchnotifyport) : -1;
#else
    (void)hbatchnotifyport;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ClusterRegCloseKey_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ClusterRegCloseKey")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hkey) : -1;
#else
    (void)hkey;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ClusterRegCloseReadBatch_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hregreadbatch = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* phregreadbatchreply = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ClusterRegCloseReadBatch")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hregreadbatch, phregreadbatchreply) : -1;
#else
    (void)hregreadbatch;
    (void)phregreadbatchreply;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ClusterRegCloseReadBatchEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hregreadbatch = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* phregreadbatchreply = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ClusterRegCloseReadBatchEx")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hregreadbatch, flags, phregreadbatchreply) : -1;
#else
    (void)hregreadbatch;
    (void)flags;
    (void)phregreadbatchreply;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ClusterRegCloseReadBatchReply_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hregreadbatchreply = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ClusterRegCloseReadBatchReply")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hregreadbatchreply) : -1;
#else
    (void)hregreadbatchreply;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ClusterRegCreateBatch_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* phregbatch = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ClusterRegCreateBatch")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hkey, phregbatch) : -1;
#else
    (void)hkey;
    (void)phregbatch;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ClusterRegCreateBatchNotifyPort_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* phbatchnotifyport = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ClusterRegCreateBatchNotifyPort")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hkey, phbatchnotifyport) : -1;
#else
    (void)hkey;
    (void)phbatchnotifyport;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ClusterRegCreateKey_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpszsubkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwoptions = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t samdesired = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* lpsecurityattributes = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* phkresult = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* lpdwdisposition = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ClusterRegCreateKey")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hkey, lpszsubkey, dwoptions, samdesired, lpsecurityattributes, phkresult, lpdwdisposition) : -1;
#else
    (void)hkey;
    (void)lpszsubkey;
    (void)dwoptions;
    (void)samdesired;
    (void)lpsecurityattributes;
    (void)phkresult;
    (void)lpdwdisposition;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ClusterRegCreateKeyEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpsubkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwoptions = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t samdesired = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* lpsecurityattributes = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* phkresult = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* lpdwdisposition = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* lpszreason = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ClusterRegCreateKeyEx")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hkey, lpsubkey, dwoptions, samdesired, lpsecurityattributes, phkresult, lpdwdisposition, lpszreason) : -1;
#else
    (void)hkey;
    (void)lpsubkey;
    (void)dwoptions;
    (void)samdesired;
    (void)lpsecurityattributes;
    (void)phkresult;
    (void)lpdwdisposition;
    (void)lpszreason;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ClusterRegCreateReadBatch_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* phregreadbatch = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ClusterRegCreateReadBatch")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hkey, phregreadbatch) : -1;
#else
    (void)hkey;
    (void)phregreadbatch;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ClusterRegDeleteKey_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpszsubkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ClusterRegDeleteKey")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hkey, lpszsubkey) : -1;
#else
    (void)hkey;
    (void)lpszsubkey;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ClusterRegDeleteKeyEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpsubkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* lpszreason = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ClusterRegDeleteKeyEx")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hkey, lpsubkey, lpszreason) : -1;
#else
    (void)hkey;
    (void)lpsubkey;
    (void)lpszreason;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ClusterRegDeleteValue_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpszvaluename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ClusterRegDeleteValue")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hkey, lpszvaluename) : 0;
#else
    (void)hkey;
    (void)lpszvaluename;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ClusterRegDeleteValueEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpszvaluename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* lpszreason = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ClusterRegDeleteValueEx")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hkey, lpszvaluename, lpszreason) : 0;
#else
    (void)hkey;
    (void)lpszvaluename;
    (void)lpszreason;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ClusterRegEnumKey_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwindex = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* lpszname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* lpcchname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* lpftlastwritetime = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ClusterRegEnumKey")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hkey, dwindex, lpszname, lpcchname, lpftlastwritetime) : -1;
#else
    (void)hkey;
    (void)dwindex;
    (void)lpszname;
    (void)lpcchname;
    (void)lpftlastwritetime;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ClusterRegEnumValue_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwindex = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* lpszvaluename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* lpcchvaluename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* lpdwtype = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* lpdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* lpcbdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ClusterRegEnumValue")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hkey, dwindex, lpszvaluename, lpcchvaluename, lpdwtype, lpdata, lpcbdata) : 0;
#else
    (void)hkey;
    (void)dwindex;
    (void)lpszvaluename;
    (void)lpcchvaluename;
    (void)lpdwtype;
    (void)lpdata;
    (void)lpcbdata;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ClusterRegGetBatchNotification_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hbatchnotify = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* phbatchnotification = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ClusterRegGetBatchNotification")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hbatchnotify, phbatchnotification) : -1;
#else
    (void)hbatchnotify;
    (void)phbatchnotification;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ClusterRegGetKeySecurity_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t requestedinformation = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* psecuritydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* lpcbsecuritydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ClusterRegGetKeySecurity")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hkey, requestedinformation, psecuritydescriptor, lpcbsecuritydescriptor) : -1;
#else
    (void)hkey;
    (void)requestedinformation;
    (void)psecuritydescriptor;
    (void)lpcbsecuritydescriptor;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ClusterRegOpenKey_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpszsubkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t samdesired = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* phkresult = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ClusterRegOpenKey")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hkey, lpszsubkey, samdesired, phkresult) : -1;
#else
    (void)hkey;
    (void)lpszsubkey;
    (void)samdesired;
    (void)phkresult;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ClusterRegQueryInfoKey_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpcsubkeys = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* lpcchmaxsubkeylen = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* lpcvalues = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* lpcchmaxvaluenamelen = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* lpcbmaxvaluelen = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* lpcbsecuritydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* lpftlastwritetime = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ClusterRegQueryInfoKey")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hkey, lpcsubkeys, lpcchmaxsubkeylen, lpcvalues, lpcchmaxvaluenamelen, lpcbmaxvaluelen, lpcbsecuritydescriptor, lpftlastwritetime) : -1;
#else
    (void)hkey;
    (void)lpcsubkeys;
    (void)lpcchmaxsubkeylen;
    (void)lpcvalues;
    (void)lpcchmaxvaluenamelen;
    (void)lpcbmaxvaluelen;
    (void)lpcbsecuritydescriptor;
    (void)lpftlastwritetime;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ClusterRegQueryValue_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpszvaluename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* lpdwvaluetype = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* lpdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* lpcbdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ClusterRegQueryValue")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hkey, lpszvaluename, lpdwvaluetype, lpdata, lpcbdata) : -1;
#else
    (void)hkey;
    (void)lpszvaluename;
    (void)lpdwvaluetype;
    (void)lpdata;
    (void)lpcbdata;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ClusterRegReadBatchAddCommand_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hregreadbatch = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* wzsubkeyname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* wzvaluename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ClusterRegReadBatchAddCommand")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hregreadbatch, wzsubkeyname, wzvaluename) : -1;
#else
    (void)hregreadbatch;
    (void)wzsubkeyname;
    (void)wzvaluename;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ClusterRegReadBatchReplyNextCommand_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hregreadbatchreply = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* pbatchcommand = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ClusterRegReadBatchReplyNextCommand")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hregreadbatchreply, pbatchcommand) : -1;
#else
    (void)hregreadbatchreply;
    (void)pbatchcommand;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ClusterRegSetKeySecurity_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t securityinformation = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* psecuritydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ClusterRegSetKeySecurity")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hkey, securityinformation, psecuritydescriptor) : -1;
#else
    (void)hkey;
    (void)securityinformation;
    (void)psecuritydescriptor;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ClusterRegSetKeySecurityEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t securityinformation = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* psecuritydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* lpszreason = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ClusterRegSetKeySecurityEx")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hkey, securityinformation, psecuritydescriptor, lpszreason) : -1;
#else
    (void)hkey;
    (void)securityinformation;
    (void)psecuritydescriptor;
    (void)lpszreason;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ClusterRegSetValue_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpszvaluename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwtype = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* lpdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t cbdata = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ClusterRegSetValue")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hkey, lpszvaluename, dwtype, lpdata, cbdata) : 0;
#else
    (void)hkey;
    (void)lpszvaluename;
    (void)dwtype;
    (void)lpdata;
    (void)cbdata;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ClusterRegSetValueEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpszvaluename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwtype = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* lpdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t cbdata = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* lpszreason = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ClusterRegSetValueEx")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hkey, lpszvaluename, dwtype, lpdata, cbdata, lpszreason) : 0;
#else
    (void)hkey;
    (void)lpszvaluename;
    (void)dwtype;
    (void)lpdata;
    (void)cbdata;
    (void)lpszreason;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ClusterRegSyncDatabase_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hcluster = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ClusterRegSyncDatabase")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcluster, flags) : -1;
#else
    (void)hcluster;
    (void)flags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ClusterRemoveAffinityRule_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hcluster = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* rulename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ClusterRemoveAffinityRule")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcluster, rulename) : 0;
#else
    (void)hcluster;
    (void)rulename;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ClusterRemoveGroupFromAffinityRule_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hcluster = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* rulename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int64_t hgroup = km_info.Length() > 2 ? km_napi_arg_i64(km_info[2]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ClusterRemoveGroupFromAffinityRule")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcluster, rulename, hgroup) : 0;
#else
    (void)hcluster;
    (void)rulename;
    (void)hgroup;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ClusterRemoveGroupFromGroupSet_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hgroup = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ClusterRemoveGroupFromGroupSet")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hgroup) : 0;
#else
    (void)hgroup;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ClusterRemoveGroupFromGroupSetEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hgroup = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* lpszreason = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ClusterRemoveGroupFromGroupSetEx")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hgroup, lpszreason) : 0;
#else
    (void)hgroup;
    (void)lpszreason;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ClusterResourceCloseEnum_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hresenum = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ClusterResourceCloseEnum")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hresenum) : 0;
#else
    (void)hresenum;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ClusterResourceCloseEnumEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hresourceenumex = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ClusterResourceCloseEnumEx")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hresourceenumex) : 0;
#else
    (void)hresourceenumex;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ClusterResourceControl_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hresource = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t hhostnode = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
    uint32_t dwcontrolcode = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* lpinbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t cbinbuffersize = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* lpoutbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    uint32_t cboutbuffersize = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    void* lpbytesreturned = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, uint32_t, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ClusterResourceControl")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hresource, hhostnode, dwcontrolcode, lpinbuffer, cbinbuffersize, lpoutbuffer, cboutbuffersize, lpbytesreturned) : 0;
#else
    (void)hresource;
    (void)hhostnode;
    (void)dwcontrolcode;
    (void)lpinbuffer;
    (void)cbinbuffersize;
    (void)lpoutbuffer;
    (void)cboutbuffersize;
    (void)lpbytesreturned;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ClusterResourceControlAsUser_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hresource = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t hhostnode = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
    uint32_t dwcontrolcode = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* lpinbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t cbinbuffersize = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* lpoutbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    uint32_t cboutbuffersize = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    void* lpbytesreturned = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, uint32_t, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ClusterResourceControlAsUser")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hresource, hhostnode, dwcontrolcode, lpinbuffer, cbinbuffersize, lpoutbuffer, cboutbuffersize, lpbytesreturned) : 0;
#else
    (void)hresource;
    (void)hhostnode;
    (void)dwcontrolcode;
    (void)lpinbuffer;
    (void)cbinbuffersize;
    (void)lpoutbuffer;
    (void)cboutbuffersize;
    (void)lpbytesreturned;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ClusterResourceControlAsUserEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hresource = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t hhostnode = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
    uint32_t dwcontrolcode = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* lpinbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t cbinbuffersize = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* lpoutbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    uint32_t cboutbuffersize = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    void* lpbytesreturned = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    void* lpszreason = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, uint32_t, void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ClusterResourceControlAsUserEx")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hresource, hhostnode, dwcontrolcode, lpinbuffer, cbinbuffersize, lpoutbuffer, cboutbuffersize, lpbytesreturned, lpszreason) : 0;
#else
    (void)hresource;
    (void)hhostnode;
    (void)dwcontrolcode;
    (void)lpinbuffer;
    (void)cbinbuffersize;
    (void)lpoutbuffer;
    (void)cboutbuffersize;
    (void)lpbytesreturned;
    (void)lpszreason;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ClusterResourceControlEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hresource = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t hhostnode = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
    uint32_t dwcontrolcode = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* lpinbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t cbinbuffersize = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* lpoutbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    uint32_t cboutbuffersize = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    void* lpbytesreturned = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    void* lpszreason = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, uint32_t, void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ClusterResourceControlEx")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hresource, hhostnode, dwcontrolcode, lpinbuffer, cbinbuffersize, lpoutbuffer, cboutbuffersize, lpbytesreturned, lpszreason) : 0;
#else
    (void)hresource;
    (void)hhostnode;
    (void)dwcontrolcode;
    (void)lpinbuffer;
    (void)cbinbuffersize;
    (void)lpoutbuffer;
    (void)cboutbuffersize;
    (void)lpbytesreturned;
    (void)lpszreason;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ClusterResourceEnum_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hresenum = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint32_t dwindex = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* lpdwtype = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* lpszname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* lpcchname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ClusterResourceEnum")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hresenum, dwindex, lpdwtype, lpszname, lpcchname) : 0;
#else
    (void)hresenum;
    (void)dwindex;
    (void)lpdwtype;
    (void)lpszname;
    (void)lpcchname;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ClusterResourceEnumEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hresourceenumex = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint32_t dwindex = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pitem = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* cbitem = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ClusterResourceEnumEx")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hresourceenumex, dwindex, pitem, cbitem) : 0;
#else
    (void)hresourceenumex;
    (void)dwindex;
    (void)pitem;
    (void)cbitem;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ClusterResourceGetEnumCount_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hresenum = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ClusterResourceGetEnumCount")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hresenum) : 0;
#else
    (void)hresenum;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ClusterResourceGetEnumCountEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hresourceenumex = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ClusterResourceGetEnumCountEx")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hresourceenumex) : 0;
#else
    (void)hresourceenumex;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ClusterResourceOpenEnum_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hresource = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint32_t dwtype = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ClusterResourceOpenEnum")));
    }
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hresource, dwtype) : -1;
#else
    (void)hresource;
    (void)dwtype;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ClusterResourceOpenEnumEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hcluster = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* lpszproperties = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t cbproperties = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* lpszroproperties = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t cbroproperties = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ClusterResourceOpenEnumEx")));
    }
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcluster, lpszproperties, cbproperties, lpszroproperties, cbroproperties, dwflags) : -1;
#else
    (void)hcluster;
    (void)lpszproperties;
    (void)cbproperties;
    (void)lpszroproperties;
    (void)cbroproperties;
    (void)dwflags;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ClusterResourceTypeCloseEnum_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hrestypeenum = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ClusterResourceTypeCloseEnum")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hrestypeenum) : 0;
#else
    (void)hrestypeenum;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ClusterResourceTypeControl_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hcluster = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* lpszresourcetypename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int64_t hhostnode = km_info.Length() > 2 ? km_napi_arg_i64(km_info[2]) : 0;
    uint32_t dwcontrolcode = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* lpinbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t ninbuffersize = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* lpoutbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    uint32_t noutbuffersize = static_cast<uint32_t>(km_info.Length() > 7 ? km_info[7].ToNumber().Int32Value() : 0);
    void* lpbytesreturned = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, int64_t, uint32_t, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ClusterResourceTypeControl")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcluster, lpszresourcetypename, hhostnode, dwcontrolcode, lpinbuffer, ninbuffersize, lpoutbuffer, noutbuffersize, lpbytesreturned) : 0;
#else
    (void)hcluster;
    (void)lpszresourcetypename;
    (void)hhostnode;
    (void)dwcontrolcode;
    (void)lpinbuffer;
    (void)ninbuffersize;
    (void)lpoutbuffer;
    (void)noutbuffersize;
    (void)lpbytesreturned;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ClusterResourceTypeControlAsUser_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hcluster = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* lpszresourcetypename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int64_t hhostnode = km_info.Length() > 2 ? km_napi_arg_i64(km_info[2]) : 0;
    uint32_t dwcontrolcode = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* lpinbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t ninbuffersize = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* lpoutbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    uint32_t noutbuffersize = static_cast<uint32_t>(km_info.Length() > 7 ? km_info[7].ToNumber().Int32Value() : 0);
    void* lpbytesreturned = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, int64_t, uint32_t, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ClusterResourceTypeControlAsUser")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcluster, lpszresourcetypename, hhostnode, dwcontrolcode, lpinbuffer, ninbuffersize, lpoutbuffer, noutbuffersize, lpbytesreturned) : 0;
#else
    (void)hcluster;
    (void)lpszresourcetypename;
    (void)hhostnode;
    (void)dwcontrolcode;
    (void)lpinbuffer;
    (void)ninbuffersize;
    (void)lpoutbuffer;
    (void)noutbuffersize;
    (void)lpbytesreturned;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ClusterResourceTypeControlAsUserEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hcluster = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* lpszresourcetypename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int64_t hhostnode = km_info.Length() > 2 ? km_napi_arg_i64(km_info[2]) : 0;
    uint32_t dwcontrolcode = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* lpinbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t ninbuffersize = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* lpoutbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    uint32_t noutbuffersize = static_cast<uint32_t>(km_info.Length() > 7 ? km_info[7].ToNumber().Int32Value() : 0);
    void* lpbytesreturned = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
    void* lpszreason = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 9 ? km_napi_arg_u64(km_info[9]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, int64_t, uint32_t, void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ClusterResourceTypeControlAsUserEx")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcluster, lpszresourcetypename, hhostnode, dwcontrolcode, lpinbuffer, ninbuffersize, lpoutbuffer, noutbuffersize, lpbytesreturned, lpszreason) : 0;
#else
    (void)hcluster;
    (void)lpszresourcetypename;
    (void)hhostnode;
    (void)dwcontrolcode;
    (void)lpinbuffer;
    (void)ninbuffersize;
    (void)lpoutbuffer;
    (void)noutbuffersize;
    (void)lpbytesreturned;
    (void)lpszreason;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ClusterResourceTypeControlEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hcluster = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* lpszresourcetypename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int64_t hhostnode = km_info.Length() > 2 ? km_napi_arg_i64(km_info[2]) : 0;
    uint32_t dwcontrolcode = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* lpinbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t ninbuffersize = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* lpoutbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    uint32_t noutbuffersize = static_cast<uint32_t>(km_info.Length() > 7 ? km_info[7].ToNumber().Int32Value() : 0);
    void* lpbytesreturned = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
    void* lpszreason = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 9 ? km_napi_arg_u64(km_info[9]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, int64_t, uint32_t, void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ClusterResourceTypeControlEx")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcluster, lpszresourcetypename, hhostnode, dwcontrolcode, lpinbuffer, ninbuffersize, lpoutbuffer, noutbuffersize, lpbytesreturned, lpszreason) : 0;
#else
    (void)hcluster;
    (void)lpszresourcetypename;
    (void)hhostnode;
    (void)dwcontrolcode;
    (void)lpinbuffer;
    (void)ninbuffersize;
    (void)lpoutbuffer;
    (void)noutbuffersize;
    (void)lpbytesreturned;
    (void)lpszreason;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ClusterResourceTypeEnum_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hrestypeenum = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint32_t dwindex = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* lpdwtype = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* lpszname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* lpcchname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ClusterResourceTypeEnum")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hrestypeenum, dwindex, lpdwtype, lpszname, lpcchname) : 0;
#else
    (void)hrestypeenum;
    (void)dwindex;
    (void)lpdwtype;
    (void)lpszname;
    (void)lpcchname;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ClusterResourceTypeGetEnumCount_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hrestypeenum = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ClusterResourceTypeGetEnumCount")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hrestypeenum) : 0;
#else
    (void)hrestypeenum;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ClusterResourceTypeOpenEnum_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hcluster = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* lpszresourcetypename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwtype = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ClusterResourceTypeOpenEnum")));
    }
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcluster, lpszresourcetypename, dwtype) : -1;
#else
    (void)hcluster;
    (void)lpszresourcetypename;
    (void)dwtype;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ClusterSetAccountAccess_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hcluster = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* szaccountsid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwaccess = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t dwcontroltype = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ClusterSetAccountAccess")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcluster, szaccountsid, dwaccess, dwcontroltype) : 0;
#else
    (void)hcluster;
    (void)szaccountsid;
    (void)dwaccess;
    (void)dwcontroltype;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ClusterUpgradeFunctionalLevel_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hcluster = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int32_t perform = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pfnprogresscallback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pvcallbackarg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ClusterUpgradeFunctionalLevel")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcluster, perform, pfnprogresscallback, pvcallbackarg) : 0;
#else
    (void)hcluster;
    (void)perform;
    (void)pfnprogresscallback;
    (void)pvcallbackarg;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_CreateCluster_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pconfig = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pfnprogresscallback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pvcallbackarg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CreateCluster")));
    }
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pconfig, pfnprogresscallback, pvcallbackarg) : -1;
#else
    (void)pconfig;
    (void)pfnprogresscallback;
    (void)pvcallbackarg;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_networking_clustering_CreateClusterAvailabilitySet_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hcluster = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* lpavailabilitysetname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pavailabilitysetconfig = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CreateClusterAvailabilitySet")));
    }
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcluster, lpavailabilitysetname, pavailabilitysetconfig) : -1;
#else
    (void)hcluster;
    (void)lpavailabilitysetname;
    (void)pavailabilitysetconfig;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_networking_clustering_CreateClusterGroup_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hcluster = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* lpszgroupname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CreateClusterGroup")));
    }
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcluster, lpszgroupname) : -1;
#else
    (void)hcluster;
    (void)lpszgroupname;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_networking_clustering_CreateClusterGroupEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hcluster = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* lpszgroupname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pgroupinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CreateClusterGroupEx")));
    }
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcluster, lpszgroupname, pgroupinfo) : -1;
#else
    (void)hcluster;
    (void)lpszgroupname;
    (void)pgroupinfo;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_networking_clustering_CreateClusterGroupSet_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hcluster = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* groupsetname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CreateClusterGroupSet")));
    }
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcluster, groupsetname) : -1;
#else
    (void)hcluster;
    (void)groupsetname;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_networking_clustering_CreateClusterNameAccount_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hcluster = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* pconfig = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pfnprogresscallback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pvcallbackarg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CreateClusterNameAccount")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcluster, pconfig, pfnprogresscallback, pvcallbackarg) : 0;
#else
    (void)hcluster;
    (void)pconfig;
    (void)pfnprogresscallback;
    (void)pvcallbackarg;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_CreateClusterNotifyPort_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hchange = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t hcluster = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
    uint32_t dwfilter = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint64_t dwnotifykey = km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, int64_t, uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CreateClusterNotifyPort")));
    }
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hchange, hcluster, dwfilter, dwnotifykey) : -1;
#else
    (void)hchange;
    (void)hcluster;
    (void)dwfilter;
    (void)dwnotifykey;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_networking_clustering_CreateClusterNotifyPortV2_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hchange = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t hcluster = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
    void* filters = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t dwfiltercount = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint64_t dwnotifykey = km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, int64_t, void*, uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CreateClusterNotifyPortV2")));
    }
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hchange, hcluster, filters, dwfiltercount, dwnotifykey) : -1;
#else
    (void)hchange;
    (void)hcluster;
    (void)filters;
    (void)dwfiltercount;
    (void)dwnotifykey;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_networking_clustering_CreateClusterResource_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hgroup = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* lpszresourcename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* lpszresourcetype = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CreateClusterResource")));
    }
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hgroup, lpszresourcename, lpszresourcetype, dwflags) : -1;
#else
    (void)hgroup;
    (void)lpszresourcename;
    (void)lpszresourcetype;
    (void)dwflags;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_networking_clustering_CreateClusterResourceEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hgroup = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* lpszresourcename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* lpszresourcetype = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* lpszreason = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CreateClusterResourceEx")));
    }
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hgroup, lpszresourcename, lpszresourcetype, dwflags, lpszreason) : -1;
#else
    (void)hgroup;
    (void)lpszresourcename;
    (void)lpszresourcetype;
    (void)dwflags;
    (void)lpszreason;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_networking_clustering_CreateClusterResourceType_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hcluster = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* lpszresourcetypename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* lpszdisplayname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* lpszresourcetypedll = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t dwlooksalivepollinterval = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    uint32_t dwisalivepollinterval = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CreateClusterResourceType")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcluster, lpszresourcetypename, lpszdisplayname, lpszresourcetypedll, dwlooksalivepollinterval, dwisalivepollinterval) : 0;
#else
    (void)hcluster;
    (void)lpszresourcetypename;
    (void)lpszdisplayname;
    (void)lpszresourcetypedll;
    (void)dwlooksalivepollinterval;
    (void)dwisalivepollinterval;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_CreateClusterResourceTypeEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hcluster = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* lpszresourcetypename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* lpszdisplayname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* lpszresourcetypedll = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t dwlooksalivepollinterval = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    uint32_t dwisalivepollinterval = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* lpszreason = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CreateClusterResourceTypeEx")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcluster, lpszresourcetypename, lpszdisplayname, lpszresourcetypedll, dwlooksalivepollinterval, dwisalivepollinterval, lpszreason) : 0;
#else
    (void)hcluster;
    (void)lpszresourcetypename;
    (void)lpszdisplayname;
    (void)lpszresourcetypedll;
    (void)dwlooksalivepollinterval;
    (void)dwisalivepollinterval;
    (void)lpszreason;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_DeleteClusterGroup_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hgroup = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DeleteClusterGroup")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hgroup) : 0;
#else
    (void)hgroup;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_DeleteClusterGroupEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hgroup = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* lpszreason = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DeleteClusterGroupEx")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hgroup, lpszreason) : 0;
#else
    (void)hgroup;
    (void)lpszreason;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_DeleteClusterGroupSet_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hgroupset = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DeleteClusterGroupSet")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hgroupset) : 0;
#else
    (void)hgroupset;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_DeleteClusterGroupSetEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hgroupset = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* lpszreason = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DeleteClusterGroupSetEx")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hgroupset, lpszreason) : 0;
#else
    (void)hgroupset;
    (void)lpszreason;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_DeleteClusterResource_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hresource = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DeleteClusterResource")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hresource) : 0;
#else
    (void)hresource;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_DeleteClusterResourceEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hresource = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* lpszreason = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DeleteClusterResourceEx")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hresource, lpszreason) : 0;
#else
    (void)hresource;
    (void)lpszreason;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_DeleteClusterResourceType_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hcluster = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* lpszresourcetypename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DeleteClusterResourceType")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcluster, lpszresourcetypename) : 0;
#else
    (void)hcluster;
    (void)lpszresourcetypename;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_DeleteClusterResourceTypeEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hcluster = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* lpsztypename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* lpszreason = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DeleteClusterResourceTypeEx")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcluster, lpsztypename, lpszreason) : 0;
#else
    (void)hcluster;
    (void)lpsztypename;
    (void)lpszreason;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_DestroyCluster_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hcluster = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* pfnprogresscallback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pvcallbackarg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int32_t fdeletevirtualcomputerobjects = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DestroyCluster")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcluster, pfnprogresscallback, pvcallbackarg, fdeletevirtualcomputerobjects) : 0;
#else
    (void)hcluster;
    (void)pfnprogresscallback;
    (void)pvcallbackarg;
    (void)fdeletevirtualcomputerobjects;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_DestroyClusterGroup_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hgroup = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DestroyClusterGroup")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hgroup) : 0;
#else
    (void)hgroup;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_DestroyClusterGroupEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hgroup = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* lpszreason = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DestroyClusterGroupEx")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hgroup, lpszreason) : 0;
#else
    (void)hgroup;
    (void)lpszreason;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_DetermineCNOResTypeFromCluster_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hcluster = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* pcnorestype = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DetermineCNOResTypeFromCluster")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcluster, pcnorestype) : 0;
#else
    (void)hcluster;
    (void)pcnorestype;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_DetermineCNOResTypeFromNodelist_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t cnodes = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* ppsznodenames = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pcnorestype = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DetermineCNOResTypeFromNodelist")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(cnodes, ppsznodenames, pcnorestype) : 0;
#else
    (void)cnodes;
    (void)ppsznodenames;
    (void)pcnorestype;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_DetermineClusterCloudTypeFromCluster_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hcluster = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* pcloudtype = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DetermineClusterCloudTypeFromCluster")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcluster, pcloudtype) : 0;
#else
    (void)hcluster;
    (void)pcloudtype;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_DetermineClusterCloudTypeFromNodelist_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t cnodes = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* ppsznodenames = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pcloudtype = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DetermineClusterCloudTypeFromNodelist")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(cnodes, ppsznodenames, pcloudtype) : 0;
#else
    (void)cnodes;
    (void)ppsznodenames;
    (void)pcloudtype;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_EvictClusterNode_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hnode = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "EvictClusterNode")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hnode) : 0;
#else
    (void)hnode;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_EvictClusterNodeEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hnode = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint32_t dwtimeout = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* phrcleanupstatus = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "EvictClusterNodeEx")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hnode, dwtimeout, phrcleanupstatus) : 0;
#else
    (void)hnode;
    (void)dwtimeout;
    (void)phrcleanupstatus;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_EvictClusterNodeEx2_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hnode = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint32_t dwtimeout = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* phrcleanupstatus = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* lpszreason = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "EvictClusterNodeEx2")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hnode, dwtimeout, phrcleanupstatus, lpszreason) : 0;
#else
    (void)hnode;
    (void)dwtimeout;
    (void)phrcleanupstatus;
    (void)lpszreason;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_FailClusterResource_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hresource = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FailClusterResource")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hresource) : 0;
#else
    (void)hresource;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_FailClusterResourceEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hresource = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* lpszreason = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FailClusterResourceEx")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hresource, lpszreason) : 0;
#else
    (void)hresource;
    (void)lpszreason;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_FreeClusterCrypt_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pcryptinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FreeClusterCrypt")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pcryptinfo) : 0;
#else
    (void)pcryptinfo;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_FreeClusterHealthFault_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* clusterhealthfault = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FreeClusterHealthFault")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(clusterhealthfault) : 0;
#else
    (void)clusterhealthfault;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_FreeClusterHealthFaultArray_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* clusterhealthfaultarray = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FreeClusterHealthFaultArray")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(clusterhealthfaultarray) : 0;
#else
    (void)clusterhealthfaultarray;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_GetClusterFromGroup_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hgroup = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetClusterFromGroup")));
    }
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hgroup) : -1;
#else
    (void)hgroup;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_networking_clustering_GetClusterFromNetInterface_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hnetinterface = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetClusterFromNetInterface")));
    }
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hnetinterface) : -1;
#else
    (void)hnetinterface;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_networking_clustering_GetClusterFromNetwork_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hnetwork = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetClusterFromNetwork")));
    }
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hnetwork) : -1;
#else
    (void)hnetwork;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_networking_clustering_GetClusterFromNode_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hnode = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetClusterFromNode")));
    }
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hnode) : -1;
#else
    (void)hnode;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_networking_clustering_GetClusterFromResource_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hresource = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetClusterFromResource")));
    }
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hresource) : -1;
#else
    (void)hresource;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_networking_clustering_GetClusterGroupKey_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hgroup = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint32_t samdesired = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetClusterGroupKey")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hgroup, samdesired) : NULL;
#else
    (void)hgroup;
    (void)samdesired;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_networking_clustering_GetClusterGroupState_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hgroup = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* lpsznodename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* lpcchnodename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetClusterGroupState")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hgroup, lpsznodename, lpcchnodename) : -1;
#else
    (void)hgroup;
    (void)lpsznodename;
    (void)lpcchnodename;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_GetClusterInformation_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hcluster = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* lpszclustername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* lpcchclustername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* lpclusterinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetClusterInformation")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcluster, lpszclustername, lpcchclustername, lpclusterinfo) : 0;
#else
    (void)hcluster;
    (void)lpszclustername;
    (void)lpcchclustername;
    (void)lpclusterinfo;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_GetClusterKey_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hcluster = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint32_t samdesired = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetClusterKey")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcluster, samdesired) : NULL;
#else
    (void)hcluster;
    (void)samdesired;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_networking_clustering_GetClusterNetInterface_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hcluster = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* lpsznodename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* lpsznetworkname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* lpszinterfacename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* lpcchinterfacename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetClusterNetInterface")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcluster, lpsznodename, lpsznetworkname, lpszinterfacename, lpcchinterfacename) : 0;
#else
    (void)hcluster;
    (void)lpsznodename;
    (void)lpsznetworkname;
    (void)lpszinterfacename;
    (void)lpcchinterfacename;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_GetClusterNetInterfaceKey_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hnetinterface = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint32_t samdesired = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetClusterNetInterfaceKey")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hnetinterface, samdesired) : NULL;
#else
    (void)hnetinterface;
    (void)samdesired;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_networking_clustering_GetClusterNetInterfaceState_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hnetinterface = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetClusterNetInterfaceState")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hnetinterface) : -1;
#else
    (void)hnetinterface;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_GetClusterNetworkId_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hnetwork = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* lpsznetworkid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* lpcchname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetClusterNetworkId")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hnetwork, lpsznetworkid, lpcchname) : 0;
#else
    (void)hnetwork;
    (void)lpsznetworkid;
    (void)lpcchname;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_GetClusterNetworkKey_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hnetwork = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint32_t samdesired = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetClusterNetworkKey")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hnetwork, samdesired) : NULL;
#else
    (void)hnetwork;
    (void)samdesired;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_networking_clustering_GetClusterNetworkState_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hnetwork = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetClusterNetworkState")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hnetwork) : -1;
#else
    (void)hnetwork;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_GetClusterNodeId_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hnode = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* lpsznodeid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* lpcchname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetClusterNodeId")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hnode, lpsznodeid, lpcchname) : 0;
#else
    (void)hnode;
    (void)lpsznodeid;
    (void)lpcchname;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_GetClusterNodeKey_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hnode = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint32_t samdesired = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetClusterNodeKey")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hnode, samdesired) : NULL;
#else
    (void)hnode;
    (void)samdesired;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_networking_clustering_GetClusterNodeState_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hnode = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetClusterNodeState")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hnode) : -1;
#else
    (void)hnode;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_GetClusterNotify_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hchange = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* lpdwnotifykey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* lpdwfiltertype = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* lpszname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* lpcchname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t dwmilliseconds = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetClusterNotify")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hchange, lpdwnotifykey, lpdwfiltertype, lpszname, lpcchname, dwmilliseconds) : 0;
#else
    (void)hchange;
    (void)lpdwnotifykey;
    (void)lpdwfiltertype;
    (void)lpszname;
    (void)lpcchname;
    (void)dwmilliseconds;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_GetClusterNotifyV2_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hchange = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* lpdwnotifykey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pfilterandtype = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* lpbbuffersize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* lpszobjectid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* lpcchobjectid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* lpszparentid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    void* lpcchparentid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
    void* lpszname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 9 ? km_napi_arg_u64(km_info[9]) : 0));
    void* lpcchname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 10 ? km_napi_arg_u64(km_info[10]) : 0));
    void* lpsztype = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 11 ? km_napi_arg_u64(km_info[11]) : 0));
    void* lpcchtype = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 12 ? km_napi_arg_u64(km_info[12]) : 0));
    uint32_t dwmilliseconds = static_cast<uint32_t>(km_info.Length() > 13 ? km_info[13].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*, void*, void*, void*, void*, void*, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetClusterNotifyV2")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hchange, lpdwnotifykey, pfilterandtype, buffer, lpbbuffersize, lpszobjectid, lpcchobjectid, lpszparentid, lpcchparentid, lpszname, lpcchname, lpsztype, lpcchtype, dwmilliseconds) : 0;
#else
    (void)hchange;
    (void)lpdwnotifykey;
    (void)pfilterandtype;
    (void)buffer;
    (void)lpbbuffersize;
    (void)lpszobjectid;
    (void)lpcchobjectid;
    (void)lpszparentid;
    (void)lpcchparentid;
    (void)lpszname;
    (void)lpcchname;
    (void)lpsztype;
    (void)lpcchtype;
    (void)dwmilliseconds;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_GetClusterQuorumResource_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hcluster = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* lpszresourcename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* lpcchresourcename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* lpszdevicename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* lpcchdevicename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* lpdwmaxquorumlogsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetClusterQuorumResource")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcluster, lpszresourcename, lpcchresourcename, lpszdevicename, lpcchdevicename, lpdwmaxquorumlogsize) : 0;
#else
    (void)hcluster;
    (void)lpszresourcename;
    (void)lpcchresourcename;
    (void)lpszdevicename;
    (void)lpcchdevicename;
    (void)lpdwmaxquorumlogsize;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_GetClusterResourceDependencyExpression_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hresource = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* lpszdependencyexpression = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* lpcchdependencyexpression = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetClusterResourceDependencyExpression")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hresource, lpszdependencyexpression, lpcchdependencyexpression) : 0;
#else
    (void)hresource;
    (void)lpszdependencyexpression;
    (void)lpcchdependencyexpression;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_GetClusterResourceKey_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hresource = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint32_t samdesired = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetClusterResourceKey")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hresource, samdesired) : NULL;
#else
    (void)hresource;
    (void)samdesired;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_networking_clustering_GetClusterResourceNetworkName_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hresource = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* lpbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* nsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetClusterResourceNetworkName")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hresource, lpbuffer, nsize) : -1;
#else
    (void)hresource;
    (void)lpbuffer;
    (void)nsize;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_GetClusterResourceState_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hresource = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* lpsznodename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* lpcchnodename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* lpszgroupname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* lpcchgroupname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetClusterResourceState")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hresource, lpsznodename, lpcchnodename, lpszgroupname, lpcchgroupname) : -1;
#else
    (void)hresource;
    (void)lpsznodename;
    (void)lpcchnodename;
    (void)lpszgroupname;
    (void)lpcchgroupname;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_GetClusterResourceTypeKey_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hcluster = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* lpsztypename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t samdesired = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetClusterResourceTypeKey")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcluster, lpsztypename, samdesired) : NULL;
#else
    (void)hcluster;
    (void)lpsztypename;
    (void)samdesired;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_networking_clustering_GetNodeCloudTypeDW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ppsznodename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* nodecloudtype = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetNodeCloudTypeDW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(ppsznodename, nodecloudtype) : 0;
#else
    (void)ppsznodename;
    (void)nodecloudtype;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_GetNodeClusterState_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpsznodename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pdwclusterstate = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetNodeClusterState")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpsznodename, pdwclusterstate) : 0;
#else
    (void)lpsznodename;
    (void)pdwclusterstate;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_GetNotifyEventHandle_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hchange = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* lphtargetevent = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetNotifyEventHandle")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hchange, lphtargetevent) : 0;
#else
    (void)hchange;
    (void)lphtargetevent;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_InitializeClusterHealthFault_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* clusterhealthfault = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "InitializeClusterHealthFault")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(clusterhealthfault) : 0;
#else
    (void)clusterhealthfault;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_InitializeClusterHealthFaultArray_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* clusterhealthfaultarray = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "InitializeClusterHealthFaultArray")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(clusterhealthfaultarray) : 0;
#else
    (void)clusterhealthfaultarray;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_IsFileOnClusterSharedVolume_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpszpathname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pbfileisonsharedvolume = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IsFileOnClusterSharedVolume")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpszpathname, pbfileisonsharedvolume) : 0;
#else
    (void)lpszpathname;
    (void)pbfileisonsharedvolume;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_MoveClusterGroup_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hgroup = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t hdestinationnode = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MoveClusterGroup")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hgroup, hdestinationnode) : 0;
#else
    (void)hgroup;
    (void)hdestinationnode;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_MoveClusterGroupEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hgroup = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t hdestinationnode = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
    uint32_t dwmoveflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* lpinbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t cbinbuffersize = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MoveClusterGroupEx")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hgroup, hdestinationnode, dwmoveflags, lpinbuffer, cbinbuffersize) : 0;
#else
    (void)hgroup;
    (void)hdestinationnode;
    (void)dwmoveflags;
    (void)lpinbuffer;
    (void)cbinbuffersize;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_MoveClusterGroupEx2_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hgroup = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t hdestinationnode = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
    uint32_t dwmoveflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* lpinbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t cbinbuffersize = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* lpszreason = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MoveClusterGroupEx2")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hgroup, hdestinationnode, dwmoveflags, lpinbuffer, cbinbuffersize, lpszreason) : 0;
#else
    (void)hgroup;
    (void)hdestinationnode;
    (void)dwmoveflags;
    (void)lpinbuffer;
    (void)cbinbuffersize;
    (void)lpszreason;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_OfflineClusterGroup_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hgroup = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "OfflineClusterGroup")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hgroup) : 0;
#else
    (void)hgroup;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_OfflineClusterGroupEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hgroup = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint32_t dwofflineflags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* lpinbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t cbinbuffersize = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "OfflineClusterGroupEx")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hgroup, dwofflineflags, lpinbuffer, cbinbuffersize) : 0;
#else
    (void)hgroup;
    (void)dwofflineflags;
    (void)lpinbuffer;
    (void)cbinbuffersize;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_OfflineClusterGroupEx2_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hgroup = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint32_t dwofflineflags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* lpinbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t cbinbuffersize = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* lpszreason = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "OfflineClusterGroupEx2")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hgroup, dwofflineflags, lpinbuffer, cbinbuffersize, lpszreason) : 0;
#else
    (void)hgroup;
    (void)dwofflineflags;
    (void)lpinbuffer;
    (void)cbinbuffersize;
    (void)lpszreason;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_OfflineClusterResource_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hresource = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "OfflineClusterResource")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hresource) : 0;
#else
    (void)hresource;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_OfflineClusterResourceEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hresource = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint32_t dwofflineflags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* lpinbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t cbinbuffersize = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "OfflineClusterResourceEx")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hresource, dwofflineflags, lpinbuffer, cbinbuffersize) : 0;
#else
    (void)hresource;
    (void)dwofflineflags;
    (void)lpinbuffer;
    (void)cbinbuffersize;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_OfflineClusterResourceEx2_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hresource = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint32_t dwofflineflags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* lpinbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t cbinbuffersize = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* lpszreason = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "OfflineClusterResourceEx2")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hresource, dwofflineflags, lpinbuffer, cbinbuffersize, lpszreason) : 0;
#else
    (void)hresource;
    (void)dwofflineflags;
    (void)lpinbuffer;
    (void)cbinbuffersize;
    (void)lpszreason;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_OnlineClusterGroup_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hgroup = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t hdestinationnode = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "OnlineClusterGroup")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hgroup, hdestinationnode) : 0;
#else
    (void)hgroup;
    (void)hdestinationnode;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_OnlineClusterGroupEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hgroup = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t hdestinationnode = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
    uint32_t dwonlineflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* lpinbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t cbinbuffersize = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "OnlineClusterGroupEx")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hgroup, hdestinationnode, dwonlineflags, lpinbuffer, cbinbuffersize) : 0;
#else
    (void)hgroup;
    (void)hdestinationnode;
    (void)dwonlineflags;
    (void)lpinbuffer;
    (void)cbinbuffersize;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_OnlineClusterGroupEx2_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hgroup = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t hdestinationnode = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
    uint32_t dwonlineflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* lpinbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t cbinbuffersize = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* lpszreason = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "OnlineClusterGroupEx2")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hgroup, hdestinationnode, dwonlineflags, lpinbuffer, cbinbuffersize, lpszreason) : 0;
#else
    (void)hgroup;
    (void)hdestinationnode;
    (void)dwonlineflags;
    (void)lpinbuffer;
    (void)cbinbuffersize;
    (void)lpszreason;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_OnlineClusterResource_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hresource = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "OnlineClusterResource")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hresource) : 0;
#else
    (void)hresource;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_OnlineClusterResourceEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hresource = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint32_t dwonlineflags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* lpinbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t cbinbuffersize = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "OnlineClusterResourceEx")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hresource, dwonlineflags, lpinbuffer, cbinbuffersize) : 0;
#else
    (void)hresource;
    (void)dwonlineflags;
    (void)lpinbuffer;
    (void)cbinbuffersize;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_OnlineClusterResourceEx2_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hresource = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint32_t dwonlineflags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* lpinbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t cbinbuffersize = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* lpszreason = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "OnlineClusterResourceEx2")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hresource, dwonlineflags, lpinbuffer, cbinbuffersize, lpszreason) : 0;
#else
    (void)hresource;
    (void)dwonlineflags;
    (void)lpinbuffer;
    (void)cbinbuffersize;
    (void)lpszreason;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_OpenCluster_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpszclustername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "OpenCluster")));
    }
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpszclustername) : -1;
#else
    (void)lpszclustername;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_networking_clustering_OpenClusterCryptProvider_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpszresource = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpszprovider = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwtype = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "OpenClusterCryptProvider")));
    }
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpszresource, lpszprovider, dwtype, dwflags) : -1;
#else
    (void)lpszresource;
    (void)lpszprovider;
    (void)dwtype;
    (void)dwflags;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_networking_clustering_OpenClusterCryptProviderEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpszresource = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpszkeyname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* lpszprovider = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t dwtype = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "OpenClusterCryptProviderEx")));
    }
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpszresource, lpszkeyname, lpszprovider, dwtype, dwflags) : -1;
#else
    (void)lpszresource;
    (void)lpszkeyname;
    (void)lpszprovider;
    (void)dwtype;
    (void)dwflags;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_networking_clustering_OpenClusterEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpszclustername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t desiredaccess = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* grantedaccess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "OpenClusterEx")));
    }
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpszclustername, desiredaccess, grantedaccess) : -1;
#else
    (void)lpszclustername;
    (void)desiredaccess;
    (void)grantedaccess;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_networking_clustering_OpenClusterGroup_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hcluster = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* lpszgroupname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "OpenClusterGroup")));
    }
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcluster, lpszgroupname) : -1;
#else
    (void)hcluster;
    (void)lpszgroupname;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_networking_clustering_OpenClusterGroupEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hcluster = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* lpszgroupname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwdesiredaccess = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* lpdwgrantedaccess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "OpenClusterGroupEx")));
    }
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcluster, lpszgroupname, dwdesiredaccess, lpdwgrantedaccess) : -1;
#else
    (void)hcluster;
    (void)lpszgroupname;
    (void)dwdesiredaccess;
    (void)lpdwgrantedaccess;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_networking_clustering_OpenClusterGroupSet_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hcluster = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* lpszgroupsetname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "OpenClusterGroupSet")));
    }
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcluster, lpszgroupsetname) : -1;
#else
    (void)hcluster;
    (void)lpszgroupsetname;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_networking_clustering_OpenClusterNetInterface_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hcluster = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* lpszinterfacename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "OpenClusterNetInterface")));
    }
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcluster, lpszinterfacename) : -1;
#else
    (void)hcluster;
    (void)lpszinterfacename;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_networking_clustering_OpenClusterNetInterfaceEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hcluster = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* lpszinterfacename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwdesiredaccess = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* lpdwgrantedaccess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "OpenClusterNetInterfaceEx")));
    }
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcluster, lpszinterfacename, dwdesiredaccess, lpdwgrantedaccess) : -1;
#else
    (void)hcluster;
    (void)lpszinterfacename;
    (void)dwdesiredaccess;
    (void)lpdwgrantedaccess;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_networking_clustering_OpenClusterNetwork_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hcluster = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* lpsznetworkname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "OpenClusterNetwork")));
    }
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcluster, lpsznetworkname) : -1;
#else
    (void)hcluster;
    (void)lpsznetworkname;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_networking_clustering_OpenClusterNetworkEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hcluster = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* lpsznetworkname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwdesiredaccess = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* lpdwgrantedaccess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "OpenClusterNetworkEx")));
    }
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcluster, lpsznetworkname, dwdesiredaccess, lpdwgrantedaccess) : -1;
#else
    (void)hcluster;
    (void)lpsznetworkname;
    (void)dwdesiredaccess;
    (void)lpdwgrantedaccess;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_networking_clustering_OpenClusterNode_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hcluster = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* lpsznodename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "OpenClusterNode")));
    }
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcluster, lpsznodename) : -1;
#else
    (void)hcluster;
    (void)lpsznodename;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_networking_clustering_OpenClusterNodeById_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hcluster = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint32_t nodeid = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "OpenClusterNodeById")));
    }
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcluster, nodeid) : -1;
#else
    (void)hcluster;
    (void)nodeid;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_networking_clustering_OpenClusterNodeEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hcluster = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* lpsznodename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwdesiredaccess = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* lpdwgrantedaccess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "OpenClusterNodeEx")));
    }
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcluster, lpsznodename, dwdesiredaccess, lpdwgrantedaccess) : -1;
#else
    (void)hcluster;
    (void)lpsznodename;
    (void)dwdesiredaccess;
    (void)lpdwgrantedaccess;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_networking_clustering_OpenClusterResource_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hcluster = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* lpszresourcename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "OpenClusterResource")));
    }
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcluster, lpszresourcename) : -1;
#else
    (void)hcluster;
    (void)lpszresourcename;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_networking_clustering_OpenClusterResourceEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hcluster = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* lpszresourcename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwdesiredaccess = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* lpdwgrantedaccess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "OpenClusterResourceEx")));
    }
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcluster, lpszresourcename, dwdesiredaccess, lpdwgrantedaccess) : -1;
#else
    (void)hcluster;
    (void)lpszresourcename;
    (void)dwdesiredaccess;
    (void)lpdwgrantedaccess;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_networking_clustering_PauseClusterNode_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hnode = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PauseClusterNode")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hnode) : 0;
#else
    (void)hnode;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_PauseClusterNodeEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hnode = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int32_t bdrainnode = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t dwpauseflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int64_t hnodedraintarget = km_info.Length() > 3 ? km_napi_arg_i64(km_info[3]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int32_t, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PauseClusterNodeEx")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hnode, bdrainnode, dwpauseflags, hnodedraintarget) : 0;
#else
    (void)hnode;
    (void)bdrainnode;
    (void)dwpauseflags;
    (void)hnodedraintarget;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_PauseClusterNodeEx2_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hnode = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int32_t bdrainnode = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t dwpauseflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int64_t hnodedraintarget = km_info.Length() > 3 ? km_napi_arg_i64(km_info[3]) : 0;
    void* lpszreason = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int32_t, uint32_t, int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PauseClusterNodeEx2")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hnode, bdrainnode, dwpauseflags, hnodedraintarget, lpszreason) : 0;
#else
    (void)hnode;
    (void)bdrainnode;
    (void)dwpauseflags;
    (void)hnodedraintarget;
    (void)lpszreason;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_QueryAppInstanceVersion_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* appinstanceid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* instanceversionhigh = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* instanceversionlow = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* versionstatus = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntlanman.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "QueryAppInstanceVersion")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(appinstanceid, instanceversionhigh, instanceversionlow, versionstatus) : 0;
#else
    (void)appinstanceid;
    (void)instanceversionhigh;
    (void)instanceversionlow;
    (void)versionstatus;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_RegisterAppInstance_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* processhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* appinstanceid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t childreninheritappinstance = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntlanman.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RegisterAppInstance")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(processhandle, appinstanceid, childreninheritappinstance) : 0;
#else
    (void)processhandle;
    (void)appinstanceid;
    (void)childreninheritappinstance;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_RegisterAppInstanceVersion_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* appinstanceid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t instanceversionhigh = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    uint64_t instanceversionlow = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntlanman.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RegisterAppInstanceVersion")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(appinstanceid, instanceversionhigh, instanceversionlow) : 0;
#else
    (void)appinstanceid;
    (void)instanceversionhigh;
    (void)instanceversionlow;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_RegisterClusterNotify_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hchange = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint32_t dwfiltertype = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* hobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint64_t dwnotifykey = km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RegisterClusterNotify")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hchange, dwfiltertype, hobject, dwnotifykey) : 0;
#else
    (void)hchange;
    (void)dwfiltertype;
    (void)hobject;
    (void)dwnotifykey;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_RegisterClusterResourceTypeNotifyV2_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hchange = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t hcluster = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
    int64_t flags = km_info.Length() > 2 ? km_napi_arg_i64(km_info[2]) : 0;
    void* restypename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint64_t dwnotifykey = km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, int64_t, void*, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RegisterClusterResourceTypeNotifyV2")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hchange, hcluster, flags, restypename, dwnotifykey) : 0;
#else
    (void)hchange;
    (void)hcluster;
    (void)flags;
    (void)restypename;
    (void)dwnotifykey;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_RemoveClusterGroupDependency_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hgroup = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t hdependson = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RemoveClusterGroupDependency")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hgroup, hdependson) : 0;
#else
    (void)hgroup;
    (void)hdependson;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_RemoveClusterGroupDependencyEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hgroup = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t hdependson = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
    void* lpszreason = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RemoveClusterGroupDependencyEx")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hgroup, hdependson, lpszreason) : 0;
#else
    (void)hgroup;
    (void)hdependson;
    (void)lpszreason;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_RemoveClusterGroupSetDependency_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hgroupset = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t hdependson = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RemoveClusterGroupSetDependency")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hgroupset, hdependson) : 0;
#else
    (void)hgroupset;
    (void)hdependson;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_RemoveClusterGroupSetDependencyEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hgroupset = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t hdependson = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
    void* lpszreason = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RemoveClusterGroupSetDependencyEx")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hgroupset, hdependson, lpszreason) : 0;
#else
    (void)hgroupset;
    (void)hdependson;
    (void)lpszreason;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_RemoveClusterGroupToGroupSetDependency_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hgroup = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t hdependson = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RemoveClusterGroupToGroupSetDependency")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hgroup, hdependson) : 0;
#else
    (void)hgroup;
    (void)hdependson;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_RemoveClusterGroupToGroupSetDependencyEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hgroup = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t hdependson = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
    void* lpszreason = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RemoveClusterGroupToGroupSetDependencyEx")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hgroup, hdependson, lpszreason) : 0;
#else
    (void)hgroup;
    (void)hdependson;
    (void)lpszreason;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_RemoveClusterNameAccount_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hcluster = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int32_t bdeletecomputerobjects = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RemoveClusterNameAccount")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcluster, bdeletecomputerobjects) : 0;
#else
    (void)hcluster;
    (void)bdeletecomputerobjects;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_RemoveClusterResourceDependency_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hresource = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t hdependson = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RemoveClusterResourceDependency")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hresource, hdependson) : 0;
#else
    (void)hresource;
    (void)hdependson;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_RemoveClusterResourceDependencyEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hresource = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t hdependson = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
    void* lpszreason = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RemoveClusterResourceDependencyEx")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hresource, hdependson, lpszreason) : 0;
#else
    (void)hresource;
    (void)hdependson;
    (void)lpszreason;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_RemoveClusterResourceNode_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hresource = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t hnode = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RemoveClusterResourceNode")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hresource, hnode) : 0;
#else
    (void)hresource;
    (void)hnode;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_RemoveClusterResourceNodeEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hresource = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t hnode = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
    void* lpszreason = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RemoveClusterResourceNodeEx")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hresource, hnode, lpszreason) : 0;
#else
    (void)hresource;
    (void)hnode;
    (void)lpszreason;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_RemoveClusterStorageNode_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hcluster = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* lpszclusterstorageenclosurename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwtimeout = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RemoveClusterStorageNode")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcluster, lpszclusterstorageenclosurename, dwtimeout, dwflags) : 0;
#else
    (void)hcluster;
    (void)lpszclusterstorageenclosurename;
    (void)dwtimeout;
    (void)dwflags;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_RemoveCrossClusterGroupSetDependency_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hdependentgroupset = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* lpremoteclustername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* lpremotegroupsetname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RemoveCrossClusterGroupSetDependency")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hdependentgroupset, lpremoteclustername, lpremotegroupsetname) : 0;
#else
    (void)hdependentgroupset;
    (void)lpremoteclustername;
    (void)lpremotegroupsetname;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_RemoveResourceFromClusterSharedVolumes_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hresource = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RemoveResourceFromClusterSharedVolumes")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hresource) : 0;
#else
    (void)hresource;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ResUtilAddUnknownProperties_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hkeyclusterkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ppropertytable = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* poutpropertylist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t pcboutpropertylistsize = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* pcbbytesreturned = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* pcbrequired = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ResUtilAddUnknownProperties")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hkeyclusterkey, ppropertytable, poutpropertylist, pcboutpropertylistsize, pcbbytesreturned, pcbrequired) : 0;
#else
    (void)hkeyclusterkey;
    (void)ppropertytable;
    (void)poutpropertylist;
    (void)pcboutpropertylistsize;
    (void)pcbbytesreturned;
    (void)pcbrequired;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ResUtilCreateDirectoryTree_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pszpath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ResUtilCreateDirectoryTree")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pszpath) : 0;
#else
    (void)pszpath;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ResUtilDupGroup_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t group = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* copy = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ResUtilDupGroup")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(group, copy) : 0;
#else
    (void)group;
    (void)copy;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ResUtilDupParameterBlock_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* poutparams = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pinparams = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* ppropertytable = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ResUtilDupParameterBlock")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(poutparams, pinparams, ppropertytable) : 0;
#else
    (void)poutparams;
    (void)pinparams;
    (void)ppropertytable;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ResUtilDupResource_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t group = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* copy = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ResUtilDupResource")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(group, copy) : 0;
#else
    (void)group;
    (void)copy;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ResUtilDupString_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pszinstring = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ResUtilDupString")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pszinstring) : NULL;
#else
    (void)pszinstring;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ResUtilEnumGroups_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hcluster = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t hself = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
    void* prescallback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pparameter = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ResUtilEnumGroups")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcluster, hself, prescallback, pparameter) : 0;
#else
    (void)hcluster;
    (void)hself;
    (void)prescallback;
    (void)pparameter;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ResUtilEnumGroupsEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hcluster = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t hself = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
    int32_t grouptype = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* prescallback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pparameter = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ResUtilEnumGroupsEx")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcluster, hself, grouptype, prescallback, pparameter) : 0;
#else
    (void)hcluster;
    (void)hself;
    (void)grouptype;
    (void)prescallback;
    (void)pparameter;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ResUtilEnumPrivateProperties_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hkeyclusterkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pszoutproperties = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t cboutpropertiessize = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pcbbytesreturned = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pcbrequired = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ResUtilEnumPrivateProperties")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hkeyclusterkey, pszoutproperties, cboutpropertiessize, pcbbytesreturned, pcbrequired) : 0;
#else
    (void)hkeyclusterkey;
    (void)pszoutproperties;
    (void)cboutpropertiessize;
    (void)pcbbytesreturned;
    (void)pcbrequired;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ResUtilEnumProperties_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ppropertytable = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pszoutproperties = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t cboutpropertiessize = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pcbbytesreturned = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pcbrequired = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ResUtilEnumProperties")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(ppropertytable, pszoutproperties, cboutpropertiessize, pcbbytesreturned, pcbrequired) : 0;
#else
    (void)ppropertytable;
    (void)pszoutproperties;
    (void)cboutpropertiessize;
    (void)pcbbytesreturned;
    (void)pcbrequired;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ResUtilEnumResources_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hself = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* lpszrestypename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* prescallback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pparameter = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ResUtilEnumResources")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hself, lpszrestypename, prescallback, pparameter) : 0;
#else
    (void)hself;
    (void)lpszrestypename;
    (void)prescallback;
    (void)pparameter;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ResUtilEnumResourcesEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hcluster = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t hself = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
    void* lpszrestypename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* prescallback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pparameter = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ResUtilEnumResourcesEx")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcluster, hself, lpszrestypename, prescallback, pparameter) : 0;
#else
    (void)hcluster;
    (void)hself;
    (void)lpszrestypename;
    (void)prescallback;
    (void)pparameter;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ResUtilEnumResourcesEx2_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hcluster = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t hself = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
    void* lpszrestypename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* prescallback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pparameter = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t dwdesiredaccess = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ResUtilEnumResourcesEx2")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcluster, hself, lpszrestypename, prescallback, pparameter, dwdesiredaccess) : 0;
#else
    (void)hcluster;
    (void)hself;
    (void)lpszrestypename;
    (void)prescallback;
    (void)pparameter;
    (void)dwdesiredaccess;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ResUtilExpandEnvironmentStrings_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pszsrc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ResUtilExpandEnvironmentStrings")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pszsrc) : NULL;
#else
    (void)pszsrc;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ResUtilFindBinaryProperty_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ppropertylist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t cbpropertylistsize = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pszpropertyname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pbpropertyvalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pcbpropertyvaluesize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ResUtilFindBinaryProperty")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(ppropertylist, cbpropertylistsize, pszpropertyname, pbpropertyvalue, pcbpropertyvaluesize) : 0;
#else
    (void)ppropertylist;
    (void)cbpropertylistsize;
    (void)pszpropertyname;
    (void)pbpropertyvalue;
    (void)pcbpropertyvaluesize;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ResUtilFindDependentDiskResourceDriveLetter_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hcluster = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t hresource = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
    void* pszdriveletter = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pcchdriveletter = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ResUtilFindDependentDiskResourceDriveLetter")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcluster, hresource, pszdriveletter, pcchdriveletter) : 0;
#else
    (void)hcluster;
    (void)hresource;
    (void)pszdriveletter;
    (void)pcchdriveletter;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ResUtilFindDwordProperty_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ppropertylist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t cbpropertylistsize = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pszpropertyname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pdwpropertyvalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ResUtilFindDwordProperty")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(ppropertylist, cbpropertylistsize, pszpropertyname, pdwpropertyvalue) : 0;
#else
    (void)ppropertylist;
    (void)cbpropertylistsize;
    (void)pszpropertyname;
    (void)pdwpropertyvalue;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ResUtilFindExpandSzProperty_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ppropertylist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t cbpropertylistsize = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pszpropertyname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pszpropertyvalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ResUtilFindExpandSzProperty")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(ppropertylist, cbpropertylistsize, pszpropertyname, pszpropertyvalue) : 0;
#else
    (void)ppropertylist;
    (void)cbpropertylistsize;
    (void)pszpropertyname;
    (void)pszpropertyvalue;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ResUtilFindExpandedSzProperty_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ppropertylist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t cbpropertylistsize = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pszpropertyname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pszpropertyvalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ResUtilFindExpandedSzProperty")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(ppropertylist, cbpropertylistsize, pszpropertyname, pszpropertyvalue) : 0;
#else
    (void)ppropertylist;
    (void)cbpropertylistsize;
    (void)pszpropertyname;
    (void)pszpropertyvalue;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ResUtilFindFileTimeProperty_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ppropertylist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t cbpropertylistsize = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pszpropertyname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pftpropertyvalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ResUtilFindFileTimeProperty")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(ppropertylist, cbpropertylistsize, pszpropertyname, pftpropertyvalue) : 0;
#else
    (void)ppropertylist;
    (void)cbpropertylistsize;
    (void)pszpropertyname;
    (void)pftpropertyvalue;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ResUtilFindLongProperty_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ppropertylist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t cbpropertylistsize = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pszpropertyname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* plpropertyvalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ResUtilFindLongProperty")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(ppropertylist, cbpropertylistsize, pszpropertyname, plpropertyvalue) : 0;
#else
    (void)ppropertylist;
    (void)cbpropertylistsize;
    (void)pszpropertyname;
    (void)plpropertyvalue;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ResUtilFindMultiSzProperty_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ppropertylist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t cbpropertylistsize = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pszpropertyname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pszpropertyvalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pcbpropertyvaluesize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ResUtilFindMultiSzProperty")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(ppropertylist, cbpropertylistsize, pszpropertyname, pszpropertyvalue, pcbpropertyvaluesize) : 0;
#else
    (void)ppropertylist;
    (void)cbpropertylistsize;
    (void)pszpropertyname;
    (void)pszpropertyvalue;
    (void)pcbpropertyvaluesize;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ResUtilFindSzProperty_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ppropertylist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t cbpropertylistsize = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pszpropertyname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pszpropertyvalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ResUtilFindSzProperty")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(ppropertylist, cbpropertylistsize, pszpropertyname, pszpropertyvalue) : 0;
#else
    (void)ppropertylist;
    (void)cbpropertylistsize;
    (void)pszpropertyname;
    (void)pszpropertyvalue;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ResUtilFindULargeIntegerProperty_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ppropertylist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t cbpropertylistsize = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pszpropertyname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* plpropertyvalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ResUtilFindULargeIntegerProperty")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(ppropertylist, cbpropertylistsize, pszpropertyname, plpropertyvalue) : 0;
#else
    (void)ppropertylist;
    (void)cbpropertylistsize;
    (void)pszpropertyname;
    (void)plpropertyvalue;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ResUtilFreeEnvironment_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpenvironment = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ResUtilFreeEnvironment")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpenvironment) : 0;
#else
    (void)lpenvironment;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ResUtilFreeParameterBlock_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* poutparams = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pinparams = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* ppropertytable = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ResUtilFreeParameterBlock")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(poutparams, pinparams, ppropertytable);
#else
    (void)poutparams;
    (void)pinparams;
    (void)ppropertytable;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_networking_clustering_ResUtilGetAllProperties_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hkeyclusterkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ppropertytable = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* poutpropertylist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t cboutpropertylistsize = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* pcbbytesreturned = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* pcbrequired = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ResUtilGetAllProperties")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hkeyclusterkey, ppropertytable, poutpropertylist, cboutpropertylistsize, pcbbytesreturned, pcbrequired) : 0;
#else
    (void)hkeyclusterkey;
    (void)ppropertytable;
    (void)poutpropertylist;
    (void)cboutpropertylistsize;
    (void)pcbbytesreturned;
    (void)pcbrequired;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ResUtilGetBinaryProperty_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ppboutvalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pcboutvaluesize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pvaluestruct = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pboldvalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t cboldvaluesize = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* pppropertylist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* pcbpropertylistsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ResUtilGetBinaryProperty")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(ppboutvalue, pcboutvaluesize, pvaluestruct, pboldvalue, cboldvaluesize, pppropertylist, pcbpropertylistsize) : 0;
#else
    (void)ppboutvalue;
    (void)pcboutvaluesize;
    (void)pvaluestruct;
    (void)pboldvalue;
    (void)cboldvaluesize;
    (void)pppropertylist;
    (void)pcbpropertylistsize;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ResUtilGetBinaryValue_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hkeyclusterkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pszvaluename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* ppboutvalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pcboutvaluesize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ResUtilGetBinaryValue")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hkeyclusterkey, pszvaluename, ppboutvalue, pcboutvaluesize) : 0;
#else
    (void)hkeyclusterkey;
    (void)pszvaluename;
    (void)ppboutvalue;
    (void)pcboutvaluesize;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ResUtilGetClusterGroupType_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hgroup = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* grouptype = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ResUtilGetClusterGroupType")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hgroup, grouptype) : 0;
#else
    (void)hgroup;
    (void)grouptype;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ResUtilGetClusterId_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hcluster = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* guid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ResUtilGetClusterId")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcluster, guid) : 0;
#else
    (void)hcluster;
    (void)guid;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ResUtilGetClusterRoleState_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hcluster = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int32_t eclusterrole = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ResUtilGetClusterRoleState")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcluster, eclusterrole) : -1;
#else
    (void)hcluster;
    (void)eclusterrole;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ResUtilGetCoreClusterResources_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hcluster = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* phclusternameresource = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* phclusteripaddressresource = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* phclusterquorumresource = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ResUtilGetCoreClusterResources")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcluster, phclusternameresource, phclusteripaddressresource, phclusterquorumresource) : 0;
#else
    (void)hcluster;
    (void)phclusternameresource;
    (void)phclusteripaddressresource;
    (void)phclusterquorumresource;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ResUtilGetCoreClusterResourcesEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hclusterin = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* phclusternameresourceout = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* phclusterquorumresourceout = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t dwdesiredaccess = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ResUtilGetCoreClusterResourcesEx")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hclusterin, phclusternameresourceout, phclusterquorumresourceout, dwdesiredaccess) : 0;
#else
    (void)hclusterin;
    (void)phclusternameresourceout;
    (void)phclusterquorumresourceout;
    (void)dwdesiredaccess;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ResUtilGetCoreGroup_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hcluster = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ResUtilGetCoreGroup")));
    }
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcluster) : -1;
#else
    (void)hcluster;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ResUtilGetDwordProperty_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pdwoutvalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pvaluestruct = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwoldvalue = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t dwminimum = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t dwmaximum = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* pppropertylist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* pcbpropertylistsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ResUtilGetDwordProperty")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pdwoutvalue, pvaluestruct, dwoldvalue, dwminimum, dwmaximum, pppropertylist, pcbpropertylistsize) : 0;
#else
    (void)pdwoutvalue;
    (void)pvaluestruct;
    (void)dwoldvalue;
    (void)dwminimum;
    (void)dwmaximum;
    (void)pppropertylist;
    (void)pcbpropertylistsize;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ResUtilGetDwordValue_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hkeyclusterkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pszvaluename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pdwoutvalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t dwdefaultvalue = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ResUtilGetDwordValue")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hkeyclusterkey, pszvaluename, pdwoutvalue, dwdefaultvalue) : 0;
#else
    (void)hkeyclusterkey;
    (void)pszvaluename;
    (void)pdwoutvalue;
    (void)dwdefaultvalue;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ResUtilGetEnvironmentWithNetName_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hresource = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ResUtilGetEnvironmentWithNetName")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hresource) : NULL;
#else
    (void)hresource;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ResUtilGetLongProperty_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ploutvalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pvaluestruct = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t loldvalue = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t lminimum = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    int32_t lmaximum = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* pppropertylist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* pcbpropertylistsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ResUtilGetLongProperty")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(ploutvalue, pvaluestruct, loldvalue, lminimum, lmaximum, pppropertylist, pcbpropertylistsize) : 0;
#else
    (void)ploutvalue;
    (void)pvaluestruct;
    (void)loldvalue;
    (void)lminimum;
    (void)lmaximum;
    (void)pppropertylist;
    (void)pcbpropertylistsize;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ResUtilGetMultiSzProperty_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ppszoutvalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pcboutvaluesize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pvaluestruct = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pszoldvalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t cboldvaluesize = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* pppropertylist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* pcbpropertylistsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ResUtilGetMultiSzProperty")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(ppszoutvalue, pcboutvaluesize, pvaluestruct, pszoldvalue, cboldvaluesize, pppropertylist, pcbpropertylistsize) : 0;
#else
    (void)ppszoutvalue;
    (void)pcboutvaluesize;
    (void)pvaluestruct;
    (void)pszoldvalue;
    (void)cboldvaluesize;
    (void)pppropertylist;
    (void)pcbpropertylistsize;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ResUtilGetPrivateProperties_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hkeyclusterkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* poutpropertylist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t cboutpropertylistsize = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pcbbytesreturned = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pcbrequired = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ResUtilGetPrivateProperties")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hkeyclusterkey, poutpropertylist, cboutpropertylistsize, pcbbytesreturned, pcbrequired) : 0;
#else
    (void)hkeyclusterkey;
    (void)poutpropertylist;
    (void)cboutpropertylistsize;
    (void)pcbbytesreturned;
    (void)pcbrequired;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ResUtilGetProperties_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hkeyclusterkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ppropertytable = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* poutpropertylist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t cboutpropertylistsize = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* pcbbytesreturned = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* pcbrequired = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ResUtilGetProperties")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hkeyclusterkey, ppropertytable, poutpropertylist, cboutpropertylistsize, pcbbytesreturned, pcbrequired) : 0;
#else
    (void)hkeyclusterkey;
    (void)ppropertytable;
    (void)poutpropertylist;
    (void)cboutpropertylistsize;
    (void)pcbbytesreturned;
    (void)pcbrequired;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ResUtilGetPropertiesToParameterBlock_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hkeyclusterkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ppropertytable = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* poutparams = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int32_t bcheckforrequiredproperties = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* psznameofpropinerror = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ResUtilGetPropertiesToParameterBlock")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hkeyclusterkey, ppropertytable, poutparams, bcheckforrequiredproperties, psznameofpropinerror) : 0;
#else
    (void)hkeyclusterkey;
    (void)ppropertytable;
    (void)poutparams;
    (void)bcheckforrequiredproperties;
    (void)psznameofpropinerror;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ResUtilGetProperty_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hkeyclusterkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ppropertytableitem = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* poutpropertyitem = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pcboutpropertyitemsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ResUtilGetProperty")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hkeyclusterkey, ppropertytableitem, poutpropertyitem, pcboutpropertyitemsize) : 0;
#else
    (void)hkeyclusterkey;
    (void)ppropertytableitem;
    (void)poutpropertyitem;
    (void)pcboutpropertyitemsize;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ResUtilGetPropertyFormats_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ppropertytable = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* poutpropertyformatlist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t cbpropertyformatlistsize = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pcbbytesreturned = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pcbrequired = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ResUtilGetPropertyFormats")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(ppropertytable, poutpropertyformatlist, cbpropertyformatlistsize, pcbbytesreturned, pcbrequired) : 0;
#else
    (void)ppropertytable;
    (void)poutpropertyformatlist;
    (void)cbpropertyformatlistsize;
    (void)pcbbytesreturned;
    (void)pcbrequired;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ResUtilGetPropertySize_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hkeyclusterkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ppropertytableitem = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pcboutpropertylistsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pnpropertycount = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ResUtilGetPropertySize")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hkeyclusterkey, ppropertytableitem, pcboutpropertylistsize, pnpropertycount) : 0;
#else
    (void)hkeyclusterkey;
    (void)ppropertytableitem;
    (void)pcboutpropertylistsize;
    (void)pnpropertycount;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ResUtilGetQwordValue_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hkeyclusterkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pszvaluename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pqwoutvalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint64_t qwdefaultvalue = km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ResUtilGetQwordValue")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hkeyclusterkey, pszvaluename, pqwoutvalue, qwdefaultvalue) : 0;
#else
    (void)hkeyclusterkey;
    (void)pszvaluename;
    (void)pqwoutvalue;
    (void)qwdefaultvalue;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ResUtilGetResourceDependency_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hself = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpszresourcetype = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ResUtilGetResourceDependency")));
    }
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hself, lpszresourcetype) : -1;
#else
    (void)hself;
    (void)lpszresourcetype;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ResUtilGetResourceDependencyByClass_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hcluster = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* hself = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* prci = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int32_t brecurse = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ResUtilGetResourceDependencyByClass")));
    }
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcluster, hself, prci, brecurse) : -1;
#else
    (void)hcluster;
    (void)hself;
    (void)prci;
    (void)brecurse;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ResUtilGetResourceDependencyByClassEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hcluster = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* hself = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* prci = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int32_t brecurse = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t dwdesiredaccess = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, void*, void*, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ResUtilGetResourceDependencyByClassEx")));
    }
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcluster, hself, prci, brecurse, dwdesiredaccess) : -1;
#else
    (void)hcluster;
    (void)hself;
    (void)prci;
    (void)brecurse;
    (void)dwdesiredaccess;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ResUtilGetResourceDependencyByName_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hcluster = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* hself = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* lpszresourcetype = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int32_t brecurse = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ResUtilGetResourceDependencyByName")));
    }
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcluster, hself, lpszresourcetype, brecurse) : -1;
#else
    (void)hcluster;
    (void)hself;
    (void)lpszresourcetype;
    (void)brecurse;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ResUtilGetResourceDependencyByNameEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hcluster = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* hself = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* lpszresourcetype = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int32_t brecurse = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t dwdesiredaccess = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, void*, void*, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ResUtilGetResourceDependencyByNameEx")));
    }
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcluster, hself, lpszresourcetype, brecurse, dwdesiredaccess) : -1;
#else
    (void)hcluster;
    (void)hself;
    (void)lpszresourcetype;
    (void)brecurse;
    (void)dwdesiredaccess;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ResUtilGetResourceDependencyEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hself = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpszresourcetype = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwdesiredaccess = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ResUtilGetResourceDependencyEx")));
    }
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hself, lpszresourcetype, dwdesiredaccess) : -1;
#else
    (void)hself;
    (void)lpszresourcetype;
    (void)dwdesiredaccess;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ResUtilGetResourceDependentIPAddressProps_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hresource = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* pszaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pcchaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pszsubnetmask = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pcchsubnetmask = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* psznetwork = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* pcchnetwork = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ResUtilGetResourceDependentIPAddressProps")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hresource, pszaddress, pcchaddress, pszsubnetmask, pcchsubnetmask, psznetwork, pcchnetwork) : 0;
#else
    (void)hresource;
    (void)pszaddress;
    (void)pcchaddress;
    (void)pszsubnetmask;
    (void)pcchsubnetmask;
    (void)psznetwork;
    (void)pcchnetwork;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ResUtilGetResourceName_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hresource = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* pszresourcename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pcchresourcenameinout = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ResUtilGetResourceName")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hresource, pszresourcename, pcchresourcenameinout) : 0;
#else
    (void)hresource;
    (void)pszresourcename;
    (void)pcchresourcenameinout;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ResUtilGetResourceNameDependency_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpszresourcename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpszresourcetype = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ResUtilGetResourceNameDependency")));
    }
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpszresourcename, lpszresourcetype) : -1;
#else
    (void)lpszresourcename;
    (void)lpszresourcetype;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ResUtilGetResourceNameDependencyEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpszresourcename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpszresourcetype = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwdesiredaccess = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ResUtilGetResourceNameDependencyEx")));
    }
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpszresourcename, lpszresourcetype, dwdesiredaccess) : -1;
#else
    (void)lpszresourcename;
    (void)lpszresourcetype;
    (void)dwdesiredaccess;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ResUtilGetSzProperty_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ppszoutvalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pvaluestruct = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pszoldvalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pppropertylist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pcbpropertylistsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ResUtilGetSzProperty")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(ppszoutvalue, pvaluestruct, pszoldvalue, pppropertylist, pcbpropertylistsize) : 0;
#else
    (void)ppszoutvalue;
    (void)pvaluestruct;
    (void)pszoldvalue;
    (void)pppropertylist;
    (void)pcbpropertylistsize;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ResUtilGetSzValue_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hkeyclusterkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pszvaluename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ResUtilGetSzValue")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hkeyclusterkey, pszvaluename) : NULL;
#else
    (void)hkeyclusterkey;
    (void)pszvaluename;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ResUtilGroupsEqual_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hself = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t hgroup = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
    void* pequal = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ResUtilGroupsEqual")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hself, hgroup, pequal) : 0;
#else
    (void)hself;
    (void)hgroup;
    (void)pequal;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ResUtilIsPathValid_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pszpath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ResUtilIsPathValid")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pszpath) : -1;
#else
    (void)pszpath;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ResUtilIsResourceClassEqual_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* prci = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int64_t hresource = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ResUtilIsResourceClassEqual")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(prci, hresource) : -1;
#else
    (void)prci;
    (void)hresource;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ResUtilLeftPaxosIsLessThanRight_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* left = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* right = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ResUtilLeftPaxosIsLessThanRight")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(left, right) : -1;
#else
    (void)left;
    (void)right;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ResUtilNodeEnum_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hcluster = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* pnodecallback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pparameter = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ResUtilNodeEnum")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcluster, pnodecallback, pparameter) : 0;
#else
    (void)hcluster;
    (void)pnodecallback;
    (void)pparameter;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ResUtilPaxosComparer_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* left = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* right = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ResUtilPaxosComparer")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(left, right) : -1;
#else
    (void)left;
    (void)right;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ResUtilPropertyListFromParameterBlock_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ppropertytable = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* poutpropertylist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pcboutpropertylistsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pinparams = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pcbbytesreturned = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* pcbrequired = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ResUtilPropertyListFromParameterBlock")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(ppropertytable, poutpropertylist, pcboutpropertylistsize, pinparams, pcbbytesreturned, pcbrequired) : 0;
#else
    (void)ppropertytable;
    (void)poutpropertylist;
    (void)pcboutpropertylistsize;
    (void)pinparams;
    (void)pcbbytesreturned;
    (void)pcbrequired;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ResUtilRemoveResourceServiceEnvironment_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pszservicename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pfnlogevent = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int64_t hresourcehandle = km_info.Length() > 2 ? km_napi_arg_i64(km_info[2]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ResUtilRemoveResourceServiceEnvironment")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pszservicename, pfnlogevent, hresourcehandle) : 0;
#else
    (void)pszservicename;
    (void)pfnlogevent;
    (void)hresourcehandle;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ResUtilResourceDepEnum_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hself = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint32_t enumtype = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* prescallback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pparameter = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ResUtilResourceDepEnum")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hself, enumtype, prescallback, pparameter) : 0;
#else
    (void)hself;
    (void)enumtype;
    (void)prescallback;
    (void)pparameter;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ResUtilResourceTypesEqual_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpszresourcetypename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int64_t hresource = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ResUtilResourceTypesEqual")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpszresourcetypename, hresource) : -1;
#else
    (void)lpszresourcetypename;
    (void)hresource;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ResUtilResourcesEqual_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hself = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t hresource = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ResUtilResourcesEqual")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hself, hresource) : -1;
#else
    (void)hself;
    (void)hresource;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ResUtilSetBinaryValue_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hkeyclusterkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pszvaluename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pbnewvalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t cbnewvaluesize = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* ppboutvalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* pcboutvaluesize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ResUtilSetBinaryValue")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hkeyclusterkey, pszvaluename, pbnewvalue, cbnewvaluesize, ppboutvalue, pcboutvaluesize) : 0;
#else
    (void)hkeyclusterkey;
    (void)pszvaluename;
    (void)pbnewvalue;
    (void)cbnewvaluesize;
    (void)ppboutvalue;
    (void)pcboutvaluesize;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ResUtilSetDwordValue_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hkeyclusterkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pszvaluename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwnewvalue = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pdwoutvalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ResUtilSetDwordValue")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hkeyclusterkey, pszvaluename, dwnewvalue, pdwoutvalue) : 0;
#else
    (void)hkeyclusterkey;
    (void)pszvaluename;
    (void)dwnewvalue;
    (void)pdwoutvalue;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ResUtilSetExpandSzValue_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hkeyclusterkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pszvaluename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* psznewvalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* ppszoutstring = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ResUtilSetExpandSzValue")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hkeyclusterkey, pszvaluename, psznewvalue, ppszoutstring) : 0;
#else
    (void)hkeyclusterkey;
    (void)pszvaluename;
    (void)psznewvalue;
    (void)ppszoutstring;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ResUtilSetMultiSzValue_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hkeyclusterkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pszvaluename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* psznewvalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t cbnewvaluesize = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* ppszoutvalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* pcboutvaluesize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ResUtilSetMultiSzValue")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hkeyclusterkey, pszvaluename, psznewvalue, cbnewvaluesize, ppszoutvalue, pcboutvaluesize) : 0;
#else
    (void)hkeyclusterkey;
    (void)pszvaluename;
    (void)psznewvalue;
    (void)cbnewvaluesize;
    (void)ppszoutvalue;
    (void)pcboutvaluesize;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ResUtilSetPrivatePropertyList_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hkeyclusterkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pinpropertylist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t cbinpropertylistsize = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ResUtilSetPrivatePropertyList")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hkeyclusterkey, pinpropertylist, cbinpropertylistsize) : 0;
#else
    (void)hkeyclusterkey;
    (void)pinpropertylist;
    (void)cbinpropertylistsize;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ResUtilSetPropertyParameterBlock_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hkeyclusterkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ppropertytable = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* reserved = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pinparams = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pinpropertylist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t cbinpropertylistsize = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* poutparams = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ResUtilSetPropertyParameterBlock")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hkeyclusterkey, ppropertytable, reserved, pinparams, pinpropertylist, cbinpropertylistsize, poutparams) : 0;
#else
    (void)hkeyclusterkey;
    (void)ppropertytable;
    (void)reserved;
    (void)pinparams;
    (void)pinpropertylist;
    (void)cbinpropertylistsize;
    (void)poutparams;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ResUtilSetPropertyParameterBlockEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hkeyclusterkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ppropertytable = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* reserved = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pinparams = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pinpropertylist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t cbinpropertylistsize = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    int32_t bforcewrite = static_cast<int32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    void* poutparams = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ResUtilSetPropertyParameterBlockEx")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hkeyclusterkey, ppropertytable, reserved, pinparams, pinpropertylist, cbinpropertylistsize, bforcewrite, poutparams) : 0;
#else
    (void)hkeyclusterkey;
    (void)ppropertytable;
    (void)reserved;
    (void)pinparams;
    (void)pinpropertylist;
    (void)cbinpropertylistsize;
    (void)bforcewrite;
    (void)poutparams;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ResUtilSetPropertyTable_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hkeyclusterkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ppropertytable = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* reserved = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int32_t ballowunknownproperties = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* pinpropertylist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t cbinpropertylistsize = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* poutparams = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ResUtilSetPropertyTable")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hkeyclusterkey, ppropertytable, reserved, ballowunknownproperties, pinpropertylist, cbinpropertylistsize, poutparams) : 0;
#else
    (void)hkeyclusterkey;
    (void)ppropertytable;
    (void)reserved;
    (void)ballowunknownproperties;
    (void)pinpropertylist;
    (void)cbinpropertylistsize;
    (void)poutparams;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ResUtilSetPropertyTableEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hkeyclusterkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ppropertytable = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* reserved = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int32_t ballowunknownproperties = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* pinpropertylist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t cbinpropertylistsize = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    int32_t bforcewrite = static_cast<int32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    void* poutparams = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, void*, uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ResUtilSetPropertyTableEx")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hkeyclusterkey, ppropertytable, reserved, ballowunknownproperties, pinpropertylist, cbinpropertylistsize, bforcewrite, poutparams) : 0;
#else
    (void)hkeyclusterkey;
    (void)ppropertytable;
    (void)reserved;
    (void)ballowunknownproperties;
    (void)pinpropertylist;
    (void)cbinpropertylistsize;
    (void)bforcewrite;
    (void)poutparams;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ResUtilSetQwordValue_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hkeyclusterkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pszvaluename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint64_t qwnewvalue = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
    void* pqwoutvalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ResUtilSetQwordValue")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hkeyclusterkey, pszvaluename, qwnewvalue, pqwoutvalue) : 0;
#else
    (void)hkeyclusterkey;
    (void)pszvaluename;
    (void)qwnewvalue;
    (void)pqwoutvalue;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ResUtilSetResourceServiceEnvironment_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pszservicename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int64_t hresource = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
    void* pfnlogevent = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int64_t hresourcehandle = km_info.Length() > 3 ? km_napi_arg_i64(km_info[3]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int64_t, void*, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ResUtilSetResourceServiceEnvironment")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pszservicename, hresource, pfnlogevent, hresourcehandle) : 0;
#else
    (void)pszservicename;
    (void)hresource;
    (void)pfnlogevent;
    (void)hresourcehandle;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ResUtilSetResourceServiceStartParameters_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pszservicename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* schscmhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* phservice = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pfnlogevent = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    int64_t hresourcehandle = km_info.Length() > 4 ? km_napi_arg_i64(km_info[4]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ResUtilSetResourceServiceStartParameters")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pszservicename, schscmhandle, phservice, pfnlogevent, hresourcehandle) : 0;
#else
    (void)pszservicename;
    (void)schscmhandle;
    (void)phservice;
    (void)pfnlogevent;
    (void)hresourcehandle;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ResUtilSetResourceServiceStartParametersEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pszservicename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* schscmhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* phservice = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t dwdesiredaccess = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* pfnlogevent = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    int64_t hresourcehandle = km_info.Length() > 5 ? km_napi_arg_i64(km_info[5]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ResUtilSetResourceServiceStartParametersEx")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pszservicename, schscmhandle, phservice, dwdesiredaccess, pfnlogevent, hresourcehandle) : 0;
#else
    (void)pszservicename;
    (void)schscmhandle;
    (void)phservice;
    (void)dwdesiredaccess;
    (void)pfnlogevent;
    (void)hresourcehandle;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ResUtilSetSzValue_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hkeyclusterkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pszvaluename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* psznewvalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* ppszoutstring = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ResUtilSetSzValue")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hkeyclusterkey, pszvaluename, psznewvalue, ppszoutstring) : 0;
#else
    (void)hkeyclusterkey;
    (void)pszvaluename;
    (void)psznewvalue;
    (void)ppszoutstring;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ResUtilSetUnknownProperties_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hkeyclusterkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ppropertytable = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pinpropertylist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t cbinpropertylistsize = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ResUtilSetUnknownProperties")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hkeyclusterkey, ppropertytable, pinpropertylist, cbinpropertylistsize) : 0;
#else
    (void)hkeyclusterkey;
    (void)ppropertytable;
    (void)pinpropertylist;
    (void)cbinpropertylistsize;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ResUtilSetValueEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hkeyclusterkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* valuename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t valuetype = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* valuedata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t valuesize = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ResUtilSetValueEx")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hkeyclusterkey, valuename, valuetype, valuedata, valuesize, flags) : 0;
#else
    (void)hkeyclusterkey;
    (void)valuename;
    (void)valuetype;
    (void)valuedata;
    (void)valuesize;
    (void)flags;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ResUtilStartResourceService_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pszservicename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* phservicehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ResUtilStartResourceService")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pszservicename, phservicehandle) : 0;
#else
    (void)pszservicename;
    (void)phservicehandle;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ResUtilStopResourceService_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pszservicename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ResUtilStopResourceService")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pszservicename) : 0;
#else
    (void)pszservicename;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ResUtilStopService_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hservicehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ResUtilStopService")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hservicehandle) : 0;
#else
    (void)hservicehandle;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ResUtilTerminateServiceProcessFromResDll_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwservicepid = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    int32_t boffline = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pdwresourcestate = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pfnlogevent = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    int64_t hresourcehandle = km_info.Length() > 4 ? km_napi_arg_i64(km_info[4]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, int32_t, void*, void*, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ResUtilTerminateServiceProcessFromResDll")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwservicepid, boffline, pdwresourcestate, pfnlogevent, hresourcehandle) : 0;
#else
    (void)dwservicepid;
    (void)boffline;
    (void)pdwresourcestate;
    (void)pfnlogevent;
    (void)hresourcehandle;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ResUtilVerifyPrivatePropertyList_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pinpropertylist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t cbinpropertylistsize = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ResUtilVerifyPrivatePropertyList")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pinpropertylist, cbinpropertylistsize) : 0;
#else
    (void)pinpropertylist;
    (void)cbinpropertylistsize;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ResUtilVerifyPropertyTable_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ppropertytable = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* reserved = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t ballowunknownproperties = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pinpropertylist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t cbinpropertylistsize = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* poutparams = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ResUtilVerifyPropertyTable")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(ppropertytable, reserved, ballowunknownproperties, pinpropertylist, cbinpropertylistsize, poutparams) : 0;
#else
    (void)ppropertytable;
    (void)reserved;
    (void)ballowunknownproperties;
    (void)pinpropertylist;
    (void)cbinpropertylistsize;
    (void)poutparams;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ResUtilVerifyResourceService_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pszservicename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ResUtilVerifyResourceService")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pszservicename) : 0;
#else
    (void)pszservicename;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ResUtilVerifyService_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hservicehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ResUtilVerifyService")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hservicehandle) : 0;
#else
    (void)hservicehandle;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ResUtilVerifyShutdownSafe_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t reason = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* presult = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ResUtilVerifyShutdownSafe")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(flags, reason, presult) : 0;
#else
    (void)flags;
    (void)reason;
    (void)presult;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ResUtilsDeleteKeyTree_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* key = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* keyname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t treatnokeyaserror = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ResUtilsDeleteKeyTree")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(key, keyname, treatnokeyaserror) : 0;
#else
    (void)key;
    (void)keyname;
    (void)treatnokeyaserror;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ResetAllAppInstanceVersions_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntlanman.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ResetAllAppInstanceVersions")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr() : 0;
#else
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_RestartClusterResource_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hresource = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RestartClusterResource")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hresource, dwflags) : 0;
#else
    (void)hresource;
    (void)dwflags;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_RestartClusterResourceEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hresource = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* lpszreason = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RestartClusterResourceEx")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hresource, dwflags, lpszreason) : 0;
#else
    (void)hresource;
    (void)dwflags;
    (void)lpszreason;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_RestoreClusterDatabase_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpszpathname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t bforce = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* lpszquorumdriveletter = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RestoreClusterDatabase")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpszpathname, bforce, lpszquorumdriveletter) : 0;
#else
    (void)lpszpathname;
    (void)bforce;
    (void)lpszquorumdriveletter;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ResumeClusterNode_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hnode = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ResumeClusterNode")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hnode) : 0;
#else
    (void)hnode;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ResumeClusterNodeEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hnode = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int32_t eresumefailbacktype = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t dwresumeflagsreserved = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ResumeClusterNodeEx")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hnode, eresumefailbacktype, dwresumeflagsreserved) : 0;
#else
    (void)hnode;
    (void)eresumefailbacktype;
    (void)dwresumeflagsreserved;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_ResumeClusterNodeEx2_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hnode = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int32_t eresumefailbacktype = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t dwresumeflagsreserved = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* lpszreason = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ResumeClusterNodeEx2")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hnode, eresumefailbacktype, dwresumeflagsreserved, lpszreason) : 0;
#else
    (void)hnode;
    (void)eresumefailbacktype;
    (void)dwresumeflagsreserved;
    (void)lpszreason;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_SetAppInstanceCsvFlags_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* processhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t mask = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntlanman.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetAppInstanceCsvFlags")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(processhandle, mask, flags) : 0;
#else
    (void)processhandle;
    (void)mask;
    (void)flags;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_SetClusterGroupName_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hgroup = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* lpszgroupname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetClusterGroupName")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hgroup, lpszgroupname) : 0;
#else
    (void)hgroup;
    (void)lpszgroupname;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_SetClusterGroupNameEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hgroup = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* lpszgroupname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* lpszreason = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetClusterGroupNameEx")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hgroup, lpszgroupname, lpszreason) : 0;
#else
    (void)hgroup;
    (void)lpszgroupname;
    (void)lpszreason;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_SetClusterGroupNodeList_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hgroup = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint32_t nodecount = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* nodelist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetClusterGroupNodeList")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hgroup, nodecount, nodelist) : 0;
#else
    (void)hgroup;
    (void)nodecount;
    (void)nodelist;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_SetClusterGroupNodeListEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hgroup = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint32_t nodecount = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* nodelist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* lpszreason = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetClusterGroupNodeListEx")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hgroup, nodecount, nodelist, lpszreason) : 0;
#else
    (void)hgroup;
    (void)nodecount;
    (void)nodelist;
    (void)lpszreason;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_SetClusterGroupSetDependencyExpression_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hgroupset = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* lpszdependencyexprssion = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetClusterGroupSetDependencyExpression")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hgroupset, lpszdependencyexprssion) : 0;
#else
    (void)hgroupset;
    (void)lpszdependencyexprssion;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_SetClusterGroupSetDependencyExpressionEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hgroupset = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* lpszdependencyexpression = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* lpszreason = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetClusterGroupSetDependencyExpressionEx")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hgroupset, lpszdependencyexpression, lpszreason) : 0;
#else
    (void)hgroupset;
    (void)lpszdependencyexpression;
    (void)lpszreason;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_SetClusterName_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hcluster = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* lpsznewclustername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetClusterName")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcluster, lpsznewclustername) : 0;
#else
    (void)hcluster;
    (void)lpsznewclustername;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_SetClusterNameEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hcluster = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* lpsznewclustername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* lpszreason = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetClusterNameEx")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcluster, lpsznewclustername, lpszreason) : 0;
#else
    (void)hcluster;
    (void)lpsznewclustername;
    (void)lpszreason;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_SetClusterNetworkName_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hnetwork = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* lpszname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetClusterNetworkName")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hnetwork, lpszname) : 0;
#else
    (void)hnetwork;
    (void)lpszname;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_SetClusterNetworkNameEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hnetwork = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* lpszname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* lpszreason = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetClusterNetworkNameEx")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hnetwork, lpszname, lpszreason) : 0;
#else
    (void)hnetwork;
    (void)lpszname;
    (void)lpszreason;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_SetClusterNetworkPriorityOrder_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hcluster = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint32_t networkcount = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* networklist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetClusterNetworkPriorityOrder")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcluster, networkcount, networklist) : 0;
#else
    (void)hcluster;
    (void)networkcount;
    (void)networklist;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_SetClusterQuorumResource_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hresource = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* lpszdevicename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwmaxquologsize = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetClusterQuorumResource")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hresource, lpszdevicename, dwmaxquologsize) : 0;
#else
    (void)hresource;
    (void)lpszdevicename;
    (void)dwmaxquologsize;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_SetClusterQuorumResourceEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hresource = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* lpszdevicename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwmaxquorumlogsize = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* lpszreason = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetClusterQuorumResourceEx")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hresource, lpszdevicename, dwmaxquorumlogsize, lpszreason) : 0;
#else
    (void)hresource;
    (void)lpszdevicename;
    (void)dwmaxquorumlogsize;
    (void)lpszreason;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_SetClusterResourceDependencyExpression_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hresource = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* lpszdependencyexpression = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetClusterResourceDependencyExpression")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hresource, lpszdependencyexpression) : 0;
#else
    (void)hresource;
    (void)lpszdependencyexpression;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_SetClusterResourceName_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hresource = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* lpszresourcename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetClusterResourceName")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hresource, lpszresourcename) : 0;
#else
    (void)hresource;
    (void)lpszresourcename;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_SetClusterResourceNameEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hresource = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* lpszresourcename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* lpszreason = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetClusterResourceNameEx")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hresource, lpszresourcename, lpszreason) : 0;
#else
    (void)hresource;
    (void)lpszresourcename;
    (void)lpszreason;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_SetClusterServiceAccountPassword_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpszclustername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpsznewpassword = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* lpreturnstatusbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* lpcbreturnstatusbuffersize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetClusterServiceAccountPassword")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpszclustername, lpsznewpassword, dwflags, lpreturnstatusbuffer, lpcbreturnstatusbuffersize) : 0;
#else
    (void)lpszclustername;
    (void)lpsznewpassword;
    (void)dwflags;
    (void)lpreturnstatusbuffer;
    (void)lpcbreturnstatusbuffersize;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_SetGroupDependencyExpression_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hgroup = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* lpszdependencyexpression = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetGroupDependencyExpression")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hgroup, lpszdependencyexpression) : 0;
#else
    (void)hgroup;
    (void)lpszdependencyexpression;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_SetGroupDependencyExpressionEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hgroup = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* lpszdependencyexpression = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* lpszreason = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetGroupDependencyExpressionEx")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hgroup, lpszdependencyexpression, lpszreason) : 0;
#else
    (void)hgroup;
    (void)lpszdependencyexpression;
    (void)lpszreason;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static void register_windows_win32_networking_clustering_napi(Napi::Env env, Napi::Object exports) {
    exports.Set("windowssys_windows_win32_networking_clustering_AddClusterGroupDependency", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_AddClusterGroupDependency_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_AddClusterGroupDependencyEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_AddClusterGroupDependencyEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_AddClusterGroupSetDependency", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_AddClusterGroupSetDependency_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_AddClusterGroupSetDependencyEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_AddClusterGroupSetDependencyEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_AddClusterGroupToGroupSetDependency", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_AddClusterGroupToGroupSetDependency_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_AddClusterGroupToGroupSetDependencyEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_AddClusterGroupToGroupSetDependencyEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_AddClusterNode", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_AddClusterNode_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_AddClusterNodeEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_AddClusterNodeEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_AddClusterResourceDependency", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_AddClusterResourceDependency_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_AddClusterResourceDependencyEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_AddClusterResourceDependencyEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_AddClusterResourceNode", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_AddClusterResourceNode_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_AddClusterResourceNodeEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_AddClusterResourceNodeEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_AddClusterStorageNode", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_AddClusterStorageNode_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_AddCrossClusterGroupSetDependency", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_AddCrossClusterGroupSetDependency_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_AddResourceToClusterSharedVolumes", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_AddResourceToClusterSharedVolumes_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_BackupClusterDatabase", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_BackupClusterDatabase_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_CanResourceBeDependent", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_CanResourceBeDependent_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_CancelClusterGroupOperation", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_CancelClusterGroupOperation_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ChangeClusterResourceGroup", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ChangeClusterResourceGroup_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ChangeClusterResourceGroupEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ChangeClusterResourceGroupEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ChangeClusterResourceGroupEx2", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ChangeClusterResourceGroupEx2_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_CloseCluster", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_CloseCluster_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_CloseClusterCryptProvider", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_CloseClusterCryptProvider_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_CloseClusterGroup", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_CloseClusterGroup_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_CloseClusterGroupSet", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_CloseClusterGroupSet_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_CloseClusterNetInterface", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_CloseClusterNetInterface_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_CloseClusterNetwork", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_CloseClusterNetwork_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_CloseClusterNode", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_CloseClusterNode_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_CloseClusterNotifyPort", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_CloseClusterNotifyPort_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_CloseClusterResource", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_CloseClusterResource_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ClusAddClusterHealthFault", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ClusAddClusterHealthFault_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ClusGetClusterHealthFaults", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ClusGetClusterHealthFaults_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ClusRemoveClusterHealthFault", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ClusRemoveClusterHealthFault_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ClusWorkerCheckTerminate", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ClusWorkerCheckTerminate_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ClusWorkerCreate", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ClusWorkerCreate_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ClusWorkerTerminate", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ClusWorkerTerminate_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ClusWorkerTerminateEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ClusWorkerTerminateEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ClusWorkersTerminate", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ClusWorkersTerminate_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ClusapiSetReasonHandler", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ClusapiSetReasonHandler_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ClusterAddGroupToAffinityRule", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ClusterAddGroupToAffinityRule_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ClusterAddGroupToGroupSet", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ClusterAddGroupToGroupSet_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ClusterAddGroupToGroupSetWithDomains", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ClusterAddGroupToGroupSetWithDomains_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ClusterAddGroupToGroupSetWithDomainsEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ClusterAddGroupToGroupSetWithDomainsEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ClusterAffinityRuleControl", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ClusterAffinityRuleControl_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ClusterClearBackupStateForSharedVolume", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ClusterClearBackupStateForSharedVolume_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ClusterCloseEnum", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ClusterCloseEnum_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ClusterCloseEnumEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ClusterCloseEnumEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ClusterControl", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ClusterControl_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ClusterControlEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ClusterControlEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ClusterCreateAffinityRule", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ClusterCreateAffinityRule_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ClusterDecrypt", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ClusterDecrypt_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ClusterEncrypt", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ClusterEncrypt_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ClusterEnum", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ClusterEnum_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ClusterEnumEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ClusterEnumEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ClusterGetEnumCount", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ClusterGetEnumCount_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ClusterGetEnumCountEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ClusterGetEnumCountEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ClusterGetVolumeNameForVolumeMountPoint", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ClusterGetVolumeNameForVolumeMountPoint_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ClusterGetVolumePathName", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ClusterGetVolumePathName_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ClusterGroupCloseEnum", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ClusterGroupCloseEnum_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ClusterGroupCloseEnumEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ClusterGroupCloseEnumEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ClusterGroupControl", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ClusterGroupControl_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ClusterGroupControlEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ClusterGroupControlEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ClusterGroupEnum", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ClusterGroupEnum_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ClusterGroupEnumEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ClusterGroupEnumEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ClusterGroupGetEnumCount", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ClusterGroupGetEnumCount_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ClusterGroupGetEnumCountEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ClusterGroupGetEnumCountEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ClusterGroupOpenEnum", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ClusterGroupOpenEnum_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ClusterGroupOpenEnumEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ClusterGroupOpenEnumEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ClusterGroupSetCloseEnum", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ClusterGroupSetCloseEnum_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ClusterGroupSetControl", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ClusterGroupSetControl_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ClusterGroupSetControlEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ClusterGroupSetControlEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ClusterGroupSetEnum", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ClusterGroupSetEnum_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ClusterGroupSetGetEnumCount", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ClusterGroupSetGetEnumCount_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ClusterGroupSetOpenEnum", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ClusterGroupSetOpenEnum_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ClusterIsPathOnSharedVolume", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ClusterIsPathOnSharedVolume_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ClusterNetInterfaceCloseEnum", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ClusterNetInterfaceCloseEnum_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ClusterNetInterfaceControl", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ClusterNetInterfaceControl_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ClusterNetInterfaceControlEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ClusterNetInterfaceControlEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ClusterNetInterfaceEnum", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ClusterNetInterfaceEnum_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ClusterNetInterfaceOpenEnum", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ClusterNetInterfaceOpenEnum_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ClusterNetworkCloseEnum", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ClusterNetworkCloseEnum_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ClusterNetworkControl", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ClusterNetworkControl_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ClusterNetworkControlEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ClusterNetworkControlEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ClusterNetworkEnum", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ClusterNetworkEnum_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ClusterNetworkGetEnumCount", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ClusterNetworkGetEnumCount_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ClusterNetworkOpenEnum", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ClusterNetworkOpenEnum_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ClusterNodeCloseEnum", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ClusterNodeCloseEnum_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ClusterNodeCloseEnumEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ClusterNodeCloseEnumEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ClusterNodeControl", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ClusterNodeControl_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ClusterNodeControlEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ClusterNodeControlEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ClusterNodeEnum", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ClusterNodeEnum_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ClusterNodeEnumEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ClusterNodeEnumEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ClusterNodeGetEnumCount", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ClusterNodeGetEnumCount_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ClusterNodeGetEnumCountEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ClusterNodeGetEnumCountEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ClusterNodeOpenEnum", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ClusterNodeOpenEnum_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ClusterNodeOpenEnumEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ClusterNodeOpenEnumEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ClusterNodeReplacement", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ClusterNodeReplacement_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ClusterOpenEnum", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ClusterOpenEnum_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ClusterOpenEnumEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ClusterOpenEnumEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ClusterPrepareSharedVolumeForBackup", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ClusterPrepareSharedVolumeForBackup_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ClusterRegBatchAddCommand", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ClusterRegBatchAddCommand_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ClusterRegBatchCloseNotification", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ClusterRegBatchCloseNotification_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ClusterRegBatchReadCommand", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ClusterRegBatchReadCommand_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ClusterRegCloseBatch", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ClusterRegCloseBatch_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ClusterRegCloseBatchEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ClusterRegCloseBatchEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ClusterRegCloseBatchNotifyPort", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ClusterRegCloseBatchNotifyPort_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ClusterRegCloseKey", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ClusterRegCloseKey_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ClusterRegCloseReadBatch", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ClusterRegCloseReadBatch_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ClusterRegCloseReadBatchEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ClusterRegCloseReadBatchEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ClusterRegCloseReadBatchReply", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ClusterRegCloseReadBatchReply_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ClusterRegCreateBatch", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ClusterRegCreateBatch_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ClusterRegCreateBatchNotifyPort", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ClusterRegCreateBatchNotifyPort_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ClusterRegCreateKey", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ClusterRegCreateKey_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ClusterRegCreateKeyEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ClusterRegCreateKeyEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ClusterRegCreateReadBatch", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ClusterRegCreateReadBatch_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ClusterRegDeleteKey", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ClusterRegDeleteKey_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ClusterRegDeleteKeyEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ClusterRegDeleteKeyEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ClusterRegDeleteValue", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ClusterRegDeleteValue_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ClusterRegDeleteValueEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ClusterRegDeleteValueEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ClusterRegEnumKey", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ClusterRegEnumKey_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ClusterRegEnumValue", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ClusterRegEnumValue_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ClusterRegGetBatchNotification", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ClusterRegGetBatchNotification_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ClusterRegGetKeySecurity", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ClusterRegGetKeySecurity_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ClusterRegOpenKey", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ClusterRegOpenKey_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ClusterRegQueryInfoKey", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ClusterRegQueryInfoKey_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ClusterRegQueryValue", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ClusterRegQueryValue_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ClusterRegReadBatchAddCommand", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ClusterRegReadBatchAddCommand_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ClusterRegReadBatchReplyNextCommand", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ClusterRegReadBatchReplyNextCommand_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ClusterRegSetKeySecurity", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ClusterRegSetKeySecurity_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ClusterRegSetKeySecurityEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ClusterRegSetKeySecurityEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ClusterRegSetValue", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ClusterRegSetValue_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ClusterRegSetValueEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ClusterRegSetValueEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ClusterRegSyncDatabase", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ClusterRegSyncDatabase_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ClusterRemoveAffinityRule", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ClusterRemoveAffinityRule_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ClusterRemoveGroupFromAffinityRule", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ClusterRemoveGroupFromAffinityRule_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ClusterRemoveGroupFromGroupSet", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ClusterRemoveGroupFromGroupSet_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ClusterRemoveGroupFromGroupSetEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ClusterRemoveGroupFromGroupSetEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ClusterResourceCloseEnum", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ClusterResourceCloseEnum_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ClusterResourceCloseEnumEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ClusterResourceCloseEnumEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ClusterResourceControl", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ClusterResourceControl_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ClusterResourceControlAsUser", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ClusterResourceControlAsUser_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ClusterResourceControlAsUserEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ClusterResourceControlAsUserEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ClusterResourceControlEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ClusterResourceControlEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ClusterResourceEnum", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ClusterResourceEnum_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ClusterResourceEnumEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ClusterResourceEnumEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ClusterResourceGetEnumCount", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ClusterResourceGetEnumCount_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ClusterResourceGetEnumCountEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ClusterResourceGetEnumCountEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ClusterResourceOpenEnum", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ClusterResourceOpenEnum_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ClusterResourceOpenEnumEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ClusterResourceOpenEnumEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ClusterResourceTypeCloseEnum", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ClusterResourceTypeCloseEnum_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ClusterResourceTypeControl", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ClusterResourceTypeControl_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ClusterResourceTypeControlAsUser", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ClusterResourceTypeControlAsUser_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ClusterResourceTypeControlAsUserEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ClusterResourceTypeControlAsUserEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ClusterResourceTypeControlEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ClusterResourceTypeControlEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ClusterResourceTypeEnum", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ClusterResourceTypeEnum_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ClusterResourceTypeGetEnumCount", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ClusterResourceTypeGetEnumCount_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ClusterResourceTypeOpenEnum", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ClusterResourceTypeOpenEnum_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ClusterSetAccountAccess", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ClusterSetAccountAccess_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ClusterUpgradeFunctionalLevel", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ClusterUpgradeFunctionalLevel_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_CreateCluster", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_CreateCluster_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_CreateClusterAvailabilitySet", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_CreateClusterAvailabilitySet_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_CreateClusterGroup", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_CreateClusterGroup_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_CreateClusterGroupEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_CreateClusterGroupEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_CreateClusterGroupSet", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_CreateClusterGroupSet_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_CreateClusterNameAccount", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_CreateClusterNameAccount_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_CreateClusterNotifyPort", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_CreateClusterNotifyPort_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_CreateClusterNotifyPortV2", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_CreateClusterNotifyPortV2_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_CreateClusterResource", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_CreateClusterResource_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_CreateClusterResourceEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_CreateClusterResourceEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_CreateClusterResourceType", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_CreateClusterResourceType_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_CreateClusterResourceTypeEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_CreateClusterResourceTypeEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_DeleteClusterGroup", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_DeleteClusterGroup_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_DeleteClusterGroupEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_DeleteClusterGroupEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_DeleteClusterGroupSet", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_DeleteClusterGroupSet_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_DeleteClusterGroupSetEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_DeleteClusterGroupSetEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_DeleteClusterResource", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_DeleteClusterResource_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_DeleteClusterResourceEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_DeleteClusterResourceEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_DeleteClusterResourceType", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_DeleteClusterResourceType_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_DeleteClusterResourceTypeEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_DeleteClusterResourceTypeEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_DestroyCluster", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_DestroyCluster_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_DestroyClusterGroup", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_DestroyClusterGroup_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_DestroyClusterGroupEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_DestroyClusterGroupEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_DetermineCNOResTypeFromCluster", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_DetermineCNOResTypeFromCluster_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_DetermineCNOResTypeFromNodelist", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_DetermineCNOResTypeFromNodelist_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_DetermineClusterCloudTypeFromCluster", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_DetermineClusterCloudTypeFromCluster_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_DetermineClusterCloudTypeFromNodelist", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_DetermineClusterCloudTypeFromNodelist_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_EvictClusterNode", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_EvictClusterNode_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_EvictClusterNodeEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_EvictClusterNodeEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_EvictClusterNodeEx2", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_EvictClusterNodeEx2_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_FailClusterResource", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_FailClusterResource_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_FailClusterResourceEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_FailClusterResourceEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_FreeClusterCrypt", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_FreeClusterCrypt_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_FreeClusterHealthFault", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_FreeClusterHealthFault_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_FreeClusterHealthFaultArray", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_FreeClusterHealthFaultArray_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_GetClusterFromGroup", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_GetClusterFromGroup_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_GetClusterFromNetInterface", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_GetClusterFromNetInterface_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_GetClusterFromNetwork", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_GetClusterFromNetwork_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_GetClusterFromNode", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_GetClusterFromNode_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_GetClusterFromResource", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_GetClusterFromResource_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_GetClusterGroupKey", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_GetClusterGroupKey_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_GetClusterGroupState", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_GetClusterGroupState_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_GetClusterInformation", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_GetClusterInformation_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_GetClusterKey", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_GetClusterKey_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_GetClusterNetInterface", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_GetClusterNetInterface_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_GetClusterNetInterfaceKey", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_GetClusterNetInterfaceKey_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_GetClusterNetInterfaceState", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_GetClusterNetInterfaceState_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_GetClusterNetworkId", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_GetClusterNetworkId_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_GetClusterNetworkKey", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_GetClusterNetworkKey_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_GetClusterNetworkState", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_GetClusterNetworkState_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_GetClusterNodeId", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_GetClusterNodeId_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_GetClusterNodeKey", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_GetClusterNodeKey_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_GetClusterNodeState", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_GetClusterNodeState_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_GetClusterNotify", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_GetClusterNotify_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_GetClusterNotifyV2", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_GetClusterNotifyV2_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_GetClusterQuorumResource", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_GetClusterQuorumResource_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_GetClusterResourceDependencyExpression", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_GetClusterResourceDependencyExpression_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_GetClusterResourceKey", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_GetClusterResourceKey_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_GetClusterResourceNetworkName", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_GetClusterResourceNetworkName_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_GetClusterResourceState", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_GetClusterResourceState_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_GetClusterResourceTypeKey", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_GetClusterResourceTypeKey_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_GetNodeCloudTypeDW", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_GetNodeCloudTypeDW_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_GetNodeClusterState", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_GetNodeClusterState_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_GetNotifyEventHandle", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_GetNotifyEventHandle_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_InitializeClusterHealthFault", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_InitializeClusterHealthFault_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_InitializeClusterHealthFaultArray", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_InitializeClusterHealthFaultArray_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_IsFileOnClusterSharedVolume", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_IsFileOnClusterSharedVolume_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_MoveClusterGroup", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_MoveClusterGroup_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_MoveClusterGroupEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_MoveClusterGroupEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_MoveClusterGroupEx2", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_MoveClusterGroupEx2_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_OfflineClusterGroup", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_OfflineClusterGroup_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_OfflineClusterGroupEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_OfflineClusterGroupEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_OfflineClusterGroupEx2", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_OfflineClusterGroupEx2_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_OfflineClusterResource", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_OfflineClusterResource_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_OfflineClusterResourceEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_OfflineClusterResourceEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_OfflineClusterResourceEx2", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_OfflineClusterResourceEx2_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_OnlineClusterGroup", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_OnlineClusterGroup_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_OnlineClusterGroupEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_OnlineClusterGroupEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_OnlineClusterGroupEx2", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_OnlineClusterGroupEx2_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_OnlineClusterResource", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_OnlineClusterResource_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_OnlineClusterResourceEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_OnlineClusterResourceEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_OnlineClusterResourceEx2", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_OnlineClusterResourceEx2_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_OpenCluster", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_OpenCluster_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_OpenClusterCryptProvider", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_OpenClusterCryptProvider_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_OpenClusterCryptProviderEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_OpenClusterCryptProviderEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_OpenClusterEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_OpenClusterEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_OpenClusterGroup", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_OpenClusterGroup_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_OpenClusterGroupEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_OpenClusterGroupEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_OpenClusterGroupSet", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_OpenClusterGroupSet_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_OpenClusterNetInterface", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_OpenClusterNetInterface_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_OpenClusterNetInterfaceEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_OpenClusterNetInterfaceEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_OpenClusterNetwork", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_OpenClusterNetwork_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_OpenClusterNetworkEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_OpenClusterNetworkEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_OpenClusterNode", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_OpenClusterNode_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_OpenClusterNodeById", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_OpenClusterNodeById_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_OpenClusterNodeEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_OpenClusterNodeEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_OpenClusterResource", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_OpenClusterResource_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_OpenClusterResourceEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_OpenClusterResourceEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_PauseClusterNode", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_PauseClusterNode_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_PauseClusterNodeEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_PauseClusterNodeEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_PauseClusterNodeEx2", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_PauseClusterNodeEx2_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_QueryAppInstanceVersion", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_QueryAppInstanceVersion_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_RegisterAppInstance", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_RegisterAppInstance_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_RegisterAppInstanceVersion", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_RegisterAppInstanceVersion_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_RegisterClusterNotify", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_RegisterClusterNotify_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_RegisterClusterResourceTypeNotifyV2", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_RegisterClusterResourceTypeNotifyV2_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_RemoveClusterGroupDependency", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_RemoveClusterGroupDependency_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_RemoveClusterGroupDependencyEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_RemoveClusterGroupDependencyEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_RemoveClusterGroupSetDependency", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_RemoveClusterGroupSetDependency_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_RemoveClusterGroupSetDependencyEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_RemoveClusterGroupSetDependencyEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_RemoveClusterGroupToGroupSetDependency", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_RemoveClusterGroupToGroupSetDependency_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_RemoveClusterGroupToGroupSetDependencyEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_RemoveClusterGroupToGroupSetDependencyEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_RemoveClusterNameAccount", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_RemoveClusterNameAccount_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_RemoveClusterResourceDependency", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_RemoveClusterResourceDependency_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_RemoveClusterResourceDependencyEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_RemoveClusterResourceDependencyEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_RemoveClusterResourceNode", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_RemoveClusterResourceNode_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_RemoveClusterResourceNodeEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_RemoveClusterResourceNodeEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_RemoveClusterStorageNode", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_RemoveClusterStorageNode_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_RemoveCrossClusterGroupSetDependency", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_RemoveCrossClusterGroupSetDependency_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_RemoveResourceFromClusterSharedVolumes", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_RemoveResourceFromClusterSharedVolumes_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ResUtilAddUnknownProperties", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ResUtilAddUnknownProperties_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ResUtilCreateDirectoryTree", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ResUtilCreateDirectoryTree_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ResUtilDupGroup", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ResUtilDupGroup_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ResUtilDupParameterBlock", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ResUtilDupParameterBlock_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ResUtilDupResource", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ResUtilDupResource_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ResUtilDupString", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ResUtilDupString_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ResUtilEnumGroups", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ResUtilEnumGroups_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ResUtilEnumGroupsEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ResUtilEnumGroupsEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ResUtilEnumPrivateProperties", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ResUtilEnumPrivateProperties_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ResUtilEnumProperties", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ResUtilEnumProperties_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ResUtilEnumResources", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ResUtilEnumResources_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ResUtilEnumResourcesEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ResUtilEnumResourcesEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ResUtilEnumResourcesEx2", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ResUtilEnumResourcesEx2_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ResUtilExpandEnvironmentStrings", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ResUtilExpandEnvironmentStrings_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ResUtilFindBinaryProperty", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ResUtilFindBinaryProperty_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ResUtilFindDependentDiskResourceDriveLetter", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ResUtilFindDependentDiskResourceDriveLetter_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ResUtilFindDwordProperty", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ResUtilFindDwordProperty_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ResUtilFindExpandSzProperty", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ResUtilFindExpandSzProperty_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ResUtilFindExpandedSzProperty", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ResUtilFindExpandedSzProperty_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ResUtilFindFileTimeProperty", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ResUtilFindFileTimeProperty_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ResUtilFindLongProperty", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ResUtilFindLongProperty_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ResUtilFindMultiSzProperty", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ResUtilFindMultiSzProperty_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ResUtilFindSzProperty", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ResUtilFindSzProperty_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ResUtilFindULargeIntegerProperty", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ResUtilFindULargeIntegerProperty_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ResUtilFreeEnvironment", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ResUtilFreeEnvironment_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ResUtilFreeParameterBlock", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ResUtilFreeParameterBlock_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ResUtilGetAllProperties", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ResUtilGetAllProperties_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ResUtilGetBinaryProperty", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ResUtilGetBinaryProperty_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ResUtilGetBinaryValue", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ResUtilGetBinaryValue_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ResUtilGetClusterGroupType", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ResUtilGetClusterGroupType_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ResUtilGetClusterId", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ResUtilGetClusterId_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ResUtilGetClusterRoleState", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ResUtilGetClusterRoleState_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ResUtilGetCoreClusterResources", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ResUtilGetCoreClusterResources_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ResUtilGetCoreClusterResourcesEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ResUtilGetCoreClusterResourcesEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ResUtilGetCoreGroup", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ResUtilGetCoreGroup_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ResUtilGetDwordProperty", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ResUtilGetDwordProperty_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ResUtilGetDwordValue", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ResUtilGetDwordValue_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ResUtilGetEnvironmentWithNetName", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ResUtilGetEnvironmentWithNetName_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ResUtilGetLongProperty", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ResUtilGetLongProperty_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ResUtilGetMultiSzProperty", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ResUtilGetMultiSzProperty_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ResUtilGetPrivateProperties", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ResUtilGetPrivateProperties_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ResUtilGetProperties", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ResUtilGetProperties_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ResUtilGetPropertiesToParameterBlock", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ResUtilGetPropertiesToParameterBlock_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ResUtilGetProperty", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ResUtilGetProperty_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ResUtilGetPropertyFormats", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ResUtilGetPropertyFormats_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ResUtilGetPropertySize", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ResUtilGetPropertySize_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ResUtilGetQwordValue", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ResUtilGetQwordValue_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ResUtilGetResourceDependency", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ResUtilGetResourceDependency_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ResUtilGetResourceDependencyByClass", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ResUtilGetResourceDependencyByClass_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ResUtilGetResourceDependencyByClassEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ResUtilGetResourceDependencyByClassEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ResUtilGetResourceDependencyByName", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ResUtilGetResourceDependencyByName_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ResUtilGetResourceDependencyByNameEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ResUtilGetResourceDependencyByNameEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ResUtilGetResourceDependencyEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ResUtilGetResourceDependencyEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ResUtilGetResourceDependentIPAddressProps", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ResUtilGetResourceDependentIPAddressProps_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ResUtilGetResourceName", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ResUtilGetResourceName_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ResUtilGetResourceNameDependency", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ResUtilGetResourceNameDependency_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ResUtilGetResourceNameDependencyEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ResUtilGetResourceNameDependencyEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ResUtilGetSzProperty", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ResUtilGetSzProperty_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ResUtilGetSzValue", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ResUtilGetSzValue_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ResUtilGroupsEqual", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ResUtilGroupsEqual_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ResUtilIsPathValid", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ResUtilIsPathValid_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ResUtilIsResourceClassEqual", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ResUtilIsResourceClassEqual_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ResUtilLeftPaxosIsLessThanRight", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ResUtilLeftPaxosIsLessThanRight_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ResUtilNodeEnum", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ResUtilNodeEnum_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ResUtilPaxosComparer", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ResUtilPaxosComparer_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ResUtilPropertyListFromParameterBlock", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ResUtilPropertyListFromParameterBlock_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ResUtilRemoveResourceServiceEnvironment", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ResUtilRemoveResourceServiceEnvironment_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ResUtilResourceDepEnum", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ResUtilResourceDepEnum_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ResUtilResourceTypesEqual", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ResUtilResourceTypesEqual_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ResUtilResourcesEqual", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ResUtilResourcesEqual_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ResUtilSetBinaryValue", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ResUtilSetBinaryValue_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ResUtilSetDwordValue", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ResUtilSetDwordValue_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ResUtilSetExpandSzValue", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ResUtilSetExpandSzValue_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ResUtilSetMultiSzValue", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ResUtilSetMultiSzValue_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ResUtilSetPrivatePropertyList", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ResUtilSetPrivatePropertyList_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ResUtilSetPropertyParameterBlock", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ResUtilSetPropertyParameterBlock_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ResUtilSetPropertyParameterBlockEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ResUtilSetPropertyParameterBlockEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ResUtilSetPropertyTable", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ResUtilSetPropertyTable_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ResUtilSetPropertyTableEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ResUtilSetPropertyTableEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ResUtilSetQwordValue", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ResUtilSetQwordValue_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ResUtilSetResourceServiceEnvironment", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ResUtilSetResourceServiceEnvironment_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ResUtilSetResourceServiceStartParameters", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ResUtilSetResourceServiceStartParameters_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ResUtilSetResourceServiceStartParametersEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ResUtilSetResourceServiceStartParametersEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ResUtilSetSzValue", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ResUtilSetSzValue_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ResUtilSetUnknownProperties", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ResUtilSetUnknownProperties_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ResUtilSetValueEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ResUtilSetValueEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ResUtilStartResourceService", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ResUtilStartResourceService_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ResUtilStopResourceService", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ResUtilStopResourceService_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ResUtilStopService", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ResUtilStopService_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ResUtilTerminateServiceProcessFromResDll", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ResUtilTerminateServiceProcessFromResDll_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ResUtilVerifyPrivatePropertyList", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ResUtilVerifyPrivatePropertyList_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ResUtilVerifyPropertyTable", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ResUtilVerifyPropertyTable_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ResUtilVerifyResourceService", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ResUtilVerifyResourceService_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ResUtilVerifyService", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ResUtilVerifyService_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ResUtilVerifyShutdownSafe", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ResUtilVerifyShutdownSafe_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ResUtilsDeleteKeyTree", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ResUtilsDeleteKeyTree_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ResetAllAppInstanceVersions", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ResetAllAppInstanceVersions_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_RestartClusterResource", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_RestartClusterResource_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_RestartClusterResourceEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_RestartClusterResourceEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_RestoreClusterDatabase", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_RestoreClusterDatabase_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ResumeClusterNode", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ResumeClusterNode_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ResumeClusterNodeEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ResumeClusterNodeEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_ResumeClusterNodeEx2", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_ResumeClusterNodeEx2_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_SetAppInstanceCsvFlags", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_SetAppInstanceCsvFlags_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_SetClusterGroupName", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_SetClusterGroupName_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_SetClusterGroupNameEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_SetClusterGroupNameEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_SetClusterGroupNodeList", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_SetClusterGroupNodeList_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_SetClusterGroupNodeListEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_SetClusterGroupNodeListEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_SetClusterGroupSetDependencyExpression", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_SetClusterGroupSetDependencyExpression_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_SetClusterGroupSetDependencyExpressionEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_SetClusterGroupSetDependencyExpressionEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_SetClusterName", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_SetClusterName_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_SetClusterNameEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_SetClusterNameEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_SetClusterNetworkName", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_SetClusterNetworkName_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_SetClusterNetworkNameEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_SetClusterNetworkNameEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_SetClusterNetworkPriorityOrder", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_SetClusterNetworkPriorityOrder_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_SetClusterQuorumResource", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_SetClusterQuorumResource_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_SetClusterQuorumResourceEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_SetClusterQuorumResourceEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_SetClusterResourceDependencyExpression", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_SetClusterResourceDependencyExpression_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_SetClusterResourceName", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_SetClusterResourceName_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_SetClusterResourceNameEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_SetClusterResourceNameEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_SetClusterServiceAccountPassword", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_SetClusterServiceAccountPassword_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_SetGroupDependencyExpression", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_SetGroupDependencyExpression_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_SetGroupDependencyExpressionEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_SetGroupDependencyExpressionEx_napi));
}

static KmNapiRegistrarNode registrar_node = { &register_windows_win32_networking_clustering_napi, nullptr };
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
