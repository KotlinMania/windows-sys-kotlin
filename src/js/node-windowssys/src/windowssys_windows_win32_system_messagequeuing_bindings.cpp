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

static Napi::Value windowssys_windows_win32_system_messagequeuing_MQADsPathToFormatName_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpwcsadspath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpwcsformatname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* lpdwformatnamelength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mqrt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MQADsPathToFormatName")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpwcsadspath, lpwcsformatname, lpdwformatnamelength) : -1;
#else
    (void)lpwcsadspath;
    (void)lpwcsformatname;
    (void)lpdwformatnamelength;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_messagequeuing_MQBeginTransaction_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pptransaction = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mqrt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MQBeginTransaction")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pptransaction) : -1;
#else
    (void)pptransaction;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_messagequeuing_MQCloseCursor_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hcursor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mqrt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MQCloseCursor")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcursor) : -1;
#else
    (void)hcursor;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_messagequeuing_MQCloseQueue_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hqueue = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mqrt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MQCloseQueue")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hqueue) : -1;
#else
    (void)hqueue;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_messagequeuing_MQCreateCursor_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hqueue = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* phcursor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mqrt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MQCreateCursor")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hqueue, phcursor) : -1;
#else
    (void)hqueue;
    (void)phcursor;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_messagequeuing_MQCreateQueue_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* psecuritydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pqueueprops = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* lpwcsformatname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* lpdwformatnamelength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mqrt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MQCreateQueue")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(psecuritydescriptor, pqueueprops, lpwcsformatname, lpdwformatnamelength) : -1;
#else
    (void)psecuritydescriptor;
    (void)pqueueprops;
    (void)lpwcsformatname;
    (void)lpdwformatnamelength;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_messagequeuing_MQDeleteQueue_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpwcsformatname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mqrt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MQDeleteQueue")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpwcsformatname) : -1;
#else
    (void)lpwcsformatname;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_messagequeuing_MQFreeMemory_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pvmemory = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mqrt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MQFreeMemory")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(pvmemory);
#else
    (void)pvmemory;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_messagequeuing_MQFreeSecurityContext_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hsecuritycontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mqrt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MQFreeSecurityContext")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(hsecuritycontext);
#else
    (void)hsecuritycontext;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_messagequeuing_MQGetMachineProperties_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpwcsmachinename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pguidmachineid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pqmprops = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mqrt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MQGetMachineProperties")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpwcsmachinename, pguidmachineid, pqmprops) : -1;
#else
    (void)lpwcsmachinename;
    (void)pguidmachineid;
    (void)pqmprops;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_messagequeuing_MQGetOverlappedResult_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpoverlapped = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mqrt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MQGetOverlappedResult")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpoverlapped) : -1;
#else
    (void)lpoverlapped;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_messagequeuing_MQGetPrivateComputerInformation_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpwcscomputername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pprivateprops = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mqrt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MQGetPrivateComputerInformation")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpwcscomputername, pprivateprops) : -1;
#else
    (void)lpwcscomputername;
    (void)pprivateprops;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_messagequeuing_MQGetQueueProperties_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpwcsformatname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pqueueprops = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mqrt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MQGetQueueProperties")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpwcsformatname, pqueueprops) : -1;
#else
    (void)lpwcsformatname;
    (void)pqueueprops;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_messagequeuing_MQGetQueueSecurity_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpwcsformatname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t requestedinformation = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* psecuritydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t nlength = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* lpnlengthneeded = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mqrt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MQGetQueueSecurity")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpwcsformatname, requestedinformation, psecuritydescriptor, nlength, lpnlengthneeded) : -1;
#else
    (void)lpwcsformatname;
    (void)requestedinformation;
    (void)psecuritydescriptor;
    (void)nlength;
    (void)lpnlengthneeded;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_messagequeuing_MQGetSecurityContext_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpcertbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwcertbufferlength = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* phsecuritycontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mqrt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MQGetSecurityContext")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpcertbuffer, dwcertbufferlength, phsecuritycontext) : -1;
#else
    (void)lpcertbuffer;
    (void)dwcertbufferlength;
    (void)phsecuritycontext;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_messagequeuing_MQGetSecurityContextEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpcertbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwcertbufferlength = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* phsecuritycontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mqrt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MQGetSecurityContextEx")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpcertbuffer, dwcertbufferlength, phsecuritycontext) : -1;
