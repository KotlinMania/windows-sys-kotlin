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

static Napi::Value windowssys_windows_win32_security_extensibleauthenticationprotocol_EapHostPeerClearConnection_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pconnectionid, ppeaperror) : 0;
#else
    (void)pconnectionid;
    (void)ppeaperror;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_extensibleauthenticationprotocol_EapHostPeerEndSession_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sessionhandle, ppeaperror) : 0;
#else
    (void)sessionhandle;
    (void)ppeaperror;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_extensibleauthenticationprotocol_EapHostPeerFreeEapError_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* peaperror = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("eappprxy.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "EapHostPeerFreeEapError")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(peaperror);
#else
    (void)peaperror;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_security_extensibleauthenticationprotocol_EapHostPeerFreeErrorMemory_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* peaperror = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("eappcfg.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "EapHostPeerFreeErrorMemory")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(peaperror);
#else
    (void)peaperror;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_security_extensibleauthenticationprotocol_EapHostPeerFreeMemory_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("eappcfg.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "EapHostPeerFreeMemory")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(pdata);
#else
    (void)pdata;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_security_extensibleauthenticationprotocol_EapHostPeerFreeRuntimeMemory_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("eappprxy.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "EapHostPeerFreeRuntimeMemory")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(pdata);
#else
    (void)pdata;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_security_extensibleauthenticationprotocol_EapHostPeerGetAuthStatus_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sessionhandle, authparam, pcbauthdata, ppauthdata, ppeaperror) : 0;
#else
    (void)sessionhandle;
    (void)authparam;
    (void)pcbauthdata;
    (void)ppauthdata;
    (void)ppeaperror;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_extensibleauthenticationprotocol_EapHostPeerGetDataToUnplumbCredentials_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pconnectionidthatlastsavedcreds, phcredentialimpersonationtoken, sessionhandle, ppeaperror, fsavetocredman) : 0;
#else
    (void)pconnectionidthatlastsavedcreds;
    (void)phcredentialimpersonationtoken;
    (void)sessionhandle;
    (void)ppeaperror;
    (void)fsavetocredman;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_extensibleauthenticationprotocol_EapHostPeerGetEncryptedPassword_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwsizeofpassword, szpassword, ppszencpassword) : 0;
#else
    (void)dwsizeofpassword;
    (void)szpassword;
    (void)ppszencpassword;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_extensibleauthenticationprotocol_EapHostPeerGetMethods_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(peapmethodinfoarray, ppeaperror) : 0;
#else
    (void)peapmethodinfoarray;
    (void)ppeaperror;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_extensibleauthenticationprotocol_EapHostPeerGetResponseAttributes_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sessionhandle, pattribs, ppeaperror) : 0;
#else
    (void)sessionhandle;
    (void)pattribs;
    (void)ppeaperror;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_extensibleauthenticationprotocol_EapHostPeerGetResult_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sessionhandle, reason, ppresult, ppeaperror) : 0;
#else
    (void)sessionhandle;
    (void)reason;
    (void)ppresult;
    (void)ppeaperror;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_extensibleauthenticationprotocol_EapHostPeerGetSendPacket_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sessionhandle, pcbsendpacket, ppsendpacket, ppeaperror) : 0;
#else
    (void)sessionhandle;
    (void)pcbsendpacket;
    (void)ppsendpacket;
    (void)ppeaperror;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_extensibleauthenticationprotocol_EapHostPeerGetUIContext_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sessionhandle, pdwsizeofuicontextdata, ppuicontextdata, ppeaperror) : 0;
#else
    (void)sessionhandle;
    (void)pdwsizeofuicontextdata;
    (void)ppuicontextdata;
    (void)ppeaperror;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_extensibleauthenticationprotocol_EapHostPeerInitialize_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("eappprxy.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "EapHostPeerInitialize")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr() : 0;
#else
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_extensibleauthenticationprotocol_EapHostPeerInvokeInteractiveUI_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hwndparent, dwsizeofuicontextdata, puicontextdata, pdwsizeofdatafrominteractiveui, ppdatafrominteractiveui, ppeaperror) : 0;
#else
    (void)hwndparent;
    (void)dwsizeofuicontextdata;
    (void)puicontextdata;
    (void)pdwsizeofdatafrominteractiveui;
    (void)ppdatafrominteractiveui;
    (void)ppeaperror;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_extensibleauthenticationprotocol_EapHostPeerProcessReceivedPacket_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sessionhandle, cbreceivepacket, preceivepacket, peapoutput, ppeaperror) : 0;
