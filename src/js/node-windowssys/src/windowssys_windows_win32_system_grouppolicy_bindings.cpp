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

static Napi::Value windowssys_windows_win32_system_grouppolicy_BrowseForGPO_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpbrowseinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gpedit.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "BrowseForGPO")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpbrowseinfo) : -1;
#else
    (void)lpbrowseinfo;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_grouppolicy_CommandLineFromMsiDescriptor_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* descriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* commandline = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* commandlinelength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CommandLineFromMsiDescriptor")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(descriptor, commandline, commandlinelength) : 0;
#else
    (void)descriptor;
    (void)commandline;
    (void)commandlinelength;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_grouppolicy_CreateGPOLink_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpgpo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpcontainer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t fhighpriority = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gpedit.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CreateGPOLink")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpgpo, lpcontainer, fhighpriority) : -1;
#else
    (void)lpgpo;
    (void)lpcontainer;
    (void)fhighpriority;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_grouppolicy_DeleteAllGPOLinks_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpcontainer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gpedit.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DeleteAllGPOLinks")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpcontainer) : -1;
#else
    (void)lpcontainer;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_grouppolicy_DeleteGPOLink_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpgpo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpcontainer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gpedit.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DeleteGPOLink")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpgpo, lpcontainer) : -1;
#else
    (void)lpgpo;
    (void)lpcontainer;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_grouppolicy_EnterCriticalPolicySection_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t bmachine = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("userenv.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "EnterCriticalPolicySection")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(bmachine) : NULL;
#else
    (void)bmachine;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_grouppolicy_ExportRSoPData_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpnamespace = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpfilename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gpedit.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ExportRSoPData")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpnamespace, lpfilename) : -1;
#else
    (void)lpnamespace;
    (void)lpfilename;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_grouppolicy_FreeGPOListA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pgpolist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("userenv.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FreeGPOListA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pgpolist) : -1;
#else
    (void)pgpolist;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_grouppolicy_FreeGPOListW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pgpolist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("userenv.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FreeGPOListW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pgpolist) : -1;
#else
    (void)pgpolist;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_grouppolicy_GenerateGPNotification_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t bmachine = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* lpwszmgmtproduct = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwmgmtproductoptions = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("userenv.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GenerateGPNotification")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(bmachine, lpwszmgmtproduct, dwmgmtproductoptions) : 0;
#else
    (void)bmachine;
    (void)lpwszmgmtproduct;
    (void)dwmgmtproductoptions;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_grouppolicy_GetAppliedGPOListA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* pmachinename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* psiduser = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pguidextension = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* ppgpolist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("userenv.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetAppliedGPOListA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwflags, pmachinename, psiduser, pguidextension, ppgpolist) : 0;
#else
    (void)dwflags;
    (void)pmachinename;
    (void)psiduser;
    (void)pguidextension;
    (void)ppgpolist;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_grouppolicy_GetAppliedGPOListW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* pmachinename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* psiduser = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pguidextension = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* ppgpolist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("userenv.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetAppliedGPOListW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwflags, pmachinename, psiduser, pguidextension, ppgpolist) : 0;
#else
    (void)dwflags;
    (void)pmachinename;
    (void)psiduser;
    (void)pguidextension;
    (void)ppgpolist;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_grouppolicy_GetGPOListA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* htoken = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* lphostname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* lpcomputername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* pgpolist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("userenv.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetGPOListA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(htoken, lpname, lphostname, lpcomputername, dwflags, pgpolist) : -1;
#else
    (void)htoken;
    (void)lpname;
    (void)lphostname;
    (void)lpcomputername;
    (void)dwflags;
    (void)pgpolist;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_grouppolicy_GetGPOListW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* htoken = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* lphostname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* lpcomputername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* pgpolist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("userenv.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetGPOListW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(htoken, lpname, lphostname, lpcomputername, dwflags, pgpolist) : -1;
#else
    (void)htoken;
    (void)lpname;
    (void)lphostname;
    (void)lpcomputername;
    (void)dwflags;
    (void)pgpolist;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_grouppolicy_GetLocalManagedApplicationData_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* productcode = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* displayname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* supporturl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetLocalManagedApplicationData")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(productcode, displayname, supporturl);
#else
    (void)productcode;
    (void)displayname;
    (void)supporturl;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_grouppolicy_GetLocalManagedApplications_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t buserapps = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* pdwapps = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* prglocalapps = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetLocalManagedApplications")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(buserapps, pdwapps, prglocalapps) : 0;
#else
    (void)buserapps;
    (void)pdwapps;
    (void)prglocalapps;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_grouppolicy_GetManagedApplicationCategories_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwreserved = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* pappcategory = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetManagedApplicationCategories")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwreserved, pappcategory) : 0;
#else
    (void)dwreserved;
    (void)pappcategory;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_grouppolicy_GetManagedApplications_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pcategory = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwqueryflags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t dwinfolevel = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pdwapps = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* prgmanagedapps = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetManagedApplications")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pcategory, dwqueryflags, dwinfolevel, pdwapps, prgmanagedapps) : 0;
#else
    (void)pcategory;
    (void)dwqueryflags;
    (void)dwinfolevel;
    (void)pdwapps;
    (void)prgmanagedapps;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_grouppolicy_ImportRSoPData_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpnamespace = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpfilename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gpedit.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ImportRSoPData")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpnamespace, lpfilename) : -1;
#else
    (void)lpnamespace;
    (void)lpfilename;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_grouppolicy_InstallApplication_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pinstallinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "InstallApplication")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pinstallinfo) : 0;
#else
    (void)pinstallinfo;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_grouppolicy_LeaveCriticalPolicySection_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hsection = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("userenv.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "LeaveCriticalPolicySection")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hsection) : -1;
#else
    (void)hsection;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_grouppolicy_ProcessGroupPolicyCompleted_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* extensionid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t pasynchandle = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    uint32_t dwstatus = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("userenv.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ProcessGroupPolicyCompleted")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(extensionid, pasynchandle, dwstatus) : 0;
#else
    (void)extensionid;
    (void)pasynchandle;
    (void)dwstatus;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_grouppolicy_ProcessGroupPolicyCompletedEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* extensionid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t pasynchandle = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    uint32_t dwstatus = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t rsopstatus = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("userenv.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ProcessGroupPolicyCompletedEx")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(extensionid, pasynchandle, dwstatus, rsopstatus) : 0;
#else
    (void)extensionid;
    (void)pasynchandle;
    (void)dwstatus;
    (void)rsopstatus;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_grouppolicy_RefreshPolicy_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t bmachine = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("userenv.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RefreshPolicy")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(bmachine) : -1;
#else
    (void)bmachine;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_grouppolicy_RefreshPolicyEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t bmachine = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t dwoptions = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("userenv.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RefreshPolicyEx")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(bmachine, dwoptions) : -1;
#else
    (void)bmachine;
    (void)dwoptions;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_grouppolicy_RegisterGPNotification_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hevent = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t bmachine = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("userenv.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RegisterGPNotification")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hevent, bmachine) : -1;
#else
    (void)hevent;
    (void)bmachine;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_grouppolicy_RsopAccessCheckByType_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* psecuritydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pprincipalselfsid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* prsoptoken = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t dwdesiredaccessmask = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* pobjecttypelist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t objecttypelistlength = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* pgenericmapping = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* pprivilegeset = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    void* pdwprivilegesetlength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
    void* pdwgrantedaccessmask = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 9 ? km_napi_arg_u64(km_info[9]) : 0));
    void* pbaccessstatus = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 10 ? km_napi_arg_u64(km_info[10]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("userenv.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RsopAccessCheckByType")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(psecuritydescriptor, pprincipalselfsid, prsoptoken, dwdesiredaccessmask, pobjecttypelist, objecttypelistlength, pgenericmapping, pprivilegeset, pdwprivilegesetlength, pdwgrantedaccessmask, pbaccessstatus) : -1;
#else
    (void)psecuritydescriptor;
    (void)pprincipalselfsid;
    (void)prsoptoken;
    (void)dwdesiredaccessmask;
    (void)pobjecttypelist;
    (void)objecttypelistlength;
    (void)pgenericmapping;
    (void)pprivilegeset;
    (void)pdwprivilegesetlength;
    (void)pdwgrantedaccessmask;
    (void)pbaccessstatus;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_grouppolicy_RsopFileAccessCheck_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pszfilename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* prsoptoken = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwdesiredaccessmask = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pdwgrantedaccessmask = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pbaccessstatus = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("userenv.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RsopFileAccessCheck")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pszfilename, prsoptoken, dwdesiredaccessmask, pdwgrantedaccessmask, pbaccessstatus) : -1;
#else
    (void)pszfilename;
    (void)prsoptoken;
    (void)dwdesiredaccessmask;
    (void)pdwgrantedaccessmask;
    (void)pbaccessstatus;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_grouppolicy_RsopResetPolicySettingStatus_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* pservices = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* psettinginstance = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("userenv.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RsopResetPolicySettingStatus")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwflags, pservices, psettinginstance) : -1;
#else
    (void)dwflags;
    (void)pservices;
    (void)psettinginstance;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_grouppolicy_RsopSetPolicySettingStatus_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* pservices = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* psettinginstance = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t ninfo = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* pstatus = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("userenv.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RsopSetPolicySettingStatus")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwflags, pservices, psettinginstance, ninfo, pstatus) : -1;
#else
    (void)dwflags;
    (void)pservices;
    (void)psettinginstance;
    (void)ninfo;
    (void)pstatus;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_grouppolicy_UninstallApplication_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* productcode = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwstatus = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "UninstallApplication")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(productcode, dwstatus) : 0;
