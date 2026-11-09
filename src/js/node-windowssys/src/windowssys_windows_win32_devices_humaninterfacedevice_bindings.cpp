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

static Napi::Value windowssys_windows_win32_devices_humaninterfacedevice_DirectInput8Create_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hinst, dwversion, riidltf, ppvout, punkouter) : -1;
#else
    (void)hinst;
    (void)dwversion;
    (void)riidltf;
    (void)ppvout;
    (void)punkouter;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_humaninterfacedevice_HidD_FlushQueue_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hiddeviceobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("hid.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HidD_FlushQueue")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hiddeviceobject) : false;
#else
    (void)hiddeviceobject;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_win32_devices_humaninterfacedevice_HidD_FreePreparsedData_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t preparseddata = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("hid.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HidD_FreePreparsedData")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(preparseddata) : false;
#else
    (void)preparseddata;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_win32_devices_humaninterfacedevice_HidD_GetAttributes_napi(const Napi::CallbackInfo& km_info) {
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
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hiddeviceobject, attributes) : false;
#else
    (void)hiddeviceobject;
    (void)attributes;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_win32_devices_humaninterfacedevice_HidD_GetConfiguration_napi(const Napi::CallbackInfo& km_info) {
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
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hiddeviceobject, configuration, configurationlength) : false;
#else
    (void)hiddeviceobject;
    (void)configuration;
    (void)configurationlength;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_win32_devices_humaninterfacedevice_HidD_GetFeature_napi(const Napi::CallbackInfo& km_info) {
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
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hiddeviceobject, reportbuffer, reportbufferlength) : false;
#else
    (void)hiddeviceobject;
    (void)reportbuffer;
    (void)reportbufferlength;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_win32_devices_humaninterfacedevice_HidD_GetHidGuid_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hidguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("hid.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HidD_GetHidGuid")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(hidguid);
#else
    (void)hidguid;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_devices_humaninterfacedevice_HidD_GetIndexedString_napi(const Napi::CallbackInfo& km_info) {
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
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hiddeviceobject, stringindex, buffer, bufferlength) : false;
#else
    (void)hiddeviceobject;
    (void)stringindex;
    (void)buffer;
    (void)bufferlength;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_win32_devices_humaninterfacedevice_HidD_GetInputReport_napi(const Napi::CallbackInfo& km_info) {
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
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hiddeviceobject, reportbuffer, reportbufferlength) : false;
#else
    (void)hiddeviceobject;
    (void)reportbuffer;
    (void)reportbufferlength;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_win32_devices_humaninterfacedevice_HidD_GetManufacturerString_napi(const Napi::CallbackInfo& km_info) {
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
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hiddeviceobject, buffer, bufferlength) : false;
#else
    (void)hiddeviceobject;
    (void)buffer;
    (void)bufferlength;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_win32_devices_humaninterfacedevice_HidD_GetMsGenreDescriptor_napi(const Napi::CallbackInfo& km_info) {
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
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hiddeviceobject, buffer, bufferlength) : false;
#else
    (void)hiddeviceobject;
    (void)buffer;
    (void)bufferlength;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_win32_devices_humaninterfacedevice_HidD_GetNumInputBuffers_napi(const Napi::CallbackInfo& km_info) {
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
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hiddeviceobject, numberbuffers) : false;
#else
    (void)hiddeviceobject;
    (void)numberbuffers;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_win32_devices_humaninterfacedevice_HidD_GetPhysicalDescriptor_napi(const Napi::CallbackInfo& km_info) {
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
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hiddeviceobject, buffer, bufferlength) : false;
#else
    (void)hiddeviceobject;
    (void)buffer;
    (void)bufferlength;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_win32_devices_humaninterfacedevice_HidD_GetPreparsedData_napi(const Napi::CallbackInfo& km_info) {
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
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hiddeviceobject, preparseddata) : false;
#else
    (void)hiddeviceobject;
    (void)preparseddata;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_win32_devices_humaninterfacedevice_HidD_GetProductString_napi(const Napi::CallbackInfo& km_info) {
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
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hiddeviceobject, buffer, bufferlength) : false;
#else
    (void)hiddeviceobject;
    (void)buffer;
    (void)bufferlength;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_win32_devices_humaninterfacedevice_HidD_GetSerialNumberString_napi(const Napi::CallbackInfo& km_info) {
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
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hiddeviceobject, buffer, bufferlength) : false;
#else
    (void)hiddeviceobject;
    (void)buffer;
    (void)bufferlength;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_win32_devices_humaninterfacedevice_HidD_SetConfiguration_napi(const Napi::CallbackInfo& km_info) {
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
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hiddeviceobject, configuration, configurationlength) : false;
#else
    (void)hiddeviceobject;
    (void)configuration;
    (void)configurationlength;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_win32_devices_humaninterfacedevice_HidD_SetFeature_napi(const Napi::CallbackInfo& km_info) {
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
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hiddeviceobject, reportbuffer, reportbufferlength) : false;
#else
    (void)hiddeviceobject;
    (void)reportbuffer;
    (void)reportbufferlength;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_win32_devices_humaninterfacedevice_HidD_SetNumInputBuffers_napi(const Napi::CallbackInfo& km_info) {
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
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hiddeviceobject, numberbuffers) : false;
#else
    (void)hiddeviceobject;
    (void)numberbuffers;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_win32_devices_humaninterfacedevice_HidD_SetOutputReport_napi(const Napi::CallbackInfo& km_info) {
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
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hiddeviceobject, reportbuffer, reportbufferlength) : false;
#else
    (void)hiddeviceobject;
    (void)reportbuffer;
    (void)reportbufferlength;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_win32_devices_humaninterfacedevice_HidP_GetButtonArray_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(reporttype, usagepage, linkcollection, usage, buttondata, buttondatalength, preparseddata, report, reportlength) : -1;
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
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_humaninterfacedevice_HidP_GetButtonCaps_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(reporttype, buttoncaps, buttoncapslength, preparseddata) : -1;
#else
    (void)reporttype;
    (void)buttoncaps;
    (void)buttoncapslength;
    (void)preparseddata;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_humaninterfacedevice_HidP_GetCaps_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(preparseddata, capabilities) : -1;
