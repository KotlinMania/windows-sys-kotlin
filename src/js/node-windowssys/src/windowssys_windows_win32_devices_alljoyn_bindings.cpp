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

static Napi::Value windowssys_windows_win32_devices_alljoyn_allJoynAcceptBusConnection_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_allJoynCloseBusHandle_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_allJoynConnectToBus_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_allJoynCreateBus_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_allJoynEnumEvents_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_allJoynEventSelect_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_allJoynReceiveFromBus_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_allJoynSendToBus_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_qccStatusText_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynAboutdataCreate_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* defaultlanguage = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_aboutdata_create")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(defaultlanguage) : -1;
#else
    (void)defaultlanguage;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynAboutdataCreateEmpty_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_aboutdata_create_empty")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynAboutdataCreateFull_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t arg = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* language = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_aboutdata_create_full")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(arg, language) : -1;
#else
    (void)arg;
    (void)language;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynAboutdataCreatefrommsgarg_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynAboutdataCreatefromxml_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynAboutdataDestroy_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetaboutdata_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetajsoftwareversion_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetannouncedaboutdata_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetappid_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetappname_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetdateofmanufacture_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetdefaultlanguage_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetdescription_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetdeviceid_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetdevicename_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetfield_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetfields_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetfieldsignature_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGethardwareversion_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetmanufacturer_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetmodelnumber_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetsoftwareversion_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetsupportedlanguages_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetsupporturl_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynAboutdataIsfieldannounced_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynAboutdataIsfieldlocalized_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynAboutdataIsfieldrequired_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynAboutdataIsvalid_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynAboutdataSetappid_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynAboutdataSetappidFromstring_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynAboutdataSetappname_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynAboutdataSetdateofmanufacture_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynAboutdataSetdefaultlanguage_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynAboutdataSetdescription_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynAboutdataSetdeviceid_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynAboutdataSetdevicename_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynAboutdataSetfield_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynAboutdataSethardwareversion_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynAboutdataSetmanufacturer_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynAboutdataSetmodelnumber_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynAboutdataSetsoftwareversion_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynAboutdataSetsupportedlanguage_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynAboutdataSetsupporturl_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynAboutdatalistenerCreate_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* callbacks = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* context = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_aboutdatalistener_create")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(callbacks, context) : -1;
#else
    (void)callbacks;
    (void)context;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynAboutdatalistenerDestroy_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynAbouticonClear_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynAbouticonCreate_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_abouticon_create")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynAbouticonDestroy_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynAbouticonGetcontent_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynAbouticonGeturl_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynAbouticonSetcontent_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynAbouticonSetcontentFrommsgarg_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynAbouticonSeturl_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynAbouticonobjCreate_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t bus = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t icon = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_abouticonobj_create")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(bus, icon) : -1;
#else
    (void)bus;
    (void)icon;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynAbouticonobjDestroy_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynAbouticonproxyCreate_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t bus = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* busname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t sessionid = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_abouticonproxy_create")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(bus, busname, sessionid) : -1;
#else
    (void)bus;
    (void)busname;
    (void)sessionid;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynAbouticonproxyDestroy_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynAbouticonproxyGeticon_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynAbouticonproxyGetversion_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynAboutlistenerCreate_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* callback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* context = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_aboutlistener_create")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(callback, context) : -1;
#else
    (void)callback;
    (void)context;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynAboutlistenerDestroy_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynAboutobjAnnounce_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynAboutobjAnnounceUsingDatalistener_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynAboutobjCreate_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t bus = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int32_t isannounced = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_aboutobj_create")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(bus, isannounced) : -1;
#else
    (void)bus;
    (void)isannounced;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynAboutobjDestroy_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynAboutobjUnannounce_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynAboutobjectdescriptionClear_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynAboutobjectdescriptionCreate_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_aboutobjectdescription_create")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynAboutobjectdescriptionCreateFull_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t arg = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_aboutobjectdescription_create_full")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(arg) : -1;
#else
    (void)arg;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynAboutobjectdescriptionCreatefrommsgarg_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynAboutobjectdescriptionDestroy_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynAboutobjectdescriptionGetinterfacepaths_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynAboutobjectdescriptionGetinterfaces_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynAboutobjectdescriptionGetmsgarg_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynAboutobjectdescriptionGetpaths_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynAboutobjectdescriptionHasinterface_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynAboutobjectdescriptionHasinterfaceatpath_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynAboutobjectdescriptionHaspath_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynAboutproxyCreate_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t bus = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* busname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t sessionid = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_aboutproxy_create")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(bus, busname, sessionid) : -1;
#else
    (void)bus;
    (void)busname;
    (void)sessionid;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynAboutproxyDestroy_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynAboutproxyGetaboutdata_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynAboutproxyGetobjectdescription_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynAboutproxyGetversion_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynApplicationstatelistenerCreate_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* callbacks = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* context = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_applicationstatelistener_create")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(callbacks, context) : -1;
#else
    (void)callbacks;
    (void)context;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynApplicationstatelistenerDestroy_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynAuthlistenerCreate_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynAuthlistenerDestroy_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynAuthlistenerRequestcredentialsresponse_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynAuthlistenerSetsharedsecret_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynAuthlistenerVerifycredentialsresponse_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynAuthlistenerasyncCreate_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynAuthlistenerasyncDestroy_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynAutopingerAdddestination_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynAutopingerAddpinggroup_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynAutopingerCreate_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t bus = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_autopinger_create")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(bus) : -1;
#else
    (void)bus;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynAutopingerDestroy_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynAutopingerPause_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynAutopingerRemovedestination_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynAutopingerRemovepinggroup_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynAutopingerResume_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynAutopingerSetpinginterval_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentAddlogonentry_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentAddmatch_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentAdvertisename_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentBindsessionport_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentCanceladvertisename_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentCancelfindadvertisedname_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentCancelfindadvertisednamebytransport_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentCancelwhoimplementsInterface_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentCancelwhoimplementsInterfaces_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentClearkeys_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentClearkeystore_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentConnect_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentCreate_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentCreateConcurrency_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentCreateinterface_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentCreateinterfaceSecure_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentCreateinterfacesfromxml_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentDeletedefaultkeystore_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentDeleteinterface_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentDestroy_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentDisconnect_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentEnableconcurrentcallbacks_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentEnablepeersecurity_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentEnablepeersecuritywithpermissionconfigurationlistener_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentFindadvertisedname_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentFindadvertisednamebytransport_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentGetalljoyndebugobj_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentGetalljoynproxyobj_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentGetconcurrency_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentGetconnectspec_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentGetdbusproxyobj_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentGetglobalguidstring_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentGetinterface_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t bus = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* name = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_busattachment_getinterface")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(bus, name) : -1;
#else
    (void)bus;
    (void)name;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentGetinterfaces_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentGetkeyexpiration_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentGetpeerguid_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentGetpermissionconfigurator_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t bus = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_busattachment_getpermissionconfigurator")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(bus) : -1;
#else
    (void)bus;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentGettimestamp_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentGetuniquename_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentIsconnected_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentIspeersecurityenabled_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentIsstarted_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentIsstopping_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentJoin_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentJoinsession_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentJoinsessionasync_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentLeavesession_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentNamehasowner_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentPing_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentRegisteraboutlistener_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentRegisterapplicationstatelistener_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentRegisterbuslistener_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentRegisterbusobject_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentRegisterbusobjectSecure_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentRegisterkeystorelistener_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentReleasename_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentReloadkeystore_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentRemovematch_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentRemovesessionmember_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentRequestname_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentSecureconnection_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentSecureconnectionasync_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentSetdaemondebug_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentSetkeyexpiration_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentSetlinktimeout_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentSetlinktimeoutasync_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentSetsessionlistener_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentStart_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentStop_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentUnbindsessionport_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentUnregisteraboutlistener_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentUnregisterallaboutlisteners_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentUnregisterallhandlers_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentUnregisterapplicationstatelistener_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentUnregisterbuslistener_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentUnregisterbusobject_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentWhoimplementsInterface_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentWhoimplementsInterfaces_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynBuslistenerCreate_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* callbacks = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* context = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_buslistener_create")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(callbacks, context) : -1;
