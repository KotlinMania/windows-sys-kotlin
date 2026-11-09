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

static Napi::Value windowssys_windows_win32_networkmanagement_wnet_MultinetGetConnectionPerformanceA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpnetresource = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpnetconnectinfostruct = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mpr.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MultinetGetConnectionPerformanceA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpnetresource, lpnetconnectinfostruct) : 0;
#else
    (void)lpnetresource;
    (void)lpnetconnectinfostruct;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_wnet_MultinetGetConnectionPerformanceW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpnetresource = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpnetconnectinfostruct = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mpr.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MultinetGetConnectionPerformanceW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpnetresource, lpnetconnectinfostruct) : 0;
#else
    (void)lpnetresource;
    (void)lpnetconnectinfostruct;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_wnet_NPAddConnection_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpnetresource = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lppassword = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* lpusername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("davclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NPAddConnection")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpnetresource, lppassword, lpusername) : 0;
#else
    (void)lpnetresource;
    (void)lppassword;
    (void)lpusername;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_wnet_NPAddConnection3_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hwndowner = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpnetresource = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* lppassword = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* lpusername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("davclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NPAddConnection3")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hwndowner, lpnetresource, lppassword, lpusername, dwflags) : 0;
#else
    (void)hwndowner;
    (void)lpnetresource;
    (void)lppassword;
    (void)lpusername;
    (void)dwflags;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_wnet_NPAddConnection4_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hwndowner = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpnetresource = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* lpauthbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t cbauthbuffer = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* lpuseoptions = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    uint32_t cbuseoptions = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntlanman.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NPAddConnection4")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hwndowner, lpnetresource, lpauthbuffer, cbauthbuffer, dwflags, lpuseoptions, cbuseoptions) : 0;
#else
    (void)hwndowner;
    (void)lpnetresource;
    (void)lpauthbuffer;
    (void)cbauthbuffer;
    (void)dwflags;
    (void)lpuseoptions;
    (void)cbuseoptions;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_wnet_NPCancelConnection_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t fforce = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("davclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NPCancelConnection")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpname, fforce) : 0;
#else
    (void)lpname;
    (void)fforce;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_wnet_NPCancelConnection2_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t fforce = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntlanman.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NPCancelConnection2")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpname, fforce, dwflags) : 0;
#else
    (void)lpname;
    (void)fforce;
    (void)dwflags;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_wnet_NPCloseEnum_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* henum = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("davclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NPCloseEnum")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(henum) : 0;
#else
    (void)henum;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_wnet_NPEnumResource_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* henum = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpccount = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* lpbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* lpbuffersize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("davclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NPEnumResource")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(henum, lpccount, lpbuffer, lpbuffersize) : 0;
#else
    (void)henum;
    (void)lpccount;
    (void)lpbuffer;
    (void)lpbuffersize;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_wnet_NPFormatNetworkName_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpremotename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpformattedname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* lpnlength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t dwavecharperline = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("davclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NPFormatNetworkName")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpremotename, lpformattedname, lpnlength, dwflags, dwavecharperline) : 0;
#else
    (void)lpremotename;
    (void)lpformattedname;
    (void)lpnlength;
    (void)dwflags;
    (void)dwavecharperline;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_wnet_NPGetCaps_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t ndex = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("davclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NPGetCaps")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(ndex) : 0;
#else
    (void)ndex;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_wnet_NPGetConnection_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lplocalname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpremotename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* lpnbufferlen = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("davclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NPGetConnection")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lplocalname, lpremotename, lpnbufferlen) : 0;
#else
    (void)lplocalname;
    (void)lpremotename;
    (void)lpnbufferlen;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_wnet_NPGetConnection3_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lplocalname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwlevel = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* lpbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* lpbuffersize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntlanman.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NPGetConnection3")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lplocalname, dwlevel, lpbuffer, lpbuffersize) : 0;
