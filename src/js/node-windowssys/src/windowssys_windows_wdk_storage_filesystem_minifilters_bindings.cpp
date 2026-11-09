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

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltAcknowledgeEcp_napi(const Napi::CallbackInfo& km_info) {
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
    if (km_fn_ptr != nullptr) km_fn_ptr(filter, ecpcontext);
#else
    (void)filter;
    (void)ecpcontext;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltAcquirePushLockExclusive_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pushlock = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltAcquirePushLockExclusive")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(pushlock);
#else
    (void)pushlock;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltAcquirePushLockExclusiveEx_napi(const Napi::CallbackInfo& km_info) {
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
    if (km_fn_ptr != nullptr) km_fn_ptr(pushlock, flags);
#else
    (void)pushlock;
    (void)flags;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltAcquirePushLockShared_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pushlock = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltAcquirePushLockShared")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(pushlock);
#else
    (void)pushlock;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltAcquirePushLockSharedEx_napi(const Napi::CallbackInfo& km_info) {
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
    if (km_fn_ptr != nullptr) km_fn_ptr(pushlock, flags);
#else
    (void)pushlock;
    (void)flags;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltAcquireResourceExclusive_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* resource = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltAcquireResourceExclusive")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(resource);
#else
    (void)resource;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltAcquireResourceShared_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* resource = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltAcquireResourceShared")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(resource);
#else
    (void)resource;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltAddOpenReparseEntry_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(filter, data, openreparseentry) : -1;
#else
    (void)filter;
    (void)data;
    (void)openreparseentry;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltAdjustDeviceStackSizeForIoRedirection_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sourceinstance, targetinstance, sourcedevicestacksizemodified) : -1;
#else
    (void)sourceinstance;
    (void)targetinstance;
    (void)sourcedevicestacksizemodified;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltAllocateCallbackData_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(instance, fileobject, retnewcallbackdata) : -1;
#else
    (void)instance;
    (void)fileobject;
    (void)retnewcallbackdata;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltAllocateCallbackDataEx_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(instance, fileobject, flags, retnewcallbackdata) : -1;
#else
    (void)instance;
    (void)fileobject;
    (void)flags;
    (void)retnewcallbackdata;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltAllocateContext_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(filter, contexttype, contextsize, pooltype, returnedcontext) : -1;
#else
    (void)filter;
    (void)contexttype;
    (void)contextsize;
    (void)pooltype;
    (void)returnedcontext;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltAllocateDeferredIoWorkItem_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltAllocateDeferredIoWorkItem")));
    }
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr() : -1;
#else
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltAllocateExtraCreateParameterList_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(filter, flags, ecplist) : -1;
#else
    (void)filter;
    (void)flags;
    (void)ecplist;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltAllocateGenericWorkItem_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltAllocateGenericWorkItem")));
    }
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr() : -1;
#else
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltAllocatePoolAlignedWithTag_napi(const Napi::CallbackInfo& km_info) {
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
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(instance, pooltype, numberofbytes, tag) : NULL;
#else
    (void)instance;
    (void)pooltype;
    (void)numberofbytes;
    (void)tag;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltApplyPriorityInfoThread_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(inputpriorityinfo, outputpriorityinfo, thread) : -1;
#else
    (void)inputpriorityinfo;
    (void)outputpriorityinfo;
    (void)thread;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltAttachVolume_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(filter, volume, instancename, retinstance) : -1;
#else
    (void)filter;
    (void)volume;
    (void)instancename;
    (void)retinstance;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltAttachVolumeAtAltitude_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(filter, volume, altitude, instancename, retinstance) : -1;
#else
    (void)filter;
    (void)volume;
    (void)altitude;
    (void)instancename;
    (void)retinstance;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltBuildDefaultSecurityDescriptor_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(securitydescriptor, desiredaccess) : -1;
#else
    (void)securitydescriptor;
    (void)desiredaccess;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltCancelFileOpen_napi(const Napi::CallbackInfo& km_info) {
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
    if (km_fn_ptr != nullptr) km_fn_ptr(instance, fileobject);
#else
    (void)instance;
    (void)fileobject;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltCancelIo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* callbackdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltCancelIo")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(callbackdata) : false;
#else
    (void)callbackdata;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltCancellableWaitForMultipleObjects_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(count, objectarray, waittype, timeout, waitblockarray, callbackdata) : -1;
#else
    (void)count;
    (void)objectarray;
    (void)waittype;
    (void)timeout;
    (void)waitblockarray;
    (void)callbackdata;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltCancellableWaitForSingleObject_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(object, timeout, callbackdata) : -1;
#else
    (void)object;
    (void)timeout;
    (void)callbackdata;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltCbdqDisable_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* cbdq = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltCbdqDisable")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(cbdq);
#else
    (void)cbdq;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltCbdqEnable_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* cbdq = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltCbdqEnable")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(cbdq);
#else
    (void)cbdq;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltCbdqInitialize_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(instance, cbdq, cbdqinsertio, cbdqremoveio, cbdqpeeknextio, cbdqacquire, cbdqrelease, cbdqcompletecanceledio) : -1;
#else
    (void)instance;
    (void)cbdq;
    (void)cbdqinsertio;
    (void)cbdqremoveio;
    (void)cbdqpeeknextio;
    (void)cbdqacquire;
    (void)cbdqrelease;
    (void)cbdqcompletecanceledio;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltCbdqInsertIo_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(cbdq, cbd, context, insertcontext) : -1;
#else
    (void)cbdq;
    (void)cbd;
    (void)context;
    (void)insertcontext;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltCbdqRemoveIo_napi(const Napi::CallbackInfo& km_info) {
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
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(cbdq, context) : NULL;
#else
    (void)cbdq;
    (void)context;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltCbdqRemoveNextIo_napi(const Napi::CallbackInfo& km_info) {
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
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(cbdq, peekcontext) : NULL;
#else
    (void)cbdq;
    (void)peekcontext;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltCheckAndGrowNameControl_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(namectrl, newsize) : -1;
#else
    (void)namectrl;
    (void)newsize;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltCheckLockForReadAccess_napi(const Napi::CallbackInfo& km_info) {
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
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(filelock, callbackdata) : false;
#else
    (void)filelock;
    (void)callbackdata;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltCheckLockForWriteAccess_napi(const Napi::CallbackInfo& km_info) {
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
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(filelock, callbackdata) : false;
#else
    (void)filelock;
    (void)callbackdata;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltCheckOplock_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(oplock, callbackdata, context, waitcompletionroutine, prepostcallbackdataroutine) : -1;
#else
    (void)oplock;
    (void)callbackdata;
    (void)context;
    (void)waitcompletionroutine;
    (void)prepostcallbackdataroutine;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltCheckOplockEx_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(oplock, callbackdata, flags, context, waitcompletionroutine, prepostcallbackdataroutine) : -1;
#else
    (void)oplock;
    (void)callbackdata;
    (void)flags;
    (void)context;
    (void)waitcompletionroutine;
    (void)prepostcallbackdataroutine;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltClearCallbackDataDirty_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* data = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltClearCallbackDataDirty")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(data);
#else
    (void)data;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltClearCancelCompletion_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* callbackdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltClearCancelCompletion")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(callbackdata) : -1;
#else
    (void)callbackdata;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltClose_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* filehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltClose")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(filehandle) : -1;
#else
    (void)filehandle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltCloseClientPort_napi(const Napi::CallbackInfo& km_info) {
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
    if (km_fn_ptr != nullptr) km_fn_ptr(filter, clientport);
#else
    (void)filter;
    (void)clientport;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltCloseCommunicationPort_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t serverport = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltCloseCommunicationPort")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(serverport);
#else
    (void)serverport;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltCloseSectionForDataScan_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* sectioncontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltCloseSectionForDataScan")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sectioncontext) : -1;
#else
    (void)sectioncontext;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltCommitComplete_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(instance, transaction, transactioncontext) : -1;
#else
    (void)instance;
    (void)transaction;
    (void)transactioncontext;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltCommitFinalizeComplete_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(instance, transaction, transactioncontext) : -1;
#else
    (void)instance;
    (void)transaction;
    (void)transactioncontext;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltCompareInstanceAltitudes_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(instance1, instance2) : -1;
#else
    (void)instance1;
    (void)instance2;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltCompletePendedPostOperation_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* callbackdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltCompletePendedPostOperation")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(callbackdata);
#else
    (void)callbackdata;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltCompletePendedPreOperation_napi(const Napi::CallbackInfo& km_info) {
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
    if (km_fn_ptr != nullptr) km_fn_ptr(callbackdata, callbackstatus, context);
#else
    (void)callbackdata;
    (void)callbackstatus;
    (void)context;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltCopyOpenReparseList_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(filter, data, ecplist) : -1;
#else
    (void)filter;
    (void)data;
    (void)ecplist;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltCreateCommunicationPort_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(filter, serverport, objectattributes, serverportcookie, connectnotifycallback, disconnectnotifycallback, messagenotifycallback, maxconnections) : -1;
#else
    (void)filter;
    (void)serverport;
    (void)objectattributes;
    (void)serverportcookie;
    (void)connectnotifycallback;
    (void)disconnectnotifycallback;
    (void)messagenotifycallback;
    (void)maxconnections;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltCreateFile_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(filter, instance, filehandle, desiredaccess, objectattributes, iostatusblock, allocationsize, fileattributes, shareaccess, createdisposition, createoptions, eabuffer, ealength, flags) : -1;
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
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltCreateFileEx_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(filter, instance, filehandle, fileobject, desiredaccess, objectattributes, iostatusblock, allocationsize, fileattributes, shareaccess, createdisposition, createoptions, eabuffer, ealength, flags) : -1;
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
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltCreateFileEx2_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(filter, instance, filehandle, fileobject, desiredaccess, objectattributes, iostatusblock, allocationsize, fileattributes, shareaccess, createdisposition, createoptions, eabuffer, ealength, flags, drivercontext) : -1;
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
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltCreateMailslotFile_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(filter, instance, filehandle, fileobject, desiredaccess, objectattributes, iostatusblock, createoptions, mailslotquota, maximummessagesize, readtimeout, drivercontext) : -1;
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
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltCreateNamedPipeFile_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(filter, instance, filehandle, fileobject, desiredaccess, objectattributes, iostatusblock, shareaccess, createdisposition, createoptions, namedpipetype, readmode, completionmode, maximuminstances, inboundquota, outboundquota, defaulttimeout, drivercontext) : -1;
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
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltCreateSectionForDataScan_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(instance, fileobject, sectioncontext, desiredaccess, objectattributes, maximumsize, sectionpageprotection, allocationattributes, flags, sectionhandle, sectionobject, sectionfilesize) : -1;
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
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltCreateSystemVolumeInformationFolder_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t instance = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltCreateSystemVolumeInformationFolder")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(instance) : -1;
#else
    (void)instance;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltCurrentBatchOplock_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* oplock = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltCurrentBatchOplock")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(oplock) : false;
#else
    (void)oplock;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltCurrentOplock_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* oplock = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltCurrentOplock")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(oplock) : false;
#else
    (void)oplock;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltCurrentOplockH_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* oplock = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltCurrentOplockH")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(oplock) : false;
#else
    (void)oplock;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltDecodeParameters_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(callbackdata, mdladdresspointer, buffer, length, desiredaccess) : -1;
#else
    (void)callbackdata;
    (void)mdladdresspointer;
    (void)buffer;
    (void)length;
    (void)desiredaccess;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltDeleteContext_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* context = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltDeleteContext")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(context);
#else
    (void)context;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltDeleteExtraCreateParameterLookasideList_napi(const Napi::CallbackInfo& km_info) {
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
    if (km_fn_ptr != nullptr) km_fn_ptr(filter, lookaside, flags);
#else
    (void)filter;
    (void)lookaside;
    (void)flags;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltDeleteFileContext_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(instance, fileobject, oldcontext) : -1;
#else
    (void)instance;
    (void)fileobject;
    (void)oldcontext;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltDeleteInstanceContext_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(instance, oldcontext) : -1;
#else
    (void)instance;
    (void)oldcontext;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltDeletePushLock_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pushlock = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltDeletePushLock")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(pushlock);
#else
    (void)pushlock;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltDeleteStreamContext_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(instance, fileobject, oldcontext) : -1;
#else
    (void)instance;
    (void)fileobject;
    (void)oldcontext;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltDeleteStreamHandleContext_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(instance, fileobject, oldcontext) : -1;
#else
    (void)instance;
    (void)fileobject;
    (void)oldcontext;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltDeleteTransactionContext_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(instance, transaction, oldcontext) : -1;
#else
    (void)instance;
    (void)transaction;
    (void)oldcontext;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltDeleteVolumeContext_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(filter, volume, oldcontext) : -1;
#else
    (void)filter;
    (void)volume;
    (void)oldcontext;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltDetachVolume_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(filter, volume, instancename) : -1;
#else
    (void)filter;
    (void)volume;
    (void)instancename;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltDeviceIoControlFile_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(instance, fileobject, iocontrolcode, inputbuffer, inputbufferlength, outputbuffer, outputbufferlength, lengthreturned) : -1;
#else
    (void)instance;
    (void)fileobject;
    (void)iocontrolcode;
    (void)inputbuffer;
    (void)inputbufferlength;
    (void)outputbuffer;
    (void)outputbufferlength;
    (void)lengthreturned;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltDoCompletionProcessingWhenSafe_napi(const Napi::CallbackInfo& km_info) {
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
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(data, fltobjects, completioncontext, flags, safepostcallback, retpostoperationstatus) : false;
#else
    (void)data;
    (void)fltobjects;
    (void)completioncontext;
    (void)flags;
    (void)safepostcallback;
    (void)retpostoperationstatus;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltEnlistInTransaction_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(instance, transaction, transactioncontext, notificationmask) : -1;
#else
    (void)instance;
    (void)transaction;
    (void)transactioncontext;
    (void)notificationmask;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltEnumerateFilterInformation_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t arg_0_index = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(arg_0_index, informationclass, buffer, buffersize, bytesreturned) : -1;
#else
    (void)arg_0_index;
    (void)informationclass;
    (void)buffer;
    (void)buffersize;
    (void)bytesreturned;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltEnumerateFilters_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(filterlist, filterlistsize, numberfiltersreturned) : -1;
#else
    (void)filterlist;
    (void)filterlistsize;
    (void)numberfiltersreturned;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltEnumerateInstanceInformationByDeviceObject_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* deviceobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t arg_1_index = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(deviceobject, arg_1_index, informationclass, buffer, buffersize, bytesreturned) : -1;
#else
    (void)deviceobject;
    (void)arg_1_index;
    (void)informationclass;
    (void)buffer;
    (void)buffersize;
    (void)bytesreturned;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltEnumerateInstanceInformationByFilter_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t filter = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint32_t arg_1_index = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(filter, arg_1_index, informationclass, buffer, buffersize, bytesreturned) : -1;
#else
    (void)filter;
    (void)arg_1_index;
    (void)informationclass;
    (void)buffer;
    (void)buffersize;
    (void)bytesreturned;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltEnumerateInstanceInformationByVolume_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t volume = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint32_t arg_1_index = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(volume, arg_1_index, informationclass, buffer, buffersize, bytesreturned) : -1;
#else
    (void)volume;
    (void)arg_1_index;
    (void)informationclass;
    (void)buffer;
    (void)buffersize;
    (void)bytesreturned;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltEnumerateInstanceInformationByVolumeName_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* volumename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t arg_1_index = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(volumename, arg_1_index, informationclass, buffer, buffersize, bytesreturned) : -1;
#else
    (void)volumename;
    (void)arg_1_index;
    (void)informationclass;
    (void)buffer;
    (void)buffersize;
    (void)bytesreturned;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltEnumerateInstances_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(volume, filter, instancelist, instancelistsize, numberinstancesreturned) : -1;
#else
    (void)volume;
    (void)filter;
    (void)instancelist;
    (void)instancelistsize;
    (void)numberinstancesreturned;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltEnumerateVolumeInformation_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t filter = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint32_t arg_1_index = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(filter, arg_1_index, informationclass, buffer, buffersize, bytesreturned) : -1;
#else
    (void)filter;
    (void)arg_1_index;
    (void)informationclass;
    (void)buffer;
    (void)buffersize;
    (void)bytesreturned;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltEnumerateVolumes_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(filter, volumelist, volumelistsize, numbervolumesreturned) : -1;
#else
    (void)filter;
    (void)volumelist;
    (void)volumelistsize;
    (void)numbervolumesreturned;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltFastIoMdlRead_napi(const Napi::CallbackInfo& km_info) {
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
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(initiatinginstance, fileobject, fileoffset, length, lockkey, mdlchain, iostatus) : false;
#else
    (void)initiatinginstance;
    (void)fileobject;
    (void)fileoffset;
    (void)length;
    (void)lockkey;
    (void)mdlchain;
    (void)iostatus;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltFastIoMdlReadComplete_napi(const Napi::CallbackInfo& km_info) {
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
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(initiatinginstance, fileobject, mdlchain) : false;
#else
    (void)initiatinginstance;
    (void)fileobject;
    (void)mdlchain;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltFastIoMdlWriteComplete_napi(const Napi::CallbackInfo& km_info) {
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
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(initiatinginstance, fileobject, fileoffset, mdlchain) : false;
#else
    (void)initiatinginstance;
    (void)fileobject;
    (void)fileoffset;
    (void)mdlchain;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltFastIoPrepareMdlWrite_napi(const Napi::CallbackInfo& km_info) {
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
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(initiatinginstance, fileobject, fileoffset, length, lockkey, mdlchain, iostatus) : false;
#else
    (void)initiatinginstance;
    (void)fileobject;
    (void)fileoffset;
    (void)length;
    (void)lockkey;
    (void)mdlchain;
    (void)iostatus;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltFindExtraCreateParameter_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(filter, ecplist, ecptype, ecpcontext, ecpcontextsize) : -1;
#else
    (void)filter;
    (void)ecplist;
    (void)ecptype;
    (void)ecpcontext;
    (void)ecpcontextsize;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltFlushBuffers_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(instance, fileobject) : -1;
#else
    (void)instance;
    (void)fileobject;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltFlushBuffers2_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(instance, fileobject, flushtype, callbackdata) : -1;
#else
    (void)instance;
    (void)fileobject;
    (void)flushtype;
    (void)callbackdata;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltFreeCallbackData_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* callbackdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltFreeCallbackData")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(callbackdata);
#else
    (void)callbackdata;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltFreeDeferredIoWorkItem_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t fltworkitem = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltFreeDeferredIoWorkItem")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(fltworkitem);
#else
    (void)fltworkitem;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltFreeExtraCreateParameter_napi(const Napi::CallbackInfo& km_info) {
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
    if (km_fn_ptr != nullptr) km_fn_ptr(filter, ecpcontext);
#else
    (void)filter;
    (void)ecpcontext;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltFreeExtraCreateParameterList_napi(const Napi::CallbackInfo& km_info) {
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
    if (km_fn_ptr != nullptr) km_fn_ptr(filter, ecplist);
#else
    (void)filter;
    (void)ecplist;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltFreeFileLock_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* filelock = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltFreeFileLock")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(filelock);
#else
    (void)filelock;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltFreeGenericWorkItem_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t fltworkitem = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltFreeGenericWorkItem")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(fltworkitem);
#else
    (void)fltworkitem;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltFreeOpenReparseList_napi(const Napi::CallbackInfo& km_info) {
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
    if (km_fn_ptr != nullptr) km_fn_ptr(filter, ecplist);
#else
    (void)filter;
    (void)ecplist;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltFreePoolAlignedWithTag_napi(const Napi::CallbackInfo& km_info) {
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
    if (km_fn_ptr != nullptr) km_fn_ptr(instance, buffer, tag);
#else
    (void)instance;
    (void)buffer;
    (void)tag;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltFreeSecurityDescriptor_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* securitydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltFreeSecurityDescriptor")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(securitydescriptor);
#else
    (void)securitydescriptor;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltFsControlFile_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(instance, fileobject, fscontrolcode, inputbuffer, inputbufferlength, outputbuffer, outputbufferlength, lengthreturned) : -1;
#else
    (void)instance;
    (void)fileobject;
    (void)fscontrolcode;
    (void)inputbuffer;
    (void)inputbufferlength;
    (void)outputbuffer;
    (void)outputbufferlength;
    (void)lengthreturned;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltGetActivityIdCallbackData_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(callbackdata, guid) : -1;
#else
    (void)callbackdata;
    (void)guid;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltGetBottomInstance_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(volume, instance) : -1;
#else
    (void)volume;
    (void)instance;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltGetContexts_napi(const Napi::CallbackInfo& km_info) {
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
    if (km_fn_ptr != nullptr) km_fn_ptr(fltobjects, desiredcontexts, contexts);
#else
    (void)fltobjects;
    (void)desiredcontexts;
    (void)contexts;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltGetContextsEx_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(fltobjects, desiredcontexts, contextssize, contexts) : -1;
#else
    (void)fltobjects;
    (void)desiredcontexts;
    (void)contextssize;
    (void)contexts;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltGetDestinationFileNameInformation_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(instance, fileobject, rootdirectory, filename, filenamelength, nameoptions, retfilenameinformation) : -1;
#else
    (void)instance;
    (void)fileobject;
    (void)rootdirectory;
    (void)filename;
    (void)filenamelength;
    (void)nameoptions;
    (void)retfilenameinformation;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltGetDeviceObject_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(volume, deviceobject) : -1;
#else
    (void)volume;
    (void)deviceobject;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltGetDiskDeviceObject_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(volume, diskdeviceobject) : -1;
#else
    (void)volume;
    (void)diskdeviceobject;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltGetEcpListFromCallbackData_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(filter, callbackdata, ecplist) : -1;
#else
    (void)filter;
    (void)callbackdata;
    (void)ecplist;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltGetFileContext_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(instance, fileobject, context) : -1;
#else
    (void)instance;
    (void)fileobject;
    (void)context;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltGetFileNameInformation_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(callbackdata, nameoptions, filenameinformation) : -1;
#else
    (void)callbackdata;
    (void)nameoptions;
    (void)filenameinformation;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltGetFileNameInformationUnsafe_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(fileobject, instance, nameoptions, filenameinformation) : -1;
#else
    (void)fileobject;
    (void)instance;
    (void)nameoptions;
    (void)filenameinformation;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltGetFileSystemType_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(fltobject, filesystemtype) : -1;
#else
    (void)fltobject;
    (void)filesystemtype;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltGetFilterFromInstance_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(instance, retfilter) : -1;
#else
    (void)instance;
    (void)retfilter;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltGetFilterFromName_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(filtername, retfilter) : -1;
#else
    (void)filtername;
    (void)retfilter;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltGetFilterInformation_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(filter, informationclass, buffer, buffersize, bytesreturned) : -1;
#else
    (void)filter;
    (void)informationclass;
    (void)buffer;
    (void)buffersize;
    (void)bytesreturned;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltGetFsZeroingOffset_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(data, zeroingoffset) : -1;
#else
    (void)data;
    (void)zeroingoffset;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltGetInstanceContext_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(instance, context) : -1;
#else
    (void)instance;
    (void)context;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltGetInstanceInformation_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(instance, informationclass, buffer, buffersize, bytesreturned) : -1;
#else
    (void)instance;
    (void)informationclass;
    (void)buffer;
    (void)buffersize;
    (void)bytesreturned;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltGetIoAttributionHandleFromCallbackData_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* data = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltGetIoAttributionHandleFromCallbackData")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(data) : NULL;
#else
    (void)data;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltGetIoPriorityHint_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* data = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltGetIoPriorityHint")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(data) : -1;
#else
    (void)data;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltGetIoPriorityHintFromCallbackData_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* data = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltGetIoPriorityHintFromCallbackData")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(data) : -1;
#else
    (void)data;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltGetIoPriorityHintFromFileObject_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* fileobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltGetIoPriorityHintFromFileObject")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(fileobject) : -1;
#else
    (void)fileobject;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltGetIoPriorityHintFromThread_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t thread = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltGetIoPriorityHintFromThread")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(thread) : -1;
#else
    (void)thread;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltGetIrpName_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint8_t irpmajorcode = static_cast<uint8_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint8_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltGetIrpName")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(irpmajorcode) : NULL;
#else
    (void)irpmajorcode;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltGetLowerInstance_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(currentinstance, lowerinstance) : -1;
#else
    (void)currentinstance;
    (void)lowerinstance;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltGetNewSystemBufferAddress_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* callbackdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltGetNewSystemBufferAddress")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(callbackdata) : NULL;
#else
    (void)callbackdata;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltGetNextExtraCreateParameter_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(filter, ecplist, currentecpcontext, nextecptype, nextecpcontext, nextecpcontextsize) : -1;
#else
    (void)filter;
    (void)ecplist;
    (void)currentecpcontext;
    (void)nextecptype;
    (void)nextecpcontext;
    (void)nextecpcontextsize;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltGetRequestorProcess_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* callbackdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltGetRequestorProcess")));
    }
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(callbackdata) : -1;
#else
    (void)callbackdata;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltGetRequestorProcessId_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* callbackdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltGetRequestorProcessId")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(callbackdata) : 0;
#else
    (void)callbackdata;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltGetRequestorProcessIdEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* callbackdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltGetRequestorProcessIdEx")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(callbackdata) : NULL;
#else
    (void)callbackdata;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltGetRequestorSessionId_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(callbackdata, sessionid) : -1;
#else
    (void)callbackdata;
    (void)sessionid;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltGetRoutineAddress_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* fltmgrroutinename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltGetRoutineAddress")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(fltmgrroutinename) : NULL;
#else
    (void)fltmgrroutinename;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltGetSectionContext_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(instance, fileobject, context) : -1;
#else
    (void)instance;
    (void)fileobject;
    (void)context;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltGetStreamContext_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(instance, fileobject, context) : -1;
#else
    (void)instance;
    (void)fileobject;
    (void)context;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltGetStreamHandleContext_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(instance, fileobject, context) : -1;
#else
    (void)instance;
    (void)fileobject;
    (void)context;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltGetSwappedBufferMdlAddress_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* callbackdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltGetSwappedBufferMdlAddress")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(callbackdata) : NULL;
#else
    (void)callbackdata;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltGetTopInstance_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(volume, instance) : -1;
#else
    (void)volume;
    (void)instance;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltGetTransactionContext_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(instance, transaction, context) : -1;
#else
    (void)instance;
    (void)transaction;
    (void)context;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltGetTunneledName_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(callbackdata, filenameinformation, rettunneledfilenameinformation) : -1;
#else
    (void)callbackdata;
    (void)filenameinformation;
    (void)rettunneledfilenameinformation;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltGetUpperInstance_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(currentinstance, upperinstance) : -1;
#else
    (void)currentinstance;
    (void)upperinstance;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltGetVolumeContext_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(filter, volume, context) : -1;
#else
    (void)filter;
    (void)volume;
    (void)context;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltGetVolumeFromDeviceObject_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(filter, deviceobject, retvolume) : -1;
#else
    (void)filter;
    (void)deviceobject;
    (void)retvolume;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltGetVolumeFromFileObject_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(filter, fileobject, retvolume) : -1;
#else
    (void)filter;
    (void)fileobject;
    (void)retvolume;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltGetVolumeFromInstance_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(instance, retvolume) : -1;
#else
    (void)instance;
    (void)retvolume;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltGetVolumeFromName_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(filter, volumename, retvolume) : -1;
#else
    (void)filter;
    (void)volumename;
    (void)retvolume;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltGetVolumeGuidName_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(volume, volumeguidname, buffersizeneeded) : -1;
#else
    (void)volume;
    (void)volumeguidname;
    (void)buffersizeneeded;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltGetVolumeInformation_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(volume, informationclass, buffer, buffersize, bytesreturned) : -1;
#else
    (void)volume;
    (void)informationclass;
    (void)buffer;
    (void)buffersize;
    (void)bytesreturned;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltGetVolumeInstanceFromName_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(filter, volume, instancename, retinstance) : -1;
#else
    (void)filter;
    (void)volume;
    (void)instancename;
    (void)retinstance;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltGetVolumeName_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(volume, volumename, buffersizeneeded) : -1;
#else
    (void)volume;
    (void)volumename;
    (void)buffersizeneeded;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltGetVolumeProperties_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(volume, volumeproperties, volumepropertieslength, lengthreturned) : -1;
#else
    (void)volume;
    (void)volumeproperties;
    (void)volumepropertieslength;
    (void)lengthreturned;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltInitExtraCreateParameterLookasideList_napi(const Napi::CallbackInfo& km_info) {
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
    if (km_fn_ptr != nullptr) km_fn_ptr(filter, lookaside, flags, size, tag);
#else
    (void)filter;
    (void)lookaside;
    (void)flags;
    (void)size;
    (void)tag;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltInitializeFileLock_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* filelock = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltInitializeFileLock")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(filelock);
#else
    (void)filelock;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltInitializeOplock_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* oplock = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltInitializeOplock")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(oplock);
#else
    (void)oplock;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltInitializePushLock_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pushlock = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltInitializePushLock")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(pushlock);
#else
    (void)pushlock;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltInsertExtraCreateParameter_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(filter, ecplist, ecpcontext) : -1;
#else
    (void)filter;
    (void)ecplist;
    (void)ecpcontext;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltIs32bitProcess_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* callbackdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltIs32bitProcess")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(callbackdata) : false;
#else
    (void)callbackdata;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltIsCallbackDataDirty_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* data = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltIsCallbackDataDirty")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(data) : false;
#else
    (void)data;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltIsDirectory_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(fileobject, instance, isdirectory) : -1;
#else
    (void)fileobject;
    (void)instance;
    (void)isdirectory;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltIsEcpAcknowledged_napi(const Napi::CallbackInfo& km_info) {
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
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(filter, ecpcontext) : false;
#else
    (void)filter;
    (void)ecpcontext;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltIsEcpFromUserMode_napi(const Napi::CallbackInfo& km_info) {
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
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(filter, ecpcontext) : false;
#else
    (void)filter;
    (void)ecpcontext;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltIsFltMgrVolumeDeviceObject_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* deviceobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltIsFltMgrVolumeDeviceObject")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(deviceobject) : false;
#else
    (void)deviceobject;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltIsIoCanceled_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* callbackdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltIsIoCanceled")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(callbackdata) : false;
#else
    (void)callbackdata;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltIsIoRedirectionAllowed_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sourceinstance, targetinstance, redirectionallowed) : -1;
#else
    (void)sourceinstance;
    (void)targetinstance;
    (void)redirectionallowed;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltIsIoRedirectionAllowedForOperation_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(data, targetinstance, redirectionallowedthisio, redirectionallowedallio) : -1;
#else
    (void)data;
    (void)targetinstance;
    (void)redirectionallowedthisio;
    (void)redirectionallowedallio;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltIsOperationSynchronous_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* callbackdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltIsOperationSynchronous")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(callbackdata) : false;
#else
    (void)callbackdata;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltIsVolumeSnapshot_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(fltobject, issnapshotvolume) : -1;
#else
    (void)fltobject;
    (void)issnapshotvolume;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltIsVolumeWritable_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(fltobject, iswritable) : -1;
#else
    (void)fltobject;
    (void)iswritable;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltLoadFilter_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* filtername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltLoadFilter")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(filtername) : -1;
#else
    (void)filtername;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltLockUserBuffer_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* callbackdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltLockUserBuffer")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(callbackdata) : -1;
#else
    (void)callbackdata;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltObjectDereference_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* fltobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltObjectDereference")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(fltobject);
#else
    (void)fltobject;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltObjectReference_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* fltobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltObjectReference")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(fltobject) : -1;
#else
    (void)fltobject;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltOpenVolume_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(instance, volumehandle, volumefileobject) : -1;
#else
    (void)instance;
    (void)volumehandle;
    (void)volumefileobject;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltOplockBreakH_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(oplock, callbackdata, flags, context, waitcompletionroutine, prepostcallbackdataroutine) : -1;
#else
    (void)oplock;
    (void)callbackdata;
    (void)flags;
    (void)context;
    (void)waitcompletionroutine;
    (void)prepostcallbackdataroutine;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltOplockBreakToNone_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(oplock, callbackdata, context, waitcompletionroutine, prepostcallbackdataroutine) : -1;
#else
    (void)oplock;
    (void)callbackdata;
    (void)context;
    (void)waitcompletionroutine;
    (void)prepostcallbackdataroutine;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltOplockBreakToNoneEx_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(oplock, callbackdata, flags, context, waitcompletionroutine, prepostcallbackdataroutine) : -1;
#else
    (void)oplock;
    (void)callbackdata;
    (void)flags;
    (void)context;
    (void)waitcompletionroutine;
    (void)prepostcallbackdataroutine;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltOplockFsctrl_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(oplock, callbackdata, opencount) : -1;
#else
    (void)oplock;
    (void)callbackdata;
    (void)opencount;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltOplockFsctrlEx_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(oplock, callbackdata, opencount, flags) : -1;
#else
    (void)oplock;
    (void)callbackdata;
    (void)opencount;
    (void)flags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltOplockIsFastIoPossible_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* oplock = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltOplockIsFastIoPossible")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(oplock) : false;
#else
    (void)oplock;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltOplockIsSharedRequest_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* callbackdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltOplockIsSharedRequest")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(callbackdata) : false;
#else
    (void)callbackdata;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltOplockKeysEqual_napi(const Napi::CallbackInfo& km_info) {
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
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(fo1, fo2) : false;
#else
    (void)fo1;
    (void)fo2;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltParseFileName_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(filename, extension, stream, finalcomponent) : -1;
#else
    (void)filename;
    (void)extension;
    (void)stream;
    (void)finalcomponent;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltParseFileNameInformation_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* filenameinformation = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltParseFileNameInformation")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(filenameinformation) : -1;
#else
    (void)filenameinformation;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltPerformAsynchronousIo_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(callbackdata, callbackroutine, callbackcontext) : -1;
#else
    (void)callbackdata;
    (void)callbackroutine;
    (void)callbackcontext;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltPerformSynchronousIo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* callbackdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltPerformSynchronousIo")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(callbackdata);
#else
    (void)callbackdata;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltPrePrepareComplete_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(instance, transaction, transactioncontext) : -1;
#else
    (void)instance;
    (void)transaction;
    (void)transactioncontext;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltPrepareComplete_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(instance, transaction, transactioncontext) : -1;
#else
    (void)instance;
    (void)transaction;
    (void)transactioncontext;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltPrepareToReuseEcp_napi(const Napi::CallbackInfo& km_info) {
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
    if (km_fn_ptr != nullptr) km_fn_ptr(filter, ecpcontext);
#else
    (void)filter;
    (void)ecpcontext;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltProcessFileLock_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(filelock, callbackdata, context) : -1;
#else
    (void)filelock;
    (void)callbackdata;
    (void)context;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltPropagateActivityIdToThread_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(callbackdata, propagateid, originalid) : -1;
#else
    (void)callbackdata;
    (void)propagateid;
    (void)originalid;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltPropagateIrpExtension_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sourcedata, targetdata, flags) : -1;
#else
    (void)sourcedata;
    (void)targetdata;
    (void)flags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltPurgeFileNameInformationCache_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(instance, fileobject) : -1;
#else
    (void)instance;
    (void)fileobject;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltQueryDirectoryFile_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(instance, fileobject, fileinformation, length, fileinformationclass, returnsingleentry, filename, restartscan, lengthreturned) : -1;
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
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltQueryDirectoryFileEx_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(instance, fileobject, fileinformation, length, fileinformationclass, queryflags, filename, lengthreturned) : -1;
#else
    (void)instance;
    (void)fileobject;
    (void)fileinformation;
    (void)length;
    (void)fileinformationclass;
    (void)queryflags;
    (void)filename;
    (void)lengthreturned;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltQueryEaFile_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(instance, fileobject, returnedeadata, length, returnsingleentry, ealist, ealistlength, eaindex, restartscan, lengthreturned) : -1;
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
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltQueryInformationByName_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(filter, instance, objectattributes, iostatusblock, fileinformation, length, fileinformationclass, drivercontext) : -1;
#else
    (void)filter;
    (void)instance;
    (void)objectattributes;
    (void)iostatusblock;
    (void)fileinformation;
    (void)length;
    (void)fileinformationclass;
    (void)drivercontext;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltQueryInformationFile_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(instance, fileobject, fileinformation, length, fileinformationclass, lengthreturned) : -1;
#else
    (void)instance;
    (void)fileobject;
    (void)fileinformation;
    (void)length;
    (void)fileinformationclass;
    (void)lengthreturned;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltQueryQuotaInformationFile_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(instance, fileobject, iostatusblock, buffer, length, returnsingleentry, sidlist, sidlistlength, startsid, restartscan, lengthreturned) : -1;
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
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltQuerySecurityObject_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(instance, fileobject, securityinformation, securitydescriptor, length, lengthneeded) : -1;
#else
    (void)instance;
    (void)fileobject;
    (void)securityinformation;
    (void)securitydescriptor;
    (void)length;
    (void)lengthneeded;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltQueryVolumeInformation_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(instance, iosb, fsinformation, length, fsinformationclass) : -1;
#else
    (void)instance;
    (void)iosb;
    (void)fsinformation;
    (void)length;
    (void)fsinformationclass;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltQueryVolumeInformationFile_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(instance, fileobject, fsinformation, length, fsinformationclass, lengthreturned) : -1;
#else
    (void)instance;
    (void)fileobject;
    (void)fsinformation;
    (void)length;
    (void)fsinformationclass;
    (void)lengthreturned;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltQueueDeferredIoWorkItem_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(fltworkitem, data, workerroutine, queuetype, context) : -1;
#else
    (void)fltworkitem;
    (void)data;
    (void)workerroutine;
    (void)queuetype;
    (void)context;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltQueueGenericWorkItem_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(fltworkitem, fltobject, workerroutine, queuetype, context) : -1;
#else
    (void)fltworkitem;
    (void)fltobject;
    (void)workerroutine;
    (void)queuetype;
    (void)context;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltReadFile_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(initiatinginstance, fileobject, byteoffset, length, buffer, flags, bytesread, callbackroutine, callbackcontext) : -1;
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
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltReadFileEx_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(initiatinginstance, fileobject, byteoffset, length, buffer, flags, bytesread, callbackroutine, callbackcontext, key, mdl) : -1;
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
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltReferenceContext_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* context = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltReferenceContext")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(context);
#else
    (void)context;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltReferenceFileNameInformation_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* filenameinformation = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltReferenceFileNameInformation")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(filenameinformation);
#else
    (void)filenameinformation;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltRegisterFilter_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(driver, registration, retfilter) : -1;
#else
    (void)driver;
    (void)registration;
    (void)retfilter;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltRegisterForDataScan_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t instance = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltRegisterForDataScan")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(instance) : -1;
#else
    (void)instance;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltReissueSynchronousIo_napi(const Napi::CallbackInfo& km_info) {
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
    if (km_fn_ptr != nullptr) km_fn_ptr(initiatinginstance, callbackdata);
#else
    (void)initiatinginstance;
    (void)callbackdata;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltReleaseContext_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* context = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltReleaseContext")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(context);
#else
    (void)context;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltReleaseContexts_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* contexts = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltReleaseContexts")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(contexts);
#else
    (void)contexts;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltReleaseContextsEx_napi(const Napi::CallbackInfo& km_info) {
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
    if (km_fn_ptr != nullptr) km_fn_ptr(contextssize, contexts);
#else
    (void)contextssize;
    (void)contexts;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltReleaseFileNameInformation_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* filenameinformation = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltReleaseFileNameInformation")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(filenameinformation);
#else
    (void)filenameinformation;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltReleasePushLock_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pushlock = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltReleasePushLock")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(pushlock);
#else
    (void)pushlock;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltReleasePushLockEx_napi(const Napi::CallbackInfo& km_info) {
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
    if (km_fn_ptr != nullptr) km_fn_ptr(pushlock, flags);
#else
    (void)pushlock;
    (void)flags;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltReleaseResource_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* resource = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltReleaseResource")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(resource);
#else
    (void)resource;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltRemoveExtraCreateParameter_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(filter, ecplist, ecptype, ecpcontext, ecpcontextsize) : -1;
#else
    (void)filter;
    (void)ecplist;
    (void)ecptype;
    (void)ecpcontext;
    (void)ecpcontextsize;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltRemoveOpenReparseEntry_napi(const Napi::CallbackInfo& km_info) {
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
    if (km_fn_ptr != nullptr) km_fn_ptr(filter, data, openreparseentry);
#else
    (void)filter;
    (void)data;
    (void)openreparseentry;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltRequestFileInfoOnCreateCompletion_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(filter, data, infoclassflags) : -1;
#else
    (void)filter;
    (void)data;
    (void)infoclassflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltRequestOperationStatusCallback_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(data, callbackroutine, requestercontext) : -1;
#else
    (void)data;
    (void)callbackroutine;
    (void)requestercontext;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltRetainSwappedBufferMdlAddress_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* callbackdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltRetainSwappedBufferMdlAddress")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(callbackdata);
#else
    (void)callbackdata;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltRetrieveFileInfoOnCreateCompletion_napi(const Napi::CallbackInfo& km_info) {
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
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(filter, data, infoclass, size) : NULL;
#else
    (void)filter;
    (void)data;
    (void)infoclass;
    (void)size;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltRetrieveFileInfoOnCreateCompletionEx_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(filter, data, infoclass, retinfosize, retinfobuffer) : -1;
#else
    (void)filter;
    (void)data;
    (void)infoclass;
    (void)retinfosize;
    (void)retinfobuffer;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltRetrieveIoPriorityInfo_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(data, fileobject, thread, priorityinfo) : -1;
#else
    (void)data;
    (void)fileobject;
    (void)thread;
    (void)priorityinfo;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltReuseCallbackData_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* callbackdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltReuseCallbackData")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(callbackdata);
#else
    (void)callbackdata;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltRollbackComplete_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(instance, transaction, transactioncontext) : -1;
#else
    (void)instance;
    (void)transaction;
    (void)transactioncontext;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltRollbackEnlistment_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(instance, transaction, transactioncontext) : -1;
#else
    (void)instance;
    (void)transaction;
    (void)transactioncontext;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltSendMessage_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(filter, clientport, senderbuffer, senderbufferlength, replybuffer, replylength, timeout) : -1;
#else
    (void)filter;
    (void)clientport;
    (void)senderbuffer;
    (void)senderbufferlength;
    (void)replybuffer;
    (void)replylength;
    (void)timeout;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltSetActivityIdCallbackData_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(callbackdata, guid) : -1;
#else
    (void)callbackdata;
    (void)guid;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltSetCallbackDataDirty_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* data = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltSetCallbackDataDirty")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(data);
#else
    (void)data;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltSetCancelCompletion_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(callbackdata, canceledcallback) : -1;
#else
    (void)callbackdata;
    (void)canceledcallback;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltSetEaFile_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(instance, fileobject, eabuffer, length) : -1;
#else
    (void)instance;
    (void)fileobject;
    (void)eabuffer;
    (void)length;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltSetEcpListIntoCallbackData_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(filter, callbackdata, ecplist) : -1;
#else
    (void)filter;
    (void)callbackdata;
    (void)ecplist;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltSetFileContext_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(instance, fileobject, operation, newcontext, oldcontext) : -1;
#else
    (void)instance;
    (void)fileobject;
    (void)operation;
    (void)newcontext;
    (void)oldcontext;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltSetFsZeroingOffset_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(data, zeroingoffset) : -1;
#else
    (void)data;
    (void)zeroingoffset;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltSetFsZeroingOffsetRequired_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* data = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltSetFsZeroingOffsetRequired")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(data) : -1;
#else
    (void)data;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltSetInformationFile_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(instance, fileobject, fileinformation, length, fileinformationclass) : -1;
#else
    (void)instance;
    (void)fileobject;
    (void)fileinformation;
    (void)length;
    (void)fileinformationclass;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltSetInstanceContext_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(instance, operation, newcontext, oldcontext) : -1;
#else
    (void)instance;
    (void)operation;
    (void)newcontext;
    (void)oldcontext;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltSetIoPriorityHintIntoCallbackData_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(data, priorityhint) : -1;
#else
    (void)data;
    (void)priorityhint;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltSetIoPriorityHintIntoFileObject_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(fileobject, priorityhint) : -1;
#else
    (void)fileobject;
    (void)priorityhint;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltSetIoPriorityHintIntoThread_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(thread, priorityhint) : -1;
#else
    (void)thread;
    (void)priorityhint;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltSetQuotaInformationFile_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(instance, fileobject, buffer, length) : -1;
#else
    (void)instance;
    (void)fileobject;
    (void)buffer;
    (void)length;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltSetSecurityObject_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(instance, fileobject, securityinformation, securitydescriptor) : -1;
#else
    (void)instance;
    (void)fileobject;
    (void)securityinformation;
    (void)securitydescriptor;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltSetStreamContext_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(instance, fileobject, operation, newcontext, oldcontext) : -1;
#else
    (void)instance;
    (void)fileobject;
    (void)operation;
    (void)newcontext;
    (void)oldcontext;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltSetStreamHandleContext_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(instance, fileobject, operation, newcontext, oldcontext) : -1;
#else
    (void)instance;
    (void)fileobject;
    (void)operation;
    (void)newcontext;
    (void)oldcontext;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltSetTransactionContext_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(instance, transaction, operation, newcontext, oldcontext) : -1;
#else
    (void)instance;
    (void)transaction;
    (void)operation;
    (void)newcontext;
    (void)oldcontext;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltSetVolumeContext_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(volume, operation, newcontext, oldcontext) : -1;
#else
    (void)volume;
    (void)operation;
    (void)newcontext;
    (void)oldcontext;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltSetVolumeInformation_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(instance, iosb, fsinformation, length, fsinformationclass) : -1;
#else
    (void)instance;
    (void)iosb;
    (void)fsinformation;
    (void)length;
    (void)fsinformationclass;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltStartFiltering_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t filter = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltStartFiltering")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(filter) : -1;
#else
    (void)filter;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltSupportsFileContexts_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* fileobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltSupportsFileContexts")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(fileobject) : false;
#else
    (void)fileobject;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltSupportsFileContextsEx_napi(const Napi::CallbackInfo& km_info) {
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
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(fileobject, instance) : false;
#else
    (void)fileobject;
    (void)instance;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltSupportsStreamContexts_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* fileobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltSupportsStreamContexts")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(fileobject) : false;
#else
    (void)fileobject;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltSupportsStreamHandleContexts_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* fileobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltSupportsStreamHandleContexts")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(fileobject) : false;
#else
    (void)fileobject;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltTagFile_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(initiatinginstance, fileobject, filetag, guid, databuffer, databufferlength) : -1;
#else
    (void)initiatinginstance;
    (void)fileobject;
    (void)filetag;
    (void)guid;
    (void)databuffer;
    (void)databufferlength;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltTagFileEx_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(initiatinginstance, fileobject, filetag, guid, databuffer, databufferlength, existingfiletag, existingguid, flags) : -1;
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
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltUninitializeFileLock_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* filelock = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltUninitializeFileLock")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(filelock);
#else
    (void)filelock;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltUninitializeOplock_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* oplock = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltUninitializeOplock")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(oplock);
#else
    (void)oplock;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltUnloadFilter_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* filtername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltUnloadFilter")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(filtername) : -1;
#else
    (void)filtername;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltUnregisterFilter_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t filter = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FltUnregisterFilter")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(filter);
#else
    (void)filter;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltUntagFile_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(initiatinginstance, fileobject, filetag, guid) : -1;
#else
    (void)initiatinginstance;
    (void)fileobject;
    (void)filetag;
    (void)guid;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltVetoBypassIo_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(callbackdata, fltobjects, operationstatus, failurereason) : -1;
#else
    (void)callbackdata;
    (void)fltobjects;
    (void)operationstatus;
    (void)failurereason;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltWriteFile_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(initiatinginstance, fileobject, byteoffset, length, buffer, flags, byteswritten, callbackroutine, callbackcontext) : -1;
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
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltWriteFileEx_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(initiatinginstance, fileobject, byteoffset, length, buffer, flags, byteswritten, callbackroutine, callbackcontext, key, mdl) : -1;
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
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_minifilters_FltpTraceRedirectedFileIo_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(originatingfileobject, childcallbackdata) : -1;
#else
    (void)originatingfileobject;
    (void)childcallbackdata;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static void register_windows_wdk_storage_filesystem_minifilters_napi(Napi::Env env, Napi::Object exports) {
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltAcknowledgeEcp", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltAcknowledgeEcp_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltAcquirePushLockExclusive", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltAcquirePushLockExclusive_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltAcquirePushLockExclusiveEx", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltAcquirePushLockExclusiveEx_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltAcquirePushLockShared", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltAcquirePushLockShared_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltAcquirePushLockSharedEx", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltAcquirePushLockSharedEx_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltAcquireResourceExclusive", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltAcquireResourceExclusive_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltAcquireResourceShared", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltAcquireResourceShared_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltAddOpenReparseEntry", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltAddOpenReparseEntry_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltAdjustDeviceStackSizeForIoRedirection", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltAdjustDeviceStackSizeForIoRedirection_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltAllocateCallbackData", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltAllocateCallbackData_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltAllocateCallbackDataEx", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltAllocateCallbackDataEx_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltAllocateContext", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltAllocateContext_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltAllocateDeferredIoWorkItem", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltAllocateDeferredIoWorkItem_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltAllocateExtraCreateParameterList", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltAllocateExtraCreateParameterList_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltAllocateGenericWorkItem", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltAllocateGenericWorkItem_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltAllocatePoolAlignedWithTag", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltAllocatePoolAlignedWithTag_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltApplyPriorityInfoThread", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltApplyPriorityInfoThread_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltAttachVolume", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltAttachVolume_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltAttachVolumeAtAltitude", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltAttachVolumeAtAltitude_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltBuildDefaultSecurityDescriptor", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltBuildDefaultSecurityDescriptor_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltCancelFileOpen", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltCancelFileOpen_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltCancelIo", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltCancelIo_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltCancellableWaitForMultipleObjects", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltCancellableWaitForMultipleObjects_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltCancellableWaitForSingleObject", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltCancellableWaitForSingleObject_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltCbdqDisable", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltCbdqDisable_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltCbdqEnable", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltCbdqEnable_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltCbdqInitialize", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltCbdqInitialize_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltCbdqInsertIo", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltCbdqInsertIo_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltCbdqRemoveIo", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltCbdqRemoveIo_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltCbdqRemoveNextIo", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltCbdqRemoveNextIo_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltCheckAndGrowNameControl", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltCheckAndGrowNameControl_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltCheckLockForReadAccess", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltCheckLockForReadAccess_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltCheckLockForWriteAccess", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltCheckLockForWriteAccess_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltCheckOplock", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltCheckOplock_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltCheckOplockEx", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltCheckOplockEx_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltClearCallbackDataDirty", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltClearCallbackDataDirty_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltClearCancelCompletion", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltClearCancelCompletion_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltClose", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltClose_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltCloseClientPort", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltCloseClientPort_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltCloseCommunicationPort", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltCloseCommunicationPort_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltCloseSectionForDataScan", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltCloseSectionForDataScan_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltCommitComplete", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltCommitComplete_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltCommitFinalizeComplete", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltCommitFinalizeComplete_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltCompareInstanceAltitudes", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltCompareInstanceAltitudes_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltCompletePendedPostOperation", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltCompletePendedPostOperation_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltCompletePendedPreOperation", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltCompletePendedPreOperation_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltCopyOpenReparseList", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltCopyOpenReparseList_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltCreateCommunicationPort", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltCreateCommunicationPort_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltCreateFile", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltCreateFile_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltCreateFileEx", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltCreateFileEx_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltCreateFileEx2", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltCreateFileEx2_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltCreateMailslotFile", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltCreateMailslotFile_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltCreateNamedPipeFile", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltCreateNamedPipeFile_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltCreateSectionForDataScan", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltCreateSectionForDataScan_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltCreateSystemVolumeInformationFolder", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltCreateSystemVolumeInformationFolder_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltCurrentBatchOplock", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltCurrentBatchOplock_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltCurrentOplock", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltCurrentOplock_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltCurrentOplockH", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltCurrentOplockH_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltDecodeParameters", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltDecodeParameters_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltDeleteContext", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltDeleteContext_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltDeleteExtraCreateParameterLookasideList", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltDeleteExtraCreateParameterLookasideList_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltDeleteFileContext", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltDeleteFileContext_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltDeleteInstanceContext", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltDeleteInstanceContext_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltDeletePushLock", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltDeletePushLock_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltDeleteStreamContext", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltDeleteStreamContext_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltDeleteStreamHandleContext", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltDeleteStreamHandleContext_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltDeleteTransactionContext", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltDeleteTransactionContext_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltDeleteVolumeContext", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltDeleteVolumeContext_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltDetachVolume", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltDetachVolume_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltDeviceIoControlFile", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltDeviceIoControlFile_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltDoCompletionProcessingWhenSafe", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltDoCompletionProcessingWhenSafe_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltEnlistInTransaction", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltEnlistInTransaction_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltEnumerateFilterInformation", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltEnumerateFilterInformation_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltEnumerateFilters", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltEnumerateFilters_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltEnumerateInstanceInformationByDeviceObject", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltEnumerateInstanceInformationByDeviceObject_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltEnumerateInstanceInformationByFilter", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltEnumerateInstanceInformationByFilter_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltEnumerateInstanceInformationByVolume", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltEnumerateInstanceInformationByVolume_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltEnumerateInstanceInformationByVolumeName", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltEnumerateInstanceInformationByVolumeName_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltEnumerateInstances", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltEnumerateInstances_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltEnumerateVolumeInformation", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltEnumerateVolumeInformation_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltEnumerateVolumes", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltEnumerateVolumes_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltFastIoMdlRead", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltFastIoMdlRead_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltFastIoMdlReadComplete", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltFastIoMdlReadComplete_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltFastIoMdlWriteComplete", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltFastIoMdlWriteComplete_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltFastIoPrepareMdlWrite", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltFastIoPrepareMdlWrite_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltFindExtraCreateParameter", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltFindExtraCreateParameter_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltFlushBuffers", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltFlushBuffers_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltFlushBuffers2", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltFlushBuffers2_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltFreeCallbackData", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltFreeCallbackData_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltFreeDeferredIoWorkItem", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltFreeDeferredIoWorkItem_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltFreeExtraCreateParameter", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltFreeExtraCreateParameter_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltFreeExtraCreateParameterList", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltFreeExtraCreateParameterList_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltFreeFileLock", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltFreeFileLock_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltFreeGenericWorkItem", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltFreeGenericWorkItem_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltFreeOpenReparseList", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltFreeOpenReparseList_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltFreePoolAlignedWithTag", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltFreePoolAlignedWithTag_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltFreeSecurityDescriptor", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltFreeSecurityDescriptor_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltFsControlFile", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltFsControlFile_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltGetActivityIdCallbackData", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltGetActivityIdCallbackData_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltGetBottomInstance", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltGetBottomInstance_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltGetContexts", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltGetContexts_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltGetContextsEx", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltGetContextsEx_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltGetDestinationFileNameInformation", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltGetDestinationFileNameInformation_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltGetDeviceObject", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltGetDeviceObject_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltGetDiskDeviceObject", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltGetDiskDeviceObject_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltGetEcpListFromCallbackData", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltGetEcpListFromCallbackData_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltGetFileContext", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltGetFileContext_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltGetFileNameInformation", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltGetFileNameInformation_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltGetFileNameInformationUnsafe", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltGetFileNameInformationUnsafe_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltGetFileSystemType", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltGetFileSystemType_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltGetFilterFromInstance", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltGetFilterFromInstance_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltGetFilterFromName", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltGetFilterFromName_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltGetFilterInformation", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltGetFilterInformation_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltGetFsZeroingOffset", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltGetFsZeroingOffset_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltGetInstanceContext", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltGetInstanceContext_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltGetInstanceInformation", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltGetInstanceInformation_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltGetIoAttributionHandleFromCallbackData", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltGetIoAttributionHandleFromCallbackData_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltGetIoPriorityHint", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltGetIoPriorityHint_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltGetIoPriorityHintFromCallbackData", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltGetIoPriorityHintFromCallbackData_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltGetIoPriorityHintFromFileObject", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltGetIoPriorityHintFromFileObject_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltGetIoPriorityHintFromThread", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltGetIoPriorityHintFromThread_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltGetIrpName", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltGetIrpName_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltGetLowerInstance", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltGetLowerInstance_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltGetNewSystemBufferAddress", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltGetNewSystemBufferAddress_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltGetNextExtraCreateParameter", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltGetNextExtraCreateParameter_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltGetRequestorProcess", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltGetRequestorProcess_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltGetRequestorProcessId", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltGetRequestorProcessId_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltGetRequestorProcessIdEx", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltGetRequestorProcessIdEx_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltGetRequestorSessionId", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltGetRequestorSessionId_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltGetRoutineAddress", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltGetRoutineAddress_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltGetSectionContext", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltGetSectionContext_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltGetStreamContext", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltGetStreamContext_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltGetStreamHandleContext", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltGetStreamHandleContext_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltGetSwappedBufferMdlAddress", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltGetSwappedBufferMdlAddress_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltGetTopInstance", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltGetTopInstance_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltGetTransactionContext", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltGetTransactionContext_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltGetTunneledName", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltGetTunneledName_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltGetUpperInstance", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltGetUpperInstance_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltGetVolumeContext", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltGetVolumeContext_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltGetVolumeFromDeviceObject", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltGetVolumeFromDeviceObject_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltGetVolumeFromFileObject", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltGetVolumeFromFileObject_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltGetVolumeFromInstance", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltGetVolumeFromInstance_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltGetVolumeFromName", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltGetVolumeFromName_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltGetVolumeGuidName", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltGetVolumeGuidName_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltGetVolumeInformation", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltGetVolumeInformation_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltGetVolumeInstanceFromName", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltGetVolumeInstanceFromName_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltGetVolumeName", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltGetVolumeName_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltGetVolumeProperties", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltGetVolumeProperties_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltInitExtraCreateParameterLookasideList", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltInitExtraCreateParameterLookasideList_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltInitializeFileLock", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltInitializeFileLock_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltInitializeOplock", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltInitializeOplock_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltInitializePushLock", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltInitializePushLock_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltInsertExtraCreateParameter", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltInsertExtraCreateParameter_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltIs32bitProcess", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltIs32bitProcess_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltIsCallbackDataDirty", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltIsCallbackDataDirty_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltIsDirectory", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltIsDirectory_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltIsEcpAcknowledged", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltIsEcpAcknowledged_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltIsEcpFromUserMode", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltIsEcpFromUserMode_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltIsFltMgrVolumeDeviceObject", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltIsFltMgrVolumeDeviceObject_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltIsIoCanceled", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltIsIoCanceled_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltIsIoRedirectionAllowed", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltIsIoRedirectionAllowed_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltIsIoRedirectionAllowedForOperation", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltIsIoRedirectionAllowedForOperation_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltIsOperationSynchronous", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltIsOperationSynchronous_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltIsVolumeSnapshot", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltIsVolumeSnapshot_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltIsVolumeWritable", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltIsVolumeWritable_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltLoadFilter", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltLoadFilter_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltLockUserBuffer", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltLockUserBuffer_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltObjectDereference", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltObjectDereference_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltObjectReference", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltObjectReference_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltOpenVolume", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltOpenVolume_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltOplockBreakH", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltOplockBreakH_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltOplockBreakToNone", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltOplockBreakToNone_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltOplockBreakToNoneEx", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltOplockBreakToNoneEx_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltOplockFsctrl", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltOplockFsctrl_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltOplockFsctrlEx", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltOplockFsctrlEx_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltOplockIsFastIoPossible", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltOplockIsFastIoPossible_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltOplockIsSharedRequest", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltOplockIsSharedRequest_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltOplockKeysEqual", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltOplockKeysEqual_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltParseFileName", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltParseFileName_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltParseFileNameInformation", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltParseFileNameInformation_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltPerformAsynchronousIo", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltPerformAsynchronousIo_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltPerformSynchronousIo", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltPerformSynchronousIo_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltPrePrepareComplete", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltPrePrepareComplete_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltPrepareComplete", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltPrepareComplete_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltPrepareToReuseEcp", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltPrepareToReuseEcp_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltProcessFileLock", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltProcessFileLock_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltPropagateActivityIdToThread", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltPropagateActivityIdToThread_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltPropagateIrpExtension", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltPropagateIrpExtension_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltPurgeFileNameInformationCache", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltPurgeFileNameInformationCache_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltQueryDirectoryFile", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltQueryDirectoryFile_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltQueryDirectoryFileEx", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltQueryDirectoryFileEx_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltQueryEaFile", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltQueryEaFile_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltQueryInformationByName", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltQueryInformationByName_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltQueryInformationFile", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltQueryInformationFile_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltQueryQuotaInformationFile", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltQueryQuotaInformationFile_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltQuerySecurityObject", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltQuerySecurityObject_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltQueryVolumeInformation", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltQueryVolumeInformation_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltQueryVolumeInformationFile", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltQueryVolumeInformationFile_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltQueueDeferredIoWorkItem", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltQueueDeferredIoWorkItem_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltQueueGenericWorkItem", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltQueueGenericWorkItem_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltReadFile", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltReadFile_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltReadFileEx", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltReadFileEx_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltReferenceContext", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltReferenceContext_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltReferenceFileNameInformation", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltReferenceFileNameInformation_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltRegisterFilter", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltRegisterFilter_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltRegisterForDataScan", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltRegisterForDataScan_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltReissueSynchronousIo", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltReissueSynchronousIo_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltReleaseContext", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltReleaseContext_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltReleaseContexts", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltReleaseContexts_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltReleaseContextsEx", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltReleaseContextsEx_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltReleaseFileNameInformation", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltReleaseFileNameInformation_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltReleasePushLock", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltReleasePushLock_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltReleasePushLockEx", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltReleasePushLockEx_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltReleaseResource", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltReleaseResource_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltRemoveExtraCreateParameter", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltRemoveExtraCreateParameter_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltRemoveOpenReparseEntry", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltRemoveOpenReparseEntry_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltRequestFileInfoOnCreateCompletion", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltRequestFileInfoOnCreateCompletion_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltRequestOperationStatusCallback", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltRequestOperationStatusCallback_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltRetainSwappedBufferMdlAddress", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltRetainSwappedBufferMdlAddress_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltRetrieveFileInfoOnCreateCompletion", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltRetrieveFileInfoOnCreateCompletion_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltRetrieveFileInfoOnCreateCompletionEx", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltRetrieveFileInfoOnCreateCompletionEx_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltRetrieveIoPriorityInfo", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltRetrieveIoPriorityInfo_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltReuseCallbackData", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltReuseCallbackData_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltRollbackComplete", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltRollbackComplete_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltRollbackEnlistment", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltRollbackEnlistment_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltSendMessage", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltSendMessage_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltSetActivityIdCallbackData", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltSetActivityIdCallbackData_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltSetCallbackDataDirty", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltSetCallbackDataDirty_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltSetCancelCompletion", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltSetCancelCompletion_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltSetEaFile", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltSetEaFile_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltSetEcpListIntoCallbackData", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltSetEcpListIntoCallbackData_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltSetFileContext", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltSetFileContext_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltSetFsZeroingOffset", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltSetFsZeroingOffset_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltSetFsZeroingOffsetRequired", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltSetFsZeroingOffsetRequired_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltSetInformationFile", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltSetInformationFile_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltSetInstanceContext", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltSetInstanceContext_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltSetIoPriorityHintIntoCallbackData", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltSetIoPriorityHintIntoCallbackData_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltSetIoPriorityHintIntoFileObject", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltSetIoPriorityHintIntoFileObject_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltSetIoPriorityHintIntoThread", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltSetIoPriorityHintIntoThread_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltSetQuotaInformationFile", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltSetQuotaInformationFile_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltSetSecurityObject", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltSetSecurityObject_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltSetStreamContext", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltSetStreamContext_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltSetStreamHandleContext", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltSetStreamHandleContext_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltSetTransactionContext", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltSetTransactionContext_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltSetVolumeContext", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltSetVolumeContext_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltSetVolumeInformation", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltSetVolumeInformation_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltStartFiltering", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltStartFiltering_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltSupportsFileContexts", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltSupportsFileContexts_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltSupportsFileContextsEx", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltSupportsFileContextsEx_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltSupportsStreamContexts", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltSupportsStreamContexts_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltSupportsStreamHandleContexts", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltSupportsStreamHandleContexts_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltTagFile", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltTagFile_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltTagFileEx", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltTagFileEx_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltUninitializeFileLock", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltUninitializeFileLock_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltUninitializeOplock", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltUninitializeOplock_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltUnloadFilter", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltUnloadFilter_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltUnregisterFilter", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltUnregisterFilter_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltUntagFile", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltUntagFile_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltVetoBypassIo", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltVetoBypassIo_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltWriteFile", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltWriteFile_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltWriteFileEx", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltWriteFileEx_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_minifilters_FltpTraceRedirectedFileIo", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_minifilters_FltpTraceRedirectedFileIo_napi));
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
