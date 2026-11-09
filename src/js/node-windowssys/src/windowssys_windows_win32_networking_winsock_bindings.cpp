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

static Napi::Value windowssys_windows_win32_networking_winsock_AcceptEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t slistensocket = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint64_t sacceptsocket = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* lpoutputbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t dwreceivedatalength = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t dwlocaladdresslength = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    uint32_t dwremoteaddresslength = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* lpdwbytesreceived = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* lpoverlapped = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mswsock.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "AcceptEx")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(slistensocket, sacceptsocket, lpoutputbuffer, dwreceivedatalength, dwlocaladdresslength, dwremoteaddresslength, lpdwbytesreceived, lpoverlapped) : -1;
#else
    (void)slistensocket;
    (void)sacceptsocket;
    (void)lpoutputbuffer;
    (void)dwreceivedatalength;
    (void)dwlocaladdresslength;
    (void)dwremoteaddresslength;
    (void)lpdwbytesreceived;
    (void)lpoverlapped;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winsock_EnumProtocolsA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpiprotocols = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpprotocolbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* lpdwbufferlength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mswsock.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "EnumProtocolsA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpiprotocols, lpprotocolbuffer, lpdwbufferlength) : -1;
#else
    (void)lpiprotocols;
    (void)lpprotocolbuffer;
    (void)lpdwbufferlength;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winsock_EnumProtocolsW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpiprotocols = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpprotocolbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* lpdwbufferlength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mswsock.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "EnumProtocolsW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpiprotocols, lpprotocolbuffer, lpdwbufferlength) : -1;
#else
    (void)lpiprotocols;
    (void)lpprotocolbuffer;
    (void)lpdwbufferlength;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winsock_FreeAddrInfoEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* paddrinfoex = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FreeAddrInfoEx")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(paddrinfoex);
#else
    (void)paddrinfoex;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_networking_winsock_FreeAddrInfoExW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* paddrinfoex = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FreeAddrInfoExW")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(paddrinfoex);
#else
    (void)paddrinfoex;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_networking_winsock_FreeAddrInfoW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* paddrinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FreeAddrInfoW")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(paddrinfo);
#else
    (void)paddrinfo;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_networking_winsock_GetAcceptExSockaddrs_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpoutputbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwreceivedatalength = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t dwlocaladdresslength = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t dwremoteaddresslength = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* localsockaddr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* localsockaddrlength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* remotesockaddr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* remotesockaddrlength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mswsock.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetAcceptExSockaddrs")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(lpoutputbuffer, dwreceivedatalength, dwlocaladdresslength, dwremoteaddresslength, localsockaddr, localsockaddrlength, remotesockaddr, remotesockaddrlength);
#else
    (void)lpoutputbuffer;
    (void)dwreceivedatalength;
    (void)dwlocaladdresslength;
    (void)dwremoteaddresslength;
    (void)localsockaddr;
    (void)localsockaddrlength;
    (void)remotesockaddr;
    (void)remotesockaddrlength;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_networking_winsock_GetAddrInfoExA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pservicename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwnamespace = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* lpnspid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* hints = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* ppresult = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* timeout = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* lpoverlapped = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    void* lpcompletionroutine = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
    void* lpnamehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 9 ? km_napi_arg_u64(km_info[9]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetAddrInfoExA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pname, pservicename, dwnamespace, lpnspid, hints, ppresult, timeout, lpoverlapped, lpcompletionroutine, lpnamehandle) : -1;
#else
    (void)pname;
    (void)pservicename;
    (void)dwnamespace;
    (void)lpnspid;
    (void)hints;
    (void)ppresult;
    (void)timeout;
    (void)lpoverlapped;
    (void)lpcompletionroutine;
    (void)lpnamehandle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winsock_GetAddrInfoExCancel_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lphandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetAddrInfoExCancel")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lphandle) : -1;
#else
    (void)lphandle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winsock_GetAddrInfoExOverlappedResult_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpoverlapped = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetAddrInfoExOverlappedResult")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpoverlapped) : -1;
#else
    (void)lpoverlapped;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winsock_GetAddrInfoExW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pservicename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwnamespace = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* lpnspid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* hints = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* ppresult = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* timeout = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* lpoverlapped = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    void* lpcompletionroutine = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
    void* lphandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 9 ? km_napi_arg_u64(km_info[9]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetAddrInfoExW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pname, pservicename, dwnamespace, lpnspid, hints, ppresult, timeout, lpoverlapped, lpcompletionroutine, lphandle) : -1;
#else
    (void)pname;
    (void)pservicename;
    (void)dwnamespace;
    (void)lpnspid;
    (void)hints;
    (void)ppresult;
    (void)timeout;
    (void)lpoverlapped;
    (void)lpcompletionroutine;
    (void)lphandle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winsock_GetAddrInfoW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pnodename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pservicename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* phints = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* ppresult = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetAddrInfoW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pnodename, pservicename, phints, ppresult) : -1;
#else
    (void)pnodename;
    (void)pservicename;
    (void)phints;
    (void)ppresult;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winsock_GetAddressByNameA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwnamespace = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* lpservicetype = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* lpservicename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* lpiprotocols = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t dwresolution = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* lpserviceasyncinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* lpcsaddrbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* lpdwbufferlength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    void* lpaliasbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
    void* lpdwaliasbufferlength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 9 ? km_napi_arg_u64(km_info[9]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mswsock.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetAddressByNameA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwnamespace, lpservicetype, lpservicename, lpiprotocols, dwresolution, lpserviceasyncinfo, lpcsaddrbuffer, lpdwbufferlength, lpaliasbuffer, lpdwaliasbufferlength) : -1;
#else
    (void)dwnamespace;
    (void)lpservicetype;
    (void)lpservicename;
    (void)lpiprotocols;
    (void)dwresolution;
    (void)lpserviceasyncinfo;
    (void)lpcsaddrbuffer;
    (void)lpdwbufferlength;
    (void)lpaliasbuffer;
    (void)lpdwaliasbufferlength;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winsock_GetAddressByNameW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwnamespace = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* lpservicetype = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* lpservicename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* lpiprotocols = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t dwresolution = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* lpserviceasyncinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* lpcsaddrbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* lpdwbufferlength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    void* lpaliasbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
    void* lpdwaliasbufferlength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 9 ? km_napi_arg_u64(km_info[9]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mswsock.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetAddressByNameW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwnamespace, lpservicetype, lpservicename, lpiprotocols, dwresolution, lpserviceasyncinfo, lpcsaddrbuffer, lpdwbufferlength, lpaliasbuffer, lpdwaliasbufferlength) : -1;
#else
    (void)dwnamespace;
    (void)lpservicetype;
    (void)lpservicename;
    (void)lpiprotocols;
    (void)dwresolution;
    (void)lpserviceasyncinfo;
    (void)lpcsaddrbuffer;
    (void)lpdwbufferlength;
    (void)lpaliasbuffer;
    (void)lpdwaliasbufferlength;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winsock_GetHostNameW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* name = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t namelen = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetHostNameW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(name, namelen) : -1;
#else
    (void)name;
    (void)namelen;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winsock_GetNameByTypeA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpservicetype = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpservicename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwnamelength = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mswsock.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetNameByTypeA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpservicetype, lpservicename, dwnamelength) : -1;
#else
    (void)lpservicetype;
    (void)lpservicename;
    (void)dwnamelength;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winsock_GetNameByTypeW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpservicetype = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpservicename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwnamelength = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mswsock.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetNameByTypeW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpservicetype, lpservicename, dwnamelength) : -1;
#else
    (void)lpservicetype;
    (void)lpservicename;
    (void)dwnamelength;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winsock_GetNameInfoW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* psockaddr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t sockaddrlength = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pnodebuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t nodebuffersize = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* pservicebuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t servicebuffersize = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    int32_t flags = static_cast<int32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetNameInfoW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(psockaddr, sockaddrlength, pnodebuffer, nodebuffersize, pservicebuffer, servicebuffersize, flags) : -1;
#else
    (void)psockaddr;
    (void)sockaddrlength;
    (void)pnodebuffer;
    (void)nodebuffersize;
    (void)pservicebuffer;
    (void)servicebuffersize;
    (void)flags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winsock_GetServiceA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwnamespace = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* lpguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* lpservicename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t dwproperties = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* lpbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* lpdwbuffersize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* lpserviceasyncinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mswsock.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetServiceA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwnamespace, lpguid, lpservicename, dwproperties, lpbuffer, lpdwbuffersize, lpserviceasyncinfo) : -1;
#else
    (void)dwnamespace;
    (void)lpguid;
    (void)lpservicename;
    (void)dwproperties;
    (void)lpbuffer;
    (void)lpdwbuffersize;
    (void)lpserviceasyncinfo;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winsock_GetServiceW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwnamespace = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* lpguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* lpservicename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t dwproperties = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* lpbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* lpdwbuffersize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* lpserviceasyncinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mswsock.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetServiceW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwnamespace, lpguid, lpservicename, dwproperties, lpbuffer, lpdwbuffersize, lpserviceasyncinfo) : -1;
#else
    (void)dwnamespace;
    (void)lpguid;
    (void)lpservicename;
    (void)dwproperties;
    (void)lpbuffer;
    (void)lpdwbuffersize;
    (void)lpserviceasyncinfo;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winsock_GetTypeByNameA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpservicename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpservicetype = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mswsock.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetTypeByNameA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpservicename, lpservicetype) : -1;
#else
    (void)lpservicename;
    (void)lpservicetype;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winsock_GetTypeByNameW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpservicename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpservicetype = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mswsock.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetTypeByNameW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpservicename, lpservicetype) : -1;
#else
    (void)lpservicename;
    (void)lpservicetype;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winsock_InetNtopW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t family = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* paddr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pstringbuf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint64_t stringbufsize = km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int32_t, void*, void*, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "InetNtopW")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(family, paddr, pstringbuf, stringbufsize) : NULL;
