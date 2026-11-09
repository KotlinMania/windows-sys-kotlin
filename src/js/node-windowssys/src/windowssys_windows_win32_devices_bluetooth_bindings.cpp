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

static Napi::Value windowssys_windows_win32_devices_bluetooth_BluetoothAuthenticateDevice_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hwndparent = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* hradio = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pbtbi = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pszpasskey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t ulpasskeylength = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("bthprops.cpl");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "BluetoothAuthenticateDevice")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hwndparent, hradio, pbtbi, pszpasskey, ulpasskeylength) : 0;
#else
    (void)hwndparent;
    (void)hradio;
    (void)pbtbi;
    (void)pszpasskey;
    (void)ulpasskeylength;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_bluetooth_BluetoothAuthenticateDeviceEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hwndparentin = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* hradioin = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pbtdiinout = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pbtoobdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    int32_t authenticationrequirement = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("bthprops.cpl");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "BluetoothAuthenticateDeviceEx")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hwndparentin, hradioin, pbtdiinout, pbtoobdata, authenticationrequirement) : 0;
#else
    (void)hwndparentin;
    (void)hradioin;
    (void)pbtdiinout;
    (void)pbtoobdata;
    (void)authenticationrequirement;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_bluetooth_BluetoothAuthenticateMultipleDevices_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hwndparent = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* hradio = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t cdevices = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* rgbtdi = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("bthprops.cpl");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "BluetoothAuthenticateMultipleDevices")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hwndparent, hradio, cdevices, rgbtdi) : 0;
#else
    (void)hwndparent;
    (void)hradio;
    (void)cdevices;
    (void)rgbtdi;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_bluetooth_BluetoothDisplayDeviceProperties_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hwndparent = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pbtdi = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("bthprops.cpl");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "BluetoothDisplayDeviceProperties")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hwndparent, pbtdi) : -1;
