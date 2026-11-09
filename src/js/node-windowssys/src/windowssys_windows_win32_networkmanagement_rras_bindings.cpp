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

static Napi::Value windowssys_windows_win32_networkmanagement_rras_MgmAddGroupMembershipEntry_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprotocol = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwsourceaddr = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t dwsourcemask = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t dwgroupaddr = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t dwgroupmask = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    uint32_t dwifindex = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    uint32_t dwifnexthopipaddr = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 7 ? km_info[7].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, uint32_t, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MgmAddGroupMembershipEntry")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprotocol, dwsourceaddr, dwsourcemask, dwgroupaddr, dwgroupmask, dwifindex, dwifnexthopipaddr, dwflags) : 0;
#else
    (void)hprotocol;
    (void)dwsourceaddr;
    (void)dwsourcemask;
    (void)dwgroupaddr;
    (void)dwgroupmask;
    (void)dwifindex;
    (void)dwifnexthopipaddr;
    (void)dwflags;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_MgmDeRegisterMProtocol_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprotocol = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MgmDeRegisterMProtocol")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprotocol) : 0;
#else
    (void)hprotocol;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_MgmDeleteGroupMembershipEntry_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprotocol = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwsourceaddr = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t dwsourcemask = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t dwgroupaddr = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t dwgroupmask = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    uint32_t dwifindex = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    uint32_t dwifnexthopipaddr = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 7 ? km_info[7].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, uint32_t, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MgmDeleteGroupMembershipEntry")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprotocol, dwsourceaddr, dwsourcemask, dwgroupaddr, dwgroupmask, dwifindex, dwifnexthopipaddr, dwflags) : 0;
#else
    (void)hprotocol;
    (void)dwsourceaddr;
    (void)dwsourcemask;
    (void)dwgroupaddr;
    (void)dwgroupmask;
    (void)dwifindex;
    (void)dwifnexthopipaddr;
    (void)dwflags;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_MgmGetFirstMfe_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pdwbuffersize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pbbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pdwnumentries = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MgmGetFirstMfe")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pdwbuffersize, pbbuffer, pdwnumentries) : 0;
#else
    (void)pdwbuffersize;
    (void)pbbuffer;
    (void)pdwnumentries;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_MgmGetFirstMfeStats_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pdwbuffersize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pbbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pdwnumentries = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MgmGetFirstMfeStats")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pdwbuffersize, pbbuffer, pdwnumentries, dwflags) : 0;
#else
    (void)pdwbuffersize;
    (void)pbbuffer;
    (void)pdwnumentries;
    (void)dwflags;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_MgmGetMfe_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pimm = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pdwbuffersize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pbbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MgmGetMfe")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pimm, pdwbuffersize, pbbuffer) : 0;
#else
    (void)pimm;
    (void)pdwbuffersize;
    (void)pbbuffer;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_MgmGetMfeStats_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pimm = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pdwbuffersize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pbbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MgmGetMfeStats")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pimm, pdwbuffersize, pbbuffer, dwflags) : 0;
#else
    (void)pimm;
    (void)pdwbuffersize;
    (void)pbbuffer;
    (void)dwflags;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_MgmGetNextMfe_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pimmstart = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pdwbuffersize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pbbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pdwnumentries = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MgmGetNextMfe")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pimmstart, pdwbuffersize, pbbuffer, pdwnumentries) : 0;
#else
    (void)pimmstart;
    (void)pdwbuffersize;
    (void)pbbuffer;
    (void)pdwnumentries;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_MgmGetNextMfeStats_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pimmstart = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pdwbuffersize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pbbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pdwnumentries = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MgmGetNextMfeStats")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pimmstart, pdwbuffersize, pbbuffer, pdwnumentries, dwflags) : 0;
#else
    (void)pimmstart;
    (void)pdwbuffersize;
    (void)pbbuffer;
    (void)pdwnumentries;
    (void)dwflags;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_MgmGetProtocolOnInterface_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwifindex = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t dwifnexthopaddr = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pdwifprotocolid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pdwifcomponentid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MgmGetProtocolOnInterface")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwifindex, dwifnexthopaddr, pdwifprotocolid, pdwifcomponentid) : 0;
#else
    (void)dwifindex;
    (void)dwifnexthopaddr;
    (void)pdwifprotocolid;
    (void)pdwifcomponentid;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_MgmGroupEnumerationEnd_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* henum = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MgmGroupEnumerationEnd")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(henum) : 0;
#else
    (void)henum;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_MgmGroupEnumerationGetNext_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* henum = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pdwbuffersize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pbbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pdwnumentries = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MgmGroupEnumerationGetNext")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(henum, pdwbuffersize, pbbuffer, pdwnumentries) : 0;
#else
    (void)henum;
    (void)pdwbuffersize;
    (void)pbbuffer;
    (void)pdwnumentries;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_MgmGroupEnumerationStart_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprotocol = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t metenumtype = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* phenumhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MgmGroupEnumerationStart")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprotocol, metenumtype, phenumhandle) : 0;
#else
    (void)hprotocol;
    (void)metenumtype;
    (void)phenumhandle;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_MgmRegisterMProtocol_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* prpiinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwprotocolid = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t dwcomponentid = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* phprotocol = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MgmRegisterMProtocol")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(prpiinfo, dwprotocolid, dwcomponentid, phprotocol) : 0;
#else
    (void)prpiinfo;
    (void)dwprotocolid;
    (void)dwcomponentid;
    (void)phprotocol;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_MgmReleaseInterfaceOwnership_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprotocol = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwifindex = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t dwifnexthopaddr = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MgmReleaseInterfaceOwnership")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprotocol, dwifindex, dwifnexthopaddr) : 0;
#else
    (void)hprotocol;
    (void)dwifindex;
    (void)dwifnexthopaddr;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_MgmTakeInterfaceOwnership_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprotocol = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwifindex = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t dwifnexthopaddr = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MgmTakeInterfaceOwnership")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprotocol, dwifindex, dwifnexthopaddr) : 0;
#else
    (void)hprotocol;
    (void)dwifindex;
    (void)dwifnexthopaddr;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_MprAdminBufferFree_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MprAdminBufferFree")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pbuffer) : 0;
#else
    (void)pbuffer;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_MprAdminConnectionClearStats_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hrasserver = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* hrasconnection = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MprAdminConnectionClearStats")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hrasserver, hrasconnection) : 0;
#else
    (void)hrasserver;
    (void)hrasconnection;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_MprAdminConnectionEnum_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hrasserver = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint32_t dwlevel = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* lplpbbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t dwprefmaxlen = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* lpdwentriesread = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* lpdwtotalentries = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* lpdwresumehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MprAdminConnectionEnum")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hrasserver, dwlevel, lplpbbuffer, dwprefmaxlen, lpdwentriesread, lpdwtotalentries, lpdwresumehandle) : 0;
#else
    (void)hrasserver;
    (void)dwlevel;
    (void)lplpbbuffer;
    (void)dwprefmaxlen;
    (void)lpdwentriesread;
    (void)lpdwtotalentries;
    (void)lpdwresumehandle;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_MprAdminConnectionEnumEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hrasserver = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* pobjectheader = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwpreferedmaxlen = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* lpdwentriesread = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* lpdwtotalentries = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* pprasconn = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* lpdwresumehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MprAdminConnectionEnumEx")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hrasserver, pobjectheader, dwpreferedmaxlen, lpdwentriesread, lpdwtotalentries, pprasconn, lpdwresumehandle) : 0;
#else
    (void)hrasserver;
    (void)pobjectheader;
    (void)dwpreferedmaxlen;
    (void)lpdwentriesread;
    (void)lpdwtotalentries;
    (void)pprasconn;
    (void)lpdwresumehandle;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_MprAdminConnectionGetInfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hrasserver = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint32_t dwlevel = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* hrasconnection = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* lplpbbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MprAdminConnectionGetInfo")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hrasserver, dwlevel, hrasconnection, lplpbbuffer) : 0;
#else
    (void)hrasserver;
    (void)dwlevel;
    (void)hrasconnection;
    (void)lplpbbuffer;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_MprAdminConnectionGetInfoEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hrasserver = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* hrasconnection = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* prasconnection = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MprAdminConnectionGetInfoEx")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hrasserver, hrasconnection, prasconnection) : 0;
#else
    (void)hrasserver;
    (void)hrasconnection;
    (void)prasconnection;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_MprAdminConnectionRemoveQuarantine_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hrasserver = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* hrasconnection = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t fisipaddress = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MprAdminConnectionRemoveQuarantine")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hrasserver, hrasconnection, fisipaddress) : 0;
#else
    (void)hrasserver;
    (void)hrasconnection;
    (void)fisipaddress;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_MprAdminDeregisterConnectionNotification_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hmprserver = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* heventnotification = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MprAdminDeregisterConnectionNotification")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hmprserver, heventnotification) : 0;
#else
    (void)hmprserver;
    (void)heventnotification;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_MprAdminDeviceEnum_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hmprserver = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint32_t dwlevel = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* lplpbbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* lpdwtotalentries = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MprAdminDeviceEnum")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hmprserver, dwlevel, lplpbbuffer, lpdwtotalentries) : 0;
#else
    (void)hmprserver;
    (void)dwlevel;
    (void)lplpbbuffer;
    (void)lpdwtotalentries;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_MprAdminEstablishDomainRasServer_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pszdomain = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pszmachine = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t benable = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MprAdminEstablishDomainRasServer")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pszdomain, pszmachine, benable) : 0;
#else
    (void)pszdomain;
    (void)pszmachine;
    (void)benable;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_MprAdminGetErrorString_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwerror = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* lplpwserrorstring = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MprAdminGetErrorString")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwerror, lplpwserrorstring) : 0;
#else
    (void)dwerror;
    (void)lplpwserrorstring;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_MprAdminGetPDCServer_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpszdomain = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpszserver = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* lpszpdcserver = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MprAdminGetPDCServer")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpszdomain, lpszserver, lpszpdcserver) : 0;
#else
    (void)lpszdomain;
    (void)lpszserver;
    (void)lpszpdcserver;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_MprAdminInterfaceConnect_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hmprserver = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* hinterface = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* hevent = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int32_t fsynchronous = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MprAdminInterfaceConnect")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hmprserver, hinterface, hevent, fsynchronous) : 0;
#else
    (void)hmprserver;
    (void)hinterface;
    (void)hevent;
    (void)fsynchronous;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_MprAdminInterfaceCreate_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hmprserver = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint32_t dwlevel = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* lpbbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* phinterface = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MprAdminInterfaceCreate")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hmprserver, dwlevel, lpbbuffer, phinterface) : 0;
#else
    (void)hmprserver;
    (void)dwlevel;
    (void)lpbbuffer;
    (void)phinterface;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_MprAdminInterfaceDelete_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hmprserver = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* hinterface = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MprAdminInterfaceDelete")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hmprserver, hinterface) : 0;
#else
    (void)hmprserver;
    (void)hinterface;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_MprAdminInterfaceDeviceGetInfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hmprserver = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* hinterface = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwindex = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t dwlevel = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* lplpbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MprAdminInterfaceDeviceGetInfo")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hmprserver, hinterface, dwindex, dwlevel, lplpbuffer) : 0;
#else
    (void)hmprserver;
    (void)hinterface;
    (void)dwindex;
    (void)dwlevel;
    (void)lplpbuffer;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_MprAdminInterfaceDeviceSetInfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hmprserver = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* hinterface = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwindex = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t dwlevel = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* lpbbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MprAdminInterfaceDeviceSetInfo")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hmprserver, hinterface, dwindex, dwlevel, lpbbuffer) : 0;
#else
    (void)hmprserver;
    (void)hinterface;
    (void)dwindex;
    (void)dwlevel;
    (void)lpbbuffer;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_MprAdminInterfaceDisconnect_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hmprserver = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* hinterface = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MprAdminInterfaceDisconnect")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hmprserver, hinterface) : 0;
#else
    (void)hmprserver;
    (void)hinterface;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_MprAdminInterfaceEnum_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hmprserver = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint32_t dwlevel = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* lplpbbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t dwprefmaxlen = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* lpdwentriesread = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* lpdwtotalentries = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* lpdwresumehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MprAdminInterfaceEnum")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hmprserver, dwlevel, lplpbbuffer, dwprefmaxlen, lpdwentriesread, lpdwtotalentries, lpdwresumehandle) : 0;
#else
    (void)hmprserver;
    (void)dwlevel;
    (void)lplpbbuffer;
    (void)dwprefmaxlen;
    (void)lpdwentriesread;
    (void)lpdwtotalentries;
    (void)lpdwresumehandle;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_MprAdminInterfaceGetCredentials_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpwsserver = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpwsinterfacename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* lpwsusername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* lpwspassword = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* lpwsdomainname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MprAdminInterfaceGetCredentials")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpwsserver, lpwsinterfacename, lpwsusername, lpwspassword, lpwsdomainname) : 0;
#else
    (void)lpwsserver;
    (void)lpwsinterfacename;
    (void)lpwsusername;
    (void)lpwspassword;
    (void)lpwsdomainname;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_MprAdminInterfaceGetCredentialsEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hmprserver = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* hinterface = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwlevel = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* lplpbbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MprAdminInterfaceGetCredentialsEx")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hmprserver, hinterface, dwlevel, lplpbbuffer) : 0;
#else
    (void)hmprserver;
    (void)hinterface;
    (void)dwlevel;
    (void)lplpbbuffer;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_MprAdminInterfaceGetCustomInfoEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hmprserver = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* hinterface = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pcustominfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MprAdminInterfaceGetCustomInfoEx")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hmprserver, hinterface, pcustominfo) : 0;