#else
    (void)family;
    (void)paddr;
    (void)pstringbuf;
    (void)stringbufsize;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_networking_winsock_InetPtonW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t family = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* pszaddrstring = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* paddrbuf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "InetPtonW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(family, pszaddrstring, paddrbuf) : -1;
#else
    (void)family;
    (void)pszaddrstring;
    (void)paddrbuf;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winsock_ProcessSocketNotifications_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* completionport = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t registrationcount = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* registrationinfos = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t timeoutms = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t completioncount = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* completionportentries = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* receivedentrycount = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ProcessSocketNotifications")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(completionport, registrationcount, registrationinfos, timeoutms, completioncount, completionportentries, receivedentrycount) : 0;
#else
    (void)completionport;
    (void)registrationcount;
    (void)registrationinfos;
    (void)timeoutms;
    (void)completioncount;
    (void)completionportentries;
    (void)receivedentrycount;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winsock_RtlEthernetAddressToStringA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* addr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* s = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtlEthernetAddressToStringA")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(addr, s) : NULL;
#else
    (void)addr;
    (void)s;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_networking_winsock_RtlEthernetAddressToStringW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* addr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* s = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtlEthernetAddressToStringW")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(addr, s) : NULL;
#else
    (void)addr;
    (void)s;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_networking_winsock_RtlEthernetStringToAddressA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* s = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* terminator = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* addr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtlEthernetStringToAddressA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(s, terminator, addr) : -1;
#else
    (void)s;
    (void)terminator;
    (void)addr;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winsock_RtlEthernetStringToAddressW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* s = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* terminator = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* addr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtlEthernetStringToAddressW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(s, terminator, addr) : -1;
#else
    (void)s;
    (void)terminator;
    (void)addr;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winsock_RtlIpv4AddressToStringA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* addr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* s = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtlIpv4AddressToStringA")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(addr, s) : NULL;
#else
    (void)addr;
    (void)s;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_networking_winsock_RtlIpv4AddressToStringExA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* address = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint16_t port = static_cast<uint16_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* addressstring = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* addressstringlength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint16_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtlIpv4AddressToStringExA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(address, port, addressstring, addressstringlength) : -1;
#else
    (void)address;
    (void)port;
    (void)addressstring;
    (void)addressstringlength;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winsock_RtlIpv4AddressToStringExW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* address = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint16_t port = static_cast<uint16_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* addressstring = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* addressstringlength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint16_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtlIpv4AddressToStringExW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(address, port, addressstring, addressstringlength) : -1;
#else
    (void)address;
    (void)port;
    (void)addressstring;
    (void)addressstringlength;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winsock_RtlIpv4AddressToStringW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* addr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* s = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtlIpv4AddressToStringW")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(addr, s) : NULL;
#else
    (void)addr;
    (void)s;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_networking_winsock_RtlIpv4StringToAddressA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* s = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    bool strict = km_info.Length() > 1 ? km_info[1].ToBoolean().Value() : false;
    void* terminator = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* addr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, bool, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtlIpv4StringToAddressA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(s, strict, terminator, addr) : -1;
#else
    (void)s;
    (void)strict;
    (void)terminator;
    (void)addr;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winsock_RtlIpv4StringToAddressExA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* addressstring = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    bool strict = km_info.Length() > 1 ? km_info[1].ToBoolean().Value() : false;
    void* address = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* port = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, bool, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtlIpv4StringToAddressExA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(addressstring, strict, address, port) : -1;
#else
    (void)addressstring;
    (void)strict;
    (void)address;
    (void)port;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winsock_RtlIpv4StringToAddressExW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* addressstring = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    bool strict = km_info.Length() > 1 ? km_info[1].ToBoolean().Value() : false;
    void* address = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* port = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, bool, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtlIpv4StringToAddressExW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(addressstring, strict, address, port) : -1;
#else
    (void)addressstring;
    (void)strict;
    (void)address;
    (void)port;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winsock_RtlIpv4StringToAddressW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* s = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    bool strict = km_info.Length() > 1 ? km_info[1].ToBoolean().Value() : false;
    void* terminator = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* addr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, bool, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtlIpv4StringToAddressW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(s, strict, terminator, addr) : -1;
#else
    (void)s;
    (void)strict;
    (void)terminator;
    (void)addr;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winsock_RtlIpv6AddressToStringA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* addr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* s = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtlIpv6AddressToStringA")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(addr, s) : NULL;
#else
    (void)addr;
    (void)s;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_networking_winsock_RtlIpv6AddressToStringExA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* address = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t scopeid = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint16_t port = static_cast<uint16_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* addressstring = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* addressstringlength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint16_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtlIpv6AddressToStringExA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(address, scopeid, port, addressstring, addressstringlength) : -1;
#else
    (void)address;
    (void)scopeid;
    (void)port;
    (void)addressstring;
    (void)addressstringlength;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winsock_RtlIpv6AddressToStringExW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* address = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t scopeid = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint16_t port = static_cast<uint16_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* addressstring = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* addressstringlength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint16_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtlIpv6AddressToStringExW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(address, scopeid, port, addressstring, addressstringlength) : -1;
#else
    (void)address;
    (void)scopeid;
    (void)port;
    (void)addressstring;
    (void)addressstringlength;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winsock_RtlIpv6AddressToStringW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* addr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* s = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtlIpv6AddressToStringW")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(addr, s) : NULL;
#else
    (void)addr;
    (void)s;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_networking_winsock_RtlIpv6StringToAddressA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* s = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* terminator = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* addr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtlIpv6StringToAddressA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(s, terminator, addr) : -1;
#else
    (void)s;
    (void)terminator;
    (void)addr;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winsock_RtlIpv6StringToAddressExA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* addressstring = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* address = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* scopeid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* port = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtlIpv6StringToAddressExA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(addressstring, address, scopeid, port) : -1;
#else
    (void)addressstring;
    (void)address;
    (void)scopeid;
    (void)port;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winsock_RtlIpv6StringToAddressExW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* addressstring = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* address = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* scopeid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* port = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtlIpv6StringToAddressExW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(addressstring, address, scopeid, port) : -1;
#else
    (void)addressstring;
    (void)address;
    (void)scopeid;
    (void)port;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winsock_RtlIpv6StringToAddressW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* s = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* terminator = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* addr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtlIpv6StringToAddressW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(s, terminator, addr) : -1;
#else
    (void)s;
    (void)terminator;
    (void)addr;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winsock_SetAddrInfoExA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pservicename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* paddresses = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t dwaddresscount = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* lpblob = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    uint32_t dwnamespace = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    void* lpnspid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    void* timeout = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
    void* lpoverlapped = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 9 ? km_napi_arg_u64(km_info[9]) : 0));
    void* lpcompletionroutine = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 10 ? km_napi_arg_u64(km_info[10]) : 0));
    void* lpnamehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 11 ? km_napi_arg_u64(km_info[11]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, uint32_t, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetAddrInfoExA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pname, pservicename, paddresses, dwaddresscount, lpblob, dwflags, dwnamespace, lpnspid, timeout, lpoverlapped, lpcompletionroutine, lpnamehandle) : -1;
#else
    (void)pname;
    (void)pservicename;
    (void)paddresses;
    (void)dwaddresscount;
    (void)lpblob;
    (void)dwflags;
    (void)dwnamespace;
    (void)lpnspid;
    (void)timeout;
    (void)lpoverlapped;
    (void)lpcompletionroutine;
    (void)lpnamehandle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winsock_SetAddrInfoExW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pservicename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* paddresses = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t dwaddresscount = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* lpblob = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    uint32_t dwnamespace = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    void* lpnspid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    void* timeout = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
    void* lpoverlapped = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 9 ? km_napi_arg_u64(km_info[9]) : 0));
    void* lpcompletionroutine = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 10 ? km_napi_arg_u64(km_info[10]) : 0));
    void* lpnamehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 11 ? km_napi_arg_u64(km_info[11]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, uint32_t, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetAddrInfoExW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pname, pservicename, paddresses, dwaddresscount, lpblob, dwflags, dwnamespace, lpnspid, timeout, lpoverlapped, lpcompletionroutine, lpnamehandle) : -1;
#else
    (void)pname;
    (void)pservicename;
    (void)paddresses;
    (void)dwaddresscount;
    (void)lpblob;
    (void)dwflags;
    (void)dwnamespace;
    (void)lpnspid;
    (void)timeout;
    (void)lpoverlapped;
    (void)lpcompletionroutine;
    (void)lpnamehandle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winsock_SetServiceA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwnamespace = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t dwoperation = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* lpserviceinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* lpserviceasyncinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* lpdwstatusflags = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mswsock.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetServiceA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwnamespace, dwoperation, dwflags, lpserviceinfo, lpserviceasyncinfo, lpdwstatusflags) : -1;
#else
    (void)dwnamespace;
    (void)dwoperation;
    (void)dwflags;
    (void)lpserviceinfo;
    (void)lpserviceasyncinfo;
    (void)lpdwstatusflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winsock_SetServiceW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwnamespace = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t dwoperation = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* lpserviceinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* lpserviceasyncinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* lpdwstatusflags = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mswsock.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetServiceW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwnamespace, dwoperation, dwflags, lpserviceinfo, lpserviceasyncinfo, lpdwstatusflags) : -1;
#else
    (void)dwnamespace;
    (void)dwoperation;
    (void)dwflags;
    (void)lpserviceinfo;
    (void)lpserviceasyncinfo;
    (void)lpdwstatusflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winsock_SetSocketMediaStreamingMode_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t value = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("windows.networking.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetSocketMediaStreamingMode")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(value) : -1;
#else
    (void)value;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winsock_TransmitFile_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hsocket = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* hfile = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t nnumberofbytestowrite = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t nnumberofbytespersend = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* lpoverlapped = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* lptransmitbuffers = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    uint32_t dwreserved = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mswsock.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "TransmitFile")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hsocket, hfile, nnumberofbytestowrite, nnumberofbytespersend, lpoverlapped, lptransmitbuffers, dwreserved) : -1;
