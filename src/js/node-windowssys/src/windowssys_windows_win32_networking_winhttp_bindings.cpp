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

static Napi::Value windowssys_windows_win32_networking_winhttp_WinHttpAddRequestHeaders_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hrequest = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpszheaders = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwheaderslength = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t dwmodifiers = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winhttp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WinHttpAddRequestHeaders")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hrequest, lpszheaders, dwheaderslength, dwmodifiers) : -1;
#else
    (void)hrequest;
    (void)lpszheaders;
    (void)dwheaderslength;
    (void)dwmodifiers;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winhttp_WinHttpAddRequestHeadersEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hrequest = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwmodifiers = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint64_t ullflags = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
    uint64_t ullextra = km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0;
    uint32_t cheaders = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* pheaders = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint64_t, uint64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winhttp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WinHttpAddRequestHeadersEx")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hrequest, dwmodifiers, ullflags, ullextra, cheaders, pheaders) : 0;
#else
    (void)hrequest;
    (void)dwmodifiers;
    (void)ullflags;
    (void)ullextra;
    (void)cheaders;
    (void)pheaders;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winhttp_WinHttpCheckPlatform_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winhttp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WinHttpCheckPlatform")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winhttp_WinHttpCloseHandle_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hinternet = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winhttp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WinHttpCloseHandle")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hinternet) : -1;
#else
    (void)hinternet;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winhttp_WinHttpConnect_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hsession = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pswzservername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint16_t nserverport = static_cast<uint16_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t dwreserved = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint16_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winhttp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WinHttpConnect")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hsession, pswzservername, nserverport, dwreserved) : NULL;
#else
    (void)hsession;
    (void)pswzservername;
    (void)nserverport;
    (void)dwreserved;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_networking_winhttp_WinHttpCrackUrl_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pwszurl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwurllength = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* lpurlcomponents = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winhttp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WinHttpCrackUrl")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pwszurl, dwurllength, dwflags, lpurlcomponents) : -1;
#else
    (void)pwszurl;
    (void)dwurllength;
    (void)dwflags;
    (void)lpurlcomponents;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winhttp_WinHttpCreateProxyResolver_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hsession = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* phresolver = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winhttp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WinHttpCreateProxyResolver")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hsession, phresolver) : 0;
#else
    (void)hsession;
    (void)phresolver;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winhttp_WinHttpCreateUrl_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpurlcomponents = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pwszurl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pdwurllength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winhttp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WinHttpCreateUrl")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpurlcomponents, dwflags, pwszurl, pdwurllength) : -1;
#else
    (void)lpurlcomponents;
    (void)dwflags;
    (void)pwszurl;
    (void)pdwurllength;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winhttp_WinHttpDetectAutoProxyConfigUrl_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwautodetectflags = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* ppwstrautoconfigurl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winhttp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WinHttpDetectAutoProxyConfigUrl")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwautodetectflags, ppwstrautoconfigurl) : -1;
#else
    (void)dwautodetectflags;
    (void)ppwstrautoconfigurl;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winhttp_WinHttpFreeProxyResult_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pproxyresult = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winhttp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WinHttpFreeProxyResult")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(pproxyresult);
#else
    (void)pproxyresult;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_networking_winhttp_WinHttpFreeProxyResultEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pproxyresultex = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winhttp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WinHttpFreeProxyResultEx")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(pproxyresultex);
#else
    (void)pproxyresultex;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_networking_winhttp_WinHttpFreeProxySettings_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pwinhttpproxysettings = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winhttp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WinHttpFreeProxySettings")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(pwinhttpproxysettings);
#else
    (void)pwinhttpproxysettings;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_networking_winhttp_WinHttpFreeProxySettingsEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t proxysettingstype = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* pproxysettingsex = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winhttp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WinHttpFreeProxySettingsEx")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(proxysettingstype, pproxysettingsex) : 0;
#else
    (void)proxysettingstype;
    (void)pproxysettingsex;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winhttp_WinHttpFreeQueryConnectionGroupResult_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* presult = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winhttp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WinHttpFreeQueryConnectionGroupResult")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(presult);
#else
    (void)presult;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_networking_winhttp_WinHttpGetDefaultProxyConfiguration_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pproxyinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winhttp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WinHttpGetDefaultProxyConfiguration")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pproxyinfo) : -1;