#else
    (void)hmprserver;
    (void)hinterface;
    (void)pcustominfo;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_MprAdminInterfaceGetHandle_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hmprserver = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* lpwsinterfacename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* phinterface = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int32_t fincludeclientinterfaces = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MprAdminInterfaceGetHandle")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hmprserver, lpwsinterfacename, phinterface, fincludeclientinterfaces) : 0;
#else
    (void)hmprserver;
    (void)lpwsinterfacename;
    (void)phinterface;
    (void)fincludeclientinterfaces;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_MprAdminInterfaceGetInfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hmprserver = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* hinterface = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwlevel = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* lplpbbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MprAdminInterfaceGetInfo")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hmprserver, hinterface, dwlevel, lplpbbuffer) : 0;
#else
    (void)hmprserver;
    (void)hinterface;
    (void)dwlevel;
    (void)lplpbbuffer;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_MprAdminInterfaceQueryUpdateResult_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hmprserver = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* hinterface = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwprotocolid = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* lpdwupdateresult = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MprAdminInterfaceQueryUpdateResult")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hmprserver, hinterface, dwprotocolid, lpdwupdateresult) : 0;
#else
    (void)hmprserver;
    (void)hinterface;
    (void)dwprotocolid;
    (void)lpdwupdateresult;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_MprAdminInterfaceSetCredentials_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpwsserver = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpwsinterfacename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* lpwsusername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* lpwsdomainname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* lpwspassword = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MprAdminInterfaceSetCredentials")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpwsserver, lpwsinterfacename, lpwsusername, lpwsdomainname, lpwspassword) : 0;
#else
    (void)lpwsserver;
    (void)lpwsinterfacename;
    (void)lpwsusername;
    (void)lpwsdomainname;
    (void)lpwspassword;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_MprAdminInterfaceSetCredentialsEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hmprserver = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* hinterface = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwlevel = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* lpbbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MprAdminInterfaceSetCredentialsEx")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hmprserver, hinterface, dwlevel, lpbbuffer) : 0;
#else
    (void)hmprserver;
    (void)hinterface;
    (void)dwlevel;
    (void)lpbbuffer;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_MprAdminInterfaceSetCustomInfoEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hmprserver = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* hinterface = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pcustominfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MprAdminInterfaceSetCustomInfoEx")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hmprserver, hinterface, pcustominfo) : 0;
#else
    (void)hmprserver;
    (void)hinterface;
    (void)pcustominfo;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_MprAdminInterfaceSetInfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hmprserver = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* hinterface = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwlevel = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* lpbbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MprAdminInterfaceSetInfo")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hmprserver, hinterface, dwlevel, lpbbuffer) : 0;
#else
    (void)hmprserver;
    (void)hinterface;
    (void)dwlevel;
    (void)lpbbuffer;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_MprAdminInterfaceTransportAdd_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hmprserver = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* hinterface = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwtransportid = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pinterfaceinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t dwinterfaceinfosize = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MprAdminInterfaceTransportAdd")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hmprserver, hinterface, dwtransportid, pinterfaceinfo, dwinterfaceinfosize) : 0;
#else
    (void)hmprserver;
    (void)hinterface;
    (void)dwtransportid;
    (void)pinterfaceinfo;
    (void)dwinterfaceinfosize;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_MprAdminInterfaceTransportGetInfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hmprserver = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* hinterface = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwtransportid = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* ppinterfaceinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* lpdwinterfaceinfosize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MprAdminInterfaceTransportGetInfo")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hmprserver, hinterface, dwtransportid, ppinterfaceinfo, lpdwinterfaceinfosize) : 0;
#else
    (void)hmprserver;
    (void)hinterface;
    (void)dwtransportid;
    (void)ppinterfaceinfo;
    (void)lpdwinterfaceinfosize;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_MprAdminInterfaceTransportRemove_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hmprserver = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* hinterface = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwtransportid = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MprAdminInterfaceTransportRemove")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hmprserver, hinterface, dwtransportid) : 0;
#else
    (void)hmprserver;
    (void)hinterface;
    (void)dwtransportid;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_MprAdminInterfaceTransportSetInfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hmprserver = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* hinterface = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwtransportid = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pinterfaceinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t dwinterfaceinfosize = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MprAdminInterfaceTransportSetInfo")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hmprserver, hinterface, dwtransportid, pinterfaceinfo, dwinterfaceinfosize) : 0;
#else
    (void)hmprserver;
    (void)hinterface;
    (void)dwtransportid;
    (void)pinterfaceinfo;
    (void)dwinterfaceinfosize;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_MprAdminInterfaceUpdatePhonebookInfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hmprserver = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* hinterface = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MprAdminInterfaceUpdatePhonebookInfo")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hmprserver, hinterface) : 0;
#else
    (void)hmprserver;
    (void)hinterface;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_MprAdminInterfaceUpdateRoutes_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hmprserver = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* hinterface = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwprotocolid = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* hevent = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MprAdminInterfaceUpdateRoutes")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hmprserver, hinterface, dwprotocolid, hevent) : 0;
#else
    (void)hmprserver;
    (void)hinterface;
    (void)dwprotocolid;
    (void)hevent;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_MprAdminIsDomainRasServer_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pszdomain = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pszmachine = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pbisrasserver = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MprAdminIsDomainRasServer")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pszdomain, pszmachine, pbisrasserver) : 0;
#else
    (void)pszdomain;
    (void)pszmachine;
    (void)pbisrasserver;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_MprAdminIsServiceInitialized_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpwsservername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* fisserviceinitialized = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MprAdminIsServiceInitialized")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpwsservername, fisserviceinitialized) : 0;
#else
    (void)lpwsservername;
    (void)fisserviceinitialized;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_MprAdminIsServiceRunning_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpwsservername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MprAdminIsServiceRunning")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpwsservername) : -1;
#else
    (void)lpwsservername;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_MprAdminMIBBufferFree_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MprAdminMIBBufferFree")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pbuffer) : 0;
#else
    (void)pbuffer;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_MprAdminMIBEntryCreate_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hmibserver = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint32_t dwpid = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t dwroutingpid = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* lpentry = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t dwentrysize = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MprAdminMIBEntryCreate")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hmibserver, dwpid, dwroutingpid, lpentry, dwentrysize) : 0;
#else
    (void)hmibserver;
    (void)dwpid;
    (void)dwroutingpid;
    (void)lpentry;
    (void)dwentrysize;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_MprAdminMIBEntryDelete_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hmibserver = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint32_t dwprotocolid = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t dwroutingpid = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* lpentry = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t dwentrysize = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MprAdminMIBEntryDelete")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hmibserver, dwprotocolid, dwroutingpid, lpentry, dwentrysize) : 0;
#else
    (void)hmibserver;
    (void)dwprotocolid;
    (void)dwroutingpid;
    (void)lpentry;
    (void)dwentrysize;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_MprAdminMIBEntryGet_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hmibserver = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint32_t dwprotocolid = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t dwroutingpid = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* lpinentry = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t dwinentrysize = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* lplpoutentry = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* lpoutentrysize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MprAdminMIBEntryGet")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hmibserver, dwprotocolid, dwroutingpid, lpinentry, dwinentrysize, lplpoutentry, lpoutentrysize) : 0;
#else
    (void)hmibserver;
    (void)dwprotocolid;
    (void)dwroutingpid;
    (void)lpinentry;
    (void)dwinentrysize;
    (void)lplpoutentry;
    (void)lpoutentrysize;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_MprAdminMIBEntryGetFirst_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hmibserver = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint32_t dwprotocolid = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t dwroutingpid = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* lpinentry = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t dwinentrysize = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* lplpoutentry = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* lpoutentrysize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MprAdminMIBEntryGetFirst")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hmibserver, dwprotocolid, dwroutingpid, lpinentry, dwinentrysize, lplpoutentry, lpoutentrysize) : 0;
#else
    (void)hmibserver;
    (void)dwprotocolid;
    (void)dwroutingpid;
    (void)lpinentry;
    (void)dwinentrysize;
    (void)lplpoutentry;
    (void)lpoutentrysize;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_MprAdminMIBEntryGetNext_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hmibserver = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint32_t dwprotocolid = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t dwroutingpid = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* lpinentry = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t dwinentrysize = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* lplpoutentry = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* lpoutentrysize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MprAdminMIBEntryGetNext")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hmibserver, dwprotocolid, dwroutingpid, lpinentry, dwinentrysize, lplpoutentry, lpoutentrysize) : 0;
#else
    (void)hmibserver;
    (void)dwprotocolid;
    (void)dwroutingpid;
    (void)lpinentry;
    (void)dwinentrysize;
    (void)lplpoutentry;
    (void)lpoutentrysize;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_MprAdminMIBEntrySet_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hmibserver = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint32_t dwprotocolid = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t dwroutingpid = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* lpentry = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t dwentrysize = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MprAdminMIBEntrySet")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hmibserver, dwprotocolid, dwroutingpid, lpentry, dwentrysize) : 0;
#else
    (void)hmibserver;
    (void)dwprotocolid;
    (void)dwroutingpid;
    (void)lpentry;
    (void)dwentrysize;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_MprAdminMIBServerConnect_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpwsservername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* phmibserver = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MprAdminMIBServerConnect")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpwsservername, phmibserver) : 0;
#else
    (void)lpwsservername;
    (void)phmibserver;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_MprAdminMIBServerDisconnect_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hmibserver = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MprAdminMIBServerDisconnect")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(hmibserver);
#else
    (void)hmibserver;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_MprAdminPortClearStats_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hrasserver = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* hport = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MprAdminPortClearStats")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hrasserver, hport) : 0;
#else
    (void)hrasserver;
    (void)hport;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_MprAdminPortDisconnect_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hrasserver = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* hport = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MprAdminPortDisconnect")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hrasserver, hport) : 0;
#else
    (void)hrasserver;
    (void)hport;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_MprAdminPortEnum_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hrasserver = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint32_t dwlevel = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* hrasconnection = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* lplpbbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t dwprefmaxlen = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* lpdwentriesread = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* lpdwtotalentries = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* lpdwresumehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MprAdminPortEnum")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hrasserver, dwlevel, hrasconnection, lplpbbuffer, dwprefmaxlen, lpdwentriesread, lpdwtotalentries, lpdwresumehandle) : 0;
#else
    (void)hrasserver;
    (void)dwlevel;
    (void)hrasconnection;
    (void)lplpbbuffer;
    (void)dwprefmaxlen;
    (void)lpdwentriesread;
    (void)lpdwtotalentries;
    (void)lpdwresumehandle;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_MprAdminPortGetInfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hrasserver = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint32_t dwlevel = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* hport = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* lplpbbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MprAdminPortGetInfo")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hrasserver, dwlevel, hport, lplpbbuffer) : 0;
#else
    (void)hrasserver;
    (void)dwlevel;
    (void)hport;
    (void)lplpbbuffer;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_MprAdminPortReset_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hrasserver = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* hport = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MprAdminPortReset")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hrasserver, hport) : 0;
#else
    (void)hrasserver;
    (void)hport;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_MprAdminRegisterConnectionNotification_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hmprserver = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* heventnotification = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MprAdminRegisterConnectionNotification")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hmprserver, heventnotification) : 0;
#else
    (void)hmprserver;
    (void)heventnotification;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_MprAdminSendUserMessage_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hmprserver = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* hconnection = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* lpwszmessage = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MprAdminSendUserMessage")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hmprserver, hconnection, lpwszmessage) : 0;
#else
    (void)hmprserver;
    (void)hconnection;
    (void)lpwszmessage;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_MprAdminServerConnect_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpwsservername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* phmprserver = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MprAdminServerConnect")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpwsservername, phmprserver) : 0;
#else
    (void)lpwsservername;
    (void)phmprserver;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_MprAdminServerDisconnect_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hmprserver = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MprAdminServerDisconnect")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(hmprserver);
#else
    (void)hmprserver;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_MprAdminServerGetCredentials_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hmprserver = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint32_t dwlevel = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* lplpbbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MprAdminServerGetCredentials")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hmprserver, dwlevel, lplpbbuffer) : 0;
#else
    (void)hmprserver;
    (void)dwlevel;
    (void)lplpbbuffer;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_MprAdminServerGetInfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hmprserver = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint32_t dwlevel = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* lplpbbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MprAdminServerGetInfo")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hmprserver, dwlevel, lplpbbuffer) : 0;
#else
    (void)hmprserver;
    (void)dwlevel;
    (void)lplpbbuffer;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_MprAdminServerGetInfoEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hmprserver = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* pserverinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MprAdminServerGetInfoEx")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hmprserver, pserverinfo) : 0;
#else
    (void)hmprserver;
    (void)pserverinfo;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_MprAdminServerSetCredentials_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hmprserver = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint32_t dwlevel = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* lpbbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MprAdminServerSetCredentials")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hmprserver, dwlevel, lpbbuffer) : 0;
#else
    (void)hmprserver;
    (void)dwlevel;
    (void)lpbbuffer;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_MprAdminServerSetInfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hmprserver = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint32_t dwlevel = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* lpbbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MprAdminServerSetInfo")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hmprserver, dwlevel, lpbbuffer) : 0;
#else
    (void)hmprserver;
    (void)dwlevel;
    (void)lpbbuffer;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_MprAdminServerSetInfoEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hmprserver = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* pserverinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MprAdminServerSetInfoEx")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hmprserver, pserverinfo) : 0;