#else
    (void)lpcertbuffer;
    (void)dwcertbufferlength;
    (void)phsecuritycontext;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_messagequeuing_MQHandleToFormatName_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hqueue = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* lpwcsformatname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* lpdwformatnamelength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mqrt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MQHandleToFormatName")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hqueue, lpwcsformatname, lpdwformatnamelength) : -1;
#else
    (void)hqueue;
    (void)lpwcsformatname;
    (void)lpdwformatnamelength;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_messagequeuing_MQInstanceToFormatName_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpwcsformatname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* lpdwformatnamelength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mqrt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MQInstanceToFormatName")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pguid, lpwcsformatname, lpdwformatnamelength) : -1;
#else
    (void)pguid;
    (void)lpwcsformatname;
    (void)lpdwformatnamelength;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_messagequeuing_MQLocateBegin_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpwcscontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* prestriction = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pcolumns = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* psort = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* phenum = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mqrt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MQLocateBegin")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpwcscontext, prestriction, pcolumns, psort, phenum) : -1;
#else
    (void)lpwcscontext;
    (void)prestriction;
    (void)pcolumns;
    (void)psort;
    (void)phenum;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_messagequeuing_MQLocateEnd_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* henum = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mqrt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MQLocateEnd")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(henum) : -1;
#else
    (void)henum;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_messagequeuing_MQLocateNext_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* henum = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pcprops = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* apropvar = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mqrt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MQLocateNext")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(henum, pcprops, apropvar) : -1;
#else
    (void)henum;
    (void)pcprops;
    (void)apropvar;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_messagequeuing_MQMarkMessageRejected_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hqueue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t ulllookupid = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mqrt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MQMarkMessageRejected")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hqueue, ulllookupid) : -1;
#else
    (void)hqueue;
    (void)ulllookupid;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_messagequeuing_MQMgmtAction_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pcomputername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pobjectname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* paction = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mqrt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MQMgmtAction")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pcomputername, pobjectname, paction) : -1;
#else
    (void)pcomputername;
    (void)pobjectname;
    (void)paction;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_messagequeuing_MQMgmtGetInfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pcomputername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pobjectname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pmgmtprops = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mqrt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MQMgmtGetInfo")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pcomputername, pobjectname, pmgmtprops) : -1;
#else
    (void)pcomputername;
    (void)pobjectname;
    (void)pmgmtprops;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_messagequeuing_MQMoveMessage_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hsourcequeue = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t hdestinationqueue = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
    uint64_t ulllookupid = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
    void* ptransaction = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t, uint64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mqrt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MQMoveMessage")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hsourcequeue, hdestinationqueue, ulllookupid, ptransaction) : -1;
#else
    (void)hsourcequeue;
    (void)hdestinationqueue;
    (void)ulllookupid;
    (void)ptransaction;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_messagequeuing_MQOpenQueue_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpwcsformatname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwaccess = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t dwsharemode = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* phqueue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mqrt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MQOpenQueue")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpwcsformatname, dwaccess, dwsharemode, phqueue) : -1;
#else
    (void)lpwcsformatname;
    (void)dwaccess;
    (void)dwsharemode;
    (void)phqueue;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_messagequeuing_MQPathNameToFormatName_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpwcspathname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpwcsformatname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* lpdwformatnamelength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mqrt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MQPathNameToFormatName")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpwcspathname, lpwcsformatname, lpdwformatnamelength) : -1;
#else
    (void)lpwcspathname;
    (void)lpwcsformatname;
    (void)lpdwformatnamelength;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_messagequeuing_MQPurgeQueue_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hqueue = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mqrt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MQPurgeQueue")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hqueue) : -1;
#else
    (void)hqueue;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_messagequeuing_MQReceiveMessage_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hsource = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint32_t dwtimeout = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t dwaction = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pmessageprops = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* lpoverlapped = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* fnreceivecallback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* hcursor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* ptransaction = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mqrt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MQReceiveMessage")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hsource, dwtimeout, dwaction, pmessageprops, lpoverlapped, fnreceivecallback, hcursor, ptransaction) : -1;
#else
    (void)hsource;
    (void)dwtimeout;
    (void)dwaction;
    (void)pmessageprops;
    (void)lpoverlapped;
    (void)fnreceivecallback;
    (void)hcursor;
    (void)ptransaction;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_messagequeuing_MQReceiveMessageByLookupId_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hsource = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint64_t ulllookupid = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    uint32_t dwlookupaction = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pmessageprops = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* lpoverlapped = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* fnreceivecallback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* ptransaction = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint64_t, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mqrt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MQReceiveMessageByLookupId")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hsource, ulllookupid, dwlookupaction, pmessageprops, lpoverlapped, fnreceivecallback, ptransaction) : -1;
