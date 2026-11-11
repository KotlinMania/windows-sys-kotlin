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

static Napi::Value windowssys_windows_win32_system_threading_acquireSRWLockExclusive_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* srwlock = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "AcquireSRWLockExclusive")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(srwlock);
    } else {
        errno = ENOSYS;
    }
#else
    (void)srwlock;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_threading_acquireSRWLockShared_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* srwlock = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "AcquireSRWLockShared")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(srwlock);
    } else {
        errno = ENOSYS;
    }
#else
    (void)srwlock;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_threading_addIntegrityLabelToBoundaryDescriptor_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(boundarydescriptor, integritylabel);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)boundarydescriptor;
    (void)integritylabel;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_addSIDToBoundaryDescriptor_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(boundarydescriptor, requiredsid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)boundarydescriptor;
    (void)requiredsid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_attachThreadInput_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(idattach, idattachto, fattach);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)idattach;
    (void)idattachto;
    (void)fattach;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_avQuerySystemResponsiveness_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(avrthandle, systemresponsivenessvalue);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)avrthandle;
    (void)systemresponsivenessvalue;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_avRevertMmThreadCharacteristics_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* avrthandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("avrt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "AvRevertMmThreadCharacteristics")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(avrthandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)avrthandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_avRtCreateThreadOrderingGroup_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(context, period, threadorderingguid, timeout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)context;
    (void)period;
    (void)threadorderingguid;
    (void)timeout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_avRtCreateThreadOrderingGroupExA_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(context, period, threadorderingguid, timeout, taskname);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)context;
    (void)period;
    (void)threadorderingguid;
    (void)timeout;
    (void)taskname;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_avRtCreateThreadOrderingGroupExW_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(context, period, threadorderingguid, timeout, taskname);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)context;
    (void)period;
    (void)threadorderingguid;
    (void)timeout;
    (void)taskname;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_avRtDeleteThreadOrderingGroup_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* context = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("avrt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "AvRtDeleteThreadOrderingGroup")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(context);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)context;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_avRtJoinThreadOrderingGroup_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(context, threadorderingguid, before);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)context;
    (void)threadorderingguid;
    (void)before;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_avRtLeaveThreadOrderingGroup_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* context = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("avrt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "AvRtLeaveThreadOrderingGroup")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(context);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)context;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_avRtWaitOnThreadOrderingGroup_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* context = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("avrt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "AvRtWaitOnThreadOrderingGroup")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(context);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)context;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_avSetMmMaxThreadCharacteristicsA_napi(const Napi::CallbackInfo& km_info) {
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
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(firsttask, secondtask, taskindex);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
#else
    (void)firsttask;
    (void)secondtask;
    (void)taskindex;
    errno = ENOSYS;
    void* km_res = nullptr;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_threading_avSetMmMaxThreadCharacteristicsW_napi(const Napi::CallbackInfo& km_info) {
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
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(firsttask, secondtask, taskindex);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
#else
    (void)firsttask;
    (void)secondtask;
    (void)taskindex;
    errno = ENOSYS;
    void* km_res = nullptr;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_threading_avSetMmThreadCharacteristicsA_napi(const Napi::CallbackInfo& km_info) {
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
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(taskname, taskindex);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
#else
    (void)taskname;
    (void)taskindex;
    errno = ENOSYS;
    void* km_res = nullptr;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_threading_avSetMmThreadCharacteristicsW_napi(const Napi::CallbackInfo& km_info) {
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
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(taskname, taskindex);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
#else
    (void)taskname;
    (void)taskindex;
    errno = ENOSYS;
    void* km_res = nullptr;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_threading_avSetMmThreadPriority_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(avrthandle, priority);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)avrthandle;
    (void)priority;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_callbackMayRunLong_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t pci = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CallbackMayRunLong")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(pci);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pci;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_cancelThreadpoolIo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t pio = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CancelThreadpoolIo")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(pio);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pio;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_threading_cancelTimerQueueTimer_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(timerqueue, timer);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)timerqueue;
    (void)timer;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_cancelWaitableTimer_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* htimer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CancelWaitableTimer")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(htimer);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)htimer;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_changeTimerQueueTimer_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(timerqueue, timer, duetime, period);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)timerqueue;
    (void)timer;
    (void)duetime;
    (void)period;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_closePrivateNamespace_napi(const Napi::CallbackInfo& km_info) {
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
    bool km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(handle, flags);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)handle;
    (void)flags;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_win32_system_threading_closeThreadpool_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t ptpp = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CloseThreadpool")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(ptpp);
    } else {
        errno = ENOSYS;
    }
#else
    (void)ptpp;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_threading_closeThreadpoolCleanupGroup_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t ptpcg = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CloseThreadpoolCleanupGroup")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(ptpcg);
    } else {
        errno = ENOSYS;
    }
#else
    (void)ptpcg;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_threading_closeThreadpoolCleanupGroupMembers_napi(const Napi::CallbackInfo& km_info) {
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
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(ptpcg, fcancelpendingcallbacks, pvcleanupcontext);
    } else {
        errno = ENOSYS;
    }
#else
    (void)ptpcg;
    (void)fcancelpendingcallbacks;
    (void)pvcleanupcontext;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_threading_closeThreadpoolIo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t pio = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CloseThreadpoolIo")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(pio);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pio;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_threading_closeThreadpoolTimer_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t pti = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CloseThreadpoolTimer")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(pti);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pti;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_threading_closeThreadpoolWait_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t pwa = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CloseThreadpoolWait")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(pwa);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pwa;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_threading_closeThreadpoolWork_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t pwk = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CloseThreadpoolWork")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(pwk);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pwk;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_threading_convertFiberToThread_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ConvertFiberToThread")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr();
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_convertThreadToFiber_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpparameter = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ConvertThreadToFiber")));
    }
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(lpparameter);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
#else
    (void)lpparameter;
    errno = ENOSYS;
    void* km_res = nullptr;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_threading_convertThreadToFiberEx_napi(const Napi::CallbackInfo& km_info) {
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
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(lpparameter, dwflags);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
#else
    (void)lpparameter;
    (void)dwflags;
    errno = ENOSYS;
    void* km_res = nullptr;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_threading_createBoundaryDescriptorA_napi(const Napi::CallbackInfo& km_info) {
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
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(name, flags);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
#else
    (void)name;
    (void)flags;
    errno = ENOSYS;
    void* km_res = nullptr;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_threading_createBoundaryDescriptorW_napi(const Napi::CallbackInfo& km_info) {
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
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(name, flags);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
#else
    (void)name;
    (void)flags;
    errno = ENOSYS;
    void* km_res = nullptr;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_threading_createEventA_napi(const Napi::CallbackInfo& km_info) {
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
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(lpeventattributes, bmanualreset, binitialstate, lpname);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
#else
    (void)lpeventattributes;
    (void)bmanualreset;
    (void)binitialstate;
    (void)lpname;
    errno = ENOSYS;
    void* km_res = nullptr;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_threading_createEventExA_napi(const Napi::CallbackInfo& km_info) {
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
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(lpeventattributes, lpname, dwflags, dwdesiredaccess);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
#else
    (void)lpeventattributes;
    (void)lpname;
    (void)dwflags;
    (void)dwdesiredaccess;
    errno = ENOSYS;
    void* km_res = nullptr;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_threading_createEventExW_napi(const Napi::CallbackInfo& km_info) {
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
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(lpeventattributes, lpname, dwflags, dwdesiredaccess);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
#else
    (void)lpeventattributes;
    (void)lpname;
    (void)dwflags;
    (void)dwdesiredaccess;
    errno = ENOSYS;
    void* km_res = nullptr;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_threading_createEventW_napi(const Napi::CallbackInfo& km_info) {
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
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(lpeventattributes, bmanualreset, binitialstate, lpname);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
#else
    (void)lpeventattributes;
    (void)bmanualreset;
    (void)binitialstate;
    (void)lpname;
    errno = ENOSYS;
    void* km_res = nullptr;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_threading_createFiber_napi(const Napi::CallbackInfo& km_info) {
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
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(dwstacksize, lpstartaddress, lpparameter);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
#else
    (void)dwstacksize;
    (void)lpstartaddress;
    (void)lpparameter;
    errno = ENOSYS;
    void* km_res = nullptr;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_threading_createFiberEx_napi(const Napi::CallbackInfo& km_info) {
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
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(dwstackcommitsize, dwstackreservesize, dwflags, lpstartaddress, lpparameter);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
#else
    (void)dwstackcommitsize;
    (void)dwstackreservesize;
    (void)dwflags;
    (void)lpstartaddress;
    (void)lpparameter;
    errno = ENOSYS;
    void* km_res = nullptr;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_threading_createMutexA_napi(const Napi::CallbackInfo& km_info) {
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
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(lpmutexattributes, binitialowner, lpname);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
#else
    (void)lpmutexattributes;
    (void)binitialowner;
    (void)lpname;
    errno = ENOSYS;
    void* km_res = nullptr;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_threading_createMutexExA_napi(const Napi::CallbackInfo& km_info) {
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
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(lpmutexattributes, lpname, dwflags, dwdesiredaccess);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
#else
    (void)lpmutexattributes;
    (void)lpname;
    (void)dwflags;
    (void)dwdesiredaccess;
    errno = ENOSYS;
    void* km_res = nullptr;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_threading_createMutexExW_napi(const Napi::CallbackInfo& km_info) {
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
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(lpmutexattributes, lpname, dwflags, dwdesiredaccess);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
#else
    (void)lpmutexattributes;
    (void)lpname;
    (void)dwflags;
    (void)dwdesiredaccess;
    errno = ENOSYS;
    void* km_res = nullptr;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_threading_createMutexW_napi(const Napi::CallbackInfo& km_info) {
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
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(lpmutexattributes, binitialowner, lpname);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
#else
    (void)lpmutexattributes;
    (void)binitialowner;
    (void)lpname;
    errno = ENOSYS;
    void* km_res = nullptr;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_threading_createPrivateNamespaceA_napi(const Napi::CallbackInfo& km_info) {
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
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(lpprivatenamespaceattributes, lpboundarydescriptor, lpaliasprefix);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
#else
    (void)lpprivatenamespaceattributes;
    (void)lpboundarydescriptor;
    (void)lpaliasprefix;
    errno = ENOSYS;
    void* km_res = nullptr;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_threading_createPrivateNamespaceW_napi(const Napi::CallbackInfo& km_info) {
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
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(lpprivatenamespaceattributes, lpboundarydescriptor, lpaliasprefix);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
#else
    (void)lpprivatenamespaceattributes;
    (void)lpboundarydescriptor;
    (void)lpaliasprefix;
    errno = ENOSYS;
    void* km_res = nullptr;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_threading_createProcessA_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(lpapplicationname, lpcommandline, lpprocessattributes, lpthreadattributes, binherithandles, dwcreationflags, lpenvironment, lpcurrentdirectory, lpstartupinfo, lpprocessinformation);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
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
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_createProcessAsUserA_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(htoken, lpapplicationname, lpcommandline, lpprocessattributes, lpthreadattributes, binherithandles, dwcreationflags, lpenvironment, lpcurrentdirectory, lpstartupinfo, lpprocessinformation);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
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
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_createProcessAsUserW_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(htoken, lpapplicationname, lpcommandline, lpprocessattributes, lpthreadattributes, binherithandles, dwcreationflags, lpenvironment, lpcurrentdirectory, lpstartupinfo, lpprocessinformation);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
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
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_createProcessW_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(lpapplicationname, lpcommandline, lpprocessattributes, lpthreadattributes, binherithandles, dwcreationflags, lpenvironment, lpcurrentdirectory, lpstartupinfo, lpprocessinformation);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
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
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_createProcessWithLogonW_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(lpusername, lpdomain, lppassword, dwlogonflags, lpapplicationname, lpcommandline, dwcreationflags, lpenvironment, lpcurrentdirectory, lpstartupinfo, lpprocessinformation);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
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
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_createProcessWithTokenW_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(htoken, dwlogonflags, lpapplicationname, lpcommandline, dwcreationflags, lpenvironment, lpcurrentdirectory, lpstartupinfo, lpprocessinformation);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
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
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_createRemoteThread_napi(const Napi::CallbackInfo& km_info) {
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
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hprocess, lpthreadattributes, dwstacksize, lpstartaddress, lpparameter, dwcreationflags, lpthreadid);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
#else
    (void)hprocess;
    (void)lpthreadattributes;
    (void)dwstacksize;
    (void)lpstartaddress;
    (void)lpparameter;
    (void)dwcreationflags;
    (void)lpthreadid;
    errno = ENOSYS;
    void* km_res = nullptr;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_threading_createRemoteThreadEx_napi(const Napi::CallbackInfo& km_info) {
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
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hprocess, lpthreadattributes, dwstacksize, lpstartaddress, lpparameter, dwcreationflags, lpattributelist, lpthreadid);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
#else
    (void)hprocess;
    (void)lpthreadattributes;
    (void)dwstacksize;
    (void)lpstartaddress;
    (void)lpparameter;
    (void)dwcreationflags;
    (void)lpattributelist;
    (void)lpthreadid;
    errno = ENOSYS;
    void* km_res = nullptr;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_threading_createSemaphoreA_napi(const Napi::CallbackInfo& km_info) {
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
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(lpsemaphoreattributes, linitialcount, lmaximumcount, lpname);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
#else
    (void)lpsemaphoreattributes;
    (void)linitialcount;
    (void)lmaximumcount;
    (void)lpname;
    errno = ENOSYS;
    void* km_res = nullptr;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_threading_createSemaphoreExA_napi(const Napi::CallbackInfo& km_info) {
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
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(lpsemaphoreattributes, linitialcount, lmaximumcount, lpname, dwflags, dwdesiredaccess);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
#else
    (void)lpsemaphoreattributes;
    (void)linitialcount;
    (void)lmaximumcount;
    (void)lpname;
    (void)dwflags;
    (void)dwdesiredaccess;
    errno = ENOSYS;
    void* km_res = nullptr;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_threading_createSemaphoreExW_napi(const Napi::CallbackInfo& km_info) {
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
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(lpsemaphoreattributes, linitialcount, lmaximumcount, lpname, dwflags, dwdesiredaccess);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
#else
    (void)lpsemaphoreattributes;
    (void)linitialcount;
    (void)lmaximumcount;
    (void)lpname;
    (void)dwflags;
    (void)dwdesiredaccess;
    errno = ENOSYS;
    void* km_res = nullptr;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_threading_createSemaphoreW_napi(const Napi::CallbackInfo& km_info) {
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
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(lpsemaphoreattributes, linitialcount, lmaximumcount, lpname);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
#else
    (void)lpsemaphoreattributes;
    (void)linitialcount;
    (void)lmaximumcount;
    (void)lpname;
    errno = ENOSYS;
    void* km_res = nullptr;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_threading_createThread_napi(const Napi::CallbackInfo& km_info) {
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
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(lpthreadattributes, dwstacksize, lpstartaddress, lpparameter, dwcreationflags, lpthreadid);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
#else
    (void)lpthreadattributes;
    (void)dwstacksize;
    (void)lpstartaddress;
    (void)lpparameter;
    (void)dwcreationflags;
    (void)lpthreadid;
    errno = ENOSYS;
    void* km_res = nullptr;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_threading_createThreadpool_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* reserved = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CreateThreadpool")));
    }
    int64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(reserved);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)reserved;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_system_threading_createThreadpoolCleanupGroup_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CreateThreadpoolCleanupGroup")));
    }
    int64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr();
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_system_threading_createThreadpoolIo_napi(const Napi::CallbackInfo& km_info) {
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
    int64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(fl, pfnio, pv, pcbe);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)fl;
    (void)pfnio;
    (void)pv;
    (void)pcbe;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_system_threading_createThreadpoolTimer_napi(const Napi::CallbackInfo& km_info) {
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
    int64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(pfnti, pv, pcbe);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pfnti;
    (void)pv;
    (void)pcbe;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_system_threading_createThreadpoolWait_napi(const Napi::CallbackInfo& km_info) {
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
    int64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(pfnwa, pv, pcbe);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pfnwa;
    (void)pv;
    (void)pcbe;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_system_threading_createThreadpoolWork_napi(const Napi::CallbackInfo& km_info) {
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
    int64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(pfnwk, pv, pcbe);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pfnwk;
    (void)pv;
    (void)pcbe;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_system_threading_createTimerQueue_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CreateTimerQueue")));
    }
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr();
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
#else
    errno = ENOSYS;
    void* km_res = nullptr;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_threading_createTimerQueueTimer_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(phnewtimer, timerqueue, callback, parameter, duetime, period, flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)phnewtimer;
    (void)timerqueue;
    (void)callback;
    (void)parameter;
    (void)duetime;
    (void)period;
    (void)flags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_createUmsCompletionList_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* umscompletionlist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CreateUmsCompletionList")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(umscompletionlist);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)umscompletionlist;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_createUmsThreadContext_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpumsthread = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CreateUmsThreadContext")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(lpumsthread);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpumsthread;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_createWaitableTimerA_napi(const Napi::CallbackInfo& km_info) {
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
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(lptimerattributes, bmanualreset, lptimername);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
#else
    (void)lptimerattributes;
    (void)bmanualreset;
    (void)lptimername;
    errno = ENOSYS;
    void* km_res = nullptr;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_threading_createWaitableTimerExA_napi(const Napi::CallbackInfo& km_info) {
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
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(lptimerattributes, lptimername, dwflags, dwdesiredaccess);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
#else
    (void)lptimerattributes;
    (void)lptimername;
    (void)dwflags;
    (void)dwdesiredaccess;
    errno = ENOSYS;
    void* km_res = nullptr;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_threading_createWaitableTimerExW_napi(const Napi::CallbackInfo& km_info) {
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
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(lptimerattributes, lptimername, dwflags, dwdesiredaccess);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
#else
    (void)lptimerattributes;
    (void)lptimername;
    (void)dwflags;
    (void)dwdesiredaccess;
    errno = ENOSYS;
    void* km_res = nullptr;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_threading_createWaitableTimerW_napi(const Napi::CallbackInfo& km_info) {
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
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(lptimerattributes, bmanualreset, lptimername);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
#else
    (void)lptimerattributes;
    (void)bmanualreset;
    (void)lptimername;
    errno = ENOSYS;
    void* km_res = nullptr;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_threading_deleteBoundaryDescriptor_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* boundarydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DeleteBoundaryDescriptor")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(boundarydescriptor);
    } else {
        errno = ENOSYS;
    }
#else
    (void)boundarydescriptor;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_threading_deleteCriticalSection_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpcriticalsection = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DeleteCriticalSection")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(lpcriticalsection);
    } else {
        errno = ENOSYS;
    }
#else
    (void)lpcriticalsection;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_threading_deleteFiber_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpfiber = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DeleteFiber")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(lpfiber);
    } else {
        errno = ENOSYS;
    }
#else
    (void)lpfiber;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_threading_deleteProcThreadAttributeList_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpattributelist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DeleteProcThreadAttributeList")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(lpattributelist);
    } else {
        errno = ENOSYS;
    }
#else
    (void)lpattributelist;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_threading_deleteSynchronizationBarrier_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpbarrier = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DeleteSynchronizationBarrier")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(lpbarrier);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpbarrier;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_deleteTimerQueue_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* timerqueue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DeleteTimerQueue")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(timerqueue);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)timerqueue;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_deleteTimerQueueEx_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(timerqueue, completionevent);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)timerqueue;
    (void)completionevent;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_deleteTimerQueueTimer_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(timerqueue, timer, completionevent);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)timerqueue;
    (void)timer;
    (void)completionevent;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_deleteUmsCompletionList_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* umscompletionlist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DeleteUmsCompletionList")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(umscompletionlist);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)umscompletionlist;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_deleteUmsThreadContext_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* umsthread = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DeleteUmsThreadContext")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(umsthread);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)umsthread;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_dequeueUmsCompletionListItems_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(umscompletionlist, waittimeout, umsthreadlist);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)umscompletionlist;
    (void)waittimeout;
    (void)umsthreadlist;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_disassociateCurrentThreadFromCallback_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t pci = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DisassociateCurrentThreadFromCallback")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(pci);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pci;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_threading_enterCriticalSection_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpcriticalsection = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "EnterCriticalSection")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(lpcriticalsection);
    } else {
        errno = ENOSYS;
    }
#else
    (void)lpcriticalsection;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_threading_enterSynchronizationBarrier_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(lpbarrier, dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpbarrier;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_enterUmsSchedulingMode_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* schedulerstartupinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "EnterUmsSchedulingMode")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(schedulerstartupinfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)schedulerstartupinfo;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_executeUmsThread_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* umsthread = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ExecuteUmsThread")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(umsthread);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)umsthread;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_exitProcess_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t uexitcode = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ExitProcess")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(uexitcode);
    } else {
        errno = ENOSYS;
    }
#else
    (void)uexitcode;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_threading_exitThread_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwexitcode = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ExitThread")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(dwexitcode);
    } else {
        errno = ENOSYS;
    }
#else
    (void)dwexitcode;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_threading_flsAlloc_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpcallback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FlsAlloc")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(lpcallback);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)lpcallback;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_flsFree_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwflsindex = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FlsFree")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(dwflsindex);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dwflsindex;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_flsGetValue_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwflsindex = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FlsGetValue")));
    }
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(dwflsindex);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
#else
    (void)dwflsindex;
    errno = ENOSYS;
    void* km_res = nullptr;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_threading_flsSetValue_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(dwflsindex, lpflsdata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dwflsindex;
    (void)lpflsdata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_flushProcessWriteBuffers_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FlushProcessWriteBuffers")));
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

static Napi::Value windowssys_windows_win32_system_threading_freeLibraryWhenCallbackReturns_napi(const Napi::CallbackInfo& km_info) {
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
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(pci, mod);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pci;
    (void)mod;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_threading_getActiveProcessorCount_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint16_t groupnumber = static_cast<uint16_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint16_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetActiveProcessorCount")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(groupnumber);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)groupnumber;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_getActiveProcessorGroupCount_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef uint16_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetActiveProcessorGroupCount")));
    }
    uint16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr();
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    errno = ENOSYS;
    uint16_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_getCurrentProcess_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetCurrentProcess")));
    }
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr();
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
#else
    errno = ENOSYS;
    void* km_res = nullptr;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_threading_getCurrentProcessId_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetCurrentProcessId")));
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

static Napi::Value windowssys_windows_win32_system_threading_getCurrentProcessorNumber_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetCurrentProcessorNumber")));
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

static Napi::Value windowssys_windows_win32_system_threading_getCurrentProcessorNumberEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* procnumber = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetCurrentProcessorNumberEx")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(procnumber);
    } else {
        errno = ENOSYS;
    }
#else
    (void)procnumber;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_threading_getCurrentThread_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetCurrentThread")));
    }
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr();
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
#else
    errno = ENOSYS;
    void* km_res = nullptr;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_threading_getCurrentThreadId_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetCurrentThreadId")));
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

