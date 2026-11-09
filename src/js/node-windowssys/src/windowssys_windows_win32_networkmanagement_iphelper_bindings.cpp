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

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_AddIPAddress_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t address = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t ipmask = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t ifindex = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* ntecontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* nteinstance = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "AddIPAddress")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(address, ipmask, ifindex, ntecontext, nteinstance) : 0;
#else
    (void)address;
    (void)ipmask;
    (void)ifindex;
    (void)ntecontext;
    (void)nteinstance;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_CancelIPChangeNotify_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* notifyoverlapped = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CancelIPChangeNotify")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(notifyoverlapped) : -1;
#else
    (void)notifyoverlapped;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_CancelIfTimestampConfigChange_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* notificationhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CancelIfTimestampConfigChange")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(notificationhandle);
#else
    (void)notificationhandle;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_CancelMibChangeNotify2_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* notificationhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CancelMibChangeNotify2")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(notificationhandle) : 0;
#else
    (void)notificationhandle;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_CaptureInterfaceHardwareCrossTimestamp_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* interfaceluid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* crosstimestamp = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CaptureInterfaceHardwareCrossTimestamp")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(interfaceluid, crosstimestamp) : 0;
#else
    (void)interfaceluid;
    (void)crosstimestamp;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_ConvertCompartmentGuidToId_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* compartmentguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* compartmentid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ConvertCompartmentGuidToId")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(compartmentguid, compartmentid) : 0;
#else
    (void)compartmentguid;
    (void)compartmentid;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_ConvertCompartmentIdToGuid_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t compartmentid = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* compartmentguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ConvertCompartmentIdToGuid")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(compartmentid, compartmentguid) : 0;
#else
    (void)compartmentid;
    (void)compartmentguid;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_ConvertInterfaceAliasToLuid_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* interfacealias = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* interfaceluid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ConvertInterfaceAliasToLuid")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(interfacealias, interfaceluid) : 0;
#else
    (void)interfacealias;
    (void)interfaceluid;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_ConvertInterfaceGuidToLuid_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* interfaceguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* interfaceluid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ConvertInterfaceGuidToLuid")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(interfaceguid, interfaceluid) : 0;
#else
    (void)interfaceguid;
    (void)interfaceluid;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_ConvertInterfaceIndexToLuid_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t interfaceindex = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* interfaceluid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ConvertInterfaceIndexToLuid")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(interfaceindex, interfaceluid) : 0;
#else
    (void)interfaceindex;
    (void)interfaceluid;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_ConvertInterfaceLuidToAlias_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* interfaceluid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* interfacealias = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint64_t length = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ConvertInterfaceLuidToAlias")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(interfaceluid, interfacealias, length) : 0;
#else
    (void)interfaceluid;
    (void)interfacealias;
    (void)length;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_ConvertInterfaceLuidToGuid_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* interfaceluid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* interfaceguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ConvertInterfaceLuidToGuid")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(interfaceluid, interfaceguid) : 0;
#else
    (void)interfaceluid;
    (void)interfaceguid;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_ConvertInterfaceLuidToIndex_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* interfaceluid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* interfaceindex = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ConvertInterfaceLuidToIndex")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(interfaceluid, interfaceindex) : 0;
#else
    (void)interfaceluid;
    (void)interfaceindex;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_ConvertInterfaceLuidToNameA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* interfaceluid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* interfacename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint64_t length = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ConvertInterfaceLuidToNameA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(interfaceluid, interfacename, length) : 0;
#else
    (void)interfaceluid;
    (void)interfacename;
    (void)length;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_ConvertInterfaceLuidToNameW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* interfaceluid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* interfacename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint64_t length = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ConvertInterfaceLuidToNameW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(interfaceluid, interfacename, length) : 0;
#else
    (void)interfaceluid;
    (void)interfacename;
    (void)length;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_ConvertInterfaceNameToLuidA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* interfacename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* interfaceluid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ConvertInterfaceNameToLuidA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(interfacename, interfaceluid) : 0;
#else
    (void)interfacename;
    (void)interfaceluid;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_ConvertInterfaceNameToLuidW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* interfacename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* interfaceluid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ConvertInterfaceNameToLuidW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(interfacename, interfaceluid) : 0;
#else
    (void)interfacename;
    (void)interfaceluid;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_ConvertIpv4MaskToLength_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t mask = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* masklength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ConvertIpv4MaskToLength")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(mask, masklength) : 0;
#else
    (void)mask;
    (void)masklength;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_ConvertLengthToIpv4Mask_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t masklength = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* mask = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ConvertLengthToIpv4Mask")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(masklength, mask) : 0;
#else
    (void)masklength;
    (void)mask;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_CreateAnycastIpAddressEntry_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* row = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CreateAnycastIpAddressEntry")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(row) : 0;
#else
    (void)row;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_CreateIpForwardEntry_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* proute = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CreateIpForwardEntry")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(proute) : 0;
#else
    (void)proute;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_CreateIpForwardEntry2_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* row = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CreateIpForwardEntry2")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(row) : 0;
#else
    (void)row;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_CreateIpNetEntry_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* parpentry = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CreateIpNetEntry")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(parpentry) : 0;
#else
    (void)parpentry;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_CreateIpNetEntry2_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* row = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CreateIpNetEntry2")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(row) : 0;
#else
    (void)row;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_CreatePersistentTcpPortReservation_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint16_t startport = static_cast<uint16_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint16_t numberofports = static_cast<uint16_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* token = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint16_t, uint16_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CreatePersistentTcpPortReservation")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(startport, numberofports, token) : 0;
#else
    (void)startport;
    (void)numberofports;
    (void)token;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_CreatePersistentUdpPortReservation_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint16_t startport = static_cast<uint16_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint16_t numberofports = static_cast<uint16_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* token = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint16_t, uint16_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CreatePersistentUdpPortReservation")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(startport, numberofports, token) : 0;
#else
    (void)startport;
    (void)numberofports;
    (void)token;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_CreateProxyArpEntry_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwaddress = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t dwmask = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t dwifindex = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CreateProxyArpEntry")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwaddress, dwmask, dwifindex) : 0;
#else
    (void)dwaddress;
    (void)dwmask;
    (void)dwifindex;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_CreateSortedAddressPairs_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* sourceaddresslist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t sourceaddresscount = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* destinationaddresslist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t destinationaddresscount = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t addresssortoptions = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* sortedaddresspairlist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* sortedaddresspaircount = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CreateSortedAddressPairs")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sourceaddresslist, sourceaddresscount, destinationaddresslist, destinationaddresscount, addresssortoptions, sortedaddresspairlist, sortedaddresspaircount) : 0;
#else
    (void)sourceaddresslist;
    (void)sourceaddresscount;
    (void)destinationaddresslist;
    (void)destinationaddresscount;
    (void)addresssortoptions;
    (void)sortedaddresspairlist;
    (void)sortedaddresspaircount;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_CreateUnicastIpAddressEntry_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* row = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CreateUnicastIpAddressEntry")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(row) : 0;
#else
    (void)row;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_DeleteAnycastIpAddressEntry_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* row = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DeleteAnycastIpAddressEntry")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(row) : 0;
#else
    (void)row;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_DeleteIPAddress_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t ntecontext = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DeleteIPAddress")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(ntecontext) : 0;
#else
    (void)ntecontext;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_DeleteIpForwardEntry_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* proute = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DeleteIpForwardEntry")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(proute) : 0;