#else
    (void)lplocalname;
    (void)dwlevel;
    (void)lpbuffer;
    (void)lpbuffersize;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_wnet_NPGetConnectionPerformance_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpremotename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpnetconnectinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntlanman.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NPGetConnectionPerformance")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpremotename, lpnetconnectinfo) : 0;
#else
    (void)lpremotename;
    (void)lpnetconnectinfo;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_wnet_NPGetPersistentUseOptionsForConnection_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpremotepath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpreaduseoptions = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t cbreaduseoptions = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* lpwriteuseoptions = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* lpsizewriteuseoptions = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntlanman.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NPGetPersistentUseOptionsForConnection")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpremotepath, lpreaduseoptions, cbreaduseoptions, lpwriteuseoptions, lpsizewriteuseoptions) : 0;
#else
    (void)lpremotepath;
    (void)lpreaduseoptions;
    (void)cbreaduseoptions;
    (void)lpwriteuseoptions;
    (void)lpsizewriteuseoptions;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_wnet_NPGetResourceInformation_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpnetresource = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* lpbuffersize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* lplpsystem = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("davclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NPGetResourceInformation")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpnetresource, lpbuffer, lpbuffersize, lplpsystem) : 0;
#else
    (void)lpnetresource;
    (void)lpbuffer;
    (void)lpbuffersize;
    (void)lplpsystem;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_wnet_NPGetResourceParent_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpnetresource = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* lpbuffersize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("davclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NPGetResourceParent")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpnetresource, lpbuffer, lpbuffersize) : 0;
#else
    (void)lpnetresource;
    (void)lpbuffer;
    (void)lpbuffersize;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_wnet_NPGetUniversalName_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lplocalpath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwinfolevel = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* lpbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* lpbuffersize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("davclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NPGetUniversalName")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lplocalpath, dwinfolevel, lpbuffer, lpbuffersize) : 0;
#else
    (void)lplocalpath;
    (void)dwinfolevel;
    (void)lpbuffer;
    (void)lpbuffersize;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_wnet_NPGetUser_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpusername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* lpnbufferlen = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("davclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NPGetUser")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpname, lpusername, lpnbufferlen) : 0;
#else
    (void)lpname;
    (void)lpusername;
    (void)lpnbufferlen;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_wnet_NPOpenEnum_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwscope = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t dwtype = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t dwusage = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* lpnetresource = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* lphenum = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("davclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NPOpenEnum")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwscope, dwtype, dwusage, lpnetresource, lphenum) : 0;
#else
    (void)dwscope;
    (void)dwtype;
    (void)dwusage;
    (void)lpnetresource;
    (void)lphenum;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_wnet_WNetAddConnection2A_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpnetresource = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lppassword = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* lpusername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mpr.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WNetAddConnection2A")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpnetresource, lppassword, lpusername, dwflags) : 0;
#else
    (void)lpnetresource;
    (void)lppassword;
    (void)lpusername;
    (void)dwflags;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_wnet_WNetAddConnection2W_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpnetresource = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lppassword = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* lpusername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mpr.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WNetAddConnection2W")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpnetresource, lppassword, lpusername, dwflags) : 0;
#else
    (void)lpnetresource;
    (void)lppassword;
    (void)lpusername;
    (void)dwflags;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_wnet_WNetAddConnection3A_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hwndowner = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpnetresource = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* lppassword = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* lpusername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mpr.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WNetAddConnection3A")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hwndowner, lpnetresource, lppassword, lpusername, dwflags) : 0;
#else
    (void)hwndowner;
    (void)lpnetresource;
    (void)lppassword;
    (void)lpusername;
    (void)dwflags;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_wnet_WNetAddConnection3W_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hwndowner = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpnetresource = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* lppassword = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* lpusername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mpr.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WNetAddConnection3W")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hwndowner, lpnetresource, lppassword, lpusername, dwflags) : 0;
