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

static Napi::Value windowssys_windows_win32_devices_biometricframework_WinBioAcquireFocus_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winbio.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WinBioAcquireFocus")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_biometricframework_WinBioAsyncEnumBiometricUnits_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t frameworkhandle = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t factor = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winbio.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WinBioAsyncEnumBiometricUnits")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(frameworkhandle, factor) : -1;
#else
    (void)frameworkhandle;
    (void)factor;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_biometricframework_WinBioAsyncEnumDatabases_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t frameworkhandle = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t factor = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winbio.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WinBioAsyncEnumDatabases")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(frameworkhandle, factor) : -1;
#else
    (void)frameworkhandle;
    (void)factor;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_biometricframework_WinBioAsyncEnumServiceProviders_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t frameworkhandle = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t factor = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winbio.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WinBioAsyncEnumServiceProviders")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(frameworkhandle, factor) : -1;
#else
    (void)frameworkhandle;
    (void)factor;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_biometricframework_WinBioAsyncMonitorFrameworkChanges_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t frameworkhandle = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t changetypes = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winbio.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WinBioAsyncMonitorFrameworkChanges")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(frameworkhandle, changetypes) : -1;
#else
    (void)frameworkhandle;
    (void)changetypes;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_biometricframework_WinBioAsyncOpenFramework_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t notificationmethod = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* targetwindow = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t messagecode = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* callbackroutine = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* userdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    int32_t asynchronousopen = static_cast<int32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* frameworkhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, uint32_t, void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winbio.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WinBioAsyncOpenFramework")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(notificationmethod, targetwindow, messagecode, callbackroutine, userdata, asynchronousopen, frameworkhandle) : -1;