#else
    (void)proute;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_DeleteIpForwardEntry2_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* row = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DeleteIpForwardEntry2")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(row) : 0;
#else
    (void)row;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_DeleteIpNetEntry_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* parpentry = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DeleteIpNetEntry")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(parpentry) : 0;
#else
    (void)parpentry;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_DeleteIpNetEntry2_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* row = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DeleteIpNetEntry2")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(row) : 0;
#else
    (void)row;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_DeletePersistentTcpPortReservation_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint16_t startport = static_cast<uint16_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint16_t numberofports = static_cast<uint16_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint16_t, uint16_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DeletePersistentTcpPortReservation")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(startport, numberofports) : 0;
#else
    (void)startport;
    (void)numberofports;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_DeletePersistentUdpPortReservation_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint16_t startport = static_cast<uint16_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint16_t numberofports = static_cast<uint16_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint16_t, uint16_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DeletePersistentUdpPortReservation")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(startport, numberofports) : 0;
#else
    (void)startport;
    (void)numberofports;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_DeleteProxyArpEntry_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwaddress = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t dwmask = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t dwifindex = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DeleteProxyArpEntry")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwaddress, dwmask, dwifindex) : 0;
#else
    (void)dwaddress;
    (void)dwmask;
    (void)dwifindex;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_DeleteUnicastIpAddressEntry_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* row = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DeleteUnicastIpAddressEntry")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(row) : 0;
#else
    (void)row;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_DisableMediaSense_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* phandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* poverlapped = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DisableMediaSense")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(phandle, poverlapped) : 0;
#else
    (void)phandle;
    (void)poverlapped;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_EnableRouter_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* phandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* poverlapped = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "EnableRouter")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(phandle, poverlapped) : 0;
#else
    (void)phandle;
    (void)poverlapped;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_FlushIpNetTable_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwifindex = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FlushIpNetTable")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwifindex) : 0;
#else
    (void)dwifindex;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_FlushIpNetTable2_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint16_t family = static_cast<uint16_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t interfaceindex = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint16_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FlushIpNetTable2")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(family, interfaceindex) : 0;
#else
    (void)family;
    (void)interfaceindex;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_FlushIpPathTable_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint16_t family = static_cast<uint16_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint16_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FlushIpPathTable")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(family) : 0;
#else
    (void)family;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_FreeDnsSettings_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* settings = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FreeDnsSettings")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(settings);
#else
    (void)settings;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_FreeInterfaceDnsSettings_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* settings = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FreeInterfaceDnsSettings")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(settings);
#else
    (void)settings;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_FreeMibTable_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* memory = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FreeMibTable")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(memory);
#else
    (void)memory;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_GetAdapterIndex_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* adaptername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ifindex = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetAdapterIndex")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(adaptername, ifindex) : 0;
#else
    (void)adaptername;
    (void)ifindex;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_GetAdapterOrderMap_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetAdapterOrderMap")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr() : NULL;
#else
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_GetAdaptersAddresses_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t family = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* reserved = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* adapteraddresses = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* sizepointer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetAdaptersAddresses")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(family, flags, reserved, adapteraddresses, sizepointer) : 0;
#else
    (void)family;
    (void)flags;
    (void)reserved;
    (void)adapteraddresses;
    (void)sizepointer;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_GetAdaptersInfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* adapterinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* sizepointer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetAdaptersInfo")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(adapterinfo, sizepointer) : 0;
#else
    (void)adapterinfo;
    (void)sizepointer;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_GetAnycastIpAddressEntry_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* row = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetAnycastIpAddressEntry")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(row) : 0;
#else
    (void)row;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_GetAnycastIpAddressTable_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint16_t family = static_cast<uint16_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* table = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint16_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetAnycastIpAddressTable")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(family, table) : 0;
#else
    (void)family;
    (void)table;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_GetBestInterface_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwdestaddr = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* pdwbestifindex = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetBestInterface")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwdestaddr, pdwbestifindex) : 0;
#else
    (void)dwdestaddr;
    (void)pdwbestifindex;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_GetBestInterfaceEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pdestaddr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pdwbestifindex = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetBestInterfaceEx")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pdestaddr, pdwbestifindex) : 0;
#else
    (void)pdestaddr;
    (void)pdwbestifindex;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_GetBestRoute_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwdestaddr = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t dwsourceaddr = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pbestroute = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetBestRoute")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwdestaddr, dwsourceaddr, pbestroute) : 0;
#else
    (void)dwdestaddr;
    (void)dwsourceaddr;
    (void)pbestroute;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_GetBestRoute2_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* interfaceluid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t interfaceindex = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* sourceaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* destinationaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t addresssortoptions = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* bestroute = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* bestsourceaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetBestRoute2")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(interfaceluid, interfaceindex, sourceaddress, destinationaddress, addresssortoptions, bestroute, bestsourceaddress) : 0;
#else
    (void)interfaceluid;
    (void)interfaceindex;
    (void)sourceaddress;
    (void)destinationaddress;
    (void)addresssortoptions;
    (void)bestroute;
    (void)bestsourceaddress;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_GetCurrentThreadCompartmentId_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetCurrentThreadCompartmentId")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr() : 0;
#else
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_GetCurrentThreadCompartmentScope_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* compartmentscope = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* compartmentid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetCurrentThreadCompartmentScope")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(compartmentscope, compartmentid);
#else
    (void)compartmentscope;
    (void)compartmentid;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_GetDefaultCompartmentId_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetDefaultCompartmentId")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr() : 0;
#else
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_GetDnsSettings_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* settings = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetDnsSettings")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(settings) : 0;
#else
    (void)settings;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_GetExtendedTcpTable_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ptcptable = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pdwsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t border = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t ulaf = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    int32_t tableclass = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    uint32_t reserved = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, uint32_t, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetExtendedTcpTable")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(ptcptable, pdwsize, border, ulaf, tableclass, reserved) : 0;
#else
    (void)ptcptable;
    (void)pdwsize;
    (void)border;
    (void)ulaf;
    (void)tableclass;
    (void)reserved;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_GetExtendedUdpTable_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pudptable = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pdwsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t border = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t ulaf = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    int32_t tableclass = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    uint32_t reserved = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, uint32_t, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetExtendedUdpTable")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pudptable, pdwsize, border, ulaf, tableclass, reserved) : 0;
#else
    (void)pudptable;
    (void)pdwsize;
    (void)border;
    (void)ulaf;
    (void)tableclass;
    (void)reserved;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_GetFriendlyIfIndex_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t ifindex = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetFriendlyIfIndex")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(ifindex) : 0;
#else
    (void)ifindex;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_GetIcmpStatistics_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* statistics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetIcmpStatistics")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(statistics) : 0;
#else
    (void)statistics;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_GetIcmpStatisticsEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* statistics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t family = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetIcmpStatisticsEx")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(statistics, family) : 0;
#else
    (void)statistics;
    (void)family;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_GetIfEntry_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pifrow = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetIfEntry")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pifrow) : 0;
#else
    (void)pifrow;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_GetIfEntry2_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* row = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetIfEntry2")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(row) : 0;
#else
    (void)row;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_GetIfEntry2Ex_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t level = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* row = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetIfEntry2Ex")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(level, row) : 0;
#else
    (void)level;
    (void)row;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_GetIfStackTable_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* table = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetIfStackTable")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(table) : 0;
#else
    (void)table;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_GetIfTable_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* piftable = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pdwsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t border = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetIfTable")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(piftable, pdwsize, border) : 0;