static Napi::Value windowssys_windows_win32_system_threading_getCurrentThreadStackLimits_napi(const Napi::CallbackInfo& km_info) {
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
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(lowlimit, highlimit);
    } else {
        errno = ENOSYS;
    }
#else
    (void)lowlimit;
    (void)highlimit;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_threading_getCurrentUmsThread_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetCurrentUmsThread")));
    }
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr();
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
#else
    errno = ENOSYS;
    void* km_res = nullptr;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_threading_getExitCodeProcess_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hprocess, lpexitcode);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprocess;
    (void)lpexitcode;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_getExitCodeThread_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hthread, lpexitcode);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hthread;
    (void)lpexitcode;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_getGuiResources_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hprocess, uiflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hprocess;
    (void)uiflags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_getMachineTypeAttributes_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(machine, machinetypeattributes);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)machine;
    (void)machinetypeattributes;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_getMaximumProcessorCount_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint16_t groupnumber = static_cast<uint16_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint16_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetMaximumProcessorCount")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(groupnumber);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)groupnumber;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_getMaximumProcessorGroupCount_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef uint16_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetMaximumProcessorGroupCount")));
    }
    uint16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr();
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    errno = ENOSYS;
    uint16_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_getNextUmsListItem_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* umscontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetNextUmsListItem")));
    }
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(umscontext);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
#else
    (void)umscontext;
    errno = ENOSYS;
    void* km_res = nullptr;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_threading_getNumaAvailableMemoryNode_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(node, availablebytes);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)node;
    (void)availablebytes;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_getNumaAvailableMemoryNodeEx_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(node, availablebytes);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)node;
    (void)availablebytes;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_getNumaHighestNodeNumber_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* highestnodenumber = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetNumaHighestNodeNumber")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(highestnodenumber);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)highestnodenumber;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_getNumaNodeNumberFromHandle_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hfile, nodenumber);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hfile;
    (void)nodenumber;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_getNumaNodeProcessorMask_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(node, processormask);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)node;
    (void)processormask;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_getNumaNodeProcessorMask2_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(nodenumber, processormasks, processormaskcount, requiredmaskcount);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)nodenumber;
    (void)processormasks;
    (void)processormaskcount;
    (void)requiredmaskcount;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_getNumaNodeProcessorMaskEx_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(node, processormask);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)node;
    (void)processormask;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_getNumaProcessorNode_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(processor, nodenumber);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)processor;
    (void)nodenumber;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_getNumaProcessorNodeEx_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(processor, nodenumber);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)processor;
    (void)nodenumber;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_getNumaProximityNode_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(proximityid, nodenumber);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)proximityid;
    (void)nodenumber;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_getNumaProximityNodeEx_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(proximityid, nodenumber);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)proximityid;
    (void)nodenumber;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_getPriorityClass_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetPriorityClass")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hprocess);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hprocess;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_getProcessAffinityMask_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hprocess, lpprocessaffinitymask, lpsystemaffinitymask);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprocess;
    (void)lpprocessaffinitymask;
    (void)lpsystemaffinitymask;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_getProcessDEPPolicy_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hprocess, lpflags, lppermanent);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprocess;
    (void)lpflags;
    (void)lppermanent;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_getProcessDefaultCpuSetMasks_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(process, cpusetmasks, cpusetmaskcount, requiredmaskcount);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)process;
    (void)cpusetmasks;
    (void)cpusetmaskcount;
    (void)requiredmaskcount;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_getProcessDefaultCpuSets_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(process, cpusetids, cpusetidcount, requiredidcount);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)process;
    (void)cpusetids;
    (void)cpusetidcount;
    (void)requiredidcount;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_getProcessGroupAffinity_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hprocess, groupcount, grouparray);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprocess;
    (void)groupcount;
    (void)grouparray;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_getProcessHandleCount_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hprocess, pdwhandlecount);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprocess;
    (void)pdwhandlecount;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_getProcessHandleFromHwnd_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hwnd = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("oleacc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetProcessHandleFromHwnd")));
    }
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hwnd);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
#else
    (void)hwnd;
    errno = ENOSYS;
    void* km_res = nullptr;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_threading_getProcessId_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* process = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetProcessId")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(process);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)process;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_getProcessIdOfThread_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* thread = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetProcessIdOfThread")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(thread);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)thread;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_getProcessInformation_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hprocess, processinformationclass, processinformation, processinformationsize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprocess;
    (void)processinformationclass;
    (void)processinformation;
    (void)processinformationsize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_getProcessIoCounters_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hprocess, lpiocounters);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprocess;
    (void)lpiocounters;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_getProcessMitigationPolicy_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hprocess, mitigationpolicy, lpbuffer, dwlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprocess;
    (void)mitigationpolicy;
    (void)lpbuffer;
    (void)dwlength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_getProcessPriorityBoost_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hprocess, pdisablepriorityboost);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprocess;
    (void)pdisablepriorityboost;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_getProcessShutdownParameters_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(lpdwlevel, lpdwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpdwlevel;
    (void)lpdwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_getProcessTimes_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hprocess, lpcreationtime, lpexittime, lpkerneltime, lpusertime);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprocess;
    (void)lpcreationtime;
    (void)lpexittime;
    (void)lpkerneltime;
    (void)lpusertime;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_getProcessVersion_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t processid = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetProcessVersion")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(processid);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)processid;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_getProcessWorkingSetSize_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hprocess, lpminimumworkingsetsize, lpmaximumworkingsetsize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprocess;
    (void)lpminimumworkingsetsize;
    (void)lpmaximumworkingsetsize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_getStartupInfoA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpstartupinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetStartupInfoA")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(lpstartupinfo);
    } else {
        errno = ENOSYS;
    }
#else
    (void)lpstartupinfo;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_threading_getStartupInfoW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpstartupinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetStartupInfoW")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(lpstartupinfo);
    } else {
        errno = ENOSYS;
    }
#else
    (void)lpstartupinfo;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_threading_getSystemTimes_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(lpidletime, lpkerneltime, lpusertime);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpidletime;
    (void)lpkerneltime;
    (void)lpusertime;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_getThreadDescription_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hthread, ppszthreaddescription);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hthread;
    (void)ppszthreaddescription;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_getThreadGroupAffinity_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hthread, groupaffinity);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hthread;
    (void)groupaffinity;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_getThreadIOPendingFlag_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hthread, lpioispending);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hthread;
    (void)lpioispending;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_getThreadId_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* thread = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetThreadId")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(thread);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)thread;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_getThreadIdealProcessorEx_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hthread, lpidealprocessor);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hthread;
    (void)lpidealprocessor;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_getThreadInformation_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hthread, threadinformationclass, threadinformation, threadinformationsize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hthread;
    (void)threadinformationclass;
    (void)threadinformation;
    (void)threadinformationsize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_getThreadPriority_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hthread = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetThreadPriority")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hthread);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hthread;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_getThreadPriorityBoost_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hthread, pdisablepriorityboost);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hthread;
    (void)pdisablepriorityboost;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_getThreadSelectedCpuSetMasks_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(thread, cpusetmasks, cpusetmaskcount, requiredmaskcount);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)thread;
    (void)cpusetmasks;
    (void)cpusetmaskcount;
    (void)requiredmaskcount;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_getThreadSelectedCpuSets_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(thread, cpusetids, cpusetidcount, requiredidcount);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)thread;
    (void)cpusetids;
    (void)cpusetidcount;
    (void)requiredidcount;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_getThreadTimes_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hthread, lpcreationtime, lpexittime, lpkerneltime, lpusertime);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hthread;
    (void)lpcreationtime;
    (void)lpexittime;
    (void)lpkerneltime;
    (void)lpusertime;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_getUmsCompletionListEvent_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(umscompletionlist, umscompletionevent);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)umscompletionlist;
    (void)umscompletionevent;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_getUmsSystemThreadInformation_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(threadhandle, systemthreadinfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)threadhandle;
    (void)systemthreadinfo;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_initOnceBeginInitialize_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(lpinitonce, dwflags, fpending, lpcontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpinitonce;
    (void)dwflags;
    (void)fpending;
    (void)lpcontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_initOnceComplete_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(lpinitonce, dwflags, lpcontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpinitonce;
    (void)dwflags;
    (void)lpcontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_initOnceExecuteOnce_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(initonce, initfn, parameter, context);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)initonce;
    (void)initfn;
    (void)parameter;
    (void)context;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_initOnceInitialize_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* initonce = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "InitOnceInitialize")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(initonce);
    } else {
        errno = ENOSYS;
    }
