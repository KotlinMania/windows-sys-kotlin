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

static Napi::Value windowssys_windows_win32_system_diagnostics_etw_CreateTraceInstanceId_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* reghandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* instinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CreateTraceInstanceId")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(reghandle, instinfo) : 0;
#else
    (void)reghandle;
    (void)instinfo;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_etw_CveEventWrite_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* cveid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* additionaldetails = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CveEventWrite")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(cveid, additionaldetails) : -1;
#else
    (void)cveid;
    (void)additionaldetails;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_etw_EnumerateTraceGuids_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* guidpropertiesarray = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t propertyarraycount = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* guidcount = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "EnumerateTraceGuids")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(guidpropertiesarray, propertyarraycount, guidcount) : 0;
#else
    (void)guidpropertiesarray;
    (void)propertyarraycount;
    (void)guidcount;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_etw_EnumerateTraceGuidsEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t tracequeryinfoclass = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* inbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t inbuffersize = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* outbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t outbuffersize = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* returnlength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int32_t, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "EnumerateTraceGuidsEx")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(tracequeryinfoclass, inbuffer, inbuffersize, outbuffer, outbuffersize, returnlength) : 0;
#else
    (void)tracequeryinfoclass;
    (void)inbuffer;
    (void)inbuffersize;
    (void)outbuffer;
    (void)outbuffersize;
    (void)returnlength;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_etw_EventAccessControl_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* guid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t operation = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* sid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t rights = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    bool allowordeny = km_info.Length() > 4 ? km_info[4].ToBoolean().Value() : false;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, bool);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "EventAccessControl")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(guid, operation, sid, rights, allowordeny) : 0;
#else
    (void)guid;
    (void)operation;
    (void)sid;
    (void)rights;
    (void)allowordeny;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_etw_EventAccessQuery_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* guid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* buffersize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "EventAccessQuery")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(guid, buffer, buffersize) : 0;
#else
    (void)guid;
    (void)buffer;
    (void)buffersize;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_etw_EventAccessRemove_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* guid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "EventAccessRemove")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(guid) : 0;
#else
    (void)guid;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_etw_EventActivityIdControl_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t controlcode = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* activityid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "EventActivityIdControl")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(controlcode, activityid) : 0;
#else
    (void)controlcode;
    (void)activityid;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_etw_EventEnabled_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t reghandle = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* eventdescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "EventEnabled")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(reghandle, eventdescriptor) : false;
#else
    (void)reghandle;
    (void)eventdescriptor;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_win32_system_diagnostics_etw_EventProviderEnabled_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t reghandle = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint8_t level = static_cast<uint8_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint64_t keyword = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(int64_t, uint8_t, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "EventProviderEnabled")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(reghandle, level, keyword) : false;
#else
    (void)reghandle;
    (void)level;
    (void)keyword;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_win32_system_diagnostics_etw_EventRegister_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* providerid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* enablecallback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* callbackcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* reghandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "EventRegister")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(providerid, enablecallback, callbackcontext, reghandle) : 0;
#else
    (void)providerid;
    (void)enablecallback;
    (void)callbackcontext;
    (void)reghandle;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_etw_EventSetInformation_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t reghandle = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int32_t informationclass = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* eventinformation = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t informationlength = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "EventSetInformation")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(reghandle, informationclass, eventinformation, informationlength) : 0;
#else
    (void)reghandle;
    (void)informationclass;
    (void)eventinformation;
    (void)informationlength;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_etw_EventUnregister_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t reghandle = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "EventUnregister")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(reghandle) : 0;
#else
    (void)reghandle;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_etw_EventWrite_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t reghandle = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* eventdescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t userdatacount = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* userdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "EventWrite")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(reghandle, eventdescriptor, userdatacount, userdata) : 0;
