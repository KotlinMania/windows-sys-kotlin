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

static Napi::Value windowssysWindowsWin32DevicesHumaninterfacedeviceDirectInput8Create_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hinst = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwversion = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* riidltf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* ppvout = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* punkouter = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dinput8.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DirectInput8Create")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hinst, dwversion, riidltf, ppvout, punkouter);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hinst;
    (void)dwversion;
    (void)riidltf;
    (void)ppvout;
    (void)punkouter;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesHumaninterfacedeviceHidDFlushQueue_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hiddeviceobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("hid.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HidD_FlushQueue")));
    }
    bool km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hiddeviceobject);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)hiddeviceobject;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssysWindowsWin32DevicesHumaninterfacedeviceHidDFreePreparsedData_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t preparseddata = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("hid.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HidD_FreePreparsedData")));
    }
    bool km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(preparseddata);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)preparseddata;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssysWindowsWin32DevicesHumaninterfacedeviceHidDGetAttributes_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hiddeviceobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* attributes = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("hid.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HidD_GetAttributes")));
    }
    bool km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hiddeviceobject, attributes);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)hiddeviceobject;
    (void)attributes;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssysWindowsWin32DevicesHumaninterfacedeviceHidDGetConfiguration_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hiddeviceobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* configuration = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t configurationlength = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("hid.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HidD_GetConfiguration")));
    }
    bool km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hiddeviceobject, configuration, configurationlength);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)hiddeviceobject;
    (void)configuration;
    (void)configurationlength;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssysWindowsWin32DevicesHumaninterfacedeviceHidDGetFeature_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hiddeviceobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* reportbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t reportbufferlength = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("hid.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HidD_GetFeature")));
    }
    bool km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hiddeviceobject, reportbuffer, reportbufferlength);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)hiddeviceobject;
    (void)reportbuffer;
    (void)reportbufferlength;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssysWindowsWin32DevicesHumaninterfacedeviceHidDGetHidGuid_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hidguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("hid.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HidD_GetHidGuid")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(hidguid);
    } else {
        errno = ENOSYS;
    }