#else
    (void)preparseddata;
    (void)capabilities;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_humaninterfacedevice_HidP_GetData_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(reporttype, datalist, datalength, preparseddata, report, reportlength) : -1;
#else
    (void)reporttype;
    (void)datalist;
    (void)datalength;
    (void)preparseddata;
    (void)report;
    (void)reportlength;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_humaninterfacedevice_HidP_GetExtendedAttributes_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(reporttype, dataindex, preparseddata, attributes, lengthattributes) : -1;
#else
    (void)reporttype;
    (void)dataindex;
    (void)preparseddata;
    (void)attributes;
    (void)lengthattributes;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_humaninterfacedevice_HidP_GetLinkCollectionNodes_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(linkcollectionnodes, linkcollectionnodeslength, preparseddata) : -1;
#else
    (void)linkcollectionnodes;
    (void)linkcollectionnodeslength;
    (void)preparseddata;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_humaninterfacedevice_HidP_GetScaledUsageValue_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(reporttype, usagepage, linkcollection, usage, usagevalue, preparseddata, report, reportlength) : -1;
#else
    (void)reporttype;
    (void)usagepage;
    (void)linkcollection;
    (void)usage;
    (void)usagevalue;
    (void)preparseddata;
    (void)report;
    (void)reportlength;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_humaninterfacedevice_HidP_GetSpecificButtonCaps_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(reporttype, usagepage, linkcollection, usage, buttoncaps, buttoncapslength, preparseddata) : -1;
#else
    (void)reporttype;
    (void)usagepage;
    (void)linkcollection;
    (void)usage;
    (void)buttoncaps;
    (void)buttoncapslength;
    (void)preparseddata;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_humaninterfacedevice_HidP_GetSpecificValueCaps_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(reporttype, usagepage, linkcollection, usage, valuecaps, valuecapslength, preparseddata) : -1;
#else
    (void)reporttype;
    (void)usagepage;
    (void)linkcollection;
    (void)usage;
    (void)valuecaps;
    (void)valuecapslength;
    (void)preparseddata;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_humaninterfacedevice_HidP_GetUsageValue_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(reporttype, usagepage, linkcollection, usage, usagevalue, preparseddata, report, reportlength) : -1;