#else
    (void)callbacks;
    (void)context;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynBuslistenerDestroy_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynBusobjectAddinterface_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynBusobjectAddinterfaceAnnounced_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynBusobjectAddmethodhandlers_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynBusobjectCancelsessionlessmessage_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynBusobjectCancelsessionlessmessageSerial_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynBusobjectCreate_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynBusobjectDestroy_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynBusobjectEmitpropertieschanged_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynBusobjectEmitpropertychanged_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynBusobjectGetannouncedinterfacenames_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynBusobjectGetbusattachment_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynBusobjectGetname_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynBusobjectGetpath_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynBusobjectIssecure_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynBusobjectMethodreplyArgs_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynBusobjectMethodreplyErr_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynBusobjectMethodreplyStatus_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynBusobjectSetannounceflag_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynCredentialsClear_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynCredentialsCreate_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynCredentialsDestroy_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynCredentialsGetcertchain_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynCredentialsGetexpiration_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynCredentialsGetlogonentry_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynCredentialsGetpassword_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynCredentialsGetprivateKey_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynCredentialsGetusername_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynCredentialsIsset_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynCredentialsSetcertchain_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynCredentialsSetexpiration_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynCredentialsSetlogonentry_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynCredentialsSetpassword_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynCredentialsSetprivatekey_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynCredentialsSetusername_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynGetbuildinfo_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynGetnumericversion_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynGetversion_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynInit_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionActivate_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionAddannotation_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionAddargannotation_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionAddmember_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionAddmemberannotation_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionAddmethod_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionAddproperty_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionAddpropertyannotation_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionAddsignal_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionEql_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetannotation_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetannotationatindex_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetannotationscount_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetargdescriptionforlanguage_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetdescriptionforlanguage_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetdescriptionlanguages_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetdescriptionlanguages2_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetdescriptiontranslationcallback_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetmember_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetmemberannotation_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetmemberargannotation_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetmemberdescriptionforlanguage_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetmembers_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetmethod_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetname_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetproperties_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetproperty_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetpropertyannotation_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetpropertydescriptionforlanguage_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetsecuritypolicy_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetsignal_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionHasdescription_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionHasmember_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionHasproperties_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionHasproperty_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionIntrospect_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionIssecure_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionSetargdescription_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionSetargdescriptionforlanguage_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionSetdescription_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionSetdescriptionforlanguage_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionSetdescriptionlanguage_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionSetdescriptiontranslationcallback_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionSetmemberdescription_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionSetmemberdescriptionforlanguage_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionSetpropertydescription_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionSetpropertydescriptionforlanguage_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynKeystorelistenerCreate_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynKeystorelistenerDestroy_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynKeystorelistenerGetkeys_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynKeystorelistenerPutkeys_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynKeystorelistenerWithSynchronizationCreate_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynMessageCreate_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynMessageDescription_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynMessageDestroy_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynMessageEql_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynMessageGetarg_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynMessageGetargs_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynMessageGetauthmechanism_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynMessageGetcallserial_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynMessageGetcompressiontoken_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynMessageGetdestination_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynMessageGeterrorname_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynMessageGetflags_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynMessageGetinterface_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynMessageGetmembername_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynMessageGetobjectpath_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynMessageGetreceiveendpointname_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynMessageGetreplyserial_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynMessageGetsender_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynMessageGetsessionid_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynMessageGetsignature_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynMessageGettimestamp_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynMessageGettype_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynMessageIsbroadcastsignal_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynMessageIsencrypted_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynMessageIsexpired_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynMessageIsglobalbroadcast_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynMessageIssessionless_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynMessageIsunreliable_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynMessageParseargs_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t msg = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* signature = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t km_vac = km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0;
    int64_t km_va0 = km_info.Length() > 3 ? km_napi_arg_i64(km_info[3]) : 0;
    int64_t km_va1 = km_info.Length() > 4 ? km_napi_arg_i64(km_info[4]) : 0;
    int64_t km_va2 = km_info.Length() > 5 ? km_napi_arg_i64(km_info[5]) : 0;
    int64_t km_va3 = km_info.Length() > 6 ? km_napi_arg_i64(km_info[6]) : 0;
#ifdef _WIN32
    typedef int32_t (*km_fn_t)(int64_t, void*, ...);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_message_parseargs")));
    }
    int32_t km_res = -1;
    if (km_fn_ptr != nullptr) {
        switch (km_vac) {
            case 0: km_res = km_fn_ptr(msg, signature); break;
            case 1: km_res = km_fn_ptr(msg, signature, static_cast<intptr_t>(km_va0)); break;
            case 2: km_res = km_fn_ptr(msg, signature, static_cast<intptr_t>(km_va0), static_cast<intptr_t>(km_va1)); break;
            case 3: km_res = km_fn_ptr(msg, signature, static_cast<intptr_t>(km_va0), static_cast<intptr_t>(km_va1), static_cast<intptr_t>(km_va2)); break;
            default: km_res = km_fn_ptr(msg, signature, static_cast<intptr_t>(km_va0), static_cast<intptr_t>(km_va1), static_cast<intptr_t>(km_va2), static_cast<intptr_t>(km_va3)); break;
        }
    }
#else
    (void)msg;
    (void)signature;
    (void)km_vac; (void)km_va0; (void)km_va1; (void)km_va2; (void)km_va3;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynMessageSetendianess_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynMessageTostring_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynMsgargArrayCreate_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynMsgargArrayElement_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynMsgargArrayGet_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t args = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint64_t numargs = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* signature = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int32_t km_vac = km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0;
    int64_t km_va0 = km_info.Length() > 4 ? km_napi_arg_i64(km_info[4]) : 0;
    int64_t km_va1 = km_info.Length() > 5 ? km_napi_arg_i64(km_info[5]) : 0;
    int64_t km_va2 = km_info.Length() > 6 ? km_napi_arg_i64(km_info[6]) : 0;
    int64_t km_va3 = km_info.Length() > 7 ? km_napi_arg_i64(km_info[7]) : 0;
#ifdef _WIN32
    typedef int32_t (*km_fn_t)(int64_t, uint64_t, void*, ...);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_msgarg_array_get")));
    }
    int32_t km_res = -1;
    if (km_fn_ptr != nullptr) {
        switch (km_vac) {
            case 0: km_res = km_fn_ptr(args, numargs, signature); break;
            case 1: km_res = km_fn_ptr(args, numargs, signature, static_cast<intptr_t>(km_va0)); break;
            case 2: km_res = km_fn_ptr(args, numargs, signature, static_cast<intptr_t>(km_va0), static_cast<intptr_t>(km_va1)); break;
            case 3: km_res = km_fn_ptr(args, numargs, signature, static_cast<intptr_t>(km_va0), static_cast<intptr_t>(km_va1), static_cast<intptr_t>(km_va2)); break;
            default: km_res = km_fn_ptr(args, numargs, signature, static_cast<intptr_t>(km_va0), static_cast<intptr_t>(km_va1), static_cast<intptr_t>(km_va2), static_cast<intptr_t>(km_va3)); break;
        }
    }
#else
    (void)args;
    (void)numargs;
    (void)signature;
    (void)km_vac; (void)km_va0; (void)km_va1; (void)km_va2; (void)km_va3;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynMsgargArraySet_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t args = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* numargs = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* signature = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int32_t km_vac = km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0;
    int64_t km_va0 = km_info.Length() > 4 ? km_napi_arg_i64(km_info[4]) : 0;
    int64_t km_va1 = km_info.Length() > 5 ? km_napi_arg_i64(km_info[5]) : 0;
    int64_t km_va2 = km_info.Length() > 6 ? km_napi_arg_i64(km_info[6]) : 0;
    int64_t km_va3 = km_info.Length() > 7 ? km_napi_arg_i64(km_info[7]) : 0;