#else
    (void)hsocket;
    (void)hfile;
    (void)nnumberofbytestowrite;
    (void)nnumberofbytespersend;
    (void)lpoverlapped;
    (void)lptransmitbuffers;
    (void)dwreserved;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winsock_WPUCompleteOverlappedRequest_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t s = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* lpoverlapped = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwerror = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t cbtransferred = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* lperrno = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WPUCompleteOverlappedRequest")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(s, lpoverlapped, dwerror, cbtransferred, lperrno) : -1;
#else
    (void)s;
    (void)lpoverlapped;
    (void)dwerror;
    (void)cbtransferred;
    (void)lperrno;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winsock_WSAAccept_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t s = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* addr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* addrlen = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* lpfncondition = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint64_t dwcallbackdata = km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0;
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(uint64_t, void*, void*, void*, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSAAccept")));
    }
    uint64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(s, addr, addrlen, lpfncondition, dwcallbackdata) : 0;
#else
    (void)s;
    (void)addr;
    (void)addrlen;
    (void)lpfncondition;
    (void)dwcallbackdata;
    uint64_t km_res = 0;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<uint64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_networking_winsock_WSAAddressToStringA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpsaaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwaddresslength = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* lpprotocolinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* lpszaddressstring = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* lpdwaddressstringlength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSAAddressToStringA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpsaaddress, dwaddresslength, lpprotocolinfo, lpszaddressstring, lpdwaddressstringlength) : -1;
#else
    (void)lpsaaddress;
    (void)dwaddresslength;
    (void)lpprotocolinfo;
    (void)lpszaddressstring;
    (void)lpdwaddressstringlength;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winsock_WSAAddressToStringW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpsaaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwaddresslength = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* lpprotocolinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* lpszaddressstring = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* lpdwaddressstringlength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSAAddressToStringW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpsaaddress, dwaddresslength, lpprotocolinfo, lpszaddressstring, lpdwaddressstringlength) : -1;
#else
    (void)lpsaaddress;
    (void)dwaddresslength;
    (void)lpprotocolinfo;
    (void)lpszaddressstring;
    (void)lpdwaddressstringlength;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winsock_WSAAdvertiseProvider_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* puuidproviderid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pnspv2routine = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSAAdvertiseProvider")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(puuidproviderid, pnspv2routine) : -1;
#else
    (void)puuidproviderid;
    (void)pnspv2routine;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winsock_WSAAsyncGetHostByAddr_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hwnd = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t wmsg = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* addr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int32_t len = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    int32_t type = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* buf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    int32_t buflen = static_cast<int32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, void*, int32_t, int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSAAsyncGetHostByAddr")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hwnd, wmsg, addr, len, type, buf, buflen) : NULL;
#else
    (void)hwnd;
    (void)wmsg;
    (void)addr;
    (void)len;
    (void)type;
    (void)buf;
    (void)buflen;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_networking_winsock_WSAAsyncGetHostByName_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hwnd = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t wmsg = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* name = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* buf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    int32_t buflen = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSAAsyncGetHostByName")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hwnd, wmsg, name, buf, buflen) : NULL;
#else
    (void)hwnd;
    (void)wmsg;
    (void)name;
    (void)buf;
    (void)buflen;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_networking_winsock_WSAAsyncGetProtoByName_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hwnd = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t wmsg = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* name = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* buf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    int32_t buflen = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSAAsyncGetProtoByName")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hwnd, wmsg, name, buf, buflen) : NULL;
#else
    (void)hwnd;
    (void)wmsg;
    (void)name;
    (void)buf;
    (void)buflen;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_networking_winsock_WSAAsyncGetProtoByNumber_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hwnd = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t wmsg = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t number = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* buf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    int32_t buflen = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSAAsyncGetProtoByNumber")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hwnd, wmsg, number, buf, buflen) : NULL;
#else
    (void)hwnd;
    (void)wmsg;
    (void)number;
    (void)buf;
    (void)buflen;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_networking_winsock_WSAAsyncGetServByName_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hwnd = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t wmsg = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* name = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* proto = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* buf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    int32_t buflen = static_cast<int32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSAAsyncGetServByName")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hwnd, wmsg, name, proto, buf, buflen) : NULL;
#else
    (void)hwnd;
    (void)wmsg;
    (void)name;
    (void)proto;
    (void)buf;
    (void)buflen;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_networking_winsock_WSAAsyncGetServByPort_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hwnd = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t wmsg = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t port = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* proto = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* buf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    int32_t buflen = static_cast<int32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, int32_t, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSAAsyncGetServByPort")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hwnd, wmsg, port, proto, buf, buflen) : NULL;
#else
    (void)hwnd;
    (void)wmsg;
    (void)port;
    (void)proto;
    (void)buf;
    (void)buflen;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_networking_winsock_WSAAsyncSelect_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t s = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* hwnd = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t wmsg = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t levent = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSAAsyncSelect")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(s, hwnd, wmsg, levent) : -1;
#else
    (void)s;
    (void)hwnd;
    (void)wmsg;
    (void)levent;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winsock_WSACancelAsyncRequest_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hasynctaskhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSACancelAsyncRequest")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hasynctaskhandle) : -1;
#else
    (void)hasynctaskhandle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winsock_WSACancelBlockingCall_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSACancelBlockingCall")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winsock_WSACleanup_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSACleanup")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winsock_WSACloseEvent_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hevent = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSACloseEvent")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hevent) : -1;
#else
    (void)hevent;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winsock_WSAConnect_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t s = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* name = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t namelen = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* lpcallerdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* lpcalleedata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* lpsqos = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* lpgqos = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, int32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSAConnect")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(s, name, namelen, lpcallerdata, lpcalleedata, lpsqos, lpgqos) : -1;
#else
    (void)s;
    (void)name;
    (void)namelen;
    (void)lpcallerdata;
    (void)lpcalleedata;
    (void)lpsqos;
    (void)lpgqos;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winsock_WSAConnectByList_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t s = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* socketaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* localaddresslength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* localaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* remoteaddresslength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* remoteaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* timeout = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* reserved = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSAConnectByList")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(s, socketaddress, localaddresslength, localaddress, remoteaddresslength, remoteaddress, timeout, reserved) : -1;
#else
    (void)s;
    (void)socketaddress;
    (void)localaddresslength;
    (void)localaddress;
    (void)remoteaddresslength;
    (void)remoteaddress;
    (void)timeout;
    (void)reserved;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winsock_WSAConnectByNameA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t s = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* nodename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* servicename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* localaddresslength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* localaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* remoteaddresslength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* remoteaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* timeout = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    void* reserved = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSAConnectByNameA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(s, nodename, servicename, localaddresslength, localaddress, remoteaddresslength, remoteaddress, timeout, reserved) : -1;
#else
    (void)s;
    (void)nodename;
    (void)servicename;
    (void)localaddresslength;
    (void)localaddress;
    (void)remoteaddresslength;
    (void)remoteaddress;
    (void)timeout;
    (void)reserved;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winsock_WSAConnectByNameW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t s = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* nodename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* servicename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* localaddresslength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* localaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* remoteaddresslength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* remoteaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* timeout = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    void* reserved = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSAConnectByNameW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(s, nodename, servicename, localaddresslength, localaddress, remoteaddresslength, remoteaddress, timeout, reserved) : -1;
#else
    (void)s;
    (void)nodename;
    (void)servicename;
    (void)localaddresslength;
    (void)localaddress;
    (void)remoteaddresslength;
    (void)remoteaddress;
    (void)timeout;
    (void)reserved;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winsock_WSACreateEvent_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSACreateEvent")));
    }
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr() : -1;
#else
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_networking_winsock_WSADeleteSocketPeerTargetName_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t arg_0_socket = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* peeraddr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t peeraddrlen = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* overlapped = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* completionroutine = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSADeleteSocketPeerTargetName")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(arg_0_socket, peeraddr, peeraddrlen, overlapped, completionroutine) : -1;
#else
    (void)arg_0_socket;
    (void)peeraddr;
    (void)peeraddrlen;
    (void)overlapped;
    (void)completionroutine;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winsock_WSADuplicateSocketA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t s = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint32_t dwprocessid = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* lpprotocolinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSADuplicateSocketA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(s, dwprocessid, lpprotocolinfo) : -1;
#else
    (void)s;
    (void)dwprocessid;
    (void)lpprotocolinfo;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winsock_WSADuplicateSocketW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t s = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint32_t dwprocessid = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* lpprotocolinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSADuplicateSocketW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(s, dwprocessid, lpprotocolinfo) : -1;
#else
    (void)s;
    (void)dwprocessid;
    (void)lpprotocolinfo;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winsock_WSAEnumNameSpaceProvidersA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpdwbufferlength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpnspbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSAEnumNameSpaceProvidersA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpdwbufferlength, lpnspbuffer) : -1;
#else
    (void)lpdwbufferlength;
    (void)lpnspbuffer;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winsock_WSAEnumNameSpaceProvidersExA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpdwbufferlength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpnspbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSAEnumNameSpaceProvidersExA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpdwbufferlength, lpnspbuffer) : -1;
#else
    (void)lpdwbufferlength;
    (void)lpnspbuffer;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winsock_WSAEnumNameSpaceProvidersExW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpdwbufferlength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpnspbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSAEnumNameSpaceProvidersExW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpdwbufferlength, lpnspbuffer) : -1;
#else
    (void)lpdwbufferlength;
    (void)lpnspbuffer;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winsock_WSAEnumNameSpaceProvidersW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpdwbufferlength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpnspbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSAEnumNameSpaceProvidersW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpdwbufferlength, lpnspbuffer) : -1;
#else
    (void)lpdwbufferlength;
    (void)lpnspbuffer;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winsock_WSAEnumNetworkEvents_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t s = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    int64_t heventobject = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
    void* lpnetworkevents = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSAEnumNetworkEvents")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(s, heventobject, lpnetworkevents) : -1;
#else
    (void)s;
    (void)heventobject;
    (void)lpnetworkevents;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winsock_WSAEnumProtocolsA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpiprotocols = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpprotocolbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* lpdwbufferlength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSAEnumProtocolsA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpiprotocols, lpprotocolbuffer, lpdwbufferlength) : -1;