#else
    (void)hmprserver;
    (void)pserverinfo;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_MprAdminTransportCreate_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hmprserver = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint32_t dwtransportid = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* lpwstransportname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pglobalinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t dwglobalinfosize = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* pclientinterfaceinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    uint32_t dwclientinterfaceinfosize = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    void* lpwsdllpath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MprAdminTransportCreate")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hmprserver, dwtransportid, lpwstransportname, pglobalinfo, dwglobalinfosize, pclientinterfaceinfo, dwclientinterfaceinfosize, lpwsdllpath) : 0;
#else
    (void)hmprserver;
    (void)dwtransportid;
    (void)lpwstransportname;
    (void)pglobalinfo;
    (void)dwglobalinfosize;
    (void)pclientinterfaceinfo;
    (void)dwclientinterfaceinfosize;
    (void)lpwsdllpath;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_MprAdminTransportGetInfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hmprserver = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint32_t dwtransportid = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* ppglobalinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* lpdwglobalinfosize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* ppclientinterfaceinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* lpdwclientinterfaceinfosize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MprAdminTransportGetInfo")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hmprserver, dwtransportid, ppglobalinfo, lpdwglobalinfosize, ppclientinterfaceinfo, lpdwclientinterfaceinfosize) : 0;
#else
    (void)hmprserver;
    (void)dwtransportid;
    (void)ppglobalinfo;
    (void)lpdwglobalinfosize;
    (void)ppclientinterfaceinfo;
    (void)lpdwclientinterfaceinfosize;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_MprAdminTransportSetInfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hmprserver = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint32_t dwtransportid = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pglobalinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t dwglobalinfosize = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* pclientinterfaceinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t dwclientinterfaceinfosize = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MprAdminTransportSetInfo")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hmprserver, dwtransportid, pglobalinfo, dwglobalinfosize, pclientinterfaceinfo, dwclientinterfaceinfosize) : 0;
#else
    (void)hmprserver;
    (void)dwtransportid;
    (void)pglobalinfo;
    (void)dwglobalinfosize;
    (void)pclientinterfaceinfo;
    (void)dwclientinterfaceinfosize;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_MprAdminUpdateConnection_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hrasserver = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* hrasconnection = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* prasupdateconnection = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MprAdminUpdateConnection")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hrasserver, hrasconnection, prasupdateconnection) : 0;
#else
    (void)hrasserver;
    (void)hrasconnection;
    (void)prasupdateconnection;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_MprAdminUserGetInfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpszserver = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpszuser = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwlevel = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* lpbbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MprAdminUserGetInfo")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpszserver, lpszuser, dwlevel, lpbbuffer) : 0;
#else
    (void)lpszserver;
    (void)lpszuser;
    (void)dwlevel;
    (void)lpbbuffer;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_MprAdminUserSetInfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpszserver = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpszuser = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwlevel = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* lpbbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MprAdminUserSetInfo")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpszserver, lpszuser, dwlevel, lpbbuffer) : 0;
#else
    (void)lpszserver;
    (void)lpszuser;
    (void)dwlevel;
    (void)lpbbuffer;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_MprConfigBufferFree_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MprConfigBufferFree")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pbuffer) : 0;
#else
    (void)pbuffer;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_MprConfigFilterGetInfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hmprconfig = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwlevel = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t dwtransportid = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* lpbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MprConfigFilterGetInfo")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hmprconfig, dwlevel, dwtransportid, lpbuffer) : 0;
#else
    (void)hmprconfig;
    (void)dwlevel;
    (void)dwtransportid;
    (void)lpbuffer;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_MprConfigFilterSetInfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hmprconfig = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwlevel = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t dwtransportid = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* lpbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MprConfigFilterSetInfo")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hmprconfig, dwlevel, dwtransportid, lpbuffer) : 0;
#else
    (void)hmprconfig;
    (void)dwlevel;
    (void)dwtransportid;
    (void)lpbuffer;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_MprConfigGetFriendlyName_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hmprconfig = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pszguidname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pszbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t dwbuffersize = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MprConfigGetFriendlyName")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hmprconfig, pszguidname, pszbuffer, dwbuffersize) : 0;
#else
    (void)hmprconfig;
    (void)pszguidname;
    (void)pszbuffer;
    (void)dwbuffersize;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_MprConfigGetGuidName_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hmprconfig = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pszfriendlyname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pszbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t dwbuffersize = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MprConfigGetGuidName")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hmprconfig, pszfriendlyname, pszbuffer, dwbuffersize) : 0;
#else
    (void)hmprconfig;
    (void)pszfriendlyname;
    (void)pszbuffer;
    (void)dwbuffersize;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_MprConfigInterfaceCreate_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hmprconfig = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwlevel = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* lpbbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* phrouterinterface = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MprConfigInterfaceCreate")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hmprconfig, dwlevel, lpbbuffer, phrouterinterface) : 0;
#else
    (void)hmprconfig;
    (void)dwlevel;
    (void)lpbbuffer;
    (void)phrouterinterface;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_MprConfigInterfaceDelete_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hmprconfig = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* hrouterinterface = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MprConfigInterfaceDelete")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hmprconfig, hrouterinterface) : 0;
#else
    (void)hmprconfig;
    (void)hrouterinterface;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_MprConfigInterfaceEnum_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hmprconfig = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwlevel = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* lplpbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t dwprefmaxlen = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* lpdwentriesread = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* lpdwtotalentries = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* lpdwresumehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MprConfigInterfaceEnum")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hmprconfig, dwlevel, lplpbuffer, dwprefmaxlen, lpdwentriesread, lpdwtotalentries, lpdwresumehandle) : 0;
#else
    (void)hmprconfig;
    (void)dwlevel;
    (void)lplpbuffer;
    (void)dwprefmaxlen;
    (void)lpdwentriesread;
    (void)lpdwtotalentries;
    (void)lpdwresumehandle;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_MprConfigInterfaceGetCustomInfoEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hmprconfig = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* hrouterinterface = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pcustominfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MprConfigInterfaceGetCustomInfoEx")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hmprconfig, hrouterinterface, pcustominfo) : 0;
#else
    (void)hmprconfig;
    (void)hrouterinterface;
    (void)pcustominfo;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_MprConfigInterfaceGetHandle_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hmprconfig = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpwsinterfacename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* phrouterinterface = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MprConfigInterfaceGetHandle")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hmprconfig, lpwsinterfacename, phrouterinterface) : 0;
#else
    (void)hmprconfig;
    (void)lpwsinterfacename;
    (void)phrouterinterface;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_MprConfigInterfaceGetInfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hmprconfig = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* hrouterinterface = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwlevel = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* lplpbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* lpdwbuffersize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MprConfigInterfaceGetInfo")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hmprconfig, hrouterinterface, dwlevel, lplpbuffer, lpdwbuffersize) : 0;
#else
    (void)hmprconfig;
    (void)hrouterinterface;
    (void)dwlevel;
    (void)lplpbuffer;
    (void)lpdwbuffersize;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_MprConfigInterfaceSetCustomInfoEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hmprconfig = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* hrouterinterface = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pcustominfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MprConfigInterfaceSetCustomInfoEx")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hmprconfig, hrouterinterface, pcustominfo) : 0;
#else
    (void)hmprconfig;
    (void)hrouterinterface;
    (void)pcustominfo;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_MprConfigInterfaceSetInfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hmprconfig = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* hrouterinterface = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwlevel = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* lpbbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MprConfigInterfaceSetInfo")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hmprconfig, hrouterinterface, dwlevel, lpbbuffer) : 0;
#else
    (void)hmprconfig;
    (void)hrouterinterface;
    (void)dwlevel;
    (void)lpbbuffer;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_MprConfigInterfaceTransportAdd_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hmprconfig = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* hrouterinterface = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwtransportid = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* lpwstransportname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pinterfaceinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t dwinterfaceinfosize = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* phrouteriftransport = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MprConfigInterfaceTransportAdd")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hmprconfig, hrouterinterface, dwtransportid, lpwstransportname, pinterfaceinfo, dwinterfaceinfosize, phrouteriftransport) : 0;
#else
    (void)hmprconfig;
    (void)hrouterinterface;
    (void)dwtransportid;
    (void)lpwstransportname;
    (void)pinterfaceinfo;
    (void)dwinterfaceinfosize;
    (void)phrouteriftransport;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_MprConfigInterfaceTransportEnum_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hmprconfig = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* hrouterinterface = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwlevel = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* lplpbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t dwprefmaxlen = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* lpdwentriesread = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* lpdwtotalentries = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* lpdwresumehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MprConfigInterfaceTransportEnum")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hmprconfig, hrouterinterface, dwlevel, lplpbuffer, dwprefmaxlen, lpdwentriesread, lpdwtotalentries, lpdwresumehandle) : 0;
#else
    (void)hmprconfig;
    (void)hrouterinterface;
    (void)dwlevel;
    (void)lplpbuffer;
    (void)dwprefmaxlen;
    (void)lpdwentriesread;
    (void)lpdwtotalentries;
    (void)lpdwresumehandle;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_MprConfigInterfaceTransportGetHandle_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hmprconfig = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* hrouterinterface = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwtransportid = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* phrouteriftransport = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MprConfigInterfaceTransportGetHandle")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hmprconfig, hrouterinterface, dwtransportid, phrouteriftransport) : 0;
#else
    (void)hmprconfig;
    (void)hrouterinterface;
    (void)dwtransportid;
    (void)phrouteriftransport;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_MprConfigInterfaceTransportGetInfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hmprconfig = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* hrouterinterface = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* hrouteriftransport = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* ppinterfaceinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* lpdwinterfaceinfosize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MprConfigInterfaceTransportGetInfo")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hmprconfig, hrouterinterface, hrouteriftransport, ppinterfaceinfo, lpdwinterfaceinfosize) : 0;
#else
    (void)hmprconfig;
    (void)hrouterinterface;
    (void)hrouteriftransport;
    (void)ppinterfaceinfo;
    (void)lpdwinterfaceinfosize;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_MprConfigInterfaceTransportRemove_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hmprconfig = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* hrouterinterface = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* hrouteriftransport = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MprConfigInterfaceTransportRemove")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hmprconfig, hrouterinterface, hrouteriftransport) : 0;
#else
    (void)hmprconfig;
    (void)hrouterinterface;
    (void)hrouteriftransport;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_MprConfigInterfaceTransportSetInfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hmprconfig = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* hrouterinterface = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* hrouteriftransport = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pinterfaceinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t dwinterfaceinfosize = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MprConfigInterfaceTransportSetInfo")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hmprconfig, hrouterinterface, hrouteriftransport, pinterfaceinfo, dwinterfaceinfosize) : 0;
#else
    (void)hmprconfig;
    (void)hrouterinterface;
    (void)hrouteriftransport;
    (void)pinterfaceinfo;
    (void)dwinterfaceinfosize;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_MprConfigServerBackup_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hmprconfig = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpwspath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MprConfigServerBackup")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hmprconfig, lpwspath) : 0;
#else
    (void)hmprconfig;
    (void)lpwspath;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_MprConfigServerConnect_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpwsservername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* phmprconfig = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MprConfigServerConnect")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpwsservername, phmprconfig) : 0;
#else
    (void)lpwsservername;
    (void)phmprconfig;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_MprConfigServerDisconnect_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hmprconfig = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MprConfigServerDisconnect")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(hmprconfig);
#else
    (void)hmprconfig;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_MprConfigServerGetInfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hmprconfig = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwlevel = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* lplpbbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MprConfigServerGetInfo")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hmprconfig, dwlevel, lplpbbuffer) : 0;
#else
    (void)hmprconfig;
    (void)dwlevel;
    (void)lplpbbuffer;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_MprConfigServerGetInfoEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hmprconfig = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pserverinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MprConfigServerGetInfoEx")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hmprconfig, pserverinfo) : 0;
#else
    (void)hmprconfig;
    (void)pserverinfo;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_MprConfigServerInstall_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwlevel = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* pbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MprConfigServerInstall")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwlevel, pbuffer) : 0;
#else
    (void)dwlevel;
    (void)pbuffer;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_MprConfigServerRefresh_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hmprconfig = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MprConfigServerRefresh")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hmprconfig) : 0;
#else
    (void)hmprconfig;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_MprConfigServerRestore_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hmprconfig = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpwspath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MprConfigServerRestore")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hmprconfig, lpwspath) : 0;
#else
    (void)hmprconfig;
    (void)lpwspath;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_MprConfigServerSetInfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hmprserver = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint32_t dwlevel = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* lpbbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MprConfigServerSetInfo")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hmprserver, dwlevel, lpbbuffer) : 0;
#else
    (void)hmprserver;
    (void)dwlevel;
    (void)lpbbuffer;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_MprConfigServerSetInfoEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hmprconfig = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* psetserverconfig = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MprConfigServerSetInfoEx")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hmprconfig, psetserverconfig) : 0;
#else
    (void)hmprconfig;
    (void)psetserverconfig;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_MprConfigTransportCreate_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hmprconfig = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwtransportid = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* lpwstransportname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pglobalinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t dwglobalinfosize = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* pclientinterfaceinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    uint32_t dwclientinterfaceinfosize = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    void* lpwsdllpath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    void* phroutertransport = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MprConfigTransportCreate")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hmprconfig, dwtransportid, lpwstransportname, pglobalinfo, dwglobalinfosize, pclientinterfaceinfo, dwclientinterfaceinfosize, lpwsdllpath, phroutertransport) : 0;
