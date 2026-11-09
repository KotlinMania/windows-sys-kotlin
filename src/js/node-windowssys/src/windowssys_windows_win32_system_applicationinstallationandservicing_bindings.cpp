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

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_ActivateActCtx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hactctx = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpcookie = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ActivateActCtx")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hactctx, lpcookie) : -1;
#else
    (void)hactctx;
    (void)lpcookie;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_AddRefActCtx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hactctx = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "AddRefActCtx")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(hactctx);
#else
    (void)hactctx;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_ApplyDeltaA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t applyflags = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* lpsourcename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* lpdeltaname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* lptargetname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msdelta.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ApplyDeltaA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(applyflags, lpsourcename, lpdeltaname, lptargetname) : -1;
#else
    (void)applyflags;
    (void)lpsourcename;
    (void)lpdeltaname;
    (void)lptargetname;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_ApplyDeltaW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t applyflags = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* lpsourcename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* lpdeltaname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* lptargetname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msdelta.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ApplyDeltaW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(applyflags, lpsourcename, lpdeltaname, lptargetname) : -1;
#else
    (void)applyflags;
    (void)lpsourcename;
    (void)lpdeltaname;
    (void)lptargetname;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_ApplyPatchToFileA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* patchfilename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* oldfilename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* newfilename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t applyoptionflags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mspatcha.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ApplyPatchToFileA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(patchfilename, oldfilename, newfilename, applyoptionflags) : -1;
#else
    (void)patchfilename;
    (void)oldfilename;
    (void)newfilename;
    (void)applyoptionflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_ApplyPatchToFileByBuffers_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* patchfilemapped = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t patchfilesize = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* oldfilemapped = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t oldfilesize = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* newfilebuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t newfilebuffersize = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* newfileactualsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* newfiletime = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    uint32_t applyoptionflags = static_cast<uint32_t>(km_info.Length() > 8 ? km_info[8].ToNumber().Int32Value() : 0);
    void* progresscallback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 9 ? km_napi_arg_u64(km_info[9]) : 0));
    void* callbackcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 10 ? km_napi_arg_u64(km_info[10]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, uint32_t, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mspatcha.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ApplyPatchToFileByBuffers")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(patchfilemapped, patchfilesize, oldfilemapped, oldfilesize, newfilebuffer, newfilebuffersize, newfileactualsize, newfiletime, applyoptionflags, progresscallback, callbackcontext) : -1;
#else
    (void)patchfilemapped;
    (void)patchfilesize;
    (void)oldfilemapped;
    (void)oldfilesize;
    (void)newfilebuffer;
    (void)newfilebuffersize;
    (void)newfileactualsize;
    (void)newfiletime;
    (void)applyoptionflags;
    (void)progresscallback;
    (void)callbackcontext;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_ApplyPatchToFileByHandles_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* patchfilehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* oldfilehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* newfilehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t applyoptionflags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mspatcha.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ApplyPatchToFileByHandles")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(patchfilehandle, oldfilehandle, newfilehandle, applyoptionflags) : -1;
#else
    (void)patchfilehandle;
    (void)oldfilehandle;
    (void)newfilehandle;
    (void)applyoptionflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_ApplyPatchToFileByHandlesEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* patchfilehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* oldfilehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* newfilehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t applyoptionflags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* progresscallback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* callbackcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mspatcha.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ApplyPatchToFileByHandlesEx")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(patchfilehandle, oldfilehandle, newfilehandle, applyoptionflags, progresscallback, callbackcontext) : -1;
#else
    (void)patchfilehandle;
    (void)oldfilehandle;
    (void)newfilehandle;
    (void)applyoptionflags;
    (void)progresscallback;
    (void)callbackcontext;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_ApplyPatchToFileExA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* patchfilename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* oldfilename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* newfilename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t applyoptionflags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* progresscallback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* callbackcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mspatcha.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ApplyPatchToFileExA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(patchfilename, oldfilename, newfilename, applyoptionflags, progresscallback, callbackcontext) : -1;
#else
    (void)patchfilename;
    (void)oldfilename;
    (void)newfilename;
    (void)applyoptionflags;
    (void)progresscallback;
    (void)callbackcontext;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_ApplyPatchToFileExW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* patchfilename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* oldfilename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* newfilename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t applyoptionflags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* progresscallback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* callbackcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mspatcha.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ApplyPatchToFileExW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(patchfilename, oldfilename, newfilename, applyoptionflags, progresscallback, callbackcontext) : -1;
#else
    (void)patchfilename;
    (void)oldfilename;
    (void)newfilename;
    (void)applyoptionflags;
    (void)progresscallback;
    (void)callbackcontext;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_ApplyPatchToFileW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* patchfilename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* oldfilename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* newfilename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t applyoptionflags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mspatcha.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ApplyPatchToFileW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(patchfilename, oldfilename, newfilename, applyoptionflags) : -1;
#else
    (void)patchfilename;
    (void)oldfilename;
    (void)newfilename;
    (void)applyoptionflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_CreateActCtxA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pactctx = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CreateActCtxA")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pactctx) : NULL;
#else
    (void)pactctx;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_CreateActCtxW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pactctx = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CreateActCtxW")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pactctx) : NULL;
#else
    (void)pactctx;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_CreatePatchFileA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* oldfilename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* newfilename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* patchfilename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t optionflags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* optiondata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mspatchc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CreatePatchFileA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(oldfilename, newfilename, patchfilename, optionflags, optiondata) : -1;
#else
    (void)oldfilename;
    (void)newfilename;
    (void)patchfilename;
    (void)optionflags;
    (void)optiondata;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_CreatePatchFileByHandles_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* oldfilehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* newfilehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* patchfilehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t optionflags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* optiondata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mspatchc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CreatePatchFileByHandles")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(oldfilehandle, newfilehandle, patchfilehandle, optionflags, optiondata) : -1;
#else
    (void)oldfilehandle;
    (void)newfilehandle;
    (void)patchfilehandle;
    (void)optionflags;
    (void)optiondata;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_CreatePatchFileByHandlesEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t oldfilecount = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* oldfileinfoarray = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* newfilehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* patchfilehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t optionflags = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* optiondata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* progresscallback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* callbackcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mspatchc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CreatePatchFileByHandlesEx")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(oldfilecount, oldfileinfoarray, newfilehandle, patchfilehandle, optionflags, optiondata, progresscallback, callbackcontext) : -1;
#else
    (void)oldfilecount;
    (void)oldfileinfoarray;
    (void)newfilehandle;
    (void)patchfilehandle;
    (void)optionflags;
    (void)optiondata;
    (void)progresscallback;
    (void)callbackcontext;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_CreatePatchFileExA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t oldfilecount = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* oldfileinfoarray = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* newfilename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* patchfilename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t optionflags = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* optiondata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* progresscallback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* callbackcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mspatchc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CreatePatchFileExA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(oldfilecount, oldfileinfoarray, newfilename, patchfilename, optionflags, optiondata, progresscallback, callbackcontext) : -1;
#else
    (void)oldfilecount;
    (void)oldfileinfoarray;
    (void)newfilename;
    (void)patchfilename;
    (void)optionflags;
    (void)optiondata;
    (void)progresscallback;
    (void)callbackcontext;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_CreatePatchFileExW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t oldfilecount = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* oldfileinfoarray = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* newfilename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* patchfilename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t optionflags = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* optiondata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* progresscallback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* callbackcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mspatchc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CreatePatchFileExW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(oldfilecount, oldfileinfoarray, newfilename, patchfilename, optionflags, optiondata, progresscallback, callbackcontext) : -1;
#else
    (void)oldfilecount;
    (void)oldfileinfoarray;
    (void)newfilename;
    (void)patchfilename;
    (void)optionflags;
    (void)optiondata;
    (void)progresscallback;
    (void)callbackcontext;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_CreatePatchFileW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* oldfilename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* newfilename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* patchfilename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t optionflags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* optiondata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mspatchc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CreatePatchFileW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(oldfilename, newfilename, patchfilename, optionflags, optiondata) : -1;
#else
    (void)oldfilename;
    (void)newfilename;
    (void)patchfilename;
    (void)optionflags;
    (void)optiondata;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_DeactivateActCtx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint64_t ulcookie = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DeactivateActCtx")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwflags, ulcookie) : -1;
#else
    (void)dwflags;
    (void)ulcookie;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_DeltaFree_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpmemory = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msdelta.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DeltaFree")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpmemory) : -1;
#else
    (void)lpmemory;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_ExtractPatchHeaderToFileA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* patchfilename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* patchheaderfilename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mspatchc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ExtractPatchHeaderToFileA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(patchfilename, patchheaderfilename) : -1;
#else
    (void)patchfilename;
    (void)patchheaderfilename;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_ExtractPatchHeaderToFileByHandles_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* patchfilehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* patchheaderfilehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mspatchc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ExtractPatchHeaderToFileByHandles")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(patchfilehandle, patchheaderfilehandle) : -1;
#else
    (void)patchfilehandle;
    (void)patchheaderfilehandle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_ExtractPatchHeaderToFileW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* patchfilename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* patchheaderfilename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mspatchc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ExtractPatchHeaderToFileW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(patchfilename, patchheaderfilename) : -1;
#else
    (void)patchfilename;
    (void)patchheaderfilename;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_FindActCtxSectionGuid_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* lpextensionguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t ulsectionid = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* lpguidtofind = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* returneddata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FindActCtxSectionGuid")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwflags, lpextensionguid, ulsectionid, lpguidtofind, returneddata) : -1;
#else
    (void)dwflags;
    (void)lpextensionguid;
    (void)ulsectionid;
    (void)lpguidtofind;
    (void)returneddata;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_FindActCtxSectionStringA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* lpextensionguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t ulsectionid = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* lpstringtofind = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* returneddata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FindActCtxSectionStringA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwflags, lpextensionguid, ulsectionid, lpstringtofind, returneddata) : -1;
#else
    (void)dwflags;
    (void)lpextensionguid;
    (void)ulsectionid;
    (void)lpstringtofind;
    (void)returneddata;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_FindActCtxSectionStringW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* lpextensionguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t ulsectionid = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* lpstringtofind = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* returneddata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FindActCtxSectionStringW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwflags, lpextensionguid, ulsectionid, lpstringtofind, returneddata) : -1;
#else
    (void)dwflags;
    (void)lpextensionguid;
    (void)ulsectionid;
    (void)lpstringtofind;
    (void)returneddata;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_GetCurrentActCtx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lphactctx = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetCurrentActCtx")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lphactctx) : -1;
#else
    (void)lphactctx;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_GetDeltaInfoA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpdeltaname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpheaderinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msdelta.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetDeltaInfoA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpdeltaname, lpheaderinfo) : -1;
#else
    (void)lpdeltaname;
    (void)lpheaderinfo;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_GetDeltaInfoW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpdeltaname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpheaderinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msdelta.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetDeltaInfoW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpdeltaname, lpheaderinfo) : -1;
#else
    (void)lpdeltaname;
    (void)lpheaderinfo;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_GetDeltaSignatureA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t filetypeset = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint32_t hashalgid = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* lpsourcename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* lphash = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msdelta.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetDeltaSignatureA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(filetypeset, hashalgid, lpsourcename, lphash) : -1;
#else
    (void)filetypeset;
    (void)hashalgid;
    (void)lpsourcename;
    (void)lphash;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_GetDeltaSignatureW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t filetypeset = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint32_t hashalgid = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* lpsourcename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* lphash = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msdelta.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetDeltaSignatureW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(filetypeset, hashalgid, lpsourcename, lphash) : -1;
#else
    (void)filetypeset;
    (void)hashalgid;
    (void)lpsourcename;
    (void)lphash;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_GetFilePatchSignatureA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* filename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t optionflags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* optiondata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t ignorerangecount = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* ignorerangearray = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t retainrangecount = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* retainrangearray = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    uint32_t signaturebuffersize = static_cast<uint32_t>(km_info.Length() > 7 ? km_info[7].ToNumber().Int32Value() : 0);
    void* signaturebuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mspatcha.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetFilePatchSignatureA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(filename, optionflags, optiondata, ignorerangecount, ignorerangearray, retainrangecount, retainrangearray, signaturebuffersize, signaturebuffer) : -1;