#else
    (void)lpiprotocols;
    (void)lpprotocolbuffer;
    (void)lpdwbufferlength;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winsock_WSAEnumProtocolsW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpiprotocols = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpprotocolbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* lpdwbufferlength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSAEnumProtocolsW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpiprotocols, lpprotocolbuffer, lpdwbufferlength) : -1;
#else
    (void)lpiprotocols;
    (void)lpprotocolbuffer;
    (void)lpdwbufferlength;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winsock_WSAEventSelect_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t s = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    int64_t heventobject = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
    int32_t lnetworkevents = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, int64_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSAEventSelect")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(s, heventobject, lnetworkevents) : -1;
#else
    (void)s;
    (void)heventobject;
    (void)lnetworkevents;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winsock_WSAGetLastError_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSAGetLastError")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winsock_WSAGetOverlappedResult_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t s = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* lpoverlapped = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* lpcbtransfer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int32_t fwait = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* lpdwflags = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSAGetOverlappedResult")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(s, lpoverlapped, lpcbtransfer, fwait, lpdwflags) : -1;
#else
    (void)s;
    (void)lpoverlapped;
    (void)lpcbtransfer;
    (void)fwait;
    (void)lpdwflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winsock_WSAGetQOSByName_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t s = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* lpqosname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* lpqos = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSAGetQOSByName")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(s, lpqosname, lpqos) : -1;
#else
    (void)s;
    (void)lpqosname;
    (void)lpqos;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winsock_WSAGetServiceClassInfoA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpproviderid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpserviceclassid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* lpdwbufsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* lpserviceclassinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSAGetServiceClassInfoA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpproviderid, lpserviceclassid, lpdwbufsize, lpserviceclassinfo) : -1;
#else
    (void)lpproviderid;
    (void)lpserviceclassid;
    (void)lpdwbufsize;
    (void)lpserviceclassinfo;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winsock_WSAGetServiceClassInfoW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpproviderid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpserviceclassid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* lpdwbufsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* lpserviceclassinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSAGetServiceClassInfoW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpproviderid, lpserviceclassid, lpdwbufsize, lpserviceclassinfo) : -1;
#else
    (void)lpproviderid;
    (void)lpserviceclassid;
    (void)lpdwbufsize;
    (void)lpserviceclassinfo;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winsock_WSAGetServiceClassNameByClassIdA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpserviceclassid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpszserviceclassname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* lpdwbufferlength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSAGetServiceClassNameByClassIdA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpserviceclassid, lpszserviceclassname, lpdwbufferlength) : -1;
#else
    (void)lpserviceclassid;
    (void)lpszserviceclassname;
    (void)lpdwbufferlength;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winsock_WSAGetServiceClassNameByClassIdW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpserviceclassid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpszserviceclassname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* lpdwbufferlength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSAGetServiceClassNameByClassIdW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpserviceclassid, lpszserviceclassname, lpdwbufferlength) : -1;
#else
    (void)lpserviceclassid;
    (void)lpszserviceclassname;
    (void)lpdwbufferlength;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winsock_WSAHtonl_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t s = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint32_t hostlong = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* lpnetlong = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSAHtonl")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(s, hostlong, lpnetlong) : -1;
#else
    (void)s;
    (void)hostlong;
    (void)lpnetlong;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winsock_WSAHtons_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t s = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint16_t hostshort = static_cast<uint16_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* lpnetshort = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint16_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSAHtons")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(s, hostshort, lpnetshort) : -1;
#else
    (void)s;
    (void)hostshort;
    (void)lpnetshort;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winsock_WSAImpersonateSocketPeer_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t arg_0_socket = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* peeraddr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t peeraddrlen = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSAImpersonateSocketPeer")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(arg_0_socket, peeraddr, peeraddrlen) : -1;
#else
    (void)arg_0_socket;
    (void)peeraddr;
    (void)peeraddrlen;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winsock_WSAInstallServiceClassA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpserviceclassinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSAInstallServiceClassA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpserviceclassinfo) : -1;
#else
    (void)lpserviceclassinfo;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winsock_WSAInstallServiceClassW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpserviceclassinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSAInstallServiceClassW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpserviceclassinfo) : -1;
#else
    (void)lpserviceclassinfo;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winsock_WSAIoctl_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t s = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint32_t dwiocontrolcode = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* lpvinbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t cbinbuffer = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* lpvoutbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t cboutbuffer = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* lpcbbytesreturned = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* lpoverlapped = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    void* lpcompletionroutine = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSAIoctl")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(s, dwiocontrolcode, lpvinbuffer, cbinbuffer, lpvoutbuffer, cboutbuffer, lpcbbytesreturned, lpoverlapped, lpcompletionroutine) : -1;
#else
    (void)s;
    (void)dwiocontrolcode;
    (void)lpvinbuffer;
    (void)cbinbuffer;
    (void)lpvoutbuffer;
    (void)cboutbuffer;
    (void)lpcbbytesreturned;
    (void)lpoverlapped;
    (void)lpcompletionroutine;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winsock_WSAIsBlocking_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSAIsBlocking")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winsock_WSAJoinLeaf_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t s = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* name = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t namelen = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* lpcallerdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* lpcalleedata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* lpsqos = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* lpgqos = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 7 ? km_info[7].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(uint64_t, void*, int32_t, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSAJoinLeaf")));
    }
    uint64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(s, name, namelen, lpcallerdata, lpcalleedata, lpsqos, lpgqos, dwflags) : 0;
#else
    (void)s;
    (void)name;
    (void)namelen;
    (void)lpcallerdata;
    (void)lpcalleedata;
    (void)lpsqos;
    (void)lpgqos;
    (void)dwflags;
    uint64_t km_res = 0;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<uint64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_networking_winsock_WSALookupServiceBeginA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpqsrestrictions = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwcontrolflags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* lphlookup = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSALookupServiceBeginA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpqsrestrictions, dwcontrolflags, lphlookup) : -1;
#else
    (void)lpqsrestrictions;
    (void)dwcontrolflags;
    (void)lphlookup;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winsock_WSALookupServiceBeginW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpqsrestrictions = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwcontrolflags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* lphlookup = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSALookupServiceBeginW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpqsrestrictions, dwcontrolflags, lphlookup) : -1;
#else
    (void)lpqsrestrictions;
    (void)dwcontrolflags;
    (void)lphlookup;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winsock_WSALookupServiceEnd_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hlookup = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSALookupServiceEnd")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hlookup) : -1;
#else
    (void)hlookup;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winsock_WSALookupServiceNextA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hlookup = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwcontrolflags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* lpdwbufferlength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* lpqsresults = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSALookupServiceNextA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hlookup, dwcontrolflags, lpdwbufferlength, lpqsresults) : -1;
#else
    (void)hlookup;
    (void)dwcontrolflags;
    (void)lpdwbufferlength;
    (void)lpqsresults;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winsock_WSALookupServiceNextW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hlookup = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwcontrolflags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* lpdwbufferlength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* lpqsresults = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSALookupServiceNextW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hlookup, dwcontrolflags, lpdwbufferlength, lpqsresults) : -1;
#else
    (void)hlookup;
    (void)dwcontrolflags;
    (void)lpdwbufferlength;
    (void)lpqsresults;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winsock_WSANSPIoctl_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hlookup = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwcontrolcode = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* lpvinbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t cbinbuffer = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* lpvoutbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t cboutbuffer = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* lpcbbytesreturned = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* lpcompletion = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSANSPIoctl")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hlookup, dwcontrolcode, lpvinbuffer, cbinbuffer, lpvoutbuffer, cboutbuffer, lpcbbytesreturned, lpcompletion) : -1;
#else
    (void)hlookup;
    (void)dwcontrolcode;
    (void)lpvinbuffer;
    (void)cbinbuffer;
    (void)lpvoutbuffer;
    (void)cboutbuffer;
    (void)lpcbbytesreturned;
    (void)lpcompletion;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winsock_WSANtohl_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t s = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint32_t netlong = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* lphostlong = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSANtohl")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(s, netlong, lphostlong) : -1;
#else
    (void)s;
    (void)netlong;
    (void)lphostlong;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winsock_WSANtohs_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t s = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint16_t netshort = static_cast<uint16_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* lphostshort = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint16_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSANtohs")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(s, netshort, lphostshort) : -1;
#else
    (void)s;
    (void)netshort;
    (void)lphostshort;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winsock_WSAPoll_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* fdarray = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t fds = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t timeout = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSAPoll")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(fdarray, fds, timeout) : -1;
#else
    (void)fdarray;
    (void)fds;
    (void)timeout;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winsock_WSAProviderCompleteAsyncCall_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hasynccall = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t iretcode = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSAProviderCompleteAsyncCall")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hasynccall, iretcode) : -1;
#else
    (void)hasynccall;
    (void)iretcode;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winsock_WSAProviderConfigChange_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpnotificationhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpoverlapped = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* lpcompletionroutine = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSAProviderConfigChange")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpnotificationhandle, lpoverlapped, lpcompletionroutine) : -1;
#else
    (void)lpnotificationhandle;
    (void)lpoverlapped;
    (void)lpcompletionroutine;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winsock_WSAQuerySocketSecurity_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t arg_0_socket = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* securityquerytemplate = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t securityquerytemplatelen = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* securityqueryinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* securityqueryinfolen = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* overlapped = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* completionroutine = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSAQuerySocketSecurity")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(arg_0_socket, securityquerytemplate, securityquerytemplatelen, securityqueryinfo, securityqueryinfolen, overlapped, completionroutine) : -1;
#else
    (void)arg_0_socket;
    (void)securityquerytemplate;
    (void)securityquerytemplatelen;
    (void)securityqueryinfo;
    (void)securityqueryinfolen;
    (void)overlapped;
    (void)completionroutine;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winsock_WSARecv_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t s = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* lpbuffers = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwbuffercount = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* lpnumberofbytesrecvd = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* lpflags = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* lpoverlapped = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* lpcompletionroutine = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSARecv")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(s, lpbuffers, dwbuffercount, lpnumberofbytesrecvd, lpflags, lpoverlapped, lpcompletionroutine) : -1;
