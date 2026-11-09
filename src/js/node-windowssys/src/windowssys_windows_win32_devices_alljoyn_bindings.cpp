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

static Napi::Value windowssys_windows_win32_devices_alljoyn_AllJoynAcceptBusConnection_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* serverbushandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* abortevent = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "AllJoynAcceptBusConnection")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(serverbushandle, abortevent) : 0;
#else
    (void)serverbushandle;
    (void)abortevent;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_AllJoynCloseBusHandle_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* bushandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "AllJoynCloseBusHandle")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(bushandle) : -1;
#else
    (void)bushandle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_AllJoynConnectToBus_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* connectionspec = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "AllJoynConnectToBus")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(connectionspec) : NULL;
#else
    (void)connectionspec;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_AllJoynCreateBus_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t outbuffersize = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t inbuffersize = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* lpsecurityattributes = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "AllJoynCreateBus")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(outbuffersize, inbuffersize, lpsecurityattributes) : NULL;
#else
    (void)outbuffersize;
    (void)inbuffersize;
    (void)lpsecurityattributes;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_AllJoynEnumEvents_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* connectedbushandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* eventtoreset = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* eventtypes = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "AllJoynEnumEvents")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(connectedbushandle, eventtoreset, eventtypes) : -1;
#else
    (void)connectedbushandle;
    (void)eventtoreset;
    (void)eventtypes;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_AllJoynEventSelect_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* connectedbushandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* eventhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t eventtypes = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "AllJoynEventSelect")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(connectedbushandle, eventhandle, eventtypes) : -1;
#else
    (void)connectedbushandle;
    (void)eventhandle;
    (void)eventtypes;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_AllJoynReceiveFromBus_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* connectedbushandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t bytestoread = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* bytestransferred = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* reserved = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "AllJoynReceiveFromBus")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(connectedbushandle, buffer, bytestoread, bytestransferred, reserved) : -1;
#else
    (void)connectedbushandle;
    (void)buffer;
    (void)bytestoread;
    (void)bytestransferred;
    (void)reserved;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_AllJoynSendToBus_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* connectedbushandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t bytestowrite = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* bytestransferred = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* reserved = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "AllJoynSendToBus")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(connectedbushandle, buffer, bytestowrite, bytestransferred, reserved) : -1;
#else
    (void)connectedbushandle;
    (void)buffer;
    (void)bytestowrite;
    (void)bytestransferred;
    (void)reserved;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_QCC_StatusText_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t status = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "QCC_StatusText")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(status) : NULL;
#else
    (void)status;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_create_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* defaultlanguage = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_aboutdata_create")));
    }
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(defaultlanguage) : -1;
#else
    (void)defaultlanguage;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_create_empty_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_aboutdata_create_empty")));
    }
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr() : -1;
#else
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_create_full_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t arg = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* language = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_aboutdata_create_full")));
    }
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(arg, language) : -1;
#else
    (void)arg;
    (void)language;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_createfrommsgarg_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t data = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t arg = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
    void* language = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_aboutdata_createfrommsgarg")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(data, arg, language) : -1;
#else
    (void)data;
    (void)arg;
    (void)language;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_createfromxml_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t data = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* aboutdataxml = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_aboutdata_createfromxml")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(data, aboutdataxml) : -1;
#else
    (void)data;
    (void)aboutdataxml;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_destroy_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t data = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_aboutdata_destroy")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(data);
#else
    (void)data;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_getaboutdata_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t data = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t msgarg = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
    void* language = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_aboutdata_getaboutdata")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(data, msgarg, language) : -1;
#else
    (void)data;
    (void)msgarg;
    (void)language;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_getajsoftwareversion_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t data = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* ajsoftwareversion = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_aboutdata_getajsoftwareversion")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(data, ajsoftwareversion) : -1;
#else
    (void)data;
    (void)ajsoftwareversion;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_getannouncedaboutdata_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t data = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t msgarg = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_aboutdata_getannouncedaboutdata")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(data, msgarg) : -1;
#else
    (void)data;
    (void)msgarg;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_getappid_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t data = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* appid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* num = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_aboutdata_getappid")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(data, appid, num) : -1;
#else
    (void)data;
    (void)appid;
    (void)num;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_getappname_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t data = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* appname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* language = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_aboutdata_getappname")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(data, appname, language) : -1;
#else
    (void)data;
    (void)appname;
    (void)language;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_getdateofmanufacture_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t data = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* dateofmanufacture = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_aboutdata_getdateofmanufacture")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(data, dateofmanufacture) : -1;
#else
    (void)data;
    (void)dateofmanufacture;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_getdefaultlanguage_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t data = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* defaultlanguage = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_aboutdata_getdefaultlanguage")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(data, defaultlanguage) : -1;
#else
    (void)data;
    (void)defaultlanguage;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_getdescription_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t data = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* description = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* language = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_aboutdata_getdescription")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(data, description, language) : -1;
#else
    (void)data;
    (void)description;
    (void)language;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_getdeviceid_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t data = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* deviceid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_aboutdata_getdeviceid")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(data, deviceid) : -1;
#else
    (void)data;
    (void)deviceid;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_getdevicename_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t data = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* devicename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* language = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_aboutdata_getdevicename")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(data, devicename, language) : -1;
#else
    (void)data;
    (void)devicename;
    (void)language;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_getfield_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t data = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* name = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* value = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* language = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_aboutdata_getfield")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(data, name, value, language) : -1;
#else
    (void)data;
    (void)name;
    (void)value;
    (void)language;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_getfields_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t data = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* fields = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint64_t num_fields = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(int64_t, void*, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_aboutdata_getfields")));
    }
    uint64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(data, fields, num_fields) : 0;
#else
    (void)data;
    (void)fields;
    (void)num_fields;
    uint64_t km_res = 0;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<uint64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_getfieldsignature_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t data = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* fieldname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_aboutdata_getfieldsignature")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(data, fieldname) : NULL;
#else
    (void)data;
    (void)fieldname;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_gethardwareversion_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t data = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* hardwareversion = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_aboutdata_gethardwareversion")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(data, hardwareversion) : -1;
#else
    (void)data;
    (void)hardwareversion;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_getmanufacturer_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t data = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* manufacturer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* language = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_aboutdata_getmanufacturer")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(data, manufacturer, language) : -1;
#else
    (void)data;
    (void)manufacturer;
    (void)language;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_getmodelnumber_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t data = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* modelnumber = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_aboutdata_getmodelnumber")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(data, modelnumber) : -1;
#else
    (void)data;
    (void)modelnumber;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_getsoftwareversion_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t data = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* softwareversion = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_aboutdata_getsoftwareversion")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(data, softwareversion) : -1;
#else
    (void)data;
    (void)softwareversion;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_getsupportedlanguages_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t data = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* languagetags = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint64_t num = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(int64_t, void*, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_aboutdata_getsupportedlanguages")));
    }
    uint64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(data, languagetags, num) : 0;
#else
    (void)data;
    (void)languagetags;
    (void)num;
    uint64_t km_res = 0;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<uint64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_getsupporturl_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t data = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* supporturl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_aboutdata_getsupporturl")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(data, supporturl) : -1;
#else
    (void)data;
    (void)supporturl;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_isfieldannounced_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t data = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* fieldname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint8_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_aboutdata_isfieldannounced")));
    }
    uint8_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(data, fieldname) : 0;
#else
    (void)data;
    (void)fieldname;
    uint8_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_isfieldlocalized_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t data = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* fieldname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint8_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_aboutdata_isfieldlocalized")));
    }
    uint8_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(data, fieldname) : 0;
#else
    (void)data;
    (void)fieldname;
    uint8_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_isfieldrequired_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t data = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* fieldname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint8_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_aboutdata_isfieldrequired")));
    }
    uint8_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(data, fieldname) : 0;
#else
    (void)data;
    (void)fieldname;
    uint8_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_isvalid_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t data = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* language = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint8_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_aboutdata_isvalid")));
    }
    uint8_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(data, language) : 0;
#else
    (void)data;
    (void)language;
    uint8_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_setappid_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t data = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* appid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint64_t num = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_aboutdata_setappid")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(data, appid, num) : -1;
#else
    (void)data;
    (void)appid;
    (void)num;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_setappid_fromstring_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t data = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* appid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_aboutdata_setappid_fromstring")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(data, appid) : -1;
#else
    (void)data;
    (void)appid;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_setappname_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t data = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* appname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* language = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_aboutdata_setappname")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(data, appname, language) : -1;
#else
    (void)data;
    (void)appname;
    (void)language;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_setdateofmanufacture_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t data = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* dateofmanufacture = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_aboutdata_setdateofmanufacture")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(data, dateofmanufacture) : -1;
#else
    (void)data;
    (void)dateofmanufacture;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_setdefaultlanguage_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t data = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* defaultlanguage = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_aboutdata_setdefaultlanguage")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(data, defaultlanguage) : -1;
#else
    (void)data;
    (void)defaultlanguage;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_setdescription_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t data = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* description = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* language = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_aboutdata_setdescription")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(data, description, language) : -1;
#else
    (void)data;
    (void)description;
    (void)language;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_setdeviceid_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t data = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* deviceid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_aboutdata_setdeviceid")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(data, deviceid) : -1;
#else
    (void)data;
    (void)deviceid;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_setdevicename_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t data = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* devicename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* language = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_aboutdata_setdevicename")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(data, devicename, language) : -1;
#else
    (void)data;
    (void)devicename;
    (void)language;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_setfield_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t data = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* name = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int64_t value = km_info.Length() > 2 ? km_napi_arg_i64(km_info[2]) : 0;
    void* language = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_aboutdata_setfield")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(data, name, value, language) : -1;
#else
    (void)data;
    (void)name;
    (void)value;
    (void)language;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_sethardwareversion_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t data = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* hardwareversion = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_aboutdata_sethardwareversion")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(data, hardwareversion) : -1;
#else
    (void)data;
    (void)hardwareversion;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_setmanufacturer_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t data = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* manufacturer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* language = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_aboutdata_setmanufacturer")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(data, manufacturer, language) : -1;
#else
    (void)data;
    (void)manufacturer;
    (void)language;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_setmodelnumber_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t data = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* modelnumber = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_aboutdata_setmodelnumber")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(data, modelnumber) : -1;
#else
    (void)data;
    (void)modelnumber;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_setsoftwareversion_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t data = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* softwareversion = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_aboutdata_setsoftwareversion")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(data, softwareversion) : -1;
#else
    (void)data;
    (void)softwareversion;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_setsupportedlanguage_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t data = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* language = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_aboutdata_setsupportedlanguage")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(data, language) : -1;
#else
    (void)data;
    (void)language;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_setsupporturl_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t data = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* supporturl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_aboutdata_setsupporturl")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(data, supporturl) : -1;
#else
    (void)data;
    (void)supporturl;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdatalistener_create_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* callbacks = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* context = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_aboutdatalistener_create")));
    }
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(callbacks, context) : -1;
#else
    (void)callbacks;
    (void)context;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdatalistener_destroy_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t listener = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_aboutdatalistener_destroy")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(listener);
#else
    (void)listener;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_abouticon_clear_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t icon = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_abouticon_clear")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(icon);
#else
    (void)icon;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_abouticon_create_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_abouticon_create")));
    }
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr() : -1;
#else
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_abouticon_destroy_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t icon = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_abouticon_destroy")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(icon);
#else
    (void)icon;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_abouticon_getcontent_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t icon = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* data = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* size = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_abouticon_getcontent")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(icon, data, size);
#else
    (void)icon;
    (void)data;
    (void)size;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_abouticon_geturl_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t icon = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* type = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* url = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_abouticon_geturl")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(icon, type, url);
#else
    (void)icon;
    (void)type;
    (void)url;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_abouticon_setcontent_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t icon = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* type = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* data = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint64_t csize = km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0;
    uint8_t ownsdata = static_cast<uint8_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint64_t, uint8_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_abouticon_setcontent")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(icon, type, data, csize, ownsdata) : -1;
#else
    (void)icon;
    (void)type;
    (void)data;
    (void)csize;
    (void)ownsdata;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_abouticon_setcontent_frommsgarg_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t icon = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t arg = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_abouticon_setcontent_frommsgarg")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(icon, arg) : -1;
#else
    (void)icon;
    (void)arg;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_abouticon_seturl_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t icon = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* type = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* url = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_abouticon_seturl")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(icon, type, url) : -1;
#else
    (void)icon;
    (void)type;
    (void)url;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_abouticonobj_create_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t bus = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t icon = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_abouticonobj_create")));
    }
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(bus, icon) : -1;
#else
    (void)bus;
    (void)icon;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_abouticonobj_destroy_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t icon = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_abouticonobj_destroy")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(icon);
#else
    (void)icon;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_abouticonproxy_create_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t bus = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* busname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t sessionid = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_abouticonproxy_create")));
    }
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(bus, busname, sessionid) : -1;
#else
    (void)bus;
    (void)busname;
    (void)sessionid;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_abouticonproxy_destroy_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t proxy = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_abouticonproxy_destroy")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(proxy);
#else
    (void)proxy;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_abouticonproxy_geticon_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t proxy = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t icon = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_abouticonproxy_geticon")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(proxy, icon) : -1;
#else
    (void)proxy;
    (void)icon;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_abouticonproxy_getversion_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t proxy = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* version = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_abouticonproxy_getversion")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(proxy, version) : -1;
#else
    (void)proxy;
    (void)version;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_aboutlistener_create_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* callback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* context = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_aboutlistener_create")));
    }
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(callback, context) : -1;
#else
    (void)callback;
    (void)context;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_aboutlistener_destroy_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t listener = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_aboutlistener_destroy")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(listener);
#else
    (void)listener;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_aboutobj_announce_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t obj = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint16_t sessionport = static_cast<uint16_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int64_t aboutdata = km_info.Length() > 2 ? km_napi_arg_i64(km_info[2]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint16_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_aboutobj_announce")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(obj, sessionport, aboutdata) : -1;
#else
    (void)obj;
    (void)sessionport;
    (void)aboutdata;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_aboutobj_announce_using_datalistener_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t obj = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint16_t sessionport = static_cast<uint16_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int64_t aboutlistener = km_info.Length() > 2 ? km_napi_arg_i64(km_info[2]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint16_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_aboutobj_announce_using_datalistener")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(obj, sessionport, aboutlistener) : -1;
#else
    (void)obj;
    (void)sessionport;
    (void)aboutlistener;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_aboutobj_create_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t bus = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int32_t isannounced = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_aboutobj_create")));
    }
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(bus, isannounced) : -1;
#else
    (void)bus;
    (void)isannounced;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_aboutobj_destroy_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t obj = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_aboutobj_destroy")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(obj);
#else
    (void)obj;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_aboutobj_unannounce_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t obj = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_aboutobj_unannounce")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(obj) : -1;
#else
    (void)obj;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_aboutobjectdescription_clear_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t description = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_aboutobjectdescription_clear")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(description);
#else
    (void)description;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_aboutobjectdescription_create_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_aboutobjectdescription_create")));
    }
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr() : -1;
#else
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_aboutobjectdescription_create_full_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t arg = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_aboutobjectdescription_create_full")));
    }
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(arg) : -1;
#else
    (void)arg;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_aboutobjectdescription_createfrommsgarg_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t description = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t arg = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_aboutobjectdescription_createfrommsgarg")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(description, arg) : -1;
#else
    (void)description;
    (void)arg;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_aboutobjectdescription_destroy_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t description = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_aboutobjectdescription_destroy")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(description);
#else
    (void)description;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_aboutobjectdescription_getinterfacepaths_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t description = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* interfacename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* paths = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint64_t numpaths = km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0;
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_aboutobjectdescription_getinterfacepaths")));
    }
    uint64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(description, interfacename, paths, numpaths) : 0;
#else
    (void)description;
    (void)interfacename;
    (void)paths;
    (void)numpaths;
    uint64_t km_res = 0;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<uint64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_aboutobjectdescription_getinterfaces_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t description = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* path = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* interfaces = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint64_t numinterfaces = km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0;
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_aboutobjectdescription_getinterfaces")));
    }
    uint64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(description, path, interfaces, numinterfaces) : 0;