#else
    (void)reghandle;
    (void)eventdescriptor;
    (void)userdatacount;
    (void)userdata;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_etw_EventWriteEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t reghandle = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* eventdescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint64_t filter = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* activityid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* relatedactivityid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    uint32_t userdatacount = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    void* userdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, uint64_t, uint32_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "EventWriteEx")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(reghandle, eventdescriptor, filter, flags, activityid, relatedactivityid, userdatacount, userdata) : 0;
#else
    (void)reghandle;
    (void)eventdescriptor;
    (void)filter;
    (void)flags;
    (void)activityid;
    (void)relatedactivityid;
    (void)userdatacount;
    (void)userdata;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_etw_EventWriteString_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t reghandle = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint8_t level = static_cast<uint8_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint64_t keyword = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
    void* string = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint8_t, uint64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "EventWriteString")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(reghandle, level, keyword, string) : 0;
#else
    (void)reghandle;
    (void)level;
    (void)keyword;
    (void)string;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_etw_EventWriteTransfer_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t reghandle = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* eventdescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* activityid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* relatedactivityid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t userdatacount = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* userdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "EventWriteTransfer")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(reghandle, eventdescriptor, activityid, relatedactivityid, userdatacount, userdata) : 0;
#else
    (void)reghandle;
    (void)eventdescriptor;
    (void)activityid;
    (void)relatedactivityid;
    (void)userdatacount;
    (void)userdata;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_etw_GetTraceEnableFlags_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t tracehandle = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetTraceEnableFlags")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(tracehandle) : 0;
#else
    (void)tracehandle;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_etw_GetTraceEnableLevel_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t tracehandle = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
#ifdef _WIN32
    typedef uint8_t (__stdcall *km_fn_t)(uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetTraceEnableLevel")));
    }
    uint8_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(tracehandle) : 0;
#else
    (void)tracehandle;
    uint8_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_etw_GetTraceLoggerHandle_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetTraceLoggerHandle")));
    }
    uint64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(buffer) : 0;
#else
    (void)buffer;
    uint64_t km_res = 0;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<uint64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_etw_OpenTraceFromBufferStream_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* options = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* buffercompletioncallback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* buffercompletioncontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "OpenTraceFromBufferStream")));
    }
    uint64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(options, buffercompletioncallback, buffercompletioncontext) : 0;
#else
    (void)options;
    (void)buffercompletioncallback;
    (void)buffercompletioncontext;
    uint64_t km_res = 0;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<uint64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_etw_OpenTraceFromFile_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* logfilename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* options = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* logfileheader = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "OpenTraceFromFile")));
    }
    uint64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(logfilename, options, logfileheader) : 0;
#else
    (void)logfilename;
    (void)options;
    (void)logfileheader;
    uint64_t km_res = 0;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<uint64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_etw_OpenTraceFromRealTimeLogger_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* loggername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* options = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* logfileheader = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "OpenTraceFromRealTimeLogger")));
    }
    uint64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(loggername, options, logfileheader) : 0;
#else
    (void)loggername;
    (void)options;
    (void)logfileheader;
    uint64_t km_res = 0;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<uint64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_etw_OpenTraceFromRealTimeLoggerWithAllocationOptions_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* loggername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* options = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint64_t allocationsize = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
    void* memorypartitionhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* logfileheader = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(void*, void*, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "OpenTraceFromRealTimeLoggerWithAllocationOptions")));
    }
    uint64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(loggername, options, allocationsize, memorypartitionhandle, logfileheader) : 0;
#else
    (void)loggername;
    (void)options;
    (void)allocationsize;
    (void)memorypartitionhandle;
    (void)logfileheader;
    uint64_t km_res = 0;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<uint64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_etw_ProcessTrace_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* handlearray = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t handlecount = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* starttime = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* endtime = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ProcessTrace")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(handlearray, handlecount, starttime, endtime) : 0;
#else
    (void)handlearray;
    (void)handlecount;
    (void)starttime;
    (void)endtime;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_etw_ProcessTraceAddBufferToBufferStream_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t tracehandle = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t buffersize = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ProcessTraceAddBufferToBufferStream")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(tracehandle, buffer, buffersize) : 0;