#else
    (void)sessionhandle;
    (void)cbreceivepacket;
    (void)preceivepacket;
    (void)peapoutput;
    (void)ppeaperror;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_extensibleauthenticationprotocol_EapHostPeerQueryInteractiveUIInputFields_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwversion, dwflags, dwsizeofuicontextdata, puicontextdata, peapinteractiveuidata, ppeaperror, ppvreserved) : 0;
#else
    (void)dwversion;
    (void)dwflags;
    (void)dwsizeofuicontextdata;
    (void)puicontextdata;
    (void)peapinteractiveuidata;
    (void)ppeaperror;
    (void)ppvreserved;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_extensibleauthenticationprotocol_EapHostPeerQueryUIBlobFromInteractiveUIInputFields_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwversion, dwflags, dwsizeofuicontextdata, puicontextdata, peapinteractiveuidata, pdwsizeofdatafrominteractiveui, ppdatafrominteractiveui, ppeaperror, ppvreserved) : 0;
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
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_extensibleauthenticationprotocol_EapHostPeerSetResponseAttributes_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sessionhandle, pattribs, peapoutput, ppeaperror) : 0;
#else
    (void)sessionhandle;
    (void)pattribs;
    (void)peapoutput;
    (void)ppeaperror;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_extensibleauthenticationprotocol_EapHostPeerSetUIContext_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sessionhandle, dwsizeofuicontextdata, puicontextdata, peapoutput, ppeaperror) : 0;
#else
    (void)sessionhandle;
    (void)dwsizeofuicontextdata;
    (void)puicontextdata;
    (void)peapoutput;
    (void)ppeaperror;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_extensibleauthenticationprotocol_EapHostPeerUninitialize_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("eappprxy.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "EapHostPeerUninitialize")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr();
#else
#endif
    return km_env.Undefined();
}