#else
    (void)description;
    (void)path;
    (void)interfaces;
    (void)numinterfaces;
    uint64_t km_res = 0;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<uint64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_aboutobjectdescription_getmsgarg_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t description = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t msgarg = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_aboutobjectdescription_getmsgarg")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(description, msgarg) : -1;
#else
    (void)description;
    (void)msgarg;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_aboutobjectdescription_getpaths_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t description = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* paths = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint64_t numpaths = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(int64_t, void*, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_aboutobjectdescription_getpaths")));
    }
    uint64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(description, paths, numpaths) : 0;
#else
    (void)description;
    (void)paths;
    (void)numpaths;
    uint64_t km_res = 0;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<uint64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_aboutobjectdescription_hasinterface_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t description = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* interfacename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint8_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_aboutobjectdescription_hasinterface")));
    }
    uint8_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(description, interfacename) : 0;
#else
    (void)description;
    (void)interfacename;
    uint8_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_aboutobjectdescription_hasinterfaceatpath_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t description = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* path = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* interfacename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint8_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_aboutobjectdescription_hasinterfaceatpath")));
    }
    uint8_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(description, path, interfacename) : 0;
#else
    (void)description;
    (void)path;
    (void)interfacename;
    uint8_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_aboutobjectdescription_haspath_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t description = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* path = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint8_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_aboutobjectdescription_haspath")));
    }
    uint8_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(description, path) : 0;
#else
    (void)description;
    (void)path;
    uint8_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_aboutproxy_create_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t bus = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* busname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t sessionid = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_aboutproxy_create")));
    }
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(bus, busname, sessionid) : -1;
#else
    (void)bus;
    (void)busname;
    (void)sessionid;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_aboutproxy_destroy_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t proxy = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_aboutproxy_destroy")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(proxy);
#else
    (void)proxy;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_aboutproxy_getaboutdata_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t proxy = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* language = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int64_t data = km_info.Length() > 2 ? km_napi_arg_i64(km_info[2]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_aboutproxy_getaboutdata")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(proxy, language, data) : -1;
#else
    (void)proxy;
    (void)language;
    (void)data;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_aboutproxy_getobjectdescription_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t proxy = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t objectdesc = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_aboutproxy_getobjectdescription")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(proxy, objectdesc) : -1;
#else
    (void)proxy;
    (void)objectdesc;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_aboutproxy_getversion_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t proxy = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* version = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_aboutproxy_getversion")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(proxy, version) : -1;
#else
    (void)proxy;
    (void)version;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_applicationstatelistener_create_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* callbacks = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* context = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_applicationstatelistener_create")));
    }
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(callbacks, context) : -1;
#else
    (void)callbacks;
    (void)context;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_applicationstatelistener_destroy_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t listener = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_applicationstatelistener_destroy")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(listener);
#else
    (void)listener;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_authlistener_create_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* callbacks = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* context = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_authlistener_create")));
    }
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(callbacks, context) : -1;
#else
    (void)callbacks;
    (void)context;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_authlistener_destroy_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t listener = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_authlistener_destroy")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(listener);
#else
    (void)listener;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_authlistener_requestcredentialsresponse_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t listener = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* authcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t arg_2_accept = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int64_t credentials = km_info.Length() > 3 ? km_napi_arg_i64(km_info[3]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, int32_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_authlistener_requestcredentialsresponse")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(listener, authcontext, arg_2_accept, credentials) : -1;
#else
    (void)listener;
    (void)authcontext;
    (void)arg_2_accept;
    (void)credentials;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_authlistener_setsharedsecret_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t listener = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* sharedsecret = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint64_t sharedsecretsize = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_authlistener_setsharedsecret")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(listener, sharedsecret, sharedsecretsize) : -1;
#else
    (void)listener;
    (void)sharedsecret;
    (void)sharedsecretsize;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_authlistener_verifycredentialsresponse_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t listener = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* authcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t arg_2_accept = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_authlistener_verifycredentialsresponse")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(listener, authcontext, arg_2_accept) : -1;
#else
    (void)listener;
    (void)authcontext;
    (void)arg_2_accept;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_authlistenerasync_create_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* callbacks = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* context = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_authlistenerasync_create")));
    }
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(callbacks, context) : -1;
#else
    (void)callbacks;
    (void)context;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_authlistenerasync_destroy_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t listener = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_authlistenerasync_destroy")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(listener);
#else
    (void)listener;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_autopinger_adddestination_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t autopinger = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* group = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* destination = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_autopinger_adddestination")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(autopinger, group, destination) : -1;
#else
    (void)autopinger;
    (void)group;
    (void)destination;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_autopinger_addpinggroup_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t autopinger = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* group = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int64_t listener = km_info.Length() > 2 ? km_napi_arg_i64(km_info[2]) : 0;
    uint32_t pinginterval = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, void*, int64_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_autopinger_addpinggroup")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(autopinger, group, listener, pinginterval);
#else
    (void)autopinger;
    (void)group;
    (void)listener;
    (void)pinginterval;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_autopinger_create_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t bus = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_autopinger_create")));
    }
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(bus) : -1;
#else
    (void)bus;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_autopinger_destroy_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t autopinger = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_autopinger_destroy")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(autopinger);
#else
    (void)autopinger;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_autopinger_pause_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t autopinger = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_autopinger_pause")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(autopinger);
#else
    (void)autopinger;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_autopinger_removedestination_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t autopinger = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* group = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* destination = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int32_t removeall = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_autopinger_removedestination")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(autopinger, group, destination, removeall) : -1;
#else
    (void)autopinger;
    (void)group;
    (void)destination;
    (void)removeall;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_autopinger_removepinggroup_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t autopinger = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* group = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_autopinger_removepinggroup")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(autopinger, group);
#else
    (void)autopinger;
    (void)group;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_autopinger_resume_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t autopinger = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_autopinger_resume")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(autopinger);
#else
    (void)autopinger;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_autopinger_setpinginterval_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t autopinger = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* group = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t pinginterval = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_autopinger_setpinginterval")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(autopinger, group, pinginterval) : -1;
#else
    (void)autopinger;
    (void)group;
    (void)pinginterval;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_addlogonentry_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t bus = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* authmechanism = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* username = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* password = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_busattachment_addlogonentry")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(bus, authmechanism, username, password) : -1;
#else
    (void)bus;
    (void)authmechanism;
    (void)username;
    (void)password;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_addmatch_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t bus = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* rule = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_busattachment_addmatch")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(bus, rule) : -1;
#else
    (void)bus;
    (void)rule;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_advertisename_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t bus = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* name = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint16_t transports = static_cast<uint16_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint16_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_busattachment_advertisename")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(bus, name, transports) : -1;
#else
    (void)bus;
    (void)name;
    (void)transports;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_bindsessionport_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t bus = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* sessionport = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int64_t opts = km_info.Length() > 2 ? km_napi_arg_i64(km_info[2]) : 0;
    int64_t listener = km_info.Length() > 3 ? km_napi_arg_i64(km_info[3]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, int64_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_busattachment_bindsessionport")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(bus, sessionport, opts, listener) : -1;
#else
    (void)bus;
    (void)sessionport;
    (void)opts;
    (void)listener;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_canceladvertisename_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t bus = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* name = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint16_t transports = static_cast<uint16_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint16_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_busattachment_canceladvertisename")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(bus, name, transports) : -1;
#else
    (void)bus;
    (void)name;
    (void)transports;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_cancelfindadvertisedname_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t bus = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* nameprefix = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_busattachment_cancelfindadvertisedname")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(bus, nameprefix) : -1;
#else
    (void)bus;
    (void)nameprefix;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_cancelfindadvertisednamebytransport_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t bus = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* nameprefix = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint16_t transports = static_cast<uint16_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint16_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_busattachment_cancelfindadvertisednamebytransport")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(bus, nameprefix, transports) : -1;
#else
    (void)bus;
    (void)nameprefix;
    (void)transports;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_cancelwhoimplements_interface_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t bus = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* implementsinterface = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_busattachment_cancelwhoimplements_interface")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(bus, implementsinterface) : -1;
#else
    (void)bus;
    (void)implementsinterface;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_cancelwhoimplements_interfaces_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t bus = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* implementsinterfaces = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint64_t numberinterfaces = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_busattachment_cancelwhoimplements_interfaces")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(bus, implementsinterfaces, numberinterfaces) : -1;
#else
    (void)bus;
    (void)implementsinterfaces;
    (void)numberinterfaces;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_clearkeys_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t bus = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* guid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_busattachment_clearkeys")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(bus, guid) : -1;
#else
    (void)bus;
    (void)guid;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_clearkeystore_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t bus = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_busattachment_clearkeystore")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(bus);
#else
    (void)bus;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_connect_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t bus = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* connectspec = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_busattachment_connect")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(bus, connectspec) : -1;
#else
    (void)bus;
    (void)connectspec;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_create_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* applicationname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t allowremotemessages = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_busattachment_create")));
    }
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(applicationname, allowremotemessages) : -1;
#else
    (void)applicationname;
    (void)allowremotemessages;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_create_concurrency_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* applicationname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t allowremotemessages = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t concurrency = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_busattachment_create_concurrency")));
    }
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(applicationname, allowremotemessages, concurrency) : -1;
#else
    (void)applicationname;
    (void)allowremotemessages;
    (void)concurrency;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_createinterface_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t bus = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* name = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* iface = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_busattachment_createinterface")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(bus, name, iface) : -1;
#else
    (void)bus;
    (void)name;
    (void)iface;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_createinterface_secure_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t bus = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* name = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* iface = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int32_t secpolicy = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_busattachment_createinterface_secure")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(bus, name, iface, secpolicy) : -1;
#else
    (void)bus;
    (void)name;
    (void)iface;
    (void)secpolicy;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_createinterfacesfromxml_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t bus = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* xml = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_busattachment_createinterfacesfromxml")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(bus, xml) : -1;
#else
    (void)bus;
    (void)xml;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_deletedefaultkeystore_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* applicationname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_busattachment_deletedefaultkeystore")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(applicationname) : -1;
#else
    (void)applicationname;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_deleteinterface_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t bus = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t iface = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_busattachment_deleteinterface")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(bus, iface) : -1;
#else
    (void)bus;
    (void)iface;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_destroy_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t bus = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_busattachment_destroy")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(bus);
#else
    (void)bus;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_disconnect_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t bus = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* unused = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_busattachment_disconnect")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(bus, unused) : -1;
#else
    (void)bus;
    (void)unused;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_enableconcurrentcallbacks_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t bus = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_busattachment_enableconcurrentcallbacks")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(bus);
#else
    (void)bus;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_enablepeersecurity_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t bus = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* authmechanisms = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int64_t listener = km_info.Length() > 2 ? km_napi_arg_i64(km_info[2]) : 0;
    void* keystorefilename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    int32_t isshared = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, int64_t, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_busattachment_enablepeersecurity")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(bus, authmechanisms, listener, keystorefilename, isshared) : -1;
#else
    (void)bus;
    (void)authmechanisms;
    (void)listener;
    (void)keystorefilename;
    (void)isshared;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_enablepeersecuritywithpermissionconfigurationlistener_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t bus = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* authmechanisms = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int64_t authlistener = km_info.Length() > 2 ? km_napi_arg_i64(km_info[2]) : 0;
    void* keystorefilename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    int32_t isshared = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    int64_t permissionconfigurationlistener = km_info.Length() > 5 ? km_napi_arg_i64(km_info[5]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, int64_t, void*, int32_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_busattachment_enablepeersecuritywithpermissionconfigurationlistener")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(bus, authmechanisms, authlistener, keystorefilename, isshared, permissionconfigurationlistener) : -1;
#else
    (void)bus;
    (void)authmechanisms;
    (void)authlistener;
    (void)keystorefilename;
    (void)isshared;
    (void)permissionconfigurationlistener;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_findadvertisedname_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t bus = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* nameprefix = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_busattachment_findadvertisedname")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(bus, nameprefix) : -1;
#else
    (void)bus;
    (void)nameprefix;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_findadvertisednamebytransport_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t bus = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* nameprefix = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint16_t transports = static_cast<uint16_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint16_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_busattachment_findadvertisednamebytransport")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(bus, nameprefix, transports) : -1;
#else
    (void)bus;
    (void)nameprefix;
    (void)transports;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_getalljoyndebugobj_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t bus = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_busattachment_getalljoyndebugobj")));
    }
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(bus) : -1;
#else
    (void)bus;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_getalljoynproxyobj_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t bus = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_busattachment_getalljoynproxyobj")));
    }
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(bus) : -1;
#else
    (void)bus;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_getconcurrency_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t bus = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_busattachment_getconcurrency")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(bus) : 0;
#else
    (void)bus;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_getconnectspec_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t bus = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_busattachment_getconnectspec")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(bus) : NULL;
#else
    (void)bus;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_getdbusproxyobj_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t bus = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_busattachment_getdbusproxyobj")));
    }
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(bus) : -1;
#else
    (void)bus;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_getglobalguidstring_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t bus = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_busattachment_getglobalguidstring")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(bus) : NULL;
#else
    (void)bus;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_getinterface_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t bus = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* name = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_busattachment_getinterface")));
    }
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(bus, name) : -1;
#else
    (void)bus;
    (void)name;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_getinterfaces_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t bus = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* ifaces = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint64_t numifaces = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(int64_t, void*, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_busattachment_getinterfaces")));
    }
    uint64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(bus, ifaces, numifaces) : 0;
#else
    (void)bus;
    (void)ifaces;
    (void)numifaces;
    uint64_t km_res = 0;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<uint64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_getkeyexpiration_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t bus = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* guid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* timeout = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_busattachment_getkeyexpiration")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(bus, guid, timeout) : -1;
#else
    (void)bus;
    (void)guid;
    (void)timeout;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_getpeerguid_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t bus = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* name = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* guid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* guidsz = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_busattachment_getpeerguid")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(bus, name, guid, guidsz) : -1;
#else
    (void)bus;
    (void)name;
    (void)guid;
    (void)guidsz;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_getpermissionconfigurator_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t bus = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_busattachment_getpermissionconfigurator")));
    }
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(bus) : -1;
#else
    (void)bus;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_gettimestamp_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_busattachment_gettimestamp")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr() : 0;
#else
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_getuniquename_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t bus = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_busattachment_getuniquename")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(bus) : NULL;
#else
    (void)bus;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_isconnected_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t bus = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_busattachment_isconnected")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(bus) : -1;
#else
    (void)bus;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_ispeersecurityenabled_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t bus = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_busattachment_ispeersecurityenabled")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(bus) : -1;
#else
    (void)bus;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_isstarted_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t bus = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_busattachment_isstarted")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(bus) : -1;
#else
    (void)bus;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_isstopping_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t bus = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_busattachment_isstopping")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(bus) : -1;
#else
    (void)bus;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_join_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t bus = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_busattachment_join")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(bus) : -1;