#else
    (void)s;
    (void)lpbuffers;
    (void)dwbuffercount;
    (void)lpnumberofbytesrecvd;
    (void)lpflags;
    (void)lpoverlapped;
    (void)lpcompletionroutine;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winsock_WSARecvDisconnect_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t s = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* lpinbounddisconnectdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSARecvDisconnect")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(s, lpinbounddisconnectdata) : -1;
#else
    (void)s;
    (void)lpinbounddisconnectdata;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winsock_WSARecvEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t s = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* buf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t len = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* flags = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mswsock.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSARecvEx")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(s, buf, len, flags) : -1;
#else
    (void)s;
    (void)buf;
    (void)len;
    (void)flags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winsock_WSARecvFrom_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t s = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* lpbuffers = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwbuffercount = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* lpnumberofbytesrecvd = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* lpflags = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* lpfrom = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* lpfromlen = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* lpoverlapped = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    void* lpcompletionroutine = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSARecvFrom")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(s, lpbuffers, dwbuffercount, lpnumberofbytesrecvd, lpflags, lpfrom, lpfromlen, lpoverlapped, lpcompletionroutine) : -1;
#else
    (void)s;
    (void)lpbuffers;
    (void)dwbuffercount;
    (void)lpnumberofbytesrecvd;
    (void)lpflags;
    (void)lpfrom;
    (void)lpfromlen;
    (void)lpoverlapped;
    (void)lpcompletionroutine;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winsock_WSARemoveServiceClass_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpserviceclassid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSARemoveServiceClass")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpserviceclassid) : -1;
#else
    (void)lpserviceclassid;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winsock_WSAResetEvent_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hevent = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSAResetEvent")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hevent) : -1;
#else
    (void)hevent;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winsock_WSARevertImpersonation_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSARevertImpersonation")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winsock_WSASend_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t s = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* lpbuffers = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwbuffercount = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* lpnumberofbytessent = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* lpoverlapped = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* lpcompletionroutine = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSASend")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(s, lpbuffers, dwbuffercount, lpnumberofbytessent, dwflags, lpoverlapped, lpcompletionroutine) : -1;
#else
    (void)s;
    (void)lpbuffers;
    (void)dwbuffercount;
    (void)lpnumberofbytessent;
    (void)dwflags;
    (void)lpoverlapped;
    (void)lpcompletionroutine;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winsock_WSASendDisconnect_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t s = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* lpoutbounddisconnectdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSASendDisconnect")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(s, lpoutbounddisconnectdata) : -1;
#else
    (void)s;
    (void)lpoutbounddisconnectdata;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winsock_WSASendMsg_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t handle = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* lpmsg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* lpnumberofbytessent = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* lpoverlapped = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* lpcompletionroutine = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSASendMsg")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(handle, lpmsg, dwflags, lpnumberofbytessent, lpoverlapped, lpcompletionroutine) : -1;
#else
    (void)handle;
    (void)lpmsg;
    (void)dwflags;
    (void)lpnumberofbytessent;
    (void)lpoverlapped;
    (void)lpcompletionroutine;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winsock_WSASendTo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t s = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* lpbuffers = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwbuffercount = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* lpnumberofbytessent = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* lpto = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    int32_t itolen = static_cast<int32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    void* lpoverlapped = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    void* lpcompletionroutine = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, void*, uint32_t, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSASendTo")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(s, lpbuffers, dwbuffercount, lpnumberofbytessent, dwflags, lpto, itolen, lpoverlapped, lpcompletionroutine) : -1;
#else
    (void)s;
    (void)lpbuffers;
    (void)dwbuffercount;
    (void)lpnumberofbytessent;
    (void)dwflags;
    (void)lpto;
    (void)itolen;
    (void)lpoverlapped;
    (void)lpcompletionroutine;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winsock_WSASetEvent_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hevent = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSASetEvent")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hevent) : -1;
#else
    (void)hevent;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winsock_WSASetLastError_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t ierror = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSASetLastError")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(ierror);
#else
    (void)ierror;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_networking_winsock_WSASetServiceA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpqsreginfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t essoperation = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t dwcontrolflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSASetServiceA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpqsreginfo, essoperation, dwcontrolflags) : -1;
#else
    (void)lpqsreginfo;
    (void)essoperation;
    (void)dwcontrolflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winsock_WSASetServiceW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpqsreginfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t essoperation = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t dwcontrolflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSASetServiceW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpqsreginfo, essoperation, dwcontrolflags) : -1;
#else
    (void)lpqsreginfo;
    (void)essoperation;
    (void)dwcontrolflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winsock_WSASetSocketPeerTargetName_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t arg_0_socket = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* peertargetname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t peertargetnamelen = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* overlapped = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* completionroutine = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSASetSocketPeerTargetName")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(arg_0_socket, peertargetname, peertargetnamelen, overlapped, completionroutine) : -1;
#else
    (void)arg_0_socket;
    (void)peertargetname;
    (void)peertargetnamelen;
    (void)overlapped;
    (void)completionroutine;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winsock_WSASetSocketSecurity_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t arg_0_socket = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* securitysettings = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t securitysettingslen = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* overlapped = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* completionroutine = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSASetSocketSecurity")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(arg_0_socket, securitysettings, securitysettingslen, overlapped, completionroutine) : -1;
#else
    (void)arg_0_socket;
    (void)securitysettings;
    (void)securitysettingslen;
    (void)overlapped;
    (void)completionroutine;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winsock_WSASocketA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t af = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    int32_t type = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t protocol = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* lpprotocolinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t g = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(int32_t, int32_t, int32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSASocketA")));
    }
    uint64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(af, type, protocol, lpprotocolinfo, g, dwflags) : 0;
#else
    (void)af;
    (void)type;
    (void)protocol;
    (void)lpprotocolinfo;
    (void)g;
    (void)dwflags;
    uint64_t km_res = 0;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<uint64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_networking_winsock_WSASocketW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t af = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    int32_t type = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t protocol = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* lpprotocolinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t g = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(int32_t, int32_t, int32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSASocketW")));
    }
    uint64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(af, type, protocol, lpprotocolinfo, g, dwflags) : 0;
#else
    (void)af;
    (void)type;
    (void)protocol;
    (void)lpprotocolinfo;
    (void)g;
    (void)dwflags;
    uint64_t km_res = 0;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<uint64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_networking_winsock_WSAStartup_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint16_t wversionrequested = static_cast<uint16_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* lpwsadata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint16_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSAStartup")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(wversionrequested, lpwsadata) : -1;
#else
    (void)wversionrequested;
    (void)lpwsadata;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winsock_WSAStringToAddressA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* addressstring = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t addressfamily = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* lpprotocolinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* lpaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* lpaddresslength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSAStringToAddressA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(addressstring, addressfamily, lpprotocolinfo, lpaddress, lpaddresslength) : -1;
#else
    (void)addressstring;
    (void)addressfamily;
    (void)lpprotocolinfo;
    (void)lpaddress;
    (void)lpaddresslength;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winsock_WSAStringToAddressW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* addressstring = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t addressfamily = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* lpprotocolinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* lpaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* lpaddresslength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSAStringToAddressW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(addressstring, addressfamily, lpprotocolinfo, lpaddress, lpaddresslength) : -1;
#else
    (void)addressstring;
    (void)addressfamily;
    (void)lpprotocolinfo;
    (void)lpaddress;
    (void)lpaddresslength;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winsock_WSAUnadvertiseProvider_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* puuidproviderid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSAUnadvertiseProvider")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(puuidproviderid) : -1;
#else
    (void)puuidproviderid;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winsock_WSAUnhookBlockingHook_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSAUnhookBlockingHook")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winsock_WSAWaitForMultipleEvents_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t cevents = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* lphevents = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t fwaitall = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t dwtimeout = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    int32_t falertable = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, int32_t, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSAWaitForMultipleEvents")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(cevents, lphevents, fwaitall, dwtimeout, falertable) : 0;
#else
    (void)cevents;
    (void)lphevents;
    (void)fwaitall;
    (void)dwtimeout;
    (void)falertable;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winsock_WSCDeinstallProvider_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpproviderid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lperrno = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSCDeinstallProvider")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpproviderid, lperrno) : -1;
#else
    (void)lpproviderid;
    (void)lperrno;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winsock_WSCDeinstallProvider32_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpproviderid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lperrno = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSCDeinstallProvider32")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpproviderid, lperrno) : -1;
#else
    (void)lpproviderid;
    (void)lperrno;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winsock_WSCEnableNSProvider_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpproviderid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t fenable = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSCEnableNSProvider")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpproviderid, fenable) : -1;
#else
    (void)lpproviderid;
    (void)fenable;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winsock_WSCEnableNSProvider32_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpproviderid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t fenable = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSCEnableNSProvider32")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpproviderid, fenable) : -1;
#else
    (void)lpproviderid;
    (void)fenable;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winsock_WSCEnumNameSpaceProviders32_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpdwbufferlength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpnspbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSCEnumNameSpaceProviders32")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpdwbufferlength, lpnspbuffer) : -1;
#else
    (void)lpdwbufferlength;
    (void)lpnspbuffer;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winsock_WSCEnumNameSpaceProvidersEx32_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpdwbufferlength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpnspbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSCEnumNameSpaceProvidersEx32")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpdwbufferlength, lpnspbuffer) : -1;
#else
    (void)lpdwbufferlength;
    (void)lpnspbuffer;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winsock_WSCEnumProtocols_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpiprotocols = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpprotocolbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* lpdwbufferlength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* lperrno = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSCEnumProtocols")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpiprotocols, lpprotocolbuffer, lpdwbufferlength, lperrno) : -1;
#else
    (void)lpiprotocols;
    (void)lpprotocolbuffer;
    (void)lpdwbufferlength;
    (void)lperrno;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winsock_WSCEnumProtocols32_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpiprotocols = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpprotocolbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* lpdwbufferlength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* lperrno = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSCEnumProtocols32")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpiprotocols, lpprotocolbuffer, lpdwbufferlength, lperrno) : -1;
