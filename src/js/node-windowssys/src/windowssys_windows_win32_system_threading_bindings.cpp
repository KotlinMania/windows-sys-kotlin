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

static Napi::Value windowssys_windows_win32_system_threading_AcquireSRWLockExclusive_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* srwlock = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "AcquireSRWLockExclusive")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(srwlock);
#else
    (void)srwlock;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_threading_AcquireSRWLockShared_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* srwlock = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "AcquireSRWLockShared")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(srwlock);
#else
    (void)srwlock;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_threading_AddIntegrityLabelToBoundaryDescriptor_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* boundarydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* integritylabel = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "AddIntegrityLabelToBoundaryDescriptor")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(boundarydescriptor, integritylabel) : -1;
#else
    (void)boundarydescriptor;
    (void)integritylabel;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_AddSIDToBoundaryDescriptor_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* boundarydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* requiredsid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "AddSIDToBoundaryDescriptor")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(boundarydescriptor, requiredsid) : -1;
#else
    (void)boundarydescriptor;
    (void)requiredsid;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_AttachThreadInput_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t idattach = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t idattachto = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t fattach = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "AttachThreadInput")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(idattach, idattachto, fattach) : -1;
#else
    (void)idattach;
    (void)idattachto;
    (void)fattach;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_AvQuerySystemResponsiveness_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* avrthandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* systemresponsivenessvalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("avrt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "AvQuerySystemResponsiveness")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(avrthandle, systemresponsivenessvalue) : -1;
#else
    (void)avrthandle;
    (void)systemresponsivenessvalue;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_AvRevertMmThreadCharacteristics_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* avrthandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("avrt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "AvRevertMmThreadCharacteristics")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(avrthandle) : -1;
#else
    (void)avrthandle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_AvRtCreateThreadOrderingGroup_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* context = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* period = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* threadorderingguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* timeout = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("avrt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "AvRtCreateThreadOrderingGroup")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(context, period, threadorderingguid, timeout) : -1;
#else
    (void)context;
    (void)period;
    (void)threadorderingguid;
    (void)timeout;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_AvRtCreateThreadOrderingGroupExA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* context = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* period = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* threadorderingguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* timeout = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* taskname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("avrt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "AvRtCreateThreadOrderingGroupExA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(context, period, threadorderingguid, timeout, taskname) : -1;
#else
    (void)context;
    (void)period;
    (void)threadorderingguid;
    (void)timeout;
    (void)taskname;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_AvRtCreateThreadOrderingGroupExW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* context = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* period = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* threadorderingguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* timeout = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* taskname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("avrt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "AvRtCreateThreadOrderingGroupExW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(context, period, threadorderingguid, timeout, taskname) : -1;
#else
    (void)context;
    (void)period;
    (void)threadorderingguid;
    (void)timeout;
    (void)taskname;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_AvRtDeleteThreadOrderingGroup_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* context = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("avrt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "AvRtDeleteThreadOrderingGroup")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(context) : -1;
#else
    (void)context;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_AvRtJoinThreadOrderingGroup_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* context = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* threadorderingguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t before = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("avrt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "AvRtJoinThreadOrderingGroup")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(context, threadorderingguid, before) : -1;
#else
    (void)context;
    (void)threadorderingguid;
    (void)before;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_AvRtLeaveThreadOrderingGroup_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* context = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("avrt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "AvRtLeaveThreadOrderingGroup")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(context) : -1;
#else
    (void)context;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_AvRtWaitOnThreadOrderingGroup_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* context = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("avrt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "AvRtWaitOnThreadOrderingGroup")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(context) : -1;
#else
    (void)context;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_AvSetMmMaxThreadCharacteristicsA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* firsttask = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* secondtask = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* taskindex = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("avrt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "AvSetMmMaxThreadCharacteristicsA")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(firsttask, secondtask, taskindex) : NULL;
#else
    (void)firsttask;
    (void)secondtask;
    (void)taskindex;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_threading_AvSetMmMaxThreadCharacteristicsW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* firsttask = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* secondtask = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* taskindex = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("avrt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "AvSetMmMaxThreadCharacteristicsW")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(firsttask, secondtask, taskindex) : NULL;
#else
    (void)firsttask;
    (void)secondtask;
    (void)taskindex;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_threading_AvSetMmThreadCharacteristicsA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* taskname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* taskindex = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("avrt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "AvSetMmThreadCharacteristicsA")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(taskname, taskindex) : NULL;
#else
    (void)taskname;
    (void)taskindex;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_threading_AvSetMmThreadCharacteristicsW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* taskname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* taskindex = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("avrt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "AvSetMmThreadCharacteristicsW")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(taskname, taskindex) : NULL;
#else
    (void)taskname;
    (void)taskindex;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_threading_AvSetMmThreadPriority_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* avrthandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t priority = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("avrt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "AvSetMmThreadPriority")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(avrthandle, priority) : -1;
#else
    (void)avrthandle;
    (void)priority;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_CallbackMayRunLong_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t pci = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CallbackMayRunLong")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pci) : -1;
#else
    (void)pci;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_CancelThreadpoolIo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t pio = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CancelThreadpoolIo")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(pio);
#else
    (void)pio;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_threading_CancelTimerQueueTimer_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* timerqueue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* timer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CancelTimerQueueTimer")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(timerqueue, timer) : -1;
#else
    (void)timerqueue;
    (void)timer;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_CancelWaitableTimer_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* htimer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CancelWaitableTimer")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(htimer) : -1;
#else
    (void)htimer;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_ChangeTimerQueueTimer_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* timerqueue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* timer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t duetime = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t period = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ChangeTimerQueueTimer")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(timerqueue, timer, duetime, period) : -1;
#else
    (void)timerqueue;
    (void)timer;
    (void)duetime;
    (void)period;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_ClosePrivateNamespace_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* handle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ClosePrivateNamespace")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(handle, flags) : false;
#else
    (void)handle;
    (void)flags;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_win32_system_threading_CloseThreadpool_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t ptpp = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CloseThreadpool")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(ptpp);
#else
    (void)ptpp;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_threading_CloseThreadpoolCleanupGroup_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t ptpcg = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CloseThreadpoolCleanupGroup")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(ptpcg);
#else
    (void)ptpcg;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_threading_CloseThreadpoolCleanupGroupMembers_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t ptpcg = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int32_t fcancelpendingcallbacks = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pvcleanupcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CloseThreadpoolCleanupGroupMembers")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(ptpcg, fcancelpendingcallbacks, pvcleanupcontext);
#else
    (void)ptpcg;
    (void)fcancelpendingcallbacks;
    (void)pvcleanupcontext;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_threading_CloseThreadpoolIo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t pio = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CloseThreadpoolIo")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(pio);
#else
    (void)pio;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_threading_CloseThreadpoolTimer_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t pti = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CloseThreadpoolTimer")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(pti);
#else
    (void)pti;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_threading_CloseThreadpoolWait_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t pwa = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CloseThreadpoolWait")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(pwa);
#else
    (void)pwa;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_threading_CloseThreadpoolWork_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t pwk = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CloseThreadpoolWork")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(pwk);
#else
    (void)pwk;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_threading_ConvertFiberToThread_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ConvertFiberToThread")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_ConvertThreadToFiber_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpparameter = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ConvertThreadToFiber")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpparameter) : NULL;
#else
    (void)lpparameter;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_threading_ConvertThreadToFiberEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpparameter = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ConvertThreadToFiberEx")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpparameter, dwflags) : NULL;
#else
    (void)lpparameter;
    (void)dwflags;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_threading_CreateBoundaryDescriptorA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* name = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CreateBoundaryDescriptorA")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(name, flags) : NULL;
#else
    (void)name;
    (void)flags;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_threading_CreateBoundaryDescriptorW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* name = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CreateBoundaryDescriptorW")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(name, flags) : NULL;
#else
    (void)name;
    (void)flags;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_threading_CreateEventA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpeventattributes = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t bmanualreset = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t binitialstate = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* lpname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CreateEventA")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpeventattributes, bmanualreset, binitialstate, lpname) : NULL;
#else
    (void)lpeventattributes;
    (void)bmanualreset;
    (void)binitialstate;
    (void)lpname;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_threading_CreateEventExA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpeventattributes = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t dwdesiredaccess = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CreateEventExA")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpeventattributes, lpname, dwflags, dwdesiredaccess) : NULL;
#else
    (void)lpeventattributes;
    (void)lpname;
    (void)dwflags;
    (void)dwdesiredaccess;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_threading_CreateEventExW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpeventattributes = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t dwdesiredaccess = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CreateEventExW")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpeventattributes, lpname, dwflags, dwdesiredaccess) : NULL;
#else
    (void)lpeventattributes;
    (void)lpname;
    (void)dwflags;
    (void)dwdesiredaccess;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_threading_CreateEventW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpeventattributes = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t bmanualreset = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t binitialstate = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* lpname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CreateEventW")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpeventattributes, bmanualreset, binitialstate, lpname) : NULL;
#else
    (void)lpeventattributes;
    (void)bmanualreset;
    (void)binitialstate;
    (void)lpname;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_threading_CreateFiber_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t dwstacksize = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* lpstartaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* lpparameter = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CreateFiber")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwstacksize, lpstartaddress, lpparameter) : NULL;
#else
    (void)dwstacksize;
    (void)lpstartaddress;
    (void)lpparameter;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_threading_CreateFiberEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t dwstackcommitsize = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint64_t dwstackreservesize = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* lpstartaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* lpparameter = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint64_t, uint64_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CreateFiberEx")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwstackcommitsize, dwstackreservesize, dwflags, lpstartaddress, lpparameter) : NULL;
#else
    (void)dwstackcommitsize;
    (void)dwstackreservesize;
    (void)dwflags;
    (void)lpstartaddress;
    (void)lpparameter;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_threading_CreateMutexA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpmutexattributes = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t binitialowner = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* lpname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CreateMutexA")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpmutexattributes, binitialowner, lpname) : NULL;
#else
    (void)lpmutexattributes;
    (void)binitialowner;
    (void)lpname;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_threading_CreateMutexExA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpmutexattributes = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t dwdesiredaccess = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CreateMutexExA")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpmutexattributes, lpname, dwflags, dwdesiredaccess) : NULL;
#else
    (void)lpmutexattributes;
    (void)lpname;
    (void)dwflags;
    (void)dwdesiredaccess;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_threading_CreateMutexExW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpmutexattributes = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t dwdesiredaccess = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CreateMutexExW")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpmutexattributes, lpname, dwflags, dwdesiredaccess) : NULL;
#else
    (void)lpmutexattributes;
    (void)lpname;
    (void)dwflags;
    (void)dwdesiredaccess;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_threading_CreateMutexW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpmutexattributes = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t binitialowner = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* lpname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CreateMutexW")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpmutexattributes, binitialowner, lpname) : NULL;
#else
    (void)lpmutexattributes;
    (void)binitialowner;
    (void)lpname;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_threading_CreatePrivateNamespaceA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpprivatenamespaceattributes = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpboundarydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* lpaliasprefix = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CreatePrivateNamespaceA")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpprivatenamespaceattributes, lpboundarydescriptor, lpaliasprefix) : NULL;
#else
    (void)lpprivatenamespaceattributes;
    (void)lpboundarydescriptor;
    (void)lpaliasprefix;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_threading_CreatePrivateNamespaceW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpprivatenamespaceattributes = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpboundarydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* lpaliasprefix = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CreatePrivateNamespaceW")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpprivatenamespaceattributes, lpboundarydescriptor, lpaliasprefix) : NULL;
#else
    (void)lpprivatenamespaceattributes;
    (void)lpboundarydescriptor;
    (void)lpaliasprefix;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_threading_CreateProcessA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpapplicationname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpcommandline = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* lpprocessattributes = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* lpthreadattributes = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    int32_t binherithandles = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    uint32_t dwcreationflags = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* lpenvironment = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* lpcurrentdirectory = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    void* lpstartupinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
    void* lpprocessinformation = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 9 ? km_napi_arg_u64(km_info[9]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, int32_t, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CreateProcessA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpapplicationname, lpcommandline, lpprocessattributes, lpthreadattributes, binherithandles, dwcreationflags, lpenvironment, lpcurrentdirectory, lpstartupinfo, lpprocessinformation) : -1;
#else
    (void)lpapplicationname;
    (void)lpcommandline;
    (void)lpprocessattributes;
    (void)lpthreadattributes;
    (void)binherithandles;
    (void)dwcreationflags;
    (void)lpenvironment;
    (void)lpcurrentdirectory;
    (void)lpstartupinfo;
    (void)lpprocessinformation;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_CreateProcessAsUserA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* htoken = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpapplicationname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* lpcommandline = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* lpprocessattributes = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* lpthreadattributes = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    int32_t binherithandles = static_cast<int32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    uint32_t dwcreationflags = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    void* lpenvironment = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    void* lpcurrentdirectory = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
    void* lpstartupinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 9 ? km_napi_arg_u64(km_info[9]) : 0));
    void* lpprocessinformation = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 10 ? km_napi_arg_u64(km_info[10]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, int32_t, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CreateProcessAsUserA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(htoken, lpapplicationname, lpcommandline, lpprocessattributes, lpthreadattributes, binherithandles, dwcreationflags, lpenvironment, lpcurrentdirectory, lpstartupinfo, lpprocessinformation) : -1;
#else
    (void)htoken;
    (void)lpapplicationname;
    (void)lpcommandline;
    (void)lpprocessattributes;
    (void)lpthreadattributes;
    (void)binherithandles;
    (void)dwcreationflags;
    (void)lpenvironment;
    (void)lpcurrentdirectory;
    (void)lpstartupinfo;
    (void)lpprocessinformation;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_CreateProcessAsUserW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* htoken = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpapplicationname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* lpcommandline = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* lpprocessattributes = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* lpthreadattributes = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    int32_t binherithandles = static_cast<int32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    uint32_t dwcreationflags = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    void* lpenvironment = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    void* lpcurrentdirectory = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
    void* lpstartupinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 9 ? km_napi_arg_u64(km_info[9]) : 0));
    void* lpprocessinformation = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 10 ? km_napi_arg_u64(km_info[10]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, int32_t, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CreateProcessAsUserW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(htoken, lpapplicationname, lpcommandline, lpprocessattributes, lpthreadattributes, binherithandles, dwcreationflags, lpenvironment, lpcurrentdirectory, lpstartupinfo, lpprocessinformation) : -1;
#else
    (void)htoken;
    (void)lpapplicationname;
    (void)lpcommandline;
    (void)lpprocessattributes;
    (void)lpthreadattributes;
    (void)binherithandles;
    (void)dwcreationflags;
    (void)lpenvironment;
    (void)lpcurrentdirectory;
    (void)lpstartupinfo;
    (void)lpprocessinformation;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_CreateProcessW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpapplicationname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpcommandline = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* lpprocessattributes = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* lpthreadattributes = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    int32_t binherithandles = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    uint32_t dwcreationflags = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* lpenvironment = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* lpcurrentdirectory = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    void* lpstartupinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
    void* lpprocessinformation = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 9 ? km_napi_arg_u64(km_info[9]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, int32_t, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CreateProcessW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpapplicationname, lpcommandline, lpprocessattributes, lpthreadattributes, binherithandles, dwcreationflags, lpenvironment, lpcurrentdirectory, lpstartupinfo, lpprocessinformation) : -1;
#else
    (void)lpapplicationname;
    (void)lpcommandline;
    (void)lpprocessattributes;
    (void)lpthreadattributes;
    (void)binherithandles;
    (void)dwcreationflags;
    (void)lpenvironment;
    (void)lpcurrentdirectory;
    (void)lpstartupinfo;
    (void)lpprocessinformation;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_CreateProcessWithLogonW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpusername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpdomain = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* lppassword = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t dwlogonflags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* lpapplicationname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* lpcommandline = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    uint32_t dwcreationflags = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    void* lpenvironment = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    void* lpcurrentdirectory = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
    void* lpstartupinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 9 ? km_napi_arg_u64(km_info[9]) : 0));
    void* lpprocessinformation = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 10 ? km_napi_arg_u64(km_info[10]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CreateProcessWithLogonW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpusername, lpdomain, lppassword, dwlogonflags, lpapplicationname, lpcommandline, dwcreationflags, lpenvironment, lpcurrentdirectory, lpstartupinfo, lpprocessinformation) : -1;
#else
    (void)lpusername;
    (void)lpdomain;
    (void)lppassword;
    (void)dwlogonflags;
    (void)lpapplicationname;
    (void)lpcommandline;
    (void)dwcreationflags;
    (void)lpenvironment;
    (void)lpcurrentdirectory;
    (void)lpstartupinfo;
    (void)lpprocessinformation;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_CreateProcessWithTokenW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* htoken = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwlogonflags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* lpapplicationname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* lpcommandline = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t dwcreationflags = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* lpenvironment = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* lpcurrentdirectory = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* lpstartupinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    void* lpprocessinformation = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CreateProcessWithTokenW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(htoken, dwlogonflags, lpapplicationname, lpcommandline, dwcreationflags, lpenvironment, lpcurrentdirectory, lpstartupinfo, lpprocessinformation) : -1;
#else
    (void)htoken;
    (void)dwlogonflags;
    (void)lpapplicationname;
    (void)lpcommandline;
    (void)dwcreationflags;
    (void)lpenvironment;
    (void)lpcurrentdirectory;
    (void)lpstartupinfo;
    (void)lpprocessinformation;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_CreateRemoteThread_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpthreadattributes = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint64_t dwstacksize = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
    void* lpstartaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* lpparameter = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t dwcreationflags = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* lpthreadid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint64_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CreateRemoteThread")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, lpthreadattributes, dwstacksize, lpstartaddress, lpparameter, dwcreationflags, lpthreadid) : NULL;
#else
    (void)hprocess;
    (void)lpthreadattributes;
    (void)dwstacksize;
    (void)lpstartaddress;
    (void)lpparameter;
    (void)dwcreationflags;
    (void)lpthreadid;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_threading_CreateRemoteThreadEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpthreadattributes = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint64_t dwstacksize = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
    void* lpstartaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* lpparameter = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t dwcreationflags = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* lpattributelist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* lpthreadid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint64_t, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CreateRemoteThreadEx")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, lpthreadattributes, dwstacksize, lpstartaddress, lpparameter, dwcreationflags, lpattributelist, lpthreadid) : NULL;
#else
    (void)hprocess;
    (void)lpthreadattributes;
    (void)dwstacksize;
    (void)lpstartaddress;
    (void)lpparameter;
    (void)dwcreationflags;
    (void)lpattributelist;
    (void)lpthreadid;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_threading_CreateSemaphoreA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpsemaphoreattributes = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t linitialcount = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t lmaximumcount = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* lpname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CreateSemaphoreA")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpsemaphoreattributes, linitialcount, lmaximumcount, lpname) : NULL;
#else
    (void)lpsemaphoreattributes;
    (void)linitialcount;
    (void)lmaximumcount;
    (void)lpname;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_threading_CreateSemaphoreExA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpsemaphoreattributes = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t linitialcount = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t lmaximumcount = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* lpname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    uint32_t dwdesiredaccess = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CreateSemaphoreExA")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpsemaphoreattributes, linitialcount, lmaximumcount, lpname, dwflags, dwdesiredaccess) : NULL;
#else
    (void)lpsemaphoreattributes;
    (void)linitialcount;
    (void)lmaximumcount;
    (void)lpname;
    (void)dwflags;
    (void)dwdesiredaccess;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_threading_CreateSemaphoreExW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpsemaphoreattributes = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t linitialcount = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t lmaximumcount = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* lpname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    uint32_t dwdesiredaccess = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CreateSemaphoreExW")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpsemaphoreattributes, linitialcount, lmaximumcount, lpname, dwflags, dwdesiredaccess) : NULL;
#else
    (void)lpsemaphoreattributes;
    (void)linitialcount;
    (void)lmaximumcount;
    (void)lpname;
    (void)dwflags;
    (void)dwdesiredaccess;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_threading_CreateSemaphoreW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpsemaphoreattributes = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t linitialcount = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t lmaximumcount = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* lpname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CreateSemaphoreW")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpsemaphoreattributes, linitialcount, lmaximumcount, lpname) : NULL;
#else
    (void)lpsemaphoreattributes;
    (void)linitialcount;
    (void)lmaximumcount;
    (void)lpname;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_threading_CreateThread_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpthreadattributes = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t dwstacksize = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* lpstartaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* lpparameter = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t dwcreationflags = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* lpthreadid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint64_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CreateThread")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpthreadattributes, dwstacksize, lpstartaddress, lpparameter, dwcreationflags, lpthreadid) : NULL;
#else
    (void)lpthreadattributes;
    (void)dwstacksize;
    (void)lpstartaddress;
    (void)lpparameter;
    (void)dwcreationflags;
    (void)lpthreadid;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_threading_CreateThreadpool_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* reserved = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CreateThreadpool")));
    }
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(reserved) : -1;
#else
    (void)reserved;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_system_threading_CreateThreadpoolCleanupGroup_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CreateThreadpoolCleanupGroup")));
    }
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr() : -1;
#else
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_system_threading_CreateThreadpoolIo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* fl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pfnio = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pv = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pcbe = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CreateThreadpoolIo")));
    }
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(fl, pfnio, pv, pcbe) : -1;
#else
    (void)fl;
    (void)pfnio;
    (void)pv;
    (void)pcbe;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_system_threading_CreateThreadpoolTimer_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pfnti = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pv = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pcbe = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CreateThreadpoolTimer")));
    }
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pfnti, pv, pcbe) : -1;
#else
    (void)pfnti;
    (void)pv;
    (void)pcbe;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_system_threading_CreateThreadpoolWait_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pfnwa = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pv = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pcbe = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CreateThreadpoolWait")));
    }
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pfnwa, pv, pcbe) : -1;
#else
    (void)pfnwa;
    (void)pv;
    (void)pcbe;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_system_threading_CreateThreadpoolWork_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pfnwk = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pv = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pcbe = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CreateThreadpoolWork")));
    }
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pfnwk, pv, pcbe) : -1;
#else
    (void)pfnwk;
    (void)pv;
    (void)pcbe;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_system_threading_CreateTimerQueue_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CreateTimerQueue")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr() : NULL;