#else
    (void)tracehandle;
    (void)buffer;
    (void)buffersize;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_etw_ProcessTraceBufferDecrementReference_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ProcessTraceBufferDecrementReference")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(buffer) : 0;
#else
    (void)buffer;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_etw_ProcessTraceBufferIncrementReference_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t tracehandle = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ProcessTraceBufferIncrementReference")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(tracehandle, buffer) : 0;
#else
    (void)tracehandle;
    (void)buffer;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_etw_QueryAllTracesA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* propertyarray = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t propertyarraycount = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* loggercount = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "QueryAllTracesA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(propertyarray, propertyarraycount, loggercount) : 0;
#else
    (void)propertyarray;
    (void)propertyarraycount;
    (void)loggercount;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_etw_QueryAllTracesW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* propertyarray = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t propertyarraycount = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* loggercount = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "QueryAllTracesW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(propertyarray, propertyarraycount, loggercount) : 0;
#else
    (void)propertyarray;
    (void)propertyarraycount;
    (void)loggercount;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_etw_RegisterTraceGuidsA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* requestaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* requestcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* controlguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t guidcount = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* traceguidreg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* mofimagepath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* mofresourcename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* registrationhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RegisterTraceGuidsA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(requestaddress, requestcontext, controlguid, guidcount, traceguidreg, mofimagepath, mofresourcename, registrationhandle) : 0;
#else
    (void)requestaddress;
    (void)requestcontext;
    (void)controlguid;
    (void)guidcount;
    (void)traceguidreg;
    (void)mofimagepath;
    (void)mofresourcename;
    (void)registrationhandle;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_etw_RegisterTraceGuidsW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* requestaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* requestcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* controlguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t guidcount = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* traceguidreg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* mofimagepath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* mofresourcename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* registrationhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RegisterTraceGuidsW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(requestaddress, requestcontext, controlguid, guidcount, traceguidreg, mofimagepath, mofresourcename, registrationhandle) : 0;
#else
    (void)requestaddress;
    (void)requestcontext;
    (void)controlguid;
    (void)guidcount;
    (void)traceguidreg;
    (void)mofimagepath;
    (void)mofresourcename;
    (void)registrationhandle;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_etw_RemoveTraceCallback_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RemoveTraceCallback")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pguid) : 0;
#else
    (void)pguid;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_etw_SetTraceCallback_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* eventcallback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetTraceCallback")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pguid, eventcallback) : 0;
#else
    (void)pguid;
    (void)eventcallback;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_etw_StartTraceA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* tracehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* instancename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* properties = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "StartTraceA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(tracehandle, instancename, properties) : 0;
#else
    (void)tracehandle;
    (void)instancename;
    (void)properties;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_etw_StartTraceW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* tracehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* instancename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* properties = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "StartTraceW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(tracehandle, instancename, properties) : 0;