#else
    (void)piftable;
    (void)pdwsize;
    (void)border;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_GetIfTable2_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* table = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetIfTable2")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(table) : 0;
#else
    (void)table;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_GetIfTable2Ex_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t level = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* table = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetIfTable2Ex")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(level, table) : 0;
#else
    (void)level;
    (void)table;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_GetInterfaceActiveTimestampCapabilities_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* interfaceluid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* timestampcapabilites = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetInterfaceActiveTimestampCapabilities")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(interfaceluid, timestampcapabilites) : 0;
#else
    (void)interfaceluid;
    (void)timestampcapabilites;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_GetInterfaceCurrentTimestampCapabilities_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* interfaceluid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* timestampcapabilites = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetInterfaceCurrentTimestampCapabilities")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(interfaceluid, timestampcapabilites) : 0;
#else
    (void)interfaceluid;
    (void)timestampcapabilites;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_GetInterfaceHardwareTimestampCapabilities_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* interfaceluid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* timestampcapabilites = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetInterfaceHardwareTimestampCapabilities")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(interfaceluid, timestampcapabilites) : 0;
#else
    (void)interfaceluid;
    (void)timestampcapabilites;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_GetInterfaceInfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* piftable = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* dwoutbuflen = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetInterfaceInfo")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(piftable, dwoutbuflen) : 0;
#else
    (void)piftable;
    (void)dwoutbuflen;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_GetInterfaceSupportedTimestampCapabilities_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* interfaceluid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* timestampcapabilites = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetInterfaceSupportedTimestampCapabilities")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(interfaceluid, timestampcapabilites) : 0;
#else
    (void)interfaceluid;
    (void)timestampcapabilites;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_GetInvertedIfStackTable_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* table = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetInvertedIfStackTable")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(table) : 0;
#else
    (void)table;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_GetIpAddrTable_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pipaddrtable = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pdwsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t border = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetIpAddrTable")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pipaddrtable, pdwsize, border) : 0;
#else
    (void)pipaddrtable;
    (void)pdwsize;
    (void)border;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_GetIpErrorString_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t errorcode = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* size = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetIpErrorString")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(errorcode, buffer, size) : 0;
#else
    (void)errorcode;
    (void)buffer;
    (void)size;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_GetIpForwardEntry2_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* row = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetIpForwardEntry2")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(row) : 0;
#else
    (void)row;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_GetIpForwardTable_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pipforwardtable = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pdwsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t border = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetIpForwardTable")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pipforwardtable, pdwsize, border) : 0;
#else
    (void)pipforwardtable;
    (void)pdwsize;
    (void)border;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_GetIpForwardTable2_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint16_t family = static_cast<uint16_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* table = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint16_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetIpForwardTable2")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(family, table) : 0;
#else
    (void)family;
    (void)table;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_GetIpInterfaceEntry_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* row = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetIpInterfaceEntry")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(row) : 0;
#else
    (void)row;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_GetIpInterfaceTable_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint16_t family = static_cast<uint16_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* table = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint16_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetIpInterfaceTable")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(family, table) : 0;
#else
    (void)family;
    (void)table;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_GetIpNetEntry2_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* row = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetIpNetEntry2")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(row) : 0;
#else
    (void)row;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_GetIpNetTable_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ipnettable = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* sizepointer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t order = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetIpNetTable")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(ipnettable, sizepointer, order) : 0;
#else
    (void)ipnettable;
    (void)sizepointer;
    (void)order;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_GetIpNetTable2_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint16_t family = static_cast<uint16_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* table = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint16_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetIpNetTable2")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(family, table) : 0;
#else
    (void)family;
    (void)table;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_GetIpNetworkConnectionBandwidthEstimates_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t interfaceindex = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint16_t addressfamily = static_cast<uint16_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* bandwidthestimates = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint16_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetIpNetworkConnectionBandwidthEstimates")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(interfaceindex, addressfamily, bandwidthestimates) : 0;
#else
    (void)interfaceindex;
    (void)addressfamily;
    (void)bandwidthestimates;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_GetIpPathEntry_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* row = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetIpPathEntry")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(row) : 0;
#else
    (void)row;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_GetIpPathTable_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint16_t family = static_cast<uint16_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* table = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint16_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetIpPathTable")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(family, table) : 0;
#else
    (void)family;
    (void)table;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_GetIpStatistics_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* statistics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetIpStatistics")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(statistics) : 0;
#else
    (void)statistics;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_GetIpStatisticsEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* statistics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t family = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetIpStatisticsEx")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(statistics, family) : 0;
#else
    (void)statistics;
    (void)family;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_GetJobCompartmentId_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* jobhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetJobCompartmentId")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(jobhandle) : 0;
#else
    (void)jobhandle;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_GetMulticastIpAddressEntry_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* row = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetMulticastIpAddressEntry")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(row) : 0;
#else
    (void)row;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_GetMulticastIpAddressTable_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint16_t family = static_cast<uint16_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* table = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint16_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetMulticastIpAddressTable")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(family, table) : 0;
#else
    (void)family;
    (void)table;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_GetNetworkConnectivityHint_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* connectivityhint = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetNetworkConnectivityHint")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(connectivityhint) : 0;
#else
    (void)connectivityhint;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_GetNetworkConnectivityHintForInterface_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t interfaceindex = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* connectivityhint = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetNetworkConnectivityHintForInterface")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(interfaceindex, connectivityhint) : 0;
#else
    (void)interfaceindex;
    (void)connectivityhint;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_GetNetworkInformation_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* networkguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* compartmentid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* siteid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* networkname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t length = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetNetworkInformation")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(networkguid, compartmentid, siteid, networkname, length) : 0;
#else
    (void)networkguid;
    (void)compartmentid;
    (void)siteid;
    (void)networkname;
    (void)length;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_GetNetworkParams_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pfixedinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* poutbuflen = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetNetworkParams")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pfixedinfo, poutbuflen) : 0;
#else
    (void)pfixedinfo;
    (void)poutbuflen;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_GetNumberOfInterfaces_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pdwnumif = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetNumberOfInterfaces")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pdwnumif) : 0;
#else
    (void)pdwnumif;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_GetOwnerModuleFromPidAndInfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t ulpid = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* pinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t arg_2_class = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pdwsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetOwnerModuleFromPidAndInfo")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(ulpid, pinfo, arg_2_class, pbuffer, pdwsize) : 0;
#else
    (void)ulpid;
    (void)pinfo;
    (void)arg_2_class;
    (void)pbuffer;
    (void)pdwsize;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_GetOwnerModuleFromTcp6Entry_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ptcpentry = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t arg_1_class = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pdwsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetOwnerModuleFromTcp6Entry")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(ptcpentry, arg_1_class, pbuffer, pdwsize) : 0;
#else
    (void)ptcpentry;
    (void)arg_1_class;
    (void)pbuffer;
    (void)pdwsize;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_GetOwnerModuleFromTcpEntry_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ptcpentry = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t arg_1_class = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pdwsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetOwnerModuleFromTcpEntry")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(ptcpentry, arg_1_class, pbuffer, pdwsize) : 0;
#else
    (void)ptcpentry;
    (void)arg_1_class;
    (void)pbuffer;
    (void)pdwsize;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_GetOwnerModuleFromUdp6Entry_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pudpentry = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t arg_1_class = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pdwsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetOwnerModuleFromUdp6Entry")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pudpentry, arg_1_class, pbuffer, pdwsize) : 0;
