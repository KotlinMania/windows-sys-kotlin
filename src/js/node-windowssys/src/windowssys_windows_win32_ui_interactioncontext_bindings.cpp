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

static Napi::Value windowssys_windows_win32_ui_interactioncontext_AddPointerInteractionContext_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* interactioncontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t pointerid = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ninput.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "AddPointerInteractionContext")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(interactioncontext, pointerid) : -1;
#else
    (void)interactioncontext;
    (void)pointerid;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_interactioncontext_BufferPointerPacketsInteractionContext_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* interactioncontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t entriescount = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pointerinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ninput.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "BufferPointerPacketsInteractionContext")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(interactioncontext, entriescount, pointerinfo) : -1;
#else
    (void)interactioncontext;
    (void)entriescount;
    (void)pointerinfo;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_interactioncontext_CreateInteractionContext_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* interactioncontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ninput.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CreateInteractionContext")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(interactioncontext) : -1;
#else
    (void)interactioncontext;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_interactioncontext_DestroyInteractionContext_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* interactioncontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ninput.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DestroyInteractionContext")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(interactioncontext) : -1;
#else
    (void)interactioncontext;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_interactioncontext_GetCrossSlideParameterInteractionContext_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* interactioncontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t threshold = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* distance = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ninput.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetCrossSlideParameterInteractionContext")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(interactioncontext, threshold, distance) : -1;
#else
    (void)interactioncontext;
    (void)threshold;
    (void)distance;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_interactioncontext_GetHoldParameterInteractionContext_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* interactioncontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t parameter = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* value = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ninput.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetHoldParameterInteractionContext")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(interactioncontext, parameter, value) : -1;
#else
    (void)interactioncontext;
    (void)parameter;
    (void)value;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_interactioncontext_GetInertiaParameterInteractionContext_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* interactioncontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t inertiaparameter = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* value = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ninput.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetInertiaParameterInteractionContext")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(interactioncontext, inertiaparameter, value) : -1;
#else
    (void)interactioncontext;
    (void)inertiaparameter;
    (void)value;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_interactioncontext_GetInteractionConfigurationInteractionContext_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* interactioncontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t configurationcount = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* configuration = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ninput.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetInteractionConfigurationInteractionContext")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(interactioncontext, configurationcount, configuration) : -1;
#else
    (void)interactioncontext;
    (void)configurationcount;
    (void)configuration;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_interactioncontext_GetMouseWheelParameterInteractionContext_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* interactioncontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t parameter = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* value = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ninput.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetMouseWheelParameterInteractionContext")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(interactioncontext, parameter, value) : -1;
#else
    (void)interactioncontext;
    (void)parameter;
    (void)value;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_interactioncontext_GetPropertyInteractionContext_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* interactioncontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t contextproperty = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* value = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ninput.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetPropertyInteractionContext")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(interactioncontext, contextproperty, value) : -1;
#else
    (void)interactioncontext;
    (void)contextproperty;
    (void)value;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_interactioncontext_GetStateInteractionContext_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* interactioncontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pointerinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* state = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ninput.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetStateInteractionContext")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(interactioncontext, pointerinfo, state) : -1;
#else
    (void)interactioncontext;
    (void)pointerinfo;
    (void)state;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_interactioncontext_GetTapParameterInteractionContext_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* interactioncontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t parameter = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* value = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ninput.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetTapParameterInteractionContext")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(interactioncontext, parameter, value) : -1;
#else
    (void)interactioncontext;
    (void)parameter;
    (void)value;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_interactioncontext_GetTranslationParameterInteractionContext_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* interactioncontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t parameter = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* value = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ninput.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetTranslationParameterInteractionContext")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(interactioncontext, parameter, value) : -1;
#else
    (void)interactioncontext;
    (void)parameter;
    (void)value;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_interactioncontext_ProcessBufferedPacketsInteractionContext_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* interactioncontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ninput.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ProcessBufferedPacketsInteractionContext")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(interactioncontext) : -1;
#else
    (void)interactioncontext;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_interactioncontext_ProcessInertiaInteractionContext_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* interactioncontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ninput.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ProcessInertiaInteractionContext")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(interactioncontext) : -1;
