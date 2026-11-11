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

static Napi::Value windowssys_windows_win32_system_power_callNtPowerInformation_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t informationlevel = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* inputbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t inputbufferlength = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* outputbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t outputbufferlength = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CallNtPowerInformation")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(informationlevel, inputbuffer, inputbufferlength, outputbuffer, outputbufferlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)informationlevel;
    (void)inputbuffer;
    (void)inputbufferlength;
    (void)outputbuffer;
    (void)outputbufferlength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_power_canUserWritePwrScheme_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CanUserWritePwrScheme")));
    }
    bool km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr();
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    errno = ENOSYS;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_win32_system_power_deletePwrScheme_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t uiid = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DeletePwrScheme")));
    }
    bool km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(uiid);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)uiid;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_win32_system_power_devicePowerClose_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DevicePowerClose")));
    }
    bool km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr();
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    errno = ENOSYS;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_win32_system_power_devicePowerEnumDevices_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t queryindex = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t queryinterpretationflags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t queryflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* preturnbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pbuffersize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DevicePowerEnumDevices")));
    }
    bool km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(queryindex, queryinterpretationflags, queryflags, preturnbuffer, pbuffersize);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)queryindex;
    (void)queryinterpretationflags;
    (void)queryflags;
    (void)preturnbuffer;
    (void)pbuffersize;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_win32_system_power_devicePowerOpen_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t debugmask = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DevicePowerOpen")));
    }
    bool km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(debugmask);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)debugmask;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_win32_system_power_devicePowerSetDeviceState_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* devicedescription = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t setflags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* setdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DevicePowerSetDeviceState")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(devicedescription, setflags, setdata);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)devicedescription;
    (void)setflags;
    (void)setdata;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_power_enumPwrSchemes_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpfn = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int64_t lparam = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "EnumPwrSchemes")));
    }
    bool km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(lpfn, lparam);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)lpfn;
    (void)lparam;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_win32_system_power_getActivePwrScheme_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* puiid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetActivePwrScheme")));
    }
    bool km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(puiid);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)puiid;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_win32_system_power_getCurrentPowerPolicies_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pglobalpowerpolicy = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ppowerpolicy = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetCurrentPowerPolicies")));
    }
    bool km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(pglobalpowerpolicy, ppowerpolicy);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)pglobalpowerpolicy;
    (void)ppowerpolicy;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_win32_system_power_getDevicePowerState_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hdevice = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pfon = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetDevicePowerState")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hdevice, pfon);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdevice;
    (void)pfon;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_power_getPwrCapabilities_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpspc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetPwrCapabilities")));
    }
    bool km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(lpspc);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)lpspc;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_win32_system_power_getPwrDiskSpindownRange_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* puimax = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* puimin = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetPwrDiskSpindownRange")));
    }
    bool km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(puimax, puimin);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)puimax;
    (void)puimin;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_win32_system_power_getSystemPowerStatus_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpsystempowerstatus = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetSystemPowerStatus")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(lpsystempowerstatus);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpsystempowerstatus;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_power_isAdminOverrideActive_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* papp = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IsAdminOverrideActive")));
    }
    bool km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(papp);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)papp;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_win32_system_power_isPwrHibernateAllowed_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IsPwrHibernateAllowed")));
    }
    bool km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr();
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    errno = ENOSYS;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_win32_system_power_isPwrShutdownAllowed_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IsPwrShutdownAllowed")));
    }
    bool km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr();
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    errno = ENOSYS;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_win32_system_power_isPwrSuspendAllowed_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IsPwrSuspendAllowed")));
    }
    bool km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr();
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    errno = ENOSYS;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_win32_system_power_isSystemResumeAutomatic_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IsSystemResumeAutomatic")));
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

static Napi::Value windowssys_windows_win32_system_power_powerCanRestoreIndividualDefaultPowerScheme_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* schemeguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PowerCanRestoreIndividualDefaultPowerScheme")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(schemeguid);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)schemeguid;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_power_powerClearRequest_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* powerrequest = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t requesttype = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PowerClearRequest")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(powerrequest, requesttype);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)powerrequest;
    (void)requesttype;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_power_powerCreatePossibleSetting_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* rootsystempowerkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* subgroupofpowersettingsguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* powersettingguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t possiblesettingindex = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PowerCreatePossibleSetting")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(rootsystempowerkey, subgroupofpowersettingsguid, powersettingguid, possiblesettingindex);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rootsystempowerkey;
    (void)subgroupofpowersettingsguid;
    (void)powersettingguid;
    (void)possiblesettingindex;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_power_powerCreateRequest_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* context = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PowerCreateRequest")));
    }
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(context);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
#else
    (void)context;
    errno = ENOSYS;
    void* km_res = nullptr;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_power_powerCreateSetting_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* rootsystempowerkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* subgroupofpowersettingsguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* powersettingguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PowerCreateSetting")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(rootsystempowerkey, subgroupofpowersettingsguid, powersettingguid);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rootsystempowerkey;
    (void)subgroupofpowersettingsguid;
    (void)powersettingguid;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_power_powerDeleteScheme_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* rootpowerkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* schemeguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PowerDeleteScheme")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(rootpowerkey, schemeguid);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rootpowerkey;
    (void)schemeguid;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_power_powerDeterminePlatformRole_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PowerDeterminePlatformRole")));
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

