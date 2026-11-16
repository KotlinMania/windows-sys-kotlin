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

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltAcknowledgeEcp_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t filter = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* ecpcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltAcknowledgeEcp")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(filter, ecpcontext);
    } else {
        errno = ENOSYS;
    }
#else
    (void)filter;
    (void)ecpcontext;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltAcquirePushLockExclusive_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pushlock = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltAcquirePushLockExclusive")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(pushlock);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pushlock;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltAcquirePushLockExclusiveEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pushlock = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltAcquirePushLockExclusiveEx")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(pushlock, flags);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pushlock;
    (void)flags;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltAcquirePushLockShared_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pushlock = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltAcquirePushLockShared")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(pushlock);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pushlock;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltAcquirePushLockSharedEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pushlock = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltAcquirePushLockSharedEx")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(pushlock, flags);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pushlock;
    (void)flags;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltAcquireResourceExclusive_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* resource = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltAcquireResourceExclusive")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(resource);
    } else {
        errno = ENOSYS;
    }
#else
    (void)resource;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltAcquireResourceShared_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* resource = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltAcquireResourceShared")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(resource);
    } else {
        errno = ENOSYS;
    }
#else
    (void)resource;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltAddOpenReparseEntry_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t filter = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* data = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* openreparseentry = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltAddOpenReparseEntry")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(filter, data, openreparseentry);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filter;
    (void)data;
    (void)openreparseentry;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltAdjustDeviceStackSizeForIoRedirection_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t sourceinstance = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t targetinstance = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
    void* sourcedevicestacksizemodified = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltAdjustDeviceStackSizeForIoRedirection")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sourceinstance, targetinstance, sourcedevicestacksizemodified);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sourceinstance;
    (void)targetinstance;
    (void)sourcedevicestacksizemodified;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltAllocateCallbackData_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t instance = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* fileobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* retnewcallbackdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltAllocateCallbackData")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(instance, fileobject, retnewcallbackdata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)instance;
    (void)fileobject;
    (void)retnewcallbackdata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltAllocateCallbackDataEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t instance = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* fileobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* retnewcallbackdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltAllocateCallbackDataEx")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(instance, fileobject, flags, retnewcallbackdata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)instance;
    (void)fileobject;
    (void)flags;
    (void)retnewcallbackdata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltAllocateContext_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t filter = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint16_t contexttype = static_cast<uint16_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint64_t contextsize = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
    int32_t pooltype = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* returnedcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint16_t, uint64_t, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltAllocateContext")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(filter, contexttype, contextsize, pooltype, returnedcontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filter;
    (void)contexttype;
    (void)contextsize;
    (void)pooltype;
    (void)returnedcontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltAllocateDeferredIoWorkItem_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltAllocateDeferredIoWorkItem")));
    }
    int64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr();
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltAllocateExtraCreateParameter_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t filter = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* ecptype = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t sizeofcontext = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* cleanupcallback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t pooltag = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* ecpcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltAllocateExtraCreateParameter")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(filter, ecptype, sizeofcontext, flags, cleanupcallback, pooltag, ecpcontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filter;
    (void)ecptype;
    (void)sizeofcontext;
    (void)flags;
    (void)cleanupcallback;
    (void)pooltag;
    (void)ecpcontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltAllocateExtraCreateParameterFromLookasideList_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t filter = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* ecptype = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t sizeofcontext = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* cleanupcallback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* lookasidelist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* ecpcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltAllocateExtraCreateParameterFromLookasideList")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(filter, ecptype, sizeofcontext, flags, cleanupcallback, lookasidelist, ecpcontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filter;
    (void)ecptype;
    (void)sizeofcontext;
    (void)flags;
    (void)cleanupcallback;
    (void)lookasidelist;
    (void)ecpcontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltAllocateExtraCreateParameterList_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t filter = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* ecplist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltAllocateExtraCreateParameterList")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(filter, flags, ecplist);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filter;
    (void)flags;
    (void)ecplist;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltAllocateFileLock_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* completelockcallbackdataroutine = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* unlockroutine = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltAllocateFileLock")));
    }
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(completelockcallbackdataroutine, unlockroutine);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
#else
    (void)completelockcallbackdataroutine;
    (void)unlockroutine;
    errno = ENOSYS;
    void* km_res = nullptr;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltAllocateGenericWorkItem_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltAllocateGenericWorkItem")));
    }
    int64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr();
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltAllocatePoolAlignedWithTag_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t instance = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int32_t pooltype = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint64_t numberofbytes = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
    uint32_t tag = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t, int32_t, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltAllocatePoolAlignedWithTag")));
    }
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(instance, pooltype, numberofbytes, tag);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
#else
    (void)instance;
    (void)pooltype;
    (void)numberofbytes;
    (void)tag;
    errno = ENOSYS;
    void* km_res = nullptr;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltApplyPriorityInfoThread_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* inputpriorityinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* outputpriorityinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int64_t thread = km_info.Length() > 2 ? km_napi_arg_i64(km_info[2]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltApplyPriorityInfoThread")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(inputpriorityinfo, outputpriorityinfo, thread);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)inputpriorityinfo;
    (void)outputpriorityinfo;
    (void)thread;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltAttachVolume_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t filter = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t volume = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
    void* instancename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* retinstance = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltAttachVolume")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(filter, volume, instancename, retinstance);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filter;
    (void)volume;
    (void)instancename;
    (void)retinstance;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltAttachVolumeAtAltitude_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t filter = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t volume = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
    void* altitude = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* instancename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* retinstance = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltAttachVolumeAtAltitude")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(filter, volume, altitude, instancename, retinstance);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filter;
    (void)volume;
    (void)altitude;
    (void)instancename;
    (void)retinstance;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltBuildDefaultSecurityDescriptor_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* securitydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t desiredaccess = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltBuildDefaultSecurityDescriptor")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(securitydescriptor, desiredaccess);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)securitydescriptor;
    (void)desiredaccess;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltCancelFileOpen_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t instance = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* fileobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltCancelFileOpen")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(instance, fileobject);
    } else {
        errno = ENOSYS;
    }
#else
    (void)instance;
    (void)fileobject;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltCancelIo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* callbackdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltCancelIo")));
    }
    bool km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(callbackdata);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)callbackdata;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltCancellableWaitForMultipleObjects_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t count = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* objectarray = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t waittype = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* timeout = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* waitblockarray = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* callbackdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltCancellableWaitForMultipleObjects")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(count, objectarray, waittype, timeout, waitblockarray, callbackdata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)count;
    (void)objectarray;
    (void)waittype;
    (void)timeout;
    (void)waitblockarray;
    (void)callbackdata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltCancellableWaitForSingleObject_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* object = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* timeout = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* callbackdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltCancellableWaitForSingleObject")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(object, timeout, callbackdata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)object;
    (void)timeout;
    (void)callbackdata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltCbdqDisable_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* cbdq = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltCbdqDisable")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(cbdq);
    } else {
        errno = ENOSYS;
    }
#else
    (void)cbdq;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltCbdqEnable_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* cbdq = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltCbdqEnable")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(cbdq);
    } else {
        errno = ENOSYS;
    }
#else
    (void)cbdq;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltCbdqInitialize_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t instance = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* cbdq = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* cbdqinsertio = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* cbdqremoveio = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* cbdqpeeknextio = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* cbdqacquire = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* cbdqrelease = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* cbdqcompletecanceledio = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltCbdqInitialize")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(instance, cbdq, cbdqinsertio, cbdqremoveio, cbdqpeeknextio, cbdqacquire, cbdqrelease, cbdqcompletecanceledio);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)instance;
    (void)cbdq;
    (void)cbdqinsertio;
    (void)cbdqremoveio;
    (void)cbdqpeeknextio;
    (void)cbdqacquire;
    (void)cbdqrelease;
    (void)cbdqcompletecanceledio;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltCbdqInsertIo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* cbdq = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* cbd = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* context = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* insertcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltCbdqInsertIo")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(cbdq, cbd, context, insertcontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)cbdq;
    (void)cbd;
    (void)context;
    (void)insertcontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltCbdqRemoveIo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* cbdq = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* context = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltCbdqRemoveIo")));
    }
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(cbdq, context);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
#else
    (void)cbdq;
    (void)context;
    errno = ENOSYS;
    void* km_res = nullptr;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltCbdqRemoveNextIo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* cbdq = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* peekcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltCbdqRemoveNextIo")));
    }
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(cbdq, peekcontext);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
#else
    (void)cbdq;
    (void)peekcontext;
    errno = ENOSYS;
    void* km_res = nullptr;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltCheckAndGrowNameControl_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* namectrl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint16_t newsize = static_cast<uint16_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint16_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltCheckAndGrowNameControl")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(namectrl, newsize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)namectrl;
    (void)newsize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltCheckLockForReadAccess_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* filelock = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* callbackdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltCheckLockForReadAccess")));
    }
    bool km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(filelock, callbackdata);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)filelock;
    (void)callbackdata;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltCheckLockForWriteAccess_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* filelock = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* callbackdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltCheckLockForWriteAccess")));
    }
    bool km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(filelock, callbackdata);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)filelock;
    (void)callbackdata;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltCheckOplock_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* oplock = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* callbackdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* context = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* waitcompletionroutine = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* prepostcallbackdataroutine = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltCheckOplock")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(oplock, callbackdata, context, waitcompletionroutine, prepostcallbackdataroutine);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)oplock;
    (void)callbackdata;
    (void)context;
    (void)waitcompletionroutine;
    (void)prepostcallbackdataroutine;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltCheckOplockEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* oplock = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* callbackdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* context = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* waitcompletionroutine = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* prepostcallbackdataroutine = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltCheckOplockEx")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(oplock, callbackdata, flags, context, waitcompletionroutine, prepostcallbackdataroutine);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)oplock;
    (void)callbackdata;
    (void)flags;
    (void)context;
    (void)waitcompletionroutine;
    (void)prepostcallbackdataroutine;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltClearCallbackDataDirty_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* data = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltClearCallbackDataDirty")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(data);
    } else {
        errno = ENOSYS;
    }
#else
    (void)data;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltClearCancelCompletion_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* callbackdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltClearCancelCompletion")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(callbackdata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)callbackdata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltClose_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* filehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltClose")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(filehandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filehandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltCloseClientPort_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t filter = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* clientport = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltCloseClientPort")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(filter, clientport);
    } else {
        errno = ENOSYS;
    }
#else
    (void)filter;
    (void)clientport;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltCloseCommunicationPort_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t serverport = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltCloseCommunicationPort")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(serverport);
    } else {
        errno = ENOSYS;
    }
#else
    (void)serverport;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltCloseSectionForDataScan_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* sectioncontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltCloseSectionForDataScan")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sectioncontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sectioncontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltCommitComplete_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t instance = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* transaction = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* transactioncontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltCommitComplete")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(instance, transaction, transactioncontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)instance;
    (void)transaction;
    (void)transactioncontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltCommitFinalizeComplete_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t instance = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* transaction = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* transactioncontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltCommitFinalizeComplete")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(instance, transaction, transactioncontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)instance;
    (void)transaction;
    (void)transactioncontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltCompareInstanceAltitudes_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t instance1 = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t instance2 = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltCompareInstanceAltitudes")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(instance1, instance2);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)instance1;
    (void)instance2;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltCompletePendedPostOperation_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* callbackdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltCompletePendedPostOperation")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(callbackdata);
    } else {
        errno = ENOSYS;
    }
#else
    (void)callbackdata;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltCompletePendedPreOperation_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* callbackdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t callbackstatus = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* context = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltCompletePendedPreOperation")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(callbackdata, callbackstatus, context);
    } else {
        errno = ENOSYS;
    }
