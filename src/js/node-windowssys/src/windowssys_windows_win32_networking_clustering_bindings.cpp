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

static Napi::Value windowssys_windows_win32_networking_clustering_addClusterGroupDependency_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hdependentgroup, hprovidergroup);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hdependentgroup;
    (void)hprovidergroup;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_addClusterGroupDependencyEx_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hdependentgroup, hprovidergroup, lpszreason);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hdependentgroup;
    (void)hprovidergroup;
    (void)lpszreason;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_addClusterGroupSetDependency_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hdependentgroupset, hprovidergroupset);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hdependentgroupset;
    (void)hprovidergroupset;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_addClusterGroupSetDependencyEx_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hdependentgroupset, hprovidergroupset, lpszreason);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hdependentgroupset;
    (void)hprovidergroupset;
    (void)lpszreason;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_addClusterGroupToGroupSetDependency_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hdependentgroup, hprovidergroupset);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hdependentgroup;
    (void)hprovidergroupset;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_addClusterGroupToGroupSetDependencyEx_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hdependentgroup, hprovidergroupset, lpszreason);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hdependentgroup;
    (void)hprovidergroupset;
    (void)lpszreason;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_addClusterNode_napi(const Napi::CallbackInfo& km_info) {
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
    int64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hcluster, lpsznodename, pfnprogresscallback, pvcallbackarg);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcluster;
    (void)lpsznodename;
    (void)pfnprogresscallback;
    (void)pvcallbackarg;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_networking_clustering_addClusterNodeEx_napi(const Napi::CallbackInfo& km_info) {
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
    int64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hcluster, lpsznodename, dwflags, pfnprogresscallback, pvcallbackarg);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcluster;
    (void)lpsznodename;
    (void)dwflags;
    (void)pfnprogresscallback;
    (void)pvcallbackarg;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_networking_clustering_addClusterResourceDependency_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hresource, hdependson);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hresource;
    (void)hdependson;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_addClusterResourceDependencyEx_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hresource, hdependson, lpszreason);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hresource;
    (void)hdependson;
    (void)lpszreason;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_addClusterResourceNode_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hresource, hnode);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hresource;
    (void)hnode;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_addClusterResourceNodeEx_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hresource, hnode, lpszreason);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hresource;
    (void)hnode;
    (void)lpszreason;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_addClusterStorageNode_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hcluster, lpsznodename, pfnprogresscallback, pvcallbackarg, lpszclusterstoragenodedescription, lpszclusterstoragenodelocation);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hcluster;
    (void)lpsznodename;
    (void)pfnprogresscallback;
    (void)pvcallbackarg;
    (void)lpszclusterstoragenodedescription;
    (void)lpszclusterstoragenodelocation;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_addCrossClusterGroupSetDependency_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hdependentgroupset, lpremoteclustername, lpremotegroupsetname);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hdependentgroupset;
    (void)lpremoteclustername;
    (void)lpremotegroupsetname;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_addResourceToClusterSharedVolumes_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hresource = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "AddResourceToClusterSharedVolumes")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hresource);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hresource;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_backupClusterDatabase_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hcluster, lpszpathname);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hcluster;
    (void)lpszpathname;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_canResourceBeDependent_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hresource, hresourcedependent);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hresource;
    (void)hresourcedependent;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_cancelClusterGroupOperation_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hgroup, dwcancelflags_reserved);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hgroup;
    (void)dwcancelflags_reserved;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_changeClusterResourceGroup_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hresource, hgroup);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hresource;
    (void)hgroup;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_changeClusterResourceGroupEx_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hresource, hgroup, flags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hresource;
    (void)hgroup;
    (void)flags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_changeClusterResourceGroupEx2_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hresource, hgroup, flags, lpszreason);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hresource;
    (void)hgroup;
    (void)flags;
    (void)lpszreason;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_closeCluster_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hcluster = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CloseCluster")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hcluster);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcluster;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_closeClusterCryptProvider_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hcluscryptprovider = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CloseClusterCryptProvider")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hcluscryptprovider);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hcluscryptprovider;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_closeClusterGroup_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hgroup = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CloseClusterGroup")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hgroup);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hgroup;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_closeClusterGroupSet_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hgroupset = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CloseClusterGroupSet")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hgroupset);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hgroupset;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_closeClusterNetInterface_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hnetinterface = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CloseClusterNetInterface")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hnetinterface);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hnetinterface;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_closeClusterNetwork_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hnetwork = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CloseClusterNetwork")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hnetwork);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hnetwork;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_closeClusterNode_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hnode = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CloseClusterNode")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hnode);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hnode;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_closeClusterNotifyPort_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hchange = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CloseClusterNotifyPort")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hchange);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hchange;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_closeClusterResource_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hresource = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CloseClusterResource")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hresource);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hresource;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_clusAddClusterHealthFault_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hcluster, failure, param2);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hcluster;
    (void)failure;
    (void)param2;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_clusGetClusterHealthFaults_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hcluster, objects, flags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hcluster;
    (void)objects;
    (void)flags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_clusRemoveClusterHealthFault_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hcluster, id, flags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hcluster;
    (void)id;
    (void)flags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_clusWorkerCheckTerminate_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpworker = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ClusWorkerCheckTerminate")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(lpworker);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpworker;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_clusWorkerCreate_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(lpworker, lpstartaddress, lpparameter);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)lpworker;
    (void)lpstartaddress;
    (void)lpparameter;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_clusWorkerTerminate_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpworker = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ClusWorkerTerminate")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(lpworker);
    } else {
        errno = ENOSYS;
    }