#else
    (void)filename;
    (void)optionflags;
    (void)optiondata;
    (void)ignorerangecount;
    (void)ignorerangearray;
    (void)retainrangecount;
    (void)retainrangearray;
    (void)signaturebuffersize;
    (void)signaturebuffer;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_GetFilePatchSignatureByBuffer_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* filebufferwritable = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t filesize = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t optionflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* optiondata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t ignorerangecount = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* ignorerangearray = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    uint32_t retainrangecount = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    void* retainrangearray = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    uint32_t signaturebuffersize = static_cast<uint32_t>(km_info.Length() > 8 ? km_info[8].ToNumber().Int32Value() : 0);
    void* signaturebuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 9 ? km_napi_arg_u64(km_info[9]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, uint32_t, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mspatcha.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetFilePatchSignatureByBuffer")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(filebufferwritable, filesize, optionflags, optiondata, ignorerangecount, ignorerangearray, retainrangecount, retainrangearray, signaturebuffersize, signaturebuffer) : -1;
#else
    (void)filebufferwritable;
    (void)filesize;
    (void)optionflags;
    (void)optiondata;
    (void)ignorerangecount;
    (void)ignorerangearray;
    (void)retainrangecount;
    (void)retainrangearray;
    (void)signaturebuffersize;
    (void)signaturebuffer;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_GetFilePatchSignatureByHandle_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* filehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t optionflags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* optiondata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t ignorerangecount = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* ignorerangearray = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t retainrangecount = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* retainrangearray = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    uint32_t signaturebuffersize = static_cast<uint32_t>(km_info.Length() > 7 ? km_info[7].ToNumber().Int32Value() : 0);
    void* signaturebuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mspatcha.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetFilePatchSignatureByHandle")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(filehandle, optionflags, optiondata, ignorerangecount, ignorerangearray, retainrangecount, retainrangearray, signaturebuffersize, signaturebuffer) : -1;
#else
    (void)filehandle;
    (void)optionflags;
    (void)optiondata;
    (void)ignorerangecount;
    (void)ignorerangearray;
    (void)retainrangecount;
    (void)retainrangearray;
    (void)signaturebuffersize;
    (void)signaturebuffer;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_GetFilePatchSignatureW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* filename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t optionflags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* optiondata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t ignorerangecount = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* ignorerangearray = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t retainrangecount = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* retainrangearray = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    uint32_t signaturebuffersize = static_cast<uint32_t>(km_info.Length() > 7 ? km_info[7].ToNumber().Int32Value() : 0);
    void* signaturebuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mspatcha.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetFilePatchSignatureW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(filename, optionflags, optiondata, ignorerangecount, ignorerangearray, retainrangecount, retainrangearray, signaturebuffersize, signaturebuffer) : -1;
#else
    (void)filename;
    (void)optionflags;
    (void)optiondata;
    (void)ignorerangecount;
    (void)ignorerangearray;
    (void)retainrangecount;
    (void)retainrangearray;
    (void)signaturebuffersize;
    (void)signaturebuffer;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiAdvertiseProductA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* szpackagepath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* szscriptfilepath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* sztransforms = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint16_t lgidlanguage = static_cast<uint16_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint16_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiAdvertiseProductA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(szpackagepath, szscriptfilepath, sztransforms, lgidlanguage) : 0;
#else
    (void)szpackagepath;
    (void)szscriptfilepath;
    (void)sztransforms;
    (void)lgidlanguage;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiAdvertiseProductExA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* szpackagepath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* szscriptfilepath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* sztransforms = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint16_t lgidlanguage = static_cast<uint16_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t dwplatform = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    uint32_t dwoptions = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint16_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiAdvertiseProductExA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(szpackagepath, szscriptfilepath, sztransforms, lgidlanguage, dwplatform, dwoptions) : 0;
#else
    (void)szpackagepath;
    (void)szscriptfilepath;
    (void)sztransforms;
    (void)lgidlanguage;
    (void)dwplatform;
    (void)dwoptions;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiAdvertiseProductExW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* szpackagepath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* szscriptfilepath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* sztransforms = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint16_t lgidlanguage = static_cast<uint16_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t dwplatform = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    uint32_t dwoptions = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint16_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiAdvertiseProductExW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(szpackagepath, szscriptfilepath, sztransforms, lgidlanguage, dwplatform, dwoptions) : 0;
#else
    (void)szpackagepath;
    (void)szscriptfilepath;
    (void)sztransforms;
    (void)lgidlanguage;
    (void)dwplatform;
    (void)dwoptions;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiAdvertiseProductW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* szpackagepath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* szscriptfilepath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* sztransforms = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint16_t lgidlanguage = static_cast<uint16_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint16_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiAdvertiseProductW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(szpackagepath, szscriptfilepath, sztransforms, lgidlanguage) : 0;
#else
    (void)szpackagepath;
    (void)szscriptfilepath;
    (void)sztransforms;
    (void)lgidlanguage;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiAdvertiseScriptA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* szscriptfile = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* phregdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int32_t fremoveitems = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiAdvertiseScriptA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(szscriptfile, dwflags, phregdata, fremoveitems) : 0;
#else
    (void)szscriptfile;
    (void)dwflags;
    (void)phregdata;
    (void)fremoveitems;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiAdvertiseScriptW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* szscriptfile = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* phregdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int32_t fremoveitems = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiAdvertiseScriptW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(szscriptfile, dwflags, phregdata, fremoveitems) : 0;
#else
    (void)szscriptfile;
    (void)dwflags;
    (void)phregdata;
    (void)fremoveitems;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiApplyMultiplePatchesA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* szpatchpackages = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* szproductcode = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* szpropertieslist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiApplyMultiplePatchesA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(szpatchpackages, szproductcode, szpropertieslist) : 0;
#else
    (void)szpatchpackages;
    (void)szproductcode;
    (void)szpropertieslist;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiApplyMultiplePatchesW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* szpatchpackages = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* szproductcode = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* szpropertieslist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiApplyMultiplePatchesW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(szpatchpackages, szproductcode, szpropertieslist) : 0;
#else
    (void)szpatchpackages;
    (void)szproductcode;
    (void)szpropertieslist;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiApplyPatchA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* szpatchpackage = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* szinstallpackage = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t einstalltype = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* szcommandline = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiApplyPatchA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(szpatchpackage, szinstallpackage, einstalltype, szcommandline) : 0;
#else
    (void)szpatchpackage;
    (void)szinstallpackage;
    (void)einstalltype;
    (void)szcommandline;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiApplyPatchW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* szpatchpackage = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* szinstallpackage = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t einstalltype = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* szcommandline = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiApplyPatchW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(szpatchpackage, szinstallpackage, einstalltype, szcommandline) : 0;
#else
    (void)szpatchpackage;
    (void)szinstallpackage;
    (void)einstalltype;
    (void)szcommandline;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiBeginTransactionA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* szname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwtransactionattributes = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* phtransactionhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* phchangeofownerevent = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiBeginTransactionA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(szname, dwtransactionattributes, phtransactionhandle, phchangeofownerevent) : 0;
#else
    (void)szname;
    (void)dwtransactionattributes;
    (void)phtransactionhandle;
    (void)phchangeofownerevent;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiBeginTransactionW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* szname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwtransactionattributes = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* phtransactionhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* phchangeofownerevent = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiBeginTransactionW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(szname, dwtransactionattributes, phtransactionhandle, phchangeofownerevent) : 0;
#else
    (void)szname;
    (void)dwtransactionattributes;
    (void)phtransactionhandle;
    (void)phchangeofownerevent;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiCloseAllHandles_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiCloseAllHandles")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr() : 0;
#else
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiCloseHandle_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t hany = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiCloseHandle")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hany) : 0;
#else
    (void)hany;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiCollectUserInfoA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* szproduct = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiCollectUserInfoA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(szproduct) : 0;
#else
    (void)szproduct;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiCollectUserInfoW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* szproduct = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiCollectUserInfoW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(szproduct) : 0;
#else
    (void)szproduct;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiConfigureFeatureA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* szproduct = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* szfeature = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t einstallstate = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiConfigureFeatureA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(szproduct, szfeature, einstallstate) : 0;
#else
    (void)szproduct;
    (void)szfeature;
    (void)einstallstate;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiConfigureFeatureW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* szproduct = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* szfeature = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t einstallstate = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiConfigureFeatureW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(szproduct, szfeature, einstallstate) : 0;
#else
    (void)szproduct;
    (void)szfeature;
    (void)einstallstate;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiConfigureProductA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* szproduct = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t iinstalllevel = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t einstallstate = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiConfigureProductA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(szproduct, iinstalllevel, einstallstate) : 0;
#else
    (void)szproduct;
    (void)iinstalllevel;
    (void)einstallstate;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiConfigureProductExA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* szproduct = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t iinstalllevel = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t einstallstate = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* szcommandline = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiConfigureProductExA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(szproduct, iinstalllevel, einstallstate, szcommandline) : 0;
#else
    (void)szproduct;
    (void)iinstalllevel;
    (void)einstallstate;
    (void)szcommandline;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiConfigureProductExW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* szproduct = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t iinstalllevel = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t einstallstate = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* szcommandline = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiConfigureProductExW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(szproduct, iinstalllevel, einstallstate, szcommandline) : 0;
#else
    (void)szproduct;
    (void)iinstalllevel;
    (void)einstallstate;
    (void)szcommandline;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiConfigureProductW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* szproduct = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t iinstalllevel = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t einstallstate = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiConfigureProductW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(szproduct, iinstalllevel, einstallstate) : 0;
#else
    (void)szproduct;
    (void)iinstalllevel;
    (void)einstallstate;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiCreateRecord_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t cparams = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiCreateRecord")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(cparams) : 0;
#else
    (void)cparams;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiCreateTransformSummaryInfoA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t hdatabase = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t hdatabasereference = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* sztransformfile = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int32_t ierrorconditions = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    int32_t ivalidation = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiCreateTransformSummaryInfoA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hdatabase, hdatabasereference, sztransformfile, ierrorconditions, ivalidation) : 0;
#else
    (void)hdatabase;
    (void)hdatabasereference;
    (void)sztransformfile;
    (void)ierrorconditions;
    (void)ivalidation;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiCreateTransformSummaryInfoW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t hdatabase = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t hdatabasereference = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* sztransformfile = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int32_t ierrorconditions = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    int32_t ivalidation = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiCreateTransformSummaryInfoW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hdatabase, hdatabasereference, sztransformfile, ierrorconditions, ivalidation) : 0;
#else
    (void)hdatabase;
    (void)hdatabasereference;
    (void)sztransformfile;
    (void)ierrorconditions;
    (void)ivalidation;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiDatabaseApplyTransformA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t hdatabase = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* sztransformfile = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t ierrorconditions = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiDatabaseApplyTransformA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hdatabase, sztransformfile, ierrorconditions) : 0;
#else
    (void)hdatabase;
    (void)sztransformfile;
    (void)ierrorconditions;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiDatabaseApplyTransformW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t hdatabase = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* sztransformfile = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t ierrorconditions = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiDatabaseApplyTransformW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hdatabase, sztransformfile, ierrorconditions) : 0;
#else
    (void)hdatabase;
    (void)sztransformfile;
    (void)ierrorconditions;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiDatabaseCommit_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t hdatabase = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiDatabaseCommit")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hdatabase) : 0;
#else
    (void)hdatabase;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiDatabaseExportA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t hdatabase = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* sztablename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* szfolderpath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* szfilename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiDatabaseExportA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hdatabase, sztablename, szfolderpath, szfilename) : 0;
#else
    (void)hdatabase;
    (void)sztablename;
    (void)szfolderpath;
    (void)szfilename;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiDatabaseExportW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t hdatabase = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* sztablename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* szfolderpath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* szfilename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiDatabaseExportW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hdatabase, sztablename, szfolderpath, szfilename) : 0;
#else
    (void)hdatabase;
    (void)sztablename;
    (void)szfolderpath;
    (void)szfilename;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiDatabaseGenerateTransformA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t hdatabase = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t hdatabasereference = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* sztransformfile = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int32_t ireserved1 = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    int32_t ireserved2 = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiDatabaseGenerateTransformA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hdatabase, hdatabasereference, sztransformfile, ireserved1, ireserved2) : 0;
#else
    (void)hdatabase;
    (void)hdatabasereference;
    (void)sztransformfile;
    (void)ireserved1;
    (void)ireserved2;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiDatabaseGenerateTransformW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t hdatabase = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t hdatabasereference = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* sztransformfile = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int32_t ireserved1 = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    int32_t ireserved2 = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiDatabaseGenerateTransformW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hdatabase, hdatabasereference, sztransformfile, ireserved1, ireserved2) : 0;
#else
    (void)hdatabase;
    (void)hdatabasereference;
    (void)sztransformfile;
    (void)ireserved1;
    (void)ireserved2;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiDatabaseGetPrimaryKeysA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t hdatabase = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* sztablename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* phrecord = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiDatabaseGetPrimaryKeysA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hdatabase, sztablename, phrecord) : 0;
#else
    (void)hdatabase;
    (void)sztablename;
    (void)phrecord;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiDatabaseGetPrimaryKeysW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t hdatabase = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* sztablename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* phrecord = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiDatabaseGetPrimaryKeysW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hdatabase, sztablename, phrecord) : 0;
#else
    (void)hdatabase;
    (void)sztablename;
    (void)phrecord;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiDatabaseImportA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t hdatabase = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* szfolderpath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* szfilename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiDatabaseImportA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hdatabase, szfolderpath, szfilename) : 0;
#else
    (void)hdatabase;
    (void)szfolderpath;
    (void)szfilename;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiDatabaseImportW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t hdatabase = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* szfolderpath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* szfilename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiDatabaseImportW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hdatabase, szfolderpath, szfilename) : 0;
#else
    (void)hdatabase;
    (void)szfolderpath;
    (void)szfilename;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiDatabaseIsTablePersistentA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t hdatabase = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* sztablename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiDatabaseIsTablePersistentA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hdatabase, sztablename) : -1;
#else
    (void)hdatabase;
    (void)sztablename;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiDatabaseIsTablePersistentW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t hdatabase = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* sztablename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiDatabaseIsTablePersistentW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hdatabase, sztablename) : -1;
#else
    (void)hdatabase;
    (void)sztablename;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiDatabaseMergeA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t hdatabase = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t hdatabasemerge = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* sztablename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiDatabaseMergeA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hdatabase, hdatabasemerge, sztablename) : 0;
#else
    (void)hdatabase;
    (void)hdatabasemerge;
    (void)sztablename;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiDatabaseMergeW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t hdatabase = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t hdatabasemerge = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* sztablename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiDatabaseMergeW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hdatabase, hdatabasemerge, sztablename) : 0;
#else
    (void)hdatabase;
    (void)hdatabasemerge;
    (void)sztablename;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiDatabaseOpenViewA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t hdatabase = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* szquery = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* phview = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiDatabaseOpenViewA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hdatabase, szquery, phview) : 0;
#else
    (void)hdatabase;
    (void)szquery;
    (void)phview;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiDatabaseOpenViewW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t hdatabase = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* szquery = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* phview = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiDatabaseOpenViewW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hdatabase, szquery, phview) : 0;
#else
    (void)hdatabase;
    (void)szquery;
    (void)phview;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiDetermineApplicablePatchesA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* szproductpackagepath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t cpatchinfo = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* ppatchinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiDetermineApplicablePatchesA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(szproductpackagepath, cpatchinfo, ppatchinfo) : 0;
#else
    (void)szproductpackagepath;
    (void)cpatchinfo;
    (void)ppatchinfo;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiDetermineApplicablePatchesW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* szproductpackagepath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t cpatchinfo = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* ppatchinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiDetermineApplicablePatchesW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(szproductpackagepath, cpatchinfo, ppatchinfo) : 0;
#else
    (void)szproductpackagepath;
    (void)cpatchinfo;
    (void)ppatchinfo;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiDeterminePatchSequenceA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* szproductcode = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* szusersid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t dwcontext = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t cpatchinfo = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* ppatchinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiDeterminePatchSequenceA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(szproductcode, szusersid, dwcontext, cpatchinfo, ppatchinfo) : 0;
#else
    (void)szproductcode;
    (void)szusersid;
    (void)dwcontext;
    (void)cpatchinfo;
    (void)ppatchinfo;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiDeterminePatchSequenceW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* szproductcode = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* szusersid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t dwcontext = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t cpatchinfo = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* ppatchinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiDeterminePatchSequenceW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(szproductcode, szusersid, dwcontext, cpatchinfo, ppatchinfo) : 0;
#else
    (void)szproductcode;
    (void)szusersid;
    (void)dwcontext;
    (void)cpatchinfo;
    (void)ppatchinfo;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiDoActionA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t hinstall = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* szaction = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiDoActionA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hinstall, szaction) : 0;
#else
    (void)hinstall;
    (void)szaction;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiDoActionW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t hinstall = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* szaction = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiDoActionW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hinstall, szaction) : 0;
#else
    (void)hinstall;
    (void)szaction;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnableLogA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwlogmode = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* szlogfile = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwlogattributes = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiEnableLogA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwlogmode, szlogfile, dwlogattributes) : 0;
#else
    (void)dwlogmode;
    (void)szlogfile;
    (void)dwlogattributes;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnableLogW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwlogmode = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* szlogfile = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwlogattributes = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiEnableLogW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwlogmode, szlogfile, dwlogattributes) : 0;
#else
    (void)dwlogmode;
    (void)szlogfile;
    (void)dwlogattributes;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnableUIPreview_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t hdatabase = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* phpreview = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiEnableUIPreview")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hdatabase, phpreview) : 0;
#else
    (void)hdatabase;
    (void)phpreview;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiEndTransaction_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwtransactionstate = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiEndTransaction")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwtransactionstate) : 0;
#else
    (void)dwtransactionstate;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnumClientsA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* szcomponent = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t iproductindex = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* lpproductbuf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiEnumClientsA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(szcomponent, iproductindex, lpproductbuf) : 0;
#else
    (void)szcomponent;
    (void)iproductindex;
    (void)lpproductbuf;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnumClientsExA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* szcomponent = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* szusersid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwcontext = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t dwproductindex = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* szproductbuf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* pdwinstalledcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* szsid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* pcchsid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiEnumClientsExA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(szcomponent, szusersid, dwcontext, dwproductindex, szproductbuf, pdwinstalledcontext, szsid, pcchsid) : 0;