#else
    (void)callbackdata;
    (void)callbackstatus;
    (void)context;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltCopyOpenReparseList_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t filter = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* data = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* ecplist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltCopyOpenReparseList")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(filter, data, ecplist);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filter;
    (void)data;
    (void)ecplist;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltCreateCommunicationPort_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t filter = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* serverport = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* objectattributes = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* serverportcookie = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* connectnotifycallback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* disconnectnotifycallback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* messagenotifycallback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    int32_t maxconnections = static_cast<int32_t>(km_info.Length() > 7 ? km_info[7].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*, void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltCreateCommunicationPort")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(filter, serverport, objectattributes, serverportcookie, connectnotifycallback, disconnectnotifycallback, messagenotifycallback, maxconnections);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filter;
    (void)serverport;
    (void)objectattributes;
    (void)serverportcookie;
    (void)connectnotifycallback;
    (void)disconnectnotifycallback;
    (void)messagenotifycallback;
    (void)maxconnections;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltCreateFile_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t filter = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t instance = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
    void* filehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t desiredaccess = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* objectattributes = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* iostatusblock = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* allocationsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    uint32_t fileattributes = static_cast<uint32_t>(km_info.Length() > 7 ? km_info[7].ToNumber().Int32Value() : 0);
    uint32_t shareaccess = static_cast<uint32_t>(km_info.Length() > 8 ? km_info[8].ToNumber().Int32Value() : 0);
    uint32_t createdisposition = static_cast<uint32_t>(km_info.Length() > 9 ? km_info[9].ToNumber().Int32Value() : 0);
    uint32_t createoptions = static_cast<uint32_t>(km_info.Length() > 10 ? km_info[10].ToNumber().Int32Value() : 0);
    void* eabuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 11 ? km_napi_arg_u64(km_info[11]) : 0));
    uint32_t ealength = static_cast<uint32_t>(km_info.Length() > 12 ? km_info[12].ToNumber().Int32Value() : 0);
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 13 ? km_info[13].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*, uint32_t, void*, void*, void*, uint32_t, uint32_t, uint32_t, uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltCreateFile")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(filter, instance, filehandle, desiredaccess, objectattributes, iostatusblock, allocationsize, fileattributes, shareaccess, createdisposition, createoptions, eabuffer, ealength, flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filter;
    (void)instance;
    (void)filehandle;
    (void)desiredaccess;
    (void)objectattributes;
    (void)iostatusblock;
    (void)allocationsize;
    (void)fileattributes;
    (void)shareaccess;
    (void)createdisposition;
    (void)createoptions;
    (void)eabuffer;
    (void)ealength;
    (void)flags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltCreateFileEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t filter = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t instance = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
    void* filehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* fileobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t desiredaccess = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* objectattributes = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* iostatusblock = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* allocationsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    uint32_t fileattributes = static_cast<uint32_t>(km_info.Length() > 8 ? km_info[8].ToNumber().Int32Value() : 0);
    uint32_t shareaccess = static_cast<uint32_t>(km_info.Length() > 9 ? km_info[9].ToNumber().Int32Value() : 0);
    uint32_t createdisposition = static_cast<uint32_t>(km_info.Length() > 10 ? km_info[10].ToNumber().Int32Value() : 0);
    uint32_t createoptions = static_cast<uint32_t>(km_info.Length() > 11 ? km_info[11].ToNumber().Int32Value() : 0);
    void* eabuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 12 ? km_napi_arg_u64(km_info[12]) : 0));
    uint32_t ealength = static_cast<uint32_t>(km_info.Length() > 13 ? km_info[13].ToNumber().Int32Value() : 0);
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 14 ? km_info[14].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*, void*, uint32_t, void*, void*, void*, uint32_t, uint32_t, uint32_t, uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltCreateFileEx")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(filter, instance, filehandle, fileobject, desiredaccess, objectattributes, iostatusblock, allocationsize, fileattributes, shareaccess, createdisposition, createoptions, eabuffer, ealength, flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filter;
    (void)instance;
    (void)filehandle;
    (void)fileobject;
    (void)desiredaccess;
    (void)objectattributes;
    (void)iostatusblock;
    (void)allocationsize;
    (void)fileattributes;
    (void)shareaccess;
    (void)createdisposition;
    (void)createoptions;
    (void)eabuffer;
    (void)ealength;
    (void)flags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltCreateFileEx2_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t filter = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t instance = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
    void* filehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* fileobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t desiredaccess = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* objectattributes = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* iostatusblock = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* allocationsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    uint32_t fileattributes = static_cast<uint32_t>(km_info.Length() > 8 ? km_info[8].ToNumber().Int32Value() : 0);
    uint32_t shareaccess = static_cast<uint32_t>(km_info.Length() > 9 ? km_info[9].ToNumber().Int32Value() : 0);
    uint32_t createdisposition = static_cast<uint32_t>(km_info.Length() > 10 ? km_info[10].ToNumber().Int32Value() : 0);
    uint32_t createoptions = static_cast<uint32_t>(km_info.Length() > 11 ? km_info[11].ToNumber().Int32Value() : 0);
    void* eabuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 12 ? km_napi_arg_u64(km_info[12]) : 0));
    uint32_t ealength = static_cast<uint32_t>(km_info.Length() > 13 ? km_info[13].ToNumber().Int32Value() : 0);
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 14 ? km_info[14].ToNumber().Int32Value() : 0);
    void* drivercontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 15 ? km_napi_arg_u64(km_info[15]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*, void*, uint32_t, void*, void*, void*, uint32_t, uint32_t, uint32_t, uint32_t, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltCreateFileEx2")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(filter, instance, filehandle, fileobject, desiredaccess, objectattributes, iostatusblock, allocationsize, fileattributes, shareaccess, createdisposition, createoptions, eabuffer, ealength, flags, drivercontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filter;
    (void)instance;
    (void)filehandle;
    (void)fileobject;
    (void)desiredaccess;
    (void)objectattributes;
    (void)iostatusblock;
    (void)allocationsize;
    (void)fileattributes;
    (void)shareaccess;
    (void)createdisposition;
    (void)createoptions;
    (void)eabuffer;
    (void)ealength;
    (void)flags;
    (void)drivercontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltCreateMailslotFile_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t filter = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t instance = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
    void* filehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* fileobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t desiredaccess = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* objectattributes = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* iostatusblock = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    uint32_t createoptions = static_cast<uint32_t>(km_info.Length() > 7 ? km_info[7].ToNumber().Int32Value() : 0);
    uint32_t mailslotquota = static_cast<uint32_t>(km_info.Length() > 8 ? km_info[8].ToNumber().Int32Value() : 0);
    uint32_t maximummessagesize = static_cast<uint32_t>(km_info.Length() > 9 ? km_info[9].ToNumber().Int32Value() : 0);
    void* readtimeout = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 10 ? km_napi_arg_u64(km_info[10]) : 0));
    void* drivercontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 11 ? km_napi_arg_u64(km_info[11]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*, void*, uint32_t, void*, void*, uint32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltCreateMailslotFile")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(filter, instance, filehandle, fileobject, desiredaccess, objectattributes, iostatusblock, createoptions, mailslotquota, maximummessagesize, readtimeout, drivercontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filter;
    (void)instance;
    (void)filehandle;
    (void)fileobject;
    (void)desiredaccess;
    (void)objectattributes;
    (void)iostatusblock;
    (void)createoptions;
    (void)mailslotquota;
    (void)maximummessagesize;
    (void)readtimeout;
    (void)drivercontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltCreateNamedPipeFile_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t filter = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t instance = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
    void* filehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* fileobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t desiredaccess = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* objectattributes = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* iostatusblock = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    uint32_t shareaccess = static_cast<uint32_t>(km_info.Length() > 7 ? km_info[7].ToNumber().Int32Value() : 0);
    uint32_t createdisposition = static_cast<uint32_t>(km_info.Length() > 8 ? km_info[8].ToNumber().Int32Value() : 0);
    uint32_t createoptions = static_cast<uint32_t>(km_info.Length() > 9 ? km_info[9].ToNumber().Int32Value() : 0);
    uint32_t namedpipetype = static_cast<uint32_t>(km_info.Length() > 10 ? km_info[10].ToNumber().Int32Value() : 0);
    uint32_t readmode = static_cast<uint32_t>(km_info.Length() > 11 ? km_info[11].ToNumber().Int32Value() : 0);
    uint32_t completionmode = static_cast<uint32_t>(km_info.Length() > 12 ? km_info[12].ToNumber().Int32Value() : 0);
    uint32_t maximuminstances = static_cast<uint32_t>(km_info.Length() > 13 ? km_info[13].ToNumber().Int32Value() : 0);
    uint32_t inboundquota = static_cast<uint32_t>(km_info.Length() > 14 ? km_info[14].ToNumber().Int32Value() : 0);
    uint32_t outboundquota = static_cast<uint32_t>(km_info.Length() > 15 ? km_info[15].ToNumber().Int32Value() : 0);
    void* defaulttimeout = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 16 ? km_napi_arg_u64(km_info[16]) : 0));
    void* drivercontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 17 ? km_napi_arg_u64(km_info[17]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*, void*, uint32_t, void*, void*, uint32_t, uint32_t, uint32_t, uint32_t, uint32_t, uint32_t, uint32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltCreateNamedPipeFile")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(filter, instance, filehandle, fileobject, desiredaccess, objectattributes, iostatusblock, shareaccess, createdisposition, createoptions, namedpipetype, readmode, completionmode, maximuminstances, inboundquota, outboundquota, defaulttimeout, drivercontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filter;
    (void)instance;
    (void)filehandle;
    (void)fileobject;
    (void)desiredaccess;
    (void)objectattributes;
    (void)iostatusblock;
    (void)shareaccess;
    (void)createdisposition;
    (void)createoptions;
    (void)namedpipetype;
    (void)readmode;
    (void)completionmode;
    (void)maximuminstances;
    (void)inboundquota;
    (void)outboundquota;
    (void)defaulttimeout;
    (void)drivercontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltCreateSectionForDataScan_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t instance = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* fileobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* sectioncontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t desiredaccess = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* objectattributes = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* maximumsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    uint32_t sectionpageprotection = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    uint32_t allocationattributes = static_cast<uint32_t>(km_info.Length() > 7 ? km_info[7].ToNumber().Int32Value() : 0);
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 8 ? km_info[8].ToNumber().Int32Value() : 0);
    void* sectionhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 9 ? km_napi_arg_u64(km_info[9]) : 0));
    void* sectionobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 10 ? km_napi_arg_u64(km_info[10]) : 0));
    void* sectionfilesize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 11 ? km_napi_arg_u64(km_info[11]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t, void*, void*, uint32_t, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltCreateSectionForDataScan")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(instance, fileobject, sectioncontext, desiredaccess, objectattributes, maximumsize, sectionpageprotection, allocationattributes, flags, sectionhandle, sectionobject, sectionfilesize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)instance;
    (void)fileobject;
    (void)sectioncontext;
    (void)desiredaccess;
    (void)objectattributes;
    (void)maximumsize;
    (void)sectionpageprotection;
    (void)allocationattributes;
    (void)flags;
    (void)sectionhandle;
    (void)sectionobject;
    (void)sectionfilesize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltCreateSystemVolumeInformationFolder_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t instance = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltCreateSystemVolumeInformationFolder")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(instance);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)instance;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltCurrentBatchOplock_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* oplock = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltCurrentBatchOplock")));
    }
    bool km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(oplock);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)oplock;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltCurrentOplock_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* oplock = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltCurrentOplock")));
    }
    bool km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(oplock);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)oplock;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltCurrentOplockH_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* oplock = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltCurrentOplockH")));
    }
    bool km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(oplock);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)oplock;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltDecodeParameters_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* callbackdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* mdladdresspointer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* length = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* desiredaccess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltDecodeParameters")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(callbackdata, mdladdresspointer, buffer, length, desiredaccess);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)callbackdata;
    (void)mdladdresspointer;
    (void)buffer;
    (void)length;
    (void)desiredaccess;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltDeleteContext_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* context = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltDeleteContext")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(context);
    } else {
        errno = ENOSYS;
    }