#ifdef _WIN32
    typedef int32_t (*km_fn_t)(int64_t, void*, void*, ...);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_msgarg_array_set")));
    }
    int32_t km_res = -1;
    if (km_fn_ptr != nullptr) {
        switch (km_vac) {
            case 0: km_res = km_fn_ptr(args, numargs, signature); break;
            case 1: km_res = km_fn_ptr(args, numargs, signature, static_cast<intptr_t>(km_va0)); break;
            case 2: km_res = km_fn_ptr(args, numargs, signature, static_cast<intptr_t>(km_va0), static_cast<intptr_t>(km_va1)); break;
            case 3: km_res = km_fn_ptr(args, numargs, signature, static_cast<intptr_t>(km_va0), static_cast<intptr_t>(km_va1), static_cast<intptr_t>(km_va2)); break;
            default: km_res = km_fn_ptr(args, numargs, signature, static_cast<intptr_t>(km_va0), static_cast<intptr_t>(km_va1), static_cast<intptr_t>(km_va2), static_cast<intptr_t>(km_va3)); break;
        }
    }
#else
    (void)args;
    (void)numargs;
    (void)signature;
    (void)km_vac; (void)km_va0; (void)km_va1; (void)km_va2; (void)km_va3;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynMsgargArraySetOffset_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t args = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint64_t argoffset = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* numargs = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* signature = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    int32_t km_vac = km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0;
    int64_t km_va0 = km_info.Length() > 5 ? km_napi_arg_i64(km_info[5]) : 0;
    int64_t km_va1 = km_info.Length() > 6 ? km_napi_arg_i64(km_info[6]) : 0;
    int64_t km_va2 = km_info.Length() > 7 ? km_napi_arg_i64(km_info[7]) : 0;
    int64_t km_va3 = km_info.Length() > 8 ? km_napi_arg_i64(km_info[8]) : 0;
#ifdef _WIN32
    typedef int32_t (*km_fn_t)(int64_t, uint64_t, void*, void*, ...);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_msgarg_array_set_offset")));
    }
    int32_t km_res = -1;
    if (km_fn_ptr != nullptr) {
        switch (km_vac) {
            case 0: km_res = km_fn_ptr(args, argoffset, numargs, signature); break;
            case 1: km_res = km_fn_ptr(args, argoffset, numargs, signature, static_cast<intptr_t>(km_va0)); break;
            case 2: km_res = km_fn_ptr(args, argoffset, numargs, signature, static_cast<intptr_t>(km_va0), static_cast<intptr_t>(km_va1)); break;
            case 3: km_res = km_fn_ptr(args, argoffset, numargs, signature, static_cast<intptr_t>(km_va0), static_cast<intptr_t>(km_va1), static_cast<intptr_t>(km_va2)); break;
            default: km_res = km_fn_ptr(args, argoffset, numargs, signature, static_cast<intptr_t>(km_va0), static_cast<intptr_t>(km_va1), static_cast<intptr_t>(km_va2), static_cast<intptr_t>(km_va3)); break;
        }
    }
#else
    (void)args;
    (void)argoffset;
    (void)numargs;
    (void)signature;
    (void)km_vac; (void)km_va0; (void)km_va1; (void)km_va2; (void)km_va3;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynMsgargArraySignature_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynMsgargArrayTostring_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynMsgargClear_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynMsgargClone_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynMsgargCopy_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynMsgargCreate_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynMsgargCreateAndSet_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* signature = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t km_vac = km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0;
    int64_t km_va0 = km_info.Length() > 2 ? km_napi_arg_i64(km_info[2]) : 0;
    int64_t km_va1 = km_info.Length() > 3 ? km_napi_arg_i64(km_info[3]) : 0;
    int64_t km_va2 = km_info.Length() > 4 ? km_napi_arg_i64(km_info[4]) : 0;
    int64_t km_va3 = km_info.Length() > 5 ? km_napi_arg_i64(km_info[5]) : 0;
#ifdef _WIN32
    typedef int64_t (*km_fn_t)(void*, ...);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_msgarg_create_and_set")));
    }
    int64_t km_res = -1;
    if (km_fn_ptr != nullptr) {
        switch (km_vac) {
            case 0: km_res = km_fn_ptr(signature); break;
            case 1: km_res = km_fn_ptr(signature, static_cast<intptr_t>(km_va0)); break;
            case 2: km_res = km_fn_ptr(signature, static_cast<intptr_t>(km_va0), static_cast<intptr_t>(km_va1)); break;
            case 3: km_res = km_fn_ptr(signature, static_cast<intptr_t>(km_va0), static_cast<intptr_t>(km_va1), static_cast<intptr_t>(km_va2)); break;
            default: km_res = km_fn_ptr(signature, static_cast<intptr_t>(km_va0), static_cast<intptr_t>(km_va1), static_cast<intptr_t>(km_va2), static_cast<intptr_t>(km_va3)); break;
        }
    }
#else
    (void)signature;
    (void)km_vac; (void)km_va0; (void)km_va1; (void)km_va2; (void)km_va3;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynMsgargDestroy_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynMsgargEqual_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynMsgargGet_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t arg = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* signature = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t km_vac = km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0;
    int64_t km_va0 = km_info.Length() > 3 ? km_napi_arg_i64(km_info[3]) : 0;
    int64_t km_va1 = km_info.Length() > 4 ? km_napi_arg_i64(km_info[4]) : 0;
    int64_t km_va2 = km_info.Length() > 5 ? km_napi_arg_i64(km_info[5]) : 0;
    int64_t km_va3 = km_info.Length() > 6 ? km_napi_arg_i64(km_info[6]) : 0;
#ifdef _WIN32
    typedef int32_t (*km_fn_t)(int64_t, void*, ...);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_msgarg_get")));
    }
    int32_t km_res = -1;
    if (km_fn_ptr != nullptr) {
        switch (km_vac) {
            case 0: km_res = km_fn_ptr(arg, signature); break;
            case 1: km_res = km_fn_ptr(arg, signature, static_cast<intptr_t>(km_va0)); break;
            case 2: km_res = km_fn_ptr(arg, signature, static_cast<intptr_t>(km_va0), static_cast<intptr_t>(km_va1)); break;
            case 3: km_res = km_fn_ptr(arg, signature, static_cast<intptr_t>(km_va0), static_cast<intptr_t>(km_va1), static_cast<intptr_t>(km_va2)); break;
            default: km_res = km_fn_ptr(arg, signature, static_cast<intptr_t>(km_va0), static_cast<intptr_t>(km_va1), static_cast<intptr_t>(km_va2), static_cast<intptr_t>(km_va3)); break;
        }
    }
#else
    (void)arg;
    (void)signature;
    (void)km_vac; (void)km_va0; (void)km_va1; (void)km_va2; (void)km_va3;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetArrayElement_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetArrayElementsignature_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetArrayNumberofelements_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetBool_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetBoolArray_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetDouble_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetDoubleArray_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetInt16_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetInt16Array_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetInt32_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetInt32Array_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetInt64_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetInt64Array_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetObjectpath_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetSignature_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetString_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetUint16_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetUint16Array_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetUint32_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetUint32Array_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetUint64_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetUint64Array_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetUint8_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetUint8Array_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetVariant_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetVariantArray_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetdictelement_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t arg = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* elemsig = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t km_vac = km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0;
    int64_t km_va0 = km_info.Length() > 3 ? km_napi_arg_i64(km_info[3]) : 0;
    int64_t km_va1 = km_info.Length() > 4 ? km_napi_arg_i64(km_info[4]) : 0;
    int64_t km_va2 = km_info.Length() > 5 ? km_napi_arg_i64(km_info[5]) : 0;
    int64_t km_va3 = km_info.Length() > 6 ? km_napi_arg_i64(km_info[6]) : 0;
#ifdef _WIN32
    typedef int32_t (*km_fn_t)(int64_t, void*, ...);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_msgarg_getdictelement")));
    }
    int32_t km_res = -1;
    if (km_fn_ptr != nullptr) {
        switch (km_vac) {
            case 0: km_res = km_fn_ptr(arg, elemsig); break;
            case 1: km_res = km_fn_ptr(arg, elemsig, static_cast<intptr_t>(km_va0)); break;
            case 2: km_res = km_fn_ptr(arg, elemsig, static_cast<intptr_t>(km_va0), static_cast<intptr_t>(km_va1)); break;
            case 3: km_res = km_fn_ptr(arg, elemsig, static_cast<intptr_t>(km_va0), static_cast<intptr_t>(km_va1), static_cast<intptr_t>(km_va2)); break;
            default: km_res = km_fn_ptr(arg, elemsig, static_cast<intptr_t>(km_va0), static_cast<intptr_t>(km_va1), static_cast<intptr_t>(km_va2), static_cast<intptr_t>(km_va3)); break;
        }
    }
