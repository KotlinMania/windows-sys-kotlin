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

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CMP_WaitNoPendingInstallEvents_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwtimeout = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CMP_WaitNoPendingInstallEvents")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwtimeout) : 0;
#else
    (void)dwtimeout;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Add_Empty_Log_Conf_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* plclogconf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dndevinst = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t priority = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Add_Empty_Log_Conf")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(plclogconf, dndevinst, priority, ulflags) : 0;
#else
    (void)plclogconf;
    (void)dndevinst;
    (void)priority;
    (void)ulflags;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Add_Empty_Log_Conf_Ex_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* plclogconf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dndevinst = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t priority = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    int64_t hmachine = km_info.Length() > 4 ? km_napi_arg_i64(km_info[4]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Add_Empty_Log_Conf_Ex")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(plclogconf, dndevinst, priority, ulflags, hmachine) : 0;
#else
    (void)plclogconf;
    (void)dndevinst;
    (void)priority;
    (void)ulflags;
    (void)hmachine;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Add_IDA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dndevinst = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* pszid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Add_IDA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dndevinst, pszid, ulflags) : 0;
#else
    (void)dndevinst;
    (void)pszid;
    (void)ulflags;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Add_IDW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dndevinst = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* pszid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Add_IDW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dndevinst, pszid, ulflags) : 0;
#else
    (void)dndevinst;
    (void)pszid;
    (void)ulflags;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Add_ID_ExA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dndevinst = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* pszid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int64_t hmachine = km_info.Length() > 3 ? km_napi_arg_i64(km_info[3]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Add_ID_ExA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dndevinst, pszid, ulflags, hmachine) : 0;
#else
    (void)dndevinst;
    (void)pszid;
    (void)ulflags;
    (void)hmachine;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Add_ID_ExW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dndevinst = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* pszid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int64_t hmachine = km_info.Length() > 3 ? km_napi_arg_i64(km_info[3]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Add_ID_ExW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dndevinst, pszid, ulflags, hmachine) : 0;
#else
    (void)dndevinst;
    (void)pszid;
    (void)ulflags;
    (void)hmachine;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Add_Range_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t ullstartvalue = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint64_t ullendvalue = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    uint64_t rlh = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Add_Range")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(ullstartvalue, ullendvalue, rlh, ulflags) : 0;
#else
    (void)ullstartvalue;
    (void)ullendvalue;
    (void)rlh;
    (void)ulflags;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Add_Res_Des_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* prdresdes = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t lclogconf = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    uint32_t resourceid = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* resourcedata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t resourcelen = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Add_Res_Des")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(prdresdes, lclogconf, resourceid, resourcedata, resourcelen, ulflags) : 0;
#else
    (void)prdresdes;
    (void)lclogconf;
    (void)resourceid;
    (void)resourcedata;
    (void)resourcelen;
    (void)ulflags;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Add_Res_Des_Ex_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* prdresdes = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t lclogconf = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    uint32_t resourceid = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* resourcedata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t resourcelen = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    int64_t hmachine = km_info.Length() > 6 ? km_napi_arg_i64(km_info[6]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t, void*, uint32_t, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Add_Res_Des_Ex")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(prdresdes, lclogconf, resourceid, resourcedata, resourcelen, ulflags, hmachine) : 0;
#else
    (void)prdresdes;
    (void)lclogconf;
    (void)resourceid;
    (void)resourcedata;
    (void)resourcelen;
    (void)ulflags;
    (void)hmachine;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Connect_MachineA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* uncservername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* phmachine = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Connect_MachineA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(uncservername, phmachine) : 0;
#else
    (void)uncservername;
    (void)phmachine;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Connect_MachineW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* uncservername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* phmachine = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Connect_MachineW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(uncservername, phmachine) : 0;
#else
    (void)uncservername;
    (void)phmachine;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Create_DevNodeA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pdndevinst = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pdeviceid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dnparent = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Create_DevNodeA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pdndevinst, pdeviceid, dnparent, ulflags) : 0;
#else
    (void)pdndevinst;
    (void)pdeviceid;
    (void)dnparent;
    (void)ulflags;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Create_DevNodeW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pdndevinst = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pdeviceid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dnparent = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Create_DevNodeW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pdndevinst, pdeviceid, dnparent, ulflags) : 0;
#else
    (void)pdndevinst;
    (void)pdeviceid;
    (void)dnparent;
    (void)ulflags;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Create_DevNode_ExA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pdndevinst = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pdeviceid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dnparent = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    int64_t hmachine = km_info.Length() > 4 ? km_napi_arg_i64(km_info[4]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Create_DevNode_ExA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pdndevinst, pdeviceid, dnparent, ulflags, hmachine) : 0;
#else
    (void)pdndevinst;
    (void)pdeviceid;
    (void)dnparent;
    (void)ulflags;
    (void)hmachine;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Create_DevNode_ExW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pdndevinst = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pdeviceid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dnparent = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    int64_t hmachine = km_info.Length() > 4 ? km_napi_arg_i64(km_info[4]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Create_DevNode_ExW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pdndevinst, pdeviceid, dnparent, ulflags, hmachine) : 0;
#else
    (void)pdndevinst;
    (void)pdeviceid;
    (void)dnparent;
    (void)ulflags;
    (void)hmachine;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Create_Range_List_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* prlh = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Create_Range_List")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(prlh, ulflags) : 0;
#else
    (void)prlh;
    (void)ulflags;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Delete_Class_Key_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* classguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Delete_Class_Key")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(classguid, ulflags) : 0;
#else
    (void)classguid;
    (void)ulflags;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Delete_Class_Key_Ex_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* classguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int64_t hmachine = km_info.Length() > 2 ? km_napi_arg_i64(km_info[2]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Delete_Class_Key_Ex")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(classguid, ulflags, hmachine) : 0;
#else
    (void)classguid;
    (void)ulflags;
    (void)hmachine;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Delete_DevNode_Key_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dndevnode = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t ulhardwareprofile = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Delete_DevNode_Key")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dndevnode, ulhardwareprofile, ulflags) : 0;
#else
    (void)dndevnode;
    (void)ulhardwareprofile;
    (void)ulflags;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Delete_DevNode_Key_Ex_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dndevnode = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t ulhardwareprofile = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int64_t hmachine = km_info.Length() > 3 ? km_napi_arg_i64(km_info[3]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Delete_DevNode_Key_Ex")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dndevnode, ulhardwareprofile, ulflags, hmachine) : 0;
#else
    (void)dndevnode;
    (void)ulhardwareprofile;
    (void)ulflags;
    (void)hmachine;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Delete_Device_Interface_KeyA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pszdeviceinterface = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Delete_Device_Interface_KeyA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pszdeviceinterface, ulflags) : 0;
#else
    (void)pszdeviceinterface;
    (void)ulflags;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Delete_Device_Interface_KeyW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pszdeviceinterface = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Delete_Device_Interface_KeyW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pszdeviceinterface, ulflags) : 0;
#else
    (void)pszdeviceinterface;
    (void)ulflags;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Delete_Device_Interface_Key_ExA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pszdeviceinterface = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int64_t hmachine = km_info.Length() > 2 ? km_napi_arg_i64(km_info[2]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Delete_Device_Interface_Key_ExA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pszdeviceinterface, ulflags, hmachine) : 0;
#else
    (void)pszdeviceinterface;
    (void)ulflags;
    (void)hmachine;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Delete_Device_Interface_Key_ExW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pszdeviceinterface = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int64_t hmachine = km_info.Length() > 2 ? km_napi_arg_i64(km_info[2]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Delete_Device_Interface_Key_ExW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pszdeviceinterface, ulflags, hmachine) : 0;
#else
    (void)pszdeviceinterface;
    (void)ulflags;
    (void)hmachine;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Delete_Range_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t ullstartvalue = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint64_t ullendvalue = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    uint64_t rlh = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Delete_Range")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(ullstartvalue, ullendvalue, rlh, ulflags) : 0;
#else
    (void)ullstartvalue;
    (void)ullendvalue;
    (void)rlh;
    (void)ulflags;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Detect_Resource_Conflict_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dndevinst = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t resourceid = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* resourcedata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t resourcelen = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* pbconflictdetected = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Detect_Resource_Conflict")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dndevinst, resourceid, resourcedata, resourcelen, pbconflictdetected, ulflags) : 0;