#else
    (void)interactioncontext;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_interactioncontext_ProcessPointerFramesInteractionContext_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* interactioncontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t entriescount = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t pointercount = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pointerinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ninput.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ProcessPointerFramesInteractionContext")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(interactioncontext, entriescount, pointercount, pointerinfo) : -1;
#else
    (void)interactioncontext;
    (void)entriescount;
    (void)pointercount;
    (void)pointerinfo;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_interactioncontext_RegisterOutputCallbackInteractionContext_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* interactioncontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* outputcallback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* clientdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ninput.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RegisterOutputCallbackInteractionContext")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(interactioncontext, outputcallback, clientdata) : -1;
#else
    (void)interactioncontext;
    (void)outputcallback;
    (void)clientdata;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_interactioncontext_RegisterOutputCallbackInteractionContext2_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* interactioncontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* outputcallback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* clientdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ninput.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RegisterOutputCallbackInteractionContext2")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(interactioncontext, outputcallback, clientdata) : -1;
#else
    (void)interactioncontext;
    (void)outputcallback;
    (void)clientdata;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_interactioncontext_RemovePointerInteractionContext_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* interactioncontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t pointerid = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ninput.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RemovePointerInteractionContext")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(interactioncontext, pointerid) : -1;
#else
    (void)interactioncontext;
    (void)pointerid;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_interactioncontext_ResetInteractionContext_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* interactioncontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ninput.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ResetInteractionContext")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(interactioncontext) : -1;
#else
    (void)interactioncontext;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_interactioncontext_SetCrossSlideParametersInteractionContext_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* interactioncontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t parametercount = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* crossslideparameters = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ninput.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetCrossSlideParametersInteractionContext")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(interactioncontext, parametercount, crossslideparameters) : -1;
#else
    (void)interactioncontext;
    (void)parametercount;
    (void)crossslideparameters;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_interactioncontext_SetHoldParameterInteractionContext_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* interactioncontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t parameter = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    float value = km_info.Length() > 2 ? km_info[2].ToNumber().FloatValue() : 0.0f;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, float);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ninput.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetHoldParameterInteractionContext")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(interactioncontext, parameter, value) : -1;
#else
    (void)interactioncontext;
    (void)parameter;
    (void)value;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_interactioncontext_SetInertiaParameterInteractionContext_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* interactioncontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t inertiaparameter = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    float value = km_info.Length() > 2 ? km_info[2].ToNumber().FloatValue() : 0.0f;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, float);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ninput.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetInertiaParameterInteractionContext")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(interactioncontext, inertiaparameter, value) : -1;
#else
    (void)interactioncontext;
    (void)inertiaparameter;
    (void)value;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_interactioncontext_SetInteractionConfigurationInteractionContext_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* interactioncontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t configurationcount = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* configuration = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ninput.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetInteractionConfigurationInteractionContext")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(interactioncontext, configurationcount, configuration) : -1;
#else
    (void)interactioncontext;
    (void)configurationcount;
    (void)configuration;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_interactioncontext_SetMouseWheelParameterInteractionContext_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* interactioncontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t parameter = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    float value = km_info.Length() > 2 ? km_info[2].ToNumber().FloatValue() : 0.0f;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, float);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ninput.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetMouseWheelParameterInteractionContext")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(interactioncontext, parameter, value) : -1;
#else
    (void)interactioncontext;
    (void)parameter;
    (void)value;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_interactioncontext_SetPivotInteractionContext_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* interactioncontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    float x = km_info.Length() > 1 ? km_info[1].ToNumber().FloatValue() : 0.0f;
    float y = km_info.Length() > 2 ? km_info[2].ToNumber().FloatValue() : 0.0f;
    float radius = km_info.Length() > 3 ? km_info[3].ToNumber().FloatValue() : 0.0f;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, float, float);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ninput.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetPivotInteractionContext")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(interactioncontext, x, y, radius) : -1;
#else
    (void)interactioncontext;
    (void)x;
    (void)y;
    (void)radius;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_interactioncontext_SetPropertyInteractionContext_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* interactioncontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t contextproperty = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t value = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ninput.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetPropertyInteractionContext")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(interactioncontext, contextproperty, value) : -1;
