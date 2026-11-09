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

static Napi::Value windowssys_windows_win32_system_systeminformation_DnsHostnameToComputerNameExW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hostname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* computername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* nsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DnsHostnameToComputerNameExW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hostname, computername, nsize) : -1;
#else
    (void)hostname;
    (void)computername;
    (void)nsize;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_systeminformation_EnumSystemFirmwareTables_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t firmwaretableprovidersignature = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* pfirmwaretableenumbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t buffersize = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "EnumSystemFirmwareTables")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(firmwaretableprovidersignature, pfirmwaretableenumbuffer, buffersize) : 0;
#else
    (void)firmwaretableprovidersignature;
    (void)pfirmwaretableenumbuffer;
    (void)buffersize;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_systeminformation_GetComputerNameExA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t nametype = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* lpbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* nsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetComputerNameExA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(nametype, lpbuffer, nsize) : -1;
#else
    (void)nametype;
    (void)lpbuffer;
    (void)nsize;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_systeminformation_GetComputerNameExW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t nametype = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* lpbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* nsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetComputerNameExW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(nametype, lpbuffer, nsize) : -1;
#else
    (void)nametype;
    (void)lpbuffer;
    (void)nsize;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_systeminformation_GetDeveloperDriveEnablementState_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-sysinfo-l1-2-6.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetDeveloperDriveEnablementState")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_systeminformation_GetFirmwareType_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* firmwaretype = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetFirmwareType")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(firmwaretype) : -1;
#else
    (void)firmwaretype;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_systeminformation_GetIntegratedDisplaySize_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* sizeininches = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-sysinfo-l1-2-3.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetIntegratedDisplaySize")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sizeininches) : -1;
#else
    (void)sizeininches;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_systeminformation_GetLocalTime_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpsystemtime = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetLocalTime")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(lpsystemtime);
#else
    (void)lpsystemtime;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_systeminformation_GetLogicalProcessorInformation_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* returnedlength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetLogicalProcessorInformation")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(buffer, returnedlength) : -1;
#else
    (void)buffer;
    (void)returnedlength;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_systeminformation_GetLogicalProcessorInformationEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t relationshiptype = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* returnedlength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetLogicalProcessorInformationEx")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(relationshiptype, buffer, returnedlength) : -1;
#else
    (void)relationshiptype;
    (void)buffer;
    (void)returnedlength;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_systeminformation_GetNativeSystemInfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpsysteminfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetNativeSystemInfo")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(lpsysteminfo);
#else
    (void)lpsysteminfo;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_systeminformation_GetOsManufacturingMode_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pbenabled = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-sysinfo-l1-2-3.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetOsManufacturingMode")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pbenabled) : -1;
#else
    (void)pbenabled;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_systeminformation_GetOsSafeBootMode_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* flags = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-sysinfo-l1-2-0.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetOsSafeBootMode")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(flags) : -1;
#else
    (void)flags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_systeminformation_GetPhysicallyInstalledSystemMemory_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* totalmemoryinkilobytes = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetPhysicallyInstalledSystemMemory")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(totalmemoryinkilobytes) : -1;
#else
    (void)totalmemoryinkilobytes;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_systeminformation_GetProcessorSystemCycleTime_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint16_t group = static_cast<uint16_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* returnedlength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint16_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetProcessorSystemCycleTime")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(group, buffer, returnedlength) : -1;
#else
    (void)group;
    (void)buffer;
    (void)returnedlength;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_systeminformation_GetProductInfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwosmajorversion = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t dwosminorversion = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t dwspmajorversion = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t dwspminorversion = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* pdwreturnedproducttype = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetProductInfo")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwosmajorversion, dwosminorversion, dwspmajorversion, dwspminorversion, pdwreturnedproducttype) : -1;
#else
    (void)dwosmajorversion;
    (void)dwosminorversion;
    (void)dwspmajorversion;
    (void)dwspminorversion;
    (void)pdwreturnedproducttype;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_systeminformation_GetSystemCpuSetInformation_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* information = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t bufferlength = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* returnedlength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* process = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetSystemCpuSetInformation")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(information, bufferlength, returnedlength, process, flags) : -1;
