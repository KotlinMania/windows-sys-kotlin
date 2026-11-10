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

static Napi::Value windowssys_windows_win32_system_hypervisor_applyGuestMemoryFix_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_system_hypervisor_applyPendingSavedStateFileReplayLog_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_system_hypervisor_callStackUnwind_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_system_hypervisor_findSavedStateSymbolFieldInType_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* vmsavedstatedumphandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t vpid = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* arg_2_typename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
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
        km_res = km_fn_ptr(vmsavedstatedumphandle, vpid, arg_2_typename, fieldname, offset, found);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)vmsavedstatedumphandle;
    (void)vpid;
    (void)arg_2_typename;
    (void)fieldname;
    (void)offset;
    (void)found;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hypervisor_forceActiveVirtualTrustLevel_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_system_hypervisor_forceArchitecture_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_system_hypervisor_forceNestedHostMode_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_system_hypervisor_forcePagingMode_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_system_hypervisor_getActiveVirtualTrustLevel_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_system_hypervisor_getArchitecture_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_system_hypervisor_getEnabledVirtualTrustLevels_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_system_hypervisor_getGuestEnabledVirtualTrustLevels_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_system_hypervisor_getGuestOsInfo_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_system_hypervisor_getGuestPhysicalMemoryChunks_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_system_hypervisor_getGuestRawSavedMemorySize_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_system_hypervisor_getMemoryBlockCacheLimit_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_system_hypervisor_getNestedVirtualizationMode_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_system_hypervisor_getPagingMode_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_system_hypervisor_getRegisterValue_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_system_hypervisor_getSavedStateSymbolFieldInfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* vmsavedstatedumphandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t vpid = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* arg_2_typename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
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
        km_res = km_fn_ptr(vmsavedstatedumphandle, vpid, arg_2_typename, typefieldinfomap);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)vmsavedstatedumphandle;
    (void)vpid;
    (void)arg_2_typename;
    (void)typefieldinfomap;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hypervisor_getSavedStateSymbolProviderHandle_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_system_hypervisor_getSavedStateSymbolTypeSize_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* vmsavedstatedumphandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t vpid = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* arg_2_typename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
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
        km_res = km_fn_ptr(vmsavedstatedumphandle, vpid, arg_2_typename, size);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)vmsavedstatedumphandle;
    (void)vpid;
    (void)arg_2_typename;
    (void)size;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hypervisor_getVpCount_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_system_hypervisor_guestPhysicalAddressToRawSavedMemoryOffset_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_system_hypervisor_guestVirtualAddressToPhysicalAddress_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_system_hypervisor_hdvCreateDeviceInstance_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_system_hypervisor_hdvCreateGuestMemoryAperture_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_system_hypervisor_hdvCreateSectionBackedMmioRange_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_system_hypervisor_hdvDeliverGuestInterrupt_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_system_hypervisor_hdvDestroyGuestMemoryAperture_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_system_hypervisor_hdvDestroySectionBackedMmioRange_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_system_hypervisor_hdvInitializeDeviceHost_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_system_hypervisor_hdvInitializeDeviceHostEx_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_system_hypervisor_hdvReadGuestMemory_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_system_hypervisor_hdvRegisterDoorbell_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_system_hypervisor_hdvTeardownDeviceHost_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_system_hypervisor_hdvUnregisterDoorbell_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_system_hypervisor_hdvWriteGuestMemory_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_system_hypervisor_inKernelSpace_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_system_hypervisor_isActiveVirtualTrustLevelEnabled_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_system_hypervisor_isNestedVirtualizationEnabled_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_system_hypervisor_loadSavedStateFile_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_system_hypervisor_loadSavedStateFiles_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_system_hypervisor_loadSavedStateModuleSymbols_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_system_hypervisor_loadSavedStateModuleSymbolsEx_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_system_hypervisor_loadSavedStateSymbolProvider_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_system_hypervisor_locateSavedStateFiles_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_system_hypervisor_readGuestPhysicalAddress_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_system_hypervisor_readGuestRawSavedMemory_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_system_hypervisor_readSavedStateGlobalVariable_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_system_hypervisor_releaseSavedStateFiles_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_system_hypervisor_releaseSavedStateSymbolProvider_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_system_hypervisor_resolveSavedStateGlobalVariableAddress_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_system_hypervisor_scanMemoryForDosImages_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_system_hypervisor_setMemoryBlockCacheLimit_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_system_hypervisor_setSavedStateSymbolProviderDebugInfoCallback_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_system_hypervisor_wHvAcceptPartitionMigration_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_system_hypervisor_wHvAdviseGpaRange_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_system_hypervisor_wHvAllocateVpciResource_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_system_hypervisor_wHvCancelPartitionMigration_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_system_hypervisor_wHvCancelRunVirtualProcessor_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_system_hypervisor_wHvCompletePartitionMigration_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_system_hypervisor_wHvCreateNotificationPort_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_system_hypervisor_wHvCreatePartition_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_system_hypervisor_wHvCreateTrigger_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_system_hypervisor_wHvCreateVirtualProcessor_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_system_hypervisor_wHvCreateVirtualProcessor2_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_system_hypervisor_wHvCreateVpciDevice_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_system_hypervisor_wHvDeleteNotificationPort_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_system_hypervisor_wHvDeletePartition_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_system_hypervisor_wHvDeleteTrigger_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_system_hypervisor_wHvDeleteVirtualProcessor_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_system_hypervisor_wHvDeleteVpciDevice_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_system_hypervisor_wHvEmulatorCreateEmulator_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_system_hypervisor_wHvEmulatorDestroyEmulator_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_system_hypervisor_wHvEmulatorTryIoEmulation_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_system_hypervisor_wHvEmulatorTryMmioEmulation_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_system_hypervisor_wHvGetCapability_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_system_hypervisor_wHvGetInterruptTargetVpSet_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_system_hypervisor_wHvGetPartitionCounters_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_system_hypervisor_wHvGetPartitionProperty_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_system_hypervisor_wHvGetVirtualProcessorCounters_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_system_hypervisor_wHvGetVirtualProcessorCpuidOutput_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_system_hypervisor_wHvGetVirtualProcessorInterruptControllerState_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_system_hypervisor_wHvGetVirtualProcessorInterruptControllerState2_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_system_hypervisor_wHvGetVirtualProcessorRegisters_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_system_hypervisor_wHvGetVirtualProcessorState_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_system_hypervisor_wHvGetVirtualProcessorXsaveState_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_system_hypervisor_wHvGetVpciDeviceInterruptTarget_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t partition = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint64_t logicaldeviceid = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    uint32_t arg_2_index = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
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
        km_res = km_fn_ptr(partition, logicaldeviceid, arg_2_index, multimessagenumber, target, targetsizeinbytes, byteswritten);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)partition;
    (void)logicaldeviceid;
    (void)arg_2_index;
    (void)multimessagenumber;
    (void)target;
    (void)targetsizeinbytes;
    (void)byteswritten;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hypervisor_wHvGetVpciDeviceNotification_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_system_hypervisor_wHvGetVpciDeviceProperty_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_system_hypervisor_wHvMapGpaRange_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_system_hypervisor_wHvMapGpaRange2_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_system_hypervisor_wHvMapVpciDeviceInterrupt_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t partition = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint64_t logicaldeviceid = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    uint32_t arg_2_index = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
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
        km_res = km_fn_ptr(partition, logicaldeviceid, arg_2_index, messagecount, target, msiaddress, msidata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)partition;
    (void)logicaldeviceid;
    (void)arg_2_index;
    (void)messagecount;
    (void)target;
    (void)msiaddress;
    (void)msidata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hypervisor_wHvMapVpciDeviceMmioRanges_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_system_hypervisor_wHvPostVirtualProcessorSynicMessage_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_system_hypervisor_wHvQueryGpaRangeDirtyBitmap_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_system_hypervisor_wHvReadVpciDeviceRegister_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t partition = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint64_t logicaldeviceid = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* arg_2_register = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
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
        km_res = km_fn_ptr(partition, logicaldeviceid, arg_2_register, data);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)partition;
    (void)logicaldeviceid;
    (void)arg_2_register;
    (void)data;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hypervisor_wHvRegisterPartitionDoorbellEvent_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_system_hypervisor_wHvRequestInterrupt_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_system_hypervisor_wHvRequestVpciDeviceInterrupt_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_system_hypervisor_wHvResetPartition_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_system_hypervisor_wHvResumePartitionTime_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_system_hypervisor_wHvRetargetVpciDeviceInterrupt_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_system_hypervisor_wHvRunVirtualProcessor_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_system_hypervisor_wHvSetNotificationPortProperty_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_system_hypervisor_wHvSetPartitionProperty_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_system_hypervisor_wHvSetVirtualProcessorInterruptControllerState_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_system_hypervisor_wHvSetVirtualProcessorInterruptControllerState2_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_system_hypervisor_wHvSetVirtualProcessorRegisters_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_system_hypervisor_wHvSetVirtualProcessorState_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_system_hypervisor_wHvSetVirtualProcessorXsaveState_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_system_hypervisor_wHvSetVpciDevicePowerState_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_system_hypervisor_wHvSetupPartition_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_system_hypervisor_wHvStartPartitionMigration_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_system_hypervisor_wHvSuspendPartitionTime_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_system_hypervisor_wHvTranslateGva_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_system_hypervisor_wHvUnmapGpaRange_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_system_hypervisor_wHvUnmapVpciDeviceInterrupt_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t partition = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint64_t logicaldeviceid = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    uint32_t arg_2_index = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WHvUnmapVpciDeviceInterrupt")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(partition, logicaldeviceid, arg_2_index);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)partition;
    (void)logicaldeviceid;
    (void)arg_2_index;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hypervisor_wHvUnmapVpciDeviceMmioRanges_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_system_hypervisor_wHvUnregisterPartitionDoorbellEvent_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_system_hypervisor_wHvUpdateTriggerParameters_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_system_hypervisor_wHvWriteVpciDeviceRegister_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t partition = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint64_t logicaldeviceid = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* arg_2_register = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
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
        km_res = km_fn_ptr(partition, logicaldeviceid, arg_2_register, data);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)partition;
    (void)logicaldeviceid;
    (void)arg_2_register;
    (void)data;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static void register_windows_win32_system_hypervisor_napi(Napi::Env env, Napi::Object exports) {
    exports.Set("windowssys_windows_win32_system_hypervisor_applyGuestMemoryFix", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_applyGuestMemoryFix_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_applyPendingSavedStateFileReplayLog", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_applyPendingSavedStateFileReplayLog_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_callStackUnwind", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_callStackUnwind_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_findSavedStateSymbolFieldInType", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_findSavedStateSymbolFieldInType_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_forceActiveVirtualTrustLevel", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_forceActiveVirtualTrustLevel_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_forceArchitecture", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_forceArchitecture_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_forceNestedHostMode", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_forceNestedHostMode_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_forcePagingMode", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_forcePagingMode_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_getActiveVirtualTrustLevel", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_getActiveVirtualTrustLevel_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_getArchitecture", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_getArchitecture_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_getEnabledVirtualTrustLevels", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_getEnabledVirtualTrustLevels_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_getGuestEnabledVirtualTrustLevels", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_getGuestEnabledVirtualTrustLevels_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_getGuestOsInfo", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_getGuestOsInfo_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_getGuestPhysicalMemoryChunks", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_getGuestPhysicalMemoryChunks_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_getGuestRawSavedMemorySize", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_getGuestRawSavedMemorySize_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_getMemoryBlockCacheLimit", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_getMemoryBlockCacheLimit_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_getNestedVirtualizationMode", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_getNestedVirtualizationMode_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_getPagingMode", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_getPagingMode_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_getRegisterValue", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_getRegisterValue_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_getSavedStateSymbolFieldInfo", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_getSavedStateSymbolFieldInfo_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_getSavedStateSymbolProviderHandle", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_getSavedStateSymbolProviderHandle_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_getSavedStateSymbolTypeSize", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_getSavedStateSymbolTypeSize_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_getVpCount", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_getVpCount_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_guestPhysicalAddressToRawSavedMemoryOffset", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_guestPhysicalAddressToRawSavedMemoryOffset_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_guestVirtualAddressToPhysicalAddress", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_guestVirtualAddressToPhysicalAddress_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_hdvCreateDeviceInstance", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_hdvCreateDeviceInstance_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_hdvCreateGuestMemoryAperture", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_hdvCreateGuestMemoryAperture_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_hdvCreateSectionBackedMmioRange", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_hdvCreateSectionBackedMmioRange_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_hdvDeliverGuestInterrupt", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_hdvDeliverGuestInterrupt_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_hdvDestroyGuestMemoryAperture", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_hdvDestroyGuestMemoryAperture_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_hdvDestroySectionBackedMmioRange", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_hdvDestroySectionBackedMmioRange_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_hdvInitializeDeviceHost", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_hdvInitializeDeviceHost_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_hdvInitializeDeviceHostEx", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_hdvInitializeDeviceHostEx_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_hdvReadGuestMemory", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_hdvReadGuestMemory_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_hdvRegisterDoorbell", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_hdvRegisterDoorbell_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_hdvTeardownDeviceHost", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_hdvTeardownDeviceHost_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_hdvUnregisterDoorbell", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_hdvUnregisterDoorbell_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_hdvWriteGuestMemory", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_hdvWriteGuestMemory_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_inKernelSpace", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_inKernelSpace_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_isActiveVirtualTrustLevelEnabled", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_isActiveVirtualTrustLevelEnabled_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_isNestedVirtualizationEnabled", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_isNestedVirtualizationEnabled_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_loadSavedStateFile", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_loadSavedStateFile_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_loadSavedStateFiles", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_loadSavedStateFiles_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_loadSavedStateModuleSymbols", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_loadSavedStateModuleSymbols_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_loadSavedStateModuleSymbolsEx", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_loadSavedStateModuleSymbolsEx_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_loadSavedStateSymbolProvider", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_loadSavedStateSymbolProvider_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_locateSavedStateFiles", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_locateSavedStateFiles_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_readGuestPhysicalAddress", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_readGuestPhysicalAddress_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_readGuestRawSavedMemory", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_readGuestRawSavedMemory_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_readSavedStateGlobalVariable", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_readSavedStateGlobalVariable_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_releaseSavedStateFiles", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_releaseSavedStateFiles_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_releaseSavedStateSymbolProvider", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_releaseSavedStateSymbolProvider_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_resolveSavedStateGlobalVariableAddress", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_resolveSavedStateGlobalVariableAddress_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_scanMemoryForDosImages", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_scanMemoryForDosImages_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_setMemoryBlockCacheLimit", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_setMemoryBlockCacheLimit_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_setSavedStateSymbolProviderDebugInfoCallback", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_setSavedStateSymbolProviderDebugInfoCallback_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_wHvAcceptPartitionMigration", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_wHvAcceptPartitionMigration_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_wHvAdviseGpaRange", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_wHvAdviseGpaRange_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_wHvAllocateVpciResource", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_wHvAllocateVpciResource_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_wHvCancelPartitionMigration", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_wHvCancelPartitionMigration_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_wHvCancelRunVirtualProcessor", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_wHvCancelRunVirtualProcessor_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_wHvCompletePartitionMigration", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_wHvCompletePartitionMigration_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_wHvCreateNotificationPort", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_wHvCreateNotificationPort_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_wHvCreatePartition", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_wHvCreatePartition_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_wHvCreateTrigger", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_wHvCreateTrigger_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_wHvCreateVirtualProcessor", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_wHvCreateVirtualProcessor_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_wHvCreateVirtualProcessor2", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_wHvCreateVirtualProcessor2_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_wHvCreateVpciDevice", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_wHvCreateVpciDevice_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_wHvDeleteNotificationPort", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_wHvDeleteNotificationPort_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_wHvDeletePartition", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_wHvDeletePartition_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_wHvDeleteTrigger", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_wHvDeleteTrigger_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_wHvDeleteVirtualProcessor", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_wHvDeleteVirtualProcessor_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_wHvDeleteVpciDevice", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_wHvDeleteVpciDevice_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_wHvEmulatorCreateEmulator", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_wHvEmulatorCreateEmulator_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_wHvEmulatorDestroyEmulator", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_wHvEmulatorDestroyEmulator_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_wHvEmulatorTryIoEmulation", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_wHvEmulatorTryIoEmulation_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_wHvEmulatorTryMmioEmulation", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_wHvEmulatorTryMmioEmulation_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_wHvGetCapability", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_wHvGetCapability_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_wHvGetInterruptTargetVpSet", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_wHvGetInterruptTargetVpSet_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_wHvGetPartitionCounters", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_wHvGetPartitionCounters_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_wHvGetPartitionProperty", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_wHvGetPartitionProperty_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_wHvGetVirtualProcessorCounters", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_wHvGetVirtualProcessorCounters_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_wHvGetVirtualProcessorCpuidOutput", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_wHvGetVirtualProcessorCpuidOutput_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_wHvGetVirtualProcessorInterruptControllerState", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_wHvGetVirtualProcessorInterruptControllerState_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_wHvGetVirtualProcessorInterruptControllerState2", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_wHvGetVirtualProcessorInterruptControllerState2_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_wHvGetVirtualProcessorRegisters", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_wHvGetVirtualProcessorRegisters_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_wHvGetVirtualProcessorState", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_wHvGetVirtualProcessorState_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_wHvGetVirtualProcessorXsaveState", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_wHvGetVirtualProcessorXsaveState_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_wHvGetVpciDeviceInterruptTarget", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_wHvGetVpciDeviceInterruptTarget_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_wHvGetVpciDeviceNotification", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_wHvGetVpciDeviceNotification_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_wHvGetVpciDeviceProperty", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_wHvGetVpciDeviceProperty_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_wHvMapGpaRange", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_wHvMapGpaRange_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_wHvMapGpaRange2", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_wHvMapGpaRange2_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_wHvMapVpciDeviceInterrupt", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_wHvMapVpciDeviceInterrupt_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_wHvMapVpciDeviceMmioRanges", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_wHvMapVpciDeviceMmioRanges_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_wHvPostVirtualProcessorSynicMessage", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_wHvPostVirtualProcessorSynicMessage_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_wHvQueryGpaRangeDirtyBitmap", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_wHvQueryGpaRangeDirtyBitmap_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_wHvReadVpciDeviceRegister", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_wHvReadVpciDeviceRegister_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_wHvRegisterPartitionDoorbellEvent", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_wHvRegisterPartitionDoorbellEvent_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_wHvRequestInterrupt", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_wHvRequestInterrupt_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_wHvRequestVpciDeviceInterrupt", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_wHvRequestVpciDeviceInterrupt_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_wHvResetPartition", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_wHvResetPartition_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_wHvResumePartitionTime", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_wHvResumePartitionTime_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_wHvRetargetVpciDeviceInterrupt", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_wHvRetargetVpciDeviceInterrupt_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_wHvRunVirtualProcessor", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_wHvRunVirtualProcessor_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_wHvSetNotificationPortProperty", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_wHvSetNotificationPortProperty_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_wHvSetPartitionProperty", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_wHvSetPartitionProperty_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_wHvSetVirtualProcessorInterruptControllerState", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_wHvSetVirtualProcessorInterruptControllerState_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_wHvSetVirtualProcessorInterruptControllerState2", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_wHvSetVirtualProcessorInterruptControllerState2_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_wHvSetVirtualProcessorRegisters", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_wHvSetVirtualProcessorRegisters_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_wHvSetVirtualProcessorState", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_wHvSetVirtualProcessorState_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_wHvSetVirtualProcessorXsaveState", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_wHvSetVirtualProcessorXsaveState_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_wHvSetVpciDevicePowerState", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_wHvSetVpciDevicePowerState_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_wHvSetupPartition", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_wHvSetupPartition_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_wHvStartPartitionMigration", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_wHvStartPartitionMigration_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_wHvSuspendPartitionTime", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_wHvSuspendPartitionTime_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_wHvTranslateGva", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_wHvTranslateGva_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_wHvUnmapGpaRange", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_wHvUnmapGpaRange_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_wHvUnmapVpciDeviceInterrupt", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_wHvUnmapVpciDeviceInterrupt_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_wHvUnmapVpciDeviceMmioRanges", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_wHvUnmapVpciDeviceMmioRanges_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_wHvUnregisterPartitionDoorbellEvent", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_wHvUnregisterPartitionDoorbellEvent_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_wHvUpdateTriggerParameters", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_wHvUpdateTriggerParameters_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_wHvWriteVpciDeviceRegister", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_wHvWriteVpciDeviceRegister_napi));
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
