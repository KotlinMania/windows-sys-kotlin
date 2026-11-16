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

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasMgmAddGroupMembershipEntry_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hprotocol, dwsourceaddr, dwsourcemask, dwgroupaddr, dwgroupmask, dwifindex, dwifnexthopipaddr, dwflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hprotocol;
    (void)dwsourceaddr;
    (void)dwsourcemask;
    (void)dwgroupaddr;
    (void)dwgroupmask;
    (void)dwifindex;
    (void)dwifnexthopipaddr;
    (void)dwflags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasMgmDeRegisterMProtocol_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprotocol = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MgmDeRegisterMProtocol")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hprotocol);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hprotocol;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasMgmDeleteGroupMembershipEntry_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hprotocol, dwsourceaddr, dwsourcemask, dwgroupaddr, dwgroupmask, dwifindex, dwifnexthopipaddr, dwflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hprotocol;
    (void)dwsourceaddr;
    (void)dwsourcemask;
    (void)dwgroupaddr;
    (void)dwgroupmask;
    (void)dwifindex;
    (void)dwifnexthopipaddr;
    (void)dwflags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasMgmGetFirstMfe_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(pdwbuffersize, pbbuffer, pdwnumentries);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pdwbuffersize;
    (void)pbbuffer;
    (void)pdwnumentries;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasMgmGetFirstMfeStats_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(pdwbuffersize, pbbuffer, pdwnumentries, dwflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pdwbuffersize;
    (void)pbbuffer;
    (void)pdwnumentries;
    (void)dwflags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasMgmGetMfe_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(pimm, pdwbuffersize, pbbuffer);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pimm;
    (void)pdwbuffersize;
    (void)pbbuffer;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasMgmGetMfeStats_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(pimm, pdwbuffersize, pbbuffer, dwflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pimm;
    (void)pdwbuffersize;
    (void)pbbuffer;
    (void)dwflags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasMgmGetNextMfe_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(pimmstart, pdwbuffersize, pbbuffer, pdwnumentries);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pimmstart;
    (void)pdwbuffersize;
    (void)pbbuffer;
    (void)pdwnumentries;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasMgmGetNextMfeStats_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(pimmstart, pdwbuffersize, pbbuffer, pdwnumentries, dwflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pimmstart;
    (void)pdwbuffersize;
    (void)pbbuffer;
    (void)pdwnumentries;
    (void)dwflags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasMgmGetProtocolOnInterface_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(dwifindex, dwifnexthopaddr, pdwifprotocolid, pdwifcomponentid);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)dwifindex;
    (void)dwifnexthopaddr;
    (void)pdwifprotocolid;
    (void)pdwifcomponentid;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasMgmGroupEnumerationEnd_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* henum = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MgmGroupEnumerationEnd")));
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

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasMgmGroupEnumerationGetNext_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(henum, pdwbuffersize, pbbuffer, pdwnumentries);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)henum;
    (void)pdwbuffersize;
    (void)pbbuffer;
    (void)pdwnumentries;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasMgmGroupEnumerationStart_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hprotocol, metenumtype, phenumhandle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hprotocol;
    (void)metenumtype;
    (void)phenumhandle;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasMgmRegisterMProtocol_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(prpiinfo, dwprotocolid, dwcomponentid, phprotocol);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)prpiinfo;
    (void)dwprotocolid;
    (void)dwcomponentid;
    (void)phprotocol;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasMgmReleaseInterfaceOwnership_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hprotocol, dwifindex, dwifnexthopaddr);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hprotocol;
    (void)dwifindex;
    (void)dwifnexthopaddr;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasMgmTakeInterfaceOwnership_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hprotocol, dwifindex, dwifnexthopaddr);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hprotocol;
    (void)dwifindex;
    (void)dwifnexthopaddr;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasMprAdminBufferFree_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MprAdminBufferFree")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(pbuffer);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pbuffer;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasMprAdminConnectionClearStats_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hrasserver, hrasconnection);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hrasserver;
    (void)hrasconnection;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasMprAdminConnectionEnum_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hrasserver, dwlevel, lplpbbuffer, dwprefmaxlen, lpdwentriesread, lpdwtotalentries, lpdwresumehandle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hrasserver;
    (void)dwlevel;
    (void)lplpbbuffer;
    (void)dwprefmaxlen;
    (void)lpdwentriesread;
    (void)lpdwtotalentries;
    (void)lpdwresumehandle;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasMprAdminConnectionEnumEx_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hrasserver, pobjectheader, dwpreferedmaxlen, lpdwentriesread, lpdwtotalentries, pprasconn, lpdwresumehandle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hrasserver;
    (void)pobjectheader;
    (void)dwpreferedmaxlen;
    (void)lpdwentriesread;
    (void)lpdwtotalentries;
    (void)pprasconn;
    (void)lpdwresumehandle;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasMprAdminConnectionGetInfo_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hrasserver, dwlevel, hrasconnection, lplpbbuffer);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hrasserver;
    (void)dwlevel;
    (void)hrasconnection;
    (void)lplpbbuffer;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasMprAdminConnectionGetInfoEx_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hrasserver, hrasconnection, prasconnection);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hrasserver;
    (void)hrasconnection;
    (void)prasconnection;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasMprAdminConnectionRemoveQuarantine_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hrasserver, hrasconnection, fisipaddress);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hrasserver;
    (void)hrasconnection;
    (void)fisipaddress;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasMprAdminDeregisterConnectionNotification_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hmprserver, heventnotification);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmprserver;
    (void)heventnotification;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasMprAdminDeviceEnum_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hmprserver, dwlevel, lplpbbuffer, lpdwtotalentries);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmprserver;
    (void)dwlevel;
    (void)lplpbbuffer;
    (void)lpdwtotalentries;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasMprAdminEstablishDomainRasServer_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(pszdomain, pszmachine, benable);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pszdomain;
    (void)pszmachine;
    (void)benable;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasMprAdminGetErrorString_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(dwerror, lplpwserrorstring);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)dwerror;
    (void)lplpwserrorstring;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasMprAdminGetPDCServer_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(lpszdomain, lpszserver, lpszpdcserver);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)lpszdomain;
    (void)lpszserver;
    (void)lpszpdcserver;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceConnect_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hmprserver, hinterface, hevent, fsynchronous);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmprserver;
    (void)hinterface;
    (void)hevent;
    (void)fsynchronous;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceCreate_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hmprserver, dwlevel, lpbbuffer, phinterface);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmprserver;
    (void)dwlevel;
    (void)lpbbuffer;
    (void)phinterface;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceDelete_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hmprserver, hinterface);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmprserver;
    (void)hinterface;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceDeviceGetInfo_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hmprserver, hinterface, dwindex, dwlevel, lplpbuffer);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmprserver;
    (void)hinterface;
    (void)dwindex;
    (void)dwlevel;
    (void)lplpbuffer;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceDeviceSetInfo_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hmprserver, hinterface, dwindex, dwlevel, lpbbuffer);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmprserver;
    (void)hinterface;
    (void)dwindex;
    (void)dwlevel;
    (void)lpbbuffer;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceDisconnect_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hmprserver, hinterface);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmprserver;
    (void)hinterface;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceEnum_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hmprserver, dwlevel, lplpbbuffer, dwprefmaxlen, lpdwentriesread, lpdwtotalentries, lpdwresumehandle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmprserver;
    (void)dwlevel;
    (void)lplpbbuffer;
    (void)dwprefmaxlen;
    (void)lpdwentriesread;
    (void)lpdwtotalentries;
    (void)lpdwresumehandle;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceGetCredentials_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(lpwsserver, lpwsinterfacename, lpwsusername, lpwspassword, lpwsdomainname);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)lpwsserver;
    (void)lpwsinterfacename;
    (void)lpwsusername;
    (void)lpwspassword;
    (void)lpwsdomainname;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceGetCredentialsEx_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hmprserver, hinterface, dwlevel, lplpbbuffer);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmprserver;
    (void)hinterface;
    (void)dwlevel;
    (void)lplpbbuffer;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceGetCustomInfoEx_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hmprserver, hinterface, pcustominfo);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmprserver;
    (void)hinterface;
    (void)pcustominfo;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceGetHandle_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hmprserver, lpwsinterfacename, phinterface, fincludeclientinterfaces);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmprserver;
    (void)lpwsinterfacename;
    (void)phinterface;
    (void)fincludeclientinterfaces;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceGetInfo_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hmprserver, hinterface, dwlevel, lplpbbuffer);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmprserver;
    (void)hinterface;
    (void)dwlevel;
    (void)lplpbbuffer;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceQueryUpdateResult_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hmprserver, hinterface, dwprotocolid, lpdwupdateresult);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmprserver;
    (void)hinterface;
    (void)dwprotocolid;
    (void)lpdwupdateresult;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceSetCredentials_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(lpwsserver, lpwsinterfacename, lpwsusername, lpwsdomainname, lpwspassword);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)lpwsserver;
    (void)lpwsinterfacename;
    (void)lpwsusername;
    (void)lpwsdomainname;
    (void)lpwspassword;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceSetCredentialsEx_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hmprserver, hinterface, dwlevel, lpbbuffer);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmprserver;
    (void)hinterface;
    (void)dwlevel;
    (void)lpbbuffer;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceSetCustomInfoEx_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hmprserver, hinterface, pcustominfo);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmprserver;
    (void)hinterface;
    (void)pcustominfo;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceSetInfo_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hmprserver, hinterface, dwlevel, lpbbuffer);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmprserver;
    (void)hinterface;
    (void)dwlevel;
    (void)lpbbuffer;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceTransportAdd_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hmprserver, hinterface, dwtransportid, pinterfaceinfo, dwinterfaceinfosize);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmprserver;
    (void)hinterface;
    (void)dwtransportid;
    (void)pinterfaceinfo;
    (void)dwinterfaceinfosize;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceTransportGetInfo_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hmprserver, hinterface, dwtransportid, ppinterfaceinfo, lpdwinterfaceinfosize);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmprserver;
    (void)hinterface;
    (void)dwtransportid;
    (void)ppinterfaceinfo;
    (void)lpdwinterfaceinfosize;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceTransportRemove_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hmprserver, hinterface, dwtransportid);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmprserver;
    (void)hinterface;
    (void)dwtransportid;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceTransportSetInfo_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hmprserver, hinterface, dwtransportid, pinterfaceinfo, dwinterfaceinfosize);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmprserver;
    (void)hinterface;
    (void)dwtransportid;
    (void)pinterfaceinfo;
    (void)dwinterfaceinfosize;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceUpdatePhonebookInfo_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hmprserver, hinterface);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmprserver;
    (void)hinterface;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceUpdateRoutes_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hmprserver, hinterface, dwprotocolid, hevent);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmprserver;
    (void)hinterface;
    (void)dwprotocolid;
    (void)hevent;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasMprAdminIsDomainRasServer_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(pszdomain, pszmachine, pbisrasserver);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pszdomain;
    (void)pszmachine;
    (void)pbisrasserver;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasMprAdminIsServiceInitialized_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(lpwsservername, fisserviceinitialized);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)lpwsservername;
    (void)fisserviceinitialized;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasMprAdminIsServiceRunning_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpwsservername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MprAdminIsServiceRunning")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(lpwsservername);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpwsservername;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasMprAdminMIBBufferFree_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MprAdminMIBBufferFree")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(pbuffer);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pbuffer;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasMprAdminMIBEntryCreate_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hmibserver, dwpid, dwroutingpid, lpentry, dwentrysize);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmibserver;
    (void)dwpid;
    (void)dwroutingpid;
    (void)lpentry;
    (void)dwentrysize;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasMprAdminMIBEntryDelete_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hmibserver, dwprotocolid, dwroutingpid, lpentry, dwentrysize);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmibserver;
    (void)dwprotocolid;
    (void)dwroutingpid;
    (void)lpentry;
    (void)dwentrysize;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasMprAdminMIBEntryGet_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hmibserver, dwprotocolid, dwroutingpid, lpinentry, dwinentrysize, lplpoutentry, lpoutentrysize);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmibserver;
    (void)dwprotocolid;
    (void)dwroutingpid;
    (void)lpinentry;
    (void)dwinentrysize;
    (void)lplpoutentry;
    (void)lpoutentrysize;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasMprAdminMIBEntryGetFirst_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hmibserver, dwprotocolid, dwroutingpid, lpinentry, dwinentrysize, lplpoutentry, lpoutentrysize);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmibserver;
    (void)dwprotocolid;
    (void)dwroutingpid;
    (void)lpinentry;
    (void)dwinentrysize;
    (void)lplpoutentry;
    (void)lpoutentrysize;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasMprAdminMIBEntryGetNext_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hmibserver, dwprotocolid, dwroutingpid, lpinentry, dwinentrysize, lplpoutentry, lpoutentrysize);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmibserver;
    (void)dwprotocolid;
    (void)dwroutingpid;
    (void)lpinentry;
    (void)dwinentrysize;
    (void)lplpoutentry;
    (void)lpoutentrysize;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasMprAdminMIBEntrySet_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hmibserver, dwprotocolid, dwroutingpid, lpentry, dwentrysize);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmibserver;
    (void)dwprotocolid;
    (void)dwroutingpid;
    (void)lpentry;
    (void)dwentrysize;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasMprAdminMIBServerConnect_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(lpwsservername, phmibserver);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)lpwsservername;
    (void)phmibserver;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasMprAdminMIBServerDisconnect_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hmibserver = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MprAdminMIBServerDisconnect")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(hmibserver);
    } else {
        errno = ENOSYS;
    }
