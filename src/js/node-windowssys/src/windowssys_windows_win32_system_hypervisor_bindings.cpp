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

static Napi::Value windowssys_windows_win32_system_hypervisor_ApplyGuestMemoryFix_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(vmsavedstatedumphandle, vpid, virtualaddress, fixbuffer, fixbuffersize) : -1;
#else
    (void)vmsavedstatedumphandle;
    (void)vpid;
    (void)virtualaddress;
    (void)fixbuffer;
    (void)fixbuffersize;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hypervisor_ApplyPendingSavedStateFileReplayLog_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* vmrsfile = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ApplyPendingSavedStateFileReplayLog")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(vmrsfile) : -1;
#else
    (void)vmrsfile;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hypervisor_CallStackUnwind_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(vmsavedstatedumphandle, vpid, imageinfo, imageinfocount, framecount, callstack) : -1;
#else
    (void)vmsavedstatedumphandle;
    (void)vpid;
    (void)imageinfo;
    (void)imageinfocount;
    (void)framecount;
    (void)callstack;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hypervisor_FindSavedStateSymbolFieldInType_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(vmsavedstatedumphandle, vpid, arg_2_typename, fieldname, offset, found) : -1;
#else
    (void)vmsavedstatedumphandle;
    (void)vpid;
    (void)arg_2_typename;
    (void)fieldname;
    (void)offset;
    (void)found;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hypervisor_ForceActiveVirtualTrustLevel_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(vmsavedstatedumphandle, vpid, virtualtrustlevel) : -1;
#else
    (void)vmsavedstatedumphandle;
    (void)vpid;
    (void)virtualtrustlevel;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hypervisor_ForceArchitecture_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(vmsavedstatedumphandle, vpid, architecture) : -1;
#else
    (void)vmsavedstatedumphandle;
    (void)vpid;
    (void)architecture;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hypervisor_ForceNestedHostMode_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(vmsavedstatedumphandle, vpid, hostmode, oldmode) : -1;
#else
    (void)vmsavedstatedumphandle;
    (void)vpid;
    (void)hostmode;
    (void)oldmode;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hypervisor_ForcePagingMode_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(vmsavedstatedumphandle, vpid, pagingmode) : -1;
#else
    (void)vmsavedstatedumphandle;
    (void)vpid;
    (void)pagingmode;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hypervisor_GetActiveVirtualTrustLevel_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(vmsavedstatedumphandle, vpid, virtualtrustlevel) : -1;
#else
    (void)vmsavedstatedumphandle;
    (void)vpid;
    (void)virtualtrustlevel;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hypervisor_GetArchitecture_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(vmsavedstatedumphandle, vpid, architecture) : -1;
#else
    (void)vmsavedstatedumphandle;
    (void)vpid;
    (void)architecture;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hypervisor_GetEnabledVirtualTrustLevels_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(vmsavedstatedumphandle, vpid, virtualtrustlevels) : -1;
#else
    (void)vmsavedstatedumphandle;
    (void)vpid;
    (void)virtualtrustlevels;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hypervisor_GetGuestEnabledVirtualTrustLevels_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(vmsavedstatedumphandle, virtualtrustlevels) : -1;
#else
    (void)vmsavedstatedumphandle;
    (void)virtualtrustlevels;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hypervisor_GetGuestOsInfo_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(vmsavedstatedumphandle, virtualtrustlevel, guestosinfo) : -1;
#else
    (void)vmsavedstatedumphandle;
    (void)virtualtrustlevel;
    (void)guestosinfo;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hypervisor_GetGuestPhysicalMemoryChunks_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(vmsavedstatedumphandle, memorychunkpagesize, memorychunks, memorychunkcount) : -1;
#else
    (void)vmsavedstatedumphandle;
    (void)memorychunkpagesize;
    (void)memorychunks;
    (void)memorychunkcount;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hypervisor_GetGuestRawSavedMemorySize_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(vmsavedstatedumphandle, guestrawsavedmemorysize) : -1;
#else
    (void)vmsavedstatedumphandle;
    (void)guestrawsavedmemorysize;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hypervisor_GetMemoryBlockCacheLimit_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(vmsavedstatedumphandle, memoryblockcachelimit) : -1;
#else
    (void)vmsavedstatedumphandle;
    (void)memoryblockcachelimit;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hypervisor_GetNestedVirtualizationMode_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(vmsavedstatedumphandle, vpid, enabled) : -1;
#else
    (void)vmsavedstatedumphandle;
    (void)vpid;
    (void)enabled;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hypervisor_GetPagingMode_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(vmsavedstatedumphandle, vpid, pagingmode) : -1;
#else
    (void)vmsavedstatedumphandle;
    (void)vpid;
    (void)pagingmode;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hypervisor_GetRegisterValue_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(vmsavedstatedumphandle, vpid, registerid, registervalue) : -1;
#else
    (void)vmsavedstatedumphandle;
    (void)vpid;
    (void)registerid;
    (void)registervalue;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hypervisor_GetSavedStateSymbolFieldInfo_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(vmsavedstatedumphandle, vpid, arg_2_typename, typefieldinfomap) : -1;