#else
    (void)dndevinst;
    (void)resourceid;
    (void)resourcedata;
    (void)resourcelen;
    (void)pbconflictdetected;
    (void)ulflags;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Detect_Resource_Conflict_Ex_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dndevinst = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t resourceid = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* resourcedata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t resourcelen = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* pbconflictdetected = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    int64_t hmachine = km_info.Length() > 6 ? km_napi_arg_i64(km_info[6]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, uint32_t, void*, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Detect_Resource_Conflict_Ex")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dndevinst, resourceid, resourcedata, resourcelen, pbconflictdetected, ulflags, hmachine) : 0;
#else
    (void)dndevinst;
    (void)resourceid;
    (void)resourcedata;
    (void)resourcelen;
    (void)pbconflictdetected;
    (void)ulflags;
    (void)hmachine;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Disable_DevNode_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dndevinst = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Disable_DevNode")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dndevinst, ulflags) : 0;
#else
    (void)dndevinst;
    (void)ulflags;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Disable_DevNode_Ex_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dndevinst = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int64_t hmachine = km_info.Length() > 2 ? km_napi_arg_i64(km_info[2]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Disable_DevNode_Ex")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dndevinst, ulflags, hmachine) : 0;
#else
    (void)dndevinst;
    (void)ulflags;
    (void)hmachine;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Disconnect_Machine_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hmachine = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Disconnect_Machine")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hmachine) : 0;
#else
    (void)hmachine;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Dup_Range_List_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t rlhold = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint64_t rlhnew = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Dup_Range_List")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(rlhold, rlhnew, ulflags) : 0;
#else
    (void)rlhold;
    (void)rlhnew;
    (void)ulflags;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Enable_DevNode_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dndevinst = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Enable_DevNode")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dndevinst, ulflags) : 0;
#else
    (void)dndevinst;
    (void)ulflags;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Enable_DevNode_Ex_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dndevinst = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int64_t hmachine = km_info.Length() > 2 ? km_napi_arg_i64(km_info[2]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Enable_DevNode_Ex")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dndevinst, ulflags, hmachine) : 0;
#else
    (void)dndevinst;
    (void)ulflags;
    (void)hmachine;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Enumerate_Classes_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t ulclassindex = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* classguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Enumerate_Classes")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(ulclassindex, classguid, ulflags) : 0;
#else
    (void)ulclassindex;
    (void)classguid;
    (void)ulflags;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Enumerate_Classes_Ex_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t ulclassindex = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* classguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int64_t hmachine = km_info.Length() > 3 ? km_napi_arg_i64(km_info[3]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Enumerate_Classes_Ex")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(ulclassindex, classguid, ulflags, hmachine) : 0;
#else
    (void)ulclassindex;
    (void)classguid;
    (void)ulflags;
    (void)hmachine;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Enumerate_EnumeratorsA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t ulenumindex = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pullength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Enumerate_EnumeratorsA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(ulenumindex, buffer, pullength, ulflags) : 0;
#else
    (void)ulenumindex;
    (void)buffer;
    (void)pullength;
    (void)ulflags;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Enumerate_EnumeratorsW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t ulenumindex = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pullength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Enumerate_EnumeratorsW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(ulenumindex, buffer, pullength, ulflags) : 0;
#else
    (void)ulenumindex;
    (void)buffer;
    (void)pullength;
    (void)ulflags;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Enumerate_Enumerators_ExA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t ulenumindex = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pullength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    int64_t hmachine = km_info.Length() > 4 ? km_napi_arg_i64(km_info[4]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Enumerate_Enumerators_ExA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(ulenumindex, buffer, pullength, ulflags, hmachine) : 0;
#else
    (void)ulenumindex;
    (void)buffer;
    (void)pullength;
    (void)ulflags;
    (void)hmachine;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Enumerate_Enumerators_ExW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t ulenumindex = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pullength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    int64_t hmachine = km_info.Length() > 4 ? km_napi_arg_i64(km_info[4]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Enumerate_Enumerators_ExW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(ulenumindex, buffer, pullength, ulflags, hmachine) : 0;
#else
    (void)ulenumindex;
    (void)buffer;
    (void)pullength;
    (void)ulflags;
    (void)hmachine;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Find_Range_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pullstart = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t ullstart = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    uint32_t ullength = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint64_t ullalignment = km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0;
    uint64_t ullend = km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0;
    uint64_t rlh = km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0;
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t, uint64_t, uint64_t, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Find_Range")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pullstart, ullstart, ullength, ullalignment, ullend, rlh, ulflags) : 0;
#else
    (void)pullstart;
    (void)ullstart;
    (void)ullength;
    (void)ullalignment;
    (void)ullend;
    (void)rlh;
    (void)ulflags;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_First_Range_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t rlh = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* pullstart = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pullend = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* preelement = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_First_Range")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(rlh, pullstart, pullend, preelement, ulflags) : 0;
#else
    (void)rlh;
    (void)pullstart;
    (void)pullend;
    (void)preelement;
    (void)ulflags;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Free_Log_Conf_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t lclogconftobefreed = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Free_Log_Conf")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lclogconftobefreed, ulflags) : 0;
#else
    (void)lclogconftobefreed;
    (void)ulflags;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Free_Log_Conf_Ex_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t lclogconftobefreed = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int64_t hmachine = km_info.Length() > 2 ? km_napi_arg_i64(km_info[2]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Free_Log_Conf_Ex")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lclogconftobefreed, ulflags, hmachine) : 0;
#else
    (void)lclogconftobefreed;
    (void)ulflags;
    (void)hmachine;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Free_Log_Conf_Handle_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t lclogconf = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Free_Log_Conf_Handle")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lclogconf) : 0;
#else
    (void)lclogconf;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Free_Range_List_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t rlh = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Free_Range_List")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(rlh, ulflags) : 0;
#else
    (void)rlh;
    (void)ulflags;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Free_Res_Des_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* prdresdes = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t rdresdes = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Free_Res_Des")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(prdresdes, rdresdes, ulflags) : 0;
#else
    (void)prdresdes;
    (void)rdresdes;
    (void)ulflags;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Free_Res_Des_Ex_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* prdresdes = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t rdresdes = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int64_t hmachine = km_info.Length() > 3 ? km_napi_arg_i64(km_info[3]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Free_Res_Des_Ex")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(prdresdes, rdresdes, ulflags, hmachine) : 0;
#else
    (void)prdresdes;
    (void)rdresdes;
    (void)ulflags;
    (void)hmachine;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Free_Res_Des_Handle_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t rdresdes = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Free_Res_Des_Handle")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(rdresdes) : 0;
#else
    (void)rdresdes;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Free_Resource_Conflict_Handle_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t clconflictlist = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Free_Resource_Conflict_Handle")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(clconflictlist) : 0;
#else
    (void)clconflictlist;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Child_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pdndevinst = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dndevinst = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Get_Child")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pdndevinst, dndevinst, ulflags) : 0;
#else
    (void)pdndevinst;
    (void)dndevinst;
    (void)ulflags;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Child_Ex_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pdndevinst = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dndevinst = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int64_t hmachine = km_info.Length() > 3 ? km_napi_arg_i64(km_info[3]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Get_Child_Ex")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pdndevinst, dndevinst, ulflags, hmachine) : 0;
#else
    (void)pdndevinst;
    (void)dndevinst;
    (void)ulflags;
    (void)hmachine;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Class_Key_NameA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* classguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pszkeyname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pullength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Get_Class_Key_NameA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(classguid, pszkeyname, pullength, ulflags) : 0;
#else
    (void)classguid;
    (void)pszkeyname;
    (void)pullength;
    (void)ulflags;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Class_Key_NameW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* classguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pszkeyname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pullength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Get_Class_Key_NameW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(classguid, pszkeyname, pullength, ulflags) : 0;
#else
    (void)classguid;
    (void)pszkeyname;
    (void)pullength;
    (void)ulflags;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Class_Key_Name_ExA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* classguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pszkeyname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pullength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    int64_t hmachine = km_info.Length() > 4 ? km_napi_arg_i64(km_info[4]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Get_Class_Key_Name_ExA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(classguid, pszkeyname, pullength, ulflags, hmachine) : 0;
#else
    (void)classguid;
    (void)pszkeyname;
    (void)pullength;
    (void)ulflags;
    (void)hmachine;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Class_Key_Name_ExW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* classguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pszkeyname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pullength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    int64_t hmachine = km_info.Length() > 4 ? km_napi_arg_i64(km_info[4]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Get_Class_Key_Name_ExW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(classguid, pszkeyname, pullength, ulflags, hmachine) : 0;
#else
    (void)classguid;
    (void)pszkeyname;
    (void)pullength;
    (void)ulflags;
    (void)hmachine;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Class_NameA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* classguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pullength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Get_Class_NameA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(classguid, buffer, pullength, ulflags) : 0;
#else
    (void)classguid;
    (void)buffer;
    (void)pullength;
    (void)ulflags;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Class_NameW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* classguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pullength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Get_Class_NameW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(classguid, buffer, pullength, ulflags) : 0;
#else
    (void)classguid;
    (void)buffer;
    (void)pullength;
    (void)ulflags;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Class_Name_ExA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* classguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pullength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    int64_t hmachine = km_info.Length() > 4 ? km_napi_arg_i64(km_info[4]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Get_Class_Name_ExA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(classguid, buffer, pullength, ulflags, hmachine) : 0;
#else
    (void)classguid;
    (void)buffer;
    (void)pullength;
    (void)ulflags;
    (void)hmachine;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Class_Name_ExW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* classguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pullength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    int64_t hmachine = km_info.Length() > 4 ? km_napi_arg_i64(km_info[4]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Get_Class_Name_ExW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(classguid, buffer, pullength, ulflags, hmachine) : 0;
#else
    (void)classguid;
    (void)buffer;
    (void)pullength;
    (void)ulflags;
    (void)hmachine;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Class_PropertyW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* classguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* propertykey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* propertytype = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* propertybuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* propertybuffersize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Get_Class_PropertyW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(classguid, propertykey, propertytype, propertybuffer, propertybuffersize, ulflags) : 0;
#else
    (void)classguid;
    (void)propertykey;
    (void)propertytype;
    (void)propertybuffer;
    (void)propertybuffersize;
    (void)ulflags;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Class_Property_ExW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* classguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* propertykey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* propertytype = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* propertybuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* propertybuffersize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    int64_t hmachine = km_info.Length() > 6 ? km_napi_arg_i64(km_info[6]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Get_Class_Property_ExW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(classguid, propertykey, propertytype, propertybuffer, propertybuffersize, ulflags, hmachine) : 0;
#else
    (void)classguid;
    (void)propertykey;
    (void)propertytype;
    (void)propertybuffer;
    (void)propertybuffersize;
    (void)ulflags;
    (void)hmachine;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Class_Property_Keys_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* classguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* propertykeyarray = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* propertykeycount = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Get_Class_Property_Keys")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(classguid, propertykeyarray, propertykeycount, ulflags) : 0;
#else
    (void)classguid;
    (void)propertykeyarray;
    (void)propertykeycount;
    (void)ulflags;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Class_Property_Keys_Ex_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* classguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* propertykeyarray = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* propertykeycount = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    int64_t hmachine = km_info.Length() > 4 ? km_napi_arg_i64(km_info[4]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Get_Class_Property_Keys_Ex")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(classguid, propertykeyarray, propertykeycount, ulflags, hmachine) : 0;
#else
    (void)classguid;
    (void)propertykeyarray;
    (void)propertykeycount;
    (void)ulflags;
    (void)hmachine;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Class_Registry_PropertyA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* classguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t ulproperty = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pulregdatatype = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pullength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    int64_t hmachine = km_info.Length() > 6 ? km_napi_arg_i64(km_info[6]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Get_Class_Registry_PropertyA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(classguid, ulproperty, pulregdatatype, buffer, pullength, ulflags, hmachine) : 0;
#else
    (void)classguid;
    (void)ulproperty;
    (void)pulregdatatype;
    (void)buffer;
    (void)pullength;
    (void)ulflags;
    (void)hmachine;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Class_Registry_PropertyW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* classguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t ulproperty = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pulregdatatype = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pullength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    int64_t hmachine = km_info.Length() > 6 ? km_napi_arg_i64(km_info[6]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Get_Class_Registry_PropertyW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(classguid, ulproperty, pulregdatatype, buffer, pullength, ulflags, hmachine) : 0;
#else
    (void)classguid;
    (void)ulproperty;
    (void)pulregdatatype;
    (void)buffer;
    (void)pullength;
    (void)ulflags;
    (void)hmachine;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Depth_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* puldepth = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dndevinst = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Get_Depth")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(puldepth, dndevinst, ulflags) : 0;
#else
    (void)puldepth;
    (void)dndevinst;
    (void)ulflags;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Depth_Ex_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* puldepth = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dndevinst = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int64_t hmachine = km_info.Length() > 3 ? km_napi_arg_i64(km_info[3]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Get_Depth_Ex")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(puldepth, dndevinst, ulflags, hmachine) : 0;
#else
    (void)puldepth;
    (void)dndevinst;
    (void)ulflags;
    (void)hmachine;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_DevNode_Custom_PropertyA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dndevinst = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* pszcustompropertyname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pulregdatatype = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pullength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Get_DevNode_Custom_PropertyA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dndevinst, pszcustompropertyname, pulregdatatype, buffer, pullength, ulflags) : 0;
#else
    (void)dndevinst;
    (void)pszcustompropertyname;
    (void)pulregdatatype;
    (void)buffer;
    (void)pullength;
    (void)ulflags;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_DevNode_Custom_PropertyW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dndevinst = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* pszcustompropertyname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pulregdatatype = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pullength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Get_DevNode_Custom_PropertyW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dndevinst, pszcustompropertyname, pulregdatatype, buffer, pullength, ulflags) : 0;
#else
    (void)dndevinst;
    (void)pszcustompropertyname;
    (void)pulregdatatype;
    (void)buffer;
    (void)pullength;
    (void)ulflags;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_DevNode_Custom_Property_ExA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dndevinst = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* pszcustompropertyname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pulregdatatype = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pullength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    int64_t hmachine = km_info.Length() > 6 ? km_napi_arg_i64(km_info[6]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Get_DevNode_Custom_Property_ExA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dndevinst, pszcustompropertyname, pulregdatatype, buffer, pullength, ulflags, hmachine) : 0;
#else
    (void)dndevinst;
    (void)pszcustompropertyname;
    (void)pulregdatatype;
    (void)buffer;
    (void)pullength;
    (void)ulflags;
    (void)hmachine;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_DevNode_Custom_Property_ExW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dndevinst = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* pszcustompropertyname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pulregdatatype = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pullength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    int64_t hmachine = km_info.Length() > 6 ? km_napi_arg_i64(km_info[6]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Get_DevNode_Custom_Property_ExW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dndevinst, pszcustompropertyname, pulregdatatype, buffer, pullength, ulflags, hmachine) : 0;
#else
    (void)dndevinst;
    (void)pszcustompropertyname;
    (void)pulregdatatype;
    (void)buffer;
    (void)pullength;
    (void)ulflags;
    (void)hmachine;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_DevNode_PropertyW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dndevinst = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* propertykey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* propertytype = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* propertybuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* propertybuffersize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Get_DevNode_PropertyW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dndevinst, propertykey, propertytype, propertybuffer, propertybuffersize, ulflags) : 0;
#else
    (void)dndevinst;
    (void)propertykey;
    (void)propertytype;
    (void)propertybuffer;
    (void)propertybuffersize;
    (void)ulflags;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_DevNode_Property_ExW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dndevinst = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* propertykey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* propertytype = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* propertybuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* propertybuffersize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    int64_t hmachine = km_info.Length() > 6 ? km_napi_arg_i64(km_info[6]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Get_DevNode_Property_ExW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dndevinst, propertykey, propertytype, propertybuffer, propertybuffersize, ulflags, hmachine) : 0;
#else
    (void)dndevinst;
    (void)propertykey;
    (void)propertytype;
    (void)propertybuffer;
    (void)propertybuffersize;
    (void)ulflags;
    (void)hmachine;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_DevNode_Property_Keys_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dndevinst = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* propertykeyarray = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* propertykeycount = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Get_DevNode_Property_Keys")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dndevinst, propertykeyarray, propertykeycount, ulflags) : 0;
#else
    (void)dndevinst;
    (void)propertykeyarray;
    (void)propertykeycount;
    (void)ulflags;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_DevNode_Property_Keys_Ex_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dndevinst = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* propertykeyarray = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* propertykeycount = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    int64_t hmachine = km_info.Length() > 4 ? km_napi_arg_i64(km_info[4]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Get_DevNode_Property_Keys_Ex")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dndevinst, propertykeyarray, propertykeycount, ulflags, hmachine) : 0;
#else
    (void)dndevinst;
    (void)propertykeyarray;
    (void)propertykeycount;
    (void)ulflags;
    (void)hmachine;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_DevNode_Registry_PropertyA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dndevinst = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t ulproperty = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pulregdatatype = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pullength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Get_DevNode_Registry_PropertyA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dndevinst, ulproperty, pulregdatatype, buffer, pullength, ulflags) : 0;
#else
    (void)dndevinst;
    (void)ulproperty;
    (void)pulregdatatype;
    (void)buffer;
    (void)pullength;
    (void)ulflags;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_DevNode_Registry_PropertyW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dndevinst = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t ulproperty = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pulregdatatype = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pullength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Get_DevNode_Registry_PropertyW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dndevinst, ulproperty, pulregdatatype, buffer, pullength, ulflags) : 0;
#else
    (void)dndevinst;
    (void)ulproperty;
    (void)pulregdatatype;
    (void)buffer;
    (void)pullength;
    (void)ulflags;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_DevNode_Registry_Property_ExA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dndevinst = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t ulproperty = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pulregdatatype = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pullength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    int64_t hmachine = km_info.Length() > 6 ? km_napi_arg_i64(km_info[6]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, void*, void*, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Get_DevNode_Registry_Property_ExA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dndevinst, ulproperty, pulregdatatype, buffer, pullength, ulflags, hmachine) : 0;
#else
    (void)dndevinst;
    (void)ulproperty;
    (void)pulregdatatype;
    (void)buffer;
    (void)pullength;
    (void)ulflags;
    (void)hmachine;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_DevNode_Registry_Property_ExW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dndevinst = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t ulproperty = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pulregdatatype = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pullength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    int64_t hmachine = km_info.Length() > 6 ? km_napi_arg_i64(km_info[6]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, void*, void*, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Get_DevNode_Registry_Property_ExW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dndevinst, ulproperty, pulregdatatype, buffer, pullength, ulflags, hmachine) : 0;
#else
    (void)dndevinst;
    (void)ulproperty;
    (void)pulregdatatype;
    (void)buffer;
    (void)pullength;
    (void)ulflags;
    (void)hmachine;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_DevNode_Status_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pulstatus = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pulproblemnumber = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dndevinst = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Get_DevNode_Status")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pulstatus, pulproblemnumber, dndevinst, ulflags) : 0;
#else
    (void)pulstatus;
    (void)pulproblemnumber;
    (void)dndevinst;
    (void)ulflags;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_DevNode_Status_Ex_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pulstatus = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pulproblemnumber = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dndevinst = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    int64_t hmachine = km_info.Length() > 4 ? km_napi_arg_i64(km_info[4]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Get_DevNode_Status_Ex")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pulstatus, pulproblemnumber, dndevinst, ulflags, hmachine) : 0;
#else
    (void)pulstatus;
    (void)pulproblemnumber;
    (void)dndevinst;
    (void)ulflags;
    (void)hmachine;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_IDA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dndevinst = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t bufferlen = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Get_Device_IDA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dndevinst, buffer, bufferlen, ulflags) : 0;
#else
    (void)dndevinst;
    (void)buffer;
    (void)bufferlen;
    (void)ulflags;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_IDW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dndevinst = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t bufferlen = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Get_Device_IDW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dndevinst, buffer, bufferlen, ulflags) : 0;
#else
    (void)dndevinst;
    (void)buffer;
    (void)bufferlen;
    (void)ulflags;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_ID_ExA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dndevinst = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t bufferlen = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    int64_t hmachine = km_info.Length() > 4 ? km_napi_arg_i64(km_info[4]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Get_Device_ID_ExA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dndevinst, buffer, bufferlen, ulflags, hmachine) : 0;
#else
    (void)dndevinst;
    (void)buffer;
    (void)bufferlen;
    (void)ulflags;
    (void)hmachine;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_ID_ExW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dndevinst = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t bufferlen = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    int64_t hmachine = km_info.Length() > 4 ? km_napi_arg_i64(km_info[4]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Get_Device_ID_ExW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dndevinst, buffer, bufferlen, ulflags, hmachine) : 0;
#else
    (void)dndevinst;
    (void)buffer;
    (void)bufferlen;
    (void)ulflags;
    (void)hmachine;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_ID_ListA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pszfilter = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t bufferlen = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Get_Device_ID_ListA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pszfilter, buffer, bufferlen, ulflags) : 0;
#else
    (void)pszfilter;
    (void)buffer;
    (void)bufferlen;
    (void)ulflags;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_ID_ListW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pszfilter = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t bufferlen = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Get_Device_ID_ListW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pszfilter, buffer, bufferlen, ulflags) : 0;
#else
    (void)pszfilter;
    (void)buffer;
    (void)bufferlen;
    (void)ulflags;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_ID_List_ExA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pszfilter = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t bufferlen = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    int64_t hmachine = km_info.Length() > 4 ? km_napi_arg_i64(km_info[4]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Get_Device_ID_List_ExA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pszfilter, buffer, bufferlen, ulflags, hmachine) : 0;
#else
    (void)pszfilter;
    (void)buffer;
    (void)bufferlen;
    (void)ulflags;
    (void)hmachine;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_ID_List_ExW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pszfilter = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t bufferlen = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    int64_t hmachine = km_info.Length() > 4 ? km_napi_arg_i64(km_info[4]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Get_Device_ID_List_ExW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pszfilter, buffer, bufferlen, ulflags, hmachine) : 0;
#else
    (void)pszfilter;
    (void)buffer;
    (void)bufferlen;
    (void)ulflags;
    (void)hmachine;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_ID_List_SizeA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pullen = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pszfilter = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Get_Device_ID_List_SizeA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pullen, pszfilter, ulflags) : 0;
#else
    (void)pullen;
    (void)pszfilter;
    (void)ulflags;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_ID_List_SizeW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pullen = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pszfilter = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Get_Device_ID_List_SizeW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pullen, pszfilter, ulflags) : 0;
#else
    (void)pullen;
    (void)pszfilter;
    (void)ulflags;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_ID_List_Size_ExA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pullen = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pszfilter = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int64_t hmachine = km_info.Length() > 3 ? km_napi_arg_i64(km_info[3]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Get_Device_ID_List_Size_ExA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pullen, pszfilter, ulflags, hmachine) : 0;
#else
    (void)pullen;
    (void)pszfilter;
    (void)ulflags;
    (void)hmachine;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_ID_List_Size_ExW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pullen = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pszfilter = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int64_t hmachine = km_info.Length() > 3 ? km_napi_arg_i64(km_info[3]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Get_Device_ID_List_Size_ExW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pullen, pszfilter, ulflags, hmachine) : 0;
#else
    (void)pullen;
    (void)pszfilter;
    (void)ulflags;
    (void)hmachine;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_ID_Size_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pullen = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dndevinst = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Get_Device_ID_Size")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pullen, dndevinst, ulflags) : 0;
#else
    (void)pullen;
    (void)dndevinst;
    (void)ulflags;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_ID_Size_Ex_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pullen = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dndevinst = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int64_t hmachine = km_info.Length() > 3 ? km_napi_arg_i64(km_info[3]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Get_Device_ID_Size_Ex")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pullen, dndevinst, ulflags, hmachine) : 0;
#else
    (void)pullen;
    (void)dndevinst;
    (void)ulflags;
    (void)hmachine;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_Interface_AliasA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pszdeviceinterface = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* aliasinterfaceguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pszaliasdeviceinterface = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pullength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Get_Device_Interface_AliasA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pszdeviceinterface, aliasinterfaceguid, pszaliasdeviceinterface, pullength, ulflags) : 0;
#else
    (void)pszdeviceinterface;
    (void)aliasinterfaceguid;
    (void)pszaliasdeviceinterface;
    (void)pullength;
    (void)ulflags;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_Interface_AliasW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pszdeviceinterface = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* aliasinterfaceguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pszaliasdeviceinterface = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pullength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Get_Device_Interface_AliasW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pszdeviceinterface, aliasinterfaceguid, pszaliasdeviceinterface, pullength, ulflags) : 0;
#else
    (void)pszdeviceinterface;
    (void)aliasinterfaceguid;
    (void)pszaliasdeviceinterface;
    (void)pullength;
    (void)ulflags;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_Interface_Alias_ExA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pszdeviceinterface = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* aliasinterfaceguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pszaliasdeviceinterface = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pullength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    int64_t hmachine = km_info.Length() > 5 ? km_napi_arg_i64(km_info[5]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Get_Device_Interface_Alias_ExA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pszdeviceinterface, aliasinterfaceguid, pszaliasdeviceinterface, pullength, ulflags, hmachine) : 0;
#else
    (void)pszdeviceinterface;
    (void)aliasinterfaceguid;
    (void)pszaliasdeviceinterface;
    (void)pullength;
    (void)ulflags;
    (void)hmachine;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_Interface_Alias_ExW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pszdeviceinterface = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* aliasinterfaceguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pszaliasdeviceinterface = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pullength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    int64_t hmachine = km_info.Length() > 5 ? km_napi_arg_i64(km_info[5]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Get_Device_Interface_Alias_ExW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pszdeviceinterface, aliasinterfaceguid, pszaliasdeviceinterface, pullength, ulflags, hmachine) : 0;
#else
    (void)pszdeviceinterface;
    (void)aliasinterfaceguid;
    (void)pszaliasdeviceinterface;
    (void)pullength;
    (void)ulflags;
    (void)hmachine;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_Interface_ListA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* interfaceclassguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pdeviceid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t bufferlen = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Get_Device_Interface_ListA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(interfaceclassguid, pdeviceid, buffer, bufferlen, ulflags) : 0;
#else
    (void)interfaceclassguid;
    (void)pdeviceid;
    (void)buffer;
    (void)bufferlen;
    (void)ulflags;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_Interface_ListW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* interfaceclassguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pdeviceid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t bufferlen = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Get_Device_Interface_ListW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(interfaceclassguid, pdeviceid, buffer, bufferlen, ulflags) : 0;
#else
    (void)interfaceclassguid;
    (void)pdeviceid;
    (void)buffer;
    (void)bufferlen;
    (void)ulflags;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_Interface_List_ExA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* interfaceclassguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pdeviceid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t bufferlen = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    int64_t hmachine = km_info.Length() > 5 ? km_napi_arg_i64(km_info[5]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Get_Device_Interface_List_ExA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(interfaceclassguid, pdeviceid, buffer, bufferlen, ulflags, hmachine) : 0;
#else
    (void)interfaceclassguid;
    (void)pdeviceid;
    (void)buffer;
    (void)bufferlen;
    (void)ulflags;
    (void)hmachine;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_Interface_List_ExW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* interfaceclassguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pdeviceid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t bufferlen = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    int64_t hmachine = km_info.Length() > 5 ? km_napi_arg_i64(km_info[5]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Get_Device_Interface_List_ExW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(interfaceclassguid, pdeviceid, buffer, bufferlen, ulflags, hmachine) : 0;
#else
    (void)interfaceclassguid;
    (void)pdeviceid;
    (void)buffer;
    (void)bufferlen;
    (void)ulflags;
    (void)hmachine;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_Interface_List_SizeA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pullen = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* interfaceclassguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pdeviceid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Get_Device_Interface_List_SizeA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pullen, interfaceclassguid, pdeviceid, ulflags) : 0;
#else
    (void)pullen;
    (void)interfaceclassguid;
    (void)pdeviceid;
    (void)ulflags;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_Interface_List_SizeW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pullen = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* interfaceclassguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pdeviceid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Get_Device_Interface_List_SizeW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pullen, interfaceclassguid, pdeviceid, ulflags) : 0;
#else
    (void)pullen;
    (void)interfaceclassguid;
    (void)pdeviceid;
    (void)ulflags;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_Interface_List_Size_ExA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pullen = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* interfaceclassguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pdeviceid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    int64_t hmachine = km_info.Length() > 4 ? km_napi_arg_i64(km_info[4]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Get_Device_Interface_List_Size_ExA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pullen, interfaceclassguid, pdeviceid, ulflags, hmachine) : 0;
#else
    (void)pullen;
    (void)interfaceclassguid;
    (void)pdeviceid;
    (void)ulflags;
    (void)hmachine;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_Interface_List_Size_ExW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pullen = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* interfaceclassguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pdeviceid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    int64_t hmachine = km_info.Length() > 4 ? km_napi_arg_i64(km_info[4]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Get_Device_Interface_List_Size_ExW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pullen, interfaceclassguid, pdeviceid, ulflags, hmachine) : 0;
#else
    (void)pullen;
    (void)interfaceclassguid;
    (void)pdeviceid;
    (void)ulflags;
    (void)hmachine;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_Interface_PropertyW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pszdeviceinterface = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* propertykey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* propertytype = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* propertybuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* propertybuffersize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Get_Device_Interface_PropertyW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pszdeviceinterface, propertykey, propertytype, propertybuffer, propertybuffersize, ulflags) : 0;
#else
    (void)pszdeviceinterface;
    (void)propertykey;
    (void)propertytype;
    (void)propertybuffer;
    (void)propertybuffersize;
    (void)ulflags;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_Interface_Property_ExW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pszdeviceinterface = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* propertykey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* propertytype = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* propertybuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* propertybuffersize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    int64_t hmachine = km_info.Length() > 6 ? km_napi_arg_i64(km_info[6]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Get_Device_Interface_Property_ExW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pszdeviceinterface, propertykey, propertytype, propertybuffer, propertybuffersize, ulflags, hmachine) : 0;
#else
    (void)pszdeviceinterface;
    (void)propertykey;
    (void)propertytype;
    (void)propertybuffer;
    (void)propertybuffersize;
    (void)ulflags;
    (void)hmachine;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_Interface_Property_KeysW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pszdeviceinterface = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* propertykeyarray = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* propertykeycount = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Get_Device_Interface_Property_KeysW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pszdeviceinterface, propertykeyarray, propertykeycount, ulflags) : 0;
#else
    (void)pszdeviceinterface;
    (void)propertykeyarray;
    (void)propertykeycount;
    (void)ulflags;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_Interface_Property_Keys_ExW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pszdeviceinterface = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* propertykeyarray = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* propertykeycount = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    int64_t hmachine = km_info.Length() > 4 ? km_napi_arg_i64(km_info[4]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Get_Device_Interface_Property_Keys_ExW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pszdeviceinterface, propertykeyarray, propertykeycount, ulflags, hmachine) : 0;
#else
    (void)pszdeviceinterface;
    (void)propertykeyarray;
    (void)propertykeycount;
    (void)ulflags;
    (void)hmachine;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_First_Log_Conf_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* plclogconf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dndevinst = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Get_First_Log_Conf")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(plclogconf, dndevinst, ulflags) : 0;
#else
    (void)plclogconf;
    (void)dndevinst;
    (void)ulflags;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_First_Log_Conf_Ex_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* plclogconf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dndevinst = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int64_t hmachine = km_info.Length() > 3 ? km_napi_arg_i64(km_info[3]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Get_First_Log_Conf_Ex")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(plclogconf, dndevinst, ulflags, hmachine) : 0;
#else
    (void)plclogconf;
    (void)dndevinst;
    (void)ulflags;
    (void)hmachine;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Global_State_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pulstate = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Get_Global_State")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pulstate, ulflags) : 0;
#else
    (void)pulstate;
    (void)ulflags;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Global_State_Ex_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pulstate = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int64_t hmachine = km_info.Length() > 2 ? km_napi_arg_i64(km_info[2]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Get_Global_State_Ex")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pulstate, ulflags, hmachine) : 0;
#else
    (void)pulstate;
    (void)ulflags;
    (void)hmachine;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_HW_Prof_FlagsA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pdeviceid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t ulhardwareprofile = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pulvalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Get_HW_Prof_FlagsA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pdeviceid, ulhardwareprofile, pulvalue, ulflags) : 0;
#else
    (void)pdeviceid;
    (void)ulhardwareprofile;
    (void)pulvalue;
    (void)ulflags;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_HW_Prof_FlagsW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pdeviceid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t ulhardwareprofile = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pulvalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Get_HW_Prof_FlagsW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pdeviceid, ulhardwareprofile, pulvalue, ulflags) : 0;
#else
    (void)pdeviceid;
    (void)ulhardwareprofile;
    (void)pulvalue;
    (void)ulflags;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_HW_Prof_Flags_ExA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pdeviceid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t ulhardwareprofile = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pulvalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    int64_t hmachine = km_info.Length() > 4 ? km_napi_arg_i64(km_info[4]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Get_HW_Prof_Flags_ExA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pdeviceid, ulhardwareprofile, pulvalue, ulflags, hmachine) : 0;
#else
    (void)pdeviceid;
    (void)ulhardwareprofile;
    (void)pulvalue;
    (void)ulflags;
    (void)hmachine;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_HW_Prof_Flags_ExW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pdeviceid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t ulhardwareprofile = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pulvalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    int64_t hmachine = km_info.Length() > 4 ? km_napi_arg_i64(km_info[4]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Get_HW_Prof_Flags_ExW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pdeviceid, ulhardwareprofile, pulvalue, ulflags, hmachine) : 0;
#else
    (void)pdeviceid;
    (void)ulhardwareprofile;
    (void)pulvalue;
    (void)ulflags;
    (void)hmachine;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Hardware_Profile_InfoA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t ulindex = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* phwprofileinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Get_Hardware_Profile_InfoA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(ulindex, phwprofileinfo, ulflags) : 0;
#else
    (void)ulindex;
    (void)phwprofileinfo;
    (void)ulflags;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Hardware_Profile_InfoW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t ulindex = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* phwprofileinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Get_Hardware_Profile_InfoW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(ulindex, phwprofileinfo, ulflags) : 0;
#else
    (void)ulindex;
    (void)phwprofileinfo;
    (void)ulflags;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Hardware_Profile_Info_ExA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t ulindex = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* phwprofileinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int64_t hmachine = km_info.Length() > 3 ? km_napi_arg_i64(km_info[3]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Get_Hardware_Profile_Info_ExA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(ulindex, phwprofileinfo, ulflags, hmachine) : 0;
#else
    (void)ulindex;
    (void)phwprofileinfo;
    (void)ulflags;
    (void)hmachine;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Hardware_Profile_Info_ExW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t ulindex = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* phwprofileinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int64_t hmachine = km_info.Length() > 3 ? km_napi_arg_i64(km_info[3]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Get_Hardware_Profile_Info_ExW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(ulindex, phwprofileinfo, ulflags, hmachine) : 0;
#else
    (void)ulindex;
    (void)phwprofileinfo;
    (void)ulflags;
    (void)hmachine;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Log_Conf_Priority_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t lclogconf = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* ppriority = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Get_Log_Conf_Priority")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lclogconf, ppriority, ulflags) : 0;
#else
    (void)lclogconf;
    (void)ppriority;
    (void)ulflags;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Log_Conf_Priority_Ex_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t lclogconf = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* ppriority = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int64_t hmachine = km_info.Length() > 3 ? km_napi_arg_i64(km_info[3]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Get_Log_Conf_Priority_Ex")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lclogconf, ppriority, ulflags, hmachine) : 0;
#else
    (void)lclogconf;
    (void)ppriority;
    (void)ulflags;
    (void)hmachine;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Next_Log_Conf_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* plclogconf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t lclogconf = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Get_Next_Log_Conf")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(plclogconf, lclogconf, ulflags) : 0;
#else
    (void)plclogconf;
    (void)lclogconf;
    (void)ulflags;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Next_Log_Conf_Ex_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* plclogconf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t lclogconf = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int64_t hmachine = km_info.Length() > 3 ? km_napi_arg_i64(km_info[3]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Get_Next_Log_Conf_Ex")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(plclogconf, lclogconf, ulflags, hmachine) : 0;
#else
    (void)plclogconf;
    (void)lclogconf;
    (void)ulflags;
    (void)hmachine;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Next_Res_Des_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* prdresdes = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t rdresdes = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    uint32_t forresource = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* presourceid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Get_Next_Res_Des")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(prdresdes, rdresdes, forresource, presourceid, ulflags) : 0;
#else
    (void)prdresdes;
    (void)rdresdes;
    (void)forresource;
    (void)presourceid;
    (void)ulflags;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Next_Res_Des_Ex_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* prdresdes = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t rdresdes = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    uint32_t forresource = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* presourceid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    int64_t hmachine = km_info.Length() > 5 ? km_napi_arg_i64(km_info[5]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t, void*, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Get_Next_Res_Des_Ex")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(prdresdes, rdresdes, forresource, presourceid, ulflags, hmachine) : 0;
#else
    (void)prdresdes;
    (void)rdresdes;
    (void)forresource;
    (void)presourceid;
    (void)ulflags;
    (void)hmachine;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Parent_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pdndevinst = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dndevinst = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Get_Parent")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pdndevinst, dndevinst, ulflags) : 0;
#else
    (void)pdndevinst;
    (void)dndevinst;
    (void)ulflags;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Parent_Ex_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pdndevinst = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dndevinst = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int64_t hmachine = km_info.Length() > 3 ? km_napi_arg_i64(km_info[3]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Get_Parent_Ex")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pdndevinst, dndevinst, ulflags, hmachine) : 0;
#else
    (void)pdndevinst;
    (void)dndevinst;
    (void)ulflags;
    (void)hmachine;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Res_Des_Data_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t rdresdes = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t bufferlen = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Get_Res_Des_Data")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(rdresdes, buffer, bufferlen, ulflags) : 0;
#else
    (void)rdresdes;
    (void)buffer;
    (void)bufferlen;
    (void)ulflags;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Res_Des_Data_Ex_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t rdresdes = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t bufferlen = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    int64_t hmachine = km_info.Length() > 4 ? km_napi_arg_i64(km_info[4]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Get_Res_Des_Data_Ex")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(rdresdes, buffer, bufferlen, ulflags, hmachine) : 0;
#else
    (void)rdresdes;
    (void)buffer;
    (void)bufferlen;
    (void)ulflags;
    (void)hmachine;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Res_Des_Data_Size_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pulsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t rdresdes = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Get_Res_Des_Data_Size")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pulsize, rdresdes, ulflags) : 0;
#else
    (void)pulsize;
    (void)rdresdes;
    (void)ulflags;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Res_Des_Data_Size_Ex_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pulsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t rdresdes = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int64_t hmachine = km_info.Length() > 3 ? km_napi_arg_i64(km_info[3]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Get_Res_Des_Data_Size_Ex")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pulsize, rdresdes, ulflags, hmachine) : 0;
#else
    (void)pulsize;
    (void)rdresdes;
    (void)ulflags;
    (void)hmachine;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Resource_Conflict_Count_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t clconflictlist = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* pulcount = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Get_Resource_Conflict_Count")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(clconflictlist, pulcount) : 0;
#else
    (void)clconflictlist;
    (void)pulcount;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Resource_Conflict_DetailsA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t clconflictlist = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint32_t ulindex = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pconflictdetails = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Get_Resource_Conflict_DetailsA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(clconflictlist, ulindex, pconflictdetails) : 0;
#else
    (void)clconflictlist;
    (void)ulindex;
    (void)pconflictdetails;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Resource_Conflict_DetailsW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t clconflictlist = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint32_t ulindex = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pconflictdetails = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Get_Resource_Conflict_DetailsW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(clconflictlist, ulindex, pconflictdetails) : 0;
#else
    (void)clconflictlist;
    (void)ulindex;
    (void)pconflictdetails;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Sibling_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pdndevinst = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dndevinst = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Get_Sibling")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pdndevinst, dndevinst, ulflags) : 0;
#else
    (void)pdndevinst;
    (void)dndevinst;
    (void)ulflags;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Sibling_Ex_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pdndevinst = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dndevinst = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int64_t hmachine = km_info.Length() > 3 ? km_napi_arg_i64(km_info[3]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Get_Sibling_Ex")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pdndevinst, dndevinst, ulflags, hmachine) : 0;
#else
    (void)pdndevinst;
    (void)dndevinst;
    (void)ulflags;
    (void)hmachine;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Version_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef uint16_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Get_Version")));
    }
    uint16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr() : 0;
#else
    uint16_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Version_Ex_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hmachine = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef uint16_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Get_Version_Ex")));
    }
    uint16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hmachine) : 0;
#else
    (void)hmachine;
    uint16_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Intersect_Range_List_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t rlhold1 = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint64_t rlhold2 = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    uint64_t rlhnew = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Intersect_Range_List")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(rlhold1, rlhold2, rlhnew, ulflags) : 0;
#else
    (void)rlhold1;
    (void)rlhold2;
    (void)rlhnew;
    (void)ulflags;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Invert_Range_List_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t rlhold = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint64_t rlhnew = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    uint64_t ullmaxvalue = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Invert_Range_List")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(rlhold, rlhnew, ullmaxvalue, ulflags) : 0;
#else
    (void)rlhold;
    (void)rlhnew;
    (void)ullmaxvalue;
    (void)ulflags;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Is_Dock_Station_Present_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pbpresent = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Is_Dock_Station_Present")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pbpresent) : 0;
#else
    (void)pbpresent;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Is_Dock_Station_Present_Ex_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pbpresent = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int64_t hmachine = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Is_Dock_Station_Present_Ex")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pbpresent, hmachine) : 0;
#else
    (void)pbpresent;
    (void)hmachine;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Is_Version_Available_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint16_t wversion = static_cast<uint16_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint16_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Is_Version_Available")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(wversion) : -1;
#else
    (void)wversion;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Is_Version_Available_Ex_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint16_t wversion = static_cast<uint16_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    int64_t hmachine = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint16_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Is_Version_Available_Ex")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(wversion, hmachine) : -1;
#else
    (void)wversion;
    (void)hmachine;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Locate_DevNodeA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pdndevinst = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pdeviceid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Locate_DevNodeA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pdndevinst, pdeviceid, ulflags) : 0;
#else
    (void)pdndevinst;
    (void)pdeviceid;
    (void)ulflags;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Locate_DevNodeW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pdndevinst = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pdeviceid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Locate_DevNodeW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pdndevinst, pdeviceid, ulflags) : 0;
#else
    (void)pdndevinst;
    (void)pdeviceid;
    (void)ulflags;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Locate_DevNode_ExA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pdndevinst = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pdeviceid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int64_t hmachine = km_info.Length() > 3 ? km_napi_arg_i64(km_info[3]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Locate_DevNode_ExA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pdndevinst, pdeviceid, ulflags, hmachine) : 0;
#else
    (void)pdndevinst;
    (void)pdeviceid;
    (void)ulflags;
    (void)hmachine;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Locate_DevNode_ExW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pdndevinst = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pdeviceid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int64_t hmachine = km_info.Length() > 3 ? km_napi_arg_i64(km_info[3]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Locate_DevNode_ExW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pdndevinst, pdeviceid, ulflags, hmachine) : 0;
#else
    (void)pdndevinst;
    (void)pdeviceid;
    (void)ulflags;
    (void)hmachine;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_MapCrToWin32Err_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t cmreturncode = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t defaulterr = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_MapCrToWin32Err")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(cmreturncode, defaulterr) : 0;
#else
    (void)cmreturncode;
    (void)defaulterr;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Merge_Range_List_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t rlhold1 = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint64_t rlhold2 = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    uint64_t rlhnew = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Merge_Range_List")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(rlhold1, rlhold2, rlhnew, ulflags) : 0;
#else
    (void)rlhold1;
    (void)rlhold2;
    (void)rlhnew;
    (void)ulflags;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Modify_Res_Des_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* prdresdes = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t rdresdes = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    uint32_t resourceid = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* resourcedata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t resourcelen = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Modify_Res_Des")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(prdresdes, rdresdes, resourceid, resourcedata, resourcelen, ulflags) : 0;
#else
    (void)prdresdes;
    (void)rdresdes;
    (void)resourceid;
    (void)resourcedata;
    (void)resourcelen;
    (void)ulflags;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Modify_Res_Des_Ex_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* prdresdes = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t rdresdes = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    uint32_t resourceid = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* resourcedata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t resourcelen = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    int64_t hmachine = km_info.Length() > 6 ? km_napi_arg_i64(km_info[6]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t, void*, uint32_t, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Modify_Res_Des_Ex")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(prdresdes, rdresdes, resourceid, resourcedata, resourcelen, ulflags, hmachine) : 0;
#else
    (void)prdresdes;
    (void)rdresdes;
    (void)resourceid;
    (void)resourcedata;
    (void)resourcelen;
    (void)ulflags;
    (void)hmachine;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Move_DevNode_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dnfromdevinst = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t dntodevinst = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Move_DevNode")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dnfromdevinst, dntodevinst, ulflags) : 0;
#else
    (void)dnfromdevinst;
    (void)dntodevinst;
    (void)ulflags;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Move_DevNode_Ex_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dnfromdevinst = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t dntodevinst = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int64_t hmachine = km_info.Length() > 3 ? km_napi_arg_i64(km_info[3]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Move_DevNode_Ex")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dnfromdevinst, dntodevinst, ulflags, hmachine) : 0;
#else
    (void)dnfromdevinst;
    (void)dntodevinst;
    (void)ulflags;
    (void)hmachine;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Next_Range_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* preelement = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pullstart = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pullend = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Next_Range")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(preelement, pullstart, pullend, ulflags) : 0;
#else
    (void)preelement;
    (void)pullstart;
    (void)pullend;
    (void)ulflags;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Open_Class_KeyA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* classguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pszclassname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t samdesired = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t disposition = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* phkclass = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Open_Class_KeyA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(classguid, pszclassname, samdesired, disposition, phkclass, ulflags) : 0;
#else
    (void)classguid;
    (void)pszclassname;
    (void)samdesired;
    (void)disposition;
    (void)phkclass;
    (void)ulflags;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Open_Class_KeyW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* classguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pszclassname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t samdesired = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t disposition = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* phkclass = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Open_Class_KeyW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(classguid, pszclassname, samdesired, disposition, phkclass, ulflags) : 0;
#else
    (void)classguid;
    (void)pszclassname;
    (void)samdesired;
    (void)disposition;
    (void)phkclass;
    (void)ulflags;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Open_Class_Key_ExA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* classguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pszclassname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t samdesired = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t disposition = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* phkclass = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    int64_t hmachine = km_info.Length() > 6 ? km_napi_arg_i64(km_info[6]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Open_Class_Key_ExA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(classguid, pszclassname, samdesired, disposition, phkclass, ulflags, hmachine) : 0;
#else
    (void)classguid;
    (void)pszclassname;
    (void)samdesired;
    (void)disposition;
    (void)phkclass;
    (void)ulflags;
    (void)hmachine;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Open_Class_Key_ExW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* classguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pszclassname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t samdesired = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t disposition = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* phkclass = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    int64_t hmachine = km_info.Length() > 6 ? km_napi_arg_i64(km_info[6]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Open_Class_Key_ExW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(classguid, pszclassname, samdesired, disposition, phkclass, ulflags, hmachine) : 0;
#else
    (void)classguid;
    (void)pszclassname;
    (void)samdesired;
    (void)disposition;
    (void)phkclass;
    (void)ulflags;
    (void)hmachine;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Open_DevNode_Key_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dndevnode = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t samdesired = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t ulhardwareprofile = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t disposition = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* phkdevice = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Open_DevNode_Key")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dndevnode, samdesired, ulhardwareprofile, disposition, phkdevice, ulflags) : 0;
#else
    (void)dndevnode;
    (void)samdesired;
    (void)ulhardwareprofile;
    (void)disposition;
    (void)phkdevice;
    (void)ulflags;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Open_DevNode_Key_Ex_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dndevnode = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t samdesired = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t ulhardwareprofile = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t disposition = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* phkdevice = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    int64_t hmachine = km_info.Length() > 6 ? km_napi_arg_i64(km_info[6]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, uint32_t, void*, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Open_DevNode_Key_Ex")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dndevnode, samdesired, ulhardwareprofile, disposition, phkdevice, ulflags, hmachine) : 0;
#else
    (void)dndevnode;
    (void)samdesired;
    (void)ulhardwareprofile;
    (void)disposition;
    (void)phkdevice;
    (void)ulflags;
    (void)hmachine;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Open_Device_Interface_KeyA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pszdeviceinterface = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t samdesired = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t disposition = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* phkdeviceinterface = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Open_Device_Interface_KeyA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pszdeviceinterface, samdesired, disposition, phkdeviceinterface, ulflags) : 0;
#else
    (void)pszdeviceinterface;
    (void)samdesired;
    (void)disposition;
    (void)phkdeviceinterface;
    (void)ulflags;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Open_Device_Interface_KeyW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pszdeviceinterface = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t samdesired = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t disposition = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* phkdeviceinterface = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Open_Device_Interface_KeyW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pszdeviceinterface, samdesired, disposition, phkdeviceinterface, ulflags) : 0;
#else
    (void)pszdeviceinterface;
    (void)samdesired;
    (void)disposition;
    (void)phkdeviceinterface;
    (void)ulflags;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Open_Device_Interface_Key_ExA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pszdeviceinterface = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t samdesired = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t disposition = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* phkdeviceinterface = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    int64_t hmachine = km_info.Length() > 5 ? km_napi_arg_i64(km_info[5]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Open_Device_Interface_Key_ExA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pszdeviceinterface, samdesired, disposition, phkdeviceinterface, ulflags, hmachine) : 0;
#else
    (void)pszdeviceinterface;
    (void)samdesired;
    (void)disposition;
    (void)phkdeviceinterface;
    (void)ulflags;
    (void)hmachine;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Open_Device_Interface_Key_ExW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pszdeviceinterface = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t samdesired = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t disposition = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* phkdeviceinterface = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    int64_t hmachine = km_info.Length() > 5 ? km_napi_arg_i64(km_info[5]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Open_Device_Interface_Key_ExW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pszdeviceinterface, samdesired, disposition, phkdeviceinterface, ulflags, hmachine) : 0;
#else
    (void)pszdeviceinterface;
    (void)samdesired;
    (void)disposition;
    (void)phkdeviceinterface;
    (void)ulflags;
    (void)hmachine;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Query_And_Remove_SubTreeA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dnancestor = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* pvetotype = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pszvetoname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t ulnamelength = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Query_And_Remove_SubTreeA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dnancestor, pvetotype, pszvetoname, ulnamelength, ulflags) : 0;
#else
    (void)dnancestor;
    (void)pvetotype;
    (void)pszvetoname;
    (void)ulnamelength;
    (void)ulflags;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Query_And_Remove_SubTreeW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dnancestor = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* pvetotype = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pszvetoname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t ulnamelength = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Query_And_Remove_SubTreeW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dnancestor, pvetotype, pszvetoname, ulnamelength, ulflags) : 0;
#else
    (void)dnancestor;
    (void)pvetotype;
    (void)pszvetoname;
    (void)ulnamelength;
    (void)ulflags;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Query_And_Remove_SubTree_ExA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dnancestor = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* pvetotype = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pszvetoname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t ulnamelength = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    int64_t hmachine = km_info.Length() > 5 ? km_napi_arg_i64(km_info[5]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, uint32_t, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Query_And_Remove_SubTree_ExA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dnancestor, pvetotype, pszvetoname, ulnamelength, ulflags, hmachine) : 0;
#else
    (void)dnancestor;
    (void)pvetotype;
    (void)pszvetoname;
    (void)ulnamelength;
    (void)ulflags;
    (void)hmachine;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Query_And_Remove_SubTree_ExW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dnancestor = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* pvetotype = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pszvetoname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t ulnamelength = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    int64_t hmachine = km_info.Length() > 5 ? km_napi_arg_i64(km_info[5]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, uint32_t, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Query_And_Remove_SubTree_ExW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dnancestor, pvetotype, pszvetoname, ulnamelength, ulflags, hmachine) : 0;
#else
    (void)dnancestor;
    (void)pvetotype;
    (void)pszvetoname;
    (void)ulnamelength;
    (void)ulflags;
    (void)hmachine;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Query_Arbitrator_Free_Data_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t datalen = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t dndevinst = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t resourceid = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Query_Arbitrator_Free_Data")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pdata, datalen, dndevinst, resourceid, ulflags) : 0;
#else
    (void)pdata;
    (void)datalen;
    (void)dndevinst;
    (void)resourceid;
    (void)ulflags;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Query_Arbitrator_Free_Data_Ex_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t datalen = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t dndevinst = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t resourceid = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    int64_t hmachine = km_info.Length() > 5 ? km_napi_arg_i64(km_info[5]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Query_Arbitrator_Free_Data_Ex")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pdata, datalen, dndevinst, resourceid, ulflags, hmachine) : 0;
#else
    (void)pdata;
    (void)datalen;
    (void)dndevinst;
    (void)resourceid;
    (void)ulflags;
    (void)hmachine;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Query_Arbitrator_Free_Size_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pulsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dndevinst = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t resourceid = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Query_Arbitrator_Free_Size")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pulsize, dndevinst, resourceid, ulflags) : 0;
#else
    (void)pulsize;
    (void)dndevinst;
    (void)resourceid;
    (void)ulflags;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Query_Arbitrator_Free_Size_Ex_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pulsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dndevinst = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t resourceid = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    int64_t hmachine = km_info.Length() > 4 ? km_napi_arg_i64(km_info[4]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Query_Arbitrator_Free_Size_Ex")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pulsize, dndevinst, resourceid, ulflags, hmachine) : 0;
#else
    (void)pulsize;
    (void)dndevinst;
    (void)resourceid;
    (void)ulflags;
    (void)hmachine;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Query_Remove_SubTree_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dnancestor = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Query_Remove_SubTree")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dnancestor, ulflags) : 0;
#else
    (void)dnancestor;
    (void)ulflags;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Query_Remove_SubTree_Ex_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dnancestor = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int64_t hmachine = km_info.Length() > 2 ? km_napi_arg_i64(km_info[2]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Query_Remove_SubTree_Ex")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dnancestor, ulflags, hmachine) : 0;
#else
    (void)dnancestor;
    (void)ulflags;
    (void)hmachine;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Query_Resource_Conflict_List_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pclconflictlist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dndevinst = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t resourceid = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* resourcedata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t resourcelen = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    int64_t hmachine = km_info.Length() > 6 ? km_napi_arg_i64(km_info[6]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, uint32_t, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Query_Resource_Conflict_List")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pclconflictlist, dndevinst, resourceid, resourcedata, resourcelen, ulflags, hmachine) : 0;
#else
    (void)pclconflictlist;
    (void)dndevinst;
    (void)resourceid;
    (void)resourcedata;
    (void)resourcelen;
    (void)ulflags;
    (void)hmachine;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Reenumerate_DevNode_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dndevinst = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Reenumerate_DevNode")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dndevinst, ulflags) : 0;
#else
    (void)dndevinst;
    (void)ulflags;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Reenumerate_DevNode_Ex_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dndevinst = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int64_t hmachine = km_info.Length() > 2 ? km_napi_arg_i64(km_info[2]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Reenumerate_DevNode_Ex")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dndevinst, ulflags, hmachine) : 0;
#else
    (void)dndevinst;
    (void)ulflags;
    (void)hmachine;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Register_Device_Driver_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dndevinst = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Register_Device_Driver")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dndevinst, ulflags) : 0;
#else
    (void)dndevinst;
    (void)ulflags;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Register_Device_Driver_Ex_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dndevinst = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int64_t hmachine = km_info.Length() > 2 ? km_napi_arg_i64(km_info[2]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Register_Device_Driver_Ex")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dndevinst, ulflags, hmachine) : 0;
#else
    (void)dndevinst;
    (void)ulflags;
    (void)hmachine;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Register_Device_InterfaceA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dndevinst = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* interfaceclassguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pszreference = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pszdeviceinterface = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pullength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Register_Device_InterfaceA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dndevinst, interfaceclassguid, pszreference, pszdeviceinterface, pullength, ulflags) : 0;
#else
    (void)dndevinst;
    (void)interfaceclassguid;
    (void)pszreference;
    (void)pszdeviceinterface;
    (void)pullength;
    (void)ulflags;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Register_Device_InterfaceW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dndevinst = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* interfaceclassguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pszreference = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pszdeviceinterface = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pullength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Register_Device_InterfaceW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dndevinst, interfaceclassguid, pszreference, pszdeviceinterface, pullength, ulflags) : 0;
#else
    (void)dndevinst;
    (void)interfaceclassguid;
    (void)pszreference;
    (void)pszdeviceinterface;
    (void)pullength;
    (void)ulflags;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Register_Device_Interface_ExA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dndevinst = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* interfaceclassguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pszreference = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pszdeviceinterface = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pullength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    int64_t hmachine = km_info.Length() > 6 ? km_napi_arg_i64(km_info[6]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Register_Device_Interface_ExA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dndevinst, interfaceclassguid, pszreference, pszdeviceinterface, pullength, ulflags, hmachine) : 0;
#else
    (void)dndevinst;
    (void)interfaceclassguid;
    (void)pszreference;
    (void)pszdeviceinterface;
    (void)pullength;
    (void)ulflags;
    (void)hmachine;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Register_Device_Interface_ExW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dndevinst = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* interfaceclassguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pszreference = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pszdeviceinterface = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pullength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    int64_t hmachine = km_info.Length() > 6 ? km_napi_arg_i64(km_info[6]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Register_Device_Interface_ExW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dndevinst, interfaceclassguid, pszreference, pszdeviceinterface, pullength, ulflags, hmachine) : 0;
#else
    (void)dndevinst;
    (void)interfaceclassguid;
    (void)pszreference;
    (void)pszdeviceinterface;
    (void)pullength;
    (void)ulflags;
    (void)hmachine;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Register_Notification_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pfilter = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pcallback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pnotifycontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Register_Notification")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pfilter, pcontext, pcallback, pnotifycontext) : 0;
#else
    (void)pfilter;
    (void)pcontext;
    (void)pcallback;
    (void)pnotifycontext;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Remove_SubTree_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dnancestor = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Remove_SubTree")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dnancestor, ulflags) : 0;
#else
    (void)dnancestor;
    (void)ulflags;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Remove_SubTree_Ex_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dnancestor = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int64_t hmachine = km_info.Length() > 2 ? km_napi_arg_i64(km_info[2]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Remove_SubTree_Ex")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dnancestor, ulflags, hmachine) : 0;
#else
    (void)dnancestor;
    (void)ulflags;
    (void)hmachine;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Request_Device_EjectA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dndevinst = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* pvetotype = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pszvetoname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t ulnamelength = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Request_Device_EjectA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dndevinst, pvetotype, pszvetoname, ulnamelength, ulflags) : 0;
#else
    (void)dndevinst;
    (void)pvetotype;
    (void)pszvetoname;
    (void)ulnamelength;
    (void)ulflags;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Request_Device_EjectW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dndevinst = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* pvetotype = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pszvetoname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t ulnamelength = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Request_Device_EjectW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dndevinst, pvetotype, pszvetoname, ulnamelength, ulflags) : 0;
#else
    (void)dndevinst;
    (void)pvetotype;
    (void)pszvetoname;
    (void)ulnamelength;
    (void)ulflags;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Request_Device_Eject_ExA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dndevinst = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* pvetotype = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pszvetoname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t ulnamelength = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    int64_t hmachine = km_info.Length() > 5 ? km_napi_arg_i64(km_info[5]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, uint32_t, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Request_Device_Eject_ExA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dndevinst, pvetotype, pszvetoname, ulnamelength, ulflags, hmachine) : 0;
#else
    (void)dndevinst;
    (void)pvetotype;
    (void)pszvetoname;
    (void)ulnamelength;
    (void)ulflags;
    (void)hmachine;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Request_Device_Eject_ExW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dndevinst = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* pvetotype = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pszvetoname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t ulnamelength = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    int64_t hmachine = km_info.Length() > 5 ? km_napi_arg_i64(km_info[5]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, uint32_t, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Request_Device_Eject_ExW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dndevinst, pvetotype, pszvetoname, ulnamelength, ulflags, hmachine) : 0;
#else
    (void)dndevinst;
    (void)pvetotype;
    (void)pszvetoname;
    (void)ulnamelength;
    (void)ulflags;
    (void)hmachine;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Request_Eject_PC_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Request_Eject_PC")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr() : 0;
#else
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Request_Eject_PC_Ex_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hmachine = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Request_Eject_PC_Ex")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hmachine) : 0;
#else
    (void)hmachine;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Run_Detection_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Run_Detection")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(ulflags) : 0;
#else
    (void)ulflags;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Run_Detection_Ex_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    int64_t hmachine = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Run_Detection_Ex")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(ulflags, hmachine) : 0;
#else
    (void)ulflags;
    (void)hmachine;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Set_Class_PropertyW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* classguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* propertykey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t propertytype = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* propertybuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t propertybuffersize = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Set_Class_PropertyW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(classguid, propertykey, propertytype, propertybuffer, propertybuffersize, ulflags) : 0;
#else
    (void)classguid;
    (void)propertykey;
    (void)propertytype;
    (void)propertybuffer;
    (void)propertybuffersize;
    (void)ulflags;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Set_Class_Property_ExW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* classguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* propertykey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t propertytype = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* propertybuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t propertybuffersize = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    int64_t hmachine = km_info.Length() > 6 ? km_napi_arg_i64(km_info[6]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Set_Class_Property_ExW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(classguid, propertykey, propertytype, propertybuffer, propertybuffersize, ulflags, hmachine) : 0;
#else
    (void)classguid;
    (void)propertykey;
    (void)propertytype;
    (void)propertybuffer;
    (void)propertybuffersize;
    (void)ulflags;
    (void)hmachine;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Set_Class_Registry_PropertyA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* classguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t ulproperty = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t ullength = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    int64_t hmachine = km_info.Length() > 5 ? km_napi_arg_i64(km_info[5]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Set_Class_Registry_PropertyA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(classguid, ulproperty, buffer, ullength, ulflags, hmachine) : 0;
#else
    (void)classguid;
    (void)ulproperty;
    (void)buffer;
    (void)ullength;
    (void)ulflags;
    (void)hmachine;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Set_Class_Registry_PropertyW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* classguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t ulproperty = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t ullength = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    int64_t hmachine = km_info.Length() > 5 ? km_napi_arg_i64(km_info[5]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Set_Class_Registry_PropertyW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(classguid, ulproperty, buffer, ullength, ulflags, hmachine) : 0;
#else
    (void)classguid;
    (void)ulproperty;
    (void)buffer;
    (void)ullength;
    (void)ulflags;
    (void)hmachine;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Set_DevNode_Problem_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dndevinst = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t ulproblem = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Set_DevNode_Problem")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dndevinst, ulproblem, ulflags) : 0;
#else
    (void)dndevinst;
    (void)ulproblem;
    (void)ulflags;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Set_DevNode_Problem_Ex_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dndevinst = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t ulproblem = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int64_t hmachine = km_info.Length() > 3 ? km_napi_arg_i64(km_info[3]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Set_DevNode_Problem_Ex")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dndevinst, ulproblem, ulflags, hmachine) : 0;
#else
    (void)dndevinst;
    (void)ulproblem;
    (void)ulflags;
    (void)hmachine;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Set_DevNode_PropertyW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dndevinst = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* propertykey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t propertytype = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* propertybuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t propertybuffersize = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Set_DevNode_PropertyW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dndevinst, propertykey, propertytype, propertybuffer, propertybuffersize, ulflags) : 0;
#else
    (void)dndevinst;
    (void)propertykey;
    (void)propertytype;
    (void)propertybuffer;
    (void)propertybuffersize;
    (void)ulflags;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Set_DevNode_Property_ExW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dndevinst = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* propertykey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t propertytype = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* propertybuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t propertybuffersize = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    int64_t hmachine = km_info.Length() > 6 ? km_napi_arg_i64(km_info[6]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*, uint32_t, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Set_DevNode_Property_ExW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dndevinst, propertykey, propertytype, propertybuffer, propertybuffersize, ulflags, hmachine) : 0;
#else
    (void)dndevinst;
    (void)propertykey;
    (void)propertytype;
    (void)propertybuffer;
    (void)propertybuffersize;
    (void)ulflags;
    (void)hmachine;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Set_DevNode_Registry_PropertyA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dndevinst = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t ulproperty = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t ullength = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Set_DevNode_Registry_PropertyA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dndevinst, ulproperty, buffer, ullength, ulflags) : 0;
#else
    (void)dndevinst;
    (void)ulproperty;
    (void)buffer;
    (void)ullength;
    (void)ulflags;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Set_DevNode_Registry_PropertyW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dndevinst = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t ulproperty = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t ullength = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Set_DevNode_Registry_PropertyW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dndevinst, ulproperty, buffer, ullength, ulflags) : 0;
#else
    (void)dndevinst;
    (void)ulproperty;
    (void)buffer;
    (void)ullength;
    (void)ulflags;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Set_DevNode_Registry_Property_ExA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dndevinst = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t ulproperty = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t ullength = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    int64_t hmachine = km_info.Length() > 5 ? km_napi_arg_i64(km_info[5]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, uint32_t, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Set_DevNode_Registry_Property_ExA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dndevinst, ulproperty, buffer, ullength, ulflags, hmachine) : 0;
#else
    (void)dndevinst;
    (void)ulproperty;
    (void)buffer;
    (void)ullength;
    (void)ulflags;
    (void)hmachine;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Set_DevNode_Registry_Property_ExW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dndevinst = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t ulproperty = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t ullength = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    int64_t hmachine = km_info.Length() > 5 ? km_napi_arg_i64(km_info[5]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, uint32_t, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Set_DevNode_Registry_Property_ExW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dndevinst, ulproperty, buffer, ullength, ulflags, hmachine) : 0;
#else
    (void)dndevinst;
    (void)ulproperty;
    (void)buffer;
    (void)ullength;
    (void)ulflags;
    (void)hmachine;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Set_Device_Interface_PropertyW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pszdeviceinterface = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* propertykey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t propertytype = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* propertybuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t propertybuffersize = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Set_Device_Interface_PropertyW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pszdeviceinterface, propertykey, propertytype, propertybuffer, propertybuffersize, ulflags) : 0;
#else
    (void)pszdeviceinterface;
    (void)propertykey;
    (void)propertytype;
    (void)propertybuffer;
    (void)propertybuffersize;
    (void)ulflags;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Set_Device_Interface_Property_ExW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pszdeviceinterface = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* propertykey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t propertytype = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* propertybuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t propertybuffersize = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    int64_t hmachine = km_info.Length() > 6 ? km_napi_arg_i64(km_info[6]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Set_Device_Interface_Property_ExW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pszdeviceinterface, propertykey, propertytype, propertybuffer, propertybuffersize, ulflags, hmachine) : 0;
#else
    (void)pszdeviceinterface;
    (void)propertykey;
    (void)propertytype;
    (void)propertybuffer;
    (void)propertybuffersize;
    (void)ulflags;
    (void)hmachine;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Set_HW_Prof_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t ulhardwareprofile = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Set_HW_Prof")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(ulhardwareprofile, ulflags) : 0;
#else
    (void)ulhardwareprofile;
    (void)ulflags;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Set_HW_Prof_Ex_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t ulhardwareprofile = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int64_t hmachine = km_info.Length() > 2 ? km_napi_arg_i64(km_info[2]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Set_HW_Prof_Ex")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(ulhardwareprofile, ulflags, hmachine) : 0;
#else
    (void)ulhardwareprofile;
    (void)ulflags;
    (void)hmachine;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Set_HW_Prof_FlagsA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pdeviceid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t ulconfig = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t ulvalue = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Set_HW_Prof_FlagsA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pdeviceid, ulconfig, ulvalue, ulflags) : 0;
#else
    (void)pdeviceid;
    (void)ulconfig;
    (void)ulvalue;
    (void)ulflags;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Set_HW_Prof_FlagsW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pdeviceid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t ulconfig = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t ulvalue = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Set_HW_Prof_FlagsW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pdeviceid, ulconfig, ulvalue, ulflags) : 0;
#else
    (void)pdeviceid;
    (void)ulconfig;
    (void)ulvalue;
    (void)ulflags;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Set_HW_Prof_Flags_ExA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pdeviceid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t ulconfig = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t ulvalue = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    int64_t hmachine = km_info.Length() > 4 ? km_napi_arg_i64(km_info[4]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Set_HW_Prof_Flags_ExA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pdeviceid, ulconfig, ulvalue, ulflags, hmachine) : 0;
#else
    (void)pdeviceid;
    (void)ulconfig;
    (void)ulvalue;
    (void)ulflags;
    (void)hmachine;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Set_HW_Prof_Flags_ExW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pdeviceid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t ulconfig = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t ulvalue = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    int64_t hmachine = km_info.Length() > 4 ? km_napi_arg_i64(km_info[4]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Set_HW_Prof_Flags_ExW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pdeviceid, ulconfig, ulvalue, ulflags, hmachine) : 0;
#else
    (void)pdeviceid;
    (void)ulconfig;
    (void)ulvalue;
    (void)ulflags;
    (void)hmachine;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Setup_DevNode_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dndevinst = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Setup_DevNode")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dndevinst, ulflags) : 0;
#else
    (void)dndevinst;
    (void)ulflags;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Setup_DevNode_Ex_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dndevinst = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int64_t hmachine = km_info.Length() > 2 ? km_napi_arg_i64(km_info[2]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Setup_DevNode_Ex")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dndevinst, ulflags, hmachine) : 0;
#else
    (void)dndevinst;
    (void)ulflags;
    (void)hmachine;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Test_Range_Available_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t ullstartvalue = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint64_t ullendvalue = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    uint64_t rlh = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Test_Range_Available")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(ullstartvalue, ullendvalue, rlh, ulflags) : 0;
#else
    (void)ullstartvalue;
    (void)ullendvalue;
    (void)rlh;
    (void)ulflags;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Uninstall_DevNode_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dndevinst = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Uninstall_DevNode")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dndevinst, ulflags) : 0;
#else
    (void)dndevinst;
    (void)ulflags;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Uninstall_DevNode_Ex_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dndevinst = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int64_t hmachine = km_info.Length() > 2 ? km_napi_arg_i64(km_info[2]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Uninstall_DevNode_Ex")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dndevinst, ulflags, hmachine) : 0;
#else
    (void)dndevinst;
    (void)ulflags;
    (void)hmachine;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Unregister_Device_InterfaceA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pszdeviceinterface = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Unregister_Device_InterfaceA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pszdeviceinterface, ulflags) : 0;
#else
    (void)pszdeviceinterface;
    (void)ulflags;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Unregister_Device_InterfaceW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pszdeviceinterface = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Unregister_Device_InterfaceW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pszdeviceinterface, ulflags) : 0;
#else
    (void)pszdeviceinterface;
    (void)ulflags;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Unregister_Device_Interface_ExA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pszdeviceinterface = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int64_t hmachine = km_info.Length() > 2 ? km_napi_arg_i64(km_info[2]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Unregister_Device_Interface_ExA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pszdeviceinterface, ulflags, hmachine) : 0;
#else
    (void)pszdeviceinterface;
    (void)ulflags;
    (void)hmachine;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Unregister_Device_Interface_ExW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pszdeviceinterface = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t ulflags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int64_t hmachine = km_info.Length() > 2 ? km_napi_arg_i64(km_info[2]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Unregister_Device_Interface_ExW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pszdeviceinterface, ulflags, hmachine) : 0;
#else
    (void)pszdeviceinterface;
    (void)ulflags;
    (void)hmachine;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Unregister_Notification_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* notifycontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CM_Unregister_Notification")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(notifycontext) : 0;
#else
    (void)notifycontext;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_DiInstallDevice_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hwndparent = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int64_t deviceinfoset = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
    void* deviceinfodata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* driverinfodata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* needreboot = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int64_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("newdev.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DiInstallDevice")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hwndparent, deviceinfoset, deviceinfodata, driverinfodata, flags, needreboot) : -1;
#else
    (void)hwndparent;
    (void)deviceinfoset;
    (void)deviceinfodata;
    (void)driverinfodata;
    (void)flags;
    (void)needreboot;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_DiInstallDriverA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hwndparent = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* infpath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* needreboot = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("newdev.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DiInstallDriverA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hwndparent, infpath, flags, needreboot) : -1;
#else
    (void)hwndparent;
    (void)infpath;
    (void)flags;
    (void)needreboot;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_DiInstallDriverW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hwndparent = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* infpath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* needreboot = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("newdev.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DiInstallDriverW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hwndparent, infpath, flags, needreboot) : -1;
#else
    (void)hwndparent;
    (void)infpath;
    (void)flags;
    (void)needreboot;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_DiRollbackDriver_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t deviceinfoset = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* deviceinfodata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* hwndparent = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* needreboot = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("newdev.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DiRollbackDriver")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(deviceinfoset, deviceinfodata, hwndparent, flags, needreboot) : -1;
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    (void)hwndparent;
    (void)flags;
    (void)needreboot;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_DiShowUpdateDevice_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hwndparent = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int64_t deviceinfoset = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
    void* deviceinfodata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* needreboot = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("newdev.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DiShowUpdateDevice")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hwndparent, deviceinfoset, deviceinfodata, flags, needreboot) : -1;
#else
    (void)hwndparent;
    (void)deviceinfoset;
    (void)deviceinfodata;
    (void)flags;
    (void)needreboot;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_DiShowUpdateDriver_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hwndparent = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* filepath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* needreboot = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("newdev.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DiShowUpdateDriver")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hwndparent, filepath, flags, needreboot) : -1;
#else
    (void)hwndparent;
    (void)filepath;
    (void)flags;
    (void)needreboot;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_DiUninstallDevice_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hwndparent = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int64_t deviceinfoset = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
    void* deviceinfodata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* needreboot = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("newdev.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DiUninstallDevice")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hwndparent, deviceinfoset, deviceinfodata, flags, needreboot) : -1;
#else
    (void)hwndparent;
    (void)deviceinfoset;
    (void)deviceinfodata;
    (void)flags;
    (void)needreboot;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_DiUninstallDriverA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hwndparent = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* infpath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* needreboot = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("newdev.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DiUninstallDriverA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hwndparent, infpath, flags, needreboot) : -1;
#else
    (void)hwndparent;
    (void)infpath;
    (void)flags;
    (void)needreboot;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_DiUninstallDriverW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hwndparent = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* infpath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* needreboot = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("newdev.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DiUninstallDriverW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hwndparent, infpath, flags, needreboot) : -1;
#else
    (void)hwndparent;
    (void)infpath;
    (void)flags;
    (void)needreboot;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_InstallHinfSectionA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* window = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* modulehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* commandline = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int32_t showcommand = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "InstallHinfSectionA")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(window, modulehandle, commandline, showcommand);
#else
    (void)window;
    (void)modulehandle;
    (void)commandline;
    (void)showcommand;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_InstallHinfSectionW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* window = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* modulehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* commandline = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int32_t showcommand = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "InstallHinfSectionW")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(window, modulehandle, commandline, showcommand);
#else
    (void)window;
    (void)modulehandle;
    (void)commandline;
    (void)showcommand;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupAddInstallSectionToDiskSpaceListA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* diskspace = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* infhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* layoutinfhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* sectionname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* reserved1 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t reserved2 = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupAddInstallSectionToDiskSpaceListA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(diskspace, infhandle, layoutinfhandle, sectionname, reserved1, reserved2) : -1;
#else
    (void)diskspace;
    (void)infhandle;
    (void)layoutinfhandle;
    (void)sectionname;
    (void)reserved1;
    (void)reserved2;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupAddInstallSectionToDiskSpaceListW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* diskspace = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* infhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* layoutinfhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* sectionname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* reserved1 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t reserved2 = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupAddInstallSectionToDiskSpaceListW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(diskspace, infhandle, layoutinfhandle, sectionname, reserved1, reserved2) : -1;
#else
    (void)diskspace;
    (void)infhandle;
    (void)layoutinfhandle;
    (void)sectionname;
    (void)reserved1;
    (void)reserved2;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupAddSectionToDiskSpaceListA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* diskspace = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* infhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* listinfhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* sectionname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t operation = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* reserved1 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    uint32_t reserved2 = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupAddSectionToDiskSpaceListA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(diskspace, infhandle, listinfhandle, sectionname, operation, reserved1, reserved2) : -1;
#else
    (void)diskspace;
    (void)infhandle;
    (void)listinfhandle;
    (void)sectionname;
    (void)operation;
    (void)reserved1;
    (void)reserved2;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupAddSectionToDiskSpaceListW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* diskspace = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* infhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* listinfhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* sectionname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t operation = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* reserved1 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    uint32_t reserved2 = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupAddSectionToDiskSpaceListW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(diskspace, infhandle, listinfhandle, sectionname, operation, reserved1, reserved2) : -1;
#else
    (void)diskspace;
    (void)infhandle;
    (void)listinfhandle;
    (void)sectionname;
    (void)operation;
    (void)reserved1;
    (void)reserved2;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupAddToDiskSpaceListA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* diskspace = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* targetfilespec = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int64_t filesize = km_info.Length() > 2 ? km_napi_arg_i64(km_info[2]) : 0;
    uint32_t operation = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* reserved1 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t reserved2 = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int64_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupAddToDiskSpaceListA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(diskspace, targetfilespec, filesize, operation, reserved1, reserved2) : -1;
#else
    (void)diskspace;
    (void)targetfilespec;
    (void)filesize;
    (void)operation;
    (void)reserved1;
    (void)reserved2;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupAddToDiskSpaceListW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* diskspace = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* targetfilespec = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int64_t filesize = km_info.Length() > 2 ? km_napi_arg_i64(km_info[2]) : 0;
    uint32_t operation = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* reserved1 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t reserved2 = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int64_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupAddToDiskSpaceListW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(diskspace, targetfilespec, filesize, operation, reserved1, reserved2) : -1;
#else
    (void)diskspace;
    (void)targetfilespec;
    (void)filesize;
    (void)operation;
    (void)reserved1;
    (void)reserved2;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupAddToSourceListA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* source = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupAddToSourceListA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(flags, source) : -1;
#else
    (void)flags;
    (void)source;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupAddToSourceListW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* source = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupAddToSourceListW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(flags, source) : -1;
#else
    (void)flags;
    (void)source;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupAdjustDiskSpaceListA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* diskspace = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* driveroot = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int64_t amount = km_info.Length() > 2 ? km_napi_arg_i64(km_info[2]) : 0;
    void* reserved1 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t reserved2 = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupAdjustDiskSpaceListA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(diskspace, driveroot, amount, reserved1, reserved2) : -1;
#else
    (void)diskspace;
    (void)driveroot;
    (void)amount;
    (void)reserved1;
    (void)reserved2;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupAdjustDiskSpaceListW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* diskspace = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* driveroot = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int64_t amount = km_info.Length() > 2 ? km_napi_arg_i64(km_info[2]) : 0;
    void* reserved1 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t reserved2 = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupAdjustDiskSpaceListW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(diskspace, driveroot, amount, reserved1, reserved2) : -1;
#else
    (void)diskspace;
    (void)driveroot;
    (void)amount;
    (void)reserved1;
    (void)reserved2;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupBackupErrorA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hwndparent = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* dialogtitle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* sourcefile = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* targetfile = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t win32errorcode = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    uint32_t style = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupBackupErrorA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hwndparent, dialogtitle, sourcefile, targetfile, win32errorcode, style) : 0;
#else
    (void)hwndparent;
    (void)dialogtitle;
    (void)sourcefile;
    (void)targetfile;
    (void)win32errorcode;
    (void)style;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupBackupErrorW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hwndparent = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* dialogtitle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* sourcefile = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* targetfile = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t win32errorcode = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    uint32_t style = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupBackupErrorW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hwndparent, dialogtitle, sourcefile, targetfile, win32errorcode, style) : 0;
#else
    (void)hwndparent;
    (void)dialogtitle;
    (void)sourcefile;
    (void)targetfile;
    (void)win32errorcode;
    (void)style;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupCancelTemporarySourceList_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupCancelTemporarySourceList")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupCloseFileQueue_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* queuehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupCloseFileQueue")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(queuehandle) : -1;
#else
    (void)queuehandle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupCloseInfFile_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* infhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupCloseInfFile")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(infhandle);
#else
    (void)infhandle;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupCloseLog_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupCloseLog")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr();
#else
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupCommitFileQueueA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* owner = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* queuehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* msghandler = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* context = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupCommitFileQueueA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(owner, queuehandle, msghandler, context) : -1;
#else
    (void)owner;
    (void)queuehandle;
    (void)msghandler;
    (void)context;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupCommitFileQueueW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* owner = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* queuehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* msghandler = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* context = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupCommitFileQueueW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(owner, queuehandle, msghandler, context) : -1;
#else
    (void)owner;
    (void)queuehandle;
    (void)msghandler;
    (void)context;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupConfigureWmiFromInfSectionA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* infhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* sectionname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupConfigureWmiFromInfSectionA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(infhandle, sectionname, flags) : -1;
#else
    (void)infhandle;
    (void)sectionname;
    (void)flags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupConfigureWmiFromInfSectionW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* infhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* sectionname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupConfigureWmiFromInfSectionW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(infhandle, sectionname, flags) : -1;
#else
    (void)infhandle;
    (void)sectionname;
    (void)flags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupCopyErrorA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hwndparent = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* dialogtitle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* diskname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pathtosource = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* sourcefile = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* targetpathfile = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    uint32_t win32errorcode = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    uint32_t style = static_cast<uint32_t>(km_info.Length() > 7 ? km_info[7].ToNumber().Int32Value() : 0);
    void* pathbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
    uint32_t pathbuffersize = static_cast<uint32_t>(km_info.Length() > 9 ? km_info[9].ToNumber().Int32Value() : 0);
    void* pathrequiredsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 10 ? km_napi_arg_u64(km_info[10]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, uint32_t, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupCopyErrorA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hwndparent, dialogtitle, diskname, pathtosource, sourcefile, targetpathfile, win32errorcode, style, pathbuffer, pathbuffersize, pathrequiredsize) : 0;
#else
    (void)hwndparent;
    (void)dialogtitle;
    (void)diskname;
    (void)pathtosource;
    (void)sourcefile;
    (void)targetpathfile;
    (void)win32errorcode;
    (void)style;
    (void)pathbuffer;
    (void)pathbuffersize;
    (void)pathrequiredsize;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupCopyErrorW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hwndparent = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* dialogtitle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* diskname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pathtosource = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* sourcefile = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* targetpathfile = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    uint32_t win32errorcode = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    uint32_t style = static_cast<uint32_t>(km_info.Length() > 7 ? km_info[7].ToNumber().Int32Value() : 0);
    void* pathbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
    uint32_t pathbuffersize = static_cast<uint32_t>(km_info.Length() > 9 ? km_info[9].ToNumber().Int32Value() : 0);
    void* pathrequiredsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 10 ? km_napi_arg_u64(km_info[10]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, uint32_t, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupCopyErrorW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hwndparent, dialogtitle, diskname, pathtosource, sourcefile, targetpathfile, win32errorcode, style, pathbuffer, pathbuffersize, pathrequiredsize) : 0;
#else
    (void)hwndparent;
    (void)dialogtitle;
    (void)diskname;
    (void)pathtosource;
    (void)sourcefile;
    (void)targetpathfile;
    (void)win32errorcode;
    (void)style;
    (void)pathbuffer;
    (void)pathbuffersize;
    (void)pathrequiredsize;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupCopyOEMInfA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* sourceinffilename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* oemsourcemedialocation = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t oemsourcemediatype = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t copystyle = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* destinationinffilename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t destinationinffilenamesize = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* requiredsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* destinationinffilenamecomponent = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupCopyOEMInfA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sourceinffilename, oemsourcemedialocation, oemsourcemediatype, copystyle, destinationinffilename, destinationinffilenamesize, requiredsize, destinationinffilenamecomponent) : -1;
#else
    (void)sourceinffilename;
    (void)oemsourcemedialocation;
    (void)oemsourcemediatype;
    (void)copystyle;
    (void)destinationinffilename;
    (void)destinationinffilenamesize;
    (void)requiredsize;
    (void)destinationinffilenamecomponent;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupCopyOEMInfW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* sourceinffilename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* oemsourcemedialocation = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t oemsourcemediatype = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t copystyle = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* destinationinffilename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t destinationinffilenamesize = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* requiredsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* destinationinffilenamecomponent = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupCopyOEMInfW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sourceinffilename, oemsourcemedialocation, oemsourcemediatype, copystyle, destinationinffilename, destinationinffilenamesize, requiredsize, destinationinffilenamecomponent) : -1;
#else
    (void)sourceinffilename;
    (void)oemsourcemedialocation;
    (void)oemsourcemediatype;
    (void)copystyle;
    (void)destinationinffilename;
    (void)destinationinffilenamesize;
    (void)requiredsize;
    (void)destinationinffilenamecomponent;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupCreateDiskSpaceListA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* reserved1 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t reserved2 = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupCreateDiskSpaceListA")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(reserved1, reserved2, flags) : NULL;
#else
    (void)reserved1;
    (void)reserved2;
    (void)flags;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupCreateDiskSpaceListW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* reserved1 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t reserved2 = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupCreateDiskSpaceListW")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(reserved1, reserved2, flags) : NULL;
#else
    (void)reserved1;
    (void)reserved2;
    (void)flags;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDecompressOrCopyFileA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* sourcefilename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* targetfilename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* compressiontype = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupDecompressOrCopyFileA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sourcefilename, targetfilename, compressiontype) : 0;
#else
    (void)sourcefilename;
    (void)targetfilename;
    (void)compressiontype;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDecompressOrCopyFileW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* sourcefilename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* targetfilename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* compressiontype = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupDecompressOrCopyFileW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sourcefilename, targetfilename, compressiontype) : 0;
#else
    (void)sourcefilename;
    (void)targetfilename;
    (void)compressiontype;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDefaultQueueCallbackA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* context = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t notification = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint64_t param1 = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
    uint64_t param2 = km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint64_t, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupDefaultQueueCallbackA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(context, notification, param1, param2) : 0;
#else
    (void)context;
    (void)notification;
    (void)param1;
    (void)param2;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDefaultQueueCallbackW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* context = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t notification = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint64_t param1 = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
    uint64_t param2 = km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint64_t, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupDefaultQueueCallbackW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(context, notification, param1, param2) : 0;
#else
    (void)context;
    (void)notification;
    (void)param1;
    (void)param2;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDeleteErrorA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hwndparent = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* dialogtitle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* file = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t win32errorcode = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t style = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupDeleteErrorA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hwndparent, dialogtitle, file, win32errorcode, style) : 0;
#else
    (void)hwndparent;
    (void)dialogtitle;
    (void)file;
    (void)win32errorcode;
    (void)style;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDeleteErrorW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hwndparent = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* dialogtitle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* file = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t win32errorcode = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t style = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupDeleteErrorW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hwndparent, dialogtitle, file, win32errorcode, style) : 0;
#else
    (void)hwndparent;
    (void)dialogtitle;
    (void)file;
    (void)win32errorcode;
    (void)style;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDestroyDiskSpaceList_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* diskspace = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupDestroyDiskSpaceList")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(diskspace) : -1;
#else
    (void)diskspace;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiAskForOEMDisk_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t deviceinfoset = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* deviceinfodata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupDiAskForOEMDisk")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(deviceinfoset, deviceinfodata) : -1;
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiBuildClassInfoList_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* classguidlist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t classguidlistsize = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* requiredsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupDiBuildClassInfoList")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(flags, classguidlist, classguidlistsize, requiredsize) : -1;
#else
    (void)flags;
    (void)classguidlist;
    (void)classguidlistsize;
    (void)requiredsize;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiBuildClassInfoListExA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* classguidlist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t classguidlistsize = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* requiredsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* machinename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* reserved = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupDiBuildClassInfoListExA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(flags, classguidlist, classguidlistsize, requiredsize, machinename, reserved) : -1;
#else
    (void)flags;
    (void)classguidlist;
    (void)classguidlistsize;
    (void)requiredsize;
    (void)machinename;
    (void)reserved;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiBuildClassInfoListExW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* classguidlist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t classguidlistsize = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* requiredsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* machinename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* reserved = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupDiBuildClassInfoListExW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(flags, classguidlist, classguidlistsize, requiredsize, machinename, reserved) : -1;
#else
    (void)flags;
    (void)classguidlist;
    (void)classguidlistsize;
    (void)requiredsize;
    (void)machinename;
    (void)reserved;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiBuildDriverInfoList_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t deviceinfoset = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* deviceinfodata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t drivertype = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupDiBuildDriverInfoList")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(deviceinfoset, deviceinfodata, drivertype) : -1;
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    (void)drivertype;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiCallClassInstaller_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t installfunction = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    int64_t deviceinfoset = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
    void* deviceinfodata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupDiCallClassInstaller")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(installfunction, deviceinfoset, deviceinfodata) : -1;
#else
    (void)installfunction;
    (void)deviceinfoset;
    (void)deviceinfodata;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiCancelDriverInfoSearch_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t deviceinfoset = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupDiCancelDriverInfoSearch")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(deviceinfoset) : -1;
#else
    (void)deviceinfoset;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiChangeState_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t deviceinfoset = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* deviceinfodata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupDiChangeState")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(deviceinfoset, deviceinfodata) : -1;
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiClassGuidsFromNameA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* classname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* classguidlist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t classguidlistsize = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* requiredsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupDiClassGuidsFromNameA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(classname, classguidlist, classguidlistsize, requiredsize) : -1;
#else
    (void)classname;
    (void)classguidlist;
    (void)classguidlistsize;
    (void)requiredsize;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiClassGuidsFromNameExA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* classname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* classguidlist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t classguidlistsize = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* requiredsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* machinename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* reserved = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupDiClassGuidsFromNameExA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(classname, classguidlist, classguidlistsize, requiredsize, machinename, reserved) : -1;
#else
    (void)classname;
    (void)classguidlist;
    (void)classguidlistsize;
    (void)requiredsize;
    (void)machinename;
    (void)reserved;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiClassGuidsFromNameExW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* classname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* classguidlist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t classguidlistsize = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* requiredsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* machinename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* reserved = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupDiClassGuidsFromNameExW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(classname, classguidlist, classguidlistsize, requiredsize, machinename, reserved) : -1;
#else
    (void)classname;
    (void)classguidlist;
    (void)classguidlistsize;
    (void)requiredsize;
    (void)machinename;
    (void)reserved;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiClassGuidsFromNameW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* classname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* classguidlist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t classguidlistsize = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* requiredsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupDiClassGuidsFromNameW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(classname, classguidlist, classguidlistsize, requiredsize) : -1;
#else
    (void)classname;
    (void)classguidlist;
    (void)classguidlistsize;
    (void)requiredsize;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiClassNameFromGuidA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* classguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* classname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t classnamesize = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* requiredsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupDiClassNameFromGuidA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(classguid, classname, classnamesize, requiredsize) : -1;
#else
    (void)classguid;
    (void)classname;
    (void)classnamesize;
    (void)requiredsize;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiClassNameFromGuidExA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* classguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* classname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t classnamesize = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* requiredsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* machinename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* reserved = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupDiClassNameFromGuidExA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(classguid, classname, classnamesize, requiredsize, machinename, reserved) : -1;
#else
    (void)classguid;
    (void)classname;
    (void)classnamesize;
    (void)requiredsize;
    (void)machinename;
    (void)reserved;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiClassNameFromGuidExW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* classguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* classname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t classnamesize = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* requiredsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* machinename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* reserved = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupDiClassNameFromGuidExW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(classguid, classname, classnamesize, requiredsize, machinename, reserved) : -1;
#else
    (void)classguid;
    (void)classname;
    (void)classnamesize;
    (void)requiredsize;
    (void)machinename;
    (void)reserved;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiClassNameFromGuidW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* classguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* classname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t classnamesize = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* requiredsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupDiClassNameFromGuidW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(classguid, classname, classnamesize, requiredsize) : -1;
#else
    (void)classguid;
    (void)classname;
    (void)classnamesize;
    (void)requiredsize;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiCreateDevRegKeyA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t deviceinfoset = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* deviceinfodata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t scope = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t hwprofile = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t keytype = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* infhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* infsectionname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t, void*, uint32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupDiCreateDevRegKeyA")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(deviceinfoset, deviceinfodata, scope, hwprofile, keytype, infhandle, infsectionname) : NULL;
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    (void)scope;
    (void)hwprofile;
    (void)keytype;
    (void)infhandle;
    (void)infsectionname;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiCreateDevRegKeyW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t deviceinfoset = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* deviceinfodata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t scope = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t hwprofile = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t keytype = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* infhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* infsectionname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t, void*, uint32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupDiCreateDevRegKeyW")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(deviceinfoset, deviceinfodata, scope, hwprofile, keytype, infhandle, infsectionname) : NULL;
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    (void)scope;
    (void)hwprofile;
    (void)keytype;
    (void)infhandle;
    (void)infsectionname;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiCreateDeviceInfoA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t deviceinfoset = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* devicename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* classguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* devicedescription = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* hwndparent = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t creationflags = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* deviceinfodata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupDiCreateDeviceInfoA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(deviceinfoset, devicename, classguid, devicedescription, hwndparent, creationflags, deviceinfodata) : -1;
#else
    (void)deviceinfoset;
    (void)devicename;
    (void)classguid;
    (void)devicedescription;
    (void)hwndparent;
    (void)creationflags;
    (void)deviceinfodata;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiCreateDeviceInfoList_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* classguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* hwndparent = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupDiCreateDeviceInfoList")));
    }
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(classguid, hwndparent) : -1;
#else
    (void)classguid;
    (void)hwndparent;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiCreateDeviceInfoListExA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* classguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* hwndparent = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* machinename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* reserved = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupDiCreateDeviceInfoListExA")));
    }
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(classguid, hwndparent, machinename, reserved) : -1;
#else
    (void)classguid;
    (void)hwndparent;
    (void)machinename;
    (void)reserved;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiCreateDeviceInfoListExW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* classguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* hwndparent = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* machinename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* reserved = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupDiCreateDeviceInfoListExW")));
    }
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(classguid, hwndparent, machinename, reserved) : -1;
#else
    (void)classguid;
    (void)hwndparent;
    (void)machinename;
    (void)reserved;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiCreateDeviceInfoW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t deviceinfoset = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* devicename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* classguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* devicedescription = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* hwndparent = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t creationflags = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* deviceinfodata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupDiCreateDeviceInfoW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(deviceinfoset, devicename, classguid, devicedescription, hwndparent, creationflags, deviceinfodata) : -1;