#else
    (void)hmibserver;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasMprAdminPortClearStats_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hrasserver, hport);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hrasserver;
    (void)hport;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasMprAdminPortDisconnect_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hrasserver, hport);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hrasserver;
    (void)hport;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasMprAdminPortEnum_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hrasserver, dwlevel, hrasconnection, lplpbbuffer, dwprefmaxlen, lpdwentriesread, lpdwtotalentries, lpdwresumehandle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hrasserver;
    (void)dwlevel;
    (void)hrasconnection;
    (void)lplpbbuffer;
    (void)dwprefmaxlen;
    (void)lpdwentriesread;
    (void)lpdwtotalentries;
    (void)lpdwresumehandle;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasMprAdminPortGetInfo_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hrasserver, dwlevel, hport, lplpbbuffer);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hrasserver;
    (void)dwlevel;
    (void)hport;
    (void)lplpbbuffer;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasMprAdminPortReset_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hrasserver, hport);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hrasserver;
    (void)hport;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasMprAdminRegisterConnectionNotification_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hmprserver, heventnotification);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmprserver;
    (void)heventnotification;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasMprAdminSendUserMessage_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hmprserver, hconnection, lpwszmessage);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmprserver;
    (void)hconnection;
    (void)lpwszmessage;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasMprAdminServerConnect_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(lpwsservername, phmprserver);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)lpwsservername;
    (void)phmprserver;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasMprAdminServerDisconnect_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hmprserver = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MprAdminServerDisconnect")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(hmprserver);
    } else {
        errno = ENOSYS;
    }