static void register_windows_win32_security_extensibleauthenticationprotocol_napi(Napi::Env env, Napi::Object exports) {
    exports.Set("windowssys_windows_win32_security_extensibleauthenticationprotocol_EapHostPeerClearConnection", Napi::Function::New(env, windowssys_windows_win32_security_extensibleauthenticationprotocol_EapHostPeerClearConnection_napi));
    exports.Set("windowssys_windows_win32_security_extensibleauthenticationprotocol_EapHostPeerEndSession", Napi::Function::New(env, windowssys_windows_win32_security_extensibleauthenticationprotocol_EapHostPeerEndSession_napi));
    exports.Set("windowssys_windows_win32_security_extensibleauthenticationprotocol_EapHostPeerFreeEapError", Napi::Function::New(env, windowssys_windows_win32_security_extensibleauthenticationprotocol_EapHostPeerFreeEapError_napi));
    exports.Set("windowssys_windows_win32_security_extensibleauthenticationprotocol_EapHostPeerFreeErrorMemory", Napi::Function::New(env, windowssys_windows_win32_security_extensibleauthenticationprotocol_EapHostPeerFreeErrorMemory_napi));
    exports.Set("windowssys_windows_win32_security_extensibleauthenticationprotocol_EapHostPeerFreeMemory", Napi::Function::New(env, windowssys_windows_win32_security_extensibleauthenticationprotocol_EapHostPeerFreeMemory_napi));
    exports.Set("windowssys_windows_win32_security_extensibleauthenticationprotocol_EapHostPeerFreeRuntimeMemory", Napi::Function::New(env, windowssys_windows_win32_security_extensibleauthenticationprotocol_EapHostPeerFreeRuntimeMemory_napi));
    exports.Set("windowssys_windows_win32_security_extensibleauthenticationprotocol_EapHostPeerGetAuthStatus", Napi::Function::New(env, windowssys_windows_win32_security_extensibleauthenticationprotocol_EapHostPeerGetAuthStatus_napi));
    exports.Set("windowssys_windows_win32_security_extensibleauthenticationprotocol_EapHostPeerGetDataToUnplumbCredentials", Napi::Function::New(env, windowssys_windows_win32_security_extensibleauthenticationprotocol_EapHostPeerGetDataToUnplumbCredentials_napi));
    exports.Set("windowssys_windows_win32_security_extensibleauthenticationprotocol_EapHostPeerGetEncryptedPassword", Napi::Function::New(env, windowssys_windows_win32_security_extensibleauthenticationprotocol_EapHostPeerGetEncryptedPassword_napi));
    exports.Set("windowssys_windows_win32_security_extensibleauthenticationprotocol_EapHostPeerGetMethods", Napi::Function::New(env, windowssys_windows_win32_security_extensibleauthenticationprotocol_EapHostPeerGetMethods_napi));
    exports.Set("windowssys_windows_win32_security_extensibleauthenticationprotocol_EapHostPeerGetResponseAttributes", Napi::Function::New(env, windowssys_windows_win32_security_extensibleauthenticationprotocol_EapHostPeerGetResponseAttributes_napi));
    exports.Set("windowssys_windows_win32_security_extensibleauthenticationprotocol_EapHostPeerGetResult", Napi::Function::New(env, windowssys_windows_win32_security_extensibleauthenticationprotocol_EapHostPeerGetResult_napi));
    exports.Set("windowssys_windows_win32_security_extensibleauthenticationprotocol_EapHostPeerGetSendPacket", Napi::Function::New(env, windowssys_windows_win32_security_extensibleauthenticationprotocol_EapHostPeerGetSendPacket_napi));
    exports.Set("windowssys_windows_win32_security_extensibleauthenticationprotocol_EapHostPeerGetUIContext", Napi::Function::New(env, windowssys_windows_win32_security_extensibleauthenticationprotocol_EapHostPeerGetUIContext_napi));
    exports.Set("windowssys_windows_win32_security_extensibleauthenticationprotocol_EapHostPeerInitialize", Napi::Function::New(env, windowssys_windows_win32_security_extensibleauthenticationprotocol_EapHostPeerInitialize_napi));
    exports.Set("windowssys_windows_win32_security_extensibleauthenticationprotocol_EapHostPeerInvokeInteractiveUI", Napi::Function::New(env, windowssys_windows_win32_security_extensibleauthenticationprotocol_EapHostPeerInvokeInteractiveUI_napi));
    exports.Set("windowssys_windows_win32_security_extensibleauthenticationprotocol_EapHostPeerProcessReceivedPacket", Napi::Function::New(env, windowssys_windows_win32_security_extensibleauthenticationprotocol_EapHostPeerProcessReceivedPacket_napi));
    exports.Set("windowssys_windows_win32_security_extensibleauthenticationprotocol_EapHostPeerQueryInteractiveUIInputFields", Napi::Function::New(env, windowssys_windows_win32_security_extensibleauthenticationprotocol_EapHostPeerQueryInteractiveUIInputFields_napi));
    exports.Set("windowssys_windows_win32_security_extensibleauthenticationprotocol_EapHostPeerQueryUIBlobFromInteractiveUIInputFields", Napi::Function::New(env, windowssys_windows_win32_security_extensibleauthenticationprotocol_EapHostPeerQueryUIBlobFromInteractiveUIInputFields_napi));
    exports.Set("windowssys_windows_win32_security_extensibleauthenticationprotocol_EapHostPeerSetResponseAttributes", Napi::Function::New(env, windowssys_windows_win32_security_extensibleauthenticationprotocol_EapHostPeerSetResponseAttributes_napi));
    exports.Set("windowssys_windows_win32_security_extensibleauthenticationprotocol_EapHostPeerSetUIContext", Napi::Function::New(env, windowssys_windows_win32_security_extensibleauthenticationprotocol_EapHostPeerSetUIContext_napi));
    exports.Set("windowssys_windows_win32_security_extensibleauthenticationprotocol_EapHostPeerUninitialize", Napi::Function::New(env, windowssys_windows_win32_security_extensibleauthenticationprotocol_EapHostPeerUninitialize_napi));
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