#else
    (void)context;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltDeleteExtraCreateParameterLookasideList_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t filter = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* lookaside = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltDeleteExtraCreateParameterLookasideList")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(filter, lookaside, flags);
    } else {
        errno = ENOSYS;
    }
#else
    (void)filter;
    (void)lookaside;
    (void)flags;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltDeleteFileContext_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t instance = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* fileobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* oldcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltDeleteFileContext")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(instance, fileobject, oldcontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)instance;
    (void)fileobject;
    (void)oldcontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltDeleteInstanceContext_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t instance = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* oldcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltDeleteInstanceContext")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(instance, oldcontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)instance;
    (void)oldcontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltDeletePushLock_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pushlock = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltDeletePushLock")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(pushlock);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pushlock;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltDeleteStreamContext_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t instance = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* fileobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* oldcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltDeleteStreamContext")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(instance, fileobject, oldcontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)instance;
    (void)fileobject;
    (void)oldcontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltDeleteStreamHandleContext_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t instance = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* fileobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* oldcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltDeleteStreamHandleContext")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(instance, fileobject, oldcontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)instance;
    (void)fileobject;
    (void)oldcontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltDeleteTransactionContext_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t instance = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* transaction = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* oldcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltDeleteTransactionContext")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(instance, transaction, oldcontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)instance;
    (void)transaction;
    (void)oldcontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltDeleteVolumeContext_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t filter = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t volume = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
    void* oldcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltDeleteVolumeContext")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(filter, volume, oldcontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filter;
    (void)volume;
    (void)oldcontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltDetachVolume_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t filter = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t volume = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
    void* instancename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltDetachVolume")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(filter, volume, instancename);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filter;
    (void)volume;
    (void)instancename;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltDeviceIoControlFile_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t instance = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* fileobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t iocontrolcode = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* inputbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t inputbufferlength = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* outputbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    uint32_t outputbufferlength = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    void* lengthreturned = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltDeviceIoControlFile")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(instance, fileobject, iocontrolcode, inputbuffer, inputbufferlength, outputbuffer, outputbufferlength, lengthreturned);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)instance;
    (void)fileobject;
    (void)iocontrolcode;
    (void)inputbuffer;
    (void)inputbufferlength;
    (void)outputbuffer;
    (void)outputbufferlength;
    (void)lengthreturned;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltDoCompletionProcessingWhenSafe_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* data = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* fltobjects = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* completioncontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* safepostcallback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* retpostoperationstatus = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltDoCompletionProcessingWhenSafe")));
    }
    bool km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(data, fltobjects, completioncontext, flags, safepostcallback, retpostoperationstatus);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)data;
    (void)fltobjects;
    (void)completioncontext;
    (void)flags;
    (void)safepostcallback;
    (void)retpostoperationstatus;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltEnlistInTransaction_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t instance = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* transaction = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* transactioncontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t notificationmask = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltEnlistInTransaction")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(instance, transaction, transactioncontext, notificationmask);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)instance;
    (void)transaction;
    (void)transactioncontext;
    (void)notificationmask;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltEnumerateFilterInformation_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t arg0Index = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    int32_t informationclass = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t buffersize = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* bytesreturned = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltEnumerateFilterInformation")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(arg0Index, informationclass, buffer, buffersize, bytesreturned);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)arg0Index;
    (void)informationclass;
    (void)buffer;
    (void)buffersize;
    (void)bytesreturned;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltEnumerateFilters_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* filterlist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t filterlistsize = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* numberfiltersreturned = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltEnumerateFilters")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(filterlist, filterlistsize, numberfiltersreturned);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filterlist;
    (void)filterlistsize;
    (void)numberfiltersreturned;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltEnumerateInstanceInformationByDeviceObject_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* deviceobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t arg1Index = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t informationclass = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t buffersize = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* bytesreturned = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltEnumerateInstanceInformationByDeviceObject")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(deviceobject, arg1Index, informationclass, buffer, buffersize, bytesreturned);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)deviceobject;
    (void)arg1Index;
    (void)informationclass;
    (void)buffer;
    (void)buffersize;
    (void)bytesreturned;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltEnumerateInstanceInformationByFilter_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t filter = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint32_t arg1Index = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t informationclass = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t buffersize = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* bytesreturned = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltEnumerateInstanceInformationByFilter")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(filter, arg1Index, informationclass, buffer, buffersize, bytesreturned);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filter;
    (void)arg1Index;
    (void)informationclass;
    (void)buffer;
    (void)buffersize;
    (void)bytesreturned;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltEnumerateInstanceInformationByVolume_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t volume = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint32_t arg1Index = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t informationclass = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t buffersize = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* bytesreturned = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltEnumerateInstanceInformationByVolume")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(volume, arg1Index, informationclass, buffer, buffersize, bytesreturned);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)volume;
    (void)arg1Index;
    (void)informationclass;
    (void)buffer;
    (void)buffersize;
    (void)bytesreturned;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltEnumerateInstanceInformationByVolumeName_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* volumename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t arg1Index = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t informationclass = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t buffersize = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* bytesreturned = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltEnumerateInstanceInformationByVolumeName")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(volumename, arg1Index, informationclass, buffer, buffersize, bytesreturned);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)volumename;
    (void)arg1Index;
    (void)informationclass;
    (void)buffer;
    (void)buffersize;
    (void)bytesreturned;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltEnumerateInstances_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t volume = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t filter = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
    void* instancelist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t instancelistsize = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* numberinstancesreturned = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltEnumerateInstances")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(volume, filter, instancelist, instancelistsize, numberinstancesreturned);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)volume;
    (void)filter;
    (void)instancelist;
    (void)instancelistsize;
    (void)numberinstancesreturned;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltEnumerateVolumeInformation_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t filter = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint32_t arg1Index = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t informationclass = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t buffersize = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* bytesreturned = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltEnumerateVolumeInformation")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(filter, arg1Index, informationclass, buffer, buffersize, bytesreturned);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filter;
    (void)arg1Index;
    (void)informationclass;
    (void)buffer;
    (void)buffersize;
    (void)bytesreturned;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltEnumerateVolumes_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t filter = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* volumelist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t volumelistsize = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* numbervolumesreturned = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltEnumerateVolumes")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(filter, volumelist, volumelistsize, numbervolumesreturned);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filter;
    (void)volumelist;
    (void)volumelistsize;
    (void)numbervolumesreturned;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltFastIoMdlRead_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t initiatinginstance = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* fileobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* fileoffset = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t length = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t lockkey = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* mdlchain = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* iostatus = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltFastIoMdlRead")));
    }
    bool km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(initiatinginstance, fileobject, fileoffset, length, lockkey, mdlchain, iostatus);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)initiatinginstance;
    (void)fileobject;
    (void)fileoffset;
    (void)length;
    (void)lockkey;
    (void)mdlchain;
    (void)iostatus;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltFastIoMdlReadComplete_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t initiatinginstance = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* fileobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* mdlchain = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltFastIoMdlReadComplete")));
    }
    bool km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(initiatinginstance, fileobject, mdlchain);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)initiatinginstance;
    (void)fileobject;
    (void)mdlchain;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltFastIoMdlWriteComplete_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t initiatinginstance = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* fileobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* fileoffset = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* mdlchain = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(int64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltFastIoMdlWriteComplete")));
    }
    bool km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(initiatinginstance, fileobject, fileoffset, mdlchain);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)initiatinginstance;
    (void)fileobject;
    (void)fileoffset;
    (void)mdlchain;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltFastIoPrepareMdlWrite_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t initiatinginstance = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* fileobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* fileoffset = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t length = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t lockkey = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* mdlchain = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* iostatus = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltFastIoPrepareMdlWrite")));
    }
    bool km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(initiatinginstance, fileobject, fileoffset, length, lockkey, mdlchain, iostatus);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)initiatinginstance;
    (void)fileobject;
    (void)fileoffset;
    (void)length;
    (void)lockkey;
    (void)mdlchain;
    (void)iostatus;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltFindExtraCreateParameter_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t filter = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* ecplist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* ecptype = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* ecpcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* ecpcontextsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltFindExtraCreateParameter")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(filter, ecplist, ecptype, ecpcontext, ecpcontextsize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filter;
    (void)ecplist;
    (void)ecptype;
    (void)ecpcontext;
    (void)ecpcontextsize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltFlushBuffers_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t instance = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* fileobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltFlushBuffers")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(instance, fileobject);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)instance;
    (void)fileobject;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltFlushBuffers2_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t instance = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* fileobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t flushtype = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* callbackdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltFlushBuffers2")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(instance, fileobject, flushtype, callbackdata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)instance;
    (void)fileobject;
    (void)flushtype;
    (void)callbackdata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltFreeCallbackData_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* callbackdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltFreeCallbackData")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(callbackdata);
    } else {
        errno = ENOSYS;
    }
#else
    (void)callbackdata;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltFreeDeferredIoWorkItem_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t fltworkitem = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltFreeDeferredIoWorkItem")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(fltworkitem);
    } else {
        errno = ENOSYS;
    }
#else
    (void)fltworkitem;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltFreeExtraCreateParameter_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t filter = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* ecpcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltFreeExtraCreateParameter")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(filter, ecpcontext);
    } else {
        errno = ENOSYS;
    }
#else
    (void)filter;
    (void)ecpcontext;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltFreeExtraCreateParameterList_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t filter = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* ecplist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltFreeExtraCreateParameterList")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(filter, ecplist);
    } else {
        errno = ENOSYS;
    }
#else
    (void)filter;
    (void)ecplist;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltFreeFileLock_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* filelock = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltFreeFileLock")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(filelock);
    } else {
        errno = ENOSYS;
    }
#else
    (void)filelock;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltFreeGenericWorkItem_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t fltworkitem = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltFreeGenericWorkItem")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(fltworkitem);
    } else {
        errno = ENOSYS;
    }
#else
    (void)fltworkitem;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltFreeOpenReparseList_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t filter = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* ecplist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltFreeOpenReparseList")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(filter, ecplist);
    } else {
        errno = ENOSYS;
    }
#else
    (void)filter;
    (void)ecplist;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltFreePoolAlignedWithTag_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t instance = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t tag = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltFreePoolAlignedWithTag")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(instance, buffer, tag);
    } else {
        errno = ENOSYS;
    }
#else
    (void)instance;
    (void)buffer;
    (void)tag;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltFreeSecurityDescriptor_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* securitydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltFreeSecurityDescriptor")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(securitydescriptor);
    } else {
        errno = ENOSYS;
    }
#else
    (void)securitydescriptor;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltFsControlFile_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t instance = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* fileobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t fscontrolcode = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* inputbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t inputbufferlength = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* outputbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    uint32_t outputbufferlength = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    void* lengthreturned = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltFsControlFile")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(instance, fileobject, fscontrolcode, inputbuffer, inputbufferlength, outputbuffer, outputbufferlength, lengthreturned);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)instance;
    (void)fileobject;
    (void)fscontrolcode;
    (void)inputbuffer;
    (void)inputbufferlength;
    (void)outputbuffer;
    (void)outputbufferlength;
    (void)lengthreturned;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltGetActivityIdCallbackData_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* callbackdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* guid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltGetActivityIdCallbackData")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(callbackdata, guid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)callbackdata;
    (void)guid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltGetBottomInstance_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t volume = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* instance = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltGetBottomInstance")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(volume, instance);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)volume;
    (void)instance;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltGetContexts_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* fltobjects = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint16_t desiredcontexts = static_cast<uint16_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* contexts = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint16_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltGetContexts")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(fltobjects, desiredcontexts, contexts);
    } else {
        errno = ENOSYS;
    }