#else
    (void)information;
    (void)bufferlength;
    (void)returnedlength;
    (void)process;
    (void)flags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_systeminformation_GetSystemDEPPolicy_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetSystemDEPPolicy")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_systeminformation_GetSystemDirectoryA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t usize = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetSystemDirectoryA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpbuffer, usize) : 0;
#else
    (void)lpbuffer;
    (void)usize;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_systeminformation_GetSystemDirectoryW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t usize = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetSystemDirectoryW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpbuffer, usize) : 0;
#else
    (void)lpbuffer;
    (void)usize;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_systeminformation_GetSystemFirmwareTable_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t firmwaretableprovidersignature = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t firmwaretableid = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pfirmwaretablebuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t buffersize = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetSystemFirmwareTable")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(firmwaretableprovidersignature, firmwaretableid, pfirmwaretablebuffer, buffersize) : 0;
#else
    (void)firmwaretableprovidersignature;
    (void)firmwaretableid;
    (void)pfirmwaretablebuffer;
    (void)buffersize;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_systeminformation_GetSystemInfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpsysteminfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetSystemInfo")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(lpsysteminfo);
#else
    (void)lpsysteminfo;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_systeminformation_GetSystemLeapSecondInformation_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enabled = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* flags = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetSystemLeapSecondInformation")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enabled, flags) : -1;
#else
    (void)enabled;
    (void)flags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_systeminformation_GetSystemTime_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpsystemtime = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetSystemTime")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(lpsystemtime);
#else
    (void)lpsystemtime;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_systeminformation_GetSystemTimeAdjustment_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lptimeadjustment = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lptimeincrement = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* lptimeadjustmentdisabled = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetSystemTimeAdjustment")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lptimeadjustment, lptimeincrement, lptimeadjustmentdisabled) : -1;
#else
    (void)lptimeadjustment;
    (void)lptimeincrement;
    (void)lptimeadjustmentdisabled;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_systeminformation_GetSystemTimeAdjustmentPrecise_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lptimeadjustment = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lptimeincrement = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* lptimeadjustmentdisabled = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-sysinfo-l1-2-4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetSystemTimeAdjustmentPrecise")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lptimeadjustment, lptimeincrement, lptimeadjustmentdisabled) : -1;
#else
    (void)lptimeadjustment;
    (void)lptimeincrement;
    (void)lptimeadjustmentdisabled;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_systeminformation_GetSystemTimeAsFileTime_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpsystemtimeasfiletime = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetSystemTimeAsFileTime")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(lpsystemtimeasfiletime);
#else
    (void)lpsystemtimeasfiletime;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_systeminformation_GetSystemTimePreciseAsFileTime_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpsystemtimeasfiletime = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetSystemTimePreciseAsFileTime")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(lpsystemtimeasfiletime);
#else
    (void)lpsystemtimeasfiletime;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_systeminformation_GetSystemWindowsDirectoryA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t usize = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetSystemWindowsDirectoryA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpbuffer, usize) : 0;
#else
    (void)lpbuffer;
    (void)usize;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_systeminformation_GetSystemWindowsDirectoryW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t usize = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetSystemWindowsDirectoryW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpbuffer, usize) : 0;
#else
    (void)lpbuffer;
    (void)usize;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_systeminformation_GetSystemWow64Directory2A_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t usize = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint16_t imagefilemachinetype = static_cast<uint16_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint16_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-wow64-l1-1-1.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetSystemWow64Directory2A")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpbuffer, usize, imagefilemachinetype) : 0;
#else
    (void)lpbuffer;
    (void)usize;
    (void)imagefilemachinetype;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_systeminformation_GetSystemWow64Directory2W_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t usize = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint16_t imagefilemachinetype = static_cast<uint16_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint16_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-wow64-l1-1-1.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetSystemWow64Directory2W")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpbuffer, usize, imagefilemachinetype) : 0;
#else
    (void)lpbuffer;
    (void)usize;
    (void)imagefilemachinetype;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_systeminformation_GetSystemWow64DirectoryA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t usize = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetSystemWow64DirectoryA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpbuffer, usize) : 0;
