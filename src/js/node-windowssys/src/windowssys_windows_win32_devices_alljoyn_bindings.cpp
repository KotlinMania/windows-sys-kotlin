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

static Napi::Value windowssysWindowsWin32DevicesAlljoynAllJoynAcceptBusConnection_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(serverbushandle, abortevent);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)serverbushandle;
    (void)abortevent;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAllJoynCloseBusHandle_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* bushandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "AllJoynCloseBusHandle")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(bushandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bushandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAllJoynConnectToBus_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* connectionspec = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "AllJoynConnectToBus")));
    }
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(connectionspec);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
#else
    (void)connectionspec;
    errno = ENOSYS;
    void* km_res = nullptr;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAllJoynCreateBus_napi(const Napi::CallbackInfo& km_info) {
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
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(outbuffersize, inbuffersize, lpsecurityattributes);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
#else
    (void)outbuffersize;
    (void)inbuffersize;
    (void)lpsecurityattributes;
    errno = ENOSYS;
    void* km_res = nullptr;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAllJoynEnumEvents_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(connectedbushandle, eventtoreset, eventtypes);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)connectedbushandle;
    (void)eventtoreset;
    (void)eventtypes;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAllJoynEventSelect_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(connectedbushandle, eventhandle, eventtypes);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)connectedbushandle;
    (void)eventhandle;
    (void)eventtypes;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAllJoynReceiveFromBus_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(connectedbushandle, buffer, bytestoread, bytestransferred, reserved);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)connectedbushandle;
    (void)buffer;
    (void)bytestoread;
    (void)bytestransferred;
    (void)reserved;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAllJoynSendToBus_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(connectedbushandle, buffer, bytestowrite, bytestransferred, reserved);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)connectedbushandle;
    (void)buffer;
    (void)bytestowrite;
    (void)bytestransferred;
    (void)reserved;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynQccStatusText_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t status = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "QCC_StatusText")));
    }
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(status);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
#else
    (void)status;
    errno = ENOSYS;
    void* km_res = nullptr;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataCreate_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* defaultlanguage = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_aboutdata_create")));
    }
    int64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(defaultlanguage);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)defaultlanguage;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataCreateEmpty_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_aboutdata_create_empty")));
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

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataCreateFull_napi(const Napi::CallbackInfo& km_info) {
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
    int64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(arg, language);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)arg;
    (void)language;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataCreatefrommsgarg_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(data, arg, language);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)data;
    (void)arg;
    (void)language;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataCreatefromxml_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(data, aboutdataxml);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)data;
    (void)aboutdataxml;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataDestroy_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t data = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_aboutdata_destroy")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(data);
    } else {
        errno = ENOSYS;
    }
#else
    (void)data;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetaboutdata_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(data, msgarg, language);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)data;
    (void)msgarg;
    (void)language;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetajsoftwareversion_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(data, ajsoftwareversion);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)data;
    (void)ajsoftwareversion;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetannouncedaboutdata_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(data, msgarg);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)data;
    (void)msgarg;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetappid_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(data, appid, num);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)data;
    (void)appid;
    (void)num;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetappname_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(data, appname, language);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)data;
    (void)appname;
    (void)language;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetdateofmanufacture_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(data, dateofmanufacture);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)data;
    (void)dateofmanufacture;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetdefaultlanguage_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(data, defaultlanguage);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)data;
    (void)defaultlanguage;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetdescription_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(data, description, language);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)data;
    (void)description;
    (void)language;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetdeviceid_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(data, deviceid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)data;
    (void)deviceid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetdevicename_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(data, devicename, language);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)data;
    (void)devicename;
    (void)language;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetfield_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(data, name, value, language);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)data;
    (void)name;
    (void)value;
    (void)language;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetfields_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t data = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* fields = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint64_t numFields = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(int64_t, void*, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_aboutdata_getfields")));
    }
    uint64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(data, fields, numFields);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)data;
    (void)fields;
    (void)numFields;
    errno = ENOSYS;
    uint64_t km_res = 0;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<uint64_t>(km_res)));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetfieldsignature_napi(const Napi::CallbackInfo& km_info) {
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
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(data, fieldname);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
#else
    (void)data;
    (void)fieldname;
    errno = ENOSYS;
    void* km_res = nullptr;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGethardwareversion_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(data, hardwareversion);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)data;
    (void)hardwareversion;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetmanufacturer_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(data, manufacturer, language);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)data;
    (void)manufacturer;
    (void)language;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetmodelnumber_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(data, modelnumber);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)data;
    (void)modelnumber;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetsoftwareversion_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(data, softwareversion);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)data;
    (void)softwareversion;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetsupportedlanguages_napi(const Napi::CallbackInfo& km_info) {
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
    uint64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(data, languagetags, num);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)data;
    (void)languagetags;
    (void)num;
    errno = ENOSYS;
    uint64_t km_res = 0;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<uint64_t>(km_res)));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetsupporturl_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(data, supporturl);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)data;
    (void)supporturl;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataIsfieldannounced_napi(const Napi::CallbackInfo& km_info) {
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
    uint8_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(data, fieldname);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)data;
    (void)fieldname;
    errno = ENOSYS;
    uint8_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataIsfieldlocalized_napi(const Napi::CallbackInfo& km_info) {
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
    uint8_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(data, fieldname);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)data;
    (void)fieldname;
    errno = ENOSYS;
    uint8_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataIsfieldrequired_napi(const Napi::CallbackInfo& km_info) {
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
    uint8_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(data, fieldname);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)data;
    (void)fieldname;
    errno = ENOSYS;
    uint8_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataIsvalid_napi(const Napi::CallbackInfo& km_info) {
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
    uint8_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(data, language);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)data;
    (void)language;
    errno = ENOSYS;
    uint8_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSetappid_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(data, appid, num);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)data;
    (void)appid;
    (void)num;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSetappidFromstring_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(data, appid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)data;
    (void)appid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSetappname_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(data, appname, language);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)data;
    (void)appname;
    (void)language;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSetdateofmanufacture_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(data, dateofmanufacture);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)data;
    (void)dateofmanufacture;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSetdefaultlanguage_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(data, defaultlanguage);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)data;
    (void)defaultlanguage;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSetdescription_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(data, description, language);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)data;
    (void)description;
    (void)language;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSetdeviceid_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(data, deviceid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)data;
    (void)deviceid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSetdevicename_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(data, devicename, language);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)data;
    (void)devicename;
    (void)language;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSetfield_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(data, name, value, language);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)data;
    (void)name;
    (void)value;
    (void)language;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSethardwareversion_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(data, hardwareversion);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)data;
    (void)hardwareversion;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSetmanufacturer_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(data, manufacturer, language);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)data;
    (void)manufacturer;
    (void)language;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSetmodelnumber_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(data, modelnumber);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)data;
    (void)modelnumber;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSetsoftwareversion_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(data, softwareversion);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)data;
    (void)softwareversion;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSetsupportedlanguage_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(data, language);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)data;
    (void)language;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSetsupporturl_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(data, supporturl);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)data;
    (void)supporturl;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynAboutdatalistenerCreate_napi(const Napi::CallbackInfo& km_info) {
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
    int64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(callbacks, context);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)callbacks;
    (void)context;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynAboutdatalistenerDestroy_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t listener = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_aboutdatalistener_destroy")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(listener);
    } else {
        errno = ENOSYS;
    }
#else
    (void)listener;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynAbouticonClear_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t icon = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_abouticon_clear")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(icon);
    } else {
        errno = ENOSYS;
    }
#else
    (void)icon;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynAbouticonCreate_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_abouticon_create")));
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

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynAbouticonDestroy_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t icon = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_abouticon_destroy")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(icon);
    } else {
        errno = ENOSYS;
    }
#else
    (void)icon;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynAbouticonGetcontent_napi(const Napi::CallbackInfo& km_info) {
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
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(icon, data, size);
    } else {
        errno = ENOSYS;
    }
#else
    (void)icon;
    (void)data;
    (void)size;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynAbouticonGeturl_napi(const Napi::CallbackInfo& km_info) {
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
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(icon, type, url);
    } else {
        errno = ENOSYS;
    }
#else
    (void)icon;
    (void)type;
    (void)url;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynAbouticonSetcontent_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(icon, type, data, csize, ownsdata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)icon;
    (void)type;
    (void)data;
    (void)csize;
    (void)ownsdata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynAbouticonSetcontentFrommsgarg_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(icon, arg);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)icon;
    (void)arg;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynAbouticonSeturl_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(icon, type, url);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)icon;
    (void)type;
    (void)url;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynAbouticonobjCreate_napi(const Napi::CallbackInfo& km_info) {
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
    int64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(bus, icon);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bus;
    (void)icon;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynAbouticonobjDestroy_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t icon = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_abouticonobj_destroy")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(icon);
    } else {
        errno = ENOSYS;
    }
#else
    (void)icon;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynAbouticonproxyCreate_napi(const Napi::CallbackInfo& km_info) {
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
    int64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(bus, busname, sessionid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bus;
    (void)busname;
    (void)sessionid;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynAbouticonproxyDestroy_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t proxy = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_abouticonproxy_destroy")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(proxy);
    } else {
        errno = ENOSYS;
    }
#else
    (void)proxy;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynAbouticonproxyGeticon_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(proxy, icon);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)proxy;
    (void)icon;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynAbouticonproxyGetversion_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(proxy, version);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)proxy;
    (void)version;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynAboutlistenerCreate_napi(const Napi::CallbackInfo& km_info) {
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
    int64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(callback, context);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)callback;
    (void)context;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynAboutlistenerDestroy_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t listener = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_aboutlistener_destroy")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(listener);
    } else {
        errno = ENOSYS;
    }
#else
    (void)listener;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynAboutobjAnnounce_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(obj, sessionport, aboutdata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)obj;
    (void)sessionport;
    (void)aboutdata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynAboutobjAnnounceUsingDatalistener_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(obj, sessionport, aboutlistener);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)obj;
    (void)sessionport;
    (void)aboutlistener;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynAboutobjCreate_napi(const Napi::CallbackInfo& km_info) {
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
    int64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(bus, isannounced);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bus;
    (void)isannounced;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynAboutobjDestroy_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t obj = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_aboutobj_destroy")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(obj);
    } else {
        errno = ENOSYS;
    }
#else
    (void)obj;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynAboutobjUnannounce_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t obj = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_aboutobj_unannounce")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(obj);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)obj;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynAboutobjectdescriptionClear_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t description = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_aboutobjectdescription_clear")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(description);
    } else {
        errno = ENOSYS;
    }
#else
    (void)description;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynAboutobjectdescriptionCreate_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_aboutobjectdescription_create")));
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

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynAboutobjectdescriptionCreateFull_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t arg = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_aboutobjectdescription_create_full")));
    }
    int64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(arg);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)arg;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynAboutobjectdescriptionCreatefrommsgarg_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(description, arg);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)description;
    (void)arg;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynAboutobjectdescriptionDestroy_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t description = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_aboutobjectdescription_destroy")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(description);
    } else {
        errno = ENOSYS;
    }
#else
    (void)description;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynAboutobjectdescriptionGetinterfacepaths_napi(const Napi::CallbackInfo& km_info) {
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
    uint64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(description, interfacename, paths, numpaths);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)description;
    (void)interfacename;
    (void)paths;
    (void)numpaths;
    errno = ENOSYS;
    uint64_t km_res = 0;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<uint64_t>(km_res)));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynAboutobjectdescriptionGetinterfaces_napi(const Napi::CallbackInfo& km_info) {
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
    uint64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(description, path, interfaces, numinterfaces);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)description;
    (void)path;
    (void)interfaces;
    (void)numinterfaces;
    errno = ENOSYS;
    uint64_t km_res = 0;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<uint64_t>(km_res)));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynAboutobjectdescriptionGetmsgarg_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(description, msgarg);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)description;
    (void)msgarg;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynAboutobjectdescriptionGetpaths_napi(const Napi::CallbackInfo& km_info) {
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
    uint64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(description, paths, numpaths);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)description;
    (void)paths;
    (void)numpaths;
    errno = ENOSYS;
    uint64_t km_res = 0;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<uint64_t>(km_res)));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynAboutobjectdescriptionHasinterface_napi(const Napi::CallbackInfo& km_info) {
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
    uint8_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(description, interfacename);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)description;
    (void)interfacename;
    errno = ENOSYS;
    uint8_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynAboutobjectdescriptionHasinterfaceatpath_napi(const Napi::CallbackInfo& km_info) {
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
    uint8_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(description, path, interfacename);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)description;
    (void)path;
    (void)interfacename;
    errno = ENOSYS;
    uint8_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynAboutobjectdescriptionHaspath_napi(const Napi::CallbackInfo& km_info) {
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
    uint8_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(description, path);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)description;
    (void)path;
    errno = ENOSYS;
    uint8_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynAboutproxyCreate_napi(const Napi::CallbackInfo& km_info) {
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
    int64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(bus, busname, sessionid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bus;
    (void)busname;
    (void)sessionid;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynAboutproxyDestroy_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t proxy = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_aboutproxy_destroy")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(proxy);
    } else {
        errno = ENOSYS;
    }
#else
    (void)proxy;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynAboutproxyGetaboutdata_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(proxy, language, data);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)proxy;
    (void)language;
    (void)data;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynAboutproxyGetobjectdescription_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(proxy, objectdesc);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)proxy;
    (void)objectdesc;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynAboutproxyGetversion_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(proxy, version);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)proxy;
    (void)version;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynApplicationstatelistenerCreate_napi(const Napi::CallbackInfo& km_info) {
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
    int64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(callbacks, context);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)callbacks;
    (void)context;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynApplicationstatelistenerDestroy_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t listener = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_applicationstatelistener_destroy")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(listener);
    } else {
        errno = ENOSYS;
    }