#else
    (void)hmprserver;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasMprAdminServerGetCredentials_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hmprserver, dwlevel, lplpbbuffer);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmprserver;
    (void)dwlevel;
    (void)lplpbbuffer;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasMprAdminServerGetInfo_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hmprserver, dwlevel, lplpbbuffer);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmprserver;
    (void)dwlevel;
    (void)lplpbbuffer;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasMprAdminServerGetInfoEx_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hmprserver, pserverinfo);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmprserver;
    (void)pserverinfo;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasMprAdminServerSetCredentials_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hmprserver, dwlevel, lpbbuffer);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmprserver;
    (void)dwlevel;
    (void)lpbbuffer;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasMprAdminServerSetInfo_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hmprserver, dwlevel, lpbbuffer);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmprserver;
    (void)dwlevel;
    (void)lpbbuffer;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasMprAdminServerSetInfoEx_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hmprserver, pserverinfo);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmprserver;
    (void)pserverinfo;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasMprAdminTransportCreate_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hmprserver, dwtransportid, lpwstransportname, pglobalinfo, dwglobalinfosize, pclientinterfaceinfo, dwclientinterfaceinfosize, lpwsdllpath);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmprserver;
    (void)dwtransportid;
    (void)lpwstransportname;
    (void)pglobalinfo;
    (void)dwglobalinfosize;
    (void)pclientinterfaceinfo;
    (void)dwclientinterfaceinfosize;
    (void)lpwsdllpath;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasMprAdminTransportGetInfo_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hmprserver, dwtransportid, ppglobalinfo, lpdwglobalinfosize, ppclientinterfaceinfo, lpdwclientinterfaceinfosize);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmprserver;
    (void)dwtransportid;
    (void)ppglobalinfo;
    (void)lpdwglobalinfosize;
    (void)ppclientinterfaceinfo;
    (void)lpdwclientinterfaceinfosize;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasMprAdminTransportSetInfo_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hmprserver, dwtransportid, pglobalinfo, dwglobalinfosize, pclientinterfaceinfo, dwclientinterfaceinfosize);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmprserver;
    (void)dwtransportid;
    (void)pglobalinfo;
    (void)dwglobalinfosize;
    (void)pclientinterfaceinfo;
    (void)dwclientinterfaceinfosize;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasMprAdminUpdateConnection_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hrasserver, hrasconnection, prasupdateconnection);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hrasserver;
    (void)hrasconnection;
    (void)prasupdateconnection;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasMprAdminUserGetInfo_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(lpszserver, lpszuser, dwlevel, lpbbuffer);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)lpszserver;
    (void)lpszuser;
    (void)dwlevel;
    (void)lpbbuffer;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasMprAdminUserSetInfo_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(lpszserver, lpszuser, dwlevel, lpbbuffer);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)lpszserver;
    (void)lpszuser;
    (void)dwlevel;
    (void)lpbbuffer;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasMprConfigBufferFree_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MprConfigBufferFree")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(pbuffer);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pbuffer;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasMprConfigFilterGetInfo_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hmprconfig, dwlevel, dwtransportid, lpbuffer);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmprconfig;
    (void)dwlevel;
    (void)dwtransportid;
    (void)lpbuffer;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasMprConfigFilterSetInfo_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hmprconfig, dwlevel, dwtransportid, lpbuffer);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmprconfig;
    (void)dwlevel;
    (void)dwtransportid;
    (void)lpbuffer;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasMprConfigGetFriendlyName_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hmprconfig, pszguidname, pszbuffer, dwbuffersize);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmprconfig;
    (void)pszguidname;
    (void)pszbuffer;
    (void)dwbuffersize;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasMprConfigGetGuidName_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hmprconfig, pszfriendlyname, pszbuffer, dwbuffersize);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmprconfig;
    (void)pszfriendlyname;
    (void)pszbuffer;
    (void)dwbuffersize;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasMprConfigInterfaceCreate_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hmprconfig, dwlevel, lpbbuffer, phrouterinterface);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmprconfig;
    (void)dwlevel;
    (void)lpbbuffer;
    (void)phrouterinterface;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasMprConfigInterfaceDelete_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hmprconfig, hrouterinterface);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmprconfig;
    (void)hrouterinterface;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasMprConfigInterfaceEnum_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hmprconfig, dwlevel, lplpbuffer, dwprefmaxlen, lpdwentriesread, lpdwtotalentries, lpdwresumehandle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmprconfig;
    (void)dwlevel;
    (void)lplpbuffer;
    (void)dwprefmaxlen;
    (void)lpdwentriesread;
    (void)lpdwtotalentries;
    (void)lpdwresumehandle;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasMprConfigInterfaceGetCustomInfoEx_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hmprconfig, hrouterinterface, pcustominfo);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmprconfig;
    (void)hrouterinterface;
    (void)pcustominfo;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasMprConfigInterfaceGetHandle_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hmprconfig, lpwsinterfacename, phrouterinterface);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmprconfig;
    (void)lpwsinterfacename;
    (void)phrouterinterface;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasMprConfigInterfaceGetInfo_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hmprconfig, hrouterinterface, dwlevel, lplpbuffer, lpdwbuffersize);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmprconfig;
    (void)hrouterinterface;
    (void)dwlevel;
    (void)lplpbuffer;
    (void)lpdwbuffersize;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasMprConfigInterfaceSetCustomInfoEx_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hmprconfig, hrouterinterface, pcustominfo);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmprconfig;
    (void)hrouterinterface;
    (void)pcustominfo;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasMprConfigInterfaceSetInfo_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hmprconfig, hrouterinterface, dwlevel, lpbbuffer);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmprconfig;
    (void)hrouterinterface;
    (void)dwlevel;
    (void)lpbbuffer;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasMprConfigInterfaceTransportAdd_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hmprconfig, hrouterinterface, dwtransportid, lpwstransportname, pinterfaceinfo, dwinterfaceinfosize, phrouteriftransport);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmprconfig;
    (void)hrouterinterface;
    (void)dwtransportid;
    (void)lpwstransportname;
    (void)pinterfaceinfo;
    (void)dwinterfaceinfosize;
    (void)phrouteriftransport;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasMprConfigInterfaceTransportEnum_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hmprconfig, hrouterinterface, dwlevel, lplpbuffer, dwprefmaxlen, lpdwentriesread, lpdwtotalentries, lpdwresumehandle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmprconfig;
    (void)hrouterinterface;
    (void)dwlevel;
    (void)lplpbuffer;
    (void)dwprefmaxlen;
    (void)lpdwentriesread;
    (void)lpdwtotalentries;
    (void)lpdwresumehandle;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasMprConfigInterfaceTransportGetHandle_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hmprconfig, hrouterinterface, dwtransportid, phrouteriftransport);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmprconfig;
    (void)hrouterinterface;
    (void)dwtransportid;
    (void)phrouteriftransport;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasMprConfigInterfaceTransportGetInfo_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hmprconfig, hrouterinterface, hrouteriftransport, ppinterfaceinfo, lpdwinterfaceinfosize);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmprconfig;
    (void)hrouterinterface;
    (void)hrouteriftransport;
    (void)ppinterfaceinfo;
    (void)lpdwinterfaceinfosize;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasMprConfigInterfaceTransportRemove_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hmprconfig, hrouterinterface, hrouteriftransport);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmprconfig;
    (void)hrouterinterface;
    (void)hrouteriftransport;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasMprConfigInterfaceTransportSetInfo_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hmprconfig, hrouterinterface, hrouteriftransport, pinterfaceinfo, dwinterfaceinfosize);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmprconfig;
    (void)hrouterinterface;
    (void)hrouteriftransport;
    (void)pinterfaceinfo;
    (void)dwinterfaceinfosize;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasMprConfigServerBackup_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hmprconfig, lpwspath);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmprconfig;
    (void)lpwspath;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasMprConfigServerConnect_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(lpwsservername, phmprconfig);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)lpwsservername;
    (void)phmprconfig;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasMprConfigServerDisconnect_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hmprconfig = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MprConfigServerDisconnect")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(hmprconfig);
    } else {
        errno = ENOSYS;
    }