#else
    (void)szcomponent;
    (void)szusersid;
    (void)dwcontext;
    (void)dwproductindex;
    (void)szproductbuf;
    (void)pdwinstalledcontext;
    (void)szsid;
    (void)pcchsid;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnumClientsExW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* szcomponent = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* szusersid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwcontext = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t dwproductindex = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* szproductbuf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* pdwinstalledcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* szsid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* pcchsid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiEnumClientsExW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(szcomponent, szusersid, dwcontext, dwproductindex, szproductbuf, pdwinstalledcontext, szsid, pcchsid) : 0;
#else
    (void)szcomponent;
    (void)szusersid;
    (void)dwcontext;
    (void)dwproductindex;
    (void)szproductbuf;
    (void)pdwinstalledcontext;
    (void)szsid;
    (void)pcchsid;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnumClientsW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* szcomponent = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t iproductindex = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* lpproductbuf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiEnumClientsW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(szcomponent, iproductindex, lpproductbuf) : 0;
#else
    (void)szcomponent;
    (void)iproductindex;
    (void)lpproductbuf;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnumComponentCostsA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t hinstall = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* szcomponent = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwindex = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t istate = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* szdrivebuf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* pcchdrivebuf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* picost = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* pitempcost = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, int32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiEnumComponentCostsA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hinstall, szcomponent, dwindex, istate, szdrivebuf, pcchdrivebuf, picost, pitempcost) : 0;
#else
    (void)hinstall;
    (void)szcomponent;
    (void)dwindex;
    (void)istate;
    (void)szdrivebuf;
    (void)pcchdrivebuf;
    (void)picost;
    (void)pitempcost;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnumComponentCostsW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t hinstall = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* szcomponent = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwindex = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t istate = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* szdrivebuf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* pcchdrivebuf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* picost = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* pitempcost = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, int32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiEnumComponentCostsW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hinstall, szcomponent, dwindex, istate, szdrivebuf, pcchdrivebuf, picost, pitempcost) : 0;
#else
    (void)hinstall;
    (void)szcomponent;
    (void)dwindex;
    (void)istate;
    (void)szdrivebuf;
    (void)pcchdrivebuf;
    (void)picost;
    (void)pitempcost;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnumComponentQualifiersA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* szcomponent = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t iindex = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* lpqualifierbuf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pcchqualifierbuf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* lpapplicationdatabuf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* pcchapplicationdatabuf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiEnumComponentQualifiersA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(szcomponent, iindex, lpqualifierbuf, pcchqualifierbuf, lpapplicationdatabuf, pcchapplicationdatabuf) : 0;
#else
    (void)szcomponent;
    (void)iindex;
    (void)lpqualifierbuf;
    (void)pcchqualifierbuf;
    (void)lpapplicationdatabuf;
    (void)pcchapplicationdatabuf;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnumComponentQualifiersW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* szcomponent = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t iindex = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* lpqualifierbuf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pcchqualifierbuf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* lpapplicationdatabuf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* pcchapplicationdatabuf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiEnumComponentQualifiersW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(szcomponent, iindex, lpqualifierbuf, pcchqualifierbuf, lpapplicationdatabuf, pcchapplicationdatabuf) : 0;
#else
    (void)szcomponent;
    (void)iindex;
    (void)lpqualifierbuf;
    (void)pcchqualifierbuf;
    (void)lpapplicationdatabuf;
    (void)pcchapplicationdatabuf;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnumComponentsA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t icomponentindex = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* lpcomponentbuf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiEnumComponentsA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(icomponentindex, lpcomponentbuf) : 0;
#else
    (void)icomponentindex;
    (void)lpcomponentbuf;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnumComponentsExA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* szusersid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwcontext = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t dwindex = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* szinstalledcomponentcode = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pdwinstalledcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* szsid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* pcchsid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiEnumComponentsExA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(szusersid, dwcontext, dwindex, szinstalledcomponentcode, pdwinstalledcontext, szsid, pcchsid) : 0;
#else
    (void)szusersid;
    (void)dwcontext;
    (void)dwindex;
    (void)szinstalledcomponentcode;
    (void)pdwinstalledcontext;
    (void)szsid;
    (void)pcchsid;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnumComponentsExW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* szusersid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwcontext = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t dwindex = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* szinstalledcomponentcode = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pdwinstalledcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* szsid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* pcchsid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiEnumComponentsExW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(szusersid, dwcontext, dwindex, szinstalledcomponentcode, pdwinstalledcontext, szsid, pcchsid) : 0;
#else
    (void)szusersid;
    (void)dwcontext;
    (void)dwindex;
    (void)szinstalledcomponentcode;
    (void)pdwinstalledcontext;
    (void)szsid;
    (void)pcchsid;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnumComponentsW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t icomponentindex = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* lpcomponentbuf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiEnumComponentsW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(icomponentindex, lpcomponentbuf) : 0;
#else
    (void)icomponentindex;
    (void)lpcomponentbuf;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnumFeaturesA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* szproduct = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t ifeatureindex = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* lpfeaturebuf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* lpparentbuf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiEnumFeaturesA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(szproduct, ifeatureindex, lpfeaturebuf, lpparentbuf) : 0;
#else
    (void)szproduct;
    (void)ifeatureindex;
    (void)lpfeaturebuf;
    (void)lpparentbuf;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnumFeaturesW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* szproduct = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t ifeatureindex = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* lpfeaturebuf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* lpparentbuf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiEnumFeaturesW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(szproduct, ifeatureindex, lpfeaturebuf, lpparentbuf) : 0;
#else
    (void)szproduct;
    (void)ifeatureindex;
    (void)lpfeaturebuf;
    (void)lpparentbuf;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnumPatchesA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* szproduct = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t ipatchindex = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* lppatchbuf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* lptransformsbuf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pcchtransformsbuf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiEnumPatchesA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(szproduct, ipatchindex, lppatchbuf, lptransformsbuf, pcchtransformsbuf) : 0;
#else
    (void)szproduct;
    (void)ipatchindex;
    (void)lppatchbuf;
    (void)lptransformsbuf;
    (void)pcchtransformsbuf;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnumPatchesExA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* szproductcode = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* szusersid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwcontext = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t dwfilter = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t dwindex = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* szpatchcode = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* sztargetproductcode = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* pdwtargetproductcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    void* sztargetusersid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
    void* pcchtargetusersid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 9 ? km_napi_arg_u64(km_info[9]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiEnumPatchesExA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(szproductcode, szusersid, dwcontext, dwfilter, dwindex, szpatchcode, sztargetproductcode, pdwtargetproductcontext, sztargetusersid, pcchtargetusersid) : 0;
#else
    (void)szproductcode;
    (void)szusersid;
    (void)dwcontext;
    (void)dwfilter;
    (void)dwindex;
    (void)szpatchcode;
    (void)sztargetproductcode;
    (void)pdwtargetproductcontext;
    (void)sztargetusersid;
    (void)pcchtargetusersid;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnumPatchesExW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* szproductcode = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* szusersid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwcontext = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t dwfilter = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t dwindex = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* szpatchcode = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* sztargetproductcode = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* pdwtargetproductcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    void* sztargetusersid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
    void* pcchtargetusersid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 9 ? km_napi_arg_u64(km_info[9]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiEnumPatchesExW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(szproductcode, szusersid, dwcontext, dwfilter, dwindex, szpatchcode, sztargetproductcode, pdwtargetproductcontext, sztargetusersid, pcchtargetusersid) : 0;
#else
    (void)szproductcode;
    (void)szusersid;
    (void)dwcontext;
    (void)dwfilter;
    (void)dwindex;
    (void)szpatchcode;
    (void)sztargetproductcode;
    (void)pdwtargetproductcontext;
    (void)sztargetusersid;
    (void)pcchtargetusersid;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnumPatchesW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* szproduct = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t ipatchindex = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* lppatchbuf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* lptransformsbuf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pcchtransformsbuf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiEnumPatchesW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(szproduct, ipatchindex, lppatchbuf, lptransformsbuf, pcchtransformsbuf) : 0;
#else
    (void)szproduct;
    (void)ipatchindex;
    (void)lppatchbuf;
    (void)lptransformsbuf;
    (void)pcchtransformsbuf;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnumProductsA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t iproductindex = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* lpproductbuf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiEnumProductsA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(iproductindex, lpproductbuf) : 0;
#else
    (void)iproductindex;
    (void)lpproductbuf;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnumProductsExA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* szproductcode = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* szusersid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwcontext = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t dwindex = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* szinstalledproductcode = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* pdwinstalledcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* szsid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* pcchsid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiEnumProductsExA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(szproductcode, szusersid, dwcontext, dwindex, szinstalledproductcode, pdwinstalledcontext, szsid, pcchsid) : 0;
#else
    (void)szproductcode;
    (void)szusersid;
    (void)dwcontext;
    (void)dwindex;
    (void)szinstalledproductcode;
    (void)pdwinstalledcontext;
    (void)szsid;
    (void)pcchsid;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnumProductsExW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* szproductcode = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* szusersid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwcontext = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t dwindex = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* szinstalledproductcode = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* pdwinstalledcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* szsid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* pcchsid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiEnumProductsExW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(szproductcode, szusersid, dwcontext, dwindex, szinstalledproductcode, pdwinstalledcontext, szsid, pcchsid) : 0;
#else
    (void)szproductcode;
    (void)szusersid;
    (void)dwcontext;
    (void)dwindex;
    (void)szinstalledproductcode;
    (void)pdwinstalledcontext;
    (void)szsid;
    (void)pcchsid;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnumProductsW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t iproductindex = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* lpproductbuf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiEnumProductsW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(iproductindex, lpproductbuf) : 0;
#else
    (void)iproductindex;
    (void)lpproductbuf;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnumRelatedProductsA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpupgradecode = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwreserved = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t iproductindex = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* lpproductbuf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiEnumRelatedProductsA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpupgradecode, dwreserved, iproductindex, lpproductbuf) : 0;
#else
    (void)lpupgradecode;
    (void)dwreserved;
    (void)iproductindex;
    (void)lpproductbuf;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnumRelatedProductsW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpupgradecode = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwreserved = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t iproductindex = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* lpproductbuf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiEnumRelatedProductsW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpupgradecode, dwreserved, iproductindex, lpproductbuf) : 0;
#else
    (void)lpupgradecode;
    (void)dwreserved;
    (void)iproductindex;
    (void)lpproductbuf;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiEvaluateConditionA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t hinstall = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* szcondition = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiEvaluateConditionA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hinstall, szcondition) : -1;
#else
    (void)hinstall;
    (void)szcondition;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiEvaluateConditionW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t hinstall = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* szcondition = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiEvaluateConditionW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hinstall, szcondition) : -1;
#else
    (void)hinstall;
    (void)szcondition;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiExtractPatchXMLDataA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* szpatchpath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwreserved = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* szxmldata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pcchxmldata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiExtractPatchXMLDataA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(szpatchpath, dwreserved, szxmldata, pcchxmldata) : 0;
#else
    (void)szpatchpath;
    (void)dwreserved;
    (void)szxmldata;
    (void)pcchxmldata;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiExtractPatchXMLDataW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* szpatchpath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwreserved = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* szxmldata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pcchxmldata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiExtractPatchXMLDataW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(szpatchpath, dwreserved, szxmldata, pcchxmldata) : 0;
#else
    (void)szpatchpath;
    (void)dwreserved;
    (void)szxmldata;
    (void)pcchxmldata;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiFormatRecordA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t hinstall = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t hrecord = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* szresultbuf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pcchresultbuf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiFormatRecordA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hinstall, hrecord, szresultbuf, pcchresultbuf) : 0;
#else
    (void)hinstall;
    (void)hrecord;
    (void)szresultbuf;
    (void)pcchresultbuf;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiFormatRecordW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t hinstall = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t hrecord = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* szresultbuf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pcchresultbuf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiFormatRecordW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hinstall, hrecord, szresultbuf, pcchresultbuf) : 0;
#else
    (void)hinstall;
    (void)hrecord;
    (void)szresultbuf;
    (void)pcchresultbuf;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetActiveDatabase_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t hinstall = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiGetActiveDatabase")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hinstall) : 0;
#else
    (void)hinstall;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetComponentPathA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* szproduct = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* szcomponent = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* lppathbuf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pcchbuf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiGetComponentPathA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(szproduct, szcomponent, lppathbuf, pcchbuf) : -1;
#else
    (void)szproduct;
    (void)szcomponent;
    (void)lppathbuf;
    (void)pcchbuf;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetComponentPathExA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* szproductcode = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* szcomponentcode = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* szusersid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int32_t dwcontext = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* lpoutpathbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* pcchoutpathbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiGetComponentPathExA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(szproductcode, szcomponentcode, szusersid, dwcontext, lpoutpathbuffer, pcchoutpathbuffer) : -1;
#else
    (void)szproductcode;
    (void)szcomponentcode;
    (void)szusersid;
    (void)dwcontext;
    (void)lpoutpathbuffer;
    (void)pcchoutpathbuffer;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetComponentPathExW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* szproductcode = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* szcomponentcode = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* szusersid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int32_t dwcontext = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* lpoutpathbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* pcchoutpathbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiGetComponentPathExW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(szproductcode, szcomponentcode, szusersid, dwcontext, lpoutpathbuffer, pcchoutpathbuffer) : -1;
#else
    (void)szproductcode;
    (void)szcomponentcode;
    (void)szusersid;
    (void)dwcontext;
    (void)lpoutpathbuffer;
    (void)pcchoutpathbuffer;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetComponentPathW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* szproduct = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* szcomponent = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* lppathbuf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pcchbuf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiGetComponentPathW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(szproduct, szcomponent, lppathbuf, pcchbuf) : -1;
#else
    (void)szproduct;
    (void)szcomponent;
    (void)lppathbuf;
    (void)pcchbuf;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetComponentStateA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t hinstall = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* szcomponent = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* piinstalled = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* piaction = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiGetComponentStateA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hinstall, szcomponent, piinstalled, piaction) : 0;
#else
    (void)hinstall;
    (void)szcomponent;
    (void)piinstalled;
    (void)piaction;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetComponentStateW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t hinstall = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* szcomponent = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* piinstalled = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* piaction = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiGetComponentStateW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hinstall, szcomponent, piinstalled, piaction) : 0;
#else
    (void)hinstall;
    (void)szcomponent;
    (void)piinstalled;
    (void)piaction;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetDatabaseState_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t hdatabase = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiGetDatabaseState")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hdatabase) : -1;
#else
    (void)hdatabase;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetFeatureCostA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t hinstall = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* szfeature = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t icosttree = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t istate = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* picost = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiGetFeatureCostA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hinstall, szfeature, icosttree, istate, picost) : 0;
#else
    (void)hinstall;
    (void)szfeature;
    (void)icosttree;
    (void)istate;
    (void)picost;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetFeatureCostW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t hinstall = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* szfeature = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t icosttree = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t istate = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* picost = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiGetFeatureCostW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hinstall, szfeature, icosttree, istate, picost) : 0;
#else
    (void)hinstall;
    (void)szfeature;
    (void)icosttree;
    (void)istate;
    (void)picost;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetFeatureInfoA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t hproduct = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* szfeature = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* lpattributes = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* lptitlebuf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pcchtitlebuf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* lphelpbuf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* pcchhelpbuf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiGetFeatureInfoA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hproduct, szfeature, lpattributes, lptitlebuf, pcchtitlebuf, lphelpbuf, pcchhelpbuf) : 0;