#else
    (void)pproxyinfo;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winhttp_WinHttpGetIEProxyConfigForCurrentUser_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pproxyconfig = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winhttp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WinHttpGetIEProxyConfigForCurrentUser")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pproxyconfig) : -1;
#else
    (void)pproxyconfig;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winhttp_WinHttpGetProxyForUrl_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hsession = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpcwszurl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pautoproxyoptions = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pproxyinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winhttp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WinHttpGetProxyForUrl")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hsession, lpcwszurl, pautoproxyoptions, pproxyinfo) : -1;
#else
    (void)hsession;
    (void)lpcwszurl;
    (void)pautoproxyoptions;
    (void)pproxyinfo;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winhttp_WinHttpGetProxyForUrlEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hresolver = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pcwszurl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pautoproxyoptions = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint64_t pcontext = km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winhttp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WinHttpGetProxyForUrlEx")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hresolver, pcwszurl, pautoproxyoptions, pcontext) : 0;
#else
    (void)hresolver;
    (void)pcwszurl;
    (void)pautoproxyoptions;
    (void)pcontext;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winhttp_WinHttpGetProxyForUrlEx2_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hresolver = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pcwszurl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pautoproxyoptions = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t cbinterfaceselectioncontext = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* pinterfaceselectioncontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint64_t pcontext = km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winhttp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WinHttpGetProxyForUrlEx2")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hresolver, pcwszurl, pautoproxyoptions, cbinterfaceselectioncontext, pinterfaceselectioncontext, pcontext) : 0;
#else
    (void)hresolver;
    (void)pcwszurl;
    (void)pautoproxyoptions;
    (void)cbinterfaceselectioncontext;
    (void)pinterfaceselectioncontext;
    (void)pcontext;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winhttp_WinHttpGetProxyResult_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hresolver = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pproxyresult = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winhttp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WinHttpGetProxyResult")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hresolver, pproxyresult) : 0;
#else
    (void)hresolver;
    (void)pproxyresult;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winhttp_WinHttpGetProxyResultEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hresolver = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pproxyresultex = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winhttp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WinHttpGetProxyResultEx")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hresolver, pproxyresultex) : 0;
#else
    (void)hresolver;
    (void)pproxyresultex;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winhttp_WinHttpGetProxySettingsEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hresolver = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t proxysettingstype = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pproxysettingsparam = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint64_t pcontext = km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winhttp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WinHttpGetProxySettingsEx")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hresolver, proxysettingstype, pproxysettingsparam, pcontext) : 0;
#else
    (void)hresolver;
    (void)proxysettingstype;
    (void)pproxysettingsparam;
    (void)pcontext;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winhttp_WinHttpGetProxySettingsResultEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hresolver = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pproxysettingsex = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winhttp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WinHttpGetProxySettingsResultEx")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hresolver, pproxysettingsex) : 0;
#else
    (void)hresolver;
    (void)pproxysettingsex;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winhttp_WinHttpGetProxySettingsVersion_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hsession = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pdwproxysettingsversion = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winhttp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WinHttpGetProxySettingsVersion")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hsession, pdwproxysettingsversion) : 0;
#else
    (void)hsession;
    (void)pdwproxysettingsversion;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winhttp_WinHttpOpen_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pszagentw = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwaccesstype = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pszproxyw = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pszproxybypassw = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winhttp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WinHttpOpen")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pszagentw, dwaccesstype, pszproxyw, pszproxybypassw, dwflags) : NULL;
#else
    (void)pszagentw;
    (void)dwaccesstype;
    (void)pszproxyw;
    (void)pszproxybypassw;
    (void)dwflags;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_networking_winhttp_WinHttpOpenRequest_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hconnect = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pwszverb = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pwszobjectname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pwszversion = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pwszreferrer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* ppwszaccepttypes = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winhttp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WinHttpOpenRequest")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hconnect, pwszverb, pwszobjectname, pwszversion, pwszreferrer, ppwszaccepttypes, dwflags) : NULL;