#else
    (void)arg;
    (void)elemsig;
    (void)km_vac; (void)km_va0; (void)km_va1; (void)km_va2; (void)km_va3;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetkey_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetmember_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetnummembers_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynMsgargGettype_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetvalue_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynMsgargHassignature_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynMsgargSet_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t arg = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* signature = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t km_vac = km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0;
    int64_t km_va0 = km_info.Length() > 3 ? km_napi_arg_i64(km_info[3]) : 0;
    int64_t km_va1 = km_info.Length() > 4 ? km_napi_arg_i64(km_info[4]) : 0;
    int64_t km_va2 = km_info.Length() > 5 ? km_napi_arg_i64(km_info[5]) : 0;
    int64_t km_va3 = km_info.Length() > 6 ? km_napi_arg_i64(km_info[6]) : 0;
#ifdef _WIN32
    typedef int32_t (*km_fn_t)(int64_t, void*, ...);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_msgarg_set")));
    }
    int32_t km_res = -1;
    if (km_fn_ptr != nullptr) {
        switch (km_vac) {
            case 0: km_res = km_fn_ptr(arg, signature); break;
            case 1: km_res = km_fn_ptr(arg, signature, static_cast<intptr_t>(km_va0)); break;
            case 2: km_res = km_fn_ptr(arg, signature, static_cast<intptr_t>(km_va0), static_cast<intptr_t>(km_va1)); break;
            case 3: km_res = km_fn_ptr(arg, signature, static_cast<intptr_t>(km_va0), static_cast<intptr_t>(km_va1), static_cast<intptr_t>(km_va2)); break;
            default: km_res = km_fn_ptr(arg, signature, static_cast<intptr_t>(km_va0), static_cast<intptr_t>(km_va1), static_cast<intptr_t>(km_va2), static_cast<intptr_t>(km_va3)); break;
        }
    }
#else
    (void)arg;
    (void)signature;
    (void)km_vac; (void)km_va0; (void)km_va1; (void)km_va2; (void)km_va3;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetAndStabilize_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t arg = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* signature = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t km_vac = km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0;
    int64_t km_va0 = km_info.Length() > 3 ? km_napi_arg_i64(km_info[3]) : 0;
    int64_t km_va1 = km_info.Length() > 4 ? km_napi_arg_i64(km_info[4]) : 0;
    int64_t km_va2 = km_info.Length() > 5 ? km_napi_arg_i64(km_info[5]) : 0;
    int64_t km_va3 = km_info.Length() > 6 ? km_napi_arg_i64(km_info[6]) : 0;
#ifdef _WIN32
    typedef int32_t (*km_fn_t)(int64_t, void*, ...);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_msgarg_set_and_stabilize")));
    }
    int32_t km_res = -1;
    if (km_fn_ptr != nullptr) {
        switch (km_vac) {
            case 0: km_res = km_fn_ptr(arg, signature); break;
            case 1: km_res = km_fn_ptr(arg, signature, static_cast<intptr_t>(km_va0)); break;
            case 2: km_res = km_fn_ptr(arg, signature, static_cast<intptr_t>(km_va0), static_cast<intptr_t>(km_va1)); break;
            case 3: km_res = km_fn_ptr(arg, signature, static_cast<intptr_t>(km_va0), static_cast<intptr_t>(km_va1), static_cast<intptr_t>(km_va2)); break;
            default: km_res = km_fn_ptr(arg, signature, static_cast<intptr_t>(km_va0), static_cast<intptr_t>(km_va1), static_cast<intptr_t>(km_va2), static_cast<intptr_t>(km_va3)); break;
        }
    }
#else
    (void)arg;
    (void)signature;
    (void)km_vac; (void)km_va0; (void)km_va1; (void)km_va2; (void)km_va3;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetBool_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetBoolArray_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetDouble_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetDoubleArray_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetInt16_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetInt16Array_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetInt32_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetInt32Array_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetInt64_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetInt64Array_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetObjectpath_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetObjectpathArray_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetSignature_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetSignatureArray_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetString_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetStringArray_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetUint16_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetUint16Array_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetUint32_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetUint32Array_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetUint64_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetUint64Array_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetUint8_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetUint8Array_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetdictentry_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetstruct_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynMsgargSignature_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynMsgargStabilize_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynMsgargTostring_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynObserverCreate_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t bus = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* mandatoryinterfaces = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint64_t nummandatoryinterfaces = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_observer_create")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(bus, mandatoryinterfaces, nummandatoryinterfaces) : -1;
#else
    (void)bus;
    (void)mandatoryinterfaces;
    (void)nummandatoryinterfaces;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynObserverDestroy_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynObserverGet_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynObserverGetfirst_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynObserverGetnext_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynObserverRegisterlistener_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynObserverUnregisteralllisteners_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynObserverUnregisterlistener_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynObserverlistenerCreate_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* callback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* context = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_observerlistener_create")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(callback, context) : -1;
#else
    (void)callback;
    (void)context;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynObserverlistenerDestroy_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynPasswordmanagerSetcredentials_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfigurationlistenerCreate_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* callbacks = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* context = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_permissionconfigurationlistener_create")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(callbacks, context) : -1;
#else
    (void)callbacks;
    (void)context;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfigurationlistenerDestroy_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorCertificatechainDestroy_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorCertificateidCleanup_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorCertificateidarrayCleanup_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorClaim_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorEndmanagement_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorGetapplicationstate_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorGetclaimcapabilities_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorGetclaimcapabilitiesadditionalinfo_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorGetdefaultclaimcapabilities_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorGetdefaultpolicy_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorGetidentity_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorGetidentitycertificateid_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorGetmanifests_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorGetmanifesttemplate_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorGetmembershipsummaries_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorGetpolicy_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorGetpublickey_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorInstallmanifests_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorInstallmembership_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorManifestarrayCleanup_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorManifesttemplateDestroy_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorPolicyDestroy_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorPublickeyDestroy_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorRemovemembership_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorReset_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorResetpolicy_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorSetapplicationstate_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorSetclaimcapabilities_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorSetclaimcapabilitiesadditionalinfo_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorSetmanifesttemplatefromxml_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorStartmanagement_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorUpdateidentity_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorUpdatepolicy_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynPinglistenerCreate_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* callback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* context = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_pinglistener_create")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(callback, context) : -1;
#else
    (void)callback;
    (void)context;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynPinglistenerDestroy_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectAddchild_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectAddinterface_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectAddinterfaceByName_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectCopy_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectCreate_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectCreateSecure_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectDestroy_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectEnablepropertycaching_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectGetallproperties_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectGetallpropertiesasync_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectGetchild_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectGetchildren_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectGetinterface_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t proxyobj = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* iface = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_proxybusobject_getinterface")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(proxyobj, iface) : -1;
#else
    (void)proxyobj;
    (void)iface;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectGetinterfaces_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectGetpath_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectGetproperty_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectGetpropertyasync_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectGetservicename_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectGetsessionid_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectGetuniquename_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectImplementsinterface_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectIntrospectremoteobject_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectIntrospectremoteobjectasync_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectIssecure_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectIsvalid_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectMethodcall_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectMethodcallNoreply_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectMethodcallasync_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectParsexml_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectRefCreate_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectRefDecref_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectRefGet_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectRefIncref_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectRegisterpropertieschangedlistener_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectRemovechild_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectSecureconnection_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectSecureconnectionasync_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectSetproperty_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectSetpropertyasync_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectUnregisterpropertieschangedlistener_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynRouterinit_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynRouterinitwithconfig_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynRoutershutdown_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyClaim_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyComputemanifestdigest_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyCreate_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t bus = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* appbusname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t sessionid = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_securityapplicationproxy_create")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(bus, appbusname, sessionid) : -1;