#else
    (void)listener;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynAuthlistenerCreate_napi(const Napi::CallbackInfo& km_info) {
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
    int64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(callbacks, context);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)callbacks;
    (void)context;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynAuthlistenerDestroy_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t listener = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_authlistener_destroy")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(listener);
    } else {
        errno = ENOSYS;
    }
#else
    (void)listener;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynAuthlistenerRequestcredentialsresponse_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t listener = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* authcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t arg2Accept = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int64_t credentials = km_info.Length() > 3 ? km_napi_arg_i64(km_info[3]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, int32_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_authlistener_requestcredentialsresponse")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(listener, authcontext, arg2Accept, credentials);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)listener;
    (void)authcontext;
    (void)arg2Accept;
    (void)credentials;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynAuthlistenerSetsharedsecret_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(listener, sharedsecret, sharedsecretsize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)listener;
    (void)sharedsecret;
    (void)sharedsecretsize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynAuthlistenerVerifycredentialsresponse_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t listener = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* authcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t arg2Accept = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_authlistener_verifycredentialsresponse")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(listener, authcontext, arg2Accept);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)listener;
    (void)authcontext;
    (void)arg2Accept;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynAuthlistenerasyncCreate_napi(const Napi::CallbackInfo& km_info) {
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
    int64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(callbacks, context);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)callbacks;
    (void)context;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynAuthlistenerasyncDestroy_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t listener = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_authlistenerasync_destroy")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(listener);
    } else {
        errno = ENOSYS;
    }
#else
    (void)listener;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynAutopingerAdddestination_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(autopinger, group, destination);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)autopinger;
    (void)group;
    (void)destination;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynAutopingerAddpinggroup_napi(const Napi::CallbackInfo& km_info) {
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
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(autopinger, group, listener, pinginterval);
    } else {
        errno = ENOSYS;
    }
#else
    (void)autopinger;
    (void)group;
    (void)listener;
    (void)pinginterval;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynAutopingerCreate_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t bus = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_autopinger_create")));
    }
    int64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(bus);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bus;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynAutopingerDestroy_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t autopinger = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_autopinger_destroy")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(autopinger);
    } else {
        errno = ENOSYS;
    }
#else
    (void)autopinger;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynAutopingerPause_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t autopinger = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_autopinger_pause")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(autopinger);
    } else {
        errno = ENOSYS;
    }
#else
    (void)autopinger;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynAutopingerRemovedestination_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(autopinger, group, destination, removeall);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)autopinger;
    (void)group;
    (void)destination;
    (void)removeall;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynAutopingerRemovepinggroup_napi(const Napi::CallbackInfo& km_info) {
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
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(autopinger, group);
    } else {
        errno = ENOSYS;
    }
#else
    (void)autopinger;
    (void)group;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynAutopingerResume_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t autopinger = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_autopinger_resume")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(autopinger);
    } else {
        errno = ENOSYS;
    }
#else
    (void)autopinger;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynAutopingerSetpinginterval_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(autopinger, group, pinginterval);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)autopinger;
    (void)group;
    (void)pinginterval;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentAddlogonentry_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(bus, authmechanism, username, password);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bus;
    (void)authmechanism;
    (void)username;
    (void)password;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentAddmatch_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(bus, rule);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bus;
    (void)rule;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentAdvertisename_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(bus, name, transports);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bus;
    (void)name;
    (void)transports;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentBindsessionport_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(bus, sessionport, opts, listener);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bus;
    (void)sessionport;
    (void)opts;
    (void)listener;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentCanceladvertisename_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(bus, name, transports);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bus;
    (void)name;
    (void)transports;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentCancelfindadvertisedname_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(bus, nameprefix);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bus;
    (void)nameprefix;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentCancelfindadvertisednamebytransport_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(bus, nameprefix, transports);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bus;
    (void)nameprefix;
    (void)transports;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentCancelwhoimplementsInterface_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(bus, implementsinterface);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bus;
    (void)implementsinterface;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentCancelwhoimplementsInterfaces_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(bus, implementsinterfaces, numberinterfaces);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bus;
    (void)implementsinterfaces;
    (void)numberinterfaces;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentClearkeys_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(bus, guid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bus;
    (void)guid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentClearkeystore_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t bus = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_busattachment_clearkeystore")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(bus);
    } else {
        errno = ENOSYS;
    }
#else
    (void)bus;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentConnect_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(bus, connectspec);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bus;
    (void)connectspec;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentCreate_napi(const Napi::CallbackInfo& km_info) {
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
    int64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(applicationname, allowremotemessages);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)applicationname;
    (void)allowremotemessages;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentCreateConcurrency_napi(const Napi::CallbackInfo& km_info) {
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
    int64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(applicationname, allowremotemessages, concurrency);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)applicationname;
    (void)allowremotemessages;
    (void)concurrency;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentCreateinterface_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(bus, name, iface);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bus;
    (void)name;
    (void)iface;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentCreateinterfaceSecure_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(bus, name, iface, secpolicy);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bus;
    (void)name;
    (void)iface;
    (void)secpolicy;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentCreateinterfacesfromxml_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(bus, xml);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bus;
    (void)xml;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentDeletedefaultkeystore_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* applicationname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_busattachment_deletedefaultkeystore")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(applicationname);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)applicationname;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentDeleteinterface_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(bus, iface);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bus;
    (void)iface;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentDestroy_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t bus = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_busattachment_destroy")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(bus);
    } else {
        errno = ENOSYS;
    }
#else
    (void)bus;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentDisconnect_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(bus, unused);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bus;
    (void)unused;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentEnableconcurrentcallbacks_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t bus = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_busattachment_enableconcurrentcallbacks")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(bus);
    } else {
        errno = ENOSYS;
    }
#else
    (void)bus;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentEnablepeersecurity_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(bus, authmechanisms, listener, keystorefilename, isshared);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bus;
    (void)authmechanisms;
    (void)listener;
    (void)keystorefilename;
    (void)isshared;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentEnablepeersecuritywithpermissionconfigurationlistener_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(bus, authmechanisms, authlistener, keystorefilename, isshared, permissionconfigurationlistener);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bus;
    (void)authmechanisms;
    (void)authlistener;
    (void)keystorefilename;
    (void)isshared;
    (void)permissionconfigurationlistener;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentFindadvertisedname_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(bus, nameprefix);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bus;
    (void)nameprefix;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentFindadvertisednamebytransport_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(bus, nameprefix, transports);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bus;
    (void)nameprefix;
    (void)transports;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentGetalljoyndebugobj_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t bus = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_busattachment_getalljoyndebugobj")));
    }
    int64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(bus);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bus;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentGetalljoynproxyobj_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t bus = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_busattachment_getalljoynproxyobj")));
    }
    int64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(bus);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bus;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentGetconcurrency_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t bus = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_busattachment_getconcurrency")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(bus);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)bus;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentGetconnectspec_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t bus = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_busattachment_getconnectspec")));
    }
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(bus);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
#else
    (void)bus;
    errno = ENOSYS;
    void* km_res = nullptr;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentGetdbusproxyobj_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t bus = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_busattachment_getdbusproxyobj")));
    }
    int64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(bus);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bus;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentGetglobalguidstring_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t bus = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_busattachment_getglobalguidstring")));
    }
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(bus);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
#else
    (void)bus;
    errno = ENOSYS;
    void* km_res = nullptr;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentGetinterface_napi(const Napi::CallbackInfo& km_info) {
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
    int64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(bus, name);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bus;
    (void)name;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentGetinterfaces_napi(const Napi::CallbackInfo& km_info) {
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
    uint64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(bus, ifaces, numifaces);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)bus;
    (void)ifaces;
    (void)numifaces;
    errno = ENOSYS;
    uint64_t km_res = 0;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<uint64_t>(km_res)));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentGetkeyexpiration_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(bus, guid, timeout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bus;
    (void)guid;
    (void)timeout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentGetpeerguid_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(bus, name, guid, guidsz);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bus;
    (void)name;
    (void)guid;
    (void)guidsz;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentGetpermissionconfigurator_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t bus = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_busattachment_getpermissionconfigurator")));
    }
    int64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(bus);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bus;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentGettimestamp_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_busattachment_gettimestamp")));
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

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentGetuniquename_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t bus = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_busattachment_getuniquename")));
    }
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(bus);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
#else
    (void)bus;
    errno = ENOSYS;
    void* km_res = nullptr;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentIsconnected_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t bus = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_busattachment_isconnected")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(bus);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bus;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentIspeersecurityenabled_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t bus = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_busattachment_ispeersecurityenabled")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(bus);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bus;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentIsstarted_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t bus = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_busattachment_isstarted")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(bus);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bus;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentIsstopping_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t bus = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_busattachment_isstopping")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(bus);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bus;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentJoin_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t bus = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_busattachment_join")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(bus);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bus;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentJoinsession_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(bus, sessionhost, sessionport, listener, sessionid, opts);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bus;
    (void)sessionhost;
    (void)sessionport;
    (void)listener;
    (void)sessionid;
    (void)opts;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentJoinsessionasync_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(bus, sessionhost, sessionport, listener, opts, callback, context);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bus;
    (void)sessionhost;
    (void)sessionport;
    (void)listener;
    (void)opts;
    (void)callback;
    (void)context;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentLeavesession_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(bus, sessionid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bus;
    (void)sessionid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentNamehasowner_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(bus, name, hasowner);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bus;
    (void)name;
    (void)hasowner;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentPing_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(bus, name, timeout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bus;
    (void)name;
    (void)timeout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentRegisteraboutlistener_napi(const Napi::CallbackInfo& km_info) {
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
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(bus, aboutlistener);
    } else {
        errno = ENOSYS;
    }
#else
    (void)bus;
    (void)aboutlistener;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentRegisterapplicationstatelistener_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(bus, listener);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bus;
    (void)listener;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentRegisterbuslistener_napi(const Napi::CallbackInfo& km_info) {
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
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(bus, listener);
    } else {
        errno = ENOSYS;
    }
#else
    (void)bus;
    (void)listener;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentRegisterbusobject_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(bus, obj);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bus;
    (void)obj;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentRegisterbusobjectSecure_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(bus, obj);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bus;
    (void)obj;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentRegisterkeystorelistener_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(bus, listener);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bus;
    (void)listener;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentReleasename_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(bus, name);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bus;
    (void)name;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentReloadkeystore_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t bus = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_busattachment_reloadkeystore")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(bus);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bus;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentRemovematch_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(bus, rule);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bus;
    (void)rule;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentRemovesessionmember_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(bus, sessionid, membername);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bus;
    (void)sessionid;
    (void)membername;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentRequestname_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(bus, requestedname, flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bus;
    (void)requestedname;
    (void)flags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentSecureconnection_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(bus, name, forceauth);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bus;
    (void)name;
    (void)forceauth;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentSecureconnectionasync_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(bus, name, forceauth);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bus;
    (void)name;
    (void)forceauth;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentSetdaemondebug_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(bus, module, level);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bus;
    (void)module;
    (void)level;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentSetkeyexpiration_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(bus, guid, timeout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bus;
    (void)guid;
    (void)timeout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentSetlinktimeout_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(bus, sessionid, linktimeout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bus;
    (void)sessionid;
    (void)linktimeout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentSetlinktimeoutasync_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(bus, sessionid, linktimeout, callback, context);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bus;
    (void)sessionid;
    (void)linktimeout;
    (void)callback;
    (void)context;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentSetsessionlistener_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(bus, sessionid, listener);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bus;
    (void)sessionid;
    (void)listener;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentStart_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t bus = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_busattachment_start")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(bus);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bus;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentStop_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t bus = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_busattachment_stop")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(bus);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bus;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentUnbindsessionport_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(bus, sessionport);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bus;
    (void)sessionport;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentUnregisteraboutlistener_napi(const Napi::CallbackInfo& km_info) {
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
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(bus, aboutlistener);
    } else {
        errno = ENOSYS;
    }
#else
    (void)bus;
    (void)aboutlistener;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentUnregisterallaboutlisteners_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t bus = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_busattachment_unregisterallaboutlisteners")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(bus);
    } else {
        errno = ENOSYS;
    }
#else
    (void)bus;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentUnregisterallhandlers_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t bus = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_busattachment_unregisterallhandlers")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(bus);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bus;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentUnregisterapplicationstatelistener_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(bus, listener);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bus;
    (void)listener;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentUnregisterbuslistener_napi(const Napi::CallbackInfo& km_info) {
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
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(bus, listener);
    } else {
        errno = ENOSYS;
    }
#else
    (void)bus;
    (void)listener;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentUnregisterbusobject_napi(const Napi::CallbackInfo& km_info) {
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
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(bus, object);
    } else {
        errno = ENOSYS;
    }
#else
    (void)bus;
    (void)object;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentWhoimplementsInterface_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(bus, implementsinterface);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bus;
    (void)implementsinterface;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentWhoimplementsInterfaces_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(bus, implementsinterfaces, numberinterfaces);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bus;
    (void)implementsinterfaces;
    (void)numberinterfaces;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynBuslistenerCreate_napi(const Napi::CallbackInfo& km_info) {
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
    int64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(callbacks, context);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)callbacks;
    (void)context;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynBuslistenerDestroy_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t listener = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_buslistener_destroy")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(listener);
    } else {
        errno = ENOSYS;
    }
#else
    (void)listener;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectAddinterface_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(bus, iface);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bus;
    (void)iface;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectAddinterfaceAnnounced_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(bus, iface);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bus;
    (void)iface;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectAddmethodhandlers_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(bus, entries, numentries);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bus;
    (void)entries;
    (void)numentries;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectCancelsessionlessmessage_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(bus, msg);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bus;
    (void)msg;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectCancelsessionlessmessageSerial_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(bus, serialnumber);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bus;
    (void)serialnumber;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectCreate_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* path = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t isplaceholder = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* callbacksIn = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* contextIn = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_busobject_create")));
    }
    int64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(path, isplaceholder, callbacksIn, contextIn);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)path;
    (void)isplaceholder;
    (void)callbacksIn;
    (void)contextIn;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectDestroy_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t bus = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_busobject_destroy")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(bus);
    } else {
        errno = ENOSYS;
    }