#else
    (void)hwndparent;
    (void)pbtdi;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_bluetooth_BluetoothEnableDiscovery_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hradio = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t fenabled = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("bluetoothapis.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "BluetoothEnableDiscovery")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hradio, fenabled) : -1;
#else
    (void)hradio;
    (void)fenabled;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_bluetooth_BluetoothEnableIncomingConnections_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hradio = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t fenabled = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("bluetoothapis.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "BluetoothEnableIncomingConnections")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hradio, fenabled) : -1;
#else
    (void)hradio;
    (void)fenabled;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_bluetooth_BluetoothEnumerateInstalledServices_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hradio = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pbtdi = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pcserviceinout = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pguidservices = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("bluetoothapis.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "BluetoothEnumerateInstalledServices")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hradio, pbtdi, pcserviceinout, pguidservices) : 0;
#else
    (void)hradio;
    (void)pbtdi;
    (void)pcserviceinout;
    (void)pguidservices;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_bluetooth_BluetoothFindDeviceClose_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hfind = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("bluetoothapis.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "BluetoothFindDeviceClose")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hfind) : -1;
#else
    (void)hfind;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_bluetooth_BluetoothFindFirstDevice_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pbtsp = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pbtdi = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("bluetoothapis.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "BluetoothFindFirstDevice")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pbtsp, pbtdi) : NULL;
#else
    (void)pbtsp;
    (void)pbtdi;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_devices_bluetooth_BluetoothFindFirstRadio_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pbtfrp = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* phradio = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("bluetoothapis.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "BluetoothFindFirstRadio")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pbtfrp, phradio) : NULL;
#else
    (void)pbtfrp;
    (void)phradio;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_devices_bluetooth_BluetoothFindNextDevice_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hfind = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pbtdi = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("bluetoothapis.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "BluetoothFindNextDevice")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hfind, pbtdi) : -1;
#else
    (void)hfind;
    (void)pbtdi;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_bluetooth_BluetoothFindNextRadio_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hfind = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* phradio = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("bluetoothapis.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "BluetoothFindNextRadio")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hfind, phradio) : -1;
#else
    (void)hfind;
    (void)phradio;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_bluetooth_BluetoothFindRadioClose_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hfind = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("bluetoothapis.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "BluetoothFindRadioClose")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hfind) : -1;
#else
    (void)hfind;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_bluetooth_BluetoothGATTAbortReliableWrite_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hdevice = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t reliablewritecontext = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("bluetoothapis.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "BluetoothGATTAbortReliableWrite")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hdevice, reliablewritecontext, flags) : -1;
#else
    (void)hdevice;
    (void)reliablewritecontext;
    (void)flags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_bluetooth_BluetoothGATTBeginReliableWrite_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hdevice = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* reliablewritecontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("bluetoothapis.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "BluetoothGATTBeginReliableWrite")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hdevice, reliablewritecontext, flags) : -1;
#else
    (void)hdevice;
    (void)reliablewritecontext;
    (void)flags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_bluetooth_BluetoothGATTEndReliableWrite_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hdevice = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t reliablewritecontext = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("bluetoothapis.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "BluetoothGATTEndReliableWrite")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hdevice, reliablewritecontext, flags) : -1;
#else
    (void)hdevice;
    (void)reliablewritecontext;
    (void)flags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_bluetooth_BluetoothGATTGetCharacteristicValue_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hdevice = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* characteristic = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t characteristicvaluedatasize = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* characteristicvalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* characteristicvaluesizerequired = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("bluetoothapis.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "BluetoothGATTGetCharacteristicValue")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hdevice, characteristic, characteristicvaluedatasize, characteristicvalue, characteristicvaluesizerequired, flags) : -1;
#else
    (void)hdevice;
    (void)characteristic;
    (void)characteristicvaluedatasize;
    (void)characteristicvalue;
    (void)characteristicvaluesizerequired;
    (void)flags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_bluetooth_BluetoothGATTGetCharacteristics_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hdevice = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* service = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint16_t characteristicsbuffercount = static_cast<uint16_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* characteristicsbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* characteristicsbufferactual = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint16_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("bluetoothapis.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "BluetoothGATTGetCharacteristics")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hdevice, service, characteristicsbuffercount, characteristicsbuffer, characteristicsbufferactual, flags) : -1;
#else
    (void)hdevice;
    (void)service;
    (void)characteristicsbuffercount;
    (void)characteristicsbuffer;
    (void)characteristicsbufferactual;
    (void)flags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_bluetooth_BluetoothGATTGetDescriptorValue_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hdevice = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* descriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t descriptorvaluedatasize = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* descriptorvalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* descriptorvaluesizerequired = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("bluetoothapis.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "BluetoothGATTGetDescriptorValue")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hdevice, descriptor, descriptorvaluedatasize, descriptorvalue, descriptorvaluesizerequired, flags) : -1;
#else
    (void)hdevice;
    (void)descriptor;
    (void)descriptorvaluedatasize;
    (void)descriptorvalue;
    (void)descriptorvaluesizerequired;
    (void)flags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_bluetooth_BluetoothGATTGetDescriptors_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hdevice = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* characteristic = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint16_t descriptorsbuffercount = static_cast<uint16_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* descriptorsbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* descriptorsbufferactual = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint16_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("bluetoothapis.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "BluetoothGATTGetDescriptors")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hdevice, characteristic, descriptorsbuffercount, descriptorsbuffer, descriptorsbufferactual, flags) : -1;
#else
    (void)hdevice;
    (void)characteristic;
    (void)descriptorsbuffercount;
    (void)descriptorsbuffer;
    (void)descriptorsbufferactual;
    (void)flags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_bluetooth_BluetoothGATTGetIncludedServices_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hdevice = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* parentservice = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint16_t includedservicesbuffercount = static_cast<uint16_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* includedservicesbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* includedservicesbufferactual = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint16_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("bluetoothapis.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "BluetoothGATTGetIncludedServices")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hdevice, parentservice, includedservicesbuffercount, includedservicesbuffer, includedservicesbufferactual, flags) : -1;
#else
    (void)hdevice;
    (void)parentservice;
    (void)includedservicesbuffercount;
    (void)includedservicesbuffer;
    (void)includedservicesbufferactual;
    (void)flags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_bluetooth_BluetoothGATTGetServices_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hdevice = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint16_t servicesbuffercount = static_cast<uint16_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* servicesbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* servicesbufferactual = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint16_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("bluetoothapis.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "BluetoothGATTGetServices")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hdevice, servicesbuffercount, servicesbuffer, servicesbufferactual, flags) : -1;
#else
    (void)hdevice;
    (void)servicesbuffercount;
    (void)servicesbuffer;
    (void)servicesbufferactual;
    (void)flags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_bluetooth_BluetoothGATTRegisterEvent_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hservice = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t eventtype = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* eventparameterin = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* callback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* callbackcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* peventhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("bluetoothapis.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "BluetoothGATTRegisterEvent")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hservice, eventtype, eventparameterin, callback, callbackcontext, peventhandle, flags) : -1;
#else
    (void)hservice;
    (void)eventtype;
    (void)eventparameterin;
    (void)callback;
    (void)callbackcontext;
    (void)peventhandle;
    (void)flags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_bluetooth_BluetoothGATTSetCharacteristicValue_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hdevice = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* characteristic = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* characteristicvalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint64_t reliablewritecontext = km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0;
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("bluetoothapis.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "BluetoothGATTSetCharacteristicValue")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hdevice, characteristic, characteristicvalue, reliablewritecontext, flags) : -1;
#else
    (void)hdevice;
    (void)characteristic;
    (void)characteristicvalue;
    (void)reliablewritecontext;
    (void)flags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_bluetooth_BluetoothGATTSetDescriptorValue_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hdevice = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* descriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* descriptorvalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("bluetoothapis.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "BluetoothGATTSetDescriptorValue")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hdevice, descriptor, descriptorvalue, flags) : -1;
#else
    (void)hdevice;
    (void)descriptor;
    (void)descriptorvalue;
    (void)flags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_bluetooth_BluetoothGATTUnregisterEvent_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t eventhandle = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("bluetoothapis.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "BluetoothGATTUnregisterEvent")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(eventhandle, flags) : -1;
#else
    (void)eventhandle;
    (void)flags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_bluetooth_BluetoothGetDeviceInfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hradio = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pbtdi = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("bluetoothapis.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "BluetoothGetDeviceInfo")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hradio, pbtdi) : 0;
#else
    (void)hradio;
    (void)pbtdi;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_bluetooth_BluetoothGetRadioInfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hradio = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pradioinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("bluetoothapis.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "BluetoothGetRadioInfo")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hradio, pradioinfo) : 0;
#else
    (void)hradio;
    (void)pradioinfo;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_bluetooth_BluetoothIsConnectable_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hradio = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("bluetoothapis.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "BluetoothIsConnectable")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hradio) : -1;
#else
    (void)hradio;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_bluetooth_BluetoothIsDiscoverable_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hradio = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("bluetoothapis.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "BluetoothIsDiscoverable")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hradio) : -1;
#else
    (void)hradio;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_bluetooth_BluetoothIsVersionAvailable_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint8_t majorversion = static_cast<uint8_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint8_t minorversion = static_cast<uint8_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint8_t, uint8_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("bluetoothapis.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "BluetoothIsVersionAvailable")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(majorversion, minorversion) : -1;
#else
    (void)majorversion;
    (void)minorversion;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_bluetooth_BluetoothRegisterForAuthentication_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pbtdi = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* phreghandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pfncallback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pvparam = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("bluetoothapis.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "BluetoothRegisterForAuthentication")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pbtdi, phreghandle, pfncallback, pvparam) : 0;
#else
    (void)pbtdi;
    (void)phreghandle;
    (void)pfncallback;
    (void)pvparam;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_bluetooth_BluetoothRegisterForAuthenticationEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pbtdiin = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* phreghandleout = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pfncallbackin = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pvparam = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("bluetoothapis.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "BluetoothRegisterForAuthenticationEx")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pbtdiin, phreghandleout, pfncallbackin, pvparam) : 0;
#else
    (void)pbtdiin;
    (void)phreghandleout;
    (void)pfncallbackin;
    (void)pvparam;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_bluetooth_BluetoothRemoveDevice_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* paddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("bluetoothapis.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "BluetoothRemoveDevice")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(paddress) : 0;
#else
    (void)paddress;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_bluetooth_BluetoothSdpEnumAttributes_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* psdpstream = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t cbstreamsize = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pfncallback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pvparam = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("bluetoothapis.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "BluetoothSdpEnumAttributes")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(psdpstream, cbstreamsize, pfncallback, pvparam) : -1;
#else
    (void)psdpstream;
    (void)cbstreamsize;
    (void)pfncallback;
    (void)pvparam;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_bluetooth_BluetoothSdpGetAttributeValue_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* precordstream = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t cbrecordlength = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint16_t usattributeid = static_cast<uint16_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pattributedata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint16_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("bluetoothapis.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "BluetoothSdpGetAttributeValue")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(precordstream, cbrecordlength, usattributeid, pattributedata) : 0;
#else
    (void)precordstream;
    (void)cbrecordlength;
    (void)usattributeid;
    (void)pattributedata;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_bluetooth_BluetoothSdpGetContainerElementData_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pcontainerstream = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t cbcontainerlength = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pelement = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("bluetoothapis.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "BluetoothSdpGetContainerElementData")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pcontainerstream, cbcontainerlength, pelement, pdata) : 0;
#else
    (void)pcontainerstream;
    (void)cbcontainerlength;
    (void)pelement;
    (void)pdata;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_bluetooth_BluetoothSdpGetElementData_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* psdpstream = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t cbsdpstreamlength = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("bluetoothapis.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "BluetoothSdpGetElementData")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(psdpstream, cbsdpstreamlength, pdata) : 0;
#else
    (void)psdpstream;
    (void)cbsdpstreamlength;
    (void)pdata;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_bluetooth_BluetoothSdpGetString_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* precordstream = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t cbrecordlength = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pstringdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint16_t usstringoffset = static_cast<uint16_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* pszstring = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* pcchstringlength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint16_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("bluetoothapis.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "BluetoothSdpGetString")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(precordstream, cbrecordlength, pstringdata, usstringoffset, pszstring, pcchstringlength) : 0;
#else
    (void)precordstream;
    (void)cbrecordlength;
    (void)pstringdata;
    (void)usstringoffset;
    (void)pszstring;
    (void)pcchstringlength;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_bluetooth_BluetoothSelectDevices_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pbtsdp = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("bthprops.cpl");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "BluetoothSelectDevices")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pbtsdp) : -1;
#else
    (void)pbtsdp;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_bluetooth_BluetoothSelectDevicesFree_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pbtsdp = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("bthprops.cpl");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "BluetoothSelectDevicesFree")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pbtsdp) : -1;
#else
    (void)pbtsdp;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_bluetooth_BluetoothSendAuthenticationResponse_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hradio = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pbtdi = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pszpasskey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("bluetoothapis.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "BluetoothSendAuthenticationResponse")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hradio, pbtdi, pszpasskey) : 0;
#else
    (void)hradio;
    (void)pbtdi;
    (void)pszpasskey;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_bluetooth_BluetoothSendAuthenticationResponseEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hradioin = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pauthresponse = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("bluetoothapis.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "BluetoothSendAuthenticationResponseEx")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hradioin, pauthresponse) : 0;
#else
    (void)hradioin;
    (void)pauthresponse;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_bluetooth_BluetoothSetLocalServiceInfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hradioin = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pclassguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t ulinstance = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pserviceinfoin = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("bluetoothapis.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "BluetoothSetLocalServiceInfo")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hradioin, pclassguid, ulinstance, pserviceinfoin) : 0;
#else
    (void)hradioin;
    (void)pclassguid;
    (void)ulinstance;
    (void)pserviceinfoin;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_bluetooth_BluetoothSetServiceState_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hradio = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pbtdi = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pguidservice = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t dwserviceflags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("bluetoothapis.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "BluetoothSetServiceState")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hradio, pbtdi, pguidservice, dwserviceflags) : 0;
#else
    (void)hradio;
    (void)pbtdi;
    (void)pguidservice;
    (void)dwserviceflags;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_bluetooth_BluetoothUnregisterAuthentication_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hreghandle = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("bluetoothapis.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "BluetoothUnregisterAuthentication")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hreghandle) : -1;
#else
    (void)hreghandle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_bluetooth_BluetoothUpdateDeviceRecord_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pbtdi = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("bluetoothapis.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "BluetoothUpdateDeviceRecord")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pbtdi) : 0;
#else
    (void)pbtdi;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static void register_windows_win32_devices_bluetooth_napi(Napi::Env env, Napi::Object exports) {
    exports.Set("windowssys_windows_win32_devices_bluetooth_BluetoothAuthenticateDevice", Napi::Function::New(env, windowssys_windows_win32_devices_bluetooth_BluetoothAuthenticateDevice_napi));
    exports.Set("windowssys_windows_win32_devices_bluetooth_BluetoothAuthenticateDeviceEx", Napi::Function::New(env, windowssys_windows_win32_devices_bluetooth_BluetoothAuthenticateDeviceEx_napi));
    exports.Set("windowssys_windows_win32_devices_bluetooth_BluetoothAuthenticateMultipleDevices", Napi::Function::New(env, windowssys_windows_win32_devices_bluetooth_BluetoothAuthenticateMultipleDevices_napi));
    exports.Set("windowssys_windows_win32_devices_bluetooth_BluetoothDisplayDeviceProperties", Napi::Function::New(env, windowssys_windows_win32_devices_bluetooth_BluetoothDisplayDeviceProperties_napi));
    exports.Set("windowssys_windows_win32_devices_bluetooth_BluetoothEnableDiscovery", Napi::Function::New(env, windowssys_windows_win32_devices_bluetooth_BluetoothEnableDiscovery_napi));
    exports.Set("windowssys_windows_win32_devices_bluetooth_BluetoothEnableIncomingConnections", Napi::Function::New(env, windowssys_windows_win32_devices_bluetooth_BluetoothEnableIncomingConnections_napi));
    exports.Set("windowssys_windows_win32_devices_bluetooth_BluetoothEnumerateInstalledServices", Napi::Function::New(env, windowssys_windows_win32_devices_bluetooth_BluetoothEnumerateInstalledServices_napi));
    exports.Set("windowssys_windows_win32_devices_bluetooth_BluetoothFindDeviceClose", Napi::Function::New(env, windowssys_windows_win32_devices_bluetooth_BluetoothFindDeviceClose_napi));
    exports.Set("windowssys_windows_win32_devices_bluetooth_BluetoothFindFirstDevice", Napi::Function::New(env, windowssys_windows_win32_devices_bluetooth_BluetoothFindFirstDevice_napi));
    exports.Set("windowssys_windows_win32_devices_bluetooth_BluetoothFindFirstRadio", Napi::Function::New(env, windowssys_windows_win32_devices_bluetooth_BluetoothFindFirstRadio_napi));
    exports.Set("windowssys_windows_win32_devices_bluetooth_BluetoothFindNextDevice", Napi::Function::New(env, windowssys_windows_win32_devices_bluetooth_BluetoothFindNextDevice_napi));
    exports.Set("windowssys_windows_win32_devices_bluetooth_BluetoothFindNextRadio", Napi::Function::New(env, windowssys_windows_win32_devices_bluetooth_BluetoothFindNextRadio_napi));
    exports.Set("windowssys_windows_win32_devices_bluetooth_BluetoothFindRadioClose", Napi::Function::New(env, windowssys_windows_win32_devices_bluetooth_BluetoothFindRadioClose_napi));
    exports.Set("windowssys_windows_win32_devices_bluetooth_BluetoothGATTAbortReliableWrite", Napi::Function::New(env, windowssys_windows_win32_devices_bluetooth_BluetoothGATTAbortReliableWrite_napi));
    exports.Set("windowssys_windows_win32_devices_bluetooth_BluetoothGATTBeginReliableWrite", Napi::Function::New(env, windowssys_windows_win32_devices_bluetooth_BluetoothGATTBeginReliableWrite_napi));
    exports.Set("windowssys_windows_win32_devices_bluetooth_BluetoothGATTEndReliableWrite", Napi::Function::New(env, windowssys_windows_win32_devices_bluetooth_BluetoothGATTEndReliableWrite_napi));
    exports.Set("windowssys_windows_win32_devices_bluetooth_BluetoothGATTGetCharacteristicValue", Napi::Function::New(env, windowssys_windows_win32_devices_bluetooth_BluetoothGATTGetCharacteristicValue_napi));
    exports.Set("windowssys_windows_win32_devices_bluetooth_BluetoothGATTGetCharacteristics", Napi::Function::New(env, windowssys_windows_win32_devices_bluetooth_BluetoothGATTGetCharacteristics_napi));
    exports.Set("windowssys_windows_win32_devices_bluetooth_BluetoothGATTGetDescriptorValue", Napi::Function::New(env, windowssys_windows_win32_devices_bluetooth_BluetoothGATTGetDescriptorValue_napi));
    exports.Set("windowssys_windows_win32_devices_bluetooth_BluetoothGATTGetDescriptors", Napi::Function::New(env, windowssys_windows_win32_devices_bluetooth_BluetoothGATTGetDescriptors_napi));
    exports.Set("windowssys_windows_win32_devices_bluetooth_BluetoothGATTGetIncludedServices", Napi::Function::New(env, windowssys_windows_win32_devices_bluetooth_BluetoothGATTGetIncludedServices_napi));
    exports.Set("windowssys_windows_win32_devices_bluetooth_BluetoothGATTGetServices", Napi::Function::New(env, windowssys_windows_win32_devices_bluetooth_BluetoothGATTGetServices_napi));
    exports.Set("windowssys_windows_win32_devices_bluetooth_BluetoothGATTRegisterEvent", Napi::Function::New(env, windowssys_windows_win32_devices_bluetooth_BluetoothGATTRegisterEvent_napi));
    exports.Set("windowssys_windows_win32_devices_bluetooth_BluetoothGATTSetCharacteristicValue", Napi::Function::New(env, windowssys_windows_win32_devices_bluetooth_BluetoothGATTSetCharacteristicValue_napi));
    exports.Set("windowssys_windows_win32_devices_bluetooth_BluetoothGATTSetDescriptorValue", Napi::Function::New(env, windowssys_windows_win32_devices_bluetooth_BluetoothGATTSetDescriptorValue_napi));
    exports.Set("windowssys_windows_win32_devices_bluetooth_BluetoothGATTUnregisterEvent", Napi::Function::New(env, windowssys_windows_win32_devices_bluetooth_BluetoothGATTUnregisterEvent_napi));
    exports.Set("windowssys_windows_win32_devices_bluetooth_BluetoothGetDeviceInfo", Napi::Function::New(env, windowssys_windows_win32_devices_bluetooth_BluetoothGetDeviceInfo_napi));
    exports.Set("windowssys_windows_win32_devices_bluetooth_BluetoothGetRadioInfo", Napi::Function::New(env, windowssys_windows_win32_devices_bluetooth_BluetoothGetRadioInfo_napi));
    exports.Set("windowssys_windows_win32_devices_bluetooth_BluetoothIsConnectable", Napi::Function::New(env, windowssys_windows_win32_devices_bluetooth_BluetoothIsConnectable_napi));
    exports.Set("windowssys_windows_win32_devices_bluetooth_BluetoothIsDiscoverable", Napi::Function::New(env, windowssys_windows_win32_devices_bluetooth_BluetoothIsDiscoverable_napi));
    exports.Set("windowssys_windows_win32_devices_bluetooth_BluetoothIsVersionAvailable", Napi::Function::New(env, windowssys_windows_win32_devices_bluetooth_BluetoothIsVersionAvailable_napi));
    exports.Set("windowssys_windows_win32_devices_bluetooth_BluetoothRegisterForAuthentication", Napi::Function::New(env, windowssys_windows_win32_devices_bluetooth_BluetoothRegisterForAuthentication_napi));
    exports.Set("windowssys_windows_win32_devices_bluetooth_BluetoothRegisterForAuthenticationEx", Napi::Function::New(env, windowssys_windows_win32_devices_bluetooth_BluetoothRegisterForAuthenticationEx_napi));
    exports.Set("windowssys_windows_win32_devices_bluetooth_BluetoothRemoveDevice", Napi::Function::New(env, windowssys_windows_win32_devices_bluetooth_BluetoothRemoveDevice_napi));
    exports.Set("windowssys_windows_win32_devices_bluetooth_BluetoothSdpEnumAttributes", Napi::Function::New(env, windowssys_windows_win32_devices_bluetooth_BluetoothSdpEnumAttributes_napi));
    exports.Set("windowssys_windows_win32_devices_bluetooth_BluetoothSdpGetAttributeValue", Napi::Function::New(env, windowssys_windows_win32_devices_bluetooth_BluetoothSdpGetAttributeValue_napi));
    exports.Set("windowssys_windows_win32_devices_bluetooth_BluetoothSdpGetContainerElementData", Napi::Function::New(env, windowssys_windows_win32_devices_bluetooth_BluetoothSdpGetContainerElementData_napi));
    exports.Set("windowssys_windows_win32_devices_bluetooth_BluetoothSdpGetElementData", Napi::Function::New(env, windowssys_windows_win32_devices_bluetooth_BluetoothSdpGetElementData_napi));
    exports.Set("windowssys_windows_win32_devices_bluetooth_BluetoothSdpGetString", Napi::Function::New(env, windowssys_windows_win32_devices_bluetooth_BluetoothSdpGetString_napi));
    exports.Set("windowssys_windows_win32_devices_bluetooth_BluetoothSelectDevices", Napi::Function::New(env, windowssys_windows_win32_devices_bluetooth_BluetoothSelectDevices_napi));
    exports.Set("windowssys_windows_win32_devices_bluetooth_BluetoothSelectDevicesFree", Napi::Function::New(env, windowssys_windows_win32_devices_bluetooth_BluetoothSelectDevicesFree_napi));
    exports.Set("windowssys_windows_win32_devices_bluetooth_BluetoothSendAuthenticationResponse", Napi::Function::New(env, windowssys_windows_win32_devices_bluetooth_BluetoothSendAuthenticationResponse_napi));
    exports.Set("windowssys_windows_win32_devices_bluetooth_BluetoothSendAuthenticationResponseEx", Napi::Function::New(env, windowssys_windows_win32_devices_bluetooth_BluetoothSendAuthenticationResponseEx_napi));
    exports.Set("windowssys_windows_win32_devices_bluetooth_BluetoothSetLocalServiceInfo", Napi::Function::New(env, windowssys_windows_win32_devices_bluetooth_BluetoothSetLocalServiceInfo_napi));
    exports.Set("windowssys_windows_win32_devices_bluetooth_BluetoothSetServiceState", Napi::Function::New(env, windowssys_windows_win32_devices_bluetooth_BluetoothSetServiceState_napi));
    exports.Set("windowssys_windows_win32_devices_bluetooth_BluetoothUnregisterAuthentication", Napi::Function::New(env, windowssys_windows_win32_devices_bluetooth_BluetoothUnregisterAuthentication_napi));
    exports.Set("windowssys_windows_win32_devices_bluetooth_BluetoothUpdateDeviceRecord", Napi::Function::New(env, windowssys_windows_win32_devices_bluetooth_BluetoothUpdateDeviceRecord_napi));
}

static KmNapiRegistrarNode registrar_node = { &register_windows_win32_devices_bluetooth_napi, nullptr };
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
