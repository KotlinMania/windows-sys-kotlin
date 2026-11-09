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

static Napi::Value windowssys_windows_win32_storage_iscsidisc_AddISNSServerA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* address = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "AddISNSServerA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(address) : 0;
#else
    (void)address;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_iscsidisc_AddISNSServerW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* address = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "AddISNSServerW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(address) : 0;
#else
    (void)address;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_iscsidisc_AddIScsiConnectionA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* uniquesessionid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* reserved = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t initiatorportnumber = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* targetportal = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint64_t securityflags = km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0;
    void* loginoptions = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    uint32_t keysize = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    void* key = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    void* connectionid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint64_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "AddIScsiConnectionA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(uniquesessionid, reserved, initiatorportnumber, targetportal, securityflags, loginoptions, keysize, key, connectionid) : 0;
#else
    (void)uniquesessionid;
    (void)reserved;
    (void)initiatorportnumber;
    (void)targetportal;
    (void)securityflags;
    (void)loginoptions;
    (void)keysize;
    (void)key;
    (void)connectionid;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_iscsidisc_AddIScsiConnectionW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* uniquesessionid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* reserved = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t initiatorportnumber = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* targetportal = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint64_t securityflags = km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0;
    void* loginoptions = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    uint32_t keysize = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    void* key = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    void* connectionid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint64_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "AddIScsiConnectionW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(uniquesessionid, reserved, initiatorportnumber, targetportal, securityflags, loginoptions, keysize, key, connectionid) : 0;
#else
    (void)uniquesessionid;
    (void)reserved;
    (void)initiatorportnumber;
    (void)targetportal;
    (void)securityflags;
    (void)loginoptions;
    (void)keysize;
    (void)key;
    (void)connectionid;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_iscsidisc_AddIScsiSendTargetPortalA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* initiatorinstance = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t initiatorportnumber = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* loginoptions = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint64_t securityflags = km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0;
    void* portal = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "AddIScsiSendTargetPortalA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(initiatorinstance, initiatorportnumber, loginoptions, securityflags, portal) : 0;
#else
    (void)initiatorinstance;
    (void)initiatorportnumber;
    (void)loginoptions;
    (void)securityflags;
    (void)portal;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_iscsidisc_AddIScsiSendTargetPortalW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* initiatorinstance = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t initiatorportnumber = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* loginoptions = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint64_t securityflags = km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0;
    void* portal = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "AddIScsiSendTargetPortalW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(initiatorinstance, initiatorportnumber, loginoptions, securityflags, portal) : 0;
#else
    (void)initiatorinstance;
    (void)initiatorportnumber;
    (void)loginoptions;
    (void)securityflags;
    (void)portal;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_iscsidisc_AddIScsiStaticTargetA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* targetname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* targetalias = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t targetflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    bool persist = km_info.Length() > 3 ? km_info[3].ToBoolean().Value() : false;
    void* mappings = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* loginoptions = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* portalgroup = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, bool, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "AddIScsiStaticTargetA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(targetname, targetalias, targetflags, persist, mappings, loginoptions, portalgroup) : 0;
#else
    (void)targetname;
    (void)targetalias;
    (void)targetflags;
    (void)persist;
    (void)mappings;
    (void)loginoptions;
    (void)portalgroup;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_iscsidisc_AddIScsiStaticTargetW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* targetname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* targetalias = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t targetflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    bool persist = km_info.Length() > 3 ? km_info[3].ToBoolean().Value() : false;
    void* mappings = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* loginoptions = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* portalgroup = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, bool, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "AddIScsiStaticTargetW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(targetname, targetalias, targetflags, persist, mappings, loginoptions, portalgroup) : 0;
#else
    (void)targetname;
    (void)targetalias;
    (void)targetflags;
    (void)persist;
    (void)mappings;
    (void)loginoptions;
    (void)portalgroup;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_iscsidisc_AddPersistentIScsiDeviceA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* devicepath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "AddPersistentIScsiDeviceA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(devicepath) : 0;
#else
    (void)devicepath;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_iscsidisc_AddPersistentIScsiDeviceW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* devicepath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "AddPersistentIScsiDeviceW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(devicepath) : 0;
#else
    (void)devicepath;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_iscsidisc_AddRadiusServerA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* address = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "AddRadiusServerA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(address) : 0;
#else
    (void)address;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_iscsidisc_AddRadiusServerW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* address = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "AddRadiusServerW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(address) : 0;
#else
    (void)address;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_iscsidisc_ClearPersistentIScsiDevices_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ClearPersistentIScsiDevices")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr() : 0;
#else
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_iscsidisc_GetDevicesForIScsiSessionA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* uniquesessionid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* devicecount = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* devices = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetDevicesForIScsiSessionA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(uniquesessionid, devicecount, devices) : 0;
#else
    (void)uniquesessionid;
    (void)devicecount;
    (void)devices;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_iscsidisc_GetDevicesForIScsiSessionW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* uniquesessionid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* devicecount = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* devices = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetDevicesForIScsiSessionW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(uniquesessionid, devicecount, devices) : 0;
#else
    (void)uniquesessionid;
    (void)devicecount;
    (void)devices;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_iscsidisc_GetIScsiIKEInfoA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* initiatorname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t initiatorportnumber = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* reserved = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* authinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetIScsiIKEInfoA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(initiatorname, initiatorportnumber, reserved, authinfo) : 0;
#else
    (void)initiatorname;
    (void)initiatorportnumber;
    (void)reserved;
    (void)authinfo;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_iscsidisc_GetIScsiIKEInfoW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* initiatorname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t initiatorportnumber = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* reserved = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* authinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetIScsiIKEInfoW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(initiatorname, initiatorportnumber, reserved, authinfo) : 0;