#else
    (void)hwndowner;
    (void)lpnetresource;
    (void)lppassword;
    (void)lpusername;
    (void)dwflags;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_wnet_WNetAddConnection4A_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hwndowner = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpnetresource = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pauthbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t cbauthbuffer = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* lpuseoptions = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    uint32_t cbuseoptions = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mpr.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WNetAddConnection4A")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hwndowner, lpnetresource, pauthbuffer, cbauthbuffer, dwflags, lpuseoptions, cbuseoptions) : 0;
#else
    (void)hwndowner;
    (void)lpnetresource;
    (void)pauthbuffer;
    (void)cbauthbuffer;
    (void)dwflags;
    (void)lpuseoptions;
    (void)cbuseoptions;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_wnet_WNetAddConnection4W_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hwndowner = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpnetresource = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pauthbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t cbauthbuffer = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* lpuseoptions = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    uint32_t cbuseoptions = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mpr.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WNetAddConnection4W")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hwndowner, lpnetresource, pauthbuffer, cbauthbuffer, dwflags, lpuseoptions, cbuseoptions) : 0;
#else
    (void)hwndowner;
    (void)lpnetresource;
    (void)pauthbuffer;
    (void)cbauthbuffer;
    (void)dwflags;
    (void)lpuseoptions;
    (void)cbuseoptions;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_wnet_WNetAddConnectionA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpremotename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lppassword = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* lplocalname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mpr.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WNetAddConnectionA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpremotename, lppassword, lplocalname) : 0;
#else
    (void)lpremotename;
    (void)lppassword;
    (void)lplocalname;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_wnet_WNetAddConnectionW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpremotename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lppassword = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* lplocalname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mpr.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WNetAddConnectionW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpremotename, lppassword, lplocalname) : 0;
#else
    (void)lpremotename;
    (void)lppassword;
    (void)lplocalname;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_wnet_WNetCancelConnection2A_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t fforce = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mpr.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WNetCancelConnection2A")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpname, dwflags, fforce) : 0;
#else
    (void)lpname;
    (void)dwflags;
    (void)fforce;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_wnet_WNetCancelConnection2W_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t fforce = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mpr.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WNetCancelConnection2W")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpname, dwflags, fforce) : 0;
#else
    (void)lpname;
    (void)dwflags;
    (void)fforce;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_wnet_WNetCancelConnectionA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t fforce = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mpr.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WNetCancelConnectionA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpname, fforce) : 0;
#else
    (void)lpname;
    (void)fforce;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_wnet_WNetCancelConnectionW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t fforce = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mpr.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WNetCancelConnectionW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpname, fforce) : 0;
#else
    (void)lpname;
    (void)fforce;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_wnet_WNetCloseEnum_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* henum = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mpr.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WNetCloseEnum")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(henum) : 0;
#else
    (void)henum;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_wnet_WNetConnectionDialog_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hwnd = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwtype = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mpr.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WNetConnectionDialog")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hwnd, dwtype) : 0;
#else
    (void)hwnd;
    (void)dwtype;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_wnet_WNetConnectionDialog1A_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpconndlgstruct = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mpr.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WNetConnectionDialog1A")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpconndlgstruct) : 0;
#else
    (void)lpconndlgstruct;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_wnet_WNetConnectionDialog1W_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpconndlgstruct = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mpr.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WNetConnectionDialog1W")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpconndlgstruct) : 0;
#else
    (void)lpconndlgstruct;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_wnet_WNetDisconnectDialog_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hwnd = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwtype = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mpr.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WNetDisconnectDialog")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hwnd, dwtype) : 0;
#else
    (void)hwnd;
    (void)dwtype;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_wnet_WNetDisconnectDialog1A_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpconndlgstruct = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mpr.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WNetDisconnectDialog1A")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpconndlgstruct) : 0;
#else
    (void)lpconndlgstruct;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_wnet_WNetDisconnectDialog1W_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpconndlgstruct = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mpr.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WNetDisconnectDialog1W")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpconndlgstruct) : 0;
#else
    (void)lpconndlgstruct;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_wnet_WNetEnumResourceA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* henum = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpccount = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* lpbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* lpbuffersize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mpr.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WNetEnumResourceA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(henum, lpccount, lpbuffer, lpbuffersize) : 0;