#else
    (void)reporttype;
    (void)usagepage;
    (void)linkcollection;
    (void)usage;
    (void)usagevalue;
    (void)preparseddata;
    (void)report;
    (void)reportlength;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_humaninterfacedevice_HidP_GetUsageValueArray_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(reporttype, usagepage, linkcollection, usage, usagevalue, usagevaluebytelength, preparseddata, report, reportlength) : -1;
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
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_humaninterfacedevice_HidP_GetUsages_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(reporttype, usagepage, linkcollection, usagelist, usagelength, preparseddata, report, reportlength) : -1;
#else
    (void)reporttype;
    (void)usagepage;
    (void)linkcollection;
    (void)usagelist;
    (void)usagelength;
    (void)preparseddata;
    (void)report;
    (void)reportlength;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_humaninterfacedevice_HidP_GetUsagesEx_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(reporttype, linkcollection, buttonlist, usagelength, preparseddata, report, reportlength) : -1;
#else
    (void)reporttype;
    (void)linkcollection;
    (void)buttonlist;
    (void)usagelength;
    (void)preparseddata;
    (void)report;
    (void)reportlength;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_humaninterfacedevice_HidP_GetValueCaps_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(reporttype, valuecaps, valuecapslength, preparseddata) : -1;
#else
    (void)reporttype;
    (void)valuecaps;
    (void)valuecapslength;
    (void)preparseddata;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_humaninterfacedevice_HidP_InitializeReportForID_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(reporttype, reportid, preparseddata, report, reportlength) : -1;
#else
    (void)reporttype;
    (void)reportid;
    (void)preparseddata;
    (void)report;
    (void)reportlength;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_humaninterfacedevice_HidP_MaxDataListLength_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(reporttype, preparseddata) : 0;
#else
    (void)reporttype;
    (void)preparseddata;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_humaninterfacedevice_HidP_MaxUsageListLength_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(reporttype, usagepage, preparseddata) : 0;
#else
    (void)reporttype;
    (void)usagepage;
    (void)preparseddata;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_humaninterfacedevice_HidP_SetButtonArray_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(reporttype, usagepage, linkcollection, usage, buttondata, buttondatalength, preparseddata, report, reportlength) : -1;
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
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_humaninterfacedevice_HidP_SetData_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(reporttype, datalist, datalength, preparseddata, report, reportlength) : -1;
#else
    (void)reporttype;
    (void)datalist;
    (void)datalength;
    (void)preparseddata;
    (void)report;
    (void)reportlength;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_humaninterfacedevice_HidP_SetScaledUsageValue_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(reporttype, usagepage, linkcollection, usage, usagevalue, preparseddata, report, reportlength) : -1;
#else
    (void)reporttype;
    (void)usagepage;
    (void)linkcollection;
    (void)usage;
    (void)usagevalue;
    (void)preparseddata;
    (void)report;
    (void)reportlength;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_humaninterfacedevice_HidP_SetUsageValue_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(reporttype, usagepage, linkcollection, usage, usagevalue, preparseddata, report, reportlength) : -1;
#else
    (void)reporttype;
    (void)usagepage;
    (void)linkcollection;
    (void)usage;
    (void)usagevalue;
    (void)preparseddata;
    (void)report;
    (void)reportlength;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_humaninterfacedevice_HidP_SetUsageValueArray_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(reporttype, usagepage, linkcollection, usage, usagevalue, usagevaluebytelength, preparseddata, report, reportlength) : -1;
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
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_humaninterfacedevice_HidP_SetUsages_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(reporttype, usagepage, linkcollection, usagelist, usagelength, preparseddata, report, reportlength) : -1;
#else
    (void)reporttype;
    (void)usagepage;
    (void)linkcollection;
    (void)usagelist;
    (void)usagelength;
    (void)preparseddata;
    (void)report;
    (void)reportlength;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_humaninterfacedevice_HidP_TranslateUsagesToI8042ScanCodes_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(changedusagelist, usagelistlength, keyaction, modifierstate, insertcodesprocedure, insertcodescontext) : -1;