#else
    (void)bus;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_joinsession_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t bus = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* sessionhost = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint16_t sessionport = static_cast<uint16_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int64_t listener = km_info.Length() > 3 ? km_napi_arg_i64(km_info[3]) : 0;
    void* sessionid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    int64_t opts = km_info.Length() > 5 ? km_napi_arg_i64(km_info[5]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint16_t, int64_t, void*, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_busattachment_joinsession")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(bus, sessionhost, sessionport, listener, sessionid, opts) : -1;
#else
    (void)bus;
    (void)sessionhost;
    (void)sessionport;
    (void)listener;
    (void)sessionid;
    (void)opts;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_joinsessionasync_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t bus = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* sessionhost = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint16_t sessionport = static_cast<uint16_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int64_t listener = km_info.Length() > 3 ? km_napi_arg_i64(km_info[3]) : 0;
    int64_t opts = km_info.Length() > 4 ? km_napi_arg_i64(km_info[4]) : 0;
    void* callback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* context = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint16_t, int64_t, int64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_busattachment_joinsessionasync")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(bus, sessionhost, sessionport, listener, opts, callback, context) : -1;
#else
    (void)bus;
    (void)sessionhost;
    (void)sessionport;
    (void)listener;
    (void)opts;
    (void)callback;
    (void)context;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_leavesession_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t bus = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint32_t sessionid = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_busattachment_leavesession")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(bus, sessionid) : -1;
#else
    (void)bus;
    (void)sessionid;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_namehasowner_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t bus = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* name = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* hasowner = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_busattachment_namehasowner")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(bus, name, hasowner) : -1;
#else
    (void)bus;
    (void)name;
    (void)hasowner;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_ping_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t bus = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* name = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t timeout = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_busattachment_ping")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(bus, name, timeout) : -1;
#else
    (void)bus;
    (void)name;
    (void)timeout;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_registeraboutlistener_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t bus = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t aboutlistener = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_busattachment_registeraboutlistener")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(bus, aboutlistener);
#else
    (void)bus;
    (void)aboutlistener;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_registerapplicationstatelistener_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t bus = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t listener = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_busattachment_registerapplicationstatelistener")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(bus, listener) : -1;
#else
    (void)bus;
    (void)listener;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_registerbuslistener_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t bus = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t listener = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_busattachment_registerbuslistener")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(bus, listener);
#else
    (void)bus;
    (void)listener;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_registerbusobject_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t bus = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t obj = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_busattachment_registerbusobject")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(bus, obj) : -1;
#else
    (void)bus;
    (void)obj;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_registerbusobject_secure_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t bus = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t obj = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_busattachment_registerbusobject_secure")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(bus, obj) : -1;
#else
    (void)bus;
    (void)obj;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_registerkeystorelistener_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t bus = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t listener = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_busattachment_registerkeystorelistener")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(bus, listener) : -1;
#else
    (void)bus;
    (void)listener;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_releasename_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t bus = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* name = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_busattachment_releasename")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(bus, name) : -1;
#else
    (void)bus;
    (void)name;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_reloadkeystore_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t bus = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_busattachment_reloadkeystore")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(bus) : -1;
#else
    (void)bus;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_removematch_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t bus = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* rule = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_busattachment_removematch")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(bus, rule) : -1;
#else
    (void)bus;
    (void)rule;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_removesessionmember_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t bus = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint32_t sessionid = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* membername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_busattachment_removesessionmember")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(bus, sessionid, membername) : -1;
#else
    (void)bus;
    (void)sessionid;
    (void)membername;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_requestname_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t bus = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* requestedname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_busattachment_requestname")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(bus, requestedname, flags) : -1;
#else
    (void)bus;
    (void)requestedname;
    (void)flags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_secureconnection_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t bus = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* name = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t forceauth = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_busattachment_secureconnection")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(bus, name, forceauth) : -1;
#else
    (void)bus;
    (void)name;
    (void)forceauth;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_secureconnectionasync_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t bus = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* name = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t forceauth = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_busattachment_secureconnectionasync")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(bus, name, forceauth) : -1;
#else
    (void)bus;
    (void)name;
    (void)forceauth;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_setdaemondebug_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t bus = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* module = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t level = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_busattachment_setdaemondebug")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(bus, module, level) : -1;
#else
    (void)bus;
    (void)module;
    (void)level;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_setkeyexpiration_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t bus = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* guid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t timeout = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_busattachment_setkeyexpiration")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(bus, guid, timeout) : -1;
#else
    (void)bus;
    (void)guid;
    (void)timeout;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_setlinktimeout_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t bus = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint32_t sessionid = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* linktimeout = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_busattachment_setlinktimeout")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(bus, sessionid, linktimeout) : -1;
#else
    (void)bus;
    (void)sessionid;
    (void)linktimeout;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_setlinktimeoutasync_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t bus = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint32_t sessionid = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t linktimeout = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* callback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* context = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_busattachment_setlinktimeoutasync")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(bus, sessionid, linktimeout, callback, context) : -1;
#else
    (void)bus;
    (void)sessionid;
    (void)linktimeout;
    (void)callback;
    (void)context;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_setsessionlistener_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t bus = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint32_t sessionid = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int64_t listener = km_info.Length() > 2 ? km_napi_arg_i64(km_info[2]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_busattachment_setsessionlistener")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(bus, sessionid, listener) : -1;
#else
    (void)bus;
    (void)sessionid;
    (void)listener;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_start_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t bus = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_busattachment_start")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(bus) : -1;
#else
    (void)bus;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_stop_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t bus = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_busattachment_stop")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(bus) : -1;
#else
    (void)bus;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_unbindsessionport_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t bus = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint16_t sessionport = static_cast<uint16_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint16_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_busattachment_unbindsessionport")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(bus, sessionport) : -1;
#else
    (void)bus;
    (void)sessionport;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_unregisteraboutlistener_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t bus = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t aboutlistener = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_busattachment_unregisteraboutlistener")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(bus, aboutlistener);
#else
    (void)bus;
    (void)aboutlistener;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_unregisterallaboutlisteners_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t bus = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_busattachment_unregisterallaboutlisteners")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(bus);
#else
    (void)bus;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_unregisterallhandlers_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t bus = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_busattachment_unregisterallhandlers")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(bus) : -1;
#else
    (void)bus;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_unregisterapplicationstatelistener_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t bus = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t listener = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_busattachment_unregisterapplicationstatelistener")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(bus, listener) : -1;
#else
    (void)bus;
    (void)listener;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_unregisterbuslistener_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t bus = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t listener = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_busattachment_unregisterbuslistener")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(bus, listener);
#else
    (void)bus;
    (void)listener;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_unregisterbusobject_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t bus = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t object = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_busattachment_unregisterbusobject")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(bus, object);
#else
    (void)bus;
    (void)object;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_whoimplements_interface_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t bus = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* implementsinterface = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_busattachment_whoimplements_interface")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(bus, implementsinterface) : -1;
#else
    (void)bus;
    (void)implementsinterface;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_whoimplements_interfaces_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t bus = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* implementsinterfaces = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint64_t numberinterfaces = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_busattachment_whoimplements_interfaces")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(bus, implementsinterfaces, numberinterfaces) : -1;
#else
    (void)bus;
    (void)implementsinterfaces;
    (void)numberinterfaces;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_buslistener_create_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* callbacks = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* context = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_buslistener_create")));
    }
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(callbacks, context) : -1;
#else
    (void)callbacks;
    (void)context;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_buslistener_destroy_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t listener = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_buslistener_destroy")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(listener);
#else
    (void)listener;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_busobject_addinterface_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t bus = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t iface = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_busobject_addinterface")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(bus, iface) : -1;
#else
    (void)bus;
    (void)iface;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_busobject_addinterface_announced_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t bus = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t iface = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_busobject_addinterface_announced")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(bus, iface) : -1;
#else
    (void)bus;
    (void)iface;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_busobject_addmethodhandlers_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t bus = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* entries = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint64_t numentries = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_busobject_addmethodhandlers")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(bus, entries, numentries) : -1;
#else
    (void)bus;
    (void)entries;
    (void)numentries;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_busobject_cancelsessionlessmessage_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t bus = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t msg = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_busobject_cancelsessionlessmessage")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(bus, msg) : -1;
#else
    (void)bus;
    (void)msg;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_busobject_cancelsessionlessmessage_serial_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t bus = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint32_t serialnumber = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_busobject_cancelsessionlessmessage_serial")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(bus, serialnumber) : -1;
#else
    (void)bus;
    (void)serialnumber;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_busobject_create_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* path = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t isplaceholder = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* callbacks_in = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* context_in = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_busobject_create")));
    }
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(path, isplaceholder, callbacks_in, context_in) : -1;
#else
    (void)path;
    (void)isplaceholder;
    (void)callbacks_in;
    (void)context_in;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_busobject_destroy_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t bus = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_busobject_destroy")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(bus);
#else
    (void)bus;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_busobject_emitpropertieschanged_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t bus = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* ifcname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* propnames = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint64_t numprops = km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0;
    uint32_t id = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, void*, void*, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_busobject_emitpropertieschanged")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(bus, ifcname, propnames, numprops, id);
#else
    (void)bus;
    (void)ifcname;
    (void)propnames;
    (void)numprops;
    (void)id;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_busobject_emitpropertychanged_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t bus = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* ifcname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* propname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int64_t val = km_info.Length() > 3 ? km_napi_arg_i64(km_info[3]) : 0;
    uint32_t id = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, void*, void*, int64_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_busobject_emitpropertychanged")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(bus, ifcname, propname, val, id);
#else
    (void)bus;
    (void)ifcname;
    (void)propname;
    (void)val;
    (void)id;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_busobject_getannouncedinterfacenames_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t bus = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* interfaces = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint64_t numinterfaces = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(int64_t, void*, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_busobject_getannouncedinterfacenames")));
    }
    uint64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(bus, interfaces, numinterfaces) : 0;
#else
    (void)bus;
    (void)interfaces;
    (void)numinterfaces;
    uint64_t km_res = 0;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<uint64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_busobject_getbusattachment_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t bus = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_busobject_getbusattachment")));
    }
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(bus) : -1;
#else
    (void)bus;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_busobject_getname_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t bus = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint64_t buffersz = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(int64_t, void*, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_busobject_getname")));
    }
    uint64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(bus, buffer, buffersz) : 0;
#else
    (void)bus;
    (void)buffer;
    (void)buffersz;
    uint64_t km_res = 0;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<uint64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_busobject_getpath_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t bus = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_busobject_getpath")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(bus) : NULL;
#else
    (void)bus;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_busobject_issecure_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t bus = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_busobject_issecure")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(bus) : -1;
#else
    (void)bus;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_busobject_methodreply_args_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t bus = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t msg = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
    int64_t args = km_info.Length() > 2 ? km_napi_arg_i64(km_info[2]) : 0;
    uint64_t numargs = km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t, int64_t, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_busobject_methodreply_args")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(bus, msg, args, numargs) : -1;
#else
    (void)bus;
    (void)msg;
    (void)args;
    (void)numargs;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_busobject_methodreply_err_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t bus = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t msg = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
    void* error = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* errormessage = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_busobject_methodreply_err")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(bus, msg, error, errormessage) : -1;
#else
    (void)bus;
    (void)msg;
    (void)error;
    (void)errormessage;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_busobject_methodreply_status_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t bus = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t msg = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
    int32_t status = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_busobject_methodreply_status")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(bus, msg, status) : -1;
#else
    (void)bus;
    (void)msg;
    (void)status;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_busobject_setannounceflag_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t bus = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t iface = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
    int32_t isannounced = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_busobject_setannounceflag")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(bus, iface, isannounced) : -1;
#else
    (void)bus;
    (void)iface;
    (void)isannounced;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_credentials_clear_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t cred = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_credentials_clear")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(cred);
#else
    (void)cred;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_credentials_create_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_credentials_create")));
    }
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr() : -1;
#else
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_credentials_destroy_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t cred = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_credentials_destroy")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(cred);
#else
    (void)cred;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_credentials_getcertchain_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t cred = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_credentials_getcertchain")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(cred) : NULL;
#else
    (void)cred;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_credentials_getexpiration_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t cred = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_credentials_getexpiration")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(cred) : 0;
#else
    (void)cred;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_credentials_getlogonentry_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t cred = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_credentials_getlogonentry")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(cred) : NULL;
#else
    (void)cred;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_credentials_getpassword_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t cred = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_credentials_getpassword")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(cred) : NULL;
#else
    (void)cred;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_credentials_getprivateKey_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t cred = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_credentials_getprivateKey")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(cred) : NULL;
#else
    (void)cred;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_credentials_getusername_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t cred = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_credentials_getusername")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(cred) : NULL;
#else
    (void)cred;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_credentials_isset_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t cred = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint16_t creds = static_cast<uint16_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint16_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_credentials_isset")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(cred, creds) : -1;
#else
    (void)cred;
    (void)creds;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_credentials_setcertchain_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t cred = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* certchain = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_credentials_setcertchain")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(cred, certchain);
#else
    (void)cred;
    (void)certchain;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_credentials_setexpiration_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t cred = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint32_t expiration = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_credentials_setexpiration")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(cred, expiration);
#else
    (void)cred;
    (void)expiration;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_credentials_setlogonentry_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t cred = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* logonentry = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_credentials_setlogonentry")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(cred, logonentry);
#else
    (void)cred;
    (void)logonentry;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_credentials_setpassword_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t cred = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* pwd = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_credentials_setpassword")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(cred, pwd);
#else
    (void)cred;
    (void)pwd;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_credentials_setprivatekey_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t cred = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* pk = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_credentials_setprivatekey")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(cred, pk);
#else
    (void)cred;
    (void)pk;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_credentials_setusername_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t cred = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* username = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_credentials_setusername")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(cred, username);
#else
    (void)cred;
    (void)username;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_getbuildinfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_getbuildinfo")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr() : NULL;
#else
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_getnumericversion_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_getnumericversion")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr() : 0;
#else
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_getversion_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_getversion")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr() : NULL;
#else
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_init_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_init")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_activate_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t iface = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_interfacedescription_activate")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(iface);
#else
    (void)iface;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_addannotation_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t iface = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* name = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* value = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_interfacedescription_addannotation")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(iface, name, value) : -1;
#else
    (void)iface;
    (void)name;
    (void)value;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_addargannotation_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t iface = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* member = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* argname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* name = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* value = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_interfacedescription_addargannotation")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(iface, member, argname, name, value) : -1;
#else
    (void)iface;
    (void)member;
    (void)argname;
    (void)name;
    (void)value;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_addmember_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t iface = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int32_t type = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* name = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* inputsig = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* outsig = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* argnames = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    uint8_t annotation = static_cast<uint8_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, void*, void*, void*, void*, uint8_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_interfacedescription_addmember")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(iface, type, name, inputsig, outsig, argnames, annotation) : -1;
#else
    (void)iface;
    (void)type;
    (void)name;
    (void)inputsig;
    (void)outsig;
    (void)argnames;
    (void)annotation;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_addmemberannotation_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t iface = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* member = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* name = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* value = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_interfacedescription_addmemberannotation")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(iface, member, name, value) : -1;
#else
    (void)iface;
    (void)member;
    (void)name;
    (void)value;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_addmethod_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t iface = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* name = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* inputsig = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* outsig = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* argnames = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint8_t annotation = static_cast<uint8_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* accessperms = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*, void*, uint8_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_interfacedescription_addmethod")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(iface, name, inputsig, outsig, argnames, annotation, accessperms) : -1;
#else
    (void)iface;
    (void)name;
    (void)inputsig;
    (void)outsig;
    (void)argnames;
    (void)annotation;
    (void)accessperms;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_addproperty_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t iface = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* name = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* signature = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint8_t access = static_cast<uint8_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint8_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_interfacedescription_addproperty")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(iface, name, signature, access) : -1;
#else
    (void)iface;
    (void)name;
    (void)signature;
    (void)access;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_addpropertyannotation_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t iface = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* property = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* name = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* value = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_interfacedescription_addpropertyannotation")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(iface, property, name, value) : -1;
#else
    (void)iface;
    (void)property;
    (void)name;
    (void)value;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_addsignal_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t iface = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* name = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* sig = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* argnames = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint8_t annotation = static_cast<uint8_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* accessperms = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*, uint8_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_interfacedescription_addsignal")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(iface, name, sig, argnames, annotation, accessperms) : -1;
#else
    (void)iface;
    (void)name;
    (void)sig;
    (void)argnames;
    (void)annotation;
    (void)accessperms;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_eql_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t one = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t other = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_interfacedescription_eql")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(one, other) : -1;
#else
    (void)one;
    (void)other;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_getannotation_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t iface = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* name = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* value = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* value_size = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_interfacedescription_getannotation")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(iface, name, value, value_size) : -1;
#else
    (void)iface;
    (void)name;
    (void)value;
    (void)value_size;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_getannotationatindex_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t iface = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint64_t arg_1_index = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* name = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* name_size = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* value = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* value_size = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, uint64_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_interfacedescription_getannotationatindex")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(iface, arg_1_index, name, name_size, value, value_size);
#else
    (void)iface;
    (void)arg_1_index;
    (void)name;
    (void)name_size;
    (void)value;
    (void)value_size;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_getannotationscount_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t iface = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_interfacedescription_getannotationscount")));
    }
    uint64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(iface) : 0;
#else
    (void)iface;
    uint64_t km_res = 0;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<uint64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_getargdescriptionforlanguage_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t iface = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* member = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* arg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* description = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint64_t maxlanguagelength = km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0;
    void* languagetag = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_interfacedescription_getargdescriptionforlanguage")));
    }
    uint64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(iface, member, arg, description, maxlanguagelength, languagetag) : 0;