#else
    (void)henum;
    (void)lpccount;
    (void)lpbuffer;
    (void)lpbuffersize;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_wnet_WNetEnumResourceW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* henum = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpccount = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* lpbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* lpbuffersize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mpr.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WNetEnumResourceW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(henum, lpccount, lpbuffer, lpbuffersize) : 0;
#else
    (void)henum;
    (void)lpccount;
    (void)lpbuffer;
    (void)lpbuffersize;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_wnet_WNetGetConnectionA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lplocalname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpremotename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* lpnlength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mpr.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WNetGetConnectionA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lplocalname, lpremotename, lpnlength) : 0;
#else
    (void)lplocalname;
    (void)lpremotename;
    (void)lpnlength;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_wnet_WNetGetConnectionW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lplocalname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpremotename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* lpnlength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mpr.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WNetGetConnectionW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lplocalname, lpremotename, lpnlength) : 0;
#else
    (void)lplocalname;
    (void)lpremotename;
    (void)lpnlength;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_wnet_WNetGetLastErrorA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lperror = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lperrorbuf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t nerrorbufsize = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* lpnamebuf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t nnamebufsize = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mpr.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WNetGetLastErrorA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lperror, lperrorbuf, nerrorbufsize, lpnamebuf, nnamebufsize) : 0;
#else
    (void)lperror;
    (void)lperrorbuf;
    (void)nerrorbufsize;
    (void)lpnamebuf;
    (void)nnamebufsize;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_wnet_WNetGetLastErrorW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lperror = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lperrorbuf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t nerrorbufsize = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* lpnamebuf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t nnamebufsize = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mpr.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WNetGetLastErrorW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lperror, lperrorbuf, nerrorbufsize, lpnamebuf, nnamebufsize) : 0;
#else
    (void)lperror;
    (void)lperrorbuf;
    (void)nerrorbufsize;
    (void)lpnamebuf;
    (void)nnamebufsize;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_wnet_WNetGetNetworkInformationA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpprovider = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpnetinfostruct = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mpr.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WNetGetNetworkInformationA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpprovider, lpnetinfostruct) : 0;
#else
    (void)lpprovider;
    (void)lpnetinfostruct;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_wnet_WNetGetNetworkInformationW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpprovider = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpnetinfostruct = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mpr.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WNetGetNetworkInformationW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpprovider, lpnetinfostruct) : 0;
#else
    (void)lpprovider;
    (void)lpnetinfostruct;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_wnet_WNetGetProviderNameA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwnettype = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* lpprovidername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* lpbuffersize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mpr.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WNetGetProviderNameA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwnettype, lpprovidername, lpbuffersize) : 0;
#else
    (void)dwnettype;
    (void)lpprovidername;
    (void)lpbuffersize;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_wnet_WNetGetProviderNameW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwnettype = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* lpprovidername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* lpbuffersize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mpr.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WNetGetProviderNameW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwnettype, lpprovidername, lpbuffersize) : 0;
#else
    (void)dwnettype;
    (void)lpprovidername;
    (void)lpbuffersize;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_wnet_WNetGetResourceInformationA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpnetresource = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* lpcbbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* lplpsystem = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mpr.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WNetGetResourceInformationA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpnetresource, lpbuffer, lpcbbuffer, lplpsystem) : 0;
#else
    (void)lpnetresource;
    (void)lpbuffer;
    (void)lpcbbuffer;
    (void)lplpsystem;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_wnet_WNetGetResourceInformationW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpnetresource = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* lpcbbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* lplpsystem = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mpr.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WNetGetResourceInformationW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpnetresource, lpbuffer, lpcbbuffer, lplpsystem) : 0;
#else
    (void)lpnetresource;
    (void)lpbuffer;
    (void)lpcbbuffer;
    (void)lplpsystem;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_wnet_WNetGetResourceParentA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpnetresource = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* lpcbbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mpr.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WNetGetResourceParentA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpnetresource, lpbuffer, lpcbbuffer) : 0;