#else
    (void)lpbuffer;
    (void)usize;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_systeminformation_GetSystemWow64DirectoryW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t usize = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetSystemWow64DirectoryW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpbuffer, usize) : 0;
#else
    (void)lpbuffer;
    (void)usize;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_systeminformation_GetTickCount_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetTickCount")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr() : 0;
#else
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_systeminformation_GetTickCount64_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetTickCount64")));
    }
    uint64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr() : 0;
#else
    uint64_t km_res = 0;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<uint64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_system_systeminformation_GetVersion_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetVersion")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr() : 0;
#else
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_systeminformation_GetVersionExA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpversioninformation = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetVersionExA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpversioninformation) : -1;
#else
    (void)lpversioninformation;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_systeminformation_GetVersionExW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpversioninformation = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetVersionExW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpversioninformation) : -1;
#else
    (void)lpversioninformation;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_systeminformation_GetWindowsDirectoryA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t usize = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetWindowsDirectoryA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpbuffer, usize) : 0;
#else
    (void)lpbuffer;
    (void)usize;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_systeminformation_GetWindowsDirectoryW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t usize = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetWindowsDirectoryW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpbuffer, usize) : 0;
#else
    (void)lpbuffer;
    (void)usize;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_systeminformation_GlobalMemoryStatus_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GlobalMemoryStatus")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(lpbuffer);
#else
    (void)lpbuffer;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_systeminformation_GlobalMemoryStatusEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GlobalMemoryStatusEx")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpbuffer) : -1;
#else
    (void)lpbuffer;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_systeminformation_IsUserCetAvailableInEnvironment_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t usercetenvironment = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IsUserCetAvailableInEnvironment")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(usercetenvironment) : -1;
#else
    (void)usercetenvironment;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_systeminformation_IsWow64GuestMachineSupported_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint16_t wowguestmachine = static_cast<uint16_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* machineissupported = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint16_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IsWow64GuestMachineSupported")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(wowguestmachine, machineissupported) : -1;
#else
    (void)wowguestmachine;
    (void)machineissupported;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_systeminformation_RtlConvertDeviceFamilyInfoToString_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* puldevicefamilybuffersize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* puldeviceformbuffersize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* devicefamily = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* deviceform = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtlConvertDeviceFamilyInfoToString")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(puldevicefamilybuffersize, puldeviceformbuffersize, devicefamily, deviceform) : 0;
#else
    (void)puldevicefamilybuffersize;
    (void)puldeviceformbuffersize;
    (void)devicefamily;
    (void)deviceform;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_systeminformation_RtlGetDeviceFamilyInfoEnum_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pulluapinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* puldevicefamily = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* puldeviceform = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtlGetDeviceFamilyInfoEnum")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(pulluapinfo, puldevicefamily, puldeviceform);
#else
    (void)pulluapinfo;
    (void)puldevicefamily;
    (void)puldeviceform;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_systeminformation_RtlGetProductInfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t osmajorversion = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t osminorversion = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t spmajorversion = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t spminorversion = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* returnedproducttype = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtlGetProductInfo")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(osmajorversion, osminorversion, spmajorversion, spminorversion, returnedproducttype) : false;
#else
    (void)osmajorversion;
    (void)osminorversion;
    (void)spmajorversion;
    (void)spminorversion;
    (void)returnedproducttype;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_win32_system_systeminformation_RtlGetSystemGlobalData_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t dataid = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t size = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdllk.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtlGetSystemGlobalData")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dataid, buffer, size) : 0;
#else
    (void)dataid;
    (void)buffer;
    (void)size;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_systeminformation_RtlOsDeploymentState_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtlOsDeploymentState")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(flags) : -1;
#else
    (void)flags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_systeminformation_RtlSwitchedVVI_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* versioninfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t typemask = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint64_t conditionmask = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtlSwitchedVVI")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(versioninfo, typemask, conditionmask) : 0;
#else
    (void)versioninfo;
    (void)typemask;
    (void)conditionmask;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_systeminformation_SetComputerNameA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpcomputername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetComputerNameA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpcomputername) : -1;
#else
    (void)lpcomputername;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_systeminformation_SetComputerNameEx2W_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t nametype = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* lpbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetComputerNameEx2W")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(nametype, flags, lpbuffer) : -1;