#else
    (void)deviceinfoset;
    (void)devicename;
    (void)classguid;
    (void)devicedescription;
    (void)hwndparent;
    (void)creationflags;
    (void)deviceinfodata;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiCreateDeviceInterfaceA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t deviceinfoset = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* deviceinfodata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* interfaceclassguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* referencestring = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t creationflags = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* deviceinterfacedata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupDiCreateDeviceInterfaceA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(deviceinfoset, deviceinfodata, interfaceclassguid, referencestring, creationflags, deviceinterfacedata) : -1;
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    (void)interfaceclassguid;
    (void)referencestring;
    (void)creationflags;
    (void)deviceinterfacedata;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiCreateDeviceInterfaceRegKeyA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t deviceinfoset = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* deviceinterfacedata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t reserved = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t samdesired = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* infhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* infsectionname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t, void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupDiCreateDeviceInterfaceRegKeyA")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(deviceinfoset, deviceinterfacedata, reserved, samdesired, infhandle, infsectionname) : NULL;
#else
    (void)deviceinfoset;
    (void)deviceinterfacedata;
    (void)reserved;
    (void)samdesired;
    (void)infhandle;
    (void)infsectionname;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiCreateDeviceInterfaceRegKeyW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t deviceinfoset = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* deviceinterfacedata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t reserved = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t samdesired = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* infhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* infsectionname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t, void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupDiCreateDeviceInterfaceRegKeyW")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(deviceinfoset, deviceinterfacedata, reserved, samdesired, infhandle, infsectionname) : NULL;