#else
    (void)initiatorname;
    (void)initiatorportnumber;
    (void)reserved;
    (void)authinfo;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_iscsidisc_GetIScsiInitiatorNodeNameA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* initiatornodename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetIScsiInitiatorNodeNameA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(initiatornodename) : 0;
#else
    (void)initiatornodename;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_iscsidisc_GetIScsiInitiatorNodeNameW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* initiatornodename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetIScsiInitiatorNodeNameW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(initiatornodename) : 0;
#else
    (void)initiatornodename;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_iscsidisc_GetIScsiSessionListA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* buffersize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* sessioncount = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* sessioninfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetIScsiSessionListA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(buffersize, sessioncount, sessioninfo) : 0;
#else
    (void)buffersize;
    (void)sessioncount;
    (void)sessioninfo;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_iscsidisc_GetIScsiSessionListEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* buffersize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* sessioncountptr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* sessioninfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetIScsiSessionListEx")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(buffersize, sessioncountptr, sessioninfo) : 0;
#else
    (void)buffersize;
    (void)sessioncountptr;
    (void)sessioninfo;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_iscsidisc_GetIScsiSessionListW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* buffersize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* sessioncount = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* sessioninfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetIScsiSessionListW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(buffersize, sessioncount, sessioninfo) : 0;
#else
    (void)buffersize;
    (void)sessioncount;
    (void)sessioninfo;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_iscsidisc_GetIScsiTargetInformationA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* targetname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* discoverymechanism = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t infoclass = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* buffersize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetIScsiTargetInformationA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(targetname, discoverymechanism, infoclass, buffersize, buffer) : 0;
#else
    (void)targetname;
    (void)discoverymechanism;
    (void)infoclass;
    (void)buffersize;
    (void)buffer;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_iscsidisc_GetIScsiTargetInformationW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* targetname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* discoverymechanism = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t infoclass = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* buffersize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetIScsiTargetInformationW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(targetname, discoverymechanism, infoclass, buffersize, buffer) : 0;
#else
    (void)targetname;
    (void)discoverymechanism;
    (void)infoclass;
    (void)buffersize;
    (void)buffer;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_iscsidisc_GetIScsiVersionInformation_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* versioninfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetIScsiVersionInformation")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(versioninfo) : 0;
#else
    (void)versioninfo;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_iscsidisc_LoginIScsiTargetA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* targetname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    bool isinformationalsession = km_info.Length() > 1 ? km_info[1].ToBoolean().Value() : false;
    void* initiatorinstance = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t initiatorportnumber = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* targetportal = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint64_t securityflags = km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0;
    void* mappings = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* loginoptions = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    uint32_t keysize = static_cast<uint32_t>(km_info.Length() > 8 ? km_info[8].ToNumber().Int32Value() : 0);
    void* key = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 9 ? km_napi_arg_u64(km_info[9]) : 0));
    bool ispersistent = km_info.Length() > 10 ? km_info[10].ToBoolean().Value() : false;
    void* uniquesessionid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 11 ? km_napi_arg_u64(km_info[11]) : 0));
    void* uniqueconnectionid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 12 ? km_napi_arg_u64(km_info[12]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, bool, void*, uint32_t, void*, uint64_t, void*, void*, uint32_t, void*, bool, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "LoginIScsiTargetA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(targetname, isinformationalsession, initiatorinstance, initiatorportnumber, targetportal, securityflags, mappings, loginoptions, keysize, key, ispersistent, uniquesessionid, uniqueconnectionid) : 0;
#else
    (void)targetname;
    (void)isinformationalsession;
    (void)initiatorinstance;
    (void)initiatorportnumber;
    (void)targetportal;
    (void)securityflags;
    (void)mappings;
    (void)loginoptions;
    (void)keysize;
    (void)key;
    (void)ispersistent;
    (void)uniquesessionid;
    (void)uniqueconnectionid;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_iscsidisc_LoginIScsiTargetW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* targetname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    bool isinformationalsession = km_info.Length() > 1 ? km_info[1].ToBoolean().Value() : false;
    void* initiatorinstance = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t initiatorportnumber = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* targetportal = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint64_t securityflags = km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0;
    void* mappings = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* loginoptions = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    uint32_t keysize = static_cast<uint32_t>(km_info.Length() > 8 ? km_info[8].ToNumber().Int32Value() : 0);
    void* key = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 9 ? km_napi_arg_u64(km_info[9]) : 0));
    bool ispersistent = km_info.Length() > 10 ? km_info[10].ToBoolean().Value() : false;
    void* uniquesessionid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 11 ? km_napi_arg_u64(km_info[11]) : 0));
    void* uniqueconnectionid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 12 ? km_napi_arg_u64(km_info[12]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, bool, void*, uint32_t, void*, uint64_t, void*, void*, uint32_t, void*, bool, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "LoginIScsiTargetW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(targetname, isinformationalsession, initiatorinstance, initiatorportnumber, targetportal, securityflags, mappings, loginoptions, keysize, key, ispersistent, uniquesessionid, uniqueconnectionid) : 0;
#else
    (void)targetname;
    (void)isinformationalsession;
    (void)initiatorinstance;
    (void)initiatorportnumber;
    (void)targetportal;
    (void)securityflags;
    (void)mappings;
    (void)loginoptions;
    (void)keysize;
    (void)key;
    (void)ispersistent;
    (void)uniquesessionid;
    (void)uniqueconnectionid;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_iscsidisc_LogoutIScsiTarget_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* uniquesessionid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "LogoutIScsiTarget")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(uniquesessionid) : 0;