#else
    (void)lpworker;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_networking_clustering_clusWorkerTerminateEx_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(clusworker, timeoutinmilliseconds, waitonly);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)clusworker;
    (void)timeoutinmilliseconds;
    (void)waitonly;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_clusWorkersTerminate_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(clusworkers, clusworkerscount, timeoutinmilliseconds, waitonly);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)clusworkers;
    (void)clusworkerscount;
    (void)timeoutinmilliseconds;
    (void)waitonly;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_clusapiSetReasonHandler_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lphandler = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ClusapiSetReasonHandler")));
    }
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(lphandler);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
#else
    (void)lphandler;
    errno = ENOSYS;
    void* km_res = nullptr;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_networking_clustering_clusterAddGroupToAffinityRule_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hcluster, rulename, hgroup);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hcluster;
    (void)rulename;
    (void)hgroup;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_clusterAddGroupToGroupSet_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hgroupset, hgroup);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hgroupset;
    (void)hgroup;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_clusterAddGroupToGroupSetWithDomains_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hgroupset, hgroup, faultdomain, updatedomain);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hgroupset;
    (void)hgroup;
    (void)faultdomain;
    (void)updatedomain;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_clusterAddGroupToGroupSetWithDomainsEx_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hgroupset, hgroup, faultdomain, updatedomain, lpszreason);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hgroupset;
    (void)hgroup;
    (void)faultdomain;
    (void)updatedomain;
    (void)lpszreason;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_clusterAffinityRuleControl_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hcluster, affinityrulename, hhostnode, dwcontrolcode, lpinbuffer, cbinbuffersize, lpoutbuffer, cboutbuffersize, lpbytesreturned);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
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
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_clusterClearBackupStateForSharedVolume_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpszvolumepathname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ClusterClearBackupStateForSharedVolume")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(lpszvolumepathname);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)lpszvolumepathname;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_clusterCloseEnum_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t henum = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ClusterCloseEnum")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(henum);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)henum;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_clusterCloseEnumEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hclusterenum = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ClusterCloseEnumEx")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hclusterenum);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hclusterenum;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_clusterControl_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hcluster, hhostnode, dwcontrolcode, lpinbuffer, ninbuffersize, lpoutbuffer, noutbuffersize, lpbytesreturned);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hcluster;
    (void)hhostnode;
    (void)dwcontrolcode;
    (void)lpinbuffer;
    (void)ninbuffersize;
    (void)lpoutbuffer;
    (void)noutbuffersize;
    (void)lpbytesreturned;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_clusterControlEx_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hcluster, hhostnode, dwcontrolcode, lpinbuffer, ninbuffersize, lpoutbuffer, noutbuffersize, lpbytesreturned, lpszreason);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
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
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_clusterCreateAffinityRule_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hcluster, rulename, ruletype);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hcluster;
    (void)rulename;
    (void)ruletype;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_clusterDecrypt_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hcluscryptprovider, pcryptinput, cbcryptinput, ppcryptoutput, pcbcryptoutput);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hcluscryptprovider;
    (void)pcryptinput;
    (void)cbcryptinput;
    (void)ppcryptoutput;
    (void)pcbcryptoutput;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_clusterEncrypt_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hcluscryptprovider, pdata, cbdata, ppdata, pcbdata);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hcluscryptprovider;
    (void)pdata;
    (void)cbdata;
    (void)ppdata;
    (void)pcbdata;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_clusterEnum_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(henum, dwindex, lpdwtype, lpszname, lpcchname);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)henum;
    (void)dwindex;
    (void)lpdwtype;
    (void)lpszname;
    (void)lpcchname;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_clusterEnumEx_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hclusterenum, dwindex, pitem, cbitem);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hclusterenum;
    (void)dwindex;
    (void)pitem;
    (void)cbitem;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_clusterGetEnumCount_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t henum = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ClusterGetEnumCount")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(henum);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)henum;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_clusterGetEnumCountEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hclusterenum = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ClusterGetEnumCountEx")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hclusterenum);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hclusterenum;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_clusterGetVolumeNameForVolumeMountPoint_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(lpszvolumemountpoint, lpszvolumename, cchbufferlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpszvolumemountpoint;
    (void)lpszvolumename;
    (void)cchbufferlength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_clusterGetVolumePathName_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(lpszfilename, lpszvolumepathname, cchbufferlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpszfilename;
    (void)lpszvolumepathname;
    (void)cchbufferlength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_clusterGroupCloseEnum_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hgroupenum = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ClusterGroupCloseEnum")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hgroupenum);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hgroupenum;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_clusterGroupCloseEnumEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hgroupenumex = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ClusterGroupCloseEnumEx")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hgroupenumex);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hgroupenumex;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_clusterGroupControl_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hgroup, hhostnode, dwcontrolcode, lpinbuffer, ninbuffersize, lpoutbuffer, noutbuffersize, lpbytesreturned);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hgroup;
    (void)hhostnode;
    (void)dwcontrolcode;
    (void)lpinbuffer;
    (void)ninbuffersize;
    (void)lpoutbuffer;
    (void)noutbuffersize;
    (void)lpbytesreturned;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_clusterGroupControlEx_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hgroup, hhostnode, dwcontrolcode, lpinbuffer, ninbuffersize, lpoutbuffer, noutbuffersize, lpbytesreturned, lpszreason);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
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
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_clusterGroupEnum_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hgroupenum, dwindex, lpdwtype, lpszresourcename, lpcchname);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hgroupenum;
    (void)dwindex;
    (void)lpdwtype;
    (void)lpszresourcename;
    (void)lpcchname;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_clusterGroupEnumEx_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hgroupenumex, dwindex, pitem, cbitem);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hgroupenumex;
    (void)dwindex;
    (void)pitem;
    (void)cbitem;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_clusterGroupGetEnumCount_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hgroupenum = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ClusterGroupGetEnumCount")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hgroupenum);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hgroupenum;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_clusterGroupGetEnumCountEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hgroupenumex = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ClusterGroupGetEnumCountEx")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hgroupenumex);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hgroupenumex;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_clusterGroupOpenEnum_napi(const Napi::CallbackInfo& km_info) {
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
    int64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hgroup, dwtype);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hgroup;
    (void)dwtype;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_networking_clustering_clusterGroupOpenEnumEx_napi(const Napi::CallbackInfo& km_info) {
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
    int64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hcluster, lpszproperties, cbproperties, lpszroproperties, cbroproperties, dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcluster;
    (void)lpszproperties;
    (void)cbproperties;
    (void)lpszroproperties;
    (void)cbroproperties;
    (void)dwflags;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_networking_clustering_clusterGroupSetCloseEnum_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hgroupsetenum = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ClusterGroupSetCloseEnum")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hgroupsetenum);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hgroupsetenum;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_clusterGroupSetControl_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hgroupset, hhostnode, dwcontrolcode, lpinbuffer, cbinbuffersize, lpoutbuffer, cboutbuffersize, lpbytesreturned);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hgroupset;
    (void)hhostnode;
    (void)dwcontrolcode;
    (void)lpinbuffer;
    (void)cbinbuffersize;
    (void)lpoutbuffer;
    (void)cboutbuffersize;
    (void)lpbytesreturned;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_clusterGroupSetControlEx_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hgroupset, hhostnode, dwcontrolcode, lpinbuffer, cbinbuffersize, lpoutbuffer, cboutbuffersize, lpbytesreturned, lpszreason);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
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
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_clusterGroupSetEnum_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hgroupsetenum, dwindex, lpszname, lpcchname);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hgroupsetenum;
    (void)dwindex;
    (void)lpszname;
    (void)lpcchname;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_clusterGroupSetGetEnumCount_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hgroupsetenum = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ClusterGroupSetGetEnumCount")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hgroupsetenum);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hgroupsetenum;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_clusterGroupSetOpenEnum_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hcluster = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ClusterGroupSetOpenEnum")));
    }
    int64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hcluster);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcluster;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_networking_clustering_clusterIsPathOnSharedVolume_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpszpathname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ClusterIsPathOnSharedVolume")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(lpszpathname);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpszpathname;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_clusterNetInterfaceCloseEnum_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hnetinterfaceenum = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ClusterNetInterfaceCloseEnum")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hnetinterfaceenum);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hnetinterfaceenum;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_clusterNetInterfaceControl_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hnetinterface, hhostnode, dwcontrolcode, lpinbuffer, ninbuffersize, lpoutbuffer, noutbuffersize, lpbytesreturned);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hnetinterface;
    (void)hhostnode;
    (void)dwcontrolcode;
    (void)lpinbuffer;
    (void)ninbuffersize;
    (void)lpoutbuffer;
    (void)noutbuffersize;
    (void)lpbytesreturned;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_clusterNetInterfaceControlEx_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hnetinterface, hhostnode, dwcontrolcode, lpinbuffer, ninbuffersize, lpoutbuffer, noutbuffersize, lpbytesreturned, lpszreason);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
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
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_clusterNetInterfaceEnum_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hnetinterfaceenum, dwindex, lpszname, lpcchname);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hnetinterfaceenum;
    (void)dwindex;
    (void)lpszname;
    (void)lpcchname;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_clusterNetInterfaceOpenEnum_napi(const Napi::CallbackInfo& km_info) {
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
    int64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hcluster, lpsznodename, lpsznetworkname);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcluster;
    (void)lpsznodename;
    (void)lpsznetworkname;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_networking_clustering_clusterNetworkCloseEnum_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hnetworkenum = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ClusterNetworkCloseEnum")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hnetworkenum);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hnetworkenum;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_clusterNetworkControl_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hnetwork, hhostnode, dwcontrolcode, lpinbuffer, ninbuffersize, lpoutbuffer, noutbuffersize, lpbytesreturned);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hnetwork;
    (void)hhostnode;
    (void)dwcontrolcode;
    (void)lpinbuffer;
    (void)ninbuffersize;
    (void)lpoutbuffer;
    (void)noutbuffersize;
    (void)lpbytesreturned;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_clusterNetworkControlEx_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hnetwork, hhostnode, dwcontrolcode, lpinbuffer, ninbuffersize, lpoutbuffer, noutbuffersize, lpbytesreturned, lpszreason);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
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
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_clusterNetworkEnum_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hnetworkenum, dwindex, lpdwtype, lpszname, lpcchname);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hnetworkenum;
    (void)dwindex;
    (void)lpdwtype;
    (void)lpszname;
    (void)lpcchname;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_clusterNetworkGetEnumCount_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hnetworkenum = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ClusterNetworkGetEnumCount")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hnetworkenum);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hnetworkenum;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_clusterNetworkOpenEnum_napi(const Napi::CallbackInfo& km_info) {
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
    int64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hnetwork, dwtype);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hnetwork;
    (void)dwtype;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_networking_clustering_clusterNodeCloseEnum_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hnodeenum = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ClusterNodeCloseEnum")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hnodeenum);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hnodeenum;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_clusterNodeCloseEnumEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hnodeenum = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ClusterNodeCloseEnumEx")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hnodeenum);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hnodeenum;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_clusterNodeControl_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hnode, hhostnode, dwcontrolcode, lpinbuffer, ninbuffersize, lpoutbuffer, noutbuffersize, lpbytesreturned);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hnode;
    (void)hhostnode;
    (void)dwcontrolcode;
    (void)lpinbuffer;
    (void)ninbuffersize;
    (void)lpoutbuffer;
    (void)noutbuffersize;
    (void)lpbytesreturned;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_clusterNodeControlEx_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hnode, hhostnode, dwcontrolcode, lpinbuffer, ninbuffersize, lpoutbuffer, noutbuffersize, lpbytesreturned, lpszreason);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
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
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_clusterNodeEnum_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hnodeenum, dwindex, lpdwtype, lpszname, lpcchname);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hnodeenum;
    (void)dwindex;
    (void)lpdwtype;
    (void)lpszname;
    (void)lpcchname;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_clusterNodeEnumEx_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hnodeenum, dwindex, pitem, cbitem);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hnodeenum;
    (void)dwindex;
    (void)pitem;
    (void)cbitem;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_clusterNodeGetEnumCount_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hnodeenum = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ClusterNodeGetEnumCount")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hnodeenum);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hnodeenum;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_clusterNodeGetEnumCountEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hnodeenum = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ClusterNodeGetEnumCountEx")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hnodeenum);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hnodeenum;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_clusterNodeOpenEnum_napi(const Napi::CallbackInfo& km_info) {
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
    int64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hnode, dwtype);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hnode;
    (void)dwtype;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_networking_clustering_clusterNodeOpenEnumEx_napi(const Napi::CallbackInfo& km_info) {
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
    int64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hnode, dwtype, poptions);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hnode;
    (void)dwtype;
    (void)poptions;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_networking_clustering_clusterNodeReplacement_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hcluster, lpsznodenamecurrent, lpsznodenamenew);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hcluster;
    (void)lpsznodenamecurrent;
    (void)lpsznodenamenew;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_clusterOpenEnum_napi(const Napi::CallbackInfo& km_info) {
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
    int64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hcluster, dwtype);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcluster;
    (void)dwtype;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_networking_clustering_clusterOpenEnumEx_napi(const Napi::CallbackInfo& km_info) {
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
    int64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hcluster, dwtype, poptions);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcluster;
    (void)dwtype;
    (void)poptions;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_networking_clustering_clusterPrepareSharedVolumeForBackup_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(lpszfilename, lpszvolumepathname, lpcchvolumepathname, lpszvolumename, lpcchvolumename);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)lpszfilename;
    (void)lpszvolumepathname;
    (void)lpcchvolumepathname;
    (void)lpszvolumename;
    (void)lpcchvolumename;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_clusterRegBatchAddCommand_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hregbatch, dwcommand, wzname, dwoptions, lpdata, cbdata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hregbatch;
    (void)dwcommand;
    (void)wzname;
    (void)dwoptions;
    (void)lpdata;
    (void)cbdata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_clusterRegBatchCloseNotification_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hbatchnotification = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ClusterRegBatchCloseNotification")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hbatchnotification);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hbatchnotification;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_clusterRegBatchReadCommand_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hbatchnotification, pbatchcommand);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hbatchnotification;
    (void)pbatchcommand;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_clusterRegCloseBatch_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hregbatch, bcommit, failedcommandnumber);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hregbatch;
    (void)bcommit;
    (void)failedcommandnumber;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_clusterRegCloseBatchEx_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hregbatch, flags, failedcommandnumber);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hregbatch;
    (void)flags;
    (void)failedcommandnumber;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_clusterRegCloseBatchNotifyPort_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hbatchnotifyport = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ClusterRegCloseBatchNotifyPort")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hbatchnotifyport);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hbatchnotifyport;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_clusterRegCloseKey_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ClusterRegCloseKey")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hkey);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hkey;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_clusterRegCloseReadBatch_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hregreadbatch, phregreadbatchreply);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hregreadbatch;
    (void)phregreadbatchreply;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_clusterRegCloseReadBatchEx_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hregreadbatch, flags, phregreadbatchreply);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hregreadbatch;
    (void)flags;
    (void)phregreadbatchreply;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_clusterRegCloseReadBatchReply_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hregreadbatchreply = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ClusterRegCloseReadBatchReply")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hregreadbatchreply);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hregreadbatchreply;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_clusterRegCreateBatch_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hkey, phregbatch);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hkey;
    (void)phregbatch;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_clusterRegCreateBatchNotifyPort_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hkey, phbatchnotifyport);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hkey;
    (void)phbatchnotifyport;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_clusterRegCreateKey_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hkey, lpszsubkey, dwoptions, samdesired, lpsecurityattributes, phkresult, lpdwdisposition);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hkey;
    (void)lpszsubkey;
    (void)dwoptions;
    (void)samdesired;
    (void)lpsecurityattributes;
    (void)phkresult;
    (void)lpdwdisposition;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_clusterRegCreateKeyEx_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hkey, lpsubkey, dwoptions, samdesired, lpsecurityattributes, phkresult, lpdwdisposition, lpszreason);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hkey;
    (void)lpsubkey;
    (void)dwoptions;
    (void)samdesired;
    (void)lpsecurityattributes;
    (void)phkresult;
    (void)lpdwdisposition;
    (void)lpszreason;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_clusterRegCreateReadBatch_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hkey, phregreadbatch);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hkey;
    (void)phregreadbatch;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_clusterRegDeleteKey_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hkey, lpszsubkey);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hkey;
    (void)lpszsubkey;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_clusterRegDeleteKeyEx_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hkey, lpsubkey, lpszreason);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hkey;
    (void)lpsubkey;
    (void)lpszreason;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_clusterRegDeleteValue_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hkey, lpszvaluename);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hkey;
    (void)lpszvaluename;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_clusterRegDeleteValueEx_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hkey, lpszvaluename, lpszreason);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hkey;
    (void)lpszvaluename;
    (void)lpszreason;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_clusterRegEnumKey_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hkey, dwindex, lpszname, lpcchname, lpftlastwritetime);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hkey;
    (void)dwindex;
    (void)lpszname;
    (void)lpcchname;
    (void)lpftlastwritetime;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_clusterRegEnumValue_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hkey, dwindex, lpszvaluename, lpcchvaluename, lpdwtype, lpdata, lpcbdata);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hkey;
    (void)dwindex;
    (void)lpszvaluename;
    (void)lpcchvaluename;
    (void)lpdwtype;
    (void)lpdata;
    (void)lpcbdata;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_clusterRegGetBatchNotification_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hbatchnotify, phbatchnotification);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hbatchnotify;
    (void)phbatchnotification;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_clusterRegGetKeySecurity_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hkey, requestedinformation, psecuritydescriptor, lpcbsecuritydescriptor);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hkey;
    (void)requestedinformation;
    (void)psecuritydescriptor;
    (void)lpcbsecuritydescriptor;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_clusterRegOpenKey_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hkey, lpszsubkey, samdesired, phkresult);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hkey;
    (void)lpszsubkey;
    (void)samdesired;
    (void)phkresult;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_clusterRegQueryInfoKey_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hkey, lpcsubkeys, lpcchmaxsubkeylen, lpcvalues, lpcchmaxvaluenamelen, lpcbmaxvaluelen, lpcbsecuritydescriptor, lpftlastwritetime);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hkey;
    (void)lpcsubkeys;
    (void)lpcchmaxsubkeylen;
    (void)lpcvalues;
    (void)lpcchmaxvaluenamelen;
    (void)lpcbmaxvaluelen;
    (void)lpcbsecuritydescriptor;
    (void)lpftlastwritetime;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_clusterRegQueryValue_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hkey, lpszvaluename, lpdwvaluetype, lpdata, lpcbdata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hkey;
    (void)lpszvaluename;
    (void)lpdwvaluetype;
    (void)lpdata;
    (void)lpcbdata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_clusterRegReadBatchAddCommand_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hregreadbatch, wzsubkeyname, wzvaluename);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hregreadbatch;
    (void)wzsubkeyname;
    (void)wzvaluename;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_clusterRegReadBatchReplyNextCommand_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hregreadbatchreply, pbatchcommand);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hregreadbatchreply;
    (void)pbatchcommand;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_clusterRegSetKeySecurity_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hkey, securityinformation, psecuritydescriptor);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hkey;
    (void)securityinformation;
    (void)psecuritydescriptor;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_clusterRegSetKeySecurityEx_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hkey, securityinformation, psecuritydescriptor, lpszreason);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hkey;
    (void)securityinformation;
    (void)psecuritydescriptor;
    (void)lpszreason;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_clusterRegSetValue_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hkey, lpszvaluename, dwtype, lpdata, cbdata);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hkey;
    (void)lpszvaluename;
    (void)dwtype;
    (void)lpdata;
    (void)cbdata;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_clusterRegSetValueEx_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hkey, lpszvaluename, dwtype, lpdata, cbdata, lpszreason);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hkey;
    (void)lpszvaluename;
    (void)dwtype;
    (void)lpdata;
    (void)cbdata;
    (void)lpszreason;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_clusterRegSyncDatabase_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hcluster, flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcluster;
    (void)flags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_clusterRemoveAffinityRule_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hcluster, rulename);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hcluster;
    (void)rulename;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_clusterRemoveGroupFromAffinityRule_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hcluster, rulename, hgroup);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hcluster;
    (void)rulename;
    (void)hgroup;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_clusterRemoveGroupFromGroupSet_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hgroup = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ClusterRemoveGroupFromGroupSet")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hgroup);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hgroup;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_clusterRemoveGroupFromGroupSetEx_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hgroup, lpszreason);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hgroup;
    (void)lpszreason;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_clusterResourceCloseEnum_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hresenum = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ClusterResourceCloseEnum")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hresenum);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hresenum;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_clusterResourceCloseEnumEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hresourceenumex = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ClusterResourceCloseEnumEx")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hresourceenumex);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hresourceenumex;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_clusterResourceControl_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hresource, hhostnode, dwcontrolcode, lpinbuffer, cbinbuffersize, lpoutbuffer, cboutbuffersize, lpbytesreturned);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hresource;
    (void)hhostnode;
    (void)dwcontrolcode;
    (void)lpinbuffer;
    (void)cbinbuffersize;
    (void)lpoutbuffer;
    (void)cboutbuffersize;
    (void)lpbytesreturned;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_clusterResourceControlAsUser_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hresource, hhostnode, dwcontrolcode, lpinbuffer, cbinbuffersize, lpoutbuffer, cboutbuffersize, lpbytesreturned);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hresource;
    (void)hhostnode;
    (void)dwcontrolcode;
    (void)lpinbuffer;
    (void)cbinbuffersize;
    (void)lpoutbuffer;
    (void)cboutbuffersize;
    (void)lpbytesreturned;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_clusterResourceControlAsUserEx_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hresource, hhostnode, dwcontrolcode, lpinbuffer, cbinbuffersize, lpoutbuffer, cboutbuffersize, lpbytesreturned, lpszreason);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
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
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_clusterResourceControlEx_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hresource, hhostnode, dwcontrolcode, lpinbuffer, cbinbuffersize, lpoutbuffer, cboutbuffersize, lpbytesreturned, lpszreason);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
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
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_clusterResourceEnum_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hresenum, dwindex, lpdwtype, lpszname, lpcchname);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hresenum;
    (void)dwindex;
    (void)lpdwtype;
    (void)lpszname;
    (void)lpcchname;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_clusterResourceEnumEx_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hresourceenumex, dwindex, pitem, cbitem);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hresourceenumex;
    (void)dwindex;
    (void)pitem;
    (void)cbitem;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_clusterResourceGetEnumCount_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hresenum = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ClusterResourceGetEnumCount")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hresenum);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hresenum;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_clusterResourceGetEnumCountEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hresourceenumex = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ClusterResourceGetEnumCountEx")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hresourceenumex);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hresourceenumex;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_clusterResourceOpenEnum_napi(const Napi::CallbackInfo& km_info) {
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
    int64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hresource, dwtype);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hresource;
    (void)dwtype;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_networking_clustering_clusterResourceOpenEnumEx_napi(const Napi::CallbackInfo& km_info) {
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
    int64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hcluster, lpszproperties, cbproperties, lpszroproperties, cbroproperties, dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcluster;
    (void)lpszproperties;
    (void)cbproperties;
    (void)lpszroproperties;
    (void)cbroproperties;
    (void)dwflags;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_networking_clustering_clusterResourceTypeCloseEnum_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hrestypeenum = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ClusterResourceTypeCloseEnum")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hrestypeenum);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hrestypeenum;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_clusterResourceTypeControl_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hcluster, lpszresourcetypename, hhostnode, dwcontrolcode, lpinbuffer, ninbuffersize, lpoutbuffer, noutbuffersize, lpbytesreturned);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
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
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_clusterResourceTypeControlAsUser_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hcluster, lpszresourcetypename, hhostnode, dwcontrolcode, lpinbuffer, ninbuffersize, lpoutbuffer, noutbuffersize, lpbytesreturned);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
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
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_clusterResourceTypeControlAsUserEx_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hcluster, lpszresourcetypename, hhostnode, dwcontrolcode, lpinbuffer, ninbuffersize, lpoutbuffer, noutbuffersize, lpbytesreturned, lpszreason);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
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
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_clusterResourceTypeControlEx_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hcluster, lpszresourcetypename, hhostnode, dwcontrolcode, lpinbuffer, ninbuffersize, lpoutbuffer, noutbuffersize, lpbytesreturned, lpszreason);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
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
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_clusterResourceTypeEnum_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hrestypeenum, dwindex, lpdwtype, lpszname, lpcchname);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hrestypeenum;
    (void)dwindex;
    (void)lpdwtype;
    (void)lpszname;
    (void)lpcchname;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_clusterResourceTypeGetEnumCount_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hrestypeenum = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ClusterResourceTypeGetEnumCount")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hrestypeenum);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hrestypeenum;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_clusterResourceTypeOpenEnum_napi(const Napi::CallbackInfo& km_info) {
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
    int64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hcluster, lpszresourcetypename, dwtype);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcluster;
    (void)lpszresourcetypename;
    (void)dwtype;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_networking_clustering_clusterSetAccountAccess_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hcluster, szaccountsid, dwaccess, dwcontroltype);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hcluster;
    (void)szaccountsid;
    (void)dwaccess;
    (void)dwcontroltype;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_clusterUpgradeFunctionalLevel_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hcluster, perform, pfnprogresscallback, pvcallbackarg);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hcluster;
    (void)perform;
    (void)pfnprogresscallback;
    (void)pvcallbackarg;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_createCluster_napi(const Napi::CallbackInfo& km_info) {
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
    int64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(pconfig, pfnprogresscallback, pvcallbackarg);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pconfig;
    (void)pfnprogresscallback;
    (void)pvcallbackarg;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_networking_clustering_createClusterAvailabilitySet_napi(const Napi::CallbackInfo& km_info) {
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
    int64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hcluster, lpavailabilitysetname, pavailabilitysetconfig);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcluster;
    (void)lpavailabilitysetname;
    (void)pavailabilitysetconfig;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_networking_clustering_createClusterGroup_napi(const Napi::CallbackInfo& km_info) {
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
    int64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hcluster, lpszgroupname);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcluster;
    (void)lpszgroupname;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_networking_clustering_createClusterGroupEx_napi(const Napi::CallbackInfo& km_info) {
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
    int64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hcluster, lpszgroupname, pgroupinfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcluster;
    (void)lpszgroupname;
    (void)pgroupinfo;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_networking_clustering_createClusterGroupSet_napi(const Napi::CallbackInfo& km_info) {
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
    int64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hcluster, groupsetname);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcluster;
    (void)groupsetname;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_networking_clustering_createClusterNameAccount_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hcluster, pconfig, pfnprogresscallback, pvcallbackarg);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hcluster;
    (void)pconfig;
    (void)pfnprogresscallback;
    (void)pvcallbackarg;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_createClusterNotifyPort_napi(const Napi::CallbackInfo& km_info) {
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
    int64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hchange, hcluster, dwfilter, dwnotifykey);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hchange;
    (void)hcluster;
    (void)dwfilter;
    (void)dwnotifykey;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_networking_clustering_createClusterNotifyPortV2_napi(const Napi::CallbackInfo& km_info) {
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
    int64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hchange, hcluster, filters, dwfiltercount, dwnotifykey);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hchange;
    (void)hcluster;
    (void)filters;
    (void)dwfiltercount;
    (void)dwnotifykey;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_networking_clustering_createClusterResource_napi(const Napi::CallbackInfo& km_info) {
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
    int64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hgroup, lpszresourcename, lpszresourcetype, dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hgroup;
    (void)lpszresourcename;
    (void)lpszresourcetype;
    (void)dwflags;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_networking_clustering_createClusterResourceEx_napi(const Napi::CallbackInfo& km_info) {
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
    int64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hgroup, lpszresourcename, lpszresourcetype, dwflags, lpszreason);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hgroup;
    (void)lpszresourcename;
    (void)lpszresourcetype;
    (void)dwflags;
    (void)lpszreason;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_networking_clustering_createClusterResourceType_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hcluster, lpszresourcetypename, lpszdisplayname, lpszresourcetypedll, dwlooksalivepollinterval, dwisalivepollinterval);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hcluster;
    (void)lpszresourcetypename;
    (void)lpszdisplayname;
    (void)lpszresourcetypedll;
    (void)dwlooksalivepollinterval;
    (void)dwisalivepollinterval;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_createClusterResourceTypeEx_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hcluster, lpszresourcetypename, lpszdisplayname, lpszresourcetypedll, dwlooksalivepollinterval, dwisalivepollinterval, lpszreason);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hcluster;
    (void)lpszresourcetypename;
    (void)lpszdisplayname;
    (void)lpszresourcetypedll;
    (void)dwlooksalivepollinterval;
    (void)dwisalivepollinterval;
    (void)lpszreason;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_deleteClusterGroup_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hgroup = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DeleteClusterGroup")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hgroup);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hgroup;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_deleteClusterGroupEx_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hgroup, lpszreason);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hgroup;
    (void)lpszreason;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_deleteClusterGroupSet_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hgroupset = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DeleteClusterGroupSet")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hgroupset);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hgroupset;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_deleteClusterGroupSetEx_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hgroupset, lpszreason);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hgroupset;
    (void)lpszreason;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_deleteClusterResource_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hresource = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DeleteClusterResource")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hresource);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hresource;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_deleteClusterResourceEx_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hresource, lpszreason);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hresource;
    (void)lpszreason;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_deleteClusterResourceType_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hcluster, lpszresourcetypename);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hcluster;
    (void)lpszresourcetypename;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_deleteClusterResourceTypeEx_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hcluster, lpsztypename, lpszreason);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hcluster;
    (void)lpsztypename;
    (void)lpszreason;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_destroyCluster_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hcluster, pfnprogresscallback, pvcallbackarg, fdeletevirtualcomputerobjects);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hcluster;
    (void)pfnprogresscallback;
    (void)pvcallbackarg;
    (void)fdeletevirtualcomputerobjects;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_destroyClusterGroup_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hgroup = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DestroyClusterGroup")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hgroup);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hgroup;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_destroyClusterGroupEx_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hgroup, lpszreason);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hgroup;
    (void)lpszreason;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_determineCNOResTypeFromCluster_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hcluster, pcnorestype);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hcluster;
    (void)pcnorestype;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_determineCNOResTypeFromNodelist_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(cnodes, ppsznodenames, pcnorestype);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)cnodes;
    (void)ppsznodenames;
    (void)pcnorestype;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_determineClusterCloudTypeFromCluster_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hcluster, pcloudtype);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hcluster;
    (void)pcloudtype;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_determineClusterCloudTypeFromNodelist_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(cnodes, ppsznodenames, pcloudtype);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)cnodes;
    (void)ppsznodenames;
    (void)pcloudtype;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_evictClusterNode_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hnode = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "EvictClusterNode")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hnode);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hnode;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_evictClusterNodeEx_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hnode, dwtimeout, phrcleanupstatus);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hnode;
    (void)dwtimeout;
    (void)phrcleanupstatus;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_evictClusterNodeEx2_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hnode, dwtimeout, phrcleanupstatus, lpszreason);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hnode;
    (void)dwtimeout;
    (void)phrcleanupstatus;
    (void)lpszreason;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_failClusterResource_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hresource = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FailClusterResource")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hresource);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hresource;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_failClusterResourceEx_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hresource, lpszreason);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hresource;
    (void)lpszreason;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_freeClusterCrypt_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pcryptinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FreeClusterCrypt")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(pcryptinfo);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pcryptinfo;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_freeClusterHealthFault_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* clusterhealthfault = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FreeClusterHealthFault")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(clusterhealthfault);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)clusterhealthfault;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_freeClusterHealthFaultArray_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* clusterhealthfaultarray = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FreeClusterHealthFaultArray")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(clusterhealthfaultarray);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)clusterhealthfaultarray;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_getClusterFromGroup_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hgroup = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetClusterFromGroup")));
    }
    int64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hgroup);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hgroup;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_networking_clustering_getClusterFromNetInterface_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hnetinterface = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetClusterFromNetInterface")));
    }
    int64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hnetinterface);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hnetinterface;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_networking_clustering_getClusterFromNetwork_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hnetwork = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetClusterFromNetwork")));
    }
    int64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hnetwork);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hnetwork;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_networking_clustering_getClusterFromNode_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hnode = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetClusterFromNode")));
    }
    int64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hnode);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hnode;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_networking_clustering_getClusterFromResource_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hresource = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetClusterFromResource")));
    }
    int64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hresource);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hresource;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_networking_clustering_getClusterGroupKey_napi(const Napi::CallbackInfo& km_info) {
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
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hgroup, samdesired);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
#else
    (void)hgroup;
    (void)samdesired;
    errno = ENOSYS;
    void* km_res = nullptr;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_networking_clustering_getClusterGroupState_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hgroup, lpsznodename, lpcchnodename);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hgroup;
    (void)lpsznodename;
    (void)lpcchnodename;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_getClusterInformation_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hcluster, lpszclustername, lpcchclustername, lpclusterinfo);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hcluster;
    (void)lpszclustername;
    (void)lpcchclustername;
    (void)lpclusterinfo;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_getClusterKey_napi(const Napi::CallbackInfo& km_info) {
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
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hcluster, samdesired);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
#else
    (void)hcluster;
    (void)samdesired;
    errno = ENOSYS;
    void* km_res = nullptr;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_networking_clustering_getClusterNetInterface_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hcluster, lpsznodename, lpsznetworkname, lpszinterfacename, lpcchinterfacename);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hcluster;
    (void)lpsznodename;
    (void)lpsznetworkname;
    (void)lpszinterfacename;
    (void)lpcchinterfacename;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_getClusterNetInterfaceKey_napi(const Napi::CallbackInfo& km_info) {
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
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hnetinterface, samdesired);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
#else
    (void)hnetinterface;
    (void)samdesired;
    errno = ENOSYS;
    void* km_res = nullptr;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_networking_clustering_getClusterNetInterfaceState_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hnetinterface = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetClusterNetInterfaceState")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hnetinterface);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hnetinterface;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_getClusterNetworkId_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hnetwork, lpsznetworkid, lpcchname);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hnetwork;
    (void)lpsznetworkid;
    (void)lpcchname;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_getClusterNetworkKey_napi(const Napi::CallbackInfo& km_info) {
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
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hnetwork, samdesired);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
#else
    (void)hnetwork;
    (void)samdesired;
    errno = ENOSYS;
    void* km_res = nullptr;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_networking_clustering_getClusterNetworkState_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hnetwork = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetClusterNetworkState")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hnetwork);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hnetwork;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_getClusterNodeId_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hnode, lpsznodeid, lpcchname);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hnode;
    (void)lpsznodeid;
    (void)lpcchname;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_getClusterNodeKey_napi(const Napi::CallbackInfo& km_info) {
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
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hnode, samdesired);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
#else
    (void)hnode;
    (void)samdesired;
    errno = ENOSYS;
    void* km_res = nullptr;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_networking_clustering_getClusterNodeState_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hnode = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetClusterNodeState")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hnode);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hnode;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_getClusterNotify_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hchange, lpdwnotifykey, lpdwfiltertype, lpszname, lpcchname, dwmilliseconds);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hchange;
    (void)lpdwnotifykey;
    (void)lpdwfiltertype;
    (void)lpszname;
    (void)lpcchname;
    (void)dwmilliseconds;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_getClusterNotifyV2_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hchange, lpdwnotifykey, pfilterandtype, buffer, lpbbuffersize, lpszobjectid, lpcchobjectid, lpszparentid, lpcchparentid, lpszname, lpcchname, lpsztype, lpcchtype, dwmilliseconds);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
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
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_getClusterQuorumResource_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hcluster, lpszresourcename, lpcchresourcename, lpszdevicename, lpcchdevicename, lpdwmaxquorumlogsize);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hcluster;
    (void)lpszresourcename;
    (void)lpcchresourcename;
    (void)lpszdevicename;
    (void)lpcchdevicename;
    (void)lpdwmaxquorumlogsize;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_getClusterResourceDependencyExpression_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hresource, lpszdependencyexpression, lpcchdependencyexpression);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hresource;
    (void)lpszdependencyexpression;
    (void)lpcchdependencyexpression;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_getClusterResourceKey_napi(const Napi::CallbackInfo& km_info) {
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
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hresource, samdesired);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
#else
    (void)hresource;
    (void)samdesired;
    errno = ENOSYS;
    void* km_res = nullptr;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_networking_clustering_getClusterResourceNetworkName_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hresource, lpbuffer, nsize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hresource;
    (void)lpbuffer;
    (void)nsize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_getClusterResourceState_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hresource, lpsznodename, lpcchnodename, lpszgroupname, lpcchgroupname);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hresource;
    (void)lpsznodename;
    (void)lpcchnodename;
    (void)lpszgroupname;
    (void)lpcchgroupname;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_getClusterResourceTypeKey_napi(const Napi::CallbackInfo& km_info) {
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
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hcluster, lpsztypename, samdesired);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
#else
    (void)hcluster;
    (void)lpsztypename;
    (void)samdesired;
    errno = ENOSYS;
    void* km_res = nullptr;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_networking_clustering_getNodeCloudTypeDW_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(ppsznodename, nodecloudtype);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)ppsznodename;
    (void)nodecloudtype;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_getNodeClusterState_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(lpsznodename, pdwclusterstate);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)lpsznodename;
    (void)pdwclusterstate;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_getNotifyEventHandle_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hchange, lphtargetevent);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hchange;
    (void)lphtargetevent;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_initializeClusterHealthFault_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* clusterhealthfault = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "InitializeClusterHealthFault")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(clusterhealthfault);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)clusterhealthfault;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_initializeClusterHealthFaultArray_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* clusterhealthfaultarray = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "InitializeClusterHealthFaultArray")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(clusterhealthfaultarray);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)clusterhealthfaultarray;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_isFileOnClusterSharedVolume_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(lpszpathname, pbfileisonsharedvolume);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)lpszpathname;
    (void)pbfileisonsharedvolume;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_moveClusterGroup_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hgroup, hdestinationnode);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hgroup;
    (void)hdestinationnode;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_moveClusterGroupEx_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hgroup, hdestinationnode, dwmoveflags, lpinbuffer, cbinbuffersize);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hgroup;
    (void)hdestinationnode;
    (void)dwmoveflags;
    (void)lpinbuffer;
    (void)cbinbuffersize;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_moveClusterGroupEx2_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hgroup, hdestinationnode, dwmoveflags, lpinbuffer, cbinbuffersize, lpszreason);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hgroup;
    (void)hdestinationnode;
    (void)dwmoveflags;
    (void)lpinbuffer;
    (void)cbinbuffersize;
    (void)lpszreason;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_offlineClusterGroup_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hgroup = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "OfflineClusterGroup")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hgroup);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hgroup;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_offlineClusterGroupEx_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hgroup, dwofflineflags, lpinbuffer, cbinbuffersize);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hgroup;
    (void)dwofflineflags;
    (void)lpinbuffer;
    (void)cbinbuffersize;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_offlineClusterGroupEx2_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hgroup, dwofflineflags, lpinbuffer, cbinbuffersize, lpszreason);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hgroup;
    (void)dwofflineflags;
    (void)lpinbuffer;
    (void)cbinbuffersize;
    (void)lpszreason;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_offlineClusterResource_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hresource = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "OfflineClusterResource")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hresource);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hresource;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_offlineClusterResourceEx_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hresource, dwofflineflags, lpinbuffer, cbinbuffersize);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hresource;
    (void)dwofflineflags;
    (void)lpinbuffer;
    (void)cbinbuffersize;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_offlineClusterResourceEx2_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hresource, dwofflineflags, lpinbuffer, cbinbuffersize, lpszreason);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hresource;
    (void)dwofflineflags;
    (void)lpinbuffer;
    (void)cbinbuffersize;
    (void)lpszreason;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_onlineClusterGroup_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hgroup, hdestinationnode);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hgroup;
    (void)hdestinationnode;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_onlineClusterGroupEx_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hgroup, hdestinationnode, dwonlineflags, lpinbuffer, cbinbuffersize);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hgroup;
    (void)hdestinationnode;
    (void)dwonlineflags;
    (void)lpinbuffer;
    (void)cbinbuffersize;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_onlineClusterGroupEx2_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hgroup, hdestinationnode, dwonlineflags, lpinbuffer, cbinbuffersize, lpszreason);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hgroup;
    (void)hdestinationnode;
    (void)dwonlineflags;
    (void)lpinbuffer;
    (void)cbinbuffersize;
    (void)lpszreason;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_onlineClusterResource_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hresource = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "OnlineClusterResource")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hresource);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hresource;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_onlineClusterResourceEx_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hresource, dwonlineflags, lpinbuffer, cbinbuffersize);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hresource;
    (void)dwonlineflags;
    (void)lpinbuffer;
    (void)cbinbuffersize;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_onlineClusterResourceEx2_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hresource, dwonlineflags, lpinbuffer, cbinbuffersize, lpszreason);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hresource;
    (void)dwonlineflags;
    (void)lpinbuffer;
    (void)cbinbuffersize;
    (void)lpszreason;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_openCluster_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpszclustername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "OpenCluster")));
    }
    int64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(lpszclustername);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpszclustername;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_networking_clustering_openClusterCryptProvider_napi(const Napi::CallbackInfo& km_info) {
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
    int64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(lpszresource, lpszprovider, dwtype, dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpszresource;
    (void)lpszprovider;
    (void)dwtype;
    (void)dwflags;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_networking_clustering_openClusterCryptProviderEx_napi(const Napi::CallbackInfo& km_info) {
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
    int64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(lpszresource, lpszkeyname, lpszprovider, dwtype, dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpszresource;
    (void)lpszkeyname;
    (void)lpszprovider;
    (void)dwtype;
    (void)dwflags;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_networking_clustering_openClusterEx_napi(const Napi::CallbackInfo& km_info) {
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
    int64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(lpszclustername, desiredaccess, grantedaccess);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpszclustername;
    (void)desiredaccess;
    (void)grantedaccess;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_networking_clustering_openClusterGroup_napi(const Napi::CallbackInfo& km_info) {
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
    int64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hcluster, lpszgroupname);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcluster;
    (void)lpszgroupname;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_networking_clustering_openClusterGroupEx_napi(const Napi::CallbackInfo& km_info) {
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
    int64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hcluster, lpszgroupname, dwdesiredaccess, lpdwgrantedaccess);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcluster;
    (void)lpszgroupname;
    (void)dwdesiredaccess;
    (void)lpdwgrantedaccess;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_networking_clustering_openClusterGroupSet_napi(const Napi::CallbackInfo& km_info) {
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
    int64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hcluster, lpszgroupsetname);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcluster;
    (void)lpszgroupsetname;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_networking_clustering_openClusterNetInterface_napi(const Napi::CallbackInfo& km_info) {
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
    int64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hcluster, lpszinterfacename);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcluster;
    (void)lpszinterfacename;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_networking_clustering_openClusterNetInterfaceEx_napi(const Napi::CallbackInfo& km_info) {
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
    int64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hcluster, lpszinterfacename, dwdesiredaccess, lpdwgrantedaccess);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcluster;
    (void)lpszinterfacename;
    (void)dwdesiredaccess;
    (void)lpdwgrantedaccess;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_networking_clustering_openClusterNetwork_napi(const Napi::CallbackInfo& km_info) {
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
    int64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hcluster, lpsznetworkname);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcluster;
    (void)lpsznetworkname;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_networking_clustering_openClusterNetworkEx_napi(const Napi::CallbackInfo& km_info) {
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
    int64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hcluster, lpsznetworkname, dwdesiredaccess, lpdwgrantedaccess);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcluster;
    (void)lpsznetworkname;
    (void)dwdesiredaccess;
    (void)lpdwgrantedaccess;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_networking_clustering_openClusterNode_napi(const Napi::CallbackInfo& km_info) {
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
    int64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hcluster, lpsznodename);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcluster;
    (void)lpsznodename;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_networking_clustering_openClusterNodeById_napi(const Napi::CallbackInfo& km_info) {
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
    int64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hcluster, nodeid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcluster;
    (void)nodeid;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_networking_clustering_openClusterNodeEx_napi(const Napi::CallbackInfo& km_info) {
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
    int64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hcluster, lpsznodename, dwdesiredaccess, lpdwgrantedaccess);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcluster;
    (void)lpsznodename;
    (void)dwdesiredaccess;
    (void)lpdwgrantedaccess;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_networking_clustering_openClusterResource_napi(const Napi::CallbackInfo& km_info) {
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
    int64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hcluster, lpszresourcename);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcluster;
    (void)lpszresourcename;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_networking_clustering_openClusterResourceEx_napi(const Napi::CallbackInfo& km_info) {
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
    int64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hcluster, lpszresourcename, dwdesiredaccess, lpdwgrantedaccess);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcluster;
    (void)lpszresourcename;
    (void)dwdesiredaccess;
    (void)lpdwgrantedaccess;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_networking_clustering_pauseClusterNode_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hnode = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PauseClusterNode")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hnode);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hnode;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_pauseClusterNodeEx_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hnode, bdrainnode, dwpauseflags, hnodedraintarget);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hnode;
    (void)bdrainnode;
    (void)dwpauseflags;
    (void)hnodedraintarget;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_pauseClusterNodeEx2_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hnode, bdrainnode, dwpauseflags, hnodedraintarget, lpszreason);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hnode;
    (void)bdrainnode;
    (void)dwpauseflags;
    (void)hnodedraintarget;
    (void)lpszreason;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_queryAppInstanceVersion_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(appinstanceid, instanceversionhigh, instanceversionlow, versionstatus);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)appinstanceid;
    (void)instanceversionhigh;
    (void)instanceversionlow;
    (void)versionstatus;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_registerAppInstance_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(processhandle, appinstanceid, childreninheritappinstance);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)processhandle;
    (void)appinstanceid;
    (void)childreninheritappinstance;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_registerAppInstanceVersion_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(appinstanceid, instanceversionhigh, instanceversionlow);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)appinstanceid;
    (void)instanceversionhigh;
    (void)instanceversionlow;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_registerClusterNotify_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hchange, dwfiltertype, hobject, dwnotifykey);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hchange;
    (void)dwfiltertype;
    (void)hobject;
    (void)dwnotifykey;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_registerClusterResourceTypeNotifyV2_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hchange, hcluster, flags, restypename, dwnotifykey);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hchange;
    (void)hcluster;
    (void)flags;
    (void)restypename;
    (void)dwnotifykey;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_removeClusterGroupDependency_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hgroup, hdependson);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hgroup;
    (void)hdependson;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_removeClusterGroupDependencyEx_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hgroup, hdependson, lpszreason);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hgroup;
    (void)hdependson;
    (void)lpszreason;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_removeClusterGroupSetDependency_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hgroupset, hdependson);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hgroupset;
    (void)hdependson;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_removeClusterGroupSetDependencyEx_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hgroupset, hdependson, lpszreason);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hgroupset;
    (void)hdependson;
    (void)lpszreason;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_removeClusterGroupToGroupSetDependency_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hgroup, hdependson);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hgroup;
    (void)hdependson;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_removeClusterGroupToGroupSetDependencyEx_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hgroup, hdependson, lpszreason);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hgroup;
    (void)hdependson;
    (void)lpszreason;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_removeClusterNameAccount_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hcluster, bdeletecomputerobjects);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hcluster;
    (void)bdeletecomputerobjects;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_removeClusterResourceDependency_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hresource, hdependson);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hresource;
    (void)hdependson;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_removeClusterResourceDependencyEx_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hresource, hdependson, lpszreason);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hresource;
    (void)hdependson;
    (void)lpszreason;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_removeClusterResourceNode_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hresource, hnode);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hresource;
    (void)hnode;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_removeClusterResourceNodeEx_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hresource, hnode, lpszreason);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hresource;
    (void)hnode;
    (void)lpszreason;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_removeClusterStorageNode_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hcluster, lpszclusterstorageenclosurename, dwtimeout, dwflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hcluster;
    (void)lpszclusterstorageenclosurename;
    (void)dwtimeout;
    (void)dwflags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_removeCrossClusterGroupSetDependency_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hdependentgroupset, lpremoteclustername, lpremotegroupsetname);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hdependentgroupset;
    (void)lpremoteclustername;
    (void)lpremotegroupsetname;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_removeResourceFromClusterSharedVolumes_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hresource = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RemoveResourceFromClusterSharedVolumes")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hresource);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hresource;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_resUtilAddUnknownProperties_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hkeyclusterkey, ppropertytable, poutpropertylist, pcboutpropertylistsize, pcbbytesreturned, pcbrequired);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hkeyclusterkey;
    (void)ppropertytable;
    (void)poutpropertylist;
    (void)pcboutpropertylistsize;
    (void)pcbbytesreturned;
    (void)pcbrequired;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_resUtilCreateDirectoryTree_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pszpath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ResUtilCreateDirectoryTree")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(pszpath);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pszpath;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_resUtilDupGroup_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(group, copy);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)group;
    (void)copy;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_resUtilDupParameterBlock_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(poutparams, pinparams, ppropertytable);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)poutparams;
    (void)pinparams;
    (void)ppropertytable;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_resUtilDupResource_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(group, copy);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)group;
    (void)copy;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_resUtilDupString_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pszinstring = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ResUtilDupString")));
    }
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(pszinstring);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
#else
    (void)pszinstring;
    errno = ENOSYS;
    void* km_res = nullptr;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_networking_clustering_resUtilEnumGroups_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hcluster, hself, prescallback, pparameter);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hcluster;
    (void)hself;
    (void)prescallback;
    (void)pparameter;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_resUtilEnumGroupsEx_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hcluster, hself, grouptype, prescallback, pparameter);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hcluster;
    (void)hself;
    (void)grouptype;
    (void)prescallback;
    (void)pparameter;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_resUtilEnumPrivateProperties_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hkeyclusterkey, pszoutproperties, cboutpropertiessize, pcbbytesreturned, pcbrequired);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hkeyclusterkey;
    (void)pszoutproperties;
    (void)cboutpropertiessize;
    (void)pcbbytesreturned;
    (void)pcbrequired;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_resUtilEnumProperties_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(ppropertytable, pszoutproperties, cboutpropertiessize, pcbbytesreturned, pcbrequired);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)ppropertytable;
    (void)pszoutproperties;
    (void)cboutpropertiessize;
    (void)pcbbytesreturned;
    (void)pcbrequired;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_resUtilEnumResources_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hself, lpszrestypename, prescallback, pparameter);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hself;
    (void)lpszrestypename;
    (void)prescallback;
    (void)pparameter;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_resUtilEnumResourcesEx_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hcluster, hself, lpszrestypename, prescallback, pparameter);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hcluster;
    (void)hself;
    (void)lpszrestypename;
    (void)prescallback;
    (void)pparameter;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_resUtilEnumResourcesEx2_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hcluster, hself, lpszrestypename, prescallback, pparameter, dwdesiredaccess);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hcluster;
    (void)hself;
    (void)lpszrestypename;
    (void)prescallback;
    (void)pparameter;
    (void)dwdesiredaccess;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_resUtilExpandEnvironmentStrings_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pszsrc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ResUtilExpandEnvironmentStrings")));
    }
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(pszsrc);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
#else
    (void)pszsrc;
    errno = ENOSYS;
    void* km_res = nullptr;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_networking_clustering_resUtilFindBinaryProperty_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(ppropertylist, cbpropertylistsize, pszpropertyname, pbpropertyvalue, pcbpropertyvaluesize);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)ppropertylist;
    (void)cbpropertylistsize;
    (void)pszpropertyname;
    (void)pbpropertyvalue;
    (void)pcbpropertyvaluesize;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_resUtilFindDependentDiskResourceDriveLetter_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hcluster, hresource, pszdriveletter, pcchdriveletter);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hcluster;
    (void)hresource;
    (void)pszdriveletter;
    (void)pcchdriveletter;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_resUtilFindDwordProperty_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(ppropertylist, cbpropertylistsize, pszpropertyname, pdwpropertyvalue);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)ppropertylist;
    (void)cbpropertylistsize;
    (void)pszpropertyname;
    (void)pdwpropertyvalue;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_resUtilFindExpandSzProperty_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(ppropertylist, cbpropertylistsize, pszpropertyname, pszpropertyvalue);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)ppropertylist;
    (void)cbpropertylistsize;
    (void)pszpropertyname;
    (void)pszpropertyvalue;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_resUtilFindExpandedSzProperty_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(ppropertylist, cbpropertylistsize, pszpropertyname, pszpropertyvalue);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)ppropertylist;
    (void)cbpropertylistsize;
    (void)pszpropertyname;
    (void)pszpropertyvalue;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_resUtilFindFileTimeProperty_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(ppropertylist, cbpropertylistsize, pszpropertyname, pftpropertyvalue);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)ppropertylist;
    (void)cbpropertylistsize;
    (void)pszpropertyname;
    (void)pftpropertyvalue;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_resUtilFindLongProperty_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(ppropertylist, cbpropertylistsize, pszpropertyname, plpropertyvalue);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)ppropertylist;
    (void)cbpropertylistsize;
    (void)pszpropertyname;
    (void)plpropertyvalue;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_resUtilFindMultiSzProperty_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(ppropertylist, cbpropertylistsize, pszpropertyname, pszpropertyvalue, pcbpropertyvaluesize);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)ppropertylist;
    (void)cbpropertylistsize;
    (void)pszpropertyname;
    (void)pszpropertyvalue;
    (void)pcbpropertyvaluesize;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_resUtilFindSzProperty_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(ppropertylist, cbpropertylistsize, pszpropertyname, pszpropertyvalue);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)ppropertylist;
    (void)cbpropertylistsize;
    (void)pszpropertyname;
    (void)pszpropertyvalue;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_resUtilFindULargeIntegerProperty_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(ppropertylist, cbpropertylistsize, pszpropertyname, plpropertyvalue);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)ppropertylist;
    (void)cbpropertylistsize;
    (void)pszpropertyname;
    (void)plpropertyvalue;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_resUtilFreeEnvironment_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpenvironment = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ResUtilFreeEnvironment")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(lpenvironment);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)lpenvironment;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_resUtilFreeParameterBlock_napi(const Napi::CallbackInfo& km_info) {
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
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(poutparams, pinparams, ppropertytable);
    } else {
        errno = ENOSYS;
    }