#else
    (void)deviceinfoset;
    (void)deviceinterfacedata;
    (void)reserved;
    (void)samdesired;
    (void)infhandle;
    (void)infsectionname;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiCreateDeviceInterfaceW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t deviceinfoset = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* deviceinfodata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* interfaceclassguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* referencestring = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t creationflags = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* deviceinterfacedata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupDiCreateDeviceInterfaceW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(deviceinfoset, deviceinfodata, interfaceclassguid, referencestring, creationflags, deviceinterfacedata) : -1;
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    (void)interfaceclassguid;
    (void)referencestring;
    (void)creationflags;
    (void)deviceinterfacedata;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiDeleteDevRegKey_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t deviceinfoset = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* deviceinfodata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t scope = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t hwprofile = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t keytype = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupDiDeleteDevRegKey")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(deviceinfoset, deviceinfodata, scope, hwprofile, keytype) : -1;
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    (void)scope;
    (void)hwprofile;
    (void)keytype;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiDeleteDeviceInfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t deviceinfoset = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* deviceinfodata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupDiDeleteDeviceInfo")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(deviceinfoset, deviceinfodata) : -1;
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiDeleteDeviceInterfaceData_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t deviceinfoset = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* deviceinterfacedata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupDiDeleteDeviceInterfaceData")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(deviceinfoset, deviceinterfacedata) : -1;
#else
    (void)deviceinfoset;
    (void)deviceinterfacedata;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiDeleteDeviceInterfaceRegKey_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t deviceinfoset = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* deviceinterfacedata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t reserved = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupDiDeleteDeviceInterfaceRegKey")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(deviceinfoset, deviceinterfacedata, reserved) : -1;
#else
    (void)deviceinfoset;
    (void)deviceinterfacedata;
    (void)reserved;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiDestroyClassImageList_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* classimagelistdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupDiDestroyClassImageList")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(classimagelistdata) : -1;
#else
    (void)classimagelistdata;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiDestroyDeviceInfoList_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t deviceinfoset = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupDiDestroyDeviceInfoList")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(deviceinfoset) : -1;
#else
    (void)deviceinfoset;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiDestroyDriverInfoList_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t deviceinfoset = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* deviceinfodata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t drivertype = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupDiDestroyDriverInfoList")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(deviceinfoset, deviceinfodata, drivertype) : -1;
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    (void)drivertype;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiEnumDeviceInfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t deviceinfoset = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint32_t memberindex = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* deviceinfodata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupDiEnumDeviceInfo")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(deviceinfoset, memberindex, deviceinfodata) : -1;
#else
    (void)deviceinfoset;
    (void)memberindex;
    (void)deviceinfodata;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiEnumDeviceInterfaces_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t deviceinfoset = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* deviceinfodata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* interfaceclassguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t memberindex = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* deviceinterfacedata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupDiEnumDeviceInterfaces")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(deviceinfoset, deviceinfodata, interfaceclassguid, memberindex, deviceinterfacedata) : -1;
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    (void)interfaceclassguid;
    (void)memberindex;
    (void)deviceinterfacedata;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiEnumDriverInfoA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t deviceinfoset = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* deviceinfodata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t drivertype = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t memberindex = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* driverinfodata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupDiEnumDriverInfoA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(deviceinfoset, deviceinfodata, drivertype, memberindex, driverinfodata) : -1;
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    (void)drivertype;
    (void)memberindex;
    (void)driverinfodata;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiEnumDriverInfoW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t deviceinfoset = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* deviceinfodata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t drivertype = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t memberindex = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* driverinfodata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupDiEnumDriverInfoW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(deviceinfoset, deviceinfodata, drivertype, memberindex, driverinfodata) : -1;
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    (void)drivertype;
    (void)memberindex;
    (void)driverinfodata;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetActualModelsSectionA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* context = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* alternateplatforminfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* infsectionwithext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t infsectionwithextsize = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* requiredsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* reserved = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupDiGetActualModelsSectionA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(context, alternateplatforminfo, infsectionwithext, infsectionwithextsize, requiredsize, reserved) : -1;
#else
    (void)context;
    (void)alternateplatforminfo;
    (void)infsectionwithext;
    (void)infsectionwithextsize;
    (void)requiredsize;
    (void)reserved;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetActualModelsSectionW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* context = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* alternateplatforminfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* infsectionwithext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t infsectionwithextsize = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* requiredsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* reserved = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupDiGetActualModelsSectionW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(context, alternateplatforminfo, infsectionwithext, infsectionwithextsize, requiredsize, reserved) : -1;
#else
    (void)context;
    (void)alternateplatforminfo;
    (void)infsectionwithext;
    (void)infsectionwithextsize;
    (void)requiredsize;
    (void)reserved;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetActualSectionToInstallA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* infhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* infsectionname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* infsectionwithext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t infsectionwithextsize = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* requiredsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* extension = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupDiGetActualSectionToInstallA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(infhandle, infsectionname, infsectionwithext, infsectionwithextsize, requiredsize, extension) : -1;
#else
    (void)infhandle;
    (void)infsectionname;
    (void)infsectionwithext;
    (void)infsectionwithextsize;
    (void)requiredsize;
    (void)extension;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetActualSectionToInstallExA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* infhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* infsectionname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* alternateplatforminfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* infsectionwithext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t infsectionwithextsize = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* requiredsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* extension = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* reserved = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupDiGetActualSectionToInstallExA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(infhandle, infsectionname, alternateplatforminfo, infsectionwithext, infsectionwithextsize, requiredsize, extension, reserved) : -1;
#else
    (void)infhandle;
    (void)infsectionname;
    (void)alternateplatforminfo;
    (void)infsectionwithext;
    (void)infsectionwithextsize;
    (void)requiredsize;
    (void)extension;
    (void)reserved;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetActualSectionToInstallExW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* infhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* infsectionname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* alternateplatforminfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* infsectionwithext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t infsectionwithextsize = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* requiredsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* extension = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* reserved = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupDiGetActualSectionToInstallExW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(infhandle, infsectionname, alternateplatforminfo, infsectionwithext, infsectionwithextsize, requiredsize, extension, reserved) : -1;
#else
    (void)infhandle;
    (void)infsectionname;
    (void)alternateplatforminfo;
    (void)infsectionwithext;
    (void)infsectionwithextsize;
    (void)requiredsize;
    (void)extension;
    (void)reserved;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetActualSectionToInstallW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* infhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* infsectionname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* infsectionwithext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t infsectionwithextsize = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* requiredsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* extension = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupDiGetActualSectionToInstallW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(infhandle, infsectionname, infsectionwithext, infsectionwithextsize, requiredsize, extension) : -1;
#else
    (void)infhandle;
    (void)infsectionname;
    (void)infsectionwithext;
    (void)infsectionwithextsize;
    (void)requiredsize;
    (void)extension;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassBitmapIndex_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* classguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* miniiconindex = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupDiGetClassBitmapIndex")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(classguid, miniiconindex) : -1;
#else
    (void)classguid;
    (void)miniiconindex;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassDescriptionA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* classguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* classdescription = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t classdescriptionsize = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* requiredsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupDiGetClassDescriptionA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(classguid, classdescription, classdescriptionsize, requiredsize) : -1;
#else
    (void)classguid;
    (void)classdescription;
    (void)classdescriptionsize;
    (void)requiredsize;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassDescriptionExA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* classguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* classdescription = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t classdescriptionsize = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* requiredsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* machinename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* reserved = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupDiGetClassDescriptionExA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(classguid, classdescription, classdescriptionsize, requiredsize, machinename, reserved) : -1;
#else
    (void)classguid;
    (void)classdescription;
    (void)classdescriptionsize;
    (void)requiredsize;
    (void)machinename;
    (void)reserved;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassDescriptionExW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* classguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* classdescription = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t classdescriptionsize = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* requiredsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* machinename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* reserved = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupDiGetClassDescriptionExW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(classguid, classdescription, classdescriptionsize, requiredsize, machinename, reserved) : -1;
#else
    (void)classguid;
    (void)classdescription;
    (void)classdescriptionsize;
    (void)requiredsize;
    (void)machinename;
    (void)reserved;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassDescriptionW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* classguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* classdescription = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t classdescriptionsize = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* requiredsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupDiGetClassDescriptionW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(classguid, classdescription, classdescriptionsize, requiredsize) : -1;
#else
    (void)classguid;
    (void)classdescription;
    (void)classdescriptionsize;
    (void)requiredsize;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassDevPropertySheetsA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t deviceinfoset = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* deviceinfodata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* propertysheetheader = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t propertysheetheaderpagelistsize = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* requiredsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t propertysheettype = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupDiGetClassDevPropertySheetsA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(deviceinfoset, deviceinfodata, propertysheetheader, propertysheetheaderpagelistsize, requiredsize, propertysheettype) : -1;
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    (void)propertysheetheader;
    (void)propertysheetheaderpagelistsize;
    (void)requiredsize;
    (void)propertysheettype;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassDevPropertySheetsW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t deviceinfoset = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* deviceinfodata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* propertysheetheader = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t propertysheetheaderpagelistsize = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* requiredsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t propertysheettype = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupDiGetClassDevPropertySheetsW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(deviceinfoset, deviceinfodata, propertysheetheader, propertysheetheaderpagelistsize, requiredsize, propertysheettype) : -1;
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    (void)propertysheetheader;
    (void)propertysheetheaderpagelistsize;
    (void)requiredsize;
    (void)propertysheettype;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassDevsA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* classguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* enumerator = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* hwndparent = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupDiGetClassDevsA")));
    }
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(classguid, enumerator, hwndparent, flags) : -1;
#else
    (void)classguid;
    (void)enumerator;
    (void)hwndparent;
    (void)flags;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassDevsExA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* classguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* enumerator = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* hwndparent = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    int64_t deviceinfoset = km_info.Length() > 4 ? km_napi_arg_i64(km_info[4]) : 0;
    void* machinename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* reserved = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, int64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupDiGetClassDevsExA")));
    }
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(classguid, enumerator, hwndparent, flags, deviceinfoset, machinename, reserved) : -1;
#else
    (void)classguid;
    (void)enumerator;
    (void)hwndparent;
    (void)flags;
    (void)deviceinfoset;
    (void)machinename;
    (void)reserved;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassDevsExW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* classguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* enumerator = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* hwndparent = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    int64_t deviceinfoset = km_info.Length() > 4 ? km_napi_arg_i64(km_info[4]) : 0;
    void* machinename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* reserved = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, int64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupDiGetClassDevsExW")));
    }
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(classguid, enumerator, hwndparent, flags, deviceinfoset, machinename, reserved) : -1;
#else
    (void)classguid;
    (void)enumerator;
    (void)hwndparent;
    (void)flags;
    (void)deviceinfoset;
    (void)machinename;
    (void)reserved;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassDevsW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* classguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* enumerator = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* hwndparent = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupDiGetClassDevsW")));
    }
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(classguid, enumerator, hwndparent, flags) : -1;
#else
    (void)classguid;
    (void)enumerator;
    (void)hwndparent;
    (void)flags;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassImageIndex_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* classimagelistdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* classguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* imageindex = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupDiGetClassImageIndex")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(classimagelistdata, classguid, imageindex) : -1;
#else
    (void)classimagelistdata;
    (void)classguid;
    (void)imageindex;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassImageList_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* classimagelistdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupDiGetClassImageList")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(classimagelistdata) : -1;
#else
    (void)classimagelistdata;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassImageListExA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* classimagelistdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* machinename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* reserved = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupDiGetClassImageListExA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(classimagelistdata, machinename, reserved) : -1;
#else
    (void)classimagelistdata;
    (void)machinename;
    (void)reserved;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassImageListExW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* classimagelistdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* machinename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* reserved = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupDiGetClassImageListExW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(classimagelistdata, machinename, reserved) : -1;