#else
    (void)nametype;
    (void)flags;
    (void)lpbuffer;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_systeminformation_SetComputerNameExA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t nametype = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* lpbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetComputerNameExA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(nametype, lpbuffer) : -1;
#else
    (void)nametype;
    (void)lpbuffer;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_systeminformation_SetComputerNameExW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t nametype = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* lpbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetComputerNameExW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(nametype, lpbuffer) : -1;
#else
    (void)nametype;
    (void)lpbuffer;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_systeminformation_SetComputerNameW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpcomputername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetComputerNameW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpcomputername) : -1;
#else
    (void)lpcomputername;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_systeminformation_SetLocalTime_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpsystemtime = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetLocalTime")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpsystemtime) : -1;
#else
    (void)lpsystemtime;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_systeminformation_SetSystemTime_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpsystemtime = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetSystemTime")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpsystemtime) : -1;
#else
    (void)lpsystemtime;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_systeminformation_SetSystemTimeAdjustment_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwtimeadjustment = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    int32_t btimeadjustmentdisabled = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetSystemTimeAdjustment")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwtimeadjustment, btimeadjustmentdisabled) : -1;
#else
    (void)dwtimeadjustment;
    (void)btimeadjustmentdisabled;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_systeminformation_SetSystemTimeAdjustmentPrecise_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t dwtimeadjustment = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    int32_t btimeadjustmentdisabled = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-sysinfo-l1-2-4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetSystemTimeAdjustmentPrecise")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwtimeadjustment, btimeadjustmentdisabled) : -1;
#else
    (void)dwtimeadjustment;
    (void)btimeadjustmentdisabled;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_systeminformation_VerSetConditionMask_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t conditionmask = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint32_t typemask = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint8_t condition = static_cast<uint8_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(uint64_t, uint32_t, uint8_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "VerSetConditionMask")));
    }
    uint64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(conditionmask, typemask, condition) : 0;
#else
    (void)conditionmask;
    (void)typemask;
    (void)condition;
    uint64_t km_res = 0;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<uint64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_system_systeminformation_VerifyVersionInfoA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpversioninformation = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwtypemask = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint64_t dwlconditionmask = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "VerifyVersionInfoA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpversioninformation, dwtypemask, dwlconditionmask) : -1;
#else
    (void)lpversioninformation;
    (void)dwtypemask;
    (void)dwlconditionmask;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_systeminformation_VerifyVersionInfoW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpversioninformation = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwtypemask = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint64_t dwlconditionmask = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "VerifyVersionInfoW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpversioninformation, dwtypemask, dwlconditionmask) : -1;