#else
    (void)initonce;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_threading_initializeConditionVariable_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* conditionvariable = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "InitializeConditionVariable")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(conditionvariable);
    } else {
        errno = ENOSYS;
    }
#else
    (void)conditionvariable;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_threading_initializeCriticalSection_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpcriticalsection = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "InitializeCriticalSection")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(lpcriticalsection);
    } else {
        errno = ENOSYS;
    }
#else
    (void)lpcriticalsection;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_threading_initializeCriticalSectionAndSpinCount_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(lpcriticalsection, dwspincount);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpcriticalsection;
    (void)dwspincount;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_initializeCriticalSectionEx_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(lpcriticalsection, dwspincount, flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpcriticalsection;
    (void)dwspincount;
    (void)flags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_initializeProcThreadAttributeList_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(lpattributelist, dwattributecount, dwflags, lpsize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpattributelist;
    (void)dwattributecount;
    (void)dwflags;
    (void)lpsize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_initializeSListHead_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* listhead = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "InitializeSListHead")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(listhead);
    } else {
        errno = ENOSYS;
    }
#else
    (void)listhead;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_threading_initializeSRWLock_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* srwlock = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "InitializeSRWLock")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(srwlock);
    } else {
        errno = ENOSYS;
    }
#else
    (void)srwlock;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_threading_initializeSynchronizationBarrier_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(lpbarrier, ltotalthreads, lspincount);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpbarrier;
    (void)ltotalthreads;
    (void)lspincount;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_interlockedFlushSList_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* listhead = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "InterlockedFlushSList")));
    }
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(listhead);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
#else
    (void)listhead;
    errno = ENOSYS;
    void* km_res = nullptr;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_threading_interlockedPopEntrySList_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* listhead = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "InterlockedPopEntrySList")));
    }
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(listhead);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
#else
    (void)listhead;
    errno = ENOSYS;
    void* km_res = nullptr;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_threading_interlockedPushEntrySList_napi(const Napi::CallbackInfo& km_info) {
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
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(listhead, listentry);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
#else
    (void)listhead;
    (void)listentry;
    errno = ENOSYS;
    void* km_res = nullptr;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_threading_interlockedPushListSListEx_napi(const Napi::CallbackInfo& km_info) {
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
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(listhead, list, listend, count);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
#else
    (void)listhead;
    (void)list;
    (void)listend;
    (void)count;
    errno = ENOSYS;
    void* km_res = nullptr;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_threading_isImmersiveProcess_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IsImmersiveProcess")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hprocess);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprocess;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_isProcessCritical_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hprocess, critical);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprocess;
    (void)critical;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_isProcessorFeaturePresent_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t processorfeature = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IsProcessorFeaturePresent")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(processorfeature);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)processorfeature;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_isThreadAFiber_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IsThreadAFiber")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr();
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_isThreadpoolTimerSet_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t pti = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IsThreadpoolTimerSet")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(pti);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pti;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_isWow64Process_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hprocess, wow64process);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprocess;
    (void)wow64process;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_isWow64Process2_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hprocess, pprocessmachine, pnativemachine);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprocess;
    (void)pprocessmachine;
    (void)pnativemachine;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_leaveCriticalSection_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpcriticalsection = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "LeaveCriticalSection")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(lpcriticalsection);
    } else {
        errno = ENOSYS;
    }
#else
    (void)lpcriticalsection;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_threading_leaveCriticalSectionWhenCallbackReturns_napi(const Napi::CallbackInfo& km_info) {
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
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(pci, pcs);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pci;
    (void)pcs;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_threading_openEventA_napi(const Napi::CallbackInfo& km_info) {
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
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(dwdesiredaccess, binherithandle, lpname);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
#else
    (void)dwdesiredaccess;
    (void)binherithandle;
    (void)lpname;
    errno = ENOSYS;
    void* km_res = nullptr;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_threading_openEventW_napi(const Napi::CallbackInfo& km_info) {
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
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(dwdesiredaccess, binherithandle, lpname);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
#else
    (void)dwdesiredaccess;
    (void)binherithandle;
    (void)lpname;
    errno = ENOSYS;
    void* km_res = nullptr;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_threading_openMutexW_napi(const Napi::CallbackInfo& km_info) {
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
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(dwdesiredaccess, binherithandle, lpname);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
#else
    (void)dwdesiredaccess;
    (void)binherithandle;
    (void)lpname;
    errno = ENOSYS;
    void* km_res = nullptr;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_threading_openPrivateNamespaceA_napi(const Napi::CallbackInfo& km_info) {
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
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(lpboundarydescriptor, lpaliasprefix);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
#else
    (void)lpboundarydescriptor;
    (void)lpaliasprefix;
    errno = ENOSYS;
    void* km_res = nullptr;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_threading_openPrivateNamespaceW_napi(const Napi::CallbackInfo& km_info) {
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
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(lpboundarydescriptor, lpaliasprefix);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
#else
    (void)lpboundarydescriptor;
    (void)lpaliasprefix;
    errno = ENOSYS;
    void* km_res = nullptr;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_threading_openProcess_napi(const Napi::CallbackInfo& km_info) {
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
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(dwdesiredaccess, binherithandle, dwprocessid);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
#else
    (void)dwdesiredaccess;
    (void)binherithandle;
    (void)dwprocessid;
    errno = ENOSYS;
    void* km_res = nullptr;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_threading_openProcessToken_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(processhandle, desiredaccess, tokenhandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)processhandle;
    (void)desiredaccess;
    (void)tokenhandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_openSemaphoreW_napi(const Napi::CallbackInfo& km_info) {
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
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(dwdesiredaccess, binherithandle, lpname);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
#else
    (void)dwdesiredaccess;
    (void)binherithandle;
    (void)lpname;
    errno = ENOSYS;
    void* km_res = nullptr;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_threading_openThread_napi(const Napi::CallbackInfo& km_info) {
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
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(dwdesiredaccess, binherithandle, dwthreadid);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
#else
    (void)dwdesiredaccess;
    (void)binherithandle;
    (void)dwthreadid;
    errno = ENOSYS;
    void* km_res = nullptr;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_threading_openThreadToken_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(threadhandle, desiredaccess, openasself, tokenhandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)threadhandle;
    (void)desiredaccess;
    (void)openasself;
    (void)tokenhandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_openWaitableTimerA_napi(const Napi::CallbackInfo& km_info) {
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
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(dwdesiredaccess, binherithandle, lptimername);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
#else
    (void)dwdesiredaccess;
    (void)binherithandle;
    (void)lptimername;
    errno = ENOSYS;
    void* km_res = nullptr;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_threading_openWaitableTimerW_napi(const Napi::CallbackInfo& km_info) {
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
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(dwdesiredaccess, binherithandle, lptimername);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
#else
    (void)dwdesiredaccess;
    (void)binherithandle;
    (void)lptimername;
    errno = ENOSYS;
    void* km_res = nullptr;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_threading_pulseEvent_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hevent = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PulseEvent")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hevent);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hevent;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_queryDepthSList_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* listhead = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint16_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "QueryDepthSList")));
    }
    uint16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(listhead);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)listhead;
    errno = ENOSYS;
    uint16_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_queryFullProcessImageNameA_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hprocess, dwflags, lpexename, lpdwsize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprocess;
    (void)dwflags;
    (void)lpexename;
    (void)lpdwsize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_queryFullProcessImageNameW_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hprocess, dwflags, lpexename, lpdwsize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprocess;
    (void)dwflags;
    (void)lpexename;
    (void)lpdwsize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_queryProcessAffinityUpdateMode_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hprocess, lpdwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprocess;
    (void)lpdwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_queryProtectedPolicy_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(policyguid, policyvalue);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)policyguid;
    (void)policyvalue;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_queryThreadpoolStackInformation_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(ptpp, ptpsi);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)ptpp;
    (void)ptpsi;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_queryUmsThreadInformation_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(umsthread, umsthreadinfoclass, umsthreadinformation, umsthreadinformationlength, returnlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)umsthread;
    (void)umsthreadinfoclass;
    (void)umsthreadinformation;
    (void)umsthreadinformationlength;
    (void)returnlength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_queueUserWorkItem_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(function, context, flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)function;
    (void)context;
    (void)flags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_registerWaitForSingleObject_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(phnewwaitobject, hobject, callback, context, dwmilliseconds, dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)phnewwaitobject;
    (void)hobject;
    (void)callback;
    (void)context;
    (void)dwmilliseconds;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_releaseMutex_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hmutex = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ReleaseMutex")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hmutex);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hmutex;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_releaseMutexWhenCallbackReturns_napi(const Napi::CallbackInfo& km_info) {
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
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(pci, mut);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pci;
    (void)mut;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_threading_releaseSRWLockExclusive_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* srwlock = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ReleaseSRWLockExclusive")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(srwlock);
    } else {
        errno = ENOSYS;
    }
#else
    (void)srwlock;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_threading_releaseSRWLockShared_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* srwlock = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ReleaseSRWLockShared")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(srwlock);
    } else {
        errno = ENOSYS;
    }
#else
    (void)srwlock;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_threading_releaseSemaphore_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hsemaphore, lreleasecount, lppreviouscount);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hsemaphore;
    (void)lreleasecount;
    (void)lppreviouscount;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_releaseSemaphoreWhenCallbackReturns_napi(const Napi::CallbackInfo& km_info) {
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
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(pci, sem, crel);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pci;
    (void)sem;
    (void)crel;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_threading_resetEvent_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hevent = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ResetEvent")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hevent);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hevent;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_resumeThread_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hthread = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ResumeThread")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hthread);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hthread;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_rtwqAddPeriodicCallback_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(callback, context, key);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)callback;
    (void)context;
    (void)key;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_rtwqAllocateSerialWorkQueue_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(workqueueidin, workqueueidout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)workqueueidin;
    (void)workqueueidout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_rtwqAllocateWorkQueue_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(workqueuetype, workqueueid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)workqueuetype;
    (void)workqueueid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_rtwqBeginRegisterWorkQueueWithMMCSS_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(workqueueid, usageclass, dwtaskid, lpriority, donecallback, donestate);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)workqueueid;
    (void)usageclass;
    (void)dwtaskid;
    (void)lpriority;
    (void)donecallback;
    (void)donestate;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_rtwqBeginUnregisterWorkQueueWithMMCSS_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(workqueueid, donecallback, donestate);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)workqueueid;
    (void)donecallback;
    (void)donestate;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_rtwqCancelDeadline_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* prequest = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rtworkq.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtwqCancelDeadline")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(prequest);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)prequest;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_rtwqCancelWorkItem_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t key = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rtworkq.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtwqCancelWorkItem")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(key);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)key;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_rtwqCreateAsyncResult_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(appobject, callback, appstate, asyncresult);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)appobject;
    (void)callback;
    (void)appstate;
    (void)asyncresult;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_rtwqEndRegisterWorkQueueWithMMCSS_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(result, taskid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)result;
    (void)taskid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_rtwqGetWorkQueueMMCSSClass_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(workqueueid, usageclass, usageclasslength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)workqueueid;
    (void)usageclass;
    (void)usageclasslength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_rtwqGetWorkQueueMMCSSPriority_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(workqueueid, priority);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)workqueueid;
    (void)priority;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_rtwqGetWorkQueueMMCSSTaskId_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(workqueueid, taskid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)workqueueid;
    (void)taskid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_rtwqInvokeCallback_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* result = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rtworkq.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtwqInvokeCallback")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(result);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)result;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_rtwqJoinWorkQueue_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(workqueueid, hfile, out);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)workqueueid;
    (void)hfile;
    (void)out;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_rtwqLockPlatform_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rtworkq.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtwqLockPlatform")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr();
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_rtwqLockSharedWorkQueue_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(usageclass, basepriority, taskid, id);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)usageclass;
    (void)basepriority;
    (void)taskid;
    (void)id;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_rtwqLockWorkQueue_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t workqueueid = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rtworkq.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtwqLockWorkQueue")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(workqueueid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)workqueueid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_rtwqPutWaitingWorkItem_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hevent, lpriority, result, key);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hevent;
    (void)lpriority;
    (void)result;
    (void)key;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_rtwqPutWorkItem_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(dwqueue, lpriority, result);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dwqueue;
    (void)lpriority;
    (void)result;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_rtwqRegisterPlatformEvents_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* platformevents = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rtworkq.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtwqRegisterPlatformEvents")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(platformevents);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)platformevents;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_rtwqRegisterPlatformWithMMCSS_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(usageclass, taskid, lpriority);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)usageclass;
    (void)taskid;
    (void)lpriority;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_rtwqRemovePeriodicCallback_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwkey = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rtworkq.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtwqRemovePeriodicCallback")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(dwkey);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dwkey;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_rtwqScheduleWorkItem_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(result, timeout, key);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)result;
    (void)timeout;
    (void)key;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_rtwqSetDeadline_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(workqueueid, deadlineinhns, prequest);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)workqueueid;
    (void)deadlineinhns;
    (void)prequest;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_rtwqSetDeadline2_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(workqueueid, deadlineinhns, predeadlineinhns, prequest);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)workqueueid;
    (void)deadlineinhns;
    (void)predeadlineinhns;
    (void)prequest;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_rtwqSetLongRunning_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(workqueueid, enable);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)workqueueid;
    (void)enable;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_rtwqShutdown_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rtworkq.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtwqShutdown")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr();
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_rtwqStartup_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rtworkq.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtwqStartup")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr();
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_rtwqUnjoinWorkQueue_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(workqueueid, hfile);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)workqueueid;
    (void)hfile;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_rtwqUnlockPlatform_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rtworkq.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtwqUnlockPlatform")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr();
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_rtwqUnlockWorkQueue_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t workqueueid = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rtworkq.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtwqUnlockWorkQueue")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(workqueueid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)workqueueid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_rtwqUnregisterPlatformEvents_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* platformevents = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rtworkq.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtwqUnregisterPlatformEvents")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(platformevents);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)platformevents;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_rtwqUnregisterPlatformFromMMCSS_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rtworkq.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtwqUnregisterPlatformFromMMCSS")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr();
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_setCriticalSectionSpinCount_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(lpcriticalsection, dwspincount);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)lpcriticalsection;
    (void)dwspincount;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_setEvent_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hevent = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetEvent")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hevent);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hevent;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_setEventWhenCallbackReturns_napi(const Napi::CallbackInfo& km_info) {
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
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(pci, evt);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pci;
    (void)evt;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_threading_setPriorityClass_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hprocess, dwpriorityclass);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprocess;
    (void)dwpriorityclass;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_setProcessAffinityMask_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hprocess, dwprocessaffinitymask);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprocess;
    (void)dwprocessaffinitymask;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_setProcessAffinityUpdateMode_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hprocess, dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprocess;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_setProcessDEPPolicy_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetProcessDEPPolicy")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_setProcessDefaultCpuSetMasks_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(process, cpusetmasks, cpusetmaskcount);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)process;
    (void)cpusetmasks;
    (void)cpusetmaskcount;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_setProcessDefaultCpuSets_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(process, cpusetids, cpusetidcount);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)process;
    (void)cpusetids;
    (void)cpusetidcount;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_setProcessDynamicEHContinuationTargets_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(process, numberoftargets, targets);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)process;
    (void)numberoftargets;
    (void)targets;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_setProcessDynamicEnforcedCetCompatibleRanges_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(process, numberofranges, ranges);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)process;
    (void)numberofranges;
    (void)ranges;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_setProcessInformation_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hprocess, processinformationclass, processinformation, processinformationsize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprocess;
    (void)processinformationclass;
    (void)processinformation;
    (void)processinformationsize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_setProcessMitigationPolicy_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(mitigationpolicy, lpbuffer, dwlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)mitigationpolicy;
    (void)lpbuffer;
    (void)dwlength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_setProcessPriorityBoost_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hprocess, bdisablepriorityboost);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprocess;
    (void)bdisablepriorityboost;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_setProcessRestrictionExemption_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t fenableexemption = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetProcessRestrictionExemption")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(fenableexemption);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)fenableexemption;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_setProcessShutdownParameters_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(dwlevel, dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dwlevel;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_setProcessWorkingSetSize_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hprocess, dwminimumworkingsetsize, dwmaximumworkingsetsize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprocess;
    (void)dwminimumworkingsetsize;
    (void)dwmaximumworkingsetsize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_setProtectedPolicy_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(policyguid, policyvalue, oldpolicyvalue);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)policyguid;
    (void)policyvalue;
    (void)oldpolicyvalue;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_setThreadAffinityMask_napi(const Napi::CallbackInfo& km_info) {
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
    uint64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hthread, dwthreadaffinitymask);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hthread;
    (void)dwthreadaffinitymask;
    errno = ENOSYS;
    uint64_t km_res = 0;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<uint64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_system_threading_setThreadDescription_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hthread, lpthreaddescription);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hthread;
    (void)lpthreaddescription;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_setThreadGroupAffinity_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hthread, groupaffinity, previousgroupaffinity);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hthread;
    (void)groupaffinity;
    (void)previousgroupaffinity;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_setThreadIdealProcessor_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hthread, dwidealprocessor);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hthread;
    (void)dwidealprocessor;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_setThreadIdealProcessorEx_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hthread, lpidealprocessor, lppreviousidealprocessor);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hthread;
    (void)lpidealprocessor;
    (void)lppreviousidealprocessor;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_setThreadInformation_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hthread, threadinformationclass, threadinformation, threadinformationsize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hthread;
    (void)threadinformationclass;
    (void)threadinformation;
    (void)threadinformationsize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_setThreadPriority_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hthread, npriority);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hthread;
    (void)npriority;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_setThreadPriorityBoost_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hthread, bdisablepriorityboost);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hthread;
    (void)bdisablepriorityboost;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_setThreadSelectedCpuSetMasks_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(thread, cpusetmasks, cpusetmaskcount);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)thread;
    (void)cpusetmasks;
    (void)cpusetmaskcount;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_setThreadSelectedCpuSets_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(thread, cpusetids, cpusetidcount);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)thread;
    (void)cpusetids;
    (void)cpusetidcount;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_setThreadStackGuarantee_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* stacksizeinbytes = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetThreadStackGuarantee")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(stacksizeinbytes);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)stacksizeinbytes;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_setThreadToken_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(thread, token);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)thread;
    (void)token;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_setThreadpoolStackInformation_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(ptpp, ptpsi);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)ptpp;
    (void)ptpsi;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_setThreadpoolThreadMaximum_napi(const Napi::CallbackInfo& km_info) {
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
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(ptpp, cthrdmost);
    } else {
        errno = ENOSYS;
    }