#else
    (void)productcode;
    (void)dwstatus;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_grouppolicy_UnregisterGPNotification_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hevent = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("userenv.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "UnregisterGPNotification")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hevent) : -1;
#else
    (void)hevent;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static void register_windows_win32_system_grouppolicy_napi(Napi::Env env, Napi::Object exports) {
    exports.Set("windowssys_windows_win32_system_grouppolicy_BrowseForGPO", Napi::Function::New(env, windowssys_windows_win32_system_grouppolicy_BrowseForGPO_napi));
    exports.Set("windowssys_windows_win32_system_grouppolicy_CommandLineFromMsiDescriptor", Napi::Function::New(env, windowssys_windows_win32_system_grouppolicy_CommandLineFromMsiDescriptor_napi));
    exports.Set("windowssys_windows_win32_system_grouppolicy_CreateGPOLink", Napi::Function::New(env, windowssys_windows_win32_system_grouppolicy_CreateGPOLink_napi));
    exports.Set("windowssys_windows_win32_system_grouppolicy_DeleteAllGPOLinks", Napi::Function::New(env, windowssys_windows_win32_system_grouppolicy_DeleteAllGPOLinks_napi));
    exports.Set("windowssys_windows_win32_system_grouppolicy_DeleteGPOLink", Napi::Function::New(env, windowssys_windows_win32_system_grouppolicy_DeleteGPOLink_napi));
    exports.Set("windowssys_windows_win32_system_grouppolicy_EnterCriticalPolicySection", Napi::Function::New(env, windowssys_windows_win32_system_grouppolicy_EnterCriticalPolicySection_napi));
    exports.Set("windowssys_windows_win32_system_grouppolicy_ExportRSoPData", Napi::Function::New(env, windowssys_windows_win32_system_grouppolicy_ExportRSoPData_napi));
    exports.Set("windowssys_windows_win32_system_grouppolicy_FreeGPOListA", Napi::Function::New(env, windowssys_windows_win32_system_grouppolicy_FreeGPOListA_napi));
    exports.Set("windowssys_windows_win32_system_grouppolicy_FreeGPOListW", Napi::Function::New(env, windowssys_windows_win32_system_grouppolicy_FreeGPOListW_napi));
    exports.Set("windowssys_windows_win32_system_grouppolicy_GenerateGPNotification", Napi::Function::New(env, windowssys_windows_win32_system_grouppolicy_GenerateGPNotification_napi));
    exports.Set("windowssys_windows_win32_system_grouppolicy_GetAppliedGPOListA", Napi::Function::New(env, windowssys_windows_win32_system_grouppolicy_GetAppliedGPOListA_napi));
    exports.Set("windowssys_windows_win32_system_grouppolicy_GetAppliedGPOListW", Napi::Function::New(env, windowssys_windows_win32_system_grouppolicy_GetAppliedGPOListW_napi));
    exports.Set("windowssys_windows_win32_system_grouppolicy_GetGPOListA", Napi::Function::New(env, windowssys_windows_win32_system_grouppolicy_GetGPOListA_napi));
    exports.Set("windowssys_windows_win32_system_grouppolicy_GetGPOListW", Napi::Function::New(env, windowssys_windows_win32_system_grouppolicy_GetGPOListW_napi));
    exports.Set("windowssys_windows_win32_system_grouppolicy_GetLocalManagedApplicationData", Napi::Function::New(env, windowssys_windows_win32_system_grouppolicy_GetLocalManagedApplicationData_napi));
    exports.Set("windowssys_windows_win32_system_grouppolicy_GetLocalManagedApplications", Napi::Function::New(env, windowssys_windows_win32_system_grouppolicy_GetLocalManagedApplications_napi));
    exports.Set("windowssys_windows_win32_system_grouppolicy_GetManagedApplicationCategories", Napi::Function::New(env, windowssys_windows_win32_system_grouppolicy_GetManagedApplicationCategories_napi));
    exports.Set("windowssys_windows_win32_system_grouppolicy_GetManagedApplications", Napi::Function::New(env, windowssys_windows_win32_system_grouppolicy_GetManagedApplications_napi));
    exports.Set("windowssys_windows_win32_system_grouppolicy_ImportRSoPData", Napi::Function::New(env, windowssys_windows_win32_system_grouppolicy_ImportRSoPData_napi));
    exports.Set("windowssys_windows_win32_system_grouppolicy_InstallApplication", Napi::Function::New(env, windowssys_windows_win32_system_grouppolicy_InstallApplication_napi));
    exports.Set("windowssys_windows_win32_system_grouppolicy_LeaveCriticalPolicySection", Napi::Function::New(env, windowssys_windows_win32_system_grouppolicy_LeaveCriticalPolicySection_napi));
    exports.Set("windowssys_windows_win32_system_grouppolicy_ProcessGroupPolicyCompleted", Napi::Function::New(env, windowssys_windows_win32_system_grouppolicy_ProcessGroupPolicyCompleted_napi));
    exports.Set("windowssys_windows_win32_system_grouppolicy_ProcessGroupPolicyCompletedEx", Napi::Function::New(env, windowssys_windows_win32_system_grouppolicy_ProcessGroupPolicyCompletedEx_napi));
    exports.Set("windowssys_windows_win32_system_grouppolicy_RefreshPolicy", Napi::Function::New(env, windowssys_windows_win32_system_grouppolicy_RefreshPolicy_napi));
    exports.Set("windowssys_windows_win32_system_grouppolicy_RefreshPolicyEx", Napi::Function::New(env, windowssys_windows_win32_system_grouppolicy_RefreshPolicyEx_napi));
    exports.Set("windowssys_windows_win32_system_grouppolicy_RegisterGPNotification", Napi::Function::New(env, windowssys_windows_win32_system_grouppolicy_RegisterGPNotification_napi));
    exports.Set("windowssys_windows_win32_system_grouppolicy_RsopAccessCheckByType", Napi::Function::New(env, windowssys_windows_win32_system_grouppolicy_RsopAccessCheckByType_napi));
    exports.Set("windowssys_windows_win32_system_grouppolicy_RsopFileAccessCheck", Napi::Function::New(env, windowssys_windows_win32_system_grouppolicy_RsopFileAccessCheck_napi));
    exports.Set("windowssys_windows_win32_system_grouppolicy_RsopResetPolicySettingStatus", Napi::Function::New(env, windowssys_windows_win32_system_grouppolicy_RsopResetPolicySettingStatus_napi));
    exports.Set("windowssys_windows_win32_system_grouppolicy_RsopSetPolicySettingStatus", Napi::Function::New(env, windowssys_windows_win32_system_grouppolicy_RsopSetPolicySettingStatus_napi));
    exports.Set("windowssys_windows_win32_system_grouppolicy_UninstallApplication", Napi::Function::New(env, windowssys_windows_win32_system_grouppolicy_UninstallApplication_napi));
    exports.Set("windowssys_windows_win32_system_grouppolicy_UnregisterGPNotification", Napi::Function::New(env, windowssys_windows_win32_system_grouppolicy_UnregisterGPNotification_napi));
}

static KmNapiRegistrarNode registrar_node = { &register_windows_win32_system_grouppolicy_napi, nullptr };
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