#else
    (void)uniquesessionid;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_iscsidisc_RefreshISNSServerA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* address = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RefreshISNSServerA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(address) : 0;
#else
    (void)address;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_iscsidisc_RefreshISNSServerW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* address = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RefreshISNSServerW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(address) : 0;
#else
    (void)address;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_iscsidisc_RefreshIScsiSendTargetPortalA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* initiatorinstance = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t initiatorportnumber = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* portal = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RefreshIScsiSendTargetPortalA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(initiatorinstance, initiatorportnumber, portal) : 0;
#else
    (void)initiatorinstance;
    (void)initiatorportnumber;
    (void)portal;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_iscsidisc_RefreshIScsiSendTargetPortalW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* initiatorinstance = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t initiatorportnumber = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* portal = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RefreshIScsiSendTargetPortalW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(initiatorinstance, initiatorportnumber, portal) : 0;
#else
    (void)initiatorinstance;
    (void)initiatorportnumber;
    (void)portal;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_iscsidisc_RemoveISNSServerA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* address = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RemoveISNSServerA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(address) : 0;
#else
    (void)address;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_iscsidisc_RemoveISNSServerW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* address = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RemoveISNSServerW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(address) : 0;
#else
    (void)address;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_iscsidisc_RemoveIScsiConnection_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* uniquesessionid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* connectionid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RemoveIScsiConnection")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(uniquesessionid, connectionid) : 0;
#else
    (void)uniquesessionid;
    (void)connectionid;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_iscsidisc_RemoveIScsiPersistentTargetA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* initiatorinstance = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t initiatorportnumber = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* targetname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* portal = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RemoveIScsiPersistentTargetA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(initiatorinstance, initiatorportnumber, targetname, portal) : 0;
#else
    (void)initiatorinstance;
    (void)initiatorportnumber;
    (void)targetname;
    (void)portal;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_iscsidisc_RemoveIScsiPersistentTargetW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* initiatorinstance = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t initiatorportnumber = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* targetname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* portal = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RemoveIScsiPersistentTargetW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(initiatorinstance, initiatorportnumber, targetname, portal) : 0;
#else
    (void)initiatorinstance;
    (void)initiatorportnumber;
    (void)targetname;
    (void)portal;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_iscsidisc_RemoveIScsiSendTargetPortalA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* initiatorinstance = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t initiatorportnumber = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* portal = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RemoveIScsiSendTargetPortalA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(initiatorinstance, initiatorportnumber, portal) : 0;
#else
    (void)initiatorinstance;
    (void)initiatorportnumber;
    (void)portal;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_iscsidisc_RemoveIScsiSendTargetPortalW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* initiatorinstance = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t initiatorportnumber = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* portal = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RemoveIScsiSendTargetPortalW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(initiatorinstance, initiatorportnumber, portal) : 0;
#else
    (void)initiatorinstance;
    (void)initiatorportnumber;
    (void)portal;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_iscsidisc_RemoveIScsiStaticTargetA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* targetname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RemoveIScsiStaticTargetA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(targetname) : 0;
#else
    (void)targetname;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_iscsidisc_RemoveIScsiStaticTargetW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* targetname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RemoveIScsiStaticTargetW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(targetname) : 0;
#else
    (void)targetname;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_iscsidisc_RemovePersistentIScsiDeviceA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* devicepath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RemovePersistentIScsiDeviceA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(devicepath) : 0;
#else
    (void)devicepath;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_iscsidisc_RemovePersistentIScsiDeviceW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* devicepath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RemovePersistentIScsiDeviceW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(devicepath) : 0;
#else
    (void)devicepath;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_iscsidisc_RemoveRadiusServerA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* address = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RemoveRadiusServerA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(address) : 0;
#else
    (void)address;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_iscsidisc_RemoveRadiusServerW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* address = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RemoveRadiusServerW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(address) : 0;
#else
    (void)address;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_iscsidisc_ReportActiveIScsiTargetMappingsA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* buffersize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* mappingcount = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* mappings = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ReportActiveIScsiTargetMappingsA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(buffersize, mappingcount, mappings) : 0;
#else
    (void)buffersize;
    (void)mappingcount;
    (void)mappings;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_iscsidisc_ReportActiveIScsiTargetMappingsW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* buffersize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* mappingcount = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* mappings = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ReportActiveIScsiTargetMappingsW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(buffersize, mappingcount, mappings) : 0;
#else
    (void)buffersize;
    (void)mappingcount;
    (void)mappings;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_iscsidisc_ReportISNSServerListA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* buffersizeinchar = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ReportISNSServerListA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(buffersizeinchar, buffer) : 0;
#else
    (void)buffersizeinchar;
    (void)buffer;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_iscsidisc_ReportISNSServerListW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* buffersizeinchar = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ReportISNSServerListW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(buffersizeinchar, buffer) : 0;
#else
    (void)buffersizeinchar;
    (void)buffer;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_iscsidisc_ReportIScsiInitiatorListA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* buffersize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ReportIScsiInitiatorListA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(buffersize, buffer) : 0;
#else
    (void)buffersize;
    (void)buffer;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_iscsidisc_ReportIScsiInitiatorListW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* buffersize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ReportIScsiInitiatorListW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(buffersize, buffer) : 0;
#else
    (void)buffersize;
    (void)buffer;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_iscsidisc_ReportIScsiPersistentLoginsA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* count = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* persistentlogininfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* buffersizeinbytes = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ReportIScsiPersistentLoginsA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(count, persistentlogininfo, buffersizeinbytes) : 0;