#else
    (void)hproduct;
    (void)szfeature;
    (void)lpattributes;
    (void)lptitlebuf;
    (void)pcchtitlebuf;
    (void)lphelpbuf;
    (void)pcchhelpbuf;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetFeatureInfoW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t hproduct = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* szfeature = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* lpattributes = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* lptitlebuf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pcchtitlebuf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* lphelpbuf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* pcchhelpbuf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiGetFeatureInfoW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hproduct, szfeature, lpattributes, lptitlebuf, pcchtitlebuf, lphelpbuf, pcchhelpbuf) : 0;
#else
    (void)hproduct;
    (void)szfeature;
    (void)lpattributes;
    (void)lptitlebuf;
    (void)pcchtitlebuf;
    (void)lphelpbuf;
    (void)pcchhelpbuf;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetFeatureStateA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t hinstall = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* szfeature = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* piinstalled = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* piaction = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiGetFeatureStateA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hinstall, szfeature, piinstalled, piaction) : 0;
#else
    (void)hinstall;
    (void)szfeature;
    (void)piinstalled;
    (void)piaction;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetFeatureStateW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t hinstall = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* szfeature = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* piinstalled = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* piaction = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiGetFeatureStateW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hinstall, szfeature, piinstalled, piaction) : 0;
#else
    (void)hinstall;
    (void)szfeature;
    (void)piinstalled;
    (void)piaction;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetFeatureUsageA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* szproduct = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* szfeature = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pdwusecount = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pwdateused = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiGetFeatureUsageA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(szproduct, szfeature, pdwusecount, pwdateused) : 0;
#else
    (void)szproduct;
    (void)szfeature;
    (void)pdwusecount;
    (void)pwdateused;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetFeatureUsageW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* szproduct = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* szfeature = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pdwusecount = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pwdateused = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiGetFeatureUsageW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(szproduct, szfeature, pdwusecount, pwdateused) : 0;
#else
    (void)szproduct;
    (void)szfeature;
    (void)pdwusecount;
    (void)pwdateused;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetFeatureValidStatesA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t hinstall = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* szfeature = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* lpinstallstates = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiGetFeatureValidStatesA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hinstall, szfeature, lpinstallstates) : 0;
#else
    (void)hinstall;
    (void)szfeature;
    (void)lpinstallstates;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetFeatureValidStatesW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t hinstall = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* szfeature = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* lpinstallstates = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiGetFeatureValidStatesW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hinstall, szfeature, lpinstallstates) : 0;
#else
    (void)hinstall;
    (void)szfeature;
    (void)lpinstallstates;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetFileHashA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* szfilepath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwoptions = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* phash = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiGetFileHashA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(szfilepath, dwoptions, phash) : 0;
#else
    (void)szfilepath;
    (void)dwoptions;
    (void)phash;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetFileHashW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* szfilepath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwoptions = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* phash = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiGetFileHashW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(szfilepath, dwoptions, phash) : 0;
#else
    (void)szfilepath;
    (void)dwoptions;
    (void)phash;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetFileSignatureInformationA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* szsignedobjectpath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* ppccertcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pbhashdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pcbhashdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiGetFileSignatureInformationA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(szsignedobjectpath, dwflags, ppccertcontext, pbhashdata, pcbhashdata) : -1;
#else
    (void)szsignedobjectpath;
    (void)dwflags;
    (void)ppccertcontext;
    (void)pbhashdata;
    (void)pcbhashdata;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetFileSignatureInformationW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* szsignedobjectpath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* ppccertcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pbhashdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pcbhashdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiGetFileSignatureInformationW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(szsignedobjectpath, dwflags, ppccertcontext, pbhashdata, pcbhashdata) : -1;
#else
    (void)szsignedobjectpath;
    (void)dwflags;
    (void)ppccertcontext;
    (void)pbhashdata;
    (void)pcbhashdata;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetFileVersionA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* szfilepath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpversionbuf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pcchversionbuf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* lplangbuf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pcchlangbuf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiGetFileVersionA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(szfilepath, lpversionbuf, pcchversionbuf, lplangbuf, pcchlangbuf) : 0;
#else
    (void)szfilepath;
    (void)lpversionbuf;
    (void)pcchversionbuf;
    (void)lplangbuf;
    (void)pcchlangbuf;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetFileVersionW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* szfilepath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpversionbuf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pcchversionbuf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* lplangbuf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pcchlangbuf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiGetFileVersionW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(szfilepath, lpversionbuf, pcchversionbuf, lplangbuf, pcchlangbuf) : 0;
#else
    (void)szfilepath;
    (void)lpversionbuf;
    (void)pcchversionbuf;
    (void)lplangbuf;
    (void)pcchlangbuf;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetLanguage_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t hinstall = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint16_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiGetLanguage")));
    }
    uint16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hinstall) : 0;
#else
    (void)hinstall;
    uint16_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetLastErrorRecord_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiGetLastErrorRecord")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr() : 0;
#else
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetMode_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t hinstall = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    int32_t erunmode = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiGetMode")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hinstall, erunmode) : -1;
#else
    (void)hinstall;
    (void)erunmode;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetPatchFileListA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* szproductcode = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* szpatchpackages = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pcfiles = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pphfilerecords = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiGetPatchFileListA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(szproductcode, szpatchpackages, pcfiles, pphfilerecords) : 0;
#else
    (void)szproductcode;
    (void)szpatchpackages;
    (void)pcfiles;
    (void)pphfilerecords;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetPatchFileListW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* szproductcode = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* szpatchpackages = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pcfiles = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pphfilerecords = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiGetPatchFileListW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(szproductcode, szpatchpackages, pcfiles, pphfilerecords) : 0;
#else
    (void)szproductcode;
    (void)szpatchpackages;
    (void)pcfiles;
    (void)pphfilerecords;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetPatchInfoA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* szpatch = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* szattribute = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* lpvaluebuf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pcchvaluebuf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiGetPatchInfoA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(szpatch, szattribute, lpvaluebuf, pcchvaluebuf) : 0;
#else
    (void)szpatch;
    (void)szattribute;
    (void)lpvaluebuf;
    (void)pcchvaluebuf;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetPatchInfoExA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* szpatchcode = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* szproductcode = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* szusersid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int32_t dwcontext = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* szproperty = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* lpvalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* pcchvalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiGetPatchInfoExA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(szpatchcode, szproductcode, szusersid, dwcontext, szproperty, lpvalue, pcchvalue) : 0;
#else
    (void)szpatchcode;
    (void)szproductcode;
    (void)szusersid;
    (void)dwcontext;
    (void)szproperty;
    (void)lpvalue;
    (void)pcchvalue;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetPatchInfoExW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* szpatchcode = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* szproductcode = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* szusersid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int32_t dwcontext = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* szproperty = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* lpvalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* pcchvalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiGetPatchInfoExW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(szpatchcode, szproductcode, szusersid, dwcontext, szproperty, lpvalue, pcchvalue) : 0;
#else
    (void)szpatchcode;
    (void)szproductcode;
    (void)szusersid;
    (void)dwcontext;
    (void)szproperty;
    (void)lpvalue;
    (void)pcchvalue;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetPatchInfoW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* szpatch = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* szattribute = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* lpvaluebuf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pcchvaluebuf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiGetPatchInfoW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(szpatch, szattribute, lpvaluebuf, pcchvaluebuf) : 0;
#else
    (void)szpatch;
    (void)szattribute;
    (void)lpvaluebuf;
    (void)pcchvaluebuf;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetProductCodeA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* szcomponent = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpbuf39 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiGetProductCodeA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(szcomponent, lpbuf39) : 0;
#else
    (void)szcomponent;
    (void)lpbuf39;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetProductCodeW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* szcomponent = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpbuf39 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiGetProductCodeW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(szcomponent, lpbuf39) : 0;
#else
    (void)szcomponent;
    (void)lpbuf39;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetProductInfoA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* szproduct = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* szattribute = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* lpvaluebuf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pcchvaluebuf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiGetProductInfoA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(szproduct, szattribute, lpvaluebuf, pcchvaluebuf) : 0;
#else
    (void)szproduct;
    (void)szattribute;
    (void)lpvaluebuf;
    (void)pcchvaluebuf;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetProductInfoExA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* szproductcode = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* szusersid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t dwcontext = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* szproperty = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* szvalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* pcchvalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiGetProductInfoExA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(szproductcode, szusersid, dwcontext, szproperty, szvalue, pcchvalue) : 0;
#else
    (void)szproductcode;
    (void)szusersid;
    (void)dwcontext;
    (void)szproperty;
    (void)szvalue;
    (void)pcchvalue;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetProductInfoExW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* szproductcode = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* szusersid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t dwcontext = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* szproperty = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* szvalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* pcchvalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiGetProductInfoExW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(szproductcode, szusersid, dwcontext, szproperty, szvalue, pcchvalue) : 0;
#else
    (void)szproductcode;
    (void)szusersid;
    (void)dwcontext;
    (void)szproperty;
    (void)szvalue;
    (void)pcchvalue;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetProductInfoFromScriptA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* szscriptfile = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpproductbuf39 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* plgidlanguage = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pdwversion = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* lpnamebuf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* pcchnamebuf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* lppackagebuf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* pcchpackagebuf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiGetProductInfoFromScriptA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(szscriptfile, lpproductbuf39, plgidlanguage, pdwversion, lpnamebuf, pcchnamebuf, lppackagebuf, pcchpackagebuf) : 0;
#else
    (void)szscriptfile;
    (void)lpproductbuf39;
    (void)plgidlanguage;
    (void)pdwversion;
    (void)lpnamebuf;
    (void)pcchnamebuf;
    (void)lppackagebuf;
    (void)pcchpackagebuf;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetProductInfoFromScriptW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* szscriptfile = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpproductbuf39 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* plgidlanguage = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pdwversion = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* lpnamebuf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* pcchnamebuf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* lppackagebuf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* pcchpackagebuf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiGetProductInfoFromScriptW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(szscriptfile, lpproductbuf39, plgidlanguage, pdwversion, lpnamebuf, pcchnamebuf, lppackagebuf, pcchpackagebuf) : 0;
#else
    (void)szscriptfile;
    (void)lpproductbuf39;
    (void)plgidlanguage;
    (void)pdwversion;
    (void)lpnamebuf;
    (void)pcchnamebuf;
    (void)lppackagebuf;
    (void)pcchpackagebuf;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetProductInfoW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* szproduct = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* szattribute = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* lpvaluebuf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pcchvaluebuf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiGetProductInfoW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(szproduct, szattribute, lpvaluebuf, pcchvaluebuf) : 0;
#else
    (void)szproduct;
    (void)szattribute;
    (void)lpvaluebuf;
    (void)pcchvaluebuf;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetProductPropertyA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t hproduct = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* szproperty = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* lpvaluebuf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pcchvaluebuf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiGetProductPropertyA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hproduct, szproperty, lpvaluebuf, pcchvaluebuf) : 0;
#else
    (void)hproduct;
    (void)szproperty;
    (void)lpvaluebuf;
    (void)pcchvaluebuf;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetProductPropertyW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t hproduct = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* szproperty = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* lpvaluebuf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pcchvaluebuf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiGetProductPropertyW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hproduct, szproperty, lpvaluebuf, pcchvaluebuf) : 0;
#else
    (void)hproduct;
    (void)szproperty;
    (void)lpvaluebuf;
    (void)pcchvaluebuf;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetPropertyA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t hinstall = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* szname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* szvaluebuf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pcchvaluebuf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiGetPropertyA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hinstall, szname, szvaluebuf, pcchvaluebuf) : 0;
#else
    (void)hinstall;
    (void)szname;
    (void)szvaluebuf;
    (void)pcchvaluebuf;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetPropertyW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t hinstall = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* szname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* szvaluebuf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pcchvaluebuf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiGetPropertyW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hinstall, szname, szvaluebuf, pcchvaluebuf) : 0;
#else
    (void)hinstall;
    (void)szname;
    (void)szvaluebuf;
    (void)pcchvaluebuf;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetShortcutTargetA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* szshortcutpath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* szproductcode = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* szfeatureid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* szcomponentcode = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiGetShortcutTargetA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(szshortcutpath, szproductcode, szfeatureid, szcomponentcode) : 0;
#else
    (void)szshortcutpath;
    (void)szproductcode;
    (void)szfeatureid;
    (void)szcomponentcode;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetShortcutTargetW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* szshortcutpath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* szproductcode = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* szfeatureid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* szcomponentcode = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiGetShortcutTargetW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(szshortcutpath, szproductcode, szfeatureid, szcomponentcode) : 0;
#else
    (void)szshortcutpath;
    (void)szproductcode;
    (void)szfeatureid;
    (void)szcomponentcode;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetSourcePathA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t hinstall = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* szfolder = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* szpathbuf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pcchpathbuf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiGetSourcePathA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hinstall, szfolder, szpathbuf, pcchpathbuf) : 0;
#else
    (void)hinstall;
    (void)szfolder;
    (void)szpathbuf;
    (void)pcchpathbuf;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetSourcePathW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t hinstall = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* szfolder = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* szpathbuf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pcchpathbuf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiGetSourcePathW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hinstall, szfolder, szpathbuf, pcchpathbuf) : 0;
#else
    (void)hinstall;
    (void)szfolder;
    (void)szpathbuf;
    (void)pcchpathbuf;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetSummaryInformationA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t hdatabase = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* szdatabasepath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t uiupdatecount = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* phsummaryinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiGetSummaryInformationA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hdatabase, szdatabasepath, uiupdatecount, phsummaryinfo) : 0;
#else
    (void)hdatabase;
    (void)szdatabasepath;
    (void)uiupdatecount;
    (void)phsummaryinfo;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetSummaryInformationW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t hdatabase = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* szdatabasepath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t uiupdatecount = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* phsummaryinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiGetSummaryInformationW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hdatabase, szdatabasepath, uiupdatecount, phsummaryinfo) : 0;
#else
    (void)hdatabase;
    (void)szdatabasepath;
    (void)uiupdatecount;
    (void)phsummaryinfo;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetTargetPathA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t hinstall = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* szfolder = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* szpathbuf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pcchpathbuf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiGetTargetPathA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hinstall, szfolder, szpathbuf, pcchpathbuf) : 0;
#else
    (void)hinstall;
    (void)szfolder;
    (void)szpathbuf;
    (void)pcchpathbuf;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetTargetPathW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t hinstall = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* szfolder = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* szpathbuf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pcchpathbuf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiGetTargetPathW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hinstall, szfolder, szpathbuf, pcchpathbuf) : 0;
#else
    (void)hinstall;
    (void)szfolder;
    (void)szpathbuf;
    (void)pcchpathbuf;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetUserInfoA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* szproduct = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpusernamebuf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pcchusernamebuf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* lporgnamebuf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pcchorgnamebuf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* lpserialbuf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* pcchserialbuf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiGetUserInfoA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(szproduct, lpusernamebuf, pcchusernamebuf, lporgnamebuf, pcchorgnamebuf, lpserialbuf, pcchserialbuf) : -1;
#else
    (void)szproduct;
    (void)lpusernamebuf;
    (void)pcchusernamebuf;
    (void)lporgnamebuf;
    (void)pcchorgnamebuf;
    (void)lpserialbuf;
    (void)pcchserialbuf;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetUserInfoW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* szproduct = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpusernamebuf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pcchusernamebuf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* lporgnamebuf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pcchorgnamebuf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* lpserialbuf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* pcchserialbuf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiGetUserInfoW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(szproduct, lpusernamebuf, pcchusernamebuf, lporgnamebuf, pcchorgnamebuf, lpserialbuf, pcchserialbuf) : -1;