#else
    (void)lpiprotocols;
    (void)lpprotocolbuffer;
    (void)lpdwbufferlength;
    (void)lperrno;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winsock_WSCGetApplicationCategory_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* path = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t pathlength = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* extra = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t extralength = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* ppermittedlspcategories = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* lperrno = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSCGetApplicationCategory")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(path, pathlength, extra, extralength, ppermittedlspcategories, lperrno) : -1;
#else
    (void)path;
    (void)pathlength;
    (void)extra;
    (void)extralength;
    (void)ppermittedlspcategories;
    (void)lperrno;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winsock_WSCGetProviderInfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpproviderid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t infotype = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* info = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* infosize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* lperrno = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSCGetProviderInfo")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpproviderid, infotype, info, infosize, flags, lperrno) : -1;
#else
    (void)lpproviderid;
    (void)infotype;
    (void)info;
    (void)infosize;
    (void)flags;
    (void)lperrno;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winsock_WSCGetProviderInfo32_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpproviderid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t infotype = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* info = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* infosize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* lperrno = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSCGetProviderInfo32")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpproviderid, infotype, info, infosize, flags, lperrno) : -1;
#else
    (void)lpproviderid;
    (void)infotype;
    (void)info;
    (void)infosize;
    (void)flags;
    (void)lperrno;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winsock_WSCGetProviderPath_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpproviderid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpszproviderdllpath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* lpproviderdllpathlen = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* lperrno = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSCGetProviderPath")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpproviderid, lpszproviderdllpath, lpproviderdllpathlen, lperrno) : -1;
#else
    (void)lpproviderid;
    (void)lpszproviderdllpath;
    (void)lpproviderdllpathlen;
    (void)lperrno;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winsock_WSCGetProviderPath32_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpproviderid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpszproviderdllpath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* lpproviderdllpathlen = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* lperrno = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSCGetProviderPath32")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpproviderid, lpszproviderdllpath, lpproviderdllpathlen, lperrno) : -1;
#else
    (void)lpproviderid;
    (void)lpszproviderdllpath;
    (void)lpproviderdllpathlen;
    (void)lperrno;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winsock_WSCInstallNameSpace_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpszidentifier = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpszpathname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwnamespace = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t dwversion = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* lpproviderid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSCInstallNameSpace")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpszidentifier, lpszpathname, dwnamespace, dwversion, lpproviderid) : -1;
#else
    (void)lpszidentifier;
    (void)lpszpathname;
    (void)dwnamespace;
    (void)dwversion;
    (void)lpproviderid;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winsock_WSCInstallNameSpace32_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpszidentifier = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpszpathname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwnamespace = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t dwversion = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* lpproviderid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSCInstallNameSpace32")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpszidentifier, lpszpathname, dwnamespace, dwversion, lpproviderid) : -1;
#else
    (void)lpszidentifier;
    (void)lpszpathname;
    (void)dwnamespace;
    (void)dwversion;
    (void)lpproviderid;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winsock_WSCInstallNameSpaceEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpszidentifier = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpszpathname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwnamespace = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t dwversion = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* lpproviderid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* lpproviderspecific = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSCInstallNameSpaceEx")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpszidentifier, lpszpathname, dwnamespace, dwversion, lpproviderid, lpproviderspecific) : -1;
#else
    (void)lpszidentifier;
    (void)lpszpathname;
    (void)dwnamespace;
    (void)dwversion;
    (void)lpproviderid;
    (void)lpproviderspecific;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winsock_WSCInstallNameSpaceEx32_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpszidentifier = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpszpathname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwnamespace = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t dwversion = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* lpproviderid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* lpproviderspecific = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSCInstallNameSpaceEx32")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpszidentifier, lpszpathname, dwnamespace, dwversion, lpproviderid, lpproviderspecific) : -1;
#else
    (void)lpszidentifier;
    (void)lpszpathname;
    (void)dwnamespace;
    (void)dwversion;
    (void)lpproviderid;
    (void)lpproviderspecific;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winsock_WSCInstallProvider_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpproviderid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpszproviderdllpath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* lpprotocolinfolist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t dwnumberofentries = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* lperrno = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSCInstallProvider")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpproviderid, lpszproviderdllpath, lpprotocolinfolist, dwnumberofentries, lperrno) : -1;
#else
    (void)lpproviderid;
    (void)lpszproviderdllpath;
    (void)lpprotocolinfolist;
    (void)dwnumberofentries;
    (void)lperrno;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winsock_WSCInstallProvider64_32_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpproviderid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpszproviderdllpath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* lpprotocolinfolist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t dwnumberofentries = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* lperrno = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSCInstallProvider64_32")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpproviderid, lpszproviderdllpath, lpprotocolinfolist, dwnumberofentries, lperrno) : -1;
#else
    (void)lpproviderid;
    (void)lpszproviderdllpath;
    (void)lpprotocolinfolist;
    (void)dwnumberofentries;
    (void)lperrno;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winsock_WSCInstallProviderAndChains64_32_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpproviderid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpszproviderdllpath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* lpszproviderdllpath32 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* lpszlspname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t dwserviceflags = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* lpprotocolinfolist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    uint32_t dwnumberofentries = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    void* lpdwcatalogentryid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    void* lperrno = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSCInstallProviderAndChains64_32")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpproviderid, lpszproviderdllpath, lpszproviderdllpath32, lpszlspname, dwserviceflags, lpprotocolinfolist, dwnumberofentries, lpdwcatalogentryid, lperrno) : -1;
#else
    (void)lpproviderid;
    (void)lpszproviderdllpath;
    (void)lpszproviderdllpath32;
    (void)lpszlspname;
    (void)dwserviceflags;
    (void)lpprotocolinfolist;
    (void)dwnumberofentries;
    (void)lpdwcatalogentryid;
    (void)lperrno;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winsock_WSCSetApplicationCategory_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* path = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t pathlength = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* extra = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t extralength = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t permittedlspcategories = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* pprevpermlspcat = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* lperrno = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSCSetApplicationCategory")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(path, pathlength, extra, extralength, permittedlspcategories, pprevpermlspcat, lperrno) : -1;
#else
    (void)path;
    (void)pathlength;
    (void)extra;
    (void)extralength;
    (void)permittedlspcategories;
    (void)pprevpermlspcat;
    (void)lperrno;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winsock_WSCSetProviderInfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpproviderid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t infotype = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* info = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint64_t infosize = km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0;
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* lperrno = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSCSetProviderInfo")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpproviderid, infotype, info, infosize, flags, lperrno) : -1;
#else
    (void)lpproviderid;
    (void)infotype;
    (void)info;
    (void)infosize;
    (void)flags;
    (void)lperrno;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winsock_WSCSetProviderInfo32_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpproviderid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t infotype = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* info = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint64_t infosize = km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0;
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* lperrno = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSCSetProviderInfo32")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpproviderid, infotype, info, infosize, flags, lperrno) : -1;
#else
    (void)lpproviderid;
    (void)infotype;
    (void)info;
    (void)infosize;
    (void)flags;
    (void)lperrno;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winsock_WSCUnInstallNameSpace_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpproviderid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSCUnInstallNameSpace")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpproviderid) : -1;
#else
    (void)lpproviderid;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winsock_WSCUnInstallNameSpace32_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpproviderid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSCUnInstallNameSpace32")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpproviderid) : -1;
#else
    (void)lpproviderid;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winsock_WSCUpdateProvider_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpproviderid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpszproviderdllpath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* lpprotocolinfolist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t dwnumberofentries = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* lperrno = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSCUpdateProvider")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpproviderid, lpszproviderdllpath, lpprotocolinfolist, dwnumberofentries, lperrno) : -1;
#else
    (void)lpproviderid;
    (void)lpszproviderdllpath;
    (void)lpprotocolinfolist;
    (void)dwnumberofentries;
    (void)lperrno;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winsock_WSCUpdateProvider32_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpproviderid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpszproviderdllpath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* lpprotocolinfolist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t dwnumberofentries = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* lperrno = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSCUpdateProvider32")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpproviderid, lpszproviderdllpath, lpprotocolinfolist, dwnumberofentries, lperrno) : -1;
#else
    (void)lpproviderid;
    (void)lpszproviderdllpath;
    (void)lpprotocolinfolist;
    (void)dwnumberofentries;
    (void)lperrno;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winsock_WSCWriteNameSpaceOrder_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpproviderid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwnumberofentries = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSCWriteNameSpaceOrder")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpproviderid, dwnumberofentries) : -1;
#else
    (void)lpproviderid;
    (void)dwnumberofentries;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winsock_WSCWriteNameSpaceOrder32_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpproviderid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwnumberofentries = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSCWriteNameSpaceOrder32")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpproviderid, dwnumberofentries) : -1;
#else
    (void)lpproviderid;
    (void)dwnumberofentries;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winsock_WSCWriteProviderOrder_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpwdcatalogentryid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwnumberofentries = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSCWriteProviderOrder")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpwdcatalogentryid, dwnumberofentries) : -1;
#else
    (void)lpwdcatalogentryid;
    (void)dwnumberofentries;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winsock_WSCWriteProviderOrder32_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpwdcatalogentryid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwnumberofentries = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSCWriteProviderOrder32")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpwdcatalogentryid, dwnumberofentries) : -1;
#else
    (void)lpwdcatalogentryid;
    (void)dwnumberofentries;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winsock___WSAFDIsSet_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t fd = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* param1 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "__WSAFDIsSet")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(fd, param1) : -1;
#else
    (void)fd;
    (void)param1;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winsock_accept_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t s = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* addr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* addrlen = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "accept")));
    }
    uint64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(s, addr, addrlen) : 0;
#else
    (void)s;
    (void)addr;
    (void)addrlen;
    uint64_t km_res = 0;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<uint64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_networking_winsock_bind_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t s = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* name = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t namelen = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "bind")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(s, name, namelen) : -1;
#else
    (void)s;
    (void)name;
    (void)namelen;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winsock_closesocket_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t s = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "closesocket")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(s) : -1;