#else
    (void)lpnetresource;
    (void)lpbuffer;
    (void)lpcbbuffer;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_wnet_WNetGetResourceParentW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpnetresource = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* lpcbbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mpr.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WNetGetResourceParentW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpnetresource, lpbuffer, lpcbbuffer) : 0;
#else
    (void)lpnetresource;
    (void)lpbuffer;
    (void)lpcbbuffer;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_wnet_WNetGetUniversalNameA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lplocalpath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwinfolevel = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* lpbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* lpbuffersize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mpr.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WNetGetUniversalNameA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lplocalpath, dwinfolevel, lpbuffer, lpbuffersize) : 0;
#else
    (void)lplocalpath;
    (void)dwinfolevel;
    (void)lpbuffer;
    (void)lpbuffersize;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_wnet_WNetGetUniversalNameW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lplocalpath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwinfolevel = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* lpbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* lpbuffersize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mpr.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WNetGetUniversalNameW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lplocalpath, dwinfolevel, lpbuffer, lpbuffersize) : 0;
#else
    (void)lplocalpath;
    (void)dwinfolevel;
    (void)lpbuffer;
    (void)lpbuffersize;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_wnet_WNetGetUserA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpusername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* lpnlength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mpr.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WNetGetUserA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpname, lpusername, lpnlength) : 0;
#else
    (void)lpname;
    (void)lpusername;
    (void)lpnlength;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_wnet_WNetGetUserW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpusername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* lpnlength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mpr.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WNetGetUserW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpname, lpusername, lpnlength) : 0;
#else
    (void)lpname;
    (void)lpusername;
    (void)lpnlength;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_wnet_WNetOpenEnumA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwscope = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t dwtype = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t dwusage = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* lpnetresource = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* lphenum = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mpr.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WNetOpenEnumA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwscope, dwtype, dwusage, lpnetresource, lphenum) : 0;
#else
    (void)dwscope;
    (void)dwtype;
    (void)dwusage;
    (void)lpnetresource;
    (void)lphenum;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_wnet_WNetOpenEnumW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwscope = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t dwtype = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t dwusage = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* lpnetresource = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* lphenum = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mpr.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WNetOpenEnumW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwscope, dwtype, dwusage, lpnetresource, lphenum) : 0;
#else
    (void)dwscope;
    (void)dwtype;
    (void)dwusage;
    (void)lpnetresource;
    (void)lphenum;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_wnet_WNetSetLastErrorA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t err = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* lperror = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* lpproviders = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mpr.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WNetSetLastErrorA")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(err, lperror, lpproviders);
#else
    (void)err;
    (void)lperror;
    (void)lpproviders;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_networkmanagement_wnet_WNetSetLastErrorW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t err = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* lperror = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* lpproviders = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mpr.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WNetSetLastErrorW")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(err, lperror, lpproviders);