#else
    (void)vmsavedstatedumphandle;
    (void)vpid;
    (void)arg_2_typename;
    (void)typefieldinfomap;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hypervisor_GetSavedStateSymbolProviderHandle_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* vmsavedstatedumphandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetSavedStateSymbolProviderHandle")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(vmsavedstatedumphandle) : NULL;
#else
    (void)vmsavedstatedumphandle;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_hypervisor_GetSavedStateSymbolTypeSize_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(vmsavedstatedumphandle, vpid, arg_2_typename, size) : -1;
#else
    (void)vmsavedstatedumphandle;
    (void)vpid;
    (void)arg_2_typename;
    (void)size;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hypervisor_GetVpCount_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(vmsavedstatedumphandle, vpcount) : -1;
#else
    (void)vmsavedstatedumphandle;
    (void)vpcount;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hypervisor_GuestPhysicalAddressToRawSavedMemoryOffset_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(vmsavedstatedumphandle, physicaladdress, rawsavedmemoryoffset) : -1;
#else
    (void)vmsavedstatedumphandle;
    (void)physicaladdress;
    (void)rawsavedmemoryoffset;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hypervisor_GuestVirtualAddressToPhysicalAddress_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(vmsavedstatedumphandle, vpid, virtualaddress, physicaladdress, unmappedregionsize) : -1;
#else
    (void)vmsavedstatedumphandle;
    (void)vpid;
    (void)virtualaddress;
    (void)physicaladdress;
    (void)unmappedregionsize;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hypervisor_HdvCreateDeviceInstance_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(devicehosthandle, devicetype, deviceclassid, deviceinstanceid, deviceinterface, devicecontext, devicehandle) : -1;
#else
    (void)devicehosthandle;
    (void)devicetype;
    (void)deviceclassid;
    (void)deviceinstanceid;
    (void)deviceinterface;
    (void)devicecontext;
    (void)devicehandle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hypervisor_HdvCreateGuestMemoryAperture_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(requestor, guestphysicaladdress, bytecount, writeprotected, mappedaddress) : -1;
#else
    (void)requestor;
    (void)guestphysicaladdress;
    (void)bytecount;
    (void)writeprotected;
    (void)mappedaddress;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hypervisor_HdvCreateSectionBackedMmioRange_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(requestor, barindex, offsetinpages, lengthinpages, mappingflags, sectionhandle, sectionoffsetinpages) : -1;
#else
    (void)requestor;
    (void)barindex;
    (void)offsetinpages;
    (void)lengthinpages;
    (void)mappingflags;
    (void)sectionhandle;
    (void)sectionoffsetinpages;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hypervisor_HdvDeliverGuestInterrupt_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(requestor, msiaddress, msidata) : -1;
#else
    (void)requestor;
    (void)msiaddress;
    (void)msidata;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hypervisor_HdvDestroyGuestMemoryAperture_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(requestor, mappedaddress) : -1;
#else
    (void)requestor;
    (void)mappedaddress;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hypervisor_HdvDestroySectionBackedMmioRange_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(requestor, barindex, offsetinpages) : -1;
#else
    (void)requestor;
    (void)barindex;
    (void)offsetinpages;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hypervisor_HdvInitializeDeviceHost_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(computesystem, devicehosthandle) : -1;
#else
    (void)computesystem;
    (void)devicehosthandle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hypervisor_HdvInitializeDeviceHostEx_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(computesystem, flags, devicehosthandle) : -1;
#else
    (void)computesystem;
    (void)flags;
    (void)devicehosthandle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hypervisor_HdvReadGuestMemory_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(requestor, guestphysicaladdress, bytecount, buffer) : -1;
#else
    (void)requestor;
    (void)guestphysicaladdress;
    (void)bytecount;
    (void)buffer;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hypervisor_HdvRegisterDoorbell_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(requestor, barindex, baroffset, triggervalue, flags, doorbellevent) : -1;
#else
    (void)requestor;
    (void)barindex;
    (void)baroffset;
    (void)triggervalue;
    (void)flags;
    (void)doorbellevent;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hypervisor_HdvTeardownDeviceHost_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* devicehosthandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("vmdevicehost.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HdvTeardownDeviceHost")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(devicehosthandle) : -1;
#else
    (void)devicehosthandle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hypervisor_HdvUnregisterDoorbell_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(requestor, barindex, baroffset, triggervalue, flags) : -1;
#else
    (void)requestor;
    (void)barindex;
    (void)baroffset;
    (void)triggervalue;
    (void)flags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hypervisor_HdvWriteGuestMemory_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(requestor, guestphysicaladdress, bytecount, buffer) : -1;
#else
    (void)requestor;
    (void)guestphysicaladdress;
    (void)bytecount;
    (void)buffer;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hypervisor_InKernelSpace_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(vmsavedstatedumphandle, vpid, inkernelspace) : -1;
#else
    (void)vmsavedstatedumphandle;
    (void)vpid;
    (void)inkernelspace;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hypervisor_IsActiveVirtualTrustLevelEnabled_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(vmsavedstatedumphandle, vpid, activevirtualtrustlevelenabled) : -1;
#else
    (void)vmsavedstatedumphandle;
    (void)vpid;
    (void)activevirtualtrustlevelenabled;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hypervisor_IsNestedVirtualizationEnabled_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(vmsavedstatedumphandle, enabled) : -1;