#else
    (void)hmprconfig;
    (void)dwtransportid;
    (void)lpwstransportname;
    (void)pglobalinfo;
    (void)dwglobalinfosize;
    (void)pclientinterfaceinfo;
    (void)dwclientinterfaceinfosize;
    (void)lpwsdllpath;
    (void)phroutertransport;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_MprConfigTransportDelete_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hmprconfig = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* hroutertransport = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MprConfigTransportDelete")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hmprconfig, hroutertransport) : 0;
#else
    (void)hmprconfig;
    (void)hroutertransport;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_MprConfigTransportEnum_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hmprconfig = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwlevel = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* lplpbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t dwprefmaxlen = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* lpdwentriesread = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* lpdwtotalentries = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* lpdwresumehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MprConfigTransportEnum")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hmprconfig, dwlevel, lplpbuffer, dwprefmaxlen, lpdwentriesread, lpdwtotalentries, lpdwresumehandle) : 0;
#else
    (void)hmprconfig;
    (void)dwlevel;
    (void)lplpbuffer;
    (void)dwprefmaxlen;
    (void)lpdwentriesread;
    (void)lpdwtotalentries;
    (void)lpdwresumehandle;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_MprConfigTransportGetHandle_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hmprconfig = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwtransportid = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* phroutertransport = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MprConfigTransportGetHandle")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hmprconfig, dwtransportid, phroutertransport) : 0;
#else
    (void)hmprconfig;
    (void)dwtransportid;
    (void)phroutertransport;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_MprConfigTransportGetInfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hmprconfig = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* hroutertransport = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* ppglobalinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* lpdwglobalinfosize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* ppclientinterfaceinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* lpdwclientinterfaceinfosize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* lplpwsdllpath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MprConfigTransportGetInfo")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hmprconfig, hroutertransport, ppglobalinfo, lpdwglobalinfosize, ppclientinterfaceinfo, lpdwclientinterfaceinfosize, lplpwsdllpath) : 0;
#else
    (void)hmprconfig;
    (void)hroutertransport;
    (void)ppglobalinfo;
    (void)lpdwglobalinfosize;
    (void)ppclientinterfaceinfo;
    (void)lpdwclientinterfaceinfosize;
    (void)lplpwsdllpath;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_MprConfigTransportSetInfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hmprconfig = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* hroutertransport = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pglobalinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t dwglobalinfosize = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* pclientinterfaceinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t dwclientinterfaceinfosize = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* lpwsdllpath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MprConfigTransportSetInfo")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hmprconfig, hroutertransport, pglobalinfo, dwglobalinfosize, pclientinterfaceinfo, dwclientinterfaceinfosize, lpwsdllpath) : 0;
#else
    (void)hmprconfig;
    (void)hroutertransport;
    (void)pglobalinfo;
    (void)dwglobalinfosize;
    (void)pclientinterfaceinfo;
    (void)dwclientinterfaceinfosize;
    (void)lpwsdllpath;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_MprInfoBlockAdd_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpheader = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwinfotype = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t dwitemsize = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t dwitemcount = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* lpitemdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* lplpnewheader = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MprInfoBlockAdd")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpheader, dwinfotype, dwitemsize, dwitemcount, lpitemdata, lplpnewheader) : 0;
#else
    (void)lpheader;
    (void)dwinfotype;
    (void)dwitemsize;
    (void)dwitemcount;
    (void)lpitemdata;
    (void)lplpnewheader;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_MprInfoBlockFind_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpheader = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwinfotype = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* lpdwitemsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* lpdwitemcount = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* lplpitemdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MprInfoBlockFind")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpheader, dwinfotype, lpdwitemsize, lpdwitemcount, lplpitemdata) : 0;
#else
    (void)lpheader;
    (void)dwinfotype;
    (void)lpdwitemsize;
    (void)lpdwitemcount;
    (void)lplpitemdata;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_MprInfoBlockQuerySize_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpheader = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MprInfoBlockQuerySize")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpheader) : 0;
#else
    (void)lpheader;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_MprInfoBlockRemove_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpheader = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwinfotype = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* lplpnewheader = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MprInfoBlockRemove")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpheader, dwinfotype, lplpnewheader) : 0;
#else
    (void)lpheader;
    (void)dwinfotype;
    (void)lplpnewheader;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_MprInfoBlockSet_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpheader = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwinfotype = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t dwitemsize = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t dwitemcount = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* lpitemdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* lplpnewheader = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MprInfoBlockSet")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpheader, dwinfotype, dwitemsize, dwitemcount, lpitemdata, lplpnewheader) : 0;
#else
    (void)lpheader;
    (void)dwinfotype;
    (void)dwitemsize;
    (void)dwitemcount;
    (void)lpitemdata;
    (void)lplpnewheader;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_MprInfoCreate_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwversion = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* lplpnewheader = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MprInfoCreate")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwversion, lplpnewheader) : 0;
#else
    (void)dwversion;
    (void)lplpnewheader;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_MprInfoDelete_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpheader = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MprInfoDelete")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpheader) : 0;
#else
    (void)lpheader;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_MprInfoDuplicate_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpheader = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lplpnewheader = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MprInfoDuplicate")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpheader, lplpnewheader) : 0;
#else
    (void)lpheader;
    (void)lplpnewheader;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_MprInfoRemoveAll_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpheader = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lplpnewheader = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MprInfoRemoveAll")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpheader, lplpnewheader) : 0;
#else
    (void)lpheader;
    (void)lplpnewheader;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_RasClearConnectionStatistics_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hrasconn = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RasClearConnectionStatistics")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hrasconn) : 0;
#else
    (void)hrasconn;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_RasClearLinkStatistics_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hrasconn = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwsubentry = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RasClearLinkStatistics")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hrasconn, dwsubentry) : 0;
#else
    (void)hrasconn;
    (void)dwsubentry;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_RasConnectionNotificationA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* param0 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* param1 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t param2 = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RasConnectionNotificationA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(param0, param1, param2) : 0;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_RasConnectionNotificationW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* param0 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* param1 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t param2 = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RasConnectionNotificationW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(param0, param1, param2) : 0;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_RasCreatePhonebookEntryA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* param0 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* param1 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RasCreatePhonebookEntryA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(param0, param1) : 0;
#else
    (void)param0;
    (void)param1;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_RasCreatePhonebookEntryW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* param0 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* param1 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RasCreatePhonebookEntryW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(param0, param1) : 0;
#else
    (void)param0;
    (void)param1;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_RasDeleteEntryA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* param0 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* param1 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RasDeleteEntryA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(param0, param1) : 0;
#else
    (void)param0;
    (void)param1;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_RasDeleteEntryW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* param0 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* param1 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RasDeleteEntryW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(param0, param1) : 0;
#else
    (void)param0;
    (void)param1;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_RasDeleteSubEntryA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pszphonebook = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pszentry = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwsubentryid = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RasDeleteSubEntryA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pszphonebook, pszentry, dwsubentryid) : 0;
#else
    (void)pszphonebook;
    (void)pszentry;
    (void)dwsubentryid;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_RasDeleteSubEntryW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pszphonebook = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pszentry = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwsubentryid = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RasDeleteSubEntryW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pszphonebook, pszentry, dwsubentryid) : 0;
#else
    (void)pszphonebook;
    (void)pszentry;
    (void)dwsubentryid;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_RasDialA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* param0 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* param1 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* param2 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t param3 = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* param4 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* param5 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RasDialA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(param0, param1, param2, param3, param4, param5) : 0;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    (void)param4;
    (void)param5;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_RasDialDlgA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpszphonebook = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpszentry = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* lpszphonenumber = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* lpinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rasdlg.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RasDialDlgA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpszphonebook, lpszentry, lpszphonenumber, lpinfo) : -1;
#else
    (void)lpszphonebook;
    (void)lpszentry;
    (void)lpszphonenumber;
    (void)lpinfo;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_RasDialDlgW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpszphonebook = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpszentry = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* lpszphonenumber = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* lpinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rasdlg.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RasDialDlgW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpszphonebook, lpszentry, lpszphonenumber, lpinfo) : -1;
#else
    (void)lpszphonebook;
    (void)lpszentry;
    (void)lpszphonenumber;
    (void)lpinfo;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_RasDialW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* param0 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* param1 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* param2 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t param3 = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* param4 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* param5 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RasDialW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(param0, param1, param2, param3, param4, param5) : 0;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    (void)param4;
    (void)param5;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_RasEditPhonebookEntryA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* param0 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* param1 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* param2 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RasEditPhonebookEntryA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(param0, param1, param2) : 0;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_RasEditPhonebookEntryW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* param0 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* param1 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* param2 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RasEditPhonebookEntryW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(param0, param1, param2) : 0;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_RasEntryDlgA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpszphonebook = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpszentry = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* lpinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rasdlg.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RasEntryDlgA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpszphonebook, lpszentry, lpinfo) : -1;
#else
    (void)lpszphonebook;
    (void)lpszentry;
    (void)lpinfo;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_RasEntryDlgW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpszphonebook = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpszentry = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* lpinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rasdlg.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RasEntryDlgW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpszphonebook, lpszentry, lpinfo) : -1;
#else
    (void)lpszphonebook;
    (void)lpszentry;
    (void)lpinfo;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_RasEnumAutodialAddressesA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpprasautodialaddresses = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpdwcbrasautodialaddresses = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* lpdwcrasautodialaddresses = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RasEnumAutodialAddressesA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpprasautodialaddresses, lpdwcbrasautodialaddresses, lpdwcrasautodialaddresses) : 0;
#else
    (void)lpprasautodialaddresses;
    (void)lpdwcbrasautodialaddresses;
    (void)lpdwcrasautodialaddresses;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_RasEnumAutodialAddressesW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpprasautodialaddresses = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpdwcbrasautodialaddresses = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* lpdwcrasautodialaddresses = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RasEnumAutodialAddressesW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpprasautodialaddresses, lpdwcbrasautodialaddresses, lpdwcrasautodialaddresses) : 0;
#else
    (void)lpprasautodialaddresses;
    (void)lpdwcbrasautodialaddresses;
    (void)lpdwcrasautodialaddresses;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_RasEnumConnectionsA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* param0 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* param1 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* param2 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RasEnumConnectionsA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(param0, param1, param2) : 0;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_RasEnumConnectionsW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* param0 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* param1 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* param2 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RasEnumConnectionsW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(param0, param1, param2) : 0;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_RasEnumDevicesA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* param0 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* param1 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* param2 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RasEnumDevicesA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(param0, param1, param2) : 0;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_RasEnumDevicesW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* param0 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* param1 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* param2 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RasEnumDevicesW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(param0, param1, param2) : 0;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_RasEnumEntriesA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* param0 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* param1 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* param2 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* param3 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* param4 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RasEnumEntriesA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(param0, param1, param2, param3, param4) : 0;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    (void)param4;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_RasEnumEntriesW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* param0 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* param1 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* param2 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* param3 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* param4 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RasEnumEntriesW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(param0, param1, param2, param3, param4) : 0;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    (void)param4;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_RasFreeEapUserIdentityA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* praseapuseridentity = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RasFreeEapUserIdentityA")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(praseapuseridentity);
#else
    (void)praseapuseridentity;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_RasFreeEapUserIdentityW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* praseapuseridentity = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RasFreeEapUserIdentityW")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(praseapuseridentity);
#else
    (void)praseapuseridentity;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_RasGetAutodialAddressA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* param0 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* param1 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* param2 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* param3 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* param4 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RasGetAutodialAddressA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(param0, param1, param2, param3, param4) : 0;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    (void)param4;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_RasGetAutodialAddressW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* param0 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* param1 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* param2 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* param3 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* param4 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RasGetAutodialAddressW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(param0, param1, param2, param3, param4) : 0;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    (void)param4;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_RasGetAutodialEnableA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t param0 = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* param1 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RasGetAutodialEnableA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(param0, param1) : 0;
#else
    (void)param0;
    (void)param1;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_RasGetAutodialEnableW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t param0 = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* param1 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RasGetAutodialEnableW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(param0, param1) : 0;
#else
    (void)param0;
    (void)param1;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_RasGetAutodialParamA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t param0 = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* param1 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* param2 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RasGetAutodialParamA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(param0, param1, param2) : 0;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_RasGetAutodialParamW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t param0 = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* param1 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* param2 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RasGetAutodialParamW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(param0, param1, param2) : 0;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_RasGetConnectStatusA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* param0 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* param1 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RasGetConnectStatusA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(param0, param1) : 0;
#else
    (void)param0;
    (void)param1;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_RasGetConnectStatusW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* param0 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* param1 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RasGetConnectStatusW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(param0, param1) : 0;
#else
    (void)param0;
    (void)param1;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_RasGetConnectionStatistics_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hrasconn = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpstatistics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RasGetConnectionStatistics")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hrasconn, lpstatistics) : 0;
#else
    (void)hrasconn;
    (void)lpstatistics;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_RasGetCountryInfoA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* param0 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* param1 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RasGetCountryInfoA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(param0, param1) : 0;
#else
    (void)param0;
    (void)param1;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_RasGetCountryInfoW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* param0 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* param1 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RasGetCountryInfoW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(param0, param1) : 0;
#else
    (void)param0;
    (void)param1;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_RasGetCredentialsA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* param0 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* param1 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* param2 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RasGetCredentialsA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(param0, param1, param2) : 0;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_RasGetCredentialsW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* param0 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* param1 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* param2 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RasGetCredentialsW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(param0, param1, param2) : 0;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_RasGetCustomAuthDataA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pszphonebook = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pszentry = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pbcustomauthdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pdwsizeofcustomauthdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RasGetCustomAuthDataA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pszphonebook, pszentry, pbcustomauthdata, pdwsizeofcustomauthdata) : 0;