#else
    (void)pudpentry;
    (void)arg_1_class;
    (void)pbuffer;
    (void)pdwsize;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_GetOwnerModuleFromUdpEntry_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pudpentry = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t arg_1_class = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pdwsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetOwnerModuleFromUdpEntry")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pudpentry, arg_1_class, pbuffer, pdwsize) : 0;
#else
    (void)pudpentry;
    (void)arg_1_class;
    (void)pbuffer;
    (void)pdwsize;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_GetPerAdapterInfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t ifindex = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* pperadapterinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* poutbuflen = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetPerAdapterInfo")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(ifindex, pperadapterinfo, poutbuflen) : 0;
#else
    (void)ifindex;
    (void)pperadapterinfo;
    (void)poutbuflen;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_GetPerTcp6ConnectionEStats_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* row = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t estatstype = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* rw = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t rwversion = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t rwsize = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* ros = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    uint32_t rosversion = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    uint32_t rossize = static_cast<uint32_t>(km_info.Length() > 7 ? km_info[7].ToNumber().Int32Value() : 0);
    void* rod = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
    uint32_t rodversion = static_cast<uint32_t>(km_info.Length() > 9 ? km_info[9].ToNumber().Int32Value() : 0);
    uint32_t rodsize = static_cast<uint32_t>(km_info.Length() > 10 ? km_info[10].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, uint32_t, void*, uint32_t, uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetPerTcp6ConnectionEStats")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(row, estatstype, rw, rwversion, rwsize, ros, rosversion, rossize, rod, rodversion, rodsize) : 0;
#else
    (void)row;
    (void)estatstype;
    (void)rw;
    (void)rwversion;
    (void)rwsize;
    (void)ros;
    (void)rosversion;
    (void)rossize;
    (void)rod;
    (void)rodversion;
    (void)rodsize;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_GetPerTcpConnectionEStats_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* row = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t estatstype = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* rw = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t rwversion = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t rwsize = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* ros = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    uint32_t rosversion = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    uint32_t rossize = static_cast<uint32_t>(km_info.Length() > 7 ? km_info[7].ToNumber().Int32Value() : 0);
    void* rod = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
    uint32_t rodversion = static_cast<uint32_t>(km_info.Length() > 9 ? km_info[9].ToNumber().Int32Value() : 0);
    uint32_t rodsize = static_cast<uint32_t>(km_info.Length() > 10 ? km_info[10].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, uint32_t, void*, uint32_t, uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetPerTcpConnectionEStats")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(row, estatstype, rw, rwversion, rwsize, ros, rosversion, rossize, rod, rodversion, rodsize) : 0;
#else
    (void)row;
    (void)estatstype;
    (void)rw;
    (void)rwversion;
    (void)rwsize;
    (void)ros;
    (void)rosversion;
    (void)rossize;
    (void)rod;
    (void)rodversion;
    (void)rodsize;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_GetRTTAndHopCount_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t destipaddress = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* hopcount = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t maxhops = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* rtt = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetRTTAndHopCount")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(destipaddress, hopcount, maxhops, rtt) : -1;
#else
    (void)destipaddress;
    (void)hopcount;
    (void)maxhops;
    (void)rtt;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_GetSessionCompartmentId_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t sessionid = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetSessionCompartmentId")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sessionid) : 0;
#else
    (void)sessionid;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_GetTcp6Table_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* tcptable = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* sizepointer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t order = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetTcp6Table")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(tcptable, sizepointer, order) : 0;
#else
    (void)tcptable;
    (void)sizepointer;
    (void)order;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_GetTcp6Table2_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* tcptable = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* sizepointer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t order = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetTcp6Table2")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(tcptable, sizepointer, order) : 0;
#else
    (void)tcptable;
    (void)sizepointer;
    (void)order;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_GetTcpStatistics_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* statistics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetTcpStatistics")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(statistics) : 0;
#else
    (void)statistics;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_GetTcpStatisticsEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* statistics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t family = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetTcpStatisticsEx")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(statistics, family) : 0;
#else
    (void)statistics;
    (void)family;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_GetTcpStatisticsEx2_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* statistics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t family = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetTcpStatisticsEx2")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(statistics, family) : 0;
#else
    (void)statistics;
    (void)family;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_GetTcpTable_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* tcptable = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* sizepointer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t order = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetTcpTable")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(tcptable, sizepointer, order) : 0;
#else
    (void)tcptable;
    (void)sizepointer;
    (void)order;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_GetTcpTable2_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* tcptable = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* sizepointer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t order = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetTcpTable2")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(tcptable, sizepointer, order) : 0;
#else
    (void)tcptable;
    (void)sizepointer;
    (void)order;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_GetTeredoPort_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* port = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetTeredoPort")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(port) : 0;
#else
    (void)port;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_GetUdp6Table_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* udp6table = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* sizepointer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t order = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetUdp6Table")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(udp6table, sizepointer, order) : 0;
#else
    (void)udp6table;
    (void)sizepointer;
    (void)order;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_GetUdpStatistics_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* stats = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetUdpStatistics")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(stats) : 0;
#else
    (void)stats;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_GetUdpStatisticsEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* statistics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t family = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetUdpStatisticsEx")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(statistics, family) : 0;
#else
    (void)statistics;
    (void)family;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_GetUdpStatisticsEx2_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* statistics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t family = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetUdpStatisticsEx2")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(statistics, family) : 0;
#else
    (void)statistics;
    (void)family;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_GetUdpTable_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* udptable = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* sizepointer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t order = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetUdpTable")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(udptable, sizepointer, order) : 0;
#else
    (void)udptable;
    (void)sizepointer;
    (void)order;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_GetUniDirectionalAdapterInfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pipifinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* dwoutbuflen = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetUniDirectionalAdapterInfo")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pipifinfo, dwoutbuflen) : 0;
#else
    (void)pipifinfo;
    (void)dwoutbuflen;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_GetUnicastIpAddressEntry_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* row = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetUnicastIpAddressEntry")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(row) : 0;
#else
    (void)row;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_GetUnicastIpAddressTable_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint16_t family = static_cast<uint16_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* table = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint16_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetUnicastIpAddressTable")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(family, table) : 0;
#else
    (void)family;
    (void)table;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_Icmp6CreateFile_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "Icmp6CreateFile")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr() : NULL;
#else
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_Icmp6ParseReplies_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* replybuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t replysize = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "Icmp6ParseReplies")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(replybuffer, replysize) : 0;
#else
    (void)replybuffer;
    (void)replysize;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_IcmpCloseHandle_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* icmphandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IcmpCloseHandle")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(icmphandle) : -1;
#else
    (void)icmphandle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_IcmpCreateFile_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IcmpCreateFile")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr() : NULL;
#else
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_IcmpParseReplies_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* replybuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t replysize = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IcmpParseReplies")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(replybuffer, replysize) : 0;
#else
    (void)replybuffer;
    (void)replysize;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_IcmpSendEcho_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* icmphandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t destinationaddress = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* requestdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint16_t requestsize = static_cast<uint16_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* requestoptions = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* replybuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    uint32_t replysize = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    uint32_t timeout = static_cast<uint32_t>(km_info.Length() > 7 ? km_info[7].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint16_t, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IcmpSendEcho")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(icmphandle, destinationaddress, requestdata, requestsize, requestoptions, replybuffer, replysize, timeout) : 0;
#else
    (void)icmphandle;
    (void)destinationaddress;
    (void)requestdata;
    (void)requestsize;
    (void)requestoptions;
    (void)replybuffer;
    (void)replysize;
    (void)timeout;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_InitializeIpForwardEntry_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* row = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "InitializeIpForwardEntry")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(row);