#else
    (void)poutparams;
    (void)pinparams;
    (void)ppropertytable;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_networking_clustering_resUtilGetAllProperties_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hkeyclusterkey, ppropertytable, poutpropertylist, cboutpropertylistsize, pcbbytesreturned, pcbrequired);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hkeyclusterkey;
    (void)ppropertytable;
    (void)poutpropertylist;
    (void)cboutpropertylistsize;
    (void)pcbbytesreturned;
    (void)pcbrequired;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_resUtilGetBinaryProperty_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(ppboutvalue, pcboutvaluesize, pvaluestruct, pboldvalue, cboldvaluesize, pppropertylist, pcbpropertylistsize);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)ppboutvalue;
    (void)pcboutvaluesize;
    (void)pvaluestruct;
    (void)pboldvalue;
    (void)cboldvaluesize;
    (void)pppropertylist;
    (void)pcbpropertylistsize;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_resUtilGetBinaryValue_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hkeyclusterkey, pszvaluename, ppboutvalue, pcboutvaluesize);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hkeyclusterkey;
    (void)pszvaluename;
    (void)ppboutvalue;
    (void)pcboutvaluesize;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_resUtilGetClusterGroupType_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hgroup, grouptype);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hgroup;
    (void)grouptype;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_resUtilGetClusterId_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hcluster, guid);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hcluster;
    (void)guid;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_resUtilGetClusterRoleState_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hcluster, eclusterrole);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcluster;
    (void)eclusterrole;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_resUtilGetCoreClusterResources_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hcluster, phclusternameresource, phclusteripaddressresource, phclusterquorumresource);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hcluster;
    (void)phclusternameresource;
    (void)phclusteripaddressresource;
    (void)phclusterquorumresource;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_resUtilGetCoreClusterResourcesEx_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hclusterin, phclusternameresourceout, phclusterquorumresourceout, dwdesiredaccess);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hclusterin;
    (void)phclusternameresourceout;
    (void)phclusterquorumresourceout;
    (void)dwdesiredaccess;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_resUtilGetCoreGroup_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hcluster = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ResUtilGetCoreGroup")));
    }
    int64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hcluster);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcluster;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_networking_clustering_resUtilGetDwordProperty_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(pdwoutvalue, pvaluestruct, dwoldvalue, dwminimum, dwmaximum, pppropertylist, pcbpropertylistsize);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pdwoutvalue;
    (void)pvaluestruct;
    (void)dwoldvalue;
    (void)dwminimum;
    (void)dwmaximum;
    (void)pppropertylist;
    (void)pcbpropertylistsize;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_resUtilGetDwordValue_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hkeyclusterkey, pszvaluename, pdwoutvalue, dwdefaultvalue);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hkeyclusterkey;
    (void)pszvaluename;
    (void)pdwoutvalue;
    (void)dwdefaultvalue;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_resUtilGetEnvironmentWithNetName_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hresource = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ResUtilGetEnvironmentWithNetName")));
    }
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hresource);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
#else
    (void)hresource;
    errno = ENOSYS;
    void* km_res = nullptr;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_networking_clustering_resUtilGetLongProperty_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(ploutvalue, pvaluestruct, loldvalue, lminimum, lmaximum, pppropertylist, pcbpropertylistsize);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)ploutvalue;
    (void)pvaluestruct;
    (void)loldvalue;
    (void)lminimum;
    (void)lmaximum;
    (void)pppropertylist;
    (void)pcbpropertylistsize;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_resUtilGetMultiSzProperty_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(ppszoutvalue, pcboutvaluesize, pvaluestruct, pszoldvalue, cboldvaluesize, pppropertylist, pcbpropertylistsize);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)ppszoutvalue;
    (void)pcboutvaluesize;
    (void)pvaluestruct;
    (void)pszoldvalue;
    (void)cboldvaluesize;
    (void)pppropertylist;
    (void)pcbpropertylistsize;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_resUtilGetPrivateProperties_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hkeyclusterkey, poutpropertylist, cboutpropertylistsize, pcbbytesreturned, pcbrequired);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hkeyclusterkey;
    (void)poutpropertylist;
    (void)cboutpropertylistsize;
    (void)pcbbytesreturned;
    (void)pcbrequired;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_resUtilGetProperties_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hkeyclusterkey, ppropertytable, poutpropertylist, cboutpropertylistsize, pcbbytesreturned, pcbrequired);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hkeyclusterkey;
    (void)ppropertytable;
    (void)poutpropertylist;
    (void)cboutpropertylistsize;
    (void)pcbbytesreturned;
    (void)pcbrequired;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_resUtilGetPropertiesToParameterBlock_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hkeyclusterkey, ppropertytable, poutparams, bcheckforrequiredproperties, psznameofpropinerror);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hkeyclusterkey;
    (void)ppropertytable;
    (void)poutparams;
    (void)bcheckforrequiredproperties;
    (void)psznameofpropinerror;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_resUtilGetProperty_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hkeyclusterkey, ppropertytableitem, poutpropertyitem, pcboutpropertyitemsize);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hkeyclusterkey;
    (void)ppropertytableitem;
    (void)poutpropertyitem;
    (void)pcboutpropertyitemsize;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_resUtilGetPropertyFormats_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(ppropertytable, poutpropertyformatlist, cbpropertyformatlistsize, pcbbytesreturned, pcbrequired);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)ppropertytable;
    (void)poutpropertyformatlist;
    (void)cbpropertyformatlistsize;
    (void)pcbbytesreturned;
    (void)pcbrequired;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_resUtilGetPropertySize_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hkeyclusterkey, ppropertytableitem, pcboutpropertylistsize, pnpropertycount);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hkeyclusterkey;
    (void)ppropertytableitem;
    (void)pcboutpropertylistsize;
    (void)pnpropertycount;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_resUtilGetQwordValue_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hkeyclusterkey, pszvaluename, pqwoutvalue, qwdefaultvalue);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hkeyclusterkey;
    (void)pszvaluename;
    (void)pqwoutvalue;
    (void)qwdefaultvalue;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_resUtilGetResourceDependency_napi(const Napi::CallbackInfo& km_info) {
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
    int64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hself, lpszresourcetype);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hself;
    (void)lpszresourcetype;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_networking_clustering_resUtilGetResourceDependencyByClass_napi(const Napi::CallbackInfo& km_info) {
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
    int64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hcluster, hself, prci, brecurse);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcluster;
    (void)hself;
    (void)prci;
    (void)brecurse;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_networking_clustering_resUtilGetResourceDependencyByClassEx_napi(const Napi::CallbackInfo& km_info) {
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
    int64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hcluster, hself, prci, brecurse, dwdesiredaccess);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcluster;
    (void)hself;
    (void)prci;
    (void)brecurse;
    (void)dwdesiredaccess;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_networking_clustering_resUtilGetResourceDependencyByName_napi(const Napi::CallbackInfo& km_info) {
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
    int64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hcluster, hself, lpszresourcetype, brecurse);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcluster;
    (void)hself;
    (void)lpszresourcetype;
    (void)brecurse;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_networking_clustering_resUtilGetResourceDependencyByNameEx_napi(const Napi::CallbackInfo& km_info) {
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
    int64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hcluster, hself, lpszresourcetype, brecurse, dwdesiredaccess);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcluster;
    (void)hself;
    (void)lpszresourcetype;
    (void)brecurse;
    (void)dwdesiredaccess;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_networking_clustering_resUtilGetResourceDependencyEx_napi(const Napi::CallbackInfo& km_info) {
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
    int64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hself, lpszresourcetype, dwdesiredaccess);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hself;
    (void)lpszresourcetype;
    (void)dwdesiredaccess;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_networking_clustering_resUtilGetResourceDependentIPAddressProps_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hresource, pszaddress, pcchaddress, pszsubnetmask, pcchsubnetmask, psznetwork, pcchnetwork);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hresource;
    (void)pszaddress;
    (void)pcchaddress;
    (void)pszsubnetmask;
    (void)pcchsubnetmask;
    (void)psznetwork;
    (void)pcchnetwork;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_resUtilGetResourceName_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hresource, pszresourcename, pcchresourcenameinout);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hresource;
    (void)pszresourcename;
    (void)pcchresourcenameinout;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_resUtilGetResourceNameDependency_napi(const Napi::CallbackInfo& km_info) {
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
    int64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(lpszresourcename, lpszresourcetype);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpszresourcename;
    (void)lpszresourcetype;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_networking_clustering_resUtilGetResourceNameDependencyEx_napi(const Napi::CallbackInfo& km_info) {
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
    int64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(lpszresourcename, lpszresourcetype, dwdesiredaccess);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpszresourcename;
    (void)lpszresourcetype;
    (void)dwdesiredaccess;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_networking_clustering_resUtilGetSzProperty_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(ppszoutvalue, pvaluestruct, pszoldvalue, pppropertylist, pcbpropertylistsize);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)ppszoutvalue;
    (void)pvaluestruct;
    (void)pszoldvalue;
    (void)pppropertylist;
    (void)pcbpropertylistsize;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_resUtilGetSzValue_napi(const Napi::CallbackInfo& km_info) {
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
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hkeyclusterkey, pszvaluename);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
#else
    (void)hkeyclusterkey;
    (void)pszvaluename;
    errno = ENOSYS;
    void* km_res = nullptr;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_networking_clustering_resUtilGroupsEqual_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hself, hgroup, pequal);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hself;
    (void)hgroup;
    (void)pequal;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_resUtilIsPathValid_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pszpath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ResUtilIsPathValid")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(pszpath);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pszpath;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_resUtilIsResourceClassEqual_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(prci, hresource);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)prci;
    (void)hresource;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_resUtilLeftPaxosIsLessThanRight_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(left, right);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)left;
    (void)right;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_resUtilNodeEnum_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hcluster, pnodecallback, pparameter);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hcluster;
    (void)pnodecallback;
    (void)pparameter;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_resUtilPaxosComparer_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(left, right);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)left;
    (void)right;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_resUtilPropertyListFromParameterBlock_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(ppropertytable, poutpropertylist, pcboutpropertylistsize, pinparams, pcbbytesreturned, pcbrequired);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)ppropertytable;
    (void)poutpropertylist;
    (void)pcboutpropertylistsize;
    (void)pinparams;
    (void)pcbbytesreturned;
    (void)pcbrequired;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_resUtilRemoveResourceServiceEnvironment_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(pszservicename, pfnlogevent, hresourcehandle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pszservicename;
    (void)pfnlogevent;
    (void)hresourcehandle;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_resUtilResourceDepEnum_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hself, enumtype, prescallback, pparameter);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hself;
    (void)enumtype;
    (void)prescallback;
    (void)pparameter;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_resUtilResourceTypesEqual_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(lpszresourcetypename, hresource);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpszresourcetypename;
    (void)hresource;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_resUtilResourcesEqual_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hself, hresource);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hself;
    (void)hresource;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_resUtilSetBinaryValue_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hkeyclusterkey, pszvaluename, pbnewvalue, cbnewvaluesize, ppboutvalue, pcboutvaluesize);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hkeyclusterkey;
    (void)pszvaluename;
    (void)pbnewvalue;
    (void)cbnewvaluesize;
    (void)ppboutvalue;
    (void)pcboutvaluesize;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_resUtilSetDwordValue_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hkeyclusterkey, pszvaluename, dwnewvalue, pdwoutvalue);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hkeyclusterkey;
    (void)pszvaluename;
    (void)dwnewvalue;
    (void)pdwoutvalue;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_resUtilSetExpandSzValue_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hkeyclusterkey, pszvaluename, psznewvalue, ppszoutstring);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hkeyclusterkey;
    (void)pszvaluename;
    (void)psznewvalue;
    (void)ppszoutstring;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_resUtilSetMultiSzValue_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hkeyclusterkey, pszvaluename, psznewvalue, cbnewvaluesize, ppszoutvalue, pcboutvaluesize);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hkeyclusterkey;
    (void)pszvaluename;
    (void)psznewvalue;
    (void)cbnewvaluesize;
    (void)ppszoutvalue;
    (void)pcboutvaluesize;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_resUtilSetPrivatePropertyList_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hkeyclusterkey, pinpropertylist, cbinpropertylistsize);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hkeyclusterkey;
    (void)pinpropertylist;
    (void)cbinpropertylistsize;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_resUtilSetPropertyParameterBlock_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hkeyclusterkey, ppropertytable, reserved, pinparams, pinpropertylist, cbinpropertylistsize, poutparams);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hkeyclusterkey;
    (void)ppropertytable;
    (void)reserved;
    (void)pinparams;
    (void)pinpropertylist;
    (void)cbinpropertylistsize;
    (void)poutparams;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_resUtilSetPropertyParameterBlockEx_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hkeyclusterkey, ppropertytable, reserved, pinparams, pinpropertylist, cbinpropertylistsize, bforcewrite, poutparams);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hkeyclusterkey;
    (void)ppropertytable;
    (void)reserved;
    (void)pinparams;
    (void)pinpropertylist;
    (void)cbinpropertylistsize;
    (void)bforcewrite;
    (void)poutparams;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_resUtilSetPropertyTable_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hkeyclusterkey, ppropertytable, reserved, ballowunknownproperties, pinpropertylist, cbinpropertylistsize, poutparams);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hkeyclusterkey;
    (void)ppropertytable;
    (void)reserved;
    (void)ballowunknownproperties;
    (void)pinpropertylist;
    (void)cbinpropertylistsize;
    (void)poutparams;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_resUtilSetPropertyTableEx_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hkeyclusterkey, ppropertytable, reserved, ballowunknownproperties, pinpropertylist, cbinpropertylistsize, bforcewrite, poutparams);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hkeyclusterkey;
    (void)ppropertytable;
    (void)reserved;
    (void)ballowunknownproperties;
    (void)pinpropertylist;
    (void)cbinpropertylistsize;
    (void)bforcewrite;
    (void)poutparams;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_resUtilSetQwordValue_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hkeyclusterkey, pszvaluename, qwnewvalue, pqwoutvalue);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hkeyclusterkey;
    (void)pszvaluename;
    (void)qwnewvalue;
    (void)pqwoutvalue;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_resUtilSetResourceServiceEnvironment_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(pszservicename, hresource, pfnlogevent, hresourcehandle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pszservicename;
    (void)hresource;
    (void)pfnlogevent;
    (void)hresourcehandle;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_resUtilSetResourceServiceStartParameters_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(pszservicename, schscmhandle, phservice, pfnlogevent, hresourcehandle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pszservicename;
    (void)schscmhandle;
    (void)phservice;
    (void)pfnlogevent;
    (void)hresourcehandle;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_resUtilSetResourceServiceStartParametersEx_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(pszservicename, schscmhandle, phservice, dwdesiredaccess, pfnlogevent, hresourcehandle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pszservicename;
    (void)schscmhandle;
    (void)phservice;
    (void)dwdesiredaccess;
    (void)pfnlogevent;
    (void)hresourcehandle;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_resUtilSetSzValue_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hkeyclusterkey, pszvaluename, psznewvalue, ppszoutstring);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hkeyclusterkey;
    (void)pszvaluename;
    (void)psznewvalue;
    (void)ppszoutstring;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_resUtilSetUnknownProperties_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hkeyclusterkey, ppropertytable, pinpropertylist, cbinpropertylistsize);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hkeyclusterkey;
    (void)ppropertytable;
    (void)pinpropertylist;
    (void)cbinpropertylistsize;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_resUtilSetValueEx_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hkeyclusterkey, valuename, valuetype, valuedata, valuesize, flags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hkeyclusterkey;
    (void)valuename;
    (void)valuetype;
    (void)valuedata;
    (void)valuesize;
    (void)flags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_resUtilStartResourceService_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(pszservicename, phservicehandle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pszservicename;
    (void)phservicehandle;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_resUtilStopResourceService_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pszservicename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ResUtilStopResourceService")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(pszservicename);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pszservicename;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_resUtilStopService_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hservicehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ResUtilStopService")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hservicehandle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hservicehandle;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_resUtilTerminateServiceProcessFromResDll_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(dwservicepid, boffline, pdwresourcestate, pfnlogevent, hresourcehandle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)dwservicepid;
    (void)boffline;
    (void)pdwresourcestate;
    (void)pfnlogevent;
    (void)hresourcehandle;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_resUtilVerifyPrivatePropertyList_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(pinpropertylist, cbinpropertylistsize);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pinpropertylist;
    (void)cbinpropertylistsize;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_resUtilVerifyPropertyTable_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(ppropertytable, reserved, ballowunknownproperties, pinpropertylist, cbinpropertylistsize, poutparams);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)ppropertytable;
    (void)reserved;
    (void)ballowunknownproperties;
    (void)pinpropertylist;
    (void)cbinpropertylistsize;
    (void)poutparams;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_resUtilVerifyResourceService_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pszservicename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ResUtilVerifyResourceService")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(pszservicename);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pszservicename;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_resUtilVerifyService_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hservicehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ResUtilVerifyService")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hservicehandle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hservicehandle;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_resUtilVerifyShutdownSafe_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(flags, reason, presult);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)flags;
    (void)reason;
    (void)presult;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_resUtilsDeleteKeyTree_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(key, keyname, treatnokeyaserror);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)key;
    (void)keyname;
    (void)treatnokeyaserror;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_resetAllAppInstanceVersions_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntlanman.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ResetAllAppInstanceVersions")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr();
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_restartClusterResource_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hresource, dwflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hresource;
    (void)dwflags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_restartClusterResourceEx_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hresource, dwflags, lpszreason);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hresource;
    (void)dwflags;
    (void)lpszreason;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_restoreClusterDatabase_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(lpszpathname, bforce, lpszquorumdriveletter);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)lpszpathname;
    (void)bforce;
    (void)lpszquorumdriveletter;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_resumeClusterNode_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hnode = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ResumeClusterNode")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hnode);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hnode;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_resumeClusterNodeEx_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hnode, eresumefailbacktype, dwresumeflagsreserved);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hnode;
    (void)eresumefailbacktype;
    (void)dwresumeflagsreserved;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_resumeClusterNodeEx2_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hnode, eresumefailbacktype, dwresumeflagsreserved, lpszreason);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hnode;
    (void)eresumefailbacktype;
    (void)dwresumeflagsreserved;
    (void)lpszreason;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_setAppInstanceCsvFlags_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(processhandle, mask, flags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)processhandle;
    (void)mask;
    (void)flags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_setClusterGroupName_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hgroup, lpszgroupname);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hgroup;
    (void)lpszgroupname;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_setClusterGroupNameEx_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hgroup, lpszgroupname, lpszreason);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hgroup;
    (void)lpszgroupname;
    (void)lpszreason;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_setClusterGroupNodeList_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hgroup, nodecount, nodelist);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hgroup;
    (void)nodecount;
    (void)nodelist;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_setClusterGroupNodeListEx_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hgroup, nodecount, nodelist, lpszreason);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hgroup;
    (void)nodecount;
    (void)nodelist;
    (void)lpszreason;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_setClusterGroupSetDependencyExpression_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hgroupset, lpszdependencyexprssion);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hgroupset;
    (void)lpszdependencyexprssion;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_setClusterGroupSetDependencyExpressionEx_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hgroupset, lpszdependencyexpression, lpszreason);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hgroupset;
    (void)lpszdependencyexpression;
    (void)lpszreason;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_setClusterName_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hcluster, lpsznewclustername);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hcluster;
    (void)lpsznewclustername;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_setClusterNameEx_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hcluster, lpsznewclustername, lpszreason);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hcluster;
    (void)lpsznewclustername;
    (void)lpszreason;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_setClusterNetworkName_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hnetwork, lpszname);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hnetwork;
    (void)lpszname;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_setClusterNetworkNameEx_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hnetwork, lpszname, lpszreason);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hnetwork;
    (void)lpszname;
    (void)lpszreason;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_setClusterNetworkPriorityOrder_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hcluster, networkcount, networklist);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hcluster;
    (void)networkcount;
    (void)networklist;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_setClusterQuorumResource_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hresource, lpszdevicename, dwmaxquologsize);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hresource;
    (void)lpszdevicename;
    (void)dwmaxquologsize;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_setClusterQuorumResourceEx_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hresource, lpszdevicename, dwmaxquorumlogsize, lpszreason);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hresource;
    (void)lpszdevicename;
    (void)dwmaxquorumlogsize;
    (void)lpszreason;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_setClusterResourceDependencyExpression_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hresource, lpszdependencyexpression);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hresource;
    (void)lpszdependencyexpression;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_setClusterResourceName_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hresource, lpszresourcename);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hresource;
    (void)lpszresourcename;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_setClusterResourceNameEx_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hresource, lpszresourcename, lpszreason);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hresource;
    (void)lpszresourcename;
    (void)lpszreason;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_setClusterServiceAccountPassword_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(lpszclustername, lpsznewpassword, dwflags, lpreturnstatusbuffer, lpcbreturnstatusbuffersize);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)lpszclustername;
    (void)lpsznewpassword;
    (void)dwflags;
    (void)lpreturnstatusbuffer;
    (void)lpcbreturnstatusbuffersize;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_setGroupDependencyExpression_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hgroup, lpszdependencyexpression);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hgroup;
    (void)lpszdependencyexpression;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_clustering_setGroupDependencyExpressionEx_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hgroup, lpszdependencyexpression, lpszreason);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hgroup;
    (void)lpszdependencyexpression;
    (void)lpszreason;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static void register_windows_win32_networking_clustering_napi(Napi::Env env, Napi::Object exports) {
    exports.Set("windowssys_windows_win32_networking_clustering_addClusterGroupDependency", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_addClusterGroupDependency_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_addClusterGroupDependencyEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_addClusterGroupDependencyEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_addClusterGroupSetDependency", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_addClusterGroupSetDependency_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_addClusterGroupSetDependencyEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_addClusterGroupSetDependencyEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_addClusterGroupToGroupSetDependency", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_addClusterGroupToGroupSetDependency_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_addClusterGroupToGroupSetDependencyEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_addClusterGroupToGroupSetDependencyEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_addClusterNode", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_addClusterNode_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_addClusterNodeEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_addClusterNodeEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_addClusterResourceDependency", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_addClusterResourceDependency_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_addClusterResourceDependencyEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_addClusterResourceDependencyEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_addClusterResourceNode", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_addClusterResourceNode_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_addClusterResourceNodeEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_addClusterResourceNodeEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_addClusterStorageNode", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_addClusterStorageNode_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_addCrossClusterGroupSetDependency", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_addCrossClusterGroupSetDependency_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_addResourceToClusterSharedVolumes", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_addResourceToClusterSharedVolumes_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_backupClusterDatabase", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_backupClusterDatabase_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_canResourceBeDependent", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_canResourceBeDependent_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_cancelClusterGroupOperation", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_cancelClusterGroupOperation_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_changeClusterResourceGroup", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_changeClusterResourceGroup_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_changeClusterResourceGroupEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_changeClusterResourceGroupEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_changeClusterResourceGroupEx2", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_changeClusterResourceGroupEx2_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_closeCluster", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_closeCluster_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_closeClusterCryptProvider", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_closeClusterCryptProvider_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_closeClusterGroup", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_closeClusterGroup_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_closeClusterGroupSet", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_closeClusterGroupSet_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_closeClusterNetInterface", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_closeClusterNetInterface_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_closeClusterNetwork", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_closeClusterNetwork_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_closeClusterNode", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_closeClusterNode_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_closeClusterNotifyPort", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_closeClusterNotifyPort_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_closeClusterResource", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_closeClusterResource_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_clusAddClusterHealthFault", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_clusAddClusterHealthFault_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_clusGetClusterHealthFaults", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_clusGetClusterHealthFaults_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_clusRemoveClusterHealthFault", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_clusRemoveClusterHealthFault_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_clusWorkerCheckTerminate", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_clusWorkerCheckTerminate_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_clusWorkerCreate", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_clusWorkerCreate_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_clusWorkerTerminate", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_clusWorkerTerminate_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_clusWorkerTerminateEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_clusWorkerTerminateEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_clusWorkersTerminate", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_clusWorkersTerminate_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_clusapiSetReasonHandler", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_clusapiSetReasonHandler_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_clusterAddGroupToAffinityRule", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_clusterAddGroupToAffinityRule_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_clusterAddGroupToGroupSet", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_clusterAddGroupToGroupSet_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_clusterAddGroupToGroupSetWithDomains", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_clusterAddGroupToGroupSetWithDomains_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_clusterAddGroupToGroupSetWithDomainsEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_clusterAddGroupToGroupSetWithDomainsEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_clusterAffinityRuleControl", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_clusterAffinityRuleControl_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_clusterClearBackupStateForSharedVolume", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_clusterClearBackupStateForSharedVolume_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_clusterCloseEnum", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_clusterCloseEnum_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_clusterCloseEnumEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_clusterCloseEnumEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_clusterControl", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_clusterControl_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_clusterControlEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_clusterControlEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_clusterCreateAffinityRule", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_clusterCreateAffinityRule_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_clusterDecrypt", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_clusterDecrypt_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_clusterEncrypt", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_clusterEncrypt_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_clusterEnum", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_clusterEnum_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_clusterEnumEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_clusterEnumEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_clusterGetEnumCount", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_clusterGetEnumCount_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_clusterGetEnumCountEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_clusterGetEnumCountEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_clusterGetVolumeNameForVolumeMountPoint", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_clusterGetVolumeNameForVolumeMountPoint_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_clusterGetVolumePathName", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_clusterGetVolumePathName_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_clusterGroupCloseEnum", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_clusterGroupCloseEnum_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_clusterGroupCloseEnumEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_clusterGroupCloseEnumEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_clusterGroupControl", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_clusterGroupControl_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_clusterGroupControlEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_clusterGroupControlEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_clusterGroupEnum", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_clusterGroupEnum_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_clusterGroupEnumEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_clusterGroupEnumEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_clusterGroupGetEnumCount", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_clusterGroupGetEnumCount_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_clusterGroupGetEnumCountEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_clusterGroupGetEnumCountEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_clusterGroupOpenEnum", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_clusterGroupOpenEnum_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_clusterGroupOpenEnumEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_clusterGroupOpenEnumEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_clusterGroupSetCloseEnum", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_clusterGroupSetCloseEnum_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_clusterGroupSetControl", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_clusterGroupSetControl_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_clusterGroupSetControlEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_clusterGroupSetControlEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_clusterGroupSetEnum", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_clusterGroupSetEnum_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_clusterGroupSetGetEnumCount", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_clusterGroupSetGetEnumCount_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_clusterGroupSetOpenEnum", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_clusterGroupSetOpenEnum_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_clusterIsPathOnSharedVolume", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_clusterIsPathOnSharedVolume_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_clusterNetInterfaceCloseEnum", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_clusterNetInterfaceCloseEnum_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_clusterNetInterfaceControl", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_clusterNetInterfaceControl_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_clusterNetInterfaceControlEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_clusterNetInterfaceControlEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_clusterNetInterfaceEnum", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_clusterNetInterfaceEnum_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_clusterNetInterfaceOpenEnum", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_clusterNetInterfaceOpenEnum_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_clusterNetworkCloseEnum", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_clusterNetworkCloseEnum_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_clusterNetworkControl", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_clusterNetworkControl_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_clusterNetworkControlEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_clusterNetworkControlEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_clusterNetworkEnum", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_clusterNetworkEnum_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_clusterNetworkGetEnumCount", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_clusterNetworkGetEnumCount_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_clusterNetworkOpenEnum", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_clusterNetworkOpenEnum_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_clusterNodeCloseEnum", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_clusterNodeCloseEnum_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_clusterNodeCloseEnumEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_clusterNodeCloseEnumEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_clusterNodeControl", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_clusterNodeControl_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_clusterNodeControlEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_clusterNodeControlEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_clusterNodeEnum", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_clusterNodeEnum_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_clusterNodeEnumEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_clusterNodeEnumEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_clusterNodeGetEnumCount", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_clusterNodeGetEnumCount_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_clusterNodeGetEnumCountEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_clusterNodeGetEnumCountEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_clusterNodeOpenEnum", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_clusterNodeOpenEnum_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_clusterNodeOpenEnumEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_clusterNodeOpenEnumEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_clusterNodeReplacement", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_clusterNodeReplacement_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_clusterOpenEnum", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_clusterOpenEnum_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_clusterOpenEnumEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_clusterOpenEnumEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_clusterPrepareSharedVolumeForBackup", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_clusterPrepareSharedVolumeForBackup_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_clusterRegBatchAddCommand", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_clusterRegBatchAddCommand_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_clusterRegBatchCloseNotification", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_clusterRegBatchCloseNotification_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_clusterRegBatchReadCommand", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_clusterRegBatchReadCommand_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_clusterRegCloseBatch", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_clusterRegCloseBatch_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_clusterRegCloseBatchEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_clusterRegCloseBatchEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_clusterRegCloseBatchNotifyPort", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_clusterRegCloseBatchNotifyPort_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_clusterRegCloseKey", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_clusterRegCloseKey_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_clusterRegCloseReadBatch", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_clusterRegCloseReadBatch_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_clusterRegCloseReadBatchEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_clusterRegCloseReadBatchEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_clusterRegCloseReadBatchReply", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_clusterRegCloseReadBatchReply_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_clusterRegCreateBatch", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_clusterRegCreateBatch_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_clusterRegCreateBatchNotifyPort", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_clusterRegCreateBatchNotifyPort_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_clusterRegCreateKey", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_clusterRegCreateKey_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_clusterRegCreateKeyEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_clusterRegCreateKeyEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_clusterRegCreateReadBatch", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_clusterRegCreateReadBatch_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_clusterRegDeleteKey", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_clusterRegDeleteKey_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_clusterRegDeleteKeyEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_clusterRegDeleteKeyEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_clusterRegDeleteValue", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_clusterRegDeleteValue_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_clusterRegDeleteValueEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_clusterRegDeleteValueEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_clusterRegEnumKey", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_clusterRegEnumKey_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_clusterRegEnumValue", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_clusterRegEnumValue_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_clusterRegGetBatchNotification", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_clusterRegGetBatchNotification_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_clusterRegGetKeySecurity", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_clusterRegGetKeySecurity_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_clusterRegOpenKey", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_clusterRegOpenKey_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_clusterRegQueryInfoKey", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_clusterRegQueryInfoKey_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_clusterRegQueryValue", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_clusterRegQueryValue_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_clusterRegReadBatchAddCommand", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_clusterRegReadBatchAddCommand_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_clusterRegReadBatchReplyNextCommand", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_clusterRegReadBatchReplyNextCommand_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_clusterRegSetKeySecurity", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_clusterRegSetKeySecurity_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_clusterRegSetKeySecurityEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_clusterRegSetKeySecurityEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_clusterRegSetValue", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_clusterRegSetValue_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_clusterRegSetValueEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_clusterRegSetValueEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_clusterRegSyncDatabase", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_clusterRegSyncDatabase_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_clusterRemoveAffinityRule", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_clusterRemoveAffinityRule_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_clusterRemoveGroupFromAffinityRule", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_clusterRemoveGroupFromAffinityRule_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_clusterRemoveGroupFromGroupSet", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_clusterRemoveGroupFromGroupSet_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_clusterRemoveGroupFromGroupSetEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_clusterRemoveGroupFromGroupSetEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_clusterResourceCloseEnum", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_clusterResourceCloseEnum_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_clusterResourceCloseEnumEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_clusterResourceCloseEnumEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_clusterResourceControl", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_clusterResourceControl_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_clusterResourceControlAsUser", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_clusterResourceControlAsUser_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_clusterResourceControlAsUserEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_clusterResourceControlAsUserEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_clusterResourceControlEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_clusterResourceControlEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_clusterResourceEnum", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_clusterResourceEnum_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_clusterResourceEnumEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_clusterResourceEnumEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_clusterResourceGetEnumCount", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_clusterResourceGetEnumCount_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_clusterResourceGetEnumCountEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_clusterResourceGetEnumCountEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_clusterResourceOpenEnum", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_clusterResourceOpenEnum_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_clusterResourceOpenEnumEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_clusterResourceOpenEnumEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_clusterResourceTypeCloseEnum", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_clusterResourceTypeCloseEnum_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_clusterResourceTypeControl", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_clusterResourceTypeControl_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_clusterResourceTypeControlAsUser", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_clusterResourceTypeControlAsUser_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_clusterResourceTypeControlAsUserEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_clusterResourceTypeControlAsUserEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_clusterResourceTypeControlEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_clusterResourceTypeControlEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_clusterResourceTypeEnum", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_clusterResourceTypeEnum_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_clusterResourceTypeGetEnumCount", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_clusterResourceTypeGetEnumCount_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_clusterResourceTypeOpenEnum", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_clusterResourceTypeOpenEnum_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_clusterSetAccountAccess", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_clusterSetAccountAccess_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_clusterUpgradeFunctionalLevel", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_clusterUpgradeFunctionalLevel_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_createCluster", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_createCluster_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_createClusterAvailabilitySet", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_createClusterAvailabilitySet_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_createClusterGroup", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_createClusterGroup_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_createClusterGroupEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_createClusterGroupEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_createClusterGroupSet", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_createClusterGroupSet_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_createClusterNameAccount", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_createClusterNameAccount_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_createClusterNotifyPort", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_createClusterNotifyPort_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_createClusterNotifyPortV2", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_createClusterNotifyPortV2_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_createClusterResource", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_createClusterResource_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_createClusterResourceEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_createClusterResourceEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_createClusterResourceType", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_createClusterResourceType_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_createClusterResourceTypeEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_createClusterResourceTypeEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_deleteClusterGroup", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_deleteClusterGroup_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_deleteClusterGroupEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_deleteClusterGroupEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_deleteClusterGroupSet", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_deleteClusterGroupSet_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_deleteClusterGroupSetEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_deleteClusterGroupSetEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_deleteClusterResource", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_deleteClusterResource_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_deleteClusterResourceEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_deleteClusterResourceEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_deleteClusterResourceType", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_deleteClusterResourceType_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_deleteClusterResourceTypeEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_deleteClusterResourceTypeEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_destroyCluster", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_destroyCluster_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_destroyClusterGroup", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_destroyClusterGroup_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_destroyClusterGroupEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_destroyClusterGroupEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_determineCNOResTypeFromCluster", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_determineCNOResTypeFromCluster_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_determineCNOResTypeFromNodelist", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_determineCNOResTypeFromNodelist_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_determineClusterCloudTypeFromCluster", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_determineClusterCloudTypeFromCluster_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_determineClusterCloudTypeFromNodelist", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_determineClusterCloudTypeFromNodelist_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_evictClusterNode", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_evictClusterNode_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_evictClusterNodeEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_evictClusterNodeEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_evictClusterNodeEx2", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_evictClusterNodeEx2_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_failClusterResource", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_failClusterResource_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_failClusterResourceEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_failClusterResourceEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_freeClusterCrypt", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_freeClusterCrypt_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_freeClusterHealthFault", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_freeClusterHealthFault_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_freeClusterHealthFaultArray", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_freeClusterHealthFaultArray_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_getClusterFromGroup", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_getClusterFromGroup_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_getClusterFromNetInterface", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_getClusterFromNetInterface_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_getClusterFromNetwork", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_getClusterFromNetwork_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_getClusterFromNode", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_getClusterFromNode_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_getClusterFromResource", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_getClusterFromResource_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_getClusterGroupKey", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_getClusterGroupKey_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_getClusterGroupState", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_getClusterGroupState_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_getClusterInformation", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_getClusterInformation_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_getClusterKey", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_getClusterKey_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_getClusterNetInterface", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_getClusterNetInterface_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_getClusterNetInterfaceKey", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_getClusterNetInterfaceKey_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_getClusterNetInterfaceState", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_getClusterNetInterfaceState_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_getClusterNetworkId", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_getClusterNetworkId_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_getClusterNetworkKey", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_getClusterNetworkKey_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_getClusterNetworkState", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_getClusterNetworkState_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_getClusterNodeId", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_getClusterNodeId_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_getClusterNodeKey", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_getClusterNodeKey_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_getClusterNodeState", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_getClusterNodeState_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_getClusterNotify", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_getClusterNotify_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_getClusterNotifyV2", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_getClusterNotifyV2_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_getClusterQuorumResource", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_getClusterQuorumResource_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_getClusterResourceDependencyExpression", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_getClusterResourceDependencyExpression_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_getClusterResourceKey", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_getClusterResourceKey_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_getClusterResourceNetworkName", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_getClusterResourceNetworkName_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_getClusterResourceState", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_getClusterResourceState_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_getClusterResourceTypeKey", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_getClusterResourceTypeKey_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_getNodeCloudTypeDW", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_getNodeCloudTypeDW_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_getNodeClusterState", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_getNodeClusterState_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_getNotifyEventHandle", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_getNotifyEventHandle_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_initializeClusterHealthFault", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_initializeClusterHealthFault_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_initializeClusterHealthFaultArray", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_initializeClusterHealthFaultArray_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_isFileOnClusterSharedVolume", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_isFileOnClusterSharedVolume_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_moveClusterGroup", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_moveClusterGroup_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_moveClusterGroupEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_moveClusterGroupEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_moveClusterGroupEx2", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_moveClusterGroupEx2_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_offlineClusterGroup", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_offlineClusterGroup_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_offlineClusterGroupEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_offlineClusterGroupEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_offlineClusterGroupEx2", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_offlineClusterGroupEx2_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_offlineClusterResource", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_offlineClusterResource_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_offlineClusterResourceEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_offlineClusterResourceEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_offlineClusterResourceEx2", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_offlineClusterResourceEx2_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_onlineClusterGroup", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_onlineClusterGroup_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_onlineClusterGroupEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_onlineClusterGroupEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_onlineClusterGroupEx2", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_onlineClusterGroupEx2_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_onlineClusterResource", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_onlineClusterResource_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_onlineClusterResourceEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_onlineClusterResourceEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_onlineClusterResourceEx2", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_onlineClusterResourceEx2_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_openCluster", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_openCluster_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_openClusterCryptProvider", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_openClusterCryptProvider_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_openClusterCryptProviderEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_openClusterCryptProviderEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_openClusterEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_openClusterEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_openClusterGroup", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_openClusterGroup_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_openClusterGroupEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_openClusterGroupEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_openClusterGroupSet", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_openClusterGroupSet_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_openClusterNetInterface", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_openClusterNetInterface_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_openClusterNetInterfaceEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_openClusterNetInterfaceEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_openClusterNetwork", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_openClusterNetwork_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_openClusterNetworkEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_openClusterNetworkEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_openClusterNode", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_openClusterNode_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_openClusterNodeById", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_openClusterNodeById_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_openClusterNodeEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_openClusterNodeEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_openClusterResource", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_openClusterResource_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_openClusterResourceEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_openClusterResourceEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_pauseClusterNode", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_pauseClusterNode_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_pauseClusterNodeEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_pauseClusterNodeEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_pauseClusterNodeEx2", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_pauseClusterNodeEx2_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_queryAppInstanceVersion", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_queryAppInstanceVersion_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_registerAppInstance", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_registerAppInstance_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_registerAppInstanceVersion", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_registerAppInstanceVersion_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_registerClusterNotify", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_registerClusterNotify_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_registerClusterResourceTypeNotifyV2", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_registerClusterResourceTypeNotifyV2_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_removeClusterGroupDependency", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_removeClusterGroupDependency_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_removeClusterGroupDependencyEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_removeClusterGroupDependencyEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_removeClusterGroupSetDependency", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_removeClusterGroupSetDependency_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_removeClusterGroupSetDependencyEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_removeClusterGroupSetDependencyEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_removeClusterGroupToGroupSetDependency", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_removeClusterGroupToGroupSetDependency_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_removeClusterGroupToGroupSetDependencyEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_removeClusterGroupToGroupSetDependencyEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_removeClusterNameAccount", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_removeClusterNameAccount_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_removeClusterResourceDependency", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_removeClusterResourceDependency_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_removeClusterResourceDependencyEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_removeClusterResourceDependencyEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_removeClusterResourceNode", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_removeClusterResourceNode_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_removeClusterResourceNodeEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_removeClusterResourceNodeEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_removeClusterStorageNode", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_removeClusterStorageNode_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_removeCrossClusterGroupSetDependency", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_removeCrossClusterGroupSetDependency_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_removeResourceFromClusterSharedVolumes", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_removeResourceFromClusterSharedVolumes_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_resUtilAddUnknownProperties", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_resUtilAddUnknownProperties_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_resUtilCreateDirectoryTree", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_resUtilCreateDirectoryTree_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_resUtilDupGroup", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_resUtilDupGroup_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_resUtilDupParameterBlock", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_resUtilDupParameterBlock_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_resUtilDupResource", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_resUtilDupResource_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_resUtilDupString", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_resUtilDupString_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_resUtilEnumGroups", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_resUtilEnumGroups_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_resUtilEnumGroupsEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_resUtilEnumGroupsEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_resUtilEnumPrivateProperties", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_resUtilEnumPrivateProperties_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_resUtilEnumProperties", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_resUtilEnumProperties_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_resUtilEnumResources", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_resUtilEnumResources_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_resUtilEnumResourcesEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_resUtilEnumResourcesEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_resUtilEnumResourcesEx2", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_resUtilEnumResourcesEx2_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_resUtilExpandEnvironmentStrings", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_resUtilExpandEnvironmentStrings_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_resUtilFindBinaryProperty", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_resUtilFindBinaryProperty_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_resUtilFindDependentDiskResourceDriveLetter", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_resUtilFindDependentDiskResourceDriveLetter_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_resUtilFindDwordProperty", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_resUtilFindDwordProperty_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_resUtilFindExpandSzProperty", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_resUtilFindExpandSzProperty_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_resUtilFindExpandedSzProperty", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_resUtilFindExpandedSzProperty_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_resUtilFindFileTimeProperty", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_resUtilFindFileTimeProperty_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_resUtilFindLongProperty", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_resUtilFindLongProperty_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_resUtilFindMultiSzProperty", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_resUtilFindMultiSzProperty_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_resUtilFindSzProperty", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_resUtilFindSzProperty_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_resUtilFindULargeIntegerProperty", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_resUtilFindULargeIntegerProperty_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_resUtilFreeEnvironment", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_resUtilFreeEnvironment_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_resUtilFreeParameterBlock", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_resUtilFreeParameterBlock_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_resUtilGetAllProperties", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_resUtilGetAllProperties_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_resUtilGetBinaryProperty", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_resUtilGetBinaryProperty_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_resUtilGetBinaryValue", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_resUtilGetBinaryValue_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_resUtilGetClusterGroupType", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_resUtilGetClusterGroupType_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_resUtilGetClusterId", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_resUtilGetClusterId_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_resUtilGetClusterRoleState", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_resUtilGetClusterRoleState_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_resUtilGetCoreClusterResources", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_resUtilGetCoreClusterResources_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_resUtilGetCoreClusterResourcesEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_resUtilGetCoreClusterResourcesEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_resUtilGetCoreGroup", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_resUtilGetCoreGroup_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_resUtilGetDwordProperty", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_resUtilGetDwordProperty_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_resUtilGetDwordValue", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_resUtilGetDwordValue_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_resUtilGetEnvironmentWithNetName", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_resUtilGetEnvironmentWithNetName_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_resUtilGetLongProperty", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_resUtilGetLongProperty_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_resUtilGetMultiSzProperty", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_resUtilGetMultiSzProperty_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_resUtilGetPrivateProperties", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_resUtilGetPrivateProperties_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_resUtilGetProperties", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_resUtilGetProperties_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_resUtilGetPropertiesToParameterBlock", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_resUtilGetPropertiesToParameterBlock_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_resUtilGetProperty", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_resUtilGetProperty_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_resUtilGetPropertyFormats", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_resUtilGetPropertyFormats_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_resUtilGetPropertySize", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_resUtilGetPropertySize_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_resUtilGetQwordValue", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_resUtilGetQwordValue_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_resUtilGetResourceDependency", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_resUtilGetResourceDependency_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_resUtilGetResourceDependencyByClass", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_resUtilGetResourceDependencyByClass_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_resUtilGetResourceDependencyByClassEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_resUtilGetResourceDependencyByClassEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_resUtilGetResourceDependencyByName", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_resUtilGetResourceDependencyByName_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_resUtilGetResourceDependencyByNameEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_resUtilGetResourceDependencyByNameEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_resUtilGetResourceDependencyEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_resUtilGetResourceDependencyEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_resUtilGetResourceDependentIPAddressProps", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_resUtilGetResourceDependentIPAddressProps_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_resUtilGetResourceName", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_resUtilGetResourceName_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_resUtilGetResourceNameDependency", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_resUtilGetResourceNameDependency_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_resUtilGetResourceNameDependencyEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_resUtilGetResourceNameDependencyEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_resUtilGetSzProperty", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_resUtilGetSzProperty_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_resUtilGetSzValue", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_resUtilGetSzValue_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_resUtilGroupsEqual", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_resUtilGroupsEqual_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_resUtilIsPathValid", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_resUtilIsPathValid_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_resUtilIsResourceClassEqual", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_resUtilIsResourceClassEqual_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_resUtilLeftPaxosIsLessThanRight", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_resUtilLeftPaxosIsLessThanRight_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_resUtilNodeEnum", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_resUtilNodeEnum_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_resUtilPaxosComparer", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_resUtilPaxosComparer_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_resUtilPropertyListFromParameterBlock", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_resUtilPropertyListFromParameterBlock_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_resUtilRemoveResourceServiceEnvironment", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_resUtilRemoveResourceServiceEnvironment_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_resUtilResourceDepEnum", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_resUtilResourceDepEnum_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_resUtilResourceTypesEqual", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_resUtilResourceTypesEqual_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_resUtilResourcesEqual", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_resUtilResourcesEqual_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_resUtilSetBinaryValue", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_resUtilSetBinaryValue_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_resUtilSetDwordValue", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_resUtilSetDwordValue_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_resUtilSetExpandSzValue", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_resUtilSetExpandSzValue_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_resUtilSetMultiSzValue", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_resUtilSetMultiSzValue_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_resUtilSetPrivatePropertyList", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_resUtilSetPrivatePropertyList_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_resUtilSetPropertyParameterBlock", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_resUtilSetPropertyParameterBlock_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_resUtilSetPropertyParameterBlockEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_resUtilSetPropertyParameterBlockEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_resUtilSetPropertyTable", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_resUtilSetPropertyTable_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_resUtilSetPropertyTableEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_resUtilSetPropertyTableEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_resUtilSetQwordValue", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_resUtilSetQwordValue_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_resUtilSetResourceServiceEnvironment", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_resUtilSetResourceServiceEnvironment_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_resUtilSetResourceServiceStartParameters", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_resUtilSetResourceServiceStartParameters_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_resUtilSetResourceServiceStartParametersEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_resUtilSetResourceServiceStartParametersEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_resUtilSetSzValue", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_resUtilSetSzValue_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_resUtilSetUnknownProperties", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_resUtilSetUnknownProperties_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_resUtilSetValueEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_resUtilSetValueEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_resUtilStartResourceService", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_resUtilStartResourceService_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_resUtilStopResourceService", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_resUtilStopResourceService_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_resUtilStopService", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_resUtilStopService_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_resUtilTerminateServiceProcessFromResDll", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_resUtilTerminateServiceProcessFromResDll_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_resUtilVerifyPrivatePropertyList", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_resUtilVerifyPrivatePropertyList_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_resUtilVerifyPropertyTable", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_resUtilVerifyPropertyTable_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_resUtilVerifyResourceService", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_resUtilVerifyResourceService_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_resUtilVerifyService", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_resUtilVerifyService_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_resUtilVerifyShutdownSafe", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_resUtilVerifyShutdownSafe_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_resUtilsDeleteKeyTree", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_resUtilsDeleteKeyTree_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_resetAllAppInstanceVersions", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_resetAllAppInstanceVersions_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_restartClusterResource", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_restartClusterResource_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_restartClusterResourceEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_restartClusterResourceEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_restoreClusterDatabase", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_restoreClusterDatabase_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_resumeClusterNode", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_resumeClusterNode_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_resumeClusterNodeEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_resumeClusterNodeEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_resumeClusterNodeEx2", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_resumeClusterNodeEx2_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_setAppInstanceCsvFlags", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_setAppInstanceCsvFlags_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_setClusterGroupName", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_setClusterGroupName_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_setClusterGroupNameEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_setClusterGroupNameEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_setClusterGroupNodeList", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_setClusterGroupNodeList_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_setClusterGroupNodeListEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_setClusterGroupNodeListEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_setClusterGroupSetDependencyExpression", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_setClusterGroupSetDependencyExpression_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_setClusterGroupSetDependencyExpressionEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_setClusterGroupSetDependencyExpressionEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_setClusterName", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_setClusterName_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_setClusterNameEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_setClusterNameEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_setClusterNetworkName", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_setClusterNetworkName_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_setClusterNetworkNameEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_setClusterNetworkNameEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_setClusterNetworkPriorityOrder", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_setClusterNetworkPriorityOrder_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_setClusterQuorumResource", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_setClusterQuorumResource_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_setClusterQuorumResourceEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_setClusterQuorumResourceEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_setClusterResourceDependencyExpression", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_setClusterResourceDependencyExpression_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_setClusterResourceName", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_setClusterResourceName_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_setClusterResourceNameEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_setClusterResourceNameEx_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_setClusterServiceAccountPassword", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_setClusterServiceAccountPassword_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_setGroupDependencyExpression", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_setGroupDependencyExpression_napi));
    exports.Set("windowssys_windows_win32_networking_clustering_setGroupDependencyExpressionEx", Napi::Function::New(env, windowssys_windows_win32_networking_clustering_setGroupDependencyExpressionEx_napi));
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