#else
    (void)iface;
    (void)member;
    (void)arg;
    (void)description;
    (void)maxlanguagelength;
    (void)languagetag;
    uint64_t km_res = 0;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<uint64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_getdescriptionforlanguage_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t iface = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* description = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint64_t maxlanguagelength = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
    void* languagetag = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(int64_t, void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_interfacedescription_getdescriptionforlanguage")));
    }
    uint64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(iface, description, maxlanguagelength, languagetag) : 0;
#else
    (void)iface;
    (void)description;
    (void)maxlanguagelength;
    (void)languagetag;
    uint64_t km_res = 0;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<uint64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_getdescriptionlanguages_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t iface = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* languages = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint64_t size = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(int64_t, void*, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_interfacedescription_getdescriptionlanguages")));
    }
    uint64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(iface, languages, size) : 0;
#else
    (void)iface;
    (void)languages;
    (void)size;
    uint64_t km_res = 0;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<uint64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_getdescriptionlanguages2_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t iface = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* languages = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint64_t languagessize = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(int64_t, void*, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_interfacedescription_getdescriptionlanguages2")));
    }
    uint64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(iface, languages, languagessize) : 0;
#else
    (void)iface;
    (void)languages;
    (void)languagessize;
    uint64_t km_res = 0;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<uint64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_getdescriptiontranslationcallback_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t iface = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_interfacedescription_getdescriptiontranslationcallback")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(iface) : NULL;
#else
    (void)iface;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_getmember_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t iface = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* name = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* member = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_interfacedescription_getmember")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(iface, name, member) : -1;
#else
    (void)iface;
    (void)name;
    (void)member;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_getmemberannotation_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t iface = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* member = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* name = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* value = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* value_size = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_interfacedescription_getmemberannotation")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(iface, member, name, value, value_size) : -1;
#else
    (void)iface;
    (void)member;
    (void)name;
    (void)value;
    (void)value_size;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_getmemberargannotation_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t iface = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* member = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* argname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* name = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* value = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* value_size = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_interfacedescription_getmemberargannotation")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(iface, member, argname, name, value, value_size) : -1;
#else
    (void)iface;
    (void)member;
    (void)argname;
    (void)name;
    (void)value;
    (void)value_size;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_getmemberdescriptionforlanguage_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t iface = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* member = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* description = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint64_t maxlanguagelength = km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0;
    void* languagetag = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_interfacedescription_getmemberdescriptionforlanguage")));
    }
    uint64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(iface, member, description, maxlanguagelength, languagetag) : 0;
#else
    (void)iface;
    (void)member;
    (void)description;
    (void)maxlanguagelength;
    (void)languagetag;
    uint64_t km_res = 0;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<uint64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_getmembers_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t iface = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* members = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint64_t nummembers = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(int64_t, void*, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_interfacedescription_getmembers")));
    }
    uint64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(iface, members, nummembers) : 0;
#else
    (void)iface;
    (void)members;
    (void)nummembers;
    uint64_t km_res = 0;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<uint64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_getmethod_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t iface = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* name = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* member = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_interfacedescription_getmethod")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(iface, name, member) : -1;
#else
    (void)iface;
    (void)name;
    (void)member;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_getname_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t iface = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_interfacedescription_getname")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(iface) : NULL;
#else
    (void)iface;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_getproperties_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t iface = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* props = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint64_t numprops = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(int64_t, void*, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_interfacedescription_getproperties")));
    }
    uint64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(iface, props, numprops) : 0;
#else
    (void)iface;
    (void)props;
    (void)numprops;
    uint64_t km_res = 0;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<uint64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_getproperty_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t iface = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* name = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* property = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_interfacedescription_getproperty")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(iface, name, property) : -1;
#else
    (void)iface;
    (void)name;
    (void)property;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_getpropertyannotation_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t iface = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* property = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* name = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* value = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* str_size = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_interfacedescription_getpropertyannotation")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(iface, property, name, value, str_size) : -1;
#else
    (void)iface;
    (void)property;
    (void)name;
    (void)value;
    (void)str_size;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_getpropertydescriptionforlanguage_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t iface = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* property = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* description = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint64_t maxlanguagelength = km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0;
    void* languagetag = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_interfacedescription_getpropertydescriptionforlanguage")));
    }
    uint64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(iface, property, description, maxlanguagelength, languagetag) : 0;
#else
    (void)iface;
    (void)property;
    (void)description;
    (void)maxlanguagelength;
    (void)languagetag;
    uint64_t km_res = 0;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<uint64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_getsecuritypolicy_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t iface = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_interfacedescription_getsecuritypolicy")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(iface) : -1;
#else
    (void)iface;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_getsignal_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t iface = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* name = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* member = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_interfacedescription_getsignal")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(iface, name, member) : -1;
#else
    (void)iface;
    (void)name;
    (void)member;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_hasdescription_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t iface = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_interfacedescription_hasdescription")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(iface) : -1;
#else
    (void)iface;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_hasmember_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t iface = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* name = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* insig = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* outsig = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_interfacedescription_hasmember")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(iface, name, insig, outsig) : -1;
#else
    (void)iface;
    (void)name;
    (void)insig;
    (void)outsig;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_hasproperties_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t iface = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_interfacedescription_hasproperties")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(iface) : -1;
#else
    (void)iface;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_hasproperty_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t iface = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* name = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_interfacedescription_hasproperty")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(iface, name) : -1;
#else
    (void)iface;
    (void)name;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_introspect_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t iface = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* str = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint64_t buf = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
    uint64_t indent = km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0;
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(int64_t, void*, uint64_t, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_interfacedescription_introspect")));
    }
    uint64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(iface, str, buf, indent) : 0;
#else
    (void)iface;
    (void)str;
    (void)buf;
    (void)indent;
    uint64_t km_res = 0;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<uint64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_issecure_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t iface = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_interfacedescription_issecure")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(iface) : -1;
#else
    (void)iface;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_setargdescription_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t iface = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* member = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* argname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* description = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_interfacedescription_setargdescription")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(iface, member, argname, description) : -1;
#else
    (void)iface;
    (void)member;
    (void)argname;
    (void)description;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_setargdescriptionforlanguage_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t iface = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* member = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* arg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* description = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* languagetag = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_interfacedescription_setargdescriptionforlanguage")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(iface, member, arg, description, languagetag) : -1;
#else
    (void)iface;
    (void)member;
    (void)arg;
    (void)description;
    (void)languagetag;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_setdescription_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t iface = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* description = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_interfacedescription_setdescription")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(iface, description);
#else
    (void)iface;
    (void)description;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_setdescriptionforlanguage_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t iface = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* description = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* languagetag = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_interfacedescription_setdescriptionforlanguage")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(iface, description, languagetag) : -1;
#else
    (void)iface;
    (void)description;
    (void)languagetag;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_setdescriptionlanguage_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t iface = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* language = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_interfacedescription_setdescriptionlanguage")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(iface, language);
#else
    (void)iface;
    (void)language;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_setdescriptiontranslationcallback_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t iface = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* translationcallback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_interfacedescription_setdescriptiontranslationcallback")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(iface, translationcallback);
#else
    (void)iface;
    (void)translationcallback;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_setmemberdescription_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t iface = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* member = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* description = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_interfacedescription_setmemberdescription")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(iface, member, description) : -1;
#else
    (void)iface;
    (void)member;
    (void)description;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_setmemberdescriptionforlanguage_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t iface = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* member = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* description = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* languagetag = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_interfacedescription_setmemberdescriptionforlanguage")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(iface, member, description, languagetag) : -1;
#else
    (void)iface;
    (void)member;
    (void)description;
    (void)languagetag;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_setpropertydescription_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t iface = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* name = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* description = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_interfacedescription_setpropertydescription")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(iface, name, description) : -1;
#else
    (void)iface;
    (void)name;
    (void)description;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_setpropertydescriptionforlanguage_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t iface = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* name = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* description = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* languagetag = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_interfacedescription_setpropertydescriptionforlanguage")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(iface, name, description, languagetag) : -1;
#else
    (void)iface;
    (void)name;
    (void)description;
    (void)languagetag;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_keystorelistener_create_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* callbacks = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* context = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_keystorelistener_create")));
    }
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(callbacks, context) : -1;
#else
    (void)callbacks;
    (void)context;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_keystorelistener_destroy_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t listener = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_keystorelistener_destroy")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(listener);
#else
    (void)listener;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_keystorelistener_getkeys_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t listener = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t keystore = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
    void* sink = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* sink_sz = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_keystorelistener_getkeys")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(listener, keystore, sink, sink_sz) : -1;
#else
    (void)listener;
    (void)keystore;
    (void)sink;
    (void)sink_sz;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_keystorelistener_putkeys_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t listener = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t keystore = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
    void* source = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* password = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_keystorelistener_putkeys")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(listener, keystore, source, password) : -1;
#else
    (void)listener;
    (void)keystore;
    (void)source;
    (void)password;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_keystorelistener_with_synchronization_create_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* callbacks = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* context = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_keystorelistener_with_synchronization_create")));
    }
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(callbacks, context) : -1;
#else
    (void)callbacks;
    (void)context;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_message_create_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t bus = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_message_create")));
    }
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(bus) : -1;
#else
    (void)bus;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_message_description_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t msg = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* str = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint64_t buf = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(int64_t, void*, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_message_description")));
    }
    uint64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(msg, str, buf) : 0;
#else
    (void)msg;
    (void)str;
    (void)buf;
    uint64_t km_res = 0;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<uint64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_message_destroy_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t msg = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_message_destroy")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(msg);
#else
    (void)msg;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_message_eql_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t one = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t other = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_message_eql")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(one, other) : -1;
#else
    (void)one;
    (void)other;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_message_getarg_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t msg = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint64_t argn = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_message_getarg")));
    }
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(msg, argn) : -1;
#else
    (void)msg;
    (void)argn;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_message_getargs_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t msg = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* numargs = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* args = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_message_getargs")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(msg, numargs, args);
#else
    (void)msg;
    (void)numargs;
    (void)args;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_message_getauthmechanism_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t msg = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_message_getauthmechanism")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(msg) : NULL;
#else
    (void)msg;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_message_getcallserial_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t msg = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_message_getcallserial")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(msg) : 0;
#else
    (void)msg;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_message_getcompressiontoken_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t msg = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_message_getcompressiontoken")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(msg) : 0;
#else
    (void)msg;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_message_getdestination_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t msg = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_message_getdestination")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(msg) : NULL;
#else
    (void)msg;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_message_geterrorname_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t msg = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* errormessage = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* errormessage_size = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_message_geterrorname")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(msg, errormessage, errormessage_size) : NULL;
#else
    (void)msg;
    (void)errormessage;
    (void)errormessage_size;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_message_getflags_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t msg = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef uint8_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_message_getflags")));
    }
    uint8_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(msg) : 0;
#else
    (void)msg;
    uint8_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_message_getinterface_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t msg = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_message_getinterface")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(msg) : NULL;
#else
    (void)msg;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_message_getmembername_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t msg = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_message_getmembername")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(msg) : NULL;
#else
    (void)msg;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_message_getobjectpath_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t msg = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_message_getobjectpath")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(msg) : NULL;
#else
    (void)msg;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_message_getreceiveendpointname_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t msg = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_message_getreceiveendpointname")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(msg) : NULL;
#else
    (void)msg;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_message_getreplyserial_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t msg = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_message_getreplyserial")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(msg) : 0;
#else
    (void)msg;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_message_getsender_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t msg = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_message_getsender")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(msg) : NULL;
#else
    (void)msg;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_message_getsessionid_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t msg = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_message_getsessionid")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(msg) : 0;
#else
    (void)msg;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_message_getsignature_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t msg = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_message_getsignature")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(msg) : NULL;
#else
    (void)msg;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_message_gettimestamp_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t msg = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_message_gettimestamp")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(msg) : 0;
#else
    (void)msg;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_message_gettype_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t msg = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_message_gettype")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(msg) : -1;
#else
    (void)msg;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_message_isbroadcastsignal_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t msg = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_message_isbroadcastsignal")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(msg) : -1;
#else
    (void)msg;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_message_isencrypted_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t msg = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_message_isencrypted")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(msg) : -1;
#else
    (void)msg;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_message_isexpired_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t msg = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* tillexpirems = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_message_isexpired")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(msg, tillexpirems) : -1;
#else
    (void)msg;
    (void)tillexpirems;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_message_isglobalbroadcast_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t msg = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_message_isglobalbroadcast")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(msg) : -1;
#else
    (void)msg;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_message_issessionless_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t msg = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_message_issessionless")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(msg) : -1;
#else
    (void)msg;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_message_isunreliable_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t msg = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_message_isunreliable")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(msg) : -1;
#else
    (void)msg;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_message_setendianess_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int8_t endian = static_cast<int8_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int8_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_message_setendianess")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(endian);
#else
    (void)endian;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_message_tostring_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t msg = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* str = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint64_t buf = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(int64_t, void*, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_message_tostring")));
    }
    uint64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(msg, str, buf) : 0;
#else
    (void)msg;
    (void)str;
    (void)buf;
    uint64_t km_res = 0;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<uint64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_array_create_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t size = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_msgarg_array_create")));
    }
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(size) : -1;
#else
    (void)size;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_array_element_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t arg = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint64_t arg_1_index = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_msgarg_array_element")));
    }
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(arg, arg_1_index) : -1;
#else
    (void)arg;
    (void)arg_1_index;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_array_signature_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t values = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint64_t numvalues = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* str = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint64_t buf = km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0;
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(int64_t, uint64_t, void*, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_msgarg_array_signature")));
    }
    uint64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(values, numvalues, str, buf) : 0;
#else
    (void)values;
    (void)numvalues;
    (void)str;
    (void)buf;
    uint64_t km_res = 0;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<uint64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_array_tostring_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t args = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint64_t numargs = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* str = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint64_t buf = km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0;
    uint64_t indent = km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0;
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(int64_t, uint64_t, void*, uint64_t, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_msgarg_array_tostring")));
    }
    uint64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(args, numargs, str, buf, indent) : 0;
#else
    (void)args;
    (void)numargs;
    (void)str;
    (void)buf;
    (void)indent;
    uint64_t km_res = 0;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<uint64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_clear_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t arg = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_msgarg_clear")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(arg);
#else
    (void)arg;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_clone_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t destination = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t source = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_msgarg_clone")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(destination, source);
#else
    (void)destination;
    (void)source;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_copy_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t source = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_msgarg_copy")));
    }
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(source) : -1;
#else
    (void)source;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_create_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_msgarg_create")));
    }
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr() : -1;
#else
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_destroy_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t arg = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_msgarg_destroy")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(arg);
#else
    (void)arg;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_equal_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t lhv = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t rhv = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_msgarg_equal")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lhv, rhv) : -1;
#else
    (void)lhv;
    (void)rhv;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_array_element_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t arg = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint64_t arg_1_index = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* element = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, uint64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_msgarg_get_array_element")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(arg, arg_1_index, element);
#else
    (void)arg;
    (void)arg_1_index;
    (void)element;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_array_elementsignature_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t arg = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint64_t arg_1_index = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_msgarg_get_array_elementsignature")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(arg, arg_1_index) : NULL;
#else
    (void)arg;
    (void)arg_1_index;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_array_numberofelements_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t arg = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_msgarg_get_array_numberofelements")));
    }
    uint64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(arg) : 0;
#else
    (void)arg;
    uint64_t km_res = 0;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<uint64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_bool_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t arg = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* b = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_msgarg_get_bool")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(arg, b) : -1;
#else
    (void)arg;
    (void)b;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_bool_array_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t arg = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* length = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* ab = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_msgarg_get_bool_array")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(arg, length, ab) : -1;
#else
    (void)arg;
    (void)length;
    (void)ab;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_double_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t arg = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* d = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_msgarg_get_double")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(arg, d) : -1;
#else
    (void)arg;
    (void)d;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_double_array_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t arg = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* length = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* ad = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_msgarg_get_double_array")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(arg, length, ad) : -1;
#else
    (void)arg;
    (void)length;
    (void)ad;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_int16_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t arg = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* n = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_msgarg_get_int16")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(arg, n) : -1;