#else
    (void)s;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winsock_connect_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t s = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* name = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t namelen = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "connect")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(s, name, namelen) : -1;
#else
    (void)s;
    (void)name;
    (void)namelen;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winsock_freeaddrinfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* paddrinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "freeaddrinfo")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(paddrinfo);
#else
    (void)paddrinfo;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_networking_winsock_getaddrinfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pnodename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pservicename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* phints = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* ppresult = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "getaddrinfo")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pnodename, pservicename, phints, ppresult) : -1;
#else
    (void)pnodename;
    (void)pservicename;
    (void)phints;
    (void)ppresult;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winsock_gethostbyaddr_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* addr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t len = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t type = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "gethostbyaddr")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(addr, len, type) : NULL;
#else
    (void)addr;
    (void)len;
    (void)type;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_networking_winsock_gethostbyname_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* name = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "gethostbyname")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(name) : NULL;
#else
    (void)name;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_networking_winsock_gethostname_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* name = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t namelen = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "gethostname")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(name, namelen) : -1;
#else
    (void)name;
    (void)namelen;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winsock_getnameinfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* psockaddr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t sockaddrlength = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pnodebuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t nodebuffersize = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* pservicebuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t servicebuffersize = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    int32_t flags = static_cast<int32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "getnameinfo")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(psockaddr, sockaddrlength, pnodebuffer, nodebuffersize, pservicebuffer, servicebuffersize, flags) : -1;
#else
    (void)psockaddr;
    (void)sockaddrlength;
    (void)pnodebuffer;
    (void)nodebuffersize;
    (void)pservicebuffer;
    (void)servicebuffersize;
    (void)flags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winsock_getpeername_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t s = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* name = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* namelen = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "getpeername")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(s, name, namelen) : -1;
#else
    (void)s;
    (void)name;
    (void)namelen;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winsock_getprotobyname_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* name = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "getprotobyname")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(name) : NULL;
#else
    (void)name;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_networking_winsock_getprotobynumber_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t number = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "getprotobynumber")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(number) : NULL;
#else
    (void)number;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_networking_winsock_getservbyname_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* name = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* proto = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "getservbyname")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(name, proto) : NULL;
#else
    (void)name;
    (void)proto;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_networking_winsock_getservbyport_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t port = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* proto = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "getservbyport")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(port, proto) : NULL;
#else
    (void)port;
    (void)proto;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_networking_winsock_getsockname_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t s = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* name = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* namelen = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "getsockname")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(s, name, namelen) : -1;
#else
    (void)s;
    (void)name;
    (void)namelen;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winsock_getsockopt_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t s = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    int32_t level = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t optname = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* optval = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* optlen = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, int32_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "getsockopt")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(s, level, optname, optval, optlen) : -1;
#else
    (void)s;
    (void)level;
    (void)optname;
    (void)optval;
    (void)optlen;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winsock_htonl_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t hostlong = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "htonl")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hostlong) : 0;
#else
    (void)hostlong;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winsock_htons_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint16_t hostshort = static_cast<uint16_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint16_t (__stdcall *km_fn_t)(uint16_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "htons")));
    }
    uint16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hostshort) : 0;
#else
    (void)hostshort;
    uint16_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winsock_inet_addr_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* cp = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "inet_addr")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(cp) : 0;
#else
    (void)cp;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winsock_inet_ntop_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t family = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* paddr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pstringbuf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint64_t stringbufsize = km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int32_t, void*, void*, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "inet_ntop")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(family, paddr, pstringbuf, stringbufsize) : NULL;
#else
    (void)family;
    (void)paddr;
    (void)pstringbuf;
    (void)stringbufsize;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_networking_winsock_inet_pton_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t family = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* pszaddrstring = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* paddrbuf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "inet_pton")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(family, pszaddrstring, paddrbuf) : -1;
#else
    (void)family;
    (void)pszaddrstring;
    (void)paddrbuf;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winsock_ioctlsocket_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t s = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    int32_t cmd = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* argp = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ioctlsocket")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(s, cmd, argp) : -1;
#else
    (void)s;
    (void)cmd;
    (void)argp;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winsock_listen_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t s = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    int32_t backlog = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "listen")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(s, backlog) : -1;
#else
    (void)s;
    (void)backlog;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winsock_ntohl_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t netlong = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ntohl")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(netlong) : 0;
#else
    (void)netlong;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winsock_ntohs_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint16_t netshort = static_cast<uint16_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint16_t (__stdcall *km_fn_t)(uint16_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ntohs")));
    }
    uint16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(netshort) : 0;
#else
    (void)netshort;
    uint16_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winsock_recv_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t s = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* buf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t len = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t flags = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "recv")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(s, buf, len, flags) : -1;
#else
    (void)s;
    (void)buf;
    (void)len;
    (void)flags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winsock_recvfrom_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t s = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* buf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t len = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t flags = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* from = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* fromlen = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, int32_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "recvfrom")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(s, buf, len, flags, from, fromlen) : -1;
#else
    (void)s;
    (void)buf;
    (void)len;
    (void)flags;
    (void)from;
    (void)fromlen;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winsock_select_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t nfds = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* readfds = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* writefds = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* exceptfds = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* timeout = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "select")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(nfds, readfds, writefds, exceptfds, timeout) : -1;
#else
    (void)nfds;
    (void)readfds;
    (void)writefds;
    (void)exceptfds;
    (void)timeout;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winsock_send_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t s = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* buf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t len = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t flags = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "send")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(s, buf, len, flags) : -1;
#else
    (void)s;
    (void)buf;
    (void)len;
    (void)flags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winsock_sendto_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t s = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* buf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t len = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t flags = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* to = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    int32_t tolen = static_cast<int32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, int32_t, int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "sendto")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(s, buf, len, flags, to, tolen) : -1;
#else
    (void)s;
    (void)buf;
    (void)len;
    (void)flags;
    (void)to;
    (void)tolen;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winsock_setsockopt_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t s = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    int32_t level = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t optname = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* optval = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    int32_t optlen = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, int32_t, int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "setsockopt")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(s, level, optname, optval, optlen) : -1;
#else
    (void)s;
    (void)level;
    (void)optname;
    (void)optval;
    (void)optlen;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winsock_shutdown_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t s = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    int32_t how = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "shutdown")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(s, how) : -1;
#else
    (void)s;
    (void)how;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winsock_socket_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t af = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    int32_t type = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t protocol = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "socket")));
    }
    uint64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(af, type, protocol) : 0;
#else
    (void)af;
    (void)type;
    (void)protocol;
    uint64_t km_res = 0;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<uint64_t>(km_res)));
}