#else
    (void)bus;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectEmitpropertieschanged_napi(const Napi::CallbackInfo& km_info) {
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
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(bus, ifcname, propnames, numprops, id);
    } else {
        errno = ENOSYS;
    }
#else
    (void)bus;
    (void)ifcname;
    (void)propnames;
    (void)numprops;
    (void)id;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectEmitpropertychanged_napi(const Napi::CallbackInfo& km_info) {
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
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(bus, ifcname, propname, val, id);
    } else {
        errno = ENOSYS;
    }
#else
    (void)bus;
    (void)ifcname;
    (void)propname;
    (void)val;
    (void)id;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectGetannouncedinterfacenames_napi(const Napi::CallbackInfo& km_info) {
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
    uint64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(bus, interfaces, numinterfaces);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)bus;
    (void)interfaces;
    (void)numinterfaces;
    errno = ENOSYS;
    uint64_t km_res = 0;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<uint64_t>(km_res)));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectGetbusattachment_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t bus = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_busobject_getbusattachment")));
    }
    int64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(bus);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bus;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectGetname_napi(const Napi::CallbackInfo& km_info) {
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
    uint64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(bus, buffer, buffersz);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)bus;
    (void)buffer;
    (void)buffersz;
    errno = ENOSYS;
    uint64_t km_res = 0;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<uint64_t>(km_res)));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectGetpath_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t bus = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_busobject_getpath")));
    }
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(bus);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
#else
    (void)bus;
    errno = ENOSYS;
    void* km_res = nullptr;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectIssecure_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t bus = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_busobject_issecure")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(bus);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bus;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectMethodreplyArgs_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(bus, msg, args, numargs);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bus;
    (void)msg;
    (void)args;
    (void)numargs;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectMethodreplyErr_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(bus, msg, error, errormessage);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bus;
    (void)msg;
    (void)error;
    (void)errormessage;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectMethodreplyStatus_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(bus, msg, status);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bus;
    (void)msg;
    (void)status;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectSetannounceflag_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(bus, iface, isannounced);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bus;
    (void)iface;
    (void)isannounced;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynCredentialsClear_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t cred = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_credentials_clear")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(cred);
    } else {
        errno = ENOSYS;
    }
#else
    (void)cred;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynCredentialsCreate_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_credentials_create")));
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

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynCredentialsDestroy_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t cred = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_credentials_destroy")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(cred);
    } else {
        errno = ENOSYS;
    }
#else
    (void)cred;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynCredentialsGetcertchain_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t cred = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_credentials_getcertchain")));
    }
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(cred);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
#else
    (void)cred;
    errno = ENOSYS;
    void* km_res = nullptr;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynCredentialsGetexpiration_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t cred = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_credentials_getexpiration")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(cred);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)cred;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynCredentialsGetlogonentry_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t cred = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_credentials_getlogonentry")));
    }
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(cred);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
#else
    (void)cred;
    errno = ENOSYS;
    void* km_res = nullptr;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynCredentialsGetpassword_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t cred = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_credentials_getpassword")));
    }
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(cred);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
#else
    (void)cred;
    errno = ENOSYS;
    void* km_res = nullptr;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynCredentialsGetprivateKey_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t cred = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_credentials_getprivateKey")));
    }
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(cred);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
#else
    (void)cred;
    errno = ENOSYS;
    void* km_res = nullptr;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynCredentialsGetusername_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t cred = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_credentials_getusername")));
    }
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(cred);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
#else
    (void)cred;
    errno = ENOSYS;
    void* km_res = nullptr;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynCredentialsIsset_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(cred, creds);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)cred;
    (void)creds;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynCredentialsSetcertchain_napi(const Napi::CallbackInfo& km_info) {
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
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(cred, certchain);
    } else {
        errno = ENOSYS;
    }
#else
    (void)cred;
    (void)certchain;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynCredentialsSetexpiration_napi(const Napi::CallbackInfo& km_info) {
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
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(cred, expiration);
    } else {
        errno = ENOSYS;
    }
#else
    (void)cred;
    (void)expiration;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynCredentialsSetlogonentry_napi(const Napi::CallbackInfo& km_info) {
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
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(cred, logonentry);
    } else {
        errno = ENOSYS;
    }
#else
    (void)cred;
    (void)logonentry;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynCredentialsSetpassword_napi(const Napi::CallbackInfo& km_info) {
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
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(cred, pwd);
    } else {
        errno = ENOSYS;
    }
#else
    (void)cred;
    (void)pwd;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynCredentialsSetprivatekey_napi(const Napi::CallbackInfo& km_info) {
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
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(cred, pk);
    } else {
        errno = ENOSYS;
    }
#else
    (void)cred;
    (void)pk;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynCredentialsSetusername_napi(const Napi::CallbackInfo& km_info) {
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
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(cred, username);
    } else {
        errno = ENOSYS;
    }
#else
    (void)cred;
    (void)username;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynGetbuildinfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_getbuildinfo")));
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

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynGetnumericversion_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_getnumericversion")));
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

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynGetversion_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_getversion")));
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

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynInit_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_init")));
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

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionActivate_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t iface = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_interfacedescription_activate")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(iface);
    } else {
        errno = ENOSYS;
    }
#else
    (void)iface;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionAddannotation_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(iface, name, value);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)iface;
    (void)name;
    (void)value;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionAddargannotation_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(iface, member, argname, name, value);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)iface;
    (void)member;
    (void)argname;
    (void)name;
    (void)value;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionAddmember_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(iface, type, name, inputsig, outsig, argnames, annotation);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)iface;
    (void)type;
    (void)name;
    (void)inputsig;
    (void)outsig;
    (void)argnames;
    (void)annotation;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionAddmemberannotation_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(iface, member, name, value);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)iface;
    (void)member;
    (void)name;
    (void)value;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionAddmethod_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(iface, name, inputsig, outsig, argnames, annotation, accessperms);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)iface;
    (void)name;
    (void)inputsig;
    (void)outsig;
    (void)argnames;
    (void)annotation;
    (void)accessperms;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionAddproperty_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(iface, name, signature, access);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)iface;
    (void)name;
    (void)signature;
    (void)access;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionAddpropertyannotation_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(iface, property, name, value);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)iface;
    (void)property;
    (void)name;
    (void)value;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionAddsignal_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(iface, name, sig, argnames, annotation, accessperms);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)iface;
    (void)name;
    (void)sig;
    (void)argnames;
    (void)annotation;
    (void)accessperms;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionEql_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(one, other);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)one;
    (void)other;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetannotation_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t iface = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* name = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* value = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* valueSize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_interfacedescription_getannotation")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(iface, name, value, valueSize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)iface;
    (void)name;
    (void)value;
    (void)valueSize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetannotationatindex_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t iface = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint64_t arg1Index = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* name = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* nameSize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* value = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* valueSize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, uint64_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_interfacedescription_getannotationatindex")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(iface, arg1Index, name, nameSize, value, valueSize);
    } else {
        errno = ENOSYS;
    }
#else
    (void)iface;
    (void)arg1Index;
    (void)name;
    (void)nameSize;
    (void)value;
    (void)valueSize;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetannotationscount_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t iface = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_interfacedescription_getannotationscount")));
    }
    uint64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(iface);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)iface;
    errno = ENOSYS;
    uint64_t km_res = 0;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<uint64_t>(km_res)));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetargdescriptionforlanguage_napi(const Napi::CallbackInfo& km_info) {
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
    uint64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(iface, member, arg, description, maxlanguagelength, languagetag);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)iface;
    (void)member;
    (void)arg;
    (void)description;
    (void)maxlanguagelength;
    (void)languagetag;
    errno = ENOSYS;
    uint64_t km_res = 0;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<uint64_t>(km_res)));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetdescriptionforlanguage_napi(const Napi::CallbackInfo& km_info) {
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
    uint64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(iface, description, maxlanguagelength, languagetag);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)iface;
    (void)description;
    (void)maxlanguagelength;
    (void)languagetag;
    errno = ENOSYS;
    uint64_t km_res = 0;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<uint64_t>(km_res)));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetdescriptionlanguages_napi(const Napi::CallbackInfo& km_info) {
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
    uint64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(iface, languages, size);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)iface;
    (void)languages;
    (void)size;
    errno = ENOSYS;
    uint64_t km_res = 0;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<uint64_t>(km_res)));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetdescriptionlanguages2_napi(const Napi::CallbackInfo& km_info) {
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
    uint64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(iface, languages, languagessize);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)iface;
    (void)languages;
    (void)languagessize;
    errno = ENOSYS;
    uint64_t km_res = 0;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<uint64_t>(km_res)));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetdescriptiontranslationcallback_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t iface = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_interfacedescription_getdescriptiontranslationcallback")));
    }
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(iface);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
#else
    (void)iface;
    errno = ENOSYS;
    void* km_res = nullptr;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetmember_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(iface, name, member);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)iface;
    (void)name;
    (void)member;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetmemberannotation_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t iface = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* member = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* name = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* value = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* valueSize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_interfacedescription_getmemberannotation")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(iface, member, name, value, valueSize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)iface;
    (void)member;
    (void)name;
    (void)value;
    (void)valueSize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetmemberargannotation_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t iface = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* member = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* argname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* name = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* value = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* valueSize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_interfacedescription_getmemberargannotation")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(iface, member, argname, name, value, valueSize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)iface;
    (void)member;
    (void)argname;
    (void)name;
    (void)value;
    (void)valueSize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetmemberdescriptionforlanguage_napi(const Napi::CallbackInfo& km_info) {
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
    uint64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(iface, member, description, maxlanguagelength, languagetag);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)iface;
    (void)member;
    (void)description;
    (void)maxlanguagelength;
    (void)languagetag;
    errno = ENOSYS;
    uint64_t km_res = 0;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<uint64_t>(km_res)));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetmembers_napi(const Napi::CallbackInfo& km_info) {
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
    uint64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(iface, members, nummembers);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)iface;
    (void)members;
    (void)nummembers;
    errno = ENOSYS;
    uint64_t km_res = 0;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<uint64_t>(km_res)));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetmethod_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(iface, name, member);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)iface;
    (void)name;
    (void)member;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetname_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t iface = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_interfacedescription_getname")));
    }
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(iface);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
#else
    (void)iface;
    errno = ENOSYS;
    void* km_res = nullptr;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetproperties_napi(const Napi::CallbackInfo& km_info) {
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
    uint64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(iface, props, numprops);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)iface;
    (void)props;
    (void)numprops;
    errno = ENOSYS;
    uint64_t km_res = 0;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<uint64_t>(km_res)));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetproperty_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(iface, name, property);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)iface;
    (void)name;
    (void)property;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetpropertyannotation_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t iface = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* property = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* name = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* value = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* strSize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_interfacedescription_getpropertyannotation")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(iface, property, name, value, strSize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)iface;
    (void)property;
    (void)name;
    (void)value;
    (void)strSize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetpropertydescriptionforlanguage_napi(const Napi::CallbackInfo& km_info) {
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
    uint64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(iface, property, description, maxlanguagelength, languagetag);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)iface;
    (void)property;
    (void)description;
    (void)maxlanguagelength;
    (void)languagetag;
    errno = ENOSYS;
    uint64_t km_res = 0;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<uint64_t>(km_res)));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetsecuritypolicy_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t iface = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_interfacedescription_getsecuritypolicy")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(iface);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)iface;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetsignal_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(iface, name, member);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)iface;
    (void)name;
    (void)member;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionHasdescription_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t iface = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_interfacedescription_hasdescription")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(iface);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)iface;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionHasmember_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(iface, name, insig, outsig);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)iface;
    (void)name;
    (void)insig;
    (void)outsig;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionHasproperties_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t iface = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_interfacedescription_hasproperties")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(iface);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)iface;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionHasproperty_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(iface, name);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)iface;
    (void)name;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionIntrospect_napi(const Napi::CallbackInfo& km_info) {
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
    uint64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(iface, str, buf, indent);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)iface;
    (void)str;
    (void)buf;
    (void)indent;
    errno = ENOSYS;
    uint64_t km_res = 0;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<uint64_t>(km_res)));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionIssecure_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t iface = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_interfacedescription_issecure")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(iface);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)iface;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionSetargdescription_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(iface, member, argname, description);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)iface;
    (void)member;
    (void)argname;
    (void)description;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionSetargdescriptionforlanguage_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(iface, member, arg, description, languagetag);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)iface;
    (void)member;
    (void)arg;
    (void)description;
    (void)languagetag;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionSetdescription_napi(const Napi::CallbackInfo& km_info) {
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
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(iface, description);
    } else {
        errno = ENOSYS;
    }