#else
    (void)vmsavedstatedumphandle;
    (void)enabled;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hypervisor_LoadSavedStateFile_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(vmrsfile, vmsavedstatedumphandle) : -1;
#else
    (void)vmrsfile;
    (void)vmsavedstatedumphandle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hypervisor_LoadSavedStateFiles_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(binfile, vsvfile, vmsavedstatedumphandle) : -1;
#else
    (void)binfile;
    (void)vsvfile;
    (void)vmsavedstatedumphandle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hypervisor_LoadSavedStateModuleSymbols_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(vmsavedstatedumphandle, imagename, modulename, baseaddress, sizeofbase) : -1;
#else
    (void)vmsavedstatedumphandle;
    (void)imagename;
    (void)modulename;
    (void)baseaddress;
    (void)sizeofbase;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hypervisor_LoadSavedStateModuleSymbolsEx_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(vmsavedstatedumphandle, imagename, imagetimestamp, modulename, baseaddress, sizeofbase) : -1;
#else
    (void)vmsavedstatedumphandle;
    (void)imagename;
    (void)imagetimestamp;
    (void)modulename;
    (void)baseaddress;
    (void)sizeofbase;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hypervisor_LoadSavedStateSymbolProvider_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(vmsavedstatedumphandle, usersymbols, force) : -1;
#else
    (void)vmsavedstatedumphandle;
    (void)usersymbols;
    (void)force;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hypervisor_LocateSavedStateFiles_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(vmname, snapshotname, binpath, vsvpath, vmrspath) : -1;
#else
    (void)vmname;
    (void)snapshotname;
    (void)binpath;
    (void)vsvpath;
    (void)vmrspath;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hypervisor_ReadGuestPhysicalAddress_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(vmsavedstatedumphandle, physicaladdress, buffer, buffersize, bytesread) : -1;
#else
    (void)vmsavedstatedumphandle;
    (void)physicaladdress;
    (void)buffer;
    (void)buffersize;
    (void)bytesread;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hypervisor_ReadGuestRawSavedMemory_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(vmsavedstatedumphandle, rawsavedmemoryoffset, buffer, buffersize, bytesread) : -1;
#else
    (void)vmsavedstatedumphandle;
    (void)rawsavedmemoryoffset;
    (void)buffer;
    (void)buffersize;
    (void)bytesread;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hypervisor_ReadSavedStateGlobalVariable_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(vmsavedstatedumphandle, vpid, globalname, buffer, buffersize) : -1;
#else
    (void)vmsavedstatedumphandle;
    (void)vpid;
    (void)globalname;
    (void)buffer;
    (void)buffersize;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hypervisor_ReleaseSavedStateFiles_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* vmsavedstatedumphandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ReleaseSavedStateFiles")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(vmsavedstatedumphandle) : -1;
#else
    (void)vmsavedstatedumphandle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hypervisor_ReleaseSavedStateSymbolProvider_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* vmsavedstatedumphandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ReleaseSavedStateSymbolProvider")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(vmsavedstatedumphandle) : -1;
#else
    (void)vmsavedstatedumphandle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hypervisor_ResolveSavedStateGlobalVariableAddress_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(vmsavedstatedumphandle, vpid, globalname, virtualaddress, size) : -1;
#else
    (void)vmsavedstatedumphandle;
    (void)vpid;
    (void)globalname;
    (void)virtualaddress;
    (void)size;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hypervisor_ScanMemoryForDosImages_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(vmsavedstatedumphandle, vpid, startaddress, endaddress, callbackcontext, foundimagecallback, standaloneaddress, standaloneaddresscount) : -1;
#else
    (void)vmsavedstatedumphandle;
    (void)vpid;
    (void)startaddress;
    (void)endaddress;
    (void)callbackcontext;
    (void)foundimagecallback;
    (void)standaloneaddress;
    (void)standaloneaddresscount;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hypervisor_SetMemoryBlockCacheLimit_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(vmsavedstatedumphandle, memoryblockcachelimit) : -1;
#else
    (void)vmsavedstatedumphandle;
    (void)memoryblockcachelimit;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hypervisor_SetSavedStateSymbolProviderDebugInfoCallback_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(vmsavedstatedumphandle, callback) : -1;
#else
    (void)vmsavedstatedumphandle;
    (void)callback;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hypervisor_WHvAcceptPartitionMigration_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(migrationhandle, partition) : -1;
#else
    (void)migrationhandle;
    (void)partition;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hypervisor_WHvAdviseGpaRange_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(partition, gparanges, gparangescount, advice, advicebuffer, advicebuffersizeinbytes) : -1;
#else
    (void)partition;
    (void)gparanges;
    (void)gparangescount;
    (void)advice;
    (void)advicebuffer;
    (void)advicebuffersizeinbytes;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hypervisor_WHvAllocateVpciResource_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(providerid, flags, resourcedescriptor, resourcedescriptorsizeinbytes, vpciresource) : -1;
#else
    (void)providerid;
    (void)flags;
    (void)resourcedescriptor;
    (void)resourcedescriptorsizeinbytes;
    (void)vpciresource;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hypervisor_WHvCancelPartitionMigration_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t partition = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WHvCancelPartitionMigration")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(partition) : -1;