#else
    (void)hidguid;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssysWindowsWin32DevicesHumaninterfacedeviceHidDGetIndexedString_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hiddeviceobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t stringindex = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t bufferlength = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("hid.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HidD_GetIndexedString")));
    }
    bool km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hiddeviceobject, stringindex, buffer, bufferlength);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)hiddeviceobject;
    (void)stringindex;
    (void)buffer;
    (void)bufferlength;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssysWindowsWin32DevicesHumaninterfacedeviceHidDGetInputReport_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hiddeviceobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* reportbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t reportbufferlength = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("hid.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HidD_GetInputReport")));
    }
    bool km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hiddeviceobject, reportbuffer, reportbufferlength);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)hiddeviceobject;
    (void)reportbuffer;
    (void)reportbufferlength;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssysWindowsWin32DevicesHumaninterfacedeviceHidDGetManufacturerString_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hiddeviceobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t bufferlength = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("hid.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HidD_GetManufacturerString")));
    }
    bool km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hiddeviceobject, buffer, bufferlength);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)hiddeviceobject;
    (void)buffer;
    (void)bufferlength;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssysWindowsWin32DevicesHumaninterfacedeviceHidDGetMsGenreDescriptor_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hiddeviceobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t bufferlength = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("hid.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HidD_GetMsGenreDescriptor")));
    }
    bool km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hiddeviceobject, buffer, bufferlength);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)hiddeviceobject;
    (void)buffer;
    (void)bufferlength;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssysWindowsWin32DevicesHumaninterfacedeviceHidDGetNumInputBuffers_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hiddeviceobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* numberbuffers = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("hid.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HidD_GetNumInputBuffers")));
    }
    bool km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hiddeviceobject, numberbuffers);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)hiddeviceobject;
    (void)numberbuffers;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssysWindowsWin32DevicesHumaninterfacedeviceHidDGetPhysicalDescriptor_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hiddeviceobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t bufferlength = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("hid.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HidD_GetPhysicalDescriptor")));
    }
    bool km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hiddeviceobject, buffer, bufferlength);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)hiddeviceobject;
    (void)buffer;
    (void)bufferlength;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssysWindowsWin32DevicesHumaninterfacedeviceHidDGetPreparsedData_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hiddeviceobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* preparseddata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("hid.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HidD_GetPreparsedData")));
    }
    bool km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hiddeviceobject, preparseddata);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)hiddeviceobject;
    (void)preparseddata;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssysWindowsWin32DevicesHumaninterfacedeviceHidDGetProductString_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hiddeviceobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t bufferlength = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("hid.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HidD_GetProductString")));
    }
    bool km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hiddeviceobject, buffer, bufferlength);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)hiddeviceobject;
    (void)buffer;
    (void)bufferlength;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssysWindowsWin32DevicesHumaninterfacedeviceHidDGetSerialNumberString_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hiddeviceobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t bufferlength = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("hid.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HidD_GetSerialNumberString")));
    }
    bool km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hiddeviceobject, buffer, bufferlength);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)hiddeviceobject;
    (void)buffer;
    (void)bufferlength;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssysWindowsWin32DevicesHumaninterfacedeviceHidDSetConfiguration_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hiddeviceobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* configuration = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t configurationlength = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("hid.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HidD_SetConfiguration")));
    }
    bool km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hiddeviceobject, configuration, configurationlength);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)hiddeviceobject;
    (void)configuration;
    (void)configurationlength;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssysWindowsWin32DevicesHumaninterfacedeviceHidDSetFeature_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hiddeviceobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* reportbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t reportbufferlength = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("hid.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HidD_SetFeature")));
    }
    bool km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hiddeviceobject, reportbuffer, reportbufferlength);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)hiddeviceobject;
    (void)reportbuffer;
    (void)reportbufferlength;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssysWindowsWin32DevicesHumaninterfacedeviceHidDSetNumInputBuffers_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hiddeviceobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t numberbuffers = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("hid.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HidD_SetNumInputBuffers")));
    }
    bool km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hiddeviceobject, numberbuffers);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)hiddeviceobject;
    (void)numberbuffers;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssysWindowsWin32DevicesHumaninterfacedeviceHidDSetOutputReport_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hiddeviceobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* reportbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t reportbufferlength = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("hid.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HidD_SetOutputReport")));
    }
    bool km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hiddeviceobject, reportbuffer, reportbufferlength);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)hiddeviceobject;
    (void)reportbuffer;
    (void)reportbufferlength;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetButtonArray_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t reporttype = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint16_t usagepage = static_cast<uint16_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint16_t linkcollection = static_cast<uint16_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint16_t usage = static_cast<uint16_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* buttondata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* buttondatalength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    int64_t preparseddata = km_info.Length() > 6 ? km_napi_arg_i64(km_info[6]) : 0;
    void* report = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    uint32_t reportlength = static_cast<uint32_t>(km_info.Length() > 8 ? km_info[8].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, uint16_t, uint16_t, uint16_t, void*, void*, int64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("hid.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HidP_GetButtonArray")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(reporttype, usagepage, linkcollection, usage, buttondata, buttondatalength, preparseddata, report, reportlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)reporttype;
    (void)usagepage;
    (void)linkcollection;
    (void)usage;
    (void)buttondata;
    (void)buttondatalength;
    (void)preparseddata;
    (void)report;
    (void)reportlength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetButtonCaps_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t reporttype = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* buttoncaps = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* buttoncapslength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int64_t preparseddata = km_info.Length() > 3 ? km_napi_arg_i64(km_info[3]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, void*, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("hid.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HidP_GetButtonCaps")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(reporttype, buttoncaps, buttoncapslength, preparseddata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)reporttype;
    (void)buttoncaps;
    (void)buttoncapslength;
    (void)preparseddata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetCaps_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t preparseddata = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* capabilities = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("hid.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HidP_GetCaps")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(preparseddata, capabilities);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)preparseddata;
    (void)capabilities;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetData_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t reporttype = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* datalist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* datalength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int64_t preparseddata = km_info.Length() > 3 ? km_napi_arg_i64(km_info[3]) : 0;
    void* report = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t reportlength = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, void*, int64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("hid.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HidP_GetData")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(reporttype, datalist, datalength, preparseddata, report, reportlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)reporttype;
    (void)datalist;
    (void)datalength;
    (void)preparseddata;
    (void)report;
    (void)reportlength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetExtendedAttributes_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t reporttype = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint16_t dataindex = static_cast<uint16_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int64_t preparseddata = km_info.Length() > 2 ? km_napi_arg_i64(km_info[2]) : 0;
    void* attributes = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* lengthattributes = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, uint16_t, int64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("hid.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HidP_GetExtendedAttributes")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(reporttype, dataindex, preparseddata, attributes, lengthattributes);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)reporttype;
    (void)dataindex;
    (void)preparseddata;
    (void)attributes;
    (void)lengthattributes;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetLinkCollectionNodes_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* linkcollectionnodes = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* linkcollectionnodeslength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int64_t preparseddata = km_info.Length() > 2 ? km_napi_arg_i64(km_info[2]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("hid.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HidP_GetLinkCollectionNodes")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(linkcollectionnodes, linkcollectionnodeslength, preparseddata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)linkcollectionnodes;
    (void)linkcollectionnodeslength;
    (void)preparseddata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetScaledUsageValue_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t reporttype = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint16_t usagepage = static_cast<uint16_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint16_t linkcollection = static_cast<uint16_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint16_t usage = static_cast<uint16_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* usagevalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    int64_t preparseddata = km_info.Length() > 5 ? km_napi_arg_i64(km_info[5]) : 0;
    void* report = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    uint32_t reportlength = static_cast<uint32_t>(km_info.Length() > 7 ? km_info[7].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, uint16_t, uint16_t, uint16_t, void*, int64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("hid.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HidP_GetScaledUsageValue")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(reporttype, usagepage, linkcollection, usage, usagevalue, preparseddata, report, reportlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)reporttype;
    (void)usagepage;
    (void)linkcollection;
    (void)usage;
    (void)usagevalue;
    (void)preparseddata;
    (void)report;
    (void)reportlength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetSpecificButtonCaps_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t reporttype = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint16_t usagepage = static_cast<uint16_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint16_t linkcollection = static_cast<uint16_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint16_t usage = static_cast<uint16_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* buttoncaps = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* buttoncapslength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    int64_t preparseddata = km_info.Length() > 6 ? km_napi_arg_i64(km_info[6]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, uint16_t, uint16_t, uint16_t, void*, void*, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("hid.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HidP_GetSpecificButtonCaps")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(reporttype, usagepage, linkcollection, usage, buttoncaps, buttoncapslength, preparseddata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)reporttype;
    (void)usagepage;
    (void)linkcollection;
    (void)usage;
    (void)buttoncaps;
    (void)buttoncapslength;
    (void)preparseddata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetSpecificValueCaps_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t reporttype = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint16_t usagepage = static_cast<uint16_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint16_t linkcollection = static_cast<uint16_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint16_t usage = static_cast<uint16_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* valuecaps = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* valuecapslength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    int64_t preparseddata = km_info.Length() > 6 ? km_napi_arg_i64(km_info[6]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, uint16_t, uint16_t, uint16_t, void*, void*, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("hid.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HidP_GetSpecificValueCaps")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(reporttype, usagepage, linkcollection, usage, valuecaps, valuecapslength, preparseddata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)reporttype;
    (void)usagepage;
    (void)linkcollection;
    (void)usage;
    (void)valuecaps;
    (void)valuecapslength;
    (void)preparseddata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetUsageValue_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t reporttype = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint16_t usagepage = static_cast<uint16_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint16_t linkcollection = static_cast<uint16_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint16_t usage = static_cast<uint16_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* usagevalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    int64_t preparseddata = km_info.Length() > 5 ? km_napi_arg_i64(km_info[5]) : 0;
    void* report = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    uint32_t reportlength = static_cast<uint32_t>(km_info.Length() > 7 ? km_info[7].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, uint16_t, uint16_t, uint16_t, void*, int64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("hid.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HidP_GetUsageValue")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(reporttype, usagepage, linkcollection, usage, usagevalue, preparseddata, report, reportlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)reporttype;
    (void)usagepage;
    (void)linkcollection;
    (void)usage;
    (void)usagevalue;
    (void)preparseddata;
    (void)report;
    (void)reportlength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetUsageValueArray_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t reporttype = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint16_t usagepage = static_cast<uint16_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint16_t linkcollection = static_cast<uint16_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint16_t usage = static_cast<uint16_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* usagevalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint16_t usagevaluebytelength = static_cast<uint16_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    int64_t preparseddata = km_info.Length() > 6 ? km_napi_arg_i64(km_info[6]) : 0;
    void* report = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    uint32_t reportlength = static_cast<uint32_t>(km_info.Length() > 8 ? km_info[8].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, uint16_t, uint16_t, uint16_t, void*, uint16_t, int64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("hid.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HidP_GetUsageValueArray")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(reporttype, usagepage, linkcollection, usage, usagevalue, usagevaluebytelength, preparseddata, report, reportlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)reporttype;
    (void)usagepage;
    (void)linkcollection;
    (void)usage;
    (void)usagevalue;
    (void)usagevaluebytelength;
    (void)preparseddata;
    (void)report;
    (void)reportlength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetUsages_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t reporttype = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint16_t usagepage = static_cast<uint16_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint16_t linkcollection = static_cast<uint16_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* usagelist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* usagelength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    int64_t preparseddata = km_info.Length() > 5 ? km_napi_arg_i64(km_info[5]) : 0;
    void* report = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    uint32_t reportlength = static_cast<uint32_t>(km_info.Length() > 7 ? km_info[7].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, uint16_t, uint16_t, void*, void*, int64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("hid.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HidP_GetUsages")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(reporttype, usagepage, linkcollection, usagelist, usagelength, preparseddata, report, reportlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)reporttype;
    (void)usagepage;
    (void)linkcollection;
    (void)usagelist;
    (void)usagelength;
    (void)preparseddata;
    (void)report;
    (void)reportlength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetUsagesEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t reporttype = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint16_t linkcollection = static_cast<uint16_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* buttonlist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* usagelength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    int64_t preparseddata = km_info.Length() > 4 ? km_napi_arg_i64(km_info[4]) : 0;
    void* report = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    uint32_t reportlength = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, uint16_t, void*, void*, int64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("hid.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HidP_GetUsagesEx")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(reporttype, linkcollection, buttonlist, usagelength, preparseddata, report, reportlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)reporttype;
    (void)linkcollection;
    (void)buttonlist;
    (void)usagelength;
    (void)preparseddata;
    (void)report;
    (void)reportlength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetValueCaps_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t reporttype = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* valuecaps = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* valuecapslength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int64_t preparseddata = km_info.Length() > 3 ? km_napi_arg_i64(km_info[3]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, void*, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("hid.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HidP_GetValueCaps")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(reporttype, valuecaps, valuecapslength, preparseddata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)reporttype;
    (void)valuecaps;
    (void)valuecapslength;
    (void)preparseddata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesHumaninterfacedeviceHidPInitializeReportForId_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t reporttype = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint8_t reportid = static_cast<uint8_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int64_t preparseddata = km_info.Length() > 2 ? km_napi_arg_i64(km_info[2]) : 0;
    void* report = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t reportlength = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, uint8_t, int64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("hid.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HidP_InitializeReportForID")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(reporttype, reportid, preparseddata, report, reportlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)reporttype;
    (void)reportid;
    (void)preparseddata;
    (void)report;
    (void)reportlength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesHumaninterfacedeviceHidPMaxDataListLength_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t reporttype = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    int64_t preparseddata = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int32_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("hid.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HidP_MaxDataListLength")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(reporttype, preparseddata);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)reporttype;
    (void)preparseddata;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesHumaninterfacedeviceHidPMaxUsageListLength_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t reporttype = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint16_t usagepage = static_cast<uint16_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int64_t preparseddata = km_info.Length() > 2 ? km_napi_arg_i64(km_info[2]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int32_t, uint16_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("hid.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HidP_MaxUsageListLength")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(reporttype, usagepage, preparseddata);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)reporttype;
    (void)usagepage;
    (void)preparseddata;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesHumaninterfacedeviceHidPSetButtonArray_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t reporttype = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint16_t usagepage = static_cast<uint16_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint16_t linkcollection = static_cast<uint16_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint16_t usage = static_cast<uint16_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* buttondata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint16_t buttondatalength = static_cast<uint16_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    int64_t preparseddata = km_info.Length() > 6 ? km_napi_arg_i64(km_info[6]) : 0;
    void* report = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    uint32_t reportlength = static_cast<uint32_t>(km_info.Length() > 8 ? km_info[8].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, uint16_t, uint16_t, uint16_t, void*, uint16_t, int64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("hid.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HidP_SetButtonArray")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(reporttype, usagepage, linkcollection, usage, buttondata, buttondatalength, preparseddata, report, reportlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)reporttype;
    (void)usagepage;
    (void)linkcollection;
    (void)usage;
    (void)buttondata;
    (void)buttondatalength;
    (void)preparseddata;
    (void)report;
    (void)reportlength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesHumaninterfacedeviceHidPSetData_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t reporttype = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* datalist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* datalength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int64_t preparseddata = km_info.Length() > 3 ? km_napi_arg_i64(km_info[3]) : 0;
    void* report = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t reportlength = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, void*, int64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("hid.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HidP_SetData")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(reporttype, datalist, datalength, preparseddata, report, reportlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)reporttype;
    (void)datalist;
    (void)datalength;
    (void)preparseddata;
    (void)report;
    (void)reportlength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesHumaninterfacedeviceHidPSetScaledUsageValue_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t reporttype = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint16_t usagepage = static_cast<uint16_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint16_t linkcollection = static_cast<uint16_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint16_t usage = static_cast<uint16_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    int32_t usagevalue = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    int64_t preparseddata = km_info.Length() > 5 ? km_napi_arg_i64(km_info[5]) : 0;
    void* report = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    uint32_t reportlength = static_cast<uint32_t>(km_info.Length() > 7 ? km_info[7].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, uint16_t, uint16_t, uint16_t, int32_t, int64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("hid.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HidP_SetScaledUsageValue")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(reporttype, usagepage, linkcollection, usage, usagevalue, preparseddata, report, reportlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)reporttype;
    (void)usagepage;
    (void)linkcollection;
    (void)usage;
    (void)usagevalue;
    (void)preparseddata;
    (void)report;
    (void)reportlength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesHumaninterfacedeviceHidPSetUsageValue_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t reporttype = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint16_t usagepage = static_cast<uint16_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint16_t linkcollection = static_cast<uint16_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint16_t usage = static_cast<uint16_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t usagevalue = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    int64_t preparseddata = km_info.Length() > 5 ? km_napi_arg_i64(km_info[5]) : 0;
    void* report = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    uint32_t reportlength = static_cast<uint32_t>(km_info.Length() > 7 ? km_info[7].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, uint16_t, uint16_t, uint16_t, uint32_t, int64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("hid.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HidP_SetUsageValue")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(reporttype, usagepage, linkcollection, usage, usagevalue, preparseddata, report, reportlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)reporttype;
    (void)usagepage;
    (void)linkcollection;
    (void)usage;
    (void)usagevalue;
    (void)preparseddata;
    (void)report;
    (void)reportlength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesHumaninterfacedeviceHidPSetUsageValueArray_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t reporttype = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint16_t usagepage = static_cast<uint16_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint16_t linkcollection = static_cast<uint16_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint16_t usage = static_cast<uint16_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* usagevalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint16_t usagevaluebytelength = static_cast<uint16_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    int64_t preparseddata = km_info.Length() > 6 ? km_napi_arg_i64(km_info[6]) : 0;
    void* report = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    uint32_t reportlength = static_cast<uint32_t>(km_info.Length() > 8 ? km_info[8].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, uint16_t, uint16_t, uint16_t, void*, uint16_t, int64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("hid.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HidP_SetUsageValueArray")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(reporttype, usagepage, linkcollection, usage, usagevalue, usagevaluebytelength, preparseddata, report, reportlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)reporttype;
    (void)usagepage;
    (void)linkcollection;
    (void)usage;
    (void)usagevalue;
    (void)usagevaluebytelength;
    (void)preparseddata;
    (void)report;
    (void)reportlength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesHumaninterfacedeviceHidPSetUsages_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t reporttype = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint16_t usagepage = static_cast<uint16_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint16_t linkcollection = static_cast<uint16_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* usagelist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* usagelength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    int64_t preparseddata = km_info.Length() > 5 ? km_napi_arg_i64(km_info[5]) : 0;
    void* report = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    uint32_t reportlength = static_cast<uint32_t>(km_info.Length() > 7 ? km_info[7].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, uint16_t, uint16_t, void*, void*, int64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("hid.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HidP_SetUsages")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(reporttype, usagepage, linkcollection, usagelist, usagelength, preparseddata, report, reportlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)reporttype;
    (void)usagepage;
    (void)linkcollection;
    (void)usagelist;
    (void)usagelength;
    (void)preparseddata;
    (void)report;
    (void)reportlength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesHumaninterfacedeviceHidPTranslateUsagesToI8042ScanCodes_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* changedusagelist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t usagelistlength = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t keyaction = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* modifierstate = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* insertcodesprocedure = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* insertcodescontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("hid.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HidP_TranslateUsagesToI8042ScanCodes")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(changedusagelist, usagelistlength, keyaction, modifierstate, insertcodesprocedure, insertcodescontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)changedusagelist;
    (void)usagelistlength;
    (void)keyaction;
    (void)modifierstate;
    (void)insertcodesprocedure;
    (void)insertcodescontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesHumaninterfacedeviceHidPUnsetUsages_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t reporttype = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint16_t usagepage = static_cast<uint16_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint16_t linkcollection = static_cast<uint16_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* usagelist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* usagelength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    int64_t preparseddata = km_info.Length() > 5 ? km_napi_arg_i64(km_info[5]) : 0;
    void* report = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    uint32_t reportlength = static_cast<uint32_t>(km_info.Length() > 7 ? km_info[7].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, uint16_t, uint16_t, void*, void*, int64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("hid.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HidP_UnsetUsages")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(reporttype, usagepage, linkcollection, usagelist, usagelength, preparseddata, report, reportlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)reporttype;
    (void)usagepage;
    (void)linkcollection;
    (void)usagelist;
    (void)usagelength;
    (void)preparseddata;
    (void)report;
    (void)reportlength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesHumaninterfacedeviceHidPUsageListDifference_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* previoususagelist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* currentusagelist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* breakusagelist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* makeusagelist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t usagelistlength = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("hid.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HidP_UsageListDifference")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(previoususagelist, currentusagelist, breakusagelist, makeusagelist, usagelistlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)previoususagelist;
    (void)currentusagelist;
    (void)breakusagelist;
    (void)makeusagelist;
    (void)usagelistlength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32DevicesHumaninterfacedeviceJoyConfigChanged_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "joyConfigChanged")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(dwflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)dwflags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static void register_windows_win32_devices_humaninterfacedevice_napi(Napi::Env env, Napi::Object exports) {
    exports.Set("windowssysWindowsWin32DevicesHumaninterfacedeviceDirectInput8Create", Napi::Function::New(env, windowssysWindowsWin32DevicesHumaninterfacedeviceDirectInput8Create_napi));
    exports.Set("windowssysWindowsWin32DevicesHumaninterfacedeviceHidDFlushQueue", Napi::Function::New(env, windowssysWindowsWin32DevicesHumaninterfacedeviceHidDFlushQueue_napi));
    exports.Set("windowssysWindowsWin32DevicesHumaninterfacedeviceHidDFreePreparsedData", Napi::Function::New(env, windowssysWindowsWin32DevicesHumaninterfacedeviceHidDFreePreparsedData_napi));
    exports.Set("windowssysWindowsWin32DevicesHumaninterfacedeviceHidDGetAttributes", Napi::Function::New(env, windowssysWindowsWin32DevicesHumaninterfacedeviceHidDGetAttributes_napi));
    exports.Set("windowssysWindowsWin32DevicesHumaninterfacedeviceHidDGetConfiguration", Napi::Function::New(env, windowssysWindowsWin32DevicesHumaninterfacedeviceHidDGetConfiguration_napi));
    exports.Set("windowssysWindowsWin32DevicesHumaninterfacedeviceHidDGetFeature", Napi::Function::New(env, windowssysWindowsWin32DevicesHumaninterfacedeviceHidDGetFeature_napi));
    exports.Set("windowssysWindowsWin32DevicesHumaninterfacedeviceHidDGetHidGuid", Napi::Function::New(env, windowssysWindowsWin32DevicesHumaninterfacedeviceHidDGetHidGuid_napi));
    exports.Set("windowssysWindowsWin32DevicesHumaninterfacedeviceHidDGetIndexedString", Napi::Function::New(env, windowssysWindowsWin32DevicesHumaninterfacedeviceHidDGetIndexedString_napi));
    exports.Set("windowssysWindowsWin32DevicesHumaninterfacedeviceHidDGetInputReport", Napi::Function::New(env, windowssysWindowsWin32DevicesHumaninterfacedeviceHidDGetInputReport_napi));
    exports.Set("windowssysWindowsWin32DevicesHumaninterfacedeviceHidDGetManufacturerString", Napi::Function::New(env, windowssysWindowsWin32DevicesHumaninterfacedeviceHidDGetManufacturerString_napi));
    exports.Set("windowssysWindowsWin32DevicesHumaninterfacedeviceHidDGetMsGenreDescriptor", Napi::Function::New(env, windowssysWindowsWin32DevicesHumaninterfacedeviceHidDGetMsGenreDescriptor_napi));
    exports.Set("windowssysWindowsWin32DevicesHumaninterfacedeviceHidDGetNumInputBuffers", Napi::Function::New(env, windowssysWindowsWin32DevicesHumaninterfacedeviceHidDGetNumInputBuffers_napi));
    exports.Set("windowssysWindowsWin32DevicesHumaninterfacedeviceHidDGetPhysicalDescriptor", Napi::Function::New(env, windowssysWindowsWin32DevicesHumaninterfacedeviceHidDGetPhysicalDescriptor_napi));
    exports.Set("windowssysWindowsWin32DevicesHumaninterfacedeviceHidDGetPreparsedData", Napi::Function::New(env, windowssysWindowsWin32DevicesHumaninterfacedeviceHidDGetPreparsedData_napi));
    exports.Set("windowssysWindowsWin32DevicesHumaninterfacedeviceHidDGetProductString", Napi::Function::New(env, windowssysWindowsWin32DevicesHumaninterfacedeviceHidDGetProductString_napi));
    exports.Set("windowssysWindowsWin32DevicesHumaninterfacedeviceHidDGetSerialNumberString", Napi::Function::New(env, windowssysWindowsWin32DevicesHumaninterfacedeviceHidDGetSerialNumberString_napi));
    exports.Set("windowssysWindowsWin32DevicesHumaninterfacedeviceHidDSetConfiguration", Napi::Function::New(env, windowssysWindowsWin32DevicesHumaninterfacedeviceHidDSetConfiguration_napi));
    exports.Set("windowssysWindowsWin32DevicesHumaninterfacedeviceHidDSetFeature", Napi::Function::New(env, windowssysWindowsWin32DevicesHumaninterfacedeviceHidDSetFeature_napi));
    exports.Set("windowssysWindowsWin32DevicesHumaninterfacedeviceHidDSetNumInputBuffers", Napi::Function::New(env, windowssysWindowsWin32DevicesHumaninterfacedeviceHidDSetNumInputBuffers_napi));
    exports.Set("windowssysWindowsWin32DevicesHumaninterfacedeviceHidDSetOutputReport", Napi::Function::New(env, windowssysWindowsWin32DevicesHumaninterfacedeviceHidDSetOutputReport_napi));
    exports.Set("windowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetButtonArray", Napi::Function::New(env, windowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetButtonArray_napi));
    exports.Set("windowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetButtonCaps", Napi::Function::New(env, windowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetButtonCaps_napi));
    exports.Set("windowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetCaps", Napi::Function::New(env, windowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetCaps_napi));
    exports.Set("windowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetData", Napi::Function::New(env, windowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetData_napi));
    exports.Set("windowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetExtendedAttributes", Napi::Function::New(env, windowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetExtendedAttributes_napi));
    exports.Set("windowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetLinkCollectionNodes", Napi::Function::New(env, windowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetLinkCollectionNodes_napi));
    exports.Set("windowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetScaledUsageValue", Napi::Function::New(env, windowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetScaledUsageValue_napi));
    exports.Set("windowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetSpecificButtonCaps", Napi::Function::New(env, windowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetSpecificButtonCaps_napi));
    exports.Set("windowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetSpecificValueCaps", Napi::Function::New(env, windowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetSpecificValueCaps_napi));
    exports.Set("windowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetUsageValue", Napi::Function::New(env, windowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetUsageValue_napi));
    exports.Set("windowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetUsageValueArray", Napi::Function::New(env, windowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetUsageValueArray_napi));
    exports.Set("windowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetUsages", Napi::Function::New(env, windowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetUsages_napi));
    exports.Set("windowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetUsagesEx", Napi::Function::New(env, windowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetUsagesEx_napi));
    exports.Set("windowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetValueCaps", Napi::Function::New(env, windowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetValueCaps_napi));
    exports.Set("windowssysWindowsWin32DevicesHumaninterfacedeviceHidPInitializeReportForId", Napi::Function::New(env, windowssysWindowsWin32DevicesHumaninterfacedeviceHidPInitializeReportForId_napi));
    exports.Set("windowssysWindowsWin32DevicesHumaninterfacedeviceHidPMaxDataListLength", Napi::Function::New(env, windowssysWindowsWin32DevicesHumaninterfacedeviceHidPMaxDataListLength_napi));
    exports.Set("windowssysWindowsWin32DevicesHumaninterfacedeviceHidPMaxUsageListLength", Napi::Function::New(env, windowssysWindowsWin32DevicesHumaninterfacedeviceHidPMaxUsageListLength_napi));
    exports.Set("windowssysWindowsWin32DevicesHumaninterfacedeviceHidPSetButtonArray", Napi::Function::New(env, windowssysWindowsWin32DevicesHumaninterfacedeviceHidPSetButtonArray_napi));
    exports.Set("windowssysWindowsWin32DevicesHumaninterfacedeviceHidPSetData", Napi::Function::New(env, windowssysWindowsWin32DevicesHumaninterfacedeviceHidPSetData_napi));
    exports.Set("windowssysWindowsWin32DevicesHumaninterfacedeviceHidPSetScaledUsageValue", Napi::Function::New(env, windowssysWindowsWin32DevicesHumaninterfacedeviceHidPSetScaledUsageValue_napi));
    exports.Set("windowssysWindowsWin32DevicesHumaninterfacedeviceHidPSetUsageValue", Napi::Function::New(env, windowssysWindowsWin32DevicesHumaninterfacedeviceHidPSetUsageValue_napi));
    exports.Set("windowssysWindowsWin32DevicesHumaninterfacedeviceHidPSetUsageValueArray", Napi::Function::New(env, windowssysWindowsWin32DevicesHumaninterfacedeviceHidPSetUsageValueArray_napi));
    exports.Set("windowssysWindowsWin32DevicesHumaninterfacedeviceHidPSetUsages", Napi::Function::New(env, windowssysWindowsWin32DevicesHumaninterfacedeviceHidPSetUsages_napi));
    exports.Set("windowssysWindowsWin32DevicesHumaninterfacedeviceHidPTranslateUsagesToI8042ScanCodes", Napi::Function::New(env, windowssysWindowsWin32DevicesHumaninterfacedeviceHidPTranslateUsagesToI8042ScanCodes_napi));
    exports.Set("windowssysWindowsWin32DevicesHumaninterfacedeviceHidPUnsetUsages", Napi::Function::New(env, windowssysWindowsWin32DevicesHumaninterfacedeviceHidPUnsetUsages_napi));
    exports.Set("windowssysWindowsWin32DevicesHumaninterfacedeviceHidPUsageListDifference", Napi::Function::New(env, windowssysWindowsWin32DevicesHumaninterfacedeviceHidPUsageListDifference_napi));
    exports.Set("windowssysWindowsWin32DevicesHumaninterfacedeviceJoyConfigChanged", Napi::Function::New(env, windowssysWindowsWin32DevicesHumaninterfacedeviceJoyConfigChanged_napi));
}

static KmNapiRegistrarNode registrar_node = { &register_windows_win32_devices_humaninterfacedevice_napi, nullptr };
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