static Napi::Value windowssys_windows_win32_system_power_powerDeterminePlatformRoleEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t version = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PowerDeterminePlatformRoleEx")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(version);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)version;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_power_powerDuplicateScheme_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* rootpowerkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* sourceschemeguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* destinationschemeguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PowerDuplicateScheme")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(rootpowerkey, sourceschemeguid, destinationschemeguid);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rootpowerkey;
    (void)sourceschemeguid;
    (void)destinationschemeguid;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_power_powerEnumerate_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* rootpowerkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* schemeguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* subgroupofpowersettingsguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int32_t accessflags = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t arg_4_index = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* buffersize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PowerEnumerate")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(rootpowerkey, schemeguid, subgroupofpowersettingsguid, accessflags, arg_4_index, buffer, buffersize);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rootpowerkey;
    (void)schemeguid;
    (void)subgroupofpowersettingsguid;
    (void)accessflags;
    (void)arg_4_index;
    (void)buffer;
    (void)buffersize;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_power_powerGetActiveScheme_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* userrootpowerkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* activepolicyguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PowerGetActiveScheme")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(userrootpowerkey, activepolicyguid);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)userrootpowerkey;
    (void)activepolicyguid;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_power_powerImportPowerScheme_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* rootpowerkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* importfilenamepath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* destinationschemeguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PowerImportPowerScheme")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(rootpowerkey, importfilenamepath, destinationschemeguid);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rootpowerkey;
    (void)importfilenamepath;
    (void)destinationschemeguid;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_power_powerIsSettingRangeDefined_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* subkeyguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* settingguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PowerIsSettingRangeDefined")));
    }
    bool km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(subkeyguid, settingguid);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)subkeyguid;
    (void)settingguid;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_win32_system_power_powerOpenSystemPowerKey_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* phsystempowerkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t access = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t openexisting = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PowerOpenSystemPowerKey")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(phsystempowerkey, access, openexisting);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)phsystempowerkey;
    (void)access;
    (void)openexisting;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_power_powerOpenUserPowerKey_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* phuserpowerkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t access = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t openexisting = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PowerOpenUserPowerKey")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(phuserpowerkey, access, openexisting);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)phuserpowerkey;
    (void)access;
    (void)openexisting;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_power_powerReadACDefaultIndex_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* rootpowerkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* schemepersonalityguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* subgroupofpowersettingsguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* powersettingguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* acdefaultindex = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PowerReadACDefaultIndex")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(rootpowerkey, schemepersonalityguid, subgroupofpowersettingsguid, powersettingguid, acdefaultindex);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rootpowerkey;
    (void)schemepersonalityguid;
    (void)subgroupofpowersettingsguid;
    (void)powersettingguid;
    (void)acdefaultindex;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_power_powerReadACValue_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* rootpowerkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* schemeguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* subgroupofpowersettingsguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* powersettingguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* type = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* buffersize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PowerReadACValue")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(rootpowerkey, schemeguid, subgroupofpowersettingsguid, powersettingguid, type, buffer, buffersize);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rootpowerkey;
    (void)schemeguid;
    (void)subgroupofpowersettingsguid;
    (void)powersettingguid;
    (void)type;
    (void)buffer;
    (void)buffersize;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_power_powerReadACValueIndex_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* rootpowerkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* schemeguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* subgroupofpowersettingsguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* powersettingguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* acvalueindex = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PowerReadACValueIndex")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(rootpowerkey, schemeguid, subgroupofpowersettingsguid, powersettingguid, acvalueindex);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rootpowerkey;
    (void)schemeguid;
    (void)subgroupofpowersettingsguid;
    (void)powersettingguid;
    (void)acvalueindex;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_power_powerReadDCDefaultIndex_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* rootpowerkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* schemepersonalityguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* subgroupofpowersettingsguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* powersettingguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* dcdefaultindex = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PowerReadDCDefaultIndex")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(rootpowerkey, schemepersonalityguid, subgroupofpowersettingsguid, powersettingguid, dcdefaultindex);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rootpowerkey;
    (void)schemepersonalityguid;
    (void)subgroupofpowersettingsguid;
    (void)powersettingguid;
    (void)dcdefaultindex;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_power_powerReadDCValue_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* rootpowerkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* schemeguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* subgroupofpowersettingsguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* powersettingguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* type = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* buffersize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PowerReadDCValue")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(rootpowerkey, schemeguid, subgroupofpowersettingsguid, powersettingguid, type, buffer, buffersize);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rootpowerkey;
    (void)schemeguid;
    (void)subgroupofpowersettingsguid;
    (void)powersettingguid;
    (void)type;
    (void)buffer;
    (void)buffersize;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_power_powerReadDCValueIndex_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* rootpowerkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* schemeguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* subgroupofpowersettingsguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* powersettingguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* dcvalueindex = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PowerReadDCValueIndex")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(rootpowerkey, schemeguid, subgroupofpowersettingsguid, powersettingguid, dcvalueindex);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rootpowerkey;
    (void)schemeguid;
    (void)subgroupofpowersettingsguid;
    (void)powersettingguid;
    (void)dcvalueindex;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_power_powerReadDescription_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* rootpowerkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* schemeguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* subgroupofpowersettingsguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* powersettingguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* buffersize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PowerReadDescription")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(rootpowerkey, schemeguid, subgroupofpowersettingsguid, powersettingguid, buffer, buffersize);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rootpowerkey;
    (void)schemeguid;
    (void)subgroupofpowersettingsguid;
    (void)powersettingguid;
    (void)buffer;
    (void)buffersize;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_power_powerReadFriendlyName_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* rootpowerkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* schemeguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* subgroupofpowersettingsguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* powersettingguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* buffersize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PowerReadFriendlyName")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(rootpowerkey, schemeguid, subgroupofpowersettingsguid, powersettingguid, buffer, buffersize);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rootpowerkey;
    (void)schemeguid;
    (void)subgroupofpowersettingsguid;
    (void)powersettingguid;
    (void)buffer;
    (void)buffersize;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_power_powerReadIconResourceSpecifier_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* rootpowerkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* schemeguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* subgroupofpowersettingsguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* powersettingguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* buffersize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PowerReadIconResourceSpecifier")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(rootpowerkey, schemeguid, subgroupofpowersettingsguid, powersettingguid, buffer, buffersize);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rootpowerkey;
    (void)schemeguid;
    (void)subgroupofpowersettingsguid;
    (void)powersettingguid;
    (void)buffer;
    (void)buffersize;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_power_powerReadPossibleDescription_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* rootpowerkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* subgroupofpowersettingsguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* powersettingguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t possiblesettingindex = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* buffersize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PowerReadPossibleDescription")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(rootpowerkey, subgroupofpowersettingsguid, powersettingguid, possiblesettingindex, buffer, buffersize);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rootpowerkey;
    (void)subgroupofpowersettingsguid;
    (void)powersettingguid;
    (void)possiblesettingindex;
    (void)buffer;
    (void)buffersize;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_power_powerReadPossibleFriendlyName_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* rootpowerkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* subgroupofpowersettingsguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* powersettingguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t possiblesettingindex = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* buffersize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PowerReadPossibleFriendlyName")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(rootpowerkey, subgroupofpowersettingsguid, powersettingguid, possiblesettingindex, buffer, buffersize);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rootpowerkey;
    (void)subgroupofpowersettingsguid;
    (void)powersettingguid;
    (void)possiblesettingindex;
    (void)buffer;
    (void)buffersize;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_power_powerReadPossibleValue_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* rootpowerkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* subgroupofpowersettingsguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* powersettingguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* type = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t possiblesettingindex = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* buffersize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PowerReadPossibleValue")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(rootpowerkey, subgroupofpowersettingsguid, powersettingguid, type, possiblesettingindex, buffer, buffersize);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rootpowerkey;
    (void)subgroupofpowersettingsguid;
    (void)powersettingguid;
    (void)type;
    (void)possiblesettingindex;
    (void)buffer;
    (void)buffersize;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_power_powerReadSettingAttributes_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* subgroupguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* powersettingguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PowerReadSettingAttributes")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(subgroupguid, powersettingguid);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)subgroupguid;
    (void)powersettingguid;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_power_powerReadValueIncrement_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* rootpowerkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* subgroupofpowersettingsguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* powersettingguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* valueincrement = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PowerReadValueIncrement")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(rootpowerkey, subgroupofpowersettingsguid, powersettingguid, valueincrement);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rootpowerkey;
    (void)subgroupofpowersettingsguid;
    (void)powersettingguid;
    (void)valueincrement;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_power_powerReadValueMax_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* rootpowerkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* subgroupofpowersettingsguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* powersettingguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* valuemaximum = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PowerReadValueMax")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(rootpowerkey, subgroupofpowersettingsguid, powersettingguid, valuemaximum);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rootpowerkey;
    (void)subgroupofpowersettingsguid;
    (void)powersettingguid;
    (void)valuemaximum;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_power_powerReadValueMin_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* rootpowerkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* subgroupofpowersettingsguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* powersettingguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* valueminimum = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PowerReadValueMin")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(rootpowerkey, subgroupofpowersettingsguid, powersettingguid, valueminimum);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rootpowerkey;
    (void)subgroupofpowersettingsguid;
    (void)powersettingguid;
    (void)valueminimum;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_power_powerReadValueUnitsSpecifier_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* rootpowerkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* subgroupofpowersettingsguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* powersettingguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* buffersize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PowerReadValueUnitsSpecifier")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(rootpowerkey, subgroupofpowersettingsguid, powersettingguid, buffer, buffersize);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rootpowerkey;
    (void)subgroupofpowersettingsguid;
    (void)powersettingguid;
    (void)buffer;
    (void)buffersize;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_power_powerRegisterForEffectivePowerModeNotifications_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t version = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* callback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* context = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* registrationhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PowerRegisterForEffectivePowerModeNotifications")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(version, callback, context, registrationhandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)version;
    (void)callback;
    (void)context;
    (void)registrationhandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_power_powerRegisterSuspendResumeNotification_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* recipient = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* registrationhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PowerRegisterSuspendResumeNotification")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(flags, recipient, registrationhandle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)flags;
    (void)recipient;
    (void)registrationhandle;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_power_powerRemovePowerSetting_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* powersettingsubkeyguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* powersettingguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PowerRemovePowerSetting")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(powersettingsubkeyguid, powersettingguid);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)powersettingsubkeyguid;
    (void)powersettingguid;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_power_powerReplaceDefaultPowerSchemes_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PowerReplaceDefaultPowerSchemes")));
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