#else
    (void)err;
    (void)lperror;
    (void)lpproviders;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_networkmanagement_wnet_WNetUseConnection4A_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hwndowner = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpnetresource = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pauthbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t cbauthbuffer = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* lpuseoptions = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    uint32_t cbuseoptions = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    void* lpaccessname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    void* lpbuffersize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
    void* lpresult = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 9 ? km_napi_arg_u64(km_info[9]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mpr.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WNetUseConnection4A")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hwndowner, lpnetresource, pauthbuffer, cbauthbuffer, dwflags, lpuseoptions, cbuseoptions, lpaccessname, lpbuffersize, lpresult) : 0;
#else
    (void)hwndowner;
    (void)lpnetresource;
    (void)pauthbuffer;
    (void)cbauthbuffer;
    (void)dwflags;
    (void)lpuseoptions;
    (void)cbuseoptions;
    (void)lpaccessname;
    (void)lpbuffersize;
    (void)lpresult;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_wnet_WNetUseConnection4W_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hwndowner = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpnetresource = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pauthbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t cbauthbuffer = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* lpuseoptions = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    uint32_t cbuseoptions = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    void* lpaccessname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    void* lpbuffersize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
    void* lpresult = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 9 ? km_napi_arg_u64(km_info[9]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mpr.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WNetUseConnection4W")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hwndowner, lpnetresource, pauthbuffer, cbauthbuffer, dwflags, lpuseoptions, cbuseoptions, lpaccessname, lpbuffersize, lpresult) : 0;
#else
    (void)hwndowner;
    (void)lpnetresource;
    (void)pauthbuffer;
    (void)cbauthbuffer;
    (void)dwflags;
    (void)lpuseoptions;
    (void)cbuseoptions;
    (void)lpaccessname;
    (void)lpbuffersize;
    (void)lpresult;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_wnet_WNetUseConnectionA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hwndowner = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpnetresource = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* lppassword = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* lpuserid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* lpaccessname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* lpbuffersize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* lpresult = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mpr.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WNetUseConnectionA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hwndowner, lpnetresource, lppassword, lpuserid, dwflags, lpaccessname, lpbuffersize, lpresult) : 0;
#else
    (void)hwndowner;
    (void)lpnetresource;
    (void)lppassword;
    (void)lpuserid;
    (void)dwflags;
    (void)lpaccessname;
    (void)lpbuffersize;
    (void)lpresult;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_wnet_WNetUseConnectionW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hwndowner = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpnetresource = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* lppassword = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* lpuserid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* lpaccessname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* lpbuffersize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* lpresult = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mpr.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WNetUseConnectionW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hwndowner, lpnetresource, lppassword, lpuserid, dwflags, lpaccessname, lpbuffersize, lpresult) : 0;