#else
    (void)fltobjects;
    (void)desiredcontexts;
    (void)contexts;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltGetContextsEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* fltobjects = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint16_t desiredcontexts = static_cast<uint16_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint64_t contextssize = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
    void* contexts = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint16_t, uint64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltGetContextsEx")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(fltobjects, desiredcontexts, contextssize, contexts);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)fltobjects;
    (void)desiredcontexts;
    (void)contextssize;
    (void)contexts;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltGetDestinationFileNameInformation_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t instance = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* fileobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* rootdirectory = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* filename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t filenamelength = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    uint32_t nameoptions = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* retfilenameinformation = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltGetDestinationFileNameInformation")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(instance, fileobject, rootdirectory, filename, filenamelength, nameoptions, retfilenameinformation);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)instance;
    (void)fileobject;
    (void)rootdirectory;
    (void)filename;
    (void)filenamelength;
    (void)nameoptions;
    (void)retfilenameinformation;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltGetDeviceObject_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t volume = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* deviceobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltGetDeviceObject")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(volume, deviceobject);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)volume;
    (void)deviceobject;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltGetDiskDeviceObject_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t volume = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* diskdeviceobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltGetDiskDeviceObject")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(volume, diskdeviceobject);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)volume;
    (void)diskdeviceobject;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltGetEcpListFromCallbackData_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t filter = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* callbackdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* ecplist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltGetEcpListFromCallbackData")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(filter, callbackdata, ecplist);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filter;
    (void)callbackdata;
    (void)ecplist;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltGetFileContext_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t instance = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* fileobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* context = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltGetFileContext")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(instance, fileobject, context);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)instance;
    (void)fileobject;
    (void)context;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltGetFileNameInformation_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* callbackdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t nameoptions = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* filenameinformation = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltGetFileNameInformation")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(callbackdata, nameoptions, filenameinformation);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)callbackdata;
    (void)nameoptions;
    (void)filenameinformation;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltGetFileNameInformationUnsafe_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* fileobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int64_t instance = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
    uint32_t nameoptions = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* filenameinformation = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltGetFileNameInformationUnsafe")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(fileobject, instance, nameoptions, filenameinformation);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)fileobject;
    (void)instance;
    (void)nameoptions;
    (void)filenameinformation;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltGetFileSystemType_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* fltobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* filesystemtype = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltGetFileSystemType")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(fltobject, filesystemtype);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)fltobject;
    (void)filesystemtype;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltGetFilterFromInstance_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t instance = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* retfilter = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltGetFilterFromInstance")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(instance, retfilter);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)instance;
    (void)retfilter;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltGetFilterFromName_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* filtername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* retfilter = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltGetFilterFromName")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(filtername, retfilter);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filtername;
    (void)retfilter;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltGetFilterInformation_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t filter = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int32_t informationclass = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t buffersize = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* bytesreturned = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltGetFilterInformation")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(filter, informationclass, buffer, buffersize, bytesreturned);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filter;
    (void)informationclass;
    (void)buffer;
    (void)buffersize;
    (void)bytesreturned;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltGetFsZeroingOffset_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* data = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* zeroingoffset = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltGetFsZeroingOffset")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(data, zeroingoffset);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)data;
    (void)zeroingoffset;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltGetInstanceContext_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t instance = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* context = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltGetInstanceContext")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(instance, context);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)instance;
    (void)context;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltGetInstanceInformation_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t instance = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int32_t informationclass = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t buffersize = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* bytesreturned = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltGetInstanceInformation")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(instance, informationclass, buffer, buffersize, bytesreturned);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)instance;
    (void)informationclass;
    (void)buffer;
    (void)buffersize;
    (void)bytesreturned;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltGetIoAttributionHandleFromCallbackData_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* data = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltGetIoAttributionHandleFromCallbackData")));
    }
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(data);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
#else
    (void)data;
    errno = ENOSYS;
    void* km_res = nullptr;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltGetIoPriorityHint_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* data = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltGetIoPriorityHint")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(data);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)data;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltGetIoPriorityHintFromCallbackData_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* data = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltGetIoPriorityHintFromCallbackData")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(data);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)data;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltGetIoPriorityHintFromFileObject_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* fileobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltGetIoPriorityHintFromFileObject")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(fileobject);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)fileobject;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltGetIoPriorityHintFromThread_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t thread = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltGetIoPriorityHintFromThread")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(thread);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)thread;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltGetIrpName_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint8_t irpmajorcode = static_cast<uint8_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint8_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltGetIrpName")));
    }
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(irpmajorcode);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
#else
    (void)irpmajorcode;
    errno = ENOSYS;
    void* km_res = nullptr;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltGetLowerInstance_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t currentinstance = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* lowerinstance = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltGetLowerInstance")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(currentinstance, lowerinstance);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)currentinstance;
    (void)lowerinstance;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltGetNewSystemBufferAddress_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* callbackdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltGetNewSystemBufferAddress")));
    }
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(callbackdata);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
#else
    (void)callbackdata;
    errno = ENOSYS;
    void* km_res = nullptr;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltGetNextExtraCreateParameter_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t filter = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* ecplist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* currentecpcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* nextecptype = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* nextecpcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* nextecpcontextsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltGetNextExtraCreateParameter")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(filter, ecplist, currentecpcontext, nextecptype, nextecpcontext, nextecpcontextsize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filter;
    (void)ecplist;
    (void)currentecpcontext;
    (void)nextecptype;
    (void)nextecpcontext;
    (void)nextecpcontextsize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltGetRequestorProcess_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* callbackdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltGetRequestorProcess")));
    }
    int64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(callbackdata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)callbackdata;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltGetRequestorProcessId_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* callbackdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltGetRequestorProcessId")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(callbackdata);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)callbackdata;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltGetRequestorProcessIdEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* callbackdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltGetRequestorProcessIdEx")));
    }
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(callbackdata);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
#else
    (void)callbackdata;
    errno = ENOSYS;
    void* km_res = nullptr;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltGetRequestorSessionId_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* callbackdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* sessionid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltGetRequestorSessionId")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(callbackdata, sessionid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)callbackdata;
    (void)sessionid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltGetRoutineAddress_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* fltmgrroutinename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltGetRoutineAddress")));
    }
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(fltmgrroutinename);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
#else
    (void)fltmgrroutinename;
    errno = ENOSYS;
    void* km_res = nullptr;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltGetSectionContext_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t instance = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* fileobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* context = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltGetSectionContext")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(instance, fileobject, context);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)instance;
    (void)fileobject;
    (void)context;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltGetStreamContext_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t instance = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* fileobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* context = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltGetStreamContext")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(instance, fileobject, context);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)instance;
    (void)fileobject;
    (void)context;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltGetStreamHandleContext_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t instance = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* fileobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* context = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltGetStreamHandleContext")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(instance, fileobject, context);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)instance;
    (void)fileobject;
    (void)context;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltGetSwappedBufferMdlAddress_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* callbackdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltGetSwappedBufferMdlAddress")));
    }
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(callbackdata);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
#else
    (void)callbackdata;
    errno = ENOSYS;
    void* km_res = nullptr;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltGetTopInstance_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t volume = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* instance = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltGetTopInstance")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(volume, instance);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)volume;
    (void)instance;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltGetTransactionContext_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t instance = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* transaction = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* context = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltGetTransactionContext")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(instance, transaction, context);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)instance;
    (void)transaction;
    (void)context;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltGetTunneledName_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* callbackdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* filenameinformation = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* rettunneledfilenameinformation = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltGetTunneledName")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(callbackdata, filenameinformation, rettunneledfilenameinformation);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)callbackdata;
    (void)filenameinformation;
    (void)rettunneledfilenameinformation;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltGetUpperInstance_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t currentinstance = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* upperinstance = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltGetUpperInstance")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(currentinstance, upperinstance);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)currentinstance;
    (void)upperinstance;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltGetVolumeContext_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t filter = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t volume = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
    void* context = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltGetVolumeContext")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(filter, volume, context);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filter;
    (void)volume;
    (void)context;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltGetVolumeFromDeviceObject_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t filter = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* deviceobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* retvolume = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltGetVolumeFromDeviceObject")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(filter, deviceobject, retvolume);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filter;
    (void)deviceobject;
    (void)retvolume;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltGetVolumeFromFileObject_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t filter = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* fileobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* retvolume = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltGetVolumeFromFileObject")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(filter, fileobject, retvolume);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filter;
    (void)fileobject;
    (void)retvolume;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltGetVolumeFromInstance_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t instance = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* retvolume = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltGetVolumeFromInstance")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(instance, retvolume);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)instance;
    (void)retvolume;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltGetVolumeFromName_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t filter = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* volumename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* retvolume = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltGetVolumeFromName")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(filter, volumename, retvolume);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filter;
    (void)volumename;
    (void)retvolume;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltGetVolumeGuidName_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t volume = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* volumeguidname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* buffersizeneeded = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltGetVolumeGuidName")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(volume, volumeguidname, buffersizeneeded);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)volume;
    (void)volumeguidname;
    (void)buffersizeneeded;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltGetVolumeInformation_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t volume = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int32_t informationclass = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t buffersize = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* bytesreturned = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltGetVolumeInformation")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(volume, informationclass, buffer, buffersize, bytesreturned);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)volume;
    (void)informationclass;
    (void)buffer;
    (void)buffersize;
    (void)bytesreturned;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltGetVolumeInstanceFromName_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t filter = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t volume = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
    void* instancename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* retinstance = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltGetVolumeInstanceFromName")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(filter, volume, instancename, retinstance);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filter;
    (void)volume;
    (void)instancename;
    (void)retinstance;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltGetVolumeName_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t volume = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* volumename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* buffersizeneeded = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltGetVolumeName")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(volume, volumename, buffersizeneeded);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)volume;
    (void)volumename;
    (void)buffersizeneeded;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltGetVolumeProperties_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t volume = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* volumeproperties = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t volumepropertieslength = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* lengthreturned = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltGetVolumeProperties")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(volume, volumeproperties, volumepropertieslength, lengthreturned);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)volume;
    (void)volumeproperties;
    (void)volumepropertieslength;
    (void)lengthreturned;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltInitExtraCreateParameterLookasideList_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t filter = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* lookaside = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint64_t size = km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0;
    uint32_t tag = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, void*, uint32_t, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltInitExtraCreateParameterLookasideList")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(filter, lookaside, flags, size, tag);
    } else {
        errno = ENOSYS;
    }
#else
    (void)filter;
    (void)lookaside;
    (void)flags;
    (void)size;
    (void)tag;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltInitializeFileLock_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* filelock = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltInitializeFileLock")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(filelock);
    } else {
        errno = ENOSYS;
    }
#else
    (void)filelock;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltInitializeOplock_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* oplock = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltInitializeOplock")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(oplock);
    } else {
        errno = ENOSYS;
    }
