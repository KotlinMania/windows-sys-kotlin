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

static Napi::Value windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerClearConnection_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pconnectionid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ppeaperror = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("eappprxy.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "EapHostPeerClearConnection")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(pconnectionid, ppeaperror);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pconnectionid;
    (void)ppeaperror;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerEndSession_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t sessionhandle = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* ppeaperror = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("eappprxy.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "EapHostPeerEndSession")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sessionhandle, ppeaperror);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)sessionhandle;
    (void)ppeaperror;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerFreeEapError_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* peaperror = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("eappprxy.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "EapHostPeerFreeEapError")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(peaperror);
    } else {
        errno = ENOSYS;
    }
#else
    (void)peaperror;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerFreeErrorMemory_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* peaperror = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("eappcfg.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "EapHostPeerFreeErrorMemory")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(peaperror);
    } else {
        errno = ENOSYS;
    }
#else
    (void)peaperror;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerFreeMemory_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("eappcfg.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "EapHostPeerFreeMemory")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(pdata);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pdata;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerFreeRuntimeMemory_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("eappprxy.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "EapHostPeerFreeRuntimeMemory")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(pdata);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pdata;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerGetAuthStatus_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t sessionhandle = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    int32_t authparam = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pcbauthdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* ppauthdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* ppeaperror = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("eappprxy.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "EapHostPeerGetAuthStatus")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sessionhandle, authparam, pcbauthdata, ppauthdata, ppeaperror);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)sessionhandle;
    (void)authparam;
    (void)pcbauthdata;
    (void)ppauthdata;
    (void)ppeaperror;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerGetDataToUnplumbCredentials_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pconnectionidthatlastsavedcreds = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* phcredentialimpersonationtoken = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t sessionhandle = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* ppeaperror = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* fsavetocredman = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("eappprxy.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "EapHostPeerGetDataToUnplumbCredentials")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(pconnectionidthatlastsavedcreds, phcredentialimpersonationtoken, sessionhandle, ppeaperror, fsavetocredman);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pconnectionidthatlastsavedcreds;
    (void)phcredentialimpersonationtoken;
    (void)sessionhandle;
    (void)ppeaperror;
    (void)fsavetocredman;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerGetEncryptedPassword_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwsizeofpassword = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* szpassword = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* ppszencpassword = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("eappprxy.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "EapHostPeerGetEncryptedPassword")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(dwsizeofpassword, szpassword, ppszencpassword);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)dwsizeofpassword;
    (void)szpassword;
    (void)ppszencpassword;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerGetMethods_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* peapmethodinfoarray = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ppeaperror = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("eappcfg.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "EapHostPeerGetMethods")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(peapmethodinfoarray, ppeaperror);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)peapmethodinfoarray;
    (void)ppeaperror;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerGetResponseAttributes_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t sessionhandle = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* pattribs = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* ppeaperror = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("eappprxy.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "EapHostPeerGetResponseAttributes")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sessionhandle, pattribs, ppeaperror);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)sessionhandle;
    (void)pattribs;
    (void)ppeaperror;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerGetResult_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t sessionhandle = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    int32_t reason = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* ppresult = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* ppeaperror = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("eappprxy.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "EapHostPeerGetResult")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sessionhandle, reason, ppresult, ppeaperror);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)sessionhandle;
    (void)reason;
    (void)ppresult;
    (void)ppeaperror;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerGetSendPacket_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t sessionhandle = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* pcbsendpacket = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* ppsendpacket = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* ppeaperror = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("eappprxy.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "EapHostPeerGetSendPacket")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sessionhandle, pcbsendpacket, ppsendpacket, ppeaperror);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)sessionhandle;
    (void)pcbsendpacket;
    (void)ppsendpacket;
    (void)ppeaperror;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerGetUIContext_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t sessionhandle = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* pdwsizeofuicontextdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* ppuicontextdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* ppeaperror = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("eappprxy.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "EapHostPeerGetUIContext")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sessionhandle, pdwsizeofuicontextdata, ppuicontextdata, ppeaperror);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)sessionhandle;
    (void)pdwsizeofuicontextdata;
    (void)ppuicontextdata;
    (void)ppeaperror;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerInitialize_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("eappprxy.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "EapHostPeerInitialize")));
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

static Napi::Value windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerInvokeInteractiveUI_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hwndparent = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwsizeofuicontextdata = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* puicontextdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pdwsizeofdatafrominteractiveui = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* ppdatafrominteractiveui = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* ppeaperror = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("eappcfg.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "EapHostPeerInvokeInteractiveUI")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hwndparent, dwsizeofuicontextdata, puicontextdata, pdwsizeofdatafrominteractiveui, ppdatafrominteractiveui, ppeaperror);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hwndparent;
    (void)dwsizeofuicontextdata;
    (void)puicontextdata;
    (void)pdwsizeofdatafrominteractiveui;
    (void)ppdatafrominteractiveui;
    (void)ppeaperror;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerProcessReceivedPacket_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t sessionhandle = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t cbreceivepacket = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* preceivepacket = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* peapoutput = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* ppeaperror = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("eappprxy.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "EapHostPeerProcessReceivedPacket")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sessionhandle, cbreceivepacket, preceivepacket, peapoutput, ppeaperror);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)sessionhandle;
    (void)cbreceivepacket;
    (void)preceivepacket;
    (void)peapoutput;
    (void)ppeaperror;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerQueryInteractiveUIInputFields_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwversion = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t dwsizeofuicontextdata = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* puicontextdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* peapinteractiveuidata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* ppeaperror = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* ppvreserved = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("eappcfg.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "EapHostPeerQueryInteractiveUIInputFields")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(dwversion, dwflags, dwsizeofuicontextdata, puicontextdata, peapinteractiveuidata, ppeaperror, ppvreserved);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)dwversion;
    (void)dwflags;
    (void)dwsizeofuicontextdata;
    (void)puicontextdata;
    (void)peapinteractiveuidata;
    (void)ppeaperror;
    (void)ppvreserved;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerQueryUIBlobFromInteractiveUIInputFields_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwversion = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t dwsizeofuicontextdata = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* puicontextdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* peapinteractiveuidata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* pdwsizeofdatafrominteractiveui = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* ppdatafrominteractiveui = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* ppeaperror = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    void* ppvreserved = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("eappcfg.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "EapHostPeerQueryUIBlobFromInteractiveUIInputFields")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(dwversion, dwflags, dwsizeofuicontextdata, puicontextdata, peapinteractiveuidata, pdwsizeofdatafrominteractiveui, ppdatafrominteractiveui, ppeaperror, ppvreserved);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)dwversion;
    (void)dwflags;
    (void)dwsizeofuicontextdata;
    (void)puicontextdata;
    (void)peapinteractiveuidata;
    (void)pdwsizeofdatafrominteractiveui;
    (void)ppdatafrominteractiveui;
    (void)ppeaperror;
    (void)ppvreserved;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerSetResponseAttributes_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t sessionhandle = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* pattribs = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* peapoutput = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* ppeaperror = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("eappprxy.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "EapHostPeerSetResponseAttributes")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sessionhandle, pattribs, peapoutput, ppeaperror);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)sessionhandle;
    (void)pattribs;
    (void)peapoutput;
    (void)ppeaperror;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerSetUIContext_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t sessionhandle = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t dwsizeofuicontextdata = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* puicontextdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* peapoutput = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* ppeaperror = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("eappprxy.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "EapHostPeerSetUIContext")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sessionhandle, dwsizeofuicontextdata, puicontextdata, peapoutput, ppeaperror);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)sessionhandle;
    (void)dwsizeofuicontextdata;
    (void)puicontextdata;
    (void)peapoutput;
    (void)ppeaperror;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerUninitialize_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("eappprxy.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "EapHostPeerUninitialize")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr();
    } else {
        errno = ENOSYS;
    }
#else
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static void register_windows_win32_security_extensibleauthenticationprotocol_napi(Napi::Env env, Napi::Object exports) {
    exports.Set("windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerClearConnection", Napi::Function::New(env, windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerClearConnection_napi));
    exports.Set("windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerEndSession", Napi::Function::New(env, windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerEndSession_napi));
    exports.Set("windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerFreeEapError", Napi::Function::New(env, windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerFreeEapError_napi));
    exports.Set("windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerFreeErrorMemory", Napi::Function::New(env, windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerFreeErrorMemory_napi));
    exports.Set("windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerFreeMemory", Napi::Function::New(env, windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerFreeMemory_napi));
    exports.Set("windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerFreeRuntimeMemory", Napi::Function::New(env, windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerFreeRuntimeMemory_napi));
    exports.Set("windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerGetAuthStatus", Napi::Function::New(env, windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerGetAuthStatus_napi));
    exports.Set("windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerGetDataToUnplumbCredentials", Napi::Function::New(env, windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerGetDataToUnplumbCredentials_napi));
    exports.Set("windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerGetEncryptedPassword", Napi::Function::New(env, windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerGetEncryptedPassword_napi));
    exports.Set("windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerGetMethods", Napi::Function::New(env, windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerGetMethods_napi));
    exports.Set("windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerGetResponseAttributes", Napi::Function::New(env, windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerGetResponseAttributes_napi));
    exports.Set("windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerGetResult", Napi::Function::New(env, windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerGetResult_napi));
    exports.Set("windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerGetSendPacket", Napi::Function::New(env, windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerGetSendPacket_napi));
    exports.Set("windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerGetUIContext", Napi::Function::New(env, windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerGetUIContext_napi));
    exports.Set("windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerInitialize", Napi::Function::New(env, windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerInitialize_napi));
    exports.Set("windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerInvokeInteractiveUI", Napi::Function::New(env, windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerInvokeInteractiveUI_napi));
    exports.Set("windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerProcessReceivedPacket", Napi::Function::New(env, windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerProcessReceivedPacket_napi));
    exports.Set("windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerQueryInteractiveUIInputFields", Napi::Function::New(env, windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerQueryInteractiveUIInputFields_napi));
    exports.Set("windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerQueryUIBlobFromInteractiveUIInputFields", Napi::Function::New(env, windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerQueryUIBlobFromInteractiveUIInputFields_napi));
    exports.Set("windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerSetResponseAttributes", Napi::Function::New(env, windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerSetResponseAttributes_napi));
    exports.Set("windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerSetUIContext", Napi::Function::New(env, windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerSetUIContext_napi));
    exports.Set("windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerUninitialize", Napi::Function::New(env, windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerUninitialize_napi));
}

static KmNapiRegistrarNode registrar_node = { &register_windows_win32_security_extensibleauthenticationprotocol_napi, nullptr };
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