#else
    (void)arg;
    (void)n;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_int16_array_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t arg = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* length = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* an = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_msgarg_get_int16_array")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(arg, length, an) : -1;
#else
    (void)arg;
    (void)length;
    (void)an;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_int32_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t arg = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* i = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_msgarg_get_int32")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(arg, i) : -1;
#else
    (void)arg;
    (void)i;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_int32_array_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t arg = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* length = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* ai = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_msgarg_get_int32_array")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(arg, length, ai) : -1;
#else
    (void)arg;
    (void)length;
    (void)ai;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_int64_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t arg = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* x = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_msgarg_get_int64")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(arg, x) : -1;
#else
    (void)arg;
    (void)x;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_int64_array_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t arg = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* length = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* ax = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_msgarg_get_int64_array")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(arg, length, ax) : -1;
#else
    (void)arg;
    (void)length;
    (void)ax;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_objectpath_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t arg = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* o = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_msgarg_get_objectpath")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(arg, o) : -1;
#else
    (void)arg;
    (void)o;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_signature_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t arg = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* g = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_msgarg_get_signature")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(arg, g) : -1;
#else
    (void)arg;
    (void)g;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_string_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t arg = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* s = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_msgarg_get_string")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(arg, s) : -1;
#else
    (void)arg;
    (void)s;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_uint16_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t arg = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* q = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_msgarg_get_uint16")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(arg, q) : -1;
#else
    (void)arg;
    (void)q;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_uint16_array_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t arg = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* length = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* aq = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_msgarg_get_uint16_array")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(arg, length, aq) : -1;
#else
    (void)arg;
    (void)length;
    (void)aq;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_uint32_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t arg = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* u = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_msgarg_get_uint32")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(arg, u) : -1;
#else
    (void)arg;
    (void)u;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_uint32_array_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t arg = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* length = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* au = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_msgarg_get_uint32_array")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(arg, length, au) : -1;
#else
    (void)arg;
    (void)length;
    (void)au;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_uint64_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t arg = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* t = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_msgarg_get_uint64")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(arg, t) : -1;
#else
    (void)arg;
    (void)t;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_uint64_array_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t arg = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* length = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* at = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_msgarg_get_uint64_array")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(arg, length, at) : -1;
#else
    (void)arg;
    (void)length;
    (void)at;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_uint8_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t arg = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* y = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_msgarg_get_uint8")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(arg, y) : -1;
#else
    (void)arg;
    (void)y;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_uint8_array_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t arg = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* length = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* ay = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_msgarg_get_uint8_array")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(arg, length, ay) : -1;
#else
    (void)arg;
    (void)length;
    (void)ay;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_variant_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t arg = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t v = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_msgarg_get_variant")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(arg, v) : -1;
#else
    (void)arg;
    (void)v;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_variant_array_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t arg = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* signature = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* length = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* av = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_msgarg_get_variant_array")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(arg, signature, length, av) : -1;
#else
    (void)arg;
    (void)signature;
    (void)length;
    (void)av;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_getkey_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t arg = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_msgarg_getkey")));
    }
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(arg) : -1;
#else
    (void)arg;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_getmember_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t arg = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint64_t arg_1_index = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_msgarg_getmember")));
    }
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(arg, arg_1_index) : -1;
#else
    (void)arg;
    (void)arg_1_index;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_getnummembers_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t arg = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_msgarg_getnummembers")));
    }
    uint64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(arg) : 0;
#else
    (void)arg;
    uint64_t km_res = 0;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<uint64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_gettype_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t arg = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_msgarg_gettype")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(arg) : -1;
#else
    (void)arg;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_getvalue_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t arg = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_msgarg_getvalue")));
    }
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(arg) : -1;
#else
    (void)arg;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_hassignature_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t arg = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* signature = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_msgarg_hassignature")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(arg, signature) : -1;
#else
    (void)arg;
    (void)signature;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_set_bool_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t arg = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int32_t b = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_msgarg_set_bool")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(arg, b) : -1;
#else
    (void)arg;
    (void)b;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_set_bool_array_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t arg = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint64_t length = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* ab = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_msgarg_set_bool_array")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(arg, length, ab) : -1;
#else
    (void)arg;
    (void)length;
    (void)ab;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_set_double_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t arg = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    double d = km_info.Length() > 1 ? km_info[1].ToNumber().DoubleValue() : 0.0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, double);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_msgarg_set_double")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(arg, d) : -1;
#else
    (void)arg;
    (void)d;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_set_double_array_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t arg = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint64_t length = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* ad = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_msgarg_set_double_array")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(arg, length, ad) : -1;
#else
    (void)arg;
    (void)length;
    (void)ad;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_set_int16_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t arg = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int16_t n = static_cast<int16_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int16_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_msgarg_set_int16")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(arg, n) : -1;
#else
    (void)arg;
    (void)n;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_set_int16_array_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t arg = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint64_t length = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* an = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_msgarg_set_int16_array")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(arg, length, an) : -1;
#else
    (void)arg;
    (void)length;
    (void)an;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_set_int32_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t arg = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int32_t i = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_msgarg_set_int32")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(arg, i) : -1;
#else
    (void)arg;
    (void)i;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_set_int32_array_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t arg = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint64_t length = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* ai = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_msgarg_set_int32_array")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(arg, length, ai) : -1;
#else
    (void)arg;
    (void)length;
    (void)ai;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_set_int64_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t arg = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t x = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_msgarg_set_int64")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(arg, x) : -1;
#else
    (void)arg;
    (void)x;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_set_int64_array_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t arg = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint64_t length = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* ax = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_msgarg_set_int64_array")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(arg, length, ax) : -1;
#else
    (void)arg;
    (void)length;
    (void)ax;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_set_objectpath_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t arg = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* o = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_msgarg_set_objectpath")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(arg, o) : -1;
#else
    (void)arg;
    (void)o;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_set_objectpath_array_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t arg = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint64_t length = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* ao = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_msgarg_set_objectpath_array")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(arg, length, ao) : -1;
#else
    (void)arg;
    (void)length;
    (void)ao;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_set_signature_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t arg = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* g = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_msgarg_set_signature")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(arg, g) : -1;
#else
    (void)arg;
    (void)g;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_set_signature_array_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t arg = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint64_t length = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* ag = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_msgarg_set_signature_array")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(arg, length, ag) : -1;
#else
    (void)arg;
    (void)length;
    (void)ag;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_set_string_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t arg = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* s = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_msgarg_set_string")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(arg, s) : -1;
#else
    (void)arg;
    (void)s;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_set_string_array_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t arg = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint64_t length = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* as = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_msgarg_set_string_array")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(arg, length, as) : -1;
#else
    (void)arg;
    (void)length;
    (void)as;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_set_uint16_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t arg = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint16_t q = static_cast<uint16_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint16_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_msgarg_set_uint16")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(arg, q) : -1;
#else
    (void)arg;
    (void)q;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_set_uint16_array_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t arg = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint64_t length = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* aq = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_msgarg_set_uint16_array")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(arg, length, aq) : -1;
#else
    (void)arg;
    (void)length;
    (void)aq;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_set_uint32_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t arg = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint32_t u = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_msgarg_set_uint32")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(arg, u) : -1;
#else
    (void)arg;
    (void)u;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_set_uint32_array_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t arg = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint64_t length = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* au = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_msgarg_set_uint32_array")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(arg, length, au) : -1;
#else
    (void)arg;
    (void)length;
    (void)au;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_set_uint64_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t arg = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint64_t t = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_msgarg_set_uint64")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(arg, t) : -1;
#else
    (void)arg;
    (void)t;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_set_uint64_array_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t arg = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint64_t length = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* at = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_msgarg_set_uint64_array")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(arg, length, at) : -1;
#else
    (void)arg;
    (void)length;
    (void)at;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_set_uint8_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t arg = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint8_t y = static_cast<uint8_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint8_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_msgarg_set_uint8")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(arg, y) : -1;
#else
    (void)arg;
    (void)y;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_set_uint8_array_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t arg = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint64_t length = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* ay = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_msgarg_set_uint8_array")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(arg, length, ay) : -1;
#else
    (void)arg;
    (void)length;
    (void)ay;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_setdictentry_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t arg = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t key = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
    int64_t value = km_info.Length() > 2 ? km_napi_arg_i64(km_info[2]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_msgarg_setdictentry")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(arg, key, value) : -1;
#else
    (void)arg;
    (void)key;
    (void)value;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_setstruct_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t arg = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t struct_members = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
    uint64_t num_members = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_msgarg_setstruct")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(arg, struct_members, num_members) : -1;
#else
    (void)arg;
    (void)struct_members;
    (void)num_members;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_signature_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t arg = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* str = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint64_t buf = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(int64_t, void*, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_msgarg_signature")));
    }
    uint64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(arg, str, buf) : 0;
#else
    (void)arg;
    (void)str;
    (void)buf;
    uint64_t km_res = 0;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<uint64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_stabilize_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t arg = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_msgarg_stabilize")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(arg);
#else
    (void)arg;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_tostring_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t arg = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* str = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint64_t buf = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
    uint64_t indent = km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0;
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(int64_t, void*, uint64_t, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_msgarg_tostring")));
    }
    uint64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(arg, str, buf, indent) : 0;
#else
    (void)arg;
    (void)str;
    (void)buf;
    (void)indent;
    uint64_t km_res = 0;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<uint64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_observer_create_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t bus = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* mandatoryinterfaces = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint64_t nummandatoryinterfaces = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, void*, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_observer_create")));
    }
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(bus, mandatoryinterfaces, nummandatoryinterfaces) : -1;
#else
    (void)bus;
    (void)mandatoryinterfaces;
    (void)nummandatoryinterfaces;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_observer_destroy_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t observer = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_observer_destroy")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(observer);
#else
    (void)observer;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_observer_get_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t observer = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* uniquebusname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* objectpath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_observer_get")));
    }
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(observer, uniquebusname, objectpath) : -1;
#else
    (void)observer;
    (void)uniquebusname;
    (void)objectpath;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_observer_getfirst_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t observer = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_observer_getfirst")));
    }
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(observer) : -1;
#else
    (void)observer;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_observer_getnext_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t observer = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t proxyref = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_observer_getnext")));
    }
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(observer, proxyref) : -1;
#else
    (void)observer;
    (void)proxyref;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_observer_registerlistener_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t observer = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t listener = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
    int32_t triggeronexisting = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, int64_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_observer_registerlistener")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(observer, listener, triggeronexisting);
#else
    (void)observer;
    (void)listener;
    (void)triggeronexisting;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_observer_unregisteralllisteners_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t observer = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_observer_unregisteralllisteners")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(observer);
#else
    (void)observer;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_observer_unregisterlistener_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t observer = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t listener = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_observer_unregisterlistener")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(observer, listener);
#else
    (void)observer;
    (void)listener;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_observerlistener_create_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* callback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* context = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_observerlistener_create")));
    }
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(callback, context) : -1;
#else
    (void)callback;
    (void)context;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_observerlistener_destroy_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t listener = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_observerlistener_destroy")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(listener);
#else
    (void)listener;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_passwordmanager_setcredentials_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* authmechanism = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* password = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_passwordmanager_setcredentials")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(authmechanism, password) : -1;
#else
    (void)authmechanism;
    (void)password;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurationlistener_create_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* callbacks = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* context = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_permissionconfigurationlistener_create")));
    }
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(callbacks, context) : -1;
#else
    (void)callbacks;
    (void)context;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurationlistener_destroy_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t listener = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_permissionconfigurationlistener_destroy")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(listener);
#else
    (void)listener;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_certificatechain_destroy_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* certificatechain = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_permissionconfigurator_certificatechain_destroy")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(certificatechain);
#else
    (void)certificatechain;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_certificateid_cleanup_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* certificateid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_permissionconfigurator_certificateid_cleanup")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(certificateid);
#else
    (void)certificateid;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_certificateidarray_cleanup_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* certificateidarray = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_permissionconfigurator_certificateidarray_cleanup")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(certificateidarray);
#else
    (void)certificateidarray;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_claim_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t configurator = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* cakey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* identitycertificatechain = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* groupid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint64_t groupsize = km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0;
    void* groupauthority = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* manifestsxmls = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    uint64_t manifestscount = km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*, uint64_t, void*, void*, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_permissionconfigurator_claim")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(configurator, cakey, identitycertificatechain, groupid, groupsize, groupauthority, manifestsxmls, manifestscount) : -1;
#else
    (void)configurator;
    (void)cakey;
    (void)identitycertificatechain;
    (void)groupid;
    (void)groupsize;
    (void)groupauthority;
    (void)manifestsxmls;
    (void)manifestscount;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_endmanagement_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t configurator = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_permissionconfigurator_endmanagement")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(configurator) : -1;
#else
    (void)configurator;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_getapplicationstate_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t configurator = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* state = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_permissionconfigurator_getapplicationstate")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(configurator, state) : -1;
#else
    (void)configurator;
    (void)state;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_getclaimcapabilities_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t configurator = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* claimcapabilities = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_permissionconfigurator_getclaimcapabilities")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(configurator, claimcapabilities) : -1;
#else
    (void)configurator;
    (void)claimcapabilities;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_getclaimcapabilitiesadditionalinfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t configurator = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* additionalinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_permissionconfigurator_getclaimcapabilitiesadditionalinfo")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(configurator, additionalinfo) : -1;
#else
    (void)configurator;
    (void)additionalinfo;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_getdefaultclaimcapabilities_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef uint16_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_permissionconfigurator_getdefaultclaimcapabilities")));
    }
    uint16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr() : 0;
#else
    uint16_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_getdefaultpolicy_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t configurator = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* policyxml = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_permissionconfigurator_getdefaultpolicy")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(configurator, policyxml) : -1;
#else
    (void)configurator;
    (void)policyxml;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_getidentity_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t configurator = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* identitycertificatechain = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_permissionconfigurator_getidentity")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(configurator, identitycertificatechain) : -1;
#else
    (void)configurator;
    (void)identitycertificatechain;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_getidentitycertificateid_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t configurator = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* certificateid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_permissionconfigurator_getidentitycertificateid")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(configurator, certificateid) : -1;
#else
    (void)configurator;
    (void)certificateid;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_getmanifests_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t configurator = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* manifestarray = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_permissionconfigurator_getmanifests")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(configurator, manifestarray) : -1;
#else
    (void)configurator;
    (void)manifestarray;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_getmanifesttemplate_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t configurator = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* manifesttemplatexml = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_permissionconfigurator_getmanifesttemplate")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(configurator, manifesttemplatexml) : -1;
#else
    (void)configurator;
    (void)manifesttemplatexml;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_getmembershipsummaries_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t configurator = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* certificateids = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_permissionconfigurator_getmembershipsummaries")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(configurator, certificateids) : -1;
#else
    (void)configurator;
    (void)certificateids;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_getpolicy_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t configurator = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* policyxml = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_permissionconfigurator_getpolicy")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(configurator, policyxml) : -1;
#else
    (void)configurator;
    (void)policyxml;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_getpublickey_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t configurator = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* publickey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_permissionconfigurator_getpublickey")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(configurator, publickey) : -1;
#else
    (void)configurator;
    (void)publickey;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_installmanifests_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t configurator = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* manifestsxmls = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint64_t manifestscount = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
    int32_t append = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint64_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_permissionconfigurator_installmanifests")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(configurator, manifestsxmls, manifestscount, append) : -1;
#else
    (void)configurator;
    (void)manifestsxmls;
    (void)manifestscount;
    (void)append;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_installmembership_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t configurator = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* membershipcertificatechain = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_permissionconfigurator_installmembership")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(configurator, membershipcertificatechain) : -1;
#else
    (void)configurator;
    (void)membershipcertificatechain;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_manifestarray_cleanup_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* manifestarray = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_permissionconfigurator_manifestarray_cleanup")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(manifestarray);
#else
    (void)manifestarray;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_manifesttemplate_destroy_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* manifesttemplatexml = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_permissionconfigurator_manifesttemplate_destroy")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(manifesttemplatexml);
#else
    (void)manifesttemplatexml;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_policy_destroy_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* policyxml = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_permissionconfigurator_policy_destroy")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(policyxml);