#else
    (void)iface;
    (void)description;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionSetdescriptionforlanguage_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(iface, description, languagetag);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)iface;
    (void)description;
    (void)languagetag;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionSetdescriptionlanguage_napi(const Napi::CallbackInfo& km_info) {
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
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(iface, language);
    } else {
        errno = ENOSYS;
    }
#else
    (void)iface;
    (void)language;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionSetdescriptiontranslationcallback_napi(const Napi::CallbackInfo& km_info) {
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
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(iface, translationcallback);
    } else {
        errno = ENOSYS;
    }
#else
    (void)iface;
    (void)translationcallback;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionSetmemberdescription_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(iface, member, description);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)iface;
    (void)member;
    (void)description;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionSetmemberdescriptionforlanguage_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(iface, member, description, languagetag);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)iface;
    (void)member;
    (void)description;
    (void)languagetag;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionSetpropertydescription_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(iface, name, description);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)iface;
    (void)name;
    (void)description;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionSetpropertydescriptionforlanguage_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(iface, name, description, languagetag);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)iface;
    (void)name;
    (void)description;
    (void)languagetag;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynKeystorelistenerCreate_napi(const Napi::CallbackInfo& km_info) {
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
    int64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(callbacks, context);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)callbacks;
    (void)context;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynKeystorelistenerDestroy_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t listener = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_keystorelistener_destroy")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(listener);
    } else {
        errno = ENOSYS;
    }
#else
    (void)listener;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynKeystorelistenerGetkeys_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t listener = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t keystore = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
    void* sink = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* sinkSz = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_keystorelistener_getkeys")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(listener, keystore, sink, sinkSz);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)listener;
    (void)keystore;
    (void)sink;
    (void)sinkSz;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynKeystorelistenerPutkeys_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(listener, keystore, source, password);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)listener;
    (void)keystore;
    (void)source;
    (void)password;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynKeystorelistenerWithSynchronizationCreate_napi(const Napi::CallbackInfo& km_info) {
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
    int64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(callbacks, context);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)callbacks;
    (void)context;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynMessageCreate_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t bus = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_message_create")));
    }
    int64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(bus);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bus;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynMessageDescription_napi(const Napi::CallbackInfo& km_info) {
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
    uint64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(msg, str, buf);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)msg;
    (void)str;
    (void)buf;
    errno = ENOSYS;
    uint64_t km_res = 0;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<uint64_t>(km_res)));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynMessageDestroy_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t msg = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_message_destroy")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(msg);
    } else {
        errno = ENOSYS;
    }
#else
    (void)msg;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynMessageEql_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(one, other);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)one;
    (void)other;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynMessageGetarg_napi(const Napi::CallbackInfo& km_info) {
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
    int64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(msg, argn);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)msg;
    (void)argn;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynMessageGetargs_napi(const Napi::CallbackInfo& km_info) {
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
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(msg, numargs, args);
    } else {
        errno = ENOSYS;
    }
#else
    (void)msg;
    (void)numargs;
    (void)args;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynMessageGetauthmechanism_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t msg = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_message_getauthmechanism")));
    }
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(msg);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
#else
    (void)msg;
    errno = ENOSYS;
    void* km_res = nullptr;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynMessageGetcallserial_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t msg = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_message_getcallserial")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(msg);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)msg;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynMessageGetcompressiontoken_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t msg = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_message_getcompressiontoken")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(msg);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)msg;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynMessageGetdestination_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t msg = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_message_getdestination")));
    }
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(msg);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
#else
    (void)msg;
    errno = ENOSYS;
    void* km_res = nullptr;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynMessageGeterrorname_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t msg = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* errormessage = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* errormessageSize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_message_geterrorname")));
    }
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(msg, errormessage, errormessageSize);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
#else
    (void)msg;
    (void)errormessage;
    (void)errormessageSize;
    errno = ENOSYS;
    void* km_res = nullptr;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynMessageGetflags_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t msg = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef uint8_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_message_getflags")));
    }
    uint8_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(msg);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)msg;
    errno = ENOSYS;
    uint8_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynMessageGetinterface_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t msg = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_message_getinterface")));
    }
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(msg);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
#else
    (void)msg;
    errno = ENOSYS;
    void* km_res = nullptr;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynMessageGetmembername_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t msg = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_message_getmembername")));
    }
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(msg);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
#else
    (void)msg;
    errno = ENOSYS;
    void* km_res = nullptr;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynMessageGetobjectpath_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t msg = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_message_getobjectpath")));
    }
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(msg);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
#else
    (void)msg;
    errno = ENOSYS;
    void* km_res = nullptr;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynMessageGetreceiveendpointname_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t msg = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_message_getreceiveendpointname")));
    }
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(msg);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
#else
    (void)msg;
    errno = ENOSYS;
    void* km_res = nullptr;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynMessageGetreplyserial_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t msg = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_message_getreplyserial")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(msg);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)msg;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynMessageGetsender_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t msg = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_message_getsender")));
    }
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(msg);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
#else
    (void)msg;
    errno = ENOSYS;
    void* km_res = nullptr;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynMessageGetsessionid_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t msg = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_message_getsessionid")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(msg);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)msg;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynMessageGetsignature_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t msg = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_message_getsignature")));
    }
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(msg);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
#else
    (void)msg;
    errno = ENOSYS;
    void* km_res = nullptr;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynMessageGettimestamp_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t msg = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_message_gettimestamp")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(msg);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)msg;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynMessageGettype_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t msg = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_message_gettype")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(msg);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)msg;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynMessageIsbroadcastsignal_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t msg = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_message_isbroadcastsignal")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(msg);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)msg;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynMessageIsencrypted_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t msg = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_message_isencrypted")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(msg);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)msg;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynMessageIsexpired_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(msg, tillexpirems);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)msg;
    (void)tillexpirems;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynMessageIsglobalbroadcast_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t msg = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_message_isglobalbroadcast")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(msg);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)msg;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynMessageIssessionless_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t msg = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_message_issessionless")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(msg);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)msg;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynMessageIsunreliable_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t msg = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_message_isunreliable")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(msg);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)msg;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynMessageParseargs_napi(const Napi::CallbackInfo& km_info) {
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
    } else {
        errno = ENOSYS;
    }
#else
    (void)msg;
    (void)signature;
    (void)km_vac; (void)km_va0; (void)km_va1; (void)km_va2; (void)km_va3;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynMessageSetendianess_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int8_t endian = static_cast<int8_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int8_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_message_setendianess")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(endian);
    } else {
        errno = ENOSYS;
    }
#else
    (void)endian;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynMessageTostring_napi(const Napi::CallbackInfo& km_info) {
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
    uint64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(msg, str, buf);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)msg;
    (void)str;
    (void)buf;
    errno = ENOSYS;
    uint64_t km_res = 0;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<uint64_t>(km_res)));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynMsgargArrayCreate_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t size = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_msgarg_array_create")));
    }
    int64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(size);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)size;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynMsgargArrayElement_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t arg = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint64_t arg1Index = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_msgarg_array_element")));
    }
    int64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(arg, arg1Index);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)arg;
    (void)arg1Index;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynMsgargArrayGet_napi(const Napi::CallbackInfo& km_info) {
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
    } else {
        errno = ENOSYS;
    }
#else
    (void)args;
    (void)numargs;
    (void)signature;
    (void)km_vac; (void)km_va0; (void)km_va1; (void)km_va2; (void)km_va3;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynMsgargArraySet_napi(const Napi::CallbackInfo& km_info) {
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
    } else {
        errno = ENOSYS;
    }
#else
    (void)args;
    (void)numargs;
    (void)signature;
    (void)km_vac; (void)km_va0; (void)km_va1; (void)km_va2; (void)km_va3;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynMsgargArraySetOffset_napi(const Napi::CallbackInfo& km_info) {
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
    } else {
        errno = ENOSYS;
    }
#else
    (void)args;
    (void)argoffset;
    (void)numargs;
    (void)signature;
    (void)km_vac; (void)km_va0; (void)km_va1; (void)km_va2; (void)km_va3;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynMsgargArraySignature_napi(const Napi::CallbackInfo& km_info) {
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
    uint64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(values, numvalues, str, buf);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)values;
    (void)numvalues;
    (void)str;
    (void)buf;
    errno = ENOSYS;
    uint64_t km_res = 0;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<uint64_t>(km_res)));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynMsgargArrayTostring_napi(const Napi::CallbackInfo& km_info) {
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
    uint64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(args, numargs, str, buf, indent);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)args;
    (void)numargs;
    (void)str;
    (void)buf;
    (void)indent;
    errno = ENOSYS;
    uint64_t km_res = 0;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<uint64_t>(km_res)));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynMsgargClear_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t arg = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_msgarg_clear")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(arg);
    } else {
        errno = ENOSYS;
    }
#else
    (void)arg;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynMsgargClone_napi(const Napi::CallbackInfo& km_info) {
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
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(destination, source);
    } else {
        errno = ENOSYS;
    }
#else
    (void)destination;
    (void)source;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynMsgargCopy_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t source = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_msgarg_copy")));
    }
    int64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(source);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)source;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynMsgargCreate_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_msgarg_create")));
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

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynMsgargCreateAndSet_napi(const Napi::CallbackInfo& km_info) {
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
    } else {
        errno = ENOSYS;
    }
#else
    (void)signature;
    (void)km_vac; (void)km_va0; (void)km_va1; (void)km_va2; (void)km_va3;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynMsgargDestroy_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t arg = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_msgarg_destroy")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(arg);
    } else {
        errno = ENOSYS;
    }
#else
    (void)arg;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynMsgargEqual_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(lhv, rhv);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lhv;
    (void)rhv;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGet_napi(const Napi::CallbackInfo& km_info) {
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
    } else {
        errno = ENOSYS;
    }
#else
    (void)arg;
    (void)signature;
    (void)km_vac; (void)km_va0; (void)km_va1; (void)km_va2; (void)km_va3;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetArrayElement_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t arg = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint64_t arg1Index = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* element = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, uint64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_msgarg_get_array_element")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(arg, arg1Index, element);
    } else {
        errno = ENOSYS;
    }
#else
    (void)arg;
    (void)arg1Index;
    (void)element;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetArrayElementsignature_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t arg = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint64_t arg1Index = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_msgarg_get_array_elementsignature")));
    }
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(arg, arg1Index);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
#else
    (void)arg;
    (void)arg1Index;
    errno = ENOSYS;
    void* km_res = nullptr;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetArrayNumberofelements_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t arg = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_msgarg_get_array_numberofelements")));
    }
    uint64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(arg);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)arg;
    errno = ENOSYS;
    uint64_t km_res = 0;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<uint64_t>(km_res)));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetBool_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(arg, b);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)arg;
    (void)b;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetBoolArray_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(arg, length, ab);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)arg;
    (void)length;
    (void)ab;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetDouble_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(arg, d);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)arg;
    (void)d;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetDoubleArray_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(arg, length, ad);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)arg;
    (void)length;
    (void)ad;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetInt16_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(arg, n);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)arg;
    (void)n;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetInt16Array_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(arg, length, an);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)arg;
    (void)length;
    (void)an;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetInt32_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(arg, i);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)arg;
    (void)i;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetInt32Array_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(arg, length, ai);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)arg;
    (void)length;
    (void)ai;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetInt64_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(arg, x);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)arg;
    (void)x;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetInt64Array_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(arg, length, ax);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)arg;
    (void)length;
    (void)ax;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetObjectpath_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(arg, o);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)arg;
    (void)o;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetSignature_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(arg, g);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)arg;
    (void)g;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetString_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(arg, s);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)arg;
    (void)s;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetUint16_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(arg, q);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)arg;
    (void)q;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetUint16Array_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(arg, length, aq);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)arg;
    (void)length;
    (void)aq;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetUint32_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(arg, u);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)arg;
    (void)u;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetUint32Array_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(arg, length, au);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)arg;
    (void)length;
    (void)au;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetUint64_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(arg, t);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)arg;
    (void)t;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetUint64Array_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(arg, length, at);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)arg;
    (void)length;
    (void)at;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetUint8_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(arg, y);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)arg;
    (void)y;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetUint8Array_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(arg, length, ay);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)arg;
    (void)length;
    (void)ay;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetVariant_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(arg, v);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)arg;
    (void)v;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetVariantArray_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(arg, signature, length, av);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)arg;
    (void)signature;
    (void)length;
    (void)av;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetdictelement_napi(const Napi::CallbackInfo& km_info) {
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
    } else {
        errno = ENOSYS;
    }
#else
    (void)arg;
    (void)elemsig;
    (void)km_vac; (void)km_va0; (void)km_va1; (void)km_va2; (void)km_va3;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetkey_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t arg = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_msgarg_getkey")));
    }
    int64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(arg);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)arg;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetmember_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t arg = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint64_t arg1Index = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_msgarg_getmember")));
    }
    int64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(arg, arg1Index);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)arg;
    (void)arg1Index;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetnummembers_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t arg = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_msgarg_getnummembers")));
    }
    uint64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(arg);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)arg;
    errno = ENOSYS;
    uint64_t km_res = 0;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<uint64_t>(km_res)));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGettype_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t arg = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_msgarg_gettype")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(arg);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)arg;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetvalue_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t arg = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_msgarg_getvalue")));
    }
    int64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(arg);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)arg;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynMsgargHassignature_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(arg, signature);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)arg;
    (void)signature;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSet_napi(const Napi::CallbackInfo& km_info) {
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
    } else {
        errno = ENOSYS;
    }