#else
    (void)hmprconfig;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasMprConfigServerGetInfo_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hmprconfig, dwlevel, lplpbbuffer);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmprconfig;
    (void)dwlevel;
    (void)lplpbbuffer;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasMprConfigServerGetInfoEx_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hmprconfig, pserverinfo);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmprconfig;
    (void)pserverinfo;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasMprConfigServerInstall_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(dwlevel, pbuffer);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)dwlevel;
    (void)pbuffer;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasMprConfigServerRefresh_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hmprconfig = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MprConfigServerRefresh")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hmprconfig);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmprconfig;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasMprConfigServerRestore_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hmprconfig, lpwspath);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmprconfig;
    (void)lpwspath;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasMprConfigServerSetInfo_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hmprserver, dwlevel, lpbbuffer);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmprserver;
    (void)dwlevel;
    (void)lpbbuffer;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasMprConfigServerSetInfoEx_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hmprconfig, psetserverconfig);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmprconfig;
    (void)psetserverconfig;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasMprConfigTransportCreate_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hmprconfig, dwtransportid, lpwstransportname, pglobalinfo, dwglobalinfosize, pclientinterfaceinfo, dwclientinterfaceinfosize, lpwsdllpath, phroutertransport);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
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
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasMprConfigTransportDelete_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hmprconfig, hroutertransport);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmprconfig;
    (void)hroutertransport;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasMprConfigTransportEnum_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hmprconfig, dwlevel, lplpbuffer, dwprefmaxlen, lpdwentriesread, lpdwtotalentries, lpdwresumehandle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmprconfig;
    (void)dwlevel;
    (void)lplpbuffer;
    (void)dwprefmaxlen;
    (void)lpdwentriesread;
    (void)lpdwtotalentries;
    (void)lpdwresumehandle;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasMprConfigTransportGetHandle_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hmprconfig, dwtransportid, phroutertransport);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmprconfig;
    (void)dwtransportid;
    (void)phroutertransport;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasMprConfigTransportGetInfo_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hmprconfig, hroutertransport, ppglobalinfo, lpdwglobalinfosize, ppclientinterfaceinfo, lpdwclientinterfaceinfosize, lplpwsdllpath);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmprconfig;
    (void)hroutertransport;
    (void)ppglobalinfo;
    (void)lpdwglobalinfosize;
    (void)ppclientinterfaceinfo;
    (void)lpdwclientinterfaceinfosize;
    (void)lplpwsdllpath;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasMprConfigTransportSetInfo_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hmprconfig, hroutertransport, pglobalinfo, dwglobalinfosize, pclientinterfaceinfo, dwclientinterfaceinfosize, lpwsdllpath);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmprconfig;
    (void)hroutertransport;
    (void)pglobalinfo;
    (void)dwglobalinfosize;
    (void)pclientinterfaceinfo;
    (void)dwclientinterfaceinfosize;
    (void)lpwsdllpath;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasMprInfoBlockAdd_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(lpheader, dwinfotype, dwitemsize, dwitemcount, lpitemdata, lplpnewheader);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)lpheader;
    (void)dwinfotype;
    (void)dwitemsize;
    (void)dwitemcount;
    (void)lpitemdata;
    (void)lplpnewheader;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasMprInfoBlockFind_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(lpheader, dwinfotype, lpdwitemsize, lpdwitemcount, lplpitemdata);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)lpheader;
    (void)dwinfotype;
    (void)lpdwitemsize;
    (void)lpdwitemcount;
    (void)lplpitemdata;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasMprInfoBlockQuerySize_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpheader = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MprInfoBlockQuerySize")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(lpheader);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)lpheader;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasMprInfoBlockRemove_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(lpheader, dwinfotype, lplpnewheader);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)lpheader;
    (void)dwinfotype;
    (void)lplpnewheader;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasMprInfoBlockSet_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(lpheader, dwinfotype, dwitemsize, dwitemcount, lpitemdata, lplpnewheader);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)lpheader;
    (void)dwinfotype;
    (void)dwitemsize;
    (void)dwitemcount;
    (void)lpitemdata;
    (void)lplpnewheader;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasMprInfoCreate_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(dwversion, lplpnewheader);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)dwversion;
    (void)lplpnewheader;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasMprInfoDelete_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpheader = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MprInfoDelete")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(lpheader);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)lpheader;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasMprInfoDuplicate_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(lpheader, lplpnewheader);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)lpheader;
    (void)lplpnewheader;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasMprInfoRemoveAll_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(lpheader, lplpnewheader);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)lpheader;
    (void)lplpnewheader;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasRasClearConnectionStatistics_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hrasconn = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RasClearConnectionStatistics")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hrasconn);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hrasconn;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasRasClearLinkStatistics_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hrasconn, dwsubentry);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hrasconn;
    (void)dwsubentry;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasRasConnectionNotificationA_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(param0, param1, param2);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasRasConnectionNotificationW_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(param0, param1, param2);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasRasCreatePhonebookEntryA_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(param0, param1);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)param0;
    (void)param1;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasRasCreatePhonebookEntryW_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(param0, param1);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)param0;
    (void)param1;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasRasDeleteEntryA_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(param0, param1);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)param0;
    (void)param1;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasRasDeleteEntryW_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(param0, param1);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)param0;
    (void)param1;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasRasDeleteSubEntryA_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(pszphonebook, pszentry, dwsubentryid);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pszphonebook;
    (void)pszentry;
    (void)dwsubentryid;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasRasDeleteSubEntryW_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(pszphonebook, pszentry, dwsubentryid);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pszphonebook;
    (void)pszentry;
    (void)dwsubentryid;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasRasDialA_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(param0, param1, param2, param3, param4, param5);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    (void)param4;
    (void)param5;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasRasDialDlgA_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(lpszphonebook, lpszentry, lpszphonenumber, lpinfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpszphonebook;
    (void)lpszentry;
    (void)lpszphonenumber;
    (void)lpinfo;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasRasDialDlgW_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(lpszphonebook, lpszentry, lpszphonenumber, lpinfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpszphonebook;
    (void)lpszentry;
    (void)lpszphonenumber;
    (void)lpinfo;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasRasDialW_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(param0, param1, param2, param3, param4, param5);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    (void)param4;
    (void)param5;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasRasEditPhonebookEntryA_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(param0, param1, param2);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasRasEditPhonebookEntryW_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(param0, param1, param2);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasRasEntryDlgA_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(lpszphonebook, lpszentry, lpinfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpszphonebook;
    (void)lpszentry;
    (void)lpinfo;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasRasEntryDlgW_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(lpszphonebook, lpszentry, lpinfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpszphonebook;
    (void)lpszentry;
    (void)lpinfo;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasRasEnumAutodialAddressesA_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(lpprasautodialaddresses, lpdwcbrasautodialaddresses, lpdwcrasautodialaddresses);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)lpprasautodialaddresses;
    (void)lpdwcbrasautodialaddresses;
    (void)lpdwcrasautodialaddresses;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasRasEnumAutodialAddressesW_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(lpprasautodialaddresses, lpdwcbrasautodialaddresses, lpdwcrasautodialaddresses);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)lpprasautodialaddresses;
    (void)lpdwcbrasautodialaddresses;
    (void)lpdwcrasautodialaddresses;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasRasEnumConnectionsA_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(param0, param1, param2);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasRasEnumConnectionsW_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(param0, param1, param2);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasRasEnumDevicesA_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(param0, param1, param2);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasRasEnumDevicesW_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(param0, param1, param2);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasRasEnumEntriesA_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(param0, param1, param2, param3, param4);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    (void)param4;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasRasEnumEntriesW_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(param0, param1, param2, param3, param4);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    (void)param4;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasRasFreeEapUserIdentityA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* praseapuseridentity = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RasFreeEapUserIdentityA")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(praseapuseridentity);
    } else {
        errno = ENOSYS;
    }
#else
    (void)praseapuseridentity;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasRasFreeEapUserIdentityW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* praseapuseridentity = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RasFreeEapUserIdentityW")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(praseapuseridentity);
    } else {
        errno = ENOSYS;
    }