#else
    (void)pszphonebook;
    (void)pszentry;
    (void)pbcustomauthdata;
    (void)pdwsizeofcustomauthdata;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_RasGetCustomAuthDataW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pszphonebook = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pszentry = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pbcustomauthdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pdwsizeofcustomauthdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RasGetCustomAuthDataW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pszphonebook, pszentry, pbcustomauthdata, pdwsizeofcustomauthdata) : 0;
#else
    (void)pszphonebook;
    (void)pszentry;
    (void)pbcustomauthdata;
    (void)pdwsizeofcustomauthdata;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_RasGetEapUserDataA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* htoken = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pszphonebook = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pszentry = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pbeapdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pdwsizeofeapdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RasGetEapUserDataA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(htoken, pszphonebook, pszentry, pbeapdata, pdwsizeofeapdata) : 0;
#else
    (void)htoken;
    (void)pszphonebook;
    (void)pszentry;
    (void)pbeapdata;
    (void)pdwsizeofeapdata;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_RasGetEapUserDataW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* htoken = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pszphonebook = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pszentry = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pbeapdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pdwsizeofeapdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RasGetEapUserDataW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(htoken, pszphonebook, pszentry, pbeapdata, pdwsizeofeapdata) : 0;
#else
    (void)htoken;
    (void)pszphonebook;
    (void)pszentry;
    (void)pbeapdata;
    (void)pdwsizeofeapdata;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_RasGetEapUserIdentityA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pszphonebook = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pszentry = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* hwnd = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* ppraseapuseridentity = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RasGetEapUserIdentityA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pszphonebook, pszentry, dwflags, hwnd, ppraseapuseridentity) : 0;
#else
    (void)pszphonebook;
    (void)pszentry;
    (void)dwflags;
    (void)hwnd;
    (void)ppraseapuseridentity;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_RasGetEapUserIdentityW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pszphonebook = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pszentry = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* hwnd = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* ppraseapuseridentity = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RasGetEapUserIdentityW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pszphonebook, pszentry, dwflags, hwnd, ppraseapuseridentity) : 0;
#else
    (void)pszphonebook;
    (void)pszentry;
    (void)dwflags;
    (void)hwnd;
    (void)ppraseapuseridentity;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_RasGetEntryDialParamsA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* param0 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* param1 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* param2 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RasGetEntryDialParamsA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(param0, param1, param2) : 0;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_RasGetEntryDialParamsW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* param0 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* param1 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* param2 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RasGetEntryDialParamsW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(param0, param1, param2) : 0;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_RasGetEntryPropertiesA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* param0 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* param1 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* param2 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* param3 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* param4 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* param5 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RasGetEntryPropertiesA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(param0, param1, param2, param3, param4, param5) : 0;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    (void)param4;
    (void)param5;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_RasGetEntryPropertiesW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* param0 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* param1 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* param2 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* param3 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* param4 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* param5 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RasGetEntryPropertiesW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(param0, param1, param2, param3, param4, param5) : 0;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    (void)param4;
    (void)param5;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_RasGetErrorStringA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t resourceid = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* lpszstring = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t inbufsize = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RasGetErrorStringA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(resourceid, lpszstring, inbufsize) : 0;
#else
    (void)resourceid;
    (void)lpszstring;
    (void)inbufsize;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_RasGetErrorStringW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t resourceid = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* lpszstring = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t inbufsize = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RasGetErrorStringW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(resourceid, lpszstring, inbufsize) : 0;
#else
    (void)resourceid;
    (void)lpszstring;
    (void)inbufsize;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_RasGetLinkStatistics_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hrasconn = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwsubentry = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* lpstatistics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RasGetLinkStatistics")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hrasconn, dwsubentry, lpstatistics) : 0;
#else
    (void)hrasconn;
    (void)dwsubentry;
    (void)lpstatistics;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_RasGetPCscf_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpszpcscf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RasGetPCscf")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpszpcscf) : 0;
#else
    (void)lpszpcscf;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_RasGetProjectionInfoA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* param0 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t param1 = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* param2 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* param3 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RasGetProjectionInfoA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(param0, param1, param2, param3) : 0;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_RasGetProjectionInfoEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hrasconn = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* prasprojection = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* lpdwsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RasGetProjectionInfoEx")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hrasconn, prasprojection, lpdwsize) : 0;
#else
    (void)hrasconn;
    (void)prasprojection;
    (void)lpdwsize;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_RasGetProjectionInfoW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* param0 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t param1 = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* param2 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* param3 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RasGetProjectionInfoW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(param0, param1, param2, param3) : 0;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_RasGetSubEntryHandleA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* param0 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t param1 = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* param2 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RasGetSubEntryHandleA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(param0, param1, param2) : 0;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_RasGetSubEntryHandleW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* param0 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t param1 = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* param2 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RasGetSubEntryHandleW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(param0, param1, param2) : 0;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_RasGetSubEntryPropertiesA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* param0 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* param1 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t param2 = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* param3 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* param4 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* param5 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* param6 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RasGetSubEntryPropertiesA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(param0, param1, param2, param3, param4, param5, param6) : 0;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    (void)param4;
    (void)param5;
    (void)param6;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_RasGetSubEntryPropertiesW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* param0 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* param1 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t param2 = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* param3 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* param4 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* param5 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* param6 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RasGetSubEntryPropertiesW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(param0, param1, param2, param3, param4, param5, param6) : 0;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    (void)param4;
    (void)param5;
    (void)param6;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_RasHangUpA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* param0 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RasHangUpA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(param0) : 0;
#else
    (void)param0;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_RasHangUpW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* param0 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RasHangUpW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(param0) : 0;
#else
    (void)param0;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_RasInvokeEapUI_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* param0 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t param1 = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* param2 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* param3 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RasInvokeEapUI")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(param0, param1, param2, param3) : 0;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_RasPhonebookDlgA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpszphonebook = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpszentry = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* lpinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rasdlg.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RasPhonebookDlgA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpszphonebook, lpszentry, lpinfo) : -1;
#else
    (void)lpszphonebook;
    (void)lpszentry;
    (void)lpinfo;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_RasPhonebookDlgW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpszphonebook = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpszentry = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* lpinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rasdlg.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RasPhonebookDlgW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpszphonebook, lpszentry, lpinfo) : -1;
#else
    (void)lpszphonebook;
    (void)lpszentry;
    (void)lpinfo;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_RasRenameEntryA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* param0 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* param1 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* param2 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RasRenameEntryA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(param0, param1, param2) : 0;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_RasRenameEntryW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* param0 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* param1 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* param2 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RasRenameEntryW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(param0, param1, param2) : 0;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_RasSetAutodialAddressA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* param0 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t param1 = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* param2 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t param3 = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t param4 = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RasSetAutodialAddressA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(param0, param1, param2, param3, param4) : 0;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    (void)param4;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_RasSetAutodialAddressW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* param0 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t param1 = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* param2 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t param3 = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t param4 = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RasSetAutodialAddressW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(param0, param1, param2, param3, param4) : 0;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    (void)param4;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_RasSetAutodialEnableA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t param0 = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    int32_t param1 = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RasSetAutodialEnableA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(param0, param1) : 0;
#else
    (void)param0;
    (void)param1;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_RasSetAutodialEnableW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t param0 = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    int32_t param1 = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RasSetAutodialEnableW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(param0, param1) : 0;
#else
    (void)param0;
    (void)param1;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_RasSetAutodialParamA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t param0 = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* param1 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t param2 = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RasSetAutodialParamA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(param0, param1, param2) : 0;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_RasSetAutodialParamW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t param0 = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* param1 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t param2 = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RasSetAutodialParamW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(param0, param1, param2) : 0;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_RasSetCredentialsA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* param0 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* param1 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* param2 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int32_t param3 = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RasSetCredentialsA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(param0, param1, param2, param3) : 0;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_RasSetCredentialsW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* param0 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* param1 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* param2 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int32_t param3 = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RasSetCredentialsW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(param0, param1, param2, param3) : 0;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_RasSetCustomAuthDataA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pszphonebook = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pszentry = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pbcustomauthdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t dwsizeofcustomauthdata = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RasSetCustomAuthDataA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pszphonebook, pszentry, pbcustomauthdata, dwsizeofcustomauthdata) : 0;
#else
    (void)pszphonebook;
    (void)pszentry;
    (void)pbcustomauthdata;
    (void)dwsizeofcustomauthdata;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_RasSetCustomAuthDataW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pszphonebook = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pszentry = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pbcustomauthdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t dwsizeofcustomauthdata = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RasSetCustomAuthDataW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pszphonebook, pszentry, pbcustomauthdata, dwsizeofcustomauthdata) : 0;
#else
    (void)pszphonebook;
    (void)pszentry;
    (void)pbcustomauthdata;
    (void)dwsizeofcustomauthdata;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_RasSetEapUserDataA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* htoken = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pszphonebook = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pszentry = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pbeapdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t dwsizeofeapdata = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RasSetEapUserDataA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(htoken, pszphonebook, pszentry, pbeapdata, dwsizeofeapdata) : 0;
#else
    (void)htoken;
    (void)pszphonebook;
    (void)pszentry;
    (void)pbeapdata;
    (void)dwsizeofeapdata;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_RasSetEapUserDataW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* htoken = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pszphonebook = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pszentry = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pbeapdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t dwsizeofeapdata = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RasSetEapUserDataW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(htoken, pszphonebook, pszentry, pbeapdata, dwsizeofeapdata) : 0;
#else
    (void)htoken;
    (void)pszphonebook;
    (void)pszentry;
    (void)pbeapdata;
    (void)dwsizeofeapdata;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_RasSetEntryDialParamsA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* param0 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* param1 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t param2 = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RasSetEntryDialParamsA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(param0, param1, param2) : 0;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_RasSetEntryDialParamsW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* param0 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* param1 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t param2 = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RasSetEntryDialParamsW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(param0, param1, param2) : 0;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_RasSetEntryPropertiesA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* param0 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* param1 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* param2 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t param3 = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* param4 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t param5 = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RasSetEntryPropertiesA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(param0, param1, param2, param3, param4, param5) : 0;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    (void)param4;
    (void)param5;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_RasSetEntryPropertiesW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* param0 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* param1 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* param2 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t param3 = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* param4 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t param5 = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RasSetEntryPropertiesW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(param0, param1, param2, param3, param4, param5) : 0;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    (void)param4;
    (void)param5;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_RasSetSubEntryPropertiesA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* param0 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* param1 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t param2 = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* param3 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t param4 = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* param5 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    uint32_t param6 = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RasSetSubEntryPropertiesA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(param0, param1, param2, param3, param4, param5, param6) : 0;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    (void)param4;
    (void)param5;
    (void)param6;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_RasSetSubEntryPropertiesW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* param0 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* param1 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t param2 = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* param3 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t param4 = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* param5 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    uint32_t param6 = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RasSetSubEntryPropertiesW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(param0, param1, param2, param3, param4, param5, param6) : 0;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    (void)param4;
    (void)param5;
    (void)param6;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_RasUpdateConnection_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hrasconn = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lprasupdateconn = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RasUpdateConnection")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hrasconn, lprasupdateconn) : 0;
#else
    (void)hrasconn;
    (void)lprasupdateconn;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_RasValidateEntryNameA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* param0 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* param1 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RasValidateEntryNameA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(param0, param1) : 0;
#else
    (void)param0;
    (void)param1;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_RasValidateEntryNameW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* param0 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* param1 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RasValidateEntryNameW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(param0, param1) : 0;
#else
    (void)param0;
    (void)param1;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_RtmAddNextHop_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t rtmreghandle = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* nexthopinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* nexthophandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* changeflags = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtmAddNextHop")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(rtmreghandle, nexthopinfo, nexthophandle, changeflags) : 0;
#else
    (void)rtmreghandle;
    (void)nexthopinfo;
    (void)nexthophandle;
    (void)changeflags;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_RtmAddRouteToDest_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t rtmreghandle = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* routehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* destaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* routeinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t timetolive = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    int64_t routelisthandle = km_info.Length() > 5 ? km_napi_arg_i64(km_info[5]) : 0;
    uint32_t notifytype = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    int64_t notifyhandle = km_info.Length() > 7 ? km_napi_arg_i64(km_info[7]) : 0;
    void* changeflags = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*, uint32_t, int64_t, uint32_t, int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtmAddRouteToDest")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(rtmreghandle, routehandle, destaddress, routeinfo, timetolive, routelisthandle, notifytype, notifyhandle, changeflags) : 0;
#else
    (void)rtmreghandle;
    (void)routehandle;
    (void)destaddress;
    (void)routeinfo;
    (void)timetolive;
    (void)routelisthandle;
    (void)notifytype;
    (void)notifyhandle;
    (void)changeflags;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_RtmBlockMethods_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t rtmreghandle = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* targethandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint8_t targettype = static_cast<uint8_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t blockingflag = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, uint8_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtmBlockMethods")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(rtmreghandle, targethandle, targettype, blockingflag) : 0;
#else
    (void)rtmreghandle;
    (void)targethandle;
    (void)targettype;
    (void)blockingflag;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_RtmConvertNetAddressToIpv6AddressAndLength_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pnetaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* paddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* plength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t dwaddresssize = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtmConvertNetAddressToIpv6AddressAndLength")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pnetaddress, paddress, plength, dwaddresssize) : 0;