#else
    (void)notificationmethod;
    (void)targetwindow;
    (void)messagecode;
    (void)callbackroutine;
    (void)userdata;
    (void)asynchronousopen;
    (void)frameworkhandle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_biometricframework_WinBioAsyncOpenSession_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t factor = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t pooltype = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* unitarray = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint64_t unitcount = km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0;
    void* databaseid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    int32_t notificationmethod = static_cast<int32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    void* targetwindow = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    uint32_t messagecode = static_cast<uint32_t>(km_info.Length() > 8 ? km_info[8].ToNumber().Int32Value() : 0);
    void* callbackroutine = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 9 ? km_napi_arg_u64(km_info[9]) : 0));
    void* userdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 10 ? km_napi_arg_u64(km_info[10]) : 0));
    int32_t asynchronousopen = static_cast<int32_t>(km_info.Length() > 11 ? km_info[11].ToNumber().Int32Value() : 0);
    void* sessionhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 12 ? km_napi_arg_u64(km_info[12]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, void*, uint64_t, void*, int32_t, void*, uint32_t, void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winbio.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WinBioAsyncOpenSession")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(factor, pooltype, flags, unitarray, unitcount, databaseid, notificationmethod, targetwindow, messagecode, callbackroutine, userdata, asynchronousopen, sessionhandle) : -1;
#else
    (void)factor;
    (void)pooltype;
    (void)flags;
    (void)unitarray;
    (void)unitcount;
    (void)databaseid;
    (void)notificationmethod;
    (void)targetwindow;
    (void)messagecode;
    (void)callbackroutine;
    (void)userdata;
    (void)asynchronousopen;
    (void)sessionhandle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_biometricframework_WinBioCancel_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t sessionhandle = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winbio.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WinBioCancel")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sessionhandle) : -1;
#else
    (void)sessionhandle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_biometricframework_WinBioCaptureSample_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t sessionhandle = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint8_t purpose = static_cast<uint8_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint8_t flags = static_cast<uint8_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* unitid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* sample = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* samplesize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* rejectdetail = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint8_t, uint8_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winbio.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WinBioCaptureSample")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sessionhandle, purpose, flags, unitid, sample, samplesize, rejectdetail) : -1;
#else
    (void)sessionhandle;
    (void)purpose;
    (void)flags;
    (void)unitid;
    (void)sample;
    (void)samplesize;
    (void)rejectdetail;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_biometricframework_WinBioCaptureSampleWithCallback_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t sessionhandle = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint8_t purpose = static_cast<uint8_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint8_t flags = static_cast<uint8_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* capturecallback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* capturecallbackcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint8_t, uint8_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winbio.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WinBioCaptureSampleWithCallback")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sessionhandle, purpose, flags, capturecallback, capturecallbackcontext) : -1;
#else
    (void)sessionhandle;
    (void)purpose;
    (void)flags;
    (void)capturecallback;
    (void)capturecallbackcontext;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_biometricframework_WinBioCloseFramework_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t frameworkhandle = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winbio.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WinBioCloseFramework")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(frameworkhandle) : -1;
#else
    (void)frameworkhandle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_biometricframework_WinBioCloseSession_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t sessionhandle = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winbio.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WinBioCloseSession")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sessionhandle) : -1;
#else
    (void)sessionhandle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_biometricframework_WinBioControlUnit_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t sessionhandle = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t unitid = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t component = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t controlcode = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* sendbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint64_t sendbuffersize = km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0;
    void* receivebuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    uint64_t receivebuffersize = km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0;
    void* receivedatasize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
    void* operationstatus = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 9 ? km_napi_arg_u64(km_info[9]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, uint32_t, void*, uint64_t, void*, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winbio.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WinBioControlUnit")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sessionhandle, unitid, component, controlcode, sendbuffer, sendbuffersize, receivebuffer, receivebuffersize, receivedatasize, operationstatus) : -1;
#else
    (void)sessionhandle;
    (void)unitid;
    (void)component;
    (void)controlcode;
    (void)sendbuffer;
    (void)sendbuffersize;
    (void)receivebuffer;
    (void)receivebuffersize;
    (void)receivedatasize;
    (void)operationstatus;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_biometricframework_WinBioControlUnitPrivileged_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t sessionhandle = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t unitid = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t component = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t controlcode = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* sendbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint64_t sendbuffersize = km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0;
    void* receivebuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    uint64_t receivebuffersize = km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0;
    void* receivedatasize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
    void* operationstatus = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 9 ? km_napi_arg_u64(km_info[9]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, uint32_t, void*, uint64_t, void*, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winbio.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WinBioControlUnitPrivileged")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sessionhandle, unitid, component, controlcode, sendbuffer, sendbuffersize, receivebuffer, receivebuffersize, receivedatasize, operationstatus) : -1;
#else
    (void)sessionhandle;
    (void)unitid;
    (void)component;
    (void)controlcode;
    (void)sendbuffer;
    (void)sendbuffersize;
    (void)receivebuffer;
    (void)receivebuffersize;
    (void)receivedatasize;
    (void)operationstatus;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_biometricframework_WinBioDeleteTemplate_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t sessionhandle = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t unitid = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* identity = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint8_t subfactor = static_cast<uint8_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, uint8_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winbio.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WinBioDeleteTemplate")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sessionhandle, unitid, identity, subfactor) : -1;
#else
    (void)sessionhandle;
    (void)unitid;
    (void)identity;
    (void)subfactor;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_biometricframework_WinBioEnrollBegin_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t sessionhandle = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint8_t subfactor = static_cast<uint8_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t unitid = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint8_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winbio.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WinBioEnrollBegin")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sessionhandle, subfactor, unitid) : -1;
#else
    (void)sessionhandle;
    (void)subfactor;
    (void)unitid;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_biometricframework_WinBioEnrollCapture_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t sessionhandle = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* rejectdetail = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winbio.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WinBioEnrollCapture")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sessionhandle, rejectdetail) : -1;
#else
    (void)sessionhandle;
    (void)rejectdetail;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_biometricframework_WinBioEnrollCaptureWithCallback_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t sessionhandle = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* enrollcallback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* enrollcallbackcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winbio.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WinBioEnrollCaptureWithCallback")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sessionhandle, enrollcallback, enrollcallbackcontext) : -1;
#else
    (void)sessionhandle;
    (void)enrollcallback;
    (void)enrollcallbackcontext;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_biometricframework_WinBioEnrollCommit_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t sessionhandle = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* identity = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* isnewtemplate = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winbio.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WinBioEnrollCommit")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sessionhandle, identity, isnewtemplate) : -1;
#else
    (void)sessionhandle;
    (void)identity;
    (void)isnewtemplate;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_biometricframework_WinBioEnrollDiscard_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t sessionhandle = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winbio.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WinBioEnrollDiscard")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sessionhandle) : -1;
#else
    (void)sessionhandle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_biometricframework_WinBioEnrollSelect_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t sessionhandle = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint64_t selectorvalue = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winbio.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WinBioEnrollSelect")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sessionhandle, selectorvalue) : -1;
#else
    (void)sessionhandle;
    (void)selectorvalue;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_biometricframework_WinBioEnumBiometricUnits_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t factor = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* unitschemaarray = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* unitcount = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winbio.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WinBioEnumBiometricUnits")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(factor, unitschemaarray, unitcount) : -1;
#else
    (void)factor;
    (void)unitschemaarray;
    (void)unitcount;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_biometricframework_WinBioEnumDatabases_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t factor = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* storageschemaarray = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* storagecount = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winbio.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WinBioEnumDatabases")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(factor, storageschemaarray, storagecount) : -1;
#else
    (void)factor;
    (void)storageschemaarray;
    (void)storagecount;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_biometricframework_WinBioEnumEnrollments_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t sessionhandle = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t unitid = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* identity = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* subfactorarray = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* subfactorcount = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winbio.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WinBioEnumEnrollments")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sessionhandle, unitid, identity, subfactorarray, subfactorcount) : -1;
#else
    (void)sessionhandle;
    (void)unitid;
    (void)identity;
    (void)subfactorarray;
    (void)subfactorcount;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_biometricframework_WinBioEnumServiceProviders_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t factor = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* bspschemaarray = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* bspcount = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winbio.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WinBioEnumServiceProviders")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(factor, bspschemaarray, bspcount) : -1;
#else
    (void)factor;
    (void)bspschemaarray;
    (void)bspcount;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_biometricframework_WinBioFree_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* address = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winbio.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WinBioFree")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(address) : -1;
#else
    (void)address;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_biometricframework_WinBioGetDomainLogonSetting_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* value = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* source = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winbio.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WinBioGetDomainLogonSetting")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(value, source);
#else
    (void)value;
    (void)source;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_devices_biometricframework_WinBioGetEnabledSetting_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* value = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* source = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winbio.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WinBioGetEnabledSetting")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(value, source);
#else
    (void)value;
    (void)source;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_devices_biometricframework_WinBioGetEnrolledFactors_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* accountowner = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* enrolledfactors = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winbio.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WinBioGetEnrolledFactors")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(accountowner, enrolledfactors) : -1;
#else
    (void)accountowner;
    (void)enrolledfactors;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_biometricframework_WinBioGetLogonSetting_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* value = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* source = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winbio.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WinBioGetLogonSetting")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(value, source);
#else
    (void)value;
    (void)source;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_devices_biometricframework_WinBioGetProperty_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t sessionhandle = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t propertytype = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t propertyid = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t unitid = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* identity = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint8_t subfactor = static_cast<uint8_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* propertybuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* propertybuffersize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, uint32_t, void*, uint8_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winbio.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WinBioGetProperty")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sessionhandle, propertytype, propertyid, unitid, identity, subfactor, propertybuffer, propertybuffersize) : -1;
#else
    (void)sessionhandle;
    (void)propertytype;
    (void)propertyid;
    (void)unitid;
    (void)identity;
    (void)subfactor;
    (void)propertybuffer;
    (void)propertybuffersize;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_biometricframework_WinBioIdentify_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t sessionhandle = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* unitid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* identity = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* subfactor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* rejectdetail = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winbio.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WinBioIdentify")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sessionhandle, unitid, identity, subfactor, rejectdetail) : -1;
#else
    (void)sessionhandle;
    (void)unitid;
    (void)identity;
    (void)subfactor;
    (void)rejectdetail;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_biometricframework_WinBioIdentifyWithCallback_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t sessionhandle = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* identifycallback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* identifycallbackcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winbio.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WinBioIdentifyWithCallback")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sessionhandle, identifycallback, identifycallbackcontext) : -1;
#else
    (void)sessionhandle;
    (void)identifycallback;
    (void)identifycallbackcontext;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_biometricframework_WinBioImproveBegin_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t sessionhandle = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t unitid = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winbio.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WinBioImproveBegin")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sessionhandle, unitid) : -1;
#else
    (void)sessionhandle;
    (void)unitid;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_biometricframework_WinBioImproveEnd_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t sessionhandle = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winbio.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WinBioImproveEnd")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sessionhandle) : -1;
#else
    (void)sessionhandle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_biometricframework_WinBioLocateSensor_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t sessionhandle = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* unitid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winbio.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WinBioLocateSensor")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sessionhandle, unitid) : -1;
#else
    (void)sessionhandle;
    (void)unitid;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_biometricframework_WinBioLocateSensorWithCallback_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t sessionhandle = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* locatecallback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* locatecallbackcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winbio.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WinBioLocateSensorWithCallback")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sessionhandle, locatecallback, locatecallbackcontext) : -1;
#else
    (void)sessionhandle;
    (void)locatecallback;
    (void)locatecallbackcontext;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_biometricframework_WinBioLockUnit_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t sessionhandle = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t unitid = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winbio.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WinBioLockUnit")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sessionhandle, unitid) : -1;
#else
    (void)sessionhandle;
    (void)unitid;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_biometricframework_WinBioLogonIdentifiedUser_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t sessionhandle = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winbio.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WinBioLogonIdentifiedUser")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sessionhandle) : -1;
#else
    (void)sessionhandle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_biometricframework_WinBioMonitorPresence_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t sessionhandle = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t unitid = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winbio.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WinBioMonitorPresence")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sessionhandle, unitid) : -1;
#else
    (void)sessionhandle;
    (void)unitid;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_biometricframework_WinBioOpenSession_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t factor = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t pooltype = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* unitarray = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint64_t unitcount = km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0;
    void* databaseid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* sessionhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, void*, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winbio.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WinBioOpenSession")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(factor, pooltype, flags, unitarray, unitcount, databaseid, sessionhandle) : -1;
#else
    (void)factor;
    (void)pooltype;
    (void)flags;
    (void)unitarray;
    (void)unitcount;
    (void)databaseid;
    (void)sessionhandle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_biometricframework_WinBioRegisterEventMonitor_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t sessionhandle = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t eventmask = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* eventcallback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* eventcallbackcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winbio.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WinBioRegisterEventMonitor")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sessionhandle, eventmask, eventcallback, eventcallbackcontext) : -1;
#else
    (void)sessionhandle;
    (void)eventmask;
    (void)eventcallback;
    (void)eventcallbackcontext;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_biometricframework_WinBioReleaseFocus_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winbio.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WinBioReleaseFocus")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_biometricframework_WinBioRemoveAllCredentials_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winbio.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WinBioRemoveAllCredentials")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_biometricframework_WinBioRemoveAllDomainCredentials_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winbio.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WinBioRemoveAllDomainCredentials")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_biometricframework_WinBioSetCredential_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t type = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* credential = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint64_t credentialsize = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
    int32_t format = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, uint64_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winbio.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WinBioSetCredential")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(type, credential, credentialsize, format) : -1;
#else
    (void)type;
    (void)credential;
    (void)credentialsize;
    (void)format;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_biometricframework_WinBioSetProperty_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t sessionhandle = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t propertytype = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t propertyid = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t unitid = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* identity = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint8_t subfactor = static_cast<uint8_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* propertybuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    uint64_t propertybuffersize = km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, uint32_t, void*, uint8_t, void*, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winbio.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WinBioSetProperty")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sessionhandle, propertytype, propertyid, unitid, identity, subfactor, propertybuffer, propertybuffersize) : -1;
#else
    (void)sessionhandle;
    (void)propertytype;
    (void)propertyid;
    (void)unitid;
    (void)identity;
    (void)subfactor;
    (void)propertybuffer;
    (void)propertybuffersize;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_biometricframework_WinBioUnlockUnit_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t sessionhandle = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t unitid = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winbio.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WinBioUnlockUnit")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sessionhandle, unitid) : -1;
#else
    (void)sessionhandle;
    (void)unitid;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_biometricframework_WinBioUnregisterEventMonitor_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t sessionhandle = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winbio.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WinBioUnregisterEventMonitor")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sessionhandle) : -1;
#else
    (void)sessionhandle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_biometricframework_WinBioVerify_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t sessionhandle = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* identity = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint8_t subfactor = static_cast<uint8_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* unitid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* match = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* rejectdetail = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint8_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winbio.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WinBioVerify")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sessionhandle, identity, subfactor, unitid, match, rejectdetail) : -1;
#else
    (void)sessionhandle;
    (void)identity;
    (void)subfactor;
    (void)unitid;
    (void)match;
    (void)rejectdetail;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_biometricframework_WinBioVerifyWithCallback_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t sessionhandle = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* identity = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint8_t subfactor = static_cast<uint8_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* verifycallback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* verifycallbackcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint8_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winbio.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WinBioVerifyWithCallback")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sessionhandle, identity, subfactor, verifycallback, verifycallbackcontext) : -1;
#else
    (void)sessionhandle;
    (void)identity;
    (void)subfactor;
    (void)verifycallback;
    (void)verifycallbackcontext;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_biometricframework_WinBioWait_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t sessionhandle = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winbio.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WinBioWait")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sessionhandle) : -1;
#else
    (void)sessionhandle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static void register_windows_win32_devices_biometricframework_napi(Napi::Env env, Napi::Object exports) {
    exports.Set("windowssys_windows_win32_devices_biometricframework_WinBioAcquireFocus", Napi::Function::New(env, windowssys_windows_win32_devices_biometricframework_WinBioAcquireFocus_napi));
    exports.Set("windowssys_windows_win32_devices_biometricframework_WinBioAsyncEnumBiometricUnits", Napi::Function::New(env, windowssys_windows_win32_devices_biometricframework_WinBioAsyncEnumBiometricUnits_napi));
    exports.Set("windowssys_windows_win32_devices_biometricframework_WinBioAsyncEnumDatabases", Napi::Function::New(env, windowssys_windows_win32_devices_biometricframework_WinBioAsyncEnumDatabases_napi));
    exports.Set("windowssys_windows_win32_devices_biometricframework_WinBioAsyncEnumServiceProviders", Napi::Function::New(env, windowssys_windows_win32_devices_biometricframework_WinBioAsyncEnumServiceProviders_napi));
    exports.Set("windowssys_windows_win32_devices_biometricframework_WinBioAsyncMonitorFrameworkChanges", Napi::Function::New(env, windowssys_windows_win32_devices_biometricframework_WinBioAsyncMonitorFrameworkChanges_napi));
    exports.Set("windowssys_windows_win32_devices_biometricframework_WinBioAsyncOpenFramework", Napi::Function::New(env, windowssys_windows_win32_devices_biometricframework_WinBioAsyncOpenFramework_napi));
    exports.Set("windowssys_windows_win32_devices_biometricframework_WinBioAsyncOpenSession", Napi::Function::New(env, windowssys_windows_win32_devices_biometricframework_WinBioAsyncOpenSession_napi));
    exports.Set("windowssys_windows_win32_devices_biometricframework_WinBioCancel", Napi::Function::New(env, windowssys_windows_win32_devices_biometricframework_WinBioCancel_napi));
    exports.Set("windowssys_windows_win32_devices_biometricframework_WinBioCaptureSample", Napi::Function::New(env, windowssys_windows_win32_devices_biometricframework_WinBioCaptureSample_napi));
    exports.Set("windowssys_windows_win32_devices_biometricframework_WinBioCaptureSampleWithCallback", Napi::Function::New(env, windowssys_windows_win32_devices_biometricframework_WinBioCaptureSampleWithCallback_napi));
    exports.Set("windowssys_windows_win32_devices_biometricframework_WinBioCloseFramework", Napi::Function::New(env, windowssys_windows_win32_devices_biometricframework_WinBioCloseFramework_napi));
    exports.Set("windowssys_windows_win32_devices_biometricframework_WinBioCloseSession", Napi::Function::New(env, windowssys_windows_win32_devices_biometricframework_WinBioCloseSession_napi));
    exports.Set("windowssys_windows_win32_devices_biometricframework_WinBioControlUnit", Napi::Function::New(env, windowssys_windows_win32_devices_biometricframework_WinBioControlUnit_napi));
    exports.Set("windowssys_windows_win32_devices_biometricframework_WinBioControlUnitPrivileged", Napi::Function::New(env, windowssys_windows_win32_devices_biometricframework_WinBioControlUnitPrivileged_napi));
    exports.Set("windowssys_windows_win32_devices_biometricframework_WinBioDeleteTemplate", Napi::Function::New(env, windowssys_windows_win32_devices_biometricframework_WinBioDeleteTemplate_napi));
    exports.Set("windowssys_windows_win32_devices_biometricframework_WinBioEnrollBegin", Napi::Function::New(env, windowssys_windows_win32_devices_biometricframework_WinBioEnrollBegin_napi));
    exports.Set("windowssys_windows_win32_devices_biometricframework_WinBioEnrollCapture", Napi::Function::New(env, windowssys_windows_win32_devices_biometricframework_WinBioEnrollCapture_napi));
    exports.Set("windowssys_windows_win32_devices_biometricframework_WinBioEnrollCaptureWithCallback", Napi::Function::New(env, windowssys_windows_win32_devices_biometricframework_WinBioEnrollCaptureWithCallback_napi));
    exports.Set("windowssys_windows_win32_devices_biometricframework_WinBioEnrollCommit", Napi::Function::New(env, windowssys_windows_win32_devices_biometricframework_WinBioEnrollCommit_napi));
    exports.Set("windowssys_windows_win32_devices_biometricframework_WinBioEnrollDiscard", Napi::Function::New(env, windowssys_windows_win32_devices_biometricframework_WinBioEnrollDiscard_napi));
    exports.Set("windowssys_windows_win32_devices_biometricframework_WinBioEnrollSelect", Napi::Function::New(env, windowssys_windows_win32_devices_biometricframework_WinBioEnrollSelect_napi));
    exports.Set("windowssys_windows_win32_devices_biometricframework_WinBioEnumBiometricUnits", Napi::Function::New(env, windowssys_windows_win32_devices_biometricframework_WinBioEnumBiometricUnits_napi));
    exports.Set("windowssys_windows_win32_devices_biometricframework_WinBioEnumDatabases", Napi::Function::New(env, windowssys_windows_win32_devices_biometricframework_WinBioEnumDatabases_napi));
    exports.Set("windowssys_windows_win32_devices_biometricframework_WinBioEnumEnrollments", Napi::Function::New(env, windowssys_windows_win32_devices_biometricframework_WinBioEnumEnrollments_napi));
    exports.Set("windowssys_windows_win32_devices_biometricframework_WinBioEnumServiceProviders", Napi::Function::New(env, windowssys_windows_win32_devices_biometricframework_WinBioEnumServiceProviders_napi));
    exports.Set("windowssys_windows_win32_devices_biometricframework_WinBioFree", Napi::Function::New(env, windowssys_windows_win32_devices_biometricframework_WinBioFree_napi));
    exports.Set("windowssys_windows_win32_devices_biometricframework_WinBioGetDomainLogonSetting", Napi::Function::New(env, windowssys_windows_win32_devices_biometricframework_WinBioGetDomainLogonSetting_napi));
    exports.Set("windowssys_windows_win32_devices_biometricframework_WinBioGetEnabledSetting", Napi::Function::New(env, windowssys_windows_win32_devices_biometricframework_WinBioGetEnabledSetting_napi));
    exports.Set("windowssys_windows_win32_devices_biometricframework_WinBioGetEnrolledFactors", Napi::Function::New(env, windowssys_windows_win32_devices_biometricframework_WinBioGetEnrolledFactors_napi));
    exports.Set("windowssys_windows_win32_devices_biometricframework_WinBioGetLogonSetting", Napi::Function::New(env, windowssys_windows_win32_devices_biometricframework_WinBioGetLogonSetting_napi));
    exports.Set("windowssys_windows_win32_devices_biometricframework_WinBioGetProperty", Napi::Function::New(env, windowssys_windows_win32_devices_biometricframework_WinBioGetProperty_napi));
    exports.Set("windowssys_windows_win32_devices_biometricframework_WinBioIdentify", Napi::Function::New(env, windowssys_windows_win32_devices_biometricframework_WinBioIdentify_napi));
    exports.Set("windowssys_windows_win32_devices_biometricframework_WinBioIdentifyWithCallback", Napi::Function::New(env, windowssys_windows_win32_devices_biometricframework_WinBioIdentifyWithCallback_napi));
    exports.Set("windowssys_windows_win32_devices_biometricframework_WinBioImproveBegin", Napi::Function::New(env, windowssys_windows_win32_devices_biometricframework_WinBioImproveBegin_napi));
    exports.Set("windowssys_windows_win32_devices_biometricframework_WinBioImproveEnd", Napi::Function::New(env, windowssys_windows_win32_devices_biometricframework_WinBioImproveEnd_napi));
    exports.Set("windowssys_windows_win32_devices_biometricframework_WinBioLocateSensor", Napi::Function::New(env, windowssys_windows_win32_devices_biometricframework_WinBioLocateSensor_napi));
    exports.Set("windowssys_windows_win32_devices_biometricframework_WinBioLocateSensorWithCallback", Napi::Function::New(env, windowssys_windows_win32_devices_biometricframework_WinBioLocateSensorWithCallback_napi));
    exports.Set("windowssys_windows_win32_devices_biometricframework_WinBioLockUnit", Napi::Function::New(env, windowssys_windows_win32_devices_biometricframework_WinBioLockUnit_napi));
    exports.Set("windowssys_windows_win32_devices_biometricframework_WinBioLogonIdentifiedUser", Napi::Function::New(env, windowssys_windows_win32_devices_biometricframework_WinBioLogonIdentifiedUser_napi));
    exports.Set("windowssys_windows_win32_devices_biometricframework_WinBioMonitorPresence", Napi::Function::New(env, windowssys_windows_win32_devices_biometricframework_WinBioMonitorPresence_napi));
    exports.Set("windowssys_windows_win32_devices_biometricframework_WinBioOpenSession", Napi::Function::New(env, windowssys_windows_win32_devices_biometricframework_WinBioOpenSession_napi));
    exports.Set("windowssys_windows_win32_devices_biometricframework_WinBioRegisterEventMonitor", Napi::Function::New(env, windowssys_windows_win32_devices_biometricframework_WinBioRegisterEventMonitor_napi));
    exports.Set("windowssys_windows_win32_devices_biometricframework_WinBioReleaseFocus", Napi::Function::New(env, windowssys_windows_win32_devices_biometricframework_WinBioReleaseFocus_napi));
    exports.Set("windowssys_windows_win32_devices_biometricframework_WinBioRemoveAllCredentials", Napi::Function::New(env, windowssys_windows_win32_devices_biometricframework_WinBioRemoveAllCredentials_napi));
    exports.Set("windowssys_windows_win32_devices_biometricframework_WinBioRemoveAllDomainCredentials", Napi::Function::New(env, windowssys_windows_win32_devices_biometricframework_WinBioRemoveAllDomainCredentials_napi));
    exports.Set("windowssys_windows_win32_devices_biometricframework_WinBioSetCredential", Napi::Function::New(env, windowssys_windows_win32_devices_biometricframework_WinBioSetCredential_napi));
    exports.Set("windowssys_windows_win32_devices_biometricframework_WinBioSetProperty", Napi::Function::New(env, windowssys_windows_win32_devices_biometricframework_WinBioSetProperty_napi));
    exports.Set("windowssys_windows_win32_devices_biometricframework_WinBioUnlockUnit", Napi::Function::New(env, windowssys_windows_win32_devices_biometricframework_WinBioUnlockUnit_napi));
    exports.Set("windowssys_windows_win32_devices_biometricframework_WinBioUnregisterEventMonitor", Napi::Function::New(env, windowssys_windows_win32_devices_biometricframework_WinBioUnregisterEventMonitor_napi));
    exports.Set("windowssys_windows_win32_devices_biometricframework_WinBioVerify", Napi::Function::New(env, windowssys_windows_win32_devices_biometricframework_WinBioVerify_napi));
    exports.Set("windowssys_windows_win32_devices_biometricframework_WinBioVerifyWithCallback", Napi::Function::New(env, windowssys_windows_win32_devices_biometricframework_WinBioVerifyWithCallback_napi));
    exports.Set("windowssys_windows_win32_devices_biometricframework_WinBioWait", Napi::Function::New(env, windowssys_windows_win32_devices_biometricframework_WinBioWait_napi));
}

static KmNapiRegistrarNode registrar_node = { &register_windows_win32_devices_biometricframework_napi, nullptr };
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