#else
    (void)policyxml;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_publickey_destroy_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* publickey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_permissionconfigurator_publickey_destroy")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(publickey);
#else
    (void)publickey;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_removemembership_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t configurator = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* serial = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint64_t seriallen = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
    void* issuerpublickey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* issueraki = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint64_t issuerakilen = km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint64_t, void*, void*, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_permissionconfigurator_removemembership")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(configurator, serial, seriallen, issuerpublickey, issueraki, issuerakilen) : -1;
#else
    (void)configurator;
    (void)serial;
    (void)seriallen;
    (void)issuerpublickey;
    (void)issueraki;
    (void)issuerakilen;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_reset_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t configurator = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_permissionconfigurator_reset")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(configurator) : -1;
#else
    (void)configurator;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_resetpolicy_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t configurator = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_permissionconfigurator_resetpolicy")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(configurator) : -1;
#else
    (void)configurator;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_setapplicationstate_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t configurator = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int32_t state = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_permissionconfigurator_setapplicationstate")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(configurator, state) : -1;
#else
    (void)configurator;
    (void)state;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_setclaimcapabilities_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t configurator = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint16_t claimcapabilities = static_cast<uint16_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint16_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_permissionconfigurator_setclaimcapabilities")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(configurator, claimcapabilities) : -1;
#else
    (void)configurator;
    (void)claimcapabilities;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_setclaimcapabilitiesadditionalinfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t configurator = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint16_t additionalinfo = static_cast<uint16_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint16_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_permissionconfigurator_setclaimcapabilitiesadditionalinfo")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(configurator, additionalinfo) : -1;
#else
    (void)configurator;
    (void)additionalinfo;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_setmanifesttemplatefromxml_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t configurator = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* manifesttemplatexml = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_permissionconfigurator_setmanifesttemplatefromxml")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(configurator, manifesttemplatexml) : -1;
#else
    (void)configurator;
    (void)manifesttemplatexml;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_startmanagement_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t configurator = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_permissionconfigurator_startmanagement")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(configurator) : -1;
#else
    (void)configurator;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_updateidentity_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t configurator = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* identitycertificatechain = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* manifestsxmls = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint64_t manifestscount = km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_permissionconfigurator_updateidentity")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(configurator, identitycertificatechain, manifestsxmls, manifestscount) : -1;
#else
    (void)configurator;
    (void)identitycertificatechain;
    (void)manifestsxmls;
    (void)manifestscount;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_updatepolicy_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t configurator = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* policyxml = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_permissionconfigurator_updatepolicy")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(configurator, policyxml) : -1;
#else
    (void)configurator;
    (void)policyxml;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_pinglistener_create_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* callback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* context = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_pinglistener_create")));
    }
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(callback, context) : -1;
#else
    (void)callback;
    (void)context;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_pinglistener_destroy_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t listener = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_pinglistener_destroy")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(listener);
#else
    (void)listener;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_addchild_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t proxyobj = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t child = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_proxybusobject_addchild")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(proxyobj, child) : -1;
#else
    (void)proxyobj;
    (void)child;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_addinterface_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t proxyobj = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t iface = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_proxybusobject_addinterface")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(proxyobj, iface) : -1;
#else
    (void)proxyobj;
    (void)iface;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_addinterface_by_name_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t proxyobj = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* name = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_proxybusobject_addinterface_by_name")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(proxyobj, name) : -1;
#else
    (void)proxyobj;
    (void)name;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_copy_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t source = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_proxybusobject_copy")));
    }
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(source) : -1;
#else
    (void)source;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_create_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t bus = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* service = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* path = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t sessionid = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_proxybusobject_create")));
    }
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(bus, service, path, sessionid) : -1;
#else
    (void)bus;
    (void)service;
    (void)path;
    (void)sessionid;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_create_secure_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t bus = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* service = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* path = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t sessionid = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_proxybusobject_create_secure")));
    }
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(bus, service, path, sessionid) : -1;
#else
    (void)bus;
    (void)service;
    (void)path;
    (void)sessionid;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_destroy_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t proxyobj = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_proxybusobject_destroy")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(proxyobj);
#else
    (void)proxyobj;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_enablepropertycaching_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t proxyobj = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_proxybusobject_enablepropertycaching")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(proxyobj);
#else
    (void)proxyobj;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_getallproperties_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t proxyobj = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* iface = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int64_t values = km_info.Length() > 2 ? km_napi_arg_i64(km_info[2]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_proxybusobject_getallproperties")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(proxyobj, iface, values) : -1;
#else
    (void)proxyobj;
    (void)iface;
    (void)values;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_getallpropertiesasync_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t proxyobj = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* iface = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* callback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t timeout = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* context = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_proxybusobject_getallpropertiesasync")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(proxyobj, iface, callback, timeout, context) : -1;
#else
    (void)proxyobj;
    (void)iface;
    (void)callback;
    (void)timeout;
    (void)context;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_getchild_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t proxyobj = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* path = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_proxybusobject_getchild")));
    }
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(proxyobj, path) : -1;
#else
    (void)proxyobj;
    (void)path;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_getchildren_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t proxyobj = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* children = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint64_t numchildren = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(int64_t, void*, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_proxybusobject_getchildren")));
    }
    uint64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(proxyobj, children, numchildren) : 0;
#else
    (void)proxyobj;
    (void)children;
    (void)numchildren;
    uint64_t km_res = 0;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<uint64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_getinterface_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t proxyobj = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* iface = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_proxybusobject_getinterface")));
    }
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(proxyobj, iface) : -1;
#else
    (void)proxyobj;
    (void)iface;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_getinterfaces_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t proxyobj = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* ifaces = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint64_t numifaces = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(int64_t, void*, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_proxybusobject_getinterfaces")));
    }
    uint64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(proxyobj, ifaces, numifaces) : 0;
#else
    (void)proxyobj;
    (void)ifaces;
    (void)numifaces;
    uint64_t km_res = 0;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<uint64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_getpath_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t proxyobj = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_proxybusobject_getpath")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(proxyobj) : NULL;
#else
    (void)proxyobj;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_getproperty_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t proxyobj = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* iface = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* property = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int64_t value = km_info.Length() > 3 ? km_napi_arg_i64(km_info[3]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_proxybusobject_getproperty")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(proxyobj, iface, property, value) : -1;
#else
    (void)proxyobj;
    (void)iface;
    (void)property;
    (void)value;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_getpropertyasync_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t proxyobj = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* iface = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* property = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* callback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t timeout = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* context = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_proxybusobject_getpropertyasync")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(proxyobj, iface, property, callback, timeout, context) : -1;
#else
    (void)proxyobj;
    (void)iface;
    (void)property;
    (void)callback;
    (void)timeout;
    (void)context;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_getservicename_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t proxyobj = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_proxybusobject_getservicename")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(proxyobj) : NULL;
#else
    (void)proxyobj;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_getsessionid_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t proxyobj = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_proxybusobject_getsessionid")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(proxyobj) : 0;
#else
    (void)proxyobj;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_getuniquename_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t proxyobj = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_proxybusobject_getuniquename")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(proxyobj) : NULL;
#else
    (void)proxyobj;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_implementsinterface_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t proxyobj = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* iface = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_proxybusobject_implementsinterface")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(proxyobj, iface) : -1;
#else
    (void)proxyobj;
    (void)iface;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_introspectremoteobject_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t proxyobj = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_proxybusobject_introspectremoteobject")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(proxyobj) : -1;
#else
    (void)proxyobj;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_introspectremoteobjectasync_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t proxyobj = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* callback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* context = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_proxybusobject_introspectremoteobjectasync")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(proxyobj, callback, context) : -1;
#else
    (void)proxyobj;
    (void)callback;
    (void)context;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_issecure_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t proxyobj = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_proxybusobject_issecure")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(proxyobj) : -1;
#else
    (void)proxyobj;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_isvalid_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t proxyobj = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_proxybusobject_isvalid")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(proxyobj) : -1;
#else
    (void)proxyobj;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_methodcall_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t proxyobj = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* ifacename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* methodname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int64_t args = km_info.Length() > 3 ? km_napi_arg_i64(km_info[3]) : 0;
    uint64_t numargs = km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0;
    int64_t replymsg = km_info.Length() > 5 ? km_napi_arg_i64(km_info[5]) : 0;
    uint32_t timeout = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    uint8_t flags = static_cast<uint8_t>(km_info.Length() > 7 ? km_info[7].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, int64_t, uint64_t, int64_t, uint32_t, uint8_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_proxybusobject_methodcall")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(proxyobj, ifacename, methodname, args, numargs, replymsg, timeout, flags) : -1;
#else
    (void)proxyobj;
    (void)ifacename;
    (void)methodname;
    (void)args;
    (void)numargs;
    (void)replymsg;
    (void)timeout;
    (void)flags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_methodcall_noreply_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t proxyobj = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* ifacename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* methodname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int64_t args = km_info.Length() > 3 ? km_napi_arg_i64(km_info[3]) : 0;
    uint64_t numargs = km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0;
    uint8_t flags = static_cast<uint8_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, int64_t, uint64_t, uint8_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_proxybusobject_methodcall_noreply")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(proxyobj, ifacename, methodname, args, numargs, flags) : -1;
#else
    (void)proxyobj;
    (void)ifacename;
    (void)methodname;
    (void)args;
    (void)numargs;
    (void)flags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_methodcallasync_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t proxyobj = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* ifacename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* methodname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* replyfunc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    int64_t args = km_info.Length() > 4 ? km_napi_arg_i64(km_info[4]) : 0;
    uint64_t numargs = km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0;
    void* context = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    uint32_t timeout = static_cast<uint32_t>(km_info.Length() > 7 ? km_info[7].ToNumber().Int32Value() : 0);
    uint8_t flags = static_cast<uint8_t>(km_info.Length() > 8 ? km_info[8].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*, int64_t, uint64_t, void*, uint32_t, uint8_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_proxybusobject_methodcallasync")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(proxyobj, ifacename, methodname, replyfunc, args, numargs, context, timeout, flags) : -1;
#else
    (void)proxyobj;
    (void)ifacename;
    (void)methodname;
    (void)replyfunc;
    (void)args;
    (void)numargs;
    (void)context;
    (void)timeout;
    (void)flags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_parsexml_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t proxyobj = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* xml = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* identifier = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_proxybusobject_parsexml")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(proxyobj, xml, identifier) : -1;
#else
    (void)proxyobj;
    (void)xml;
    (void)identifier;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_ref_create_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t proxy = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_proxybusobject_ref_create")));
    }
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(proxy) : -1;
#else
    (void)proxy;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_ref_decref_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t ref = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_proxybusobject_ref_decref")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(ref);
#else
    (void)ref;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_ref_get_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t ref = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_proxybusobject_ref_get")));
    }
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(ref) : -1;
#else
    (void)ref;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_ref_incref_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t ref = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_proxybusobject_ref_incref")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(ref);
#else
    (void)ref;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_registerpropertieschangedlistener_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t proxyobj = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* iface = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* properties = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint64_t numproperties = km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0;
    void* callback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* context = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_proxybusobject_registerpropertieschangedlistener")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(proxyobj, iface, properties, numproperties, callback, context) : -1;
#else
    (void)proxyobj;
    (void)iface;
    (void)properties;
    (void)numproperties;
    (void)callback;
    (void)context;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_removechild_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t proxyobj = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* path = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_proxybusobject_removechild")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(proxyobj, path) : -1;
#else
    (void)proxyobj;
    (void)path;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_secureconnection_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t proxyobj = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int32_t forceauth = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_proxybusobject_secureconnection")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(proxyobj, forceauth) : -1;
#else
    (void)proxyobj;
    (void)forceauth;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_secureconnectionasync_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t proxyobj = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int32_t forceauth = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_proxybusobject_secureconnectionasync")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(proxyobj, forceauth) : -1;
#else
    (void)proxyobj;
    (void)forceauth;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_setproperty_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t proxyobj = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* iface = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* property = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int64_t value = km_info.Length() > 3 ? km_napi_arg_i64(km_info[3]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_proxybusobject_setproperty")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(proxyobj, iface, property, value) : -1;
#else
    (void)proxyobj;
    (void)iface;
    (void)property;
    (void)value;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_setpropertyasync_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t proxyobj = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* iface = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* property = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int64_t value = km_info.Length() > 3 ? km_napi_arg_i64(km_info[3]) : 0;
    void* callback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t timeout = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* context = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, int64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_proxybusobject_setpropertyasync")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(proxyobj, iface, property, value, callback, timeout, context) : -1;
#else
    (void)proxyobj;
    (void)iface;
    (void)property;
    (void)value;
    (void)callback;
    (void)timeout;
    (void)context;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_unregisterpropertieschangedlistener_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t proxyobj = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* iface = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* callback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_proxybusobject_unregisterpropertieschangedlistener")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(proxyobj, iface, callback) : -1;
#else
    (void)proxyobj;
    (void)iface;
    (void)callback;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_routerinit_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_routerinit")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_routerinitwithconfig_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* configxml = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_routerinitwithconfig")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(configxml) : -1;
#else
    (void)configxml;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_routershutdown_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_routershutdown")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_claim_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t proxy = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* cakey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* identitycertificatechain = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* groupid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint64_t groupsize = km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0;
    void* groupauthority = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* manifestsxmls = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    uint64_t manifestscount = km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*, uint64_t, void*, void*, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_securityapplicationproxy_claim")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(proxy, cakey, identitycertificatechain, groupid, groupsize, groupauthority, manifestsxmls, manifestscount) : -1;
#else
    (void)proxy;
    (void)cakey;
    (void)identitycertificatechain;
    (void)groupid;
    (void)groupsize;
    (void)groupauthority;
    (void)manifestsxmls;
    (void)manifestscount;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_computemanifestdigest_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* unsignedmanifestxml = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* identitycertificatepem = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* digest = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* digestsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_securityapplicationproxy_computemanifestdigest")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(unsignedmanifestxml, identitycertificatepem, digest, digestsize) : -1;
#else
    (void)unsignedmanifestxml;
    (void)identitycertificatepem;
    (void)digest;
    (void)digestsize;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_create_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t bus = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* appbusname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t sessionid = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_securityapplicationproxy_create")));
    }
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(bus, appbusname, sessionid) : -1;
#else
    (void)bus;
    (void)appbusname;
    (void)sessionid;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_destroy_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t proxy = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_securityapplicationproxy_destroy")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(proxy);
#else
    (void)proxy;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_digest_destroy_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* digest = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_securityapplicationproxy_digest_destroy")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(digest);
#else
    (void)digest;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_eccpublickey_destroy_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* eccpublickey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_securityapplicationproxy_eccpublickey_destroy")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(eccpublickey);
#else
    (void)eccpublickey;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_endmanagement_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t proxy = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_securityapplicationproxy_endmanagement")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(proxy) : -1;
#else
    (void)proxy;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_getapplicationstate_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t proxy = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* applicationstate = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_securityapplicationproxy_getapplicationstate")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(proxy, applicationstate) : -1;
#else
    (void)proxy;
    (void)applicationstate;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_getclaimcapabilities_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t proxy = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* capabilities = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_securityapplicationproxy_getclaimcapabilities")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(proxy, capabilities) : -1;
#else
    (void)proxy;
    (void)capabilities;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_getclaimcapabilitiesadditionalinfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t proxy = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* additionalinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_securityapplicationproxy_getclaimcapabilitiesadditionalinfo")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(proxy, additionalinfo) : -1;
#else
    (void)proxy;
    (void)additionalinfo;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_getdefaultpolicy_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t proxy = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* policyxml = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_securityapplicationproxy_getdefaultpolicy")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(proxy, policyxml) : -1;
#else
    (void)proxy;
    (void)policyxml;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_geteccpublickey_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t proxy = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* eccpublickey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_securityapplicationproxy_geteccpublickey")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(proxy, eccpublickey) : -1;
#else
    (void)proxy;
    (void)eccpublickey;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_getmanifesttemplate_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t proxy = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* manifesttemplatexml = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_securityapplicationproxy_getmanifesttemplate")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(proxy, manifesttemplatexml) : -1;
#else
    (void)proxy;
    (void)manifesttemplatexml;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_getpermissionmanagementsessionport_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef uint16_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_securityapplicationproxy_getpermissionmanagementsessionport")));
    }
    uint16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr() : 0;