#else
    (void)pnetaddress;
    (void)paddress;
    (void)plength;
    (void)dwaddresssize;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_RtmCreateDestEnum_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t rtmreghandle = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint32_t targetviews = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t enumflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* netaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t protocolid = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* rtmenumhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtmCreateDestEnum")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(rtmreghandle, targetviews, enumflags, netaddress, protocolid, rtmenumhandle) : 0;
#else
    (void)rtmreghandle;
    (void)targetviews;
    (void)enumflags;
    (void)netaddress;
    (void)protocolid;
    (void)rtmenumhandle;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_RtmCreateNextHopEnum_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t rtmreghandle = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint32_t enumflags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* netaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* rtmenumhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtmCreateNextHopEnum")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(rtmreghandle, enumflags, netaddress, rtmenumhandle) : 0;
#else
    (void)rtmreghandle;
    (void)enumflags;
    (void)netaddress;
    (void)rtmenumhandle;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_RtmCreateRouteEnum_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t rtmreghandle = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t desthandle = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
    uint32_t targetviews = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t enumflags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* startdest = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t matchingflags = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* criteriaroute = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    uint32_t criteriainterface = static_cast<uint32_t>(km_info.Length() > 7 ? km_info[7].ToNumber().Int32Value() : 0);
    void* rtmenumhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, uint32_t, uint32_t, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtmCreateRouteEnum")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(rtmreghandle, desthandle, targetviews, enumflags, startdest, matchingflags, criteriaroute, criteriainterface, rtmenumhandle) : 0;
#else
    (void)rtmreghandle;
    (void)desthandle;
    (void)targetviews;
    (void)enumflags;
    (void)startdest;
    (void)matchingflags;
    (void)criteriaroute;
    (void)criteriainterface;
    (void)rtmenumhandle;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_RtmCreateRouteList_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t rtmreghandle = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* routelisthandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtmCreateRouteList")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(rtmreghandle, routelisthandle) : 0;
#else
    (void)rtmreghandle;
    (void)routelisthandle;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_RtmCreateRouteListEnum_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t rtmreghandle = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t routelisthandle = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
    void* rtmenumhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtmCreateRouteListEnum")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(rtmreghandle, routelisthandle, rtmenumhandle) : 0;
#else
    (void)rtmreghandle;
    (void)routelisthandle;
    (void)rtmenumhandle;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_RtmDeleteEnumHandle_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t rtmreghandle = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t enumhandle = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtmDeleteEnumHandle")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(rtmreghandle, enumhandle) : 0;
#else
    (void)rtmreghandle;
    (void)enumhandle;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_RtmDeleteNextHop_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t rtmreghandle = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t nexthophandle = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
    void* nexthopinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtmDeleteNextHop")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(rtmreghandle, nexthophandle, nexthopinfo) : 0;
#else
    (void)rtmreghandle;
    (void)nexthophandle;
    (void)nexthopinfo;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_RtmDeleteRouteList_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t rtmreghandle = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t routelisthandle = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtmDeleteRouteList")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(rtmreghandle, routelisthandle) : 0;
#else
    (void)rtmreghandle;
    (void)routelisthandle;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_RtmDeleteRouteToDest_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t rtmreghandle = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t routehandle = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
    void* changeflags = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtmDeleteRouteToDest")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(rtmreghandle, routehandle, changeflags) : 0;
#else
    (void)rtmreghandle;
    (void)routehandle;
    (void)changeflags;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_RtmDeregisterEntity_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t rtmreghandle = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtmDeregisterEntity")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(rtmreghandle) : 0;
#else
    (void)rtmreghandle;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_RtmDeregisterFromChangeNotification_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t rtmreghandle = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t notifyhandle = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtmDeregisterFromChangeNotification")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(rtmreghandle, notifyhandle) : 0;
#else
    (void)rtmreghandle;
    (void)notifyhandle;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_RtmFindNextHop_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t rtmreghandle = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* nexthopinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* nexthophandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* nexthoppointer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtmFindNextHop")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(rtmreghandle, nexthopinfo, nexthophandle, nexthoppointer) : 0;
#else
    (void)rtmreghandle;
    (void)nexthopinfo;
    (void)nexthophandle;
    (void)nexthoppointer;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_RtmGetChangeStatus_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t rtmreghandle = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t notifyhandle = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
    int64_t desthandle = km_info.Length() > 2 ? km_napi_arg_i64(km_info[2]) : 0;
    void* changestatus = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtmGetChangeStatus")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(rtmreghandle, notifyhandle, desthandle, changestatus) : 0;
#else
    (void)rtmreghandle;
    (void)notifyhandle;
    (void)desthandle;
    (void)changestatus;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_RtmGetChangedDests_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t rtmreghandle = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t notifyhandle = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
    void* numdests = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* changeddests = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtmGetChangedDests")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(rtmreghandle, notifyhandle, numdests, changeddests) : 0;
#else
    (void)rtmreghandle;
    (void)notifyhandle;
    (void)numdests;
    (void)changeddests;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_RtmGetDestInfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t rtmreghandle = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t desthandle = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
    uint32_t protocolid = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t targetviews = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* destinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtmGetDestInfo")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(rtmreghandle, desthandle, protocolid, targetviews, destinfo) : 0;
#else
    (void)rtmreghandle;
    (void)desthandle;
    (void)protocolid;
    (void)targetviews;
    (void)destinfo;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_RtmGetEntityInfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t rtmreghandle = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t entityhandle = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
    void* entityinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtmGetEntityInfo")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(rtmreghandle, entityhandle, entityinfo) : 0;
#else
    (void)rtmreghandle;
    (void)entityhandle;
    (void)entityinfo;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_RtmGetEntityMethods_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t rtmreghandle = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t entityhandle = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
    void* nummethods = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* exptmethods = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtmGetEntityMethods")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(rtmreghandle, entityhandle, nummethods, exptmethods) : 0;
#else
    (void)rtmreghandle;
    (void)entityhandle;
    (void)nummethods;
    (void)exptmethods;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_RtmGetEnumDests_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t rtmreghandle = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t enumhandle = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
    void* numdests = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* destinfos = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtmGetEnumDests")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(rtmreghandle, enumhandle, numdests, destinfos) : 0;
#else
    (void)rtmreghandle;
    (void)enumhandle;
    (void)numdests;
    (void)destinfos;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_RtmGetEnumNextHops_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t rtmreghandle = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t enumhandle = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
    void* numnexthops = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* nexthophandles = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtmGetEnumNextHops")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(rtmreghandle, enumhandle, numnexthops, nexthophandles) : 0;
#else
    (void)rtmreghandle;
    (void)enumhandle;
    (void)numnexthops;
    (void)nexthophandles;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_RtmGetEnumRoutes_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t rtmreghandle = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t enumhandle = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
    void* numroutes = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* routehandles = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtmGetEnumRoutes")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(rtmreghandle, enumhandle, numroutes, routehandles) : 0;
#else
    (void)rtmreghandle;
    (void)enumhandle;
    (void)numroutes;
    (void)routehandles;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_RtmGetExactMatchDestination_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t rtmreghandle = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* destaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t protocolid = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t targetviews = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* destinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtmGetExactMatchDestination")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(rtmreghandle, destaddress, protocolid, targetviews, destinfo) : 0;
#else
    (void)rtmreghandle;
    (void)destaddress;
    (void)protocolid;
    (void)targetviews;
    (void)destinfo;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_RtmGetExactMatchRoute_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t rtmreghandle = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* destaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t matchingflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* routeinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t interfaceindex = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    uint32_t targetviews = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* routehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtmGetExactMatchRoute")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(rtmreghandle, destaddress, matchingflags, routeinfo, interfaceindex, targetviews, routehandle) : 0;
#else
    (void)rtmreghandle;
    (void)destaddress;
    (void)matchingflags;
    (void)routeinfo;
    (void)interfaceindex;
    (void)targetviews;
    (void)routehandle;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_RtmGetLessSpecificDestination_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t rtmreghandle = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t desthandle = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
    uint32_t protocolid = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t targetviews = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* destinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtmGetLessSpecificDestination")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(rtmreghandle, desthandle, protocolid, targetviews, destinfo) : 0;
#else
    (void)rtmreghandle;
    (void)desthandle;
    (void)protocolid;
    (void)targetviews;
    (void)destinfo;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_RtmGetListEnumRoutes_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t rtmreghandle = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t enumhandle = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
    void* numroutes = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* routehandles = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtmGetListEnumRoutes")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(rtmreghandle, enumhandle, numroutes, routehandles) : 0;
#else
    (void)rtmreghandle;
    (void)enumhandle;
    (void)numroutes;
    (void)routehandles;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_RtmGetMostSpecificDestination_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t rtmreghandle = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* destaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t protocolid = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t targetviews = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* destinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtmGetMostSpecificDestination")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(rtmreghandle, destaddress, protocolid, targetviews, destinfo) : 0;
#else
    (void)rtmreghandle;
    (void)destaddress;
    (void)protocolid;
    (void)targetviews;
    (void)destinfo;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_RtmGetNextHopInfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t rtmreghandle = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t nexthophandle = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
    void* nexthopinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtmGetNextHopInfo")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(rtmreghandle, nexthophandle, nexthopinfo) : 0;
#else
    (void)rtmreghandle;
    (void)nexthophandle;
    (void)nexthopinfo;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_RtmGetNextHopPointer_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t rtmreghandle = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t nexthophandle = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
    void* nexthoppointer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtmGetNextHopPointer")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(rtmreghandle, nexthophandle, nexthoppointer) : 0;
#else
    (void)rtmreghandle;
    (void)nexthophandle;
    (void)nexthoppointer;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_RtmGetOpaqueInformationPointer_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t rtmreghandle = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t desthandle = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
    void* opaqueinfopointer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtmGetOpaqueInformationPointer")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(rtmreghandle, desthandle, opaqueinfopointer) : 0;
#else
    (void)rtmreghandle;
    (void)desthandle;
    (void)opaqueinfopointer;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_RtmGetRegisteredEntities_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t rtmreghandle = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* numentities = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* entityhandles = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* entityinfos = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtmGetRegisteredEntities")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(rtmreghandle, numentities, entityhandles, entityinfos) : 0;
#else
    (void)rtmreghandle;
    (void)numentities;
    (void)entityhandles;
    (void)entityinfos;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_RtmGetRouteInfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t rtmreghandle = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t routehandle = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
    void* routeinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* destaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtmGetRouteInfo")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(rtmreghandle, routehandle, routeinfo, destaddress) : 0;
#else
    (void)rtmreghandle;
    (void)routehandle;
    (void)routeinfo;
    (void)destaddress;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_RtmGetRoutePointer_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t rtmreghandle = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t routehandle = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
    void* routepointer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtmGetRoutePointer")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(rtmreghandle, routehandle, routepointer) : 0;
#else
    (void)rtmreghandle;
    (void)routehandle;
    (void)routepointer;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_RtmHoldDestination_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t rtmreghandle = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t desthandle = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
    uint32_t targetviews = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t holdtime = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtmHoldDestination")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(rtmreghandle, desthandle, targetviews, holdtime) : 0;
#else
    (void)rtmreghandle;
    (void)desthandle;
    (void)targetviews;
    (void)holdtime;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_RtmIgnoreChangedDests_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t rtmreghandle = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t notifyhandle = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
    uint32_t numdests = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* changeddests = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtmIgnoreChangedDests")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(rtmreghandle, notifyhandle, numdests, changeddests) : 0;
#else
    (void)rtmreghandle;
    (void)notifyhandle;
    (void)numdests;
    (void)changeddests;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_RtmInsertInRouteList_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t rtmreghandle = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t routelisthandle = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
    uint32_t numroutes = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* routehandles = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtmInsertInRouteList")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(rtmreghandle, routelisthandle, numroutes, routehandles) : 0;
#else
    (void)rtmreghandle;
    (void)routelisthandle;
    (void)numroutes;
    (void)routehandles;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_RtmInvokeMethod_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t rtmreghandle = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t entityhandle = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
    void* input = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* outputsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* output = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtmInvokeMethod")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(rtmreghandle, entityhandle, input, outputsize, output) : 0;
#else
    (void)rtmreghandle;
    (void)entityhandle;
    (void)input;
    (void)outputsize;
    (void)output;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_RtmIsBestRoute_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t rtmreghandle = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t routehandle = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
    void* bestinviews = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtmIsBestRoute")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(rtmreghandle, routehandle, bestinviews) : 0;
#else
    (void)rtmreghandle;
    (void)routehandle;
    (void)bestinviews;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_RtmIsMarkedForChangeNotification_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t rtmreghandle = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t notifyhandle = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
    int64_t desthandle = km_info.Length() > 2 ? km_napi_arg_i64(km_info[2]) : 0;
    void* destmarked = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtmIsMarkedForChangeNotification")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(rtmreghandle, notifyhandle, desthandle, destmarked) : 0;
#else
    (void)rtmreghandle;
    (void)notifyhandle;
    (void)desthandle;
    (void)destmarked;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_RtmLockDestination_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t rtmreghandle = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t desthandle = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
    int32_t exclusive = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t lockdest = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtmLockDestination")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(rtmreghandle, desthandle, exclusive, lockdest) : 0;
#else
    (void)rtmreghandle;
    (void)desthandle;
    (void)exclusive;
    (void)lockdest;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_RtmLockNextHop_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t rtmreghandle = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t nexthophandle = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
    int32_t exclusive = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t locknexthop = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* nexthoppointer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtmLockNextHop")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(rtmreghandle, nexthophandle, exclusive, locknexthop, nexthoppointer) : 0;