#else
    (void)praseapuseridentity;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasRasGetAutodialAddressA_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(param0, param1, param2, param3, param4);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    (void)param4;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasRasGetAutodialAddressW_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(param0, param1, param2, param3, param4);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    (void)param4;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasRasGetAutodialEnableA_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(param0, param1);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)param0;
    (void)param1;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasRasGetAutodialEnableW_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(param0, param1);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)param0;
    (void)param1;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasRasGetAutodialParamA_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(param0, param1, param2);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasRasGetAutodialParamW_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(param0, param1, param2);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasRasGetConnectStatusA_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(param0, param1);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)param0;
    (void)param1;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasRasGetConnectStatusW_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(param0, param1);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)param0;
    (void)param1;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasRasGetConnectionStatistics_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hrasconn, lpstatistics);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hrasconn;
    (void)lpstatistics;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasRasGetCountryInfoA_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(param0, param1);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)param0;
    (void)param1;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasRasGetCountryInfoW_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(param0, param1);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)param0;
    (void)param1;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasRasGetCredentialsA_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(param0, param1, param2);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasRasGetCredentialsW_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(param0, param1, param2);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasRasGetCustomAuthDataA_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(pszphonebook, pszentry, pbcustomauthdata, pdwsizeofcustomauthdata);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pszphonebook;
    (void)pszentry;
    (void)pbcustomauthdata;
    (void)pdwsizeofcustomauthdata;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasRasGetCustomAuthDataW_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(pszphonebook, pszentry, pbcustomauthdata, pdwsizeofcustomauthdata);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pszphonebook;
    (void)pszentry;
    (void)pbcustomauthdata;
    (void)pdwsizeofcustomauthdata;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasRasGetEapUserDataA_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(htoken, pszphonebook, pszentry, pbeapdata, pdwsizeofeapdata);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)htoken;
    (void)pszphonebook;
    (void)pszentry;
    (void)pbeapdata;
    (void)pdwsizeofeapdata;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasRasGetEapUserDataW_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(htoken, pszphonebook, pszentry, pbeapdata, pdwsizeofeapdata);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)htoken;
    (void)pszphonebook;
    (void)pszentry;
    (void)pbeapdata;
    (void)pdwsizeofeapdata;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasRasGetEapUserIdentityA_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(pszphonebook, pszentry, dwflags, hwnd, ppraseapuseridentity);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pszphonebook;
    (void)pszentry;
    (void)dwflags;
    (void)hwnd;
    (void)ppraseapuseridentity;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasRasGetEapUserIdentityW_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(pszphonebook, pszentry, dwflags, hwnd, ppraseapuseridentity);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pszphonebook;
    (void)pszentry;
    (void)dwflags;
    (void)hwnd;
    (void)ppraseapuseridentity;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasRasGetEntryDialParamsA_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(param0, param1, param2);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasRasGetEntryDialParamsW_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(param0, param1, param2);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasRasGetEntryPropertiesA_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(param0, param1, param2, param3, param4, param5);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    (void)param4;
    (void)param5;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasRasGetEntryPropertiesW_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(param0, param1, param2, param3, param4, param5);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    (void)param4;
    (void)param5;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasRasGetErrorStringA_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(resourceid, lpszstring, inbufsize);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)resourceid;
    (void)lpszstring;
    (void)inbufsize;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasRasGetErrorStringW_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(resourceid, lpszstring, inbufsize);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)resourceid;
    (void)lpszstring;
    (void)inbufsize;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasRasGetLinkStatistics_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hrasconn, dwsubentry, lpstatistics);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hrasconn;
    (void)dwsubentry;
    (void)lpstatistics;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasRasGetPCscf_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpszpcscf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RasGetPCscf")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(lpszpcscf);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)lpszpcscf;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasRasGetProjectionInfoA_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(param0, param1, param2, param3);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasRasGetProjectionInfoEx_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hrasconn, prasprojection, lpdwsize);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hrasconn;
    (void)prasprojection;
    (void)lpdwsize;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasRasGetProjectionInfoW_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(param0, param1, param2, param3);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasRasGetSubEntryHandleA_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(param0, param1, param2);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasRasGetSubEntryHandleW_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(param0, param1, param2);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasRasGetSubEntryPropertiesA_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(param0, param1, param2, param3, param4, param5, param6);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    (void)param4;
    (void)param5;
    (void)param6;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasRasGetSubEntryPropertiesW_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(param0, param1, param2, param3, param4, param5, param6);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    (void)param4;
    (void)param5;
    (void)param6;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasRasHangUpA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* param0 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RasHangUpA")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(param0);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)param0;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasRasHangUpW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* param0 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RasHangUpW")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(param0);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)param0;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasRasInvokeEapUI_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(param0, param1, param2, param3);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasRasPhonebookDlgA_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(lpszphonebook, lpszentry, lpinfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpszphonebook;
    (void)lpszentry;
    (void)lpinfo;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasRasPhonebookDlgW_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(lpszphonebook, lpszentry, lpinfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpszphonebook;
    (void)lpszentry;
    (void)lpinfo;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasRasRenameEntryA_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(param0, param1, param2);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasRasRenameEntryW_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(param0, param1, param2);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasRasSetAutodialAddressA_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(param0, param1, param2, param3, param4);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    (void)param4;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasRasSetAutodialAddressW_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(param0, param1, param2, param3, param4);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    (void)param4;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasRasSetAutodialEnableA_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(param0, param1);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)param0;
    (void)param1;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasRasSetAutodialEnableW_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(param0, param1);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)param0;
    (void)param1;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasRasSetAutodialParamA_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(param0, param1, param2);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasRasSetAutodialParamW_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(param0, param1, param2);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasRasSetCredentialsA_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(param0, param1, param2, param3);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasRasSetCredentialsW_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(param0, param1, param2, param3);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasRasSetCustomAuthDataA_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(pszphonebook, pszentry, pbcustomauthdata, dwsizeofcustomauthdata);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pszphonebook;
    (void)pszentry;
    (void)pbcustomauthdata;
    (void)dwsizeofcustomauthdata;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasRasSetCustomAuthDataW_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(pszphonebook, pszentry, pbcustomauthdata, dwsizeofcustomauthdata);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pszphonebook;
    (void)pszentry;
    (void)pbcustomauthdata;
    (void)dwsizeofcustomauthdata;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasRasSetEapUserDataA_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(htoken, pszphonebook, pszentry, pbeapdata, dwsizeofeapdata);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)htoken;
    (void)pszphonebook;
    (void)pszentry;
    (void)pbeapdata;
    (void)dwsizeofeapdata;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasRasSetEapUserDataW_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(htoken, pszphonebook, pszentry, pbeapdata, dwsizeofeapdata);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)htoken;
    (void)pszphonebook;
    (void)pszentry;
    (void)pbeapdata;
    (void)dwsizeofeapdata;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasRasSetEntryDialParamsA_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(param0, param1, param2);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasRasSetEntryDialParamsW_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(param0, param1, param2);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasRasSetEntryPropertiesA_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(param0, param1, param2, param3, param4, param5);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    (void)param4;
    (void)param5;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasRasSetEntryPropertiesW_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(param0, param1, param2, param3, param4, param5);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    (void)param4;
    (void)param5;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasRasSetSubEntryPropertiesA_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(param0, param1, param2, param3, param4, param5, param6);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    (void)param4;
    (void)param5;
    (void)param6;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasRasSetSubEntryPropertiesW_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(param0, param1, param2, param3, param4, param5, param6);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    (void)param4;
    (void)param5;
    (void)param6;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasRasUpdateConnection_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hrasconn, lprasupdateconn);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hrasconn;
    (void)lprasupdateconn;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasRasValidateEntryNameA_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(param0, param1);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)param0;
    (void)param1;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasRasValidateEntryNameW_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(param0, param1);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)param0;
    (void)param1;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasRtmAddNextHop_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(rtmreghandle, nexthopinfo, nexthophandle, changeflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rtmreghandle;
    (void)nexthopinfo;
    (void)nexthophandle;
    (void)changeflags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasRtmAddRouteToDest_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(rtmreghandle, routehandle, destaddress, routeinfo, timetolive, routelisthandle, notifytype, notifyhandle, changeflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
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
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasRtmBlockMethods_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(rtmreghandle, targethandle, targettype, blockingflag);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rtmreghandle;
    (void)targethandle;
    (void)targettype;
    (void)blockingflag;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasRtmConvertNetAddressToIpv6AddressAndLength_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(pnetaddress, paddress, plength, dwaddresssize);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pnetaddress;
    (void)paddress;
    (void)plength;
    (void)dwaddresssize;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasRtmCreateDestEnum_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(rtmreghandle, targetviews, enumflags, netaddress, protocolid, rtmenumhandle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rtmreghandle;
    (void)targetviews;
    (void)enumflags;
    (void)netaddress;
    (void)protocolid;
    (void)rtmenumhandle;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasRtmCreateNextHopEnum_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(rtmreghandle, enumflags, netaddress, rtmenumhandle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rtmreghandle;
    (void)enumflags;
    (void)netaddress;
    (void)rtmenumhandle;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasRtmCreateRouteEnum_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(rtmreghandle, desthandle, targetviews, enumflags, startdest, matchingflags, criteriaroute, criteriainterface, rtmenumhandle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
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
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasRtmCreateRouteList_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(rtmreghandle, routelisthandle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rtmreghandle;
    (void)routelisthandle;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasRtmCreateRouteListEnum_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(rtmreghandle, routelisthandle, rtmenumhandle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rtmreghandle;
    (void)routelisthandle;
    (void)rtmenumhandle;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasRtmDeleteEnumHandle_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(rtmreghandle, enumhandle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rtmreghandle;
    (void)enumhandle;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasRtmDeleteNextHop_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(rtmreghandle, nexthophandle, nexthopinfo);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rtmreghandle;
    (void)nexthophandle;
    (void)nexthopinfo;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasRtmDeleteRouteList_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(rtmreghandle, routelisthandle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rtmreghandle;
    (void)routelisthandle;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasRtmDeleteRouteToDest_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(rtmreghandle, routehandle, changeflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rtmreghandle;
    (void)routehandle;
    (void)changeflags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasRtmDeregisterEntity_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t rtmreghandle = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtmDeregisterEntity")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(rtmreghandle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rtmreghandle;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasRtmDeregisterFromChangeNotification_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(rtmreghandle, notifyhandle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rtmreghandle;
    (void)notifyhandle;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasRtmFindNextHop_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(rtmreghandle, nexthopinfo, nexthophandle, nexthoppointer);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rtmreghandle;
    (void)nexthopinfo;
    (void)nexthophandle;
    (void)nexthoppointer;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasRtmGetChangeStatus_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(rtmreghandle, notifyhandle, desthandle, changestatus);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rtmreghandle;
    (void)notifyhandle;
    (void)desthandle;
    (void)changestatus;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasRtmGetChangedDests_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(rtmreghandle, notifyhandle, numdests, changeddests);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rtmreghandle;
    (void)notifyhandle;
    (void)numdests;
    (void)changeddests;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasRtmGetDestInfo_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(rtmreghandle, desthandle, protocolid, targetviews, destinfo);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rtmreghandle;
    (void)desthandle;
    (void)protocolid;
    (void)targetviews;
    (void)destinfo;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasRtmGetEntityInfo_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(rtmreghandle, entityhandle, entityinfo);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rtmreghandle;
    (void)entityhandle;
    (void)entityinfo;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasRtmGetEntityMethods_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(rtmreghandle, entityhandle, nummethods, exptmethods);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rtmreghandle;
    (void)entityhandle;
    (void)nummethods;
    (void)exptmethods;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasRtmGetEnumDests_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(rtmreghandle, enumhandle, numdests, destinfos);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rtmreghandle;
    (void)enumhandle;
    (void)numdests;
    (void)destinfos;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasRtmGetEnumNextHops_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(rtmreghandle, enumhandle, numnexthops, nexthophandles);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rtmreghandle;
    (void)enumhandle;
    (void)numnexthops;
    (void)nexthophandles;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasRtmGetEnumRoutes_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(rtmreghandle, enumhandle, numroutes, routehandles);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rtmreghandle;
    (void)enumhandle;
    (void)numroutes;
    (void)routehandles;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasRtmGetExactMatchDestination_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(rtmreghandle, destaddress, protocolid, targetviews, destinfo);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rtmreghandle;
    (void)destaddress;
    (void)protocolid;
    (void)targetviews;
    (void)destinfo;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasRtmGetExactMatchRoute_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(rtmreghandle, destaddress, matchingflags, routeinfo, interfaceindex, targetviews, routehandle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rtmreghandle;
    (void)destaddress;
    (void)matchingflags;
    (void)routeinfo;
    (void)interfaceindex;
    (void)targetviews;
    (void)routehandle;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasRtmGetLessSpecificDestination_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(rtmreghandle, desthandle, protocolid, targetviews, destinfo);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rtmreghandle;
    (void)desthandle;
    (void)protocolid;
    (void)targetviews;
    (void)destinfo;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasRtmGetListEnumRoutes_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(rtmreghandle, enumhandle, numroutes, routehandles);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rtmreghandle;
    (void)enumhandle;
    (void)numroutes;
    (void)routehandles;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasRtmGetMostSpecificDestination_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(rtmreghandle, destaddress, protocolid, targetviews, destinfo);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rtmreghandle;
    (void)destaddress;
    (void)protocolid;
    (void)targetviews;
    (void)destinfo;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasRtmGetNextHopInfo_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(rtmreghandle, nexthophandle, nexthopinfo);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rtmreghandle;
    (void)nexthophandle;
    (void)nexthopinfo;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasRtmGetNextHopPointer_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(rtmreghandle, nexthophandle, nexthoppointer);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rtmreghandle;
    (void)nexthophandle;
    (void)nexthoppointer;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasRtmGetOpaqueInformationPointer_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(rtmreghandle, desthandle, opaqueinfopointer);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rtmreghandle;
    (void)desthandle;
    (void)opaqueinfopointer;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasRtmGetRegisteredEntities_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(rtmreghandle, numentities, entityhandles, entityinfos);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rtmreghandle;
    (void)numentities;
    (void)entityhandles;
    (void)entityinfos;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasRtmGetRouteInfo_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(rtmreghandle, routehandle, routeinfo, destaddress);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rtmreghandle;
    (void)routehandle;
    (void)routeinfo;
    (void)destaddress;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasRtmGetRoutePointer_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(rtmreghandle, routehandle, routepointer);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rtmreghandle;
    (void)routehandle;
    (void)routepointer;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasRtmHoldDestination_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(rtmreghandle, desthandle, targetviews, holdtime);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rtmreghandle;
    (void)desthandle;
    (void)targetviews;
    (void)holdtime;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasRtmIgnoreChangedDests_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(rtmreghandle, notifyhandle, numdests, changeddests);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rtmreghandle;
    (void)notifyhandle;
    (void)numdests;
    (void)changeddests;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasRtmInsertInRouteList_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(rtmreghandle, routelisthandle, numroutes, routehandles);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rtmreghandle;
    (void)routelisthandle;
    (void)numroutes;
    (void)routehandles;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasRtmInvokeMethod_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(rtmreghandle, entityhandle, input, outputsize, output);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rtmreghandle;
    (void)entityhandle;
    (void)input;
    (void)outputsize;
    (void)output;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasRtmIsBestRoute_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(rtmreghandle, routehandle, bestinviews);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rtmreghandle;
    (void)routehandle;
    (void)bestinviews;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasRtmIsMarkedForChangeNotification_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(rtmreghandle, notifyhandle, desthandle, destmarked);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rtmreghandle;
    (void)notifyhandle;
    (void)desthandle;
    (void)destmarked;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasRtmLockDestination_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(rtmreghandle, desthandle, exclusive, lockdest);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rtmreghandle;
    (void)desthandle;
    (void)exclusive;
    (void)lockdest;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasRtmLockNextHop_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(rtmreghandle, nexthophandle, exclusive, locknexthop, nexthoppointer);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rtmreghandle;
    (void)nexthophandle;
    (void)exclusive;
    (void)locknexthop;
    (void)nexthoppointer;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasRtmLockRoute_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(rtmreghandle, routehandle, exclusive, lockroute, routepointer);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rtmreghandle;
    (void)routehandle;
    (void)exclusive;
    (void)lockroute;
    (void)routepointer;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasRtmMarkDestForChangeNotification_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(rtmreghandle, notifyhandle, desthandle, markdest);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rtmreghandle;
    (void)notifyhandle;
    (void)desthandle;
    (void)markdest;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasRtmReferenceHandles_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(rtmreghandle, numhandles, rtmhandles);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rtmreghandle;
    (void)numhandles;
    (void)rtmhandles;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasRtmRegisterEntity_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(rtmentityinfo, exportmethods, eventcallback, reserveopaquepointer, rtmregprofile, rtmreghandle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rtmentityinfo;
    (void)exportmethods;
    (void)eventcallback;
    (void)reserveopaquepointer;
    (void)rtmregprofile;
    (void)rtmreghandle;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasRtmRegisterForChangeNotification_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(rtmreghandle, targetviews, notifyflags, notifycontext, notifyhandle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rtmreghandle;
    (void)targetviews;
    (void)notifyflags;
    (void)notifycontext;
    (void)notifyhandle;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasRtmReleaseChangedDests_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(rtmreghandle, notifyhandle, numdests, changeddests);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rtmreghandle;
    (void)notifyhandle;
    (void)numdests;
    (void)changeddests;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasRtmReleaseDestInfo_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(rtmreghandle, destinfo);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rtmreghandle;
    (void)destinfo;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasRtmReleaseDests_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(rtmreghandle, numdests, destinfos);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rtmreghandle;
    (void)numdests;
    (void)destinfos;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasRtmReleaseEntities_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(rtmreghandle, numentities, entityhandles);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rtmreghandle;
    (void)numentities;
    (void)entityhandles;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasRtmReleaseEntityInfo_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(rtmreghandle, entityinfo);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rtmreghandle;
    (void)entityinfo;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasRtmReleaseNextHopInfo_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(rtmreghandle, nexthopinfo);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rtmreghandle;
    (void)nexthopinfo;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasRtmReleaseNextHops_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(rtmreghandle, numnexthops, nexthophandles);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rtmreghandle;
    (void)numnexthops;
    (void)nexthophandles;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasRtmReleaseRouteInfo_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(rtmreghandle, routeinfo);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rtmreghandle;
    (void)routeinfo;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasRtmReleaseRoutes_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(rtmreghandle, numroutes, routehandles);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rtmreghandle;
    (void)numroutes;
    (void)routehandles;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32NetworkmanagementRrasRtmUpdateAndUnlockRoute_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(rtmreghandle, routehandle, timetolive, routelisthandle, notifytype, notifyhandle, changeflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rtmreghandle;
    (void)routehandle;
    (void)timetolive;
    (void)routelisthandle;
    (void)notifytype;
    (void)notifyhandle;
    (void)changeflags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static void register_windows_win32_networkmanagement_rras_napi(Napi::Env env, Napi::Object exports) {
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasMgmAddGroupMembershipEntry", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasMgmAddGroupMembershipEntry_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasMgmDeRegisterMProtocol", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasMgmDeRegisterMProtocol_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasMgmDeleteGroupMembershipEntry", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasMgmDeleteGroupMembershipEntry_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasMgmGetFirstMfe", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasMgmGetFirstMfe_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasMgmGetFirstMfeStats", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasMgmGetFirstMfeStats_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasMgmGetMfe", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasMgmGetMfe_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasMgmGetMfeStats", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasMgmGetMfeStats_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasMgmGetNextMfe", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasMgmGetNextMfe_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasMgmGetNextMfeStats", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasMgmGetNextMfeStats_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasMgmGetProtocolOnInterface", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasMgmGetProtocolOnInterface_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasMgmGroupEnumerationEnd", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasMgmGroupEnumerationEnd_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasMgmGroupEnumerationGetNext", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasMgmGroupEnumerationGetNext_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasMgmGroupEnumerationStart", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasMgmGroupEnumerationStart_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasMgmRegisterMProtocol", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasMgmRegisterMProtocol_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasMgmReleaseInterfaceOwnership", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasMgmReleaseInterfaceOwnership_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasMgmTakeInterfaceOwnership", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasMgmTakeInterfaceOwnership_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasMprAdminBufferFree", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasMprAdminBufferFree_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasMprAdminConnectionClearStats", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasMprAdminConnectionClearStats_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasMprAdminConnectionEnum", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasMprAdminConnectionEnum_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasMprAdminConnectionEnumEx", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasMprAdminConnectionEnumEx_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasMprAdminConnectionGetInfo", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasMprAdminConnectionGetInfo_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasMprAdminConnectionGetInfoEx", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasMprAdminConnectionGetInfoEx_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasMprAdminConnectionRemoveQuarantine", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasMprAdminConnectionRemoveQuarantine_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasMprAdminDeregisterConnectionNotification", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasMprAdminDeregisterConnectionNotification_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasMprAdminDeviceEnum", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasMprAdminDeviceEnum_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasMprAdminEstablishDomainRasServer", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasMprAdminEstablishDomainRasServer_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasMprAdminGetErrorString", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasMprAdminGetErrorString_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasMprAdminGetPDCServer", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasMprAdminGetPDCServer_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceConnect", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceConnect_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceCreate", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceCreate_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceDelete", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceDelete_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceDeviceGetInfo", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceDeviceGetInfo_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceDeviceSetInfo", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceDeviceSetInfo_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceDisconnect", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceDisconnect_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceEnum", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceEnum_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceGetCredentials", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceGetCredentials_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceGetCredentialsEx", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceGetCredentialsEx_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceGetCustomInfoEx", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceGetCustomInfoEx_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceGetHandle", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceGetHandle_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceGetInfo", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceGetInfo_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceQueryUpdateResult", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceQueryUpdateResult_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceSetCredentials", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceSetCredentials_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceSetCredentialsEx", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceSetCredentialsEx_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceSetCustomInfoEx", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceSetCustomInfoEx_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceSetInfo", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceSetInfo_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceTransportAdd", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceTransportAdd_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceTransportGetInfo", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceTransportGetInfo_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceTransportRemove", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceTransportRemove_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceTransportSetInfo", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceTransportSetInfo_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceUpdatePhonebookInfo", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceUpdatePhonebookInfo_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceUpdateRoutes", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceUpdateRoutes_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasMprAdminIsDomainRasServer", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasMprAdminIsDomainRasServer_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasMprAdminIsServiceInitialized", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasMprAdminIsServiceInitialized_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasMprAdminIsServiceRunning", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasMprAdminIsServiceRunning_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasMprAdminMIBBufferFree", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasMprAdminMIBBufferFree_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasMprAdminMIBEntryCreate", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasMprAdminMIBEntryCreate_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasMprAdminMIBEntryDelete", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasMprAdminMIBEntryDelete_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasMprAdminMIBEntryGet", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasMprAdminMIBEntryGet_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasMprAdminMIBEntryGetFirst", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasMprAdminMIBEntryGetFirst_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasMprAdminMIBEntryGetNext", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasMprAdminMIBEntryGetNext_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasMprAdminMIBEntrySet", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasMprAdminMIBEntrySet_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasMprAdminMIBServerConnect", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasMprAdminMIBServerConnect_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasMprAdminMIBServerDisconnect", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasMprAdminMIBServerDisconnect_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasMprAdminPortClearStats", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasMprAdminPortClearStats_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasMprAdminPortDisconnect", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasMprAdminPortDisconnect_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasMprAdminPortEnum", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasMprAdminPortEnum_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasMprAdminPortGetInfo", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasMprAdminPortGetInfo_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasMprAdminPortReset", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasMprAdminPortReset_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasMprAdminRegisterConnectionNotification", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasMprAdminRegisterConnectionNotification_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasMprAdminSendUserMessage", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasMprAdminSendUserMessage_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasMprAdminServerConnect", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasMprAdminServerConnect_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasMprAdminServerDisconnect", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasMprAdminServerDisconnect_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasMprAdminServerGetCredentials", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasMprAdminServerGetCredentials_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasMprAdminServerGetInfo", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasMprAdminServerGetInfo_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasMprAdminServerGetInfoEx", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasMprAdminServerGetInfoEx_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasMprAdminServerSetCredentials", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasMprAdminServerSetCredentials_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasMprAdminServerSetInfo", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasMprAdminServerSetInfo_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasMprAdminServerSetInfoEx", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasMprAdminServerSetInfoEx_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasMprAdminTransportCreate", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasMprAdminTransportCreate_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasMprAdminTransportGetInfo", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasMprAdminTransportGetInfo_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasMprAdminTransportSetInfo", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasMprAdminTransportSetInfo_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasMprAdminUpdateConnection", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasMprAdminUpdateConnection_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasMprAdminUserGetInfo", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasMprAdminUserGetInfo_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasMprAdminUserSetInfo", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasMprAdminUserSetInfo_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasMprConfigBufferFree", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasMprConfigBufferFree_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasMprConfigFilterGetInfo", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasMprConfigFilterGetInfo_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasMprConfigFilterSetInfo", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasMprConfigFilterSetInfo_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasMprConfigGetFriendlyName", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasMprConfigGetFriendlyName_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasMprConfigGetGuidName", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasMprConfigGetGuidName_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasMprConfigInterfaceCreate", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasMprConfigInterfaceCreate_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasMprConfigInterfaceDelete", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasMprConfigInterfaceDelete_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasMprConfigInterfaceEnum", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasMprConfigInterfaceEnum_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasMprConfigInterfaceGetCustomInfoEx", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasMprConfigInterfaceGetCustomInfoEx_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasMprConfigInterfaceGetHandle", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasMprConfigInterfaceGetHandle_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasMprConfigInterfaceGetInfo", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasMprConfigInterfaceGetInfo_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasMprConfigInterfaceSetCustomInfoEx", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasMprConfigInterfaceSetCustomInfoEx_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasMprConfigInterfaceSetInfo", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasMprConfigInterfaceSetInfo_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasMprConfigInterfaceTransportAdd", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasMprConfigInterfaceTransportAdd_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasMprConfigInterfaceTransportEnum", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasMprConfigInterfaceTransportEnum_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasMprConfigInterfaceTransportGetHandle", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasMprConfigInterfaceTransportGetHandle_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasMprConfigInterfaceTransportGetInfo", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasMprConfigInterfaceTransportGetInfo_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasMprConfigInterfaceTransportRemove", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasMprConfigInterfaceTransportRemove_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasMprConfigInterfaceTransportSetInfo", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasMprConfigInterfaceTransportSetInfo_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasMprConfigServerBackup", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasMprConfigServerBackup_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasMprConfigServerConnect", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasMprConfigServerConnect_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasMprConfigServerDisconnect", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasMprConfigServerDisconnect_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasMprConfigServerGetInfo", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasMprConfigServerGetInfo_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasMprConfigServerGetInfoEx", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasMprConfigServerGetInfoEx_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasMprConfigServerInstall", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasMprConfigServerInstall_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasMprConfigServerRefresh", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasMprConfigServerRefresh_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasMprConfigServerRestore", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasMprConfigServerRestore_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasMprConfigServerSetInfo", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasMprConfigServerSetInfo_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasMprConfigServerSetInfoEx", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasMprConfigServerSetInfoEx_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasMprConfigTransportCreate", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasMprConfigTransportCreate_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasMprConfigTransportDelete", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasMprConfigTransportDelete_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasMprConfigTransportEnum", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasMprConfigTransportEnum_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasMprConfigTransportGetHandle", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasMprConfigTransportGetHandle_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasMprConfigTransportGetInfo", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasMprConfigTransportGetInfo_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasMprConfigTransportSetInfo", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasMprConfigTransportSetInfo_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasMprInfoBlockAdd", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasMprInfoBlockAdd_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasMprInfoBlockFind", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasMprInfoBlockFind_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasMprInfoBlockQuerySize", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasMprInfoBlockQuerySize_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasMprInfoBlockRemove", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasMprInfoBlockRemove_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasMprInfoBlockSet", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasMprInfoBlockSet_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasMprInfoCreate", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasMprInfoCreate_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasMprInfoDelete", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasMprInfoDelete_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasMprInfoDuplicate", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasMprInfoDuplicate_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasMprInfoRemoveAll", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasMprInfoRemoveAll_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasRasClearConnectionStatistics", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasRasClearConnectionStatistics_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasRasClearLinkStatistics", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasRasClearLinkStatistics_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasRasConnectionNotificationA", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasRasConnectionNotificationA_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasRasConnectionNotificationW", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasRasConnectionNotificationW_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasRasCreatePhonebookEntryA", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasRasCreatePhonebookEntryA_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasRasCreatePhonebookEntryW", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasRasCreatePhonebookEntryW_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasRasDeleteEntryA", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasRasDeleteEntryA_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasRasDeleteEntryW", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasRasDeleteEntryW_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasRasDeleteSubEntryA", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasRasDeleteSubEntryA_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasRasDeleteSubEntryW", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasRasDeleteSubEntryW_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasRasDialA", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasRasDialA_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasRasDialDlgA", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasRasDialDlgA_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasRasDialDlgW", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasRasDialDlgW_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasRasDialW", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasRasDialW_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasRasEditPhonebookEntryA", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasRasEditPhonebookEntryA_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasRasEditPhonebookEntryW", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasRasEditPhonebookEntryW_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasRasEntryDlgA", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasRasEntryDlgA_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasRasEntryDlgW", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasRasEntryDlgW_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasRasEnumAutodialAddressesA", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasRasEnumAutodialAddressesA_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasRasEnumAutodialAddressesW", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasRasEnumAutodialAddressesW_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasRasEnumConnectionsA", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasRasEnumConnectionsA_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasRasEnumConnectionsW", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasRasEnumConnectionsW_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasRasEnumDevicesA", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasRasEnumDevicesA_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasRasEnumDevicesW", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasRasEnumDevicesW_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasRasEnumEntriesA", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasRasEnumEntriesA_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasRasEnumEntriesW", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasRasEnumEntriesW_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasRasFreeEapUserIdentityA", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasRasFreeEapUserIdentityA_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasRasFreeEapUserIdentityW", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasRasFreeEapUserIdentityW_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasRasGetAutodialAddressA", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasRasGetAutodialAddressA_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasRasGetAutodialAddressW", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasRasGetAutodialAddressW_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasRasGetAutodialEnableA", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasRasGetAutodialEnableA_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasRasGetAutodialEnableW", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasRasGetAutodialEnableW_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasRasGetAutodialParamA", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasRasGetAutodialParamA_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasRasGetAutodialParamW", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasRasGetAutodialParamW_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasRasGetConnectStatusA", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasRasGetConnectStatusA_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasRasGetConnectStatusW", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasRasGetConnectStatusW_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasRasGetConnectionStatistics", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasRasGetConnectionStatistics_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasRasGetCountryInfoA", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasRasGetCountryInfoA_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasRasGetCountryInfoW", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasRasGetCountryInfoW_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasRasGetCredentialsA", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasRasGetCredentialsA_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasRasGetCredentialsW", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasRasGetCredentialsW_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasRasGetCustomAuthDataA", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasRasGetCustomAuthDataA_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasRasGetCustomAuthDataW", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasRasGetCustomAuthDataW_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasRasGetEapUserDataA", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasRasGetEapUserDataA_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasRasGetEapUserDataW", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasRasGetEapUserDataW_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasRasGetEapUserIdentityA", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasRasGetEapUserIdentityA_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasRasGetEapUserIdentityW", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasRasGetEapUserIdentityW_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasRasGetEntryDialParamsA", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasRasGetEntryDialParamsA_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasRasGetEntryDialParamsW", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasRasGetEntryDialParamsW_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasRasGetEntryPropertiesA", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasRasGetEntryPropertiesA_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasRasGetEntryPropertiesW", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasRasGetEntryPropertiesW_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasRasGetErrorStringA", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasRasGetErrorStringA_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasRasGetErrorStringW", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasRasGetErrorStringW_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasRasGetLinkStatistics", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasRasGetLinkStatistics_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasRasGetPCscf", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasRasGetPCscf_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasRasGetProjectionInfoA", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasRasGetProjectionInfoA_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasRasGetProjectionInfoEx", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasRasGetProjectionInfoEx_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasRasGetProjectionInfoW", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasRasGetProjectionInfoW_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasRasGetSubEntryHandleA", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasRasGetSubEntryHandleA_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasRasGetSubEntryHandleW", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasRasGetSubEntryHandleW_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasRasGetSubEntryPropertiesA", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasRasGetSubEntryPropertiesA_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasRasGetSubEntryPropertiesW", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasRasGetSubEntryPropertiesW_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasRasHangUpA", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasRasHangUpA_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasRasHangUpW", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasRasHangUpW_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasRasInvokeEapUI", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasRasInvokeEapUI_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasRasPhonebookDlgA", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasRasPhonebookDlgA_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasRasPhonebookDlgW", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasRasPhonebookDlgW_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasRasRenameEntryA", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasRasRenameEntryA_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasRasRenameEntryW", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasRasRenameEntryW_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasRasSetAutodialAddressA", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasRasSetAutodialAddressA_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasRasSetAutodialAddressW", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasRasSetAutodialAddressW_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasRasSetAutodialEnableA", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasRasSetAutodialEnableA_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasRasSetAutodialEnableW", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasRasSetAutodialEnableW_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasRasSetAutodialParamA", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasRasSetAutodialParamA_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasRasSetAutodialParamW", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasRasSetAutodialParamW_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasRasSetCredentialsA", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasRasSetCredentialsA_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasRasSetCredentialsW", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasRasSetCredentialsW_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasRasSetCustomAuthDataA", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasRasSetCustomAuthDataA_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasRasSetCustomAuthDataW", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasRasSetCustomAuthDataW_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasRasSetEapUserDataA", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasRasSetEapUserDataA_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasRasSetEapUserDataW", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasRasSetEapUserDataW_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasRasSetEntryDialParamsA", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasRasSetEntryDialParamsA_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasRasSetEntryDialParamsW", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasRasSetEntryDialParamsW_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasRasSetEntryPropertiesA", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasRasSetEntryPropertiesA_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasRasSetEntryPropertiesW", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasRasSetEntryPropertiesW_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasRasSetSubEntryPropertiesA", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasRasSetSubEntryPropertiesA_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasRasSetSubEntryPropertiesW", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasRasSetSubEntryPropertiesW_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasRasUpdateConnection", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasRasUpdateConnection_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasRasValidateEntryNameA", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasRasValidateEntryNameA_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasRasValidateEntryNameW", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasRasValidateEntryNameW_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasRtmAddNextHop", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasRtmAddNextHop_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasRtmAddRouteToDest", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasRtmAddRouteToDest_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasRtmBlockMethods", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasRtmBlockMethods_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasRtmConvertNetAddressToIpv6AddressAndLength", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasRtmConvertNetAddressToIpv6AddressAndLength_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasRtmCreateDestEnum", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasRtmCreateDestEnum_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasRtmCreateNextHopEnum", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasRtmCreateNextHopEnum_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasRtmCreateRouteEnum", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasRtmCreateRouteEnum_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasRtmCreateRouteList", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasRtmCreateRouteList_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasRtmCreateRouteListEnum", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasRtmCreateRouteListEnum_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasRtmDeleteEnumHandle", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasRtmDeleteEnumHandle_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasRtmDeleteNextHop", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasRtmDeleteNextHop_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasRtmDeleteRouteList", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasRtmDeleteRouteList_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasRtmDeleteRouteToDest", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasRtmDeleteRouteToDest_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasRtmDeregisterEntity", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasRtmDeregisterEntity_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasRtmDeregisterFromChangeNotification", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasRtmDeregisterFromChangeNotification_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasRtmFindNextHop", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasRtmFindNextHop_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasRtmGetChangeStatus", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasRtmGetChangeStatus_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasRtmGetChangedDests", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasRtmGetChangedDests_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasRtmGetDestInfo", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasRtmGetDestInfo_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasRtmGetEntityInfo", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasRtmGetEntityInfo_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasRtmGetEntityMethods", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasRtmGetEntityMethods_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasRtmGetEnumDests", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasRtmGetEnumDests_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasRtmGetEnumNextHops", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasRtmGetEnumNextHops_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasRtmGetEnumRoutes", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasRtmGetEnumRoutes_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasRtmGetExactMatchDestination", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasRtmGetExactMatchDestination_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasRtmGetExactMatchRoute", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasRtmGetExactMatchRoute_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasRtmGetLessSpecificDestination", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasRtmGetLessSpecificDestination_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasRtmGetListEnumRoutes", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasRtmGetListEnumRoutes_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasRtmGetMostSpecificDestination", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasRtmGetMostSpecificDestination_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasRtmGetNextHopInfo", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasRtmGetNextHopInfo_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasRtmGetNextHopPointer", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasRtmGetNextHopPointer_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasRtmGetOpaqueInformationPointer", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasRtmGetOpaqueInformationPointer_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasRtmGetRegisteredEntities", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasRtmGetRegisteredEntities_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasRtmGetRouteInfo", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasRtmGetRouteInfo_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasRtmGetRoutePointer", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasRtmGetRoutePointer_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasRtmHoldDestination", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasRtmHoldDestination_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasRtmIgnoreChangedDests", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasRtmIgnoreChangedDests_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasRtmInsertInRouteList", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasRtmInsertInRouteList_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasRtmInvokeMethod", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasRtmInvokeMethod_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasRtmIsBestRoute", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasRtmIsBestRoute_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasRtmIsMarkedForChangeNotification", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasRtmIsMarkedForChangeNotification_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasRtmLockDestination", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasRtmLockDestination_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasRtmLockNextHop", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasRtmLockNextHop_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasRtmLockRoute", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasRtmLockRoute_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasRtmMarkDestForChangeNotification", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasRtmMarkDestForChangeNotification_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasRtmReferenceHandles", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasRtmReferenceHandles_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasRtmRegisterEntity", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasRtmRegisterEntity_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasRtmRegisterForChangeNotification", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasRtmRegisterForChangeNotification_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasRtmReleaseChangedDests", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasRtmReleaseChangedDests_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasRtmReleaseDestInfo", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasRtmReleaseDestInfo_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasRtmReleaseDests", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasRtmReleaseDests_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasRtmReleaseEntities", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasRtmReleaseEntities_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasRtmReleaseEntityInfo", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasRtmReleaseEntityInfo_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasRtmReleaseNextHopInfo", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasRtmReleaseNextHopInfo_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasRtmReleaseNextHops", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasRtmReleaseNextHops_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasRtmReleaseRouteInfo", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasRtmReleaseRouteInfo_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasRtmReleaseRoutes", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasRtmReleaseRoutes_napi));
    exports.Set("windowssysWindowsWin32NetworkmanagementRrasRtmUpdateAndUnlockRoute", Napi::Function::New(env, windowssysWindowsWin32NetworkmanagementRrasRtmUpdateAndUnlockRoute_napi));
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