#else
    (void)partition;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hypervisor_WHvCancelRunVirtualProcessor_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(partition, vpindex, flags) : -1;
#else
    (void)partition;
    (void)vpindex;
    (void)flags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hypervisor_WHvCompletePartitionMigration_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t partition = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WHvCompletePartitionMigration")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(partition) : -1;
#else
    (void)partition;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hypervisor_WHvCreateNotificationPort_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(partition, parameters, eventhandle, porthandle) : -1;
#else
    (void)partition;
    (void)parameters;
    (void)eventhandle;
    (void)porthandle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hypervisor_WHvCreatePartition_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* partition = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WHvCreatePartition")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(partition) : -1;
#else
    (void)partition;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hypervisor_WHvCreateTrigger_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(partition, parameters, triggerhandle, eventhandle) : -1;
#else
    (void)partition;
    (void)parameters;
    (void)triggerhandle;
    (void)eventhandle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hypervisor_WHvCreateVirtualProcessor_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(partition, vpindex, flags) : -1;
#else
    (void)partition;
    (void)vpindex;
    (void)flags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hypervisor_WHvCreateVirtualProcessor2_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(partition, vpindex, properties, propertycount) : -1;
#else
    (void)partition;
    (void)vpindex;
    (void)properties;
    (void)propertycount;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hypervisor_WHvCreateVpciDevice_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(partition, logicaldeviceid, vpciresource, flags, notificationeventhandle) : -1;
#else
    (void)partition;
    (void)logicaldeviceid;
    (void)vpciresource;
    (void)flags;
    (void)notificationeventhandle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hypervisor_WHvDeleteNotificationPort_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(partition, porthandle) : -1;
#else
    (void)partition;
    (void)porthandle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hypervisor_WHvDeletePartition_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t partition = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WHvDeletePartition")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(partition) : -1;
#else
    (void)partition;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hypervisor_WHvDeleteTrigger_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(partition, triggerhandle) : -1;
#else
    (void)partition;
    (void)triggerhandle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hypervisor_WHvDeleteVirtualProcessor_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(partition, vpindex) : -1;
#else
    (void)partition;
    (void)vpindex;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hypervisor_WHvDeleteVpciDevice_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(partition, logicaldeviceid) : -1;
#else
    (void)partition;
    (void)logicaldeviceid;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hypervisor_WHvEmulatorCreateEmulator_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(callbacks, emulator) : -1;
#else
    (void)callbacks;
    (void)emulator;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hypervisor_WHvEmulatorDestroyEmulator_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* emulator = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winhvemulation.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WHvEmulatorDestroyEmulator")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(emulator) : -1;
#else
    (void)emulator;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hypervisor_WHvEmulatorTryIoEmulation_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(emulator, context, vpcontext, ioinstructioncontext, emulatorreturnstatus) : -1;
#else
    (void)emulator;
    (void)context;
    (void)vpcontext;
    (void)ioinstructioncontext;
    (void)emulatorreturnstatus;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hypervisor_WHvEmulatorTryMmioEmulation_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(emulator, context, vpcontext, mmioinstructioncontext, emulatorreturnstatus) : -1;
#else
    (void)emulator;
    (void)context;
    (void)vpcontext;
    (void)mmioinstructioncontext;
    (void)emulatorreturnstatus;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hypervisor_WHvGetCapability_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(capabilitycode, capabilitybuffer, capabilitybuffersizeinbytes, writtensizeinbytes) : -1;
#else
    (void)capabilitycode;
    (void)capabilitybuffer;
    (void)capabilitybuffersizeinbytes;
    (void)writtensizeinbytes;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hypervisor_WHvGetInterruptTargetVpSet_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(partition, destination, destinationmode, targetvps, vpcount, targetvpcount) : -1;
#else
    (void)partition;
    (void)destination;
    (void)destinationmode;
    (void)targetvps;
    (void)vpcount;
    (void)targetvpcount;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hypervisor_WHvGetPartitionCounters_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(partition, counterset, buffer, buffersizeinbytes, byteswritten) : -1;
#else
    (void)partition;
    (void)counterset;
    (void)buffer;
    (void)buffersizeinbytes;
    (void)byteswritten;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hypervisor_WHvGetPartitionProperty_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(partition, propertycode, propertybuffer, propertybuffersizeinbytes, writtensizeinbytes) : -1;
#else
    (void)partition;
    (void)propertycode;
    (void)propertybuffer;
    (void)propertybuffersizeinbytes;
    (void)writtensizeinbytes;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hypervisor_WHvGetVirtualProcessorCounters_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(partition, vpindex, counterset, buffer, buffersizeinbytes, byteswritten) : -1;
#else
    (void)partition;
    (void)vpindex;
    (void)counterset;
    (void)buffer;
    (void)buffersizeinbytes;
    (void)byteswritten;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hypervisor_WHvGetVirtualProcessorCpuidOutput_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(partition, vpindex, eax, ecx, cpuidoutput) : -1;