#else
    (void)rtmreghandle;
    (void)nexthophandle;
    (void)exclusive;
    (void)locknexthop;
    (void)nexthoppointer;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_RtmLockRoute_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t rtmreghandle = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t routehandle = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
    int32_t exclusive = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t lockroute = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* routepointer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtmLockRoute")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(rtmreghandle, routehandle, exclusive, lockroute, routepointer) : 0;
#else
    (void)rtmreghandle;
    (void)routehandle;
    (void)exclusive;
    (void)lockroute;
    (void)routepointer;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_RtmMarkDestForChangeNotification_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t rtmreghandle = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t notifyhandle = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
    int64_t desthandle = km_info.Length() > 2 ? km_napi_arg_i64(km_info[2]) : 0;
    int32_t markdest = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, int64_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtmMarkDestForChangeNotification")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(rtmreghandle, notifyhandle, desthandle, markdest) : 0;
#else
    (void)rtmreghandle;
    (void)notifyhandle;
    (void)desthandle;
    (void)markdest;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_RtmReferenceHandles_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t rtmreghandle = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint32_t numhandles = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* rtmhandles = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtmReferenceHandles")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(rtmreghandle, numhandles, rtmhandles) : 0;
#else
    (void)rtmreghandle;
    (void)numhandles;
    (void)rtmhandles;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_RtmRegisterEntity_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* rtmentityinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* exportmethods = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* eventcallback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int32_t reserveopaquepointer = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* rtmregprofile = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* rtmreghandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtmRegisterEntity")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(rtmentityinfo, exportmethods, eventcallback, reserveopaquepointer, rtmregprofile, rtmreghandle) : 0;
#else
    (void)rtmentityinfo;
    (void)exportmethods;
    (void)eventcallback;
    (void)reserveopaquepointer;
    (void)rtmregprofile;
    (void)rtmreghandle;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_RtmRegisterForChangeNotification_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t rtmreghandle = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint32_t targetviews = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t notifyflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* notifycontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* notifyhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtmRegisterForChangeNotification")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(rtmreghandle, targetviews, notifyflags, notifycontext, notifyhandle) : 0;
#else
    (void)rtmreghandle;
    (void)targetviews;
    (void)notifyflags;
    (void)notifycontext;
    (void)notifyhandle;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_RtmReleaseChangedDests_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t rtmreghandle = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t notifyhandle = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
    uint32_t numdests = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* changeddests = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtmReleaseChangedDests")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(rtmreghandle, notifyhandle, numdests, changeddests) : 0;
#else
    (void)rtmreghandle;
    (void)notifyhandle;
    (void)numdests;
    (void)changeddests;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_RtmReleaseDestInfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t rtmreghandle = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* destinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtmReleaseDestInfo")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(rtmreghandle, destinfo) : 0;
#else
    (void)rtmreghandle;
    (void)destinfo;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_RtmReleaseDests_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t rtmreghandle = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint32_t numdests = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* destinfos = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtmReleaseDests")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(rtmreghandle, numdests, destinfos) : 0;
#else
    (void)rtmreghandle;
    (void)numdests;
    (void)destinfos;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_RtmReleaseEntities_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t rtmreghandle = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint32_t numentities = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* entityhandles = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtmReleaseEntities")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(rtmreghandle, numentities, entityhandles) : 0;
#else
    (void)rtmreghandle;
    (void)numentities;
    (void)entityhandles;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_RtmReleaseEntityInfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t rtmreghandle = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* entityinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtmReleaseEntityInfo")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(rtmreghandle, entityinfo) : 0;
#else
    (void)rtmreghandle;
    (void)entityinfo;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_RtmReleaseNextHopInfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t rtmreghandle = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* nexthopinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtmReleaseNextHopInfo")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(rtmreghandle, nexthopinfo) : 0;
#else
    (void)rtmreghandle;
    (void)nexthopinfo;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_RtmReleaseNextHops_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t rtmreghandle = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint32_t numnexthops = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* nexthophandles = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtmReleaseNextHops")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(rtmreghandle, numnexthops, nexthophandles) : 0;
#else
    (void)rtmreghandle;
    (void)numnexthops;
    (void)nexthophandles;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_RtmReleaseRouteInfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t rtmreghandle = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* routeinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtmReleaseRouteInfo")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(rtmreghandle, routeinfo) : 0;
#else
    (void)rtmreghandle;
    (void)routeinfo;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_RtmReleaseRoutes_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t rtmreghandle = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint32_t numroutes = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* routehandles = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtmReleaseRoutes")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(rtmreghandle, numroutes, routehandles) : 0;
#else
    (void)rtmreghandle;
    (void)numroutes;
    (void)routehandles;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_rras_RtmUpdateAndUnlockRoute_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t rtmreghandle = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t routehandle = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
    uint32_t timetolive = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int64_t routelisthandle = km_info.Length() > 3 ? km_napi_arg_i64(km_info[3]) : 0;
    uint32_t notifytype = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    int64_t notifyhandle = km_info.Length() > 5 ? km_napi_arg_i64(km_info[5]) : 0;
    void* changeflags = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, uint32_t, int64_t, uint32_t, int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtmUpdateAndUnlockRoute")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(rtmreghandle, routehandle, timetolive, routelisthandle, notifytype, notifyhandle, changeflags) : 0;