#else
    (void)ptpp;
    (void)cthrdmost;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_threading_setThreadpoolThreadMinimum_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(ptpp, cthrdmic);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)ptpp;
    (void)cthrdmic;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_setThreadpoolTimer_napi(const Napi::CallbackInfo& km_info) {
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
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(pti, pftduetime, msperiod, mswindowlength);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pti;
    (void)pftduetime;
    (void)msperiod;
    (void)mswindowlength;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_threading_setThreadpoolTimerEx_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(pti, pftduetime, msperiod, mswindowlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pti;
    (void)pftduetime;
    (void)msperiod;
    (void)mswindowlength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_setThreadpoolWait_napi(const Napi::CallbackInfo& km_info) {
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
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(pwa, h, pfttimeout);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pwa;
    (void)h;
    (void)pfttimeout;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_threading_setThreadpoolWaitEx_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(pwa, h, pfttimeout, reserved);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pwa;
    (void)h;
    (void)pfttimeout;
    (void)reserved;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_setTimerQueueTimer_napi(const Napi::CallbackInfo& km_info) {
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
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(timerqueue, callback, parameter, duetime, period, preferio);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
#else
    (void)timerqueue;
    (void)callback;
    (void)parameter;
    (void)duetime;
    (void)period;
    (void)preferio;
    errno = ENOSYS;
    void* km_res = nullptr;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_threading_setUmsThreadInformation_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(umsthread, umsthreadinfoclass, umsthreadinformation, umsthreadinformationlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)umsthread;
    (void)umsthreadinfoclass;
    (void)umsthreadinformation;
    (void)umsthreadinformationlength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_setWaitableTimer_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(htimer, lpduetime, lperiod, pfncompletionroutine, lpargtocompletionroutine, fresume);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)htimer;
    (void)lpduetime;
    (void)lperiod;
    (void)pfncompletionroutine;
    (void)lpargtocompletionroutine;
    (void)fresume;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_setWaitableTimerEx_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(htimer, lpduetime, lperiod, pfncompletionroutine, lpargtocompletionroutine, wakecontext, tolerabledelay);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)htimer;
    (void)lpduetime;
    (void)lperiod;
    (void)pfncompletionroutine;
    (void)lpargtocompletionroutine;
    (void)wakecontext;
    (void)tolerabledelay;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_signalObjectAndWait_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hobjecttosignal, hobjecttowaiton, dwmilliseconds, balertable);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hobjecttosignal;
    (void)hobjecttowaiton;
    (void)dwmilliseconds;
    (void)balertable;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_sleep_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwmilliseconds = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "Sleep")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(dwmilliseconds);
    } else {
        errno = ENOSYS;
    }
#else
    (void)dwmilliseconds;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_threading_sleepConditionVariableCS_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(conditionvariable, criticalsection, dwmilliseconds);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)conditionvariable;
    (void)criticalsection;
    (void)dwmilliseconds;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_sleepConditionVariableSRW_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(conditionvariable, srwlock, dwmilliseconds, flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)conditionvariable;
    (void)srwlock;
    (void)dwmilliseconds;
    (void)flags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_sleepEx_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(dwmilliseconds, balertable);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)dwmilliseconds;
    (void)balertable;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_startThreadpoolIo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t pio = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "StartThreadpoolIo")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(pio);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pio;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_threading_submitThreadpoolWork_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t pwk = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SubmitThreadpoolWork")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(pwk);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pwk;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_threading_suspendThread_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hthread = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SuspendThread")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hthread);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hthread;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_switchToFiber_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpfiber = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SwitchToFiber")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(lpfiber);
    } else {
        errno = ENOSYS;
    }
#else
    (void)lpfiber;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_threading_switchToThread_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SwitchToThread")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr();
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_terminateProcess_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hprocess, uexitcode);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprocess;
    (void)uexitcode;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_terminateThread_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hthread, dwexitcode);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hthread;
    (void)dwexitcode;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_tlsAlloc_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "TlsAlloc")));
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

static Napi::Value windowssys_windows_win32_system_threading_tlsFree_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwtlsindex = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "TlsFree")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(dwtlsindex);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dwtlsindex;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_tlsGetValue_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwtlsindex = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "TlsGetValue")));
    }
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(dwtlsindex);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
#else
    (void)dwtlsindex;
    errno = ENOSYS;
    void* km_res = nullptr;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_threading_tlsSetValue_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(dwtlsindex, lptlsvalue);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dwtlsindex;
    (void)lptlsvalue;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_tryAcquireSRWLockExclusive_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* srwlock = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "TryAcquireSRWLockExclusive")));
    }
    bool km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(srwlock);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)srwlock;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_win32_system_threading_tryAcquireSRWLockShared_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* srwlock = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "TryAcquireSRWLockShared")));
    }
    bool km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(srwlock);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)srwlock;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_win32_system_threading_tryEnterCriticalSection_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpcriticalsection = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "TryEnterCriticalSection")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(lpcriticalsection);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpcriticalsection;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_trySubmitThreadpoolCallback_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(pfns, pv, pcbe);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pfns;
    (void)pv;
    (void)pcbe;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_umsThreadYield_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* schedulerparam = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "UmsThreadYield")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(schedulerparam);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)schedulerparam;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_unregisterWait_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* waithandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "UnregisterWait")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(waithandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)waithandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_unregisterWaitEx_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(waithandle, completionevent);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)waithandle;
    (void)completionevent;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_updateProcThreadAttribute_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(lpattributelist, dwflags, attribute, lpvalue, cbsize, lppreviousvalue, lpreturnsize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpattributelist;
    (void)dwflags;
    (void)attribute;
    (void)lpvalue;
    (void)cbsize;
    (void)lppreviousvalue;
    (void)lpreturnsize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_waitForInputIdle_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hprocess, dwmilliseconds);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hprocess;
    (void)dwmilliseconds;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_waitForMultipleObjects_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(ncount, lphandles, bwaitall, dwmilliseconds);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)ncount;
    (void)lphandles;
    (void)bwaitall;
    (void)dwmilliseconds;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_waitForMultipleObjectsEx_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(ncount, lphandles, bwaitall, dwmilliseconds, balertable);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)ncount;
    (void)lphandles;
    (void)bwaitall;
    (void)dwmilliseconds;
    (void)balertable;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_waitForSingleObject_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hhandle, dwmilliseconds);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hhandle;
    (void)dwmilliseconds;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_waitForSingleObjectEx_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hhandle, dwmilliseconds, balertable);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hhandle;
    (void)dwmilliseconds;
    (void)balertable;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_waitForThreadpoolIoCallbacks_napi(const Napi::CallbackInfo& km_info) {
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
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(pio, fcancelpendingcallbacks);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pio;
    (void)fcancelpendingcallbacks;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_threading_waitForThreadpoolTimerCallbacks_napi(const Napi::CallbackInfo& km_info) {
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
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(pti, fcancelpendingcallbacks);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pti;
    (void)fcancelpendingcallbacks;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_threading_waitForThreadpoolWaitCallbacks_napi(const Napi::CallbackInfo& km_info) {
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
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(pwa, fcancelpendingcallbacks);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pwa;
    (void)fcancelpendingcallbacks;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_threading_waitForThreadpoolWorkCallbacks_napi(const Napi::CallbackInfo& km_info) {
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
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(pwk, fcancelpendingcallbacks);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pwk;
    (void)fcancelpendingcallbacks;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_threading_waitOnAddress_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(address, compareaddress, addresssize, dwmilliseconds);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)address;
    (void)compareaddress;
    (void)addresssize;
    (void)dwmilliseconds;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_wakeAllConditionVariable_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* conditionvariable = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WakeAllConditionVariable")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(conditionvariable);
    } else {
        errno = ENOSYS;
    }
#else
    (void)conditionvariable;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_threading_wakeByAddressAll_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* address = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-synch-l1-2-0.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WakeByAddressAll")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(address);
    } else {
        errno = ENOSYS;
    }
#else
    (void)address;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_threading_wakeByAddressSingle_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* address = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-synch-l1-2-0.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WakeByAddressSingle")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(address);
    } else {
        errno = ENOSYS;
    }
#else
    (void)address;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_threading_wakeConditionVariable_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* conditionvariable = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WakeConditionVariable")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(conditionvariable);
    } else {
        errno = ENOSYS;
    }