#else
    (void)count;
    (void)persistentlogininfo;
    (void)buffersizeinbytes;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_iscsidisc_ReportIScsiPersistentLoginsW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* count = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* persistentlogininfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* buffersizeinbytes = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ReportIScsiPersistentLoginsW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(count, persistentlogininfo, buffersizeinbytes) : 0;
#else
    (void)count;
    (void)persistentlogininfo;
    (void)buffersizeinbytes;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_iscsidisc_ReportIScsiSendTargetPortalsA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* portalcount = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* portalinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ReportIScsiSendTargetPortalsA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(portalcount, portalinfo) : 0;
#else
    (void)portalcount;
    (void)portalinfo;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_iscsidisc_ReportIScsiSendTargetPortalsExA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* portalcount = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* portalinfosize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* portalinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ReportIScsiSendTargetPortalsExA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(portalcount, portalinfosize, portalinfo) : 0;
#else
    (void)portalcount;
    (void)portalinfosize;
    (void)portalinfo;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_iscsidisc_ReportIScsiSendTargetPortalsExW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* portalcount = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* portalinfosize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* portalinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ReportIScsiSendTargetPortalsExW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(portalcount, portalinfosize, portalinfo) : 0;
#else
    (void)portalcount;
    (void)portalinfosize;
    (void)portalinfo;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_iscsidisc_ReportIScsiSendTargetPortalsW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* portalcount = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* portalinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ReportIScsiSendTargetPortalsW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(portalcount, portalinfo) : 0;
#else
    (void)portalcount;
    (void)portalinfo;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_iscsidisc_ReportIScsiTargetPortalsA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* initiatorname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* targetname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* targetportaltag = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* elementcount = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* portals = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ReportIScsiTargetPortalsA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(initiatorname, targetname, targetportaltag, elementcount, portals) : 0;
#else
    (void)initiatorname;
    (void)targetname;
    (void)targetportaltag;
    (void)elementcount;
    (void)portals;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_iscsidisc_ReportIScsiTargetPortalsW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* initiatorname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* targetname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* targetportaltag = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* elementcount = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* portals = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ReportIScsiTargetPortalsW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(initiatorname, targetname, targetportaltag, elementcount, portals) : 0;
#else
    (void)initiatorname;
    (void)targetname;
    (void)targetportaltag;
    (void)elementcount;
    (void)portals;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_iscsidisc_ReportIScsiTargetsA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    bool forceupdate = km_info.Length() > 0 ? km_info[0].ToBoolean().Value() : false;
    void* buffersize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(bool, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ReportIScsiTargetsA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(forceupdate, buffersize, buffer) : 0;
#else
    (void)forceupdate;
    (void)buffersize;
    (void)buffer;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_iscsidisc_ReportIScsiTargetsW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    bool forceupdate = km_info.Length() > 0 ? km_info[0].ToBoolean().Value() : false;
    void* buffersize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(bool, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ReportIScsiTargetsW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(forceupdate, buffersize, buffer) : 0;
#else
    (void)forceupdate;
    (void)buffersize;
    (void)buffer;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_iscsidisc_ReportPersistentIScsiDevicesA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* buffersizeinchar = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ReportPersistentIScsiDevicesA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(buffersizeinchar, buffer) : 0;
#else
    (void)buffersizeinchar;
    (void)buffer;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_iscsidisc_ReportPersistentIScsiDevicesW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* buffersizeinchar = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ReportPersistentIScsiDevicesW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(buffersizeinchar, buffer) : 0;
#else
    (void)buffersizeinchar;
    (void)buffer;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_iscsidisc_ReportRadiusServerListA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* buffersizeinchar = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ReportRadiusServerListA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(buffersizeinchar, buffer) : 0;
#else
    (void)buffersizeinchar;
    (void)buffer;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_iscsidisc_ReportRadiusServerListW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* buffersizeinchar = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ReportRadiusServerListW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(buffersizeinchar, buffer) : 0;
#else
    (void)buffersizeinchar;
    (void)buffer;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_iscsidisc_SendScsiInquiry_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* uniquesessionid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t lun = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    uint8_t evpdcmddt = static_cast<uint8_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint8_t pagecode = static_cast<uint8_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* scsistatus = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* responsesize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* responsebuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* sensesize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    void* sensebuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, uint8_t, uint8_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SendScsiInquiry")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(uniquesessionid, lun, evpdcmddt, pagecode, scsistatus, responsesize, responsebuffer, sensesize, sensebuffer) : 0;
#else
    (void)uniquesessionid;
    (void)lun;
    (void)evpdcmddt;
    (void)pagecode;
    (void)scsistatus;
    (void)responsesize;
    (void)responsebuffer;
    (void)sensesize;
    (void)sensebuffer;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_iscsidisc_SendScsiReadCapacity_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* uniquesessionid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t lun = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* scsistatus = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* responsesize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* responsebuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* sensesize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* sensebuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SendScsiReadCapacity")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(uniquesessionid, lun, scsistatus, responsesize, responsebuffer, sensesize, sensebuffer) : 0;
#else
    (void)uniquesessionid;
    (void)lun;
    (void)scsistatus;
    (void)responsesize;
    (void)responsebuffer;
    (void)sensesize;
    (void)sensebuffer;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_iscsidisc_SendScsiReportLuns_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* uniquesessionid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* scsistatus = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* responsesize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* responsebuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* sensesize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* sensebuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SendScsiReportLuns")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(uniquesessionid, scsistatus, responsesize, responsebuffer, sensesize, sensebuffer) : 0;
#else
    (void)uniquesessionid;
    (void)scsistatus;
    (void)responsesize;
    (void)responsebuffer;
    (void)sensesize;
    (void)sensebuffer;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_iscsidisc_SetIScsiGroupPresharedKey_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t keylength = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* key = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    bool persist = km_info.Length() > 2 ? km_info[2].ToBoolean().Value() : false;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, bool);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetIScsiGroupPresharedKey")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(keylength, key, persist) : 0;
#else
    (void)keylength;
    (void)key;
    (void)persist;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_iscsidisc_SetIScsiIKEInfoA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* initiatorname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t initiatorportnumber = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* authinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    bool persist = km_info.Length() > 3 ? km_info[3].ToBoolean().Value() : false;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, bool);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetIScsiIKEInfoA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(initiatorname, initiatorportnumber, authinfo, persist) : 0;