#else
    (void)hconnect;
    (void)pwszverb;
    (void)pwszobjectname;
    (void)pwszversion;
    (void)pwszreferrer;
    (void)ppwszaccepttypes;
    (void)dwflags;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_networking_winhttp_WinHttpQueryAuthSchemes_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hrequest = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpdwsupportedschemes = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* lpdwfirstscheme = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pdwauthtarget = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winhttp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WinHttpQueryAuthSchemes")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hrequest, lpdwsupportedschemes, lpdwfirstscheme, pdwauthtarget) : -1;
#else
    (void)hrequest;
    (void)lpdwsupportedschemes;
    (void)lpdwfirstscheme;
    (void)pdwauthtarget;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winhttp_WinHttpQueryConnectionGroup_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hinternet = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pguidconnection = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint64_t ullflags = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
    void* ppresult = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winhttp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WinHttpQueryConnectionGroup")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hinternet, pguidconnection, ullflags, ppresult) : 0;
#else
    (void)hinternet;
    (void)pguidconnection;
    (void)ullflags;
    (void)ppresult;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winhttp_WinHttpQueryDataAvailable_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hrequest = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpdwnumberofbytesavailable = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winhttp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WinHttpQueryDataAvailable")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hrequest, lpdwnumberofbytesavailable) : -1;
#else
    (void)hrequest;
    (void)lpdwnumberofbytesavailable;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winhttp_WinHttpQueryHeaders_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hrequest = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwinfolevel = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pwszname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* lpbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* lpdwbufferlength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* lpdwindex = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winhttp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WinHttpQueryHeaders")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hrequest, dwinfolevel, pwszname, lpbuffer, lpdwbufferlength, lpdwindex) : -1;