static Napi::Value windowssys_windows_win32_system_power_powerReportThermalEvent_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* event = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PowerReportThermalEvent")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(event);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)event;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_power_powerRestoreDefaultPowerSchemes_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PowerRestoreDefaultPowerSchemes")));
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

static Napi::Value windowssys_windows_win32_system_power_powerRestoreIndividualDefaultPowerScheme_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* schemeguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PowerRestoreIndividualDefaultPowerScheme")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(schemeguid);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)schemeguid;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_power_powerSetActiveScheme_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* userrootpowerkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* schemeguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PowerSetActiveScheme")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(userrootpowerkey, schemeguid);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)userrootpowerkey;
    (void)schemeguid;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_power_powerSetRequest_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* powerrequest = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t requesttype = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PowerSetRequest")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(powerrequest, requesttype);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)powerrequest;
    (void)requesttype;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_power_powerSettingAccessCheck_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t accessflags = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* powerguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PowerSettingAccessCheck")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(accessflags, powerguid);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)accessflags;
    (void)powerguid;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_power_powerSettingAccessCheckEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t accessflags = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* powerguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t accesstype = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PowerSettingAccessCheckEx")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(accessflags, powerguid, accesstype);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)accessflags;
    (void)powerguid;
    (void)accesstype;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_power_powerSettingRegisterNotification_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* settingguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* recipient = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* registrationhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PowerSettingRegisterNotification")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(settingguid, flags, recipient, registrationhandle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)settingguid;
    (void)flags;
    (void)recipient;
    (void)registrationhandle;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_power_powerSettingUnregisterNotification_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t registrationhandle = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PowerSettingUnregisterNotification")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(registrationhandle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)registrationhandle;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_power_powerUnregisterFromEffectivePowerModeNotifications_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* registrationhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PowerUnregisterFromEffectivePowerModeNotifications")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(registrationhandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)registrationhandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_power_powerUnregisterSuspendResumeNotification_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t registrationhandle = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PowerUnregisterSuspendResumeNotification")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(registrationhandle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)registrationhandle;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_power_powerWriteACDefaultIndex_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* rootsystempowerkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* schemepersonalityguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* subgroupofpowersettingsguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* powersettingguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t defaultacindex = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PowerWriteACDefaultIndex")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(rootsystempowerkey, schemepersonalityguid, subgroupofpowersettingsguid, powersettingguid, defaultacindex);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rootsystempowerkey;
    (void)schemepersonalityguid;
    (void)subgroupofpowersettingsguid;
    (void)powersettingguid;
    (void)defaultacindex;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_power_powerWriteACValueIndex_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* rootpowerkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* schemeguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* subgroupofpowersettingsguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* powersettingguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t acvalueindex = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PowerWriteACValueIndex")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(rootpowerkey, schemeguid, subgroupofpowersettingsguid, powersettingguid, acvalueindex);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rootpowerkey;
    (void)schemeguid;
    (void)subgroupofpowersettingsguid;
    (void)powersettingguid;
    (void)acvalueindex;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_power_powerWriteDCDefaultIndex_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* rootsystempowerkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* schemepersonalityguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* subgroupofpowersettingsguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* powersettingguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t defaultdcindex = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PowerWriteDCDefaultIndex")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(rootsystempowerkey, schemepersonalityguid, subgroupofpowersettingsguid, powersettingguid, defaultdcindex);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rootsystempowerkey;
    (void)schemepersonalityguid;
    (void)subgroupofpowersettingsguid;
    (void)powersettingguid;
    (void)defaultdcindex;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_power_powerWriteDCValueIndex_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* rootpowerkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* schemeguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* subgroupofpowersettingsguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* powersettingguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t dcvalueindex = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PowerWriteDCValueIndex")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(rootpowerkey, schemeguid, subgroupofpowersettingsguid, powersettingguid, dcvalueindex);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rootpowerkey;
    (void)schemeguid;
    (void)subgroupofpowersettingsguid;
    (void)powersettingguid;
    (void)dcvalueindex;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_power_powerWriteDescription_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* rootpowerkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* schemeguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* subgroupofpowersettingsguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* powersettingguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t buffersize = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PowerWriteDescription")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(rootpowerkey, schemeguid, subgroupofpowersettingsguid, powersettingguid, buffer, buffersize);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rootpowerkey;
    (void)schemeguid;
    (void)subgroupofpowersettingsguid;
    (void)powersettingguid;
    (void)buffer;
    (void)buffersize;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_power_powerWriteFriendlyName_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* rootpowerkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* schemeguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* subgroupofpowersettingsguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* powersettingguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t buffersize = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PowerWriteFriendlyName")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(rootpowerkey, schemeguid, subgroupofpowersettingsguid, powersettingguid, buffer, buffersize);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rootpowerkey;
    (void)schemeguid;
    (void)subgroupofpowersettingsguid;
    (void)powersettingguid;
    (void)buffer;
    (void)buffersize;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_power_powerWriteIconResourceSpecifier_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* rootpowerkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* schemeguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* subgroupofpowersettingsguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* powersettingguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t buffersize = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PowerWriteIconResourceSpecifier")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(rootpowerkey, schemeguid, subgroupofpowersettingsguid, powersettingguid, buffer, buffersize);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rootpowerkey;
    (void)schemeguid;
    (void)subgroupofpowersettingsguid;
    (void)powersettingguid;
    (void)buffer;
    (void)buffersize;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_power_powerWritePossibleDescription_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* rootpowerkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* subgroupofpowersettingsguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* powersettingguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t possiblesettingindex = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t buffersize = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PowerWritePossibleDescription")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(rootpowerkey, subgroupofpowersettingsguid, powersettingguid, possiblesettingindex, buffer, buffersize);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rootpowerkey;
    (void)subgroupofpowersettingsguid;
    (void)powersettingguid;
    (void)possiblesettingindex;
    (void)buffer;
    (void)buffersize;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_power_powerWritePossibleFriendlyName_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* rootpowerkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* subgroupofpowersettingsguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* powersettingguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t possiblesettingindex = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t buffersize = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PowerWritePossibleFriendlyName")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(rootpowerkey, subgroupofpowersettingsguid, powersettingguid, possiblesettingindex, buffer, buffersize);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rootpowerkey;
    (void)subgroupofpowersettingsguid;
    (void)powersettingguid;
    (void)possiblesettingindex;
    (void)buffer;
    (void)buffersize;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_power_powerWritePossibleValue_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* rootpowerkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* subgroupofpowersettingsguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* powersettingguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t type = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t possiblesettingindex = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    uint32_t buffersize = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PowerWritePossibleValue")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(rootpowerkey, subgroupofpowersettingsguid, powersettingguid, type, possiblesettingindex, buffer, buffersize);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rootpowerkey;
    (void)subgroupofpowersettingsguid;
    (void)powersettingguid;
    (void)type;
    (void)possiblesettingindex;
    (void)buffer;
    (void)buffersize;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_power_powerWriteSettingAttributes_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* subgroupguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* powersettingguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t attributes = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PowerWriteSettingAttributes")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(subgroupguid, powersettingguid, attributes);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)subgroupguid;
    (void)powersettingguid;
    (void)attributes;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_power_powerWriteValueIncrement_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* rootpowerkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* subgroupofpowersettingsguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* powersettingguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t valueincrement = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PowerWriteValueIncrement")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(rootpowerkey, subgroupofpowersettingsguid, powersettingguid, valueincrement);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rootpowerkey;
    (void)subgroupofpowersettingsguid;
    (void)powersettingguid;
    (void)valueincrement;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_power_powerWriteValueMax_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* rootpowerkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* subgroupofpowersettingsguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* powersettingguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t valuemaximum = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PowerWriteValueMax")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(rootpowerkey, subgroupofpowersettingsguid, powersettingguid, valuemaximum);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rootpowerkey;
    (void)subgroupofpowersettingsguid;
    (void)powersettingguid;
    (void)valuemaximum;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_power_powerWriteValueMin_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* rootpowerkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* subgroupofpowersettingsguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* powersettingguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t valueminimum = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PowerWriteValueMin")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(rootpowerkey, subgroupofpowersettingsguid, powersettingguid, valueminimum);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rootpowerkey;
    (void)subgroupofpowersettingsguid;
    (void)powersettingguid;
    (void)valueminimum;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_power_powerWriteValueUnitsSpecifier_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* rootpowerkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* subgroupofpowersettingsguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* powersettingguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t buffersize = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PowerWriteValueUnitsSpecifier")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(rootpowerkey, subgroupofpowersettingsguid, powersettingguid, buffer, buffersize);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rootpowerkey;
    (void)subgroupofpowersettingsguid;
    (void)powersettingguid;
    (void)buffer;
    (void)buffersize;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_power_readGlobalPwrPolicy_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pglobalpowerpolicy = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ReadGlobalPwrPolicy")));
    }
    bool km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(pglobalpowerpolicy);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)pglobalpowerpolicy;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_win32_system_power_readProcessorPwrScheme_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t uiid = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* pmachineprocessorpowerpolicy = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ReadProcessorPwrScheme")));
    }
    bool km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(uiid, pmachineprocessorpowerpolicy);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)uiid;
    (void)pmachineprocessorpowerpolicy;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_win32_system_power_readPwrScheme_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t uiid = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* ppowerpolicy = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ReadPwrScheme")));
    }
    bool km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(uiid, ppowerpolicy);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)uiid;
    (void)ppowerpolicy;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_win32_system_power_registerPowerSettingNotification_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hrecipient = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* powersettingguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RegisterPowerSettingNotification")));
    }
    int64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hrecipient, powersettingguid, flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hrecipient;
    (void)powersettingguid;
    (void)flags;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_system_power_registerSuspendResumeNotification_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hrecipient = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RegisterSuspendResumeNotification")));
    }
    int64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hrecipient, flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hrecipient;
    (void)flags;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_system_power_requestWakeupLatency_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t latency = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RequestWakeupLatency")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(latency);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)latency;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_power_setActivePwrScheme_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t uiid = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* pglobalpowerpolicy = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* ppowerpolicy = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetActivePwrScheme")));
    }
    bool km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(uiid, pglobalpowerpolicy, ppowerpolicy);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)uiid;
    (void)pglobalpowerpolicy;
    (void)ppowerpolicy;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_win32_system_power_setSuspendState_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    bool bhibernate = km_info.Length() > 0 ? km_info[0].ToBoolean().Value() : false;
    bool bforce = km_info.Length() > 1 ? km_info[1].ToBoolean().Value() : false;
    bool bwakeupeventsdisabled = km_info.Length() > 2 ? km_info[2].ToBoolean().Value() : false;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(bool, bool, bool);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetSuspendState")));
    }
    bool km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(bhibernate, bforce, bwakeupeventsdisabled);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)bhibernate;
    (void)bforce;
    (void)bwakeupeventsdisabled;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_win32_system_power_setSystemPowerState_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t fsuspend = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    int32_t fforce = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetSystemPowerState")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(fsuspend, fforce);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)fsuspend;
    (void)fforce;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_power_setThreadExecutionState_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t esflags = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetThreadExecutionState")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(esflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)esflags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_power_unregisterPowerSettingNotification_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t handle = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "UnregisterPowerSettingNotification")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(handle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)handle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_power_unregisterSuspendResumeNotification_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t handle = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "UnregisterSuspendResumeNotification")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(handle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)handle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_power_validatePowerPolicies_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pglobalpowerpolicy = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ppowerpolicy = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ValidatePowerPolicies")));
    }
    bool km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(pglobalpowerpolicy, ppowerpolicy);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)pglobalpowerpolicy;
    (void)ppowerpolicy;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_win32_system_power_writeGlobalPwrPolicy_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pglobalpowerpolicy = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WriteGlobalPwrPolicy")));
    }
    bool km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(pglobalpowerpolicy);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)pglobalpowerpolicy;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_win32_system_power_writeProcessorPwrScheme_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t uiid = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* pmachineprocessorpowerpolicy = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WriteProcessorPwrScheme")));
    }
    bool km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(uiid, pmachineprocessorpowerpolicy);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)uiid;
    (void)pmachineprocessorpowerpolicy;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_win32_system_power_writePwrScheme_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* puiid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpszschemename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* lpszdescription = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* lpscheme = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WritePwrScheme")));
    }
    bool km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(puiid, lpszschemename, lpszdescription, lpscheme);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)puiid;
    (void)lpszschemename;
    (void)lpszdescription;
    (void)lpscheme;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static void register_windows_win32_system_power_napi(Napi::Env env, Napi::Object exports) {
    exports.Set("windowssys_windows_win32_system_power_callNtPowerInformation", Napi::Function::New(env, windowssys_windows_win32_system_power_callNtPowerInformation_napi));
    exports.Set("windowssys_windows_win32_system_power_canUserWritePwrScheme", Napi::Function::New(env, windowssys_windows_win32_system_power_canUserWritePwrScheme_napi));
    exports.Set("windowssys_windows_win32_system_power_deletePwrScheme", Napi::Function::New(env, windowssys_windows_win32_system_power_deletePwrScheme_napi));
    exports.Set("windowssys_windows_win32_system_power_devicePowerClose", Napi::Function::New(env, windowssys_windows_win32_system_power_devicePowerClose_napi));
    exports.Set("windowssys_windows_win32_system_power_devicePowerEnumDevices", Napi::Function::New(env, windowssys_windows_win32_system_power_devicePowerEnumDevices_napi));
    exports.Set("windowssys_windows_win32_system_power_devicePowerOpen", Napi::Function::New(env, windowssys_windows_win32_system_power_devicePowerOpen_napi));
    exports.Set("windowssys_windows_win32_system_power_devicePowerSetDeviceState", Napi::Function::New(env, windowssys_windows_win32_system_power_devicePowerSetDeviceState_napi));
    exports.Set("windowssys_windows_win32_system_power_enumPwrSchemes", Napi::Function::New(env, windowssys_windows_win32_system_power_enumPwrSchemes_napi));
    exports.Set("windowssys_windows_win32_system_power_getActivePwrScheme", Napi::Function::New(env, windowssys_windows_win32_system_power_getActivePwrScheme_napi));
    exports.Set("windowssys_windows_win32_system_power_getCurrentPowerPolicies", Napi::Function::New(env, windowssys_windows_win32_system_power_getCurrentPowerPolicies_napi));
    exports.Set("windowssys_windows_win32_system_power_getDevicePowerState", Napi::Function::New(env, windowssys_windows_win32_system_power_getDevicePowerState_napi));
    exports.Set("windowssys_windows_win32_system_power_getPwrCapabilities", Napi::Function::New(env, windowssys_windows_win32_system_power_getPwrCapabilities_napi));
    exports.Set("windowssys_windows_win32_system_power_getPwrDiskSpindownRange", Napi::Function::New(env, windowssys_windows_win32_system_power_getPwrDiskSpindownRange_napi));
    exports.Set("windowssys_windows_win32_system_power_getSystemPowerStatus", Napi::Function::New(env, windowssys_windows_win32_system_power_getSystemPowerStatus_napi));
    exports.Set("windowssys_windows_win32_system_power_isAdminOverrideActive", Napi::Function::New(env, windowssys_windows_win32_system_power_isAdminOverrideActive_napi));
    exports.Set("windowssys_windows_win32_system_power_isPwrHibernateAllowed", Napi::Function::New(env, windowssys_windows_win32_system_power_isPwrHibernateAllowed_napi));
    exports.Set("windowssys_windows_win32_system_power_isPwrShutdownAllowed", Napi::Function::New(env, windowssys_windows_win32_system_power_isPwrShutdownAllowed_napi));
    exports.Set("windowssys_windows_win32_system_power_isPwrSuspendAllowed", Napi::Function::New(env, windowssys_windows_win32_system_power_isPwrSuspendAllowed_napi));
    exports.Set("windowssys_windows_win32_system_power_isSystemResumeAutomatic", Napi::Function::New(env, windowssys_windows_win32_system_power_isSystemResumeAutomatic_napi));
    exports.Set("windowssys_windows_win32_system_power_powerCanRestoreIndividualDefaultPowerScheme", Napi::Function::New(env, windowssys_windows_win32_system_power_powerCanRestoreIndividualDefaultPowerScheme_napi));
    exports.Set("windowssys_windows_win32_system_power_powerClearRequest", Napi::Function::New(env, windowssys_windows_win32_system_power_powerClearRequest_napi));
    exports.Set("windowssys_windows_win32_system_power_powerCreatePossibleSetting", Napi::Function::New(env, windowssys_windows_win32_system_power_powerCreatePossibleSetting_napi));
    exports.Set("windowssys_windows_win32_system_power_powerCreateRequest", Napi::Function::New(env, windowssys_windows_win32_system_power_powerCreateRequest_napi));
    exports.Set("windowssys_windows_win32_system_power_powerCreateSetting", Napi::Function::New(env, windowssys_windows_win32_system_power_powerCreateSetting_napi));
    exports.Set("windowssys_windows_win32_system_power_powerDeleteScheme", Napi::Function::New(env, windowssys_windows_win32_system_power_powerDeleteScheme_napi));
    exports.Set("windowssys_windows_win32_system_power_powerDeterminePlatformRole", Napi::Function::New(env, windowssys_windows_win32_system_power_powerDeterminePlatformRole_napi));
    exports.Set("windowssys_windows_win32_system_power_powerDeterminePlatformRoleEx", Napi::Function::New(env, windowssys_windows_win32_system_power_powerDeterminePlatformRoleEx_napi));
    exports.Set("windowssys_windows_win32_system_power_powerDuplicateScheme", Napi::Function::New(env, windowssys_windows_win32_system_power_powerDuplicateScheme_napi));
    exports.Set("windowssys_windows_win32_system_power_powerEnumerate", Napi::Function::New(env, windowssys_windows_win32_system_power_powerEnumerate_napi));
    exports.Set("windowssys_windows_win32_system_power_powerGetActiveScheme", Napi::Function::New(env, windowssys_windows_win32_system_power_powerGetActiveScheme_napi));
    exports.Set("windowssys_windows_win32_system_power_powerImportPowerScheme", Napi::Function::New(env, windowssys_windows_win32_system_power_powerImportPowerScheme_napi));
    exports.Set("windowssys_windows_win32_system_power_powerIsSettingRangeDefined", Napi::Function::New(env, windowssys_windows_win32_system_power_powerIsSettingRangeDefined_napi));
    exports.Set("windowssys_windows_win32_system_power_powerOpenSystemPowerKey", Napi::Function::New(env, windowssys_windows_win32_system_power_powerOpenSystemPowerKey_napi));
    exports.Set("windowssys_windows_win32_system_power_powerOpenUserPowerKey", Napi::Function::New(env, windowssys_windows_win32_system_power_powerOpenUserPowerKey_napi));
    exports.Set("windowssys_windows_win32_system_power_powerReadACDefaultIndex", Napi::Function::New(env, windowssys_windows_win32_system_power_powerReadACDefaultIndex_napi));
    exports.Set("windowssys_windows_win32_system_power_powerReadACValue", Napi::Function::New(env, windowssys_windows_win32_system_power_powerReadACValue_napi));
    exports.Set("windowssys_windows_win32_system_power_powerReadACValueIndex", Napi::Function::New(env, windowssys_windows_win32_system_power_powerReadACValueIndex_napi));
    exports.Set("windowssys_windows_win32_system_power_powerReadDCDefaultIndex", Napi::Function::New(env, windowssys_windows_win32_system_power_powerReadDCDefaultIndex_napi));
    exports.Set("windowssys_windows_win32_system_power_powerReadDCValue", Napi::Function::New(env, windowssys_windows_win32_system_power_powerReadDCValue_napi));
    exports.Set("windowssys_windows_win32_system_power_powerReadDCValueIndex", Napi::Function::New(env, windowssys_windows_win32_system_power_powerReadDCValueIndex_napi));
    exports.Set("windowssys_windows_win32_system_power_powerReadDescription", Napi::Function::New(env, windowssys_windows_win32_system_power_powerReadDescription_napi));
    exports.Set("windowssys_windows_win32_system_power_powerReadFriendlyName", Napi::Function::New(env, windowssys_windows_win32_system_power_powerReadFriendlyName_napi));
    exports.Set("windowssys_windows_win32_system_power_powerReadIconResourceSpecifier", Napi::Function::New(env, windowssys_windows_win32_system_power_powerReadIconResourceSpecifier_napi));
    exports.Set("windowssys_windows_win32_system_power_powerReadPossibleDescription", Napi::Function::New(env, windowssys_windows_win32_system_power_powerReadPossibleDescription_napi));
    exports.Set("windowssys_windows_win32_system_power_powerReadPossibleFriendlyName", Napi::Function::New(env, windowssys_windows_win32_system_power_powerReadPossibleFriendlyName_napi));
    exports.Set("windowssys_windows_win32_system_power_powerReadPossibleValue", Napi::Function::New(env, windowssys_windows_win32_system_power_powerReadPossibleValue_napi));
    exports.Set("windowssys_windows_win32_system_power_powerReadSettingAttributes", Napi::Function::New(env, windowssys_windows_win32_system_power_powerReadSettingAttributes_napi));
    exports.Set("windowssys_windows_win32_system_power_powerReadValueIncrement", Napi::Function::New(env, windowssys_windows_win32_system_power_powerReadValueIncrement_napi));
    exports.Set("windowssys_windows_win32_system_power_powerReadValueMax", Napi::Function::New(env, windowssys_windows_win32_system_power_powerReadValueMax_napi));
    exports.Set("windowssys_windows_win32_system_power_powerReadValueMin", Napi::Function::New(env, windowssys_windows_win32_system_power_powerReadValueMin_napi));
    exports.Set("windowssys_windows_win32_system_power_powerReadValueUnitsSpecifier", Napi::Function::New(env, windowssys_windows_win32_system_power_powerReadValueUnitsSpecifier_napi));
    exports.Set("windowssys_windows_win32_system_power_powerRegisterForEffectivePowerModeNotifications", Napi::Function::New(env, windowssys_windows_win32_system_power_powerRegisterForEffectivePowerModeNotifications_napi));
    exports.Set("windowssys_windows_win32_system_power_powerRegisterSuspendResumeNotification", Napi::Function::New(env, windowssys_windows_win32_system_power_powerRegisterSuspendResumeNotification_napi));
    exports.Set("windowssys_windows_win32_system_power_powerRemovePowerSetting", Napi::Function::New(env, windowssys_windows_win32_system_power_powerRemovePowerSetting_napi));
    exports.Set("windowssys_windows_win32_system_power_powerReplaceDefaultPowerSchemes", Napi::Function::New(env, windowssys_windows_win32_system_power_powerReplaceDefaultPowerSchemes_napi));
    exports.Set("windowssys_windows_win32_system_power_powerReportThermalEvent", Napi::Function::New(env, windowssys_windows_win32_system_power_powerReportThermalEvent_napi));
    exports.Set("windowssys_windows_win32_system_power_powerRestoreDefaultPowerSchemes", Napi::Function::New(env, windowssys_windows_win32_system_power_powerRestoreDefaultPowerSchemes_napi));
    exports.Set("windowssys_windows_win32_system_power_powerRestoreIndividualDefaultPowerScheme", Napi::Function::New(env, windowssys_windows_win32_system_power_powerRestoreIndividualDefaultPowerScheme_napi));
    exports.Set("windowssys_windows_win32_system_power_powerSetActiveScheme", Napi::Function::New(env, windowssys_windows_win32_system_power_powerSetActiveScheme_napi));
    exports.Set("windowssys_windows_win32_system_power_powerSetRequest", Napi::Function::New(env, windowssys_windows_win32_system_power_powerSetRequest_napi));
    exports.Set("windowssys_windows_win32_system_power_powerSettingAccessCheck", Napi::Function::New(env, windowssys_windows_win32_system_power_powerSettingAccessCheck_napi));
    exports.Set("windowssys_windows_win32_system_power_powerSettingAccessCheckEx", Napi::Function::New(env, windowssys_windows_win32_system_power_powerSettingAccessCheckEx_napi));
    exports.Set("windowssys_windows_win32_system_power_powerSettingRegisterNotification", Napi::Function::New(env, windowssys_windows_win32_system_power_powerSettingRegisterNotification_napi));
    exports.Set("windowssys_windows_win32_system_power_powerSettingUnregisterNotification", Napi::Function::New(env, windowssys_windows_win32_system_power_powerSettingUnregisterNotification_napi));
    exports.Set("windowssys_windows_win32_system_power_powerUnregisterFromEffectivePowerModeNotifications", Napi::Function::New(env, windowssys_windows_win32_system_power_powerUnregisterFromEffectivePowerModeNotifications_napi));
    exports.Set("windowssys_windows_win32_system_power_powerUnregisterSuspendResumeNotification", Napi::Function::New(env, windowssys_windows_win32_system_power_powerUnregisterSuspendResumeNotification_napi));
    exports.Set("windowssys_windows_win32_system_power_powerWriteACDefaultIndex", Napi::Function::New(env, windowssys_windows_win32_system_power_powerWriteACDefaultIndex_napi));
    exports.Set("windowssys_windows_win32_system_power_powerWriteACValueIndex", Napi::Function::New(env, windowssys_windows_win32_system_power_powerWriteACValueIndex_napi));
    exports.Set("windowssys_windows_win32_system_power_powerWriteDCDefaultIndex", Napi::Function::New(env, windowssys_windows_win32_system_power_powerWriteDCDefaultIndex_napi));
    exports.Set("windowssys_windows_win32_system_power_powerWriteDCValueIndex", Napi::Function::New(env, windowssys_windows_win32_system_power_powerWriteDCValueIndex_napi));
    exports.Set("windowssys_windows_win32_system_power_powerWriteDescription", Napi::Function::New(env, windowssys_windows_win32_system_power_powerWriteDescription_napi));
    exports.Set("windowssys_windows_win32_system_power_powerWriteFriendlyName", Napi::Function::New(env, windowssys_windows_win32_system_power_powerWriteFriendlyName_napi));
    exports.Set("windowssys_windows_win32_system_power_powerWriteIconResourceSpecifier", Napi::Function::New(env, windowssys_windows_win32_system_power_powerWriteIconResourceSpecifier_napi));
    exports.Set("windowssys_windows_win32_system_power_powerWritePossibleDescription", Napi::Function::New(env, windowssys_windows_win32_system_power_powerWritePossibleDescription_napi));
    exports.Set("windowssys_windows_win32_system_power_powerWritePossibleFriendlyName", Napi::Function::New(env, windowssys_windows_win32_system_power_powerWritePossibleFriendlyName_napi));
    exports.Set("windowssys_windows_win32_system_power_powerWritePossibleValue", Napi::Function::New(env, windowssys_windows_win32_system_power_powerWritePossibleValue_napi));
    exports.Set("windowssys_windows_win32_system_power_powerWriteSettingAttributes", Napi::Function::New(env, windowssys_windows_win32_system_power_powerWriteSettingAttributes_napi));
    exports.Set("windowssys_windows_win32_system_power_powerWriteValueIncrement", Napi::Function::New(env, windowssys_windows_win32_system_power_powerWriteValueIncrement_napi));
    exports.Set("windowssys_windows_win32_system_power_powerWriteValueMax", Napi::Function::New(env, windowssys_windows_win32_system_power_powerWriteValueMax_napi));
    exports.Set("windowssys_windows_win32_system_power_powerWriteValueMin", Napi::Function::New(env, windowssys_windows_win32_system_power_powerWriteValueMin_napi));
    exports.Set("windowssys_windows_win32_system_power_powerWriteValueUnitsSpecifier", Napi::Function::New(env, windowssys_windows_win32_system_power_powerWriteValueUnitsSpecifier_napi));
    exports.Set("windowssys_windows_win32_system_power_readGlobalPwrPolicy", Napi::Function::New(env, windowssys_windows_win32_system_power_readGlobalPwrPolicy_napi));
    exports.Set("windowssys_windows_win32_system_power_readProcessorPwrScheme", Napi::Function::New(env, windowssys_windows_win32_system_power_readProcessorPwrScheme_napi));
    exports.Set("windowssys_windows_win32_system_power_readPwrScheme", Napi::Function::New(env, windowssys_windows_win32_system_power_readPwrScheme_napi));
    exports.Set("windowssys_windows_win32_system_power_registerPowerSettingNotification", Napi::Function::New(env, windowssys_windows_win32_system_power_registerPowerSettingNotification_napi));
    exports.Set("windowssys_windows_win32_system_power_registerSuspendResumeNotification", Napi::Function::New(env, windowssys_windows_win32_system_power_registerSuspendResumeNotification_napi));
    exports.Set("windowssys_windows_win32_system_power_requestWakeupLatency", Napi::Function::New(env, windowssys_windows_win32_system_power_requestWakeupLatency_napi));
    exports.Set("windowssys_windows_win32_system_power_setActivePwrScheme", Napi::Function::New(env, windowssys_windows_win32_system_power_setActivePwrScheme_napi));
    exports.Set("windowssys_windows_win32_system_power_setSuspendState", Napi::Function::New(env, windowssys_windows_win32_system_power_setSuspendState_napi));
    exports.Set("windowssys_windows_win32_system_power_setSystemPowerState", Napi::Function::New(env, windowssys_windows_win32_system_power_setSystemPowerState_napi));
    exports.Set("windowssys_windows_win32_system_power_setThreadExecutionState", Napi::Function::New(env, windowssys_windows_win32_system_power_setThreadExecutionState_napi));
    exports.Set("windowssys_windows_win32_system_power_unregisterPowerSettingNotification", Napi::Function::New(env, windowssys_windows_win32_system_power_unregisterPowerSettingNotification_napi));
    exports.Set("windowssys_windows_win32_system_power_unregisterSuspendResumeNotification", Napi::Function::New(env, windowssys_windows_win32_system_power_unregisterSuspendResumeNotification_napi));
    exports.Set("windowssys_windows_win32_system_power_validatePowerPolicies", Napi::Function::New(env, windowssys_windows_win32_system_power_validatePowerPolicies_napi));
    exports.Set("windowssys_windows_win32_system_power_writeGlobalPwrPolicy", Napi::Function::New(env, windowssys_windows_win32_system_power_writeGlobalPwrPolicy_napi));
    exports.Set("windowssys_windows_win32_system_power_writeProcessorPwrScheme", Napi::Function::New(env, windowssys_windows_win32_system_power_writeProcessorPwrScheme_napi));
    exports.Set("windowssys_windows_win32_system_power_writePwrScheme", Napi::Function::New(env, windowssys_windows_win32_system_power_writePwrScheme_napi));
}

static KmNapiRegistrarNode registrar_node = { &register_windows_win32_system_power_napi, nullptr };
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