#else
    (void)classimagelistdata;
    (void)machinename;
    (void)reserved;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassInstallParamsA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t deviceinfoset = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* deviceinfodata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* classinstallparams = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t classinstallparamssize = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* requiredsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupDiGetClassInstallParamsA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(deviceinfoset, deviceinfodata, classinstallparams, classinstallparamssize, requiredsize) : -1;
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    (void)classinstallparams;
    (void)classinstallparamssize;
    (void)requiredsize;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassInstallParamsW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t deviceinfoset = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* deviceinfodata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* classinstallparams = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t classinstallparamssize = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* requiredsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupDiGetClassInstallParamsW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(deviceinfoset, deviceinfodata, classinstallparams, classinstallparamssize, requiredsize) : -1;
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    (void)classinstallparams;
    (void)classinstallparamssize;
    (void)requiredsize;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassPropertyExW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* classguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* propertykey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* propertytype = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* propertybuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t propertybuffersize = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* requiredsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    void* machinename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    void* reserved = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupDiGetClassPropertyExW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(classguid, propertykey, propertytype, propertybuffer, propertybuffersize, requiredsize, flags, machinename, reserved) : -1;
#else
    (void)classguid;
    (void)propertykey;
    (void)propertytype;
    (void)propertybuffer;
    (void)propertybuffersize;
    (void)requiredsize;
    (void)flags;
    (void)machinename;
    (void)reserved;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassPropertyKeys_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* classguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* propertykeyarray = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t propertykeycount = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* requiredpropertykeycount = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupDiGetClassPropertyKeys")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(classguid, propertykeyarray, propertykeycount, requiredpropertykeycount, flags) : -1;
#else
    (void)classguid;
    (void)propertykeyarray;
    (void)propertykeycount;
    (void)requiredpropertykeycount;
    (void)flags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassPropertyKeysExW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* classguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* propertykeyarray = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t propertykeycount = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* requiredpropertykeycount = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* machinename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* reserved = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupDiGetClassPropertyKeysExW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(classguid, propertykeyarray, propertykeycount, requiredpropertykeycount, flags, machinename, reserved) : -1;
#else
    (void)classguid;
    (void)propertykeyarray;
    (void)propertykeycount;
    (void)requiredpropertykeycount;
    (void)flags;
    (void)machinename;
    (void)reserved;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassPropertyW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* classguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* propertykey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* propertytype = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* propertybuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t propertybuffersize = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* requiredsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupDiGetClassPropertyW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(classguid, propertykey, propertytype, propertybuffer, propertybuffersize, requiredsize, flags) : -1;
#else
    (void)classguid;
    (void)propertykey;
    (void)propertytype;
    (void)propertybuffer;
    (void)propertybuffersize;
    (void)requiredsize;
    (void)flags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassRegistryPropertyA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* classguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t property = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* propertyregdatatype = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* propertybuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t propertybuffersize = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* requiredsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* machinename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* reserved = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupDiGetClassRegistryPropertyA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(classguid, property, propertyregdatatype, propertybuffer, propertybuffersize, requiredsize, machinename, reserved) : -1;
#else
    (void)classguid;
    (void)property;
    (void)propertyregdatatype;
    (void)propertybuffer;
    (void)propertybuffersize;
    (void)requiredsize;
    (void)machinename;
    (void)reserved;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassRegistryPropertyW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* classguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t property = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* propertyregdatatype = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* propertybuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t propertybuffersize = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* requiredsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* machinename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* reserved = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupDiGetClassRegistryPropertyW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(classguid, property, propertyregdatatype, propertybuffer, propertybuffersize, requiredsize, machinename, reserved) : -1;
#else
    (void)classguid;
    (void)property;
    (void)propertyregdatatype;
    (void)propertybuffer;
    (void)propertybuffersize;
    (void)requiredsize;
    (void)machinename;
    (void)reserved;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetCustomDevicePropertyA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t deviceinfoset = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* deviceinfodata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* custompropertyname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* propertyregdatatype = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* propertybuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    uint32_t propertybuffersize = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    void* requiredsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupDiGetCustomDevicePropertyA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(deviceinfoset, deviceinfodata, custompropertyname, flags, propertyregdatatype, propertybuffer, propertybuffersize, requiredsize) : -1;
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    (void)custompropertyname;
    (void)flags;
    (void)propertyregdatatype;
    (void)propertybuffer;
    (void)propertybuffersize;
    (void)requiredsize;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetCustomDevicePropertyW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t deviceinfoset = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* deviceinfodata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* custompropertyname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* propertyregdatatype = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* propertybuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    uint32_t propertybuffersize = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    void* requiredsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupDiGetCustomDevicePropertyW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(deviceinfoset, deviceinfodata, custompropertyname, flags, propertyregdatatype, propertybuffer, propertybuffersize, requiredsize) : -1;
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    (void)custompropertyname;
    (void)flags;
    (void)propertyregdatatype;
    (void)propertybuffer;
    (void)propertybuffersize;
    (void)requiredsize;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetDeviceInfoListClass_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t deviceinfoset = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* classguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupDiGetDeviceInfoListClass")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(deviceinfoset, classguid) : -1;
#else
    (void)deviceinfoset;
    (void)classguid;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetDeviceInfoListDetailA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t deviceinfoset = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* deviceinfosetdetaildata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupDiGetDeviceInfoListDetailA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(deviceinfoset, deviceinfosetdetaildata) : -1;
#else
    (void)deviceinfoset;
    (void)deviceinfosetdetaildata;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetDeviceInfoListDetailW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t deviceinfoset = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* deviceinfosetdetaildata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupDiGetDeviceInfoListDetailW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(deviceinfoset, deviceinfosetdetaildata) : -1;
#else
    (void)deviceinfoset;
    (void)deviceinfosetdetaildata;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetDeviceInstallParamsA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t deviceinfoset = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* deviceinfodata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* deviceinstallparams = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupDiGetDeviceInstallParamsA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(deviceinfoset, deviceinfodata, deviceinstallparams) : -1;
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    (void)deviceinstallparams;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetDeviceInstallParamsW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t deviceinfoset = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* deviceinfodata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* deviceinstallparams = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupDiGetDeviceInstallParamsW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(deviceinfoset, deviceinfodata, deviceinstallparams) : -1;
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    (void)deviceinstallparams;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetDeviceInstanceIdA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t deviceinfoset = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* deviceinfodata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* deviceinstanceid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t deviceinstanceidsize = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* requiredsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupDiGetDeviceInstanceIdA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(deviceinfoset, deviceinfodata, deviceinstanceid, deviceinstanceidsize, requiredsize) : -1;
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    (void)deviceinstanceid;
    (void)deviceinstanceidsize;
    (void)requiredsize;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetDeviceInstanceIdW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t deviceinfoset = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* deviceinfodata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* deviceinstanceid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t deviceinstanceidsize = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* requiredsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupDiGetDeviceInstanceIdW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(deviceinfoset, deviceinfodata, deviceinstanceid, deviceinstanceidsize, requiredsize) : -1;
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    (void)deviceinstanceid;
    (void)deviceinstanceidsize;
    (void)requiredsize;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetDeviceInterfaceAlias_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t deviceinfoset = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* deviceinterfacedata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* aliasinterfaceclassguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* aliasdeviceinterfacedata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupDiGetDeviceInterfaceAlias")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(deviceinfoset, deviceinterfacedata, aliasinterfaceclassguid, aliasdeviceinterfacedata) : -1;
#else
    (void)deviceinfoset;
    (void)deviceinterfacedata;
    (void)aliasinterfaceclassguid;
    (void)aliasdeviceinterfacedata;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetDeviceInterfaceDetailA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t deviceinfoset = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* deviceinterfacedata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* deviceinterfacedetaildata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t deviceinterfacedetaildatasize = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* requiredsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* deviceinfodata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupDiGetDeviceInterfaceDetailA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(deviceinfoset, deviceinterfacedata, deviceinterfacedetaildata, deviceinterfacedetaildatasize, requiredsize, deviceinfodata) : -1;
#else
    (void)deviceinfoset;
    (void)deviceinterfacedata;
    (void)deviceinterfacedetaildata;
    (void)deviceinterfacedetaildatasize;
    (void)requiredsize;
    (void)deviceinfodata;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetDeviceInterfaceDetailW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t deviceinfoset = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* deviceinterfacedata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* deviceinterfacedetaildata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t deviceinterfacedetaildatasize = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* requiredsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* deviceinfodata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupDiGetDeviceInterfaceDetailW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(deviceinfoset, deviceinterfacedata, deviceinterfacedetaildata, deviceinterfacedetaildatasize, requiredsize, deviceinfodata) : -1;
#else
    (void)deviceinfoset;
    (void)deviceinterfacedata;
    (void)deviceinterfacedetaildata;
    (void)deviceinterfacedetaildatasize;
    (void)requiredsize;
    (void)deviceinfodata;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetDeviceInterfacePropertyKeys_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t deviceinfoset = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* deviceinterfacedata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* propertykeyarray = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t propertykeycount = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* requiredpropertykeycount = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupDiGetDeviceInterfacePropertyKeys")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(deviceinfoset, deviceinterfacedata, propertykeyarray, propertykeycount, requiredpropertykeycount, flags) : -1;
#else
    (void)deviceinfoset;
    (void)deviceinterfacedata;
    (void)propertykeyarray;
    (void)propertykeycount;
    (void)requiredpropertykeycount;
    (void)flags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetDeviceInterfacePropertyW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t deviceinfoset = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* deviceinterfacedata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* propertykey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* propertytype = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* propertybuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t propertybuffersize = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* requiredsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 7 ? km_info[7].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupDiGetDeviceInterfacePropertyW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(deviceinfoset, deviceinterfacedata, propertykey, propertytype, propertybuffer, propertybuffersize, requiredsize, flags) : -1;
#else
    (void)deviceinfoset;
    (void)deviceinterfacedata;
    (void)propertykey;
    (void)propertytype;
    (void)propertybuffer;
    (void)propertybuffersize;
    (void)requiredsize;
    (void)flags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetDevicePropertyKeys_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t deviceinfoset = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* deviceinfodata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* propertykeyarray = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t propertykeycount = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* requiredpropertykeycount = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupDiGetDevicePropertyKeys")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(deviceinfoset, deviceinfodata, propertykeyarray, propertykeycount, requiredpropertykeycount, flags) : -1;
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    (void)propertykeyarray;
    (void)propertykeycount;
    (void)requiredpropertykeycount;
    (void)flags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetDevicePropertyW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t deviceinfoset = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* deviceinfodata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* propertykey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* propertytype = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* propertybuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t propertybuffersize = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* requiredsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 7 ? km_info[7].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupDiGetDevicePropertyW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(deviceinfoset, deviceinfodata, propertykey, propertytype, propertybuffer, propertybuffersize, requiredsize, flags) : -1;
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    (void)propertykey;
    (void)propertytype;
    (void)propertybuffer;
    (void)propertybuffersize;
    (void)requiredsize;
    (void)flags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetDeviceRegistryPropertyA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t deviceinfoset = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* deviceinfodata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t property = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* propertyregdatatype = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* propertybuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t propertybuffersize = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* requiredsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupDiGetDeviceRegistryPropertyA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(deviceinfoset, deviceinfodata, property, propertyregdatatype, propertybuffer, propertybuffersize, requiredsize) : -1;
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    (void)property;
    (void)propertyregdatatype;
    (void)propertybuffer;
    (void)propertybuffersize;
    (void)requiredsize;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetDeviceRegistryPropertyW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t deviceinfoset = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* deviceinfodata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t property = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* propertyregdatatype = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* propertybuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t propertybuffersize = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* requiredsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupDiGetDeviceRegistryPropertyW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(deviceinfoset, deviceinfodata, property, propertyregdatatype, propertybuffer, propertybuffersize, requiredsize) : -1;
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    (void)property;
    (void)propertyregdatatype;
    (void)propertybuffer;
    (void)propertybuffersize;
    (void)requiredsize;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetDriverInfoDetailA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t deviceinfoset = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* deviceinfodata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* driverinfodata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* driverinfodetaildata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t driverinfodetaildatasize = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* requiredsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupDiGetDriverInfoDetailA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(deviceinfoset, deviceinfodata, driverinfodata, driverinfodetaildata, driverinfodetaildatasize, requiredsize) : -1;
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    (void)driverinfodata;
    (void)driverinfodetaildata;
    (void)driverinfodetaildatasize;
    (void)requiredsize;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetDriverInfoDetailW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t deviceinfoset = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* deviceinfodata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* driverinfodata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* driverinfodetaildata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t driverinfodetaildatasize = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* requiredsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupDiGetDriverInfoDetailW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(deviceinfoset, deviceinfodata, driverinfodata, driverinfodetaildata, driverinfodetaildatasize, requiredsize) : -1;
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    (void)driverinfodata;
    (void)driverinfodetaildata;
    (void)driverinfodetaildatasize;
    (void)requiredsize;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetDriverInstallParamsA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t deviceinfoset = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* deviceinfodata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* driverinfodata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* driverinstallparams = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupDiGetDriverInstallParamsA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(deviceinfoset, deviceinfodata, driverinfodata, driverinstallparams) : -1;
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    (void)driverinfodata;
    (void)driverinstallparams;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetDriverInstallParamsW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t deviceinfoset = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* deviceinfodata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* driverinfodata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* driverinstallparams = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupDiGetDriverInstallParamsW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(deviceinfoset, deviceinfodata, driverinfodata, driverinstallparams) : -1;
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    (void)driverinfodata;
    (void)driverinstallparams;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetHwProfileFriendlyNameA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t hwprofile = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* friendlyname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t friendlynamesize = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* requiredsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupDiGetHwProfileFriendlyNameA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hwprofile, friendlyname, friendlynamesize, requiredsize) : -1;
#else
    (void)hwprofile;
    (void)friendlyname;
    (void)friendlynamesize;
    (void)requiredsize;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetHwProfileFriendlyNameExA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t hwprofile = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* friendlyname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t friendlynamesize = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* requiredsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* machinename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* reserved = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupDiGetHwProfileFriendlyNameExA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hwprofile, friendlyname, friendlynamesize, requiredsize, machinename, reserved) : -1;
#else
    (void)hwprofile;
    (void)friendlyname;
    (void)friendlynamesize;
    (void)requiredsize;
    (void)machinename;
    (void)reserved;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetHwProfileFriendlyNameExW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t hwprofile = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* friendlyname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t friendlynamesize = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* requiredsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* machinename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* reserved = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupDiGetHwProfileFriendlyNameExW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hwprofile, friendlyname, friendlynamesize, requiredsize, machinename, reserved) : -1;
#else
    (void)hwprofile;
    (void)friendlyname;
    (void)friendlynamesize;
    (void)requiredsize;
    (void)machinename;
    (void)reserved;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetHwProfileFriendlyNameW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t hwprofile = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* friendlyname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t friendlynamesize = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* requiredsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupDiGetHwProfileFriendlyNameW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hwprofile, friendlyname, friendlynamesize, requiredsize) : -1;
#else
    (void)hwprofile;
    (void)friendlyname;
    (void)friendlynamesize;
    (void)requiredsize;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetHwProfileList_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hwprofilelist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t hwprofilelistsize = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* requiredsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* currentlyactiveindex = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupDiGetHwProfileList")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hwprofilelist, hwprofilelistsize, requiredsize, currentlyactiveindex) : -1;
#else
    (void)hwprofilelist;
    (void)hwprofilelistsize;
    (void)requiredsize;
    (void)currentlyactiveindex;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetHwProfileListExA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hwprofilelist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t hwprofilelistsize = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* requiredsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* currentlyactiveindex = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* machinename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* reserved = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupDiGetHwProfileListExA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hwprofilelist, hwprofilelistsize, requiredsize, currentlyactiveindex, machinename, reserved) : -1;
#else
    (void)hwprofilelist;
    (void)hwprofilelistsize;
    (void)requiredsize;
    (void)currentlyactiveindex;
    (void)machinename;
    (void)reserved;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetHwProfileListExW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hwprofilelist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t hwprofilelistsize = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* requiredsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* currentlyactiveindex = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* machinename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* reserved = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupDiGetHwProfileListExW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hwprofilelist, hwprofilelistsize, requiredsize, currentlyactiveindex, machinename, reserved) : -1;
#else
    (void)hwprofilelist;
    (void)hwprofilelistsize;
    (void)requiredsize;
    (void)currentlyactiveindex;
    (void)machinename;
    (void)reserved;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetINFClassA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* infname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* classguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* classname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t classnamesize = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* requiredsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupDiGetINFClassA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(infname, classguid, classname, classnamesize, requiredsize) : -1;
#else
    (void)infname;
    (void)classguid;
    (void)classname;
    (void)classnamesize;
    (void)requiredsize;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetINFClassW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* infname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* classguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* classname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t classnamesize = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* requiredsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupDiGetINFClassW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(infname, classguid, classname, classnamesize, requiredsize) : -1;
#else
    (void)infname;
    (void)classguid;
    (void)classname;
    (void)classnamesize;
    (void)requiredsize;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetSelectedDevice_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t deviceinfoset = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* deviceinfodata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupDiGetSelectedDevice")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(deviceinfoset, deviceinfodata) : -1;
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetSelectedDriverA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t deviceinfoset = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* deviceinfodata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* driverinfodata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupDiGetSelectedDriverA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(deviceinfoset, deviceinfodata, driverinfodata) : -1;
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    (void)driverinfodata;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetSelectedDriverW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t deviceinfoset = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* deviceinfodata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* driverinfodata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupDiGetSelectedDriverW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(deviceinfoset, deviceinfodata, driverinfodata) : -1;
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    (void)driverinfodata;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetWizardPage_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t deviceinfoset = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* deviceinfodata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* installwizarddata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t pagetype = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupDiGetWizardPage")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(deviceinfoset, deviceinfodata, installwizarddata, pagetype, flags) : NULL;
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    (void)installwizarddata;
    (void)pagetype;
    (void)flags;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiInstallClassA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hwndparent = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* inffilename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* filequeue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupDiInstallClassA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hwndparent, inffilename, flags, filequeue) : -1;
#else
    (void)hwndparent;
    (void)inffilename;
    (void)flags;
    (void)filequeue;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiInstallClassExA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hwndparent = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* inffilename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* filequeue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* interfaceclassguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* reserved1 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* reserved2 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupDiInstallClassExA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hwndparent, inffilename, flags, filequeue, interfaceclassguid, reserved1, reserved2) : -1;
#else
    (void)hwndparent;
    (void)inffilename;
    (void)flags;
    (void)filequeue;
    (void)interfaceclassguid;
    (void)reserved1;
    (void)reserved2;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiInstallClassExW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hwndparent = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* inffilename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* filequeue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* interfaceclassguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* reserved1 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* reserved2 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupDiInstallClassExW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hwndparent, inffilename, flags, filequeue, interfaceclassguid, reserved1, reserved2) : -1;
#else
    (void)hwndparent;
    (void)inffilename;
    (void)flags;
    (void)filequeue;
    (void)interfaceclassguid;
    (void)reserved1;
    (void)reserved2;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiInstallClassW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hwndparent = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* inffilename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* filequeue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupDiInstallClassW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hwndparent, inffilename, flags, filequeue) : -1;
#else
    (void)hwndparent;
    (void)inffilename;
    (void)flags;
    (void)filequeue;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiInstallDevice_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t deviceinfoset = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* deviceinfodata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupDiInstallDevice")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(deviceinfoset, deviceinfodata) : -1;
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiInstallDeviceInterfaces_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t deviceinfoset = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* deviceinfodata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupDiInstallDeviceInterfaces")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(deviceinfoset, deviceinfodata) : -1;
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiInstallDriverFiles_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t deviceinfoset = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* deviceinfodata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupDiInstallDriverFiles")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(deviceinfoset, deviceinfodata) : -1;
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiLoadClassIcon_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* classguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* largeicon = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* miniiconindex = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupDiLoadClassIcon")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(classguid, largeicon, miniiconindex) : -1;
#else
    (void)classguid;
    (void)largeicon;
    (void)miniiconindex;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiLoadDeviceIcon_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t deviceinfoset = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* deviceinfodata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t cxicon = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t cyicon = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* hicon = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupDiLoadDeviceIcon")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(deviceinfoset, deviceinfodata, cxicon, cyicon, flags, hicon) : -1;
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    (void)cxicon;
    (void)cyicon;
    (void)flags;
    (void)hicon;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiOpenClassRegKey_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* classguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t samdesired = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupDiOpenClassRegKey")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(classguid, samdesired) : NULL;
#else
    (void)classguid;
    (void)samdesired;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiOpenClassRegKeyExA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* classguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t samdesired = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* machinename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* reserved = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupDiOpenClassRegKeyExA")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(classguid, samdesired, flags, machinename, reserved) : NULL;
#else
    (void)classguid;
    (void)samdesired;
    (void)flags;
    (void)machinename;
    (void)reserved;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiOpenClassRegKeyExW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* classguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t samdesired = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* machinename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* reserved = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupDiOpenClassRegKeyExW")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(classguid, samdesired, flags, machinename, reserved) : NULL;
#else
    (void)classguid;
    (void)samdesired;
    (void)flags;
    (void)machinename;
    (void)reserved;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiOpenDevRegKey_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t deviceinfoset = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* deviceinfodata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t scope = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t hwprofile = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t keytype = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    uint32_t samdesired = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t, void*, uint32_t, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupDiOpenDevRegKey")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(deviceinfoset, deviceinfodata, scope, hwprofile, keytype, samdesired) : NULL;
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    (void)scope;
    (void)hwprofile;
    (void)keytype;
    (void)samdesired;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiOpenDeviceInfoA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t deviceinfoset = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* deviceinstanceid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* hwndparent = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t openflags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* deviceinfodata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupDiOpenDeviceInfoA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(deviceinfoset, deviceinstanceid, hwndparent, openflags, deviceinfodata) : -1;
#else
    (void)deviceinfoset;
    (void)deviceinstanceid;
    (void)hwndparent;
    (void)openflags;
    (void)deviceinfodata;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiOpenDeviceInfoW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t deviceinfoset = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* deviceinstanceid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* hwndparent = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t openflags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* deviceinfodata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupDiOpenDeviceInfoW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(deviceinfoset, deviceinstanceid, hwndparent, openflags, deviceinfodata) : -1;
#else
    (void)deviceinfoset;
    (void)deviceinstanceid;
    (void)hwndparent;
    (void)openflags;
    (void)deviceinfodata;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiOpenDeviceInterfaceA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t deviceinfoset = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* devicepath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t openflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* deviceinterfacedata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupDiOpenDeviceInterfaceA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(deviceinfoset, devicepath, openflags, deviceinterfacedata) : -1;
#else
    (void)deviceinfoset;
    (void)devicepath;
    (void)openflags;
    (void)deviceinterfacedata;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiOpenDeviceInterfaceRegKey_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t deviceinfoset = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* deviceinterfacedata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t reserved = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t samdesired = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupDiOpenDeviceInterfaceRegKey")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(deviceinfoset, deviceinterfacedata, reserved, samdesired) : NULL;
#else
    (void)deviceinfoset;
    (void)deviceinterfacedata;
    (void)reserved;
    (void)samdesired;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiOpenDeviceInterfaceW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t deviceinfoset = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* devicepath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t openflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* deviceinterfacedata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupDiOpenDeviceInterfaceW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(deviceinfoset, devicepath, openflags, deviceinterfacedata) : -1;
#else
    (void)deviceinfoset;
    (void)devicepath;
    (void)openflags;
    (void)deviceinterfacedata;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiRegisterCoDeviceInstallers_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t deviceinfoset = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* deviceinfodata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupDiRegisterCoDeviceInstallers")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(deviceinfoset, deviceinfodata) : -1;
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiRegisterDeviceInfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t deviceinfoset = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* deviceinfodata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* compareproc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* comparecontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* dupdeviceinfodata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupDiRegisterDeviceInfo")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(deviceinfoset, deviceinfodata, flags, compareproc, comparecontext, dupdeviceinfodata) : -1;
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    (void)flags;
    (void)compareproc;
    (void)comparecontext;
    (void)dupdeviceinfodata;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiRemoveDevice_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t deviceinfoset = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* deviceinfodata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupDiRemoveDevice")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(deviceinfoset, deviceinfodata) : -1;
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiRemoveDeviceInterface_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t deviceinfoset = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* deviceinterfacedata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupDiRemoveDeviceInterface")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(deviceinfoset, deviceinterfacedata) : -1;
#else
    (void)deviceinfoset;
    (void)deviceinterfacedata;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiRestartDevices_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t deviceinfoset = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* deviceinfodata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupDiRestartDevices")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(deviceinfoset, deviceinfodata) : -1;
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiSelectBestCompatDrv_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t deviceinfoset = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* deviceinfodata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupDiSelectBestCompatDrv")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(deviceinfoset, deviceinfodata) : -1;
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiSelectDevice_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t deviceinfoset = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* deviceinfodata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupDiSelectDevice")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(deviceinfoset, deviceinfodata) : -1;
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiSelectOEMDrv_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hwndparent = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int64_t deviceinfoset = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
    void* deviceinfodata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupDiSelectOEMDrv")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hwndparent, deviceinfoset, deviceinfodata) : -1;
#else
    (void)hwndparent;
    (void)deviceinfoset;
    (void)deviceinfodata;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiSetClassInstallParamsA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t deviceinfoset = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* deviceinfodata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* classinstallparams = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t classinstallparamssize = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupDiSetClassInstallParamsA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(deviceinfoset, deviceinfodata, classinstallparams, classinstallparamssize) : -1;
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    (void)classinstallparams;
    (void)classinstallparamssize;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiSetClassInstallParamsW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t deviceinfoset = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* deviceinfodata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* classinstallparams = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t classinstallparamssize = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupDiSetClassInstallParamsW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(deviceinfoset, deviceinfodata, classinstallparams, classinstallparamssize) : -1;
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    (void)classinstallparams;
    (void)classinstallparamssize;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiSetClassPropertyExW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* classguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* propertykey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t propertytype = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* propertybuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t propertybuffersize = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* machinename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* reserved = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupDiSetClassPropertyExW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(classguid, propertykey, propertytype, propertybuffer, propertybuffersize, flags, machinename, reserved) : -1;
#else
    (void)classguid;
    (void)propertykey;
    (void)propertytype;
    (void)propertybuffer;
    (void)propertybuffersize;
    (void)flags;
    (void)machinename;
    (void)reserved;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiSetClassPropertyW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* classguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* propertykey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t propertytype = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* propertybuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t propertybuffersize = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupDiSetClassPropertyW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(classguid, propertykey, propertytype, propertybuffer, propertybuffersize, flags) : -1;
#else
    (void)classguid;
    (void)propertykey;
    (void)propertytype;
    (void)propertybuffer;
    (void)propertybuffersize;
    (void)flags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiSetClassRegistryPropertyA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* classguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t property = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* propertybuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t propertybuffersize = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* machinename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* reserved = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupDiSetClassRegistryPropertyA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(classguid, property, propertybuffer, propertybuffersize, machinename, reserved) : -1;
#else
    (void)classguid;
    (void)property;
    (void)propertybuffer;
    (void)propertybuffersize;
    (void)machinename;
    (void)reserved;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiSetClassRegistryPropertyW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* classguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t property = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* propertybuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t propertybuffersize = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* machinename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* reserved = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupDiSetClassRegistryPropertyW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(classguid, property, propertybuffer, propertybuffersize, machinename, reserved) : -1;
#else
    (void)classguid;
    (void)property;
    (void)propertybuffer;
    (void)propertybuffersize;
    (void)machinename;
    (void)reserved;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiSetDeviceInstallParamsA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t deviceinfoset = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* deviceinfodata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* deviceinstallparams = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupDiSetDeviceInstallParamsA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(deviceinfoset, deviceinfodata, deviceinstallparams) : -1;
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    (void)deviceinstallparams;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiSetDeviceInstallParamsW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t deviceinfoset = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* deviceinfodata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* deviceinstallparams = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupDiSetDeviceInstallParamsW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(deviceinfoset, deviceinfodata, deviceinstallparams) : -1;
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    (void)deviceinstallparams;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiSetDeviceInterfaceDefault_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t deviceinfoset = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* deviceinterfacedata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* reserved = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupDiSetDeviceInterfaceDefault")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(deviceinfoset, deviceinterfacedata, flags, reserved) : -1;
#else
    (void)deviceinfoset;
    (void)deviceinterfacedata;
    (void)flags;
    (void)reserved;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiSetDeviceInterfacePropertyW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t deviceinfoset = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* deviceinterfacedata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* propertykey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t propertytype = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* propertybuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t propertybuffersize = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupDiSetDeviceInterfacePropertyW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(deviceinfoset, deviceinterfacedata, propertykey, propertytype, propertybuffer, propertybuffersize, flags) : -1;
