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

static Napi::Value windowssysWindowsWin32SystemHypervisorApplyGuestMemoryFix_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* vmsavedstatedumphandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t vpid = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint64_t virtualaddress = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
    void* fixbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t fixbuffersize = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ApplyGuestMemoryFix")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(vmsavedstatedumphandle, vpid, virtualaddress, fixbuffer, fixbuffersize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)vmsavedstatedumphandle;
    (void)vpid;
    (void)virtualaddress;
    (void)fixbuffer;
    (void)fixbuffersize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemHypervisorApplyPendingSavedStateFileReplayLog_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* vmrsfile = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ApplyPendingSavedStateFileReplayLog")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(vmrsfile);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)vmrsfile;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemHypervisorCallStackUnwind_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* vmsavedstatedumphandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t vpid = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* imageinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t imageinfocount = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t framecount = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* callstack = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CallStackUnwind")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(vmsavedstatedumphandle, vpid, imageinfo, imageinfocount, framecount, callstack);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)vmsavedstatedumphandle;
    (void)vpid;
    (void)imageinfo;
    (void)imageinfocount;
    (void)framecount;
    (void)callstack;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemHypervisorFindSavedStateSymbolFieldInType_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* vmsavedstatedumphandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t vpid = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* arg2Typename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* fieldname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* offset = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* found = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FindSavedStateSymbolFieldInType")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(vmsavedstatedumphandle, vpid, arg2Typename, fieldname, offset, found);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)vmsavedstatedumphandle;
    (void)vpid;
    (void)arg2Typename;
    (void)fieldname;
    (void)offset;
    (void)found;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemHypervisorForceActiveVirtualTrustLevel_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* vmsavedstatedumphandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t vpid = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint8_t virtualtrustlevel = static_cast<uint8_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint8_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ForceActiveVirtualTrustLevel")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(vmsavedstatedumphandle, vpid, virtualtrustlevel);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)vmsavedstatedumphandle;
    (void)vpid;
    (void)virtualtrustlevel;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemHypervisorForceArchitecture_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* vmsavedstatedumphandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t vpid = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t architecture = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ForceArchitecture")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(vmsavedstatedumphandle, vpid, architecture);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)vmsavedstatedumphandle;
    (void)vpid;
    (void)architecture;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemHypervisorForceNestedHostMode_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* vmsavedstatedumphandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t vpid = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t hostmode = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* oldmode = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ForceNestedHostMode")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(vmsavedstatedumphandle, vpid, hostmode, oldmode);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)vmsavedstatedumphandle;
    (void)vpid;
    (void)hostmode;
    (void)oldmode;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemHypervisorForcePagingMode_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* vmsavedstatedumphandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t vpid = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t pagingmode = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ForcePagingMode")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(vmsavedstatedumphandle, vpid, pagingmode);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)vmsavedstatedumphandle;
    (void)vpid;
    (void)pagingmode;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemHypervisorGetActiveVirtualTrustLevel_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* vmsavedstatedumphandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t vpid = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* virtualtrustlevel = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetActiveVirtualTrustLevel")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(vmsavedstatedumphandle, vpid, virtualtrustlevel);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)vmsavedstatedumphandle;
    (void)vpid;
    (void)virtualtrustlevel;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemHypervisorGetArchitecture_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* vmsavedstatedumphandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t vpid = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* architecture = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetArchitecture")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(vmsavedstatedumphandle, vpid, architecture);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)vmsavedstatedumphandle;
    (void)vpid;
    (void)architecture;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemHypervisorGetEnabledVirtualTrustLevels_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* vmsavedstatedumphandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t vpid = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* virtualtrustlevels = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetEnabledVirtualTrustLevels")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(vmsavedstatedumphandle, vpid, virtualtrustlevels);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)vmsavedstatedumphandle;
    (void)vpid;
    (void)virtualtrustlevels;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemHypervisorGetGuestEnabledVirtualTrustLevels_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* vmsavedstatedumphandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* virtualtrustlevels = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetGuestEnabledVirtualTrustLevels")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(vmsavedstatedumphandle, virtualtrustlevels);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)vmsavedstatedumphandle;
    (void)virtualtrustlevels;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemHypervisorGetGuestOsInfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* vmsavedstatedumphandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint8_t virtualtrustlevel = static_cast<uint8_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* guestosinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint8_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetGuestOsInfo")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(vmsavedstatedumphandle, virtualtrustlevel, guestosinfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)vmsavedstatedumphandle;
    (void)virtualtrustlevel;
    (void)guestosinfo;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemHypervisorGetGuestPhysicalMemoryChunks_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* vmsavedstatedumphandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* memorychunkpagesize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* memorychunks = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* memorychunkcount = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetGuestPhysicalMemoryChunks")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(vmsavedstatedumphandle, memorychunkpagesize, memorychunks, memorychunkcount);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)vmsavedstatedumphandle;
    (void)memorychunkpagesize;
    (void)memorychunks;
    (void)memorychunkcount;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemHypervisorGetGuestRawSavedMemorySize_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* vmsavedstatedumphandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* guestrawsavedmemorysize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetGuestRawSavedMemorySize")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(vmsavedstatedumphandle, guestrawsavedmemorysize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)vmsavedstatedumphandle;
    (void)guestrawsavedmemorysize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemHypervisorGetMemoryBlockCacheLimit_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* vmsavedstatedumphandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* memoryblockcachelimit = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetMemoryBlockCacheLimit")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(vmsavedstatedumphandle, memoryblockcachelimit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)vmsavedstatedumphandle;
    (void)memoryblockcachelimit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemHypervisorGetNestedVirtualizationMode_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* vmsavedstatedumphandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t vpid = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* enabled = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetNestedVirtualizationMode")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(vmsavedstatedumphandle, vpid, enabled);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)vmsavedstatedumphandle;
    (void)vpid;
    (void)enabled;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemHypervisorGetPagingMode_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* vmsavedstatedumphandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t vpid = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pagingmode = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetPagingMode")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(vmsavedstatedumphandle, vpid, pagingmode);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)vmsavedstatedumphandle;
    (void)vpid;
    (void)pagingmode;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemHypervisorGetRegisterValue_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* vmsavedstatedumphandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t vpid = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t registerid = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* registervalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetRegisterValue")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(vmsavedstatedumphandle, vpid, registerid, registervalue);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)vmsavedstatedumphandle;
    (void)vpid;
    (void)registerid;
    (void)registervalue;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemHypervisorGetSavedStateSymbolFieldInfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* vmsavedstatedumphandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t vpid = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* arg2Typename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* typefieldinfomap = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetSavedStateSymbolFieldInfo")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(vmsavedstatedumphandle, vpid, arg2Typename, typefieldinfomap);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)vmsavedstatedumphandle;
    (void)vpid;
    (void)arg2Typename;
    (void)typefieldinfomap;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemHypervisorGetSavedStateSymbolProviderHandle_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* vmsavedstatedumphandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetSavedStateSymbolProviderHandle")));
    }
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(vmsavedstatedumphandle);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
#else
    (void)vmsavedstatedumphandle;
    errno = ENOSYS;
    void* km_res = nullptr;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssysWindowsWin32SystemHypervisorGetSavedStateSymbolTypeSize_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* vmsavedstatedumphandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t vpid = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* arg2Typename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* size = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetSavedStateSymbolTypeSize")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(vmsavedstatedumphandle, vpid, arg2Typename, size);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)vmsavedstatedumphandle;
    (void)vpid;
    (void)arg2Typename;
    (void)size;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemHypervisorGetVpCount_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* vmsavedstatedumphandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* vpcount = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetVpCount")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(vmsavedstatedumphandle, vpcount);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)vmsavedstatedumphandle;
    (void)vpcount;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemHypervisorGuestPhysicalAddressToRawSavedMemoryOffset_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* vmsavedstatedumphandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t physicaladdress = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* rawsavedmemoryoffset = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GuestPhysicalAddressToRawSavedMemoryOffset")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(vmsavedstatedumphandle, physicaladdress, rawsavedmemoryoffset);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)vmsavedstatedumphandle;
    (void)physicaladdress;
    (void)rawsavedmemoryoffset;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemHypervisorGuestVirtualAddressToPhysicalAddress_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* vmsavedstatedumphandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t vpid = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint64_t virtualaddress = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
    void* physicaladdress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* unmappedregionsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GuestVirtualAddressToPhysicalAddress")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(vmsavedstatedumphandle, vpid, virtualaddress, physicaladdress, unmappedregionsize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)vmsavedstatedumphandle;
    (void)vpid;
    (void)virtualaddress;
    (void)physicaladdress;
    (void)unmappedregionsize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemHypervisorHdvCreateDeviceInstance_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* devicehosthandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t devicetype = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* deviceclassid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* deviceinstanceid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* deviceinterface = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* devicecontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* devicehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("vmdevicehost.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HdvCreateDeviceInstance")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(devicehosthandle, devicetype, deviceclassid, deviceinstanceid, deviceinterface, devicecontext, devicehandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)devicehosthandle;
    (void)devicetype;
    (void)deviceclassid;
    (void)deviceinstanceid;
    (void)deviceinterface;
    (void)devicecontext;
    (void)devicehandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemHypervisorHdvCreateGuestMemoryAperture_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* requestor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t guestphysicaladdress = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    uint32_t bytecount = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t writeprotected = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* mappedaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("vmdevicehost.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HdvCreateGuestMemoryAperture")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(requestor, guestphysicaladdress, bytecount, writeprotected, mappedaddress);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)requestor;
    (void)guestphysicaladdress;
    (void)bytecount;
    (void)writeprotected;
    (void)mappedaddress;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemHypervisorHdvCreateSectionBackedMmioRange_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* requestor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t barindex = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint64_t offsetinpages = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
    uint64_t lengthinpages = km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0;
    int32_t mappingflags = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* sectionhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    uint64_t sectionoffsetinpages = km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, uint64_t, uint64_t, int32_t, void*, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("vmdevicehost.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HdvCreateSectionBackedMmioRange")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(requestor, barindex, offsetinpages, lengthinpages, mappingflags, sectionhandle, sectionoffsetinpages);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)requestor;
    (void)barindex;
    (void)offsetinpages;
    (void)lengthinpages;
    (void)mappingflags;
    (void)sectionhandle;
    (void)sectionoffsetinpages;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemHypervisorHdvDeliverGuestInterrupt_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* requestor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t msiaddress = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    uint32_t msidata = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("vmdevicehost.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HdvDeliverGuestInterrupt")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(requestor, msiaddress, msidata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)requestor;
    (void)msiaddress;
    (void)msidata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemHypervisorHdvDestroyGuestMemoryAperture_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* requestor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* mappedaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("vmdevicehost.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HdvDestroyGuestMemoryAperture")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(requestor, mappedaddress);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)requestor;
    (void)mappedaddress;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemHypervisorHdvDestroySectionBackedMmioRange_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* requestor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t barindex = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint64_t offsetinpages = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("vmdevicehost.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HdvDestroySectionBackedMmioRange")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(requestor, barindex, offsetinpages);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)requestor;
    (void)barindex;
    (void)offsetinpages;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemHypervisorHdvInitializeDeviceHost_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* computesystem = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* devicehosthandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("vmdevicehost.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HdvInitializeDeviceHost")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(computesystem, devicehosthandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)computesystem;
    (void)devicehosthandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemHypervisorHdvInitializeDeviceHostEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* computesystem = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t flags = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* devicehosthandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("vmdevicehost.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HdvInitializeDeviceHostEx")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(computesystem, flags, devicehosthandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)computesystem;
    (void)flags;
    (void)devicehosthandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemHypervisorHdvReadGuestMemory_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* requestor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t guestphysicaladdress = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    uint32_t bytecount = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("vmdevicehost.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HdvReadGuestMemory")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(requestor, guestphysicaladdress, bytecount, buffer);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)requestor;
    (void)guestphysicaladdress;
    (void)bytecount;
    (void)buffer;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemHypervisorHdvRegisterDoorbell_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* requestor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t barindex = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint64_t baroffset = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
    uint64_t triggervalue = km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0;
    uint64_t flags = km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0;
    void* doorbellevent = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, uint64_t, uint64_t, uint64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("vmdevicehost.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HdvRegisterDoorbell")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(requestor, barindex, baroffset, triggervalue, flags, doorbellevent);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)requestor;
    (void)barindex;
    (void)baroffset;
    (void)triggervalue;
    (void)flags;
    (void)doorbellevent;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemHypervisorHdvTeardownDeviceHost_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* devicehosthandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("vmdevicehost.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HdvTeardownDeviceHost")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(devicehosthandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)devicehosthandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemHypervisorHdvUnregisterDoorbell_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* requestor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t barindex = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint64_t baroffset = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
    uint64_t triggervalue = km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0;
    uint64_t flags = km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, uint64_t, uint64_t, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("vmdevicehost.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HdvUnregisterDoorbell")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(requestor, barindex, baroffset, triggervalue, flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)requestor;
    (void)barindex;
    (void)baroffset;
    (void)triggervalue;
    (void)flags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemHypervisorHdvWriteGuestMemory_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* requestor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t guestphysicaladdress = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    uint32_t bytecount = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("vmdevicehost.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HdvWriteGuestMemory")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(requestor, guestphysicaladdress, bytecount, buffer);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)requestor;
    (void)guestphysicaladdress;
    (void)bytecount;
    (void)buffer;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemHypervisorInKernelSpace_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* vmsavedstatedumphandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t vpid = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* inkernelspace = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "InKernelSpace")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(vmsavedstatedumphandle, vpid, inkernelspace);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)vmsavedstatedumphandle;
    (void)vpid;
    (void)inkernelspace;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemHypervisorIsActiveVirtualTrustLevelEnabled_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* vmsavedstatedumphandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t vpid = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* activevirtualtrustlevelenabled = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IsActiveVirtualTrustLevelEnabled")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(vmsavedstatedumphandle, vpid, activevirtualtrustlevelenabled);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)vmsavedstatedumphandle;
    (void)vpid;
    (void)activevirtualtrustlevelenabled;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemHypervisorIsNestedVirtualizationEnabled_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* vmsavedstatedumphandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* enabled = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IsNestedVirtualizationEnabled")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(vmsavedstatedumphandle, enabled);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)vmsavedstatedumphandle;
    (void)enabled;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemHypervisorLoadSavedStateFile_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* vmrsfile = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* vmsavedstatedumphandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "LoadSavedStateFile")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(vmrsfile, vmsavedstatedumphandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)vmrsfile;
    (void)vmsavedstatedumphandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemHypervisorLoadSavedStateFiles_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* binfile = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* vsvfile = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* vmsavedstatedumphandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "LoadSavedStateFiles")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(binfile, vsvfile, vmsavedstatedumphandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)binfile;
    (void)vsvfile;
    (void)vmsavedstatedumphandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemHypervisorLoadSavedStateModuleSymbols_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* vmsavedstatedumphandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* imagename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* modulename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint64_t baseaddress = km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0;
    uint32_t sizeofbase = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "LoadSavedStateModuleSymbols")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(vmsavedstatedumphandle, imagename, modulename, baseaddress, sizeofbase);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)vmsavedstatedumphandle;
    (void)imagename;
    (void)modulename;
    (void)baseaddress;
    (void)sizeofbase;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemHypervisorLoadSavedStateModuleSymbolsEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* vmsavedstatedumphandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* imagename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t imagetimestamp = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* modulename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint64_t baseaddress = km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0;
    uint32_t sizeofbase = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "LoadSavedStateModuleSymbolsEx")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(vmsavedstatedumphandle, imagename, imagetimestamp, modulename, baseaddress, sizeofbase);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)vmsavedstatedumphandle;
    (void)imagename;
    (void)imagetimestamp;
    (void)modulename;
    (void)baseaddress;
    (void)sizeofbase;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemHypervisorLoadSavedStateSymbolProvider_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* vmsavedstatedumphandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* usersymbols = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t force = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "LoadSavedStateSymbolProvider")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(vmsavedstatedumphandle, usersymbols, force);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)vmsavedstatedumphandle;
    (void)usersymbols;
    (void)force;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemHypervisorLocateSavedStateFiles_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* vmname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* snapshotname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* binpath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* vsvpath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* vmrspath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "LocateSavedStateFiles")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(vmname, snapshotname, binpath, vsvpath, vmrspath);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)vmname;
    (void)snapshotname;
    (void)binpath;
    (void)vsvpath;
    (void)vmrspath;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemHypervisorReadGuestPhysicalAddress_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* vmsavedstatedumphandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t physicaladdress = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t buffersize = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* bytesread = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ReadGuestPhysicalAddress")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(vmsavedstatedumphandle, physicaladdress, buffer, buffersize, bytesread);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)vmsavedstatedumphandle;
    (void)physicaladdress;
    (void)buffer;
    (void)buffersize;
    (void)bytesread;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemHypervisorReadGuestRawSavedMemory_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* vmsavedstatedumphandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t rawsavedmemoryoffset = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t buffersize = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* bytesread = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ReadGuestRawSavedMemory")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(vmsavedstatedumphandle, rawsavedmemoryoffset, buffer, buffersize, bytesread);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)vmsavedstatedumphandle;
    (void)rawsavedmemoryoffset;
    (void)buffer;
    (void)buffersize;
    (void)bytesread;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemHypervisorReadSavedStateGlobalVariable_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* vmsavedstatedumphandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t vpid = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* globalname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t buffersize = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ReadSavedStateGlobalVariable")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(vmsavedstatedumphandle, vpid, globalname, buffer, buffersize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)vmsavedstatedumphandle;
    (void)vpid;
    (void)globalname;
    (void)buffer;
    (void)buffersize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemHypervisorReleaseSavedStateFiles_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* vmsavedstatedumphandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ReleaseSavedStateFiles")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(vmsavedstatedumphandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)vmsavedstatedumphandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemHypervisorReleaseSavedStateSymbolProvider_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* vmsavedstatedumphandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ReleaseSavedStateSymbolProvider")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(vmsavedstatedumphandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)vmsavedstatedumphandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemHypervisorResolveSavedStateGlobalVariableAddress_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* vmsavedstatedumphandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t vpid = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* globalname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* virtualaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* size = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ResolveSavedStateGlobalVariableAddress")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(vmsavedstatedumphandle, vpid, globalname, virtualaddress, size);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)vmsavedstatedumphandle;
    (void)vpid;
    (void)globalname;
    (void)virtualaddress;
    (void)size;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemHypervisorScanMemoryForDosImages_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* vmsavedstatedumphandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t vpid = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint64_t startaddress = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
    uint64_t endaddress = km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0;
    void* callbackcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* foundimagecallback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* standaloneaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    uint32_t standaloneaddresscount = static_cast<uint32_t>(km_info.Length() > 7 ? km_info[7].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint64_t, uint64_t, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ScanMemoryForDosImages")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(vmsavedstatedumphandle, vpid, startaddress, endaddress, callbackcontext, foundimagecallback, standaloneaddress, standaloneaddresscount);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)vmsavedstatedumphandle;
    (void)vpid;
    (void)startaddress;
    (void)endaddress;
    (void)callbackcontext;
    (void)foundimagecallback;
    (void)standaloneaddress;
    (void)standaloneaddresscount;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemHypervisorSetMemoryBlockCacheLimit_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* vmsavedstatedumphandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t memoryblockcachelimit = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetMemoryBlockCacheLimit")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(vmsavedstatedumphandle, memoryblockcachelimit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)vmsavedstatedumphandle;
    (void)memoryblockcachelimit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemHypervisorSetSavedStateSymbolProviderDebugInfoCallback_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* vmsavedstatedumphandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* callback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetSavedStateSymbolProviderDebugInfoCallback")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(vmsavedstatedumphandle, callback);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)vmsavedstatedumphandle;
    (void)callback;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemHypervisorWHvAcceptPartitionMigration_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* migrationhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* partition = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WHvAcceptPartitionMigration")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(migrationhandle, partition);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)migrationhandle;
    (void)partition;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemHypervisorWHvAdviseGpaRange_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t partition = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* gparanges = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t gparangescount = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t advice = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* advicebuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t advicebuffersizeinbytes = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WHvAdviseGpaRange")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(partition, gparanges, gparangescount, advice, advicebuffer, advicebuffersizeinbytes);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)partition;
    (void)gparanges;
    (void)gparangescount;
    (void)advice;
    (void)advicebuffer;
    (void)advicebuffersizeinbytes;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemHypervisorWHvAllocateVpciResource_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* providerid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t flags = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* resourcedescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t resourcedescriptorsizeinbytes = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* vpciresource = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WHvAllocateVpciResource")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(providerid, flags, resourcedescriptor, resourcedescriptorsizeinbytes, vpciresource);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)providerid;
    (void)flags;
    (void)resourcedescriptor;
    (void)resourcedescriptorsizeinbytes;
    (void)vpciresource;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemHypervisorWHvCancelPartitionMigration_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t partition = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WHvCancelPartitionMigration")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(partition);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)partition;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemHypervisorWHvCancelRunVirtualProcessor_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t partition = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint32_t vpindex = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WHvCancelRunVirtualProcessor")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(partition, vpindex, flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)partition;
    (void)vpindex;
    (void)flags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemHypervisorWHvCompletePartitionMigration_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t partition = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WHvCompletePartitionMigration")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(partition);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)partition;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemHypervisorWHvCreateNotificationPort_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t partition = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* parameters = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* eventhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* porthandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WHvCreateNotificationPort")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(partition, parameters, eventhandle, porthandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)partition;
    (void)parameters;
    (void)eventhandle;
    (void)porthandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemHypervisorWHvCreatePartition_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* partition = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WHvCreatePartition")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(partition);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)partition;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemHypervisorWHvCreateTrigger_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t partition = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* parameters = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* triggerhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* eventhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WHvCreateTrigger")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(partition, parameters, triggerhandle, eventhandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)partition;
    (void)parameters;
    (void)triggerhandle;
    (void)eventhandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemHypervisorWHvCreateVirtualProcessor_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t partition = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint32_t vpindex = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WHvCreateVirtualProcessor")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(partition, vpindex, flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)partition;
    (void)vpindex;
    (void)flags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemHypervisorWHvCreateVirtualProcessor2_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t partition = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint32_t vpindex = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* properties = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t propertycount = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WHvCreateVirtualProcessor2")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(partition, vpindex, properties, propertycount);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)partition;
    (void)vpindex;
    (void)properties;
    (void)propertycount;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemHypervisorWHvCreateVpciDevice_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t partition = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint64_t logicaldeviceid = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* vpciresource = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int32_t flags = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* notificationeventhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint64_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WHvCreateVpciDevice")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(partition, logicaldeviceid, vpciresource, flags, notificationeventhandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)partition;
    (void)logicaldeviceid;
    (void)vpciresource;
    (void)flags;
    (void)notificationeventhandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemHypervisorWHvDeleteNotificationPort_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t partition = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* porthandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WHvDeleteNotificationPort")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(partition, porthandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)partition;
    (void)porthandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemHypervisorWHvDeletePartition_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t partition = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WHvDeletePartition")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(partition);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)partition;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemHypervisorWHvDeleteTrigger_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t partition = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* triggerhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WHvDeleteTrigger")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(partition, triggerhandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)partition;
    (void)triggerhandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemHypervisorWHvDeleteVirtualProcessor_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t partition = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint32_t vpindex = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WHvDeleteVirtualProcessor")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(partition, vpindex);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)partition;
    (void)vpindex;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemHypervisorWHvDeleteVpciDevice_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t partition = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint64_t logicaldeviceid = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WHvDeleteVpciDevice")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(partition, logicaldeviceid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)partition;
    (void)logicaldeviceid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemHypervisorWHvEmulatorCreateEmulator_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* callbacks = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* emulator = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winhvemulation.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WHvEmulatorCreateEmulator")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(callbacks, emulator);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)callbacks;
    (void)emulator;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemHypervisorWHvEmulatorDestroyEmulator_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* emulator = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winhvemulation.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WHvEmulatorDestroyEmulator")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(emulator);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)emulator;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemHypervisorWHvEmulatorTryIoEmulation_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* emulator = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* context = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* vpcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* ioinstructioncontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* emulatorreturnstatus = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winhvemulation.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WHvEmulatorTryIoEmulation")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(emulator, context, vpcontext, ioinstructioncontext, emulatorreturnstatus);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)emulator;
    (void)context;
    (void)vpcontext;
    (void)ioinstructioncontext;
    (void)emulatorreturnstatus;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemHypervisorWHvEmulatorTryMmioEmulation_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* emulator = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* context = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* vpcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* mmioinstructioncontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* emulatorreturnstatus = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winhvemulation.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WHvEmulatorTryMmioEmulation")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(emulator, context, vpcontext, mmioinstructioncontext, emulatorreturnstatus);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)emulator;
    (void)context;
    (void)vpcontext;
    (void)mmioinstructioncontext;
    (void)emulatorreturnstatus;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemHypervisorWHvGetCapability_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t capabilitycode = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* capabilitybuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t capabilitybuffersizeinbytes = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* writtensizeinbytes = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WHvGetCapability")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(capabilitycode, capabilitybuffer, capabilitybuffersizeinbytes, writtensizeinbytes);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)capabilitycode;
    (void)capabilitybuffer;
    (void)capabilitybuffersizeinbytes;
    (void)writtensizeinbytes;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemHypervisorWHvGetInterruptTargetVpSet_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t partition = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint64_t destination = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    int32_t destinationmode = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* targetvps = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t vpcount = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* targetvpcount = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint64_t, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WHvGetInterruptTargetVpSet")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(partition, destination, destinationmode, targetvps, vpcount, targetvpcount);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)partition;
    (void)destination;
    (void)destinationmode;
    (void)targetvps;
    (void)vpcount;
    (void)targetvpcount;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemHypervisorWHvGetPartitionCounters_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t partition = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int32_t counterset = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t buffersizeinbytes = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* byteswritten = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WHvGetPartitionCounters")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(partition, counterset, buffer, buffersizeinbytes, byteswritten);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)partition;
    (void)counterset;
    (void)buffer;
    (void)buffersizeinbytes;
    (void)byteswritten;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemHypervisorWHvGetPartitionProperty_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t partition = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int32_t propertycode = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* propertybuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t propertybuffersizeinbytes = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* writtensizeinbytes = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WHvGetPartitionProperty")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(partition, propertycode, propertybuffer, propertybuffersizeinbytes, writtensizeinbytes);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)partition;
    (void)propertycode;
    (void)propertybuffer;
    (void)propertybuffersizeinbytes;
    (void)writtensizeinbytes;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemHypervisorWHvGetVirtualProcessorCounters_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t partition = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint32_t vpindex = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t counterset = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t buffersizeinbytes = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* byteswritten = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WHvGetVirtualProcessorCounters")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(partition, vpindex, counterset, buffer, buffersizeinbytes, byteswritten);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)partition;
    (void)vpindex;
    (void)counterset;
    (void)buffer;
    (void)buffersizeinbytes;
    (void)byteswritten;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemHypervisorWHvGetVirtualProcessorCpuidOutput_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t partition = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint32_t vpindex = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t eax = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t ecx = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* cpuidoutput = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WHvGetVirtualProcessorCpuidOutput")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(partition, vpindex, eax, ecx, cpuidoutput);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)partition;
    (void)vpindex;
    (void)eax;
    (void)ecx;
    (void)cpuidoutput;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemHypervisorWHvGetVirtualProcessorInterruptControllerState_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t partition = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint32_t vpindex = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* state = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t statesize = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* writtensize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WHvGetVirtualProcessorInterruptControllerState")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(partition, vpindex, state, statesize, writtensize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)partition;
    (void)vpindex;
    (void)state;
    (void)statesize;
    (void)writtensize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemHypervisorWHvGetVirtualProcessorInterruptControllerState2_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t partition = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint32_t vpindex = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* state = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t statesize = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* writtensize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WHvGetVirtualProcessorInterruptControllerState2")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(partition, vpindex, state, statesize, writtensize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)partition;
    (void)vpindex;
    (void)state;
    (void)statesize;
    (void)writtensize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemHypervisorWHvGetVirtualProcessorRegisters_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t partition = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint32_t vpindex = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* registernames = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t registercount = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* registervalues = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WHvGetVirtualProcessorRegisters")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(partition, vpindex, registernames, registercount, registervalues);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)partition;
    (void)vpindex;
    (void)registernames;
    (void)registercount;
    (void)registervalues;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemHypervisorWHvGetVirtualProcessorState_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t partition = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint32_t vpindex = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t statetype = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t buffersizeinbytes = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* byteswritten = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WHvGetVirtualProcessorState")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(partition, vpindex, statetype, buffer, buffersizeinbytes, byteswritten);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)partition;
    (void)vpindex;
    (void)statetype;
    (void)buffer;
    (void)buffersizeinbytes;
    (void)byteswritten;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemHypervisorWHvGetVirtualProcessorXsaveState_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t partition = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint32_t vpindex = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t buffersizeinbytes = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* byteswritten = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WHvGetVirtualProcessorXsaveState")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(partition, vpindex, buffer, buffersizeinbytes, byteswritten);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)partition;
    (void)vpindex;
    (void)buffer;
    (void)buffersizeinbytes;
    (void)byteswritten;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemHypervisorWHvGetVpciDeviceInterruptTarget_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t partition = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint64_t logicaldeviceid = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    uint32_t arg2Index = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t multimessagenumber = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* target = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t targetsizeinbytes = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* byteswritten = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint64_t, uint32_t, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WHvGetVpciDeviceInterruptTarget")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(partition, logicaldeviceid, arg2Index, multimessagenumber, target, targetsizeinbytes, byteswritten);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)partition;
    (void)logicaldeviceid;
    (void)arg2Index;
    (void)multimessagenumber;
    (void)target;
    (void)targetsizeinbytes;
    (void)byteswritten;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemHypervisorWHvGetVpciDeviceNotification_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t partition = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint64_t logicaldeviceid = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* notification = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t notificationsizeinbytes = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WHvGetVpciDeviceNotification")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(partition, logicaldeviceid, notification, notificationsizeinbytes);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)partition;
    (void)logicaldeviceid;
    (void)notification;
    (void)notificationsizeinbytes;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemHypervisorWHvGetVpciDeviceProperty_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t partition = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint64_t logicaldeviceid = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    int32_t propertycode = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* propertybuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t propertybuffersizeinbytes = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* writtensizeinbytes = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint64_t, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WHvGetVpciDeviceProperty")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(partition, logicaldeviceid, propertycode, propertybuffer, propertybuffersizeinbytes, writtensizeinbytes);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)partition;
    (void)logicaldeviceid;
    (void)propertycode;
    (void)propertybuffer;
    (void)propertybuffersizeinbytes;
    (void)writtensizeinbytes;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemHypervisorWHvMapGpaRange_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t partition = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* sourceaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint64_t guestaddress = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
    uint64_t sizeinbytes = km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0;
    int32_t flags = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint64_t, uint64_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WHvMapGpaRange")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(partition, sourceaddress, guestaddress, sizeinbytes, flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)partition;
    (void)sourceaddress;
    (void)guestaddress;
    (void)sizeinbytes;
    (void)flags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemHypervisorWHvMapGpaRange2_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t partition = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* process = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* sourceaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint64_t guestaddress = km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0;
    uint64_t sizeinbytes = km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0;
    int32_t flags = static_cast<int32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint64_t, uint64_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WHvMapGpaRange2")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(partition, process, sourceaddress, guestaddress, sizeinbytes, flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)partition;
    (void)process;
    (void)sourceaddress;
    (void)guestaddress;
    (void)sizeinbytes;
    (void)flags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemHypervisorWHvMapVpciDeviceInterrupt_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t partition = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint64_t logicaldeviceid = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    uint32_t arg2Index = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t messagecount = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* target = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* msiaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* msidata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint64_t, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WHvMapVpciDeviceInterrupt")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(partition, logicaldeviceid, arg2Index, messagecount, target, msiaddress, msidata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)partition;
    (void)logicaldeviceid;
    (void)arg2Index;
    (void)messagecount;
    (void)target;
    (void)msiaddress;
    (void)msidata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemHypervisorWHvMapVpciDeviceMmioRanges_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t partition = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint64_t logicaldeviceid = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* mappingcount = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* mappings = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WHvMapVpciDeviceMmioRanges")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(partition, logicaldeviceid, mappingcount, mappings);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)partition;
    (void)logicaldeviceid;
    (void)mappingcount;
    (void)mappings;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemHypervisorWHvPostVirtualProcessorSynicMessage_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t partition = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint32_t vpindex = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t sintindex = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* message = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t messagesizeinbytes = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WHvPostVirtualProcessorSynicMessage")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(partition, vpindex, sintindex, message, messagesizeinbytes);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)partition;
    (void)vpindex;
    (void)sintindex;
    (void)message;
    (void)messagesizeinbytes;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemHypervisorWHvQueryGpaRangeDirtyBitmap_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t partition = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint64_t guestaddress = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    uint64_t rangesizeinbytes = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
    void* bitmap = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t bitmapsizeinbytes = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint64_t, uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WHvQueryGpaRangeDirtyBitmap")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(partition, guestaddress, rangesizeinbytes, bitmap, bitmapsizeinbytes);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)partition;
    (void)guestaddress;
    (void)rangesizeinbytes;
    (void)bitmap;
    (void)bitmapsizeinbytes;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemHypervisorWHvReadVpciDeviceRegister_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t partition = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint64_t logicaldeviceid = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* arg2Register = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* data = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WHvReadVpciDeviceRegister")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(partition, logicaldeviceid, arg2Register, data);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)partition;
    (void)logicaldeviceid;
    (void)arg2Register;
    (void)data;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemHypervisorWHvRegisterPartitionDoorbellEvent_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t partition = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* matchdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* eventhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WHvRegisterPartitionDoorbellEvent")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(partition, matchdata, eventhandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)partition;
    (void)matchdata;
    (void)eventhandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemHypervisorWHvRequestInterrupt_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t partition = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* interrupt = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t interruptcontrolsize = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WHvRequestInterrupt")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(partition, interrupt, interruptcontrolsize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)partition;
    (void)interrupt;
    (void)interruptcontrolsize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemHypervisorWHvRequestVpciDeviceInterrupt_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t partition = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint64_t logicaldeviceid = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    uint64_t msiaddress = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
    uint32_t msidata = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint64_t, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WHvRequestVpciDeviceInterrupt")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(partition, logicaldeviceid, msiaddress, msidata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)partition;
    (void)logicaldeviceid;
    (void)msiaddress;
    (void)msidata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemHypervisorWHvResetPartition_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t partition = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WHvResetPartition")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(partition);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)partition;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemHypervisorWHvResumePartitionTime_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t partition = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WHvResumePartitionTime")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(partition);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)partition;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemHypervisorWHvRetargetVpciDeviceInterrupt_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t partition = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint64_t logicaldeviceid = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    uint64_t msiaddress = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
    uint32_t msidata = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* target = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint64_t, uint64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WHvRetargetVpciDeviceInterrupt")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(partition, logicaldeviceid, msiaddress, msidata, target);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)partition;
    (void)logicaldeviceid;
    (void)msiaddress;
    (void)msidata;
    (void)target;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemHypervisorWHvRunVirtualProcessor_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t partition = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint32_t vpindex = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* exitcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t exitcontextsizeinbytes = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WHvRunVirtualProcessor")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(partition, vpindex, exitcontext, exitcontextsizeinbytes);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)partition;
    (void)vpindex;
    (void)exitcontext;
    (void)exitcontextsizeinbytes;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemHypervisorWHvSetNotificationPortProperty_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t partition = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* porthandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t propertycode = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint64_t propertyvalue = km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, int32_t, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WHvSetNotificationPortProperty")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(partition, porthandle, propertycode, propertyvalue);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)partition;
    (void)porthandle;
    (void)propertycode;
    (void)propertyvalue;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemHypervisorWHvSetPartitionProperty_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t partition = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int32_t propertycode = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* propertybuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t propertybuffersizeinbytes = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WHvSetPartitionProperty")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(partition, propertycode, propertybuffer, propertybuffersizeinbytes);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)partition;
    (void)propertycode;
    (void)propertybuffer;
    (void)propertybuffersizeinbytes;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemHypervisorWHvSetVirtualProcessorInterruptControllerState_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t partition = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint32_t vpindex = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* state = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t statesize = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WHvSetVirtualProcessorInterruptControllerState")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(partition, vpindex, state, statesize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)partition;
    (void)vpindex;
    (void)state;
    (void)statesize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemHypervisorWHvSetVirtualProcessorInterruptControllerState2_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t partition = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint32_t vpindex = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* state = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t statesize = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WHvSetVirtualProcessorInterruptControllerState2")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(partition, vpindex, state, statesize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)partition;
    (void)vpindex;
    (void)state;
    (void)statesize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemHypervisorWHvSetVirtualProcessorRegisters_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t partition = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint32_t vpindex = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* registernames = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t registercount = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* registervalues = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WHvSetVirtualProcessorRegisters")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(partition, vpindex, registernames, registercount, registervalues);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)partition;
    (void)vpindex;
    (void)registernames;
    (void)registercount;
    (void)registervalues;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemHypervisorWHvSetVirtualProcessorState_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t partition = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint32_t vpindex = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t statetype = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t buffersizeinbytes = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WHvSetVirtualProcessorState")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(partition, vpindex, statetype, buffer, buffersizeinbytes);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)partition;
    (void)vpindex;
    (void)statetype;
    (void)buffer;
    (void)buffersizeinbytes;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemHypervisorWHvSetVirtualProcessorXsaveState_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t partition = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint32_t vpindex = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t buffersizeinbytes = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WHvSetVirtualProcessorXsaveState")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(partition, vpindex, buffer, buffersizeinbytes);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)partition;
    (void)vpindex;
    (void)buffer;
    (void)buffersizeinbytes;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemHypervisorWHvSetVpciDevicePowerState_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t partition = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint64_t logicaldeviceid = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    int32_t powerstate = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint64_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WHvSetVpciDevicePowerState")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(partition, logicaldeviceid, powerstate);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)partition;
    (void)logicaldeviceid;
    (void)powerstate;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemHypervisorWHvSetupPartition_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t partition = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WHvSetupPartition")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(partition);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)partition;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemHypervisorWHvStartPartitionMigration_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t partition = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* migrationhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WHvStartPartitionMigration")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(partition, migrationhandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)partition;
    (void)migrationhandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemHypervisorWHvSuspendPartitionTime_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t partition = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WHvSuspendPartitionTime")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(partition);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)partition;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemHypervisorWHvTranslateGva_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t partition = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint32_t vpindex = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint64_t gva = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
    int32_t translateflags = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* translationresult = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* gpa = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, uint64_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WHvTranslateGva")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(partition, vpindex, gva, translateflags, translationresult, gpa);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)partition;
    (void)vpindex;
    (void)gva;
    (void)translateflags;
    (void)translationresult;
    (void)gpa;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemHypervisorWHvUnmapGpaRange_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t partition = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint64_t guestaddress = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    uint64_t sizeinbytes = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint64_t, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WHvUnmapGpaRange")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(partition, guestaddress, sizeinbytes);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)partition;
    (void)guestaddress;
    (void)sizeinbytes;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemHypervisorWHvUnmapVpciDeviceInterrupt_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t partition = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint64_t logicaldeviceid = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    uint32_t arg2Index = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WHvUnmapVpciDeviceInterrupt")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(partition, logicaldeviceid, arg2Index);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)partition;
    (void)logicaldeviceid;
    (void)arg2Index;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemHypervisorWHvUnmapVpciDeviceMmioRanges_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t partition = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint64_t logicaldeviceid = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WHvUnmapVpciDeviceMmioRanges")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(partition, logicaldeviceid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)partition;
    (void)logicaldeviceid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemHypervisorWHvUnregisterPartitionDoorbellEvent_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t partition = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* matchdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WHvUnregisterPartitionDoorbellEvent")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(partition, matchdata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)partition;
    (void)matchdata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemHypervisorWHvUpdateTriggerParameters_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t partition = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* parameters = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* triggerhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WHvUpdateTriggerParameters")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(partition, parameters, triggerhandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)partition;
    (void)parameters;
    (void)triggerhandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemHypervisorWHvWriteVpciDeviceRegister_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t partition = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint64_t logicaldeviceid = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* arg2Register = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* data = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WHvWriteVpciDeviceRegister")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(partition, logicaldeviceid, arg2Register, data);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)partition;
    (void)logicaldeviceid;
    (void)arg2Register;
    (void)data;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static void register_windows_win32_system_hypervisor_napi(Napi::Env env, Napi::Object exports) {
    exports.Set("windowssysWindowsWin32SystemHypervisorApplyGuestMemoryFix", Napi::Function::New(env, windowssysWindowsWin32SystemHypervisorApplyGuestMemoryFix_napi));
    exports.Set("windowssysWindowsWin32SystemHypervisorApplyPendingSavedStateFileReplayLog", Napi::Function::New(env, windowssysWindowsWin32SystemHypervisorApplyPendingSavedStateFileReplayLog_napi));
    exports.Set("windowssysWindowsWin32SystemHypervisorCallStackUnwind", Napi::Function::New(env, windowssysWindowsWin32SystemHypervisorCallStackUnwind_napi));
    exports.Set("windowssysWindowsWin32SystemHypervisorFindSavedStateSymbolFieldInType", Napi::Function::New(env, windowssysWindowsWin32SystemHypervisorFindSavedStateSymbolFieldInType_napi));
    exports.Set("windowssysWindowsWin32SystemHypervisorForceActiveVirtualTrustLevel", Napi::Function::New(env, windowssysWindowsWin32SystemHypervisorForceActiveVirtualTrustLevel_napi));
    exports.Set("windowssysWindowsWin32SystemHypervisorForceArchitecture", Napi::Function::New(env, windowssysWindowsWin32SystemHypervisorForceArchitecture_napi));
    exports.Set("windowssysWindowsWin32SystemHypervisorForceNestedHostMode", Napi::Function::New(env, windowssysWindowsWin32SystemHypervisorForceNestedHostMode_napi));
    exports.Set("windowssysWindowsWin32SystemHypervisorForcePagingMode", Napi::Function::New(env, windowssysWindowsWin32SystemHypervisorForcePagingMode_napi));
    exports.Set("windowssysWindowsWin32SystemHypervisorGetActiveVirtualTrustLevel", Napi::Function::New(env, windowssysWindowsWin32SystemHypervisorGetActiveVirtualTrustLevel_napi));
    exports.Set("windowssysWindowsWin32SystemHypervisorGetArchitecture", Napi::Function::New(env, windowssysWindowsWin32SystemHypervisorGetArchitecture_napi));
    exports.Set("windowssysWindowsWin32SystemHypervisorGetEnabledVirtualTrustLevels", Napi::Function::New(env, windowssysWindowsWin32SystemHypervisorGetEnabledVirtualTrustLevels_napi));
    exports.Set("windowssysWindowsWin32SystemHypervisorGetGuestEnabledVirtualTrustLevels", Napi::Function::New(env, windowssysWindowsWin32SystemHypervisorGetGuestEnabledVirtualTrustLevels_napi));
    exports.Set("windowssysWindowsWin32SystemHypervisorGetGuestOsInfo", Napi::Function::New(env, windowssysWindowsWin32SystemHypervisorGetGuestOsInfo_napi));
    exports.Set("windowssysWindowsWin32SystemHypervisorGetGuestPhysicalMemoryChunks", Napi::Function::New(env, windowssysWindowsWin32SystemHypervisorGetGuestPhysicalMemoryChunks_napi));
    exports.Set("windowssysWindowsWin32SystemHypervisorGetGuestRawSavedMemorySize", Napi::Function::New(env, windowssysWindowsWin32SystemHypervisorGetGuestRawSavedMemorySize_napi));
    exports.Set("windowssysWindowsWin32SystemHypervisorGetMemoryBlockCacheLimit", Napi::Function::New(env, windowssysWindowsWin32SystemHypervisorGetMemoryBlockCacheLimit_napi));
    exports.Set("windowssysWindowsWin32SystemHypervisorGetNestedVirtualizationMode", Napi::Function::New(env, windowssysWindowsWin32SystemHypervisorGetNestedVirtualizationMode_napi));
    exports.Set("windowssysWindowsWin32SystemHypervisorGetPagingMode", Napi::Function::New(env, windowssysWindowsWin32SystemHypervisorGetPagingMode_napi));
    exports.Set("windowssysWindowsWin32SystemHypervisorGetRegisterValue", Napi::Function::New(env, windowssysWindowsWin32SystemHypervisorGetRegisterValue_napi));
    exports.Set("windowssysWindowsWin32SystemHypervisorGetSavedStateSymbolFieldInfo", Napi::Function::New(env, windowssysWindowsWin32SystemHypervisorGetSavedStateSymbolFieldInfo_napi));
    exports.Set("windowssysWindowsWin32SystemHypervisorGetSavedStateSymbolProviderHandle", Napi::Function::New(env, windowssysWindowsWin32SystemHypervisorGetSavedStateSymbolProviderHandle_napi));
    exports.Set("windowssysWindowsWin32SystemHypervisorGetSavedStateSymbolTypeSize", Napi::Function::New(env, windowssysWindowsWin32SystemHypervisorGetSavedStateSymbolTypeSize_napi));
    exports.Set("windowssysWindowsWin32SystemHypervisorGetVpCount", Napi::Function::New(env, windowssysWindowsWin32SystemHypervisorGetVpCount_napi));
    exports.Set("windowssysWindowsWin32SystemHypervisorGuestPhysicalAddressToRawSavedMemoryOffset", Napi::Function::New(env, windowssysWindowsWin32SystemHypervisorGuestPhysicalAddressToRawSavedMemoryOffset_napi));
    exports.Set("windowssysWindowsWin32SystemHypervisorGuestVirtualAddressToPhysicalAddress", Napi::Function::New(env, windowssysWindowsWin32SystemHypervisorGuestVirtualAddressToPhysicalAddress_napi));
    exports.Set("windowssysWindowsWin32SystemHypervisorHdvCreateDeviceInstance", Napi::Function::New(env, windowssysWindowsWin32SystemHypervisorHdvCreateDeviceInstance_napi));
    exports.Set("windowssysWindowsWin32SystemHypervisorHdvCreateGuestMemoryAperture", Napi::Function::New(env, windowssysWindowsWin32SystemHypervisorHdvCreateGuestMemoryAperture_napi));
    exports.Set("windowssysWindowsWin32SystemHypervisorHdvCreateSectionBackedMmioRange", Napi::Function::New(env, windowssysWindowsWin32SystemHypervisorHdvCreateSectionBackedMmioRange_napi));
    exports.Set("windowssysWindowsWin32SystemHypervisorHdvDeliverGuestInterrupt", Napi::Function::New(env, windowssysWindowsWin32SystemHypervisorHdvDeliverGuestInterrupt_napi));
    exports.Set("windowssysWindowsWin32SystemHypervisorHdvDestroyGuestMemoryAperture", Napi::Function::New(env, windowssysWindowsWin32SystemHypervisorHdvDestroyGuestMemoryAperture_napi));
    exports.Set("windowssysWindowsWin32SystemHypervisorHdvDestroySectionBackedMmioRange", Napi::Function::New(env, windowssysWindowsWin32SystemHypervisorHdvDestroySectionBackedMmioRange_napi));
    exports.Set("windowssysWindowsWin32SystemHypervisorHdvInitializeDeviceHost", Napi::Function::New(env, windowssysWindowsWin32SystemHypervisorHdvInitializeDeviceHost_napi));
    exports.Set("windowssysWindowsWin32SystemHypervisorHdvInitializeDeviceHostEx", Napi::Function::New(env, windowssysWindowsWin32SystemHypervisorHdvInitializeDeviceHostEx_napi));
    exports.Set("windowssysWindowsWin32SystemHypervisorHdvReadGuestMemory", Napi::Function::New(env, windowssysWindowsWin32SystemHypervisorHdvReadGuestMemory_napi));
    exports.Set("windowssysWindowsWin32SystemHypervisorHdvRegisterDoorbell", Napi::Function::New(env, windowssysWindowsWin32SystemHypervisorHdvRegisterDoorbell_napi));
    exports.Set("windowssysWindowsWin32SystemHypervisorHdvTeardownDeviceHost", Napi::Function::New(env, windowssysWindowsWin32SystemHypervisorHdvTeardownDeviceHost_napi));
    exports.Set("windowssysWindowsWin32SystemHypervisorHdvUnregisterDoorbell", Napi::Function::New(env, windowssysWindowsWin32SystemHypervisorHdvUnregisterDoorbell_napi));
    exports.Set("windowssysWindowsWin32SystemHypervisorHdvWriteGuestMemory", Napi::Function::New(env, windowssysWindowsWin32SystemHypervisorHdvWriteGuestMemory_napi));
    exports.Set("windowssysWindowsWin32SystemHypervisorInKernelSpace", Napi::Function::New(env, windowssysWindowsWin32SystemHypervisorInKernelSpace_napi));
    exports.Set("windowssysWindowsWin32SystemHypervisorIsActiveVirtualTrustLevelEnabled", Napi::Function::New(env, windowssysWindowsWin32SystemHypervisorIsActiveVirtualTrustLevelEnabled_napi));
    exports.Set("windowssysWindowsWin32SystemHypervisorIsNestedVirtualizationEnabled", Napi::Function::New(env, windowssysWindowsWin32SystemHypervisorIsNestedVirtualizationEnabled_napi));
    exports.Set("windowssysWindowsWin32SystemHypervisorLoadSavedStateFile", Napi::Function::New(env, windowssysWindowsWin32SystemHypervisorLoadSavedStateFile_napi));
    exports.Set("windowssysWindowsWin32SystemHypervisorLoadSavedStateFiles", Napi::Function::New(env, windowssysWindowsWin32SystemHypervisorLoadSavedStateFiles_napi));
    exports.Set("windowssysWindowsWin32SystemHypervisorLoadSavedStateModuleSymbols", Napi::Function::New(env, windowssysWindowsWin32SystemHypervisorLoadSavedStateModuleSymbols_napi));
    exports.Set("windowssysWindowsWin32SystemHypervisorLoadSavedStateModuleSymbolsEx", Napi::Function::New(env, windowssysWindowsWin32SystemHypervisorLoadSavedStateModuleSymbolsEx_napi));
    exports.Set("windowssysWindowsWin32SystemHypervisorLoadSavedStateSymbolProvider", Napi::Function::New(env, windowssysWindowsWin32SystemHypervisorLoadSavedStateSymbolProvider_napi));
    exports.Set("windowssysWindowsWin32SystemHypervisorLocateSavedStateFiles", Napi::Function::New(env, windowssysWindowsWin32SystemHypervisorLocateSavedStateFiles_napi));
    exports.Set("windowssysWindowsWin32SystemHypervisorReadGuestPhysicalAddress", Napi::Function::New(env, windowssysWindowsWin32SystemHypervisorReadGuestPhysicalAddress_napi));
    exports.Set("windowssysWindowsWin32SystemHypervisorReadGuestRawSavedMemory", Napi::Function::New(env, windowssysWindowsWin32SystemHypervisorReadGuestRawSavedMemory_napi));
    exports.Set("windowssysWindowsWin32SystemHypervisorReadSavedStateGlobalVariable", Napi::Function::New(env, windowssysWindowsWin32SystemHypervisorReadSavedStateGlobalVariable_napi));
    exports.Set("windowssysWindowsWin32SystemHypervisorReleaseSavedStateFiles", Napi::Function::New(env, windowssysWindowsWin32SystemHypervisorReleaseSavedStateFiles_napi));
    exports.Set("windowssysWindowsWin32SystemHypervisorReleaseSavedStateSymbolProvider", Napi::Function::New(env, windowssysWindowsWin32SystemHypervisorReleaseSavedStateSymbolProvider_napi));
    exports.Set("windowssysWindowsWin32SystemHypervisorResolveSavedStateGlobalVariableAddress", Napi::Function::New(env, windowssysWindowsWin32SystemHypervisorResolveSavedStateGlobalVariableAddress_napi));
    exports.Set("windowssysWindowsWin32SystemHypervisorScanMemoryForDosImages", Napi::Function::New(env, windowssysWindowsWin32SystemHypervisorScanMemoryForDosImages_napi));
    exports.Set("windowssysWindowsWin32SystemHypervisorSetMemoryBlockCacheLimit", Napi::Function::New(env, windowssysWindowsWin32SystemHypervisorSetMemoryBlockCacheLimit_napi));
    exports.Set("windowssysWindowsWin32SystemHypervisorSetSavedStateSymbolProviderDebugInfoCallback", Napi::Function::New(env, windowssysWindowsWin32SystemHypervisorSetSavedStateSymbolProviderDebugInfoCallback_napi));
    exports.Set("windowssysWindowsWin32SystemHypervisorWHvAcceptPartitionMigration", Napi::Function::New(env, windowssysWindowsWin32SystemHypervisorWHvAcceptPartitionMigration_napi));
    exports.Set("windowssysWindowsWin32SystemHypervisorWHvAdviseGpaRange", Napi::Function::New(env, windowssysWindowsWin32SystemHypervisorWHvAdviseGpaRange_napi));
    exports.Set("windowssysWindowsWin32SystemHypervisorWHvAllocateVpciResource", Napi::Function::New(env, windowssysWindowsWin32SystemHypervisorWHvAllocateVpciResource_napi));
    exports.Set("windowssysWindowsWin32SystemHypervisorWHvCancelPartitionMigration", Napi::Function::New(env, windowssysWindowsWin32SystemHypervisorWHvCancelPartitionMigration_napi));
    exports.Set("windowssysWindowsWin32SystemHypervisorWHvCancelRunVirtualProcessor", Napi::Function::New(env, windowssysWindowsWin32SystemHypervisorWHvCancelRunVirtualProcessor_napi));
    exports.Set("windowssysWindowsWin32SystemHypervisorWHvCompletePartitionMigration", Napi::Function::New(env, windowssysWindowsWin32SystemHypervisorWHvCompletePartitionMigration_napi));
    exports.Set("windowssysWindowsWin32SystemHypervisorWHvCreateNotificationPort", Napi::Function::New(env, windowssysWindowsWin32SystemHypervisorWHvCreateNotificationPort_napi));
    exports.Set("windowssysWindowsWin32SystemHypervisorWHvCreatePartition", Napi::Function::New(env, windowssysWindowsWin32SystemHypervisorWHvCreatePartition_napi));
    exports.Set("windowssysWindowsWin32SystemHypervisorWHvCreateTrigger", Napi::Function::New(env, windowssysWindowsWin32SystemHypervisorWHvCreateTrigger_napi));
    exports.Set("windowssysWindowsWin32SystemHypervisorWHvCreateVirtualProcessor", Napi::Function::New(env, windowssysWindowsWin32SystemHypervisorWHvCreateVirtualProcessor_napi));
    exports.Set("windowssysWindowsWin32SystemHypervisorWHvCreateVirtualProcessor2", Napi::Function::New(env, windowssysWindowsWin32SystemHypervisorWHvCreateVirtualProcessor2_napi));
    exports.Set("windowssysWindowsWin32SystemHypervisorWHvCreateVpciDevice", Napi::Function::New(env, windowssysWindowsWin32SystemHypervisorWHvCreateVpciDevice_napi));
    exports.Set("windowssysWindowsWin32SystemHypervisorWHvDeleteNotificationPort", Napi::Function::New(env, windowssysWindowsWin32SystemHypervisorWHvDeleteNotificationPort_napi));
    exports.Set("windowssysWindowsWin32SystemHypervisorWHvDeletePartition", Napi::Function::New(env, windowssysWindowsWin32SystemHypervisorWHvDeletePartition_napi));
    exports.Set("windowssysWindowsWin32SystemHypervisorWHvDeleteTrigger", Napi::Function::New(env, windowssysWindowsWin32SystemHypervisorWHvDeleteTrigger_napi));
    exports.Set("windowssysWindowsWin32SystemHypervisorWHvDeleteVirtualProcessor", Napi::Function::New(env, windowssysWindowsWin32SystemHypervisorWHvDeleteVirtualProcessor_napi));
    exports.Set("windowssysWindowsWin32SystemHypervisorWHvDeleteVpciDevice", Napi::Function::New(env, windowssysWindowsWin32SystemHypervisorWHvDeleteVpciDevice_napi));
    exports.Set("windowssysWindowsWin32SystemHypervisorWHvEmulatorCreateEmulator", Napi::Function::New(env, windowssysWindowsWin32SystemHypervisorWHvEmulatorCreateEmulator_napi));
    exports.Set("windowssysWindowsWin32SystemHypervisorWHvEmulatorDestroyEmulator", Napi::Function::New(env, windowssysWindowsWin32SystemHypervisorWHvEmulatorDestroyEmulator_napi));
    exports.Set("windowssysWindowsWin32SystemHypervisorWHvEmulatorTryIoEmulation", Napi::Function::New(env, windowssysWindowsWin32SystemHypervisorWHvEmulatorTryIoEmulation_napi));
    exports.Set("windowssysWindowsWin32SystemHypervisorWHvEmulatorTryMmioEmulation", Napi::Function::New(env, windowssysWindowsWin32SystemHypervisorWHvEmulatorTryMmioEmulation_napi));
    exports.Set("windowssysWindowsWin32SystemHypervisorWHvGetCapability", Napi::Function::New(env, windowssysWindowsWin32SystemHypervisorWHvGetCapability_napi));
    exports.Set("windowssysWindowsWin32SystemHypervisorWHvGetInterruptTargetVpSet", Napi::Function::New(env, windowssysWindowsWin32SystemHypervisorWHvGetInterruptTargetVpSet_napi));
    exports.Set("windowssysWindowsWin32SystemHypervisorWHvGetPartitionCounters", Napi::Function::New(env, windowssysWindowsWin32SystemHypervisorWHvGetPartitionCounters_napi));
    exports.Set("windowssysWindowsWin32SystemHypervisorWHvGetPartitionProperty", Napi::Function::New(env, windowssysWindowsWin32SystemHypervisorWHvGetPartitionProperty_napi));
    exports.Set("windowssysWindowsWin32SystemHypervisorWHvGetVirtualProcessorCounters", Napi::Function::New(env, windowssysWindowsWin32SystemHypervisorWHvGetVirtualProcessorCounters_napi));
    exports.Set("windowssysWindowsWin32SystemHypervisorWHvGetVirtualProcessorCpuidOutput", Napi::Function::New(env, windowssysWindowsWin32SystemHypervisorWHvGetVirtualProcessorCpuidOutput_napi));
    exports.Set("windowssysWindowsWin32SystemHypervisorWHvGetVirtualProcessorInterruptControllerState", Napi::Function::New(env, windowssysWindowsWin32SystemHypervisorWHvGetVirtualProcessorInterruptControllerState_napi));
    exports.Set("windowssysWindowsWin32SystemHypervisorWHvGetVirtualProcessorInterruptControllerState2", Napi::Function::New(env, windowssysWindowsWin32SystemHypervisorWHvGetVirtualProcessorInterruptControllerState2_napi));
    exports.Set("windowssysWindowsWin32SystemHypervisorWHvGetVirtualProcessorRegisters", Napi::Function::New(env, windowssysWindowsWin32SystemHypervisorWHvGetVirtualProcessorRegisters_napi));
    exports.Set("windowssysWindowsWin32SystemHypervisorWHvGetVirtualProcessorState", Napi::Function::New(env, windowssysWindowsWin32SystemHypervisorWHvGetVirtualProcessorState_napi));
    exports.Set("windowssysWindowsWin32SystemHypervisorWHvGetVirtualProcessorXsaveState", Napi::Function::New(env, windowssysWindowsWin32SystemHypervisorWHvGetVirtualProcessorXsaveState_napi));
    exports.Set("windowssysWindowsWin32SystemHypervisorWHvGetVpciDeviceInterruptTarget", Napi::Function::New(env, windowssysWindowsWin32SystemHypervisorWHvGetVpciDeviceInterruptTarget_napi));
    exports.Set("windowssysWindowsWin32SystemHypervisorWHvGetVpciDeviceNotification", Napi::Function::New(env, windowssysWindowsWin32SystemHypervisorWHvGetVpciDeviceNotification_napi));
    exports.Set("windowssysWindowsWin32SystemHypervisorWHvGetVpciDeviceProperty", Napi::Function::New(env, windowssysWindowsWin32SystemHypervisorWHvGetVpciDeviceProperty_napi));
    exports.Set("windowssysWindowsWin32SystemHypervisorWHvMapGpaRange", Napi::Function::New(env, windowssysWindowsWin32SystemHypervisorWHvMapGpaRange_napi));
    exports.Set("windowssysWindowsWin32SystemHypervisorWHvMapGpaRange2", Napi::Function::New(env, windowssysWindowsWin32SystemHypervisorWHvMapGpaRange2_napi));
    exports.Set("windowssysWindowsWin32SystemHypervisorWHvMapVpciDeviceInterrupt", Napi::Function::New(env, windowssysWindowsWin32SystemHypervisorWHvMapVpciDeviceInterrupt_napi));
    exports.Set("windowssysWindowsWin32SystemHypervisorWHvMapVpciDeviceMmioRanges", Napi::Function::New(env, windowssysWindowsWin32SystemHypervisorWHvMapVpciDeviceMmioRanges_napi));
    exports.Set("windowssysWindowsWin32SystemHypervisorWHvPostVirtualProcessorSynicMessage", Napi::Function::New(env, windowssysWindowsWin32SystemHypervisorWHvPostVirtualProcessorSynicMessage_napi));
    exports.Set("windowssysWindowsWin32SystemHypervisorWHvQueryGpaRangeDirtyBitmap", Napi::Function::New(env, windowssysWindowsWin32SystemHypervisorWHvQueryGpaRangeDirtyBitmap_napi));
    exports.Set("windowssysWindowsWin32SystemHypervisorWHvReadVpciDeviceRegister", Napi::Function::New(env, windowssysWindowsWin32SystemHypervisorWHvReadVpciDeviceRegister_napi));
    exports.Set("windowssysWindowsWin32SystemHypervisorWHvRegisterPartitionDoorbellEvent", Napi::Function::New(env, windowssysWindowsWin32SystemHypervisorWHvRegisterPartitionDoorbellEvent_napi));
    exports.Set("windowssysWindowsWin32SystemHypervisorWHvRequestInterrupt", Napi::Function::New(env, windowssysWindowsWin32SystemHypervisorWHvRequestInterrupt_napi));
    exports.Set("windowssysWindowsWin32SystemHypervisorWHvRequestVpciDeviceInterrupt", Napi::Function::New(env, windowssysWindowsWin32SystemHypervisorWHvRequestVpciDeviceInterrupt_napi));
    exports.Set("windowssysWindowsWin32SystemHypervisorWHvResetPartition", Napi::Function::New(env, windowssysWindowsWin32SystemHypervisorWHvResetPartition_napi));
    exports.Set("windowssysWindowsWin32SystemHypervisorWHvResumePartitionTime", Napi::Function::New(env, windowssysWindowsWin32SystemHypervisorWHvResumePartitionTime_napi));
    exports.Set("windowssysWindowsWin32SystemHypervisorWHvRetargetVpciDeviceInterrupt", Napi::Function::New(env, windowssysWindowsWin32SystemHypervisorWHvRetargetVpciDeviceInterrupt_napi));
    exports.Set("windowssysWindowsWin32SystemHypervisorWHvRunVirtualProcessor", Napi::Function::New(env, windowssysWindowsWin32SystemHypervisorWHvRunVirtualProcessor_napi));
    exports.Set("windowssysWindowsWin32SystemHypervisorWHvSetNotificationPortProperty", Napi::Function::New(env, windowssysWindowsWin32SystemHypervisorWHvSetNotificationPortProperty_napi));
    exports.Set("windowssysWindowsWin32SystemHypervisorWHvSetPartitionProperty", Napi::Function::New(env, windowssysWindowsWin32SystemHypervisorWHvSetPartitionProperty_napi));
    exports.Set("windowssysWindowsWin32SystemHypervisorWHvSetVirtualProcessorInterruptControllerState", Napi::Function::New(env, windowssysWindowsWin32SystemHypervisorWHvSetVirtualProcessorInterruptControllerState_napi));
    exports.Set("windowssysWindowsWin32SystemHypervisorWHvSetVirtualProcessorInterruptControllerState2", Napi::Function::New(env, windowssysWindowsWin32SystemHypervisorWHvSetVirtualProcessorInterruptControllerState2_napi));
    exports.Set("windowssysWindowsWin32SystemHypervisorWHvSetVirtualProcessorRegisters", Napi::Function::New(env, windowssysWindowsWin32SystemHypervisorWHvSetVirtualProcessorRegisters_napi));
    exports.Set("windowssysWindowsWin32SystemHypervisorWHvSetVirtualProcessorState", Napi::Function::New(env, windowssysWindowsWin32SystemHypervisorWHvSetVirtualProcessorState_napi));
    exports.Set("windowssysWindowsWin32SystemHypervisorWHvSetVirtualProcessorXsaveState", Napi::Function::New(env, windowssysWindowsWin32SystemHypervisorWHvSetVirtualProcessorXsaveState_napi));
    exports.Set("windowssysWindowsWin32SystemHypervisorWHvSetVpciDevicePowerState", Napi::Function::New(env, windowssysWindowsWin32SystemHypervisorWHvSetVpciDevicePowerState_napi));
    exports.Set("windowssysWindowsWin32SystemHypervisorWHvSetupPartition", Napi::Function::New(env, windowssysWindowsWin32SystemHypervisorWHvSetupPartition_napi));
    exports.Set("windowssysWindowsWin32SystemHypervisorWHvStartPartitionMigration", Napi::Function::New(env, windowssysWindowsWin32SystemHypervisorWHvStartPartitionMigration_napi));
    exports.Set("windowssysWindowsWin32SystemHypervisorWHvSuspendPartitionTime", Napi::Function::New(env, windowssysWindowsWin32SystemHypervisorWHvSuspendPartitionTime_napi));
    exports.Set("windowssysWindowsWin32SystemHypervisorWHvTranslateGva", Napi::Function::New(env, windowssysWindowsWin32SystemHypervisorWHvTranslateGva_napi));
    exports.Set("windowssysWindowsWin32SystemHypervisorWHvUnmapGpaRange", Napi::Function::New(env, windowssysWindowsWin32SystemHypervisorWHvUnmapGpaRange_napi));
    exports.Set("windowssysWindowsWin32SystemHypervisorWHvUnmapVpciDeviceInterrupt", Napi::Function::New(env, windowssysWindowsWin32SystemHypervisorWHvUnmapVpciDeviceInterrupt_napi));
    exports.Set("windowssysWindowsWin32SystemHypervisorWHvUnmapVpciDeviceMmioRanges", Napi::Function::New(env, windowssysWindowsWin32SystemHypervisorWHvUnmapVpciDeviceMmioRanges_napi));
    exports.Set("windowssysWindowsWin32SystemHypervisorWHvUnregisterPartitionDoorbellEvent", Napi::Function::New(env, windowssysWindowsWin32SystemHypervisorWHvUnregisterPartitionDoorbellEvent_napi));
    exports.Set("windowssysWindowsWin32SystemHypervisorWHvUpdateTriggerParameters", Napi::Function::New(env, windowssysWindowsWin32SystemHypervisorWHvUpdateTriggerParameters_napi));
    exports.Set("windowssysWindowsWin32SystemHypervisorWHvWriteVpciDeviceRegister", Napi::Function::New(env, windowssysWindowsWin32SystemHypervisorWHvWriteVpciDeviceRegister_napi));
}

static KmNapiRegistrarNode registrar_node = { &register_windows_win32_system_hypervisor_napi, nullptr };
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