#else
    (void)oplock;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltInitializePushLock_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pushlock = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltInitializePushLock")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(pushlock);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pushlock;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltInsertExtraCreateParameter_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t filter = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* ecplist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* ecpcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltInsertExtraCreateParameter")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(filter, ecplist, ecpcontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filter;
    (void)ecplist;
    (void)ecpcontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltIs32bitProcess_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* callbackdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltIs32bitProcess")));
    }
    bool km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(callbackdata);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)callbackdata;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltIsCallbackDataDirty_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* data = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltIsCallbackDataDirty")));
    }
    bool km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(data);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)data;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltIsDirectory_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* fileobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int64_t instance = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
    void* isdirectory = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltIsDirectory")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(fileobject, instance, isdirectory);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)fileobject;
    (void)instance;
    (void)isdirectory;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltIsEcpAcknowledged_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t filter = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* ecpcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltIsEcpAcknowledged")));
    }
    bool km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(filter, ecpcontext);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)filter;
    (void)ecpcontext;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltIsEcpFromUserMode_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t filter = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* ecpcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltIsEcpFromUserMode")));
    }
    bool km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(filter, ecpcontext);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)filter;
    (void)ecpcontext;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltIsFltMgrVolumeDeviceObject_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* deviceobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltIsFltMgrVolumeDeviceObject")));
    }
    bool km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(deviceobject);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)deviceobject;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltIsIoCanceled_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* callbackdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltIsIoCanceled")));
    }
    bool km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(callbackdata);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)callbackdata;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltIsIoRedirectionAllowed_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t sourceinstance = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t targetinstance = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
    void* redirectionallowed = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltIsIoRedirectionAllowed")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sourceinstance, targetinstance, redirectionallowed);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sourceinstance;
    (void)targetinstance;
    (void)redirectionallowed;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltIsIoRedirectionAllowedForOperation_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* data = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int64_t targetinstance = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
    void* redirectionallowedthisio = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* redirectionallowedallio = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltIsIoRedirectionAllowedForOperation")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(data, targetinstance, redirectionallowedthisio, redirectionallowedallio);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)data;
    (void)targetinstance;
    (void)redirectionallowedthisio;
    (void)redirectionallowedallio;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltIsOperationSynchronous_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* callbackdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltIsOperationSynchronous")));
    }
    bool km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(callbackdata);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)callbackdata;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltIsVolumeSnapshot_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* fltobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* issnapshotvolume = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltIsVolumeSnapshot")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(fltobject, issnapshotvolume);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)fltobject;
    (void)issnapshotvolume;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltIsVolumeWritable_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* fltobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* iswritable = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltIsVolumeWritable")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(fltobject, iswritable);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)fltobject;
    (void)iswritable;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltLoadFilter_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* filtername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltLoadFilter")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(filtername);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filtername;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltLockUserBuffer_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* callbackdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltLockUserBuffer")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(callbackdata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)callbackdata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltObjectDereference_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* fltobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltObjectDereference")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(fltobject);
    } else {
        errno = ENOSYS;
    }
#else
    (void)fltobject;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltObjectReference_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* fltobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltObjectReference")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(fltobject);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)fltobject;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltOpenVolume_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t instance = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* volumehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* volumefileobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltOpenVolume")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(instance, volumehandle, volumefileobject);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)instance;
    (void)volumehandle;
    (void)volumefileobject;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltOplockBreakH_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* oplock = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* callbackdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* context = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* waitcompletionroutine = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* prepostcallbackdataroutine = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltOplockBreakH")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(oplock, callbackdata, flags, context, waitcompletionroutine, prepostcallbackdataroutine);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)oplock;
    (void)callbackdata;
    (void)flags;
    (void)context;
    (void)waitcompletionroutine;
    (void)prepostcallbackdataroutine;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltOplockBreakToNone_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* oplock = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* callbackdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* context = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* waitcompletionroutine = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* prepostcallbackdataroutine = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltOplockBreakToNone")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(oplock, callbackdata, context, waitcompletionroutine, prepostcallbackdataroutine);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)oplock;
    (void)callbackdata;
    (void)context;
    (void)waitcompletionroutine;
    (void)prepostcallbackdataroutine;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltOplockBreakToNoneEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* oplock = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* callbackdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* context = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* waitcompletionroutine = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* prepostcallbackdataroutine = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltOplockBreakToNoneEx")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(oplock, callbackdata, flags, context, waitcompletionroutine, prepostcallbackdataroutine);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)oplock;
    (void)callbackdata;
    (void)flags;
    (void)context;
    (void)waitcompletionroutine;
    (void)prepostcallbackdataroutine;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltOplockFsctrl_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* oplock = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* callbackdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t opencount = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltOplockFsctrl")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(oplock, callbackdata, opencount);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)oplock;
    (void)callbackdata;
    (void)opencount;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltOplockFsctrlEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* oplock = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* callbackdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t opencount = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltOplockFsctrlEx")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(oplock, callbackdata, opencount, flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)oplock;
    (void)callbackdata;
    (void)opencount;
    (void)flags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltOplockIsFastIoPossible_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* oplock = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltOplockIsFastIoPossible")));
    }
    bool km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(oplock);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)oplock;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltOplockIsSharedRequest_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* callbackdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltOplockIsSharedRequest")));
    }
    bool km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(callbackdata);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)callbackdata;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltOplockKeysEqual_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* fo1 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* fo2 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltOplockKeysEqual")));
    }
    bool km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(fo1, fo2);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)fo1;
    (void)fo2;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltParseFileName_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* filename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* extension = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* stream = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* finalcomponent = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltParseFileName")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(filename, extension, stream, finalcomponent);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filename;
    (void)extension;
    (void)stream;
    (void)finalcomponent;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltParseFileNameInformation_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* filenameinformation = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltParseFileNameInformation")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(filenameinformation);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filenameinformation;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltPerformAsynchronousIo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* callbackdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* callbackroutine = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* callbackcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltPerformAsynchronousIo")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(callbackdata, callbackroutine, callbackcontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)callbackdata;
    (void)callbackroutine;
    (void)callbackcontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltPerformSynchronousIo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* callbackdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltPerformSynchronousIo")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(callbackdata);
    } else {
        errno = ENOSYS;
    }
#else
    (void)callbackdata;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltPrePrepareComplete_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t instance = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* transaction = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* transactioncontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltPrePrepareComplete")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(instance, transaction, transactioncontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)instance;
    (void)transaction;
    (void)transactioncontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltPrepareComplete_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t instance = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* transaction = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* transactioncontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltPrepareComplete")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(instance, transaction, transactioncontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)instance;
    (void)transaction;
    (void)transactioncontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltPrepareToReuseEcp_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t filter = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* ecpcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltPrepareToReuseEcp")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(filter, ecpcontext);
    } else {
        errno = ENOSYS;
    }
#else
    (void)filter;
    (void)ecpcontext;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltProcessFileLock_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* filelock = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* callbackdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* context = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltProcessFileLock")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(filelock, callbackdata, context);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filelock;
    (void)callbackdata;
    (void)context;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltPropagateActivityIdToThread_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* callbackdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* propagateid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* originalid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltPropagateActivityIdToThread")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(callbackdata, propagateid, originalid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)callbackdata;
    (void)propagateid;
    (void)originalid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltPropagateIrpExtension_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* sourcedata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* targetdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltPropagateIrpExtension")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sourcedata, targetdata, flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sourcedata;
    (void)targetdata;
    (void)flags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltPurgeFileNameInformationCache_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t instance = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* fileobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltPurgeFileNameInformationCache")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(instance, fileobject);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)instance;
    (void)fileobject;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltQueryDirectoryFile_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t instance = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* fileobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* fileinformation = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t length = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    int32_t fileinformationclass = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    bool returnsingleentry = km_info.Length() > 5 ? km_info[5].ToBoolean().Value() : false;
    void* filename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    bool restartscan = km_info.Length() > 7 ? km_info[7].ToBoolean().Value() : false;
    void* lengthreturned = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t, int32_t, bool, void*, bool, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltQueryDirectoryFile")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(instance, fileobject, fileinformation, length, fileinformationclass, returnsingleentry, filename, restartscan, lengthreturned);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)instance;
    (void)fileobject;
    (void)fileinformation;
    (void)length;
    (void)fileinformationclass;
    (void)returnsingleentry;
    (void)filename;
    (void)restartscan;
    (void)lengthreturned;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltQueryDirectoryFileEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t instance = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* fileobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* fileinformation = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t length = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    int32_t fileinformationclass = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    uint32_t queryflags = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* filename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* lengthreturned = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t, int32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltQueryDirectoryFileEx")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(instance, fileobject, fileinformation, length, fileinformationclass, queryflags, filename, lengthreturned);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)instance;
    (void)fileobject;
    (void)fileinformation;
    (void)length;
    (void)fileinformationclass;
    (void)queryflags;
    (void)filename;
    (void)lengthreturned;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltQueryEaFile_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t instance = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* fileobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* returnedeadata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t length = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    bool returnsingleentry = km_info.Length() > 4 ? km_info[4].ToBoolean().Value() : false;
    void* ealist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    uint32_t ealistlength = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    void* eaindex = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    bool restartscan = km_info.Length() > 8 ? km_info[8].ToBoolean().Value() : false;
    void* lengthreturned = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 9 ? km_napi_arg_u64(km_info[9]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t, bool, void*, uint32_t, void*, bool, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltQueryEaFile")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(instance, fileobject, returnedeadata, length, returnsingleentry, ealist, ealistlength, eaindex, restartscan, lengthreturned);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)instance;
    (void)fileobject;
    (void)returnedeadata;
    (void)length;
    (void)returnsingleentry;
    (void)ealist;
    (void)ealistlength;
    (void)eaindex;
    (void)restartscan;
    (void)lengthreturned;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltQueryInformationByName_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t filter = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t instance = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
    void* objectattributes = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* iostatusblock = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* fileinformation = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t length = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    int32_t fileinformationclass = static_cast<int32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    void* drivercontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*, void*, void*, uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltQueryInformationByName")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(filter, instance, objectattributes, iostatusblock, fileinformation, length, fileinformationclass, drivercontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filter;
    (void)instance;
    (void)objectattributes;
    (void)iostatusblock;
    (void)fileinformation;
    (void)length;
    (void)fileinformationclass;
    (void)drivercontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltQueryInformationFile_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t instance = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* fileobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* fileinformation = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t length = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    int32_t fileinformationclass = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* lengthreturned = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltQueryInformationFile")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(instance, fileobject, fileinformation, length, fileinformationclass, lengthreturned);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)instance;
    (void)fileobject;
    (void)fileinformation;
    (void)length;
    (void)fileinformationclass;
    (void)lengthreturned;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltQueryQuotaInformationFile_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t instance = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* fileobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* iostatusblock = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t length = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    bool returnsingleentry = km_info.Length() > 5 ? km_info[5].ToBoolean().Value() : false;
    void* sidlist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    uint32_t sidlistlength = static_cast<uint32_t>(km_info.Length() > 7 ? km_info[7].ToNumber().Int32Value() : 0);
    void* startsid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
    bool restartscan = km_info.Length() > 9 ? km_info[9].ToBoolean().Value() : false;
    void* lengthreturned = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 10 ? km_napi_arg_u64(km_info[10]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*, uint32_t, bool, void*, uint32_t, void*, bool, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltQueryQuotaInformationFile")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(instance, fileobject, iostatusblock, buffer, length, returnsingleentry, sidlist, sidlistlength, startsid, restartscan, lengthreturned);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)instance;
    (void)fileobject;
    (void)iostatusblock;
    (void)buffer;
    (void)length;
    (void)returnsingleentry;
    (void)sidlist;
    (void)sidlistlength;
    (void)startsid;
    (void)restartscan;
    (void)lengthreturned;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltQuerySecurityObject_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t instance = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* fileobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t securityinformation = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* securitydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t length = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* lengthneeded = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltQuerySecurityObject")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(instance, fileobject, securityinformation, securitydescriptor, length, lengthneeded);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)instance;
    (void)fileobject;
    (void)securityinformation;
    (void)securitydescriptor;
    (void)length;
    (void)lengthneeded;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltQueryVolumeInformation_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t instance = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* iosb = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* fsinformation = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t length = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    int32_t fsinformationclass = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltQueryVolumeInformation")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(instance, iosb, fsinformation, length, fsinformationclass);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)instance;
    (void)iosb;
    (void)fsinformation;
    (void)length;
    (void)fsinformationclass;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltQueryVolumeInformationFile_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t instance = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* fileobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* fsinformation = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t length = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    int32_t fsinformationclass = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* lengthreturned = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltQueryVolumeInformationFile")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(instance, fileobject, fsinformation, length, fsinformationclass, lengthreturned);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)instance;
    (void)fileobject;
    (void)fsinformation;
    (void)length;
    (void)fsinformationclass;
    (void)lengthreturned;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltQueueDeferredIoWorkItem_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t fltworkitem = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* data = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* workerroutine = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int32_t queuetype = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* context = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltQueueDeferredIoWorkItem")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(fltworkitem, data, workerroutine, queuetype, context);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)fltworkitem;
    (void)data;
    (void)workerroutine;
    (void)queuetype;
    (void)context;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltQueueGenericWorkItem_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t fltworkitem = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* fltobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* workerroutine = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int32_t queuetype = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* context = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltQueueGenericWorkItem")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(fltworkitem, fltobject, workerroutine, queuetype, context);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)fltworkitem;
    (void)fltobject;
    (void)workerroutine;
    (void)queuetype;
    (void)context;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltReadFile_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t initiatinginstance = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* fileobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* byteoffset = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t length = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* bytesread = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* callbackroutine = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    void* callbackcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltReadFile")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(initiatinginstance, fileobject, byteoffset, length, buffer, flags, bytesread, callbackroutine, callbackcontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)initiatinginstance;
    (void)fileobject;
    (void)byteoffset;
    (void)length;
    (void)buffer;
    (void)flags;
    (void)bytesread;
    (void)callbackroutine;
    (void)callbackcontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltReadFileEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t initiatinginstance = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* fileobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* byteoffset = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t length = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* bytesread = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* callbackroutine = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    void* callbackcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
    void* key = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 9 ? km_napi_arg_u64(km_info[9]) : 0));
    void* mdl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 10 ? km_napi_arg_u64(km_info[10]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t, void*, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltReadFileEx")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(initiatinginstance, fileobject, byteoffset, length, buffer, flags, bytesread, callbackroutine, callbackcontext, key, mdl);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)initiatinginstance;
    (void)fileobject;
    (void)byteoffset;
    (void)length;
    (void)buffer;
    (void)flags;
    (void)bytesread;
    (void)callbackroutine;
    (void)callbackcontext;
    (void)key;
    (void)mdl;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltReferenceContext_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* context = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltReferenceContext")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(context);
    } else {
        errno = ENOSYS;
    }