#else
    (void)row;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_InitializeIpInterfaceEntry_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* row = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "InitializeIpInterfaceEntry")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(row);
#else
    (void)row;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_InitializeUnicastIpAddressEntry_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* row = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "InitializeUnicastIpAddressEntry")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(row);
#else
    (void)row;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_IpReleaseAddress_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* adapterinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IpReleaseAddress")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(adapterinfo) : 0;
#else
    (void)adapterinfo;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_IpRenewAddress_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* adapterinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IpRenewAddress")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(adapterinfo) : 0;
#else
    (void)adapterinfo;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_LookupPersistentTcpPortReservation_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint16_t startport = static_cast<uint16_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint16_t numberofports = static_cast<uint16_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* token = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint16_t, uint16_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "LookupPersistentTcpPortReservation")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(startport, numberofports, token) : 0;
#else
    (void)startport;
    (void)numberofports;
    (void)token;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_LookupPersistentUdpPortReservation_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint16_t startport = static_cast<uint16_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint16_t numberofports = static_cast<uint16_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* token = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint16_t, uint16_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "LookupPersistentUdpPortReservation")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(startport, numberofports, token) : 0;
#else
    (void)startport;
    (void)numberofports;
    (void)token;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_NhpAllocateAndGetInterfaceInfoFromStack_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pptable = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pdwcount = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t border = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* hheap = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NhpAllocateAndGetInterfaceInfoFromStack")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pptable, pdwcount, border, hheap, dwflags) : 0;
#else
    (void)pptable;
    (void)pdwcount;
    (void)border;
    (void)hheap;
    (void)dwflags;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_NotifyAddrChange_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* handle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* overlapped = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NotifyAddrChange")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(handle, overlapped) : 0;
#else
    (void)handle;
    (void)overlapped;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_NotifyIfTimestampConfigChange_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* callercontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* callback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* notificationhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NotifyIfTimestampConfigChange")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(callercontext, callback, notificationhandle) : 0;
#else
    (void)callercontext;
    (void)callback;
    (void)notificationhandle;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_NotifyIpInterfaceChange_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint16_t family = static_cast<uint16_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* callback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* callercontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    bool initialnotification = km_info.Length() > 3 ? km_info[3].ToBoolean().Value() : false;
    void* notificationhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint16_t, void*, void*, bool, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NotifyIpInterfaceChange")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(family, callback, callercontext, initialnotification, notificationhandle) : 0;
#else
    (void)family;
    (void)callback;
    (void)callercontext;
    (void)initialnotification;
    (void)notificationhandle;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_NotifyNetworkConnectivityHintChange_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* callback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* callercontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    bool initialnotification = km_info.Length() > 2 ? km_info[2].ToBoolean().Value() : false;
    void* notificationhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, bool, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NotifyNetworkConnectivityHintChange")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(callback, callercontext, initialnotification, notificationhandle) : 0;
#else
    (void)callback;
    (void)callercontext;
    (void)initialnotification;
    (void)notificationhandle;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_NotifyRouteChange_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* handle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* overlapped = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NotifyRouteChange")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(handle, overlapped) : 0;
#else
    (void)handle;
    (void)overlapped;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_NotifyRouteChange2_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint16_t addressfamily = static_cast<uint16_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* callback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* callercontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    bool initialnotification = km_info.Length() > 3 ? km_info[3].ToBoolean().Value() : false;
    void* notificationhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint16_t, void*, void*, bool, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NotifyRouteChange2")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(addressfamily, callback, callercontext, initialnotification, notificationhandle) : 0;
#else
    (void)addressfamily;
    (void)callback;
    (void)callercontext;
    (void)initialnotification;
    (void)notificationhandle;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_NotifyStableUnicastIpAddressTable_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint16_t family = static_cast<uint16_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* table = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* callercallback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* callercontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* notificationhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint16_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NotifyStableUnicastIpAddressTable")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(family, table, callercallback, callercontext, notificationhandle) : 0;
#else
    (void)family;
    (void)table;
    (void)callercallback;
    (void)callercontext;
    (void)notificationhandle;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_NotifyTeredoPortChange_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* callback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* callercontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    bool initialnotification = km_info.Length() > 2 ? km_info[2].ToBoolean().Value() : false;
    void* notificationhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, bool, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NotifyTeredoPortChange")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(callback, callercontext, initialnotification, notificationhandle) : 0;
#else
    (void)callback;
    (void)callercontext;
    (void)initialnotification;
    (void)notificationhandle;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_NotifyUnicastIpAddressChange_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint16_t family = static_cast<uint16_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* callback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* callercontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    bool initialnotification = km_info.Length() > 3 ? km_info[3].ToBoolean().Value() : false;
    void* notificationhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint16_t, void*, void*, bool, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NotifyUnicastIpAddressChange")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(family, callback, callercontext, initialnotification, notificationhandle) : 0;
#else
    (void)family;
    (void)callback;
    (void)callercontext;
    (void)initialnotification;
    (void)notificationhandle;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_ParseNetworkString_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* networkstring = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t types = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* addressinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* portnumber = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* prefixlength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ParseNetworkString")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(networkstring, types, addressinfo, portnumber, prefixlength) : 0;
#else
    (void)networkstring;
    (void)types;
    (void)addressinfo;
    (void)portnumber;
    (void)prefixlength;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_PfAddFiltersToInterface_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ih = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t cinfilters = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pfiltin = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t coutfilters = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* pfiltout = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* pfhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PfAddFiltersToInterface")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(ih, cinfilters, pfiltin, coutfilters, pfiltout, pfhandle) : 0;
#else
    (void)ih;
    (void)cinfilters;
    (void)pfiltin;
    (void)coutfilters;
    (void)pfiltout;
    (void)pfhandle;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_PfAddGlobalFilterToInterface_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pinterface = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t gffilter = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PfAddGlobalFilterToInterface")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pinterface, gffilter) : 0;
#else
    (void)pinterface;
    (void)gffilter;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_PfBindInterfaceToIPAddress_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pinterface = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t pfattype = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* ipaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PfBindInterfaceToIPAddress")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pinterface, pfattype, ipaddress) : 0;
#else
    (void)pinterface;
    (void)pfattype;
    (void)ipaddress;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_PfBindInterfaceToIndex_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pinterface = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwindex = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t pfatlinktype = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* linkipaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PfBindInterfaceToIndex")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pinterface, dwindex, pfatlinktype, linkipaddress) : 0;
#else
    (void)pinterface;
    (void)dwindex;
    (void)pfatlinktype;
    (void)linkipaddress;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_PfCreateInterface_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwname = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    int32_t inaction = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t outaction = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t buselog = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    int32_t bmustbeunique = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* ppinterface = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, int32_t, int32_t, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PfCreateInterface")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwname, inaction, outaction, buselog, bmustbeunique, ppinterface) : 0;
#else
    (void)dwname;
    (void)inaction;
    (void)outaction;
    (void)buselog;
    (void)bmustbeunique;
    (void)ppinterface;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_PfDeleteInterface_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pinterface = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PfDeleteInterface")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pinterface) : 0;
#else
    (void)pinterface;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_PfDeleteLog_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PfDeleteLog")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr() : 0;