#else
    (void)partition;
    (void)vpindex;
    (void)eax;
    (void)ecx;
    (void)cpuidoutput;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hypervisor_WHvGetVirtualProcessorInterruptControllerState_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(partition, vpindex, state, statesize, writtensize) : -1;
#else
    (void)partition;
    (void)vpindex;
    (void)state;
    (void)statesize;
    (void)writtensize;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hypervisor_WHvGetVirtualProcessorInterruptControllerState2_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(partition, vpindex, state, statesize, writtensize) : -1;
#else
    (void)partition;
    (void)vpindex;
    (void)state;
    (void)statesize;
    (void)writtensize;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hypervisor_WHvGetVirtualProcessorRegisters_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(partition, vpindex, registernames, registercount, registervalues) : -1;
#else
    (void)partition;
    (void)vpindex;
    (void)registernames;
    (void)registercount;
    (void)registervalues;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hypervisor_WHvGetVirtualProcessorState_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(partition, vpindex, statetype, buffer, buffersizeinbytes, byteswritten) : -1;
#else
    (void)partition;
    (void)vpindex;
    (void)statetype;
    (void)buffer;
    (void)buffersizeinbytes;
    (void)byteswritten;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hypervisor_WHvGetVirtualProcessorXsaveState_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(partition, vpindex, buffer, buffersizeinbytes, byteswritten) : -1;
#else
    (void)partition;
    (void)vpindex;
    (void)buffer;
    (void)buffersizeinbytes;
    (void)byteswritten;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hypervisor_WHvGetVpciDeviceInterruptTarget_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(partition, logicaldeviceid, arg_2_index, multimessagenumber, target, targetsizeinbytes, byteswritten) : -1;
#else
    (void)partition;
    (void)logicaldeviceid;
    (void)arg_2_index;
    (void)multimessagenumber;
    (void)target;
    (void)targetsizeinbytes;
    (void)byteswritten;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hypervisor_WHvGetVpciDeviceNotification_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(partition, logicaldeviceid, notification, notificationsizeinbytes) : -1;
#else
    (void)partition;
    (void)logicaldeviceid;
    (void)notification;
    (void)notificationsizeinbytes;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hypervisor_WHvGetVpciDeviceProperty_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(partition, logicaldeviceid, propertycode, propertybuffer, propertybuffersizeinbytes, writtensizeinbytes) : -1;
#else
    (void)partition;
    (void)logicaldeviceid;
    (void)propertycode;
    (void)propertybuffer;
    (void)propertybuffersizeinbytes;
    (void)writtensizeinbytes;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hypervisor_WHvMapGpaRange_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(partition, sourceaddress, guestaddress, sizeinbytes, flags) : -1;
#else
    (void)partition;
    (void)sourceaddress;
    (void)guestaddress;
    (void)sizeinbytes;
    (void)flags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hypervisor_WHvMapGpaRange2_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(partition, process, sourceaddress, guestaddress, sizeinbytes, flags) : -1;
#else
    (void)partition;
    (void)process;
    (void)sourceaddress;
    (void)guestaddress;
    (void)sizeinbytes;
    (void)flags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hypervisor_WHvMapVpciDeviceInterrupt_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(partition, logicaldeviceid, arg_2_index, messagecount, target, msiaddress, msidata) : -1;
#else
    (void)partition;
    (void)logicaldeviceid;
    (void)arg_2_index;
    (void)messagecount;
    (void)target;
    (void)msiaddress;
    (void)msidata;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hypervisor_WHvMapVpciDeviceMmioRanges_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(partition, logicaldeviceid, mappingcount, mappings) : -1;
#else
    (void)partition;
    (void)logicaldeviceid;
    (void)mappingcount;
    (void)mappings;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hypervisor_WHvPostVirtualProcessorSynicMessage_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(partition, vpindex, sintindex, message, messagesizeinbytes) : -1;
#else
    (void)partition;
    (void)vpindex;
    (void)sintindex;
    (void)message;
    (void)messagesizeinbytes;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hypervisor_WHvQueryGpaRangeDirtyBitmap_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(partition, guestaddress, rangesizeinbytes, bitmap, bitmapsizeinbytes) : -1;
#else
    (void)partition;
    (void)guestaddress;
    (void)rangesizeinbytes;
    (void)bitmap;
    (void)bitmapsizeinbytes;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hypervisor_WHvReadVpciDeviceRegister_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(partition, logicaldeviceid, arg_2_register, data) : -1;
#else
    (void)partition;
    (void)logicaldeviceid;
    (void)arg_2_register;
    (void)data;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hypervisor_WHvRegisterPartitionDoorbellEvent_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(partition, matchdata, eventhandle) : -1;
#else
    (void)partition;
    (void)matchdata;
    (void)eventhandle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hypervisor_WHvRequestInterrupt_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(partition, interrupt, interruptcontrolsize) : -1;
#else
    (void)partition;
    (void)interrupt;
    (void)interruptcontrolsize;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hypervisor_WHvRequestVpciDeviceInterrupt_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(partition, logicaldeviceid, msiaddress, msidata) : -1;
#else
    (void)partition;
    (void)logicaldeviceid;
    (void)msiaddress;
    (void)msidata;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hypervisor_WHvResetPartition_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t partition = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WHvResetPartition")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(partition) : -1;