#else
    (void)hrequest;
    (void)dwinfolevel;
    (void)pwszname;
    (void)lpbuffer;
    (void)lpdwbufferlength;
    (void)lpdwindex;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winhttp_WinHttpQueryHeadersEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hrequest = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwinfolevel = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint64_t ullflags = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
    uint32_t uicodepage = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* pdwindex = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* pheadername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* pbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* pdwbufferlength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    void* ppheaders = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
    void* pdwheaderscount = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 9 ? km_napi_arg_u64(km_info[9]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint64_t, uint32_t, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winhttp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WinHttpQueryHeadersEx")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hrequest, dwinfolevel, ullflags, uicodepage, pdwindex, pheadername, pbuffer, pdwbufferlength, ppheaders, pdwheaderscount) : 0;
#else
    (void)hrequest;
    (void)dwinfolevel;
    (void)ullflags;
    (void)uicodepage;
    (void)pdwindex;
    (void)pheadername;
    (void)pbuffer;
    (void)pdwbufferlength;
    (void)ppheaders;
    (void)pdwheaderscount;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winhttp_WinHttpQueryOption_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hinternet = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwoption = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* lpbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* lpdwbufferlength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winhttp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WinHttpQueryOption")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hinternet, dwoption, lpbuffer, lpdwbufferlength) : -1;
#else
    (void)hinternet;
    (void)dwoption;
    (void)lpbuffer;
    (void)lpdwbufferlength;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winhttp_WinHttpReadData_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hrequest = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwnumberofbytestoread = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* lpdwnumberofbytesread = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winhttp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WinHttpReadData")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hrequest, lpbuffer, dwnumberofbytestoread, lpdwnumberofbytesread) : -1;
#else
    (void)hrequest;
    (void)lpbuffer;
    (void)dwnumberofbytestoread;
    (void)lpdwnumberofbytesread;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winhttp_WinHttpReadDataEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hrequest = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwnumberofbytestoread = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* lpdwnumberofbytesread = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint64_t ullflags = km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0;
    uint32_t cbproperty = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* pvproperty = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winhttp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WinHttpReadDataEx")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hrequest, lpbuffer, dwnumberofbytestoread, lpdwnumberofbytesread, ullflags, cbproperty, pvproperty) : 0;
#else
    (void)hrequest;
    (void)lpbuffer;
    (void)dwnumberofbytestoread;
    (void)lpdwnumberofbytesread;
    (void)ullflags;
    (void)cbproperty;
    (void)pvproperty;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winhttp_WinHttpReadProxySettings_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hsession = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pcwszconnectionname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t ffallbacktodefaultsettings = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t fsetautodiscoverfordefaultsettings = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* pdwsettingsversion = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* pfdefaultsettingsarereturned = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* pwinhttpproxysettings = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winhttp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WinHttpReadProxySettings")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hsession, pcwszconnectionname, ffallbacktodefaultsettings, fsetautodiscoverfordefaultsettings, pdwsettingsversion, pfdefaultsettingsarereturned, pwinhttpproxysettings) : 0;
#else
    (void)hsession;
    (void)pcwszconnectionname;
    (void)ffallbacktodefaultsettings;
    (void)fsetautodiscoverfordefaultsettings;
    (void)pdwsettingsversion;
    (void)pfdefaultsettingsarereturned;
    (void)pwinhttpproxysettings;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winhttp_WinHttpReceiveResponse_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hrequest = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpreserved = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winhttp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WinHttpReceiveResponse")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hrequest, lpreserved) : -1;
#else
    (void)hrequest;
    (void)lpreserved;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winhttp_WinHttpRegisterProxyChangeNotification_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t ullflags = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* pfncallback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pvcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* hregistration = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winhttp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WinHttpRegisterProxyChangeNotification")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(ullflags, pfncallback, pvcontext, hregistration) : 0;
#else
    (void)ullflags;
    (void)pfncallback;
    (void)pvcontext;
    (void)hregistration;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winhttp_WinHttpResetAutoProxy_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hsession = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winhttp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WinHttpResetAutoProxy")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hsession, dwflags) : 0;
#else
    (void)hsession;
    (void)dwflags;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winhttp_WinHttpSendRequest_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hrequest = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpszheaders = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwheaderslength = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* lpoptional = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t dwoptionallength = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    uint32_t dwtotallength = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    uint64_t dwcontext = km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winhttp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WinHttpSendRequest")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hrequest, lpszheaders, dwheaderslength, lpoptional, dwoptionallength, dwtotallength, dwcontext) : -1;
#else
    (void)hrequest;
    (void)lpszheaders;
    (void)dwheaderslength;
    (void)lpoptional;
    (void)dwoptionallength;
    (void)dwtotallength;
    (void)dwcontext;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winhttp_WinHttpSetCredentials_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hrequest = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t authtargets = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t authscheme = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pwszusername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pwszpassword = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* pauthparams = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winhttp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WinHttpSetCredentials")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hrequest, authtargets, authscheme, pwszusername, pwszpassword, pauthparams) : -1;
#else
    (void)hrequest;
    (void)authtargets;
    (void)authscheme;
    (void)pwszusername;
    (void)pwszpassword;
    (void)pauthparams;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winhttp_WinHttpSetDefaultProxyConfiguration_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pproxyinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winhttp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WinHttpSetDefaultProxyConfiguration")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pproxyinfo) : -1;
#else
    (void)pproxyinfo;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winhttp_WinHttpSetOption_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hinternet = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwoption = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* lpbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t dwbufferlength = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winhttp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WinHttpSetOption")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hinternet, dwoption, lpbuffer, dwbufferlength) : -1;
#else
    (void)hinternet;
    (void)dwoption;
    (void)lpbuffer;
    (void)dwbufferlength;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winhttp_WinHttpSetProxySettingsPerUser_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t fproxysettingsperuser = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winhttp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WinHttpSetProxySettingsPerUser")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(fproxysettingsperuser) : 0;
#else
    (void)fproxysettingsperuser;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winhttp_WinHttpSetStatusCallback_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hinternet = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpfninternetcallback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwnotificationflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint64_t dwreserved = km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winhttp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WinHttpSetStatusCallback")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hinternet, lpfninternetcallback, dwnotificationflags, dwreserved) : NULL;
#else
    (void)hinternet;
    (void)lpfninternetcallback;
    (void)dwnotificationflags;
    (void)dwreserved;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_networking_winhttp_WinHttpSetTimeouts_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hinternet = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t nresolvetimeout = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t nconnecttimeout = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t nsendtimeout = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    int32_t nreceivetimeout = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winhttp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WinHttpSetTimeouts")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hinternet, nresolvetimeout, nconnecttimeout, nsendtimeout, nreceivetimeout) : -1;
#else
    (void)hinternet;
    (void)nresolvetimeout;
    (void)nconnecttimeout;
    (void)nsendtimeout;
    (void)nreceivetimeout;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winhttp_WinHttpTimeFromSystemTime_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pst = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pwsztime = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winhttp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WinHttpTimeFromSystemTime")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pst, pwsztime) : -1;
#else
    (void)pst;
    (void)pwsztime;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winhttp_WinHttpTimeToSystemTime_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pwsztime = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pst = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winhttp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WinHttpTimeToSystemTime")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pwsztime, pst) : -1;
#else
    (void)pwsztime;
    (void)pst;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winhttp_WinHttpUnregisterProxyChangeNotification_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hregistration = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winhttp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WinHttpUnregisterProxyChangeNotification")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hregistration) : 0;
#else
    (void)hregistration;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winhttp_WinHttpWebSocketClose_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hwebsocket = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint16_t usstatus = static_cast<uint16_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pvreason = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t dwreasonlength = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint16_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winhttp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WinHttpWebSocketClose")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hwebsocket, usstatus, pvreason, dwreasonlength) : 0;
#else
    (void)hwebsocket;
    (void)usstatus;
    (void)pvreason;
    (void)dwreasonlength;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winhttp_WinHttpWebSocketCompleteUpgrade_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hrequest = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t pcontext = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winhttp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WinHttpWebSocketCompleteUpgrade")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hrequest, pcontext) : NULL;
#else
    (void)hrequest;
    (void)pcontext;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_networking_winhttp_WinHttpWebSocketQueryCloseStatus_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hwebsocket = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pusstatus = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pvreason = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t dwreasonlength = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* pdwreasonlengthconsumed = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winhttp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WinHttpWebSocketQueryCloseStatus")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hwebsocket, pusstatus, pvreason, dwreasonlength, pdwreasonlengthconsumed) : 0;
#else
    (void)hwebsocket;
    (void)pusstatus;
    (void)pvreason;
    (void)dwreasonlength;
    (void)pdwreasonlengthconsumed;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winhttp_WinHttpWebSocketReceive_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hwebsocket = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pvbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwbufferlength = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pdwbytesread = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pebuffertype = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winhttp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WinHttpWebSocketReceive")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hwebsocket, pvbuffer, dwbufferlength, pdwbytesread, pebuffertype) : 0;
#else
    (void)hwebsocket;
    (void)pvbuffer;
    (void)dwbufferlength;
    (void)pdwbytesread;
    (void)pebuffertype;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winhttp_WinHttpWebSocketSend_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hwebsocket = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t ebuffertype = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pvbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t dwbufferlength = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winhttp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WinHttpWebSocketSend")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hwebsocket, ebuffertype, pvbuffer, dwbufferlength) : 0;
#else
    (void)hwebsocket;
    (void)ebuffertype;
    (void)pvbuffer;
    (void)dwbufferlength;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winhttp_WinHttpWebSocketShutdown_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hwebsocket = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint16_t usstatus = static_cast<uint16_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pvreason = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t dwreasonlength = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint16_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winhttp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WinHttpWebSocketShutdown")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hwebsocket, usstatus, pvreason, dwreasonlength) : 0;
#else
    (void)hwebsocket;
    (void)usstatus;
    (void)pvreason;
    (void)dwreasonlength;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winhttp_WinHttpWriteData_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hrequest = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwnumberofbytestowrite = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* lpdwnumberofbyteswritten = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winhttp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WinHttpWriteData")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hrequest, lpbuffer, dwnumberofbytestowrite, lpdwnumberofbyteswritten) : -1;
#else
    (void)hrequest;
    (void)lpbuffer;
    (void)dwnumberofbytestowrite;
    (void)lpdwnumberofbyteswritten;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_winhttp_WinHttpWriteProxySettings_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hsession = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t fforceupdate = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pwinhttpproxysettings = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winhttp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WinHttpWriteProxySettings")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hsession, fforceupdate, pwinhttpproxysettings) : 0;
#else
    (void)hsession;
    (void)fforceupdate;
    (void)pwinhttpproxysettings;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static void register_windows_win32_networking_winhttp_napi(Napi::Env env, Napi::Object exports) {
    exports.Set("windowssys_windows_win32_networking_winhttp_WinHttpAddRequestHeaders", Napi::Function::New(env, windowssys_windows_win32_networking_winhttp_WinHttpAddRequestHeaders_napi));
    exports.Set("windowssys_windows_win32_networking_winhttp_WinHttpAddRequestHeadersEx", Napi::Function::New(env, windowssys_windows_win32_networking_winhttp_WinHttpAddRequestHeadersEx_napi));
    exports.Set("windowssys_windows_win32_networking_winhttp_WinHttpCheckPlatform", Napi::Function::New(env, windowssys_windows_win32_networking_winhttp_WinHttpCheckPlatform_napi));
    exports.Set("windowssys_windows_win32_networking_winhttp_WinHttpCloseHandle", Napi::Function::New(env, windowssys_windows_win32_networking_winhttp_WinHttpCloseHandle_napi));
    exports.Set("windowssys_windows_win32_networking_winhttp_WinHttpConnect", Napi::Function::New(env, windowssys_windows_win32_networking_winhttp_WinHttpConnect_napi));
    exports.Set("windowssys_windows_win32_networking_winhttp_WinHttpCrackUrl", Napi::Function::New(env, windowssys_windows_win32_networking_winhttp_WinHttpCrackUrl_napi));
    exports.Set("windowssys_windows_win32_networking_winhttp_WinHttpCreateProxyResolver", Napi::Function::New(env, windowssys_windows_win32_networking_winhttp_WinHttpCreateProxyResolver_napi));
    exports.Set("windowssys_windows_win32_networking_winhttp_WinHttpCreateUrl", Napi::Function::New(env, windowssys_windows_win32_networking_winhttp_WinHttpCreateUrl_napi));
    exports.Set("windowssys_windows_win32_networking_winhttp_WinHttpDetectAutoProxyConfigUrl", Napi::Function::New(env, windowssys_windows_win32_networking_winhttp_WinHttpDetectAutoProxyConfigUrl_napi));
    exports.Set("windowssys_windows_win32_networking_winhttp_WinHttpFreeProxyResult", Napi::Function::New(env, windowssys_windows_win32_networking_winhttp_WinHttpFreeProxyResult_napi));
    exports.Set("windowssys_windows_win32_networking_winhttp_WinHttpFreeProxyResultEx", Napi::Function::New(env, windowssys_windows_win32_networking_winhttp_WinHttpFreeProxyResultEx_napi));
    exports.Set("windowssys_windows_win32_networking_winhttp_WinHttpFreeProxySettings", Napi::Function::New(env, windowssys_windows_win32_networking_winhttp_WinHttpFreeProxySettings_napi));
    exports.Set("windowssys_windows_win32_networking_winhttp_WinHttpFreeProxySettingsEx", Napi::Function::New(env, windowssys_windows_win32_networking_winhttp_WinHttpFreeProxySettingsEx_napi));
    exports.Set("windowssys_windows_win32_networking_winhttp_WinHttpFreeQueryConnectionGroupResult", Napi::Function::New(env, windowssys_windows_win32_networking_winhttp_WinHttpFreeQueryConnectionGroupResult_napi));
    exports.Set("windowssys_windows_win32_networking_winhttp_WinHttpGetDefaultProxyConfiguration", Napi::Function::New(env, windowssys_windows_win32_networking_winhttp_WinHttpGetDefaultProxyConfiguration_napi));
    exports.Set("windowssys_windows_win32_networking_winhttp_WinHttpGetIEProxyConfigForCurrentUser", Napi::Function::New(env, windowssys_windows_win32_networking_winhttp_WinHttpGetIEProxyConfigForCurrentUser_napi));
    exports.Set("windowssys_windows_win32_networking_winhttp_WinHttpGetProxyForUrl", Napi::Function::New(env, windowssys_windows_win32_networking_winhttp_WinHttpGetProxyForUrl_napi));
    exports.Set("windowssys_windows_win32_networking_winhttp_WinHttpGetProxyForUrlEx", Napi::Function::New(env, windowssys_windows_win32_networking_winhttp_WinHttpGetProxyForUrlEx_napi));
    exports.Set("windowssys_windows_win32_networking_winhttp_WinHttpGetProxyForUrlEx2", Napi::Function::New(env, windowssys_windows_win32_networking_winhttp_WinHttpGetProxyForUrlEx2_napi));
    exports.Set("windowssys_windows_win32_networking_winhttp_WinHttpGetProxyResult", Napi::Function::New(env, windowssys_windows_win32_networking_winhttp_WinHttpGetProxyResult_napi));
    exports.Set("windowssys_windows_win32_networking_winhttp_WinHttpGetProxyResultEx", Napi::Function::New(env, windowssys_windows_win32_networking_winhttp_WinHttpGetProxyResultEx_napi));
    exports.Set("windowssys_windows_win32_networking_winhttp_WinHttpGetProxySettingsEx", Napi::Function::New(env, windowssys_windows_win32_networking_winhttp_WinHttpGetProxySettingsEx_napi));
    exports.Set("windowssys_windows_win32_networking_winhttp_WinHttpGetProxySettingsResultEx", Napi::Function::New(env, windowssys_windows_win32_networking_winhttp_WinHttpGetProxySettingsResultEx_napi));
    exports.Set("windowssys_windows_win32_networking_winhttp_WinHttpGetProxySettingsVersion", Napi::Function::New(env, windowssys_windows_win32_networking_winhttp_WinHttpGetProxySettingsVersion_napi));
    exports.Set("windowssys_windows_win32_networking_winhttp_WinHttpOpen", Napi::Function::New(env, windowssys_windows_win32_networking_winhttp_WinHttpOpen_napi));
    exports.Set("windowssys_windows_win32_networking_winhttp_WinHttpOpenRequest", Napi::Function::New(env, windowssys_windows_win32_networking_winhttp_WinHttpOpenRequest_napi));
    exports.Set("windowssys_windows_win32_networking_winhttp_WinHttpQueryAuthSchemes", Napi::Function::New(env, windowssys_windows_win32_networking_winhttp_WinHttpQueryAuthSchemes_napi));
    exports.Set("windowssys_windows_win32_networking_winhttp_WinHttpQueryConnectionGroup", Napi::Function::New(env, windowssys_windows_win32_networking_winhttp_WinHttpQueryConnectionGroup_napi));
    exports.Set("windowssys_windows_win32_networking_winhttp_WinHttpQueryDataAvailable", Napi::Function::New(env, windowssys_windows_win32_networking_winhttp_WinHttpQueryDataAvailable_napi));
    exports.Set("windowssys_windows_win32_networking_winhttp_WinHttpQueryHeaders", Napi::Function::New(env, windowssys_windows_win32_networking_winhttp_WinHttpQueryHeaders_napi));
    exports.Set("windowssys_windows_win32_networking_winhttp_WinHttpQueryHeadersEx", Napi::Function::New(env, windowssys_windows_win32_networking_winhttp_WinHttpQueryHeadersEx_napi));
    exports.Set("windowssys_windows_win32_networking_winhttp_WinHttpQueryOption", Napi::Function::New(env, windowssys_windows_win32_networking_winhttp_WinHttpQueryOption_napi));
    exports.Set("windowssys_windows_win32_networking_winhttp_WinHttpReadData", Napi::Function::New(env, windowssys_windows_win32_networking_winhttp_WinHttpReadData_napi));
    exports.Set("windowssys_windows_win32_networking_winhttp_WinHttpReadDataEx", Napi::Function::New(env, windowssys_windows_win32_networking_winhttp_WinHttpReadDataEx_napi));
    exports.Set("windowssys_windows_win32_networking_winhttp_WinHttpReadProxySettings", Napi::Function::New(env, windowssys_windows_win32_networking_winhttp_WinHttpReadProxySettings_napi));
    exports.Set("windowssys_windows_win32_networking_winhttp_WinHttpReceiveResponse", Napi::Function::New(env, windowssys_windows_win32_networking_winhttp_WinHttpReceiveResponse_napi));
    exports.Set("windowssys_windows_win32_networking_winhttp_WinHttpRegisterProxyChangeNotification", Napi::Function::New(env, windowssys_windows_win32_networking_winhttp_WinHttpRegisterProxyChangeNotification_napi));
    exports.Set("windowssys_windows_win32_networking_winhttp_WinHttpResetAutoProxy", Napi::Function::New(env, windowssys_windows_win32_networking_winhttp_WinHttpResetAutoProxy_napi));
    exports.Set("windowssys_windows_win32_networking_winhttp_WinHttpSendRequest", Napi::Function::New(env, windowssys_windows_win32_networking_winhttp_WinHttpSendRequest_napi));
    exports.Set("windowssys_windows_win32_networking_winhttp_WinHttpSetCredentials", Napi::Function::New(env, windowssys_windows_win32_networking_winhttp_WinHttpSetCredentials_napi));
    exports.Set("windowssys_windows_win32_networking_winhttp_WinHttpSetDefaultProxyConfiguration", Napi::Function::New(env, windowssys_windows_win32_networking_winhttp_WinHttpSetDefaultProxyConfiguration_napi));
    exports.Set("windowssys_windows_win32_networking_winhttp_WinHttpSetOption", Napi::Function::New(env, windowssys_windows_win32_networking_winhttp_WinHttpSetOption_napi));
    exports.Set("windowssys_windows_win32_networking_winhttp_WinHttpSetProxySettingsPerUser", Napi::Function::New(env, windowssys_windows_win32_networking_winhttp_WinHttpSetProxySettingsPerUser_napi));
    exports.Set("windowssys_windows_win32_networking_winhttp_WinHttpSetStatusCallback", Napi::Function::New(env, windowssys_windows_win32_networking_winhttp_WinHttpSetStatusCallback_napi));
    exports.Set("windowssys_windows_win32_networking_winhttp_WinHttpSetTimeouts", Napi::Function::New(env, windowssys_windows_win32_networking_winhttp_WinHttpSetTimeouts_napi));
    exports.Set("windowssys_windows_win32_networking_winhttp_WinHttpTimeFromSystemTime", Napi::Function::New(env, windowssys_windows_win32_networking_winhttp_WinHttpTimeFromSystemTime_napi));
    exports.Set("windowssys_windows_win32_networking_winhttp_WinHttpTimeToSystemTime", Napi::Function::New(env, windowssys_windows_win32_networking_winhttp_WinHttpTimeToSystemTime_napi));
    exports.Set("windowssys_windows_win32_networking_winhttp_WinHttpUnregisterProxyChangeNotification", Napi::Function::New(env, windowssys_windows_win32_networking_winhttp_WinHttpUnregisterProxyChangeNotification_napi));
    exports.Set("windowssys_windows_win32_networking_winhttp_WinHttpWebSocketClose", Napi::Function::New(env, windowssys_windows_win32_networking_winhttp_WinHttpWebSocketClose_napi));
    exports.Set("windowssys_windows_win32_networking_winhttp_WinHttpWebSocketCompleteUpgrade", Napi::Function::New(env, windowssys_windows_win32_networking_winhttp_WinHttpWebSocketCompleteUpgrade_napi));
    exports.Set("windowssys_windows_win32_networking_winhttp_WinHttpWebSocketQueryCloseStatus", Napi::Function::New(env, windowssys_windows_win32_networking_winhttp_WinHttpWebSocketQueryCloseStatus_napi));
    exports.Set("windowssys_windows_win32_networking_winhttp_WinHttpWebSocketReceive", Napi::Function::New(env, windowssys_windows_win32_networking_winhttp_WinHttpWebSocketReceive_napi));
    exports.Set("windowssys_windows_win32_networking_winhttp_WinHttpWebSocketSend", Napi::Function::New(env, windowssys_windows_win32_networking_winhttp_WinHttpWebSocketSend_napi));
    exports.Set("windowssys_windows_win32_networking_winhttp_WinHttpWebSocketShutdown", Napi::Function::New(env, windowssys_windows_win32_networking_winhttp_WinHttpWebSocketShutdown_napi));
    exports.Set("windowssys_windows_win32_networking_winhttp_WinHttpWriteData", Napi::Function::New(env, windowssys_windows_win32_networking_winhttp_WinHttpWriteData_napi));
    exports.Set("windowssys_windows_win32_networking_winhttp_WinHttpWriteProxySettings", Napi::Function::New(env, windowssys_windows_win32_networking_winhttp_WinHttpWriteProxySettings_napi));
}

static KmNapiRegistrarNode registrar_node = { &register_windows_win32_networking_winhttp_napi, nullptr };
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