#else
    (void)context;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltReferenceFileNameInformation_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* filenameinformation = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltReferenceFileNameInformation")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(filenameinformation);
    } else {
        errno = ENOSYS;
    }
#else
    (void)filenameinformation;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltRegisterFilter_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* driver = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* registration = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* retfilter = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltRegisterFilter")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(driver, registration, retfilter);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)driver;
    (void)registration;
    (void)retfilter;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltRegisterForDataScan_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t instance = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltRegisterForDataScan")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(instance);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)instance;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltReissueSynchronousIo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t initiatinginstance = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* callbackdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltReissueSynchronousIo")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(initiatinginstance, callbackdata);
    } else {
        errno = ENOSYS;
    }
#else
    (void)initiatinginstance;
    (void)callbackdata;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltReleaseContext_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* context = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltReleaseContext")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(context);
    } else {
        errno = ENOSYS;
    }
#else
    (void)context;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltReleaseContexts_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* contexts = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltReleaseContexts")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(contexts);
    } else {
        errno = ENOSYS;
    }
#else
    (void)contexts;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltReleaseContextsEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t contextssize = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* contexts = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltReleaseContextsEx")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(contextssize, contexts);
    } else {
        errno = ENOSYS;
    }
#else
    (void)contextssize;
    (void)contexts;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltReleaseFileNameInformation_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* filenameinformation = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltReleaseFileNameInformation")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(filenameinformation);
    } else {
        errno = ENOSYS;
    }
#else
    (void)filenameinformation;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltReleasePushLock_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pushlock = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltReleasePushLock")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(pushlock);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pushlock;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltReleasePushLockEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pushlock = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltReleasePushLockEx")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(pushlock, flags);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pushlock;
    (void)flags;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltReleaseResource_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* resource = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltReleaseResource")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(resource);
    } else {
        errno = ENOSYS;
    }
#else
    (void)resource;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltRemoveExtraCreateParameter_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t filter = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* ecplist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* ecptype = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* ecpcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* ecpcontextsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltRemoveExtraCreateParameter")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(filter, ecplist, ecptype, ecpcontext, ecpcontextsize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filter;
    (void)ecplist;
    (void)ecptype;
    (void)ecpcontext;
    (void)ecpcontextsize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltRemoveOpenReparseEntry_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t filter = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* data = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* openreparseentry = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltRemoveOpenReparseEntry")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(filter, data, openreparseentry);
    } else {
        errno = ENOSYS;
    }
#else
    (void)filter;
    (void)data;
    (void)openreparseentry;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltRequestFileInfoOnCreateCompletion_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t filter = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* data = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t infoclassflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltRequestFileInfoOnCreateCompletion")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(filter, data, infoclassflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filter;
    (void)data;
    (void)infoclassflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltRequestOperationStatusCallback_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* data = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* callbackroutine = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* requestercontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltRequestOperationStatusCallback")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(data, callbackroutine, requestercontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)data;
    (void)callbackroutine;
    (void)requestercontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltRetainSwappedBufferMdlAddress_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* callbackdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltRetainSwappedBufferMdlAddress")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(callbackdata);
    } else {
        errno = ENOSYS;
    }
#else
    (void)callbackdata;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltRetrieveFileInfoOnCreateCompletion_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t filter = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* data = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t infoclass = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* size = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltRetrieveFileInfoOnCreateCompletion")));
    }
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(filter, data, infoclass, size);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
#else
    (void)filter;
    (void)data;
    (void)infoclass;
    (void)size;
    errno = ENOSYS;
    void* km_res = nullptr;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltRetrieveFileInfoOnCreateCompletionEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t filter = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* data = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t infoclass = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* retinfosize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* retinfobuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltRetrieveFileInfoOnCreateCompletionEx")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(filter, data, infoclass, retinfosize, retinfobuffer);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filter;
    (void)data;
    (void)infoclass;
    (void)retinfosize;
    (void)retinfobuffer;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltRetrieveIoPriorityInfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* data = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* fileobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int64_t thread = km_info.Length() > 2 ? km_napi_arg_i64(km_info[2]) : 0;
    void* priorityinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltRetrieveIoPriorityInfo")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(data, fileobject, thread, priorityinfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)data;
    (void)fileobject;
    (void)thread;
    (void)priorityinfo;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltReuseCallbackData_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* callbackdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltReuseCallbackData")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(callbackdata);
    } else {
        errno = ENOSYS;
    }
#else
    (void)callbackdata;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltRollbackComplete_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t instance = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* transaction = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* transactioncontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltRollbackComplete")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(instance, transaction, transactioncontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)instance;
    (void)transaction;
    (void)transactioncontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltRollbackEnlistment_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t instance = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* transaction = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* transactioncontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltRollbackEnlistment")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(instance, transaction, transactioncontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)instance;
    (void)transaction;
    (void)transactioncontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltSendMessage_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t filter = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* clientport = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* senderbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t senderbufferlength = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* replybuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* replylength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* timeout = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltSendMessage")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(filter, clientport, senderbuffer, senderbufferlength, replybuffer, replylength, timeout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filter;
    (void)clientport;
    (void)senderbuffer;
    (void)senderbufferlength;
    (void)replybuffer;
    (void)replylength;
    (void)timeout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltSetActivityIdCallbackData_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* callbackdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* guid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltSetActivityIdCallbackData")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(callbackdata, guid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)callbackdata;
    (void)guid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltSetCallbackDataDirty_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* data = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltSetCallbackDataDirty")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(data);
    } else {
        errno = ENOSYS;
    }
#else
    (void)data;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltSetCancelCompletion_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* callbackdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* canceledcallback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltSetCancelCompletion")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(callbackdata, canceledcallback);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)callbackdata;
    (void)canceledcallback;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltSetEaFile_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t instance = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* fileobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* eabuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t length = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltSetEaFile")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(instance, fileobject, eabuffer, length);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)instance;
    (void)fileobject;
    (void)eabuffer;
    (void)length;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltSetEcpListIntoCallbackData_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t filter = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* callbackdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* ecplist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltSetEcpListIntoCallbackData")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(filter, callbackdata, ecplist);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filter;
    (void)callbackdata;
    (void)ecplist;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltSetFileContext_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t instance = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* fileobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t operation = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* newcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* oldcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltSetFileContext")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(instance, fileobject, operation, newcontext, oldcontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)instance;
    (void)fileobject;
    (void)operation;
    (void)newcontext;
    (void)oldcontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltSetFsZeroingOffset_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* data = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t zeroingoffset = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltSetFsZeroingOffset")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(data, zeroingoffset);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)data;
    (void)zeroingoffset;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltSetFsZeroingOffsetRequired_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* data = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltSetFsZeroingOffsetRequired")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(data);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)data;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltSetInformationFile_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t instance = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* fileobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* fileinformation = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t length = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    int32_t fileinformationclass = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltSetInformationFile")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(instance, fileobject, fileinformation, length, fileinformationclass);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)instance;
    (void)fileobject;
    (void)fileinformation;
    (void)length;
    (void)fileinformationclass;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltSetInstanceContext_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t instance = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int32_t operation = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* newcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* oldcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltSetInstanceContext")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(instance, operation, newcontext, oldcontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)instance;
    (void)operation;
    (void)newcontext;
    (void)oldcontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltSetIoPriorityHintIntoCallbackData_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* data = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t priorityhint = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltSetIoPriorityHintIntoCallbackData")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(data, priorityhint);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)data;
    (void)priorityhint;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltSetIoPriorityHintIntoFileObject_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* fileobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t priorityhint = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltSetIoPriorityHintIntoFileObject")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(fileobject, priorityhint);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)fileobject;
    (void)priorityhint;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltSetIoPriorityHintIntoThread_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t thread = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int32_t priorityhint = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltSetIoPriorityHintIntoThread")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(thread, priorityhint);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)thread;
    (void)priorityhint;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltSetQuotaInformationFile_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t instance = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* fileobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t length = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltSetQuotaInformationFile")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(instance, fileobject, buffer, length);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)instance;
    (void)fileobject;
    (void)buffer;
    (void)length;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltSetSecurityObject_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t instance = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* fileobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t securityinformation = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* securitydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltSetSecurityObject")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(instance, fileobject, securityinformation, securitydescriptor);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)instance;
    (void)fileobject;
    (void)securityinformation;
    (void)securitydescriptor;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltSetStreamContext_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t instance = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* fileobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t operation = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* newcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* oldcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltSetStreamContext")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(instance, fileobject, operation, newcontext, oldcontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)instance;
    (void)fileobject;
    (void)operation;
    (void)newcontext;
    (void)oldcontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltSetStreamHandleContext_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t instance = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* fileobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t operation = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* newcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* oldcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltSetStreamHandleContext")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(instance, fileobject, operation, newcontext, oldcontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)instance;
    (void)fileobject;
    (void)operation;
    (void)newcontext;
    (void)oldcontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltSetTransactionContext_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t instance = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* transaction = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t operation = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* newcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* oldcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltSetTransactionContext")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(instance, transaction, operation, newcontext, oldcontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)instance;
    (void)transaction;
    (void)operation;
    (void)newcontext;
    (void)oldcontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltSetVolumeContext_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t volume = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int32_t operation = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* newcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* oldcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltSetVolumeContext")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(volume, operation, newcontext, oldcontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)volume;
    (void)operation;
    (void)newcontext;
    (void)oldcontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltSetVolumeInformation_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t instance = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* iosb = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* fsinformation = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t length = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    int32_t fsinformationclass = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltSetVolumeInformation")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(instance, iosb, fsinformation, length, fsinformationclass);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)instance;
    (void)iosb;
    (void)fsinformation;
    (void)length;
    (void)fsinformationclass;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltStartFiltering_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t filter = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltStartFiltering")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(filter);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filter;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltSupportsFileContexts_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* fileobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltSupportsFileContexts")));
    }
    bool km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(fileobject);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)fileobject;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltSupportsFileContextsEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* fileobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int64_t instance = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltSupportsFileContextsEx")));
    }
    bool km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(fileobject, instance);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)fileobject;
    (void)instance;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltSupportsStreamContexts_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* fileobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltSupportsStreamContexts")));
    }
    bool km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(fileobject);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)fileobject;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltSupportsStreamHandleContexts_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* fileobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltSupportsStreamHandleContexts")));
    }
    bool km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(fileobject);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)fileobject;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltTagFile_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t initiatinginstance = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* fileobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t filetag = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* guid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* databuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint16_t databufferlength = static_cast<uint16_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, void*, void*, uint16_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltTagFile")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(initiatinginstance, fileobject, filetag, guid, databuffer, databufferlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)initiatinginstance;
    (void)fileobject;
    (void)filetag;
    (void)guid;
    (void)databuffer;
    (void)databufferlength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltTagFileEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t initiatinginstance = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* fileobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t filetag = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* guid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* databuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint16_t databufferlength = static_cast<uint16_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    uint32_t existingfiletag = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    void* existingguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 8 ? km_info[8].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, void*, void*, uint16_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltTagFileEx")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(initiatinginstance, fileobject, filetag, guid, databuffer, databufferlength, existingfiletag, existingguid, flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)initiatinginstance;
    (void)fileobject;
    (void)filetag;
    (void)guid;
    (void)databuffer;
    (void)databufferlength;
    (void)existingfiletag;
    (void)existingguid;
    (void)flags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltUninitializeFileLock_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* filelock = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltUninitializeFileLock")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(filelock);
    } else {
        errno = ENOSYS;
    }