#else
    (void)arg;
    (void)signature;
    (void)km_vac; (void)km_va0; (void)km_va1; (void)km_va2; (void)km_va3;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetAndStabilize_napi(const Napi::CallbackInfo& km_info) {
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
    } else {
        errno = ENOSYS;
    }
#else
    (void)arg;
    (void)signature;
    (void)km_vac; (void)km_va0; (void)km_va1; (void)km_va2; (void)km_va3;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetBool_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(arg, b);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)arg;
    (void)b;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetBoolArray_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(arg, length, ab);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)arg;
    (void)length;
    (void)ab;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetDouble_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(arg, d);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)arg;
    (void)d;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetDoubleArray_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(arg, length, ad);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)arg;
    (void)length;
    (void)ad;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetInt16_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(arg, n);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)arg;
    (void)n;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetInt16Array_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(arg, length, an);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)arg;
    (void)length;
    (void)an;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetInt32_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(arg, i);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)arg;
    (void)i;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetInt32Array_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(arg, length, ai);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)arg;
    (void)length;
    (void)ai;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetInt64_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(arg, x);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)arg;
    (void)x;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetInt64Array_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(arg, length, ax);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)arg;
    (void)length;
    (void)ax;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetObjectpath_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(arg, o);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)arg;
    (void)o;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetObjectpathArray_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(arg, length, ao);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)arg;
    (void)length;
    (void)ao;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetSignature_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(arg, g);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)arg;
    (void)g;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetSignatureArray_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(arg, length, ag);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)arg;
    (void)length;
    (void)ag;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetString_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(arg, s);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)arg;
    (void)s;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetStringArray_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(arg, length, as);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)arg;
    (void)length;
    (void)as;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetUint16_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(arg, q);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)arg;
    (void)q;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetUint16Array_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(arg, length, aq);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)arg;
    (void)length;
    (void)aq;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetUint32_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(arg, u);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)arg;
    (void)u;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetUint32Array_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(arg, length, au);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)arg;
    (void)length;
    (void)au;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetUint64_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(arg, t);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)arg;
    (void)t;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetUint64Array_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(arg, length, at);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)arg;
    (void)length;
    (void)at;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetUint8_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(arg, y);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)arg;
    (void)y;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetUint8Array_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(arg, length, ay);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)arg;
    (void)length;
    (void)ay;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetdictentry_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(arg, key, value);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)arg;
    (void)key;
    (void)value;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetstruct_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t arg = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t structMembers = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
    uint64_t numMembers = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_msgarg_setstruct")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(arg, structMembers, numMembers);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)arg;
    (void)structMembers;
    (void)numMembers;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSignature_napi(const Napi::CallbackInfo& km_info) {
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
    uint64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(arg, str, buf);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)arg;
    (void)str;
    (void)buf;
    errno = ENOSYS;
    uint64_t km_res = 0;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<uint64_t>(km_res)));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynMsgargStabilize_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t arg = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_msgarg_stabilize")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(arg);
    } else {
        errno = ENOSYS;
    }
#else
    (void)arg;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynMsgargTostring_napi(const Napi::CallbackInfo& km_info) {
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
    uint64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(arg, str, buf, indent);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)arg;
    (void)str;
    (void)buf;
    (void)indent;
    errno = ENOSYS;
    uint64_t km_res = 0;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<uint64_t>(km_res)));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynObserverCreate_napi(const Napi::CallbackInfo& km_info) {
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
    int64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(bus, mandatoryinterfaces, nummandatoryinterfaces);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bus;
    (void)mandatoryinterfaces;
    (void)nummandatoryinterfaces;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynObserverDestroy_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t observer = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_observer_destroy")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(observer);
    } else {
        errno = ENOSYS;
    }
#else
    (void)observer;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynObserverGet_napi(const Napi::CallbackInfo& km_info) {
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
    int64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(observer, uniquebusname, objectpath);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)observer;
    (void)uniquebusname;
    (void)objectpath;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynObserverGetfirst_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t observer = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_observer_getfirst")));
    }
    int64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(observer);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)observer;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynObserverGetnext_napi(const Napi::CallbackInfo& km_info) {
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
    int64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(observer, proxyref);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)observer;
    (void)proxyref;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynObserverRegisterlistener_napi(const Napi::CallbackInfo& km_info) {
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
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(observer, listener, triggeronexisting);
    } else {
        errno = ENOSYS;
    }
#else
    (void)observer;
    (void)listener;
    (void)triggeronexisting;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynObserverUnregisteralllisteners_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t observer = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_observer_unregisteralllisteners")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(observer);
    } else {
        errno = ENOSYS;
    }
#else
    (void)observer;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynObserverUnregisterlistener_napi(const Napi::CallbackInfo& km_info) {
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
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(observer, listener);
    } else {
        errno = ENOSYS;
    }
#else
    (void)observer;
    (void)listener;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynObserverlistenerCreate_napi(const Napi::CallbackInfo& km_info) {
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
    int64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(callback, context);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)callback;
    (void)context;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynObserverlistenerDestroy_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t listener = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_observerlistener_destroy")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(listener);
    } else {
        errno = ENOSYS;
    }
#else
    (void)listener;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynPasswordmanagerSetcredentials_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(authmechanism, password);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)authmechanism;
    (void)password;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfigurationlistenerCreate_napi(const Napi::CallbackInfo& km_info) {
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
    int64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(callbacks, context);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)callbacks;
    (void)context;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfigurationlistenerDestroy_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t listener = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_permissionconfigurationlistener_destroy")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(listener);
    } else {
        errno = ENOSYS;
    }
#else
    (void)listener;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorCertificatechainDestroy_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* certificatechain = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_permissionconfigurator_certificatechain_destroy")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(certificatechain);
    } else {
        errno = ENOSYS;
    }
#else
    (void)certificatechain;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorCertificateidCleanup_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* certificateid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_permissionconfigurator_certificateid_cleanup")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(certificateid);
    } else {
        errno = ENOSYS;
    }
#else
    (void)certificateid;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorCertificateidarrayCleanup_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* certificateidarray = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_permissionconfigurator_certificateidarray_cleanup")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(certificateidarray);
    } else {
        errno = ENOSYS;
    }
#else
    (void)certificateidarray;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorClaim_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(configurator, cakey, identitycertificatechain, groupid, groupsize, groupauthority, manifestsxmls, manifestscount);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)configurator;
    (void)cakey;
    (void)identitycertificatechain;
    (void)groupid;
    (void)groupsize;
    (void)groupauthority;
    (void)manifestsxmls;
    (void)manifestscount;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorEndmanagement_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t configurator = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_permissionconfigurator_endmanagement")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(configurator);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)configurator;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorGetapplicationstate_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(configurator, state);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)configurator;
    (void)state;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorGetclaimcapabilities_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(configurator, claimcapabilities);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)configurator;
    (void)claimcapabilities;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorGetclaimcapabilitiesadditionalinfo_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(configurator, additionalinfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)configurator;
    (void)additionalinfo;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorGetdefaultclaimcapabilities_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef uint16_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_permissionconfigurator_getdefaultclaimcapabilities")));
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

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorGetdefaultpolicy_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(configurator, policyxml);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)configurator;
    (void)policyxml;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorGetidentity_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(configurator, identitycertificatechain);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)configurator;
    (void)identitycertificatechain;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorGetidentitycertificateid_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(configurator, certificateid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)configurator;
    (void)certificateid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorGetmanifests_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(configurator, manifestarray);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)configurator;
    (void)manifestarray;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorGetmanifesttemplate_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(configurator, manifesttemplatexml);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)configurator;
    (void)manifesttemplatexml;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorGetmembershipsummaries_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(configurator, certificateids);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)configurator;
    (void)certificateids;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorGetpolicy_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(configurator, policyxml);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)configurator;
    (void)policyxml;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorGetpublickey_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(configurator, publickey);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)configurator;
    (void)publickey;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorInstallmanifests_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(configurator, manifestsxmls, manifestscount, append);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)configurator;
    (void)manifestsxmls;
    (void)manifestscount;
    (void)append;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorInstallmembership_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(configurator, membershipcertificatechain);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)configurator;
    (void)membershipcertificatechain;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorManifestarrayCleanup_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* manifestarray = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_permissionconfigurator_manifestarray_cleanup")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(manifestarray);
    } else {
        errno = ENOSYS;
    }
#else
    (void)manifestarray;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorManifesttemplateDestroy_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* manifesttemplatexml = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_permissionconfigurator_manifesttemplate_destroy")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(manifesttemplatexml);
    } else {
        errno = ENOSYS;
    }
#else
    (void)manifesttemplatexml;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorPolicyDestroy_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* policyxml = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_permissionconfigurator_policy_destroy")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(policyxml);
    } else {
        errno = ENOSYS;
    }
#else
    (void)policyxml;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorPublickeyDestroy_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* publickey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_permissionconfigurator_publickey_destroy")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(publickey);
    } else {
        errno = ENOSYS;
    }
#else
    (void)publickey;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorRemovemembership_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(configurator, serial, seriallen, issuerpublickey, issueraki, issuerakilen);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)configurator;
    (void)serial;
    (void)seriallen;
    (void)issuerpublickey;
    (void)issueraki;
    (void)issuerakilen;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorReset_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t configurator = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_permissionconfigurator_reset")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(configurator);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)configurator;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorResetpolicy_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t configurator = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_permissionconfigurator_resetpolicy")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(configurator);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)configurator;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorSetapplicationstate_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(configurator, state);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)configurator;
    (void)state;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorSetclaimcapabilities_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(configurator, claimcapabilities);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)configurator;
    (void)claimcapabilities;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorSetclaimcapabilitiesadditionalinfo_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(configurator, additionalinfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)configurator;
    (void)additionalinfo;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorSetmanifesttemplatefromxml_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(configurator, manifesttemplatexml);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)configurator;
    (void)manifesttemplatexml;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorStartmanagement_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t configurator = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_permissionconfigurator_startmanagement")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(configurator);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)configurator;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorUpdateidentity_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(configurator, identitycertificatechain, manifestsxmls, manifestscount);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)configurator;
    (void)identitycertificatechain;
    (void)manifestsxmls;
    (void)manifestscount;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorUpdatepolicy_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(configurator, policyxml);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)configurator;
    (void)policyxml;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynPinglistenerCreate_napi(const Napi::CallbackInfo& km_info) {
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
    int64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(callback, context);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)callback;
    (void)context;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynPinglistenerDestroy_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t listener = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_pinglistener_destroy")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(listener);
    } else {
        errno = ENOSYS;
    }
#else
    (void)listener;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectAddchild_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(proxyobj, child);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)proxyobj;
    (void)child;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectAddinterface_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(proxyobj, iface);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)proxyobj;
    (void)iface;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectAddinterfaceByName_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(proxyobj, name);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)proxyobj;
    (void)name;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectCopy_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t source = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_proxybusobject_copy")));
    }
    int64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(source);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)source;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectCreate_napi(const Napi::CallbackInfo& km_info) {
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
    int64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(bus, service, path, sessionid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bus;
    (void)service;
    (void)path;
    (void)sessionid;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectCreateSecure_napi(const Napi::CallbackInfo& km_info) {
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
    int64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(bus, service, path, sessionid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bus;
    (void)service;
    (void)path;
    (void)sessionid;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectDestroy_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t proxyobj = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_proxybusobject_destroy")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(proxyobj);
    } else {
        errno = ENOSYS;
    }
#else
    (void)proxyobj;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectEnablepropertycaching_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t proxyobj = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_proxybusobject_enablepropertycaching")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(proxyobj);
    } else {
        errno = ENOSYS;
    }
#else
    (void)proxyobj;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectGetallproperties_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(proxyobj, iface, values);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)proxyobj;
    (void)iface;
    (void)values;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectGetallpropertiesasync_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(proxyobj, iface, callback, timeout, context);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)proxyobj;
    (void)iface;
    (void)callback;
    (void)timeout;
    (void)context;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectGetchild_napi(const Napi::CallbackInfo& km_info) {
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
    int64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(proxyobj, path);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)proxyobj;
    (void)path;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectGetchildren_napi(const Napi::CallbackInfo& km_info) {
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
    uint64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(proxyobj, children, numchildren);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)proxyobj;
    (void)children;
    (void)numchildren;
    errno = ENOSYS;
    uint64_t km_res = 0;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<uint64_t>(km_res)));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectGetinterface_napi(const Napi::CallbackInfo& km_info) {
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
    int64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(proxyobj, iface);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)proxyobj;
    (void)iface;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectGetinterfaces_napi(const Napi::CallbackInfo& km_info) {
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
    uint64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(proxyobj, ifaces, numifaces);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)proxyobj;
    (void)ifaces;
    (void)numifaces;
    errno = ENOSYS;
    uint64_t km_res = 0;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<uint64_t>(km_res)));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectGetpath_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t proxyobj = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_proxybusobject_getpath")));
    }
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(proxyobj);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
#else
    (void)proxyobj;
    errno = ENOSYS;
    void* km_res = nullptr;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectGetproperty_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(proxyobj, iface, property, value);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)proxyobj;
    (void)iface;
    (void)property;
    (void)value;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectGetpropertyasync_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(proxyobj, iface, property, callback, timeout, context);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)proxyobj;
    (void)iface;
    (void)property;
    (void)callback;
    (void)timeout;
    (void)context;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectGetservicename_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t proxyobj = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_proxybusobject_getservicename")));
    }
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(proxyobj);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
#else
    (void)proxyobj;
    errno = ENOSYS;
    void* km_res = nullptr;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectGetsessionid_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t proxyobj = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_proxybusobject_getsessionid")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(proxyobj);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)proxyobj;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectGetuniquename_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t proxyobj = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_proxybusobject_getuniquename")));
    }
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(proxyobj);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
#else
    (void)proxyobj;
    errno = ENOSYS;
    void* km_res = nullptr;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectImplementsinterface_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(proxyobj, iface);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)proxyobj;
    (void)iface;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectIntrospectremoteobject_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t proxyobj = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_proxybusobject_introspectremoteobject")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(proxyobj);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)proxyobj;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectIntrospectremoteobjectasync_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(proxyobj, callback, context);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)proxyobj;
    (void)callback;
    (void)context;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectIssecure_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t proxyobj = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_proxybusobject_issecure")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(proxyobj);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)proxyobj;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectIsvalid_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t proxyobj = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_proxybusobject_isvalid")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(proxyobj);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)proxyobj;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectMethodcall_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(proxyobj, ifacename, methodname, args, numargs, replymsg, timeout, flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)proxyobj;
    (void)ifacename;
    (void)methodname;
    (void)args;
    (void)numargs;
    (void)replymsg;
    (void)timeout;
    (void)flags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectMethodcallNoreply_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(proxyobj, ifacename, methodname, args, numargs, flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)proxyobj;
    (void)ifacename;
    (void)methodname;
    (void)args;
    (void)numargs;
    (void)flags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectMethodcallasync_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(proxyobj, ifacename, methodname, replyfunc, args, numargs, context, timeout, flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
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
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectParsexml_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(proxyobj, xml, identifier);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)proxyobj;
    (void)xml;
    (void)identifier;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectRefCreate_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t proxy = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_proxybusobject_ref_create")));
    }
    int64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(proxy);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)proxy;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectRefDecref_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t ref = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_proxybusobject_ref_decref")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(ref);
    } else {
        errno = ENOSYS;
    }