#else
    (void)changedusagelist;
    (void)usagelistlength;
    (void)keyaction;
    (void)modifierstate;
    (void)insertcodesprocedure;
    (void)insertcodescontext;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_humaninterfacedevice_HidP_UnsetUsages_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(reporttype, usagepage, linkcollection, usagelist, usagelength, preparseddata, report, reportlength) : -1;
#else
    (void)reporttype;
    (void)usagepage;
    (void)linkcollection;
    (void)usagelist;
    (void)usagelength;
    (void)preparseddata;
    (void)report;
    (void)reportlength;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_humaninterfacedevice_HidP_UsageListDifference_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(previoususagelist, currentusagelist, breakusagelist, makeusagelist, usagelistlength) : -1;
#else
    (void)previoususagelist;
    (void)currentusagelist;
    (void)breakusagelist;
    (void)makeusagelist;
    (void)usagelistlength;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_humaninterfacedevice_joyConfigChanged_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "joyConfigChanged")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwflags) : 0;
#else
    (void)dwflags;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static void register_windows_win32_devices_humaninterfacedevice_napi(Napi::Env env, Napi::Object exports) {
    exports.Set("windowssys_windows_win32_devices_humaninterfacedevice_DirectInput8Create", Napi::Function::New(env, windowssys_windows_win32_devices_humaninterfacedevice_DirectInput8Create_napi));
    exports.Set("windowssys_windows_win32_devices_humaninterfacedevice_HidD_FlushQueue", Napi::Function::New(env, windowssys_windows_win32_devices_humaninterfacedevice_HidD_FlushQueue_napi));
    exports.Set("windowssys_windows_win32_devices_humaninterfacedevice_HidD_FreePreparsedData", Napi::Function::New(env, windowssys_windows_win32_devices_humaninterfacedevice_HidD_FreePreparsedData_napi));
    exports.Set("windowssys_windows_win32_devices_humaninterfacedevice_HidD_GetAttributes", Napi::Function::New(env, windowssys_windows_win32_devices_humaninterfacedevice_HidD_GetAttributes_napi));
    exports.Set("windowssys_windows_win32_devices_humaninterfacedevice_HidD_GetConfiguration", Napi::Function::New(env, windowssys_windows_win32_devices_humaninterfacedevice_HidD_GetConfiguration_napi));
    exports.Set("windowssys_windows_win32_devices_humaninterfacedevice_HidD_GetFeature", Napi::Function::New(env, windowssys_windows_win32_devices_humaninterfacedevice_HidD_GetFeature_napi));
    exports.Set("windowssys_windows_win32_devices_humaninterfacedevice_HidD_GetHidGuid", Napi::Function::New(env, windowssys_windows_win32_devices_humaninterfacedevice_HidD_GetHidGuid_napi));
    exports.Set("windowssys_windows_win32_devices_humaninterfacedevice_HidD_GetIndexedString", Napi::Function::New(env, windowssys_windows_win32_devices_humaninterfacedevice_HidD_GetIndexedString_napi));
    exports.Set("windowssys_windows_win32_devices_humaninterfacedevice_HidD_GetInputReport", Napi::Function::New(env, windowssys_windows_win32_devices_humaninterfacedevice_HidD_GetInputReport_napi));
    exports.Set("windowssys_windows_win32_devices_humaninterfacedevice_HidD_GetManufacturerString", Napi::Function::New(env, windowssys_windows_win32_devices_humaninterfacedevice_HidD_GetManufacturerString_napi));
    exports.Set("windowssys_windows_win32_devices_humaninterfacedevice_HidD_GetMsGenreDescriptor", Napi::Function::New(env, windowssys_windows_win32_devices_humaninterfacedevice_HidD_GetMsGenreDescriptor_napi));
    exports.Set("windowssys_windows_win32_devices_humaninterfacedevice_HidD_GetNumInputBuffers", Napi::Function::New(env, windowssys_windows_win32_devices_humaninterfacedevice_HidD_GetNumInputBuffers_napi));
    exports.Set("windowssys_windows_win32_devices_humaninterfacedevice_HidD_GetPhysicalDescriptor", Napi::Function::New(env, windowssys_windows_win32_devices_humaninterfacedevice_HidD_GetPhysicalDescriptor_napi));
    exports.Set("windowssys_windows_win32_devices_humaninterfacedevice_HidD_GetPreparsedData", Napi::Function::New(env, windowssys_windows_win32_devices_humaninterfacedevice_HidD_GetPreparsedData_napi));
    exports.Set("windowssys_windows_win32_devices_humaninterfacedevice_HidD_GetProductString", Napi::Function::New(env, windowssys_windows_win32_devices_humaninterfacedevice_HidD_GetProductString_napi));
    exports.Set("windowssys_windows_win32_devices_humaninterfacedevice_HidD_GetSerialNumberString", Napi::Function::New(env, windowssys_windows_win32_devices_humaninterfacedevice_HidD_GetSerialNumberString_napi));
    exports.Set("windowssys_windows_win32_devices_humaninterfacedevice_HidD_SetConfiguration", Napi::Function::New(env, windowssys_windows_win32_devices_humaninterfacedevice_HidD_SetConfiguration_napi));
    exports.Set("windowssys_windows_win32_devices_humaninterfacedevice_HidD_SetFeature", Napi::Function::New(env, windowssys_windows_win32_devices_humaninterfacedevice_HidD_SetFeature_napi));
    exports.Set("windowssys_windows_win32_devices_humaninterfacedevice_HidD_SetNumInputBuffers", Napi::Function::New(env, windowssys_windows_win32_devices_humaninterfacedevice_HidD_SetNumInputBuffers_napi));
    exports.Set("windowssys_windows_win32_devices_humaninterfacedevice_HidD_SetOutputReport", Napi::Function::New(env, windowssys_windows_win32_devices_humaninterfacedevice_HidD_SetOutputReport_napi));
    exports.Set("windowssys_windows_win32_devices_humaninterfacedevice_HidP_GetButtonArray", Napi::Function::New(env, windowssys_windows_win32_devices_humaninterfacedevice_HidP_GetButtonArray_napi));
    exports.Set("windowssys_windows_win32_devices_humaninterfacedevice_HidP_GetButtonCaps", Napi::Function::New(env, windowssys_windows_win32_devices_humaninterfacedevice_HidP_GetButtonCaps_napi));
    exports.Set("windowssys_windows_win32_devices_humaninterfacedevice_HidP_GetCaps", Napi::Function::New(env, windowssys_windows_win32_devices_humaninterfacedevice_HidP_GetCaps_napi));
    exports.Set("windowssys_windows_win32_devices_humaninterfacedevice_HidP_GetData", Napi::Function::New(env, windowssys_windows_win32_devices_humaninterfacedevice_HidP_GetData_napi));
    exports.Set("windowssys_windows_win32_devices_humaninterfacedevice_HidP_GetExtendedAttributes", Napi::Function::New(env, windowssys_windows_win32_devices_humaninterfacedevice_HidP_GetExtendedAttributes_napi));
    exports.Set("windowssys_windows_win32_devices_humaninterfacedevice_HidP_GetLinkCollectionNodes", Napi::Function::New(env, windowssys_windows_win32_devices_humaninterfacedevice_HidP_GetLinkCollectionNodes_napi));
    exports.Set("windowssys_windows_win32_devices_humaninterfacedevice_HidP_GetScaledUsageValue", Napi::Function::New(env, windowssys_windows_win32_devices_humaninterfacedevice_HidP_GetScaledUsageValue_napi));
    exports.Set("windowssys_windows_win32_devices_humaninterfacedevice_HidP_GetSpecificButtonCaps", Napi::Function::New(env, windowssys_windows_win32_devices_humaninterfacedevice_HidP_GetSpecificButtonCaps_napi));
    exports.Set("windowssys_windows_win32_devices_humaninterfacedevice_HidP_GetSpecificValueCaps", Napi::Function::New(env, windowssys_windows_win32_devices_humaninterfacedevice_HidP_GetSpecificValueCaps_napi));
    exports.Set("windowssys_windows_win32_devices_humaninterfacedevice_HidP_GetUsageValue", Napi::Function::New(env, windowssys_windows_win32_devices_humaninterfacedevice_HidP_GetUsageValue_napi));
    exports.Set("windowssys_windows_win32_devices_humaninterfacedevice_HidP_GetUsageValueArray", Napi::Function::New(env, windowssys_windows_win32_devices_humaninterfacedevice_HidP_GetUsageValueArray_napi));
    exports.Set("windowssys_windows_win32_devices_humaninterfacedevice_HidP_GetUsages", Napi::Function::New(env, windowssys_windows_win32_devices_humaninterfacedevice_HidP_GetUsages_napi));
    exports.Set("windowssys_windows_win32_devices_humaninterfacedevice_HidP_GetUsagesEx", Napi::Function::New(env, windowssys_windows_win32_devices_humaninterfacedevice_HidP_GetUsagesEx_napi));
    exports.Set("windowssys_windows_win32_devices_humaninterfacedevice_HidP_GetValueCaps", Napi::Function::New(env, windowssys_windows_win32_devices_humaninterfacedevice_HidP_GetValueCaps_napi));
    exports.Set("windowssys_windows_win32_devices_humaninterfacedevice_HidP_InitializeReportForID", Napi::Function::New(env, windowssys_windows_win32_devices_humaninterfacedevice_HidP_InitializeReportForID_napi));
    exports.Set("windowssys_windows_win32_devices_humaninterfacedevice_HidP_MaxDataListLength", Napi::Function::New(env, windowssys_windows_win32_devices_humaninterfacedevice_HidP_MaxDataListLength_napi));
    exports.Set("windowssys_windows_win32_devices_humaninterfacedevice_HidP_MaxUsageListLength", Napi::Function::New(env, windowssys_windows_win32_devices_humaninterfacedevice_HidP_MaxUsageListLength_napi));
    exports.Set("windowssys_windows_win32_devices_humaninterfacedevice_HidP_SetButtonArray", Napi::Function::New(env, windowssys_windows_win32_devices_humaninterfacedevice_HidP_SetButtonArray_napi));
    exports.Set("windowssys_windows_win32_devices_humaninterfacedevice_HidP_SetData", Napi::Function::New(env, windowssys_windows_win32_devices_humaninterfacedevice_HidP_SetData_napi));
    exports.Set("windowssys_windows_win32_devices_humaninterfacedevice_HidP_SetScaledUsageValue", Napi::Function::New(env, windowssys_windows_win32_devices_humaninterfacedevice_HidP_SetScaledUsageValue_napi));
    exports.Set("windowssys_windows_win32_devices_humaninterfacedevice_HidP_SetUsageValue", Napi::Function::New(env, windowssys_windows_win32_devices_humaninterfacedevice_HidP_SetUsageValue_napi));
    exports.Set("windowssys_windows_win32_devices_humaninterfacedevice_HidP_SetUsageValueArray", Napi::Function::New(env, windowssys_windows_win32_devices_humaninterfacedevice_HidP_SetUsageValueArray_napi));
    exports.Set("windowssys_windows_win32_devices_humaninterfacedevice_HidP_SetUsages", Napi::Function::New(env, windowssys_windows_win32_devices_humaninterfacedevice_HidP_SetUsages_napi));
    exports.Set("windowssys_windows_win32_devices_humaninterfacedevice_HidP_TranslateUsagesToI8042ScanCodes", Napi::Function::New(env, windowssys_windows_win32_devices_humaninterfacedevice_HidP_TranslateUsagesToI8042ScanCodes_napi));
    exports.Set("windowssys_windows_win32_devices_humaninterfacedevice_HidP_UnsetUsages", Napi::Function::New(env, windowssys_windows_win32_devices_humaninterfacedevice_HidP_UnsetUsages_napi));
    exports.Set("windowssys_windows_win32_devices_humaninterfacedevice_HidP_UsageListDifference", Napi::Function::New(env, windowssys_windows_win32_devices_humaninterfacedevice_HidP_UsageListDifference_napi));
    exports.Set("windowssys_windows_win32_devices_humaninterfacedevice_joyConfigChanged", Napi::Function::New(env, windowssys_windows_win32_devices_humaninterfacedevice_joyConfigChanged_napi));
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