static void register_windows_win32_networking_winsock_napi(Napi::Env env, Napi::Object exports) {
    exports.Set("windowssys_windows_win32_networking_winsock_AcceptEx", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_AcceptEx_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_EnumProtocolsA", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_EnumProtocolsA_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_EnumProtocolsW", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_EnumProtocolsW_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_FreeAddrInfoEx", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_FreeAddrInfoEx_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_FreeAddrInfoExW", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_FreeAddrInfoExW_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_FreeAddrInfoW", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_FreeAddrInfoW_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_GetAcceptExSockaddrs", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_GetAcceptExSockaddrs_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_GetAddrInfoExA", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_GetAddrInfoExA_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_GetAddrInfoExCancel", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_GetAddrInfoExCancel_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_GetAddrInfoExOverlappedResult", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_GetAddrInfoExOverlappedResult_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_GetAddrInfoExW", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_GetAddrInfoExW_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_GetAddrInfoW", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_GetAddrInfoW_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_GetAddressByNameA", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_GetAddressByNameA_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_GetAddressByNameW", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_GetAddressByNameW_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_GetHostNameW", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_GetHostNameW_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_GetNameByTypeA", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_GetNameByTypeA_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_GetNameByTypeW", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_GetNameByTypeW_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_GetNameInfoW", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_GetNameInfoW_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_GetServiceA", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_GetServiceA_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_GetServiceW", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_GetServiceW_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_GetTypeByNameA", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_GetTypeByNameA_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_GetTypeByNameW", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_GetTypeByNameW_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_InetNtopW", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_InetNtopW_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_InetPtonW", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_InetPtonW_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_ProcessSocketNotifications", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_ProcessSocketNotifications_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_RtlEthernetAddressToStringA", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_RtlEthernetAddressToStringA_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_RtlEthernetAddressToStringW", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_RtlEthernetAddressToStringW_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_RtlEthernetStringToAddressA", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_RtlEthernetStringToAddressA_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_RtlEthernetStringToAddressW", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_RtlEthernetStringToAddressW_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_RtlIpv4AddressToStringA", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_RtlIpv4AddressToStringA_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_RtlIpv4AddressToStringExA", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_RtlIpv4AddressToStringExA_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_RtlIpv4AddressToStringExW", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_RtlIpv4AddressToStringExW_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_RtlIpv4AddressToStringW", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_RtlIpv4AddressToStringW_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_RtlIpv4StringToAddressA", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_RtlIpv4StringToAddressA_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_RtlIpv4StringToAddressExA", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_RtlIpv4StringToAddressExA_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_RtlIpv4StringToAddressExW", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_RtlIpv4StringToAddressExW_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_RtlIpv4StringToAddressW", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_RtlIpv4StringToAddressW_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_RtlIpv6AddressToStringA", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_RtlIpv6AddressToStringA_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_RtlIpv6AddressToStringExA", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_RtlIpv6AddressToStringExA_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_RtlIpv6AddressToStringExW", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_RtlIpv6AddressToStringExW_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_RtlIpv6AddressToStringW", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_RtlIpv6AddressToStringW_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_RtlIpv6StringToAddressA", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_RtlIpv6StringToAddressA_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_RtlIpv6StringToAddressExA", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_RtlIpv6StringToAddressExA_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_RtlIpv6StringToAddressExW", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_RtlIpv6StringToAddressExW_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_RtlIpv6StringToAddressW", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_RtlIpv6StringToAddressW_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_SetAddrInfoExA", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_SetAddrInfoExA_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_SetAddrInfoExW", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_SetAddrInfoExW_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_SetServiceA", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_SetServiceA_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_SetServiceW", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_SetServiceW_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_SetSocketMediaStreamingMode", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_SetSocketMediaStreamingMode_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_TransmitFile", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_TransmitFile_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_WPUCompleteOverlappedRequest", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_WPUCompleteOverlappedRequest_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_WSAAccept", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_WSAAccept_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_WSAAddressToStringA", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_WSAAddressToStringA_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_WSAAddressToStringW", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_WSAAddressToStringW_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_WSAAdvertiseProvider", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_WSAAdvertiseProvider_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_WSAAsyncGetHostByAddr", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_WSAAsyncGetHostByAddr_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_WSAAsyncGetHostByName", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_WSAAsyncGetHostByName_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_WSAAsyncGetProtoByName", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_WSAAsyncGetProtoByName_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_WSAAsyncGetProtoByNumber", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_WSAAsyncGetProtoByNumber_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_WSAAsyncGetServByName", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_WSAAsyncGetServByName_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_WSAAsyncGetServByPort", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_WSAAsyncGetServByPort_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_WSAAsyncSelect", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_WSAAsyncSelect_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_WSACancelAsyncRequest", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_WSACancelAsyncRequest_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_WSACancelBlockingCall", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_WSACancelBlockingCall_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_WSACleanup", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_WSACleanup_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_WSACloseEvent", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_WSACloseEvent_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_WSAConnect", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_WSAConnect_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_WSAConnectByList", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_WSAConnectByList_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_WSAConnectByNameA", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_WSAConnectByNameA_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_WSAConnectByNameW", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_WSAConnectByNameW_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_WSACreateEvent", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_WSACreateEvent_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_WSADeleteSocketPeerTargetName", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_WSADeleteSocketPeerTargetName_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_WSADuplicateSocketA", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_WSADuplicateSocketA_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_WSADuplicateSocketW", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_WSADuplicateSocketW_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_WSAEnumNameSpaceProvidersA", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_WSAEnumNameSpaceProvidersA_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_WSAEnumNameSpaceProvidersExA", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_WSAEnumNameSpaceProvidersExA_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_WSAEnumNameSpaceProvidersExW", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_WSAEnumNameSpaceProvidersExW_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_WSAEnumNameSpaceProvidersW", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_WSAEnumNameSpaceProvidersW_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_WSAEnumNetworkEvents", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_WSAEnumNetworkEvents_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_WSAEnumProtocolsA", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_WSAEnumProtocolsA_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_WSAEnumProtocolsW", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_WSAEnumProtocolsW_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_WSAEventSelect", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_WSAEventSelect_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_WSAGetLastError", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_WSAGetLastError_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_WSAGetOverlappedResult", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_WSAGetOverlappedResult_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_WSAGetQOSByName", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_WSAGetQOSByName_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_WSAGetServiceClassInfoA", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_WSAGetServiceClassInfoA_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_WSAGetServiceClassInfoW", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_WSAGetServiceClassInfoW_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_WSAGetServiceClassNameByClassIdA", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_WSAGetServiceClassNameByClassIdA_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_WSAGetServiceClassNameByClassIdW", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_WSAGetServiceClassNameByClassIdW_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_WSAHtonl", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_WSAHtonl_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_WSAHtons", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_WSAHtons_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_WSAImpersonateSocketPeer", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_WSAImpersonateSocketPeer_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_WSAInstallServiceClassA", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_WSAInstallServiceClassA_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_WSAInstallServiceClassW", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_WSAInstallServiceClassW_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_WSAIoctl", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_WSAIoctl_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_WSAIsBlocking", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_WSAIsBlocking_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_WSAJoinLeaf", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_WSAJoinLeaf_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_WSALookupServiceBeginA", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_WSALookupServiceBeginA_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_WSALookupServiceBeginW", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_WSALookupServiceBeginW_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_WSALookupServiceEnd", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_WSALookupServiceEnd_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_WSALookupServiceNextA", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_WSALookupServiceNextA_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_WSALookupServiceNextW", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_WSALookupServiceNextW_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_WSANSPIoctl", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_WSANSPIoctl_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_WSANtohl", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_WSANtohl_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_WSANtohs", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_WSANtohs_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_WSAPoll", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_WSAPoll_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_WSAProviderCompleteAsyncCall", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_WSAProviderCompleteAsyncCall_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_WSAProviderConfigChange", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_WSAProviderConfigChange_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_WSAQuerySocketSecurity", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_WSAQuerySocketSecurity_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_WSARecv", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_WSARecv_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_WSARecvDisconnect", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_WSARecvDisconnect_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_WSARecvEx", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_WSARecvEx_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_WSARecvFrom", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_WSARecvFrom_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_WSARemoveServiceClass", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_WSARemoveServiceClass_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_WSAResetEvent", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_WSAResetEvent_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_WSARevertImpersonation", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_WSARevertImpersonation_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_WSASend", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_WSASend_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_WSASendDisconnect", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_WSASendDisconnect_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_WSASendMsg", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_WSASendMsg_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_WSASendTo", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_WSASendTo_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_WSASetEvent", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_WSASetEvent_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_WSASetLastError", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_WSASetLastError_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_WSASetServiceA", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_WSASetServiceA_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_WSASetServiceW", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_WSASetServiceW_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_WSASetSocketPeerTargetName", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_WSASetSocketPeerTargetName_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_WSASetSocketSecurity", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_WSASetSocketSecurity_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_WSASocketA", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_WSASocketA_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_WSASocketW", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_WSASocketW_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_WSAStartup", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_WSAStartup_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_WSAStringToAddressA", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_WSAStringToAddressA_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_WSAStringToAddressW", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_WSAStringToAddressW_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_WSAUnadvertiseProvider", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_WSAUnadvertiseProvider_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_WSAUnhookBlockingHook", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_WSAUnhookBlockingHook_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_WSAWaitForMultipleEvents", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_WSAWaitForMultipleEvents_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_WSCDeinstallProvider", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_WSCDeinstallProvider_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_WSCDeinstallProvider32", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_WSCDeinstallProvider32_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_WSCEnableNSProvider", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_WSCEnableNSProvider_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_WSCEnableNSProvider32", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_WSCEnableNSProvider32_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_WSCEnumNameSpaceProviders32", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_WSCEnumNameSpaceProviders32_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_WSCEnumNameSpaceProvidersEx32", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_WSCEnumNameSpaceProvidersEx32_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_WSCEnumProtocols", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_WSCEnumProtocols_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_WSCEnumProtocols32", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_WSCEnumProtocols32_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_WSCGetApplicationCategory", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_WSCGetApplicationCategory_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_WSCGetProviderInfo", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_WSCGetProviderInfo_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_WSCGetProviderInfo32", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_WSCGetProviderInfo32_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_WSCGetProviderPath", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_WSCGetProviderPath_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_WSCGetProviderPath32", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_WSCGetProviderPath32_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_WSCInstallNameSpace", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_WSCInstallNameSpace_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_WSCInstallNameSpace32", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_WSCInstallNameSpace32_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_WSCInstallNameSpaceEx", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_WSCInstallNameSpaceEx_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_WSCInstallNameSpaceEx32", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_WSCInstallNameSpaceEx32_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_WSCInstallProvider", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_WSCInstallProvider_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_WSCInstallProvider64_32", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_WSCInstallProvider64_32_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_WSCInstallProviderAndChains64_32", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_WSCInstallProviderAndChains64_32_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_WSCSetApplicationCategory", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_WSCSetApplicationCategory_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_WSCSetProviderInfo", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_WSCSetProviderInfo_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_WSCSetProviderInfo32", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_WSCSetProviderInfo32_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_WSCUnInstallNameSpace", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_WSCUnInstallNameSpace_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_WSCUnInstallNameSpace32", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_WSCUnInstallNameSpace32_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_WSCUpdateProvider", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_WSCUpdateProvider_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_WSCUpdateProvider32", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_WSCUpdateProvider32_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_WSCWriteNameSpaceOrder", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_WSCWriteNameSpaceOrder_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_WSCWriteNameSpaceOrder32", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_WSCWriteNameSpaceOrder32_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_WSCWriteProviderOrder", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_WSCWriteProviderOrder_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_WSCWriteProviderOrder32", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_WSCWriteProviderOrder32_napi));
    exports.Set("windowssys_windows_win32_networking_winsock___WSAFDIsSet", Napi::Function::New(env, windowssys_windows_win32_networking_winsock___WSAFDIsSet_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_accept", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_accept_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_bind", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_bind_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_closesocket", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_closesocket_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_connect", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_connect_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_freeaddrinfo", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_freeaddrinfo_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_getaddrinfo", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_getaddrinfo_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_gethostbyaddr", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_gethostbyaddr_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_gethostbyname", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_gethostbyname_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_gethostname", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_gethostname_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_getnameinfo", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_getnameinfo_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_getpeername", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_getpeername_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_getprotobyname", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_getprotobyname_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_getprotobynumber", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_getprotobynumber_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_getservbyname", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_getservbyname_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_getservbyport", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_getservbyport_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_getsockname", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_getsockname_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_getsockopt", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_getsockopt_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_htonl", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_htonl_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_htons", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_htons_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_inet_addr", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_inet_addr_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_inet_ntop", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_inet_ntop_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_inet_pton", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_inet_pton_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_ioctlsocket", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_ioctlsocket_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_listen", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_listen_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_ntohl", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_ntohl_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_ntohs", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_ntohs_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_recv", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_recv_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_recvfrom", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_recvfrom_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_select", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_select_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_send", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_send_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_sendto", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_sendto_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_setsockopt", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_setsockopt_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_shutdown", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_shutdown_napi));
    exports.Set("windowssys_windows_win32_networking_winsock_socket", Napi::Function::New(env, windowssys_windows_win32_networking_winsock_socket_napi));
}

static KmNapiRegistrarNode registrar_node = { &register_windows_win32_networking_winsock_napi, nullptr };
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