#else
    (void)ref;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectRefGet_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t ref = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_proxybusobject_ref_get")));
    }
    int64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(ref);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)ref;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectRefIncref_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t ref = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_proxybusobject_ref_incref")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(ref);
    } else {
        errno = ENOSYS;
    }
#else
    (void)ref;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectRegisterpropertieschangedlistener_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(proxyobj, iface, properties, numproperties, callback, context);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)proxyobj;
    (void)iface;
    (void)properties;
    (void)numproperties;
    (void)callback;
    (void)context;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectRemovechild_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(proxyobj, path);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)proxyobj;
    (void)path;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectSecureconnection_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(proxyobj, forceauth);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)proxyobj;
    (void)forceauth;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectSecureconnectionasync_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(proxyobj, forceauth);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)proxyobj;
    (void)forceauth;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectSetproperty_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(proxyobj, iface, property, value);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)proxyobj;
    (void)iface;
    (void)property;
    (void)value;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectSetpropertyasync_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(proxyobj, iface, property, value, callback, timeout, context);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)proxyobj;
    (void)iface;
    (void)property;
    (void)value;
    (void)callback;
    (void)timeout;
    (void)context;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectUnregisterpropertieschangedlistener_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(proxyobj, iface, callback);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)proxyobj;
    (void)iface;
    (void)callback;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynRouterinit_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_routerinit")));
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

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynRouterinitwithconfig_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* configxml = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_routerinitwithconfig")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(configxml);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)configxml;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynRoutershutdown_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_routershutdown")));
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

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyClaim_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(proxy, cakey, identitycertificatechain, groupid, groupsize, groupauthority, manifestsxmls, manifestscount);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)proxy;
    (void)cakey;
    (void)identitycertificatechain;
    (void)groupid;
    (void)groupsize;
    (void)groupauthority;
    (void)manifestsxmls;
    (void)manifestscount;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyComputemanifestdigest_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(unsignedmanifestxml, identitycertificatepem, digest, digestsize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)unsignedmanifestxml;
    (void)identitycertificatepem;
    (void)digest;
    (void)digestsize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyCreate_napi(const Napi::CallbackInfo& km_info) {
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
    int64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(bus, appbusname, sessionid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bus;
    (void)appbusname;
    (void)sessionid;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyDestroy_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t proxy = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_securityapplicationproxy_destroy")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(proxy);
    } else {
        errno = ENOSYS;
    }
#else
    (void)proxy;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyDigestDestroy_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* digest = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_securityapplicationproxy_digest_destroy")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(digest);
    } else {
        errno = ENOSYS;
    }
#else
    (void)digest;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyEccpublickeyDestroy_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* eccpublickey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_securityapplicationproxy_eccpublickey_destroy")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(eccpublickey);
    } else {
        errno = ENOSYS;
    }
#else
    (void)eccpublickey;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyEndmanagement_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t proxy = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_securityapplicationproxy_endmanagement")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(proxy);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)proxy;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyGetapplicationstate_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(proxy, applicationstate);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)proxy;
    (void)applicationstate;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyGetclaimcapabilities_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(proxy, capabilities);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)proxy;
    (void)capabilities;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyGetclaimcapabilitiesadditionalinfo_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(proxy, additionalinfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)proxy;
    (void)additionalinfo;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyGetdefaultpolicy_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(proxy, policyxml);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)proxy;
    (void)policyxml;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyGeteccpublickey_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(proxy, eccpublickey);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)proxy;
    (void)eccpublickey;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyGetmanifesttemplate_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(proxy, manifesttemplatexml);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)proxy;
    (void)manifesttemplatexml;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyGetpermissionmanagementsessionport_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef uint16_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_securityapplicationproxy_getpermissionmanagementsessionport")));
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

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyGetpolicy_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(proxy, policyxml);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)proxy;
    (void)policyxml;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyInstallmembership_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(proxy, membershipcertificatechain);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)proxy;
    (void)membershipcertificatechain;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyManifestDestroy_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* signedmanifestxml = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_securityapplicationproxy_manifest_destroy")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(signedmanifestxml);
    } else {
        errno = ENOSYS;
    }
#else
    (void)signedmanifestxml;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyManifesttemplateDestroy_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* manifesttemplatexml = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_securityapplicationproxy_manifesttemplate_destroy")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(manifesttemplatexml);
    } else {
        errno = ENOSYS;
    }
#else
    (void)manifesttemplatexml;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyPolicyDestroy_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* policyxml = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_securityapplicationproxy_policy_destroy")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(policyxml);
    } else {
        errno = ENOSYS;
    }
#else
    (void)policyxml;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyReset_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t proxy = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_securityapplicationproxy_reset")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(proxy);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)proxy;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyResetpolicy_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t proxy = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_securityapplicationproxy_resetpolicy")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(proxy);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)proxy;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxySetmanifestsignature_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(unsignedmanifestxml, identitycertificatepem, signature, signaturesize, signedmanifestxml);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)unsignedmanifestxml;
    (void)identitycertificatepem;
    (void)signature;
    (void)signaturesize;
    (void)signedmanifestxml;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxySignmanifest_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(unsignedmanifestxml, identitycertificatepem, signingprivatekeypem, signedmanifestxml);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)unsignedmanifestxml;
    (void)identitycertificatepem;
    (void)signingprivatekeypem;
    (void)signedmanifestxml;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyStartmanagement_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t proxy = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_securityapplicationproxy_startmanagement")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(proxy);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)proxy;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyUpdateidentity_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(proxy, identitycertificatechain, manifestsxmls, manifestscount);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)proxy;
    (void)identitycertificatechain;
    (void)manifestsxmls;
    (void)manifestscount;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyUpdatepolicy_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(proxy, policyxml);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)proxy;
    (void)policyxml;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynSessionlistenerCreate_napi(const Napi::CallbackInfo& km_info) {
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
    int64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(callbacks, context);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)callbacks;
    (void)context;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynSessionlistenerDestroy_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t listener = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_sessionlistener_destroy")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(listener);
    } else {
        errno = ENOSYS;
    }
#else
    (void)listener;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynSessionoptsCmp_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(one, other);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)one;
    (void)other;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynSessionoptsCreate_napi(const Napi::CallbackInfo& km_info) {
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
    int64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(traffic, ismultipoint, proximity, transports);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)traffic;
    (void)ismultipoint;
    (void)proximity;
    (void)transports;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynSessionoptsDestroy_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t opts = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_sessionopts_destroy")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(opts);
    } else {
        errno = ENOSYS;
    }
#else
    (void)opts;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynSessionoptsGetMultipoint_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t opts = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_sessionopts_get_multipoint")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(opts);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)opts;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynSessionoptsGetProximity_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t opts = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef uint8_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_sessionopts_get_proximity")));
    }
    uint8_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(opts);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)opts;
    errno = ENOSYS;
    uint8_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynSessionoptsGetTraffic_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t opts = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef uint8_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_sessionopts_get_traffic")));
    }
    uint8_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(opts);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)opts;
    errno = ENOSYS;
    uint8_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynSessionoptsGetTransports_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t opts = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef uint16_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_sessionopts_get_transports")));
    }
    uint16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(opts);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)opts;
    errno = ENOSYS;
    uint16_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynSessionoptsIscompatible_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(one, other);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)one;
    (void)other;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynSessionoptsSetMultipoint_napi(const Napi::CallbackInfo& km_info) {
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
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(opts, ismultipoint);
    } else {
        errno = ENOSYS;
    }
#else
    (void)opts;
    (void)ismultipoint;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynSessionoptsSetProximity_napi(const Napi::CallbackInfo& km_info) {
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
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(opts, proximity);
    } else {
        errno = ENOSYS;
    }
#else
    (void)opts;
    (void)proximity;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynSessionoptsSetTraffic_napi(const Napi::CallbackInfo& km_info) {
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
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(opts, traffic);
    } else {
        errno = ENOSYS;
    }
#else
    (void)opts;
    (void)traffic;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynSessionoptsSetTransports_napi(const Napi::CallbackInfo& km_info) {
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
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(opts, transports);
    } else {
        errno = ENOSYS;
    }
#else
    (void)opts;
    (void)transports;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynSessionportlistenerCreate_napi(const Napi::CallbackInfo& km_info) {
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
    int64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(callbacks, context);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)callbacks;
    (void)context;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynSessionportlistenerDestroy_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t listener = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_sessionportlistener_destroy")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(listener);
    } else {
        errno = ENOSYS;
    }
#else
    (void)listener;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynShutdown_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_shutdown")));
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

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynUnityDeferredCallbacksProcess_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_unity_deferred_callbacks_process")));
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

static Napi::Value windowssysWindowsWin32DevicesAlljoynAlljoynUnitySetDeferredCallbackMainthreadOnly_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t mainthreadOnly = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "alljoyn_unity_set_deferred_callback_mainthread_only")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(mainthreadOnly);
    } else {
        errno = ENOSYS;
    }