#else
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_threading_CreateTimerQueueTimer_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* phnewtimer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* timerqueue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* callback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* parameter = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t duetime = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    uint32_t period = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CreateTimerQueueTimer")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(phnewtimer, timerqueue, callback, parameter, duetime, period, flags) : -1;
#else
    (void)phnewtimer;
    (void)timerqueue;
    (void)callback;
    (void)parameter;
    (void)duetime;
    (void)period;
    (void)flags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_CreateUmsCompletionList_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* umscompletionlist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CreateUmsCompletionList")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(umscompletionlist) : -1;
#else
    (void)umscompletionlist;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_CreateUmsThreadContext_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpumsthread = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CreateUmsThreadContext")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpumsthread) : -1;
#else
    (void)lpumsthread;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_CreateWaitableTimerA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lptimerattributes = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t bmanualreset = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* lptimername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CreateWaitableTimerA")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lptimerattributes, bmanualreset, lptimername) : NULL;
#else
    (void)lptimerattributes;
    (void)bmanualreset;
    (void)lptimername;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_threading_CreateWaitableTimerExA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lptimerattributes = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lptimername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t dwdesiredaccess = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CreateWaitableTimerExA")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lptimerattributes, lptimername, dwflags, dwdesiredaccess) : NULL;
#else
    (void)lptimerattributes;
    (void)lptimername;
    (void)dwflags;
    (void)dwdesiredaccess;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_threading_CreateWaitableTimerExW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lptimerattributes = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lptimername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t dwdesiredaccess = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CreateWaitableTimerExW")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lptimerattributes, lptimername, dwflags, dwdesiredaccess) : NULL;
#else
    (void)lptimerattributes;
    (void)lptimername;
    (void)dwflags;
    (void)dwdesiredaccess;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_threading_CreateWaitableTimerW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lptimerattributes = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t bmanualreset = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* lptimername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CreateWaitableTimerW")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lptimerattributes, bmanualreset, lptimername) : NULL;
#else
    (void)lptimerattributes;
    (void)bmanualreset;
    (void)lptimername;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_threading_DeleteBoundaryDescriptor_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* boundarydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DeleteBoundaryDescriptor")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(boundarydescriptor);
#else
    (void)boundarydescriptor;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_threading_DeleteCriticalSection_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpcriticalsection = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DeleteCriticalSection")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(lpcriticalsection);
#else
    (void)lpcriticalsection;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_threading_DeleteFiber_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpfiber = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DeleteFiber")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(lpfiber);
#else
    (void)lpfiber;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_threading_DeleteProcThreadAttributeList_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpattributelist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DeleteProcThreadAttributeList")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(lpattributelist);
#else
    (void)lpattributelist;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_threading_DeleteSynchronizationBarrier_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpbarrier = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DeleteSynchronizationBarrier")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpbarrier) : -1;
#else
    (void)lpbarrier;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_DeleteTimerQueue_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* timerqueue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DeleteTimerQueue")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(timerqueue) : -1;
#else
    (void)timerqueue;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_DeleteTimerQueueEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* timerqueue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* completionevent = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DeleteTimerQueueEx")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(timerqueue, completionevent) : -1;
#else
    (void)timerqueue;
    (void)completionevent;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_DeleteTimerQueueTimer_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* timerqueue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* timer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* completionevent = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DeleteTimerQueueTimer")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(timerqueue, timer, completionevent) : -1;
#else
    (void)timerqueue;
    (void)timer;
    (void)completionevent;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_DeleteUmsCompletionList_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* umscompletionlist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DeleteUmsCompletionList")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(umscompletionlist) : -1;
#else
    (void)umscompletionlist;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_DeleteUmsThreadContext_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* umsthread = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DeleteUmsThreadContext")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(umsthread) : -1;
#else
    (void)umsthread;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_DequeueUmsCompletionListItems_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* umscompletionlist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t waittimeout = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* umsthreadlist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DequeueUmsCompletionListItems")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(umscompletionlist, waittimeout, umsthreadlist) : -1;
#else
    (void)umscompletionlist;
    (void)waittimeout;
    (void)umsthreadlist;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_DisassociateCurrentThreadFromCallback_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t pci = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DisassociateCurrentThreadFromCallback")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(pci);
#else
    (void)pci;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_threading_EnterCriticalSection_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpcriticalsection = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "EnterCriticalSection")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(lpcriticalsection);
#else
    (void)lpcriticalsection;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_threading_EnterSynchronizationBarrier_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpbarrier = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "EnterSynchronizationBarrier")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpbarrier, dwflags) : -1;
#else
    (void)lpbarrier;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_EnterUmsSchedulingMode_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* schedulerstartupinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "EnterUmsSchedulingMode")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(schedulerstartupinfo) : -1;
#else
    (void)schedulerstartupinfo;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_ExecuteUmsThread_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* umsthread = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ExecuteUmsThread")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(umsthread) : -1;
#else
    (void)umsthread;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_ExitProcess_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t uexitcode = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ExitProcess")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(uexitcode);
#else
    (void)uexitcode;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_threading_ExitThread_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwexitcode = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ExitThread")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(dwexitcode);
#else
    (void)dwexitcode;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_threading_FlsAlloc_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpcallback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FlsAlloc")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpcallback) : 0;
#else
    (void)lpcallback;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_FlsFree_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwflsindex = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FlsFree")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwflsindex) : -1;
#else
    (void)dwflsindex;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_FlsGetValue_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwflsindex = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FlsGetValue")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwflsindex) : NULL;
#else
    (void)dwflsindex;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_threading_FlsSetValue_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwflsindex = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* lpflsdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FlsSetValue")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwflsindex, lpflsdata) : -1;
#else
    (void)dwflsindex;
    (void)lpflsdata;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_FlushProcessWriteBuffers_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FlushProcessWriteBuffers")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr();
#else
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_threading_FreeLibraryWhenCallbackReturns_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t pci = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* mod = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FreeLibraryWhenCallbackReturns")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(pci, mod);
#else
    (void)pci;
    (void)mod;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_threading_GetActiveProcessorCount_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint16_t groupnumber = static_cast<uint16_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint16_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetActiveProcessorCount")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(groupnumber) : 0;
#else
    (void)groupnumber;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_GetActiveProcessorGroupCount_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef uint16_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetActiveProcessorGroupCount")));
    }
    uint16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr() : 0;
#else
    uint16_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_GetCurrentProcess_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetCurrentProcess")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr() : NULL;
#else
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_threading_GetCurrentProcessId_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetCurrentProcessId")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr() : 0;
#else
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_GetCurrentProcessorNumber_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetCurrentProcessorNumber")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr() : 0;
#else
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_GetCurrentProcessorNumberEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* procnumber = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetCurrentProcessorNumberEx")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(procnumber);
#else
    (void)procnumber;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_threading_GetCurrentThread_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetCurrentThread")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr() : NULL;
#else
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_threading_GetCurrentThreadId_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetCurrentThreadId")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr() : 0;
#else
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_GetCurrentThreadStackLimits_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lowlimit = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* highlimit = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetCurrentThreadStackLimits")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(lowlimit, highlimit);
#else
    (void)lowlimit;
    (void)highlimit;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_threading_GetCurrentUmsThread_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetCurrentUmsThread")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr() : NULL;
#else
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_threading_GetExitCodeProcess_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpexitcode = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetExitCodeProcess")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, lpexitcode) : -1;
#else
    (void)hprocess;
    (void)lpexitcode;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_GetExitCodeThread_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hthread = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpexitcode = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetExitCodeThread")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hthread, lpexitcode) : -1;
#else
    (void)hthread;
    (void)lpexitcode;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_GetGuiResources_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t uiflags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetGuiResources")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, uiflags) : 0;
#else
    (void)hprocess;
    (void)uiflags;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_GetMachineTypeAttributes_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint16_t machine = static_cast<uint16_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* machinetypeattributes = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint16_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetMachineTypeAttributes")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(machine, machinetypeattributes) : -1;
#else
    (void)machine;
    (void)machinetypeattributes;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_GetMaximumProcessorCount_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint16_t groupnumber = static_cast<uint16_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint16_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetMaximumProcessorCount")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(groupnumber) : 0;
#else
    (void)groupnumber;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_GetMaximumProcessorGroupCount_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef uint16_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetMaximumProcessorGroupCount")));
    }
    uint16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr() : 0;
#else
    uint16_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_GetNextUmsListItem_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* umscontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetNextUmsListItem")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(umscontext) : NULL;
#else
    (void)umscontext;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_threading_GetNumaAvailableMemoryNode_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint8_t node = static_cast<uint8_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* availablebytes = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint8_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetNumaAvailableMemoryNode")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(node, availablebytes) : -1;
#else
    (void)node;
    (void)availablebytes;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_GetNumaAvailableMemoryNodeEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint16_t node = static_cast<uint16_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* availablebytes = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint16_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetNumaAvailableMemoryNodeEx")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(node, availablebytes) : -1;
#else
    (void)node;
    (void)availablebytes;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_GetNumaHighestNodeNumber_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* highestnodenumber = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetNumaHighestNodeNumber")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(highestnodenumber) : -1;
#else
    (void)highestnodenumber;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_GetNumaNodeNumberFromHandle_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hfile = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* nodenumber = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetNumaNodeNumberFromHandle")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hfile, nodenumber) : -1;
#else
    (void)hfile;
    (void)nodenumber;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_GetNumaNodeProcessorMask_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint8_t node = static_cast<uint8_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* processormask = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint8_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetNumaNodeProcessorMask")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(node, processormask) : -1;
#else
    (void)node;
    (void)processormask;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_GetNumaNodeProcessorMask2_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint16_t nodenumber = static_cast<uint16_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* processormasks = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint16_t processormaskcount = static_cast<uint16_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* requiredmaskcount = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint16_t, void*, uint16_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetNumaNodeProcessorMask2")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(nodenumber, processormasks, processormaskcount, requiredmaskcount) : -1;
#else
    (void)nodenumber;
    (void)processormasks;
    (void)processormaskcount;
    (void)requiredmaskcount;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_GetNumaNodeProcessorMaskEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint16_t node = static_cast<uint16_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* processormask = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint16_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetNumaNodeProcessorMaskEx")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(node, processormask) : -1;
#else
    (void)node;
    (void)processormask;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_GetNumaProcessorNode_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint8_t processor = static_cast<uint8_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* nodenumber = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint8_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetNumaProcessorNode")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(processor, nodenumber) : -1;
#else
    (void)processor;
    (void)nodenumber;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_GetNumaProcessorNodeEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* processor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* nodenumber = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetNumaProcessorNodeEx")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(processor, nodenumber) : -1;
#else
    (void)processor;
    (void)nodenumber;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_GetNumaProximityNode_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t proximityid = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* nodenumber = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetNumaProximityNode")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(proximityid, nodenumber) : -1;
#else
    (void)proximityid;
    (void)nodenumber;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_GetNumaProximityNodeEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t proximityid = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* nodenumber = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetNumaProximityNodeEx")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(proximityid, nodenumber) : -1;
#else
    (void)proximityid;
    (void)nodenumber;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_GetPriorityClass_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetPriorityClass")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess) : 0;
#else
    (void)hprocess;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_GetProcessAffinityMask_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpprocessaffinitymask = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* lpsystemaffinitymask = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetProcessAffinityMask")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, lpprocessaffinitymask, lpsystemaffinitymask) : -1;
#else
    (void)hprocess;
    (void)lpprocessaffinitymask;
    (void)lpsystemaffinitymask;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_GetProcessDEPPolicy_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpflags = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* lppermanent = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetProcessDEPPolicy")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, lpflags, lppermanent) : -1;
#else
    (void)hprocess;
    (void)lpflags;
    (void)lppermanent;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_GetProcessDefaultCpuSetMasks_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* process = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* cpusetmasks = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint16_t cpusetmaskcount = static_cast<uint16_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* requiredmaskcount = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint16_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetProcessDefaultCpuSetMasks")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(process, cpusetmasks, cpusetmaskcount, requiredmaskcount) : -1;
#else
    (void)process;
    (void)cpusetmasks;
    (void)cpusetmaskcount;
    (void)requiredmaskcount;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_GetProcessDefaultCpuSets_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* process = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* cpusetids = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t cpusetidcount = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* requiredidcount = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetProcessDefaultCpuSets")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(process, cpusetids, cpusetidcount, requiredidcount) : -1;
#else
    (void)process;
    (void)cpusetids;
    (void)cpusetidcount;
    (void)requiredidcount;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_GetProcessGroupAffinity_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* groupcount = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* grouparray = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetProcessGroupAffinity")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, groupcount, grouparray) : -1;
#else
    (void)hprocess;
    (void)groupcount;
    (void)grouparray;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_GetProcessHandleCount_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pdwhandlecount = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetProcessHandleCount")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, pdwhandlecount) : -1;
#else
    (void)hprocess;
    (void)pdwhandlecount;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_GetProcessHandleFromHwnd_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hwnd = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("oleacc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetProcessHandleFromHwnd")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hwnd) : NULL;
#else
    (void)hwnd;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_threading_GetProcessId_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* process = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetProcessId")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(process) : 0;
#else
    (void)process;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_GetProcessIdOfThread_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* thread = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetProcessIdOfThread")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(thread) : 0;
#else
    (void)thread;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_GetProcessInformation_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t processinformationclass = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* processinformation = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t processinformationsize = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetProcessInformation")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, processinformationclass, processinformation, processinformationsize) : -1;
#else
    (void)hprocess;
    (void)processinformationclass;
    (void)processinformation;
    (void)processinformationsize;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_GetProcessIoCounters_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpiocounters = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetProcessIoCounters")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, lpiocounters) : -1;
#else
    (void)hprocess;
    (void)lpiocounters;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_GetProcessMitigationPolicy_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t mitigationpolicy = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* lpbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint64_t dwlength = km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetProcessMitigationPolicy")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, mitigationpolicy, lpbuffer, dwlength) : -1;