#else
    (void)szproduct;
    (void)lpusernamebuf;
    (void)pcchusernamebuf;
    (void)lporgnamebuf;
    (void)pcchorgnamebuf;
    (void)lpserialbuf;
    (void)pcchserialbuf;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiInstallMissingComponentA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* szproduct = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* szcomponent = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t einstallstate = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiInstallMissingComponentA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(szproduct, szcomponent, einstallstate) : 0;
#else
    (void)szproduct;
    (void)szcomponent;
    (void)einstallstate;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiInstallMissingComponentW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* szproduct = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* szcomponent = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t einstallstate = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiInstallMissingComponentW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(szproduct, szcomponent, einstallstate) : 0;
#else
    (void)szproduct;
    (void)szcomponent;
    (void)einstallstate;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiInstallMissingFileA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* szproduct = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* szfile = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiInstallMissingFileA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(szproduct, szfile) : 0;
#else
    (void)szproduct;
    (void)szfile;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiInstallMissingFileW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* szproduct = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* szfile = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiInstallMissingFileW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(szproduct, szfile) : 0;
#else
    (void)szproduct;
    (void)szfile;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiInstallProductA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* szpackagepath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* szcommandline = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiInstallProductA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(szpackagepath, szcommandline) : 0;
#else
    (void)szpackagepath;
    (void)szcommandline;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiInstallProductW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* szpackagepath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* szcommandline = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiInstallProductW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(szpackagepath, szcommandline) : 0;
#else
    (void)szpackagepath;
    (void)szcommandline;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiIsProductElevatedA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* szproduct = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pfelevated = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiIsProductElevatedA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(szproduct, pfelevated) : 0;
#else
    (void)szproduct;
    (void)pfelevated;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiIsProductElevatedW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* szproduct = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pfelevated = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiIsProductElevatedW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(szproduct, pfelevated) : 0;
#else
    (void)szproduct;
    (void)pfelevated;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiJoinTransaction_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t htransactionhandle = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t dwtransactionattributes = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* phchangeofownerevent = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiJoinTransaction")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(htransactionhandle, dwtransactionattributes, phchangeofownerevent) : 0;
#else
    (void)htransactionhandle;
    (void)dwtransactionattributes;
    (void)phchangeofownerevent;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiLocateComponentA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* szcomponent = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lppathbuf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pcchbuf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiLocateComponentA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(szcomponent, lppathbuf, pcchbuf) : -1;
#else
    (void)szcomponent;
    (void)lppathbuf;
    (void)pcchbuf;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiLocateComponentW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* szcomponent = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lppathbuf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pcchbuf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiLocateComponentW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(szcomponent, lppathbuf, pcchbuf) : -1;
#else
    (void)szcomponent;
    (void)lppathbuf;
    (void)pcchbuf;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiNotifySidChangeA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* poldsid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pnewsid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiNotifySidChangeA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(poldsid, pnewsid) : 0;
#else
    (void)poldsid;
    (void)pnewsid;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiNotifySidChangeW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* poldsid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pnewsid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiNotifySidChangeW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(poldsid, pnewsid) : 0;
#else
    (void)poldsid;
    (void)pnewsid;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiOpenDatabaseA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* szdatabasepath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* szpersist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* phdatabase = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiOpenDatabaseA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(szdatabasepath, szpersist, phdatabase) : 0;
#else
    (void)szdatabasepath;
    (void)szpersist;
    (void)phdatabase;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiOpenDatabaseW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* szdatabasepath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* szpersist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* phdatabase = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiOpenDatabaseW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(szdatabasepath, szpersist, phdatabase) : 0;
#else
    (void)szdatabasepath;
    (void)szpersist;
    (void)phdatabase;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiOpenPackageA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* szpackagepath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* hproduct = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiOpenPackageA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(szpackagepath, hproduct) : 0;
#else
    (void)szpackagepath;
    (void)hproduct;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiOpenPackageExA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* szpackagepath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwoptions = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* hproduct = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiOpenPackageExA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(szpackagepath, dwoptions, hproduct) : 0;
#else
    (void)szpackagepath;
    (void)dwoptions;
    (void)hproduct;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiOpenPackageExW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* szpackagepath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwoptions = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* hproduct = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiOpenPackageExW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(szpackagepath, dwoptions, hproduct) : 0;
#else
    (void)szpackagepath;
    (void)dwoptions;
    (void)hproduct;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiOpenPackageW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* szpackagepath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* hproduct = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiOpenPackageW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(szpackagepath, hproduct) : 0;
#else
    (void)szpackagepath;
    (void)hproduct;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiOpenProductA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* szproduct = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* hproduct = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiOpenProductA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(szproduct, hproduct) : 0;
#else
    (void)szproduct;
    (void)hproduct;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiOpenProductW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* szproduct = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* hproduct = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiOpenProductW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(szproduct, hproduct) : 0;
#else
    (void)szproduct;
    (void)hproduct;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiPreviewBillboardA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t hpreview = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* szcontrolname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* szbillboard = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiPreviewBillboardA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hpreview, szcontrolname, szbillboard) : 0;
#else
    (void)hpreview;
    (void)szcontrolname;
    (void)szbillboard;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiPreviewBillboardW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t hpreview = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* szcontrolname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* szbillboard = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiPreviewBillboardW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hpreview, szcontrolname, szbillboard) : 0;
#else
    (void)hpreview;
    (void)szcontrolname;
    (void)szbillboard;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiPreviewDialogA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t hpreview = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* szdialogname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiPreviewDialogA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hpreview, szdialogname) : 0;
#else
    (void)hpreview;
    (void)szdialogname;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiPreviewDialogW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t hpreview = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* szdialogname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiPreviewDialogW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hpreview, szdialogname) : 0;
#else
    (void)hpreview;
    (void)szdialogname;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiProcessAdvertiseScriptA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* szscriptfile = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* sziconfolder = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* hregdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int32_t fshortcuts = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    int32_t fremoveitems = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiProcessAdvertiseScriptA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(szscriptfile, sziconfolder, hregdata, fshortcuts, fremoveitems) : 0;
#else
    (void)szscriptfile;
    (void)sziconfolder;
    (void)hregdata;
    (void)fshortcuts;
    (void)fremoveitems;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiProcessAdvertiseScriptW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* szscriptfile = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* sziconfolder = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* hregdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int32_t fshortcuts = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    int32_t fremoveitems = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiProcessAdvertiseScriptW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(szscriptfile, sziconfolder, hregdata, fshortcuts, fremoveitems) : 0;
#else
    (void)szscriptfile;
    (void)sziconfolder;
    (void)hregdata;
    (void)fshortcuts;
    (void)fremoveitems;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiProcessMessage_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t hinstall = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    int32_t emessagetype = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t hrecord = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiProcessMessage")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hinstall, emessagetype, hrecord) : -1;
#else
    (void)hinstall;
    (void)emessagetype;
    (void)hrecord;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiProvideAssemblyA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* szassemblyname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* szappcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwinstallmode = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t dwassemblyinfo = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* lppathbuf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* pcchpathbuf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiProvideAssemblyA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(szassemblyname, szappcontext, dwinstallmode, dwassemblyinfo, lppathbuf, pcchpathbuf) : 0;
#else
    (void)szassemblyname;
    (void)szappcontext;
    (void)dwinstallmode;
    (void)dwassemblyinfo;
    (void)lppathbuf;
    (void)pcchpathbuf;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiProvideAssemblyW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* szassemblyname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* szappcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwinstallmode = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t dwassemblyinfo = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* lppathbuf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* pcchpathbuf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiProvideAssemblyW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(szassemblyname, szappcontext, dwinstallmode, dwassemblyinfo, lppathbuf, pcchpathbuf) : 0;
#else
    (void)szassemblyname;
    (void)szappcontext;
    (void)dwinstallmode;
    (void)dwassemblyinfo;
    (void)lppathbuf;
    (void)pcchpathbuf;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiProvideComponentA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* szproduct = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* szfeature = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* szcomponent = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t dwinstallmode = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* lppathbuf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* pcchpathbuf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiProvideComponentA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(szproduct, szfeature, szcomponent, dwinstallmode, lppathbuf, pcchpathbuf) : 0;
#else
    (void)szproduct;
    (void)szfeature;
    (void)szcomponent;
    (void)dwinstallmode;
    (void)lppathbuf;
    (void)pcchpathbuf;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiProvideComponentW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* szproduct = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* szfeature = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* szcomponent = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t dwinstallmode = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* lppathbuf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* pcchpathbuf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiProvideComponentW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(szproduct, szfeature, szcomponent, dwinstallmode, lppathbuf, pcchpathbuf) : 0;
#else
    (void)szproduct;
    (void)szfeature;
    (void)szcomponent;
    (void)dwinstallmode;
    (void)lppathbuf;
    (void)pcchpathbuf;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiProvideQualifiedComponentA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* szcategory = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* szqualifier = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwinstallmode = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* lppathbuf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pcchpathbuf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiProvideQualifiedComponentA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(szcategory, szqualifier, dwinstallmode, lppathbuf, pcchpathbuf) : 0;
#else
    (void)szcategory;
    (void)szqualifier;
    (void)dwinstallmode;
    (void)lppathbuf;
    (void)pcchpathbuf;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiProvideQualifiedComponentExA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* szcategory = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* szqualifier = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwinstallmode = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* szproduct = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t dwunused1 = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    uint32_t dwunused2 = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* lppathbuf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* pcchpathbuf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiProvideQualifiedComponentExA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(szcategory, szqualifier, dwinstallmode, szproduct, dwunused1, dwunused2, lppathbuf, pcchpathbuf) : 0;
#else
    (void)szcategory;
    (void)szqualifier;
    (void)dwinstallmode;
    (void)szproduct;
    (void)dwunused1;
    (void)dwunused2;
    (void)lppathbuf;
    (void)pcchpathbuf;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiProvideQualifiedComponentExW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* szcategory = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* szqualifier = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwinstallmode = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* szproduct = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t dwunused1 = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    uint32_t dwunused2 = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* lppathbuf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* pcchpathbuf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiProvideQualifiedComponentExW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(szcategory, szqualifier, dwinstallmode, szproduct, dwunused1, dwunused2, lppathbuf, pcchpathbuf) : 0;
#else
    (void)szcategory;
    (void)szqualifier;
    (void)dwinstallmode;
    (void)szproduct;
    (void)dwunused1;
    (void)dwunused2;
    (void)lppathbuf;
    (void)pcchpathbuf;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiProvideQualifiedComponentW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* szcategory = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* szqualifier = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwinstallmode = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* lppathbuf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pcchpathbuf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiProvideQualifiedComponentW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(szcategory, szqualifier, dwinstallmode, lppathbuf, pcchpathbuf) : 0;
#else
    (void)szcategory;
    (void)szqualifier;
    (void)dwinstallmode;
    (void)lppathbuf;
    (void)pcchpathbuf;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiQueryComponentStateA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* szproductcode = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* szusersid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t dwcontext = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* szcomponentcode = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pdwstate = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiQueryComponentStateA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(szproductcode, szusersid, dwcontext, szcomponentcode, pdwstate) : 0;
#else
    (void)szproductcode;
    (void)szusersid;
    (void)dwcontext;
    (void)szcomponentcode;
    (void)pdwstate;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiQueryComponentStateW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* szproductcode = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* szusersid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t dwcontext = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* szcomponentcode = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pdwstate = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiQueryComponentStateW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(szproductcode, szusersid, dwcontext, szcomponentcode, pdwstate) : 0;
#else
    (void)szproductcode;
    (void)szusersid;
    (void)dwcontext;
    (void)szcomponentcode;
    (void)pdwstate;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiQueryFeatureStateA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* szproduct = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* szfeature = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiQueryFeatureStateA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(szproduct, szfeature) : -1;
#else
    (void)szproduct;
    (void)szfeature;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiQueryFeatureStateExA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* szproductcode = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* szusersid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t dwcontext = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* szfeature = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pdwstate = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiQueryFeatureStateExA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(szproductcode, szusersid, dwcontext, szfeature, pdwstate) : 0;
#else
    (void)szproductcode;
    (void)szusersid;
    (void)dwcontext;
    (void)szfeature;
    (void)pdwstate;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiQueryFeatureStateExW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* szproductcode = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* szusersid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t dwcontext = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* szfeature = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pdwstate = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiQueryFeatureStateExW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(szproductcode, szusersid, dwcontext, szfeature, pdwstate) : 0;
#else
    (void)szproductcode;
    (void)szusersid;
    (void)dwcontext;
    (void)szfeature;
    (void)pdwstate;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiQueryFeatureStateW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* szproduct = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* szfeature = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiQueryFeatureStateW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(szproduct, szfeature) : -1;
#else
    (void)szproduct;
    (void)szfeature;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiQueryProductStateA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* szproduct = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiQueryProductStateA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(szproduct) : -1;
#else
    (void)szproduct;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiQueryProductStateW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* szproduct = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiQueryProductStateW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(szproduct) : -1;
#else
    (void)szproduct;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiRecordClearData_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t hrecord = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiRecordClearData")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hrecord) : 0;
#else
    (void)hrecord;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiRecordDataSize_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t hrecord = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t ifield = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiRecordDataSize")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hrecord, ifield) : 0;
#else
    (void)hrecord;
    (void)ifield;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiRecordGetFieldCount_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t hrecord = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiRecordGetFieldCount")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hrecord) : 0;
#else
    (void)hrecord;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiRecordGetInteger_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t hrecord = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t ifield = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiRecordGetInteger")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hrecord, ifield) : -1;
#else
    (void)hrecord;
    (void)ifield;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiRecordGetStringA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t hrecord = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t ifield = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* szvaluebuf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pcchvaluebuf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiRecordGetStringA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hrecord, ifield, szvaluebuf, pcchvaluebuf) : 0;
#else
    (void)hrecord;
    (void)ifield;
    (void)szvaluebuf;
    (void)pcchvaluebuf;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiRecordGetStringW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t hrecord = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t ifield = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* szvaluebuf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pcchvaluebuf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiRecordGetStringW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hrecord, ifield, szvaluebuf, pcchvaluebuf) : 0;
#else
    (void)hrecord;
    (void)ifield;
    (void)szvaluebuf;
    (void)pcchvaluebuf;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiRecordIsNull_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t hrecord = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t ifield = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiRecordIsNull")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hrecord, ifield) : -1;
#else
    (void)hrecord;
    (void)ifield;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiRecordReadStream_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t hrecord = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t ifield = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* szdatabuf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pcbdatabuf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiRecordReadStream")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hrecord, ifield, szdatabuf, pcbdatabuf) : 0;
#else
    (void)hrecord;
    (void)ifield;
    (void)szdatabuf;
    (void)pcbdatabuf;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiRecordSetInteger_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t hrecord = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t ifield = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t ivalue = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiRecordSetInteger")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hrecord, ifield, ivalue) : 0;
#else
    (void)hrecord;
    (void)ifield;
    (void)ivalue;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiRecordSetStreamA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t hrecord = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t ifield = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* szfilepath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiRecordSetStreamA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hrecord, ifield, szfilepath) : 0;
#else
    (void)hrecord;
    (void)ifield;
    (void)szfilepath;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiRecordSetStreamW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t hrecord = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t ifield = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* szfilepath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiRecordSetStreamW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hrecord, ifield, szfilepath) : 0;
#else
    (void)hrecord;
    (void)ifield;
    (void)szfilepath;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiRecordSetStringA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t hrecord = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t ifield = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* szvalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiRecordSetStringA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hrecord, ifield, szvalue) : 0;