#else
    (void)mainthreadOnly;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static void register_windows_win32_devices_alljoyn_napi(Napi::Env env, Napi::Object exports) {
    exports.Set("windowssysWindowsWin32DevicesAlljoynAllJoynAcceptBusConnection", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAllJoynAcceptBusConnection_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAllJoynCloseBusHandle", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAllJoynCloseBusHandle_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAllJoynConnectToBus", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAllJoynConnectToBus_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAllJoynCreateBus", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAllJoynCreateBus_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAllJoynEnumEvents", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAllJoynEnumEvents_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAllJoynEventSelect", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAllJoynEventSelect_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAllJoynReceiveFromBus", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAllJoynReceiveFromBus_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAllJoynSendToBus", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAllJoynSendToBus_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynQccStatusText", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynQccStatusText_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataCreate", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataCreate_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataCreateEmpty", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataCreateEmpty_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataCreateFull", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataCreateFull_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataCreatefrommsgarg", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataCreatefrommsgarg_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataCreatefromxml", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataCreatefromxml_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataDestroy", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataDestroy_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetaboutdata", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetaboutdata_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetajsoftwareversion", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetajsoftwareversion_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetannouncedaboutdata", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetannouncedaboutdata_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetappid", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetappid_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetappname", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetappname_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetdateofmanufacture", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetdateofmanufacture_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetdefaultlanguage", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetdefaultlanguage_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetdescription", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetdescription_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetdeviceid", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetdeviceid_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetdevicename", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetdevicename_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetfield", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetfield_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetfields", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetfields_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetfieldsignature", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetfieldsignature_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGethardwareversion", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGethardwareversion_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetmanufacturer", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetmanufacturer_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetmodelnumber", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetmodelnumber_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetsoftwareversion", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetsoftwareversion_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetsupportedlanguages", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetsupportedlanguages_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetsupporturl", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetsupporturl_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataIsfieldannounced", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataIsfieldannounced_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataIsfieldlocalized", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataIsfieldlocalized_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataIsfieldrequired", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataIsfieldrequired_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataIsvalid", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataIsvalid_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSetappid", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSetappid_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSetappidFromstring", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSetappidFromstring_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSetappname", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSetappname_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSetdateofmanufacture", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSetdateofmanufacture_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSetdefaultlanguage", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSetdefaultlanguage_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSetdescription", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSetdescription_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSetdeviceid", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSetdeviceid_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSetdevicename", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSetdevicename_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSetfield", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSetfield_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSethardwareversion", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSethardwareversion_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSetmanufacturer", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSetmanufacturer_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSetmodelnumber", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSetmodelnumber_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSetsoftwareversion", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSetsoftwareversion_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSetsupportedlanguage", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSetsupportedlanguage_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSetsupporturl", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSetsupporturl_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynAboutdatalistenerCreate", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynAboutdatalistenerCreate_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynAboutdatalistenerDestroy", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynAboutdatalistenerDestroy_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynAbouticonClear", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynAbouticonClear_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynAbouticonCreate", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynAbouticonCreate_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynAbouticonDestroy", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynAbouticonDestroy_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynAbouticonGetcontent", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynAbouticonGetcontent_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynAbouticonGeturl", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynAbouticonGeturl_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynAbouticonSetcontent", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynAbouticonSetcontent_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynAbouticonSetcontentFrommsgarg", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynAbouticonSetcontentFrommsgarg_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynAbouticonSeturl", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynAbouticonSeturl_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynAbouticonobjCreate", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynAbouticonobjCreate_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynAbouticonobjDestroy", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynAbouticonobjDestroy_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynAbouticonproxyCreate", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynAbouticonproxyCreate_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynAbouticonproxyDestroy", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynAbouticonproxyDestroy_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynAbouticonproxyGeticon", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynAbouticonproxyGeticon_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynAbouticonproxyGetversion", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynAbouticonproxyGetversion_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynAboutlistenerCreate", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynAboutlistenerCreate_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynAboutlistenerDestroy", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynAboutlistenerDestroy_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynAboutobjAnnounce", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynAboutobjAnnounce_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynAboutobjAnnounceUsingDatalistener", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynAboutobjAnnounceUsingDatalistener_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynAboutobjCreate", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynAboutobjCreate_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynAboutobjDestroy", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynAboutobjDestroy_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynAboutobjUnannounce", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynAboutobjUnannounce_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynAboutobjectdescriptionClear", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynAboutobjectdescriptionClear_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynAboutobjectdescriptionCreate", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynAboutobjectdescriptionCreate_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynAboutobjectdescriptionCreateFull", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynAboutobjectdescriptionCreateFull_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynAboutobjectdescriptionCreatefrommsgarg", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynAboutobjectdescriptionCreatefrommsgarg_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynAboutobjectdescriptionDestroy", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynAboutobjectdescriptionDestroy_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynAboutobjectdescriptionGetinterfacepaths", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynAboutobjectdescriptionGetinterfacepaths_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynAboutobjectdescriptionGetinterfaces", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynAboutobjectdescriptionGetinterfaces_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynAboutobjectdescriptionGetmsgarg", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynAboutobjectdescriptionGetmsgarg_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynAboutobjectdescriptionGetpaths", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynAboutobjectdescriptionGetpaths_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynAboutobjectdescriptionHasinterface", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynAboutobjectdescriptionHasinterface_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynAboutobjectdescriptionHasinterfaceatpath", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynAboutobjectdescriptionHasinterfaceatpath_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynAboutobjectdescriptionHaspath", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynAboutobjectdescriptionHaspath_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynAboutproxyCreate", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynAboutproxyCreate_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynAboutproxyDestroy", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynAboutproxyDestroy_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynAboutproxyGetaboutdata", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynAboutproxyGetaboutdata_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynAboutproxyGetobjectdescription", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynAboutproxyGetobjectdescription_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynAboutproxyGetversion", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynAboutproxyGetversion_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynApplicationstatelistenerCreate", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynApplicationstatelistenerCreate_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynApplicationstatelistenerDestroy", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynApplicationstatelistenerDestroy_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynAuthlistenerCreate", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynAuthlistenerCreate_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynAuthlistenerDestroy", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynAuthlistenerDestroy_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynAuthlistenerRequestcredentialsresponse", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynAuthlistenerRequestcredentialsresponse_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynAuthlistenerSetsharedsecret", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynAuthlistenerSetsharedsecret_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynAuthlistenerVerifycredentialsresponse", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynAuthlistenerVerifycredentialsresponse_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynAuthlistenerasyncCreate", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynAuthlistenerasyncCreate_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynAuthlistenerasyncDestroy", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynAuthlistenerasyncDestroy_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynAutopingerAdddestination", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynAutopingerAdddestination_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynAutopingerAddpinggroup", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynAutopingerAddpinggroup_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynAutopingerCreate", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynAutopingerCreate_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynAutopingerDestroy", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynAutopingerDestroy_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynAutopingerPause", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynAutopingerPause_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynAutopingerRemovedestination", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynAutopingerRemovedestination_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynAutopingerRemovepinggroup", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynAutopingerRemovepinggroup_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynAutopingerResume", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynAutopingerResume_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynAutopingerSetpinginterval", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynAutopingerSetpinginterval_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentAddlogonentry", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentAddlogonentry_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentAddmatch", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentAddmatch_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentAdvertisename", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentAdvertisename_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentBindsessionport", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentBindsessionport_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentCanceladvertisename", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentCanceladvertisename_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentCancelfindadvertisedname", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentCancelfindadvertisedname_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentCancelfindadvertisednamebytransport", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentCancelfindadvertisednamebytransport_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentCancelwhoimplementsInterface", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentCancelwhoimplementsInterface_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentCancelwhoimplementsInterfaces", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentCancelwhoimplementsInterfaces_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentClearkeys", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentClearkeys_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentClearkeystore", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentClearkeystore_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentConnect", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentConnect_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentCreate", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentCreate_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentCreateConcurrency", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentCreateConcurrency_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentCreateinterface", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentCreateinterface_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentCreateinterfaceSecure", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentCreateinterfaceSecure_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentCreateinterfacesfromxml", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentCreateinterfacesfromxml_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentDeletedefaultkeystore", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentDeletedefaultkeystore_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentDeleteinterface", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentDeleteinterface_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentDestroy", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentDestroy_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentDisconnect", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentDisconnect_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentEnableconcurrentcallbacks", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentEnableconcurrentcallbacks_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentEnablepeersecurity", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentEnablepeersecurity_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentEnablepeersecuritywithpermissionconfigurationlistener", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentEnablepeersecuritywithpermissionconfigurationlistener_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentFindadvertisedname", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentFindadvertisedname_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentFindadvertisednamebytransport", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentFindadvertisednamebytransport_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentGetalljoyndebugobj", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentGetalljoyndebugobj_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentGetalljoynproxyobj", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentGetalljoynproxyobj_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentGetconcurrency", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentGetconcurrency_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentGetconnectspec", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentGetconnectspec_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentGetdbusproxyobj", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentGetdbusproxyobj_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentGetglobalguidstring", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentGetglobalguidstring_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentGetinterface", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentGetinterface_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentGetinterfaces", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentGetinterfaces_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentGetkeyexpiration", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentGetkeyexpiration_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentGetpeerguid", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentGetpeerguid_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentGetpermissionconfigurator", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentGetpermissionconfigurator_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentGettimestamp", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentGettimestamp_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentGetuniquename", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentGetuniquename_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentIsconnected", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentIsconnected_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentIspeersecurityenabled", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentIspeersecurityenabled_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentIsstarted", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentIsstarted_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentIsstopping", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentIsstopping_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentJoin", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentJoin_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentJoinsession", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentJoinsession_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentJoinsessionasync", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentJoinsessionasync_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentLeavesession", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentLeavesession_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentNamehasowner", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentNamehasowner_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentPing", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentPing_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentRegisteraboutlistener", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentRegisteraboutlistener_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentRegisterapplicationstatelistener", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentRegisterapplicationstatelistener_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentRegisterbuslistener", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentRegisterbuslistener_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentRegisterbusobject", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentRegisterbusobject_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentRegisterbusobjectSecure", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentRegisterbusobjectSecure_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentRegisterkeystorelistener", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentRegisterkeystorelistener_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentReleasename", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentReleasename_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentReloadkeystore", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentReloadkeystore_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentRemovematch", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentRemovematch_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentRemovesessionmember", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentRemovesessionmember_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentRequestname", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentRequestname_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentSecureconnection", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentSecureconnection_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentSecureconnectionasync", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentSecureconnectionasync_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentSetdaemondebug", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentSetdaemondebug_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentSetkeyexpiration", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentSetkeyexpiration_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentSetlinktimeout", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentSetlinktimeout_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentSetlinktimeoutasync", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentSetlinktimeoutasync_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentSetsessionlistener", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentSetsessionlistener_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentStart", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentStart_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentStop", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentStop_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentUnbindsessionport", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentUnbindsessionport_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentUnregisteraboutlistener", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentUnregisteraboutlistener_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentUnregisterallaboutlisteners", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentUnregisterallaboutlisteners_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentUnregisterallhandlers", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentUnregisterallhandlers_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentUnregisterapplicationstatelistener", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentUnregisterapplicationstatelistener_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentUnregisterbuslistener", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentUnregisterbuslistener_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentUnregisterbusobject", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentUnregisterbusobject_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentWhoimplementsInterface", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentWhoimplementsInterface_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentWhoimplementsInterfaces", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentWhoimplementsInterfaces_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynBuslistenerCreate", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynBuslistenerCreate_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynBuslistenerDestroy", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynBuslistenerDestroy_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectAddinterface", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectAddinterface_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectAddinterfaceAnnounced", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectAddinterfaceAnnounced_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectAddmethodhandlers", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectAddmethodhandlers_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectCancelsessionlessmessage", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectCancelsessionlessmessage_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectCancelsessionlessmessageSerial", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectCancelsessionlessmessageSerial_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectCreate", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectCreate_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectDestroy", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectDestroy_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectEmitpropertieschanged", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectEmitpropertieschanged_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectEmitpropertychanged", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectEmitpropertychanged_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectGetannouncedinterfacenames", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectGetannouncedinterfacenames_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectGetbusattachment", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectGetbusattachment_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectGetname", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectGetname_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectGetpath", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectGetpath_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectIssecure", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectIssecure_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectMethodreplyArgs", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectMethodreplyArgs_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectMethodreplyErr", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectMethodreplyErr_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectMethodreplyStatus", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectMethodreplyStatus_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectSetannounceflag", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectSetannounceflag_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynCredentialsClear", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynCredentialsClear_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynCredentialsCreate", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynCredentialsCreate_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynCredentialsDestroy", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynCredentialsDestroy_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynCredentialsGetcertchain", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynCredentialsGetcertchain_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynCredentialsGetexpiration", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynCredentialsGetexpiration_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynCredentialsGetlogonentry", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynCredentialsGetlogonentry_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynCredentialsGetpassword", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynCredentialsGetpassword_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynCredentialsGetprivateKey", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynCredentialsGetprivateKey_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynCredentialsGetusername", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynCredentialsGetusername_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynCredentialsIsset", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynCredentialsIsset_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynCredentialsSetcertchain", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynCredentialsSetcertchain_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynCredentialsSetexpiration", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynCredentialsSetexpiration_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynCredentialsSetlogonentry", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynCredentialsSetlogonentry_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynCredentialsSetpassword", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynCredentialsSetpassword_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynCredentialsSetprivatekey", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynCredentialsSetprivatekey_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynCredentialsSetusername", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynCredentialsSetusername_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynGetbuildinfo", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynGetbuildinfo_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynGetnumericversion", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynGetnumericversion_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynGetversion", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynGetversion_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynInit", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynInit_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionActivate", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionActivate_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionAddannotation", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionAddannotation_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionAddargannotation", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionAddargannotation_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionAddmember", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionAddmember_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionAddmemberannotation", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionAddmemberannotation_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionAddmethod", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionAddmethod_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionAddproperty", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionAddproperty_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionAddpropertyannotation", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionAddpropertyannotation_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionAddsignal", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionAddsignal_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionEql", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionEql_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetannotation", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetannotation_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetannotationatindex", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetannotationatindex_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetannotationscount", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetannotationscount_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetargdescriptionforlanguage", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetargdescriptionforlanguage_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetdescriptionforlanguage", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetdescriptionforlanguage_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetdescriptionlanguages", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetdescriptionlanguages_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetdescriptionlanguages2", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetdescriptionlanguages2_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetdescriptiontranslationcallback", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetdescriptiontranslationcallback_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetmember", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetmember_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetmemberannotation", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetmemberannotation_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetmemberargannotation", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetmemberargannotation_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetmemberdescriptionforlanguage", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetmemberdescriptionforlanguage_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetmembers", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetmembers_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetmethod", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetmethod_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetname", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetname_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetproperties", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetproperties_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetproperty", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetproperty_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetpropertyannotation", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetpropertyannotation_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetpropertydescriptionforlanguage", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetpropertydescriptionforlanguage_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetsecuritypolicy", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetsecuritypolicy_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetsignal", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetsignal_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionHasdescription", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionHasdescription_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionHasmember", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionHasmember_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionHasproperties", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionHasproperties_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionHasproperty", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionHasproperty_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionIntrospect", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionIntrospect_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionIssecure", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionIssecure_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionSetargdescription", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionSetargdescription_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionSetargdescriptionforlanguage", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionSetargdescriptionforlanguage_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionSetdescription", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionSetdescription_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionSetdescriptionforlanguage", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionSetdescriptionforlanguage_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionSetdescriptionlanguage", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionSetdescriptionlanguage_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionSetdescriptiontranslationcallback", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionSetdescriptiontranslationcallback_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionSetmemberdescription", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionSetmemberdescription_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionSetmemberdescriptionforlanguage", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionSetmemberdescriptionforlanguage_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionSetpropertydescription", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionSetpropertydescription_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionSetpropertydescriptionforlanguage", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionSetpropertydescriptionforlanguage_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynKeystorelistenerCreate", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynKeystorelistenerCreate_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynKeystorelistenerDestroy", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynKeystorelistenerDestroy_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynKeystorelistenerGetkeys", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynKeystorelistenerGetkeys_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynKeystorelistenerPutkeys", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynKeystorelistenerPutkeys_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynKeystorelistenerWithSynchronizationCreate", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynKeystorelistenerWithSynchronizationCreate_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynMessageCreate", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynMessageCreate_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynMessageDescription", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynMessageDescription_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynMessageDestroy", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynMessageDestroy_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynMessageEql", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynMessageEql_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynMessageGetarg", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynMessageGetarg_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynMessageGetargs", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynMessageGetargs_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynMessageGetauthmechanism", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynMessageGetauthmechanism_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynMessageGetcallserial", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynMessageGetcallserial_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynMessageGetcompressiontoken", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynMessageGetcompressiontoken_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynMessageGetdestination", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynMessageGetdestination_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynMessageGeterrorname", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynMessageGeterrorname_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynMessageGetflags", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynMessageGetflags_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynMessageGetinterface", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynMessageGetinterface_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynMessageGetmembername", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynMessageGetmembername_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynMessageGetobjectpath", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynMessageGetobjectpath_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynMessageGetreceiveendpointname", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynMessageGetreceiveendpointname_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynMessageGetreplyserial", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynMessageGetreplyserial_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynMessageGetsender", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynMessageGetsender_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynMessageGetsessionid", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynMessageGetsessionid_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynMessageGetsignature", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynMessageGetsignature_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynMessageGettimestamp", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynMessageGettimestamp_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynMessageGettype", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynMessageGettype_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynMessageIsbroadcastsignal", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynMessageIsbroadcastsignal_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynMessageIsencrypted", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynMessageIsencrypted_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynMessageIsexpired", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynMessageIsexpired_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynMessageIsglobalbroadcast", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynMessageIsglobalbroadcast_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynMessageIssessionless", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynMessageIssessionless_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynMessageIsunreliable", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynMessageIsunreliable_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynMessageParseargs", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynMessageParseargs_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynMessageSetendianess", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynMessageSetendianess_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynMessageTostring", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynMessageTostring_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynMsgargArrayCreate", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynMsgargArrayCreate_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynMsgargArrayElement", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynMsgargArrayElement_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynMsgargArrayGet", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynMsgargArrayGet_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynMsgargArraySet", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynMsgargArraySet_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynMsgargArraySetOffset", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynMsgargArraySetOffset_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynMsgargArraySignature", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynMsgargArraySignature_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynMsgargArrayTostring", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynMsgargArrayTostring_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynMsgargClear", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynMsgargClear_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynMsgargClone", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynMsgargClone_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynMsgargCopy", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynMsgargCopy_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynMsgargCreate", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynMsgargCreate_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynMsgargCreateAndSet", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynMsgargCreateAndSet_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynMsgargDestroy", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynMsgargDestroy_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynMsgargEqual", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynMsgargEqual_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGet", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGet_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetArrayElement", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetArrayElement_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetArrayElementsignature", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetArrayElementsignature_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetArrayNumberofelements", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetArrayNumberofelements_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetBool", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetBool_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetBoolArray", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetBoolArray_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetDouble", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetDouble_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetDoubleArray", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetDoubleArray_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetInt16", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetInt16_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetInt16Array", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetInt16Array_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetInt32", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetInt32_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetInt32Array", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetInt32Array_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetInt64", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetInt64_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetInt64Array", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetInt64Array_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetObjectpath", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetObjectpath_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetSignature", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetSignature_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetString", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetString_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetUint16", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetUint16_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetUint16Array", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetUint16Array_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetUint32", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetUint32_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetUint32Array", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetUint32Array_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetUint64", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetUint64_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetUint64Array", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetUint64Array_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetUint8", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetUint8_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetUint8Array", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetUint8Array_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetVariant", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetVariant_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetVariantArray", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetVariantArray_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetdictelement", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetdictelement_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetkey", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetkey_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetmember", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetmember_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetnummembers", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetnummembers_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGettype", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGettype_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetvalue", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetvalue_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynMsgargHassignature", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynMsgargHassignature_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSet", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSet_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetAndStabilize", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetAndStabilize_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetBool", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetBool_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetBoolArray", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetBoolArray_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetDouble", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetDouble_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetDoubleArray", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetDoubleArray_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetInt16", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetInt16_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetInt16Array", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetInt16Array_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetInt32", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetInt32_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetInt32Array", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetInt32Array_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetInt64", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetInt64_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetInt64Array", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetInt64Array_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetObjectpath", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetObjectpath_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetObjectpathArray", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetObjectpathArray_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetSignature", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetSignature_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetSignatureArray", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetSignatureArray_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetString", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetString_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetStringArray", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetStringArray_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetUint16", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetUint16_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetUint16Array", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetUint16Array_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetUint32", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetUint32_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetUint32Array", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetUint32Array_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetUint64", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetUint64_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetUint64Array", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetUint64Array_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetUint8", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetUint8_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetUint8Array", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetUint8Array_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetdictentry", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetdictentry_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetstruct", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetstruct_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSignature", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSignature_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynMsgargStabilize", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynMsgargStabilize_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynMsgargTostring", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynMsgargTostring_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynObserverCreate", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynObserverCreate_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynObserverDestroy", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynObserverDestroy_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynObserverGet", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynObserverGet_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynObserverGetfirst", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynObserverGetfirst_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynObserverGetnext", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynObserverGetnext_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynObserverRegisterlistener", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynObserverRegisterlistener_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynObserverUnregisteralllisteners", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynObserverUnregisteralllisteners_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynObserverUnregisterlistener", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynObserverUnregisterlistener_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynObserverlistenerCreate", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynObserverlistenerCreate_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynObserverlistenerDestroy", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynObserverlistenerDestroy_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynPasswordmanagerSetcredentials", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynPasswordmanagerSetcredentials_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfigurationlistenerCreate", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfigurationlistenerCreate_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfigurationlistenerDestroy", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfigurationlistenerDestroy_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorCertificatechainDestroy", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorCertificatechainDestroy_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorCertificateidCleanup", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorCertificateidCleanup_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorCertificateidarrayCleanup", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorCertificateidarrayCleanup_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorClaim", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorClaim_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorEndmanagement", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorEndmanagement_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorGetapplicationstate", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorGetapplicationstate_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorGetclaimcapabilities", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorGetclaimcapabilities_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorGetclaimcapabilitiesadditionalinfo", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorGetclaimcapabilitiesadditionalinfo_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorGetdefaultclaimcapabilities", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorGetdefaultclaimcapabilities_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorGetdefaultpolicy", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorGetdefaultpolicy_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorGetidentity", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorGetidentity_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorGetidentitycertificateid", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorGetidentitycertificateid_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorGetmanifests", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorGetmanifests_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorGetmanifesttemplate", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorGetmanifesttemplate_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorGetmembershipsummaries", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorGetmembershipsummaries_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorGetpolicy", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorGetpolicy_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorGetpublickey", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorGetpublickey_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorInstallmanifests", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorInstallmanifests_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorInstallmembership", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorInstallmembership_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorManifestarrayCleanup", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorManifestarrayCleanup_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorManifesttemplateDestroy", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorManifesttemplateDestroy_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorPolicyDestroy", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorPolicyDestroy_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorPublickeyDestroy", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorPublickeyDestroy_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorRemovemembership", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorRemovemembership_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorReset", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorReset_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorResetpolicy", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorResetpolicy_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorSetapplicationstate", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorSetapplicationstate_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorSetclaimcapabilities", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorSetclaimcapabilities_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorSetclaimcapabilitiesadditionalinfo", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorSetclaimcapabilitiesadditionalinfo_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorSetmanifesttemplatefromxml", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorSetmanifesttemplatefromxml_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorStartmanagement", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorStartmanagement_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorUpdateidentity", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorUpdateidentity_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorUpdatepolicy", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorUpdatepolicy_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynPinglistenerCreate", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynPinglistenerCreate_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynPinglistenerDestroy", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynPinglistenerDestroy_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectAddchild", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectAddchild_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectAddinterface", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectAddinterface_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectAddinterfaceByName", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectAddinterfaceByName_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectCopy", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectCopy_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectCreate", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectCreate_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectCreateSecure", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectCreateSecure_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectDestroy", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectDestroy_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectEnablepropertycaching", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectEnablepropertycaching_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectGetallproperties", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectGetallproperties_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectGetallpropertiesasync", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectGetallpropertiesasync_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectGetchild", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectGetchild_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectGetchildren", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectGetchildren_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectGetinterface", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectGetinterface_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectGetinterfaces", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectGetinterfaces_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectGetpath", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectGetpath_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectGetproperty", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectGetproperty_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectGetpropertyasync", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectGetpropertyasync_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectGetservicename", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectGetservicename_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectGetsessionid", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectGetsessionid_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectGetuniquename", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectGetuniquename_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectImplementsinterface", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectImplementsinterface_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectIntrospectremoteobject", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectIntrospectremoteobject_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectIntrospectremoteobjectasync", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectIntrospectremoteobjectasync_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectIssecure", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectIssecure_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectIsvalid", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectIsvalid_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectMethodcall", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectMethodcall_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectMethodcallNoreply", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectMethodcallNoreply_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectMethodcallasync", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectMethodcallasync_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectParsexml", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectParsexml_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectRefCreate", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectRefCreate_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectRefDecref", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectRefDecref_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectRefGet", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectRefGet_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectRefIncref", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectRefIncref_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectRegisterpropertieschangedlistener", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectRegisterpropertieschangedlistener_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectRemovechild", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectRemovechild_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectSecureconnection", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectSecureconnection_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectSecureconnectionasync", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectSecureconnectionasync_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectSetproperty", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectSetproperty_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectSetpropertyasync", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectSetpropertyasync_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectUnregisterpropertieschangedlistener", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectUnregisterpropertieschangedlistener_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynRouterinit", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynRouterinit_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynRouterinitwithconfig", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynRouterinitwithconfig_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynRoutershutdown", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynRoutershutdown_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyClaim", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyClaim_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyComputemanifestdigest", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyComputemanifestdigest_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyCreate", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyCreate_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyDestroy", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyDestroy_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyDigestDestroy", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyDigestDestroy_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyEccpublickeyDestroy", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyEccpublickeyDestroy_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyEndmanagement", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyEndmanagement_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyGetapplicationstate", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyGetapplicationstate_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyGetclaimcapabilities", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyGetclaimcapabilities_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyGetclaimcapabilitiesadditionalinfo", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyGetclaimcapabilitiesadditionalinfo_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyGetdefaultpolicy", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyGetdefaultpolicy_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyGeteccpublickey", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyGeteccpublickey_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyGetmanifesttemplate", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyGetmanifesttemplate_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyGetpermissionmanagementsessionport", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyGetpermissionmanagementsessionport_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyGetpolicy", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyGetpolicy_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyInstallmembership", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyInstallmembership_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyManifestDestroy", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyManifestDestroy_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyManifesttemplateDestroy", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyManifesttemplateDestroy_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyPolicyDestroy", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyPolicyDestroy_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyReset", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyReset_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyResetpolicy", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyResetpolicy_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxySetmanifestsignature", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxySetmanifestsignature_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxySignmanifest", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxySignmanifest_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyStartmanagement", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyStartmanagement_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyUpdateidentity", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyUpdateidentity_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyUpdatepolicy", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyUpdatepolicy_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynSessionlistenerCreate", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynSessionlistenerCreate_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynSessionlistenerDestroy", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynSessionlistenerDestroy_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynSessionoptsCmp", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynSessionoptsCmp_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynSessionoptsCreate", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynSessionoptsCreate_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynSessionoptsDestroy", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynSessionoptsDestroy_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynSessionoptsGetMultipoint", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynSessionoptsGetMultipoint_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynSessionoptsGetProximity", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynSessionoptsGetProximity_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynSessionoptsGetTraffic", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynSessionoptsGetTraffic_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynSessionoptsGetTransports", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynSessionoptsGetTransports_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynSessionoptsIscompatible", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynSessionoptsIscompatible_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynSessionoptsSetMultipoint", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynSessionoptsSetMultipoint_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynSessionoptsSetProximity", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynSessionoptsSetProximity_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynSessionoptsSetTraffic", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynSessionoptsSetTraffic_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynSessionoptsSetTransports", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynSessionoptsSetTransports_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynSessionportlistenerCreate", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynSessionportlistenerCreate_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynSessionportlistenerDestroy", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynSessionportlistenerDestroy_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynShutdown", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynShutdown_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynUnityDeferredCallbacksProcess", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynUnityDeferredCallbacksProcess_napi));
    exports.Set("windowssysWindowsWin32DevicesAlljoynAlljoynUnitySetDeferredCallbackMainthreadOnly", Napi::Function::New(env, windowssysWindowsWin32DevicesAlljoynAlljoynUnitySetDeferredCallbackMainthreadOnly_napi));
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