#else
    (void)hprocess;
    (void)mitigationpolicy;
    (void)lpbuffer;
    (void)dwlength;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_GetProcessPriorityBoost_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pdisablepriorityboost = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetProcessPriorityBoost")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, pdisablepriorityboost) : -1;
#else
    (void)hprocess;
    (void)pdisablepriorityboost;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_GetProcessShutdownParameters_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpdwlevel = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpdwflags = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetProcessShutdownParameters")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpdwlevel, lpdwflags) : -1;
#else
    (void)lpdwlevel;
    (void)lpdwflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_GetProcessTimes_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpcreationtime = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* lpexittime = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* lpkerneltime = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* lpusertime = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetProcessTimes")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, lpcreationtime, lpexittime, lpkerneltime, lpusertime) : -1;
#else
    (void)hprocess;
    (void)lpcreationtime;
    (void)lpexittime;
    (void)lpkerneltime;
    (void)lpusertime;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_GetProcessVersion_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t processid = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetProcessVersion")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(processid) : 0;
#else
    (void)processid;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_GetProcessWorkingSetSize_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpminimumworkingsetsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* lpmaximumworkingsetsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetProcessWorkingSetSize")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, lpminimumworkingsetsize, lpmaximumworkingsetsize) : -1;
#else
    (void)hprocess;
    (void)lpminimumworkingsetsize;
    (void)lpmaximumworkingsetsize;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_GetStartupInfoA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpstartupinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetStartupInfoA")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(lpstartupinfo);
#else
    (void)lpstartupinfo;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_threading_GetStartupInfoW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpstartupinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetStartupInfoW")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(lpstartupinfo);
#else
    (void)lpstartupinfo;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_threading_GetSystemTimes_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpidletime = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpkerneltime = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* lpusertime = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetSystemTimes")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpidletime, lpkerneltime, lpusertime) : -1;
#else
    (void)lpidletime;
    (void)lpkerneltime;
    (void)lpusertime;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_GetThreadDescription_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hthread = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ppszthreaddescription = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetThreadDescription")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hthread, ppszthreaddescription) : -1;
#else
    (void)hthread;
    (void)ppszthreaddescription;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_GetThreadGroupAffinity_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hthread = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* groupaffinity = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetThreadGroupAffinity")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hthread, groupaffinity) : -1;
#else
    (void)hthread;
    (void)groupaffinity;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_GetThreadIOPendingFlag_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hthread = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpioispending = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetThreadIOPendingFlag")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hthread, lpioispending) : -1;
#else
    (void)hthread;
    (void)lpioispending;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_GetThreadId_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* thread = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetThreadId")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(thread) : 0;
#else
    (void)thread;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_GetThreadIdealProcessorEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hthread = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpidealprocessor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetThreadIdealProcessorEx")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hthread, lpidealprocessor) : -1;
#else
    (void)hthread;
    (void)lpidealprocessor;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_GetThreadInformation_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hthread = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t threadinformationclass = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* threadinformation = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t threadinformationsize = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetThreadInformation")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hthread, threadinformationclass, threadinformation, threadinformationsize) : -1;
#else
    (void)hthread;
    (void)threadinformationclass;
    (void)threadinformation;
    (void)threadinformationsize;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_GetThreadPriority_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hthread = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetThreadPriority")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hthread) : -1;
#else
    (void)hthread;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_GetThreadPriorityBoost_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hthread = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pdisablepriorityboost = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetThreadPriorityBoost")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hthread, pdisablepriorityboost) : -1;
#else
    (void)hthread;
    (void)pdisablepriorityboost;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_GetThreadSelectedCpuSetMasks_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* thread = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* cpusetmasks = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint16_t cpusetmaskcount = static_cast<uint16_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* requiredmaskcount = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint16_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetThreadSelectedCpuSetMasks")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(thread, cpusetmasks, cpusetmaskcount, requiredmaskcount) : -1;
#else
    (void)thread;
    (void)cpusetmasks;
    (void)cpusetmaskcount;
    (void)requiredmaskcount;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_GetThreadSelectedCpuSets_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* thread = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* cpusetids = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t cpusetidcount = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* requiredidcount = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetThreadSelectedCpuSets")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(thread, cpusetids, cpusetidcount, requiredidcount) : -1;
#else
    (void)thread;
    (void)cpusetids;
    (void)cpusetidcount;
    (void)requiredidcount;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_GetThreadTimes_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hthread = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpcreationtime = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* lpexittime = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* lpkerneltime = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* lpusertime = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetThreadTimes")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hthread, lpcreationtime, lpexittime, lpkerneltime, lpusertime) : -1;
#else
    (void)hthread;
    (void)lpcreationtime;
    (void)lpexittime;
    (void)lpkerneltime;
    (void)lpusertime;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_GetUmsCompletionListEvent_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* umscompletionlist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* umscompletionevent = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetUmsCompletionListEvent")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(umscompletionlist, umscompletionevent) : -1;
#else
    (void)umscompletionlist;
    (void)umscompletionevent;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_GetUmsSystemThreadInformation_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* threadhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* systemthreadinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetUmsSystemThreadInformation")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(threadhandle, systemthreadinfo) : -1;
#else
    (void)threadhandle;
    (void)systemthreadinfo;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_InitOnceBeginInitialize_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpinitonce = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* fpending = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* lpcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "InitOnceBeginInitialize")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpinitonce, dwflags, fpending, lpcontext) : -1;
#else
    (void)lpinitonce;
    (void)dwflags;
    (void)fpending;
    (void)lpcontext;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_InitOnceComplete_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpinitonce = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* lpcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "InitOnceComplete")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpinitonce, dwflags, lpcontext) : -1;
#else
    (void)lpinitonce;
    (void)dwflags;
    (void)lpcontext;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_InitOnceExecuteOnce_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* initonce = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* initfn = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* parameter = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* context = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "InitOnceExecuteOnce")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(initonce, initfn, parameter, context) : -1;
#else
    (void)initonce;
    (void)initfn;
    (void)parameter;
    (void)context;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_InitOnceInitialize_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* initonce = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "InitOnceInitialize")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(initonce);
#else
    (void)initonce;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_threading_InitializeConditionVariable_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* conditionvariable = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "InitializeConditionVariable")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(conditionvariable);
#else
    (void)conditionvariable;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_threading_InitializeCriticalSection_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpcriticalsection = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "InitializeCriticalSection")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(lpcriticalsection);
#else
    (void)lpcriticalsection;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_threading_InitializeCriticalSectionAndSpinCount_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpcriticalsection = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwspincount = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "InitializeCriticalSectionAndSpinCount")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpcriticalsection, dwspincount) : -1;
#else
    (void)lpcriticalsection;
    (void)dwspincount;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_InitializeCriticalSectionEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpcriticalsection = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwspincount = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "InitializeCriticalSectionEx")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpcriticalsection, dwspincount, flags) : -1;
#else
    (void)lpcriticalsection;
    (void)dwspincount;
    (void)flags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_InitializeProcThreadAttributeList_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpattributelist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwattributecount = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* lpsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "InitializeProcThreadAttributeList")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpattributelist, dwattributecount, dwflags, lpsize) : -1;
#else
    (void)lpattributelist;
    (void)dwattributecount;
    (void)dwflags;
    (void)lpsize;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_InitializeSListHead_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* listhead = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "InitializeSListHead")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(listhead);
#else
    (void)listhead;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_threading_InitializeSRWLock_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* srwlock = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "InitializeSRWLock")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(srwlock);
#else
    (void)srwlock;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_threading_InitializeSynchronizationBarrier_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpbarrier = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t ltotalthreads = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t lspincount = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "InitializeSynchronizationBarrier")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpbarrier, ltotalthreads, lspincount) : -1;
#else
    (void)lpbarrier;
    (void)ltotalthreads;
    (void)lspincount;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_InterlockedFlushSList_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* listhead = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "InterlockedFlushSList")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(listhead) : NULL;
#else
    (void)listhead;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_threading_InterlockedPopEntrySList_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* listhead = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "InterlockedPopEntrySList")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(listhead) : NULL;
#else
    (void)listhead;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_threading_InterlockedPushEntrySList_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* listhead = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* listentry = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "InterlockedPushEntrySList")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(listhead, listentry) : NULL;
#else
    (void)listhead;
    (void)listentry;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_threading_InterlockedPushListSListEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* listhead = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* list = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* listend = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t count = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "InterlockedPushListSListEx")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(listhead, list, listend, count) : NULL;
#else
    (void)listhead;
    (void)list;
    (void)listend;
    (void)count;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_threading_IsImmersiveProcess_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IsImmersiveProcess")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess) : -1;
#else
    (void)hprocess;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_IsProcessCritical_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* critical = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IsProcessCritical")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, critical) : -1;
#else
    (void)hprocess;
    (void)critical;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_IsProcessorFeaturePresent_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t processorfeature = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IsProcessorFeaturePresent")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(processorfeature) : -1;
#else
    (void)processorfeature;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_IsThreadAFiber_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IsThreadAFiber")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_IsThreadpoolTimerSet_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t pti = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IsThreadpoolTimerSet")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pti) : -1;
#else
    (void)pti;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_IsWow64Process_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* wow64process = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IsWow64Process")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, wow64process) : -1;
#else
    (void)hprocess;
    (void)wow64process;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_IsWow64Process2_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pprocessmachine = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pnativemachine = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IsWow64Process2")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, pprocessmachine, pnativemachine) : -1;
#else
    (void)hprocess;
    (void)pprocessmachine;
    (void)pnativemachine;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_LeaveCriticalSection_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpcriticalsection = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "LeaveCriticalSection")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(lpcriticalsection);
#else
    (void)lpcriticalsection;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_threading_LeaveCriticalSectionWhenCallbackReturns_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t pci = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* pcs = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "LeaveCriticalSectionWhenCallbackReturns")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(pci, pcs);
#else
    (void)pci;
    (void)pcs;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_threading_OpenEventA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwdesiredaccess = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    int32_t binherithandle = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* lpname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "OpenEventA")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwdesiredaccess, binherithandle, lpname) : NULL;
#else
    (void)dwdesiredaccess;
    (void)binherithandle;
    (void)lpname;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_threading_OpenEventW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwdesiredaccess = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    int32_t binherithandle = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* lpname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "OpenEventW")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwdesiredaccess, binherithandle, lpname) : NULL;
#else
    (void)dwdesiredaccess;
    (void)binherithandle;
    (void)lpname;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_threading_OpenMutexW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwdesiredaccess = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    int32_t binherithandle = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* lpname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "OpenMutexW")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwdesiredaccess, binherithandle, lpname) : NULL;
#else
    (void)dwdesiredaccess;
    (void)binherithandle;
    (void)lpname;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_threading_OpenPrivateNamespaceA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpboundarydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpaliasprefix = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "OpenPrivateNamespaceA")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpboundarydescriptor, lpaliasprefix) : NULL;
#else
    (void)lpboundarydescriptor;
    (void)lpaliasprefix;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_threading_OpenPrivateNamespaceW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpboundarydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpaliasprefix = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "OpenPrivateNamespaceW")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpboundarydescriptor, lpaliasprefix) : NULL;
#else
    (void)lpboundarydescriptor;
    (void)lpaliasprefix;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_threading_OpenProcess_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwdesiredaccess = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    int32_t binherithandle = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t dwprocessid = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "OpenProcess")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwdesiredaccess, binherithandle, dwprocessid) : NULL;
#else
    (void)dwdesiredaccess;
    (void)binherithandle;
    (void)dwprocessid;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_threading_OpenProcessToken_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* processhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t desiredaccess = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* tokenhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "OpenProcessToken")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(processhandle, desiredaccess, tokenhandle) : -1;
#else
    (void)processhandle;
    (void)desiredaccess;
    (void)tokenhandle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_OpenSemaphoreW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwdesiredaccess = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    int32_t binherithandle = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* lpname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "OpenSemaphoreW")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwdesiredaccess, binherithandle, lpname) : NULL;
#else
    (void)dwdesiredaccess;
    (void)binherithandle;
    (void)lpname;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_threading_OpenThread_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwdesiredaccess = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    int32_t binherithandle = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t dwthreadid = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "OpenThread")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwdesiredaccess, binherithandle, dwthreadid) : NULL;
#else
    (void)dwdesiredaccess;
    (void)binherithandle;
    (void)dwthreadid;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_threading_OpenThreadToken_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* threadhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t desiredaccess = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t openasself = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* tokenhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "OpenThreadToken")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(threadhandle, desiredaccess, openasself, tokenhandle) : -1;
#else
    (void)threadhandle;
    (void)desiredaccess;
    (void)openasself;
    (void)tokenhandle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_OpenWaitableTimerA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwdesiredaccess = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    int32_t binherithandle = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* lptimername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "OpenWaitableTimerA")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwdesiredaccess, binherithandle, lptimername) : NULL;
#else
    (void)dwdesiredaccess;
    (void)binherithandle;
    (void)lptimername;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_threading_OpenWaitableTimerW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwdesiredaccess = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    int32_t binherithandle = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* lptimername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "OpenWaitableTimerW")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwdesiredaccess, binherithandle, lptimername) : NULL;
#else
    (void)dwdesiredaccess;
    (void)binherithandle;
    (void)lptimername;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_threading_PulseEvent_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hevent = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PulseEvent")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hevent) : -1;
#else
    (void)hevent;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_QueryDepthSList_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* listhead = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint16_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "QueryDepthSList")));
    }
    uint16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(listhead) : 0;
#else
    (void)listhead;
    uint16_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_QueryFullProcessImageNameA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* lpexename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* lpdwsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "QueryFullProcessImageNameA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, dwflags, lpexename, lpdwsize) : -1;
#else
    (void)hprocess;
    (void)dwflags;
    (void)lpexename;
    (void)lpdwsize;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_QueryFullProcessImageNameW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* lpexename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* lpdwsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "QueryFullProcessImageNameW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, dwflags, lpexename, lpdwsize) : -1;
#else
    (void)hprocess;
    (void)dwflags;
    (void)lpexename;
    (void)lpdwsize;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_QueryProcessAffinityUpdateMode_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpdwflags = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "QueryProcessAffinityUpdateMode")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, lpdwflags) : -1;
#else
    (void)hprocess;
    (void)lpdwflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_QueryProtectedPolicy_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* policyguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* policyvalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "QueryProtectedPolicy")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(policyguid, policyvalue) : -1;
#else
    (void)policyguid;
    (void)policyvalue;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_QueryThreadpoolStackInformation_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t ptpp = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* ptpsi = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "QueryThreadpoolStackInformation")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(ptpp, ptpsi) : -1;
#else
    (void)ptpp;
    (void)ptpsi;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_QueryUmsThreadInformation_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* umsthread = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t umsthreadinfoclass = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* umsthreadinformation = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t umsthreadinformationlength = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* returnlength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "QueryUmsThreadInformation")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(umsthread, umsthreadinfoclass, umsthreadinformation, umsthreadinformationlength, returnlength) : -1;
#else
    (void)umsthread;
    (void)umsthreadinfoclass;
    (void)umsthreadinformation;
    (void)umsthreadinformationlength;
    (void)returnlength;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_QueueUserWorkItem_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* function = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* context = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "QueueUserWorkItem")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(function, context, flags) : -1;
#else
    (void)function;
    (void)context;
    (void)flags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_RegisterWaitForSingleObject_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* phnewwaitobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* hobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* callback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* context = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t dwmilliseconds = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RegisterWaitForSingleObject")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(phnewwaitobject, hobject, callback, context, dwmilliseconds, dwflags) : -1;
#else
    (void)phnewwaitobject;
    (void)hobject;
    (void)callback;
    (void)context;
    (void)dwmilliseconds;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_ReleaseMutex_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hmutex = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ReleaseMutex")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hmutex) : -1;
#else
    (void)hmutex;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_ReleaseMutexWhenCallbackReturns_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t pci = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* mut = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ReleaseMutexWhenCallbackReturns")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(pci, mut);
#else
    (void)pci;
    (void)mut;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_threading_ReleaseSRWLockExclusive_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* srwlock = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ReleaseSRWLockExclusive")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(srwlock);
#else
    (void)srwlock;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_threading_ReleaseSRWLockShared_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* srwlock = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ReleaseSRWLockShared")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(srwlock);
#else
    (void)srwlock;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_threading_ReleaseSemaphore_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hsemaphore = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t lreleasecount = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* lppreviouscount = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ReleaseSemaphore")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hsemaphore, lreleasecount, lppreviouscount) : -1;
#else
    (void)hsemaphore;
    (void)lreleasecount;
    (void)lppreviouscount;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_ReleaseSemaphoreWhenCallbackReturns_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t pci = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* sem = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t crel = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ReleaseSemaphoreWhenCallbackReturns")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(pci, sem, crel);
#else
    (void)pci;
    (void)sem;
    (void)crel;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_threading_ResetEvent_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hevent = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ResetEvent")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hevent) : -1;
#else
    (void)hevent;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_ResumeThread_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hthread = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ResumeThread")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hthread) : 0;
#else
    (void)hthread;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_RtwqAddPeriodicCallback_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* callback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* context = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* key = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rtworkq.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtwqAddPeriodicCallback")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(callback, context, key) : -1;
#else
    (void)callback;
    (void)context;
    (void)key;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_RtwqAllocateSerialWorkQueue_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t workqueueidin = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* workqueueidout = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rtworkq.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtwqAllocateSerialWorkQueue")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(workqueueidin, workqueueidout) : -1;
#else
    (void)workqueueidin;
    (void)workqueueidout;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_RtwqAllocateWorkQueue_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t workqueuetype = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* workqueueid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rtworkq.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtwqAllocateWorkQueue")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(workqueuetype, workqueueid) : -1;
#else
    (void)workqueuetype;
    (void)workqueueid;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_RtwqBeginRegisterWorkQueueWithMMCSS_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t workqueueid = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* usageclass = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwtaskid = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t lpriority = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* donecallback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* donestate = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rtworkq.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtwqBeginRegisterWorkQueueWithMMCSS")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(workqueueid, usageclass, dwtaskid, lpriority, donecallback, donestate) : -1;