#else
    (void)lpversioninformation;
    (void)dwtypemask;
    (void)dwlconditionmask;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static void register_windows_win32_system_systeminformation_napi(Napi::Env env, Napi::Object exports) {
    exports.Set("windowssys_windows_win32_system_systeminformation_DnsHostnameToComputerNameExW", Napi::Function::New(env, windowssys_windows_win32_system_systeminformation_DnsHostnameToComputerNameExW_napi));
    exports.Set("windowssys_windows_win32_system_systeminformation_EnumSystemFirmwareTables", Napi::Function::New(env, windowssys_windows_win32_system_systeminformation_EnumSystemFirmwareTables_napi));
    exports.Set("windowssys_windows_win32_system_systeminformation_GetComputerNameExA", Napi::Function::New(env, windowssys_windows_win32_system_systeminformation_GetComputerNameExA_napi));
    exports.Set("windowssys_windows_win32_system_systeminformation_GetComputerNameExW", Napi::Function::New(env, windowssys_windows_win32_system_systeminformation_GetComputerNameExW_napi));
    exports.Set("windowssys_windows_win32_system_systeminformation_GetDeveloperDriveEnablementState", Napi::Function::New(env, windowssys_windows_win32_system_systeminformation_GetDeveloperDriveEnablementState_napi));
    exports.Set("windowssys_windows_win32_system_systeminformation_GetFirmwareType", Napi::Function::New(env, windowssys_windows_win32_system_systeminformation_GetFirmwareType_napi));
    exports.Set("windowssys_windows_win32_system_systeminformation_GetIntegratedDisplaySize", Napi::Function::New(env, windowssys_windows_win32_system_systeminformation_GetIntegratedDisplaySize_napi));
    exports.Set("windowssys_windows_win32_system_systeminformation_GetLocalTime", Napi::Function::New(env, windowssys_windows_win32_system_systeminformation_GetLocalTime_napi));
    exports.Set("windowssys_windows_win32_system_systeminformation_GetLogicalProcessorInformation", Napi::Function::New(env, windowssys_windows_win32_system_systeminformation_GetLogicalProcessorInformation_napi));
    exports.Set("windowssys_windows_win32_system_systeminformation_GetLogicalProcessorInformationEx", Napi::Function::New(env, windowssys_windows_win32_system_systeminformation_GetLogicalProcessorInformationEx_napi));
    exports.Set("windowssys_windows_win32_system_systeminformation_GetNativeSystemInfo", Napi::Function::New(env, windowssys_windows_win32_system_systeminformation_GetNativeSystemInfo_napi));
    exports.Set("windowssys_windows_win32_system_systeminformation_GetOsManufacturingMode", Napi::Function::New(env, windowssys_windows_win32_system_systeminformation_GetOsManufacturingMode_napi));
    exports.Set("windowssys_windows_win32_system_systeminformation_GetOsSafeBootMode", Napi::Function::New(env, windowssys_windows_win32_system_systeminformation_GetOsSafeBootMode_napi));
    exports.Set("windowssys_windows_win32_system_systeminformation_GetPhysicallyInstalledSystemMemory", Napi::Function::New(env, windowssys_windows_win32_system_systeminformation_GetPhysicallyInstalledSystemMemory_napi));
    exports.Set("windowssys_windows_win32_system_systeminformation_GetProcessorSystemCycleTime", Napi::Function::New(env, windowssys_windows_win32_system_systeminformation_GetProcessorSystemCycleTime_napi));
    exports.Set("windowssys_windows_win32_system_systeminformation_GetProductInfo", Napi::Function::New(env, windowssys_windows_win32_system_systeminformation_GetProductInfo_napi));
    exports.Set("windowssys_windows_win32_system_systeminformation_GetSystemCpuSetInformation", Napi::Function::New(env, windowssys_windows_win32_system_systeminformation_GetSystemCpuSetInformation_napi));
    exports.Set("windowssys_windows_win32_system_systeminformation_GetSystemDEPPolicy", Napi::Function::New(env, windowssys_windows_win32_system_systeminformation_GetSystemDEPPolicy_napi));
    exports.Set("windowssys_windows_win32_system_systeminformation_GetSystemDirectoryA", Napi::Function::New(env, windowssys_windows_win32_system_systeminformation_GetSystemDirectoryA_napi));
    exports.Set("windowssys_windows_win32_system_systeminformation_GetSystemDirectoryW", Napi::Function::New(env, windowssys_windows_win32_system_systeminformation_GetSystemDirectoryW_napi));
    exports.Set("windowssys_windows_win32_system_systeminformation_GetSystemFirmwareTable", Napi::Function::New(env, windowssys_windows_win32_system_systeminformation_GetSystemFirmwareTable_napi));
    exports.Set("windowssys_windows_win32_system_systeminformation_GetSystemInfo", Napi::Function::New(env, windowssys_windows_win32_system_systeminformation_GetSystemInfo_napi));
    exports.Set("windowssys_windows_win32_system_systeminformation_GetSystemLeapSecondInformation", Napi::Function::New(env, windowssys_windows_win32_system_systeminformation_GetSystemLeapSecondInformation_napi));
    exports.Set("windowssys_windows_win32_system_systeminformation_GetSystemTime", Napi::Function::New(env, windowssys_windows_win32_system_systeminformation_GetSystemTime_napi));
    exports.Set("windowssys_windows_win32_system_systeminformation_GetSystemTimeAdjustment", Napi::Function::New(env, windowssys_windows_win32_system_systeminformation_GetSystemTimeAdjustment_napi));
    exports.Set("windowssys_windows_win32_system_systeminformation_GetSystemTimeAdjustmentPrecise", Napi::Function::New(env, windowssys_windows_win32_system_systeminformation_GetSystemTimeAdjustmentPrecise_napi));
    exports.Set("windowssys_windows_win32_system_systeminformation_GetSystemTimeAsFileTime", Napi::Function::New(env, windowssys_windows_win32_system_systeminformation_GetSystemTimeAsFileTime_napi));
    exports.Set("windowssys_windows_win32_system_systeminformation_GetSystemTimePreciseAsFileTime", Napi::Function::New(env, windowssys_windows_win32_system_systeminformation_GetSystemTimePreciseAsFileTime_napi));
    exports.Set("windowssys_windows_win32_system_systeminformation_GetSystemWindowsDirectoryA", Napi::Function::New(env, windowssys_windows_win32_system_systeminformation_GetSystemWindowsDirectoryA_napi));
    exports.Set("windowssys_windows_win32_system_systeminformation_GetSystemWindowsDirectoryW", Napi::Function::New(env, windowssys_windows_win32_system_systeminformation_GetSystemWindowsDirectoryW_napi));
    exports.Set("windowssys_windows_win32_system_systeminformation_GetSystemWow64Directory2A", Napi::Function::New(env, windowssys_windows_win32_system_systeminformation_GetSystemWow64Directory2A_napi));
    exports.Set("windowssys_windows_win32_system_systeminformation_GetSystemWow64Directory2W", Napi::Function::New(env, windowssys_windows_win32_system_systeminformation_GetSystemWow64Directory2W_napi));
    exports.Set("windowssys_windows_win32_system_systeminformation_GetSystemWow64DirectoryA", Napi::Function::New(env, windowssys_windows_win32_system_systeminformation_GetSystemWow64DirectoryA_napi));
    exports.Set("windowssys_windows_win32_system_systeminformation_GetSystemWow64DirectoryW", Napi::Function::New(env, windowssys_windows_win32_system_systeminformation_GetSystemWow64DirectoryW_napi));
    exports.Set("windowssys_windows_win32_system_systeminformation_GetTickCount", Napi::Function::New(env, windowssys_windows_win32_system_systeminformation_GetTickCount_napi));
    exports.Set("windowssys_windows_win32_system_systeminformation_GetTickCount64", Napi::Function::New(env, windowssys_windows_win32_system_systeminformation_GetTickCount64_napi));
    exports.Set("windowssys_windows_win32_system_systeminformation_GetVersion", Napi::Function::New(env, windowssys_windows_win32_system_systeminformation_GetVersion_napi));
    exports.Set("windowssys_windows_win32_system_systeminformation_GetVersionExA", Napi::Function::New(env, windowssys_windows_win32_system_systeminformation_GetVersionExA_napi));
    exports.Set("windowssys_windows_win32_system_systeminformation_GetVersionExW", Napi::Function::New(env, windowssys_windows_win32_system_systeminformation_GetVersionExW_napi));
    exports.Set("windowssys_windows_win32_system_systeminformation_GetWindowsDirectoryA", Napi::Function::New(env, windowssys_windows_win32_system_systeminformation_GetWindowsDirectoryA_napi));
    exports.Set("windowssys_windows_win32_system_systeminformation_GetWindowsDirectoryW", Napi::Function::New(env, windowssys_windows_win32_system_systeminformation_GetWindowsDirectoryW_napi));
    exports.Set("windowssys_windows_win32_system_systeminformation_GlobalMemoryStatus", Napi::Function::New(env, windowssys_windows_win32_system_systeminformation_GlobalMemoryStatus_napi));
    exports.Set("windowssys_windows_win32_system_systeminformation_GlobalMemoryStatusEx", Napi::Function::New(env, windowssys_windows_win32_system_systeminformation_GlobalMemoryStatusEx_napi));
    exports.Set("windowssys_windows_win32_system_systeminformation_IsUserCetAvailableInEnvironment", Napi::Function::New(env, windowssys_windows_win32_system_systeminformation_IsUserCetAvailableInEnvironment_napi));
    exports.Set("windowssys_windows_win32_system_systeminformation_IsWow64GuestMachineSupported", Napi::Function::New(env, windowssys_windows_win32_system_systeminformation_IsWow64GuestMachineSupported_napi));
    exports.Set("windowssys_windows_win32_system_systeminformation_RtlConvertDeviceFamilyInfoToString", Napi::Function::New(env, windowssys_windows_win32_system_systeminformation_RtlConvertDeviceFamilyInfoToString_napi));
    exports.Set("windowssys_windows_win32_system_systeminformation_RtlGetDeviceFamilyInfoEnum", Napi::Function::New(env, windowssys_windows_win32_system_systeminformation_RtlGetDeviceFamilyInfoEnum_napi));
    exports.Set("windowssys_windows_win32_system_systeminformation_RtlGetProductInfo", Napi::Function::New(env, windowssys_windows_win32_system_systeminformation_RtlGetProductInfo_napi));
    exports.Set("windowssys_windows_win32_system_systeminformation_RtlGetSystemGlobalData", Napi::Function::New(env, windowssys_windows_win32_system_systeminformation_RtlGetSystemGlobalData_napi));
    exports.Set("windowssys_windows_win32_system_systeminformation_RtlOsDeploymentState", Napi::Function::New(env, windowssys_windows_win32_system_systeminformation_RtlOsDeploymentState_napi));
    exports.Set("windowssys_windows_win32_system_systeminformation_RtlSwitchedVVI", Napi::Function::New(env, windowssys_windows_win32_system_systeminformation_RtlSwitchedVVI_napi));
    exports.Set("windowssys_windows_win32_system_systeminformation_SetComputerNameA", Napi::Function::New(env, windowssys_windows_win32_system_systeminformation_SetComputerNameA_napi));
    exports.Set("windowssys_windows_win32_system_systeminformation_SetComputerNameEx2W", Napi::Function::New(env, windowssys_windows_win32_system_systeminformation_SetComputerNameEx2W_napi));
    exports.Set("windowssys_windows_win32_system_systeminformation_SetComputerNameExA", Napi::Function::New(env, windowssys_windows_win32_system_systeminformation_SetComputerNameExA_napi));
    exports.Set("windowssys_windows_win32_system_systeminformation_SetComputerNameExW", Napi::Function::New(env, windowssys_windows_win32_system_systeminformation_SetComputerNameExW_napi));
    exports.Set("windowssys_windows_win32_system_systeminformation_SetComputerNameW", Napi::Function::New(env, windowssys_windows_win32_system_systeminformation_SetComputerNameW_napi));
    exports.Set("windowssys_windows_win32_system_systeminformation_SetLocalTime", Napi::Function::New(env, windowssys_windows_win32_system_systeminformation_SetLocalTime_napi));
    exports.Set("windowssys_windows_win32_system_systeminformation_SetSystemTime", Napi::Function::New(env, windowssys_windows_win32_system_systeminformation_SetSystemTime_napi));
    exports.Set("windowssys_windows_win32_system_systeminformation_SetSystemTimeAdjustment", Napi::Function::New(env, windowssys_windows_win32_system_systeminformation_SetSystemTimeAdjustment_napi));
    exports.Set("windowssys_windows_win32_system_systeminformation_SetSystemTimeAdjustmentPrecise", Napi::Function::New(env, windowssys_windows_win32_system_systeminformation_SetSystemTimeAdjustmentPrecise_napi));
    exports.Set("windowssys_windows_win32_system_systeminformation_VerSetConditionMask", Napi::Function::New(env, windowssys_windows_win32_system_systeminformation_VerSetConditionMask_napi));
    exports.Set("windowssys_windows_win32_system_systeminformation_VerifyVersionInfoA", Napi::Function::New(env, windowssys_windows_win32_system_systeminformation_VerifyVersionInfoA_napi));
    exports.Set("windowssys_windows_win32_system_systeminformation_VerifyVersionInfoW", Napi::Function::New(env, windowssys_windows_win32_system_systeminformation_VerifyVersionInfoW_napi));
}

static KmNapiRegistrarNode registrar_node = { &register_windows_win32_system_systeminformation_napi, nullptr };
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