#else
    (void)filelock;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltUninitializeOplock_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* oplock = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltUninitializeOplock")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(oplock);
    } else {
        errno = ENOSYS;
    }
#else
    (void)oplock;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltUnloadFilter_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* filtername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltUnloadFilter")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(filtername);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filtername;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltUnregisterFilter_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t filter = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltUnregisterFilter")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(filter);
    } else {
        errno = ENOSYS;
    }
#else
    (void)filter;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltUntagFile_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t initiatinginstance = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* fileobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t filetag = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* guid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltUntagFile")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(initiatinginstance, fileobject, filetag, guid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)initiatinginstance;
    (void)fileobject;
    (void)filetag;
    (void)guid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltVetoBypassIo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* callbackdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* fltobjects = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t operationstatus = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* failurereason = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltVetoBypassIo")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(callbackdata, fltobjects, operationstatus, failurereason);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)callbackdata;
    (void)fltobjects;
    (void)operationstatus;
    (void)failurereason;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltWriteFile_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t initiatinginstance = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* fileobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* byteoffset = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t length = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* byteswritten = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* callbackroutine = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    void* callbackcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltWriteFile")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(initiatinginstance, fileobject, byteoffset, length, buffer, flags, byteswritten, callbackroutine, callbackcontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)initiatinginstance;
    (void)fileobject;
    (void)byteoffset;
    (void)length;
    (void)buffer;
    (void)flags;
    (void)byteswritten;
    (void)callbackroutine;
    (void)callbackcontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltWriteFileEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t initiatinginstance = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* fileobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* byteoffset = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t length = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* byteswritten = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* callbackroutine = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    void* callbackcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
    void* key = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 9 ? km_napi_arg_u64(km_info[9]) : 0));
    void* mdl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 10 ? km_napi_arg_u64(km_info[10]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t, void*, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltWriteFileEx")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(initiatinginstance, fileobject, byteoffset, length, buffer, flags, byteswritten, callbackroutine, callbackcontext, key, mdl);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)initiatinginstance;
    (void)fileobject;
    (void)byteoffset;
    (void)length;
    (void)buffer;
    (void)flags;
    (void)byteswritten;
    (void)callbackroutine;
    (void)callbackcontext;
    (void)key;
    (void)mdl;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkStorageFilesystemMinifiltersFltpTraceRedirectedFileIo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* originatingfileobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* childcallbackdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltpTraceRedirectedFileIo")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(originatingfileobject, childcallbackdata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)originatingfileobject;
    (void)childcallbackdata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static void register_windows_wdk_storage_filesystem_minifilters_napi(Napi::Env env, Napi::Object exports) {
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltAcknowledgeEcp", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltAcknowledgeEcp_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltAcquirePushLockExclusive", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltAcquirePushLockExclusive_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltAcquirePushLockExclusiveEx", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltAcquirePushLockExclusiveEx_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltAcquirePushLockShared", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltAcquirePushLockShared_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltAcquirePushLockSharedEx", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltAcquirePushLockSharedEx_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltAcquireResourceExclusive", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltAcquireResourceExclusive_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltAcquireResourceShared", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltAcquireResourceShared_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltAddOpenReparseEntry", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltAddOpenReparseEntry_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltAdjustDeviceStackSizeForIoRedirection", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltAdjustDeviceStackSizeForIoRedirection_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltAllocateCallbackData", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltAllocateCallbackData_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltAllocateCallbackDataEx", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltAllocateCallbackDataEx_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltAllocateContext", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltAllocateContext_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltAllocateDeferredIoWorkItem", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltAllocateDeferredIoWorkItem_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltAllocateExtraCreateParameter", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltAllocateExtraCreateParameter_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltAllocateExtraCreateParameterFromLookasideList", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltAllocateExtraCreateParameterFromLookasideList_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltAllocateExtraCreateParameterList", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltAllocateExtraCreateParameterList_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltAllocateFileLock", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltAllocateFileLock_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltAllocateGenericWorkItem", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltAllocateGenericWorkItem_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltAllocatePoolAlignedWithTag", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltAllocatePoolAlignedWithTag_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltApplyPriorityInfoThread", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltApplyPriorityInfoThread_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltAttachVolume", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltAttachVolume_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltAttachVolumeAtAltitude", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltAttachVolumeAtAltitude_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltBuildDefaultSecurityDescriptor", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltBuildDefaultSecurityDescriptor_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltCancelFileOpen", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltCancelFileOpen_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltCancelIo", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltCancelIo_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltCancellableWaitForMultipleObjects", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltCancellableWaitForMultipleObjects_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltCancellableWaitForSingleObject", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltCancellableWaitForSingleObject_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltCbdqDisable", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltCbdqDisable_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltCbdqEnable", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltCbdqEnable_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltCbdqInitialize", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltCbdqInitialize_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltCbdqInsertIo", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltCbdqInsertIo_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltCbdqRemoveIo", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltCbdqRemoveIo_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltCbdqRemoveNextIo", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltCbdqRemoveNextIo_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltCheckAndGrowNameControl", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltCheckAndGrowNameControl_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltCheckLockForReadAccess", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltCheckLockForReadAccess_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltCheckLockForWriteAccess", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltCheckLockForWriteAccess_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltCheckOplock", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltCheckOplock_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltCheckOplockEx", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltCheckOplockEx_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltClearCallbackDataDirty", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltClearCallbackDataDirty_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltClearCancelCompletion", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltClearCancelCompletion_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltClose", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltClose_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltCloseClientPort", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltCloseClientPort_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltCloseCommunicationPort", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltCloseCommunicationPort_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltCloseSectionForDataScan", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltCloseSectionForDataScan_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltCommitComplete", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltCommitComplete_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltCommitFinalizeComplete", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltCommitFinalizeComplete_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltCompareInstanceAltitudes", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltCompareInstanceAltitudes_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltCompletePendedPostOperation", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltCompletePendedPostOperation_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltCompletePendedPreOperation", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltCompletePendedPreOperation_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltCopyOpenReparseList", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltCopyOpenReparseList_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltCreateCommunicationPort", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltCreateCommunicationPort_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltCreateFile", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltCreateFile_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltCreateFileEx", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltCreateFileEx_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltCreateFileEx2", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltCreateFileEx2_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltCreateMailslotFile", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltCreateMailslotFile_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltCreateNamedPipeFile", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltCreateNamedPipeFile_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltCreateSectionForDataScan", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltCreateSectionForDataScan_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltCreateSystemVolumeInformationFolder", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltCreateSystemVolumeInformationFolder_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltCurrentBatchOplock", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltCurrentBatchOplock_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltCurrentOplock", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltCurrentOplock_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltCurrentOplockH", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltCurrentOplockH_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltDecodeParameters", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltDecodeParameters_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltDeleteContext", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltDeleteContext_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltDeleteExtraCreateParameterLookasideList", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltDeleteExtraCreateParameterLookasideList_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltDeleteFileContext", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltDeleteFileContext_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltDeleteInstanceContext", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltDeleteInstanceContext_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltDeletePushLock", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltDeletePushLock_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltDeleteStreamContext", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltDeleteStreamContext_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltDeleteStreamHandleContext", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltDeleteStreamHandleContext_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltDeleteTransactionContext", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltDeleteTransactionContext_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltDeleteVolumeContext", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltDeleteVolumeContext_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltDetachVolume", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltDetachVolume_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltDeviceIoControlFile", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltDeviceIoControlFile_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltDoCompletionProcessingWhenSafe", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltDoCompletionProcessingWhenSafe_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltEnlistInTransaction", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltEnlistInTransaction_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltEnumerateFilterInformation", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltEnumerateFilterInformation_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltEnumerateFilters", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltEnumerateFilters_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltEnumerateInstanceInformationByDeviceObject", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltEnumerateInstanceInformationByDeviceObject_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltEnumerateInstanceInformationByFilter", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltEnumerateInstanceInformationByFilter_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltEnumerateInstanceInformationByVolume", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltEnumerateInstanceInformationByVolume_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltEnumerateInstanceInformationByVolumeName", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltEnumerateInstanceInformationByVolumeName_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltEnumerateInstances", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltEnumerateInstances_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltEnumerateVolumeInformation", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltEnumerateVolumeInformation_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltEnumerateVolumes", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltEnumerateVolumes_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltFastIoMdlRead", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltFastIoMdlRead_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltFastIoMdlReadComplete", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltFastIoMdlReadComplete_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltFastIoMdlWriteComplete", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltFastIoMdlWriteComplete_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltFastIoPrepareMdlWrite", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltFastIoPrepareMdlWrite_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltFindExtraCreateParameter", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltFindExtraCreateParameter_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltFlushBuffers", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltFlushBuffers_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltFlushBuffers2", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltFlushBuffers2_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltFreeCallbackData", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltFreeCallbackData_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltFreeDeferredIoWorkItem", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltFreeDeferredIoWorkItem_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltFreeExtraCreateParameter", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltFreeExtraCreateParameter_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltFreeExtraCreateParameterList", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltFreeExtraCreateParameterList_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltFreeFileLock", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltFreeFileLock_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltFreeGenericWorkItem", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltFreeGenericWorkItem_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltFreeOpenReparseList", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltFreeOpenReparseList_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltFreePoolAlignedWithTag", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltFreePoolAlignedWithTag_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltFreeSecurityDescriptor", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltFreeSecurityDescriptor_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltFsControlFile", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltFsControlFile_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltGetActivityIdCallbackData", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltGetActivityIdCallbackData_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltGetBottomInstance", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltGetBottomInstance_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltGetContexts", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltGetContexts_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltGetContextsEx", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltGetContextsEx_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltGetDestinationFileNameInformation", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltGetDestinationFileNameInformation_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltGetDeviceObject", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltGetDeviceObject_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltGetDiskDeviceObject", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltGetDiskDeviceObject_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltGetEcpListFromCallbackData", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltGetEcpListFromCallbackData_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltGetFileContext", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltGetFileContext_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltGetFileNameInformation", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltGetFileNameInformation_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltGetFileNameInformationUnsafe", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltGetFileNameInformationUnsafe_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltGetFileSystemType", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltGetFileSystemType_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltGetFilterFromInstance", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltGetFilterFromInstance_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltGetFilterFromName", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltGetFilterFromName_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltGetFilterInformation", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltGetFilterInformation_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltGetFsZeroingOffset", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltGetFsZeroingOffset_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltGetInstanceContext", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltGetInstanceContext_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltGetInstanceInformation", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltGetInstanceInformation_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltGetIoAttributionHandleFromCallbackData", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltGetIoAttributionHandleFromCallbackData_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltGetIoPriorityHint", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltGetIoPriorityHint_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltGetIoPriorityHintFromCallbackData", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltGetIoPriorityHintFromCallbackData_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltGetIoPriorityHintFromFileObject", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltGetIoPriorityHintFromFileObject_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltGetIoPriorityHintFromThread", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltGetIoPriorityHintFromThread_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltGetIrpName", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltGetIrpName_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltGetLowerInstance", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltGetLowerInstance_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltGetNewSystemBufferAddress", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltGetNewSystemBufferAddress_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltGetNextExtraCreateParameter", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltGetNextExtraCreateParameter_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltGetRequestorProcess", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltGetRequestorProcess_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltGetRequestorProcessId", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltGetRequestorProcessId_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltGetRequestorProcessIdEx", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltGetRequestorProcessIdEx_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltGetRequestorSessionId", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltGetRequestorSessionId_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltGetRoutineAddress", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltGetRoutineAddress_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltGetSectionContext", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltGetSectionContext_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltGetStreamContext", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltGetStreamContext_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltGetStreamHandleContext", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltGetStreamHandleContext_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltGetSwappedBufferMdlAddress", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltGetSwappedBufferMdlAddress_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltGetTopInstance", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltGetTopInstance_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltGetTransactionContext", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltGetTransactionContext_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltGetTunneledName", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltGetTunneledName_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltGetUpperInstance", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltGetUpperInstance_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltGetVolumeContext", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltGetVolumeContext_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltGetVolumeFromDeviceObject", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltGetVolumeFromDeviceObject_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltGetVolumeFromFileObject", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltGetVolumeFromFileObject_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltGetVolumeFromInstance", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltGetVolumeFromInstance_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltGetVolumeFromName", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltGetVolumeFromName_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltGetVolumeGuidName", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltGetVolumeGuidName_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltGetVolumeInformation", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltGetVolumeInformation_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltGetVolumeInstanceFromName", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltGetVolumeInstanceFromName_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltGetVolumeName", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltGetVolumeName_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltGetVolumeProperties", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltGetVolumeProperties_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltInitExtraCreateParameterLookasideList", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltInitExtraCreateParameterLookasideList_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltInitializeFileLock", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltInitializeFileLock_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltInitializeOplock", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltInitializeOplock_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltInitializePushLock", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltInitializePushLock_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltInsertExtraCreateParameter", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltInsertExtraCreateParameter_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltIs32bitProcess", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltIs32bitProcess_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltIsCallbackDataDirty", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltIsCallbackDataDirty_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltIsDirectory", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltIsDirectory_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltIsEcpAcknowledged", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltIsEcpAcknowledged_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltIsEcpFromUserMode", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltIsEcpFromUserMode_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltIsFltMgrVolumeDeviceObject", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltIsFltMgrVolumeDeviceObject_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltIsIoCanceled", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltIsIoCanceled_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltIsIoRedirectionAllowed", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltIsIoRedirectionAllowed_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltIsIoRedirectionAllowedForOperation", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltIsIoRedirectionAllowedForOperation_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltIsOperationSynchronous", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltIsOperationSynchronous_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltIsVolumeSnapshot", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltIsVolumeSnapshot_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltIsVolumeWritable", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltIsVolumeWritable_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltLoadFilter", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltLoadFilter_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltLockUserBuffer", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltLockUserBuffer_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltObjectDereference", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltObjectDereference_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltObjectReference", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltObjectReference_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltOpenVolume", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltOpenVolume_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltOplockBreakH", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltOplockBreakH_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltOplockBreakToNone", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltOplockBreakToNone_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltOplockBreakToNoneEx", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltOplockBreakToNoneEx_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltOplockFsctrl", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltOplockFsctrl_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltOplockFsctrlEx", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltOplockFsctrlEx_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltOplockIsFastIoPossible", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltOplockIsFastIoPossible_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltOplockIsSharedRequest", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltOplockIsSharedRequest_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltOplockKeysEqual", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltOplockKeysEqual_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltParseFileName", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltParseFileName_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltParseFileNameInformation", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltParseFileNameInformation_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltPerformAsynchronousIo", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltPerformAsynchronousIo_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltPerformSynchronousIo", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltPerformSynchronousIo_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltPrePrepareComplete", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltPrePrepareComplete_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltPrepareComplete", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltPrepareComplete_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltPrepareToReuseEcp", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltPrepareToReuseEcp_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltProcessFileLock", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltProcessFileLock_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltPropagateActivityIdToThread", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltPropagateActivityIdToThread_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltPropagateIrpExtension", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltPropagateIrpExtension_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltPurgeFileNameInformationCache", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltPurgeFileNameInformationCache_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltQueryDirectoryFile", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltQueryDirectoryFile_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltQueryDirectoryFileEx", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltQueryDirectoryFileEx_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltQueryEaFile", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltQueryEaFile_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltQueryInformationByName", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltQueryInformationByName_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltQueryInformationFile", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltQueryInformationFile_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltQueryQuotaInformationFile", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltQueryQuotaInformationFile_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltQuerySecurityObject", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltQuerySecurityObject_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltQueryVolumeInformation", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltQueryVolumeInformation_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltQueryVolumeInformationFile", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltQueryVolumeInformationFile_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltQueueDeferredIoWorkItem", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltQueueDeferredIoWorkItem_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltQueueGenericWorkItem", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltQueueGenericWorkItem_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltReadFile", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltReadFile_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltReadFileEx", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltReadFileEx_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltReferenceContext", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltReferenceContext_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltReferenceFileNameInformation", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltReferenceFileNameInformation_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltRegisterFilter", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltRegisterFilter_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltRegisterForDataScan", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltRegisterForDataScan_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltReissueSynchronousIo", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltReissueSynchronousIo_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltReleaseContext", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltReleaseContext_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltReleaseContexts", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltReleaseContexts_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltReleaseContextsEx", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltReleaseContextsEx_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltReleaseFileNameInformation", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltReleaseFileNameInformation_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltReleasePushLock", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltReleasePushLock_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltReleasePushLockEx", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltReleasePushLockEx_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltReleaseResource", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltReleaseResource_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltRemoveExtraCreateParameter", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltRemoveExtraCreateParameter_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltRemoveOpenReparseEntry", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltRemoveOpenReparseEntry_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltRequestFileInfoOnCreateCompletion", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltRequestFileInfoOnCreateCompletion_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltRequestOperationStatusCallback", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltRequestOperationStatusCallback_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltRetainSwappedBufferMdlAddress", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltRetainSwappedBufferMdlAddress_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltRetrieveFileInfoOnCreateCompletion", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltRetrieveFileInfoOnCreateCompletion_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltRetrieveFileInfoOnCreateCompletionEx", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltRetrieveFileInfoOnCreateCompletionEx_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltRetrieveIoPriorityInfo", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltRetrieveIoPriorityInfo_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltReuseCallbackData", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltReuseCallbackData_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltRollbackComplete", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltRollbackComplete_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltRollbackEnlistment", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltRollbackEnlistment_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltSendMessage", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltSendMessage_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltSetActivityIdCallbackData", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltSetActivityIdCallbackData_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltSetCallbackDataDirty", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltSetCallbackDataDirty_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltSetCancelCompletion", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltSetCancelCompletion_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltSetEaFile", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltSetEaFile_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltSetEcpListIntoCallbackData", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltSetEcpListIntoCallbackData_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltSetFileContext", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltSetFileContext_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltSetFsZeroingOffset", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltSetFsZeroingOffset_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltSetFsZeroingOffsetRequired", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltSetFsZeroingOffsetRequired_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltSetInformationFile", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltSetInformationFile_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltSetInstanceContext", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltSetInstanceContext_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltSetIoPriorityHintIntoCallbackData", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltSetIoPriorityHintIntoCallbackData_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltSetIoPriorityHintIntoFileObject", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltSetIoPriorityHintIntoFileObject_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltSetIoPriorityHintIntoThread", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltSetIoPriorityHintIntoThread_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltSetQuotaInformationFile", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltSetQuotaInformationFile_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltSetSecurityObject", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltSetSecurityObject_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltSetStreamContext", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltSetStreamContext_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltSetStreamHandleContext", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltSetStreamHandleContext_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltSetTransactionContext", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltSetTransactionContext_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltSetVolumeContext", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltSetVolumeContext_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltSetVolumeInformation", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltSetVolumeInformation_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltStartFiltering", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltStartFiltering_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltSupportsFileContexts", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltSupportsFileContexts_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltSupportsFileContextsEx", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltSupportsFileContextsEx_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltSupportsStreamContexts", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltSupportsStreamContexts_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltSupportsStreamHandleContexts", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltSupportsStreamHandleContexts_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltTagFile", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltTagFile_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltTagFileEx", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltTagFileEx_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltUninitializeFileLock", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltUninitializeFileLock_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltUninitializeOplock", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltUninitializeOplock_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltUnloadFilter", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltUnloadFilter_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltUnregisterFilter", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltUnregisterFilter_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltUntagFile", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltUntagFile_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltVetoBypassIo", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltVetoBypassIo_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltWriteFile", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltWriteFile_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltWriteFileEx", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltWriteFileEx_napi));
    exports.Set("windowssysWindowsWdkStorageFilesystemMinifiltersFltpTraceRedirectedFileIo", Napi::Function::New(env, windowssysWindowsWdkStorageFilesystemMinifiltersFltpTraceRedirectedFileIo_napi));
}

static KmNapiRegistrarNode registrar_node = { &register_windows_wdk_storage_filesystem_minifilters_napi, nullptr };
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