#else
    (void)workqueueid;
    (void)usageclass;
    (void)dwtaskid;
    (void)lpriority;
    (void)donecallback;
    (void)donestate;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_RtwqBeginUnregisterWorkQueueWithMMCSS_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t workqueueid = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* donecallback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* donestate = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rtworkq.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtwqBeginUnregisterWorkQueueWithMMCSS")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(workqueueid, donecallback, donestate) : -1;
#else
    (void)workqueueid;
    (void)donecallback;
    (void)donestate;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_RtwqCancelDeadline_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* prequest = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rtworkq.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtwqCancelDeadline")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(prequest) : -1;
#else
    (void)prequest;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_RtwqCancelWorkItem_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t key = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rtworkq.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtwqCancelWorkItem")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(key) : -1;
#else
    (void)key;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_RtwqCreateAsyncResult_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* appobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* callback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* appstate = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* asyncresult = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rtworkq.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtwqCreateAsyncResult")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(appobject, callback, appstate, asyncresult) : -1;
#else
    (void)appobject;
    (void)callback;
    (void)appstate;
    (void)asyncresult;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_RtwqEndRegisterWorkQueueWithMMCSS_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* result = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* taskid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rtworkq.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtwqEndRegisterWorkQueueWithMMCSS")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(result, taskid) : -1;
#else
    (void)result;
    (void)taskid;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_RtwqGetWorkQueueMMCSSClass_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t workqueueid = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* usageclass = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* usageclasslength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rtworkq.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtwqGetWorkQueueMMCSSClass")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(workqueueid, usageclass, usageclasslength) : -1;
#else
    (void)workqueueid;
    (void)usageclass;
    (void)usageclasslength;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_RtwqGetWorkQueueMMCSSPriority_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t workqueueid = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* priority = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rtworkq.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtwqGetWorkQueueMMCSSPriority")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(workqueueid, priority) : -1;
#else
    (void)workqueueid;
    (void)priority;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_RtwqGetWorkQueueMMCSSTaskId_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t workqueueid = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* taskid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rtworkq.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtwqGetWorkQueueMMCSSTaskId")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(workqueueid, taskid) : -1;
#else
    (void)workqueueid;
    (void)taskid;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_RtwqInvokeCallback_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* result = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rtworkq.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtwqInvokeCallback")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(result) : -1;
#else
    (void)result;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_RtwqJoinWorkQueue_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t workqueueid = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* hfile = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* out = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rtworkq.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtwqJoinWorkQueue")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(workqueueid, hfile, out) : -1;
#else
    (void)workqueueid;
    (void)hfile;
    (void)out;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_RtwqLockPlatform_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rtworkq.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtwqLockPlatform")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_RtwqLockSharedWorkQueue_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* usageclass = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t basepriority = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* taskid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* id = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rtworkq.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtwqLockSharedWorkQueue")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(usageclass, basepriority, taskid, id) : -1;
#else
    (void)usageclass;
    (void)basepriority;
    (void)taskid;
    (void)id;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_RtwqLockWorkQueue_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t workqueueid = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rtworkq.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtwqLockWorkQueue")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(workqueueid) : -1;
#else
    (void)workqueueid;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_RtwqPutWaitingWorkItem_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hevent = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t lpriority = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* result = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* key = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rtworkq.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtwqPutWaitingWorkItem")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hevent, lpriority, result, key) : -1;
#else
    (void)hevent;
    (void)lpriority;
    (void)result;
    (void)key;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_RtwqPutWorkItem_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwqueue = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    int32_t lpriority = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* result = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rtworkq.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtwqPutWorkItem")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwqueue, lpriority, result) : -1;
#else
    (void)dwqueue;
    (void)lpriority;
    (void)result;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_RtwqRegisterPlatformEvents_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* platformevents = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rtworkq.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtwqRegisterPlatformEvents")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(platformevents) : -1;
#else
    (void)platformevents;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_RtwqRegisterPlatformWithMMCSS_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* usageclass = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* taskid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t lpriority = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rtworkq.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtwqRegisterPlatformWithMMCSS")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(usageclass, taskid, lpriority) : -1;
#else
    (void)usageclass;
    (void)taskid;
    (void)lpriority;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_RtwqRemovePeriodicCallback_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwkey = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rtworkq.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtwqRemovePeriodicCallback")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwkey) : -1;
#else
    (void)dwkey;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_RtwqScheduleWorkItem_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* result = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int64_t timeout = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
    void* key = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rtworkq.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtwqScheduleWorkItem")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(result, timeout, key) : -1;
#else
    (void)result;
    (void)timeout;
    (void)key;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_RtwqSetDeadline_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t workqueueid = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    int64_t deadlineinhns = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
    void* prequest = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rtworkq.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtwqSetDeadline")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(workqueueid, deadlineinhns, prequest) : -1;
#else
    (void)workqueueid;
    (void)deadlineinhns;
    (void)prequest;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_RtwqSetDeadline2_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t workqueueid = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    int64_t deadlineinhns = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
    int64_t predeadlineinhns = km_info.Length() > 2 ? km_napi_arg_i64(km_info[2]) : 0;
    void* prequest = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, int64_t, int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rtworkq.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtwqSetDeadline2")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(workqueueid, deadlineinhns, predeadlineinhns, prequest) : -1;
#else
    (void)workqueueid;
    (void)deadlineinhns;
    (void)predeadlineinhns;
    (void)prequest;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_RtwqSetLongRunning_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t workqueueid = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    int32_t enable = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rtworkq.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtwqSetLongRunning")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(workqueueid, enable) : -1;
#else
    (void)workqueueid;
    (void)enable;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_RtwqShutdown_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rtworkq.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtwqShutdown")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_RtwqStartup_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rtworkq.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtwqStartup")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_RtwqUnjoinWorkQueue_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t workqueueid = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* hfile = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rtworkq.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtwqUnjoinWorkQueue")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(workqueueid, hfile) : -1;
#else
    (void)workqueueid;
    (void)hfile;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_RtwqUnlockPlatform_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rtworkq.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtwqUnlockPlatform")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_RtwqUnlockWorkQueue_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t workqueueid = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rtworkq.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtwqUnlockWorkQueue")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(workqueueid) : -1;
#else
    (void)workqueueid;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_RtwqUnregisterPlatformEvents_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* platformevents = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rtworkq.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtwqUnregisterPlatformEvents")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(platformevents) : -1;
#else
    (void)platformevents;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_RtwqUnregisterPlatformFromMMCSS_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rtworkq.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtwqUnregisterPlatformFromMMCSS")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_SetCriticalSectionSpinCount_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpcriticalsection = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwspincount = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetCriticalSectionSpinCount")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpcriticalsection, dwspincount) : 0;
#else
    (void)lpcriticalsection;
    (void)dwspincount;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_SetEvent_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hevent = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetEvent")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hevent) : -1;
#else
    (void)hevent;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_SetEventWhenCallbackReturns_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t pci = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* evt = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetEventWhenCallbackReturns")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(pci, evt);
#else
    (void)pci;
    (void)evt;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_threading_SetPriorityClass_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwpriorityclass = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetPriorityClass")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, dwpriorityclass) : -1;
#else
    (void)hprocess;
    (void)dwpriorityclass;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_SetProcessAffinityMask_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t dwprocessaffinitymask = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetProcessAffinityMask")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, dwprocessaffinitymask) : -1;
#else
    (void)hprocess;
    (void)dwprocessaffinitymask;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_SetProcessAffinityUpdateMode_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetProcessAffinityUpdateMode")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, dwflags) : -1;
#else
    (void)hprocess;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_SetProcessDEPPolicy_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetProcessDEPPolicy")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwflags) : -1;
#else
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_SetProcessDefaultCpuSetMasks_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* process = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* cpusetmasks = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint16_t cpusetmaskcount = static_cast<uint16_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint16_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetProcessDefaultCpuSetMasks")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(process, cpusetmasks, cpusetmaskcount) : -1;
#else
    (void)process;
    (void)cpusetmasks;
    (void)cpusetmaskcount;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_SetProcessDefaultCpuSets_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* process = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* cpusetids = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t cpusetidcount = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetProcessDefaultCpuSets")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(process, cpusetids, cpusetidcount) : -1;
#else
    (void)process;
    (void)cpusetids;
    (void)cpusetidcount;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_SetProcessDynamicEHContinuationTargets_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* process = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint16_t numberoftargets = static_cast<uint16_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* targets = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint16_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetProcessDynamicEHContinuationTargets")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(process, numberoftargets, targets) : -1;
#else
    (void)process;
    (void)numberoftargets;
    (void)targets;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_SetProcessDynamicEnforcedCetCompatibleRanges_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* process = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint16_t numberofranges = static_cast<uint16_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* ranges = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint16_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetProcessDynamicEnforcedCetCompatibleRanges")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(process, numberofranges, ranges) : -1;
#else
    (void)process;
    (void)numberofranges;
    (void)ranges;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_SetProcessInformation_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t processinformationclass = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* processinformation = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t processinformationsize = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetProcessInformation")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, processinformationclass, processinformation, processinformationsize) : -1;
#else
    (void)hprocess;
    (void)processinformationclass;
    (void)processinformation;
    (void)processinformationsize;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_SetProcessMitigationPolicy_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t mitigationpolicy = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* lpbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint64_t dwlength = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetProcessMitigationPolicy")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(mitigationpolicy, lpbuffer, dwlength) : -1;
#else
    (void)mitigationpolicy;
    (void)lpbuffer;
    (void)dwlength;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_SetProcessPriorityBoost_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t bdisablepriorityboost = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetProcessPriorityBoost")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, bdisablepriorityboost) : -1;
#else
    (void)hprocess;
    (void)bdisablepriorityboost;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_SetProcessRestrictionExemption_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t fenableexemption = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetProcessRestrictionExemption")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(fenableexemption) : -1;
#else
    (void)fenableexemption;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_SetProcessShutdownParameters_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwlevel = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetProcessShutdownParameters")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwlevel, dwflags) : -1;
#else
    (void)dwlevel;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_SetProcessWorkingSetSize_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t dwminimumworkingsetsize = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    uint64_t dwmaximumworkingsetsize = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetProcessWorkingSetSize")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, dwminimumworkingsetsize, dwmaximumworkingsetsize) : -1;
#else
    (void)hprocess;
    (void)dwminimumworkingsetsize;
    (void)dwmaximumworkingsetsize;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_SetProtectedPolicy_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* policyguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t policyvalue = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* oldpolicyvalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetProtectedPolicy")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(policyguid, policyvalue, oldpolicyvalue) : -1;
#else
    (void)policyguid;
    (void)policyvalue;
    (void)oldpolicyvalue;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_SetThreadAffinityMask_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hthread = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t dwthreadaffinitymask = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetThreadAffinityMask")));
    }
    uint64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hthread, dwthreadaffinitymask) : 0;
#else
    (void)hthread;
    (void)dwthreadaffinitymask;
    uint64_t km_res = 0;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<uint64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_system_threading_SetThreadDescription_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hthread = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpthreaddescription = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetThreadDescription")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hthread, lpthreaddescription) : -1;
#else
    (void)hthread;
    (void)lpthreaddescription;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_SetThreadGroupAffinity_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hthread = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* groupaffinity = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* previousgroupaffinity = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetThreadGroupAffinity")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hthread, groupaffinity, previousgroupaffinity) : -1;
#else
    (void)hthread;
    (void)groupaffinity;
    (void)previousgroupaffinity;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_SetThreadIdealProcessor_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hthread = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwidealprocessor = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetThreadIdealProcessor")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hthread, dwidealprocessor) : 0;
#else
    (void)hthread;
    (void)dwidealprocessor;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_SetThreadIdealProcessorEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hthread = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpidealprocessor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* lppreviousidealprocessor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetThreadIdealProcessorEx")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hthread, lpidealprocessor, lppreviousidealprocessor) : -1;
#else
    (void)hthread;
    (void)lpidealprocessor;
    (void)lppreviousidealprocessor;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_SetThreadInformation_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hthread = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t threadinformationclass = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* threadinformation = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t threadinformationsize = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetThreadInformation")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hthread, threadinformationclass, threadinformation, threadinformationsize) : -1;
#else
    (void)hthread;
    (void)threadinformationclass;
    (void)threadinformation;
    (void)threadinformationsize;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_SetThreadPriority_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hthread = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t npriority = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetThreadPriority")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hthread, npriority) : -1;
#else
    (void)hthread;
    (void)npriority;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_SetThreadPriorityBoost_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hthread = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t bdisablepriorityboost = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetThreadPriorityBoost")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hthread, bdisablepriorityboost) : -1;
#else
    (void)hthread;
    (void)bdisablepriorityboost;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_SetThreadSelectedCpuSetMasks_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* thread = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* cpusetmasks = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint16_t cpusetmaskcount = static_cast<uint16_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint16_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetThreadSelectedCpuSetMasks")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(thread, cpusetmasks, cpusetmaskcount) : -1;
#else
    (void)thread;
    (void)cpusetmasks;
    (void)cpusetmaskcount;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_SetThreadSelectedCpuSets_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* thread = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* cpusetids = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t cpusetidcount = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetThreadSelectedCpuSets")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(thread, cpusetids, cpusetidcount) : -1;
#else
    (void)thread;
    (void)cpusetids;
    (void)cpusetidcount;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_SetThreadStackGuarantee_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* stacksizeinbytes = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetThreadStackGuarantee")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(stacksizeinbytes) : -1;
#else
    (void)stacksizeinbytes;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_SetThreadToken_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* thread = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* token = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetThreadToken")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(thread, token) : -1;
#else
    (void)thread;
    (void)token;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_SetThreadpoolStackInformation_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t ptpp = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* ptpsi = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetThreadpoolStackInformation")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(ptpp, ptpsi) : -1;
#else
    (void)ptpp;
    (void)ptpsi;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_SetThreadpoolThreadMaximum_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t ptpp = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint32_t cthrdmost = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetThreadpoolThreadMaximum")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(ptpp, cthrdmost);
#else
    (void)ptpp;
    (void)cthrdmost;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_threading_SetThreadpoolThreadMinimum_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t ptpp = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint32_t cthrdmic = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetThreadpoolThreadMinimum")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(ptpp, cthrdmic) : -1;
#else
    (void)ptpp;
    (void)cthrdmic;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_SetThreadpoolTimer_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t pti = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* pftduetime = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t msperiod = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t mswindowlength = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetThreadpoolTimer")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(pti, pftduetime, msperiod, mswindowlength);
#else
    (void)pti;
    (void)pftduetime;
    (void)msperiod;
    (void)mswindowlength;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_threading_SetThreadpoolTimerEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t pti = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* pftduetime = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t msperiod = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t mswindowlength = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetThreadpoolTimerEx")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pti, pftduetime, msperiod, mswindowlength) : -1;
#else
    (void)pti;
    (void)pftduetime;
    (void)msperiod;
    (void)mswindowlength;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_SetThreadpoolWait_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t pwa = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* h = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pfttimeout = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetThreadpoolWait")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(pwa, h, pfttimeout);
#else
    (void)pwa;
    (void)h;
    (void)pfttimeout;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_threading_SetThreadpoolWaitEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t pwa = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* h = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pfttimeout = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* reserved = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetThreadpoolWaitEx")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pwa, h, pfttimeout, reserved) : -1;
#else
    (void)pwa;
    (void)h;
    (void)pfttimeout;
    (void)reserved;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_SetTimerQueueTimer_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* timerqueue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* callback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* parameter = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t duetime = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t period = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    int32_t preferio = static_cast<int32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetTimerQueueTimer")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(timerqueue, callback, parameter, duetime, period, preferio) : NULL;
#else
    (void)timerqueue;
    (void)callback;
    (void)parameter;
    (void)duetime;
    (void)period;
    (void)preferio;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_threading_SetUmsThreadInformation_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* umsthread = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t umsthreadinfoclass = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* umsthreadinformation = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t umsthreadinformationlength = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetUmsThreadInformation")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(umsthread, umsthreadinfoclass, umsthreadinformation, umsthreadinformationlength) : -1;
#else
    (void)umsthread;
    (void)umsthreadinfoclass;
    (void)umsthreadinformation;
    (void)umsthreadinformationlength;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_SetWaitableTimer_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* htimer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpduetime = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t lperiod = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pfncompletionroutine = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* lpargtocompletionroutine = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    int32_t fresume = static_cast<int32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetWaitableTimer")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(htimer, lpduetime, lperiod, pfncompletionroutine, lpargtocompletionroutine, fresume) : -1;
#else
    (void)htimer;
    (void)lpduetime;
    (void)lperiod;
    (void)pfncompletionroutine;
    (void)lpargtocompletionroutine;
    (void)fresume;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_SetWaitableTimerEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* htimer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpduetime = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t lperiod = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pfncompletionroutine = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* lpargtocompletionroutine = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* wakecontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    uint32_t tolerabledelay = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetWaitableTimerEx")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(htimer, lpduetime, lperiod, pfncompletionroutine, lpargtocompletionroutine, wakecontext, tolerabledelay) : -1;
#else
    (void)htimer;
    (void)lpduetime;
    (void)lperiod;
    (void)pfncompletionroutine;
    (void)lpargtocompletionroutine;
    (void)wakecontext;
    (void)tolerabledelay;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_SignalObjectAndWait_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hobjecttosignal = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* hobjecttowaiton = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwmilliseconds = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t balertable = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SignalObjectAndWait")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hobjecttosignal, hobjecttowaiton, dwmilliseconds, balertable) : 0;
#else
    (void)hobjecttosignal;
    (void)hobjecttowaiton;
    (void)dwmilliseconds;
    (void)balertable;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_Sleep_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwmilliseconds = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "Sleep")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(dwmilliseconds);
#else
    (void)dwmilliseconds;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_threading_SleepConditionVariableCS_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* conditionvariable = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* criticalsection = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwmilliseconds = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SleepConditionVariableCS")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(conditionvariable, criticalsection, dwmilliseconds) : -1;
#else
    (void)conditionvariable;
    (void)criticalsection;
    (void)dwmilliseconds;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_SleepConditionVariableSRW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* conditionvariable = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* srwlock = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwmilliseconds = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SleepConditionVariableSRW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(conditionvariable, srwlock, dwmilliseconds, flags) : -1;