#else
    (void)hsource;
    (void)ulllookupid;
    (void)dwlookupaction;
    (void)pmessageprops;
    (void)lpoverlapped;
    (void)fnreceivecallback;
    (void)ptransaction;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_messagequeuing_MQRegisterCertificate_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* lpcertbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwcertbufferlength = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mqrt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MQRegisterCertificate")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwflags, lpcertbuffer, dwcertbufferlength) : -1;
#else
    (void)dwflags;
    (void)lpcertbuffer;
    (void)dwcertbufferlength;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_messagequeuing_MQSendMessage_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hdestinationqueue = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* pmessageprops = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* ptransaction = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mqrt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MQSendMessage")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hdestinationqueue, pmessageprops, ptransaction) : -1;
#else
    (void)hdestinationqueue;
    (void)pmessageprops;
    (void)ptransaction;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_messagequeuing_MQSetQueueProperties_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpwcsformatname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pqueueprops = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mqrt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MQSetQueueProperties")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpwcsformatname, pqueueprops) : -1;
#else
    (void)lpwcsformatname;
    (void)pqueueprops;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_messagequeuing_MQSetQueueSecurity_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpwcsformatname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t securityinformation = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* psecuritydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mqrt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MQSetQueueSecurity")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpwcsformatname, securityinformation, psecuritydescriptor) : -1;