#else
    (void)initiatorname;
    (void)initiatorportnumber;
    (void)authinfo;
    (void)persist;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_iscsidisc_SetIScsiIKEInfoW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* initiatorname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t initiatorportnumber = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* authinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    bool persist = km_info.Length() > 3 ? km_info[3].ToBoolean().Value() : false;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, bool);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetIScsiIKEInfoW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(initiatorname, initiatorportnumber, authinfo, persist) : 0;
#else
    (void)initiatorname;
    (void)initiatorportnumber;
    (void)authinfo;
    (void)persist;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_iscsidisc_SetIScsiInitiatorCHAPSharedSecret_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t sharedsecretlength = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* sharedsecret = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetIScsiInitiatorCHAPSharedSecret")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sharedsecretlength, sharedsecret) : 0;
#else
    (void)sharedsecretlength;
    (void)sharedsecret;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_iscsidisc_SetIScsiInitiatorNodeNameA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* initiatornodename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetIScsiInitiatorNodeNameA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(initiatornodename) : 0;
#else
    (void)initiatornodename;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_iscsidisc_SetIScsiInitiatorNodeNameW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* initiatornodename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetIScsiInitiatorNodeNameW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(initiatornodename) : 0;
#else
    (void)initiatornodename;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_iscsidisc_SetIScsiInitiatorRADIUSSharedSecret_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t sharedsecretlength = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* sharedsecret = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetIScsiInitiatorRADIUSSharedSecret")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sharedsecretlength, sharedsecret) : 0;
#else
    (void)sharedsecretlength;
    (void)sharedsecret;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_iscsidisc_SetIScsiTunnelModeOuterAddressA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* initiatorname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t initiatorportnumber = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* destinationaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* outermodeaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    bool persist = km_info.Length() > 4 ? km_info[4].ToBoolean().Value() : false;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, bool);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetIScsiTunnelModeOuterAddressA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(initiatorname, initiatorportnumber, destinationaddress, outermodeaddress, persist) : 0;
#else
    (void)initiatorname;
    (void)initiatorportnumber;
    (void)destinationaddress;
    (void)outermodeaddress;
    (void)persist;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_iscsidisc_SetIScsiTunnelModeOuterAddressW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* initiatorname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t initiatorportnumber = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* destinationaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* outermodeaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    bool persist = km_info.Length() > 4 ? km_info[4].ToBoolean().Value() : false;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, bool);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetIScsiTunnelModeOuterAddressW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(initiatorname, initiatorportnumber, destinationaddress, outermodeaddress, persist) : 0;
#else
    (void)initiatorname;
    (void)initiatorportnumber;
    (void)destinationaddress;
    (void)outermodeaddress;
    (void)persist;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_iscsidisc_SetupPersistentIScsiDevices_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupPersistentIScsiDevices")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr() : 0;