#else
    (void)conditionvariable;
    (void)srwlock;
    (void)dwmilliseconds;
    (void)flags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_SleepEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwmilliseconds = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    int32_t balertable = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SleepEx")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwmilliseconds, balertable) : 0;
#else
    (void)dwmilliseconds;
    (void)balertable;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_StartThreadpoolIo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t pio = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "StartThreadpoolIo")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(pio);
#else
    (void)pio;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_threading_SubmitThreadpoolWork_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t pwk = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SubmitThreadpoolWork")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(pwk);
#else
    (void)pwk;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_threading_SuspendThread_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hthread = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SuspendThread")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hthread) : 0;
#else
    (void)hthread;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_SwitchToFiber_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpfiber = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SwitchToFiber")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(lpfiber);
#else
    (void)lpfiber;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_threading_SwitchToThread_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SwitchToThread")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_TerminateProcess_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t uexitcode = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "TerminateProcess")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, uexitcode) : -1;
#else
    (void)hprocess;
    (void)uexitcode;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_TerminateThread_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hthread = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwexitcode = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "TerminateThread")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hthread, dwexitcode) : -1;
#else
    (void)hthread;
    (void)dwexitcode;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_TlsAlloc_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "TlsAlloc")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr() : 0;
#else
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_TlsFree_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwtlsindex = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "TlsFree")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwtlsindex) : -1;
#else
    (void)dwtlsindex;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_TlsGetValue_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwtlsindex = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "TlsGetValue")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwtlsindex) : NULL;
#else
    (void)dwtlsindex;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_threading_TlsSetValue_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwtlsindex = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* lptlsvalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "TlsSetValue")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwtlsindex, lptlsvalue) : -1;
#else
    (void)dwtlsindex;
    (void)lptlsvalue;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_TryAcquireSRWLockExclusive_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* srwlock = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "TryAcquireSRWLockExclusive")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(srwlock) : false;
#else
    (void)srwlock;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_win32_system_threading_TryAcquireSRWLockShared_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* srwlock = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "TryAcquireSRWLockShared")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(srwlock) : false;
#else
    (void)srwlock;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_win32_system_threading_TryEnterCriticalSection_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpcriticalsection = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "TryEnterCriticalSection")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpcriticalsection) : -1;
#else
    (void)lpcriticalsection;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_TrySubmitThreadpoolCallback_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pfns = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pv = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pcbe = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "TrySubmitThreadpoolCallback")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pfns, pv, pcbe) : -1;
#else
    (void)pfns;
    (void)pv;
    (void)pcbe;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_UmsThreadYield_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* schedulerparam = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "UmsThreadYield")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(schedulerparam) : -1;
#else
    (void)schedulerparam;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_UnregisterWait_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* waithandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "UnregisterWait")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(waithandle) : -1;
#else
    (void)waithandle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_UnregisterWaitEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* waithandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* completionevent = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "UnregisterWaitEx")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(waithandle, completionevent) : -1;
#else
    (void)waithandle;
    (void)completionevent;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_UpdateProcThreadAttribute_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpattributelist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint64_t attribute = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
    void* lpvalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint64_t cbsize = km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0;
    void* lppreviousvalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* lpreturnsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint64_t, void*, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "UpdateProcThreadAttribute")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpattributelist, dwflags, attribute, lpvalue, cbsize, lppreviousvalue, lpreturnsize) : -1;
#else
    (void)lpattributelist;
    (void)dwflags;
    (void)attribute;
    (void)lpvalue;
    (void)cbsize;
    (void)lppreviousvalue;
    (void)lpreturnsize;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_WaitForInputIdle_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwmilliseconds = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WaitForInputIdle")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, dwmilliseconds) : 0;
#else
    (void)hprocess;
    (void)dwmilliseconds;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_WaitForMultipleObjects_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t ncount = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* lphandles = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t bwaitall = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t dwmilliseconds = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WaitForMultipleObjects")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(ncount, lphandles, bwaitall, dwmilliseconds) : 0;
#else
    (void)ncount;
    (void)lphandles;
    (void)bwaitall;
    (void)dwmilliseconds;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_WaitForMultipleObjectsEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t ncount = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* lphandles = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t bwaitall = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t dwmilliseconds = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    int32_t balertable = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, int32_t, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WaitForMultipleObjectsEx")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(ncount, lphandles, bwaitall, dwmilliseconds, balertable) : 0;
#else
    (void)ncount;
    (void)lphandles;
    (void)bwaitall;
    (void)dwmilliseconds;
    (void)balertable;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_WaitForSingleObject_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwmilliseconds = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WaitForSingleObject")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hhandle, dwmilliseconds) : 0;
#else
    (void)hhandle;
    (void)dwmilliseconds;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_WaitForSingleObjectEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwmilliseconds = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t balertable = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WaitForSingleObjectEx")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hhandle, dwmilliseconds, balertable) : 0;
#else
    (void)hhandle;
    (void)dwmilliseconds;
    (void)balertable;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_WaitForThreadpoolIoCallbacks_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t pio = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int32_t fcancelpendingcallbacks = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WaitForThreadpoolIoCallbacks")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(pio, fcancelpendingcallbacks);
#else
    (void)pio;
    (void)fcancelpendingcallbacks;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_threading_WaitForThreadpoolTimerCallbacks_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t pti = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int32_t fcancelpendingcallbacks = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WaitForThreadpoolTimerCallbacks")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(pti, fcancelpendingcallbacks);
#else
    (void)pti;
    (void)fcancelpendingcallbacks;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_threading_WaitForThreadpoolWaitCallbacks_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t pwa = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int32_t fcancelpendingcallbacks = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WaitForThreadpoolWaitCallbacks")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(pwa, fcancelpendingcallbacks);
#else
    (void)pwa;
    (void)fcancelpendingcallbacks;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_threading_WaitForThreadpoolWorkCallbacks_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t pwk = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int32_t fcancelpendingcallbacks = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WaitForThreadpoolWorkCallbacks")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(pwk, fcancelpendingcallbacks);
#else
    (void)pwk;
    (void)fcancelpendingcallbacks;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_threading_WaitOnAddress_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* address = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* compareaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint64_t addresssize = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
    uint32_t dwmilliseconds = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-synch-l1-2-0.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WaitOnAddress")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(address, compareaddress, addresssize, dwmilliseconds) : -1;
#else
    (void)address;
    (void)compareaddress;
    (void)addresssize;
    (void)dwmilliseconds;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_WakeAllConditionVariable_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* conditionvariable = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WakeAllConditionVariable")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(conditionvariable);
#else
    (void)conditionvariable;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_threading_WakeByAddressAll_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* address = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-synch-l1-2-0.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WakeByAddressAll")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(address);
#else
    (void)address;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_threading_WakeByAddressSingle_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* address = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-synch-l1-2-0.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WakeByAddressSingle")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(address);
#else
    (void)address;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_threading_WakeConditionVariable_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* conditionvariable = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WakeConditionVariable")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(conditionvariable);
#else
    (void)conditionvariable;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_threading_WinExec_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpcmdline = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t ucmdshow = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WinExec")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpcmdline, ucmdshow) : 0;
#else
    (void)lpcmdline;
    (void)ucmdshow;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_Wow64SetThreadDefaultGuestMachine_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint16_t machine = static_cast<uint16_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint16_t (__stdcall *km_fn_t)(uint16_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-wow64-l1-1-1.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "Wow64SetThreadDefaultGuestMachine")));
    }
    uint16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(machine) : 0;
#else
    (void)machine;
    uint16_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_Wow64SuspendThread_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hthread = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "Wow64SuspendThread")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hthread) : 0;