#else
    uint16_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_getpolicy_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t proxy = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* policyxml = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_securityapplicationproxy_getpolicy")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(proxy, policyxml) : -1;
#else
    (void)proxy;
    (void)policyxml;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_installmembership_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t proxy = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* membershipcertificatechain = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_securityapplicationproxy_installmembership")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(proxy, membershipcertificatechain) : -1;
#else
    (void)proxy;
    (void)membershipcertificatechain;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_manifest_destroy_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* signedmanifestxml = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_securityapplicationproxy_manifest_destroy")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(signedmanifestxml);
#else
    (void)signedmanifestxml;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_manifesttemplate_destroy_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* manifesttemplatexml = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_securityapplicationproxy_manifesttemplate_destroy")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(manifesttemplatexml);
#else
    (void)manifesttemplatexml;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_policy_destroy_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* policyxml = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_securityapplicationproxy_policy_destroy")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(policyxml);
#else
    (void)policyxml;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_reset_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t proxy = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_securityapplicationproxy_reset")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(proxy) : -1;
#else
    (void)proxy;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_resetpolicy_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t proxy = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_securityapplicationproxy_resetpolicy")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(proxy) : -1;
#else
    (void)proxy;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_setmanifestsignature_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* unsignedmanifestxml = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* identitycertificatepem = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* signature = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint64_t signaturesize = km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0;
    void* signedmanifestxml = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_securityapplicationproxy_setmanifestsignature")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(unsignedmanifestxml, identitycertificatepem, signature, signaturesize, signedmanifestxml) : -1;
#else
    (void)unsignedmanifestxml;
    (void)identitycertificatepem;
    (void)signature;
    (void)signaturesize;
    (void)signedmanifestxml;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_signmanifest_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* unsignedmanifestxml = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* identitycertificatepem = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* signingprivatekeypem = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* signedmanifestxml = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_securityapplicationproxy_signmanifest")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(unsignedmanifestxml, identitycertificatepem, signingprivatekeypem, signedmanifestxml) : -1;
#else
    (void)unsignedmanifestxml;
    (void)identitycertificatepem;
    (void)signingprivatekeypem;
    (void)signedmanifestxml;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_startmanagement_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t proxy = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_securityapplicationproxy_startmanagement")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(proxy) : -1;
#else
    (void)proxy;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_updateidentity_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t proxy = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* identitycertificatechain = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* manifestsxmls = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint64_t manifestscount = km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_securityapplicationproxy_updateidentity")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(proxy, identitycertificatechain, manifestsxmls, manifestscount) : -1;
#else
    (void)proxy;
    (void)identitycertificatechain;
    (void)manifestsxmls;
    (void)manifestscount;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_updatepolicy_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t proxy = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* policyxml = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_securityapplicationproxy_updatepolicy")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(proxy, policyxml) : -1;
#else
    (void)proxy;
    (void)policyxml;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_sessionlistener_create_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* callbacks = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* context = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_sessionlistener_create")));
    }
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(callbacks, context) : -1;
#else
    (void)callbacks;
    (void)context;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_sessionlistener_destroy_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t listener = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_sessionlistener_destroy")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(listener);
#else
    (void)listener;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_sessionopts_cmp_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t one = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t other = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_sessionopts_cmp")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(one, other) : -1;
#else
    (void)one;
    (void)other;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_sessionopts_create_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint8_t traffic = static_cast<uint8_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    int32_t ismultipoint = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint8_t proximity = static_cast<uint8_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint16_t transports = static_cast<uint16_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(uint8_t, int32_t, uint8_t, uint16_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_sessionopts_create")));
    }
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(traffic, ismultipoint, proximity, transports) : -1;
#else
    (void)traffic;
    (void)ismultipoint;
    (void)proximity;
    (void)transports;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_sessionopts_destroy_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t opts = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_sessionopts_destroy")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(opts);
#else
    (void)opts;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_sessionopts_get_multipoint_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t opts = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_sessionopts_get_multipoint")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(opts) : -1;
#else
    (void)opts;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_sessionopts_get_proximity_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t opts = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef uint8_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_sessionopts_get_proximity")));
    }
    uint8_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(opts) : 0;
#else
    (void)opts;
    uint8_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_sessionopts_get_traffic_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t opts = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef uint8_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_sessionopts_get_traffic")));
    }
    uint8_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(opts) : 0;
#else
    (void)opts;
    uint8_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_sessionopts_get_transports_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t opts = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef uint16_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_sessionopts_get_transports")));
    }
    uint16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(opts) : 0;
#else
    (void)opts;
    uint16_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_sessionopts_iscompatible_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t one = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t other = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_sessionopts_iscompatible")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(one, other) : -1;
#else
    (void)one;
    (void)other;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_sessionopts_set_multipoint_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t opts = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int32_t ismultipoint = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_sessionopts_set_multipoint")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(opts, ismultipoint);
#else
    (void)opts;
    (void)ismultipoint;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_sessionopts_set_proximity_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t opts = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint8_t proximity = static_cast<uint8_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, uint8_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_sessionopts_set_proximity")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(opts, proximity);
#else
    (void)opts;
    (void)proximity;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_sessionopts_set_traffic_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t opts = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint8_t traffic = static_cast<uint8_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, uint8_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_sessionopts_set_traffic")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(opts, traffic);
#else
    (void)opts;
    (void)traffic;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_sessionopts_set_transports_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t opts = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint16_t transports = static_cast<uint16_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, uint16_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_sessionopts_set_transports")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(opts, transports);
#else
    (void)opts;
    (void)transports;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_sessionportlistener_create_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* callbacks = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* context = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_sessionportlistener_create")));
    }
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(callbacks, context) : -1;
#else
    (void)callbacks;
    (void)context;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_sessionportlistener_destroy_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t listener = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_sessionportlistener_destroy")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(listener);
#else
    (void)listener;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_shutdown_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_shutdown")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_unity_deferred_callbacks_process_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_unity_deferred_callbacks_process")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoyn_unity_set_deferred_callback_mainthread_only_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t mainthread_only = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_unity_set_deferred_callback_mainthread_only")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(mainthread_only);
#else
    (void)mainthread_only;
#endif
    return km_env.Undefined();
}