#else
    (void)deviceinfoset;
    (void)deviceinterfacedata;
    (void)propertykey;
    (void)propertytype;
    (void)propertybuffer;
    (void)propertybuffersize;
    (void)flags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiSetDevicePropertyW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t deviceinfoset = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* deviceinfodata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* propertykey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t propertytype = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* propertybuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t propertybuffersize = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupDiSetDevicePropertyW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(deviceinfoset, deviceinfodata, propertykey, propertytype, propertybuffer, propertybuffersize, flags) : -1;
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    (void)propertykey;
    (void)propertytype;
    (void)propertybuffer;
    (void)propertybuffersize;
    (void)flags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiSetDeviceRegistryPropertyA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t deviceinfoset = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* deviceinfodata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t property = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* propertybuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t propertybuffersize = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupDiSetDeviceRegistryPropertyA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(deviceinfoset, deviceinfodata, property, propertybuffer, propertybuffersize) : -1;
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    (void)property;
    (void)propertybuffer;
    (void)propertybuffersize;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiSetDeviceRegistryPropertyW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t deviceinfoset = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* deviceinfodata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t property = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* propertybuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t propertybuffersize = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupDiSetDeviceRegistryPropertyW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(deviceinfoset, deviceinfodata, property, propertybuffer, propertybuffersize) : -1;
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    (void)property;
    (void)propertybuffer;
    (void)propertybuffersize;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiSetDriverInstallParamsA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t deviceinfoset = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* deviceinfodata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* driverinfodata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* driverinstallparams = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupDiSetDriverInstallParamsA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(deviceinfoset, deviceinfodata, driverinfodata, driverinstallparams) : -1;
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    (void)driverinfodata;
    (void)driverinstallparams;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiSetDriverInstallParamsW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t deviceinfoset = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* deviceinfodata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* driverinfodata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* driverinstallparams = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupDiSetDriverInstallParamsW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(deviceinfoset, deviceinfodata, driverinfodata, driverinstallparams) : -1;
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    (void)driverinfodata;
    (void)driverinstallparams;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiSetSelectedDevice_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t deviceinfoset = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* deviceinfodata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupDiSetSelectedDevice")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(deviceinfoset, deviceinfodata) : -1;
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiSetSelectedDriverA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t deviceinfoset = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* deviceinfodata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* driverinfodata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupDiSetSelectedDriverA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(deviceinfoset, deviceinfodata, driverinfodata) : -1;
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    (void)driverinfodata;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiSetSelectedDriverW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t deviceinfoset = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* deviceinfodata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* driverinfodata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupDiSetSelectedDriverW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(deviceinfoset, deviceinfodata, driverinfodata) : -1;
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    (void)driverinfodata;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiUnremoveDevice_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t deviceinfoset = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* deviceinfodata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupDiUnremoveDevice")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(deviceinfoset, deviceinfodata) : -1;
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDuplicateDiskSpaceListA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* diskspace = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* reserved1 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t reserved2 = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupDuplicateDiskSpaceListA")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(diskspace, reserved1, reserved2, flags) : NULL;
#else
    (void)diskspace;
    (void)reserved1;
    (void)reserved2;
    (void)flags;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDuplicateDiskSpaceListW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* diskspace = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* reserved1 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t reserved2 = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupDuplicateDiskSpaceListW")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(diskspace, reserved1, reserved2, flags) : NULL;
#else
    (void)diskspace;
    (void)reserved1;
    (void)reserved2;
    (void)flags;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupEnumInfSectionsA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* infhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t arg_1_index = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t size = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* sizeneeded = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupEnumInfSectionsA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(infhandle, arg_1_index, buffer, size, sizeneeded) : -1;
#else
    (void)infhandle;
    (void)arg_1_index;
    (void)buffer;
    (void)size;
    (void)sizeneeded;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupEnumInfSectionsW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* infhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t arg_1_index = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t size = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* sizeneeded = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupEnumInfSectionsW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(infhandle, arg_1_index, buffer, size, sizeneeded) : -1;
#else
    (void)infhandle;
    (void)arg_1_index;
    (void)buffer;
    (void)size;
    (void)sizeneeded;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupFindFirstLineA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* infhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* section = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* key = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* context = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupFindFirstLineA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(infhandle, section, key, context) : -1;
#else
    (void)infhandle;
    (void)section;
    (void)key;
    (void)context;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupFindFirstLineW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* infhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* section = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* key = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* context = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupFindFirstLineW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(infhandle, section, key, context) : -1;
#else
    (void)infhandle;
    (void)section;
    (void)key;
    (void)context;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupFindNextLine_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* contextin = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* contextout = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupFindNextLine")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(contextin, contextout) : -1;
#else
    (void)contextin;
    (void)contextout;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupFindNextMatchLineA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* contextin = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* key = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* contextout = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupFindNextMatchLineA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(contextin, key, contextout) : -1;
#else
    (void)contextin;
    (void)key;
    (void)contextout;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupFindNextMatchLineW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* contextin = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* key = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* contextout = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupFindNextMatchLineW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(contextin, key, contextout) : -1;
#else
    (void)contextin;
    (void)key;
    (void)contextout;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupFreeSourceListA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* list = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t count = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupFreeSourceListA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(list, count) : -1;
#else
    (void)list;
    (void)count;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupFreeSourceListW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* list = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t count = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupFreeSourceListW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(list, count) : -1;
#else
    (void)list;
    (void)count;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetBackupInformationA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* queuehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* backupparams = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupGetBackupInformationA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(queuehandle, backupparams) : -1;
#else
    (void)queuehandle;
    (void)backupparams;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetBackupInformationW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* queuehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* backupparams = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupGetBackupInformationW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(queuehandle, backupparams) : -1;
#else
    (void)queuehandle;
    (void)backupparams;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetBinaryField_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* context = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t fieldindex = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* returnbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t returnbuffersize = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* requiredsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupGetBinaryField")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(context, fieldindex, returnbuffer, returnbuffersize, requiredsize) : -1;
#else
    (void)context;
    (void)fieldindex;
    (void)returnbuffer;
    (void)returnbuffersize;
    (void)requiredsize;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetFieldCount_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* context = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupGetFieldCount")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(context) : 0;
#else
    (void)context;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetFileCompressionInfoA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* sourcefilename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* actualsourcefilename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* sourcefilesize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* targetfilesize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* compressiontype = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupGetFileCompressionInfoA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sourcefilename, actualsourcefilename, sourcefilesize, targetfilesize, compressiontype) : 0;
#else
    (void)sourcefilename;
    (void)actualsourcefilename;
    (void)sourcefilesize;
    (void)targetfilesize;
    (void)compressiontype;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetFileCompressionInfoExA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* sourcefilename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* actualsourcefilenamebuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t actualsourcefilenamebufferlen = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* requiredbufferlen = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* sourcefilesize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* targetfilesize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* compressiontype = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupGetFileCompressionInfoExA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sourcefilename, actualsourcefilenamebuffer, actualsourcefilenamebufferlen, requiredbufferlen, sourcefilesize, targetfilesize, compressiontype) : -1;
#else
    (void)sourcefilename;
    (void)actualsourcefilenamebuffer;
    (void)actualsourcefilenamebufferlen;
    (void)requiredbufferlen;
    (void)sourcefilesize;
    (void)targetfilesize;
    (void)compressiontype;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetFileCompressionInfoExW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* sourcefilename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* actualsourcefilenamebuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t actualsourcefilenamebufferlen = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* requiredbufferlen = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* sourcefilesize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* targetfilesize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* compressiontype = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupGetFileCompressionInfoExW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sourcefilename, actualsourcefilenamebuffer, actualsourcefilenamebufferlen, requiredbufferlen, sourcefilesize, targetfilesize, compressiontype) : -1;
#else
    (void)sourcefilename;
    (void)actualsourcefilenamebuffer;
    (void)actualsourcefilenamebufferlen;
    (void)requiredbufferlen;
    (void)sourcefilesize;
    (void)targetfilesize;
    (void)compressiontype;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetFileCompressionInfoW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* sourcefilename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* actualsourcefilename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* sourcefilesize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* targetfilesize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* compressiontype = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupGetFileCompressionInfoW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sourcefilename, actualsourcefilename, sourcefilesize, targetfilesize, compressiontype) : 0;
#else
    (void)sourcefilename;
    (void)actualsourcefilename;
    (void)sourcefilesize;
    (void)targetfilesize;
    (void)compressiontype;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetFileQueueCount_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* filequeue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t subqueuefileop = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* numoperations = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupGetFileQueueCount")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(filequeue, subqueuefileop, numoperations) : -1;
#else
    (void)filequeue;
    (void)subqueuefileop;
    (void)numoperations;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetFileQueueFlags_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* filequeue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* flags = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupGetFileQueueFlags")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(filequeue, flags) : -1;
#else
    (void)filequeue;
    (void)flags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetInfDriverStoreLocationA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* filename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* alternateplatforminfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* localename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* returnbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t returnbuffersize = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* requiredsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupGetInfDriverStoreLocationA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(filename, alternateplatforminfo, localename, returnbuffer, returnbuffersize, requiredsize) : -1;
#else
    (void)filename;
    (void)alternateplatforminfo;
    (void)localename;
    (void)returnbuffer;
    (void)returnbuffersize;
    (void)requiredsize;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetInfDriverStoreLocationW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* filename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* alternateplatforminfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* localename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* returnbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t returnbuffersize = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* requiredsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupGetInfDriverStoreLocationW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(filename, alternateplatforminfo, localename, returnbuffer, returnbuffersize, requiredsize) : -1;
#else
    (void)filename;
    (void)alternateplatforminfo;
    (void)localename;
    (void)returnbuffer;
    (void)returnbuffersize;
    (void)requiredsize;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetInfFileListA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* directorypath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t infstyle = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* returnbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t returnbuffersize = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* requiredsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupGetInfFileListA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(directorypath, infstyle, returnbuffer, returnbuffersize, requiredsize) : -1;
#else
    (void)directorypath;
    (void)infstyle;
    (void)returnbuffer;
    (void)returnbuffersize;
    (void)requiredsize;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetInfFileListW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* directorypath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t infstyle = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* returnbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t returnbuffersize = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* requiredsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupGetInfFileListW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(directorypath, infstyle, returnbuffer, returnbuffersize, requiredsize) : -1;
#else
    (void)directorypath;
    (void)infstyle;
    (void)returnbuffer;
    (void)returnbuffersize;
    (void)requiredsize;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetInfInformationA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* infspec = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t searchcontrol = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* returnbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t returnbuffersize = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* requiredsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupGetInfInformationA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(infspec, searchcontrol, returnbuffer, returnbuffersize, requiredsize) : -1;
#else
    (void)infspec;
    (void)searchcontrol;
    (void)returnbuffer;
    (void)returnbuffersize;
    (void)requiredsize;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetInfInformationW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* infspec = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t searchcontrol = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* returnbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t returnbuffersize = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* requiredsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupGetInfInformationW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(infspec, searchcontrol, returnbuffer, returnbuffersize, requiredsize) : -1;
#else
    (void)infspec;
    (void)searchcontrol;
    (void)returnbuffer;
    (void)returnbuffersize;
    (void)requiredsize;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetInfPublishedNameA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* driverstorelocation = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* returnbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t returnbuffersize = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* requiredsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupGetInfPublishedNameA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(driverstorelocation, returnbuffer, returnbuffersize, requiredsize) : -1;
#else
    (void)driverstorelocation;
    (void)returnbuffer;
    (void)returnbuffersize;
    (void)requiredsize;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetInfPublishedNameW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* driverstorelocation = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* returnbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t returnbuffersize = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* requiredsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupGetInfPublishedNameW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(driverstorelocation, returnbuffer, returnbuffersize, requiredsize) : -1;
#else
    (void)driverstorelocation;
    (void)returnbuffer;
    (void)returnbuffersize;
    (void)requiredsize;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetIntField_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* context = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t fieldindex = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* integervalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupGetIntField")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(context, fieldindex, integervalue) : -1;
#else
    (void)context;
    (void)fieldindex;
    (void)integervalue;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetLineByIndexA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* infhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* section = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t arg_2_index = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* context = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupGetLineByIndexA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(infhandle, section, arg_2_index, context) : -1;
#else
    (void)infhandle;
    (void)section;
    (void)arg_2_index;
    (void)context;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetLineByIndexW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* infhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* section = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t arg_2_index = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* context = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupGetLineByIndexW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(infhandle, section, arg_2_index, context) : -1;
#else
    (void)infhandle;
    (void)section;
    (void)arg_2_index;
    (void)context;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetLineCountA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* infhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* section = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupGetLineCountA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(infhandle, section) : -1;
#else
    (void)infhandle;
    (void)section;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetLineCountW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* infhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* section = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupGetLineCountW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(infhandle, section) : -1;
#else
    (void)infhandle;
    (void)section;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetLineTextA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* context = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* infhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* section = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* key = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* returnbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t returnbuffersize = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* requiredsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupGetLineTextA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(context, infhandle, section, key, returnbuffer, returnbuffersize, requiredsize) : -1;
#else
    (void)context;
    (void)infhandle;
    (void)section;
    (void)key;
    (void)returnbuffer;
    (void)returnbuffersize;
    (void)requiredsize;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetLineTextW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* context = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* infhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* section = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* key = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* returnbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t returnbuffersize = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* requiredsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupGetLineTextW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(context, infhandle, section, key, returnbuffer, returnbuffersize, requiredsize) : -1;
#else
    (void)context;
    (void)infhandle;
    (void)section;
    (void)key;
    (void)returnbuffer;
    (void)returnbuffersize;
    (void)requiredsize;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetMultiSzFieldA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* context = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t fieldindex = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* returnbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t returnbuffersize = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* requiredsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupGetMultiSzFieldA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(context, fieldindex, returnbuffer, returnbuffersize, requiredsize) : -1;
#else
    (void)context;
    (void)fieldindex;
    (void)returnbuffer;
    (void)returnbuffersize;
    (void)requiredsize;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetMultiSzFieldW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* context = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t fieldindex = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* returnbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t returnbuffersize = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* requiredsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupGetMultiSzFieldW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(context, fieldindex, returnbuffer, returnbuffersize, requiredsize) : -1;
#else
    (void)context;
    (void)fieldindex;
    (void)returnbuffer;
    (void)returnbuffersize;
    (void)requiredsize;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetNonInteractiveMode_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupGetNonInteractiveMode")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetSourceFileLocationA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* infhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* infcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* filename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* sourceid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* returnbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t returnbuffersize = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* requiredsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupGetSourceFileLocationA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(infhandle, infcontext, filename, sourceid, returnbuffer, returnbuffersize, requiredsize) : -1;
#else
    (void)infhandle;
    (void)infcontext;
    (void)filename;
    (void)sourceid;
    (void)returnbuffer;
    (void)returnbuffersize;
    (void)requiredsize;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetSourceFileLocationW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* infhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* infcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* filename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* sourceid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* returnbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t returnbuffersize = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* requiredsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupGetSourceFileLocationW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(infhandle, infcontext, filename, sourceid, returnbuffer, returnbuffersize, requiredsize) : -1;
#else
    (void)infhandle;
    (void)infcontext;
    (void)filename;
    (void)sourceid;
    (void)returnbuffer;
    (void)returnbuffersize;
    (void)requiredsize;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetSourceFileSizeA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* infhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* infcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* filename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* section = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* filesize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t roundingfactor = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupGetSourceFileSizeA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(infhandle, infcontext, filename, section, filesize, roundingfactor) : -1;
#else
    (void)infhandle;
    (void)infcontext;
    (void)filename;
    (void)section;
    (void)filesize;
    (void)roundingfactor;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetSourceFileSizeW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* infhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* infcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* filename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* section = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* filesize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t roundingfactor = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupGetSourceFileSizeW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(infhandle, infcontext, filename, section, filesize, roundingfactor) : -1;
#else
    (void)infhandle;
    (void)infcontext;
    (void)filename;
    (void)section;
    (void)filesize;
    (void)roundingfactor;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetSourceInfoA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* infhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t sourceid = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t infodesired = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* returnbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t returnbuffersize = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* requiredsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupGetSourceInfoA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(infhandle, sourceid, infodesired, returnbuffer, returnbuffersize, requiredsize) : -1;
#else
    (void)infhandle;
    (void)sourceid;
    (void)infodesired;
    (void)returnbuffer;
    (void)returnbuffersize;
    (void)requiredsize;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetSourceInfoW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* infhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t sourceid = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t infodesired = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* returnbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t returnbuffersize = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* requiredsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupGetSourceInfoW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(infhandle, sourceid, infodesired, returnbuffer, returnbuffersize, requiredsize) : -1;
#else
    (void)infhandle;
    (void)sourceid;
    (void)infodesired;
    (void)returnbuffer;
    (void)returnbuffersize;
    (void)requiredsize;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetStringFieldA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* context = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t fieldindex = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* returnbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t returnbuffersize = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* requiredsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupGetStringFieldA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(context, fieldindex, returnbuffer, returnbuffersize, requiredsize) : -1;
#else
    (void)context;
    (void)fieldindex;
    (void)returnbuffer;
    (void)returnbuffersize;
    (void)requiredsize;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetStringFieldW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* context = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t fieldindex = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* returnbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t returnbuffersize = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* requiredsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupGetStringFieldW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(context, fieldindex, returnbuffer, returnbuffersize, requiredsize) : -1;
#else
    (void)context;
    (void)fieldindex;
    (void)returnbuffer;
    (void)returnbuffersize;
    (void)requiredsize;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetTargetPathA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* infhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* infcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* section = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* returnbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t returnbuffersize = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* requiredsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupGetTargetPathA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(infhandle, infcontext, section, returnbuffer, returnbuffersize, requiredsize) : -1;
#else
    (void)infhandle;
    (void)infcontext;
    (void)section;
    (void)returnbuffer;
    (void)returnbuffersize;
    (void)requiredsize;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetTargetPathW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* infhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* infcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* section = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* returnbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t returnbuffersize = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* requiredsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupGetTargetPathW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(infhandle, infcontext, section, returnbuffer, returnbuffersize, requiredsize) : -1;
#else
    (void)infhandle;
    (void)infcontext;
    (void)section;
    (void)returnbuffer;
    (void)returnbuffersize;
    (void)requiredsize;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetThreadLogToken_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupGetThreadLogToken")));
    }
    uint64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr() : 0;
#else
    uint64_t km_res = 0;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<uint64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupInitDefaultQueueCallback_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ownerwindow = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupInitDefaultQueueCallback")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(ownerwindow) : NULL;
#else
    (void)ownerwindow;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupInitDefaultQueueCallbackEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ownerwindow = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* alternateprogresswindow = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t progressmessage = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t reserved1 = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* reserved2 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupInitDefaultQueueCallbackEx")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(ownerwindow, alternateprogresswindow, progressmessage, reserved1, reserved2) : NULL;
#else
    (void)ownerwindow;
    (void)alternateprogresswindow;
    (void)progressmessage;
    (void)reserved1;
    (void)reserved2;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupInitializeFileLogA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* logfilename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupInitializeFileLogA")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(logfilename, flags) : NULL;
#else
    (void)logfilename;
    (void)flags;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupInitializeFileLogW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* logfilename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupInitializeFileLogW")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(logfilename, flags) : NULL;
#else
    (void)logfilename;
    (void)flags;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupInstallFileA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* infhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* infcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* sourcefile = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* sourcepathroot = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* destinationname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t copystyle = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* copymsghandler = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* context = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupInstallFileA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(infhandle, infcontext, sourcefile, sourcepathroot, destinationname, copystyle, copymsghandler, context) : -1;
#else
    (void)infhandle;
    (void)infcontext;
    (void)sourcefile;
    (void)sourcepathroot;
    (void)destinationname;
    (void)copystyle;
    (void)copymsghandler;
    (void)context;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupInstallFileExA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* infhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* infcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* sourcefile = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* sourcepathroot = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* destinationname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t copystyle = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* copymsghandler = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* context = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    void* filewasinuse = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupInstallFileExA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(infhandle, infcontext, sourcefile, sourcepathroot, destinationname, copystyle, copymsghandler, context, filewasinuse) : -1;
#else
    (void)infhandle;
    (void)infcontext;
    (void)sourcefile;
    (void)sourcepathroot;
    (void)destinationname;
    (void)copystyle;
    (void)copymsghandler;
    (void)context;
    (void)filewasinuse;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupInstallFileExW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* infhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* infcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* sourcefile = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* sourcepathroot = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* destinationname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t copystyle = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* copymsghandler = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* context = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    void* filewasinuse = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupInstallFileExW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(infhandle, infcontext, sourcefile, sourcepathroot, destinationname, copystyle, copymsghandler, context, filewasinuse) : -1;
#else
    (void)infhandle;
    (void)infcontext;
    (void)sourcefile;
    (void)sourcepathroot;
    (void)destinationname;
    (void)copystyle;
    (void)copymsghandler;
    (void)context;
    (void)filewasinuse;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupInstallFileW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* infhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* infcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* sourcefile = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* sourcepathroot = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* destinationname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t copystyle = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* copymsghandler = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* context = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupInstallFileW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(infhandle, infcontext, sourcefile, sourcepathroot, destinationname, copystyle, copymsghandler, context) : -1;
#else
    (void)infhandle;
    (void)infcontext;
    (void)sourcefile;
    (void)sourcepathroot;
    (void)destinationname;
    (void)copystyle;
    (void)copymsghandler;
    (void)context;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupInstallFilesFromInfSectionA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* infhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* layoutinfhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* filequeue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* sectionname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* sourcerootpath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t copyflags = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupInstallFilesFromInfSectionA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(infhandle, layoutinfhandle, filequeue, sectionname, sourcerootpath, copyflags) : -1;
#else
    (void)infhandle;
    (void)layoutinfhandle;
    (void)filequeue;
    (void)sectionname;
    (void)sourcerootpath;
    (void)copyflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupInstallFilesFromInfSectionW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* infhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* layoutinfhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* filequeue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* sectionname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* sourcerootpath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t copyflags = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupInstallFilesFromInfSectionW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(infhandle, layoutinfhandle, filequeue, sectionname, sourcerootpath, copyflags) : -1;