#else
    (void)partition;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hypervisor_WHvResumePartitionTime_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t partition = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WHvResumePartitionTime")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(partition) : -1;
#else
    (void)partition;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hypervisor_WHvRetargetVpciDeviceInterrupt_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(partition, logicaldeviceid, msiaddress, msidata, target) : -1;
#else
    (void)partition;
    (void)logicaldeviceid;
    (void)msiaddress;
    (void)msidata;
    (void)target;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hypervisor_WHvRunVirtualProcessor_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(partition, vpindex, exitcontext, exitcontextsizeinbytes) : -1;
#else
    (void)partition;
    (void)vpindex;
    (void)exitcontext;
    (void)exitcontextsizeinbytes;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hypervisor_WHvSetNotificationPortProperty_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(partition, porthandle, propertycode, propertyvalue) : -1;
#else
    (void)partition;
    (void)porthandle;
    (void)propertycode;
    (void)propertyvalue;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hypervisor_WHvSetPartitionProperty_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(partition, propertycode, propertybuffer, propertybuffersizeinbytes) : -1;
#else
    (void)partition;
    (void)propertycode;
    (void)propertybuffer;
    (void)propertybuffersizeinbytes;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hypervisor_WHvSetVirtualProcessorInterruptControllerState_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(partition, vpindex, state, statesize) : -1;
#else
    (void)partition;
    (void)vpindex;
    (void)state;
    (void)statesize;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hypervisor_WHvSetVirtualProcessorInterruptControllerState2_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(partition, vpindex, state, statesize) : -1;
#else
    (void)partition;
    (void)vpindex;
    (void)state;
    (void)statesize;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hypervisor_WHvSetVirtualProcessorRegisters_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(partition, vpindex, registernames, registercount, registervalues) : -1;
#else
    (void)partition;
    (void)vpindex;
    (void)registernames;
    (void)registercount;
    (void)registervalues;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hypervisor_WHvSetVirtualProcessorState_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(partition, vpindex, statetype, buffer, buffersizeinbytes) : -1;
#else
    (void)partition;
    (void)vpindex;
    (void)statetype;
    (void)buffer;
    (void)buffersizeinbytes;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hypervisor_WHvSetVirtualProcessorXsaveState_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(partition, vpindex, buffer, buffersizeinbytes) : -1;
#else
    (void)partition;
    (void)vpindex;
    (void)buffer;
    (void)buffersizeinbytes;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hypervisor_WHvSetVpciDevicePowerState_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(partition, logicaldeviceid, powerstate) : -1;
#else
    (void)partition;
    (void)logicaldeviceid;
    (void)powerstate;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hypervisor_WHvSetupPartition_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t partition = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WHvSetupPartition")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(partition) : -1;
#else
    (void)partition;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hypervisor_WHvStartPartitionMigration_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(partition, migrationhandle) : -1;
#else
    (void)partition;
    (void)migrationhandle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hypervisor_WHvSuspendPartitionTime_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t partition = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WHvSuspendPartitionTime")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(partition) : -1;
#else
    (void)partition;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hypervisor_WHvTranslateGva_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(partition, vpindex, gva, translateflags, translationresult, gpa) : -1;
#else
    (void)partition;
    (void)vpindex;
    (void)gva;
    (void)translateflags;
    (void)translationresult;
    (void)gpa;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hypervisor_WHvUnmapGpaRange_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(partition, guestaddress, sizeinbytes) : -1;
#else
    (void)partition;
    (void)guestaddress;
    (void)sizeinbytes;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hypervisor_WHvUnmapVpciDeviceInterrupt_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(partition, logicaldeviceid, arg_2_index) : -1;
#else
    (void)partition;
    (void)logicaldeviceid;
    (void)arg_2_index;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hypervisor_WHvUnmapVpciDeviceMmioRanges_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(partition, logicaldeviceid) : -1;
#else
    (void)partition;
    (void)logicaldeviceid;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hypervisor_WHvUnregisterPartitionDoorbellEvent_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(partition, matchdata) : -1;
#else
    (void)partition;
    (void)matchdata;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hypervisor_WHvUpdateTriggerParameters_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(partition, parameters, triggerhandle) : -1;
#else
    (void)partition;
    (void)parameters;
    (void)triggerhandle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hypervisor_WHvWriteVpciDeviceRegister_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(partition, logicaldeviceid, arg_2_register, data) : -1;