#else
    (void)hwndowner;
    (void)lpnetresource;
    (void)lppassword;
    (void)lpuserid;
    (void)dwflags;
    (void)lpaccessname;
    (void)lpbuffersize;
    (void)lpresult;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static void register_windows_win32_networkmanagement_wnet_napi(Napi::Env env, Napi::Object exports) {
    exports.Set("windowssys_windows_win32_networkmanagement_wnet_MultinetGetConnectionPerformanceA", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_wnet_MultinetGetConnectionPerformanceA_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_wnet_MultinetGetConnectionPerformanceW", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_wnet_MultinetGetConnectionPerformanceW_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_wnet_NPAddConnection", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_wnet_NPAddConnection_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_wnet_NPAddConnection3", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_wnet_NPAddConnection3_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_wnet_NPAddConnection4", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_wnet_NPAddConnection4_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_wnet_NPCancelConnection", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_wnet_NPCancelConnection_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_wnet_NPCancelConnection2", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_wnet_NPCancelConnection2_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_wnet_NPCloseEnum", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_wnet_NPCloseEnum_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_wnet_NPEnumResource", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_wnet_NPEnumResource_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_wnet_NPFormatNetworkName", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_wnet_NPFormatNetworkName_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_wnet_NPGetCaps", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_wnet_NPGetCaps_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_wnet_NPGetConnection", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_wnet_NPGetConnection_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_wnet_NPGetConnection3", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_wnet_NPGetConnection3_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_wnet_NPGetConnectionPerformance", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_wnet_NPGetConnectionPerformance_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_wnet_NPGetPersistentUseOptionsForConnection", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_wnet_NPGetPersistentUseOptionsForConnection_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_wnet_NPGetResourceInformation", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_wnet_NPGetResourceInformation_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_wnet_NPGetResourceParent", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_wnet_NPGetResourceParent_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_wnet_NPGetUniversalName", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_wnet_NPGetUniversalName_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_wnet_NPGetUser", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_wnet_NPGetUser_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_wnet_NPOpenEnum", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_wnet_NPOpenEnum_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_wnet_WNetAddConnection2A", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_wnet_WNetAddConnection2A_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_wnet_WNetAddConnection2W", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_wnet_WNetAddConnection2W_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_wnet_WNetAddConnection3A", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_wnet_WNetAddConnection3A_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_wnet_WNetAddConnection3W", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_wnet_WNetAddConnection3W_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_wnet_WNetAddConnection4A", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_wnet_WNetAddConnection4A_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_wnet_WNetAddConnection4W", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_wnet_WNetAddConnection4W_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_wnet_WNetAddConnectionA", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_wnet_WNetAddConnectionA_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_wnet_WNetAddConnectionW", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_wnet_WNetAddConnectionW_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_wnet_WNetCancelConnection2A", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_wnet_WNetCancelConnection2A_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_wnet_WNetCancelConnection2W", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_wnet_WNetCancelConnection2W_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_wnet_WNetCancelConnectionA", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_wnet_WNetCancelConnectionA_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_wnet_WNetCancelConnectionW", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_wnet_WNetCancelConnectionW_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_wnet_WNetCloseEnum", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_wnet_WNetCloseEnum_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_wnet_WNetConnectionDialog", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_wnet_WNetConnectionDialog_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_wnet_WNetConnectionDialog1A", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_wnet_WNetConnectionDialog1A_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_wnet_WNetConnectionDialog1W", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_wnet_WNetConnectionDialog1W_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_wnet_WNetDisconnectDialog", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_wnet_WNetDisconnectDialog_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_wnet_WNetDisconnectDialog1A", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_wnet_WNetDisconnectDialog1A_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_wnet_WNetDisconnectDialog1W", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_wnet_WNetDisconnectDialog1W_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_wnet_WNetEnumResourceA", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_wnet_WNetEnumResourceA_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_wnet_WNetEnumResourceW", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_wnet_WNetEnumResourceW_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_wnet_WNetGetConnectionA", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_wnet_WNetGetConnectionA_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_wnet_WNetGetConnectionW", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_wnet_WNetGetConnectionW_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_wnet_WNetGetLastErrorA", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_wnet_WNetGetLastErrorA_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_wnet_WNetGetLastErrorW", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_wnet_WNetGetLastErrorW_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_wnet_WNetGetNetworkInformationA", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_wnet_WNetGetNetworkInformationA_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_wnet_WNetGetNetworkInformationW", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_wnet_WNetGetNetworkInformationW_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_wnet_WNetGetProviderNameA", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_wnet_WNetGetProviderNameA_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_wnet_WNetGetProviderNameW", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_wnet_WNetGetProviderNameW_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_wnet_WNetGetResourceInformationA", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_wnet_WNetGetResourceInformationA_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_wnet_WNetGetResourceInformationW", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_wnet_WNetGetResourceInformationW_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_wnet_WNetGetResourceParentA", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_wnet_WNetGetResourceParentA_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_wnet_WNetGetResourceParentW", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_wnet_WNetGetResourceParentW_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_wnet_WNetGetUniversalNameA", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_wnet_WNetGetUniversalNameA_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_wnet_WNetGetUniversalNameW", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_wnet_WNetGetUniversalNameW_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_wnet_WNetGetUserA", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_wnet_WNetGetUserA_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_wnet_WNetGetUserW", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_wnet_WNetGetUserW_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_wnet_WNetOpenEnumA", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_wnet_WNetOpenEnumA_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_wnet_WNetOpenEnumW", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_wnet_WNetOpenEnumW_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_wnet_WNetSetLastErrorA", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_wnet_WNetSetLastErrorA_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_wnet_WNetSetLastErrorW", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_wnet_WNetSetLastErrorW_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_wnet_WNetUseConnection4A", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_wnet_WNetUseConnection4A_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_wnet_WNetUseConnection4W", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_wnet_WNetUseConnection4W_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_wnet_WNetUseConnectionA", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_wnet_WNetUseConnectionA_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_wnet_WNetUseConnectionW", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_wnet_WNetUseConnectionW_napi));
}

static KmNapiRegistrarNode registrar_node = { &register_windows_win32_networkmanagement_wnet_napi, nullptr };
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