#else
    (void)interactioncontext;
    (void)contextproperty;
    (void)value;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_interactioncontext_SetTapParameterInteractionContext_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* interactioncontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t parameter = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    float value = km_info.Length() > 2 ? km_info[2].ToNumber().FloatValue() : 0.0f;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, float);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ninput.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetTapParameterInteractionContext")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(interactioncontext, parameter, value) : -1;
#else
    (void)interactioncontext;
    (void)parameter;
    (void)value;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_interactioncontext_SetTranslationParameterInteractionContext_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* interactioncontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t parameter = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    float value = km_info.Length() > 2 ? km_info[2].ToNumber().FloatValue() : 0.0f;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, float);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ninput.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetTranslationParameterInteractionContext")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(interactioncontext, parameter, value) : -1;
#else
    (void)interactioncontext;
    (void)parameter;
    (void)value;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_interactioncontext_StopInteractionContext_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* interactioncontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ninput.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "StopInteractionContext")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(interactioncontext) : -1;
#else
    (void)interactioncontext;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static void register_windows_win32_ui_interactioncontext_napi(Napi::Env env, Napi::Object exports) {
    exports.Set("windowssys_windows_win32_ui_interactioncontext_AddPointerInteractionContext", Napi::Function::New(env, windowssys_windows_win32_ui_interactioncontext_AddPointerInteractionContext_napi));
    exports.Set("windowssys_windows_win32_ui_interactioncontext_BufferPointerPacketsInteractionContext", Napi::Function::New(env, windowssys_windows_win32_ui_interactioncontext_BufferPointerPacketsInteractionContext_napi));
    exports.Set("windowssys_windows_win32_ui_interactioncontext_CreateInteractionContext", Napi::Function::New(env, windowssys_windows_win32_ui_interactioncontext_CreateInteractionContext_napi));
    exports.Set("windowssys_windows_win32_ui_interactioncontext_DestroyInteractionContext", Napi::Function::New(env, windowssys_windows_win32_ui_interactioncontext_DestroyInteractionContext_napi));
    exports.Set("windowssys_windows_win32_ui_interactioncontext_GetCrossSlideParameterInteractionContext", Napi::Function::New(env, windowssys_windows_win32_ui_interactioncontext_GetCrossSlideParameterInteractionContext_napi));
    exports.Set("windowssys_windows_win32_ui_interactioncontext_GetHoldParameterInteractionContext", Napi::Function::New(env, windowssys_windows_win32_ui_interactioncontext_GetHoldParameterInteractionContext_napi));
    exports.Set("windowssys_windows_win32_ui_interactioncontext_GetInertiaParameterInteractionContext", Napi::Function::New(env, windowssys_windows_win32_ui_interactioncontext_GetInertiaParameterInteractionContext_napi));
    exports.Set("windowssys_windows_win32_ui_interactioncontext_GetInteractionConfigurationInteractionContext", Napi::Function::New(env, windowssys_windows_win32_ui_interactioncontext_GetInteractionConfigurationInteractionContext_napi));
    exports.Set("windowssys_windows_win32_ui_interactioncontext_GetMouseWheelParameterInteractionContext", Napi::Function::New(env, windowssys_windows_win32_ui_interactioncontext_GetMouseWheelParameterInteractionContext_napi));
    exports.Set("windowssys_windows_win32_ui_interactioncontext_GetPropertyInteractionContext", Napi::Function::New(env, windowssys_windows_win32_ui_interactioncontext_GetPropertyInteractionContext_napi));
    exports.Set("windowssys_windows_win32_ui_interactioncontext_GetStateInteractionContext", Napi::Function::New(env, windowssys_windows_win32_ui_interactioncontext_GetStateInteractionContext_napi));
    exports.Set("windowssys_windows_win32_ui_interactioncontext_GetTapParameterInteractionContext", Napi::Function::New(env, windowssys_windows_win32_ui_interactioncontext_GetTapParameterInteractionContext_napi));
    exports.Set("windowssys_windows_win32_ui_interactioncontext_GetTranslationParameterInteractionContext", Napi::Function::New(env, windowssys_windows_win32_ui_interactioncontext_GetTranslationParameterInteractionContext_napi));
    exports.Set("windowssys_windows_win32_ui_interactioncontext_ProcessBufferedPacketsInteractionContext", Napi::Function::New(env, windowssys_windows_win32_ui_interactioncontext_ProcessBufferedPacketsInteractionContext_napi));
    exports.Set("windowssys_windows_win32_ui_interactioncontext_ProcessInertiaInteractionContext", Napi::Function::New(env, windowssys_windows_win32_ui_interactioncontext_ProcessInertiaInteractionContext_napi));
    exports.Set("windowssys_windows_win32_ui_interactioncontext_ProcessPointerFramesInteractionContext", Napi::Function::New(env, windowssys_windows_win32_ui_interactioncontext_ProcessPointerFramesInteractionContext_napi));
    exports.Set("windowssys_windows_win32_ui_interactioncontext_RegisterOutputCallbackInteractionContext", Napi::Function::New(env, windowssys_windows_win32_ui_interactioncontext_RegisterOutputCallbackInteractionContext_napi));
    exports.Set("windowssys_windows_win32_ui_interactioncontext_RegisterOutputCallbackInteractionContext2", Napi::Function::New(env, windowssys_windows_win32_ui_interactioncontext_RegisterOutputCallbackInteractionContext2_napi));
    exports.Set("windowssys_windows_win32_ui_interactioncontext_RemovePointerInteractionContext", Napi::Function::New(env, windowssys_windows_win32_ui_interactioncontext_RemovePointerInteractionContext_napi));
    exports.Set("windowssys_windows_win32_ui_interactioncontext_ResetInteractionContext", Napi::Function::New(env, windowssys_windows_win32_ui_interactioncontext_ResetInteractionContext_napi));
    exports.Set("windowssys_windows_win32_ui_interactioncontext_SetCrossSlideParametersInteractionContext", Napi::Function::New(env, windowssys_windows_win32_ui_interactioncontext_SetCrossSlideParametersInteractionContext_napi));
    exports.Set("windowssys_windows_win32_ui_interactioncontext_SetHoldParameterInteractionContext", Napi::Function::New(env, windowssys_windows_win32_ui_interactioncontext_SetHoldParameterInteractionContext_napi));
    exports.Set("windowssys_windows_win32_ui_interactioncontext_SetInertiaParameterInteractionContext", Napi::Function::New(env, windowssys_windows_win32_ui_interactioncontext_SetInertiaParameterInteractionContext_napi));
    exports.Set("windowssys_windows_win32_ui_interactioncontext_SetInteractionConfigurationInteractionContext", Napi::Function::New(env, windowssys_windows_win32_ui_interactioncontext_SetInteractionConfigurationInteractionContext_napi));
    exports.Set("windowssys_windows_win32_ui_interactioncontext_SetMouseWheelParameterInteractionContext", Napi::Function::New(env, windowssys_windows_win32_ui_interactioncontext_SetMouseWheelParameterInteractionContext_napi));
    exports.Set("windowssys_windows_win32_ui_interactioncontext_SetPivotInteractionContext", Napi::Function::New(env, windowssys_windows_win32_ui_interactioncontext_SetPivotInteractionContext_napi));
    exports.Set("windowssys_windows_win32_ui_interactioncontext_SetPropertyInteractionContext", Napi::Function::New(env, windowssys_windows_win32_ui_interactioncontext_SetPropertyInteractionContext_napi));
    exports.Set("windowssys_windows_win32_ui_interactioncontext_SetTapParameterInteractionContext", Napi::Function::New(env, windowssys_windows_win32_ui_interactioncontext_SetTapParameterInteractionContext_napi));
    exports.Set("windowssys_windows_win32_ui_interactioncontext_SetTranslationParameterInteractionContext", Napi::Function::New(env, windowssys_windows_win32_ui_interactioncontext_SetTranslationParameterInteractionContext_napi));
    exports.Set("windowssys_windows_win32_ui_interactioncontext_StopInteractionContext", Napi::Function::New(env, windowssys_windows_win32_ui_interactioncontext_StopInteractionContext_napi));
}

static KmNapiRegistrarNode registrar_node = { &register_windows_win32_ui_interactioncontext_napi, nullptr };
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