#else
    (void)infhandle;
    (void)layoutinfhandle;
    (void)filequeue;
    (void)sectionname;
    (void)sourcerootpath;
    (void)copyflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupInstallFromInfSectionA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* owner = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* infhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* sectionname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* relativekeyroot = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* sourcerootpath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    uint32_t copyflags = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    void* msghandler = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    void* context = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
    int64_t deviceinfoset = km_info.Length() > 9 ? km_napi_arg_i64(km_info[9]) : 0;
    void* deviceinfodata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 10 ? km_napi_arg_u64(km_info[10]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*, uint32_t, void*, void*, int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupInstallFromInfSectionA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(owner, infhandle, sectionname, flags, relativekeyroot, sourcerootpath, copyflags, msghandler, context, deviceinfoset, deviceinfodata) : -1;
#else
    (void)owner;
    (void)infhandle;
    (void)sectionname;
    (void)flags;
    (void)relativekeyroot;
    (void)sourcerootpath;
    (void)copyflags;
    (void)msghandler;
    (void)context;
    (void)deviceinfoset;
    (void)deviceinfodata;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupInstallFromInfSectionW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* owner = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* infhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* sectionname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* relativekeyroot = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* sourcerootpath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    uint32_t copyflags = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    void* msghandler = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    void* context = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
    int64_t deviceinfoset = km_info.Length() > 9 ? km_napi_arg_i64(km_info[9]) : 0;
    void* deviceinfodata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 10 ? km_napi_arg_u64(km_info[10]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*, uint32_t, void*, void*, int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupInstallFromInfSectionW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(owner, infhandle, sectionname, flags, relativekeyroot, sourcerootpath, copyflags, msghandler, context, deviceinfoset, deviceinfodata) : -1;
#else
    (void)owner;
    (void)infhandle;
    (void)sectionname;
    (void)flags;
    (void)relativekeyroot;
    (void)sourcerootpath;
    (void)copyflags;
    (void)msghandler;
    (void)context;
    (void)deviceinfoset;
    (void)deviceinfodata;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupInstallServicesFromInfSectionA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* infhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* sectionname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupInstallServicesFromInfSectionA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(infhandle, sectionname, flags) : -1;
#else
    (void)infhandle;
    (void)sectionname;
    (void)flags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupInstallServicesFromInfSectionExA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* infhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* sectionname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int64_t deviceinfoset = km_info.Length() > 3 ? km_napi_arg_i64(km_info[3]) : 0;
    void* deviceinfodata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* reserved1 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* reserved2 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, int64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupInstallServicesFromInfSectionExA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(infhandle, sectionname, flags, deviceinfoset, deviceinfodata, reserved1, reserved2) : -1;
#else
    (void)infhandle;
    (void)sectionname;
    (void)flags;
    (void)deviceinfoset;
    (void)deviceinfodata;
    (void)reserved1;
    (void)reserved2;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupInstallServicesFromInfSectionExW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* infhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* sectionname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int64_t deviceinfoset = km_info.Length() > 3 ? km_napi_arg_i64(km_info[3]) : 0;
    void* deviceinfodata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* reserved1 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* reserved2 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, int64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupInstallServicesFromInfSectionExW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(infhandle, sectionname, flags, deviceinfoset, deviceinfodata, reserved1, reserved2) : -1;
#else
    (void)infhandle;
    (void)sectionname;
    (void)flags;
    (void)deviceinfoset;
    (void)deviceinfodata;
    (void)reserved1;
    (void)reserved2;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupInstallServicesFromInfSectionW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* infhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* sectionname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupInstallServicesFromInfSectionW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(infhandle, sectionname, flags) : -1;
#else
    (void)infhandle;
    (void)sectionname;
    (void)flags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupIterateCabinetA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* cabinetfile = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t reserved = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* msghandler = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* context = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupIterateCabinetA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(cabinetfile, reserved, msghandler, context) : -1;
#else
    (void)cabinetfile;
    (void)reserved;
    (void)msghandler;
    (void)context;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupIterateCabinetW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* cabinetfile = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t reserved = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* msghandler = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* context = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupIterateCabinetW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(cabinetfile, reserved, msghandler, context) : -1;
#else
    (void)cabinetfile;
    (void)reserved;
    (void)msghandler;
    (void)context;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupLogErrorA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* messagestring = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t severity = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupLogErrorA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(messagestring, severity) : -1;
#else
    (void)messagestring;
    (void)severity;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupLogErrorW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* messagestring = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t severity = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupLogErrorW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(messagestring, severity) : -1;
#else
    (void)messagestring;
    (void)severity;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupLogFileA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* fileloghandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* logsectionname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* sourcefilename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* targetfilename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t checksum = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* disktagfile = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* diskdescription = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* otherinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 8 ? km_info[8].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupLogFileA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(fileloghandle, logsectionname, sourcefilename, targetfilename, checksum, disktagfile, diskdescription, otherinfo, flags) : -1;
#else
    (void)fileloghandle;
    (void)logsectionname;
    (void)sourcefilename;
    (void)targetfilename;
    (void)checksum;
    (void)disktagfile;
    (void)diskdescription;
    (void)otherinfo;
    (void)flags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupLogFileW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* fileloghandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* logsectionname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* sourcefilename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* targetfilename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t checksum = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* disktagfile = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* diskdescription = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* otherinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 8 ? km_info[8].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupLogFileW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(fileloghandle, logsectionname, sourcefilename, targetfilename, checksum, disktagfile, diskdescription, otherinfo, flags) : -1;
#else
    (void)fileloghandle;
    (void)logsectionname;
    (void)sourcefilename;
    (void)targetfilename;
    (void)checksum;
    (void)disktagfile;
    (void)diskdescription;
    (void)otherinfo;
    (void)flags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupOpenAppendInfFileA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* filename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* infhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* errorline = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupOpenAppendInfFileA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(filename, infhandle, errorline) : -1;
#else
    (void)filename;
    (void)infhandle;
    (void)errorline;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupOpenAppendInfFileW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* filename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* infhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* errorline = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupOpenAppendInfFileW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(filename, infhandle, errorline) : -1;
#else
    (void)filename;
    (void)infhandle;
    (void)errorline;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupOpenFileQueue_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupOpenFileQueue")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr() : NULL;
#else
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupOpenInfFileA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* filename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* infclass = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t infstyle = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* errorline = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupOpenInfFileA")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(filename, infclass, infstyle, errorline) : NULL;
#else
    (void)filename;
    (void)infclass;
    (void)infstyle;
    (void)errorline;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupOpenInfFileW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* filename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* infclass = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t infstyle = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* errorline = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupOpenInfFileW")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(filename, infclass, infstyle, errorline) : NULL;
#else
    (void)filename;
    (void)infclass;
    (void)infstyle;
    (void)errorline;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupOpenLog_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t erase = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupOpenLog")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(erase) : -1;
#else
    (void)erase;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupOpenMasterInf_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupOpenMasterInf")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr() : NULL;
#else
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupPrepareQueueForRestoreA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* queuehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* backuppath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t restoreflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupPrepareQueueForRestoreA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(queuehandle, backuppath, restoreflags) : -1;
#else
    (void)queuehandle;
    (void)backuppath;
    (void)restoreflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupPrepareQueueForRestoreW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* queuehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* backuppath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t restoreflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupPrepareQueueForRestoreW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(queuehandle, backuppath, restoreflags) : -1;
#else
    (void)queuehandle;
    (void)backuppath;
    (void)restoreflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupPromptForDiskA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hwndparent = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* dialogtitle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* diskname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pathtosource = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* filesought = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* tagfile = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    uint32_t diskpromptstyle = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    void* pathbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    uint32_t pathbuffersize = static_cast<uint32_t>(km_info.Length() > 8 ? km_info[8].ToNumber().Int32Value() : 0);
    void* pathrequiredsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 9 ? km_napi_arg_u64(km_info[9]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupPromptForDiskA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hwndparent, dialogtitle, diskname, pathtosource, filesought, tagfile, diskpromptstyle, pathbuffer, pathbuffersize, pathrequiredsize) : 0;
#else
    (void)hwndparent;
    (void)dialogtitle;
    (void)diskname;
    (void)pathtosource;
    (void)filesought;
    (void)tagfile;
    (void)diskpromptstyle;
    (void)pathbuffer;
    (void)pathbuffersize;
    (void)pathrequiredsize;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupPromptForDiskW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hwndparent = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* dialogtitle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* diskname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pathtosource = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* filesought = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* tagfile = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    uint32_t diskpromptstyle = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    void* pathbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    uint32_t pathbuffersize = static_cast<uint32_t>(km_info.Length() > 8 ? km_info[8].ToNumber().Int32Value() : 0);
    void* pathrequiredsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 9 ? km_napi_arg_u64(km_info[9]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupPromptForDiskW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hwndparent, dialogtitle, diskname, pathtosource, filesought, tagfile, diskpromptstyle, pathbuffer, pathbuffersize, pathrequiredsize) : 0;
#else
    (void)hwndparent;
    (void)dialogtitle;
    (void)diskname;
    (void)pathtosource;
    (void)filesought;
    (void)tagfile;
    (void)diskpromptstyle;
    (void)pathbuffer;
    (void)pathbuffersize;
    (void)pathrequiredsize;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupPromptReboot_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* filequeue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* owner = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t scanonly = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupPromptReboot")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(filequeue, owner, scanonly) : -1;
#else
    (void)filequeue;
    (void)owner;
    (void)scanonly;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueryDrivesInDiskSpaceListA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* diskspace = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* returnbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t returnbuffersize = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* requiredsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupQueryDrivesInDiskSpaceListA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(diskspace, returnbuffer, returnbuffersize, requiredsize) : -1;
#else
    (void)diskspace;
    (void)returnbuffer;
    (void)returnbuffersize;
    (void)requiredsize;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueryDrivesInDiskSpaceListW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* diskspace = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* returnbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t returnbuffersize = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* requiredsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupQueryDrivesInDiskSpaceListW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(diskspace, returnbuffer, returnbuffersize, requiredsize) : -1;
#else
    (void)diskspace;
    (void)returnbuffer;
    (void)returnbuffersize;
    (void)requiredsize;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueryFileLogA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* fileloghandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* logsectionname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* targetfilename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int32_t desiredinfo = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* dataout = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t returnbuffersize = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* requiredsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupQueryFileLogA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(fileloghandle, logsectionname, targetfilename, desiredinfo, dataout, returnbuffersize, requiredsize) : -1;
#else
    (void)fileloghandle;
    (void)logsectionname;
    (void)targetfilename;
    (void)desiredinfo;
    (void)dataout;
    (void)returnbuffersize;
    (void)requiredsize;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueryFileLogW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* fileloghandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* logsectionname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* targetfilename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int32_t desiredinfo = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* dataout = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t returnbuffersize = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* requiredsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupQueryFileLogW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(fileloghandle, logsectionname, targetfilename, desiredinfo, dataout, returnbuffersize, requiredsize) : -1;
#else
    (void)fileloghandle;
    (void)logsectionname;
    (void)targetfilename;
    (void)desiredinfo;
    (void)dataout;
    (void)returnbuffersize;
    (void)requiredsize;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueryInfFileInformationA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* infinformation = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t infindex = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* returnbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t returnbuffersize = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* requiredsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupQueryInfFileInformationA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(infinformation, infindex, returnbuffer, returnbuffersize, requiredsize) : -1;
#else
    (void)infinformation;
    (void)infindex;
    (void)returnbuffer;
    (void)returnbuffersize;
    (void)requiredsize;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueryInfFileInformationW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* infinformation = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t infindex = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* returnbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t returnbuffersize = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* requiredsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupQueryInfFileInformationW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(infinformation, infindex, returnbuffer, returnbuffersize, requiredsize) : -1;
#else
    (void)infinformation;
    (void)infindex;
    (void)returnbuffer;
    (void)returnbuffersize;
    (void)requiredsize;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueryInfOriginalFileInformationA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* infinformation = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t infindex = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* alternateplatforminfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* originalfileinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupQueryInfOriginalFileInformationA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(infinformation, infindex, alternateplatforminfo, originalfileinfo) : -1;
#else
    (void)infinformation;
    (void)infindex;
    (void)alternateplatforminfo;
    (void)originalfileinfo;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueryInfOriginalFileInformationW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* infinformation = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t infindex = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* alternateplatforminfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* originalfileinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupQueryInfOriginalFileInformationW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(infinformation, infindex, alternateplatforminfo, originalfileinfo) : -1;
#else
    (void)infinformation;
    (void)infindex;
    (void)alternateplatforminfo;
    (void)originalfileinfo;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueryInfVersionInformationA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* infinformation = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t infindex = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* key = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* returnbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t returnbuffersize = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* requiredsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupQueryInfVersionInformationA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(infinformation, infindex, key, returnbuffer, returnbuffersize, requiredsize) : -1;
#else
    (void)infinformation;
    (void)infindex;
    (void)key;
    (void)returnbuffer;
    (void)returnbuffersize;
    (void)requiredsize;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueryInfVersionInformationW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* infinformation = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t infindex = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* key = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* returnbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t returnbuffersize = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* requiredsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupQueryInfVersionInformationW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(infinformation, infindex, key, returnbuffer, returnbuffersize, requiredsize) : -1;
#else
    (void)infinformation;
    (void)infindex;
    (void)key;
    (void)returnbuffer;
    (void)returnbuffersize;
    (void)requiredsize;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQuerySourceListA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* list = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* count = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupQuerySourceListA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(flags, list, count) : -1;
#else
    (void)flags;
    (void)list;
    (void)count;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQuerySourceListW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* list = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* count = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupQuerySourceListW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(flags, list, count) : -1;
#else
    (void)flags;
    (void)list;
    (void)count;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQuerySpaceRequiredOnDriveA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* diskspace = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* drivespec = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* spacerequired = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* reserved1 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t reserved2 = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupQuerySpaceRequiredOnDriveA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(diskspace, drivespec, spacerequired, reserved1, reserved2) : -1;
#else
    (void)diskspace;
    (void)drivespec;
    (void)spacerequired;
    (void)reserved1;
    (void)reserved2;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQuerySpaceRequiredOnDriveW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* diskspace = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* drivespec = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* spacerequired = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* reserved1 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t reserved2 = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupQuerySpaceRequiredOnDriveW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(diskspace, drivespec, spacerequired, reserved1, reserved2) : -1;
#else
    (void)diskspace;
    (void)drivespec;
    (void)spacerequired;
    (void)reserved1;
    (void)reserved2;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueueCopyA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* queuehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* sourcerootpath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* sourcepath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* sourcefilename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* sourcedescription = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* sourcetagfile = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* targetdirectory = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* targetfilename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    uint32_t copystyle = static_cast<uint32_t>(km_info.Length() > 8 ? km_info[8].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupQueueCopyA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(queuehandle, sourcerootpath, sourcepath, sourcefilename, sourcedescription, sourcetagfile, targetdirectory, targetfilename, copystyle) : -1;
#else
    (void)queuehandle;
    (void)sourcerootpath;
    (void)sourcepath;
    (void)sourcefilename;
    (void)sourcedescription;
    (void)sourcetagfile;
    (void)targetdirectory;
    (void)targetfilename;
    (void)copystyle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueueCopyIndirectA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* copyparams = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupQueueCopyIndirectA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(copyparams) : -1;
#else
    (void)copyparams;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueueCopyIndirectW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* copyparams = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupQueueCopyIndirectW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(copyparams) : -1;
#else
    (void)copyparams;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueueCopySectionA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* queuehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* sourcerootpath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* infhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* listinfhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* section = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t copystyle = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupQueueCopySectionA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(queuehandle, sourcerootpath, infhandle, listinfhandle, section, copystyle) : -1;
#else
    (void)queuehandle;
    (void)sourcerootpath;
    (void)infhandle;
    (void)listinfhandle;
    (void)section;
    (void)copystyle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueueCopySectionW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* queuehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* sourcerootpath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* infhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* listinfhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* section = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t copystyle = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupQueueCopySectionW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(queuehandle, sourcerootpath, infhandle, listinfhandle, section, copystyle) : -1;
#else
    (void)queuehandle;
    (void)sourcerootpath;
    (void)infhandle;
    (void)listinfhandle;
    (void)section;
    (void)copystyle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueueCopyW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* queuehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* sourcerootpath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* sourcepath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* sourcefilename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* sourcedescription = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* sourcetagfile = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* targetdirectory = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* targetfilename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    uint32_t copystyle = static_cast<uint32_t>(km_info.Length() > 8 ? km_info[8].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupQueueCopyW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(queuehandle, sourcerootpath, sourcepath, sourcefilename, sourcedescription, sourcetagfile, targetdirectory, targetfilename, copystyle) : -1;
#else
    (void)queuehandle;
    (void)sourcerootpath;
    (void)sourcepath;
    (void)sourcefilename;
    (void)sourcedescription;
    (void)sourcetagfile;
    (void)targetdirectory;
    (void)targetfilename;
    (void)copystyle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueueDefaultCopyA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* queuehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* infhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* sourcerootpath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* sourcefilename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* targetfilename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t copystyle = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupQueueDefaultCopyA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(queuehandle, infhandle, sourcerootpath, sourcefilename, targetfilename, copystyle) : -1;
#else
    (void)queuehandle;
    (void)infhandle;
    (void)sourcerootpath;
    (void)sourcefilename;
    (void)targetfilename;
    (void)copystyle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueueDefaultCopyW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* queuehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* infhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* sourcerootpath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* sourcefilename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* targetfilename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t copystyle = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupQueueDefaultCopyW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(queuehandle, infhandle, sourcerootpath, sourcefilename, targetfilename, copystyle) : -1;
#else
    (void)queuehandle;
    (void)infhandle;
    (void)sourcerootpath;
    (void)sourcefilename;
    (void)targetfilename;
    (void)copystyle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueueDeleteA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* queuehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pathpart1 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pathpart2 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupQueueDeleteA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(queuehandle, pathpart1, pathpart2) : -1;
#else
    (void)queuehandle;
    (void)pathpart1;
    (void)pathpart2;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueueDeleteSectionA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* queuehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* infhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* listinfhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* section = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupQueueDeleteSectionA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(queuehandle, infhandle, listinfhandle, section) : -1;
#else
    (void)queuehandle;
    (void)infhandle;
    (void)listinfhandle;
    (void)section;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueueDeleteSectionW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* queuehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* infhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* listinfhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* section = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupQueueDeleteSectionW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(queuehandle, infhandle, listinfhandle, section) : -1;
#else
    (void)queuehandle;
    (void)infhandle;
    (void)listinfhandle;
    (void)section;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueueDeleteW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* queuehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pathpart1 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pathpart2 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupQueueDeleteW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(queuehandle, pathpart1, pathpart2) : -1;
#else
    (void)queuehandle;
    (void)pathpart1;
    (void)pathpart2;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueueRenameA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* queuehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* sourcepath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* sourcefilename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* targetpath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* targetfilename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupQueueRenameA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(queuehandle, sourcepath, sourcefilename, targetpath, targetfilename) : -1;
#else
    (void)queuehandle;
    (void)sourcepath;
    (void)sourcefilename;
    (void)targetpath;
    (void)targetfilename;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueueRenameSectionA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* queuehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* infhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* listinfhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* section = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupQueueRenameSectionA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(queuehandle, infhandle, listinfhandle, section) : -1;
#else
    (void)queuehandle;
    (void)infhandle;
    (void)listinfhandle;
    (void)section;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueueRenameSectionW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* queuehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* infhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* listinfhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* section = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupQueueRenameSectionW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(queuehandle, infhandle, listinfhandle, section) : -1;
#else
    (void)queuehandle;
    (void)infhandle;
    (void)listinfhandle;
    (void)section;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueueRenameW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* queuehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* sourcepath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* sourcefilename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* targetpath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* targetfilename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupQueueRenameW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(queuehandle, sourcepath, sourcefilename, targetpath, targetfilename) : -1;
#else
    (void)queuehandle;
    (void)sourcepath;
    (void)sourcefilename;
    (void)targetpath;
    (void)targetfilename;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupRemoveFileLogEntryA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* fileloghandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* logsectionname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* targetfilename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupRemoveFileLogEntryA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(fileloghandle, logsectionname, targetfilename) : -1;
#else
    (void)fileloghandle;
    (void)logsectionname;
    (void)targetfilename;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupRemoveFileLogEntryW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* fileloghandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* logsectionname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* targetfilename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupRemoveFileLogEntryW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(fileloghandle, logsectionname, targetfilename) : -1;
#else
    (void)fileloghandle;
    (void)logsectionname;
    (void)targetfilename;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupRemoveFromDiskSpaceListA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* diskspace = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* targetfilespec = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t operation = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* reserved1 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t reserved2 = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupRemoveFromDiskSpaceListA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(diskspace, targetfilespec, operation, reserved1, reserved2) : -1;
#else
    (void)diskspace;
    (void)targetfilespec;
    (void)operation;
    (void)reserved1;
    (void)reserved2;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupRemoveFromDiskSpaceListW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* diskspace = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* targetfilespec = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t operation = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* reserved1 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t reserved2 = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupRemoveFromDiskSpaceListW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(diskspace, targetfilespec, operation, reserved1, reserved2) : -1;
#else
    (void)diskspace;
    (void)targetfilespec;
    (void)operation;
    (void)reserved1;
    (void)reserved2;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupRemoveFromSourceListA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* source = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupRemoveFromSourceListA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(flags, source) : -1;
#else
    (void)flags;
    (void)source;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupRemoveFromSourceListW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* source = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupRemoveFromSourceListW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(flags, source) : -1;
#else
    (void)flags;
    (void)source;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupRemoveInstallSectionFromDiskSpaceListA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* diskspace = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* infhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* layoutinfhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* sectionname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* reserved1 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t reserved2 = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupRemoveInstallSectionFromDiskSpaceListA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(diskspace, infhandle, layoutinfhandle, sectionname, reserved1, reserved2) : -1;
#else
    (void)diskspace;
    (void)infhandle;
    (void)layoutinfhandle;
    (void)sectionname;
    (void)reserved1;
    (void)reserved2;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupRemoveInstallSectionFromDiskSpaceListW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* diskspace = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* infhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* layoutinfhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* sectionname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* reserved1 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t reserved2 = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupRemoveInstallSectionFromDiskSpaceListW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(diskspace, infhandle, layoutinfhandle, sectionname, reserved1, reserved2) : -1;
#else
    (void)diskspace;
    (void)infhandle;
    (void)layoutinfhandle;
    (void)sectionname;
    (void)reserved1;
    (void)reserved2;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupRemoveSectionFromDiskSpaceListA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* diskspace = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* infhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* listinfhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* sectionname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t operation = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* reserved1 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    uint32_t reserved2 = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupRemoveSectionFromDiskSpaceListA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(diskspace, infhandle, listinfhandle, sectionname, operation, reserved1, reserved2) : -1;
#else
    (void)diskspace;
    (void)infhandle;
    (void)listinfhandle;
    (void)sectionname;
    (void)operation;
    (void)reserved1;
    (void)reserved2;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupRemoveSectionFromDiskSpaceListW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* diskspace = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* infhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* listinfhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* sectionname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t operation = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* reserved1 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    uint32_t reserved2 = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupRemoveSectionFromDiskSpaceListW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(diskspace, infhandle, listinfhandle, sectionname, operation, reserved1, reserved2) : -1;
#else
    (void)diskspace;
    (void)infhandle;
    (void)listinfhandle;
    (void)sectionname;
    (void)operation;
    (void)reserved1;
    (void)reserved2;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupRenameErrorA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hwndparent = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* dialogtitle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* sourcefile = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* targetfile = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t win32errorcode = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    uint32_t style = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupRenameErrorA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hwndparent, dialogtitle, sourcefile, targetfile, win32errorcode, style) : 0;
#else
    (void)hwndparent;
    (void)dialogtitle;
    (void)sourcefile;
    (void)targetfile;
    (void)win32errorcode;
    (void)style;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupRenameErrorW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hwndparent = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* dialogtitle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* sourcefile = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* targetfile = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t win32errorcode = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    uint32_t style = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupRenameErrorW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hwndparent, dialogtitle, sourcefile, targetfile, win32errorcode, style) : 0;
#else
    (void)hwndparent;
    (void)dialogtitle;
    (void)sourcefile;
    (void)targetfile;
    (void)win32errorcode;
    (void)style;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupScanFileQueueA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* filequeue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* window = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* callbackroutine = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* callbackcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* result = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupScanFileQueueA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(filequeue, flags, window, callbackroutine, callbackcontext, result) : -1;
#else
    (void)filequeue;
    (void)flags;
    (void)window;
    (void)callbackroutine;
    (void)callbackcontext;
    (void)result;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupScanFileQueueW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* filequeue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* window = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* callbackroutine = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* callbackcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* result = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupScanFileQueueW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(filequeue, flags, window, callbackroutine, callbackcontext, result) : -1;
#else
    (void)filequeue;
    (void)flags;
    (void)window;
    (void)callbackroutine;
    (void)callbackcontext;
    (void)result;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupSetDirectoryIdA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* infhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t id = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* directory = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupSetDirectoryIdA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(infhandle, id, directory) : -1;
#else
    (void)infhandle;
    (void)id;
    (void)directory;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupSetDirectoryIdExA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* infhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t id = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* directory = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t reserved1 = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* reserved2 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupSetDirectoryIdExA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(infhandle, id, directory, flags, reserved1, reserved2) : -1;
#else
    (void)infhandle;
    (void)id;
    (void)directory;
    (void)flags;
    (void)reserved1;
    (void)reserved2;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupSetDirectoryIdExW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* infhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t id = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* directory = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t reserved1 = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* reserved2 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupSetDirectoryIdExW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(infhandle, id, directory, flags, reserved1, reserved2) : -1;
#else
    (void)infhandle;
    (void)id;
    (void)directory;
    (void)flags;
    (void)reserved1;
    (void)reserved2;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupSetDirectoryIdW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* infhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t id = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* directory = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupSetDirectoryIdW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(infhandle, id, directory) : -1;
#else
    (void)infhandle;
    (void)id;
    (void)directory;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupSetFileQueueAlternatePlatformA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* queuehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* alternateplatforminfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* alternatedefaultcatalogfile = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupSetFileQueueAlternatePlatformA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(queuehandle, alternateplatforminfo, alternatedefaultcatalogfile) : -1;
#else
    (void)queuehandle;
    (void)alternateplatforminfo;
    (void)alternatedefaultcatalogfile;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupSetFileQueueAlternatePlatformW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* queuehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* alternateplatforminfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* alternatedefaultcatalogfile = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupSetFileQueueAlternatePlatformW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(queuehandle, alternateplatforminfo, alternatedefaultcatalogfile) : -1;
#else
    (void)queuehandle;
    (void)alternateplatforminfo;
    (void)alternatedefaultcatalogfile;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupSetFileQueueFlags_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* filequeue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t flagmask = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupSetFileQueueFlags")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(filequeue, flagmask, flags) : -1;
#else
    (void)filequeue;
    (void)flagmask;
    (void)flags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupSetNonInteractiveMode_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t noninteractiveflag = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupSetNonInteractiveMode")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(noninteractiveflag) : -1;
#else
    (void)noninteractiveflag;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupSetPlatformPathOverrideA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* override = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupSetPlatformPathOverrideA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(override) : -1;
#else
    (void)override;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupSetPlatformPathOverrideW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* override = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupSetPlatformPathOverrideW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(override) : -1;
#else
    (void)override;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupSetSourceListA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* sourcelist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t sourcecount = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupSetSourceListA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(flags, sourcelist, sourcecount) : -1;
#else
    (void)flags;
    (void)sourcelist;
    (void)sourcecount;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupSetSourceListW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* sourcelist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t sourcecount = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupSetSourceListW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(flags, sourcelist, sourcecount) : -1;
#else
    (void)flags;
    (void)sourcelist;
    (void)sourcecount;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupSetThreadLogToken_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t logtoken = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupSetThreadLogToken")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(logtoken);
#else
    (void)logtoken;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupTermDefaultQueueCallback_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* context = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupTermDefaultQueueCallback")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(context);
#else
    (void)context;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupTerminateFileLog_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* fileloghandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupTerminateFileLog")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(fileloghandle) : -1;
#else
    (void)fileloghandle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupUninstallNewlyCopiedInfs_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* filequeue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* reserved = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupUninstallNewlyCopiedInfs")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(filequeue, flags, reserved) : -1;
#else
    (void)filequeue;
    (void)flags;
    (void)reserved;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupUninstallOEMInfA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* inffilename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* reserved = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupUninstallOEMInfA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(inffilename, flags, reserved) : -1;
#else
    (void)inffilename;
    (void)flags;
    (void)reserved;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupUninstallOEMInfW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* inffilename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* reserved = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupUninstallOEMInfW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(inffilename, flags, reserved) : -1;
#else
    (void)inffilename;
    (void)flags;
    (void)reserved;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupVerifyInfFileA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* infname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* altplatforminfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* infsignerinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupVerifyInfFileA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(infname, altplatforminfo, infsignerinfo) : -1;
#else
    (void)infname;
    (void)altplatforminfo;
    (void)infsignerinfo;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupVerifyInfFileW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* infname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* altplatforminfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* infsignerinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupVerifyInfFileW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(infname, altplatforminfo, infsignerinfo) : -1;
#else
    (void)infname;
    (void)altplatforminfo;
    (void)infsignerinfo;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_SetupWriteTextLogInfLine_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t logtoken = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* infhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* context = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint64_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupWriteTextLogInfLine")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(logtoken, flags, infhandle, context);
#else
    (void)logtoken;
    (void)flags;
    (void)infhandle;
    (void)context;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_UpdateDriverForPlugAndPlayDevicesA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hwndparent = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* hardwareid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* fullinfpath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t installflags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* brebootrequired = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("newdev.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "UpdateDriverForPlugAndPlayDevicesA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hwndparent, hardwareid, fullinfpath, installflags, brebootrequired) : -1;
#else
    (void)hwndparent;
    (void)hardwareid;
    (void)fullinfpath;
    (void)installflags;
    (void)brebootrequired;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_deviceanddriverinstallation_UpdateDriverForPlugAndPlayDevicesW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hwndparent = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* hardwareid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* fullinfpath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t installflags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* brebootrequired = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("newdev.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "UpdateDriverForPlugAndPlayDevicesW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hwndparent, hardwareid, fullinfpath, installflags, brebootrequired) : -1;
#else
    (void)hwndparent;
    (void)hardwareid;
    (void)fullinfpath;
    (void)installflags;
    (void)brebootrequired;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static void register_windows_win32_devices_deviceanddriverinstallation_napi(Napi::Env env, Napi::Object exports) {
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CMP_WaitNoPendingInstallEvents", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CMP_WaitNoPendingInstallEvents_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Add_Empty_Log_Conf", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Add_Empty_Log_Conf_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Add_Empty_Log_Conf_Ex", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Add_Empty_Log_Conf_Ex_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Add_IDA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Add_IDA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Add_IDW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Add_IDW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Add_ID_ExA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Add_ID_ExA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Add_ID_ExW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Add_ID_ExW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Add_Range", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Add_Range_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Add_Res_Des", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Add_Res_Des_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Add_Res_Des_Ex", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Add_Res_Des_Ex_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Connect_MachineA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Connect_MachineA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Connect_MachineW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Connect_MachineW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Create_DevNodeA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Create_DevNodeA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Create_DevNodeW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Create_DevNodeW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Create_DevNode_ExA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Create_DevNode_ExA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Create_DevNode_ExW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Create_DevNode_ExW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Create_Range_List", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Create_Range_List_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Delete_Class_Key", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Delete_Class_Key_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Delete_Class_Key_Ex", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Delete_Class_Key_Ex_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Delete_DevNode_Key", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Delete_DevNode_Key_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Delete_DevNode_Key_Ex", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Delete_DevNode_Key_Ex_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Delete_Device_Interface_KeyA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Delete_Device_Interface_KeyA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Delete_Device_Interface_KeyW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Delete_Device_Interface_KeyW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Delete_Device_Interface_Key_ExA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Delete_Device_Interface_Key_ExA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Delete_Device_Interface_Key_ExW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Delete_Device_Interface_Key_ExW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Delete_Range", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Delete_Range_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Detect_Resource_Conflict", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Detect_Resource_Conflict_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Detect_Resource_Conflict_Ex", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Detect_Resource_Conflict_Ex_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Disable_DevNode", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Disable_DevNode_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Disable_DevNode_Ex", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Disable_DevNode_Ex_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Disconnect_Machine", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Disconnect_Machine_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Dup_Range_List", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Dup_Range_List_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Enable_DevNode", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Enable_DevNode_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Enable_DevNode_Ex", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Enable_DevNode_Ex_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Enumerate_Classes", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Enumerate_Classes_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Enumerate_Classes_Ex", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Enumerate_Classes_Ex_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Enumerate_EnumeratorsA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Enumerate_EnumeratorsA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Enumerate_EnumeratorsW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Enumerate_EnumeratorsW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Enumerate_Enumerators_ExA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Enumerate_Enumerators_ExA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Enumerate_Enumerators_ExW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Enumerate_Enumerators_ExW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Find_Range", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Find_Range_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_First_Range", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_First_Range_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Free_Log_Conf", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Free_Log_Conf_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Free_Log_Conf_Ex", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Free_Log_Conf_Ex_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Free_Log_Conf_Handle", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Free_Log_Conf_Handle_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Free_Range_List", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Free_Range_List_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Free_Res_Des", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Free_Res_Des_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Free_Res_Des_Ex", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Free_Res_Des_Ex_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Free_Res_Des_Handle", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Free_Res_Des_Handle_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Free_Resource_Conflict_Handle", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Free_Resource_Conflict_Handle_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Child", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Child_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Child_Ex", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Child_Ex_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Class_Key_NameA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Class_Key_NameA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Class_Key_NameW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Class_Key_NameW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Class_Key_Name_ExA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Class_Key_Name_ExA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Class_Key_Name_ExW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Class_Key_Name_ExW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Class_NameA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Class_NameA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Class_NameW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Class_NameW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Class_Name_ExA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Class_Name_ExA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Class_Name_ExW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Class_Name_ExW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Class_PropertyW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Class_PropertyW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Class_Property_ExW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Class_Property_ExW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Class_Property_Keys", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Class_Property_Keys_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Class_Property_Keys_Ex", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Class_Property_Keys_Ex_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Class_Registry_PropertyA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Class_Registry_PropertyA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Class_Registry_PropertyW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Class_Registry_PropertyW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Depth", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Depth_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Depth_Ex", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Depth_Ex_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_DevNode_Custom_PropertyA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_DevNode_Custom_PropertyA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_DevNode_Custom_PropertyW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_DevNode_Custom_PropertyW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_DevNode_Custom_Property_ExA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_DevNode_Custom_Property_ExA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_DevNode_Custom_Property_ExW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_DevNode_Custom_Property_ExW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_DevNode_PropertyW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_DevNode_PropertyW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_DevNode_Property_ExW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_DevNode_Property_ExW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_DevNode_Property_Keys", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_DevNode_Property_Keys_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_DevNode_Property_Keys_Ex", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_DevNode_Property_Keys_Ex_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_DevNode_Registry_PropertyA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_DevNode_Registry_PropertyA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_DevNode_Registry_PropertyW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_DevNode_Registry_PropertyW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_DevNode_Registry_Property_ExA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_DevNode_Registry_Property_ExA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_DevNode_Registry_Property_ExW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_DevNode_Registry_Property_ExW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_DevNode_Status", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_DevNode_Status_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_DevNode_Status_Ex", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_DevNode_Status_Ex_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_IDA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_IDA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_IDW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_IDW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_ID_ExA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_ID_ExA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_ID_ExW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_ID_ExW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_ID_ListA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_ID_ListA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_ID_ListW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_ID_ListW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_ID_List_ExA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_ID_List_ExA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_ID_List_ExW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_ID_List_ExW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_ID_List_SizeA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_ID_List_SizeA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_ID_List_SizeW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_ID_List_SizeW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_ID_List_Size_ExA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_ID_List_Size_ExA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_ID_List_Size_ExW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_ID_List_Size_ExW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_ID_Size", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_ID_Size_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_ID_Size_Ex", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_ID_Size_Ex_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_Interface_AliasA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_Interface_AliasA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_Interface_AliasW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_Interface_AliasW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_Interface_Alias_ExA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_Interface_Alias_ExA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_Interface_Alias_ExW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_Interface_Alias_ExW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_Interface_ListA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_Interface_ListA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_Interface_ListW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_Interface_ListW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_Interface_List_ExA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_Interface_List_ExA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_Interface_List_ExW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_Interface_List_ExW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_Interface_List_SizeA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_Interface_List_SizeA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_Interface_List_SizeW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_Interface_List_SizeW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_Interface_List_Size_ExA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_Interface_List_Size_ExA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_Interface_List_Size_ExW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_Interface_List_Size_ExW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_Interface_PropertyW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_Interface_PropertyW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_Interface_Property_ExW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_Interface_Property_ExW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_Interface_Property_KeysW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_Interface_Property_KeysW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_Interface_Property_Keys_ExW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_Interface_Property_Keys_ExW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_First_Log_Conf", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_First_Log_Conf_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_First_Log_Conf_Ex", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_First_Log_Conf_Ex_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Global_State", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Global_State_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Global_State_Ex", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Global_State_Ex_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_HW_Prof_FlagsA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_HW_Prof_FlagsA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_HW_Prof_FlagsW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_HW_Prof_FlagsW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_HW_Prof_Flags_ExA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_HW_Prof_Flags_ExA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_HW_Prof_Flags_ExW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_HW_Prof_Flags_ExW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Hardware_Profile_InfoA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Hardware_Profile_InfoA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Hardware_Profile_InfoW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Hardware_Profile_InfoW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Hardware_Profile_Info_ExA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Hardware_Profile_Info_ExA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Hardware_Profile_Info_ExW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Hardware_Profile_Info_ExW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Log_Conf_Priority", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Log_Conf_Priority_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Log_Conf_Priority_Ex", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Log_Conf_Priority_Ex_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Next_Log_Conf", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Next_Log_Conf_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Next_Log_Conf_Ex", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Next_Log_Conf_Ex_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Next_Res_Des", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Next_Res_Des_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Next_Res_Des_Ex", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Next_Res_Des_Ex_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Parent", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Parent_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Parent_Ex", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Parent_Ex_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Res_Des_Data", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Res_Des_Data_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Res_Des_Data_Ex", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Res_Des_Data_Ex_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Res_Des_Data_Size", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Res_Des_Data_Size_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Res_Des_Data_Size_Ex", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Res_Des_Data_Size_Ex_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Resource_Conflict_Count", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Resource_Conflict_Count_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Resource_Conflict_DetailsA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Resource_Conflict_DetailsA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Resource_Conflict_DetailsW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Resource_Conflict_DetailsW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Sibling", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Sibling_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Sibling_Ex", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Sibling_Ex_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Version", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Version_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Version_Ex", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Version_Ex_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Intersect_Range_List", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Intersect_Range_List_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Invert_Range_List", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Invert_Range_List_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Is_Dock_Station_Present", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Is_Dock_Station_Present_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Is_Dock_Station_Present_Ex", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Is_Dock_Station_Present_Ex_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Is_Version_Available", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Is_Version_Available_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Is_Version_Available_Ex", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Is_Version_Available_Ex_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Locate_DevNodeA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Locate_DevNodeA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Locate_DevNodeW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Locate_DevNodeW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Locate_DevNode_ExA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Locate_DevNode_ExA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Locate_DevNode_ExW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Locate_DevNode_ExW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_MapCrToWin32Err", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_MapCrToWin32Err_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Merge_Range_List", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Merge_Range_List_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Modify_Res_Des", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Modify_Res_Des_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Modify_Res_Des_Ex", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Modify_Res_Des_Ex_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Move_DevNode", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Move_DevNode_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Move_DevNode_Ex", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Move_DevNode_Ex_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Next_Range", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Next_Range_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Open_Class_KeyA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Open_Class_KeyA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Open_Class_KeyW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Open_Class_KeyW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Open_Class_Key_ExA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Open_Class_Key_ExA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Open_Class_Key_ExW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Open_Class_Key_ExW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Open_DevNode_Key", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Open_DevNode_Key_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Open_DevNode_Key_Ex", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Open_DevNode_Key_Ex_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Open_Device_Interface_KeyA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Open_Device_Interface_KeyA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Open_Device_Interface_KeyW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Open_Device_Interface_KeyW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Open_Device_Interface_Key_ExA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Open_Device_Interface_Key_ExA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Open_Device_Interface_Key_ExW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Open_Device_Interface_Key_ExW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Query_And_Remove_SubTreeA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Query_And_Remove_SubTreeA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Query_And_Remove_SubTreeW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Query_And_Remove_SubTreeW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Query_And_Remove_SubTree_ExA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Query_And_Remove_SubTree_ExA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Query_And_Remove_SubTree_ExW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Query_And_Remove_SubTree_ExW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Query_Arbitrator_Free_Data", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Query_Arbitrator_Free_Data_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Query_Arbitrator_Free_Data_Ex", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Query_Arbitrator_Free_Data_Ex_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Query_Arbitrator_Free_Size", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Query_Arbitrator_Free_Size_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Query_Arbitrator_Free_Size_Ex", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Query_Arbitrator_Free_Size_Ex_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Query_Remove_SubTree", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Query_Remove_SubTree_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Query_Remove_SubTree_Ex", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Query_Remove_SubTree_Ex_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Query_Resource_Conflict_List", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Query_Resource_Conflict_List_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Reenumerate_DevNode", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Reenumerate_DevNode_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Reenumerate_DevNode_Ex", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Reenumerate_DevNode_Ex_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Register_Device_Driver", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Register_Device_Driver_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Register_Device_Driver_Ex", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Register_Device_Driver_Ex_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Register_Device_InterfaceA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Register_Device_InterfaceA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Register_Device_InterfaceW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Register_Device_InterfaceW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Register_Device_Interface_ExA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Register_Device_Interface_ExA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Register_Device_Interface_ExW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Register_Device_Interface_ExW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Register_Notification", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Register_Notification_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Remove_SubTree", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Remove_SubTree_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Remove_SubTree_Ex", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Remove_SubTree_Ex_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Request_Device_EjectA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Request_Device_EjectA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Request_Device_EjectW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Request_Device_EjectW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Request_Device_Eject_ExA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Request_Device_Eject_ExA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Request_Device_Eject_ExW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Request_Device_Eject_ExW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Request_Eject_PC", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Request_Eject_PC_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Request_Eject_PC_Ex", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Request_Eject_PC_Ex_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Run_Detection", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Run_Detection_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Run_Detection_Ex", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Run_Detection_Ex_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Set_Class_PropertyW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Set_Class_PropertyW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Set_Class_Property_ExW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Set_Class_Property_ExW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Set_Class_Registry_PropertyA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Set_Class_Registry_PropertyA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Set_Class_Registry_PropertyW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Set_Class_Registry_PropertyW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Set_DevNode_Problem", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Set_DevNode_Problem_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Set_DevNode_Problem_Ex", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Set_DevNode_Problem_Ex_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Set_DevNode_PropertyW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Set_DevNode_PropertyW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Set_DevNode_Property_ExW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Set_DevNode_Property_ExW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Set_DevNode_Registry_PropertyA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Set_DevNode_Registry_PropertyA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Set_DevNode_Registry_PropertyW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Set_DevNode_Registry_PropertyW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Set_DevNode_Registry_Property_ExA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Set_DevNode_Registry_Property_ExA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Set_DevNode_Registry_Property_ExW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Set_DevNode_Registry_Property_ExW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Set_Device_Interface_PropertyW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Set_Device_Interface_PropertyW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Set_Device_Interface_Property_ExW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Set_Device_Interface_Property_ExW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Set_HW_Prof", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Set_HW_Prof_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Set_HW_Prof_Ex", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Set_HW_Prof_Ex_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Set_HW_Prof_FlagsA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Set_HW_Prof_FlagsA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Set_HW_Prof_FlagsW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Set_HW_Prof_FlagsW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Set_HW_Prof_Flags_ExA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Set_HW_Prof_Flags_ExA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Set_HW_Prof_Flags_ExW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Set_HW_Prof_Flags_ExW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Setup_DevNode", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Setup_DevNode_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Setup_DevNode_Ex", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Setup_DevNode_Ex_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Test_Range_Available", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Test_Range_Available_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Uninstall_DevNode", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Uninstall_DevNode_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Uninstall_DevNode_Ex", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Uninstall_DevNode_Ex_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Unregister_Device_InterfaceA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Unregister_Device_InterfaceA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Unregister_Device_InterfaceW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Unregister_Device_InterfaceW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Unregister_Device_Interface_ExA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Unregister_Device_Interface_ExA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Unregister_Device_Interface_ExW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Unregister_Device_Interface_ExW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Unregister_Notification", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Unregister_Notification_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_DiInstallDevice", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_DiInstallDevice_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_DiInstallDriverA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_DiInstallDriverA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_DiInstallDriverW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_DiInstallDriverW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_DiRollbackDriver", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_DiRollbackDriver_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_DiShowUpdateDevice", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_DiShowUpdateDevice_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_DiShowUpdateDriver", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_DiShowUpdateDriver_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_DiUninstallDevice", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_DiUninstallDevice_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_DiUninstallDriverA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_DiUninstallDriverA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_DiUninstallDriverW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_DiUninstallDriverW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_InstallHinfSectionA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_InstallHinfSectionA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_InstallHinfSectionW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_InstallHinfSectionW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupAddInstallSectionToDiskSpaceListA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupAddInstallSectionToDiskSpaceListA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupAddInstallSectionToDiskSpaceListW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupAddInstallSectionToDiskSpaceListW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupAddSectionToDiskSpaceListA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupAddSectionToDiskSpaceListA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupAddSectionToDiskSpaceListW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupAddSectionToDiskSpaceListW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupAddToDiskSpaceListA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupAddToDiskSpaceListA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupAddToDiskSpaceListW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupAddToDiskSpaceListW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupAddToSourceListA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupAddToSourceListA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupAddToSourceListW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupAddToSourceListW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupAdjustDiskSpaceListA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupAdjustDiskSpaceListA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupAdjustDiskSpaceListW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupAdjustDiskSpaceListW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupBackupErrorA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupBackupErrorA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupBackupErrorW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupBackupErrorW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupCancelTemporarySourceList", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupCancelTemporarySourceList_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupCloseFileQueue", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupCloseFileQueue_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupCloseInfFile", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupCloseInfFile_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupCloseLog", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupCloseLog_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupCommitFileQueueA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupCommitFileQueueA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupCommitFileQueueW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupCommitFileQueueW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupConfigureWmiFromInfSectionA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupConfigureWmiFromInfSectionA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupConfigureWmiFromInfSectionW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupConfigureWmiFromInfSectionW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupCopyErrorA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupCopyErrorA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupCopyErrorW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupCopyErrorW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupCopyOEMInfA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupCopyOEMInfA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupCopyOEMInfW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupCopyOEMInfW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupCreateDiskSpaceListA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupCreateDiskSpaceListA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupCreateDiskSpaceListW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupCreateDiskSpaceListW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDecompressOrCopyFileA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDecompressOrCopyFileA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDecompressOrCopyFileW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDecompressOrCopyFileW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDefaultQueueCallbackA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDefaultQueueCallbackA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDefaultQueueCallbackW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDefaultQueueCallbackW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDeleteErrorA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDeleteErrorA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDeleteErrorW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDeleteErrorW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDestroyDiskSpaceList", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDestroyDiskSpaceList_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiAskForOEMDisk", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiAskForOEMDisk_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiBuildClassInfoList", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiBuildClassInfoList_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiBuildClassInfoListExA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiBuildClassInfoListExA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiBuildClassInfoListExW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiBuildClassInfoListExW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiBuildDriverInfoList", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiBuildDriverInfoList_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiCallClassInstaller", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiCallClassInstaller_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiCancelDriverInfoSearch", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiCancelDriverInfoSearch_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiChangeState", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiChangeState_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiClassGuidsFromNameA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiClassGuidsFromNameA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiClassGuidsFromNameExA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiClassGuidsFromNameExA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiClassGuidsFromNameExW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiClassGuidsFromNameExW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiClassGuidsFromNameW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiClassGuidsFromNameW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiClassNameFromGuidA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiClassNameFromGuidA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiClassNameFromGuidExA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiClassNameFromGuidExA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiClassNameFromGuidExW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiClassNameFromGuidExW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiClassNameFromGuidW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiClassNameFromGuidW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiCreateDevRegKeyA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiCreateDevRegKeyA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiCreateDevRegKeyW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiCreateDevRegKeyW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiCreateDeviceInfoA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiCreateDeviceInfoA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiCreateDeviceInfoList", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiCreateDeviceInfoList_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiCreateDeviceInfoListExA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiCreateDeviceInfoListExA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiCreateDeviceInfoListExW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiCreateDeviceInfoListExW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiCreateDeviceInfoW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiCreateDeviceInfoW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiCreateDeviceInterfaceA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiCreateDeviceInterfaceA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiCreateDeviceInterfaceRegKeyA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiCreateDeviceInterfaceRegKeyA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiCreateDeviceInterfaceRegKeyW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiCreateDeviceInterfaceRegKeyW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiCreateDeviceInterfaceW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiCreateDeviceInterfaceW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiDeleteDevRegKey", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiDeleteDevRegKey_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiDeleteDeviceInfo", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiDeleteDeviceInfo_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiDeleteDeviceInterfaceData", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiDeleteDeviceInterfaceData_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiDeleteDeviceInterfaceRegKey", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiDeleteDeviceInterfaceRegKey_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiDestroyClassImageList", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiDestroyClassImageList_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiDestroyDeviceInfoList", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiDestroyDeviceInfoList_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiDestroyDriverInfoList", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiDestroyDriverInfoList_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiEnumDeviceInfo", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiEnumDeviceInfo_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiEnumDeviceInterfaces", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiEnumDeviceInterfaces_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiEnumDriverInfoA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiEnumDriverInfoA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiEnumDriverInfoW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiEnumDriverInfoW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetActualModelsSectionA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetActualModelsSectionA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetActualModelsSectionW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetActualModelsSectionW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetActualSectionToInstallA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetActualSectionToInstallA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetActualSectionToInstallExA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetActualSectionToInstallExA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetActualSectionToInstallExW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetActualSectionToInstallExW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetActualSectionToInstallW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetActualSectionToInstallW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassBitmapIndex", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassBitmapIndex_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassDescriptionA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassDescriptionA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassDescriptionExA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassDescriptionExA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassDescriptionExW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassDescriptionExW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassDescriptionW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassDescriptionW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassDevPropertySheetsA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassDevPropertySheetsA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassDevPropertySheetsW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassDevPropertySheetsW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassDevsA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassDevsA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassDevsExA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassDevsExA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassDevsExW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassDevsExW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassDevsW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassDevsW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassImageIndex", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassImageIndex_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassImageList", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassImageList_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassImageListExA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassImageListExA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassImageListExW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassImageListExW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassInstallParamsA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassInstallParamsA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassInstallParamsW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassInstallParamsW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassPropertyExW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassPropertyExW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassPropertyKeys", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassPropertyKeys_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassPropertyKeysExW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassPropertyKeysExW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassPropertyW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassPropertyW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassRegistryPropertyA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassRegistryPropertyA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassRegistryPropertyW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassRegistryPropertyW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetCustomDevicePropertyA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetCustomDevicePropertyA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetCustomDevicePropertyW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetCustomDevicePropertyW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetDeviceInfoListClass", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetDeviceInfoListClass_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetDeviceInfoListDetailA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetDeviceInfoListDetailA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetDeviceInfoListDetailW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetDeviceInfoListDetailW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetDeviceInstallParamsA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetDeviceInstallParamsA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetDeviceInstallParamsW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetDeviceInstallParamsW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetDeviceInstanceIdA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetDeviceInstanceIdA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetDeviceInstanceIdW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetDeviceInstanceIdW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetDeviceInterfaceAlias", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetDeviceInterfaceAlias_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetDeviceInterfaceDetailA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetDeviceInterfaceDetailA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetDeviceInterfaceDetailW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetDeviceInterfaceDetailW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetDeviceInterfacePropertyKeys", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetDeviceInterfacePropertyKeys_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetDeviceInterfacePropertyW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetDeviceInterfacePropertyW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetDevicePropertyKeys", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetDevicePropertyKeys_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetDevicePropertyW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetDevicePropertyW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetDeviceRegistryPropertyA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetDeviceRegistryPropertyA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetDeviceRegistryPropertyW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetDeviceRegistryPropertyW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetDriverInfoDetailA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetDriverInfoDetailA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetDriverInfoDetailW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetDriverInfoDetailW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetDriverInstallParamsA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetDriverInstallParamsA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetDriverInstallParamsW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetDriverInstallParamsW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetHwProfileFriendlyNameA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetHwProfileFriendlyNameA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetHwProfileFriendlyNameExA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetHwProfileFriendlyNameExA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetHwProfileFriendlyNameExW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetHwProfileFriendlyNameExW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetHwProfileFriendlyNameW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetHwProfileFriendlyNameW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetHwProfileList", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetHwProfileList_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetHwProfileListExA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetHwProfileListExA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetHwProfileListExW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetHwProfileListExW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetINFClassA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetINFClassA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetINFClassW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetINFClassW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetSelectedDevice", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetSelectedDevice_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetSelectedDriverA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetSelectedDriverA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetSelectedDriverW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetSelectedDriverW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetWizardPage", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetWizardPage_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiInstallClassA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiInstallClassA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiInstallClassExA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiInstallClassExA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiInstallClassExW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiInstallClassExW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiInstallClassW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiInstallClassW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiInstallDevice", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiInstallDevice_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiInstallDeviceInterfaces", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiInstallDeviceInterfaces_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiInstallDriverFiles", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiInstallDriverFiles_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiLoadClassIcon", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiLoadClassIcon_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiLoadDeviceIcon", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiLoadDeviceIcon_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiOpenClassRegKey", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiOpenClassRegKey_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiOpenClassRegKeyExA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiOpenClassRegKeyExA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiOpenClassRegKeyExW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiOpenClassRegKeyExW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiOpenDevRegKey", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiOpenDevRegKey_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiOpenDeviceInfoA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiOpenDeviceInfoA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiOpenDeviceInfoW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiOpenDeviceInfoW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiOpenDeviceInterfaceA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiOpenDeviceInterfaceA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiOpenDeviceInterfaceRegKey", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiOpenDeviceInterfaceRegKey_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiOpenDeviceInterfaceW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiOpenDeviceInterfaceW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiRegisterCoDeviceInstallers", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiRegisterCoDeviceInstallers_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiRegisterDeviceInfo", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiRegisterDeviceInfo_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiRemoveDevice", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiRemoveDevice_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiRemoveDeviceInterface", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiRemoveDeviceInterface_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiRestartDevices", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiRestartDevices_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiSelectBestCompatDrv", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiSelectBestCompatDrv_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiSelectDevice", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiSelectDevice_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiSelectOEMDrv", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiSelectOEMDrv_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiSetClassInstallParamsA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiSetClassInstallParamsA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiSetClassInstallParamsW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiSetClassInstallParamsW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiSetClassPropertyExW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiSetClassPropertyExW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiSetClassPropertyW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiSetClassPropertyW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiSetClassRegistryPropertyA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiSetClassRegistryPropertyA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiSetClassRegistryPropertyW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiSetClassRegistryPropertyW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiSetDeviceInstallParamsA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiSetDeviceInstallParamsA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiSetDeviceInstallParamsW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiSetDeviceInstallParamsW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiSetDeviceInterfaceDefault", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiSetDeviceInterfaceDefault_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiSetDeviceInterfacePropertyW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiSetDeviceInterfacePropertyW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiSetDevicePropertyW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiSetDevicePropertyW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiSetDeviceRegistryPropertyA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiSetDeviceRegistryPropertyA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiSetDeviceRegistryPropertyW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiSetDeviceRegistryPropertyW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiSetDriverInstallParamsA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiSetDriverInstallParamsA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiSetDriverInstallParamsW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiSetDriverInstallParamsW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiSetSelectedDevice", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiSetSelectedDevice_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiSetSelectedDriverA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiSetSelectedDriverA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiSetSelectedDriverW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiSetSelectedDriverW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiUnremoveDevice", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiUnremoveDevice_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDuplicateDiskSpaceListA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDuplicateDiskSpaceListA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDuplicateDiskSpaceListW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDuplicateDiskSpaceListW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupEnumInfSectionsA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupEnumInfSectionsA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupEnumInfSectionsW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupEnumInfSectionsW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupFindFirstLineA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupFindFirstLineA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupFindFirstLineW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupFindFirstLineW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupFindNextLine", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupFindNextLine_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupFindNextMatchLineA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupFindNextMatchLineA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupFindNextMatchLineW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupFindNextMatchLineW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupFreeSourceListA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupFreeSourceListA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupFreeSourceListW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupFreeSourceListW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetBackupInformationA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetBackupInformationA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetBackupInformationW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetBackupInformationW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetBinaryField", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetBinaryField_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetFieldCount", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetFieldCount_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetFileCompressionInfoA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetFileCompressionInfoA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetFileCompressionInfoExA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetFileCompressionInfoExA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetFileCompressionInfoExW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetFileCompressionInfoExW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetFileCompressionInfoW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetFileCompressionInfoW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetFileQueueCount", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetFileQueueCount_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetFileQueueFlags", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetFileQueueFlags_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetInfDriverStoreLocationA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetInfDriverStoreLocationA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetInfDriverStoreLocationW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetInfDriverStoreLocationW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetInfFileListA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetInfFileListA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetInfFileListW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetInfFileListW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetInfInformationA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetInfInformationA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetInfInformationW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetInfInformationW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetInfPublishedNameA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetInfPublishedNameA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetInfPublishedNameW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetInfPublishedNameW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetIntField", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetIntField_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetLineByIndexA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetLineByIndexA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetLineByIndexW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetLineByIndexW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetLineCountA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetLineCountA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetLineCountW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetLineCountW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetLineTextA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetLineTextA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetLineTextW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetLineTextW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetMultiSzFieldA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetMultiSzFieldA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetMultiSzFieldW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetMultiSzFieldW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetNonInteractiveMode", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetNonInteractiveMode_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetSourceFileLocationA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetSourceFileLocationA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetSourceFileLocationW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetSourceFileLocationW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetSourceFileSizeA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetSourceFileSizeA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetSourceFileSizeW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetSourceFileSizeW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetSourceInfoA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetSourceInfoA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetSourceInfoW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetSourceInfoW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetStringFieldA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetStringFieldA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetStringFieldW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetStringFieldW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetTargetPathA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetTargetPathA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetTargetPathW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetTargetPathW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetThreadLogToken", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetThreadLogToken_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupInitDefaultQueueCallback", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupInitDefaultQueueCallback_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupInitDefaultQueueCallbackEx", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupInitDefaultQueueCallbackEx_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupInitializeFileLogA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupInitializeFileLogA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupInitializeFileLogW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupInitializeFileLogW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupInstallFileA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupInstallFileA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupInstallFileExA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupInstallFileExA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupInstallFileExW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupInstallFileExW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupInstallFileW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupInstallFileW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupInstallFilesFromInfSectionA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupInstallFilesFromInfSectionA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupInstallFilesFromInfSectionW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupInstallFilesFromInfSectionW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupInstallFromInfSectionA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupInstallFromInfSectionA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupInstallFromInfSectionW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupInstallFromInfSectionW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupInstallServicesFromInfSectionA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupInstallServicesFromInfSectionA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupInstallServicesFromInfSectionExA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupInstallServicesFromInfSectionExA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupInstallServicesFromInfSectionExW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupInstallServicesFromInfSectionExW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupInstallServicesFromInfSectionW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupInstallServicesFromInfSectionW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupIterateCabinetA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupIterateCabinetA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupIterateCabinetW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupIterateCabinetW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupLogErrorA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupLogErrorA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupLogErrorW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupLogErrorW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupLogFileA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupLogFileA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupLogFileW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupLogFileW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupOpenAppendInfFileA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupOpenAppendInfFileA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupOpenAppendInfFileW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupOpenAppendInfFileW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupOpenFileQueue", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupOpenFileQueue_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupOpenInfFileA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupOpenInfFileA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupOpenInfFileW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupOpenInfFileW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupOpenLog", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupOpenLog_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupOpenMasterInf", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupOpenMasterInf_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupPrepareQueueForRestoreA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupPrepareQueueForRestoreA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupPrepareQueueForRestoreW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupPrepareQueueForRestoreW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupPromptForDiskA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupPromptForDiskA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupPromptForDiskW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupPromptForDiskW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupPromptReboot", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupPromptReboot_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueryDrivesInDiskSpaceListA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueryDrivesInDiskSpaceListA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueryDrivesInDiskSpaceListW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueryDrivesInDiskSpaceListW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueryFileLogA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueryFileLogA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueryFileLogW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueryFileLogW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueryInfFileInformationA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueryInfFileInformationA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueryInfFileInformationW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueryInfFileInformationW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueryInfOriginalFileInformationA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueryInfOriginalFileInformationA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueryInfOriginalFileInformationW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueryInfOriginalFileInformationW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueryInfVersionInformationA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueryInfVersionInformationA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueryInfVersionInformationW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueryInfVersionInformationW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQuerySourceListA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQuerySourceListA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQuerySourceListW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQuerySourceListW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQuerySpaceRequiredOnDriveA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQuerySpaceRequiredOnDriveA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQuerySpaceRequiredOnDriveW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQuerySpaceRequiredOnDriveW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueueCopyA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueueCopyA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueueCopyIndirectA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueueCopyIndirectA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueueCopyIndirectW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueueCopyIndirectW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueueCopySectionA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueueCopySectionA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueueCopySectionW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueueCopySectionW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueueCopyW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueueCopyW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueueDefaultCopyA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueueDefaultCopyA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueueDefaultCopyW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueueDefaultCopyW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueueDeleteA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueueDeleteA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueueDeleteSectionA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueueDeleteSectionA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueueDeleteSectionW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueueDeleteSectionW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueueDeleteW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueueDeleteW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueueRenameA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueueRenameA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueueRenameSectionA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueueRenameSectionA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueueRenameSectionW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueueRenameSectionW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueueRenameW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueueRenameW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupRemoveFileLogEntryA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupRemoveFileLogEntryA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupRemoveFileLogEntryW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupRemoveFileLogEntryW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupRemoveFromDiskSpaceListA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupRemoveFromDiskSpaceListA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupRemoveFromDiskSpaceListW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupRemoveFromDiskSpaceListW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupRemoveFromSourceListA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupRemoveFromSourceListA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupRemoveFromSourceListW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupRemoveFromSourceListW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupRemoveInstallSectionFromDiskSpaceListA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupRemoveInstallSectionFromDiskSpaceListA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupRemoveInstallSectionFromDiskSpaceListW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupRemoveInstallSectionFromDiskSpaceListW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupRemoveSectionFromDiskSpaceListA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupRemoveSectionFromDiskSpaceListA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupRemoveSectionFromDiskSpaceListW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupRemoveSectionFromDiskSpaceListW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupRenameErrorA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupRenameErrorA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupRenameErrorW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupRenameErrorW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupScanFileQueueA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupScanFileQueueA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupScanFileQueueW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupScanFileQueueW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupSetDirectoryIdA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupSetDirectoryIdA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupSetDirectoryIdExA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupSetDirectoryIdExA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupSetDirectoryIdExW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupSetDirectoryIdExW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupSetDirectoryIdW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupSetDirectoryIdW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupSetFileQueueAlternatePlatformA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupSetFileQueueAlternatePlatformA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupSetFileQueueAlternatePlatformW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupSetFileQueueAlternatePlatformW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupSetFileQueueFlags", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupSetFileQueueFlags_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupSetNonInteractiveMode", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupSetNonInteractiveMode_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupSetPlatformPathOverrideA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupSetPlatformPathOverrideA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupSetPlatformPathOverrideW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupSetPlatformPathOverrideW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupSetSourceListA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupSetSourceListA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupSetSourceListW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupSetSourceListW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupSetThreadLogToken", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupSetThreadLogToken_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupTermDefaultQueueCallback", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupTermDefaultQueueCallback_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupTerminateFileLog", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupTerminateFileLog_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupUninstallNewlyCopiedInfs", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupUninstallNewlyCopiedInfs_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupUninstallOEMInfA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupUninstallOEMInfA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupUninstallOEMInfW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupUninstallOEMInfW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupVerifyInfFileA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupVerifyInfFileA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupVerifyInfFileW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupVerifyInfFileW_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_SetupWriteTextLogInfLine", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_SetupWriteTextLogInfLine_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_UpdateDriverForPlugAndPlayDevicesA", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_UpdateDriverForPlugAndPlayDevicesA_napi));
    exports.Set("windowssys_windows_win32_devices_deviceanddriverinstallation_UpdateDriverForPlugAndPlayDevicesW", Napi::Function::New(env, windowssys_windows_win32_devices_deviceanddriverinstallation_UpdateDriverForPlugAndPlayDevicesW_napi));
}

static KmNapiRegistrarNode registrar_node = { &register_windows_win32_devices_deviceanddriverinstallation_napi, nullptr };
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