#else
    (void)hthread;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static void register_windows_win32_system_threading_napi(Napi::Env env, Napi::Object exports) {
    exports.Set("windowssys_windows_win32_system_threading_AcquireSRWLockExclusive", Napi::Function::New(env, windowssys_windows_win32_system_threading_AcquireSRWLockExclusive_napi));
    exports.Set("windowssys_windows_win32_system_threading_AcquireSRWLockShared", Napi::Function::New(env, windowssys_windows_win32_system_threading_AcquireSRWLockShared_napi));
    exports.Set("windowssys_windows_win32_system_threading_AddIntegrityLabelToBoundaryDescriptor", Napi::Function::New(env, windowssys_windows_win32_system_threading_AddIntegrityLabelToBoundaryDescriptor_napi));
    exports.Set("windowssys_windows_win32_system_threading_AddSIDToBoundaryDescriptor", Napi::Function::New(env, windowssys_windows_win32_system_threading_AddSIDToBoundaryDescriptor_napi));
    exports.Set("windowssys_windows_win32_system_threading_AttachThreadInput", Napi::Function::New(env, windowssys_windows_win32_system_threading_AttachThreadInput_napi));
    exports.Set("windowssys_windows_win32_system_threading_AvQuerySystemResponsiveness", Napi::Function::New(env, windowssys_windows_win32_system_threading_AvQuerySystemResponsiveness_napi));
    exports.Set("windowssys_windows_win32_system_threading_AvRevertMmThreadCharacteristics", Napi::Function::New(env, windowssys_windows_win32_system_threading_AvRevertMmThreadCharacteristics_napi));
    exports.Set("windowssys_windows_win32_system_threading_AvRtCreateThreadOrderingGroup", Napi::Function::New(env, windowssys_windows_win32_system_threading_AvRtCreateThreadOrderingGroup_napi));
    exports.Set("windowssys_windows_win32_system_threading_AvRtCreateThreadOrderingGroupExA", Napi::Function::New(env, windowssys_windows_win32_system_threading_AvRtCreateThreadOrderingGroupExA_napi));
    exports.Set("windowssys_windows_win32_system_threading_AvRtCreateThreadOrderingGroupExW", Napi::Function::New(env, windowssys_windows_win32_system_threading_AvRtCreateThreadOrderingGroupExW_napi));
    exports.Set("windowssys_windows_win32_system_threading_AvRtDeleteThreadOrderingGroup", Napi::Function::New(env, windowssys_windows_win32_system_threading_AvRtDeleteThreadOrderingGroup_napi));
    exports.Set("windowssys_windows_win32_system_threading_AvRtJoinThreadOrderingGroup", Napi::Function::New(env, windowssys_windows_win32_system_threading_AvRtJoinThreadOrderingGroup_napi));
    exports.Set("windowssys_windows_win32_system_threading_AvRtLeaveThreadOrderingGroup", Napi::Function::New(env, windowssys_windows_win32_system_threading_AvRtLeaveThreadOrderingGroup_napi));
    exports.Set("windowssys_windows_win32_system_threading_AvRtWaitOnThreadOrderingGroup", Napi::Function::New(env, windowssys_windows_win32_system_threading_AvRtWaitOnThreadOrderingGroup_napi));
    exports.Set("windowssys_windows_win32_system_threading_AvSetMmMaxThreadCharacteristicsA", Napi::Function::New(env, windowssys_windows_win32_system_threading_AvSetMmMaxThreadCharacteristicsA_napi));
    exports.Set("windowssys_windows_win32_system_threading_AvSetMmMaxThreadCharacteristicsW", Napi::Function::New(env, windowssys_windows_win32_system_threading_AvSetMmMaxThreadCharacteristicsW_napi));
    exports.Set("windowssys_windows_win32_system_threading_AvSetMmThreadCharacteristicsA", Napi::Function::New(env, windowssys_windows_win32_system_threading_AvSetMmThreadCharacteristicsA_napi));
    exports.Set("windowssys_windows_win32_system_threading_AvSetMmThreadCharacteristicsW", Napi::Function::New(env, windowssys_windows_win32_system_threading_AvSetMmThreadCharacteristicsW_napi));
    exports.Set("windowssys_windows_win32_system_threading_AvSetMmThreadPriority", Napi::Function::New(env, windowssys_windows_win32_system_threading_AvSetMmThreadPriority_napi));
    exports.Set("windowssys_windows_win32_system_threading_CallbackMayRunLong", Napi::Function::New(env, windowssys_windows_win32_system_threading_CallbackMayRunLong_napi));
    exports.Set("windowssys_windows_win32_system_threading_CancelThreadpoolIo", Napi::Function::New(env, windowssys_windows_win32_system_threading_CancelThreadpoolIo_napi));
    exports.Set("windowssys_windows_win32_system_threading_CancelTimerQueueTimer", Napi::Function::New(env, windowssys_windows_win32_system_threading_CancelTimerQueueTimer_napi));
    exports.Set("windowssys_windows_win32_system_threading_CancelWaitableTimer", Napi::Function::New(env, windowssys_windows_win32_system_threading_CancelWaitableTimer_napi));
    exports.Set("windowssys_windows_win32_system_threading_ChangeTimerQueueTimer", Napi::Function::New(env, windowssys_windows_win32_system_threading_ChangeTimerQueueTimer_napi));
    exports.Set("windowssys_windows_win32_system_threading_ClosePrivateNamespace", Napi::Function::New(env, windowssys_windows_win32_system_threading_ClosePrivateNamespace_napi));
    exports.Set("windowssys_windows_win32_system_threading_CloseThreadpool", Napi::Function::New(env, windowssys_windows_win32_system_threading_CloseThreadpool_napi));
    exports.Set("windowssys_windows_win32_system_threading_CloseThreadpoolCleanupGroup", Napi::Function::New(env, windowssys_windows_win32_system_threading_CloseThreadpoolCleanupGroup_napi));
    exports.Set("windowssys_windows_win32_system_threading_CloseThreadpoolCleanupGroupMembers", Napi::Function::New(env, windowssys_windows_win32_system_threading_CloseThreadpoolCleanupGroupMembers_napi));
    exports.Set("windowssys_windows_win32_system_threading_CloseThreadpoolIo", Napi::Function::New(env, windowssys_windows_win32_system_threading_CloseThreadpoolIo_napi));
    exports.Set("windowssys_windows_win32_system_threading_CloseThreadpoolTimer", Napi::Function::New(env, windowssys_windows_win32_system_threading_CloseThreadpoolTimer_napi));
    exports.Set("windowssys_windows_win32_system_threading_CloseThreadpoolWait", Napi::Function::New(env, windowssys_windows_win32_system_threading_CloseThreadpoolWait_napi));
    exports.Set("windowssys_windows_win32_system_threading_CloseThreadpoolWork", Napi::Function::New(env, windowssys_windows_win32_system_threading_CloseThreadpoolWork_napi));
    exports.Set("windowssys_windows_win32_system_threading_ConvertFiberToThread", Napi::Function::New(env, windowssys_windows_win32_system_threading_ConvertFiberToThread_napi));
    exports.Set("windowssys_windows_win32_system_threading_ConvertThreadToFiber", Napi::Function::New(env, windowssys_windows_win32_system_threading_ConvertThreadToFiber_napi));
    exports.Set("windowssys_windows_win32_system_threading_ConvertThreadToFiberEx", Napi::Function::New(env, windowssys_windows_win32_system_threading_ConvertThreadToFiberEx_napi));
    exports.Set("windowssys_windows_win32_system_threading_CreateBoundaryDescriptorA", Napi::Function::New(env, windowssys_windows_win32_system_threading_CreateBoundaryDescriptorA_napi));
    exports.Set("windowssys_windows_win32_system_threading_CreateBoundaryDescriptorW", Napi::Function::New(env, windowssys_windows_win32_system_threading_CreateBoundaryDescriptorW_napi));
    exports.Set("windowssys_windows_win32_system_threading_CreateEventA", Napi::Function::New(env, windowssys_windows_win32_system_threading_CreateEventA_napi));
    exports.Set("windowssys_windows_win32_system_threading_CreateEventExA", Napi::Function::New(env, windowssys_windows_win32_system_threading_CreateEventExA_napi));
    exports.Set("windowssys_windows_win32_system_threading_CreateEventExW", Napi::Function::New(env, windowssys_windows_win32_system_threading_CreateEventExW_napi));
    exports.Set("windowssys_windows_win32_system_threading_CreateEventW", Napi::Function::New(env, windowssys_windows_win32_system_threading_CreateEventW_napi));
    exports.Set("windowssys_windows_win32_system_threading_CreateFiber", Napi::Function::New(env, windowssys_windows_win32_system_threading_CreateFiber_napi));
    exports.Set("windowssys_windows_win32_system_threading_CreateFiberEx", Napi::Function::New(env, windowssys_windows_win32_system_threading_CreateFiberEx_napi));
    exports.Set("windowssys_windows_win32_system_threading_CreateMutexA", Napi::Function::New(env, windowssys_windows_win32_system_threading_CreateMutexA_napi));
    exports.Set("windowssys_windows_win32_system_threading_CreateMutexExA", Napi::Function::New(env, windowssys_windows_win32_system_threading_CreateMutexExA_napi));
    exports.Set("windowssys_windows_win32_system_threading_CreateMutexExW", Napi::Function::New(env, windowssys_windows_win32_system_threading_CreateMutexExW_napi));
    exports.Set("windowssys_windows_win32_system_threading_CreateMutexW", Napi::Function::New(env, windowssys_windows_win32_system_threading_CreateMutexW_napi));
    exports.Set("windowssys_windows_win32_system_threading_CreatePrivateNamespaceA", Napi::Function::New(env, windowssys_windows_win32_system_threading_CreatePrivateNamespaceA_napi));
    exports.Set("windowssys_windows_win32_system_threading_CreatePrivateNamespaceW", Napi::Function::New(env, windowssys_windows_win32_system_threading_CreatePrivateNamespaceW_napi));
    exports.Set("windowssys_windows_win32_system_threading_CreateProcessA", Napi::Function::New(env, windowssys_windows_win32_system_threading_CreateProcessA_napi));
    exports.Set("windowssys_windows_win32_system_threading_CreateProcessAsUserA", Napi::Function::New(env, windowssys_windows_win32_system_threading_CreateProcessAsUserA_napi));
    exports.Set("windowssys_windows_win32_system_threading_CreateProcessAsUserW", Napi::Function::New(env, windowssys_windows_win32_system_threading_CreateProcessAsUserW_napi));
    exports.Set("windowssys_windows_win32_system_threading_CreateProcessW", Napi::Function::New(env, windowssys_windows_win32_system_threading_CreateProcessW_napi));
    exports.Set("windowssys_windows_win32_system_threading_CreateProcessWithLogonW", Napi::Function::New(env, windowssys_windows_win32_system_threading_CreateProcessWithLogonW_napi));
    exports.Set("windowssys_windows_win32_system_threading_CreateProcessWithTokenW", Napi::Function::New(env, windowssys_windows_win32_system_threading_CreateProcessWithTokenW_napi));
    exports.Set("windowssys_windows_win32_system_threading_CreateRemoteThread", Napi::Function::New(env, windowssys_windows_win32_system_threading_CreateRemoteThread_napi));
    exports.Set("windowssys_windows_win32_system_threading_CreateRemoteThreadEx", Napi::Function::New(env, windowssys_windows_win32_system_threading_CreateRemoteThreadEx_napi));
    exports.Set("windowssys_windows_win32_system_threading_CreateSemaphoreA", Napi::Function::New(env, windowssys_windows_win32_system_threading_CreateSemaphoreA_napi));
    exports.Set("windowssys_windows_win32_system_threading_CreateSemaphoreExA", Napi::Function::New(env, windowssys_windows_win32_system_threading_CreateSemaphoreExA_napi));
    exports.Set("windowssys_windows_win32_system_threading_CreateSemaphoreExW", Napi::Function::New(env, windowssys_windows_win32_system_threading_CreateSemaphoreExW_napi));
    exports.Set("windowssys_windows_win32_system_threading_CreateSemaphoreW", Napi::Function::New(env, windowssys_windows_win32_system_threading_CreateSemaphoreW_napi));
    exports.Set("windowssys_windows_win32_system_threading_CreateThread", Napi::Function::New(env, windowssys_windows_win32_system_threading_CreateThread_napi));
    exports.Set("windowssys_windows_win32_system_threading_CreateThreadpool", Napi::Function::New(env, windowssys_windows_win32_system_threading_CreateThreadpool_napi));
    exports.Set("windowssys_windows_win32_system_threading_CreateThreadpoolCleanupGroup", Napi::Function::New(env, windowssys_windows_win32_system_threading_CreateThreadpoolCleanupGroup_napi));
    exports.Set("windowssys_windows_win32_system_threading_CreateThreadpoolIo", Napi::Function::New(env, windowssys_windows_win32_system_threading_CreateThreadpoolIo_napi));
    exports.Set("windowssys_windows_win32_system_threading_CreateThreadpoolTimer", Napi::Function::New(env, windowssys_windows_win32_system_threading_CreateThreadpoolTimer_napi));
    exports.Set("windowssys_windows_win32_system_threading_CreateThreadpoolWait", Napi::Function::New(env, windowssys_windows_win32_system_threading_CreateThreadpoolWait_napi));
    exports.Set("windowssys_windows_win32_system_threading_CreateThreadpoolWork", Napi::Function::New(env, windowssys_windows_win32_system_threading_CreateThreadpoolWork_napi));
    exports.Set("windowssys_windows_win32_system_threading_CreateTimerQueue", Napi::Function::New(env, windowssys_windows_win32_system_threading_CreateTimerQueue_napi));
    exports.Set("windowssys_windows_win32_system_threading_CreateTimerQueueTimer", Napi::Function::New(env, windowssys_windows_win32_system_threading_CreateTimerQueueTimer_napi));
    exports.Set("windowssys_windows_win32_system_threading_CreateUmsCompletionList", Napi::Function::New(env, windowssys_windows_win32_system_threading_CreateUmsCompletionList_napi));
    exports.Set("windowssys_windows_win32_system_threading_CreateUmsThreadContext", Napi::Function::New(env, windowssys_windows_win32_system_threading_CreateUmsThreadContext_napi));
    exports.Set("windowssys_windows_win32_system_threading_CreateWaitableTimerA", Napi::Function::New(env, windowssys_windows_win32_system_threading_CreateWaitableTimerA_napi));
    exports.Set("windowssys_windows_win32_system_threading_CreateWaitableTimerExA", Napi::Function::New(env, windowssys_windows_win32_system_threading_CreateWaitableTimerExA_napi));
    exports.Set("windowssys_windows_win32_system_threading_CreateWaitableTimerExW", Napi::Function::New(env, windowssys_windows_win32_system_threading_CreateWaitableTimerExW_napi));
    exports.Set("windowssys_windows_win32_system_threading_CreateWaitableTimerW", Napi::Function::New(env, windowssys_windows_win32_system_threading_CreateWaitableTimerW_napi));
    exports.Set("windowssys_windows_win32_system_threading_DeleteBoundaryDescriptor", Napi::Function::New(env, windowssys_windows_win32_system_threading_DeleteBoundaryDescriptor_napi));
    exports.Set("windowssys_windows_win32_system_threading_DeleteCriticalSection", Napi::Function::New(env, windowssys_windows_win32_system_threading_DeleteCriticalSection_napi));
    exports.Set("windowssys_windows_win32_system_threading_DeleteFiber", Napi::Function::New(env, windowssys_windows_win32_system_threading_DeleteFiber_napi));
    exports.Set("windowssys_windows_win32_system_threading_DeleteProcThreadAttributeList", Napi::Function::New(env, windowssys_windows_win32_system_threading_DeleteProcThreadAttributeList_napi));
    exports.Set("windowssys_windows_win32_system_threading_DeleteSynchronizationBarrier", Napi::Function::New(env, windowssys_windows_win32_system_threading_DeleteSynchronizationBarrier_napi));
    exports.Set("windowssys_windows_win32_system_threading_DeleteTimerQueue", Napi::Function::New(env, windowssys_windows_win32_system_threading_DeleteTimerQueue_napi));
    exports.Set("windowssys_windows_win32_system_threading_DeleteTimerQueueEx", Napi::Function::New(env, windowssys_windows_win32_system_threading_DeleteTimerQueueEx_napi));
    exports.Set("windowssys_windows_win32_system_threading_DeleteTimerQueueTimer", Napi::Function::New(env, windowssys_windows_win32_system_threading_DeleteTimerQueueTimer_napi));
    exports.Set("windowssys_windows_win32_system_threading_DeleteUmsCompletionList", Napi::Function::New(env, windowssys_windows_win32_system_threading_DeleteUmsCompletionList_napi));
    exports.Set("windowssys_windows_win32_system_threading_DeleteUmsThreadContext", Napi::Function::New(env, windowssys_windows_win32_system_threading_DeleteUmsThreadContext_napi));
    exports.Set("windowssys_windows_win32_system_threading_DequeueUmsCompletionListItems", Napi::Function::New(env, windowssys_windows_win32_system_threading_DequeueUmsCompletionListItems_napi));
    exports.Set("windowssys_windows_win32_system_threading_DisassociateCurrentThreadFromCallback", Napi::Function::New(env, windowssys_windows_win32_system_threading_DisassociateCurrentThreadFromCallback_napi));
    exports.Set("windowssys_windows_win32_system_threading_EnterCriticalSection", Napi::Function::New(env, windowssys_windows_win32_system_threading_EnterCriticalSection_napi));
    exports.Set("windowssys_windows_win32_system_threading_EnterSynchronizationBarrier", Napi::Function::New(env, windowssys_windows_win32_system_threading_EnterSynchronizationBarrier_napi));
    exports.Set("windowssys_windows_win32_system_threading_EnterUmsSchedulingMode", Napi::Function::New(env, windowssys_windows_win32_system_threading_EnterUmsSchedulingMode_napi));
    exports.Set("windowssys_windows_win32_system_threading_ExecuteUmsThread", Napi::Function::New(env, windowssys_windows_win32_system_threading_ExecuteUmsThread_napi));
    exports.Set("windowssys_windows_win32_system_threading_ExitProcess", Napi::Function::New(env, windowssys_windows_win32_system_threading_ExitProcess_napi));
    exports.Set("windowssys_windows_win32_system_threading_ExitThread", Napi::Function::New(env, windowssys_windows_win32_system_threading_ExitThread_napi));
    exports.Set("windowssys_windows_win32_system_threading_FlsAlloc", Napi::Function::New(env, windowssys_windows_win32_system_threading_FlsAlloc_napi));
    exports.Set("windowssys_windows_win32_system_threading_FlsFree", Napi::Function::New(env, windowssys_windows_win32_system_threading_FlsFree_napi));
    exports.Set("windowssys_windows_win32_system_threading_FlsGetValue", Napi::Function::New(env, windowssys_windows_win32_system_threading_FlsGetValue_napi));
    exports.Set("windowssys_windows_win32_system_threading_FlsSetValue", Napi::Function::New(env, windowssys_windows_win32_system_threading_FlsSetValue_napi));
    exports.Set("windowssys_windows_win32_system_threading_FlushProcessWriteBuffers", Napi::Function::New(env, windowssys_windows_win32_system_threading_FlushProcessWriteBuffers_napi));
    exports.Set("windowssys_windows_win32_system_threading_FreeLibraryWhenCallbackReturns", Napi::Function::New(env, windowssys_windows_win32_system_threading_FreeLibraryWhenCallbackReturns_napi));
    exports.Set("windowssys_windows_win32_system_threading_GetActiveProcessorCount", Napi::Function::New(env, windowssys_windows_win32_system_threading_GetActiveProcessorCount_napi));
    exports.Set("windowssys_windows_win32_system_threading_GetActiveProcessorGroupCount", Napi::Function::New(env, windowssys_windows_win32_system_threading_GetActiveProcessorGroupCount_napi));
    exports.Set("windowssys_windows_win32_system_threading_GetCurrentProcess", Napi::Function::New(env, windowssys_windows_win32_system_threading_GetCurrentProcess_napi));
    exports.Set("windowssys_windows_win32_system_threading_GetCurrentProcessId", Napi::Function::New(env, windowssys_windows_win32_system_threading_GetCurrentProcessId_napi));
    exports.Set("windowssys_windows_win32_system_threading_GetCurrentProcessorNumber", Napi::Function::New(env, windowssys_windows_win32_system_threading_GetCurrentProcessorNumber_napi));
    exports.Set("windowssys_windows_win32_system_threading_GetCurrentProcessorNumberEx", Napi::Function::New(env, windowssys_windows_win32_system_threading_GetCurrentProcessorNumberEx_napi));
    exports.Set("windowssys_windows_win32_system_threading_GetCurrentThread", Napi::Function::New(env, windowssys_windows_win32_system_threading_GetCurrentThread_napi));
    exports.Set("windowssys_windows_win32_system_threading_GetCurrentThreadId", Napi::Function::New(env, windowssys_windows_win32_system_threading_GetCurrentThreadId_napi));
    exports.Set("windowssys_windows_win32_system_threading_GetCurrentThreadStackLimits", Napi::Function::New(env, windowssys_windows_win32_system_threading_GetCurrentThreadStackLimits_napi));
    exports.Set("windowssys_windows_win32_system_threading_GetCurrentUmsThread", Napi::Function::New(env, windowssys_windows_win32_system_threading_GetCurrentUmsThread_napi));
    exports.Set("windowssys_windows_win32_system_threading_GetExitCodeProcess", Napi::Function::New(env, windowssys_windows_win32_system_threading_GetExitCodeProcess_napi));
    exports.Set("windowssys_windows_win32_system_threading_GetExitCodeThread", Napi::Function::New(env, windowssys_windows_win32_system_threading_GetExitCodeThread_napi));
    exports.Set("windowssys_windows_win32_system_threading_GetGuiResources", Napi::Function::New(env, windowssys_windows_win32_system_threading_GetGuiResources_napi));
    exports.Set("windowssys_windows_win32_system_threading_GetMachineTypeAttributes", Napi::Function::New(env, windowssys_windows_win32_system_threading_GetMachineTypeAttributes_napi));
    exports.Set("windowssys_windows_win32_system_threading_GetMaximumProcessorCount", Napi::Function::New(env, windowssys_windows_win32_system_threading_GetMaximumProcessorCount_napi));
    exports.Set("windowssys_windows_win32_system_threading_GetMaximumProcessorGroupCount", Napi::Function::New(env, windowssys_windows_win32_system_threading_GetMaximumProcessorGroupCount_napi));
    exports.Set("windowssys_windows_win32_system_threading_GetNextUmsListItem", Napi::Function::New(env, windowssys_windows_win32_system_threading_GetNextUmsListItem_napi));
    exports.Set("windowssys_windows_win32_system_threading_GetNumaAvailableMemoryNode", Napi::Function::New(env, windowssys_windows_win32_system_threading_GetNumaAvailableMemoryNode_napi));
    exports.Set("windowssys_windows_win32_system_threading_GetNumaAvailableMemoryNodeEx", Napi::Function::New(env, windowssys_windows_win32_system_threading_GetNumaAvailableMemoryNodeEx_napi));
    exports.Set("windowssys_windows_win32_system_threading_GetNumaHighestNodeNumber", Napi::Function::New(env, windowssys_windows_win32_system_threading_GetNumaHighestNodeNumber_napi));
    exports.Set("windowssys_windows_win32_system_threading_GetNumaNodeNumberFromHandle", Napi::Function::New(env, windowssys_windows_win32_system_threading_GetNumaNodeNumberFromHandle_napi));
    exports.Set("windowssys_windows_win32_system_threading_GetNumaNodeProcessorMask", Napi::Function::New(env, windowssys_windows_win32_system_threading_GetNumaNodeProcessorMask_napi));
    exports.Set("windowssys_windows_win32_system_threading_GetNumaNodeProcessorMask2", Napi::Function::New(env, windowssys_windows_win32_system_threading_GetNumaNodeProcessorMask2_napi));
    exports.Set("windowssys_windows_win32_system_threading_GetNumaNodeProcessorMaskEx", Napi::Function::New(env, windowssys_windows_win32_system_threading_GetNumaNodeProcessorMaskEx_napi));
    exports.Set("windowssys_windows_win32_system_threading_GetNumaProcessorNode", Napi::Function::New(env, windowssys_windows_win32_system_threading_GetNumaProcessorNode_napi));
    exports.Set("windowssys_windows_win32_system_threading_GetNumaProcessorNodeEx", Napi::Function::New(env, windowssys_windows_win32_system_threading_GetNumaProcessorNodeEx_napi));
    exports.Set("windowssys_windows_win32_system_threading_GetNumaProximityNode", Napi::Function::New(env, windowssys_windows_win32_system_threading_GetNumaProximityNode_napi));
    exports.Set("windowssys_windows_win32_system_threading_GetNumaProximityNodeEx", Napi::Function::New(env, windowssys_windows_win32_system_threading_GetNumaProximityNodeEx_napi));
    exports.Set("windowssys_windows_win32_system_threading_GetPriorityClass", Napi::Function::New(env, windowssys_windows_win32_system_threading_GetPriorityClass_napi));
    exports.Set("windowssys_windows_win32_system_threading_GetProcessAffinityMask", Napi::Function::New(env, windowssys_windows_win32_system_threading_GetProcessAffinityMask_napi));
    exports.Set("windowssys_windows_win32_system_threading_GetProcessDEPPolicy", Napi::Function::New(env, windowssys_windows_win32_system_threading_GetProcessDEPPolicy_napi));
    exports.Set("windowssys_windows_win32_system_threading_GetProcessDefaultCpuSetMasks", Napi::Function::New(env, windowssys_windows_win32_system_threading_GetProcessDefaultCpuSetMasks_napi));
    exports.Set("windowssys_windows_win32_system_threading_GetProcessDefaultCpuSets", Napi::Function::New(env, windowssys_windows_win32_system_threading_GetProcessDefaultCpuSets_napi));
    exports.Set("windowssys_windows_win32_system_threading_GetProcessGroupAffinity", Napi::Function::New(env, windowssys_windows_win32_system_threading_GetProcessGroupAffinity_napi));
    exports.Set("windowssys_windows_win32_system_threading_GetProcessHandleCount", Napi::Function::New(env, windowssys_windows_win32_system_threading_GetProcessHandleCount_napi));
    exports.Set("windowssys_windows_win32_system_threading_GetProcessHandleFromHwnd", Napi::Function::New(env, windowssys_windows_win32_system_threading_GetProcessHandleFromHwnd_napi));
    exports.Set("windowssys_windows_win32_system_threading_GetProcessId", Napi::Function::New(env, windowssys_windows_win32_system_threading_GetProcessId_napi));
    exports.Set("windowssys_windows_win32_system_threading_GetProcessIdOfThread", Napi::Function::New(env, windowssys_windows_win32_system_threading_GetProcessIdOfThread_napi));
    exports.Set("windowssys_windows_win32_system_threading_GetProcessInformation", Napi::Function::New(env, windowssys_windows_win32_system_threading_GetProcessInformation_napi));
    exports.Set("windowssys_windows_win32_system_threading_GetProcessIoCounters", Napi::Function::New(env, windowssys_windows_win32_system_threading_GetProcessIoCounters_napi));
    exports.Set("windowssys_windows_win32_system_threading_GetProcessMitigationPolicy", Napi::Function::New(env, windowssys_windows_win32_system_threading_GetProcessMitigationPolicy_napi));
    exports.Set("windowssys_windows_win32_system_threading_GetProcessPriorityBoost", Napi::Function::New(env, windowssys_windows_win32_system_threading_GetProcessPriorityBoost_napi));
    exports.Set("windowssys_windows_win32_system_threading_GetProcessShutdownParameters", Napi::Function::New(env, windowssys_windows_win32_system_threading_GetProcessShutdownParameters_napi));
    exports.Set("windowssys_windows_win32_system_threading_GetProcessTimes", Napi::Function::New(env, windowssys_windows_win32_system_threading_GetProcessTimes_napi));
    exports.Set("windowssys_windows_win32_system_threading_GetProcessVersion", Napi::Function::New(env, windowssys_windows_win32_system_threading_GetProcessVersion_napi));
    exports.Set("windowssys_windows_win32_system_threading_GetProcessWorkingSetSize", Napi::Function::New(env, windowssys_windows_win32_system_threading_GetProcessWorkingSetSize_napi));
    exports.Set("windowssys_windows_win32_system_threading_GetStartupInfoA", Napi::Function::New(env, windowssys_windows_win32_system_threading_GetStartupInfoA_napi));
    exports.Set("windowssys_windows_win32_system_threading_GetStartupInfoW", Napi::Function::New(env, windowssys_windows_win32_system_threading_GetStartupInfoW_napi));
    exports.Set("windowssys_windows_win32_system_threading_GetSystemTimes", Napi::Function::New(env, windowssys_windows_win32_system_threading_GetSystemTimes_napi));
    exports.Set("windowssys_windows_win32_system_threading_GetThreadDescription", Napi::Function::New(env, windowssys_windows_win32_system_threading_GetThreadDescription_napi));
    exports.Set("windowssys_windows_win32_system_threading_GetThreadGroupAffinity", Napi::Function::New(env, windowssys_windows_win32_system_threading_GetThreadGroupAffinity_napi));
    exports.Set("windowssys_windows_win32_system_threading_GetThreadIOPendingFlag", Napi::Function::New(env, windowssys_windows_win32_system_threading_GetThreadIOPendingFlag_napi));
    exports.Set("windowssys_windows_win32_system_threading_GetThreadId", Napi::Function::New(env, windowssys_windows_win32_system_threading_GetThreadId_napi));
    exports.Set("windowssys_windows_win32_system_threading_GetThreadIdealProcessorEx", Napi::Function::New(env, windowssys_windows_win32_system_threading_GetThreadIdealProcessorEx_napi));
    exports.Set("windowssys_windows_win32_system_threading_GetThreadInformation", Napi::Function::New(env, windowssys_windows_win32_system_threading_GetThreadInformation_napi));
    exports.Set("windowssys_windows_win32_system_threading_GetThreadPriority", Napi::Function::New(env, windowssys_windows_win32_system_threading_GetThreadPriority_napi));
    exports.Set("windowssys_windows_win32_system_threading_GetThreadPriorityBoost", Napi::Function::New(env, windowssys_windows_win32_system_threading_GetThreadPriorityBoost_napi));
    exports.Set("windowssys_windows_win32_system_threading_GetThreadSelectedCpuSetMasks", Napi::Function::New(env, windowssys_windows_win32_system_threading_GetThreadSelectedCpuSetMasks_napi));
    exports.Set("windowssys_windows_win32_system_threading_GetThreadSelectedCpuSets", Napi::Function::New(env, windowssys_windows_win32_system_threading_GetThreadSelectedCpuSets_napi));
    exports.Set("windowssys_windows_win32_system_threading_GetThreadTimes", Napi::Function::New(env, windowssys_windows_win32_system_threading_GetThreadTimes_napi));
    exports.Set("windowssys_windows_win32_system_threading_GetUmsCompletionListEvent", Napi::Function::New(env, windowssys_windows_win32_system_threading_GetUmsCompletionListEvent_napi));
    exports.Set("windowssys_windows_win32_system_threading_GetUmsSystemThreadInformation", Napi::Function::New(env, windowssys_windows_win32_system_threading_GetUmsSystemThreadInformation_napi));
    exports.Set("windowssys_windows_win32_system_threading_InitOnceBeginInitialize", Napi::Function::New(env, windowssys_windows_win32_system_threading_InitOnceBeginInitialize_napi));
    exports.Set("windowssys_windows_win32_system_threading_InitOnceComplete", Napi::Function::New(env, windowssys_windows_win32_system_threading_InitOnceComplete_napi));
    exports.Set("windowssys_windows_win32_system_threading_InitOnceExecuteOnce", Napi::Function::New(env, windowssys_windows_win32_system_threading_InitOnceExecuteOnce_napi));
    exports.Set("windowssys_windows_win32_system_threading_InitOnceInitialize", Napi::Function::New(env, windowssys_windows_win32_system_threading_InitOnceInitialize_napi));
    exports.Set("windowssys_windows_win32_system_threading_InitializeConditionVariable", Napi::Function::New(env, windowssys_windows_win32_system_threading_InitializeConditionVariable_napi));
    exports.Set("windowssys_windows_win32_system_threading_InitializeCriticalSection", Napi::Function::New(env, windowssys_windows_win32_system_threading_InitializeCriticalSection_napi));
    exports.Set("windowssys_windows_win32_system_threading_InitializeCriticalSectionAndSpinCount", Napi::Function::New(env, windowssys_windows_win32_system_threading_InitializeCriticalSectionAndSpinCount_napi));
    exports.Set("windowssys_windows_win32_system_threading_InitializeCriticalSectionEx", Napi::Function::New(env, windowssys_windows_win32_system_threading_InitializeCriticalSectionEx_napi));
    exports.Set("windowssys_windows_win32_system_threading_InitializeProcThreadAttributeList", Napi::Function::New(env, windowssys_windows_win32_system_threading_InitializeProcThreadAttributeList_napi));
    exports.Set("windowssys_windows_win32_system_threading_InitializeSListHead", Napi::Function::New(env, windowssys_windows_win32_system_threading_InitializeSListHead_napi));
    exports.Set("windowssys_windows_win32_system_threading_InitializeSRWLock", Napi::Function::New(env, windowssys_windows_win32_system_threading_InitializeSRWLock_napi));
    exports.Set("windowssys_windows_win32_system_threading_InitializeSynchronizationBarrier", Napi::Function::New(env, windowssys_windows_win32_system_threading_InitializeSynchronizationBarrier_napi));
    exports.Set("windowssys_windows_win32_system_threading_InterlockedFlushSList", Napi::Function::New(env, windowssys_windows_win32_system_threading_InterlockedFlushSList_napi));
    exports.Set("windowssys_windows_win32_system_threading_InterlockedPopEntrySList", Napi::Function::New(env, windowssys_windows_win32_system_threading_InterlockedPopEntrySList_napi));
    exports.Set("windowssys_windows_win32_system_threading_InterlockedPushEntrySList", Napi::Function::New(env, windowssys_windows_win32_system_threading_InterlockedPushEntrySList_napi));
    exports.Set("windowssys_windows_win32_system_threading_InterlockedPushListSListEx", Napi::Function::New(env, windowssys_windows_win32_system_threading_InterlockedPushListSListEx_napi));
    exports.Set("windowssys_windows_win32_system_threading_IsImmersiveProcess", Napi::Function::New(env, windowssys_windows_win32_system_threading_IsImmersiveProcess_napi));
    exports.Set("windowssys_windows_win32_system_threading_IsProcessCritical", Napi::Function::New(env, windowssys_windows_win32_system_threading_IsProcessCritical_napi));
    exports.Set("windowssys_windows_win32_system_threading_IsProcessorFeaturePresent", Napi::Function::New(env, windowssys_windows_win32_system_threading_IsProcessorFeaturePresent_napi));
    exports.Set("windowssys_windows_win32_system_threading_IsThreadAFiber", Napi::Function::New(env, windowssys_windows_win32_system_threading_IsThreadAFiber_napi));
    exports.Set("windowssys_windows_win32_system_threading_IsThreadpoolTimerSet", Napi::Function::New(env, windowssys_windows_win32_system_threading_IsThreadpoolTimerSet_napi));
    exports.Set("windowssys_windows_win32_system_threading_IsWow64Process", Napi::Function::New(env, windowssys_windows_win32_system_threading_IsWow64Process_napi));
    exports.Set("windowssys_windows_win32_system_threading_IsWow64Process2", Napi::Function::New(env, windowssys_windows_win32_system_threading_IsWow64Process2_napi));
    exports.Set("windowssys_windows_win32_system_threading_LeaveCriticalSection", Napi::Function::New(env, windowssys_windows_win32_system_threading_LeaveCriticalSection_napi));
    exports.Set("windowssys_windows_win32_system_threading_LeaveCriticalSectionWhenCallbackReturns", Napi::Function::New(env, windowssys_windows_win32_system_threading_LeaveCriticalSectionWhenCallbackReturns_napi));
    exports.Set("windowssys_windows_win32_system_threading_OpenEventA", Napi::Function::New(env, windowssys_windows_win32_system_threading_OpenEventA_napi));
    exports.Set("windowssys_windows_win32_system_threading_OpenEventW", Napi::Function::New(env, windowssys_windows_win32_system_threading_OpenEventW_napi));
    exports.Set("windowssys_windows_win32_system_threading_OpenMutexW", Napi::Function::New(env, windowssys_windows_win32_system_threading_OpenMutexW_napi));
    exports.Set("windowssys_windows_win32_system_threading_OpenPrivateNamespaceA", Napi::Function::New(env, windowssys_windows_win32_system_threading_OpenPrivateNamespaceA_napi));
    exports.Set("windowssys_windows_win32_system_threading_OpenPrivateNamespaceW", Napi::Function::New(env, windowssys_windows_win32_system_threading_OpenPrivateNamespaceW_napi));
    exports.Set("windowssys_windows_win32_system_threading_OpenProcess", Napi::Function::New(env, windowssys_windows_win32_system_threading_OpenProcess_napi));
    exports.Set("windowssys_windows_win32_system_threading_OpenProcessToken", Napi::Function::New(env, windowssys_windows_win32_system_threading_OpenProcessToken_napi));
    exports.Set("windowssys_windows_win32_system_threading_OpenSemaphoreW", Napi::Function::New(env, windowssys_windows_win32_system_threading_OpenSemaphoreW_napi));
    exports.Set("windowssys_windows_win32_system_threading_OpenThread", Napi::Function::New(env, windowssys_windows_win32_system_threading_OpenThread_napi));
    exports.Set("windowssys_windows_win32_system_threading_OpenThreadToken", Napi::Function::New(env, windowssys_windows_win32_system_threading_OpenThreadToken_napi));
    exports.Set("windowssys_windows_win32_system_threading_OpenWaitableTimerA", Napi::Function::New(env, windowssys_windows_win32_system_threading_OpenWaitableTimerA_napi));
    exports.Set("windowssys_windows_win32_system_threading_OpenWaitableTimerW", Napi::Function::New(env, windowssys_windows_win32_system_threading_OpenWaitableTimerW_napi));
    exports.Set("windowssys_windows_win32_system_threading_PulseEvent", Napi::Function::New(env, windowssys_windows_win32_system_threading_PulseEvent_napi));
    exports.Set("windowssys_windows_win32_system_threading_QueryDepthSList", Napi::Function::New(env, windowssys_windows_win32_system_threading_QueryDepthSList_napi));
    exports.Set("windowssys_windows_win32_system_threading_QueryFullProcessImageNameA", Napi::Function::New(env, windowssys_windows_win32_system_threading_QueryFullProcessImageNameA_napi));
    exports.Set("windowssys_windows_win32_system_threading_QueryFullProcessImageNameW", Napi::Function::New(env, windowssys_windows_win32_system_threading_QueryFullProcessImageNameW_napi));
    exports.Set("windowssys_windows_win32_system_threading_QueryProcessAffinityUpdateMode", Napi::Function::New(env, windowssys_windows_win32_system_threading_QueryProcessAffinityUpdateMode_napi));
    exports.Set("windowssys_windows_win32_system_threading_QueryProtectedPolicy", Napi::Function::New(env, windowssys_windows_win32_system_threading_QueryProtectedPolicy_napi));
    exports.Set("windowssys_windows_win32_system_threading_QueryThreadpoolStackInformation", Napi::Function::New(env, windowssys_windows_win32_system_threading_QueryThreadpoolStackInformation_napi));
    exports.Set("windowssys_windows_win32_system_threading_QueryUmsThreadInformation", Napi::Function::New(env, windowssys_windows_win32_system_threading_QueryUmsThreadInformation_napi));
    exports.Set("windowssys_windows_win32_system_threading_QueueUserWorkItem", Napi::Function::New(env, windowssys_windows_win32_system_threading_QueueUserWorkItem_napi));
    exports.Set("windowssys_windows_win32_system_threading_RegisterWaitForSingleObject", Napi::Function::New(env, windowssys_windows_win32_system_threading_RegisterWaitForSingleObject_napi));
    exports.Set("windowssys_windows_win32_system_threading_ReleaseMutex", Napi::Function::New(env, windowssys_windows_win32_system_threading_ReleaseMutex_napi));
    exports.Set("windowssys_windows_win32_system_threading_ReleaseMutexWhenCallbackReturns", Napi::Function::New(env, windowssys_windows_win32_system_threading_ReleaseMutexWhenCallbackReturns_napi));
    exports.Set("windowssys_windows_win32_system_threading_ReleaseSRWLockExclusive", Napi::Function::New(env, windowssys_windows_win32_system_threading_ReleaseSRWLockExclusive_napi));
    exports.Set("windowssys_windows_win32_system_threading_ReleaseSRWLockShared", Napi::Function::New(env, windowssys_windows_win32_system_threading_ReleaseSRWLockShared_napi));
    exports.Set("windowssys_windows_win32_system_threading_ReleaseSemaphore", Napi::Function::New(env, windowssys_windows_win32_system_threading_ReleaseSemaphore_napi));
    exports.Set("windowssys_windows_win32_system_threading_ReleaseSemaphoreWhenCallbackReturns", Napi::Function::New(env, windowssys_windows_win32_system_threading_ReleaseSemaphoreWhenCallbackReturns_napi));
    exports.Set("windowssys_windows_win32_system_threading_ResetEvent", Napi::Function::New(env, windowssys_windows_win32_system_threading_ResetEvent_napi));
    exports.Set("windowssys_windows_win32_system_threading_ResumeThread", Napi::Function::New(env, windowssys_windows_win32_system_threading_ResumeThread_napi));
    exports.Set("windowssys_windows_win32_system_threading_RtwqAddPeriodicCallback", Napi::Function::New(env, windowssys_windows_win32_system_threading_RtwqAddPeriodicCallback_napi));
    exports.Set("windowssys_windows_win32_system_threading_RtwqAllocateSerialWorkQueue", Napi::Function::New(env, windowssys_windows_win32_system_threading_RtwqAllocateSerialWorkQueue_napi));
    exports.Set("windowssys_windows_win32_system_threading_RtwqAllocateWorkQueue", Napi::Function::New(env, windowssys_windows_win32_system_threading_RtwqAllocateWorkQueue_napi));
    exports.Set("windowssys_windows_win32_system_threading_RtwqBeginRegisterWorkQueueWithMMCSS", Napi::Function::New(env, windowssys_windows_win32_system_threading_RtwqBeginRegisterWorkQueueWithMMCSS_napi));
    exports.Set("windowssys_windows_win32_system_threading_RtwqBeginUnregisterWorkQueueWithMMCSS", Napi::Function::New(env, windowssys_windows_win32_system_threading_RtwqBeginUnregisterWorkQueueWithMMCSS_napi));
    exports.Set("windowssys_windows_win32_system_threading_RtwqCancelDeadline", Napi::Function::New(env, windowssys_windows_win32_system_threading_RtwqCancelDeadline_napi));
    exports.Set("windowssys_windows_win32_system_threading_RtwqCancelWorkItem", Napi::Function::New(env, windowssys_windows_win32_system_threading_RtwqCancelWorkItem_napi));
    exports.Set("windowssys_windows_win32_system_threading_RtwqCreateAsyncResult", Napi::Function::New(env, windowssys_windows_win32_system_threading_RtwqCreateAsyncResult_napi));
    exports.Set("windowssys_windows_win32_system_threading_RtwqEndRegisterWorkQueueWithMMCSS", Napi::Function::New(env, windowssys_windows_win32_system_threading_RtwqEndRegisterWorkQueueWithMMCSS_napi));
    exports.Set("windowssys_windows_win32_system_threading_RtwqGetWorkQueueMMCSSClass", Napi::Function::New(env, windowssys_windows_win32_system_threading_RtwqGetWorkQueueMMCSSClass_napi));
    exports.Set("windowssys_windows_win32_system_threading_RtwqGetWorkQueueMMCSSPriority", Napi::Function::New(env, windowssys_windows_win32_system_threading_RtwqGetWorkQueueMMCSSPriority_napi));
    exports.Set("windowssys_windows_win32_system_threading_RtwqGetWorkQueueMMCSSTaskId", Napi::Function::New(env, windowssys_windows_win32_system_threading_RtwqGetWorkQueueMMCSSTaskId_napi));
    exports.Set("windowssys_windows_win32_system_threading_RtwqInvokeCallback", Napi::Function::New(env, windowssys_windows_win32_system_threading_RtwqInvokeCallback_napi));
    exports.Set("windowssys_windows_win32_system_threading_RtwqJoinWorkQueue", Napi::Function::New(env, windowssys_windows_win32_system_threading_RtwqJoinWorkQueue_napi));
    exports.Set("windowssys_windows_win32_system_threading_RtwqLockPlatform", Napi::Function::New(env, windowssys_windows_win32_system_threading_RtwqLockPlatform_napi));
    exports.Set("windowssys_windows_win32_system_threading_RtwqLockSharedWorkQueue", Napi::Function::New(env, windowssys_windows_win32_system_threading_RtwqLockSharedWorkQueue_napi));
    exports.Set("windowssys_windows_win32_system_threading_RtwqLockWorkQueue", Napi::Function::New(env, windowssys_windows_win32_system_threading_RtwqLockWorkQueue_napi));
    exports.Set("windowssys_windows_win32_system_threading_RtwqPutWaitingWorkItem", Napi::Function::New(env, windowssys_windows_win32_system_threading_RtwqPutWaitingWorkItem_napi));
    exports.Set("windowssys_windows_win32_system_threading_RtwqPutWorkItem", Napi::Function::New(env, windowssys_windows_win32_system_threading_RtwqPutWorkItem_napi));
    exports.Set("windowssys_windows_win32_system_threading_RtwqRegisterPlatformEvents", Napi::Function::New(env, windowssys_windows_win32_system_threading_RtwqRegisterPlatformEvents_napi));
    exports.Set("windowssys_windows_win32_system_threading_RtwqRegisterPlatformWithMMCSS", Napi::Function::New(env, windowssys_windows_win32_system_threading_RtwqRegisterPlatformWithMMCSS_napi));
    exports.Set("windowssys_windows_win32_system_threading_RtwqRemovePeriodicCallback", Napi::Function::New(env, windowssys_windows_win32_system_threading_RtwqRemovePeriodicCallback_napi));
    exports.Set("windowssys_windows_win32_system_threading_RtwqScheduleWorkItem", Napi::Function::New(env, windowssys_windows_win32_system_threading_RtwqScheduleWorkItem_napi));
    exports.Set("windowssys_windows_win32_system_threading_RtwqSetDeadline", Napi::Function::New(env, windowssys_windows_win32_system_threading_RtwqSetDeadline_napi));
    exports.Set("windowssys_windows_win32_system_threading_RtwqSetDeadline2", Napi::Function::New(env, windowssys_windows_win32_system_threading_RtwqSetDeadline2_napi));
    exports.Set("windowssys_windows_win32_system_threading_RtwqSetLongRunning", Napi::Function::New(env, windowssys_windows_win32_system_threading_RtwqSetLongRunning_napi));
    exports.Set("windowssys_windows_win32_system_threading_RtwqShutdown", Napi::Function::New(env, windowssys_windows_win32_system_threading_RtwqShutdown_napi));
    exports.Set("windowssys_windows_win32_system_threading_RtwqStartup", Napi::Function::New(env, windowssys_windows_win32_system_threading_RtwqStartup_napi));
    exports.Set("windowssys_windows_win32_system_threading_RtwqUnjoinWorkQueue", Napi::Function::New(env, windowssys_windows_win32_system_threading_RtwqUnjoinWorkQueue_napi));
    exports.Set("windowssys_windows_win32_system_threading_RtwqUnlockPlatform", Napi::Function::New(env, windowssys_windows_win32_system_threading_RtwqUnlockPlatform_napi));
    exports.Set("windowssys_windows_win32_system_threading_RtwqUnlockWorkQueue", Napi::Function::New(env, windowssys_windows_win32_system_threading_RtwqUnlockWorkQueue_napi));
    exports.Set("windowssys_windows_win32_system_threading_RtwqUnregisterPlatformEvents", Napi::Function::New(env, windowssys_windows_win32_system_threading_RtwqUnregisterPlatformEvents_napi));
    exports.Set("windowssys_windows_win32_system_threading_RtwqUnregisterPlatformFromMMCSS", Napi::Function::New(env, windowssys_windows_win32_system_threading_RtwqUnregisterPlatformFromMMCSS_napi));
    exports.Set("windowssys_windows_win32_system_threading_SetCriticalSectionSpinCount", Napi::Function::New(env, windowssys_windows_win32_system_threading_SetCriticalSectionSpinCount_napi));
    exports.Set("windowssys_windows_win32_system_threading_SetEvent", Napi::Function::New(env, windowssys_windows_win32_system_threading_SetEvent_napi));
    exports.Set("windowssys_windows_win32_system_threading_SetEventWhenCallbackReturns", Napi::Function::New(env, windowssys_windows_win32_system_threading_SetEventWhenCallbackReturns_napi));
    exports.Set("windowssys_windows_win32_system_threading_SetPriorityClass", Napi::Function::New(env, windowssys_windows_win32_system_threading_SetPriorityClass_napi));
    exports.Set("windowssys_windows_win32_system_threading_SetProcessAffinityMask", Napi::Function::New(env, windowssys_windows_win32_system_threading_SetProcessAffinityMask_napi));
    exports.Set("windowssys_windows_win32_system_threading_SetProcessAffinityUpdateMode", Napi::Function::New(env, windowssys_windows_win32_system_threading_SetProcessAffinityUpdateMode_napi));
    exports.Set("windowssys_windows_win32_system_threading_SetProcessDEPPolicy", Napi::Function::New(env, windowssys_windows_win32_system_threading_SetProcessDEPPolicy_napi));
    exports.Set("windowssys_windows_win32_system_threading_SetProcessDefaultCpuSetMasks", Napi::Function::New(env, windowssys_windows_win32_system_threading_SetProcessDefaultCpuSetMasks_napi));
    exports.Set("windowssys_windows_win32_system_threading_SetProcessDefaultCpuSets", Napi::Function::New(env, windowssys_windows_win32_system_threading_SetProcessDefaultCpuSets_napi));
    exports.Set("windowssys_windows_win32_system_threading_SetProcessDynamicEHContinuationTargets", Napi::Function::New(env, windowssys_windows_win32_system_threading_SetProcessDynamicEHContinuationTargets_napi));
    exports.Set("windowssys_windows_win32_system_threading_SetProcessDynamicEnforcedCetCompatibleRanges", Napi::Function::New(env, windowssys_windows_win32_system_threading_SetProcessDynamicEnforcedCetCompatibleRanges_napi));
    exports.Set("windowssys_windows_win32_system_threading_SetProcessInformation", Napi::Function::New(env, windowssys_windows_win32_system_threading_SetProcessInformation_napi));
    exports.Set("windowssys_windows_win32_system_threading_SetProcessMitigationPolicy", Napi::Function::New(env, windowssys_windows_win32_system_threading_SetProcessMitigationPolicy_napi));
    exports.Set("windowssys_windows_win32_system_threading_SetProcessPriorityBoost", Napi::Function::New(env, windowssys_windows_win32_system_threading_SetProcessPriorityBoost_napi));
    exports.Set("windowssys_windows_win32_system_threading_SetProcessRestrictionExemption", Napi::Function::New(env, windowssys_windows_win32_system_threading_SetProcessRestrictionExemption_napi));
    exports.Set("windowssys_windows_win32_system_threading_SetProcessShutdownParameters", Napi::Function::New(env, windowssys_windows_win32_system_threading_SetProcessShutdownParameters_napi));
    exports.Set("windowssys_windows_win32_system_threading_SetProcessWorkingSetSize", Napi::Function::New(env, windowssys_windows_win32_system_threading_SetProcessWorkingSetSize_napi));
    exports.Set("windowssys_windows_win32_system_threading_SetProtectedPolicy", Napi::Function::New(env, windowssys_windows_win32_system_threading_SetProtectedPolicy_napi));
    exports.Set("windowssys_windows_win32_system_threading_SetThreadAffinityMask", Napi::Function::New(env, windowssys_windows_win32_system_threading_SetThreadAffinityMask_napi));
    exports.Set("windowssys_windows_win32_system_threading_SetThreadDescription", Napi::Function::New(env, windowssys_windows_win32_system_threading_SetThreadDescription_napi));
    exports.Set("windowssys_windows_win32_system_threading_SetThreadGroupAffinity", Napi::Function::New(env, windowssys_windows_win32_system_threading_SetThreadGroupAffinity_napi));
    exports.Set("windowssys_windows_win32_system_threading_SetThreadIdealProcessor", Napi::Function::New(env, windowssys_windows_win32_system_threading_SetThreadIdealProcessor_napi));
    exports.Set("windowssys_windows_win32_system_threading_SetThreadIdealProcessorEx", Napi::Function::New(env, windowssys_windows_win32_system_threading_SetThreadIdealProcessorEx_napi));
    exports.Set("windowssys_windows_win32_system_threading_SetThreadInformation", Napi::Function::New(env, windowssys_windows_win32_system_threading_SetThreadInformation_napi));
    exports.Set("windowssys_windows_win32_system_threading_SetThreadPriority", Napi::Function::New(env, windowssys_windows_win32_system_threading_SetThreadPriority_napi));
    exports.Set("windowssys_windows_win32_system_threading_SetThreadPriorityBoost", Napi::Function::New(env, windowssys_windows_win32_system_threading_SetThreadPriorityBoost_napi));
    exports.Set("windowssys_windows_win32_system_threading_SetThreadSelectedCpuSetMasks", Napi::Function::New(env, windowssys_windows_win32_system_threading_SetThreadSelectedCpuSetMasks_napi));
    exports.Set("windowssys_windows_win32_system_threading_SetThreadSelectedCpuSets", Napi::Function::New(env, windowssys_windows_win32_system_threading_SetThreadSelectedCpuSets_napi));
    exports.Set("windowssys_windows_win32_system_threading_SetThreadStackGuarantee", Napi::Function::New(env, windowssys_windows_win32_system_threading_SetThreadStackGuarantee_napi));
    exports.Set("windowssys_windows_win32_system_threading_SetThreadToken", Napi::Function::New(env, windowssys_windows_win32_system_threading_SetThreadToken_napi));
    exports.Set("windowssys_windows_win32_system_threading_SetThreadpoolStackInformation", Napi::Function::New(env, windowssys_windows_win32_system_threading_SetThreadpoolStackInformation_napi));
    exports.Set("windowssys_windows_win32_system_threading_SetThreadpoolThreadMaximum", Napi::Function::New(env, windowssys_windows_win32_system_threading_SetThreadpoolThreadMaximum_napi));
    exports.Set("windowssys_windows_win32_system_threading_SetThreadpoolThreadMinimum", Napi::Function::New(env, windowssys_windows_win32_system_threading_SetThreadpoolThreadMinimum_napi));
    exports.Set("windowssys_windows_win32_system_threading_SetThreadpoolTimer", Napi::Function::New(env, windowssys_windows_win32_system_threading_SetThreadpoolTimer_napi));
    exports.Set("windowssys_windows_win32_system_threading_SetThreadpoolTimerEx", Napi::Function::New(env, windowssys_windows_win32_system_threading_SetThreadpoolTimerEx_napi));
    exports.Set("windowssys_windows_win32_system_threading_SetThreadpoolWait", Napi::Function::New(env, windowssys_windows_win32_system_threading_SetThreadpoolWait_napi));
    exports.Set("windowssys_windows_win32_system_threading_SetThreadpoolWaitEx", Napi::Function::New(env, windowssys_windows_win32_system_threading_SetThreadpoolWaitEx_napi));
    exports.Set("windowssys_windows_win32_system_threading_SetTimerQueueTimer", Napi::Function::New(env, windowssys_windows_win32_system_threading_SetTimerQueueTimer_napi));
    exports.Set("windowssys_windows_win32_system_threading_SetUmsThreadInformation", Napi::Function::New(env, windowssys_windows_win32_system_threading_SetUmsThreadInformation_napi));
    exports.Set("windowssys_windows_win32_system_threading_SetWaitableTimer", Napi::Function::New(env, windowssys_windows_win32_system_threading_SetWaitableTimer_napi));
    exports.Set("windowssys_windows_win32_system_threading_SetWaitableTimerEx", Napi::Function::New(env, windowssys_windows_win32_system_threading_SetWaitableTimerEx_napi));
    exports.Set("windowssys_windows_win32_system_threading_SignalObjectAndWait", Napi::Function::New(env, windowssys_windows_win32_system_threading_SignalObjectAndWait_napi));
    exports.Set("windowssys_windows_win32_system_threading_Sleep", Napi::Function::New(env, windowssys_windows_win32_system_threading_Sleep_napi));
    exports.Set("windowssys_windows_win32_system_threading_SleepConditionVariableCS", Napi::Function::New(env, windowssys_windows_win32_system_threading_SleepConditionVariableCS_napi));
    exports.Set("windowssys_windows_win32_system_threading_SleepConditionVariableSRW", Napi::Function::New(env, windowssys_windows_win32_system_threading_SleepConditionVariableSRW_napi));
    exports.Set("windowssys_windows_win32_system_threading_SleepEx", Napi::Function::New(env, windowssys_windows_win32_system_threading_SleepEx_napi));
    exports.Set("windowssys_windows_win32_system_threading_StartThreadpoolIo", Napi::Function::New(env, windowssys_windows_win32_system_threading_StartThreadpoolIo_napi));
    exports.Set("windowssys_windows_win32_system_threading_SubmitThreadpoolWork", Napi::Function::New(env, windowssys_windows_win32_system_threading_SubmitThreadpoolWork_napi));
    exports.Set("windowssys_windows_win32_system_threading_SuspendThread", Napi::Function::New(env, windowssys_windows_win32_system_threading_SuspendThread_napi));
    exports.Set("windowssys_windows_win32_system_threading_SwitchToFiber", Napi::Function::New(env, windowssys_windows_win32_system_threading_SwitchToFiber_napi));
    exports.Set("windowssys_windows_win32_system_threading_SwitchToThread", Napi::Function::New(env, windowssys_windows_win32_system_threading_SwitchToThread_napi));
    exports.Set("windowssys_windows_win32_system_threading_TerminateProcess", Napi::Function::New(env, windowssys_windows_win32_system_threading_TerminateProcess_napi));
    exports.Set("windowssys_windows_win32_system_threading_TerminateThread", Napi::Function::New(env, windowssys_windows_win32_system_threading_TerminateThread_napi));
    exports.Set("windowssys_windows_win32_system_threading_TlsAlloc", Napi::Function::New(env, windowssys_windows_win32_system_threading_TlsAlloc_napi));
    exports.Set("windowssys_windows_win32_system_threading_TlsFree", Napi::Function::New(env, windowssys_windows_win32_system_threading_TlsFree_napi));
    exports.Set("windowssys_windows_win32_system_threading_TlsGetValue", Napi::Function::New(env, windowssys_windows_win32_system_threading_TlsGetValue_napi));
    exports.Set("windowssys_windows_win32_system_threading_TlsSetValue", Napi::Function::New(env, windowssys_windows_win32_system_threading_TlsSetValue_napi));
    exports.Set("windowssys_windows_win32_system_threading_TryAcquireSRWLockExclusive", Napi::Function::New(env, windowssys_windows_win32_system_threading_TryAcquireSRWLockExclusive_napi));
    exports.Set("windowssys_windows_win32_system_threading_TryAcquireSRWLockShared", Napi::Function::New(env, windowssys_windows_win32_system_threading_TryAcquireSRWLockShared_napi));
    exports.Set("windowssys_windows_win32_system_threading_TryEnterCriticalSection", Napi::Function::New(env, windowssys_windows_win32_system_threading_TryEnterCriticalSection_napi));
    exports.Set("windowssys_windows_win32_system_threading_TrySubmitThreadpoolCallback", Napi::Function::New(env, windowssys_windows_win32_system_threading_TrySubmitThreadpoolCallback_napi));
    exports.Set("windowssys_windows_win32_system_threading_UmsThreadYield", Napi::Function::New(env, windowssys_windows_win32_system_threading_UmsThreadYield_napi));
    exports.Set("windowssys_windows_win32_system_threading_UnregisterWait", Napi::Function::New(env, windowssys_windows_win32_system_threading_UnregisterWait_napi));
    exports.Set("windowssys_windows_win32_system_threading_UnregisterWaitEx", Napi::Function::New(env, windowssys_windows_win32_system_threading_UnregisterWaitEx_napi));
    exports.Set("windowssys_windows_win32_system_threading_UpdateProcThreadAttribute", Napi::Function::New(env, windowssys_windows_win32_system_threading_UpdateProcThreadAttribute_napi));
    exports.Set("windowssys_windows_win32_system_threading_WaitForInputIdle", Napi::Function::New(env, windowssys_windows_win32_system_threading_WaitForInputIdle_napi));
    exports.Set("windowssys_windows_win32_system_threading_WaitForMultipleObjects", Napi::Function::New(env, windowssys_windows_win32_system_threading_WaitForMultipleObjects_napi));
    exports.Set("windowssys_windows_win32_system_threading_WaitForMultipleObjectsEx", Napi::Function::New(env, windowssys_windows_win32_system_threading_WaitForMultipleObjectsEx_napi));
    exports.Set("windowssys_windows_win32_system_threading_WaitForSingleObject", Napi::Function::New(env, windowssys_windows_win32_system_threading_WaitForSingleObject_napi));
    exports.Set("windowssys_windows_win32_system_threading_WaitForSingleObjectEx", Napi::Function::New(env, windowssys_windows_win32_system_threading_WaitForSingleObjectEx_napi));
    exports.Set("windowssys_windows_win32_system_threading_WaitForThreadpoolIoCallbacks", Napi::Function::New(env, windowssys_windows_win32_system_threading_WaitForThreadpoolIoCallbacks_napi));
    exports.Set("windowssys_windows_win32_system_threading_WaitForThreadpoolTimerCallbacks", Napi::Function::New(env, windowssys_windows_win32_system_threading_WaitForThreadpoolTimerCallbacks_napi));
    exports.Set("windowssys_windows_win32_system_threading_WaitForThreadpoolWaitCallbacks", Napi::Function::New(env, windowssys_windows_win32_system_threading_WaitForThreadpoolWaitCallbacks_napi));
    exports.Set("windowssys_windows_win32_system_threading_WaitForThreadpoolWorkCallbacks", Napi::Function::New(env, windowssys_windows_win32_system_threading_WaitForThreadpoolWorkCallbacks_napi));
    exports.Set("windowssys_windows_win32_system_threading_WaitOnAddress", Napi::Function::New(env, windowssys_windows_win32_system_threading_WaitOnAddress_napi));
    exports.Set("windowssys_windows_win32_system_threading_WakeAllConditionVariable", Napi::Function::New(env, windowssys_windows_win32_system_threading_WakeAllConditionVariable_napi));
    exports.Set("windowssys_windows_win32_system_threading_WakeByAddressAll", Napi::Function::New(env, windowssys_windows_win32_system_threading_WakeByAddressAll_napi));
    exports.Set("windowssys_windows_win32_system_threading_WakeByAddressSingle", Napi::Function::New(env, windowssys_windows_win32_system_threading_WakeByAddressSingle_napi));
    exports.Set("windowssys_windows_win32_system_threading_WakeConditionVariable", Napi::Function::New(env, windowssys_windows_win32_system_threading_WakeConditionVariable_napi));
    exports.Set("windowssys_windows_win32_system_threading_WinExec", Napi::Function::New(env, windowssys_windows_win32_system_threading_WinExec_napi));
    exports.Set("windowssys_windows_win32_system_threading_Wow64SetThreadDefaultGuestMachine", Napi::Function::New(env, windowssys_windows_win32_system_threading_Wow64SetThreadDefaultGuestMachine_napi));
    exports.Set("windowssys_windows_win32_system_threading_Wow64SuspendThread", Napi::Function::New(env, windowssys_windows_win32_system_threading_Wow64SuspendThread_napi));
}

static KmNapiRegistrarNode registrar_node = { &register_windows_win32_system_threading_napi, nullptr };
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