#else
    (void)partition;
    (void)logicaldeviceid;
    (void)arg_2_register;
    (void)data;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static void register_windows_win32_system_hypervisor_napi(Napi::Env env, Napi::Object exports) {
    exports.Set("windowssys_windows_win32_system_hypervisor_ApplyGuestMemoryFix", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_ApplyGuestMemoryFix_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_ApplyPendingSavedStateFileReplayLog", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_ApplyPendingSavedStateFileReplayLog_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_CallStackUnwind", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_CallStackUnwind_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_FindSavedStateSymbolFieldInType", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_FindSavedStateSymbolFieldInType_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_ForceActiveVirtualTrustLevel", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_ForceActiveVirtualTrustLevel_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_ForceArchitecture", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_ForceArchitecture_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_ForceNestedHostMode", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_ForceNestedHostMode_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_ForcePagingMode", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_ForcePagingMode_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_GetActiveVirtualTrustLevel", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_GetActiveVirtualTrustLevel_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_GetArchitecture", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_GetArchitecture_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_GetEnabledVirtualTrustLevels", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_GetEnabledVirtualTrustLevels_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_GetGuestEnabledVirtualTrustLevels", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_GetGuestEnabledVirtualTrustLevels_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_GetGuestOsInfo", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_GetGuestOsInfo_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_GetGuestPhysicalMemoryChunks", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_GetGuestPhysicalMemoryChunks_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_GetGuestRawSavedMemorySize", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_GetGuestRawSavedMemorySize_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_GetMemoryBlockCacheLimit", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_GetMemoryBlockCacheLimit_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_GetNestedVirtualizationMode", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_GetNestedVirtualizationMode_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_GetPagingMode", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_GetPagingMode_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_GetRegisterValue", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_GetRegisterValue_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_GetSavedStateSymbolFieldInfo", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_GetSavedStateSymbolFieldInfo_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_GetSavedStateSymbolProviderHandle", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_GetSavedStateSymbolProviderHandle_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_GetSavedStateSymbolTypeSize", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_GetSavedStateSymbolTypeSize_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_GetVpCount", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_GetVpCount_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_GuestPhysicalAddressToRawSavedMemoryOffset", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_GuestPhysicalAddressToRawSavedMemoryOffset_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_GuestVirtualAddressToPhysicalAddress", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_GuestVirtualAddressToPhysicalAddress_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_HdvCreateDeviceInstance", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_HdvCreateDeviceInstance_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_HdvCreateGuestMemoryAperture", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_HdvCreateGuestMemoryAperture_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_HdvCreateSectionBackedMmioRange", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_HdvCreateSectionBackedMmioRange_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_HdvDeliverGuestInterrupt", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_HdvDeliverGuestInterrupt_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_HdvDestroyGuestMemoryAperture", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_HdvDestroyGuestMemoryAperture_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_HdvDestroySectionBackedMmioRange", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_HdvDestroySectionBackedMmioRange_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_HdvInitializeDeviceHost", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_HdvInitializeDeviceHost_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_HdvInitializeDeviceHostEx", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_HdvInitializeDeviceHostEx_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_HdvReadGuestMemory", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_HdvReadGuestMemory_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_HdvRegisterDoorbell", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_HdvRegisterDoorbell_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_HdvTeardownDeviceHost", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_HdvTeardownDeviceHost_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_HdvUnregisterDoorbell", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_HdvUnregisterDoorbell_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_HdvWriteGuestMemory", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_HdvWriteGuestMemory_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_InKernelSpace", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_InKernelSpace_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_IsActiveVirtualTrustLevelEnabled", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_IsActiveVirtualTrustLevelEnabled_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_IsNestedVirtualizationEnabled", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_IsNestedVirtualizationEnabled_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_LoadSavedStateFile", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_LoadSavedStateFile_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_LoadSavedStateFiles", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_LoadSavedStateFiles_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_LoadSavedStateModuleSymbols", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_LoadSavedStateModuleSymbols_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_LoadSavedStateModuleSymbolsEx", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_LoadSavedStateModuleSymbolsEx_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_LoadSavedStateSymbolProvider", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_LoadSavedStateSymbolProvider_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_LocateSavedStateFiles", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_LocateSavedStateFiles_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_ReadGuestPhysicalAddress", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_ReadGuestPhysicalAddress_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_ReadGuestRawSavedMemory", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_ReadGuestRawSavedMemory_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_ReadSavedStateGlobalVariable", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_ReadSavedStateGlobalVariable_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_ReleaseSavedStateFiles", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_ReleaseSavedStateFiles_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_ReleaseSavedStateSymbolProvider", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_ReleaseSavedStateSymbolProvider_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_ResolveSavedStateGlobalVariableAddress", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_ResolveSavedStateGlobalVariableAddress_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_ScanMemoryForDosImages", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_ScanMemoryForDosImages_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_SetMemoryBlockCacheLimit", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_SetMemoryBlockCacheLimit_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_SetSavedStateSymbolProviderDebugInfoCallback", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_SetSavedStateSymbolProviderDebugInfoCallback_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_WHvAcceptPartitionMigration", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_WHvAcceptPartitionMigration_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_WHvAdviseGpaRange", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_WHvAdviseGpaRange_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_WHvAllocateVpciResource", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_WHvAllocateVpciResource_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_WHvCancelPartitionMigration", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_WHvCancelPartitionMigration_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_WHvCancelRunVirtualProcessor", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_WHvCancelRunVirtualProcessor_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_WHvCompletePartitionMigration", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_WHvCompletePartitionMigration_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_WHvCreateNotificationPort", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_WHvCreateNotificationPort_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_WHvCreatePartition", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_WHvCreatePartition_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_WHvCreateTrigger", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_WHvCreateTrigger_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_WHvCreateVirtualProcessor", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_WHvCreateVirtualProcessor_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_WHvCreateVirtualProcessor2", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_WHvCreateVirtualProcessor2_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_WHvCreateVpciDevice", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_WHvCreateVpciDevice_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_WHvDeleteNotificationPort", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_WHvDeleteNotificationPort_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_WHvDeletePartition", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_WHvDeletePartition_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_WHvDeleteTrigger", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_WHvDeleteTrigger_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_WHvDeleteVirtualProcessor", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_WHvDeleteVirtualProcessor_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_WHvDeleteVpciDevice", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_WHvDeleteVpciDevice_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_WHvEmulatorCreateEmulator", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_WHvEmulatorCreateEmulator_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_WHvEmulatorDestroyEmulator", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_WHvEmulatorDestroyEmulator_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_WHvEmulatorTryIoEmulation", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_WHvEmulatorTryIoEmulation_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_WHvEmulatorTryMmioEmulation", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_WHvEmulatorTryMmioEmulation_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_WHvGetCapability", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_WHvGetCapability_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_WHvGetInterruptTargetVpSet", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_WHvGetInterruptTargetVpSet_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_WHvGetPartitionCounters", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_WHvGetPartitionCounters_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_WHvGetPartitionProperty", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_WHvGetPartitionProperty_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_WHvGetVirtualProcessorCounters", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_WHvGetVirtualProcessorCounters_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_WHvGetVirtualProcessorCpuidOutput", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_WHvGetVirtualProcessorCpuidOutput_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_WHvGetVirtualProcessorInterruptControllerState", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_WHvGetVirtualProcessorInterruptControllerState_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_WHvGetVirtualProcessorInterruptControllerState2", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_WHvGetVirtualProcessorInterruptControllerState2_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_WHvGetVirtualProcessorRegisters", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_WHvGetVirtualProcessorRegisters_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_WHvGetVirtualProcessorState", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_WHvGetVirtualProcessorState_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_WHvGetVirtualProcessorXsaveState", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_WHvGetVirtualProcessorXsaveState_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_WHvGetVpciDeviceInterruptTarget", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_WHvGetVpciDeviceInterruptTarget_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_WHvGetVpciDeviceNotification", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_WHvGetVpciDeviceNotification_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_WHvGetVpciDeviceProperty", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_WHvGetVpciDeviceProperty_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_WHvMapGpaRange", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_WHvMapGpaRange_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_WHvMapGpaRange2", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_WHvMapGpaRange2_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_WHvMapVpciDeviceInterrupt", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_WHvMapVpciDeviceInterrupt_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_WHvMapVpciDeviceMmioRanges", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_WHvMapVpciDeviceMmioRanges_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_WHvPostVirtualProcessorSynicMessage", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_WHvPostVirtualProcessorSynicMessage_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_WHvQueryGpaRangeDirtyBitmap", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_WHvQueryGpaRangeDirtyBitmap_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_WHvReadVpciDeviceRegister", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_WHvReadVpciDeviceRegister_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_WHvRegisterPartitionDoorbellEvent", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_WHvRegisterPartitionDoorbellEvent_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_WHvRequestInterrupt", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_WHvRequestInterrupt_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_WHvRequestVpciDeviceInterrupt", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_WHvRequestVpciDeviceInterrupt_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_WHvResetPartition", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_WHvResetPartition_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_WHvResumePartitionTime", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_WHvResumePartitionTime_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_WHvRetargetVpciDeviceInterrupt", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_WHvRetargetVpciDeviceInterrupt_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_WHvRunVirtualProcessor", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_WHvRunVirtualProcessor_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_WHvSetNotificationPortProperty", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_WHvSetNotificationPortProperty_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_WHvSetPartitionProperty", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_WHvSetPartitionProperty_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_WHvSetVirtualProcessorInterruptControllerState", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_WHvSetVirtualProcessorInterruptControllerState_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_WHvSetVirtualProcessorInterruptControllerState2", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_WHvSetVirtualProcessorInterruptControllerState2_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_WHvSetVirtualProcessorRegisters", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_WHvSetVirtualProcessorRegisters_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_WHvSetVirtualProcessorState", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_WHvSetVirtualProcessorState_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_WHvSetVirtualProcessorXsaveState", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_WHvSetVirtualProcessorXsaveState_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_WHvSetVpciDevicePowerState", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_WHvSetVpciDevicePowerState_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_WHvSetupPartition", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_WHvSetupPartition_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_WHvStartPartitionMigration", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_WHvStartPartitionMigration_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_WHvSuspendPartitionTime", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_WHvSuspendPartitionTime_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_WHvTranslateGva", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_WHvTranslateGva_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_WHvUnmapGpaRange", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_WHvUnmapGpaRange_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_WHvUnmapVpciDeviceInterrupt", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_WHvUnmapVpciDeviceInterrupt_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_WHvUnmapVpciDeviceMmioRanges", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_WHvUnmapVpciDeviceMmioRanges_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_WHvUnregisterPartitionDoorbellEvent", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_WHvUnregisterPartitionDoorbellEvent_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_WHvUpdateTriggerParameters", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_WHvUpdateTriggerParameters_napi));
    exports.Set("windowssys_windows_win32_system_hypervisor_WHvWriteVpciDeviceRegister", Napi::Function::New(env, windowssys_windows_win32_system_hypervisor_WHvWriteVpciDeviceRegister_napi));
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