#else
    (void)bus;
    (void)appbusname;
    (void)sessionid;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyDestroy_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyDigestDestroy_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyEccpublickeyDestroy_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyEndmanagement_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyGetapplicationstate_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyGetclaimcapabilities_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyGetclaimcapabilitiesadditionalinfo_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyGetdefaultpolicy_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyGeteccpublickey_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyGetmanifesttemplate_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyGetpermissionmanagementsessionport_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyGetpolicy_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyInstallmembership_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyManifestDestroy_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyManifesttemplateDestroy_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyPolicyDestroy_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyReset_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyResetpolicy_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxySetmanifestsignature_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxySignmanifest_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyStartmanagement_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyUpdateidentity_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyUpdatepolicy_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynSessionlistenerCreate_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* callbacks = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* context = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_sessionlistener_create")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(callbacks, context) : -1;
#else
    (void)callbacks;
    (void)context;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynSessionlistenerDestroy_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynSessionoptsCmp_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynSessionoptsCreate_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynSessionoptsDestroy_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynSessionoptsGetMultipoint_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynSessionoptsGetProximity_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynSessionoptsGetTraffic_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynSessionoptsGetTransports_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynSessionoptsIscompatible_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynSessionoptsSetMultipoint_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynSessionoptsSetProximity_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynSessionoptsSetTraffic_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynSessionoptsSetTransports_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynSessionportlistenerCreate_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* callbacks = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* context = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_sessionportlistener_create")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(callbacks, context) : -1;