#else
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_PfGetInterfaceStatistics_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pinterface = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ppfstats = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pdwbuffersize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int32_t fresetcounters = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PfGetInterfaceStatistics")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pinterface, ppfstats, pdwbuffersize, fresetcounters) : 0;
#else
    (void)pinterface;
    (void)ppfstats;
    (void)pdwbuffersize;
    (void)fresetcounters;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_PfMakeLog_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hevent = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PfMakeLog")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hevent) : 0;
#else
    (void)hevent;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_PfRebindFilters_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pinterface = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* platebindinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PfRebindFilters")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pinterface, platebindinfo) : 0;
#else
    (void)pinterface;
    (void)platebindinfo;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_PfRemoveFilterHandles_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pinterface = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t cfilters = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pvhandles = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PfRemoveFilterHandles")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pinterface, cfilters, pvhandles) : 0;
#else
    (void)pinterface;
    (void)cfilters;
    (void)pvhandles;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_PfRemoveFiltersFromInterface_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ih = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t cinfilters = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pfiltin = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t coutfilters = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* pfiltout = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PfRemoveFiltersFromInterface")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(ih, cinfilters, pfiltin, coutfilters, pfiltout) : 0;
#else
    (void)ih;
    (void)cinfilters;
    (void)pfiltin;
    (void)coutfilters;
    (void)pfiltout;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_PfRemoveGlobalFilterFromInterface_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pinterface = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t gffilter = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PfRemoveGlobalFilterFromInterface")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pinterface, gffilter) : 0;
#else
    (void)pinterface;
    (void)gffilter;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_PfSetLogBuffer_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pbbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwsize = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t dwthreshold = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t dwentries = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* pdwloggedentries = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* pdwlostentries = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* pdwsizeused = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PfSetLogBuffer")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pbbuffer, dwsize, dwthreshold, dwentries, pdwloggedentries, pdwlostentries, pdwsizeused) : 0;
#else
    (void)pbbuffer;
    (void)dwsize;
    (void)dwthreshold;
    (void)dwentries;
    (void)pdwloggedentries;
    (void)pdwlostentries;
    (void)pdwsizeused;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_PfTestPacket_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pininterface = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* poutinterface = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t cbytes = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pbpacket = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* ppaction = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PfTestPacket")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pininterface, poutinterface, cbytes, pbpacket, ppaction) : 0;
#else
    (void)pininterface;
    (void)poutinterface;
    (void)cbytes;
    (void)pbpacket;
    (void)ppaction;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_PfUnBindInterface_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pinterface = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PfUnBindInterface")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pinterface) : 0;
#else
    (void)pinterface;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_RegisterInterfaceTimestampConfigChange_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* callback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* callercontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* notificationhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RegisterInterfaceTimestampConfigChange")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(callback, callercontext, notificationhandle) : 0;
#else
    (void)callback;
    (void)callercontext;
    (void)notificationhandle;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_ResolveIpNetEntry2_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* row = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* sourceaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ResolveIpNetEntry2")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(row, sourceaddress) : 0;
#else
    (void)row;
    (void)sourceaddress;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_ResolveNeighbor_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* networkaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* physicaladdress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* physicaladdresslength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ResolveNeighbor")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(networkaddress, physicaladdress, physicaladdresslength) : 0;
#else
    (void)networkaddress;
    (void)physicaladdress;
    (void)physicaladdresslength;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_RestoreMediaSense_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* poverlapped = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpdwenablecount = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RestoreMediaSense")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(poverlapped, lpdwenablecount) : 0;
#else
    (void)poverlapped;
    (void)lpdwenablecount;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_SendARP_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t destip = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t srcip = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pmacaddr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* phyaddrlen = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SendARP")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(destip, srcip, pmacaddr, phyaddrlen) : 0;
#else
    (void)destip;
    (void)srcip;
    (void)pmacaddr;
    (void)phyaddrlen;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_SetCurrentThreadCompartmentId_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t compartmentid = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetCurrentThreadCompartmentId")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(compartmentid) : 0;
#else
    (void)compartmentid;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_SetCurrentThreadCompartmentScope_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t compartmentscope = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetCurrentThreadCompartmentScope")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(compartmentscope) : 0;
#else
    (void)compartmentscope;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_SetDnsSettings_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* settings = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetDnsSettings")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(settings) : 0;
#else
    (void)settings;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_SetIfEntry_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pifrow = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetIfEntry")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pifrow) : 0;
#else
    (void)pifrow;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_SetIpForwardEntry_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* proute = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetIpForwardEntry")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(proute) : 0;
#else
    (void)proute;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_SetIpForwardEntry2_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* route = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetIpForwardEntry2")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(route) : 0;
#else
    (void)route;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_SetIpInterfaceEntry_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* row = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetIpInterfaceEntry")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(row) : 0;
#else
    (void)row;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_SetIpNetEntry_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* parpentry = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetIpNetEntry")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(parpentry) : 0;
#else
    (void)parpentry;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_SetIpNetEntry2_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* row = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetIpNetEntry2")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(row) : 0;
#else
    (void)row;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_SetIpStatistics_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pipstats = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetIpStatistics")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pipstats) : 0;
#else
    (void)pipstats;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_SetIpStatisticsEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* statistics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t family = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetIpStatisticsEx")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(statistics, family) : 0;
#else
    (void)statistics;
    (void)family;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_SetIpTTL_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t nttl = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetIpTTL")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(nttl) : 0;
#else
    (void)nttl;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_SetJobCompartmentId_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* jobhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t compartmentid = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetJobCompartmentId")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(jobhandle, compartmentid) : 0;
#else
    (void)jobhandle;
    (void)compartmentid;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_SetNetworkInformation_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* networkguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t compartmentid = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* networkname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetNetworkInformation")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(networkguid, compartmentid, networkname) : 0;
#else
    (void)networkguid;
    (void)compartmentid;
    (void)networkname;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_SetPerTcp6ConnectionEStats_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* row = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t estatstype = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* rw = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t rwversion = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t rwsize = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    uint32_t offset = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetPerTcp6ConnectionEStats")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(row, estatstype, rw, rwversion, rwsize, offset) : 0;
#else
    (void)row;
    (void)estatstype;
    (void)rw;
    (void)rwversion;
    (void)rwsize;
    (void)offset;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_SetPerTcpConnectionEStats_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* row = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t estatstype = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* rw = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t rwversion = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t rwsize = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    uint32_t offset = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetPerTcpConnectionEStats")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(row, estatstype, rw, rwversion, rwsize, offset) : 0;
#else
    (void)row;
    (void)estatstype;
    (void)rw;
    (void)rwversion;
    (void)rwsize;
    (void)offset;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_SetSessionCompartmentId_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t sessionid = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t compartmentid = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetSessionCompartmentId")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sessionid, compartmentid) : 0;
#else
    (void)sessionid;
    (void)compartmentid;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_SetTcpEntry_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ptcprow = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetTcpEntry")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(ptcprow) : 0;
#else
    (void)ptcprow;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_SetUnicastIpAddressEntry_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* row = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetUnicastIpAddressEntry")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(row) : 0;
#else
    (void)row;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_UnenableRouter_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* poverlapped = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpdwenablecount = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "UnenableRouter")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(poverlapped, lpdwenablecount) : 0;
#else
    (void)poverlapped;
    (void)lpdwenablecount;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_UnregisterInterfaceTimestampConfigChange_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* notificationhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "UnregisterInterfaceTimestampConfigChange")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(notificationhandle);
#else
    (void)notificationhandle;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_if_indextoname_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t interfaceindex = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* interfacename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "if_indextoname")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(interfaceindex, interfacename) : NULL;