#else
    (void)lpwcsformatname;
    (void)securityinformation;
    (void)psecuritydescriptor;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static void register_windows_win32_system_messagequeuing_napi(Napi::Env env, Napi::Object exports) {
    exports.Set("windowssys_windows_win32_system_messagequeuing_MQADsPathToFormatName", Napi::Function::New(env, windowssys_windows_win32_system_messagequeuing_MQADsPathToFormatName_napi));
    exports.Set("windowssys_windows_win32_system_messagequeuing_MQBeginTransaction", Napi::Function::New(env, windowssys_windows_win32_system_messagequeuing_MQBeginTransaction_napi));
    exports.Set("windowssys_windows_win32_system_messagequeuing_MQCloseCursor", Napi::Function::New(env, windowssys_windows_win32_system_messagequeuing_MQCloseCursor_napi));
    exports.Set("windowssys_windows_win32_system_messagequeuing_MQCloseQueue", Napi::Function::New(env, windowssys_windows_win32_system_messagequeuing_MQCloseQueue_napi));
    exports.Set("windowssys_windows_win32_system_messagequeuing_MQCreateCursor", Napi::Function::New(env, windowssys_windows_win32_system_messagequeuing_MQCreateCursor_napi));
    exports.Set("windowssys_windows_win32_system_messagequeuing_MQCreateQueue", Napi::Function::New(env, windowssys_windows_win32_system_messagequeuing_MQCreateQueue_napi));
    exports.Set("windowssys_windows_win32_system_messagequeuing_MQDeleteQueue", Napi::Function::New(env, windowssys_windows_win32_system_messagequeuing_MQDeleteQueue_napi));
    exports.Set("windowssys_windows_win32_system_messagequeuing_MQFreeMemory", Napi::Function::New(env, windowssys_windows_win32_system_messagequeuing_MQFreeMemory_napi));
    exports.Set("windowssys_windows_win32_system_messagequeuing_MQFreeSecurityContext", Napi::Function::New(env, windowssys_windows_win32_system_messagequeuing_MQFreeSecurityContext_napi));
    exports.Set("windowssys_windows_win32_system_messagequeuing_MQGetMachineProperties", Napi::Function::New(env, windowssys_windows_win32_system_messagequeuing_MQGetMachineProperties_napi));
    exports.Set("windowssys_windows_win32_system_messagequeuing_MQGetOverlappedResult", Napi::Function::New(env, windowssys_windows_win32_system_messagequeuing_MQGetOverlappedResult_napi));
    exports.Set("windowssys_windows_win32_system_messagequeuing_MQGetPrivateComputerInformation", Napi::Function::New(env, windowssys_windows_win32_system_messagequeuing_MQGetPrivateComputerInformation_napi));
    exports.Set("windowssys_windows_win32_system_messagequeuing_MQGetQueueProperties", Napi::Function::New(env, windowssys_windows_win32_system_messagequeuing_MQGetQueueProperties_napi));
    exports.Set("windowssys_windows_win32_system_messagequeuing_MQGetQueueSecurity", Napi::Function::New(env, windowssys_windows_win32_system_messagequeuing_MQGetQueueSecurity_napi));
    exports.Set("windowssys_windows_win32_system_messagequeuing_MQGetSecurityContext", Napi::Function::New(env, windowssys_windows_win32_system_messagequeuing_MQGetSecurityContext_napi));
    exports.Set("windowssys_windows_win32_system_messagequeuing_MQGetSecurityContextEx", Napi::Function::New(env, windowssys_windows_win32_system_messagequeuing_MQGetSecurityContextEx_napi));
    exports.Set("windowssys_windows_win32_system_messagequeuing_MQHandleToFormatName", Napi::Function::New(env, windowssys_windows_win32_system_messagequeuing_MQHandleToFormatName_napi));
    exports.Set("windowssys_windows_win32_system_messagequeuing_MQInstanceToFormatName", Napi::Function::New(env, windowssys_windows_win32_system_messagequeuing_MQInstanceToFormatName_napi));
    exports.Set("windowssys_windows_win32_system_messagequeuing_MQLocateBegin", Napi::Function::New(env, windowssys_windows_win32_system_messagequeuing_MQLocateBegin_napi));
    exports.Set("windowssys_windows_win32_system_messagequeuing_MQLocateEnd", Napi::Function::New(env, windowssys_windows_win32_system_messagequeuing_MQLocateEnd_napi));
    exports.Set("windowssys_windows_win32_system_messagequeuing_MQLocateNext", Napi::Function::New(env, windowssys_windows_win32_system_messagequeuing_MQLocateNext_napi));
    exports.Set("windowssys_windows_win32_system_messagequeuing_MQMarkMessageRejected", Napi::Function::New(env, windowssys_windows_win32_system_messagequeuing_MQMarkMessageRejected_napi));
    exports.Set("windowssys_windows_win32_system_messagequeuing_MQMgmtAction", Napi::Function::New(env, windowssys_windows_win32_system_messagequeuing_MQMgmtAction_napi));
    exports.Set("windowssys_windows_win32_system_messagequeuing_MQMgmtGetInfo", Napi::Function::New(env, windowssys_windows_win32_system_messagequeuing_MQMgmtGetInfo_napi));
    exports.Set("windowssys_windows_win32_system_messagequeuing_MQMoveMessage", Napi::Function::New(env, windowssys_windows_win32_system_messagequeuing_MQMoveMessage_napi));
    exports.Set("windowssys_windows_win32_system_messagequeuing_MQOpenQueue", Napi::Function::New(env, windowssys_windows_win32_system_messagequeuing_MQOpenQueue_napi));
    exports.Set("windowssys_windows_win32_system_messagequeuing_MQPathNameToFormatName", Napi::Function::New(env, windowssys_windows_win32_system_messagequeuing_MQPathNameToFormatName_napi));
    exports.Set("windowssys_windows_win32_system_messagequeuing_MQPurgeQueue", Napi::Function::New(env, windowssys_windows_win32_system_messagequeuing_MQPurgeQueue_napi));
    exports.Set("windowssys_windows_win32_system_messagequeuing_MQReceiveMessage", Napi::Function::New(env, windowssys_windows_win32_system_messagequeuing_MQReceiveMessage_napi));
    exports.Set("windowssys_windows_win32_system_messagequeuing_MQReceiveMessageByLookupId", Napi::Function::New(env, windowssys_windows_win32_system_messagequeuing_MQReceiveMessageByLookupId_napi));
    exports.Set("windowssys_windows_win32_system_messagequeuing_MQRegisterCertificate", Napi::Function::New(env, windowssys_windows_win32_system_messagequeuing_MQRegisterCertificate_napi));
    exports.Set("windowssys_windows_win32_system_messagequeuing_MQSendMessage", Napi::Function::New(env, windowssys_windows_win32_system_messagequeuing_MQSendMessage_napi));
    exports.Set("windowssys_windows_win32_system_messagequeuing_MQSetQueueProperties", Napi::Function::New(env, windowssys_windows_win32_system_messagequeuing_MQSetQueueProperties_napi));
    exports.Set("windowssys_windows_win32_system_messagequeuing_MQSetQueueSecurity", Napi::Function::New(env, windowssys_windows_win32_system_messagequeuing_MQSetQueueSecurity_napi));
}

static KmNapiRegistrarNode registrar_node = { &register_windows_win32_system_messagequeuing_napi, nullptr };
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