#else
    (void)hrecord;
    (void)ifield;
    (void)szvalue;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiRecordSetStringW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t hrecord = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t ifield = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* szvalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiRecordSetStringW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hrecord, ifield, szvalue) : 0;
#else
    (void)hrecord;
    (void)ifield;
    (void)szvalue;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiReinstallFeatureA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* szproduct = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* szfeature = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwreinstallmode = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiReinstallFeatureA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(szproduct, szfeature, dwreinstallmode) : 0;
#else
    (void)szproduct;
    (void)szfeature;
    (void)dwreinstallmode;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiReinstallFeatureW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* szproduct = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* szfeature = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwreinstallmode = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiReinstallFeatureW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(szproduct, szfeature, dwreinstallmode) : 0;
#else
    (void)szproduct;
    (void)szfeature;
    (void)dwreinstallmode;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiReinstallProductA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* szproduct = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t szreinstallmode = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiReinstallProductA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(szproduct, szreinstallmode) : 0;
#else
    (void)szproduct;
    (void)szreinstallmode;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiReinstallProductW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* szproduct = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t szreinstallmode = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiReinstallProductW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(szproduct, szreinstallmode) : 0;
#else
    (void)szproduct;
    (void)szreinstallmode;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiRemovePatchesA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* szpatchlist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* szproductcode = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t euninstalltype = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* szpropertylist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiRemovePatchesA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(szpatchlist, szproductcode, euninstalltype, szpropertylist) : 0;
#else
    (void)szpatchlist;
    (void)szproductcode;
    (void)euninstalltype;
    (void)szpropertylist;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiRemovePatchesW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* szpatchlist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* szproductcode = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t euninstalltype = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* szpropertylist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiRemovePatchesW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(szpatchlist, szproductcode, euninstalltype, szpropertylist) : 0;
#else
    (void)szpatchlist;
    (void)szproductcode;
    (void)euninstalltype;
    (void)szpropertylist;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiSequenceA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t hinstall = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* sztable = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t isequencemode = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiSequenceA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hinstall, sztable, isequencemode) : 0;
#else
    (void)hinstall;
    (void)sztable;
    (void)isequencemode;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiSequenceW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t hinstall = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* sztable = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t isequencemode = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiSequenceW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hinstall, sztable, isequencemode) : 0;
#else
    (void)hinstall;
    (void)sztable;
    (void)isequencemode;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiSetComponentStateA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t hinstall = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* szcomponent = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t istate = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiSetComponentStateA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hinstall, szcomponent, istate) : 0;
#else
    (void)hinstall;
    (void)szcomponent;
    (void)istate;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiSetComponentStateW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t hinstall = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* szcomponent = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t istate = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiSetComponentStateW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hinstall, szcomponent, istate) : 0;
#else
    (void)hinstall;
    (void)szcomponent;
    (void)istate;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiSetExternalUIA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* puihandler = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwmessagefilter = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pvcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiSetExternalUIA")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(puihandler, dwmessagefilter, pvcontext) : NULL;
#else
    (void)puihandler;
    (void)dwmessagefilter;
    (void)pvcontext;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiSetExternalUIRecord_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* puihandler = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwmessagefilter = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pvcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* ppuiprevhandler = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiSetExternalUIRecord")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(puihandler, dwmessagefilter, pvcontext, ppuiprevhandler) : 0;
#else
    (void)puihandler;
    (void)dwmessagefilter;
    (void)pvcontext;
    (void)ppuiprevhandler;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiSetExternalUIW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* puihandler = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwmessagefilter = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pvcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiSetExternalUIW")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(puihandler, dwmessagefilter, pvcontext) : NULL;
#else
    (void)puihandler;
    (void)dwmessagefilter;
    (void)pvcontext;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiSetFeatureAttributesA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t hinstall = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* szfeature = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwattributes = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiSetFeatureAttributesA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hinstall, szfeature, dwattributes) : 0;
#else
    (void)hinstall;
    (void)szfeature;
    (void)dwattributes;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiSetFeatureAttributesW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t hinstall = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* szfeature = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwattributes = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiSetFeatureAttributesW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hinstall, szfeature, dwattributes) : 0;
#else
    (void)hinstall;
    (void)szfeature;
    (void)dwattributes;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiSetFeatureStateA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t hinstall = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* szfeature = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t istate = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiSetFeatureStateA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hinstall, szfeature, istate) : 0;
#else
    (void)hinstall;
    (void)szfeature;
    (void)istate;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiSetFeatureStateW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t hinstall = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* szfeature = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t istate = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiSetFeatureStateW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hinstall, szfeature, istate) : 0;
#else
    (void)hinstall;
    (void)szfeature;
    (void)istate;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiSetInstallLevel_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t hinstall = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    int32_t iinstalllevel = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiSetInstallLevel")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hinstall, iinstalllevel) : 0;
#else
    (void)hinstall;
    (void)iinstalllevel;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiSetInternalUI_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t dwuilevel = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* phwnd = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiSetInternalUI")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwuilevel, phwnd) : -1;
#else
    (void)dwuilevel;
    (void)phwnd;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiSetMode_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t hinstall = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    int32_t erunmode = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t fstate = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiSetMode")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hinstall, erunmode, fstate) : 0;
#else
    (void)hinstall;
    (void)erunmode;
    (void)fstate;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiSetPropertyA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t hinstall = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* szname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* szvalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiSetPropertyA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hinstall, szname, szvalue) : 0;
#else
    (void)hinstall;
    (void)szname;
    (void)szvalue;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiSetPropertyW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t hinstall = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* szname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* szvalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiSetPropertyW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hinstall, szname, szvalue) : 0;
#else
    (void)hinstall;
    (void)szname;
    (void)szvalue;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiSetTargetPathA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t hinstall = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* szfolder = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* szfolderpath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiSetTargetPathA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hinstall, szfolder, szfolderpath) : 0;
#else
    (void)hinstall;
    (void)szfolder;
    (void)szfolderpath;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiSetTargetPathW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t hinstall = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* szfolder = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* szfolderpath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiSetTargetPathW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hinstall, szfolder, szfolderpath) : 0;
#else
    (void)hinstall;
    (void)szfolder;
    (void)szfolderpath;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListAddMediaDiskA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* szproductcodeorpatchcode = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* szusersid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t dwcontext = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t dwoptions = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t dwdiskid = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* szvolumelabel = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* szdiskprompt = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiSourceListAddMediaDiskA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(szproductcodeorpatchcode, szusersid, dwcontext, dwoptions, dwdiskid, szvolumelabel, szdiskprompt) : 0;
#else
    (void)szproductcodeorpatchcode;
    (void)szusersid;
    (void)dwcontext;
    (void)dwoptions;
    (void)dwdiskid;
    (void)szvolumelabel;
    (void)szdiskprompt;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListAddMediaDiskW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* szproductcodeorpatchcode = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* szusersid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t dwcontext = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t dwoptions = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t dwdiskid = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* szvolumelabel = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* szdiskprompt = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiSourceListAddMediaDiskW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(szproductcodeorpatchcode, szusersid, dwcontext, dwoptions, dwdiskid, szvolumelabel, szdiskprompt) : 0;
#else
    (void)szproductcodeorpatchcode;
    (void)szusersid;
    (void)dwcontext;
    (void)dwoptions;
    (void)dwdiskid;
    (void)szvolumelabel;
    (void)szdiskprompt;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListAddSourceA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* szproduct = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* szusername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwreserved = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* szsource = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiSourceListAddSourceA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(szproduct, szusername, dwreserved, szsource) : 0;
#else
    (void)szproduct;
    (void)szusername;
    (void)dwreserved;
    (void)szsource;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListAddSourceExA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* szproductcodeorpatchcode = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* szusersid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t dwcontext = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t dwoptions = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* szsource = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t dwindex = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiSourceListAddSourceExA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(szproductcodeorpatchcode, szusersid, dwcontext, dwoptions, szsource, dwindex) : 0;
#else
    (void)szproductcodeorpatchcode;
    (void)szusersid;
    (void)dwcontext;
    (void)dwoptions;
    (void)szsource;
    (void)dwindex;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListAddSourceExW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* szproductcodeorpatchcode = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* szusersid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t dwcontext = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t dwoptions = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* szsource = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t dwindex = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiSourceListAddSourceExW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(szproductcodeorpatchcode, szusersid, dwcontext, dwoptions, szsource, dwindex) : 0;
#else
    (void)szproductcodeorpatchcode;
    (void)szusersid;
    (void)dwcontext;
    (void)dwoptions;
    (void)szsource;
    (void)dwindex;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListAddSourceW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* szproduct = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* szusername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwreserved = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* szsource = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiSourceListAddSourceW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(szproduct, szusername, dwreserved, szsource) : 0;
#else
    (void)szproduct;
    (void)szusername;
    (void)dwreserved;
    (void)szsource;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListClearAllA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* szproduct = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* szusername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwreserved = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiSourceListClearAllA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(szproduct, szusername, dwreserved) : 0;
#else
    (void)szproduct;
    (void)szusername;
    (void)dwreserved;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListClearAllExA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* szproductcodeorpatchcode = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* szusersid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t dwcontext = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t dwoptions = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiSourceListClearAllExA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(szproductcodeorpatchcode, szusersid, dwcontext, dwoptions) : 0;
#else
    (void)szproductcodeorpatchcode;
    (void)szusersid;
    (void)dwcontext;
    (void)dwoptions;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListClearAllExW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* szproductcodeorpatchcode = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* szusersid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t dwcontext = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t dwoptions = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiSourceListClearAllExW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(szproductcodeorpatchcode, szusersid, dwcontext, dwoptions) : 0;
#else
    (void)szproductcodeorpatchcode;
    (void)szusersid;
    (void)dwcontext;
    (void)dwoptions;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListClearAllW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* szproduct = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* szusername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwreserved = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiSourceListClearAllW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(szproduct, szusername, dwreserved) : 0;
#else
    (void)szproduct;
    (void)szusername;
    (void)dwreserved;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListClearMediaDiskA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* szproductcodeorpatchcode = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* szusersid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t dwcontext = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t dwoptions = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t dwdiskid = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiSourceListClearMediaDiskA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(szproductcodeorpatchcode, szusersid, dwcontext, dwoptions, dwdiskid) : 0;
#else
    (void)szproductcodeorpatchcode;
    (void)szusersid;
    (void)dwcontext;
    (void)dwoptions;
    (void)dwdiskid;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListClearMediaDiskW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* szproductcodeorpatchcode = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* szusersid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t dwcontext = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t dwoptions = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t dwdiskid = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiSourceListClearMediaDiskW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(szproductcodeorpatchcode, szusersid, dwcontext, dwoptions, dwdiskid) : 0;
#else
    (void)szproductcodeorpatchcode;
    (void)szusersid;
    (void)dwcontext;
    (void)dwoptions;
    (void)dwdiskid;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListClearSourceA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* szproductcodeorpatchcode = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* szusersid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t dwcontext = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t dwoptions = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* szsource = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiSourceListClearSourceA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(szproductcodeorpatchcode, szusersid, dwcontext, dwoptions, szsource) : 0;
#else
    (void)szproductcodeorpatchcode;
    (void)szusersid;
    (void)dwcontext;
    (void)dwoptions;
    (void)szsource;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListClearSourceW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* szproductcodeorpatchcode = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* szusersid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t dwcontext = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t dwoptions = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* szsource = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiSourceListClearSourceW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(szproductcodeorpatchcode, szusersid, dwcontext, dwoptions, szsource) : 0;
#else
    (void)szproductcodeorpatchcode;
    (void)szusersid;
    (void)dwcontext;
    (void)dwoptions;
    (void)szsource;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListEnumMediaDisksA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* szproductcodeorpatchcode = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* szusersid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t dwcontext = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t dwoptions = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t dwindex = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* pdwdiskid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* szvolumelabel = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* pcchvolumelabel = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    void* szdiskprompt = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
    void* pcchdiskprompt = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 9 ? km_napi_arg_u64(km_info[9]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, uint32_t, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiSourceListEnumMediaDisksA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(szproductcodeorpatchcode, szusersid, dwcontext, dwoptions, dwindex, pdwdiskid, szvolumelabel, pcchvolumelabel, szdiskprompt, pcchdiskprompt) : 0;
#else
    (void)szproductcodeorpatchcode;
    (void)szusersid;
    (void)dwcontext;
    (void)dwoptions;
    (void)dwindex;
    (void)pdwdiskid;
    (void)szvolumelabel;
    (void)pcchvolumelabel;
    (void)szdiskprompt;
    (void)pcchdiskprompt;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListEnumMediaDisksW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* szproductcodeorpatchcode = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* szusersid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t dwcontext = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t dwoptions = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t dwindex = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* pdwdiskid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* szvolumelabel = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* pcchvolumelabel = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    void* szdiskprompt = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
    void* pcchdiskprompt = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 9 ? km_napi_arg_u64(km_info[9]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, uint32_t, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiSourceListEnumMediaDisksW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(szproductcodeorpatchcode, szusersid, dwcontext, dwoptions, dwindex, pdwdiskid, szvolumelabel, pcchvolumelabel, szdiskprompt, pcchdiskprompt) : 0;
#else
    (void)szproductcodeorpatchcode;
    (void)szusersid;
    (void)dwcontext;
    (void)dwoptions;
    (void)dwindex;
    (void)pdwdiskid;
    (void)szvolumelabel;
    (void)pcchvolumelabel;
    (void)szdiskprompt;
    (void)pcchdiskprompt;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListEnumSourcesA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* szproductcodeorpatchcode = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* szusersid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t dwcontext = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t dwoptions = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t dwindex = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* szsource = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* pcchsource = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiSourceListEnumSourcesA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(szproductcodeorpatchcode, szusersid, dwcontext, dwoptions, dwindex, szsource, pcchsource) : 0;
#else
    (void)szproductcodeorpatchcode;
    (void)szusersid;
    (void)dwcontext;
    (void)dwoptions;
    (void)dwindex;
    (void)szsource;
    (void)pcchsource;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListEnumSourcesW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* szproductcodeorpatchcode = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* szusersid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t dwcontext = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t dwoptions = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t dwindex = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* szsource = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* pcchsource = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiSourceListEnumSourcesW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(szproductcodeorpatchcode, szusersid, dwcontext, dwoptions, dwindex, szsource, pcchsource) : 0;
#else
    (void)szproductcodeorpatchcode;
    (void)szusersid;
    (void)dwcontext;
    (void)dwoptions;
    (void)dwindex;
    (void)szsource;
    (void)pcchsource;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListForceResolutionA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* szproduct = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* szusername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwreserved = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiSourceListForceResolutionA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(szproduct, szusername, dwreserved) : 0;
#else
    (void)szproduct;
    (void)szusername;
    (void)dwreserved;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListForceResolutionExA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* szproductcodeorpatchcode = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* szusersid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t dwcontext = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t dwoptions = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiSourceListForceResolutionExA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(szproductcodeorpatchcode, szusersid, dwcontext, dwoptions) : 0;
#else
    (void)szproductcodeorpatchcode;
    (void)szusersid;
    (void)dwcontext;
    (void)dwoptions;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListForceResolutionExW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* szproductcodeorpatchcode = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* szusersid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t dwcontext = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t dwoptions = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiSourceListForceResolutionExW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(szproductcodeorpatchcode, szusersid, dwcontext, dwoptions) : 0;
#else
    (void)szproductcodeorpatchcode;
    (void)szusersid;
    (void)dwcontext;
    (void)dwoptions;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListForceResolutionW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* szproduct = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* szusername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwreserved = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiSourceListForceResolutionW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(szproduct, szusername, dwreserved) : 0;
#else
    (void)szproduct;
    (void)szusername;
    (void)dwreserved;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListGetInfoA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* szproductcodeorpatchcode = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* szusersid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t dwcontext = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t dwoptions = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* szproperty = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* szvalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* pcchvalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiSourceListGetInfoA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(szproductcodeorpatchcode, szusersid, dwcontext, dwoptions, szproperty, szvalue, pcchvalue) : 0;
#else
    (void)szproductcodeorpatchcode;
    (void)szusersid;
    (void)dwcontext;
    (void)dwoptions;
    (void)szproperty;
    (void)szvalue;
    (void)pcchvalue;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListGetInfoW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* szproductcodeorpatchcode = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* szusersid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t dwcontext = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t dwoptions = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* szproperty = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* szvalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* pcchvalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiSourceListGetInfoW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(szproductcodeorpatchcode, szusersid, dwcontext, dwoptions, szproperty, szvalue, pcchvalue) : 0;
#else
    (void)szproductcodeorpatchcode;
    (void)szusersid;
    (void)dwcontext;
    (void)dwoptions;
    (void)szproperty;
    (void)szvalue;
    (void)pcchvalue;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListSetInfoA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* szproductcodeorpatchcode = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* szusersid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t dwcontext = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t dwoptions = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* szproperty = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* szvalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiSourceListSetInfoA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(szproductcodeorpatchcode, szusersid, dwcontext, dwoptions, szproperty, szvalue) : 0;
#else
    (void)szproductcodeorpatchcode;
    (void)szusersid;
    (void)dwcontext;
    (void)dwoptions;
    (void)szproperty;
    (void)szvalue;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListSetInfoW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* szproductcodeorpatchcode = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* szusersid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t dwcontext = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t dwoptions = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* szproperty = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* szvalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiSourceListSetInfoW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(szproductcodeorpatchcode, szusersid, dwcontext, dwoptions, szproperty, szvalue) : 0;
#else
    (void)szproductcodeorpatchcode;
    (void)szusersid;
    (void)dwcontext;
    (void)dwoptions;
    (void)szproperty;
    (void)szvalue;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiSummaryInfoGetPropertyA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t hsummaryinfo = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t uiproperty = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* puidatatype = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pivalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pftvalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* szvaluebuf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* pcchvaluebuf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiSummaryInfoGetPropertyA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hsummaryinfo, uiproperty, puidatatype, pivalue, pftvalue, szvaluebuf, pcchvaluebuf) : 0;
#else
    (void)hsummaryinfo;
    (void)uiproperty;
    (void)puidatatype;
    (void)pivalue;
    (void)pftvalue;
    (void)szvaluebuf;
    (void)pcchvaluebuf;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiSummaryInfoGetPropertyCount_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t hsummaryinfo = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* puipropertycount = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiSummaryInfoGetPropertyCount")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hsummaryinfo, puipropertycount) : 0;
#else
    (void)hsummaryinfo;
    (void)puipropertycount;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiSummaryInfoGetPropertyW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t hsummaryinfo = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t uiproperty = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* puidatatype = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pivalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pftvalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* szvaluebuf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* pcchvaluebuf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiSummaryInfoGetPropertyW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hsummaryinfo, uiproperty, puidatatype, pivalue, pftvalue, szvaluebuf, pcchvaluebuf) : 0;