static void register_windows_win32_devices_alljoyn_napi(Napi::Env env, Napi::Object exports) {
    exports.Set("windowssys_windows_win32_devices_alljoyn_AllJoynAcceptBusConnection", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_AllJoynAcceptBusConnection_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_AllJoynCloseBusHandle", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_AllJoynCloseBusHandle_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_AllJoynConnectToBus", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_AllJoynConnectToBus_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_AllJoynCreateBus", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_AllJoynCreateBus_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_AllJoynEnumEvents", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_AllJoynEnumEvents_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_AllJoynEventSelect", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_AllJoynEventSelect_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_AllJoynReceiveFromBus", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_AllJoynReceiveFromBus_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_AllJoynSendToBus", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_AllJoynSendToBus_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_QCC_StatusText", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_QCC_StatusText_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_create", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_create_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_create_empty", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_create_empty_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_create_full", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_create_full_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_createfrommsgarg", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_createfrommsgarg_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_createfromxml", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_createfromxml_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_destroy", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_destroy_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_getaboutdata", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_getaboutdata_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_getajsoftwareversion", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_getajsoftwareversion_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_getannouncedaboutdata", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_getannouncedaboutdata_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_getappid", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_getappid_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_getappname", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_getappname_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_getdateofmanufacture", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_getdateofmanufacture_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_getdefaultlanguage", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_getdefaultlanguage_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_getdescription", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_getdescription_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_getdeviceid", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_getdeviceid_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_getdevicename", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_getdevicename_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_getfield", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_getfield_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_getfields", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_getfields_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_getfieldsignature", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_getfieldsignature_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_gethardwareversion", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_gethardwareversion_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_getmanufacturer", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_getmanufacturer_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_getmodelnumber", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_getmodelnumber_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_getsoftwareversion", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_getsoftwareversion_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_getsupportedlanguages", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_getsupportedlanguages_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_getsupporturl", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_getsupporturl_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_isfieldannounced", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_isfieldannounced_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_isfieldlocalized", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_isfieldlocalized_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_isfieldrequired", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_isfieldrequired_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_isvalid", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_isvalid_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_setappid", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_setappid_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_setappid_fromstring", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_setappid_fromstring_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_setappname", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_setappname_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_setdateofmanufacture", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_setdateofmanufacture_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_setdefaultlanguage", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_setdefaultlanguage_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_setdescription", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_setdescription_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_setdeviceid", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_setdeviceid_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_setdevicename", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_setdevicename_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_setfield", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_setfield_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_sethardwareversion", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_sethardwareversion_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_setmanufacturer", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_setmanufacturer_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_setmodelnumber", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_setmodelnumber_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_setsoftwareversion", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_setsoftwareversion_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_setsupportedlanguage", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_setsupportedlanguage_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_setsupporturl", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_setsupporturl_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdatalistener_create", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdatalistener_create_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdatalistener_destroy", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdatalistener_destroy_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_abouticon_clear", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_abouticon_clear_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_abouticon_create", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_abouticon_create_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_abouticon_destroy", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_abouticon_destroy_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_abouticon_getcontent", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_abouticon_getcontent_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_abouticon_geturl", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_abouticon_geturl_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_abouticon_setcontent", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_abouticon_setcontent_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_abouticon_setcontent_frommsgarg", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_abouticon_setcontent_frommsgarg_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_abouticon_seturl", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_abouticon_seturl_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_abouticonobj_create", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_abouticonobj_create_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_abouticonobj_destroy", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_abouticonobj_destroy_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_abouticonproxy_create", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_abouticonproxy_create_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_abouticonproxy_destroy", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_abouticonproxy_destroy_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_abouticonproxy_geticon", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_abouticonproxy_geticon_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_abouticonproxy_getversion", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_abouticonproxy_getversion_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_aboutlistener_create", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_aboutlistener_create_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_aboutlistener_destroy", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_aboutlistener_destroy_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_aboutobj_announce", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_aboutobj_announce_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_aboutobj_announce_using_datalistener", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_aboutobj_announce_using_datalistener_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_aboutobj_create", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_aboutobj_create_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_aboutobj_destroy", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_aboutobj_destroy_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_aboutobj_unannounce", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_aboutobj_unannounce_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_aboutobjectdescription_clear", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_aboutobjectdescription_clear_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_aboutobjectdescription_create", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_aboutobjectdescription_create_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_aboutobjectdescription_create_full", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_aboutobjectdescription_create_full_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_aboutobjectdescription_createfrommsgarg", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_aboutobjectdescription_createfrommsgarg_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_aboutobjectdescription_destroy", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_aboutobjectdescription_destroy_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_aboutobjectdescription_getinterfacepaths", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_aboutobjectdescription_getinterfacepaths_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_aboutobjectdescription_getinterfaces", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_aboutobjectdescription_getinterfaces_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_aboutobjectdescription_getmsgarg", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_aboutobjectdescription_getmsgarg_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_aboutobjectdescription_getpaths", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_aboutobjectdescription_getpaths_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_aboutobjectdescription_hasinterface", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_aboutobjectdescription_hasinterface_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_aboutobjectdescription_hasinterfaceatpath", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_aboutobjectdescription_hasinterfaceatpath_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_aboutobjectdescription_haspath", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_aboutobjectdescription_haspath_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_aboutproxy_create", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_aboutproxy_create_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_aboutproxy_destroy", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_aboutproxy_destroy_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_aboutproxy_getaboutdata", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_aboutproxy_getaboutdata_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_aboutproxy_getobjectdescription", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_aboutproxy_getobjectdescription_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_aboutproxy_getversion", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_aboutproxy_getversion_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_applicationstatelistener_create", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_applicationstatelistener_create_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_applicationstatelistener_destroy", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_applicationstatelistener_destroy_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_authlistener_create", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_authlistener_create_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_authlistener_destroy", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_authlistener_destroy_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_authlistener_requestcredentialsresponse", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_authlistener_requestcredentialsresponse_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_authlistener_setsharedsecret", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_authlistener_setsharedsecret_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_authlistener_verifycredentialsresponse", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_authlistener_verifycredentialsresponse_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_authlistenerasync_create", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_authlistenerasync_create_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_authlistenerasync_destroy", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_authlistenerasync_destroy_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_autopinger_adddestination", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_autopinger_adddestination_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_autopinger_addpinggroup", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_autopinger_addpinggroup_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_autopinger_create", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_autopinger_create_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_autopinger_destroy", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_autopinger_destroy_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_autopinger_pause", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_autopinger_pause_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_autopinger_removedestination", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_autopinger_removedestination_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_autopinger_removepinggroup", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_autopinger_removepinggroup_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_autopinger_resume", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_autopinger_resume_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_autopinger_setpinginterval", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_autopinger_setpinginterval_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_addlogonentry", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_addlogonentry_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_addmatch", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_addmatch_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_advertisename", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_advertisename_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_bindsessionport", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_bindsessionport_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_canceladvertisename", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_canceladvertisename_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_cancelfindadvertisedname", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_cancelfindadvertisedname_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_cancelfindadvertisednamebytransport", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_cancelfindadvertisednamebytransport_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_cancelwhoimplements_interface", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_cancelwhoimplements_interface_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_cancelwhoimplements_interfaces", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_cancelwhoimplements_interfaces_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_clearkeys", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_clearkeys_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_clearkeystore", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_clearkeystore_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_connect", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_connect_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_create", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_create_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_create_concurrency", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_create_concurrency_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_createinterface", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_createinterface_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_createinterface_secure", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_createinterface_secure_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_createinterfacesfromxml", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_createinterfacesfromxml_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_deletedefaultkeystore", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_deletedefaultkeystore_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_deleteinterface", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_deleteinterface_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_destroy", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_destroy_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_disconnect", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_disconnect_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_enableconcurrentcallbacks", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_enableconcurrentcallbacks_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_enablepeersecurity", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_enablepeersecurity_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_enablepeersecuritywithpermissionconfigurationlistener", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_enablepeersecuritywithpermissionconfigurationlistener_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_findadvertisedname", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_findadvertisedname_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_findadvertisednamebytransport", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_findadvertisednamebytransport_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_getalljoyndebugobj", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_getalljoyndebugobj_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_getalljoynproxyobj", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_getalljoynproxyobj_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_getconcurrency", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_getconcurrency_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_getconnectspec", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_getconnectspec_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_getdbusproxyobj", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_getdbusproxyobj_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_getglobalguidstring", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_getglobalguidstring_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_getinterface", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_getinterface_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_getinterfaces", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_getinterfaces_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_getkeyexpiration", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_getkeyexpiration_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_getpeerguid", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_getpeerguid_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_getpermissionconfigurator", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_getpermissionconfigurator_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_gettimestamp", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_gettimestamp_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_getuniquename", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_getuniquename_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_isconnected", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_isconnected_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_ispeersecurityenabled", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_ispeersecurityenabled_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_isstarted", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_isstarted_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_isstopping", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_isstopping_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_join", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_join_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_joinsession", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_joinsession_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_joinsessionasync", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_joinsessionasync_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_leavesession", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_leavesession_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_namehasowner", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_namehasowner_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_ping", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_ping_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_registeraboutlistener", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_registeraboutlistener_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_registerapplicationstatelistener", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_registerapplicationstatelistener_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_registerbuslistener", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_registerbuslistener_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_registerbusobject", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_registerbusobject_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_registerbusobject_secure", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_registerbusobject_secure_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_registerkeystorelistener", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_registerkeystorelistener_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_releasename", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_releasename_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_reloadkeystore", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_reloadkeystore_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_removematch", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_removematch_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_removesessionmember", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_removesessionmember_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_requestname", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_requestname_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_secureconnection", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_secureconnection_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_secureconnectionasync", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_secureconnectionasync_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_setdaemondebug", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_setdaemondebug_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_setkeyexpiration", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_setkeyexpiration_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_setlinktimeout", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_setlinktimeout_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_setlinktimeoutasync", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_setlinktimeoutasync_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_setsessionlistener", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_setsessionlistener_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_start", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_start_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_stop", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_stop_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_unbindsessionport", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_unbindsessionport_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_unregisteraboutlistener", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_unregisteraboutlistener_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_unregisterallaboutlisteners", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_unregisterallaboutlisteners_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_unregisterallhandlers", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_unregisterallhandlers_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_unregisterapplicationstatelistener", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_unregisterapplicationstatelistener_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_unregisterbuslistener", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_unregisterbuslistener_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_unregisterbusobject", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_unregisterbusobject_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_whoimplements_interface", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_whoimplements_interface_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_whoimplements_interfaces", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_whoimplements_interfaces_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_buslistener_create", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_buslistener_create_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_buslistener_destroy", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_buslistener_destroy_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_busobject_addinterface", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_busobject_addinterface_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_busobject_addinterface_announced", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_busobject_addinterface_announced_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_busobject_addmethodhandlers", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_busobject_addmethodhandlers_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_busobject_cancelsessionlessmessage", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_busobject_cancelsessionlessmessage_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_busobject_cancelsessionlessmessage_serial", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_busobject_cancelsessionlessmessage_serial_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_busobject_create", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_busobject_create_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_busobject_destroy", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_busobject_destroy_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_busobject_emitpropertieschanged", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_busobject_emitpropertieschanged_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_busobject_emitpropertychanged", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_busobject_emitpropertychanged_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_busobject_getannouncedinterfacenames", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_busobject_getannouncedinterfacenames_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_busobject_getbusattachment", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_busobject_getbusattachment_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_busobject_getname", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_busobject_getname_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_busobject_getpath", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_busobject_getpath_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_busobject_issecure", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_busobject_issecure_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_busobject_methodreply_args", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_busobject_methodreply_args_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_busobject_methodreply_err", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_busobject_methodreply_err_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_busobject_methodreply_status", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_busobject_methodreply_status_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_busobject_setannounceflag", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_busobject_setannounceflag_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_credentials_clear", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_credentials_clear_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_credentials_create", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_credentials_create_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_credentials_destroy", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_credentials_destroy_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_credentials_getcertchain", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_credentials_getcertchain_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_credentials_getexpiration", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_credentials_getexpiration_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_credentials_getlogonentry", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_credentials_getlogonentry_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_credentials_getpassword", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_credentials_getpassword_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_credentials_getprivateKey", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_credentials_getprivateKey_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_credentials_getusername", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_credentials_getusername_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_credentials_isset", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_credentials_isset_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_credentials_setcertchain", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_credentials_setcertchain_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_credentials_setexpiration", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_credentials_setexpiration_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_credentials_setlogonentry", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_credentials_setlogonentry_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_credentials_setpassword", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_credentials_setpassword_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_credentials_setprivatekey", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_credentials_setprivatekey_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_credentials_setusername", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_credentials_setusername_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_getbuildinfo", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_getbuildinfo_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_getnumericversion", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_getnumericversion_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_getversion", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_getversion_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_init", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_init_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_activate", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_activate_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_addannotation", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_addannotation_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_addargannotation", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_addargannotation_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_addmember", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_addmember_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_addmemberannotation", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_addmemberannotation_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_addmethod", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_addmethod_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_addproperty", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_addproperty_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_addpropertyannotation", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_addpropertyannotation_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_addsignal", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_addsignal_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_eql", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_eql_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_getannotation", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_getannotation_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_getannotationatindex", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_getannotationatindex_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_getannotationscount", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_getannotationscount_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_getargdescriptionforlanguage", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_getargdescriptionforlanguage_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_getdescriptionforlanguage", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_getdescriptionforlanguage_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_getdescriptionlanguages", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_getdescriptionlanguages_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_getdescriptionlanguages2", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_getdescriptionlanguages2_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_getdescriptiontranslationcallback", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_getdescriptiontranslationcallback_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_getmember", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_getmember_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_getmemberannotation", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_getmemberannotation_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_getmemberargannotation", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_getmemberargannotation_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_getmemberdescriptionforlanguage", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_getmemberdescriptionforlanguage_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_getmembers", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_getmembers_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_getmethod", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_getmethod_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_getname", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_getname_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_getproperties", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_getproperties_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_getproperty", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_getproperty_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_getpropertyannotation", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_getpropertyannotation_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_getpropertydescriptionforlanguage", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_getpropertydescriptionforlanguage_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_getsecuritypolicy", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_getsecuritypolicy_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_getsignal", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_getsignal_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_hasdescription", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_hasdescription_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_hasmember", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_hasmember_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_hasproperties", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_hasproperties_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_hasproperty", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_hasproperty_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_introspect", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_introspect_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_issecure", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_issecure_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_setargdescription", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_setargdescription_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_setargdescriptionforlanguage", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_setargdescriptionforlanguage_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_setdescription", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_setdescription_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_setdescriptionforlanguage", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_setdescriptionforlanguage_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_setdescriptionlanguage", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_setdescriptionlanguage_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_setdescriptiontranslationcallback", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_setdescriptiontranslationcallback_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_setmemberdescription", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_setmemberdescription_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_setmemberdescriptionforlanguage", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_setmemberdescriptionforlanguage_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_setpropertydescription", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_setpropertydescription_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_setpropertydescriptionforlanguage", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_setpropertydescriptionforlanguage_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_keystorelistener_create", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_keystorelistener_create_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_keystorelistener_destroy", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_keystorelistener_destroy_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_keystorelistener_getkeys", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_keystorelistener_getkeys_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_keystorelistener_putkeys", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_keystorelistener_putkeys_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_keystorelistener_with_synchronization_create", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_keystorelistener_with_synchronization_create_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_message_create", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_message_create_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_message_description", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_message_description_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_message_destroy", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_message_destroy_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_message_eql", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_message_eql_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_message_getarg", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_message_getarg_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_message_getargs", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_message_getargs_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_message_getauthmechanism", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_message_getauthmechanism_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_message_getcallserial", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_message_getcallserial_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_message_getcompressiontoken", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_message_getcompressiontoken_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_message_getdestination", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_message_getdestination_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_message_geterrorname", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_message_geterrorname_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_message_getflags", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_message_getflags_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_message_getinterface", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_message_getinterface_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_message_getmembername", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_message_getmembername_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_message_getobjectpath", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_message_getobjectpath_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_message_getreceiveendpointname", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_message_getreceiveendpointname_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_message_getreplyserial", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_message_getreplyserial_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_message_getsender", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_message_getsender_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_message_getsessionid", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_message_getsessionid_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_message_getsignature", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_message_getsignature_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_message_gettimestamp", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_message_gettimestamp_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_message_gettype", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_message_gettype_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_message_isbroadcastsignal", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_message_isbroadcastsignal_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_message_isencrypted", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_message_isencrypted_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_message_isexpired", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_message_isexpired_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_message_isglobalbroadcast", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_message_isglobalbroadcast_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_message_issessionless", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_message_issessionless_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_message_isunreliable", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_message_isunreliable_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_message_setendianess", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_message_setendianess_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_message_tostring", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_message_tostring_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_array_create", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_array_create_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_array_element", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_array_element_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_array_signature", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_array_signature_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_array_tostring", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_array_tostring_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_clear", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_clear_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_clone", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_clone_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_copy", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_copy_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_create", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_create_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_destroy", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_destroy_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_equal", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_equal_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_array_element", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_array_element_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_array_elementsignature", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_array_elementsignature_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_array_numberofelements", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_array_numberofelements_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_bool", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_bool_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_bool_array", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_bool_array_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_double", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_double_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_double_array", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_double_array_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_int16", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_int16_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_int16_array", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_int16_array_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_int32", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_int32_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_int32_array", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_int32_array_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_int64", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_int64_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_int64_array", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_int64_array_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_objectpath", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_objectpath_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_signature", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_signature_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_string", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_string_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_uint16", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_uint16_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_uint16_array", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_uint16_array_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_uint32", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_uint32_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_uint32_array", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_uint32_array_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_uint64", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_uint64_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_uint64_array", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_uint64_array_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_uint8", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_uint8_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_uint8_array", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_uint8_array_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_variant", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_variant_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_variant_array", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_variant_array_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_getkey", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_getkey_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_getmember", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_getmember_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_getnummembers", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_getnummembers_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_gettype", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_gettype_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_getvalue", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_getvalue_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_hassignature", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_hassignature_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_set_bool", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_set_bool_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_set_bool_array", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_set_bool_array_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_set_double", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_set_double_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_set_double_array", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_set_double_array_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_set_int16", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_set_int16_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_set_int16_array", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_set_int16_array_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_set_int32", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_set_int32_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_set_int32_array", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_set_int32_array_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_set_int64", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_set_int64_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_set_int64_array", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_set_int64_array_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_set_objectpath", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_set_objectpath_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_set_objectpath_array", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_set_objectpath_array_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_set_signature", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_set_signature_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_set_signature_array", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_set_signature_array_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_set_string", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_set_string_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_set_string_array", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_set_string_array_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_set_uint16", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_set_uint16_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_set_uint16_array", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_set_uint16_array_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_set_uint32", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_set_uint32_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_set_uint32_array", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_set_uint32_array_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_set_uint64", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_set_uint64_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_set_uint64_array", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_set_uint64_array_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_set_uint8", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_set_uint8_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_set_uint8_array", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_set_uint8_array_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_setdictentry", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_setdictentry_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_setstruct", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_setstruct_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_signature", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_signature_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_stabilize", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_stabilize_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_tostring", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_tostring_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_observer_create", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_observer_create_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_observer_destroy", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_observer_destroy_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_observer_get", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_observer_get_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_observer_getfirst", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_observer_getfirst_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_observer_getnext", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_observer_getnext_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_observer_registerlistener", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_observer_registerlistener_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_observer_unregisteralllisteners", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_observer_unregisteralllisteners_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_observer_unregisterlistener", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_observer_unregisterlistener_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_observerlistener_create", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_observerlistener_create_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_observerlistener_destroy", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_observerlistener_destroy_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_passwordmanager_setcredentials", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_passwordmanager_setcredentials_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurationlistener_create", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurationlistener_create_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurationlistener_destroy", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurationlistener_destroy_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_certificatechain_destroy", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_certificatechain_destroy_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_certificateid_cleanup", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_certificateid_cleanup_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_certificateidarray_cleanup", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_certificateidarray_cleanup_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_claim", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_claim_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_endmanagement", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_endmanagement_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_getapplicationstate", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_getapplicationstate_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_getclaimcapabilities", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_getclaimcapabilities_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_getclaimcapabilitiesadditionalinfo", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_getclaimcapabilitiesadditionalinfo_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_getdefaultclaimcapabilities", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_getdefaultclaimcapabilities_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_getdefaultpolicy", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_getdefaultpolicy_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_getidentity", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_getidentity_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_getidentitycertificateid", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_getidentitycertificateid_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_getmanifests", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_getmanifests_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_getmanifesttemplate", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_getmanifesttemplate_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_getmembershipsummaries", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_getmembershipsummaries_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_getpolicy", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_getpolicy_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_getpublickey", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_getpublickey_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_installmanifests", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_installmanifests_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_installmembership", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_installmembership_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_manifestarray_cleanup", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_manifestarray_cleanup_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_manifesttemplate_destroy", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_manifesttemplate_destroy_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_policy_destroy", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_policy_destroy_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_publickey_destroy", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_publickey_destroy_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_removemembership", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_removemembership_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_reset", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_reset_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_resetpolicy", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_resetpolicy_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_setapplicationstate", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_setapplicationstate_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_setclaimcapabilities", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_setclaimcapabilities_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_setclaimcapabilitiesadditionalinfo", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_setclaimcapabilitiesadditionalinfo_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_setmanifesttemplatefromxml", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_setmanifesttemplatefromxml_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_startmanagement", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_startmanagement_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_updateidentity", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_updateidentity_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_updatepolicy", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_updatepolicy_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_pinglistener_create", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_pinglistener_create_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_pinglistener_destroy", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_pinglistener_destroy_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_addchild", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_addchild_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_addinterface", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_addinterface_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_addinterface_by_name", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_addinterface_by_name_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_copy", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_copy_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_create", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_create_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_create_secure", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_create_secure_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_destroy", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_destroy_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_enablepropertycaching", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_enablepropertycaching_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_getallproperties", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_getallproperties_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_getallpropertiesasync", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_getallpropertiesasync_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_getchild", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_getchild_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_getchildren", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_getchildren_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_getinterface", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_getinterface_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_getinterfaces", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_getinterfaces_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_getpath", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_getpath_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_getproperty", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_getproperty_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_getpropertyasync", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_getpropertyasync_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_getservicename", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_getservicename_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_getsessionid", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_getsessionid_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_getuniquename", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_getuniquename_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_implementsinterface", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_implementsinterface_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_introspectremoteobject", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_introspectremoteobject_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_introspectremoteobjectasync", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_introspectremoteobjectasync_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_issecure", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_issecure_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_isvalid", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_isvalid_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_methodcall", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_methodcall_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_methodcall_noreply", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_methodcall_noreply_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_methodcallasync", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_methodcallasync_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_parsexml", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_parsexml_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_ref_create", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_ref_create_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_ref_decref", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_ref_decref_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_ref_get", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_ref_get_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_ref_incref", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_ref_incref_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_registerpropertieschangedlistener", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_registerpropertieschangedlistener_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_removechild", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_removechild_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_secureconnection", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_secureconnection_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_secureconnectionasync", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_secureconnectionasync_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_setproperty", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_setproperty_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_setpropertyasync", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_setpropertyasync_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_unregisterpropertieschangedlistener", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_unregisterpropertieschangedlistener_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_routerinit", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_routerinit_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_routerinitwithconfig", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_routerinitwithconfig_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_routershutdown", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_routershutdown_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_claim", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_claim_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_computemanifestdigest", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_computemanifestdigest_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_create", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_create_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_destroy", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_destroy_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_digest_destroy", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_digest_destroy_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_eccpublickey_destroy", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_eccpublickey_destroy_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_endmanagement", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_endmanagement_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_getapplicationstate", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_getapplicationstate_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_getclaimcapabilities", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_getclaimcapabilities_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_getclaimcapabilitiesadditionalinfo", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_getclaimcapabilitiesadditionalinfo_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_getdefaultpolicy", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_getdefaultpolicy_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_geteccpublickey", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_geteccpublickey_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_getmanifesttemplate", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_getmanifesttemplate_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_getpermissionmanagementsessionport", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_getpermissionmanagementsessionport_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_getpolicy", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_getpolicy_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_installmembership", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_installmembership_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_manifest_destroy", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_manifest_destroy_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_manifesttemplate_destroy", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_manifesttemplate_destroy_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_policy_destroy", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_policy_destroy_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_reset", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_reset_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_resetpolicy", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_resetpolicy_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_setmanifestsignature", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_setmanifestsignature_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_signmanifest", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_signmanifest_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_startmanagement", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_startmanagement_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_updateidentity", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_updateidentity_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_updatepolicy", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_updatepolicy_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_sessionlistener_create", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_sessionlistener_create_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_sessionlistener_destroy", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_sessionlistener_destroy_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_sessionopts_cmp", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_sessionopts_cmp_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_sessionopts_create", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_sessionopts_create_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_sessionopts_destroy", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_sessionopts_destroy_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_sessionopts_get_multipoint", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_sessionopts_get_multipoint_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_sessionopts_get_proximity", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_sessionopts_get_proximity_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_sessionopts_get_traffic", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_sessionopts_get_traffic_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_sessionopts_get_transports", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_sessionopts_get_transports_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_sessionopts_iscompatible", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_sessionopts_iscompatible_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_sessionopts_set_multipoint", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_sessionopts_set_multipoint_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_sessionopts_set_proximity", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_sessionopts_set_proximity_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_sessionopts_set_traffic", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_sessionopts_set_traffic_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_sessionopts_set_transports", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_sessionopts_set_transports_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_sessionportlistener_create", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_sessionportlistener_create_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_sessionportlistener_destroy", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_sessionportlistener_destroy_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_shutdown", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_shutdown_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_unity_deferred_callbacks_process", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_unity_deferred_callbacks_process_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoyn_unity_set_deferred_callback_mainthread_only", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoyn_unity_set_deferred_callback_mainthread_only_napi));
}

static KmNapiRegistrarNode registrar_node = { &register_windows_win32_devices_alljoyn_napi, nullptr };
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
