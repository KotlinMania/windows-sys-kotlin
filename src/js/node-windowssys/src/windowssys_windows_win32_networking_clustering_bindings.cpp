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

static Napi::Value windowssysWindowsWin32NetworkingClusteringAddClusterGroupDependency_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringAddClusterGroupDependencyEx_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringAddClusterGroupSetDependency_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringAddClusterGroupSetDependencyEx_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringAddClusterGroupToGroupSetDependency_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringAddClusterGroupToGroupSetDependencyEx_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringAddClusterNode_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringAddClusterNodeEx_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringAddClusterResourceDependency_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringAddClusterResourceDependencyEx_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringAddClusterResourceNode_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringAddClusterResourceNodeEx_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringAddClusterStorageNode_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringAddCrossClusterGroupSetDependency_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringAddResourceToClusterSharedVolumes_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringBackupClusterDatabase_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringCanResourceBeDependent_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringCancelClusterGroupOperation_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hgroup = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint32_t dwcancelflagsReserved = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CancelClusterGroupOperation")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hgroup, dwcancelflagsReserved);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hgroup;
    (void)dwcancelflagsReserved;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkingClusteringChangeClusterResourceGroup_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringChangeClusterResourceGroupEx_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringChangeClusterResourceGroupEx2_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringCloseCluster_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringCloseClusterCryptProvider_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringCloseClusterGroup_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringCloseClusterGroupSet_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringCloseClusterNetInterface_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringCloseClusterNetwork_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringCloseClusterNode_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringCloseClusterNotifyPort_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringCloseClusterResource_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringClusAddClusterHealthFault_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringClusGetClusterHealthFaults_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringClusRemoveClusterHealthFault_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringClusWorkerCheckTerminate_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringClusWorkerCreate_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringClusWorkerTerminate_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringClusWorkerTerminateEx_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringClusWorkersTerminate_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringClusapiSetReasonHandler_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringClusterAddGroupToAffinityRule_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringClusterAddGroupToGroupSet_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringClusterAddGroupToGroupSetWithDomains_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringClusterAddGroupToGroupSetWithDomainsEx_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringClusterAffinityRuleControl_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringClusterClearBackupStateForSharedVolume_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringClusterCloseEnum_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringClusterCloseEnumEx_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringClusterControl_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringClusterControlEx_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringClusterCreateAffinityRule_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringClusterDecrypt_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringClusterEncrypt_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringClusterEnum_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringClusterEnumEx_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringClusterGetEnumCount_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringClusterGetEnumCountEx_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringClusterGetVolumeNameForVolumeMountPoint_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringClusterGetVolumePathName_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringClusterGroupCloseEnum_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringClusterGroupCloseEnumEx_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringClusterGroupControl_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringClusterGroupControlEx_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringClusterGroupEnum_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringClusterGroupEnumEx_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringClusterGroupGetEnumCount_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringClusterGroupGetEnumCountEx_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringClusterGroupOpenEnum_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringClusterGroupOpenEnumEx_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringClusterGroupSetCloseEnum_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringClusterGroupSetControl_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringClusterGroupSetControlEx_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringClusterGroupSetEnum_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringClusterGroupSetGetEnumCount_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringClusterGroupSetOpenEnum_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringClusterIsPathOnSharedVolume_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringClusterNetInterfaceCloseEnum_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringClusterNetInterfaceControl_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringClusterNetInterfaceControlEx_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringClusterNetInterfaceEnum_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringClusterNetInterfaceOpenEnum_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringClusterNetworkCloseEnum_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringClusterNetworkControl_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringClusterNetworkControlEx_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringClusterNetworkEnum_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringClusterNetworkGetEnumCount_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringClusterNetworkOpenEnum_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringClusterNodeCloseEnum_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringClusterNodeCloseEnumEx_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringClusterNodeControl_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringClusterNodeControlEx_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringClusterNodeEnum_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringClusterNodeEnumEx_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringClusterNodeGetEnumCount_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringClusterNodeGetEnumCountEx_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringClusterNodeOpenEnum_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringClusterNodeOpenEnumEx_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringClusterNodeReplacement_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringClusterOpenEnum_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringClusterOpenEnumEx_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringClusterPrepareSharedVolumeForBackup_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringClusterRegBatchAddCommand_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringClusterRegBatchCloseNotification_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringClusterRegBatchReadCommand_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringClusterRegCloseBatch_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringClusterRegCloseBatchEx_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringClusterRegCloseBatchNotifyPort_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringClusterRegCloseKey_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringClusterRegCloseReadBatch_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringClusterRegCloseReadBatchEx_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringClusterRegCloseReadBatchReply_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringClusterRegCreateBatch_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringClusterRegCreateBatchNotifyPort_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringClusterRegCreateKey_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringClusterRegCreateKeyEx_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringClusterRegCreateReadBatch_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringClusterRegDeleteKey_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringClusterRegDeleteKeyEx_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringClusterRegDeleteValue_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringClusterRegDeleteValueEx_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringClusterRegEnumKey_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringClusterRegEnumValue_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringClusterRegGetBatchNotification_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringClusterRegGetKeySecurity_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringClusterRegOpenKey_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringClusterRegQueryInfoKey_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringClusterRegQueryValue_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringClusterRegReadBatchAddCommand_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringClusterRegReadBatchReplyNextCommand_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringClusterRegSetKeySecurity_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringClusterRegSetKeySecurityEx_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringClusterRegSetValue_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringClusterRegSetValueEx_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringClusterRegSyncDatabase_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringClusterRemoveAffinityRule_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringClusterRemoveGroupFromAffinityRule_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringClusterRemoveGroupFromGroupSet_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringClusterRemoveGroupFromGroupSetEx_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringClusterResourceCloseEnum_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringClusterResourceCloseEnumEx_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringClusterResourceControl_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringClusterResourceControlAsUser_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringClusterResourceControlAsUserEx_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringClusterResourceControlEx_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringClusterResourceEnum_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringClusterResourceEnumEx_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringClusterResourceGetEnumCount_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringClusterResourceGetEnumCountEx_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringClusterResourceOpenEnum_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringClusterResourceOpenEnumEx_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringClusterResourceTypeCloseEnum_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringClusterResourceTypeControl_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringClusterResourceTypeControlAsUser_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringClusterResourceTypeControlAsUserEx_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringClusterResourceTypeControlEx_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringClusterResourceTypeEnum_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringClusterResourceTypeGetEnumCount_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringClusterResourceTypeOpenEnum_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringClusterSetAccountAccess_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringClusterUpgradeFunctionalLevel_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringCreateCluster_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringCreateClusterAvailabilitySet_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringCreateClusterGroup_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringCreateClusterGroupEx_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringCreateClusterGroupSet_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringCreateClusterNameAccount_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringCreateClusterNotifyPort_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringCreateClusterNotifyPortV2_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringCreateClusterResource_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringCreateClusterResourceEx_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringCreateClusterResourceType_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringCreateClusterResourceTypeEx_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringDeleteClusterGroup_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringDeleteClusterGroupEx_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringDeleteClusterGroupSet_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringDeleteClusterGroupSetEx_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringDeleteClusterResource_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringDeleteClusterResourceEx_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringDeleteClusterResourceType_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringDeleteClusterResourceTypeEx_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringDestroyCluster_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringDestroyClusterGroup_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringDestroyClusterGroupEx_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringDetermineCNOResTypeFromCluster_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringDetermineCNOResTypeFromNodelist_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringDetermineClusterCloudTypeFromCluster_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringDetermineClusterCloudTypeFromNodelist_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringEvictClusterNode_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringEvictClusterNodeEx_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringEvictClusterNodeEx2_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringFailClusterResource_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringFailClusterResourceEx_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringFreeClusterCrypt_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringFreeClusterHealthFault_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringFreeClusterHealthFaultArray_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringGetClusterFromGroup_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringGetClusterFromNetInterface_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringGetClusterFromNetwork_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringGetClusterFromNode_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringGetClusterFromResource_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringGetClusterGroupKey_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringGetClusterGroupState_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringGetClusterInformation_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringGetClusterKey_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringGetClusterNetInterface_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringGetClusterNetInterfaceKey_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringGetClusterNetInterfaceState_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringGetClusterNetworkId_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringGetClusterNetworkKey_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringGetClusterNetworkState_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringGetClusterNodeId_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringGetClusterNodeKey_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringGetClusterNodeState_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringGetClusterNotify_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringGetClusterNotifyV2_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringGetClusterQuorumResource_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringGetClusterResourceDependencyExpression_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringGetClusterResourceKey_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringGetClusterResourceNetworkName_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringGetClusterResourceState_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringGetClusterResourceTypeKey_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringGetNodeCloudTypeDW_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringGetNodeClusterState_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringGetNotifyEventHandle_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringInitializeClusterHealthFault_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringInitializeClusterHealthFaultArray_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringIsFileOnClusterSharedVolume_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringMoveClusterGroup_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringMoveClusterGroupEx_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringMoveClusterGroupEx2_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringOfflineClusterGroup_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringOfflineClusterGroupEx_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringOfflineClusterGroupEx2_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringOfflineClusterResource_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringOfflineClusterResourceEx_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringOfflineClusterResourceEx2_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringOnlineClusterGroup_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringOnlineClusterGroupEx_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringOnlineClusterGroupEx2_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringOnlineClusterResource_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringOnlineClusterResourceEx_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringOnlineClusterResourceEx2_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringOpenCluster_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringOpenClusterCryptProvider_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringOpenClusterCryptProviderEx_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringOpenClusterEx_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringOpenClusterGroup_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringOpenClusterGroupEx_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringOpenClusterGroupSet_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringOpenClusterNetInterface_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringOpenClusterNetInterfaceEx_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringOpenClusterNetwork_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringOpenClusterNetworkEx_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringOpenClusterNode_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringOpenClusterNodeById_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringOpenClusterNodeEx_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringOpenClusterResource_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringOpenClusterResourceEx_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringPauseClusterNode_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringPauseClusterNodeEx_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringPauseClusterNodeEx2_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringQueryAppInstanceVersion_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringRegisterAppInstance_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringRegisterAppInstanceVersion_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringRegisterClusterNotify_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringRegisterClusterResourceTypeNotifyV2_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringRemoveClusterGroupDependency_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringRemoveClusterGroupDependencyEx_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringRemoveClusterGroupSetDependency_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringRemoveClusterGroupSetDependencyEx_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringRemoveClusterGroupToGroupSetDependency_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringRemoveClusterGroupToGroupSetDependencyEx_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringRemoveClusterNameAccount_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringRemoveClusterResourceDependency_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringRemoveClusterResourceDependencyEx_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringRemoveClusterResourceNode_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringRemoveClusterResourceNodeEx_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringRemoveClusterStorageNode_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringRemoveCrossClusterGroupSetDependency_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringRemoveResourceFromClusterSharedVolumes_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringResUtilAddUnknownProperties_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringResUtilCreateDirectoryTree_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringResUtilDupGroup_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringResUtilDupParameterBlock_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringResUtilDupResource_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringResUtilDupString_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringResUtilEnumGroups_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringResUtilEnumGroupsEx_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringResUtilEnumPrivateProperties_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringResUtilEnumProperties_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringResUtilEnumResources_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringResUtilEnumResourcesEx_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringResUtilEnumResourcesEx2_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringResUtilExpandEnvironmentStrings_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringResUtilFindBinaryProperty_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringResUtilFindDependentDiskResourceDriveLetter_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringResUtilFindDwordProperty_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringResUtilFindExpandSzProperty_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringResUtilFindExpandedSzProperty_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringResUtilFindFileTimeProperty_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringResUtilFindLongProperty_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringResUtilFindMultiSzProperty_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringResUtilFindSzProperty_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringResUtilFindULargeIntegerProperty_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringResUtilFreeEnvironment_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringResUtilFreeParameterBlock_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringResUtilGetAllProperties_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringResUtilGetBinaryProperty_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringResUtilGetBinaryValue_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringResUtilGetClusterGroupType_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringResUtilGetClusterId_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringResUtilGetClusterRoleState_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringResUtilGetCoreClusterResources_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringResUtilGetCoreClusterResourcesEx_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringResUtilGetCoreGroup_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringResUtilGetDwordProperty_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringResUtilGetDwordValue_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringResUtilGetEnvironmentWithNetName_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringResUtilGetLongProperty_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringResUtilGetMultiSzProperty_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringResUtilGetPrivateProperties_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringResUtilGetProperties_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringResUtilGetPropertiesToParameterBlock_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringResUtilGetProperty_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringResUtilGetPropertyFormats_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringResUtilGetPropertySize_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringResUtilGetQwordValue_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringResUtilGetResourceDependency_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringResUtilGetResourceDependencyByClass_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringResUtilGetResourceDependencyByClassEx_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringResUtilGetResourceDependencyByName_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringResUtilGetResourceDependencyByNameEx_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringResUtilGetResourceDependencyEx_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringResUtilGetResourceDependentIPAddressProps_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringResUtilGetResourceName_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringResUtilGetResourceNameDependency_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringResUtilGetResourceNameDependencyEx_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringResUtilGetSzProperty_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringResUtilGetSzValue_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringResUtilGroupsEqual_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringResUtilIsPathValid_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringResUtilIsResourceClassEqual_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringResUtilLeftPaxosIsLessThanRight_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringResUtilNodeEnum_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringResUtilPaxosComparer_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringResUtilPropertyListFromParameterBlock_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringResUtilRemoveResourceServiceEnvironment_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringResUtilResourceDepEnum_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringResUtilResourceTypesEqual_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringResUtilResourcesEqual_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringResUtilSetBinaryValue_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringResUtilSetDwordValue_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringResUtilSetExpandSzValue_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringResUtilSetMultiSzValue_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringResUtilSetPrivatePropertyList_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringResUtilSetPropertyParameterBlock_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringResUtilSetPropertyParameterBlockEx_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringResUtilSetPropertyTable_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringResUtilSetPropertyTableEx_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringResUtilSetQwordValue_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringResUtilSetResourceServiceEnvironment_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringResUtilSetResourceServiceStartParameters_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringResUtilSetResourceServiceStartParametersEx_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringResUtilSetSzValue_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringResUtilSetUnknownProperties_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringResUtilSetValueEx_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringResUtilStartResourceService_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringResUtilStopResourceService_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringResUtilStopService_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringResUtilTerminateServiceProcessFromResDll_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringResUtilVerifyPrivatePropertyList_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringResUtilVerifyPropertyTable_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringResUtilVerifyResourceService_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringResUtilVerifyService_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringResUtilVerifyShutdownSafe_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringResUtilsDeleteKeyTree_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringResetAllAppInstanceVersions_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringRestartClusterResource_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringRestartClusterResourceEx_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringRestoreClusterDatabase_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringResumeClusterNode_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringResumeClusterNodeEx_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringResumeClusterNodeEx2_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringSetAppInstanceCsvFlags_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringSetClusterGroupName_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringSetClusterGroupNameEx_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringSetClusterGroupNodeList_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringSetClusterGroupNodeListEx_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringSetClusterGroupSetDependencyExpression_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringSetClusterGroupSetDependencyExpressionEx_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringSetClusterName_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringSetClusterNameEx_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringSetClusterNetworkName_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringSetClusterNetworkNameEx_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringSetClusterNetworkPriorityOrder_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringSetClusterQuorumResource_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringSetClusterQuorumResourceEx_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringSetClusterResourceDependencyExpression_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringSetClusterResourceName_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringSetClusterResourceNameEx_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringSetClusterServiceAccountPassword_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringSetGroupDependencyExpression_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32NetworkingClusteringSetGroupDependencyExpressionEx_napi(const Napi::CallbackInfo& km_info) {
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
    exports.Set("windowssysWindowsWin32NetworkingClusteringAddClusterGroupDependency", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringAddClusterGroupDependency_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringAddClusterGroupDependencyEx", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringAddClusterGroupDependencyEx_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringAddClusterGroupSetDependency", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringAddClusterGroupSetDependency_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringAddClusterGroupSetDependencyEx", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringAddClusterGroupSetDependencyEx_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringAddClusterGroupToGroupSetDependency", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringAddClusterGroupToGroupSetDependency_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringAddClusterGroupToGroupSetDependencyEx", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringAddClusterGroupToGroupSetDependencyEx_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringAddClusterNode", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringAddClusterNode_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringAddClusterNodeEx", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringAddClusterNodeEx_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringAddClusterResourceDependency", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringAddClusterResourceDependency_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringAddClusterResourceDependencyEx", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringAddClusterResourceDependencyEx_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringAddClusterResourceNode", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringAddClusterResourceNode_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringAddClusterResourceNodeEx", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringAddClusterResourceNodeEx_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringAddClusterStorageNode", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringAddClusterStorageNode_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringAddCrossClusterGroupSetDependency", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringAddCrossClusterGroupSetDependency_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringAddResourceToClusterSharedVolumes", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringAddResourceToClusterSharedVolumes_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringBackupClusterDatabase", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringBackupClusterDatabase_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringCanResourceBeDependent", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringCanResourceBeDependent_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringCancelClusterGroupOperation", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringCancelClusterGroupOperation_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringChangeClusterResourceGroup", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringChangeClusterResourceGroup_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringChangeClusterResourceGroupEx", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringChangeClusterResourceGroupEx_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringChangeClusterResourceGroupEx2", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringChangeClusterResourceGroupEx2_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringCloseCluster", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringCloseCluster_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringCloseClusterCryptProvider", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringCloseClusterCryptProvider_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringCloseClusterGroup", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringCloseClusterGroup_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringCloseClusterGroupSet", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringCloseClusterGroupSet_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringCloseClusterNetInterface", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringCloseClusterNetInterface_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringCloseClusterNetwork", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringCloseClusterNetwork_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringCloseClusterNode", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringCloseClusterNode_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringCloseClusterNotifyPort", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringCloseClusterNotifyPort_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringCloseClusterResource", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringCloseClusterResource_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringClusAddClusterHealthFault", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringClusAddClusterHealthFault_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringClusGetClusterHealthFaults", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringClusGetClusterHealthFaults_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringClusRemoveClusterHealthFault", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringClusRemoveClusterHealthFault_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringClusWorkerCheckTerminate", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringClusWorkerCheckTerminate_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringClusWorkerCreate", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringClusWorkerCreate_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringClusWorkerTerminate", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringClusWorkerTerminate_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringClusWorkerTerminateEx", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringClusWorkerTerminateEx_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringClusWorkersTerminate", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringClusWorkersTerminate_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringClusapiSetReasonHandler", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringClusapiSetReasonHandler_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringClusterAddGroupToAffinityRule", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringClusterAddGroupToAffinityRule_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringClusterAddGroupToGroupSet", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringClusterAddGroupToGroupSet_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringClusterAddGroupToGroupSetWithDomains", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringClusterAddGroupToGroupSetWithDomains_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringClusterAddGroupToGroupSetWithDomainsEx", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringClusterAddGroupToGroupSetWithDomainsEx_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringClusterAffinityRuleControl", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringClusterAffinityRuleControl_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringClusterClearBackupStateForSharedVolume", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringClusterClearBackupStateForSharedVolume_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringClusterCloseEnum", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringClusterCloseEnum_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringClusterCloseEnumEx", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringClusterCloseEnumEx_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringClusterControl", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringClusterControl_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringClusterControlEx", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringClusterControlEx_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringClusterCreateAffinityRule", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringClusterCreateAffinityRule_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringClusterDecrypt", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringClusterDecrypt_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringClusterEncrypt", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringClusterEncrypt_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringClusterEnum", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringClusterEnum_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringClusterEnumEx", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringClusterEnumEx_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringClusterGetEnumCount", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringClusterGetEnumCount_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringClusterGetEnumCountEx", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringClusterGetEnumCountEx_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringClusterGetVolumeNameForVolumeMountPoint", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringClusterGetVolumeNameForVolumeMountPoint_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringClusterGetVolumePathName", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringClusterGetVolumePathName_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringClusterGroupCloseEnum", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringClusterGroupCloseEnum_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringClusterGroupCloseEnumEx", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringClusterGroupCloseEnumEx_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringClusterGroupControl", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringClusterGroupControl_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringClusterGroupControlEx", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringClusterGroupControlEx_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringClusterGroupEnum", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringClusterGroupEnum_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringClusterGroupEnumEx", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringClusterGroupEnumEx_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringClusterGroupGetEnumCount", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringClusterGroupGetEnumCount_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringClusterGroupGetEnumCountEx", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringClusterGroupGetEnumCountEx_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringClusterGroupOpenEnum", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringClusterGroupOpenEnum_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringClusterGroupOpenEnumEx", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringClusterGroupOpenEnumEx_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringClusterGroupSetCloseEnum", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringClusterGroupSetCloseEnum_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringClusterGroupSetControl", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringClusterGroupSetControl_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringClusterGroupSetControlEx", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringClusterGroupSetControlEx_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringClusterGroupSetEnum", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringClusterGroupSetEnum_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringClusterGroupSetGetEnumCount", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringClusterGroupSetGetEnumCount_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringClusterGroupSetOpenEnum", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringClusterGroupSetOpenEnum_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringClusterIsPathOnSharedVolume", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringClusterIsPathOnSharedVolume_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringClusterNetInterfaceCloseEnum", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringClusterNetInterfaceCloseEnum_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringClusterNetInterfaceControl", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringClusterNetInterfaceControl_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringClusterNetInterfaceControlEx", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringClusterNetInterfaceControlEx_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringClusterNetInterfaceEnum", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringClusterNetInterfaceEnum_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringClusterNetInterfaceOpenEnum", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringClusterNetInterfaceOpenEnum_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringClusterNetworkCloseEnum", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringClusterNetworkCloseEnum_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringClusterNetworkControl", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringClusterNetworkControl_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringClusterNetworkControlEx", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringClusterNetworkControlEx_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringClusterNetworkEnum", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringClusterNetworkEnum_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringClusterNetworkGetEnumCount", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringClusterNetworkGetEnumCount_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringClusterNetworkOpenEnum", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringClusterNetworkOpenEnum_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringClusterNodeCloseEnum", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringClusterNodeCloseEnum_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringClusterNodeCloseEnumEx", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringClusterNodeCloseEnumEx_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringClusterNodeControl", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringClusterNodeControl_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringClusterNodeControlEx", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringClusterNodeControlEx_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringClusterNodeEnum", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringClusterNodeEnum_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringClusterNodeEnumEx", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringClusterNodeEnumEx_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringClusterNodeGetEnumCount", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringClusterNodeGetEnumCount_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringClusterNodeGetEnumCountEx", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringClusterNodeGetEnumCountEx_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringClusterNodeOpenEnum", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringClusterNodeOpenEnum_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringClusterNodeOpenEnumEx", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringClusterNodeOpenEnumEx_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringClusterNodeReplacement", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringClusterNodeReplacement_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringClusterOpenEnum", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringClusterOpenEnum_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringClusterOpenEnumEx", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringClusterOpenEnumEx_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringClusterPrepareSharedVolumeForBackup", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringClusterPrepareSharedVolumeForBackup_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringClusterRegBatchAddCommand", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringClusterRegBatchAddCommand_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringClusterRegBatchCloseNotification", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringClusterRegBatchCloseNotification_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringClusterRegBatchReadCommand", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringClusterRegBatchReadCommand_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringClusterRegCloseBatch", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringClusterRegCloseBatch_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringClusterRegCloseBatchEx", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringClusterRegCloseBatchEx_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringClusterRegCloseBatchNotifyPort", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringClusterRegCloseBatchNotifyPort_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringClusterRegCloseKey", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringClusterRegCloseKey_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringClusterRegCloseReadBatch", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringClusterRegCloseReadBatch_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringClusterRegCloseReadBatchEx", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringClusterRegCloseReadBatchEx_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringClusterRegCloseReadBatchReply", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringClusterRegCloseReadBatchReply_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringClusterRegCreateBatch", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringClusterRegCreateBatch_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringClusterRegCreateBatchNotifyPort", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringClusterRegCreateBatchNotifyPort_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringClusterRegCreateKey", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringClusterRegCreateKey_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringClusterRegCreateKeyEx", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringClusterRegCreateKeyEx_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringClusterRegCreateReadBatch", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringClusterRegCreateReadBatch_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringClusterRegDeleteKey", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringClusterRegDeleteKey_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringClusterRegDeleteKeyEx", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringClusterRegDeleteKeyEx_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringClusterRegDeleteValue", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringClusterRegDeleteValue_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringClusterRegDeleteValueEx", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringClusterRegDeleteValueEx_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringClusterRegEnumKey", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringClusterRegEnumKey_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringClusterRegEnumValue", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringClusterRegEnumValue_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringClusterRegGetBatchNotification", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringClusterRegGetBatchNotification_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringClusterRegGetKeySecurity", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringClusterRegGetKeySecurity_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringClusterRegOpenKey", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringClusterRegOpenKey_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringClusterRegQueryInfoKey", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringClusterRegQueryInfoKey_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringClusterRegQueryValue", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringClusterRegQueryValue_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringClusterRegReadBatchAddCommand", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringClusterRegReadBatchAddCommand_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringClusterRegReadBatchReplyNextCommand", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringClusterRegReadBatchReplyNextCommand_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringClusterRegSetKeySecurity", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringClusterRegSetKeySecurity_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringClusterRegSetKeySecurityEx", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringClusterRegSetKeySecurityEx_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringClusterRegSetValue", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringClusterRegSetValue_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringClusterRegSetValueEx", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringClusterRegSetValueEx_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringClusterRegSyncDatabase", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringClusterRegSyncDatabase_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringClusterRemoveAffinityRule", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringClusterRemoveAffinityRule_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringClusterRemoveGroupFromAffinityRule", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringClusterRemoveGroupFromAffinityRule_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringClusterRemoveGroupFromGroupSet", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringClusterRemoveGroupFromGroupSet_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringClusterRemoveGroupFromGroupSetEx", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringClusterRemoveGroupFromGroupSetEx_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringClusterResourceCloseEnum", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringClusterResourceCloseEnum_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringClusterResourceCloseEnumEx", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringClusterResourceCloseEnumEx_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringClusterResourceControl", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringClusterResourceControl_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringClusterResourceControlAsUser", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringClusterResourceControlAsUser_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringClusterResourceControlAsUserEx", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringClusterResourceControlAsUserEx_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringClusterResourceControlEx", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringClusterResourceControlEx_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringClusterResourceEnum", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringClusterResourceEnum_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringClusterResourceEnumEx", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringClusterResourceEnumEx_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringClusterResourceGetEnumCount", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringClusterResourceGetEnumCount_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringClusterResourceGetEnumCountEx", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringClusterResourceGetEnumCountEx_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringClusterResourceOpenEnum", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringClusterResourceOpenEnum_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringClusterResourceOpenEnumEx", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringClusterResourceOpenEnumEx_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringClusterResourceTypeCloseEnum", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringClusterResourceTypeCloseEnum_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringClusterResourceTypeControl", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringClusterResourceTypeControl_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringClusterResourceTypeControlAsUser", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringClusterResourceTypeControlAsUser_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringClusterResourceTypeControlAsUserEx", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringClusterResourceTypeControlAsUserEx_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringClusterResourceTypeControlEx", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringClusterResourceTypeControlEx_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringClusterResourceTypeEnum", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringClusterResourceTypeEnum_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringClusterResourceTypeGetEnumCount", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringClusterResourceTypeGetEnumCount_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringClusterResourceTypeOpenEnum", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringClusterResourceTypeOpenEnum_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringClusterSetAccountAccess", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringClusterSetAccountAccess_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringClusterUpgradeFunctionalLevel", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringClusterUpgradeFunctionalLevel_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringCreateCluster", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringCreateCluster_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringCreateClusterAvailabilitySet", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringCreateClusterAvailabilitySet_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringCreateClusterGroup", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringCreateClusterGroup_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringCreateClusterGroupEx", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringCreateClusterGroupEx_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringCreateClusterGroupSet", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringCreateClusterGroupSet_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringCreateClusterNameAccount", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringCreateClusterNameAccount_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringCreateClusterNotifyPort", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringCreateClusterNotifyPort_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringCreateClusterNotifyPortV2", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringCreateClusterNotifyPortV2_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringCreateClusterResource", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringCreateClusterResource_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringCreateClusterResourceEx", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringCreateClusterResourceEx_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringCreateClusterResourceType", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringCreateClusterResourceType_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringCreateClusterResourceTypeEx", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringCreateClusterResourceTypeEx_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringDeleteClusterGroup", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringDeleteClusterGroup_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringDeleteClusterGroupEx", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringDeleteClusterGroupEx_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringDeleteClusterGroupSet", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringDeleteClusterGroupSet_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringDeleteClusterGroupSetEx", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringDeleteClusterGroupSetEx_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringDeleteClusterResource", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringDeleteClusterResource_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringDeleteClusterResourceEx", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringDeleteClusterResourceEx_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringDeleteClusterResourceType", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringDeleteClusterResourceType_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringDeleteClusterResourceTypeEx", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringDeleteClusterResourceTypeEx_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringDestroyCluster", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringDestroyCluster_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringDestroyClusterGroup", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringDestroyClusterGroup_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringDestroyClusterGroupEx", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringDestroyClusterGroupEx_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringDetermineCNOResTypeFromCluster", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringDetermineCNOResTypeFromCluster_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringDetermineCNOResTypeFromNodelist", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringDetermineCNOResTypeFromNodelist_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringDetermineClusterCloudTypeFromCluster", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringDetermineClusterCloudTypeFromCluster_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringDetermineClusterCloudTypeFromNodelist", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringDetermineClusterCloudTypeFromNodelist_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringEvictClusterNode", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringEvictClusterNode_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringEvictClusterNodeEx", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringEvictClusterNodeEx_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringEvictClusterNodeEx2", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringEvictClusterNodeEx2_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringFailClusterResource", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringFailClusterResource_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringFailClusterResourceEx", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringFailClusterResourceEx_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringFreeClusterCrypt", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringFreeClusterCrypt_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringFreeClusterHealthFault", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringFreeClusterHealthFault_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringFreeClusterHealthFaultArray", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringFreeClusterHealthFaultArray_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringGetClusterFromGroup", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringGetClusterFromGroup_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringGetClusterFromNetInterface", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringGetClusterFromNetInterface_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringGetClusterFromNetwork", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringGetClusterFromNetwork_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringGetClusterFromNode", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringGetClusterFromNode_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringGetClusterFromResource", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringGetClusterFromResource_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringGetClusterGroupKey", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringGetClusterGroupKey_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringGetClusterGroupState", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringGetClusterGroupState_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringGetClusterInformation", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringGetClusterInformation_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringGetClusterKey", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringGetClusterKey_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringGetClusterNetInterface", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringGetClusterNetInterface_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringGetClusterNetInterfaceKey", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringGetClusterNetInterfaceKey_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringGetClusterNetInterfaceState", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringGetClusterNetInterfaceState_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringGetClusterNetworkId", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringGetClusterNetworkId_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringGetClusterNetworkKey", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringGetClusterNetworkKey_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringGetClusterNetworkState", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringGetClusterNetworkState_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringGetClusterNodeId", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringGetClusterNodeId_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringGetClusterNodeKey", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringGetClusterNodeKey_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringGetClusterNodeState", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringGetClusterNodeState_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringGetClusterNotify", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringGetClusterNotify_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringGetClusterNotifyV2", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringGetClusterNotifyV2_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringGetClusterQuorumResource", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringGetClusterQuorumResource_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringGetClusterResourceDependencyExpression", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringGetClusterResourceDependencyExpression_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringGetClusterResourceKey", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringGetClusterResourceKey_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringGetClusterResourceNetworkName", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringGetClusterResourceNetworkName_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringGetClusterResourceState", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringGetClusterResourceState_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringGetClusterResourceTypeKey", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringGetClusterResourceTypeKey_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringGetNodeCloudTypeDW", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringGetNodeCloudTypeDW_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringGetNodeClusterState", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringGetNodeClusterState_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringGetNotifyEventHandle", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringGetNotifyEventHandle_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringInitializeClusterHealthFault", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringInitializeClusterHealthFault_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringInitializeClusterHealthFaultArray", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringInitializeClusterHealthFaultArray_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringIsFileOnClusterSharedVolume", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringIsFileOnClusterSharedVolume_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringMoveClusterGroup", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringMoveClusterGroup_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringMoveClusterGroupEx", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringMoveClusterGroupEx_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringMoveClusterGroupEx2", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringMoveClusterGroupEx2_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringOfflineClusterGroup", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringOfflineClusterGroup_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringOfflineClusterGroupEx", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringOfflineClusterGroupEx_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringOfflineClusterGroupEx2", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringOfflineClusterGroupEx2_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringOfflineClusterResource", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringOfflineClusterResource_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringOfflineClusterResourceEx", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringOfflineClusterResourceEx_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringOfflineClusterResourceEx2", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringOfflineClusterResourceEx2_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringOnlineClusterGroup", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringOnlineClusterGroup_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringOnlineClusterGroupEx", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringOnlineClusterGroupEx_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringOnlineClusterGroupEx2", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringOnlineClusterGroupEx2_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringOnlineClusterResource", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringOnlineClusterResource_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringOnlineClusterResourceEx", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringOnlineClusterResourceEx_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringOnlineClusterResourceEx2", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringOnlineClusterResourceEx2_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringOpenCluster", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringOpenCluster_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringOpenClusterCryptProvider", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringOpenClusterCryptProvider_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringOpenClusterCryptProviderEx", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringOpenClusterCryptProviderEx_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringOpenClusterEx", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringOpenClusterEx_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringOpenClusterGroup", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringOpenClusterGroup_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringOpenClusterGroupEx", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringOpenClusterGroupEx_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringOpenClusterGroupSet", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringOpenClusterGroupSet_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringOpenClusterNetInterface", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringOpenClusterNetInterface_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringOpenClusterNetInterfaceEx", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringOpenClusterNetInterfaceEx_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringOpenClusterNetwork", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringOpenClusterNetwork_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringOpenClusterNetworkEx", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringOpenClusterNetworkEx_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringOpenClusterNode", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringOpenClusterNode_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringOpenClusterNodeById", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringOpenClusterNodeById_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringOpenClusterNodeEx", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringOpenClusterNodeEx_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringOpenClusterResource", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringOpenClusterResource_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringOpenClusterResourceEx", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringOpenClusterResourceEx_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringPauseClusterNode", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringPauseClusterNode_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringPauseClusterNodeEx", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringPauseClusterNodeEx_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringPauseClusterNodeEx2", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringPauseClusterNodeEx2_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringQueryAppInstanceVersion", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringQueryAppInstanceVersion_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringRegisterAppInstance", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringRegisterAppInstance_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringRegisterAppInstanceVersion", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringRegisterAppInstanceVersion_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringRegisterClusterNotify", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringRegisterClusterNotify_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringRegisterClusterResourceTypeNotifyV2", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringRegisterClusterResourceTypeNotifyV2_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringRemoveClusterGroupDependency", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringRemoveClusterGroupDependency_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringRemoveClusterGroupDependencyEx", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringRemoveClusterGroupDependencyEx_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringRemoveClusterGroupSetDependency", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringRemoveClusterGroupSetDependency_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringRemoveClusterGroupSetDependencyEx", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringRemoveClusterGroupSetDependencyEx_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringRemoveClusterGroupToGroupSetDependency", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringRemoveClusterGroupToGroupSetDependency_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringRemoveClusterGroupToGroupSetDependencyEx", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringRemoveClusterGroupToGroupSetDependencyEx_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringRemoveClusterNameAccount", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringRemoveClusterNameAccount_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringRemoveClusterResourceDependency", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringRemoveClusterResourceDependency_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringRemoveClusterResourceDependencyEx", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringRemoveClusterResourceDependencyEx_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringRemoveClusterResourceNode", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringRemoveClusterResourceNode_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringRemoveClusterResourceNodeEx", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringRemoveClusterResourceNodeEx_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringRemoveClusterStorageNode", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringRemoveClusterStorageNode_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringRemoveCrossClusterGroupSetDependency", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringRemoveCrossClusterGroupSetDependency_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringRemoveResourceFromClusterSharedVolumes", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringRemoveResourceFromClusterSharedVolumes_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringResUtilAddUnknownProperties", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringResUtilAddUnknownProperties_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringResUtilCreateDirectoryTree", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringResUtilCreateDirectoryTree_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringResUtilDupGroup", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringResUtilDupGroup_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringResUtilDupParameterBlock", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringResUtilDupParameterBlock_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringResUtilDupResource", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringResUtilDupResource_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringResUtilDupString", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringResUtilDupString_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringResUtilEnumGroups", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringResUtilEnumGroups_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringResUtilEnumGroupsEx", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringResUtilEnumGroupsEx_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringResUtilEnumPrivateProperties", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringResUtilEnumPrivateProperties_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringResUtilEnumProperties", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringResUtilEnumProperties_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringResUtilEnumResources", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringResUtilEnumResources_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringResUtilEnumResourcesEx", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringResUtilEnumResourcesEx_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringResUtilEnumResourcesEx2", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringResUtilEnumResourcesEx2_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringResUtilExpandEnvironmentStrings", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringResUtilExpandEnvironmentStrings_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringResUtilFindBinaryProperty", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringResUtilFindBinaryProperty_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringResUtilFindDependentDiskResourceDriveLetter", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringResUtilFindDependentDiskResourceDriveLetter_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringResUtilFindDwordProperty", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringResUtilFindDwordProperty_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringResUtilFindExpandSzProperty", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringResUtilFindExpandSzProperty_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringResUtilFindExpandedSzProperty", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringResUtilFindExpandedSzProperty_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringResUtilFindFileTimeProperty", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringResUtilFindFileTimeProperty_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringResUtilFindLongProperty", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringResUtilFindLongProperty_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringResUtilFindMultiSzProperty", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringResUtilFindMultiSzProperty_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringResUtilFindSzProperty", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringResUtilFindSzProperty_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringResUtilFindULargeIntegerProperty", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringResUtilFindULargeIntegerProperty_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringResUtilFreeEnvironment", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringResUtilFreeEnvironment_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringResUtilFreeParameterBlock", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringResUtilFreeParameterBlock_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringResUtilGetAllProperties", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringResUtilGetAllProperties_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringResUtilGetBinaryProperty", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringResUtilGetBinaryProperty_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringResUtilGetBinaryValue", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringResUtilGetBinaryValue_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringResUtilGetClusterGroupType", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringResUtilGetClusterGroupType_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringResUtilGetClusterId", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringResUtilGetClusterId_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringResUtilGetClusterRoleState", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringResUtilGetClusterRoleState_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringResUtilGetCoreClusterResources", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringResUtilGetCoreClusterResources_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringResUtilGetCoreClusterResourcesEx", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringResUtilGetCoreClusterResourcesEx_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringResUtilGetCoreGroup", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringResUtilGetCoreGroup_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringResUtilGetDwordProperty", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringResUtilGetDwordProperty_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringResUtilGetDwordValue", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringResUtilGetDwordValue_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringResUtilGetEnvironmentWithNetName", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringResUtilGetEnvironmentWithNetName_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringResUtilGetLongProperty", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringResUtilGetLongProperty_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringResUtilGetMultiSzProperty", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringResUtilGetMultiSzProperty_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringResUtilGetPrivateProperties", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringResUtilGetPrivateProperties_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringResUtilGetProperties", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringResUtilGetProperties_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringResUtilGetPropertiesToParameterBlock", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringResUtilGetPropertiesToParameterBlock_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringResUtilGetProperty", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringResUtilGetProperty_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringResUtilGetPropertyFormats", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringResUtilGetPropertyFormats_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringResUtilGetPropertySize", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringResUtilGetPropertySize_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringResUtilGetQwordValue", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringResUtilGetQwordValue_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringResUtilGetResourceDependency", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringResUtilGetResourceDependency_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringResUtilGetResourceDependencyByClass", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringResUtilGetResourceDependencyByClass_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringResUtilGetResourceDependencyByClassEx", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringResUtilGetResourceDependencyByClassEx_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringResUtilGetResourceDependencyByName", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringResUtilGetResourceDependencyByName_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringResUtilGetResourceDependencyByNameEx", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringResUtilGetResourceDependencyByNameEx_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringResUtilGetResourceDependencyEx", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringResUtilGetResourceDependencyEx_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringResUtilGetResourceDependentIPAddressProps", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringResUtilGetResourceDependentIPAddressProps_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringResUtilGetResourceName", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringResUtilGetResourceName_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringResUtilGetResourceNameDependency", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringResUtilGetResourceNameDependency_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringResUtilGetResourceNameDependencyEx", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringResUtilGetResourceNameDependencyEx_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringResUtilGetSzProperty", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringResUtilGetSzProperty_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringResUtilGetSzValue", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringResUtilGetSzValue_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringResUtilGroupsEqual", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringResUtilGroupsEqual_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringResUtilIsPathValid", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringResUtilIsPathValid_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringResUtilIsResourceClassEqual", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringResUtilIsResourceClassEqual_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringResUtilLeftPaxosIsLessThanRight", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringResUtilLeftPaxosIsLessThanRight_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringResUtilNodeEnum", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringResUtilNodeEnum_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringResUtilPaxosComparer", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringResUtilPaxosComparer_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringResUtilPropertyListFromParameterBlock", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringResUtilPropertyListFromParameterBlock_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringResUtilRemoveResourceServiceEnvironment", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringResUtilRemoveResourceServiceEnvironment_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringResUtilResourceDepEnum", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringResUtilResourceDepEnum_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringResUtilResourceTypesEqual", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringResUtilResourceTypesEqual_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringResUtilResourcesEqual", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringResUtilResourcesEqual_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringResUtilSetBinaryValue", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringResUtilSetBinaryValue_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringResUtilSetDwordValue", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringResUtilSetDwordValue_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringResUtilSetExpandSzValue", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringResUtilSetExpandSzValue_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringResUtilSetMultiSzValue", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringResUtilSetMultiSzValue_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringResUtilSetPrivatePropertyList", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringResUtilSetPrivatePropertyList_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringResUtilSetPropertyParameterBlock", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringResUtilSetPropertyParameterBlock_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringResUtilSetPropertyParameterBlockEx", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringResUtilSetPropertyParameterBlockEx_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringResUtilSetPropertyTable", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringResUtilSetPropertyTable_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringResUtilSetPropertyTableEx", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringResUtilSetPropertyTableEx_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringResUtilSetQwordValue", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringResUtilSetQwordValue_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringResUtilSetResourceServiceEnvironment", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringResUtilSetResourceServiceEnvironment_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringResUtilSetResourceServiceStartParameters", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringResUtilSetResourceServiceStartParameters_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringResUtilSetResourceServiceStartParametersEx", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringResUtilSetResourceServiceStartParametersEx_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringResUtilSetSzValue", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringResUtilSetSzValue_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringResUtilSetUnknownProperties", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringResUtilSetUnknownProperties_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringResUtilSetValueEx", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringResUtilSetValueEx_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringResUtilStartResourceService", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringResUtilStartResourceService_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringResUtilStopResourceService", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringResUtilStopResourceService_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringResUtilStopService", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringResUtilStopService_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringResUtilTerminateServiceProcessFromResDll", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringResUtilTerminateServiceProcessFromResDll_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringResUtilVerifyPrivatePropertyList", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringResUtilVerifyPrivatePropertyList_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringResUtilVerifyPropertyTable", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringResUtilVerifyPropertyTable_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringResUtilVerifyResourceService", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringResUtilVerifyResourceService_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringResUtilVerifyService", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringResUtilVerifyService_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringResUtilVerifyShutdownSafe", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringResUtilVerifyShutdownSafe_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringResUtilsDeleteKeyTree", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringResUtilsDeleteKeyTree_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringResetAllAppInstanceVersions", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringResetAllAppInstanceVersions_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringRestartClusterResource", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringRestartClusterResource_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringRestartClusterResourceEx", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringRestartClusterResourceEx_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringRestoreClusterDatabase", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringRestoreClusterDatabase_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringResumeClusterNode", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringResumeClusterNode_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringResumeClusterNodeEx", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringResumeClusterNodeEx_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringResumeClusterNodeEx2", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringResumeClusterNodeEx2_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringSetAppInstanceCsvFlags", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringSetAppInstanceCsvFlags_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringSetClusterGroupName", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringSetClusterGroupName_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringSetClusterGroupNameEx", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringSetClusterGroupNameEx_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringSetClusterGroupNodeList", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringSetClusterGroupNodeList_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringSetClusterGroupNodeListEx", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringSetClusterGroupNodeListEx_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringSetClusterGroupSetDependencyExpression", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringSetClusterGroupSetDependencyExpression_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringSetClusterGroupSetDependencyExpressionEx", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringSetClusterGroupSetDependencyExpressionEx_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringSetClusterName", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringSetClusterName_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringSetClusterNameEx", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringSetClusterNameEx_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringSetClusterNetworkName", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringSetClusterNetworkName_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringSetClusterNetworkNameEx", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringSetClusterNetworkNameEx_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringSetClusterNetworkPriorityOrder", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringSetClusterNetworkPriorityOrder_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringSetClusterQuorumResource", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringSetClusterQuorumResource_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringSetClusterQuorumResourceEx", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringSetClusterQuorumResourceEx_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringSetClusterResourceDependencyExpression", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringSetClusterResourceDependencyExpression_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringSetClusterResourceName", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringSetClusterResourceName_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringSetClusterResourceNameEx", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringSetClusterResourceNameEx_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringSetClusterServiceAccountPassword", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringSetClusterServiceAccountPassword_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringSetGroupDependencyExpression", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringSetGroupDependencyExpression_napi));
    exports.Set("windowssysWindowsWin32NetworkingClusteringSetGroupDependencyExpressionEx", Napi::Function::New(env, windowssysWindowsWin32NetworkingClusteringSetGroupDependencyExpressionEx_napi));
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