#else
    (void)hsummaryinfo;
    (void)uiproperty;
    (void)puidatatype;
    (void)pivalue;
    (void)pftvalue;
    (void)szvaluebuf;
    (void)pcchvaluebuf;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiSummaryInfoPersist_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t hsummaryinfo = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiSummaryInfoPersist")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hsummaryinfo) : 0;
#else
    (void)hsummaryinfo;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiSummaryInfoSetPropertyA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t hsummaryinfo = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t uiproperty = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t uidatatype = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t ivalue = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* pftvalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* szvalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiSummaryInfoSetPropertyA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hsummaryinfo, uiproperty, uidatatype, ivalue, pftvalue, szvalue) : 0;
#else
    (void)hsummaryinfo;
    (void)uiproperty;
    (void)uidatatype;
    (void)ivalue;
    (void)pftvalue;
    (void)szvalue;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiSummaryInfoSetPropertyW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t hsummaryinfo = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t uiproperty = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t uidatatype = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t ivalue = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* pftvalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* szvalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiSummaryInfoSetPropertyW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hsummaryinfo, uiproperty, uidatatype, ivalue, pftvalue, szvalue) : 0;
#else
    (void)hsummaryinfo;
    (void)uiproperty;
    (void)uidatatype;
    (void)ivalue;
    (void)pftvalue;
    (void)szvalue;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiUseFeatureA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* szproduct = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* szfeature = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiUseFeatureA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(szproduct, szfeature) : -1;
#else
    (void)szproduct;
    (void)szfeature;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiUseFeatureExA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* szproduct = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* szfeature = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwinstallmode = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t dwreserved = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiUseFeatureExA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(szproduct, szfeature, dwinstallmode, dwreserved) : -1;
#else
    (void)szproduct;
    (void)szfeature;
    (void)dwinstallmode;
    (void)dwreserved;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiUseFeatureExW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* szproduct = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* szfeature = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwinstallmode = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t dwreserved = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiUseFeatureExW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(szproduct, szfeature, dwinstallmode, dwreserved) : -1;
#else
    (void)szproduct;
    (void)szfeature;
    (void)dwinstallmode;
    (void)dwreserved;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiUseFeatureW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* szproduct = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* szfeature = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiUseFeatureW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(szproduct, szfeature) : -1;
#else
    (void)szproduct;
    (void)szfeature;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiVerifyDiskSpace_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t hinstall = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiVerifyDiskSpace")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hinstall) : 0;
#else
    (void)hinstall;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiVerifyPackageA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* szpackagepath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiVerifyPackageA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(szpackagepath) : 0;
#else
    (void)szpackagepath;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiVerifyPackageW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* szpackagepath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiVerifyPackageW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(szpackagepath) : 0;
#else
    (void)szpackagepath;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiViewClose_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t hview = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiViewClose")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hview) : 0;
#else
    (void)hview;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiViewExecute_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t hview = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t hrecord = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiViewExecute")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hview, hrecord) : 0;
#else
    (void)hview;
    (void)hrecord;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiViewFetch_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t hview = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* phrecord = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiViewFetch")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hview, phrecord) : 0;
#else
    (void)hview;
    (void)phrecord;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiViewGetColumnInfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t hview = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    int32_t ecolumninfo = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* phrecord = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiViewGetColumnInfo")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hview, ecolumninfo, phrecord) : 0;
#else
    (void)hview;
    (void)ecolumninfo;
    (void)phrecord;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiViewGetErrorA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t hview = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* szcolumnnamebuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pcchbuf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiViewGetErrorA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hview, szcolumnnamebuffer, pcchbuf) : -1;
#else
    (void)hview;
    (void)szcolumnnamebuffer;
    (void)pcchbuf;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiViewGetErrorW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t hview = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* szcolumnnamebuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pcchbuf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiViewGetErrorW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hview, szcolumnnamebuffer, pcchbuf) : -1;
#else
    (void)hview;
    (void)szcolumnnamebuffer;
    (void)pcchbuf;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_MsiViewModify_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t hview = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    int32_t emodifymode = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t hrecord = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MsiViewModify")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hview, emodifymode, hrecord) : 0;
#else
    (void)hview;
    (void)emodifymode;
    (void)hrecord;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_NormalizeFileForPatchSignature_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* filebuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t filesize = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t optionflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* optiondata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t newfilecoffbase = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    uint32_t newfilecofftime = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    uint32_t ignorerangecount = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    void* ignorerangearray = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    uint32_t retainrangecount = static_cast<uint32_t>(km_info.Length() > 8 ? km_info[8].ToNumber().Int32Value() : 0);
    void* retainrangearray = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 9 ? km_napi_arg_u64(km_info[9]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, uint32_t, uint32_t, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mspatcha.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NormalizeFileForPatchSignature")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(filebuffer, filesize, optionflags, optiondata, newfilecoffbase, newfilecofftime, ignorerangecount, ignorerangearray, retainrangecount, retainrangearray) : -1;
#else
    (void)filebuffer;
    (void)filesize;
    (void)optionflags;
    (void)optiondata;
    (void)newfilecoffbase;
    (void)newfilecofftime;
    (void)ignorerangecount;
    (void)ignorerangearray;
    (void)retainrangecount;
    (void)retainrangearray;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_QueryActCtxSettingsW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* hactctx = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* settingsnamespace = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* settingname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pvbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint64_t dwbuffer = km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0;
    void* pdwwrittenorrequired = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "QueryActCtxSettingsW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwflags, hactctx, settingsnamespace, settingname, pvbuffer, dwbuffer, pdwwrittenorrequired) : -1;
#else
    (void)dwflags;
    (void)hactctx;
    (void)settingsnamespace;
    (void)settingname;
    (void)pvbuffer;
    (void)dwbuffer;
    (void)pdwwrittenorrequired;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_QueryActCtxW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* hactctx = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pvsubinstance = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t ulinfoclass = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* pvbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint64_t cbbuffer = km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0;
    void* pcbwrittenorrequired = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, uint32_t, void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "QueryActCtxW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwflags, hactctx, pvsubinstance, ulinfoclass, pvbuffer, cbbuffer, pcbwrittenorrequired) : -1;
#else
    (void)dwflags;
    (void)hactctx;
    (void)pvsubinstance;
    (void)ulinfoclass;
    (void)pvbuffer;
    (void)cbbuffer;
    (void)pcbwrittenorrequired;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_ReleaseActCtx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hactctx = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ReleaseActCtx")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(hactctx);
#else
    (void)hactctx;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_SfcGetNextProtectedFile_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* rpchandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* protfiledata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("sfc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SfcGetNextProtectedFile")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(rpchandle, protfiledata) : -1;
#else
    (void)rpchandle;
    (void)protfiledata;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_SfcIsFileProtected_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* rpchandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* protfilename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("sfc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SfcIsFileProtected")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(rpchandle, protfilename) : -1;
#else
    (void)rpchandle;
    (void)protfilename;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_SfcIsKeyProtected_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* keyhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* subkeyname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t keysam = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("sfc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SfcIsKeyProtected")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(keyhandle, subkeyname, keysam) : -1;
#else
    (void)keyhandle;
    (void)subkeyname;
    (void)keysam;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_SfpVerifyFile_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pszfilename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pszerror = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwerrsize = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("sfc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SfpVerifyFile")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pszfilename, pszerror, dwerrsize) : -1;
#else
    (void)pszfilename;
    (void)pszerror;
    (void)dwerrsize;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_TestApplyPatchToFileA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* patchfilename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* oldfilename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t applyoptionflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mspatcha.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "TestApplyPatchToFileA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(patchfilename, oldfilename, applyoptionflags) : -1;
#else
    (void)patchfilename;
    (void)oldfilename;
    (void)applyoptionflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_TestApplyPatchToFileByBuffers_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* patchfilebuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t patchfilesize = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* oldfilebuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t oldfilesize = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* newfilesize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t applyoptionflags = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mspatcha.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "TestApplyPatchToFileByBuffers")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(patchfilebuffer, patchfilesize, oldfilebuffer, oldfilesize, newfilesize, applyoptionflags) : -1;
#else
    (void)patchfilebuffer;
    (void)patchfilesize;
    (void)oldfilebuffer;
    (void)oldfilesize;
    (void)newfilesize;
    (void)applyoptionflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_TestApplyPatchToFileByHandles_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* patchfilehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* oldfilehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t applyoptionflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mspatcha.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "TestApplyPatchToFileByHandles")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(patchfilehandle, oldfilehandle, applyoptionflags) : -1;
#else
    (void)patchfilehandle;
    (void)oldfilehandle;
    (void)applyoptionflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_TestApplyPatchToFileW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* patchfilename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* oldfilename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t applyoptionflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mspatcha.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "TestApplyPatchToFileW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(patchfilename, oldfilename, applyoptionflags) : -1;
#else
    (void)patchfilename;
    (void)oldfilename;
    (void)applyoptionflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_applicationinstallationandservicing_ZombifyActCtx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hactctx = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ZombifyActCtx")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hactctx) : -1;