#else
    (void)conditionvariable;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_threading_winExec_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(lpcmdline, ucmdshow);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)lpcmdline;
    (void)ucmdshow;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_wow64SetThreadDefaultGuestMachine_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint16_t machine = static_cast<uint16_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint16_t (__stdcall *km_fn_t)(uint16_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-wow64-l1-1-1.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "Wow64SetThreadDefaultGuestMachine")));
    }
    uint16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(machine);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)machine;
    errno = ENOSYS;
    uint16_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_threading_wow64SuspendThread_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hthread = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "Wow64SuspendThread")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hthread);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hthread;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static void register_windows_win32_system_threading_napi(Napi::Env env, Napi::Object exports) {
    exports.Set("windowssys_windows_win32_system_threading_acquireSRWLockExclusive", Napi::Function::New(env, windowssys_windows_win32_system_threading_acquireSRWLockExclusive_napi));
    exports.Set("windowssys_windows_win32_system_threading_acquireSRWLockShared", Napi::Function::New(env, windowssys_windows_win32_system_threading_acquireSRWLockShared_napi));
    exports.Set("windowssys_windows_win32_system_threading_addIntegrityLabelToBoundaryDescriptor", Napi::Function::New(env, windowssys_windows_win32_system_threading_addIntegrityLabelToBoundaryDescriptor_napi));
    exports.Set("windowssys_windows_win32_system_threading_addSIDToBoundaryDescriptor", Napi::Function::New(env, windowssys_windows_win32_system_threading_addSIDToBoundaryDescriptor_napi));
    exports.Set("windowssys_windows_win32_system_threading_attachThreadInput", Napi::Function::New(env, windowssys_windows_win32_system_threading_attachThreadInput_napi));
    exports.Set("windowssys_windows_win32_system_threading_avQuerySystemResponsiveness", Napi::Function::New(env, windowssys_windows_win32_system_threading_avQuerySystemResponsiveness_napi));
    exports.Set("windowssys_windows_win32_system_threading_avRevertMmThreadCharacteristics", Napi::Function::New(env, windowssys_windows_win32_system_threading_avRevertMmThreadCharacteristics_napi));
    exports.Set("windowssys_windows_win32_system_threading_avRtCreateThreadOrderingGroup", Napi::Function::New(env, windowssys_windows_win32_system_threading_avRtCreateThreadOrderingGroup_napi));
    exports.Set("windowssys_windows_win32_system_threading_avRtCreateThreadOrderingGroupExA", Napi::Function::New(env, windowssys_windows_win32_system_threading_avRtCreateThreadOrderingGroupExA_napi));
    exports.Set("windowssys_windows_win32_system_threading_avRtCreateThreadOrderingGroupExW", Napi::Function::New(env, windowssys_windows_win32_system_threading_avRtCreateThreadOrderingGroupExW_napi));
    exports.Set("windowssys_windows_win32_system_threading_avRtDeleteThreadOrderingGroup", Napi::Function::New(env, windowssys_windows_win32_system_threading_avRtDeleteThreadOrderingGroup_napi));
    exports.Set("windowssys_windows_win32_system_threading_avRtJoinThreadOrderingGroup", Napi::Function::New(env, windowssys_windows_win32_system_threading_avRtJoinThreadOrderingGroup_napi));
    exports.Set("windowssys_windows_win32_system_threading_avRtLeaveThreadOrderingGroup", Napi::Function::New(env, windowssys_windows_win32_system_threading_avRtLeaveThreadOrderingGroup_napi));
    exports.Set("windowssys_windows_win32_system_threading_avRtWaitOnThreadOrderingGroup", Napi::Function::New(env, windowssys_windows_win32_system_threading_avRtWaitOnThreadOrderingGroup_napi));
    exports.Set("windowssys_windows_win32_system_threading_avSetMmMaxThreadCharacteristicsA", Napi::Function::New(env, windowssys_windows_win32_system_threading_avSetMmMaxThreadCharacteristicsA_napi));
    exports.Set("windowssys_windows_win32_system_threading_avSetMmMaxThreadCharacteristicsW", Napi::Function::New(env, windowssys_windows_win32_system_threading_avSetMmMaxThreadCharacteristicsW_napi));
    exports.Set("windowssys_windows_win32_system_threading_avSetMmThreadCharacteristicsA", Napi::Function::New(env, windowssys_windows_win32_system_threading_avSetMmThreadCharacteristicsA_napi));
    exports.Set("windowssys_windows_win32_system_threading_avSetMmThreadCharacteristicsW", Napi::Function::New(env, windowssys_windows_win32_system_threading_avSetMmThreadCharacteristicsW_napi));
    exports.Set("windowssys_windows_win32_system_threading_avSetMmThreadPriority", Napi::Function::New(env, windowssys_windows_win32_system_threading_avSetMmThreadPriority_napi));
    exports.Set("windowssys_windows_win32_system_threading_callbackMayRunLong", Napi::Function::New(env, windowssys_windows_win32_system_threading_callbackMayRunLong_napi));
    exports.Set("windowssys_windows_win32_system_threading_cancelThreadpoolIo", Napi::Function::New(env, windowssys_windows_win32_system_threading_cancelThreadpoolIo_napi));
    exports.Set("windowssys_windows_win32_system_threading_cancelTimerQueueTimer", Napi::Function::New(env, windowssys_windows_win32_system_threading_cancelTimerQueueTimer_napi));
    exports.Set("windowssys_windows_win32_system_threading_cancelWaitableTimer", Napi::Function::New(env, windowssys_windows_win32_system_threading_cancelWaitableTimer_napi));
    exports.Set("windowssys_windows_win32_system_threading_changeTimerQueueTimer", Napi::Function::New(env, windowssys_windows_win32_system_threading_changeTimerQueueTimer_napi));
    exports.Set("windowssys_windows_win32_system_threading_closePrivateNamespace", Napi::Function::New(env, windowssys_windows_win32_system_threading_closePrivateNamespace_napi));
    exports.Set("windowssys_windows_win32_system_threading_closeThreadpool", Napi::Function::New(env, windowssys_windows_win32_system_threading_closeThreadpool_napi));
    exports.Set("windowssys_windows_win32_system_threading_closeThreadpoolCleanupGroup", Napi::Function::New(env, windowssys_windows_win32_system_threading_closeThreadpoolCleanupGroup_napi));
    exports.Set("windowssys_windows_win32_system_threading_closeThreadpoolCleanupGroupMembers", Napi::Function::New(env, windowssys_windows_win32_system_threading_closeThreadpoolCleanupGroupMembers_napi));
    exports.Set("windowssys_windows_win32_system_threading_closeThreadpoolIo", Napi::Function::New(env, windowssys_windows_win32_system_threading_closeThreadpoolIo_napi));
    exports.Set("windowssys_windows_win32_system_threading_closeThreadpoolTimer", Napi::Function::New(env, windowssys_windows_win32_system_threading_closeThreadpoolTimer_napi));
    exports.Set("windowssys_windows_win32_system_threading_closeThreadpoolWait", Napi::Function::New(env, windowssys_windows_win32_system_threading_closeThreadpoolWait_napi));
    exports.Set("windowssys_windows_win32_system_threading_closeThreadpoolWork", Napi::Function::New(env, windowssys_windows_win32_system_threading_closeThreadpoolWork_napi));
    exports.Set("windowssys_windows_win32_system_threading_convertFiberToThread", Napi::Function::New(env, windowssys_windows_win32_system_threading_convertFiberToThread_napi));
    exports.Set("windowssys_windows_win32_system_threading_convertThreadToFiber", Napi::Function::New(env, windowssys_windows_win32_system_threading_convertThreadToFiber_napi));
    exports.Set("windowssys_windows_win32_system_threading_convertThreadToFiberEx", Napi::Function::New(env, windowssys_windows_win32_system_threading_convertThreadToFiberEx_napi));
    exports.Set("windowssys_windows_win32_system_threading_createBoundaryDescriptorA", Napi::Function::New(env, windowssys_windows_win32_system_threading_createBoundaryDescriptorA_napi));
    exports.Set("windowssys_windows_win32_system_threading_createBoundaryDescriptorW", Napi::Function::New(env, windowssys_windows_win32_system_threading_createBoundaryDescriptorW_napi));
    exports.Set("windowssys_windows_win32_system_threading_createEventA", Napi::Function::New(env, windowssys_windows_win32_system_threading_createEventA_napi));
    exports.Set("windowssys_windows_win32_system_threading_createEventExA", Napi::Function::New(env, windowssys_windows_win32_system_threading_createEventExA_napi));
    exports.Set("windowssys_windows_win32_system_threading_createEventExW", Napi::Function::New(env, windowssys_windows_win32_system_threading_createEventExW_napi));
    exports.Set("windowssys_windows_win32_system_threading_createEventW", Napi::Function::New(env, windowssys_windows_win32_system_threading_createEventW_napi));
    exports.Set("windowssys_windows_win32_system_threading_createFiber", Napi::Function::New(env, windowssys_windows_win32_system_threading_createFiber_napi));
    exports.Set("windowssys_windows_win32_system_threading_createFiberEx", Napi::Function::New(env, windowssys_windows_win32_system_threading_createFiberEx_napi));
    exports.Set("windowssys_windows_win32_system_threading_createMutexA", Napi::Function::New(env, windowssys_windows_win32_system_threading_createMutexA_napi));
    exports.Set("windowssys_windows_win32_system_threading_createMutexExA", Napi::Function::New(env, windowssys_windows_win32_system_threading_createMutexExA_napi));
    exports.Set("windowssys_windows_win32_system_threading_createMutexExW", Napi::Function::New(env, windowssys_windows_win32_system_threading_createMutexExW_napi));
    exports.Set("windowssys_windows_win32_system_threading_createMutexW", Napi::Function::New(env, windowssys_windows_win32_system_threading_createMutexW_napi));
    exports.Set("windowssys_windows_win32_system_threading_createPrivateNamespaceA", Napi::Function::New(env, windowssys_windows_win32_system_threading_createPrivateNamespaceA_napi));
    exports.Set("windowssys_windows_win32_system_threading_createPrivateNamespaceW", Napi::Function::New(env, windowssys_windows_win32_system_threading_createPrivateNamespaceW_napi));
    exports.Set("windowssys_windows_win32_system_threading_createProcessA", Napi::Function::New(env, windowssys_windows_win32_system_threading_createProcessA_napi));
    exports.Set("windowssys_windows_win32_system_threading_createProcessAsUserA", Napi::Function::New(env, windowssys_windows_win32_system_threading_createProcessAsUserA_napi));
    exports.Set("windowssys_windows_win32_system_threading_createProcessAsUserW", Napi::Function::New(env, windowssys_windows_win32_system_threading_createProcessAsUserW_napi));
    exports.Set("windowssys_windows_win32_system_threading_createProcessW", Napi::Function::New(env, windowssys_windows_win32_system_threading_createProcessW_napi));
    exports.Set("windowssys_windows_win32_system_threading_createProcessWithLogonW", Napi::Function::New(env, windowssys_windows_win32_system_threading_createProcessWithLogonW_napi));
    exports.Set("windowssys_windows_win32_system_threading_createProcessWithTokenW", Napi::Function::New(env, windowssys_windows_win32_system_threading_createProcessWithTokenW_napi));
    exports.Set("windowssys_windows_win32_system_threading_createRemoteThread", Napi::Function::New(env, windowssys_windows_win32_system_threading_createRemoteThread_napi));
    exports.Set("windowssys_windows_win32_system_threading_createRemoteThreadEx", Napi::Function::New(env, windowssys_windows_win32_system_threading_createRemoteThreadEx_napi));
    exports.Set("windowssys_windows_win32_system_threading_createSemaphoreA", Napi::Function::New(env, windowssys_windows_win32_system_threading_createSemaphoreA_napi));
    exports.Set("windowssys_windows_win32_system_threading_createSemaphoreExA", Napi::Function::New(env, windowssys_windows_win32_system_threading_createSemaphoreExA_napi));
    exports.Set("windowssys_windows_win32_system_threading_createSemaphoreExW", Napi::Function::New(env, windowssys_windows_win32_system_threading_createSemaphoreExW_napi));
    exports.Set("windowssys_windows_win32_system_threading_createSemaphoreW", Napi::Function::New(env, windowssys_windows_win32_system_threading_createSemaphoreW_napi));
    exports.Set("windowssys_windows_win32_system_threading_createThread", Napi::Function::New(env, windowssys_windows_win32_system_threading_createThread_napi));
    exports.Set("windowssys_windows_win32_system_threading_createThreadpool", Napi::Function::New(env, windowssys_windows_win32_system_threading_createThreadpool_napi));
    exports.Set("windowssys_windows_win32_system_threading_createThreadpoolCleanupGroup", Napi::Function::New(env, windowssys_windows_win32_system_threading_createThreadpoolCleanupGroup_napi));
    exports.Set("windowssys_windows_win32_system_threading_createThreadpoolIo", Napi::Function::New(env, windowssys_windows_win32_system_threading_createThreadpoolIo_napi));
    exports.Set("windowssys_windows_win32_system_threading_createThreadpoolTimer", Napi::Function::New(env, windowssys_windows_win32_system_threading_createThreadpoolTimer_napi));
    exports.Set("windowssys_windows_win32_system_threading_createThreadpoolWait", Napi::Function::New(env, windowssys_windows_win32_system_threading_createThreadpoolWait_napi));
    exports.Set("windowssys_windows_win32_system_threading_createThreadpoolWork", Napi::Function::New(env, windowssys_windows_win32_system_threading_createThreadpoolWork_napi));
    exports.Set("windowssys_windows_win32_system_threading_createTimerQueue", Napi::Function::New(env, windowssys_windows_win32_system_threading_createTimerQueue_napi));
    exports.Set("windowssys_windows_win32_system_threading_createTimerQueueTimer", Napi::Function::New(env, windowssys_windows_win32_system_threading_createTimerQueueTimer_napi));
    exports.Set("windowssys_windows_win32_system_threading_createUmsCompletionList", Napi::Function::New(env, windowssys_windows_win32_system_threading_createUmsCompletionList_napi));
    exports.Set("windowssys_windows_win32_system_threading_createUmsThreadContext", Napi::Function::New(env, windowssys_windows_win32_system_threading_createUmsThreadContext_napi));
    exports.Set("windowssys_windows_win32_system_threading_createWaitableTimerA", Napi::Function::New(env, windowssys_windows_win32_system_threading_createWaitableTimerA_napi));
    exports.Set("windowssys_windows_win32_system_threading_createWaitableTimerExA", Napi::Function::New(env, windowssys_windows_win32_system_threading_createWaitableTimerExA_napi));
    exports.Set("windowssys_windows_win32_system_threading_createWaitableTimerExW", Napi::Function::New(env, windowssys_windows_win32_system_threading_createWaitableTimerExW_napi));
    exports.Set("windowssys_windows_win32_system_threading_createWaitableTimerW", Napi::Function::New(env, windowssys_windows_win32_system_threading_createWaitableTimerW_napi));
    exports.Set("windowssys_windows_win32_system_threading_deleteBoundaryDescriptor", Napi::Function::New(env, windowssys_windows_win32_system_threading_deleteBoundaryDescriptor_napi));
    exports.Set("windowssys_windows_win32_system_threading_deleteCriticalSection", Napi::Function::New(env, windowssys_windows_win32_system_threading_deleteCriticalSection_napi));
    exports.Set("windowssys_windows_win32_system_threading_deleteFiber", Napi::Function::New(env, windowssys_windows_win32_system_threading_deleteFiber_napi));
    exports.Set("windowssys_windows_win32_system_threading_deleteProcThreadAttributeList", Napi::Function::New(env, windowssys_windows_win32_system_threading_deleteProcThreadAttributeList_napi));
    exports.Set("windowssys_windows_win32_system_threading_deleteSynchronizationBarrier", Napi::Function::New(env, windowssys_windows_win32_system_threading_deleteSynchronizationBarrier_napi));
    exports.Set("windowssys_windows_win32_system_threading_deleteTimerQueue", Napi::Function::New(env, windowssys_windows_win32_system_threading_deleteTimerQueue_napi));
    exports.Set("windowssys_windows_win32_system_threading_deleteTimerQueueEx", Napi::Function::New(env, windowssys_windows_win32_system_threading_deleteTimerQueueEx_napi));
    exports.Set("windowssys_windows_win32_system_threading_deleteTimerQueueTimer", Napi::Function::New(env, windowssys_windows_win32_system_threading_deleteTimerQueueTimer_napi));
    exports.Set("windowssys_windows_win32_system_threading_deleteUmsCompletionList", Napi::Function::New(env, windowssys_windows_win32_system_threading_deleteUmsCompletionList_napi));
    exports.Set("windowssys_windows_win32_system_threading_deleteUmsThreadContext", Napi::Function::New(env, windowssys_windows_win32_system_threading_deleteUmsThreadContext_napi));
    exports.Set("windowssys_windows_win32_system_threading_dequeueUmsCompletionListItems", Napi::Function::New(env, windowssys_windows_win32_system_threading_dequeueUmsCompletionListItems_napi));
    exports.Set("windowssys_windows_win32_system_threading_disassociateCurrentThreadFromCallback", Napi::Function::New(env, windowssys_windows_win32_system_threading_disassociateCurrentThreadFromCallback_napi));
    exports.Set("windowssys_windows_win32_system_threading_enterCriticalSection", Napi::Function::New(env, windowssys_windows_win32_system_threading_enterCriticalSection_napi));
    exports.Set("windowssys_windows_win32_system_threading_enterSynchronizationBarrier", Napi::Function::New(env, windowssys_windows_win32_system_threading_enterSynchronizationBarrier_napi));
    exports.Set("windowssys_windows_win32_system_threading_enterUmsSchedulingMode", Napi::Function::New(env, windowssys_windows_win32_system_threading_enterUmsSchedulingMode_napi));
    exports.Set("windowssys_windows_win32_system_threading_executeUmsThread", Napi::Function::New(env, windowssys_windows_win32_system_threading_executeUmsThread_napi));
    exports.Set("windowssys_windows_win32_system_threading_exitProcess", Napi::Function::New(env, windowssys_windows_win32_system_threading_exitProcess_napi));
    exports.Set("windowssys_windows_win32_system_threading_exitThread", Napi::Function::New(env, windowssys_windows_win32_system_threading_exitThread_napi));
    exports.Set("windowssys_windows_win32_system_threading_flsAlloc", Napi::Function::New(env, windowssys_windows_win32_system_threading_flsAlloc_napi));
    exports.Set("windowssys_windows_win32_system_threading_flsFree", Napi::Function::New(env, windowssys_windows_win32_system_threading_flsFree_napi));
    exports.Set("windowssys_windows_win32_system_threading_flsGetValue", Napi::Function::New(env, windowssys_windows_win32_system_threading_flsGetValue_napi));
    exports.Set("windowssys_windows_win32_system_threading_flsSetValue", Napi::Function::New(env, windowssys_windows_win32_system_threading_flsSetValue_napi));
    exports.Set("windowssys_windows_win32_system_threading_flushProcessWriteBuffers", Napi::Function::New(env, windowssys_windows_win32_system_threading_flushProcessWriteBuffers_napi));
    exports.Set("windowssys_windows_win32_system_threading_freeLibraryWhenCallbackReturns", Napi::Function::New(env, windowssys_windows_win32_system_threading_freeLibraryWhenCallbackReturns_napi));
    exports.Set("windowssys_windows_win32_system_threading_getActiveProcessorCount", Napi::Function::New(env, windowssys_windows_win32_system_threading_getActiveProcessorCount_napi));
    exports.Set("windowssys_windows_win32_system_threading_getActiveProcessorGroupCount", Napi::Function::New(env, windowssys_windows_win32_system_threading_getActiveProcessorGroupCount_napi));
    exports.Set("windowssys_windows_win32_system_threading_getCurrentProcess", Napi::Function::New(env, windowssys_windows_win32_system_threading_getCurrentProcess_napi));
    exports.Set("windowssys_windows_win32_system_threading_getCurrentProcessId", Napi::Function::New(env, windowssys_windows_win32_system_threading_getCurrentProcessId_napi));
    exports.Set("windowssys_windows_win32_system_threading_getCurrentProcessorNumber", Napi::Function::New(env, windowssys_windows_win32_system_threading_getCurrentProcessorNumber_napi));
    exports.Set("windowssys_windows_win32_system_threading_getCurrentProcessorNumberEx", Napi::Function::New(env, windowssys_windows_win32_system_threading_getCurrentProcessorNumberEx_napi));
    exports.Set("windowssys_windows_win32_system_threading_getCurrentThread", Napi::Function::New(env, windowssys_windows_win32_system_threading_getCurrentThread_napi));
    exports.Set("windowssys_windows_win32_system_threading_getCurrentThreadId", Napi::Function::New(env, windowssys_windows_win32_system_threading_getCurrentThreadId_napi));
    exports.Set("windowssys_windows_win32_system_threading_getCurrentThreadStackLimits", Napi::Function::New(env, windowssys_windows_win32_system_threading_getCurrentThreadStackLimits_napi));
    exports.Set("windowssys_windows_win32_system_threading_getCurrentUmsThread", Napi::Function::New(env, windowssys_windows_win32_system_threading_getCurrentUmsThread_napi));
    exports.Set("windowssys_windows_win32_system_threading_getExitCodeProcess", Napi::Function::New(env, windowssys_windows_win32_system_threading_getExitCodeProcess_napi));
    exports.Set("windowssys_windows_win32_system_threading_getExitCodeThread", Napi::Function::New(env, windowssys_windows_win32_system_threading_getExitCodeThread_napi));
    exports.Set("windowssys_windows_win32_system_threading_getGuiResources", Napi::Function::New(env, windowssys_windows_win32_system_threading_getGuiResources_napi));
    exports.Set("windowssys_windows_win32_system_threading_getMachineTypeAttributes", Napi::Function::New(env, windowssys_windows_win32_system_threading_getMachineTypeAttributes_napi));
    exports.Set("windowssys_windows_win32_system_threading_getMaximumProcessorCount", Napi::Function::New(env, windowssys_windows_win32_system_threading_getMaximumProcessorCount_napi));
    exports.Set("windowssys_windows_win32_system_threading_getMaximumProcessorGroupCount", Napi::Function::New(env, windowssys_windows_win32_system_threading_getMaximumProcessorGroupCount_napi));
    exports.Set("windowssys_windows_win32_system_threading_getNextUmsListItem", Napi::Function::New(env, windowssys_windows_win32_system_threading_getNextUmsListItem_napi));
    exports.Set("windowssys_windows_win32_system_threading_getNumaAvailableMemoryNode", Napi::Function::New(env, windowssys_windows_win32_system_threading_getNumaAvailableMemoryNode_napi));
    exports.Set("windowssys_windows_win32_system_threading_getNumaAvailableMemoryNodeEx", Napi::Function::New(env, windowssys_windows_win32_system_threading_getNumaAvailableMemoryNodeEx_napi));
    exports.Set("windowssys_windows_win32_system_threading_getNumaHighestNodeNumber", Napi::Function::New(env, windowssys_windows_win32_system_threading_getNumaHighestNodeNumber_napi));
    exports.Set("windowssys_windows_win32_system_threading_getNumaNodeNumberFromHandle", Napi::Function::New(env, windowssys_windows_win32_system_threading_getNumaNodeNumberFromHandle_napi));
    exports.Set("windowssys_windows_win32_system_threading_getNumaNodeProcessorMask", Napi::Function::New(env, windowssys_windows_win32_system_threading_getNumaNodeProcessorMask_napi));
    exports.Set("windowssys_windows_win32_system_threading_getNumaNodeProcessorMask2", Napi::Function::New(env, windowssys_windows_win32_system_threading_getNumaNodeProcessorMask2_napi));
    exports.Set("windowssys_windows_win32_system_threading_getNumaNodeProcessorMaskEx", Napi::Function::New(env, windowssys_windows_win32_system_threading_getNumaNodeProcessorMaskEx_napi));
    exports.Set("windowssys_windows_win32_system_threading_getNumaProcessorNode", Napi::Function::New(env, windowssys_windows_win32_system_threading_getNumaProcessorNode_napi));
    exports.Set("windowssys_windows_win32_system_threading_getNumaProcessorNodeEx", Napi::Function::New(env, windowssys_windows_win32_system_threading_getNumaProcessorNodeEx_napi));
    exports.Set("windowssys_windows_win32_system_threading_getNumaProximityNode", Napi::Function::New(env, windowssys_windows_win32_system_threading_getNumaProximityNode_napi));
    exports.Set("windowssys_windows_win32_system_threading_getNumaProximityNodeEx", Napi::Function::New(env, windowssys_windows_win32_system_threading_getNumaProximityNodeEx_napi));
    exports.Set("windowssys_windows_win32_system_threading_getPriorityClass", Napi::Function::New(env, windowssys_windows_win32_system_threading_getPriorityClass_napi));
    exports.Set("windowssys_windows_win32_system_threading_getProcessAffinityMask", Napi::Function::New(env, windowssys_windows_win32_system_threading_getProcessAffinityMask_napi));
    exports.Set("windowssys_windows_win32_system_threading_getProcessDEPPolicy", Napi::Function::New(env, windowssys_windows_win32_system_threading_getProcessDEPPolicy_napi));
    exports.Set("windowssys_windows_win32_system_threading_getProcessDefaultCpuSetMasks", Napi::Function::New(env, windowssys_windows_win32_system_threading_getProcessDefaultCpuSetMasks_napi));
    exports.Set("windowssys_windows_win32_system_threading_getProcessDefaultCpuSets", Napi::Function::New(env, windowssys_windows_win32_system_threading_getProcessDefaultCpuSets_napi));
    exports.Set("windowssys_windows_win32_system_threading_getProcessGroupAffinity", Napi::Function::New(env, windowssys_windows_win32_system_threading_getProcessGroupAffinity_napi));
    exports.Set("windowssys_windows_win32_system_threading_getProcessHandleCount", Napi::Function::New(env, windowssys_windows_win32_system_threading_getProcessHandleCount_napi));
    exports.Set("windowssys_windows_win32_system_threading_getProcessHandleFromHwnd", Napi::Function::New(env, windowssys_windows_win32_system_threading_getProcessHandleFromHwnd_napi));
    exports.Set("windowssys_windows_win32_system_threading_getProcessId", Napi::Function::New(env, windowssys_windows_win32_system_threading_getProcessId_napi));
    exports.Set("windowssys_windows_win32_system_threading_getProcessIdOfThread", Napi::Function::New(env, windowssys_windows_win32_system_threading_getProcessIdOfThread_napi));
    exports.Set("windowssys_windows_win32_system_threading_getProcessInformation", Napi::Function::New(env, windowssys_windows_win32_system_threading_getProcessInformation_napi));
    exports.Set("windowssys_windows_win32_system_threading_getProcessIoCounters", Napi::Function::New(env, windowssys_windows_win32_system_threading_getProcessIoCounters_napi));
    exports.Set("windowssys_windows_win32_system_threading_getProcessMitigationPolicy", Napi::Function::New(env, windowssys_windows_win32_system_threading_getProcessMitigationPolicy_napi));
    exports.Set("windowssys_windows_win32_system_threading_getProcessPriorityBoost", Napi::Function::New(env, windowssys_windows_win32_system_threading_getProcessPriorityBoost_napi));
    exports.Set("windowssys_windows_win32_system_threading_getProcessShutdownParameters", Napi::Function::New(env, windowssys_windows_win32_system_threading_getProcessShutdownParameters_napi));
    exports.Set("windowssys_windows_win32_system_threading_getProcessTimes", Napi::Function::New(env, windowssys_windows_win32_system_threading_getProcessTimes_napi));
    exports.Set("windowssys_windows_win32_system_threading_getProcessVersion", Napi::Function::New(env, windowssys_windows_win32_system_threading_getProcessVersion_napi));
    exports.Set("windowssys_windows_win32_system_threading_getProcessWorkingSetSize", Napi::Function::New(env, windowssys_windows_win32_system_threading_getProcessWorkingSetSize_napi));
    exports.Set("windowssys_windows_win32_system_threading_getStartupInfoA", Napi::Function::New(env, windowssys_windows_win32_system_threading_getStartupInfoA_napi));
    exports.Set("windowssys_windows_win32_system_threading_getStartupInfoW", Napi::Function::New(env, windowssys_windows_win32_system_threading_getStartupInfoW_napi));
    exports.Set("windowssys_windows_win32_system_threading_getSystemTimes", Napi::Function::New(env, windowssys_windows_win32_system_threading_getSystemTimes_napi));
    exports.Set("windowssys_windows_win32_system_threading_getThreadDescription", Napi::Function::New(env, windowssys_windows_win32_system_threading_getThreadDescription_napi));
    exports.Set("windowssys_windows_win32_system_threading_getThreadGroupAffinity", Napi::Function::New(env, windowssys_windows_win32_system_threading_getThreadGroupAffinity_napi));
    exports.Set("windowssys_windows_win32_system_threading_getThreadIOPendingFlag", Napi::Function::New(env, windowssys_windows_win32_system_threading_getThreadIOPendingFlag_napi));
    exports.Set("windowssys_windows_win32_system_threading_getThreadId", Napi::Function::New(env, windowssys_windows_win32_system_threading_getThreadId_napi));
    exports.Set("windowssys_windows_win32_system_threading_getThreadIdealProcessorEx", Napi::Function::New(env, windowssys_windows_win32_system_threading_getThreadIdealProcessorEx_napi));
    exports.Set("windowssys_windows_win32_system_threading_getThreadInformation", Napi::Function::New(env, windowssys_windows_win32_system_threading_getThreadInformation_napi));
    exports.Set("windowssys_windows_win32_system_threading_getThreadPriority", Napi::Function::New(env, windowssys_windows_win32_system_threading_getThreadPriority_napi));
    exports.Set("windowssys_windows_win32_system_threading_getThreadPriorityBoost", Napi::Function::New(env, windowssys_windows_win32_system_threading_getThreadPriorityBoost_napi));
    exports.Set("windowssys_windows_win32_system_threading_getThreadSelectedCpuSetMasks", Napi::Function::New(env, windowssys_windows_win32_system_threading_getThreadSelectedCpuSetMasks_napi));
    exports.Set("windowssys_windows_win32_system_threading_getThreadSelectedCpuSets", Napi::Function::New(env, windowssys_windows_win32_system_threading_getThreadSelectedCpuSets_napi));
    exports.Set("windowssys_windows_win32_system_threading_getThreadTimes", Napi::Function::New(env, windowssys_windows_win32_system_threading_getThreadTimes_napi));
    exports.Set("windowssys_windows_win32_system_threading_getUmsCompletionListEvent", Napi::Function::New(env, windowssys_windows_win32_system_threading_getUmsCompletionListEvent_napi));
    exports.Set("windowssys_windows_win32_system_threading_getUmsSystemThreadInformation", Napi::Function::New(env, windowssys_windows_win32_system_threading_getUmsSystemThreadInformation_napi));
    exports.Set("windowssys_windows_win32_system_threading_initOnceBeginInitialize", Napi::Function::New(env, windowssys_windows_win32_system_threading_initOnceBeginInitialize_napi));
    exports.Set("windowssys_windows_win32_system_threading_initOnceComplete", Napi::Function::New(env, windowssys_windows_win32_system_threading_initOnceComplete_napi));
    exports.Set("windowssys_windows_win32_system_threading_initOnceExecuteOnce", Napi::Function::New(env, windowssys_windows_win32_system_threading_initOnceExecuteOnce_napi));
    exports.Set("windowssys_windows_win32_system_threading_initOnceInitialize", Napi::Function::New(env, windowssys_windows_win32_system_threading_initOnceInitialize_napi));
    exports.Set("windowssys_windows_win32_system_threading_initializeConditionVariable", Napi::Function::New(env, windowssys_windows_win32_system_threading_initializeConditionVariable_napi));
    exports.Set("windowssys_windows_win32_system_threading_initializeCriticalSection", Napi::Function::New(env, windowssys_windows_win32_system_threading_initializeCriticalSection_napi));
    exports.Set("windowssys_windows_win32_system_threading_initializeCriticalSectionAndSpinCount", Napi::Function::New(env, windowssys_windows_win32_system_threading_initializeCriticalSectionAndSpinCount_napi));
    exports.Set("windowssys_windows_win32_system_threading_initializeCriticalSectionEx", Napi::Function::New(env, windowssys_windows_win32_system_threading_initializeCriticalSectionEx_napi));
    exports.Set("windowssys_windows_win32_system_threading_initializeProcThreadAttributeList", Napi::Function::New(env, windowssys_windows_win32_system_threading_initializeProcThreadAttributeList_napi));
    exports.Set("windowssys_windows_win32_system_threading_initializeSListHead", Napi::Function::New(env, windowssys_windows_win32_system_threading_initializeSListHead_napi));
    exports.Set("windowssys_windows_win32_system_threading_initializeSRWLock", Napi::Function::New(env, windowssys_windows_win32_system_threading_initializeSRWLock_napi));
    exports.Set("windowssys_windows_win32_system_threading_initializeSynchronizationBarrier", Napi::Function::New(env, windowssys_windows_win32_system_threading_initializeSynchronizationBarrier_napi));
    exports.Set("windowssys_windows_win32_system_threading_interlockedFlushSList", Napi::Function::New(env, windowssys_windows_win32_system_threading_interlockedFlushSList_napi));
    exports.Set("windowssys_windows_win32_system_threading_interlockedPopEntrySList", Napi::Function::New(env, windowssys_windows_win32_system_threading_interlockedPopEntrySList_napi));
    exports.Set("windowssys_windows_win32_system_threading_interlockedPushEntrySList", Napi::Function::New(env, windowssys_windows_win32_system_threading_interlockedPushEntrySList_napi));
    exports.Set("windowssys_windows_win32_system_threading_interlockedPushListSListEx", Napi::Function::New(env, windowssys_windows_win32_system_threading_interlockedPushListSListEx_napi));
    exports.Set("windowssys_windows_win32_system_threading_isImmersiveProcess", Napi::Function::New(env, windowssys_windows_win32_system_threading_isImmersiveProcess_napi));
    exports.Set("windowssys_windows_win32_system_threading_isProcessCritical", Napi::Function::New(env, windowssys_windows_win32_system_threading_isProcessCritical_napi));
    exports.Set("windowssys_windows_win32_system_threading_isProcessorFeaturePresent", Napi::Function::New(env, windowssys_windows_win32_system_threading_isProcessorFeaturePresent_napi));
    exports.Set("windowssys_windows_win32_system_threading_isThreadAFiber", Napi::Function::New(env, windowssys_windows_win32_system_threading_isThreadAFiber_napi));
    exports.Set("windowssys_windows_win32_system_threading_isThreadpoolTimerSet", Napi::Function::New(env, windowssys_windows_win32_system_threading_isThreadpoolTimerSet_napi));
    exports.Set("windowssys_windows_win32_system_threading_isWow64Process", Napi::Function::New(env, windowssys_windows_win32_system_threading_isWow64Process_napi));
    exports.Set("windowssys_windows_win32_system_threading_isWow64Process2", Napi::Function::New(env, windowssys_windows_win32_system_threading_isWow64Process2_napi));
    exports.Set("windowssys_windows_win32_system_threading_leaveCriticalSection", Napi::Function::New(env, windowssys_windows_win32_system_threading_leaveCriticalSection_napi));
    exports.Set("windowssys_windows_win32_system_threading_leaveCriticalSectionWhenCallbackReturns", Napi::Function::New(env, windowssys_windows_win32_system_threading_leaveCriticalSectionWhenCallbackReturns_napi));
    exports.Set("windowssys_windows_win32_system_threading_openEventA", Napi::Function::New(env, windowssys_windows_win32_system_threading_openEventA_napi));
    exports.Set("windowssys_windows_win32_system_threading_openEventW", Napi::Function::New(env, windowssys_windows_win32_system_threading_openEventW_napi));
    exports.Set("windowssys_windows_win32_system_threading_openMutexW", Napi::Function::New(env, windowssys_windows_win32_system_threading_openMutexW_napi));
    exports.Set("windowssys_windows_win32_system_threading_openPrivateNamespaceA", Napi::Function::New(env, windowssys_windows_win32_system_threading_openPrivateNamespaceA_napi));
    exports.Set("windowssys_windows_win32_system_threading_openPrivateNamespaceW", Napi::Function::New(env, windowssys_windows_win32_system_threading_openPrivateNamespaceW_napi));
    exports.Set("windowssys_windows_win32_system_threading_openProcess", Napi::Function::New(env, windowssys_windows_win32_system_threading_openProcess_napi));
    exports.Set("windowssys_windows_win32_system_threading_openProcessToken", Napi::Function::New(env, windowssys_windows_win32_system_threading_openProcessToken_napi));
    exports.Set("windowssys_windows_win32_system_threading_openSemaphoreW", Napi::Function::New(env, windowssys_windows_win32_system_threading_openSemaphoreW_napi));
    exports.Set("windowssys_windows_win32_system_threading_openThread", Napi::Function::New(env, windowssys_windows_win32_system_threading_openThread_napi));
    exports.Set("windowssys_windows_win32_system_threading_openThreadToken", Napi::Function::New(env, windowssys_windows_win32_system_threading_openThreadToken_napi));
    exports.Set("windowssys_windows_win32_system_threading_openWaitableTimerA", Napi::Function::New(env, windowssys_windows_win32_system_threading_openWaitableTimerA_napi));
    exports.Set("windowssys_windows_win32_system_threading_openWaitableTimerW", Napi::Function::New(env, windowssys_windows_win32_system_threading_openWaitableTimerW_napi));
    exports.Set("windowssys_windows_win32_system_threading_pulseEvent", Napi::Function::New(env, windowssys_windows_win32_system_threading_pulseEvent_napi));
    exports.Set("windowssys_windows_win32_system_threading_queryDepthSList", Napi::Function::New(env, windowssys_windows_win32_system_threading_queryDepthSList_napi));
    exports.Set("windowssys_windows_win32_system_threading_queryFullProcessImageNameA", Napi::Function::New(env, windowssys_windows_win32_system_threading_queryFullProcessImageNameA_napi));
    exports.Set("windowssys_windows_win32_system_threading_queryFullProcessImageNameW", Napi::Function::New(env, windowssys_windows_win32_system_threading_queryFullProcessImageNameW_napi));
    exports.Set("windowssys_windows_win32_system_threading_queryProcessAffinityUpdateMode", Napi::Function::New(env, windowssys_windows_win32_system_threading_queryProcessAffinityUpdateMode_napi));
    exports.Set("windowssys_windows_win32_system_threading_queryProtectedPolicy", Napi::Function::New(env, windowssys_windows_win32_system_threading_queryProtectedPolicy_napi));
    exports.Set("windowssys_windows_win32_system_threading_queryThreadpoolStackInformation", Napi::Function::New(env, windowssys_windows_win32_system_threading_queryThreadpoolStackInformation_napi));
    exports.Set("windowssys_windows_win32_system_threading_queryUmsThreadInformation", Napi::Function::New(env, windowssys_windows_win32_system_threading_queryUmsThreadInformation_napi));
    exports.Set("windowssys_windows_win32_system_threading_queueUserWorkItem", Napi::Function::New(env, windowssys_windows_win32_system_threading_queueUserWorkItem_napi));
    exports.Set("windowssys_windows_win32_system_threading_registerWaitForSingleObject", Napi::Function::New(env, windowssys_windows_win32_system_threading_registerWaitForSingleObject_napi));
    exports.Set("windowssys_windows_win32_system_threading_releaseMutex", Napi::Function::New(env, windowssys_windows_win32_system_threading_releaseMutex_napi));
    exports.Set("windowssys_windows_win32_system_threading_releaseMutexWhenCallbackReturns", Napi::Function::New(env, windowssys_windows_win32_system_threading_releaseMutexWhenCallbackReturns_napi));
    exports.Set("windowssys_windows_win32_system_threading_releaseSRWLockExclusive", Napi::Function::New(env, windowssys_windows_win32_system_threading_releaseSRWLockExclusive_napi));
    exports.Set("windowssys_windows_win32_system_threading_releaseSRWLockShared", Napi::Function::New(env, windowssys_windows_win32_system_threading_releaseSRWLockShared_napi));
    exports.Set("windowssys_windows_win32_system_threading_releaseSemaphore", Napi::Function::New(env, windowssys_windows_win32_system_threading_releaseSemaphore_napi));
    exports.Set("windowssys_windows_win32_system_threading_releaseSemaphoreWhenCallbackReturns", Napi::Function::New(env, windowssys_windows_win32_system_threading_releaseSemaphoreWhenCallbackReturns_napi));
    exports.Set("windowssys_windows_win32_system_threading_resetEvent", Napi::Function::New(env, windowssys_windows_win32_system_threading_resetEvent_napi));
    exports.Set("windowssys_windows_win32_system_threading_resumeThread", Napi::Function::New(env, windowssys_windows_win32_system_threading_resumeThread_napi));
    exports.Set("windowssys_windows_win32_system_threading_rtwqAddPeriodicCallback", Napi::Function::New(env, windowssys_windows_win32_system_threading_rtwqAddPeriodicCallback_napi));
    exports.Set("windowssys_windows_win32_system_threading_rtwqAllocateSerialWorkQueue", Napi::Function::New(env, windowssys_windows_win32_system_threading_rtwqAllocateSerialWorkQueue_napi));
    exports.Set("windowssys_windows_win32_system_threading_rtwqAllocateWorkQueue", Napi::Function::New(env, windowssys_windows_win32_system_threading_rtwqAllocateWorkQueue_napi));
    exports.Set("windowssys_windows_win32_system_threading_rtwqBeginRegisterWorkQueueWithMMCSS", Napi::Function::New(env, windowssys_windows_win32_system_threading_rtwqBeginRegisterWorkQueueWithMMCSS_napi));
    exports.Set("windowssys_windows_win32_system_threading_rtwqBeginUnregisterWorkQueueWithMMCSS", Napi::Function::New(env, windowssys_windows_win32_system_threading_rtwqBeginUnregisterWorkQueueWithMMCSS_napi));
    exports.Set("windowssys_windows_win32_system_threading_rtwqCancelDeadline", Napi::Function::New(env, windowssys_windows_win32_system_threading_rtwqCancelDeadline_napi));
    exports.Set("windowssys_windows_win32_system_threading_rtwqCancelWorkItem", Napi::Function::New(env, windowssys_windows_win32_system_threading_rtwqCancelWorkItem_napi));
    exports.Set("windowssys_windows_win32_system_threading_rtwqCreateAsyncResult", Napi::Function::New(env, windowssys_windows_win32_system_threading_rtwqCreateAsyncResult_napi));
    exports.Set("windowssys_windows_win32_system_threading_rtwqEndRegisterWorkQueueWithMMCSS", Napi::Function::New(env, windowssys_windows_win32_system_threading_rtwqEndRegisterWorkQueueWithMMCSS_napi));
    exports.Set("windowssys_windows_win32_system_threading_rtwqGetWorkQueueMMCSSClass", Napi::Function::New(env, windowssys_windows_win32_system_threading_rtwqGetWorkQueueMMCSSClass_napi));
    exports.Set("windowssys_windows_win32_system_threading_rtwqGetWorkQueueMMCSSPriority", Napi::Function::New(env, windowssys_windows_win32_system_threading_rtwqGetWorkQueueMMCSSPriority_napi));
    exports.Set("windowssys_windows_win32_system_threading_rtwqGetWorkQueueMMCSSTaskId", Napi::Function::New(env, windowssys_windows_win32_system_threading_rtwqGetWorkQueueMMCSSTaskId_napi));
    exports.Set("windowssys_windows_win32_system_threading_rtwqInvokeCallback", Napi::Function::New(env, windowssys_windows_win32_system_threading_rtwqInvokeCallback_napi));
    exports.Set("windowssys_windows_win32_system_threading_rtwqJoinWorkQueue", Napi::Function::New(env, windowssys_windows_win32_system_threading_rtwqJoinWorkQueue_napi));
    exports.Set("windowssys_windows_win32_system_threading_rtwqLockPlatform", Napi::Function::New(env, windowssys_windows_win32_system_threading_rtwqLockPlatform_napi));
    exports.Set("windowssys_windows_win32_system_threading_rtwqLockSharedWorkQueue", Napi::Function::New(env, windowssys_windows_win32_system_threading_rtwqLockSharedWorkQueue_napi));
    exports.Set("windowssys_windows_win32_system_threading_rtwqLockWorkQueue", Napi::Function::New(env, windowssys_windows_win32_system_threading_rtwqLockWorkQueue_napi));
    exports.Set("windowssys_windows_win32_system_threading_rtwqPutWaitingWorkItem", Napi::Function::New(env, windowssys_windows_win32_system_threading_rtwqPutWaitingWorkItem_napi));
    exports.Set("windowssys_windows_win32_system_threading_rtwqPutWorkItem", Napi::Function::New(env, windowssys_windows_win32_system_threading_rtwqPutWorkItem_napi));
    exports.Set("windowssys_windows_win32_system_threading_rtwqRegisterPlatformEvents", Napi::Function::New(env, windowssys_windows_win32_system_threading_rtwqRegisterPlatformEvents_napi));
    exports.Set("windowssys_windows_win32_system_threading_rtwqRegisterPlatformWithMMCSS", Napi::Function::New(env, windowssys_windows_win32_system_threading_rtwqRegisterPlatformWithMMCSS_napi));
    exports.Set("windowssys_windows_win32_system_threading_rtwqRemovePeriodicCallback", Napi::Function::New(env, windowssys_windows_win32_system_threading_rtwqRemovePeriodicCallback_napi));
    exports.Set("windowssys_windows_win32_system_threading_rtwqScheduleWorkItem", Napi::Function::New(env, windowssys_windows_win32_system_threading_rtwqScheduleWorkItem_napi));
    exports.Set("windowssys_windows_win32_system_threading_rtwqSetDeadline", Napi::Function::New(env, windowssys_windows_win32_system_threading_rtwqSetDeadline_napi));
    exports.Set("windowssys_windows_win32_system_threading_rtwqSetDeadline2", Napi::Function::New(env, windowssys_windows_win32_system_threading_rtwqSetDeadline2_napi));
    exports.Set("windowssys_windows_win32_system_threading_rtwqSetLongRunning", Napi::Function::New(env, windowssys_windows_win32_system_threading_rtwqSetLongRunning_napi));
    exports.Set("windowssys_windows_win32_system_threading_rtwqShutdown", Napi::Function::New(env, windowssys_windows_win32_system_threading_rtwqShutdown_napi));
    exports.Set("windowssys_windows_win32_system_threading_rtwqStartup", Napi::Function::New(env, windowssys_windows_win32_system_threading_rtwqStartup_napi));
    exports.Set("windowssys_windows_win32_system_threading_rtwqUnjoinWorkQueue", Napi::Function::New(env, windowssys_windows_win32_system_threading_rtwqUnjoinWorkQueue_napi));
    exports.Set("windowssys_windows_win32_system_threading_rtwqUnlockPlatform", Napi::Function::New(env, windowssys_windows_win32_system_threading_rtwqUnlockPlatform_napi));
    exports.Set("windowssys_windows_win32_system_threading_rtwqUnlockWorkQueue", Napi::Function::New(env, windowssys_windows_win32_system_threading_rtwqUnlockWorkQueue_napi));
    exports.Set("windowssys_windows_win32_system_threading_rtwqUnregisterPlatformEvents", Napi::Function::New(env, windowssys_windows_win32_system_threading_rtwqUnregisterPlatformEvents_napi));
    exports.Set("windowssys_windows_win32_system_threading_rtwqUnregisterPlatformFromMMCSS", Napi::Function::New(env, windowssys_windows_win32_system_threading_rtwqUnregisterPlatformFromMMCSS_napi));
    exports.Set("windowssys_windows_win32_system_threading_setCriticalSectionSpinCount", Napi::Function::New(env, windowssys_windows_win32_system_threading_setCriticalSectionSpinCount_napi));
    exports.Set("windowssys_windows_win32_system_threading_setEvent", Napi::Function::New(env, windowssys_windows_win32_system_threading_setEvent_napi));
    exports.Set("windowssys_windows_win32_system_threading_setEventWhenCallbackReturns", Napi::Function::New(env, windowssys_windows_win32_system_threading_setEventWhenCallbackReturns_napi));
    exports.Set("windowssys_windows_win32_system_threading_setPriorityClass", Napi::Function::New(env, windowssys_windows_win32_system_threading_setPriorityClass_napi));
    exports.Set("windowssys_windows_win32_system_threading_setProcessAffinityMask", Napi::Function::New(env, windowssys_windows_win32_system_threading_setProcessAffinityMask_napi));
    exports.Set("windowssys_windows_win32_system_threading_setProcessAffinityUpdateMode", Napi::Function::New(env, windowssys_windows_win32_system_threading_setProcessAffinityUpdateMode_napi));
    exports.Set("windowssys_windows_win32_system_threading_setProcessDEPPolicy", Napi::Function::New(env, windowssys_windows_win32_system_threading_setProcessDEPPolicy_napi));
    exports.Set("windowssys_windows_win32_system_threading_setProcessDefaultCpuSetMasks", Napi::Function::New(env, windowssys_windows_win32_system_threading_setProcessDefaultCpuSetMasks_napi));
    exports.Set("windowssys_windows_win32_system_threading_setProcessDefaultCpuSets", Napi::Function::New(env, windowssys_windows_win32_system_threading_setProcessDefaultCpuSets_napi));
    exports.Set("windowssys_windows_win32_system_threading_setProcessDynamicEHContinuationTargets", Napi::Function::New(env, windowssys_windows_win32_system_threading_setProcessDynamicEHContinuationTargets_napi));
    exports.Set("windowssys_windows_win32_system_threading_setProcessDynamicEnforcedCetCompatibleRanges", Napi::Function::New(env, windowssys_windows_win32_system_threading_setProcessDynamicEnforcedCetCompatibleRanges_napi));
    exports.Set("windowssys_windows_win32_system_threading_setProcessInformation", Napi::Function::New(env, windowssys_windows_win32_system_threading_setProcessInformation_napi));
    exports.Set("windowssys_windows_win32_system_threading_setProcessMitigationPolicy", Napi::Function::New(env, windowssys_windows_win32_system_threading_setProcessMitigationPolicy_napi));
    exports.Set("windowssys_windows_win32_system_threading_setProcessPriorityBoost", Napi::Function::New(env, windowssys_windows_win32_system_threading_setProcessPriorityBoost_napi));
    exports.Set("windowssys_windows_win32_system_threading_setProcessRestrictionExemption", Napi::Function::New(env, windowssys_windows_win32_system_threading_setProcessRestrictionExemption_napi));
    exports.Set("windowssys_windows_win32_system_threading_setProcessShutdownParameters", Napi::Function::New(env, windowssys_windows_win32_system_threading_setProcessShutdownParameters_napi));
    exports.Set("windowssys_windows_win32_system_threading_setProcessWorkingSetSize", Napi::Function::New(env, windowssys_windows_win32_system_threading_setProcessWorkingSetSize_napi));
    exports.Set("windowssys_windows_win32_system_threading_setProtectedPolicy", Napi::Function::New(env, windowssys_windows_win32_system_threading_setProtectedPolicy_napi));
    exports.Set("windowssys_windows_win32_system_threading_setThreadAffinityMask", Napi::Function::New(env, windowssys_windows_win32_system_threading_setThreadAffinityMask_napi));
    exports.Set("windowssys_windows_win32_system_threading_setThreadDescription", Napi::Function::New(env, windowssys_windows_win32_system_threading_setThreadDescription_napi));
    exports.Set("windowssys_windows_win32_system_threading_setThreadGroupAffinity", Napi::Function::New(env, windowssys_windows_win32_system_threading_setThreadGroupAffinity_napi));
    exports.Set("windowssys_windows_win32_system_threading_setThreadIdealProcessor", Napi::Function::New(env, windowssys_windows_win32_system_threading_setThreadIdealProcessor_napi));
    exports.Set("windowssys_windows_win32_system_threading_setThreadIdealProcessorEx", Napi::Function::New(env, windowssys_windows_win32_system_threading_setThreadIdealProcessorEx_napi));
    exports.Set("windowssys_windows_win32_system_threading_setThreadInformation", Napi::Function::New(env, windowssys_windows_win32_system_threading_setThreadInformation_napi));
    exports.Set("windowssys_windows_win32_system_threading_setThreadPriority", Napi::Function::New(env, windowssys_windows_win32_system_threading_setThreadPriority_napi));
    exports.Set("windowssys_windows_win32_system_threading_setThreadPriorityBoost", Napi::Function::New(env, windowssys_windows_win32_system_threading_setThreadPriorityBoost_napi));
    exports.Set("windowssys_windows_win32_system_threading_setThreadSelectedCpuSetMasks", Napi::Function::New(env, windowssys_windows_win32_system_threading_setThreadSelectedCpuSetMasks_napi));
    exports.Set("windowssys_windows_win32_system_threading_setThreadSelectedCpuSets", Napi::Function::New(env, windowssys_windows_win32_system_threading_setThreadSelectedCpuSets_napi));
    exports.Set("windowssys_windows_win32_system_threading_setThreadStackGuarantee", Napi::Function::New(env, windowssys_windows_win32_system_threading_setThreadStackGuarantee_napi));
    exports.Set("windowssys_windows_win32_system_threading_setThreadToken", Napi::Function::New(env, windowssys_windows_win32_system_threading_setThreadToken_napi));
    exports.Set("windowssys_windows_win32_system_threading_setThreadpoolStackInformation", Napi::Function::New(env, windowssys_windows_win32_system_threading_setThreadpoolStackInformation_napi));
    exports.Set("windowssys_windows_win32_system_threading_setThreadpoolThreadMaximum", Napi::Function::New(env, windowssys_windows_win32_system_threading_setThreadpoolThreadMaximum_napi));
    exports.Set("windowssys_windows_win32_system_threading_setThreadpoolThreadMinimum", Napi::Function::New(env, windowssys_windows_win32_system_threading_setThreadpoolThreadMinimum_napi));
    exports.Set("windowssys_windows_win32_system_threading_setThreadpoolTimer", Napi::Function::New(env, windowssys_windows_win32_system_threading_setThreadpoolTimer_napi));
    exports.Set("windowssys_windows_win32_system_threading_setThreadpoolTimerEx", Napi::Function::New(env, windowssys_windows_win32_system_threading_setThreadpoolTimerEx_napi));
    exports.Set("windowssys_windows_win32_system_threading_setThreadpoolWait", Napi::Function::New(env, windowssys_windows_win32_system_threading_setThreadpoolWait_napi));
    exports.Set("windowssys_windows_win32_system_threading_setThreadpoolWaitEx", Napi::Function::New(env, windowssys_windows_win32_system_threading_setThreadpoolWaitEx_napi));
    exports.Set("windowssys_windows_win32_system_threading_setTimerQueueTimer", Napi::Function::New(env, windowssys_windows_win32_system_threading_setTimerQueueTimer_napi));
    exports.Set("windowssys_windows_win32_system_threading_setUmsThreadInformation", Napi::Function::New(env, windowssys_windows_win32_system_threading_setUmsThreadInformation_napi));
    exports.Set("windowssys_windows_win32_system_threading_setWaitableTimer", Napi::Function::New(env, windowssys_windows_win32_system_threading_setWaitableTimer_napi));
    exports.Set("windowssys_windows_win32_system_threading_setWaitableTimerEx", Napi::Function::New(env, windowssys_windows_win32_system_threading_setWaitableTimerEx_napi));
    exports.Set("windowssys_windows_win32_system_threading_signalObjectAndWait", Napi::Function::New(env, windowssys_windows_win32_system_threading_signalObjectAndWait_napi));
    exports.Set("windowssys_windows_win32_system_threading_sleep", Napi::Function::New(env, windowssys_windows_win32_system_threading_sleep_napi));
    exports.Set("windowssys_windows_win32_system_threading_sleepConditionVariableCS", Napi::Function::New(env, windowssys_windows_win32_system_threading_sleepConditionVariableCS_napi));
    exports.Set("windowssys_windows_win32_system_threading_sleepConditionVariableSRW", Napi::Function::New(env, windowssys_windows_win32_system_threading_sleepConditionVariableSRW_napi));
    exports.Set("windowssys_windows_win32_system_threading_sleepEx", Napi::Function::New(env, windowssys_windows_win32_system_threading_sleepEx_napi));
    exports.Set("windowssys_windows_win32_system_threading_startThreadpoolIo", Napi::Function::New(env, windowssys_windows_win32_system_threading_startThreadpoolIo_napi));
    exports.Set("windowssys_windows_win32_system_threading_submitThreadpoolWork", Napi::Function::New(env, windowssys_windows_win32_system_threading_submitThreadpoolWork_napi));
    exports.Set("windowssys_windows_win32_system_threading_suspendThread", Napi::Function::New(env, windowssys_windows_win32_system_threading_suspendThread_napi));
    exports.Set("windowssys_windows_win32_system_threading_switchToFiber", Napi::Function::New(env, windowssys_windows_win32_system_threading_switchToFiber_napi));
    exports.Set("windowssys_windows_win32_system_threading_switchToThread", Napi::Function::New(env, windowssys_windows_win32_system_threading_switchToThread_napi));
    exports.Set("windowssys_windows_win32_system_threading_terminateProcess", Napi::Function::New(env, windowssys_windows_win32_system_threading_terminateProcess_napi));
    exports.Set("windowssys_windows_win32_system_threading_terminateThread", Napi::Function::New(env, windowssys_windows_win32_system_threading_terminateThread_napi));
    exports.Set("windowssys_windows_win32_system_threading_tlsAlloc", Napi::Function::New(env, windowssys_windows_win32_system_threading_tlsAlloc_napi));
    exports.Set("windowssys_windows_win32_system_threading_tlsFree", Napi::Function::New(env, windowssys_windows_win32_system_threading_tlsFree_napi));
    exports.Set("windowssys_windows_win32_system_threading_tlsGetValue", Napi::Function::New(env, windowssys_windows_win32_system_threading_tlsGetValue_napi));
    exports.Set("windowssys_windows_win32_system_threading_tlsSetValue", Napi::Function::New(env, windowssys_windows_win32_system_threading_tlsSetValue_napi));
    exports.Set("windowssys_windows_win32_system_threading_tryAcquireSRWLockExclusive", Napi::Function::New(env, windowssys_windows_win32_system_threading_tryAcquireSRWLockExclusive_napi));
    exports.Set("windowssys_windows_win32_system_threading_tryAcquireSRWLockShared", Napi::Function::New(env, windowssys_windows_win32_system_threading_tryAcquireSRWLockShared_napi));
    exports.Set("windowssys_windows_win32_system_threading_tryEnterCriticalSection", Napi::Function::New(env, windowssys_windows_win32_system_threading_tryEnterCriticalSection_napi));
    exports.Set("windowssys_windows_win32_system_threading_trySubmitThreadpoolCallback", Napi::Function::New(env, windowssys_windows_win32_system_threading_trySubmitThreadpoolCallback_napi));
    exports.Set("windowssys_windows_win32_system_threading_umsThreadYield", Napi::Function::New(env, windowssys_windows_win32_system_threading_umsThreadYield_napi));
    exports.Set("windowssys_windows_win32_system_threading_unregisterWait", Napi::Function::New(env, windowssys_windows_win32_system_threading_unregisterWait_napi));
    exports.Set("windowssys_windows_win32_system_threading_unregisterWaitEx", Napi::Function::New(env, windowssys_windows_win32_system_threading_unregisterWaitEx_napi));
    exports.Set("windowssys_windows_win32_system_threading_updateProcThreadAttribute", Napi::Function::New(env, windowssys_windows_win32_system_threading_updateProcThreadAttribute_napi));
    exports.Set("windowssys_windows_win32_system_threading_waitForInputIdle", Napi::Function::New(env, windowssys_windows_win32_system_threading_waitForInputIdle_napi));
    exports.Set("windowssys_windows_win32_system_threading_waitForMultipleObjects", Napi::Function::New(env, windowssys_windows_win32_system_threading_waitForMultipleObjects_napi));
    exports.Set("windowssys_windows_win32_system_threading_waitForMultipleObjectsEx", Napi::Function::New(env, windowssys_windows_win32_system_threading_waitForMultipleObjectsEx_napi));
    exports.Set("windowssys_windows_win32_system_threading_waitForSingleObject", Napi::Function::New(env, windowssys_windows_win32_system_threading_waitForSingleObject_napi));
    exports.Set("windowssys_windows_win32_system_threading_waitForSingleObjectEx", Napi::Function::New(env, windowssys_windows_win32_system_threading_waitForSingleObjectEx_napi));
    exports.Set("windowssys_windows_win32_system_threading_waitForThreadpoolIoCallbacks", Napi::Function::New(env, windowssys_windows_win32_system_threading_waitForThreadpoolIoCallbacks_napi));
    exports.Set("windowssys_windows_win32_system_threading_waitForThreadpoolTimerCallbacks", Napi::Function::New(env, windowssys_windows_win32_system_threading_waitForThreadpoolTimerCallbacks_napi));
    exports.Set("windowssys_windows_win32_system_threading_waitForThreadpoolWaitCallbacks", Napi::Function::New(env, windowssys_windows_win32_system_threading_waitForThreadpoolWaitCallbacks_napi));
    exports.Set("windowssys_windows_win32_system_threading_waitForThreadpoolWorkCallbacks", Napi::Function::New(env, windowssys_windows_win32_system_threading_waitForThreadpoolWorkCallbacks_napi));
    exports.Set("windowssys_windows_win32_system_threading_waitOnAddress", Napi::Function::New(env, windowssys_windows_win32_system_threading_waitOnAddress_napi));
    exports.Set("windowssys_windows_win32_system_threading_wakeAllConditionVariable", Napi::Function::New(env, windowssys_windows_win32_system_threading_wakeAllConditionVariable_napi));
    exports.Set("windowssys_windows_win32_system_threading_wakeByAddressAll", Napi::Function::New(env, windowssys_windows_win32_system_threading_wakeByAddressAll_napi));
    exports.Set("windowssys_windows_win32_system_threading_wakeByAddressSingle", Napi::Function::New(env, windowssys_windows_win32_system_threading_wakeByAddressSingle_napi));
    exports.Set("windowssys_windows_win32_system_threading_wakeConditionVariable", Napi::Function::New(env, windowssys_windows_win32_system_threading_wakeConditionVariable_napi));
    exports.Set("windowssys_windows_win32_system_threading_winExec", Napi::Function::New(env, windowssys_windows_win32_system_threading_winExec_napi));
    exports.Set("windowssys_windows_win32_system_threading_wow64SetThreadDefaultGuestMachine", Napi::Function::New(env, windowssys_windows_win32_system_threading_wow64SetThreadDefaultGuestMachine_napi));
    exports.Set("windowssys_windows_win32_system_threading_wow64SuspendThread", Napi::Function::New(env, windowssys_windows_win32_system_threading_wow64SuspendThread_napi));
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