#else
    (void)callbacks;
    (void)context;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynSessionportlistenerDestroy_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynShutdown_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynUnityDeferredCallbacksProcess_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_devices_alljoyn_alljoynUnitySetDeferredCallbackMainthreadOnly_napi(const Napi::CallbackInfo& km_info) {
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
    exports.Set("windowssys_windows_win32_devices_alljoyn_allJoynAcceptBusConnection", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_allJoynAcceptBusConnection_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_allJoynCloseBusHandle", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_allJoynCloseBusHandle_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_allJoynConnectToBus", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_allJoynConnectToBus_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_allJoynCreateBus", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_allJoynCreateBus_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_allJoynEnumEvents", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_allJoynEnumEvents_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_allJoynEventSelect", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_allJoynEventSelect_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_allJoynReceiveFromBus", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_allJoynReceiveFromBus_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_allJoynSendToBus", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_allJoynSendToBus_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_qccStatusText", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_qccStatusText_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynAboutdataCreate", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynAboutdataCreate_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynAboutdataCreateEmpty", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynAboutdataCreateEmpty_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynAboutdataCreateFull", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynAboutdataCreateFull_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynAboutdataCreatefrommsgarg", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynAboutdataCreatefrommsgarg_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynAboutdataCreatefromxml", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynAboutdataCreatefromxml_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynAboutdataDestroy", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynAboutdataDestroy_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetaboutdata", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetaboutdata_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetajsoftwareversion", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetajsoftwareversion_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetannouncedaboutdata", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetannouncedaboutdata_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetappid", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetappid_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetappname", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetappname_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetdateofmanufacture", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetdateofmanufacture_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetdefaultlanguage", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetdefaultlanguage_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetdescription", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetdescription_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetdeviceid", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetdeviceid_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetdevicename", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetdevicename_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetfield", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetfield_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetfields", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetfields_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetfieldsignature", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetfieldsignature_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGethardwareversion", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGethardwareversion_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetmanufacturer", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetmanufacturer_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetmodelnumber", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetmodelnumber_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetsoftwareversion", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetsoftwareversion_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetsupportedlanguages", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetsupportedlanguages_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetsupporturl", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetsupporturl_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynAboutdataIsfieldannounced", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynAboutdataIsfieldannounced_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynAboutdataIsfieldlocalized", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynAboutdataIsfieldlocalized_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynAboutdataIsfieldrequired", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynAboutdataIsfieldrequired_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynAboutdataIsvalid", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynAboutdataIsvalid_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynAboutdataSetappid", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynAboutdataSetappid_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynAboutdataSetappidFromstring", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynAboutdataSetappidFromstring_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynAboutdataSetappname", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynAboutdataSetappname_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynAboutdataSetdateofmanufacture", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynAboutdataSetdateofmanufacture_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynAboutdataSetdefaultlanguage", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynAboutdataSetdefaultlanguage_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynAboutdataSetdescription", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynAboutdataSetdescription_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynAboutdataSetdeviceid", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynAboutdataSetdeviceid_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynAboutdataSetdevicename", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynAboutdataSetdevicename_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynAboutdataSetfield", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynAboutdataSetfield_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynAboutdataSethardwareversion", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynAboutdataSethardwareversion_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynAboutdataSetmanufacturer", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynAboutdataSetmanufacturer_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynAboutdataSetmodelnumber", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynAboutdataSetmodelnumber_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynAboutdataSetsoftwareversion", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynAboutdataSetsoftwareversion_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynAboutdataSetsupportedlanguage", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynAboutdataSetsupportedlanguage_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynAboutdataSetsupporturl", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynAboutdataSetsupporturl_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynAboutdatalistenerCreate", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynAboutdatalistenerCreate_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynAboutdatalistenerDestroy", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynAboutdatalistenerDestroy_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynAbouticonClear", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynAbouticonClear_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynAbouticonCreate", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynAbouticonCreate_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynAbouticonDestroy", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynAbouticonDestroy_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynAbouticonGetcontent", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynAbouticonGetcontent_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynAbouticonGeturl", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynAbouticonGeturl_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynAbouticonSetcontent", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynAbouticonSetcontent_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynAbouticonSetcontentFrommsgarg", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynAbouticonSetcontentFrommsgarg_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynAbouticonSeturl", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynAbouticonSeturl_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynAbouticonobjCreate", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynAbouticonobjCreate_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynAbouticonobjDestroy", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynAbouticonobjDestroy_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynAbouticonproxyCreate", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynAbouticonproxyCreate_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynAbouticonproxyDestroy", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynAbouticonproxyDestroy_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynAbouticonproxyGeticon", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynAbouticonproxyGeticon_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynAbouticonproxyGetversion", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynAbouticonproxyGetversion_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynAboutlistenerCreate", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynAboutlistenerCreate_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynAboutlistenerDestroy", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynAboutlistenerDestroy_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynAboutobjAnnounce", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynAboutobjAnnounce_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynAboutobjAnnounceUsingDatalistener", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynAboutobjAnnounceUsingDatalistener_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynAboutobjCreate", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynAboutobjCreate_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynAboutobjDestroy", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynAboutobjDestroy_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynAboutobjUnannounce", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynAboutobjUnannounce_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynAboutobjectdescriptionClear", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynAboutobjectdescriptionClear_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynAboutobjectdescriptionCreate", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynAboutobjectdescriptionCreate_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynAboutobjectdescriptionCreateFull", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynAboutobjectdescriptionCreateFull_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynAboutobjectdescriptionCreatefrommsgarg", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynAboutobjectdescriptionCreatefrommsgarg_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynAboutobjectdescriptionDestroy", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynAboutobjectdescriptionDestroy_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynAboutobjectdescriptionGetinterfacepaths", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynAboutobjectdescriptionGetinterfacepaths_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynAboutobjectdescriptionGetinterfaces", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynAboutobjectdescriptionGetinterfaces_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynAboutobjectdescriptionGetmsgarg", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynAboutobjectdescriptionGetmsgarg_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynAboutobjectdescriptionGetpaths", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynAboutobjectdescriptionGetpaths_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynAboutobjectdescriptionHasinterface", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynAboutobjectdescriptionHasinterface_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynAboutobjectdescriptionHasinterfaceatpath", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynAboutobjectdescriptionHasinterfaceatpath_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynAboutobjectdescriptionHaspath", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynAboutobjectdescriptionHaspath_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynAboutproxyCreate", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynAboutproxyCreate_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynAboutproxyDestroy", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynAboutproxyDestroy_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynAboutproxyGetaboutdata", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynAboutproxyGetaboutdata_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynAboutproxyGetobjectdescription", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynAboutproxyGetobjectdescription_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynAboutproxyGetversion", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynAboutproxyGetversion_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynApplicationstatelistenerCreate", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynApplicationstatelistenerCreate_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynApplicationstatelistenerDestroy", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynApplicationstatelistenerDestroy_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynAuthlistenerCreate", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynAuthlistenerCreate_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynAuthlistenerDestroy", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynAuthlistenerDestroy_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynAuthlistenerRequestcredentialsresponse", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynAuthlistenerRequestcredentialsresponse_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynAuthlistenerSetsharedsecret", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynAuthlistenerSetsharedsecret_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynAuthlistenerVerifycredentialsresponse", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynAuthlistenerVerifycredentialsresponse_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynAuthlistenerasyncCreate", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynAuthlistenerasyncCreate_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynAuthlistenerasyncDestroy", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynAuthlistenerasyncDestroy_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynAutopingerAdddestination", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynAutopingerAdddestination_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynAutopingerAddpinggroup", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynAutopingerAddpinggroup_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynAutopingerCreate", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynAutopingerCreate_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynAutopingerDestroy", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynAutopingerDestroy_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynAutopingerPause", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynAutopingerPause_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynAutopingerRemovedestination", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynAutopingerRemovedestination_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynAutopingerRemovepinggroup", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynAutopingerRemovepinggroup_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynAutopingerResume", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynAutopingerResume_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynAutopingerSetpinginterval", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynAutopingerSetpinginterval_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentAddlogonentry", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentAddlogonentry_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentAddmatch", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentAddmatch_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentAdvertisename", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentAdvertisename_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentBindsessionport", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentBindsessionport_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentCanceladvertisename", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentCanceladvertisename_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentCancelfindadvertisedname", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentCancelfindadvertisedname_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentCancelfindadvertisednamebytransport", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentCancelfindadvertisednamebytransport_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentCancelwhoimplementsInterface", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentCancelwhoimplementsInterface_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentCancelwhoimplementsInterfaces", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentCancelwhoimplementsInterfaces_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentClearkeys", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentClearkeys_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentClearkeystore", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentClearkeystore_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentConnect", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentConnect_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentCreate", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentCreate_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentCreateConcurrency", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentCreateConcurrency_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentCreateinterface", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentCreateinterface_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentCreateinterfaceSecure", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentCreateinterfaceSecure_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentCreateinterfacesfromxml", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentCreateinterfacesfromxml_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentDeletedefaultkeystore", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentDeletedefaultkeystore_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentDeleteinterface", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentDeleteinterface_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentDestroy", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentDestroy_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentDisconnect", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentDisconnect_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentEnableconcurrentcallbacks", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentEnableconcurrentcallbacks_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentEnablepeersecurity", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentEnablepeersecurity_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentEnablepeersecuritywithpermissionconfigurationlistener", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentEnablepeersecuritywithpermissionconfigurationlistener_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentFindadvertisedname", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentFindadvertisedname_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentFindadvertisednamebytransport", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentFindadvertisednamebytransport_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentGetalljoyndebugobj", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentGetalljoyndebugobj_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentGetalljoynproxyobj", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentGetalljoynproxyobj_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentGetconcurrency", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentGetconcurrency_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentGetconnectspec", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentGetconnectspec_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentGetdbusproxyobj", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentGetdbusproxyobj_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentGetglobalguidstring", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentGetglobalguidstring_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentGetinterface", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentGetinterface_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentGetinterfaces", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentGetinterfaces_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentGetkeyexpiration", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentGetkeyexpiration_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentGetpeerguid", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentGetpeerguid_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentGetpermissionconfigurator", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentGetpermissionconfigurator_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentGettimestamp", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentGettimestamp_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentGetuniquename", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentGetuniquename_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentIsconnected", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentIsconnected_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentIspeersecurityenabled", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentIspeersecurityenabled_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentIsstarted", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentIsstarted_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentIsstopping", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentIsstopping_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentJoin", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentJoin_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentJoinsession", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentJoinsession_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentJoinsessionasync", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentJoinsessionasync_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentLeavesession", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentLeavesession_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentNamehasowner", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentNamehasowner_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentPing", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentPing_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentRegisteraboutlistener", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentRegisteraboutlistener_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentRegisterapplicationstatelistener", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentRegisterapplicationstatelistener_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentRegisterbuslistener", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentRegisterbuslistener_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentRegisterbusobject", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentRegisterbusobject_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentRegisterbusobjectSecure", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentRegisterbusobjectSecure_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentRegisterkeystorelistener", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentRegisterkeystorelistener_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentReleasename", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentReleasename_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentReloadkeystore", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentReloadkeystore_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentRemovematch", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentRemovematch_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentRemovesessionmember", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentRemovesessionmember_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentRequestname", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentRequestname_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentSecureconnection", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentSecureconnection_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentSecureconnectionasync", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentSecureconnectionasync_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentSetdaemondebug", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentSetdaemondebug_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentSetkeyexpiration", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentSetkeyexpiration_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentSetlinktimeout", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentSetlinktimeout_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentSetlinktimeoutasync", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentSetlinktimeoutasync_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentSetsessionlistener", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentSetsessionlistener_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentStart", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentStart_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentStop", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentStop_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentUnbindsessionport", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentUnbindsessionport_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentUnregisteraboutlistener", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentUnregisteraboutlistener_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentUnregisterallaboutlisteners", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentUnregisterallaboutlisteners_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentUnregisterallhandlers", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentUnregisterallhandlers_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentUnregisterapplicationstatelistener", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentUnregisterapplicationstatelistener_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentUnregisterbuslistener", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentUnregisterbuslistener_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentUnregisterbusobject", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentUnregisterbusobject_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentWhoimplementsInterface", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentWhoimplementsInterface_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentWhoimplementsInterfaces", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentWhoimplementsInterfaces_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynBuslistenerCreate", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynBuslistenerCreate_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynBuslistenerDestroy", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynBuslistenerDestroy_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynBusobjectAddinterface", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynBusobjectAddinterface_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynBusobjectAddinterfaceAnnounced", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynBusobjectAddinterfaceAnnounced_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynBusobjectAddmethodhandlers", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynBusobjectAddmethodhandlers_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynBusobjectCancelsessionlessmessage", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynBusobjectCancelsessionlessmessage_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynBusobjectCancelsessionlessmessageSerial", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynBusobjectCancelsessionlessmessageSerial_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynBusobjectCreate", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynBusobjectCreate_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynBusobjectDestroy", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynBusobjectDestroy_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynBusobjectEmitpropertieschanged", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynBusobjectEmitpropertieschanged_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynBusobjectEmitpropertychanged", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynBusobjectEmitpropertychanged_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynBusobjectGetannouncedinterfacenames", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynBusobjectGetannouncedinterfacenames_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynBusobjectGetbusattachment", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynBusobjectGetbusattachment_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynBusobjectGetname", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynBusobjectGetname_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynBusobjectGetpath", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynBusobjectGetpath_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynBusobjectIssecure", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynBusobjectIssecure_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynBusobjectMethodreplyArgs", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynBusobjectMethodreplyArgs_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynBusobjectMethodreplyErr", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynBusobjectMethodreplyErr_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynBusobjectMethodreplyStatus", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynBusobjectMethodreplyStatus_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynBusobjectSetannounceflag", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynBusobjectSetannounceflag_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynCredentialsClear", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynCredentialsClear_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynCredentialsCreate", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynCredentialsCreate_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynCredentialsDestroy", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynCredentialsDestroy_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynCredentialsGetcertchain", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynCredentialsGetcertchain_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynCredentialsGetexpiration", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynCredentialsGetexpiration_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynCredentialsGetlogonentry", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynCredentialsGetlogonentry_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynCredentialsGetpassword", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynCredentialsGetpassword_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynCredentialsGetprivateKey", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynCredentialsGetprivateKey_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynCredentialsGetusername", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynCredentialsGetusername_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynCredentialsIsset", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynCredentialsIsset_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynCredentialsSetcertchain", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynCredentialsSetcertchain_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynCredentialsSetexpiration", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynCredentialsSetexpiration_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynCredentialsSetlogonentry", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynCredentialsSetlogonentry_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynCredentialsSetpassword", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynCredentialsSetpassword_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynCredentialsSetprivatekey", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynCredentialsSetprivatekey_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynCredentialsSetusername", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynCredentialsSetusername_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynGetbuildinfo", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynGetbuildinfo_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynGetnumericversion", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynGetnumericversion_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynGetversion", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynGetversion_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynInit", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynInit_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionActivate", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionActivate_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionAddannotation", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionAddannotation_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionAddargannotation", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionAddargannotation_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionAddmember", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionAddmember_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionAddmemberannotation", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionAddmemberannotation_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionAddmethod", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionAddmethod_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionAddproperty", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionAddproperty_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionAddpropertyannotation", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionAddpropertyannotation_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionAddsignal", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionAddsignal_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionEql", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionEql_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetannotation", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetannotation_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetannotationatindex", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetannotationatindex_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetannotationscount", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetannotationscount_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetargdescriptionforlanguage", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetargdescriptionforlanguage_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetdescriptionforlanguage", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetdescriptionforlanguage_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetdescriptionlanguages", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetdescriptionlanguages_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetdescriptionlanguages2", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetdescriptionlanguages2_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetdescriptiontranslationcallback", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetdescriptiontranslationcallback_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetmember", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetmember_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetmemberannotation", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetmemberannotation_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetmemberargannotation", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetmemberargannotation_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetmemberdescriptionforlanguage", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetmemberdescriptionforlanguage_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetmembers", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetmembers_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetmethod", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetmethod_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetname", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetname_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetproperties", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetproperties_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetproperty", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetproperty_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetpropertyannotation", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetpropertyannotation_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetpropertydescriptionforlanguage", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetpropertydescriptionforlanguage_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetsecuritypolicy", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetsecuritypolicy_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetsignal", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetsignal_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionHasdescription", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionHasdescription_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionHasmember", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionHasmember_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionHasproperties", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionHasproperties_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionHasproperty", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionHasproperty_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionIntrospect", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionIntrospect_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionIssecure", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionIssecure_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionSetargdescription", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionSetargdescription_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionSetargdescriptionforlanguage", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionSetargdescriptionforlanguage_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionSetdescription", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionSetdescription_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionSetdescriptionforlanguage", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionSetdescriptionforlanguage_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionSetdescriptionlanguage", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionSetdescriptionlanguage_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionSetdescriptiontranslationcallback", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionSetdescriptiontranslationcallback_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionSetmemberdescription", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionSetmemberdescription_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionSetmemberdescriptionforlanguage", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionSetmemberdescriptionforlanguage_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionSetpropertydescription", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionSetpropertydescription_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionSetpropertydescriptionforlanguage", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionSetpropertydescriptionforlanguage_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynKeystorelistenerCreate", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynKeystorelistenerCreate_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynKeystorelistenerDestroy", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynKeystorelistenerDestroy_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynKeystorelistenerGetkeys", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynKeystorelistenerGetkeys_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynKeystorelistenerPutkeys", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynKeystorelistenerPutkeys_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynKeystorelistenerWithSynchronizationCreate", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynKeystorelistenerWithSynchronizationCreate_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynMessageCreate", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynMessageCreate_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynMessageDescription", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynMessageDescription_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynMessageDestroy", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynMessageDestroy_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynMessageEql", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynMessageEql_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynMessageGetarg", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynMessageGetarg_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynMessageGetargs", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynMessageGetargs_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynMessageGetauthmechanism", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynMessageGetauthmechanism_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynMessageGetcallserial", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynMessageGetcallserial_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynMessageGetcompressiontoken", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynMessageGetcompressiontoken_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynMessageGetdestination", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynMessageGetdestination_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynMessageGeterrorname", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynMessageGeterrorname_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynMessageGetflags", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynMessageGetflags_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynMessageGetinterface", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynMessageGetinterface_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynMessageGetmembername", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynMessageGetmembername_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynMessageGetobjectpath", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynMessageGetobjectpath_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynMessageGetreceiveendpointname", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynMessageGetreceiveendpointname_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynMessageGetreplyserial", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynMessageGetreplyserial_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynMessageGetsender", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynMessageGetsender_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynMessageGetsessionid", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynMessageGetsessionid_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynMessageGetsignature", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynMessageGetsignature_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynMessageGettimestamp", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynMessageGettimestamp_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynMessageGettype", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynMessageGettype_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynMessageIsbroadcastsignal", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynMessageIsbroadcastsignal_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynMessageIsencrypted", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynMessageIsencrypted_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynMessageIsexpired", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynMessageIsexpired_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynMessageIsglobalbroadcast", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynMessageIsglobalbroadcast_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynMessageIssessionless", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynMessageIssessionless_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynMessageIsunreliable", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynMessageIsunreliable_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynMessageParseargs", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynMessageParseargs_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynMessageSetendianess", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynMessageSetendianess_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynMessageTostring", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynMessageTostring_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynMsgargArrayCreate", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynMsgargArrayCreate_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynMsgargArrayElement", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynMsgargArrayElement_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynMsgargArrayGet", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynMsgargArrayGet_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynMsgargArraySet", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynMsgargArraySet_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynMsgargArraySetOffset", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynMsgargArraySetOffset_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynMsgargArraySignature", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynMsgargArraySignature_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynMsgargArrayTostring", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynMsgargArrayTostring_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynMsgargClear", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynMsgargClear_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynMsgargClone", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynMsgargClone_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynMsgargCopy", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynMsgargCopy_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynMsgargCreate", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynMsgargCreate_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynMsgargCreateAndSet", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynMsgargCreateAndSet_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynMsgargDestroy", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynMsgargDestroy_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynMsgargEqual", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynMsgargEqual_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynMsgargGet", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynMsgargGet_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetArrayElement", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetArrayElement_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetArrayElementsignature", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetArrayElementsignature_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetArrayNumberofelements", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetArrayNumberofelements_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetBool", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetBool_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetBoolArray", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetBoolArray_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetDouble", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetDouble_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetDoubleArray", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetDoubleArray_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetInt16", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetInt16_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetInt16Array", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetInt16Array_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetInt32", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetInt32_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetInt32Array", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetInt32Array_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetInt64", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetInt64_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetInt64Array", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetInt64Array_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetObjectpath", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetObjectpath_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetSignature", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetSignature_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetString", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetString_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetUint16", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetUint16_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetUint16Array", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetUint16Array_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetUint32", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetUint32_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetUint32Array", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetUint32Array_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetUint64", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetUint64_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetUint64Array", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetUint64Array_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetUint8", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetUint8_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetUint8Array", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetUint8Array_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetVariant", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetVariant_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetVariantArray", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetVariantArray_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetdictelement", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetdictelement_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetkey", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetkey_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetmember", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetmember_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetnummembers", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetnummembers_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynMsgargGettype", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynMsgargGettype_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetvalue", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetvalue_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynMsgargHassignature", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynMsgargHassignature_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynMsgargSet", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynMsgargSet_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetAndStabilize", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetAndStabilize_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetBool", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetBool_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetBoolArray", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetBoolArray_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetDouble", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetDouble_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetDoubleArray", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetDoubleArray_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetInt16", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetInt16_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetInt16Array", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetInt16Array_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetInt32", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetInt32_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetInt32Array", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetInt32Array_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetInt64", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetInt64_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetInt64Array", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetInt64Array_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetObjectpath", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetObjectpath_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetObjectpathArray", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetObjectpathArray_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetSignature", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetSignature_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetSignatureArray", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetSignatureArray_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetString", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetString_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetStringArray", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetStringArray_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetUint16", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetUint16_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetUint16Array", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetUint16Array_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetUint32", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetUint32_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetUint32Array", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetUint32Array_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetUint64", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetUint64_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetUint64Array", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetUint64Array_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetUint8", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetUint8_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetUint8Array", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetUint8Array_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetdictentry", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetdictentry_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetstruct", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetstruct_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynMsgargSignature", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynMsgargSignature_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynMsgargStabilize", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynMsgargStabilize_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynMsgargTostring", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynMsgargTostring_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynObserverCreate", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynObserverCreate_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynObserverDestroy", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynObserverDestroy_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynObserverGet", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynObserverGet_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynObserverGetfirst", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynObserverGetfirst_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynObserverGetnext", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynObserverGetnext_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynObserverRegisterlistener", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynObserverRegisterlistener_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynObserverUnregisteralllisteners", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynObserverUnregisteralllisteners_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynObserverUnregisterlistener", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynObserverUnregisterlistener_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynObserverlistenerCreate", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynObserverlistenerCreate_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynObserverlistenerDestroy", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynObserverlistenerDestroy_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynPasswordmanagerSetcredentials", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynPasswordmanagerSetcredentials_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfigurationlistenerCreate", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfigurationlistenerCreate_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfigurationlistenerDestroy", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfigurationlistenerDestroy_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorCertificatechainDestroy", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorCertificatechainDestroy_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorCertificateidCleanup", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorCertificateidCleanup_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorCertificateidarrayCleanup", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorCertificateidarrayCleanup_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorClaim", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorClaim_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorEndmanagement", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorEndmanagement_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorGetapplicationstate", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorGetapplicationstate_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorGetclaimcapabilities", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorGetclaimcapabilities_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorGetclaimcapabilitiesadditionalinfo", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorGetclaimcapabilitiesadditionalinfo_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorGetdefaultclaimcapabilities", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorGetdefaultclaimcapabilities_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorGetdefaultpolicy", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorGetdefaultpolicy_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorGetidentity", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorGetidentity_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorGetidentitycertificateid", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorGetidentitycertificateid_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorGetmanifests", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorGetmanifests_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorGetmanifesttemplate", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorGetmanifesttemplate_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorGetmembershipsummaries", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorGetmembershipsummaries_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorGetpolicy", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorGetpolicy_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorGetpublickey", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorGetpublickey_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorInstallmanifests", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorInstallmanifests_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorInstallmembership", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorInstallmembership_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorManifestarrayCleanup", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorManifestarrayCleanup_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorManifesttemplateDestroy", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorManifesttemplateDestroy_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorPolicyDestroy", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorPolicyDestroy_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorPublickeyDestroy", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorPublickeyDestroy_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorRemovemembership", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorRemovemembership_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorReset", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorReset_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorResetpolicy", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorResetpolicy_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorSetapplicationstate", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorSetapplicationstate_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorSetclaimcapabilities", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorSetclaimcapabilities_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorSetclaimcapabilitiesadditionalinfo", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorSetclaimcapabilitiesadditionalinfo_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorSetmanifesttemplatefromxml", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorSetmanifesttemplatefromxml_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorStartmanagement", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorStartmanagement_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorUpdateidentity", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorUpdateidentity_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorUpdatepolicy", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorUpdatepolicy_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynPinglistenerCreate", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynPinglistenerCreate_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynPinglistenerDestroy", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynPinglistenerDestroy_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectAddchild", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectAddchild_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectAddinterface", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectAddinterface_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectAddinterfaceByName", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectAddinterfaceByName_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectCopy", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectCopy_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectCreate", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectCreate_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectCreateSecure", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectCreateSecure_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectDestroy", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectDestroy_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectEnablepropertycaching", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectEnablepropertycaching_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectGetallproperties", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectGetallproperties_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectGetallpropertiesasync", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectGetallpropertiesasync_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectGetchild", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectGetchild_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectGetchildren", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectGetchildren_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectGetinterface", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectGetinterface_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectGetinterfaces", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectGetinterfaces_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectGetpath", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectGetpath_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectGetproperty", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectGetproperty_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectGetpropertyasync", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectGetpropertyasync_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectGetservicename", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectGetservicename_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectGetsessionid", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectGetsessionid_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectGetuniquename", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectGetuniquename_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectImplementsinterface", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectImplementsinterface_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectIntrospectremoteobject", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectIntrospectremoteobject_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectIntrospectremoteobjectasync", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectIntrospectremoteobjectasync_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectIssecure", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectIssecure_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectIsvalid", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectIsvalid_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectMethodcall", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectMethodcall_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectMethodcallNoreply", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectMethodcallNoreply_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectMethodcallasync", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectMethodcallasync_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectParsexml", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectParsexml_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectRefCreate", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectRefCreate_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectRefDecref", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectRefDecref_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectRefGet", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectRefGet_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectRefIncref", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectRefIncref_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectRegisterpropertieschangedlistener", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectRegisterpropertieschangedlistener_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectRemovechild", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectRemovechild_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectSecureconnection", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectSecureconnection_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectSecureconnectionasync", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectSecureconnectionasync_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectSetproperty", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectSetproperty_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectSetpropertyasync", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectSetpropertyasync_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectUnregisterpropertieschangedlistener", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectUnregisterpropertieschangedlistener_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynRouterinit", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynRouterinit_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynRouterinitwithconfig", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynRouterinitwithconfig_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynRoutershutdown", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynRoutershutdown_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyClaim", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyClaim_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyComputemanifestdigest", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyComputemanifestdigest_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyCreate", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyCreate_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyDestroy", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyDestroy_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyDigestDestroy", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyDigestDestroy_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyEccpublickeyDestroy", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyEccpublickeyDestroy_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyEndmanagement", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyEndmanagement_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyGetapplicationstate", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyGetapplicationstate_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyGetclaimcapabilities", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyGetclaimcapabilities_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyGetclaimcapabilitiesadditionalinfo", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyGetclaimcapabilitiesadditionalinfo_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyGetdefaultpolicy", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyGetdefaultpolicy_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyGeteccpublickey", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyGeteccpublickey_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyGetmanifesttemplate", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyGetmanifesttemplate_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyGetpermissionmanagementsessionport", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyGetpermissionmanagementsessionport_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyGetpolicy", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyGetpolicy_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyInstallmembership", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyInstallmembership_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyManifestDestroy", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyManifestDestroy_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyManifesttemplateDestroy", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyManifesttemplateDestroy_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyPolicyDestroy", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyPolicyDestroy_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyReset", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyReset_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyResetpolicy", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyResetpolicy_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxySetmanifestsignature", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxySetmanifestsignature_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxySignmanifest", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxySignmanifest_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyStartmanagement", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyStartmanagement_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyUpdateidentity", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyUpdateidentity_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyUpdatepolicy", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyUpdatepolicy_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynSessionlistenerCreate", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynSessionlistenerCreate_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynSessionlistenerDestroy", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynSessionlistenerDestroy_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynSessionoptsCmp", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynSessionoptsCmp_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynSessionoptsCreate", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynSessionoptsCreate_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynSessionoptsDestroy", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynSessionoptsDestroy_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynSessionoptsGetMultipoint", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynSessionoptsGetMultipoint_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynSessionoptsGetProximity", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynSessionoptsGetProximity_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynSessionoptsGetTraffic", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynSessionoptsGetTraffic_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynSessionoptsGetTransports", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynSessionoptsGetTransports_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynSessionoptsIscompatible", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynSessionoptsIscompatible_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynSessionoptsSetMultipoint", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynSessionoptsSetMultipoint_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynSessionoptsSetProximity", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynSessionoptsSetProximity_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynSessionoptsSetTraffic", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynSessionoptsSetTraffic_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynSessionoptsSetTransports", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynSessionoptsSetTransports_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynSessionportlistenerCreate", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynSessionportlistenerCreate_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynSessionportlistenerDestroy", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynSessionportlistenerDestroy_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynShutdown", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynShutdown_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynUnityDeferredCallbacksProcess", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynUnityDeferredCallbacksProcess_napi));
    exports.Set("windowssys_windows_win32_devices_alljoyn_alljoynUnitySetDeferredCallbackMainthreadOnly", Napi::Function::New(env, windowssys_windows_win32_devices_alljoyn_alljoynUnitySetDeferredCallbackMainthreadOnly_napi));
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