#else
    (void)interfaceindex;
    (void)interfacename;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_networkmanagement_iphelper_if_nametoindex_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* interfacename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "if_nametoindex")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(interfacename) : 0;
#else
    (void)interfacename;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static void register_windows_win32_networkmanagement_iphelper_napi(Napi::Env env, Napi::Object exports) {
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_AddIPAddress", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_AddIPAddress_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_CancelIPChangeNotify", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_CancelIPChangeNotify_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_CancelIfTimestampConfigChange", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_CancelIfTimestampConfigChange_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_CancelMibChangeNotify2", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_CancelMibChangeNotify2_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_CaptureInterfaceHardwareCrossTimestamp", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_CaptureInterfaceHardwareCrossTimestamp_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_ConvertCompartmentGuidToId", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_ConvertCompartmentGuidToId_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_ConvertCompartmentIdToGuid", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_ConvertCompartmentIdToGuid_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_ConvertInterfaceAliasToLuid", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_ConvertInterfaceAliasToLuid_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_ConvertInterfaceGuidToLuid", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_ConvertInterfaceGuidToLuid_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_ConvertInterfaceIndexToLuid", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_ConvertInterfaceIndexToLuid_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_ConvertInterfaceLuidToAlias", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_ConvertInterfaceLuidToAlias_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_ConvertInterfaceLuidToGuid", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_ConvertInterfaceLuidToGuid_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_ConvertInterfaceLuidToIndex", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_ConvertInterfaceLuidToIndex_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_ConvertInterfaceLuidToNameA", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_ConvertInterfaceLuidToNameA_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_ConvertInterfaceLuidToNameW", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_ConvertInterfaceLuidToNameW_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_ConvertInterfaceNameToLuidA", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_ConvertInterfaceNameToLuidA_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_ConvertInterfaceNameToLuidW", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_ConvertInterfaceNameToLuidW_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_ConvertIpv4MaskToLength", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_ConvertIpv4MaskToLength_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_ConvertLengthToIpv4Mask", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_ConvertLengthToIpv4Mask_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_CreateAnycastIpAddressEntry", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_CreateAnycastIpAddressEntry_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_CreateIpForwardEntry", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_CreateIpForwardEntry_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_CreateIpForwardEntry2", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_CreateIpForwardEntry2_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_CreateIpNetEntry", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_CreateIpNetEntry_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_CreateIpNetEntry2", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_CreateIpNetEntry2_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_CreatePersistentTcpPortReservation", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_CreatePersistentTcpPortReservation_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_CreatePersistentUdpPortReservation", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_CreatePersistentUdpPortReservation_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_CreateProxyArpEntry", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_CreateProxyArpEntry_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_CreateSortedAddressPairs", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_CreateSortedAddressPairs_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_CreateUnicastIpAddressEntry", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_CreateUnicastIpAddressEntry_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_DeleteAnycastIpAddressEntry", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_DeleteAnycastIpAddressEntry_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_DeleteIPAddress", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_DeleteIPAddress_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_DeleteIpForwardEntry", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_DeleteIpForwardEntry_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_DeleteIpForwardEntry2", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_DeleteIpForwardEntry2_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_DeleteIpNetEntry", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_DeleteIpNetEntry_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_DeleteIpNetEntry2", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_DeleteIpNetEntry2_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_DeletePersistentTcpPortReservation", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_DeletePersistentTcpPortReservation_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_DeletePersistentUdpPortReservation", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_DeletePersistentUdpPortReservation_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_DeleteProxyArpEntry", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_DeleteProxyArpEntry_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_DeleteUnicastIpAddressEntry", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_DeleteUnicastIpAddressEntry_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_DisableMediaSense", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_DisableMediaSense_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_EnableRouter", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_EnableRouter_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_FlushIpNetTable", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_FlushIpNetTable_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_FlushIpNetTable2", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_FlushIpNetTable2_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_FlushIpPathTable", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_FlushIpPathTable_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_FreeDnsSettings", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_FreeDnsSettings_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_FreeInterfaceDnsSettings", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_FreeInterfaceDnsSettings_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_FreeMibTable", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_FreeMibTable_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_GetAdapterIndex", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_GetAdapterIndex_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_GetAdapterOrderMap", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_GetAdapterOrderMap_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_GetAdaptersAddresses", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_GetAdaptersAddresses_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_GetAdaptersInfo", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_GetAdaptersInfo_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_GetAnycastIpAddressEntry", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_GetAnycastIpAddressEntry_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_GetAnycastIpAddressTable", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_GetAnycastIpAddressTable_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_GetBestInterface", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_GetBestInterface_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_GetBestInterfaceEx", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_GetBestInterfaceEx_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_GetBestRoute", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_GetBestRoute_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_GetBestRoute2", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_GetBestRoute2_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_GetCurrentThreadCompartmentId", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_GetCurrentThreadCompartmentId_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_GetCurrentThreadCompartmentScope", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_GetCurrentThreadCompartmentScope_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_GetDefaultCompartmentId", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_GetDefaultCompartmentId_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_GetDnsSettings", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_GetDnsSettings_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_GetExtendedTcpTable", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_GetExtendedTcpTable_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_GetExtendedUdpTable", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_GetExtendedUdpTable_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_GetFriendlyIfIndex", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_GetFriendlyIfIndex_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_GetIcmpStatistics", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_GetIcmpStatistics_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_GetIcmpStatisticsEx", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_GetIcmpStatisticsEx_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_GetIfEntry", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_GetIfEntry_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_GetIfEntry2", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_GetIfEntry2_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_GetIfEntry2Ex", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_GetIfEntry2Ex_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_GetIfStackTable", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_GetIfStackTable_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_GetIfTable", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_GetIfTable_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_GetIfTable2", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_GetIfTable2_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_GetIfTable2Ex", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_GetIfTable2Ex_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_GetInterfaceActiveTimestampCapabilities", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_GetInterfaceActiveTimestampCapabilities_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_GetInterfaceCurrentTimestampCapabilities", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_GetInterfaceCurrentTimestampCapabilities_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_GetInterfaceHardwareTimestampCapabilities", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_GetInterfaceHardwareTimestampCapabilities_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_GetInterfaceInfo", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_GetInterfaceInfo_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_GetInterfaceSupportedTimestampCapabilities", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_GetInterfaceSupportedTimestampCapabilities_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_GetInvertedIfStackTable", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_GetInvertedIfStackTable_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_GetIpAddrTable", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_GetIpAddrTable_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_GetIpErrorString", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_GetIpErrorString_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_GetIpForwardEntry2", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_GetIpForwardEntry2_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_GetIpForwardTable", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_GetIpForwardTable_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_GetIpForwardTable2", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_GetIpForwardTable2_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_GetIpInterfaceEntry", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_GetIpInterfaceEntry_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_GetIpInterfaceTable", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_GetIpInterfaceTable_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_GetIpNetEntry2", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_GetIpNetEntry2_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_GetIpNetTable", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_GetIpNetTable_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_GetIpNetTable2", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_GetIpNetTable2_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_GetIpNetworkConnectionBandwidthEstimates", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_GetIpNetworkConnectionBandwidthEstimates_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_GetIpPathEntry", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_GetIpPathEntry_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_GetIpPathTable", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_GetIpPathTable_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_GetIpStatistics", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_GetIpStatistics_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_GetIpStatisticsEx", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_GetIpStatisticsEx_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_GetJobCompartmentId", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_GetJobCompartmentId_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_GetMulticastIpAddressEntry", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_GetMulticastIpAddressEntry_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_GetMulticastIpAddressTable", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_GetMulticastIpAddressTable_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_GetNetworkConnectivityHint", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_GetNetworkConnectivityHint_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_GetNetworkConnectivityHintForInterface", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_GetNetworkConnectivityHintForInterface_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_GetNetworkInformation", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_GetNetworkInformation_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_GetNetworkParams", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_GetNetworkParams_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_GetNumberOfInterfaces", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_GetNumberOfInterfaces_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_GetOwnerModuleFromPidAndInfo", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_GetOwnerModuleFromPidAndInfo_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_GetOwnerModuleFromTcp6Entry", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_GetOwnerModuleFromTcp6Entry_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_GetOwnerModuleFromTcpEntry", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_GetOwnerModuleFromTcpEntry_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_GetOwnerModuleFromUdp6Entry", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_GetOwnerModuleFromUdp6Entry_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_GetOwnerModuleFromUdpEntry", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_GetOwnerModuleFromUdpEntry_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_GetPerAdapterInfo", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_GetPerAdapterInfo_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_GetPerTcp6ConnectionEStats", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_GetPerTcp6ConnectionEStats_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_GetPerTcpConnectionEStats", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_GetPerTcpConnectionEStats_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_GetRTTAndHopCount", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_GetRTTAndHopCount_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_GetSessionCompartmentId", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_GetSessionCompartmentId_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_GetTcp6Table", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_GetTcp6Table_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_GetTcp6Table2", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_GetTcp6Table2_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_GetTcpStatistics", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_GetTcpStatistics_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_GetTcpStatisticsEx", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_GetTcpStatisticsEx_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_GetTcpStatisticsEx2", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_GetTcpStatisticsEx2_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_GetTcpTable", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_GetTcpTable_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_GetTcpTable2", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_GetTcpTable2_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_GetTeredoPort", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_GetTeredoPort_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_GetUdp6Table", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_GetUdp6Table_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_GetUdpStatistics", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_GetUdpStatistics_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_GetUdpStatisticsEx", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_GetUdpStatisticsEx_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_GetUdpStatisticsEx2", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_GetUdpStatisticsEx2_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_GetUdpTable", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_GetUdpTable_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_GetUniDirectionalAdapterInfo", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_GetUniDirectionalAdapterInfo_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_GetUnicastIpAddressEntry", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_GetUnicastIpAddressEntry_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_GetUnicastIpAddressTable", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_GetUnicastIpAddressTable_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_Icmp6CreateFile", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_Icmp6CreateFile_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_Icmp6ParseReplies", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_Icmp6ParseReplies_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_IcmpCloseHandle", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_IcmpCloseHandle_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_IcmpCreateFile", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_IcmpCreateFile_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_IcmpParseReplies", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_IcmpParseReplies_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_IcmpSendEcho", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_IcmpSendEcho_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_InitializeIpForwardEntry", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_InitializeIpForwardEntry_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_InitializeIpInterfaceEntry", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_InitializeIpInterfaceEntry_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_InitializeUnicastIpAddressEntry", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_InitializeUnicastIpAddressEntry_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_IpReleaseAddress", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_IpReleaseAddress_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_IpRenewAddress", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_IpRenewAddress_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_LookupPersistentTcpPortReservation", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_LookupPersistentTcpPortReservation_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_LookupPersistentUdpPortReservation", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_LookupPersistentUdpPortReservation_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_NhpAllocateAndGetInterfaceInfoFromStack", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_NhpAllocateAndGetInterfaceInfoFromStack_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_NotifyAddrChange", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_NotifyAddrChange_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_NotifyIfTimestampConfigChange", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_NotifyIfTimestampConfigChange_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_NotifyIpInterfaceChange", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_NotifyIpInterfaceChange_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_NotifyNetworkConnectivityHintChange", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_NotifyNetworkConnectivityHintChange_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_NotifyRouteChange", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_NotifyRouteChange_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_NotifyRouteChange2", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_NotifyRouteChange2_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_NotifyStableUnicastIpAddressTable", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_NotifyStableUnicastIpAddressTable_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_NotifyTeredoPortChange", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_NotifyTeredoPortChange_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_NotifyUnicastIpAddressChange", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_NotifyUnicastIpAddressChange_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_ParseNetworkString", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_ParseNetworkString_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_PfAddFiltersToInterface", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_PfAddFiltersToInterface_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_PfAddGlobalFilterToInterface", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_PfAddGlobalFilterToInterface_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_PfBindInterfaceToIPAddress", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_PfBindInterfaceToIPAddress_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_PfBindInterfaceToIndex", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_PfBindInterfaceToIndex_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_PfCreateInterface", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_PfCreateInterface_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_PfDeleteInterface", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_PfDeleteInterface_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_PfDeleteLog", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_PfDeleteLog_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_PfGetInterfaceStatistics", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_PfGetInterfaceStatistics_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_PfMakeLog", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_PfMakeLog_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_PfRebindFilters", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_PfRebindFilters_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_PfRemoveFilterHandles", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_PfRemoveFilterHandles_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_PfRemoveFiltersFromInterface", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_PfRemoveFiltersFromInterface_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_PfRemoveGlobalFilterFromInterface", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_PfRemoveGlobalFilterFromInterface_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_PfSetLogBuffer", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_PfSetLogBuffer_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_PfTestPacket", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_PfTestPacket_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_PfUnBindInterface", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_PfUnBindInterface_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_RegisterInterfaceTimestampConfigChange", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_RegisterInterfaceTimestampConfigChange_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_ResolveIpNetEntry2", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_ResolveIpNetEntry2_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_ResolveNeighbor", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_ResolveNeighbor_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_RestoreMediaSense", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_RestoreMediaSense_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_SendARP", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_SendARP_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_SetCurrentThreadCompartmentId", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_SetCurrentThreadCompartmentId_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_SetCurrentThreadCompartmentScope", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_SetCurrentThreadCompartmentScope_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_SetDnsSettings", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_SetDnsSettings_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_SetIfEntry", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_SetIfEntry_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_SetIpForwardEntry", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_SetIpForwardEntry_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_SetIpForwardEntry2", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_SetIpForwardEntry2_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_SetIpInterfaceEntry", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_SetIpInterfaceEntry_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_SetIpNetEntry", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_SetIpNetEntry_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_SetIpNetEntry2", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_SetIpNetEntry2_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_SetIpStatistics", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_SetIpStatistics_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_SetIpStatisticsEx", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_SetIpStatisticsEx_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_SetIpTTL", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_SetIpTTL_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_SetJobCompartmentId", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_SetJobCompartmentId_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_SetNetworkInformation", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_SetNetworkInformation_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_SetPerTcp6ConnectionEStats", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_SetPerTcp6ConnectionEStats_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_SetPerTcpConnectionEStats", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_SetPerTcpConnectionEStats_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_SetSessionCompartmentId", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_SetSessionCompartmentId_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_SetTcpEntry", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_SetTcpEntry_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_SetUnicastIpAddressEntry", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_SetUnicastIpAddressEntry_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_UnenableRouter", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_UnenableRouter_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_UnregisterInterfaceTimestampConfigChange", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_UnregisterInterfaceTimestampConfigChange_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_if_indextoname", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_if_indextoname_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_iphelper_if_nametoindex", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_iphelper_if_nametoindex_napi));
}

static KmNapiRegistrarNode registrar_node = { &register_windows_win32_networkmanagement_iphelper_napi, nullptr };
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
