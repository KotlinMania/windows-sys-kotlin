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

static Napi::Value windowssys_windows_win32_security_isolation_CreateAppContainerProfile_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pszappcontainername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pszdisplayname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pszdescription = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pcapabilities = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t dwcapabilitycount = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* ppsidappcontainersid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("userenv.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CreateAppContainerProfile")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pszappcontainername, pszdisplayname, pszdescription, pcapabilities, dwcapabilitycount, ppsidappcontainersid) : -1;
#else
    (void)pszappcontainername;
    (void)pszdisplayname;
    (void)pszdescription;
    (void)pcapabilities;
    (void)dwcapabilitycount;
    (void)ppsidappcontainersid;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_isolation_DeleteAppContainerProfile_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pszappcontainername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("userenv.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DeleteAppContainerProfile")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pszappcontainername) : -1;
#else
    (void)pszappcontainername;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_isolation_DeriveAppContainerSidFromAppContainerName_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pszappcontainername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ppsidappcontainersid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("userenv.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DeriveAppContainerSidFromAppContainerName")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pszappcontainername, ppsidappcontainersid) : -1;
#else
    (void)pszappcontainername;
    (void)ppsidappcontainersid;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_isolation_DeriveRestrictedAppContainerSidFromAppContainerSidAndRestrictedName_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* psidappcontainersid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pszrestrictedappcontainername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* ppsidrestrictedappcontainersid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("userenv.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DeriveRestrictedAppContainerSidFromAppContainerSidAndRestrictedName")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(psidappcontainersid, pszrestrictedappcontainername, ppsidrestrictedappcontainersid) : -1;
#else
    (void)psidappcontainersid;
    (void)pszrestrictedappcontainername;
    (void)ppsidrestrictedappcontainersid;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_isolation_GetAppContainerFolderPath_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pszappcontainersid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ppszpath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("userenv.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetAppContainerFolderPath")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pszappcontainersid, ppszpath) : -1;
#else
    (void)pszappcontainersid;
    (void)ppszpath;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_isolation_GetAppContainerNamedObjectPath_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* token = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* appcontainersid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t objectpathlength = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* objectpath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* returnlength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetAppContainerNamedObjectPath")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(token, appcontainersid, objectpathlength, objectpath, returnlength) : -1;
#else
    (void)token;
    (void)appcontainersid;
    (void)objectpathlength;
    (void)objectpath;
    (void)returnlength;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_isolation_GetAppContainerRegistryLocation_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t desiredaccess = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* phappcontainerkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("userenv.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetAppContainerRegistryLocation")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(desiredaccess, phappcontainerkey) : -1;
#else
    (void)desiredaccess;
    (void)phappcontainerkey;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_isolation_IsCrossIsolatedEnvironmentClipboardContent_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* iscrossisolatedenvironmentclipboardcontent = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("isolatedwindowsenvironmentutils.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IsCrossIsolatedEnvironmentClipboardContent")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(iscrossisolatedenvironmentclipboardcontent) : -1;
#else
    (void)iscrossisolatedenvironmentclipboardcontent;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_isolation_IsProcessInIsolatedContainer_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* isprocessinisolatedcontainer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-security-isolatedcontainer-l1-1-0.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IsProcessInIsolatedContainer")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(isprocessinisolatedcontainer) : -1;
#else
    (void)isprocessinisolatedcontainer;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_isolation_IsProcessInIsolatedWindowsEnvironment_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* isprocessinisolatedwindowsenvironment = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("isolatedwindowsenvironmentutils.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IsProcessInIsolatedWindowsEnvironment")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(isprocessinisolatedwindowsenvironment) : -1;
#else
    (void)isprocessinisolatedwindowsenvironment;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_isolation_IsProcessInWDAGContainer_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* reserved = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* isprocessinwdagcontainer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-security-isolatedcontainer-l1-1-1.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IsProcessInWDAGContainer")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(reserved, isprocessinwdagcontainer) : -1;
#else
    (void)reserved;
    (void)isprocessinwdagcontainer;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static void register_windows_win32_security_isolation_napi(Napi::Env env, Napi::Object exports) {
    exports.Set("windowssys_windows_win32_security_isolation_CreateAppContainerProfile", Napi::Function::New(env, windowssys_windows_win32_security_isolation_CreateAppContainerProfile_napi));
    exports.Set("windowssys_windows_win32_security_isolation_DeleteAppContainerProfile", Napi::Function::New(env, windowssys_windows_win32_security_isolation_DeleteAppContainerProfile_napi));
    exports.Set("windowssys_windows_win32_security_isolation_DeriveAppContainerSidFromAppContainerName", Napi::Function::New(env, windowssys_windows_win32_security_isolation_DeriveAppContainerSidFromAppContainerName_napi));
    exports.Set("windowssys_windows_win32_security_isolation_DeriveRestrictedAppContainerSidFromAppContainerSidAndRestrictedName", Napi::Function::New(env, windowssys_windows_win32_security_isolation_DeriveRestrictedAppContainerSidFromAppContainerSidAndRestrictedName_napi));
    exports.Set("windowssys_windows_win32_security_isolation_GetAppContainerFolderPath", Napi::Function::New(env, windowssys_windows_win32_security_isolation_GetAppContainerFolderPath_napi));
    exports.Set("windowssys_windows_win32_security_isolation_GetAppContainerNamedObjectPath", Napi::Function::New(env, windowssys_windows_win32_security_isolation_GetAppContainerNamedObjectPath_napi));
    exports.Set("windowssys_windows_win32_security_isolation_GetAppContainerRegistryLocation", Napi::Function::New(env, windowssys_windows_win32_security_isolation_GetAppContainerRegistryLocation_napi));
    exports.Set("windowssys_windows_win32_security_isolation_IsCrossIsolatedEnvironmentClipboardContent", Napi::Function::New(env, windowssys_windows_win32_security_isolation_IsCrossIsolatedEnvironmentClipboardContent_napi));
    exports.Set("windowssys_windows_win32_security_isolation_IsProcessInIsolatedContainer", Napi::Function::New(env, windowssys_windows_win32_security_isolation_IsProcessInIsolatedContainer_napi));
    exports.Set("windowssys_windows_win32_security_isolation_IsProcessInIsolatedWindowsEnvironment", Napi::Function::New(env, windowssys_windows_win32_security_isolation_IsProcessInIsolatedWindowsEnvironment_napi));
    exports.Set("windowssys_windows_win32_security_isolation_IsProcessInWDAGContainer", Napi::Function::New(env, windowssys_windows_win32_security_isolation_IsProcessInWDAGContainer_napi));
}

static KmNapiRegistrarNode registrar_node = { &register_windows_win32_security_isolation_napi, nullptr };
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