#else
    (void)rtmreghandle;
    (void)routehandle;
    (void)timetolive;
    (void)routelisthandle;
    (void)notifytype;
    (void)notifyhandle;
    (void)changeflags;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static void register_windows_win32_networkmanagement_rras_napi(Napi::Env env, Napi::Object exports) {
    exports.Set("windowssys_windows_win32_networkmanagement_rras_MgmAddGroupMembershipEntry", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_MgmAddGroupMembershipEntry_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_MgmDeRegisterMProtocol", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_MgmDeRegisterMProtocol_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_MgmDeleteGroupMembershipEntry", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_MgmDeleteGroupMembershipEntry_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_MgmGetFirstMfe", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_MgmGetFirstMfe_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_MgmGetFirstMfeStats", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_MgmGetFirstMfeStats_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_MgmGetMfe", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_MgmGetMfe_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_MgmGetMfeStats", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_MgmGetMfeStats_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_MgmGetNextMfe", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_MgmGetNextMfe_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_MgmGetNextMfeStats", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_MgmGetNextMfeStats_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_MgmGetProtocolOnInterface", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_MgmGetProtocolOnInterface_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_MgmGroupEnumerationEnd", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_MgmGroupEnumerationEnd_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_MgmGroupEnumerationGetNext", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_MgmGroupEnumerationGetNext_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_MgmGroupEnumerationStart", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_MgmGroupEnumerationStart_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_MgmRegisterMProtocol", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_MgmRegisterMProtocol_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_MgmReleaseInterfaceOwnership", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_MgmReleaseInterfaceOwnership_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_MgmTakeInterfaceOwnership", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_MgmTakeInterfaceOwnership_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_MprAdminBufferFree", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_MprAdminBufferFree_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_MprAdminConnectionClearStats", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_MprAdminConnectionClearStats_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_MprAdminConnectionEnum", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_MprAdminConnectionEnum_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_MprAdminConnectionEnumEx", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_MprAdminConnectionEnumEx_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_MprAdminConnectionGetInfo", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_MprAdminConnectionGetInfo_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_MprAdminConnectionGetInfoEx", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_MprAdminConnectionGetInfoEx_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_MprAdminConnectionRemoveQuarantine", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_MprAdminConnectionRemoveQuarantine_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_MprAdminDeregisterConnectionNotification", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_MprAdminDeregisterConnectionNotification_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_MprAdminDeviceEnum", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_MprAdminDeviceEnum_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_MprAdminEstablishDomainRasServer", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_MprAdminEstablishDomainRasServer_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_MprAdminGetErrorString", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_MprAdminGetErrorString_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_MprAdminGetPDCServer", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_MprAdminGetPDCServer_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_MprAdminInterfaceConnect", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_MprAdminInterfaceConnect_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_MprAdminInterfaceCreate", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_MprAdminInterfaceCreate_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_MprAdminInterfaceDelete", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_MprAdminInterfaceDelete_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_MprAdminInterfaceDeviceGetInfo", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_MprAdminInterfaceDeviceGetInfo_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_MprAdminInterfaceDeviceSetInfo", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_MprAdminInterfaceDeviceSetInfo_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_MprAdminInterfaceDisconnect", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_MprAdminInterfaceDisconnect_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_MprAdminInterfaceEnum", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_MprAdminInterfaceEnum_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_MprAdminInterfaceGetCredentials", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_MprAdminInterfaceGetCredentials_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_MprAdminInterfaceGetCredentialsEx", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_MprAdminInterfaceGetCredentialsEx_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_MprAdminInterfaceGetCustomInfoEx", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_MprAdminInterfaceGetCustomInfoEx_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_MprAdminInterfaceGetHandle", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_MprAdminInterfaceGetHandle_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_MprAdminInterfaceGetInfo", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_MprAdminInterfaceGetInfo_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_MprAdminInterfaceQueryUpdateResult", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_MprAdminInterfaceQueryUpdateResult_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_MprAdminInterfaceSetCredentials", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_MprAdminInterfaceSetCredentials_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_MprAdminInterfaceSetCredentialsEx", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_MprAdminInterfaceSetCredentialsEx_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_MprAdminInterfaceSetCustomInfoEx", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_MprAdminInterfaceSetCustomInfoEx_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_MprAdminInterfaceSetInfo", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_MprAdminInterfaceSetInfo_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_MprAdminInterfaceTransportAdd", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_MprAdminInterfaceTransportAdd_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_MprAdminInterfaceTransportGetInfo", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_MprAdminInterfaceTransportGetInfo_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_MprAdminInterfaceTransportRemove", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_MprAdminInterfaceTransportRemove_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_MprAdminInterfaceTransportSetInfo", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_MprAdminInterfaceTransportSetInfo_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_MprAdminInterfaceUpdatePhonebookInfo", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_MprAdminInterfaceUpdatePhonebookInfo_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_MprAdminInterfaceUpdateRoutes", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_MprAdminInterfaceUpdateRoutes_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_MprAdminIsDomainRasServer", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_MprAdminIsDomainRasServer_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_MprAdminIsServiceInitialized", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_MprAdminIsServiceInitialized_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_MprAdminIsServiceRunning", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_MprAdminIsServiceRunning_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_MprAdminMIBBufferFree", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_MprAdminMIBBufferFree_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_MprAdminMIBEntryCreate", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_MprAdminMIBEntryCreate_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_MprAdminMIBEntryDelete", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_MprAdminMIBEntryDelete_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_MprAdminMIBEntryGet", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_MprAdminMIBEntryGet_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_MprAdminMIBEntryGetFirst", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_MprAdminMIBEntryGetFirst_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_MprAdminMIBEntryGetNext", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_MprAdminMIBEntryGetNext_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_MprAdminMIBEntrySet", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_MprAdminMIBEntrySet_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_MprAdminMIBServerConnect", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_MprAdminMIBServerConnect_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_MprAdminMIBServerDisconnect", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_MprAdminMIBServerDisconnect_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_MprAdminPortClearStats", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_MprAdminPortClearStats_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_MprAdminPortDisconnect", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_MprAdminPortDisconnect_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_MprAdminPortEnum", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_MprAdminPortEnum_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_MprAdminPortGetInfo", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_MprAdminPortGetInfo_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_MprAdminPortReset", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_MprAdminPortReset_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_MprAdminRegisterConnectionNotification", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_MprAdminRegisterConnectionNotification_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_MprAdminSendUserMessage", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_MprAdminSendUserMessage_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_MprAdminServerConnect", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_MprAdminServerConnect_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_MprAdminServerDisconnect", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_MprAdminServerDisconnect_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_MprAdminServerGetCredentials", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_MprAdminServerGetCredentials_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_MprAdminServerGetInfo", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_MprAdminServerGetInfo_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_MprAdminServerGetInfoEx", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_MprAdminServerGetInfoEx_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_MprAdminServerSetCredentials", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_MprAdminServerSetCredentials_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_MprAdminServerSetInfo", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_MprAdminServerSetInfo_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_MprAdminServerSetInfoEx", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_MprAdminServerSetInfoEx_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_MprAdminTransportCreate", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_MprAdminTransportCreate_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_MprAdminTransportGetInfo", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_MprAdminTransportGetInfo_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_MprAdminTransportSetInfo", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_MprAdminTransportSetInfo_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_MprAdminUpdateConnection", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_MprAdminUpdateConnection_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_MprAdminUserGetInfo", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_MprAdminUserGetInfo_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_MprAdminUserSetInfo", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_MprAdminUserSetInfo_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_MprConfigBufferFree", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_MprConfigBufferFree_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_MprConfigFilterGetInfo", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_MprConfigFilterGetInfo_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_MprConfigFilterSetInfo", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_MprConfigFilterSetInfo_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_MprConfigGetFriendlyName", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_MprConfigGetFriendlyName_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_MprConfigGetGuidName", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_MprConfigGetGuidName_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_MprConfigInterfaceCreate", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_MprConfigInterfaceCreate_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_MprConfigInterfaceDelete", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_MprConfigInterfaceDelete_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_MprConfigInterfaceEnum", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_MprConfigInterfaceEnum_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_MprConfigInterfaceGetCustomInfoEx", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_MprConfigInterfaceGetCustomInfoEx_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_MprConfigInterfaceGetHandle", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_MprConfigInterfaceGetHandle_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_MprConfigInterfaceGetInfo", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_MprConfigInterfaceGetInfo_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_MprConfigInterfaceSetCustomInfoEx", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_MprConfigInterfaceSetCustomInfoEx_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_MprConfigInterfaceSetInfo", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_MprConfigInterfaceSetInfo_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_MprConfigInterfaceTransportAdd", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_MprConfigInterfaceTransportAdd_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_MprConfigInterfaceTransportEnum", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_MprConfigInterfaceTransportEnum_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_MprConfigInterfaceTransportGetHandle", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_MprConfigInterfaceTransportGetHandle_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_MprConfigInterfaceTransportGetInfo", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_MprConfigInterfaceTransportGetInfo_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_MprConfigInterfaceTransportRemove", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_MprConfigInterfaceTransportRemove_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_MprConfigInterfaceTransportSetInfo", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_MprConfigInterfaceTransportSetInfo_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_MprConfigServerBackup", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_MprConfigServerBackup_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_MprConfigServerConnect", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_MprConfigServerConnect_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_MprConfigServerDisconnect", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_MprConfigServerDisconnect_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_MprConfigServerGetInfo", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_MprConfigServerGetInfo_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_MprConfigServerGetInfoEx", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_MprConfigServerGetInfoEx_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_MprConfigServerInstall", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_MprConfigServerInstall_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_MprConfigServerRefresh", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_MprConfigServerRefresh_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_MprConfigServerRestore", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_MprConfigServerRestore_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_MprConfigServerSetInfo", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_MprConfigServerSetInfo_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_MprConfigServerSetInfoEx", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_MprConfigServerSetInfoEx_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_MprConfigTransportCreate", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_MprConfigTransportCreate_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_MprConfigTransportDelete", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_MprConfigTransportDelete_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_MprConfigTransportEnum", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_MprConfigTransportEnum_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_MprConfigTransportGetHandle", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_MprConfigTransportGetHandle_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_MprConfigTransportGetInfo", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_MprConfigTransportGetInfo_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_MprConfigTransportSetInfo", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_MprConfigTransportSetInfo_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_MprInfoBlockAdd", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_MprInfoBlockAdd_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_MprInfoBlockFind", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_MprInfoBlockFind_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_MprInfoBlockQuerySize", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_MprInfoBlockQuerySize_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_MprInfoBlockRemove", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_MprInfoBlockRemove_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_MprInfoBlockSet", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_MprInfoBlockSet_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_MprInfoCreate", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_MprInfoCreate_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_MprInfoDelete", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_MprInfoDelete_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_MprInfoDuplicate", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_MprInfoDuplicate_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_MprInfoRemoveAll", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_MprInfoRemoveAll_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_RasClearConnectionStatistics", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_RasClearConnectionStatistics_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_RasClearLinkStatistics", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_RasClearLinkStatistics_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_RasConnectionNotificationA", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_RasConnectionNotificationA_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_RasConnectionNotificationW", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_RasConnectionNotificationW_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_RasCreatePhonebookEntryA", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_RasCreatePhonebookEntryA_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_RasCreatePhonebookEntryW", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_RasCreatePhonebookEntryW_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_RasDeleteEntryA", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_RasDeleteEntryA_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_RasDeleteEntryW", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_RasDeleteEntryW_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_RasDeleteSubEntryA", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_RasDeleteSubEntryA_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_RasDeleteSubEntryW", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_RasDeleteSubEntryW_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_RasDialA", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_RasDialA_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_RasDialDlgA", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_RasDialDlgA_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_RasDialDlgW", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_RasDialDlgW_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_RasDialW", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_RasDialW_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_RasEditPhonebookEntryA", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_RasEditPhonebookEntryA_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_RasEditPhonebookEntryW", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_RasEditPhonebookEntryW_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_RasEntryDlgA", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_RasEntryDlgA_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_RasEntryDlgW", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_RasEntryDlgW_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_RasEnumAutodialAddressesA", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_RasEnumAutodialAddressesA_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_RasEnumAutodialAddressesW", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_RasEnumAutodialAddressesW_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_RasEnumConnectionsA", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_RasEnumConnectionsA_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_RasEnumConnectionsW", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_RasEnumConnectionsW_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_RasEnumDevicesA", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_RasEnumDevicesA_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_RasEnumDevicesW", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_RasEnumDevicesW_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_RasEnumEntriesA", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_RasEnumEntriesA_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_RasEnumEntriesW", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_RasEnumEntriesW_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_RasFreeEapUserIdentityA", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_RasFreeEapUserIdentityA_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_RasFreeEapUserIdentityW", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_RasFreeEapUserIdentityW_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_RasGetAutodialAddressA", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_RasGetAutodialAddressA_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_RasGetAutodialAddressW", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_RasGetAutodialAddressW_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_RasGetAutodialEnableA", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_RasGetAutodialEnableA_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_RasGetAutodialEnableW", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_RasGetAutodialEnableW_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_RasGetAutodialParamA", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_RasGetAutodialParamA_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_RasGetAutodialParamW", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_RasGetAutodialParamW_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_RasGetConnectStatusA", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_RasGetConnectStatusA_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_RasGetConnectStatusW", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_RasGetConnectStatusW_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_RasGetConnectionStatistics", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_RasGetConnectionStatistics_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_RasGetCountryInfoA", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_RasGetCountryInfoA_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_RasGetCountryInfoW", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_RasGetCountryInfoW_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_RasGetCredentialsA", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_RasGetCredentialsA_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_RasGetCredentialsW", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_RasGetCredentialsW_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_RasGetCustomAuthDataA", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_RasGetCustomAuthDataA_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_RasGetCustomAuthDataW", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_RasGetCustomAuthDataW_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_RasGetEapUserDataA", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_RasGetEapUserDataA_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_RasGetEapUserDataW", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_RasGetEapUserDataW_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_RasGetEapUserIdentityA", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_RasGetEapUserIdentityA_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_RasGetEapUserIdentityW", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_RasGetEapUserIdentityW_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_RasGetEntryDialParamsA", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_RasGetEntryDialParamsA_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_RasGetEntryDialParamsW", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_RasGetEntryDialParamsW_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_RasGetEntryPropertiesA", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_RasGetEntryPropertiesA_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_RasGetEntryPropertiesW", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_RasGetEntryPropertiesW_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_RasGetErrorStringA", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_RasGetErrorStringA_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_RasGetErrorStringW", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_RasGetErrorStringW_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_RasGetLinkStatistics", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_RasGetLinkStatistics_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_RasGetPCscf", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_RasGetPCscf_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_RasGetProjectionInfoA", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_RasGetProjectionInfoA_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_RasGetProjectionInfoEx", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_RasGetProjectionInfoEx_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_RasGetProjectionInfoW", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_RasGetProjectionInfoW_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_RasGetSubEntryHandleA", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_RasGetSubEntryHandleA_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_RasGetSubEntryHandleW", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_RasGetSubEntryHandleW_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_RasGetSubEntryPropertiesA", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_RasGetSubEntryPropertiesA_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_RasGetSubEntryPropertiesW", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_RasGetSubEntryPropertiesW_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_RasHangUpA", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_RasHangUpA_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_RasHangUpW", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_RasHangUpW_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_RasInvokeEapUI", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_RasInvokeEapUI_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_RasPhonebookDlgA", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_RasPhonebookDlgA_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_RasPhonebookDlgW", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_RasPhonebookDlgW_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_RasRenameEntryA", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_RasRenameEntryA_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_RasRenameEntryW", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_RasRenameEntryW_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_RasSetAutodialAddressA", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_RasSetAutodialAddressA_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_RasSetAutodialAddressW", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_RasSetAutodialAddressW_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_RasSetAutodialEnableA", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_RasSetAutodialEnableA_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_RasSetAutodialEnableW", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_RasSetAutodialEnableW_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_RasSetAutodialParamA", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_RasSetAutodialParamA_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_RasSetAutodialParamW", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_RasSetAutodialParamW_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_RasSetCredentialsA", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_RasSetCredentialsA_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_RasSetCredentialsW", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_RasSetCredentialsW_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_RasSetCustomAuthDataA", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_RasSetCustomAuthDataA_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_RasSetCustomAuthDataW", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_RasSetCustomAuthDataW_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_RasSetEapUserDataA", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_RasSetEapUserDataA_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_RasSetEapUserDataW", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_RasSetEapUserDataW_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_RasSetEntryDialParamsA", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_RasSetEntryDialParamsA_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_RasSetEntryDialParamsW", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_RasSetEntryDialParamsW_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_RasSetEntryPropertiesA", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_RasSetEntryPropertiesA_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_RasSetEntryPropertiesW", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_RasSetEntryPropertiesW_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_RasSetSubEntryPropertiesA", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_RasSetSubEntryPropertiesA_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_RasSetSubEntryPropertiesW", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_RasSetSubEntryPropertiesW_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_RasUpdateConnection", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_RasUpdateConnection_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_RasValidateEntryNameA", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_RasValidateEntryNameA_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_RasValidateEntryNameW", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_RasValidateEntryNameW_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_RtmAddNextHop", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_RtmAddNextHop_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_RtmAddRouteToDest", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_RtmAddRouteToDest_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_RtmBlockMethods", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_RtmBlockMethods_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_RtmConvertNetAddressToIpv6AddressAndLength", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_RtmConvertNetAddressToIpv6AddressAndLength_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_RtmCreateDestEnum", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_RtmCreateDestEnum_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_RtmCreateNextHopEnum", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_RtmCreateNextHopEnum_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_RtmCreateRouteEnum", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_RtmCreateRouteEnum_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_RtmCreateRouteList", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_RtmCreateRouteList_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_RtmCreateRouteListEnum", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_RtmCreateRouteListEnum_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_RtmDeleteEnumHandle", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_RtmDeleteEnumHandle_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_RtmDeleteNextHop", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_RtmDeleteNextHop_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_RtmDeleteRouteList", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_RtmDeleteRouteList_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_RtmDeleteRouteToDest", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_RtmDeleteRouteToDest_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_RtmDeregisterEntity", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_RtmDeregisterEntity_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_RtmDeregisterFromChangeNotification", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_RtmDeregisterFromChangeNotification_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_RtmFindNextHop", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_RtmFindNextHop_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_RtmGetChangeStatus", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_RtmGetChangeStatus_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_RtmGetChangedDests", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_RtmGetChangedDests_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_RtmGetDestInfo", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_RtmGetDestInfo_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_RtmGetEntityInfo", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_RtmGetEntityInfo_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_RtmGetEntityMethods", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_RtmGetEntityMethods_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_RtmGetEnumDests", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_RtmGetEnumDests_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_RtmGetEnumNextHops", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_RtmGetEnumNextHops_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_RtmGetEnumRoutes", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_RtmGetEnumRoutes_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_RtmGetExactMatchDestination", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_RtmGetExactMatchDestination_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_RtmGetExactMatchRoute", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_RtmGetExactMatchRoute_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_RtmGetLessSpecificDestination", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_RtmGetLessSpecificDestination_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_RtmGetListEnumRoutes", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_RtmGetListEnumRoutes_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_RtmGetMostSpecificDestination", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_RtmGetMostSpecificDestination_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_RtmGetNextHopInfo", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_RtmGetNextHopInfo_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_RtmGetNextHopPointer", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_RtmGetNextHopPointer_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_RtmGetOpaqueInformationPointer", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_RtmGetOpaqueInformationPointer_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_RtmGetRegisteredEntities", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_RtmGetRegisteredEntities_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_RtmGetRouteInfo", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_RtmGetRouteInfo_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_RtmGetRoutePointer", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_RtmGetRoutePointer_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_RtmHoldDestination", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_RtmHoldDestination_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_RtmIgnoreChangedDests", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_RtmIgnoreChangedDests_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_RtmInsertInRouteList", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_RtmInsertInRouteList_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_RtmInvokeMethod", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_RtmInvokeMethod_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_RtmIsBestRoute", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_RtmIsBestRoute_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_RtmIsMarkedForChangeNotification", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_RtmIsMarkedForChangeNotification_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_RtmLockDestination", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_RtmLockDestination_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_RtmLockNextHop", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_RtmLockNextHop_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_RtmLockRoute", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_RtmLockRoute_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_RtmMarkDestForChangeNotification", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_RtmMarkDestForChangeNotification_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_RtmReferenceHandles", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_RtmReferenceHandles_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_RtmRegisterEntity", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_RtmRegisterEntity_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_RtmRegisterForChangeNotification", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_RtmRegisterForChangeNotification_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_RtmReleaseChangedDests", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_RtmReleaseChangedDests_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_RtmReleaseDestInfo", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_RtmReleaseDestInfo_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_RtmReleaseDests", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_RtmReleaseDests_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_RtmReleaseEntities", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_RtmReleaseEntities_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_RtmReleaseEntityInfo", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_RtmReleaseEntityInfo_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_RtmReleaseNextHopInfo", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_RtmReleaseNextHopInfo_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_RtmReleaseNextHops", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_RtmReleaseNextHops_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_RtmReleaseRouteInfo", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_RtmReleaseRouteInfo_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_RtmReleaseRoutes", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_RtmReleaseRoutes_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_rras_RtmUpdateAndUnlockRoute", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_rras_RtmUpdateAndUnlockRoute_napi));
}

static KmNapiRegistrarNode registrar_node = { &register_windows_win32_networkmanagement_rras_napi, nullptr };
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