#else
    (void)hactctx;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static void register_windows_win32_system_applicationinstallationandservicing_napi(Napi::Env env, Napi::Object exports) {
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_ActivateActCtx", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_ActivateActCtx_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_AddRefActCtx", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_AddRefActCtx_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_ApplyDeltaA", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_ApplyDeltaA_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_ApplyDeltaW", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_ApplyDeltaW_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_ApplyPatchToFileA", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_ApplyPatchToFileA_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_ApplyPatchToFileByBuffers", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_ApplyPatchToFileByBuffers_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_ApplyPatchToFileByHandles", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_ApplyPatchToFileByHandles_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_ApplyPatchToFileByHandlesEx", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_ApplyPatchToFileByHandlesEx_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_ApplyPatchToFileExA", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_ApplyPatchToFileExA_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_ApplyPatchToFileExW", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_ApplyPatchToFileExW_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_ApplyPatchToFileW", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_ApplyPatchToFileW_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_CreateActCtxA", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_CreateActCtxA_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_CreateActCtxW", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_CreateActCtxW_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_CreatePatchFileA", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_CreatePatchFileA_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_CreatePatchFileByHandles", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_CreatePatchFileByHandles_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_CreatePatchFileByHandlesEx", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_CreatePatchFileByHandlesEx_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_CreatePatchFileExA", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_CreatePatchFileExA_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_CreatePatchFileExW", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_CreatePatchFileExW_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_CreatePatchFileW", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_CreatePatchFileW_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_DeactivateActCtx", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_DeactivateActCtx_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_DeltaFree", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_DeltaFree_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_ExtractPatchHeaderToFileA", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_ExtractPatchHeaderToFileA_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_ExtractPatchHeaderToFileByHandles", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_ExtractPatchHeaderToFileByHandles_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_ExtractPatchHeaderToFileW", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_ExtractPatchHeaderToFileW_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_FindActCtxSectionGuid", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_FindActCtxSectionGuid_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_FindActCtxSectionStringA", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_FindActCtxSectionStringA_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_FindActCtxSectionStringW", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_FindActCtxSectionStringW_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_GetCurrentActCtx", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_GetCurrentActCtx_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_GetDeltaInfoA", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_GetDeltaInfoA_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_GetDeltaInfoW", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_GetDeltaInfoW_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_GetDeltaSignatureA", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_GetDeltaSignatureA_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_GetDeltaSignatureW", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_GetDeltaSignatureW_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_GetFilePatchSignatureA", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_GetFilePatchSignatureA_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_GetFilePatchSignatureByBuffer", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_GetFilePatchSignatureByBuffer_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_GetFilePatchSignatureByHandle", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_GetFilePatchSignatureByHandle_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_GetFilePatchSignatureW", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_GetFilePatchSignatureW_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiAdvertiseProductA", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiAdvertiseProductA_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiAdvertiseProductExA", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiAdvertiseProductExA_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiAdvertiseProductExW", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiAdvertiseProductExW_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiAdvertiseProductW", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiAdvertiseProductW_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiAdvertiseScriptA", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiAdvertiseScriptA_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiAdvertiseScriptW", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiAdvertiseScriptW_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiApplyMultiplePatchesA", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiApplyMultiplePatchesA_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiApplyMultiplePatchesW", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiApplyMultiplePatchesW_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiApplyPatchA", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiApplyPatchA_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiApplyPatchW", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiApplyPatchW_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiBeginTransactionA", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiBeginTransactionA_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiBeginTransactionW", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiBeginTransactionW_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiCloseAllHandles", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiCloseAllHandles_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiCloseHandle", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiCloseHandle_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiCollectUserInfoA", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiCollectUserInfoA_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiCollectUserInfoW", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiCollectUserInfoW_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiConfigureFeatureA", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiConfigureFeatureA_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiConfigureFeatureW", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiConfigureFeatureW_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiConfigureProductA", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiConfigureProductA_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiConfigureProductExA", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiConfigureProductExA_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiConfigureProductExW", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiConfigureProductExW_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiConfigureProductW", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiConfigureProductW_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiCreateRecord", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiCreateRecord_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiCreateTransformSummaryInfoA", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiCreateTransformSummaryInfoA_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiCreateTransformSummaryInfoW", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiCreateTransformSummaryInfoW_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiDatabaseApplyTransformA", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiDatabaseApplyTransformA_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiDatabaseApplyTransformW", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiDatabaseApplyTransformW_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiDatabaseCommit", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiDatabaseCommit_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiDatabaseExportA", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiDatabaseExportA_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiDatabaseExportW", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiDatabaseExportW_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiDatabaseGenerateTransformA", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiDatabaseGenerateTransformA_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiDatabaseGenerateTransformW", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiDatabaseGenerateTransformW_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiDatabaseGetPrimaryKeysA", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiDatabaseGetPrimaryKeysA_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiDatabaseGetPrimaryKeysW", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiDatabaseGetPrimaryKeysW_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiDatabaseImportA", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiDatabaseImportA_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiDatabaseImportW", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiDatabaseImportW_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiDatabaseIsTablePersistentA", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiDatabaseIsTablePersistentA_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiDatabaseIsTablePersistentW", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiDatabaseIsTablePersistentW_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiDatabaseMergeA", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiDatabaseMergeA_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiDatabaseMergeW", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiDatabaseMergeW_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiDatabaseOpenViewA", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiDatabaseOpenViewA_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiDatabaseOpenViewW", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiDatabaseOpenViewW_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiDetermineApplicablePatchesA", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiDetermineApplicablePatchesA_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiDetermineApplicablePatchesW", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiDetermineApplicablePatchesW_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiDeterminePatchSequenceA", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiDeterminePatchSequenceA_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiDeterminePatchSequenceW", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiDeterminePatchSequenceW_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiDoActionA", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiDoActionA_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiDoActionW", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiDoActionW_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnableLogA", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnableLogA_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnableLogW", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnableLogW_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnableUIPreview", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnableUIPreview_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiEndTransaction", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiEndTransaction_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnumClientsA", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnumClientsA_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnumClientsExA", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnumClientsExA_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnumClientsExW", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnumClientsExW_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnumClientsW", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnumClientsW_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnumComponentCostsA", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnumComponentCostsA_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnumComponentCostsW", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnumComponentCostsW_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnumComponentQualifiersA", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnumComponentQualifiersA_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnumComponentQualifiersW", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnumComponentQualifiersW_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnumComponentsA", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnumComponentsA_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnumComponentsExA", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnumComponentsExA_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnumComponentsExW", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnumComponentsExW_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnumComponentsW", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnumComponentsW_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnumFeaturesA", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnumFeaturesA_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnumFeaturesW", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnumFeaturesW_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnumPatchesA", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnumPatchesA_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnumPatchesExA", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnumPatchesExA_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnumPatchesExW", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnumPatchesExW_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnumPatchesW", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnumPatchesW_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnumProductsA", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnumProductsA_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnumProductsExA", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnumProductsExA_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnumProductsExW", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnumProductsExW_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnumProductsW", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnumProductsW_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnumRelatedProductsA", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnumRelatedProductsA_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnumRelatedProductsW", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnumRelatedProductsW_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiEvaluateConditionA", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiEvaluateConditionA_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiEvaluateConditionW", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiEvaluateConditionW_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiExtractPatchXMLDataA", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiExtractPatchXMLDataA_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiExtractPatchXMLDataW", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiExtractPatchXMLDataW_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiFormatRecordA", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiFormatRecordA_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiFormatRecordW", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiFormatRecordW_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetActiveDatabase", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetActiveDatabase_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetComponentPathA", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetComponentPathA_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetComponentPathExA", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetComponentPathExA_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetComponentPathExW", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetComponentPathExW_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetComponentPathW", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetComponentPathW_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetComponentStateA", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetComponentStateA_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetComponentStateW", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetComponentStateW_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetDatabaseState", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetDatabaseState_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetFeatureCostA", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetFeatureCostA_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetFeatureCostW", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetFeatureCostW_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetFeatureInfoA", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetFeatureInfoA_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetFeatureInfoW", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetFeatureInfoW_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetFeatureStateA", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetFeatureStateA_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetFeatureStateW", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetFeatureStateW_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetFeatureUsageA", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetFeatureUsageA_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetFeatureUsageW", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetFeatureUsageW_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetFeatureValidStatesA", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetFeatureValidStatesA_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetFeatureValidStatesW", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetFeatureValidStatesW_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetFileHashA", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetFileHashA_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetFileHashW", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetFileHashW_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetFileSignatureInformationA", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetFileSignatureInformationA_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetFileSignatureInformationW", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetFileSignatureInformationW_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetFileVersionA", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetFileVersionA_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetFileVersionW", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetFileVersionW_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetLanguage", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetLanguage_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetLastErrorRecord", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetLastErrorRecord_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetMode", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetMode_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetPatchFileListA", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetPatchFileListA_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetPatchFileListW", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetPatchFileListW_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetPatchInfoA", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetPatchInfoA_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetPatchInfoExA", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetPatchInfoExA_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetPatchInfoExW", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetPatchInfoExW_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetPatchInfoW", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetPatchInfoW_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetProductCodeA", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetProductCodeA_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetProductCodeW", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetProductCodeW_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetProductInfoA", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetProductInfoA_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetProductInfoExA", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetProductInfoExA_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetProductInfoExW", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetProductInfoExW_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetProductInfoFromScriptA", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetProductInfoFromScriptA_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetProductInfoFromScriptW", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetProductInfoFromScriptW_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetProductInfoW", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetProductInfoW_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetProductPropertyA", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetProductPropertyA_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetProductPropertyW", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetProductPropertyW_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetPropertyA", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetPropertyA_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetPropertyW", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetPropertyW_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetShortcutTargetA", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetShortcutTargetA_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetShortcutTargetW", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetShortcutTargetW_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetSourcePathA", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetSourcePathA_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetSourcePathW", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetSourcePathW_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetSummaryInformationA", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetSummaryInformationA_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetSummaryInformationW", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetSummaryInformationW_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetTargetPathA", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetTargetPathA_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetTargetPathW", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetTargetPathW_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetUserInfoA", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetUserInfoA_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetUserInfoW", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetUserInfoW_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiInstallMissingComponentA", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiInstallMissingComponentA_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiInstallMissingComponentW", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiInstallMissingComponentW_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiInstallMissingFileA", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiInstallMissingFileA_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiInstallMissingFileW", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiInstallMissingFileW_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiInstallProductA", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiInstallProductA_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiInstallProductW", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiInstallProductW_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiIsProductElevatedA", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiIsProductElevatedA_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiIsProductElevatedW", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiIsProductElevatedW_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiJoinTransaction", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiJoinTransaction_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiLocateComponentA", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiLocateComponentA_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiLocateComponentW", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiLocateComponentW_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiNotifySidChangeA", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiNotifySidChangeA_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiNotifySidChangeW", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiNotifySidChangeW_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiOpenDatabaseA", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiOpenDatabaseA_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiOpenDatabaseW", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiOpenDatabaseW_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiOpenPackageA", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiOpenPackageA_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiOpenPackageExA", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiOpenPackageExA_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiOpenPackageExW", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiOpenPackageExW_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiOpenPackageW", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiOpenPackageW_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiOpenProductA", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiOpenProductA_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiOpenProductW", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiOpenProductW_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiPreviewBillboardA", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiPreviewBillboardA_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiPreviewBillboardW", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiPreviewBillboardW_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiPreviewDialogA", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiPreviewDialogA_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiPreviewDialogW", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiPreviewDialogW_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiProcessAdvertiseScriptA", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiProcessAdvertiseScriptA_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiProcessAdvertiseScriptW", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiProcessAdvertiseScriptW_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiProcessMessage", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiProcessMessage_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiProvideAssemblyA", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiProvideAssemblyA_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiProvideAssemblyW", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiProvideAssemblyW_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiProvideComponentA", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiProvideComponentA_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiProvideComponentW", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiProvideComponentW_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiProvideQualifiedComponentA", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiProvideQualifiedComponentA_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiProvideQualifiedComponentExA", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiProvideQualifiedComponentExA_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiProvideQualifiedComponentExW", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiProvideQualifiedComponentExW_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiProvideQualifiedComponentW", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiProvideQualifiedComponentW_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiQueryComponentStateA", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiQueryComponentStateA_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiQueryComponentStateW", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiQueryComponentStateW_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiQueryFeatureStateA", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiQueryFeatureStateA_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiQueryFeatureStateExA", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiQueryFeatureStateExA_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiQueryFeatureStateExW", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiQueryFeatureStateExW_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiQueryFeatureStateW", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiQueryFeatureStateW_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiQueryProductStateA", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiQueryProductStateA_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiQueryProductStateW", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiQueryProductStateW_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiRecordClearData", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiRecordClearData_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiRecordDataSize", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiRecordDataSize_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiRecordGetFieldCount", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiRecordGetFieldCount_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiRecordGetInteger", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiRecordGetInteger_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiRecordGetStringA", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiRecordGetStringA_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiRecordGetStringW", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiRecordGetStringW_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiRecordIsNull", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiRecordIsNull_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiRecordReadStream", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiRecordReadStream_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiRecordSetInteger", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiRecordSetInteger_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiRecordSetStreamA", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiRecordSetStreamA_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiRecordSetStreamW", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiRecordSetStreamW_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiRecordSetStringA", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiRecordSetStringA_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiRecordSetStringW", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiRecordSetStringW_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiReinstallFeatureA", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiReinstallFeatureA_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiReinstallFeatureW", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiReinstallFeatureW_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiReinstallProductA", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiReinstallProductA_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiReinstallProductW", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiReinstallProductW_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiRemovePatchesA", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiRemovePatchesA_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiRemovePatchesW", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiRemovePatchesW_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiSequenceA", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiSequenceA_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiSequenceW", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiSequenceW_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiSetComponentStateA", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiSetComponentStateA_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiSetComponentStateW", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiSetComponentStateW_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiSetExternalUIA", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiSetExternalUIA_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiSetExternalUIRecord", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiSetExternalUIRecord_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiSetExternalUIW", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiSetExternalUIW_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiSetFeatureAttributesA", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiSetFeatureAttributesA_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiSetFeatureAttributesW", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiSetFeatureAttributesW_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiSetFeatureStateA", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiSetFeatureStateA_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiSetFeatureStateW", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiSetFeatureStateW_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiSetInstallLevel", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiSetInstallLevel_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiSetInternalUI", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiSetInternalUI_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiSetMode", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiSetMode_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiSetPropertyA", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiSetPropertyA_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiSetPropertyW", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiSetPropertyW_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiSetTargetPathA", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiSetTargetPathA_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiSetTargetPathW", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiSetTargetPathW_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListAddMediaDiskA", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListAddMediaDiskA_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListAddMediaDiskW", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListAddMediaDiskW_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListAddSourceA", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListAddSourceA_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListAddSourceExA", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListAddSourceExA_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListAddSourceExW", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListAddSourceExW_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListAddSourceW", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListAddSourceW_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListClearAllA", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListClearAllA_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListClearAllExA", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListClearAllExA_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListClearAllExW", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListClearAllExW_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListClearAllW", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListClearAllW_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListClearMediaDiskA", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListClearMediaDiskA_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListClearMediaDiskW", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListClearMediaDiskW_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListClearSourceA", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListClearSourceA_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListClearSourceW", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListClearSourceW_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListEnumMediaDisksA", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListEnumMediaDisksA_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListEnumMediaDisksW", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListEnumMediaDisksW_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListEnumSourcesA", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListEnumSourcesA_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListEnumSourcesW", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListEnumSourcesW_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListForceResolutionA", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListForceResolutionA_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListForceResolutionExA", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListForceResolutionExA_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListForceResolutionExW", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListForceResolutionExW_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListForceResolutionW", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListForceResolutionW_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListGetInfoA", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListGetInfoA_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListGetInfoW", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListGetInfoW_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListSetInfoA", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListSetInfoA_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListSetInfoW", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListSetInfoW_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiSummaryInfoGetPropertyA", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiSummaryInfoGetPropertyA_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiSummaryInfoGetPropertyCount", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiSummaryInfoGetPropertyCount_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiSummaryInfoGetPropertyW", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiSummaryInfoGetPropertyW_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiSummaryInfoPersist", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiSummaryInfoPersist_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiSummaryInfoSetPropertyA", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiSummaryInfoSetPropertyA_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiSummaryInfoSetPropertyW", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiSummaryInfoSetPropertyW_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiUseFeatureA", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiUseFeatureA_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiUseFeatureExA", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiUseFeatureExA_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiUseFeatureExW", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiUseFeatureExW_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiUseFeatureW", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiUseFeatureW_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiVerifyDiskSpace", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiVerifyDiskSpace_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiVerifyPackageA", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiVerifyPackageA_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiVerifyPackageW", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiVerifyPackageW_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiViewClose", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiViewClose_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiViewExecute", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiViewExecute_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiViewFetch", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiViewFetch_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiViewGetColumnInfo", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiViewGetColumnInfo_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiViewGetErrorA", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiViewGetErrorA_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiViewGetErrorW", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiViewGetErrorW_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_MsiViewModify", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_MsiViewModify_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_NormalizeFileForPatchSignature", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_NormalizeFileForPatchSignature_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_QueryActCtxSettingsW", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_QueryActCtxSettingsW_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_QueryActCtxW", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_QueryActCtxW_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_ReleaseActCtx", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_ReleaseActCtx_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_SfcGetNextProtectedFile", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_SfcGetNextProtectedFile_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_SfcIsFileProtected", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_SfcIsFileProtected_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_SfcIsKeyProtected", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_SfcIsKeyProtected_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_SfpVerifyFile", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_SfpVerifyFile_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_TestApplyPatchToFileA", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_TestApplyPatchToFileA_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_TestApplyPatchToFileByBuffers", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_TestApplyPatchToFileByBuffers_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_TestApplyPatchToFileByHandles", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_TestApplyPatchToFileByHandles_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_TestApplyPatchToFileW", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_TestApplyPatchToFileW_napi));
    exports.Set("windowssys_windows_win32_system_applicationinstallationandservicing_ZombifyActCtx", Napi::Function::New(env, windowssys_windows_win32_system_applicationinstallationandservicing_ZombifyActCtx_napi));
}

static KmNapiRegistrarNode registrar_node = { &register_windows_win32_system_applicationinstallationandservicing_napi, nullptr };
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