#else
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_iscsidisc_SetupPersistentIScsiVolumes_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupPersistentIScsiVolumes")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr() : 0;
#else
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static void register_windows_win32_storage_iscsidisc_napi(Napi::Env env, Napi::Object exports) {
    exports.Set("windowssys_windows_win32_storage_iscsidisc_AddISNSServerA", Napi::Function::New(env, windowssys_windows_win32_storage_iscsidisc_AddISNSServerA_napi));
    exports.Set("windowssys_windows_win32_storage_iscsidisc_AddISNSServerW", Napi::Function::New(env, windowssys_windows_win32_storage_iscsidisc_AddISNSServerW_napi));
    exports.Set("windowssys_windows_win32_storage_iscsidisc_AddIScsiConnectionA", Napi::Function::New(env, windowssys_windows_win32_storage_iscsidisc_AddIScsiConnectionA_napi));
    exports.Set("windowssys_windows_win32_storage_iscsidisc_AddIScsiConnectionW", Napi::Function::New(env, windowssys_windows_win32_storage_iscsidisc_AddIScsiConnectionW_napi));
    exports.Set("windowssys_windows_win32_storage_iscsidisc_AddIScsiSendTargetPortalA", Napi::Function::New(env, windowssys_windows_win32_storage_iscsidisc_AddIScsiSendTargetPortalA_napi));
    exports.Set("windowssys_windows_win32_storage_iscsidisc_AddIScsiSendTargetPortalW", Napi::Function::New(env, windowssys_windows_win32_storage_iscsidisc_AddIScsiSendTargetPortalW_napi));
    exports.Set("windowssys_windows_win32_storage_iscsidisc_AddIScsiStaticTargetA", Napi::Function::New(env, windowssys_windows_win32_storage_iscsidisc_AddIScsiStaticTargetA_napi));
    exports.Set("windowssys_windows_win32_storage_iscsidisc_AddIScsiStaticTargetW", Napi::Function::New(env, windowssys_windows_win32_storage_iscsidisc_AddIScsiStaticTargetW_napi));
    exports.Set("windowssys_windows_win32_storage_iscsidisc_AddPersistentIScsiDeviceA", Napi::Function::New(env, windowssys_windows_win32_storage_iscsidisc_AddPersistentIScsiDeviceA_napi));
    exports.Set("windowssys_windows_win32_storage_iscsidisc_AddPersistentIScsiDeviceW", Napi::Function::New(env, windowssys_windows_win32_storage_iscsidisc_AddPersistentIScsiDeviceW_napi));
    exports.Set("windowssys_windows_win32_storage_iscsidisc_AddRadiusServerA", Napi::Function::New(env, windowssys_windows_win32_storage_iscsidisc_AddRadiusServerA_napi));
    exports.Set("windowssys_windows_win32_storage_iscsidisc_AddRadiusServerW", Napi::Function::New(env, windowssys_windows_win32_storage_iscsidisc_AddRadiusServerW_napi));
    exports.Set("windowssys_windows_win32_storage_iscsidisc_ClearPersistentIScsiDevices", Napi::Function::New(env, windowssys_windows_win32_storage_iscsidisc_ClearPersistentIScsiDevices_napi));
    exports.Set("windowssys_windows_win32_storage_iscsidisc_GetDevicesForIScsiSessionA", Napi::Function::New(env, windowssys_windows_win32_storage_iscsidisc_GetDevicesForIScsiSessionA_napi));
    exports.Set("windowssys_windows_win32_storage_iscsidisc_GetDevicesForIScsiSessionW", Napi::Function::New(env, windowssys_windows_win32_storage_iscsidisc_GetDevicesForIScsiSessionW_napi));
    exports.Set("windowssys_windows_win32_storage_iscsidisc_GetIScsiIKEInfoA", Napi::Function::New(env, windowssys_windows_win32_storage_iscsidisc_GetIScsiIKEInfoA_napi));
    exports.Set("windowssys_windows_win32_storage_iscsidisc_GetIScsiIKEInfoW", Napi::Function::New(env, windowssys_windows_win32_storage_iscsidisc_GetIScsiIKEInfoW_napi));
    exports.Set("windowssys_windows_win32_storage_iscsidisc_GetIScsiInitiatorNodeNameA", Napi::Function::New(env, windowssys_windows_win32_storage_iscsidisc_GetIScsiInitiatorNodeNameA_napi));
    exports.Set("windowssys_windows_win32_storage_iscsidisc_GetIScsiInitiatorNodeNameW", Napi::Function::New(env, windowssys_windows_win32_storage_iscsidisc_GetIScsiInitiatorNodeNameW_napi));
    exports.Set("windowssys_windows_win32_storage_iscsidisc_GetIScsiSessionListA", Napi::Function::New(env, windowssys_windows_win32_storage_iscsidisc_GetIScsiSessionListA_napi));
    exports.Set("windowssys_windows_win32_storage_iscsidisc_GetIScsiSessionListEx", Napi::Function::New(env, windowssys_windows_win32_storage_iscsidisc_GetIScsiSessionListEx_napi));
    exports.Set("windowssys_windows_win32_storage_iscsidisc_GetIScsiSessionListW", Napi::Function::New(env, windowssys_windows_win32_storage_iscsidisc_GetIScsiSessionListW_napi));
    exports.Set("windowssys_windows_win32_storage_iscsidisc_GetIScsiTargetInformationA", Napi::Function::New(env, windowssys_windows_win32_storage_iscsidisc_GetIScsiTargetInformationA_napi));
    exports.Set("windowssys_windows_win32_storage_iscsidisc_GetIScsiTargetInformationW", Napi::Function::New(env, windowssys_windows_win32_storage_iscsidisc_GetIScsiTargetInformationW_napi));
    exports.Set("windowssys_windows_win32_storage_iscsidisc_GetIScsiVersionInformation", Napi::Function::New(env, windowssys_windows_win32_storage_iscsidisc_GetIScsiVersionInformation_napi));
    exports.Set("windowssys_windows_win32_storage_iscsidisc_LoginIScsiTargetA", Napi::Function::New(env, windowssys_windows_win32_storage_iscsidisc_LoginIScsiTargetA_napi));
    exports.Set("windowssys_windows_win32_storage_iscsidisc_LoginIScsiTargetW", Napi::Function::New(env, windowssys_windows_win32_storage_iscsidisc_LoginIScsiTargetW_napi));
    exports.Set("windowssys_windows_win32_storage_iscsidisc_LogoutIScsiTarget", Napi::Function::New(env, windowssys_windows_win32_storage_iscsidisc_LogoutIScsiTarget_napi));
    exports.Set("windowssys_windows_win32_storage_iscsidisc_RefreshISNSServerA", Napi::Function::New(env, windowssys_windows_win32_storage_iscsidisc_RefreshISNSServerA_napi));
    exports.Set("windowssys_windows_win32_storage_iscsidisc_RefreshISNSServerW", Napi::Function::New(env, windowssys_windows_win32_storage_iscsidisc_RefreshISNSServerW_napi));
    exports.Set("windowssys_windows_win32_storage_iscsidisc_RefreshIScsiSendTargetPortalA", Napi::Function::New(env, windowssys_windows_win32_storage_iscsidisc_RefreshIScsiSendTargetPortalA_napi));
    exports.Set("windowssys_windows_win32_storage_iscsidisc_RefreshIScsiSendTargetPortalW", Napi::Function::New(env, windowssys_windows_win32_storage_iscsidisc_RefreshIScsiSendTargetPortalW_napi));
    exports.Set("windowssys_windows_win32_storage_iscsidisc_RemoveISNSServerA", Napi::Function::New(env, windowssys_windows_win32_storage_iscsidisc_RemoveISNSServerA_napi));
    exports.Set("windowssys_windows_win32_storage_iscsidisc_RemoveISNSServerW", Napi::Function::New(env, windowssys_windows_win32_storage_iscsidisc_RemoveISNSServerW_napi));
    exports.Set("windowssys_windows_win32_storage_iscsidisc_RemoveIScsiConnection", Napi::Function::New(env, windowssys_windows_win32_storage_iscsidisc_RemoveIScsiConnection_napi));
    exports.Set("windowssys_windows_win32_storage_iscsidisc_RemoveIScsiPersistentTargetA", Napi::Function::New(env, windowssys_windows_win32_storage_iscsidisc_RemoveIScsiPersistentTargetA_napi));
    exports.Set("windowssys_windows_win32_storage_iscsidisc_RemoveIScsiPersistentTargetW", Napi::Function::New(env, windowssys_windows_win32_storage_iscsidisc_RemoveIScsiPersistentTargetW_napi));
    exports.Set("windowssys_windows_win32_storage_iscsidisc_RemoveIScsiSendTargetPortalA", Napi::Function::New(env, windowssys_windows_win32_storage_iscsidisc_RemoveIScsiSendTargetPortalA_napi));
    exports.Set("windowssys_windows_win32_storage_iscsidisc_RemoveIScsiSendTargetPortalW", Napi::Function::New(env, windowssys_windows_win32_storage_iscsidisc_RemoveIScsiSendTargetPortalW_napi));
    exports.Set("windowssys_windows_win32_storage_iscsidisc_RemoveIScsiStaticTargetA", Napi::Function::New(env, windowssys_windows_win32_storage_iscsidisc_RemoveIScsiStaticTargetA_napi));
    exports.Set("windowssys_windows_win32_storage_iscsidisc_RemoveIScsiStaticTargetW", Napi::Function::New(env, windowssys_windows_win32_storage_iscsidisc_RemoveIScsiStaticTargetW_napi));
    exports.Set("windowssys_windows_win32_storage_iscsidisc_RemovePersistentIScsiDeviceA", Napi::Function::New(env, windowssys_windows_win32_storage_iscsidisc_RemovePersistentIScsiDeviceA_napi));
    exports.Set("windowssys_windows_win32_storage_iscsidisc_RemovePersistentIScsiDeviceW", Napi::Function::New(env, windowssys_windows_win32_storage_iscsidisc_RemovePersistentIScsiDeviceW_napi));
    exports.Set("windowssys_windows_win32_storage_iscsidisc_RemoveRadiusServerA", Napi::Function::New(env, windowssys_windows_win32_storage_iscsidisc_RemoveRadiusServerA_napi));
    exports.Set("windowssys_windows_win32_storage_iscsidisc_RemoveRadiusServerW", Napi::Function::New(env, windowssys_windows_win32_storage_iscsidisc_RemoveRadiusServerW_napi));
    exports.Set("windowssys_windows_win32_storage_iscsidisc_ReportActiveIScsiTargetMappingsA", Napi::Function::New(env, windowssys_windows_win32_storage_iscsidisc_ReportActiveIScsiTargetMappingsA_napi));
    exports.Set("windowssys_windows_win32_storage_iscsidisc_ReportActiveIScsiTargetMappingsW", Napi::Function::New(env, windowssys_windows_win32_storage_iscsidisc_ReportActiveIScsiTargetMappingsW_napi));
    exports.Set("windowssys_windows_win32_storage_iscsidisc_ReportISNSServerListA", Napi::Function::New(env, windowssys_windows_win32_storage_iscsidisc_ReportISNSServerListA_napi));
    exports.Set("windowssys_windows_win32_storage_iscsidisc_ReportISNSServerListW", Napi::Function::New(env, windowssys_windows_win32_storage_iscsidisc_ReportISNSServerListW_napi));
    exports.Set("windowssys_windows_win32_storage_iscsidisc_ReportIScsiInitiatorListA", Napi::Function::New(env, windowssys_windows_win32_storage_iscsidisc_ReportIScsiInitiatorListA_napi));
    exports.Set("windowssys_windows_win32_storage_iscsidisc_ReportIScsiInitiatorListW", Napi::Function::New(env, windowssys_windows_win32_storage_iscsidisc_ReportIScsiInitiatorListW_napi));
    exports.Set("windowssys_windows_win32_storage_iscsidisc_ReportIScsiPersistentLoginsA", Napi::Function::New(env, windowssys_windows_win32_storage_iscsidisc_ReportIScsiPersistentLoginsA_napi));
    exports.Set("windowssys_windows_win32_storage_iscsidisc_ReportIScsiPersistentLoginsW", Napi::Function::New(env, windowssys_windows_win32_storage_iscsidisc_ReportIScsiPersistentLoginsW_napi));
    exports.Set("windowssys_windows_win32_storage_iscsidisc_ReportIScsiSendTargetPortalsA", Napi::Function::New(env, windowssys_windows_win32_storage_iscsidisc_ReportIScsiSendTargetPortalsA_napi));
    exports.Set("windowssys_windows_win32_storage_iscsidisc_ReportIScsiSendTargetPortalsExA", Napi::Function::New(env, windowssys_windows_win32_storage_iscsidisc_ReportIScsiSendTargetPortalsExA_napi));
    exports.Set("windowssys_windows_win32_storage_iscsidisc_ReportIScsiSendTargetPortalsExW", Napi::Function::New(env, windowssys_windows_win32_storage_iscsidisc_ReportIScsiSendTargetPortalsExW_napi));
    exports.Set("windowssys_windows_win32_storage_iscsidisc_ReportIScsiSendTargetPortalsW", Napi::Function::New(env, windowssys_windows_win32_storage_iscsidisc_ReportIScsiSendTargetPortalsW_napi));
    exports.Set("windowssys_windows_win32_storage_iscsidisc_ReportIScsiTargetPortalsA", Napi::Function::New(env, windowssys_windows_win32_storage_iscsidisc_ReportIScsiTargetPortalsA_napi));
    exports.Set("windowssys_windows_win32_storage_iscsidisc_ReportIScsiTargetPortalsW", Napi::Function::New(env, windowssys_windows_win32_storage_iscsidisc_ReportIScsiTargetPortalsW_napi));
    exports.Set("windowssys_windows_win32_storage_iscsidisc_ReportIScsiTargetsA", Napi::Function::New(env, windowssys_windows_win32_storage_iscsidisc_ReportIScsiTargetsA_napi));
    exports.Set("windowssys_windows_win32_storage_iscsidisc_ReportIScsiTargetsW", Napi::Function::New(env, windowssys_windows_win32_storage_iscsidisc_ReportIScsiTargetsW_napi));
    exports.Set("windowssys_windows_win32_storage_iscsidisc_ReportPersistentIScsiDevicesA", Napi::Function::New(env, windowssys_windows_win32_storage_iscsidisc_ReportPersistentIScsiDevicesA_napi));
    exports.Set("windowssys_windows_win32_storage_iscsidisc_ReportPersistentIScsiDevicesW", Napi::Function::New(env, windowssys_windows_win32_storage_iscsidisc_ReportPersistentIScsiDevicesW_napi));
    exports.Set("windowssys_windows_win32_storage_iscsidisc_ReportRadiusServerListA", Napi::Function::New(env, windowssys_windows_win32_storage_iscsidisc_ReportRadiusServerListA_napi));
    exports.Set("windowssys_windows_win32_storage_iscsidisc_ReportRadiusServerListW", Napi::Function::New(env, windowssys_windows_win32_storage_iscsidisc_ReportRadiusServerListW_napi));
    exports.Set("windowssys_windows_win32_storage_iscsidisc_SendScsiInquiry", Napi::Function::New(env, windowssys_windows_win32_storage_iscsidisc_SendScsiInquiry_napi));
    exports.Set("windowssys_windows_win32_storage_iscsidisc_SendScsiReadCapacity", Napi::Function::New(env, windowssys_windows_win32_storage_iscsidisc_SendScsiReadCapacity_napi));
    exports.Set("windowssys_windows_win32_storage_iscsidisc_SendScsiReportLuns", Napi::Function::New(env, windowssys_windows_win32_storage_iscsidisc_SendScsiReportLuns_napi));
    exports.Set("windowssys_windows_win32_storage_iscsidisc_SetIScsiGroupPresharedKey", Napi::Function::New(env, windowssys_windows_win32_storage_iscsidisc_SetIScsiGroupPresharedKey_napi));
    exports.Set("windowssys_windows_win32_storage_iscsidisc_SetIScsiIKEInfoA", Napi::Function::New(env, windowssys_windows_win32_storage_iscsidisc_SetIScsiIKEInfoA_napi));
    exports.Set("windowssys_windows_win32_storage_iscsidisc_SetIScsiIKEInfoW", Napi::Function::New(env, windowssys_windows_win32_storage_iscsidisc_SetIScsiIKEInfoW_napi));
    exports.Set("windowssys_windows_win32_storage_iscsidisc_SetIScsiInitiatorCHAPSharedSecret", Napi::Function::New(env, windowssys_windows_win32_storage_iscsidisc_SetIScsiInitiatorCHAPSharedSecret_napi));
    exports.Set("windowssys_windows_win32_storage_iscsidisc_SetIScsiInitiatorNodeNameA", Napi::Function::New(env, windowssys_windows_win32_storage_iscsidisc_SetIScsiInitiatorNodeNameA_napi));
    exports.Set("windowssys_windows_win32_storage_iscsidisc_SetIScsiInitiatorNodeNameW", Napi::Function::New(env, windowssys_windows_win32_storage_iscsidisc_SetIScsiInitiatorNodeNameW_napi));
    exports.Set("windowssys_windows_win32_storage_iscsidisc_SetIScsiInitiatorRADIUSSharedSecret", Napi::Function::New(env, windowssys_windows_win32_storage_iscsidisc_SetIScsiInitiatorRADIUSSharedSecret_napi));
    exports.Set("windowssys_windows_win32_storage_iscsidisc_SetIScsiTunnelModeOuterAddressA", Napi::Function::New(env, windowssys_windows_win32_storage_iscsidisc_SetIScsiTunnelModeOuterAddressA_napi));
    exports.Set("windowssys_windows_win32_storage_iscsidisc_SetIScsiTunnelModeOuterAddressW", Napi::Function::New(env, windowssys_windows_win32_storage_iscsidisc_SetIScsiTunnelModeOuterAddressW_napi));
    exports.Set("windowssys_windows_win32_storage_iscsidisc_SetupPersistentIScsiDevices", Napi::Function::New(env, windowssys_windows_win32_storage_iscsidisc_SetupPersistentIScsiDevices_napi));
    exports.Set("windowssys_windows_win32_storage_iscsidisc_SetupPersistentIScsiVolumes", Napi::Function::New(env, windowssys_windows_win32_storage_iscsidisc_SetupPersistentIScsiVolumes_napi));
}

static KmNapiRegistrarNode registrar_node = { &register_windows_win32_storage_iscsidisc_napi, nullptr };
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