#else
    (void)tracehandle;
    (void)instancename;
    (void)properties;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_etw_TdhAggregatePayloadFilters_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t payloadfiltercount = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* payloadfilterptrs = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* eventmatchallflags = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* eventfilterdescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("tdh.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "TdhAggregatePayloadFilters")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(payloadfiltercount, payloadfilterptrs, eventmatchallflags, eventfilterdescriptor) : 0;
#else
    (void)payloadfiltercount;
    (void)payloadfilterptrs;
    (void)eventmatchallflags;
    (void)eventfilterdescriptor;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_etw_TdhCleanupPayloadEventFilterDescriptor_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* eventfilterdescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("tdh.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "TdhCleanupPayloadEventFilterDescriptor")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(eventfilterdescriptor) : 0;
#else
    (void)eventfilterdescriptor;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_etw_TdhCloseDecodingHandle_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t handle = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("tdh.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "TdhCloseDecodingHandle")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(handle) : 0;
#else
    (void)handle;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_etw_TdhCreatePayloadFilter_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* providerguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* eventdescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    bool eventmatchany = km_info.Length() > 2 ? km_info[2].ToBoolean().Value() : false;
    uint32_t payloadpredicatecount = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* payloadpredicates = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* payloadfilter = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, bool, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("tdh.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "TdhCreatePayloadFilter")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(providerguid, eventdescriptor, eventmatchany, payloadpredicatecount, payloadpredicates, payloadfilter) : 0;
#else
    (void)providerguid;
    (void)eventdescriptor;
    (void)eventmatchany;
    (void)payloadpredicatecount;
    (void)payloadpredicates;
    (void)payloadfilter;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_etw_TdhDeletePayloadFilter_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* payloadfilter = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("tdh.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "TdhDeletePayloadFilter")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(payloadfilter) : 0;
#else
    (void)payloadfilter;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_etw_TdhEnumerateManifestProviderEvents_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* providerguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* buffersize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("tdh.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "TdhEnumerateManifestProviderEvents")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(providerguid, buffer, buffersize) : 0;
#else
    (void)providerguid;
    (void)buffer;
    (void)buffersize;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_etw_TdhEnumerateProviderFieldInformation_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t eventfieldtype = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pbuffersize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("tdh.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "TdhEnumerateProviderFieldInformation")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pguid, eventfieldtype, pbuffer, pbuffersize) : 0;
#else
    (void)pguid;
    (void)eventfieldtype;
    (void)pbuffer;
    (void)pbuffersize;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_etw_TdhEnumerateProviderFilters_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* guid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t tdhcontextcount = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* tdhcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* filtercount = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* buffersize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("tdh.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "TdhEnumerateProviderFilters")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(guid, tdhcontextcount, tdhcontext, filtercount, buffer, buffersize) : 0;
#else
    (void)guid;
    (void)tdhcontextcount;
    (void)tdhcontext;
    (void)filtercount;
    (void)buffer;
    (void)buffersize;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_etw_TdhEnumerateProviders_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pbuffersize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("tdh.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "TdhEnumerateProviders")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pbuffer, pbuffersize) : 0;
#else
    (void)pbuffer;
    (void)pbuffersize;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_etw_TdhEnumerateProvidersForDecodingSource_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t filter = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t buffersize = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* bufferrequired = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("tdh.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "TdhEnumerateProvidersForDecodingSource")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(filter, buffer, buffersize, bufferrequired) : 0;
#else
    (void)filter;
    (void)buffer;
    (void)buffersize;
    (void)bufferrequired;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_etw_TdhFormatProperty_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* eventinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* mapinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t pointersize = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint16_t propertyintype = static_cast<uint16_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint16_t propertyouttype = static_cast<uint16_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    uint16_t propertylength = static_cast<uint16_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    uint16_t userdatalength = static_cast<uint16_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    void* userdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    void* buffersize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 9 ? km_napi_arg_u64(km_info[9]) : 0));
    void* userdataconsumed = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 10 ? km_napi_arg_u64(km_info[10]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint16_t, uint16_t, uint16_t, uint16_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("tdh.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "TdhFormatProperty")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(eventinfo, mapinfo, pointersize, propertyintype, propertyouttype, propertylength, userdatalength, userdata, buffersize, buffer, userdataconsumed) : 0;
#else
    (void)eventinfo;
    (void)mapinfo;
    (void)pointersize;
    (void)propertyintype;
    (void)propertyouttype;
    (void)propertylength;
    (void)userdatalength;
    (void)userdata;
    (void)buffersize;
    (void)buffer;
    (void)userdataconsumed;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_etw_TdhGetDecodingParameter_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t handle = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* tdhcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("tdh.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "TdhGetDecodingParameter")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(handle, tdhcontext) : 0;
#else
    (void)handle;
    (void)tdhcontext;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_etw_TdhGetEventInformation_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* event = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t tdhcontextcount = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* tdhcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* buffersize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("tdh.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "TdhGetEventInformation")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(event, tdhcontextcount, tdhcontext, buffer, buffersize) : 0;
#else
    (void)event;
    (void)tdhcontextcount;
    (void)tdhcontext;
    (void)buffer;
    (void)buffersize;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_etw_TdhGetEventMapInformation_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pevent = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pmapname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pbuffersize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("tdh.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "TdhGetEventMapInformation")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pevent, pmapname, pbuffer, pbuffersize) : 0;
#else
    (void)pevent;
    (void)pmapname;
    (void)pbuffer;
    (void)pbuffersize;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_etw_TdhGetManifestEventInformation_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* providerguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* eventdescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* buffersize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("tdh.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "TdhGetManifestEventInformation")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(providerguid, eventdescriptor, buffer, buffersize) : 0;
#else
    (void)providerguid;
    (void)eventdescriptor;
    (void)buffer;
    (void)buffersize;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_etw_TdhGetProperty_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pevent = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t tdhcontextcount = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* ptdhcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t propertydatacount = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* ppropertydata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t buffersize = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* pbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("tdh.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "TdhGetProperty")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pevent, tdhcontextcount, ptdhcontext, propertydatacount, ppropertydata, buffersize, pbuffer) : 0;
#else
    (void)pevent;
    (void)tdhcontextcount;
    (void)ptdhcontext;
    (void)propertydatacount;
    (void)ppropertydata;
    (void)buffersize;
    (void)pbuffer;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_etw_TdhGetPropertySize_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pevent = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t tdhcontextcount = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* ptdhcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t propertydatacount = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* ppropertydata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* ppropertysize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("tdh.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "TdhGetPropertySize")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pevent, tdhcontextcount, ptdhcontext, propertydatacount, ppropertydata, ppropertysize) : 0;
#else
    (void)pevent;
    (void)tdhcontextcount;
    (void)ptdhcontext;
    (void)propertydatacount;
    (void)ppropertydata;
    (void)ppropertysize;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_etw_TdhGetWppMessage_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t handle = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* eventrecord = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* buffersize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("tdh.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "TdhGetWppMessage")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(handle, eventrecord, buffersize, buffer) : 0;
#else
    (void)handle;
    (void)eventrecord;
    (void)buffersize;
    (void)buffer;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_etw_TdhGetWppProperty_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t handle = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* eventrecord = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* propertyname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* buffersize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("tdh.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "TdhGetWppProperty")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(handle, eventrecord, propertyname, buffersize, buffer) : 0;
#else
    (void)handle;
    (void)eventrecord;
    (void)propertyname;
    (void)buffersize;
    (void)buffer;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_etw_TdhLoadManifest_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* manifest = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("tdh.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "TdhLoadManifest")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(manifest) : 0;
#else
    (void)manifest;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_etw_TdhLoadManifestFromBinary_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* binarypath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("tdh.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "TdhLoadManifestFromBinary")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(binarypath) : 0;
#else
    (void)binarypath;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_etw_TdhLoadManifestFromMemory_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t cbdata = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("tdh.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "TdhLoadManifestFromMemory")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pdata, cbdata) : 0;
#else
    (void)pdata;
    (void)cbdata;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_etw_TdhOpenDecodingHandle_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* handle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("tdh.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "TdhOpenDecodingHandle")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(handle) : 0;
#else
    (void)handle;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_etw_TdhQueryProviderFieldInformation_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t eventfieldvalue = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    int32_t eventfieldtype = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pbuffersize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("tdh.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "TdhQueryProviderFieldInformation")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pguid, eventfieldvalue, eventfieldtype, pbuffer, pbuffersize) : 0;
#else
    (void)pguid;
    (void)eventfieldvalue;
    (void)eventfieldtype;
    (void)pbuffer;
    (void)pbuffersize;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_etw_TdhSetDecodingParameter_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t handle = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* tdhcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("tdh.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "TdhSetDecodingParameter")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(handle, tdhcontext) : 0;
#else
    (void)handle;
    (void)tdhcontext;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_etw_TdhUnloadManifest_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* manifest = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("tdh.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "TdhUnloadManifest")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(manifest) : 0;
#else
    (void)manifest;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_etw_TdhUnloadManifestFromMemory_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t cbdata = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("tdh.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "TdhUnloadManifestFromMemory")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pdata, cbdata) : 0;
#else
    (void)pdata;
    (void)cbdata;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_etw_TraceEvent_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t tracehandle = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* eventtrace = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "TraceEvent")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(tracehandle, eventtrace) : 0;
#else
    (void)tracehandle;
    (void)eventtrace;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_etw_TraceEventInstance_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t tracehandle = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* eventtrace = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* instinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* parentinstinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "TraceEventInstance")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(tracehandle, eventtrace, instinfo, parentinstinfo) : 0;
#else
    (void)tracehandle;
    (void)eventtrace;
    (void)instinfo;
    (void)parentinstinfo;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_etw_TraceMessageVa_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t loggerhandle = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint32_t messageflags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* messageguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint16_t messagenumber = static_cast<uint16_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* messagearglist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*, uint16_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "TraceMessageVa")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(loggerhandle, messageflags, messageguid, messagenumber, messagearglist) : 0;
#else
    (void)loggerhandle;
    (void)messageflags;
    (void)messageguid;
    (void)messagenumber;
    (void)messagearglist;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_etw_UnregisterTraceGuids_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t registrationhandle = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "UnregisterTraceGuids")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(registrationhandle) : 0;
#else
    (void)registrationhandle;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static void register_windows_win32_system_diagnostics_etw_napi(Napi::Env env, Napi::Object exports) {
    exports.Set("windowssys_windows_win32_system_diagnostics_etw_CreateTraceInstanceId", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_etw_CreateTraceInstanceId_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_etw_CveEventWrite", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_etw_CveEventWrite_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_etw_EnumerateTraceGuids", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_etw_EnumerateTraceGuids_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_etw_EnumerateTraceGuidsEx", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_etw_EnumerateTraceGuidsEx_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_etw_EventAccessControl", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_etw_EventAccessControl_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_etw_EventAccessQuery", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_etw_EventAccessQuery_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_etw_EventAccessRemove", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_etw_EventAccessRemove_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_etw_EventActivityIdControl", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_etw_EventActivityIdControl_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_etw_EventEnabled", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_etw_EventEnabled_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_etw_EventProviderEnabled", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_etw_EventProviderEnabled_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_etw_EventRegister", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_etw_EventRegister_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_etw_EventSetInformation", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_etw_EventSetInformation_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_etw_EventUnregister", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_etw_EventUnregister_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_etw_EventWrite", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_etw_EventWrite_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_etw_EventWriteEx", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_etw_EventWriteEx_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_etw_EventWriteString", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_etw_EventWriteString_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_etw_EventWriteTransfer", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_etw_EventWriteTransfer_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_etw_GetTraceEnableFlags", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_etw_GetTraceEnableFlags_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_etw_GetTraceEnableLevel", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_etw_GetTraceEnableLevel_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_etw_GetTraceLoggerHandle", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_etw_GetTraceLoggerHandle_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_etw_OpenTraceFromBufferStream", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_etw_OpenTraceFromBufferStream_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_etw_OpenTraceFromFile", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_etw_OpenTraceFromFile_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_etw_OpenTraceFromRealTimeLogger", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_etw_OpenTraceFromRealTimeLogger_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_etw_OpenTraceFromRealTimeLoggerWithAllocationOptions", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_etw_OpenTraceFromRealTimeLoggerWithAllocationOptions_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_etw_ProcessTrace", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_etw_ProcessTrace_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_etw_ProcessTraceAddBufferToBufferStream", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_etw_ProcessTraceAddBufferToBufferStream_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_etw_ProcessTraceBufferDecrementReference", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_etw_ProcessTraceBufferDecrementReference_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_etw_ProcessTraceBufferIncrementReference", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_etw_ProcessTraceBufferIncrementReference_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_etw_QueryAllTracesA", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_etw_QueryAllTracesA_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_etw_QueryAllTracesW", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_etw_QueryAllTracesW_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_etw_RegisterTraceGuidsA", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_etw_RegisterTraceGuidsA_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_etw_RegisterTraceGuidsW", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_etw_RegisterTraceGuidsW_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_etw_RemoveTraceCallback", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_etw_RemoveTraceCallback_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_etw_SetTraceCallback", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_etw_SetTraceCallback_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_etw_StartTraceA", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_etw_StartTraceA_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_etw_StartTraceW", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_etw_StartTraceW_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_etw_TdhAggregatePayloadFilters", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_etw_TdhAggregatePayloadFilters_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_etw_TdhCleanupPayloadEventFilterDescriptor", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_etw_TdhCleanupPayloadEventFilterDescriptor_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_etw_TdhCloseDecodingHandle", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_etw_TdhCloseDecodingHandle_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_etw_TdhCreatePayloadFilter", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_etw_TdhCreatePayloadFilter_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_etw_TdhDeletePayloadFilter", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_etw_TdhDeletePayloadFilter_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_etw_TdhEnumerateManifestProviderEvents", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_etw_TdhEnumerateManifestProviderEvents_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_etw_TdhEnumerateProviderFieldInformation", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_etw_TdhEnumerateProviderFieldInformation_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_etw_TdhEnumerateProviderFilters", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_etw_TdhEnumerateProviderFilters_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_etw_TdhEnumerateProviders", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_etw_TdhEnumerateProviders_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_etw_TdhEnumerateProvidersForDecodingSource", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_etw_TdhEnumerateProvidersForDecodingSource_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_etw_TdhFormatProperty", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_etw_TdhFormatProperty_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_etw_TdhGetDecodingParameter", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_etw_TdhGetDecodingParameter_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_etw_TdhGetEventInformation", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_etw_TdhGetEventInformation_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_etw_TdhGetEventMapInformation", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_etw_TdhGetEventMapInformation_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_etw_TdhGetManifestEventInformation", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_etw_TdhGetManifestEventInformation_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_etw_TdhGetProperty", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_etw_TdhGetProperty_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_etw_TdhGetPropertySize", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_etw_TdhGetPropertySize_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_etw_TdhGetWppMessage", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_etw_TdhGetWppMessage_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_etw_TdhGetWppProperty", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_etw_TdhGetWppProperty_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_etw_TdhLoadManifest", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_etw_TdhLoadManifest_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_etw_TdhLoadManifestFromBinary", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_etw_TdhLoadManifestFromBinary_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_etw_TdhLoadManifestFromMemory", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_etw_TdhLoadManifestFromMemory_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_etw_TdhOpenDecodingHandle", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_etw_TdhOpenDecodingHandle_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_etw_TdhQueryProviderFieldInformation", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_etw_TdhQueryProviderFieldInformation_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_etw_TdhSetDecodingParameter", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_etw_TdhSetDecodingParameter_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_etw_TdhUnloadManifest", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_etw_TdhUnloadManifest_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_etw_TdhUnloadManifestFromMemory", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_etw_TdhUnloadManifestFromMemory_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_etw_TraceEvent", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_etw_TraceEvent_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_etw_TraceEventInstance", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_etw_TraceEventInstance_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_etw_TraceMessageVa", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_etw_TraceMessageVa_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_etw_UnregisterTraceGuids", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_etw_UnregisterTraceGuids_napi));
}

static KmNapiRegistrarNode registrar_node = { &register_windows_win32_system_diagnostics_etw_napi, nullptr };
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
