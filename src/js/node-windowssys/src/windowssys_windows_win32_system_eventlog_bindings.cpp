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

static Napi::Value windowssys_windows_win32_system_eventlog_BackupEventLogA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* heventlog = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpbackupfilename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "BackupEventLogA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(heventlog, lpbackupfilename) : -1;
#else
    (void)heventlog;
    (void)lpbackupfilename;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_eventlog_BackupEventLogW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* heventlog = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpbackupfilename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "BackupEventLogW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(heventlog, lpbackupfilename) : -1;
#else
    (void)heventlog;
    (void)lpbackupfilename;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_eventlog_ClearEventLogA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* heventlog = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpbackupfilename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ClearEventLogA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(heventlog, lpbackupfilename) : -1;
#else
    (void)heventlog;
    (void)lpbackupfilename;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_eventlog_ClearEventLogW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* heventlog = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpbackupfilename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ClearEventLogW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(heventlog, lpbackupfilename) : -1;
#else
    (void)heventlog;
    (void)lpbackupfilename;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_eventlog_CloseEventLog_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* heventlog = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CloseEventLog")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(heventlog) : -1;
#else
    (void)heventlog;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_eventlog_DeregisterEventSource_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* heventlog = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DeregisterEventSource")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(heventlog) : -1;
#else
    (void)heventlog;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_eventlog_EvtArchiveExportedLog_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t session = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* logfilepath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t locale = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wevtapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "EvtArchiveExportedLog")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(session, logfilepath, locale, flags) : -1;
#else
    (void)session;
    (void)logfilepath;
    (void)locale;
    (void)flags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_eventlog_EvtCancel_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t object = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wevtapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "EvtCancel")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(object) : -1;
#else
    (void)object;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_eventlog_EvtClearLog_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t session = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* channelpath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* targetfilepath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wevtapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "EvtClearLog")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(session, channelpath, targetfilepath, flags) : -1;
#else
    (void)session;
    (void)channelpath;
    (void)targetfilepath;
    (void)flags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_eventlog_EvtClose_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t object = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wevtapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "EvtClose")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(object) : -1;
#else
    (void)object;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_eventlog_EvtCreateBookmark_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* bookmarkxml = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wevtapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "EvtCreateBookmark")));
    }
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(bookmarkxml) : -1;
#else
    (void)bookmarkxml;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_system_eventlog_EvtCreateRenderContext_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t valuepathscount = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* valuepaths = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wevtapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "EvtCreateRenderContext")));
    }
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(valuepathscount, valuepaths, flags) : -1;
#else
    (void)valuepathscount;
    (void)valuepaths;
    (void)flags;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_system_eventlog_EvtExportLog_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t session = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* path = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* query = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* targetfilepath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wevtapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "EvtExportLog")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(session, path, query, targetfilepath, flags) : -1;
#else
    (void)session;
    (void)path;
    (void)query;
    (void)targetfilepath;
    (void)flags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_eventlog_EvtFormatMessage_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t publishermetadata = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t event = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
    uint32_t messageid = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t valuecount = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* values = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    uint32_t buffersize = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    void* bufferused = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t, uint32_t, uint32_t, void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wevtapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "EvtFormatMessage")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(publishermetadata, event, messageid, valuecount, values, flags, buffersize, buffer, bufferused) : -1;
#else
    (void)publishermetadata;
    (void)event;
    (void)messageid;
    (void)valuecount;
    (void)values;
    (void)flags;
    (void)buffersize;
    (void)buffer;
    (void)bufferused;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_eventlog_EvtGetChannelConfigProperty_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t channelconfig = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int32_t propertyid = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t propertyvaluebuffersize = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* propertyvaluebuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* propertyvaluebufferused = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wevtapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "EvtGetChannelConfigProperty")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(channelconfig, propertyid, flags, propertyvaluebuffersize, propertyvaluebuffer, propertyvaluebufferused) : -1;
#else
    (void)channelconfig;
    (void)propertyid;
    (void)flags;
    (void)propertyvaluebuffersize;
    (void)propertyvaluebuffer;
    (void)propertyvaluebufferused;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_eventlog_EvtGetEventInfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t event = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int32_t propertyid = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t propertyvaluebuffersize = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* propertyvaluebuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* propertyvaluebufferused = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wevtapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "EvtGetEventInfo")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(event, propertyid, propertyvaluebuffersize, propertyvaluebuffer, propertyvaluebufferused) : -1;
#else
    (void)event;
    (void)propertyid;
    (void)propertyvaluebuffersize;
    (void)propertyvaluebuffer;
    (void)propertyvaluebufferused;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_eventlog_EvtGetEventMetadataProperty_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t eventmetadata = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int32_t propertyid = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t eventmetadatapropertybuffersize = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* eventmetadatapropertybuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* eventmetadatapropertybufferused = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wevtapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "EvtGetEventMetadataProperty")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(eventmetadata, propertyid, flags, eventmetadatapropertybuffersize, eventmetadatapropertybuffer, eventmetadatapropertybufferused) : -1;
#else
    (void)eventmetadata;
    (void)propertyid;
    (void)flags;
    (void)eventmetadatapropertybuffersize;
    (void)eventmetadatapropertybuffer;
    (void)eventmetadatapropertybufferused;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_eventlog_EvtGetExtendedStatus_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t buffersize = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* bufferused = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wevtapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "EvtGetExtendedStatus")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(buffersize, buffer, bufferused) : 0;
#else
    (void)buffersize;
    (void)buffer;
    (void)bufferused;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_eventlog_EvtGetLogInfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t arg_0_log = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int32_t propertyid = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t propertyvaluebuffersize = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* propertyvaluebuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* propertyvaluebufferused = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wevtapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "EvtGetLogInfo")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(arg_0_log, propertyid, propertyvaluebuffersize, propertyvaluebuffer, propertyvaluebufferused) : -1;
#else
    (void)arg_0_log;
    (void)propertyid;
    (void)propertyvaluebuffersize;
    (void)propertyvaluebuffer;
    (void)propertyvaluebufferused;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_eventlog_EvtGetObjectArrayProperty_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t objectarray = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint32_t propertyid = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t arrayindex = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t propertyvaluebuffersize = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* propertyvaluebuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* propertyvaluebufferused = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, uint32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wevtapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "EvtGetObjectArrayProperty")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(objectarray, propertyid, arrayindex, flags, propertyvaluebuffersize, propertyvaluebuffer, propertyvaluebufferused) : -1;
#else
    (void)objectarray;
    (void)propertyid;
    (void)arrayindex;
    (void)flags;
    (void)propertyvaluebuffersize;
    (void)propertyvaluebuffer;
    (void)propertyvaluebufferused;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_eventlog_EvtGetObjectArraySize_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t objectarray = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* objectarraysize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wevtapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "EvtGetObjectArraySize")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(objectarray, objectarraysize) : -1;
#else
    (void)objectarray;
    (void)objectarraysize;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_eventlog_EvtGetPublisherMetadataProperty_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t publishermetadata = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int32_t propertyid = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t publishermetadatapropertybuffersize = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* publishermetadatapropertybuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* publishermetadatapropertybufferused = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wevtapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "EvtGetPublisherMetadataProperty")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(publishermetadata, propertyid, flags, publishermetadatapropertybuffersize, publishermetadatapropertybuffer, publishermetadatapropertybufferused) : -1;
#else
    (void)publishermetadata;
    (void)propertyid;
    (void)flags;
    (void)publishermetadatapropertybuffersize;
    (void)publishermetadatapropertybuffer;
    (void)publishermetadatapropertybufferused;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_eventlog_EvtGetQueryInfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t queryorsubscription = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int32_t propertyid = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t propertyvaluebuffersize = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* propertyvaluebuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* propertyvaluebufferused = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wevtapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "EvtGetQueryInfo")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(queryorsubscription, propertyid, propertyvaluebuffersize, propertyvaluebuffer, propertyvaluebufferused) : -1;
#else
    (void)queryorsubscription;
    (void)propertyid;
    (void)propertyvaluebuffersize;
    (void)propertyvaluebuffer;
    (void)propertyvaluebufferused;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_eventlog_EvtNext_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t resultset = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint32_t eventssize = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* events = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t timeout = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* returned = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wevtapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "EvtNext")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(resultset, eventssize, events, timeout, flags, returned) : -1;
#else
    (void)resultset;
    (void)eventssize;
    (void)events;
    (void)timeout;
    (void)flags;
    (void)returned;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_eventlog_EvtNextChannelPath_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t channelenum = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint32_t channelpathbuffersize = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* channelpathbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* channelpathbufferused = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wevtapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "EvtNextChannelPath")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(channelenum, channelpathbuffersize, channelpathbuffer, channelpathbufferused) : -1;
#else
    (void)channelenum;
    (void)channelpathbuffersize;
    (void)channelpathbuffer;
    (void)channelpathbufferused;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_eventlog_EvtNextEventMetadata_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t eventmetadataenum = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wevtapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "EvtNextEventMetadata")));
    }
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(eventmetadataenum, flags) : -1;
#else
    (void)eventmetadataenum;
    (void)flags;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_system_eventlog_EvtNextPublisherId_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t publisherenum = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint32_t publisheridbuffersize = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* publisheridbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* publisheridbufferused = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wevtapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "EvtNextPublisherId")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(publisherenum, publisheridbuffersize, publisheridbuffer, publisheridbufferused) : -1;
#else
    (void)publisherenum;
    (void)publisheridbuffersize;
    (void)publisheridbuffer;
    (void)publisheridbufferused;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_eventlog_EvtOpenChannelConfig_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t session = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* channelpath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wevtapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "EvtOpenChannelConfig")));
    }
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(session, channelpath, flags) : -1;
#else
    (void)session;
    (void)channelpath;
    (void)flags;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_system_eventlog_EvtOpenChannelEnum_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t session = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wevtapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "EvtOpenChannelEnum")));
    }
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(session, flags) : -1;
#else
    (void)session;
    (void)flags;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_system_eventlog_EvtOpenEventMetadataEnum_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t publishermetadata = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wevtapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "EvtOpenEventMetadataEnum")));
    }
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(publishermetadata, flags) : -1;
#else
    (void)publishermetadata;
    (void)flags;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_system_eventlog_EvtOpenLog_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t session = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* path = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wevtapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "EvtOpenLog")));
    }
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(session, path, flags) : -1;
#else
    (void)session;
    (void)path;
    (void)flags;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_system_eventlog_EvtOpenPublisherEnum_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t session = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wevtapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "EvtOpenPublisherEnum")));
    }
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(session, flags) : -1;
#else
    (void)session;
    (void)flags;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_system_eventlog_EvtOpenPublisherMetadata_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t session = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* publisherid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* logfilepath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t locale = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wevtapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "EvtOpenPublisherMetadata")));
    }
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(session, publisherid, logfilepath, locale, flags) : -1;
#else
    (void)session;
    (void)publisherid;
    (void)logfilepath;
    (void)locale;
    (void)flags;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_system_eventlog_EvtOpenSession_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t loginclass = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* login = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t timeout = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wevtapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "EvtOpenSession")));
    }
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(loginclass, login, timeout, flags) : -1;
#else
    (void)loginclass;
    (void)login;
    (void)timeout;
    (void)flags;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_system_eventlog_EvtQuery_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t session = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* path = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* query = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wevtapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "EvtQuery")));
    }
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(session, path, query, flags) : -1;
#else
    (void)session;
    (void)path;
    (void)query;
    (void)flags;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_system_eventlog_EvtRender_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t context = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t fragment = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t buffersize = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* bufferused = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* propertycount = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wevtapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "EvtRender")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(context, fragment, flags, buffersize, buffer, bufferused, propertycount) : -1;
#else
    (void)context;
    (void)fragment;
    (void)flags;
    (void)buffersize;
    (void)buffer;
    (void)bufferused;
    (void)propertycount;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_eventlog_EvtSaveChannelConfig_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t channelconfig = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wevtapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "EvtSaveChannelConfig")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(channelconfig, flags) : -1;
#else
    (void)channelconfig;
    (void)flags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_eventlog_EvtSeek_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t resultset = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t position = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
    int64_t bookmark = km_info.Length() > 2 ? km_napi_arg_i64(km_info[2]) : 0;
    uint32_t timeout = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t, int64_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wevtapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "EvtSeek")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(resultset, position, bookmark, timeout, flags) : -1;
#else
    (void)resultset;
    (void)position;
    (void)bookmark;
    (void)timeout;
    (void)flags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_eventlog_EvtSetChannelConfigProperty_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t channelconfig = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int32_t propertyid = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* propertyvalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wevtapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "EvtSetChannelConfigProperty")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(channelconfig, propertyid, flags, propertyvalue) : -1;
#else
    (void)channelconfig;
    (void)propertyid;
    (void)flags;
    (void)propertyvalue;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_eventlog_EvtSubscribe_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t session = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* signalevent = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* channelpath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* query = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    int64_t bookmark = km_info.Length() > 4 ? km_napi_arg_i64(km_info[4]) : 0;
    void* context = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* callback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 7 ? km_info[7].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*, int64_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wevtapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "EvtSubscribe")));
    }
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(session, signalevent, channelpath, query, bookmark, context, callback, flags) : -1;
#else
    (void)session;
    (void)signalevent;
    (void)channelpath;
    (void)query;
    (void)bookmark;
    (void)context;
    (void)callback;
    (void)flags;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_system_eventlog_EvtUpdateBookmark_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t bookmark = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t event = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wevtapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "EvtUpdateBookmark")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(bookmark, event) : -1;
#else
    (void)bookmark;
    (void)event;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_eventlog_GetEventLogInformation_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* heventlog = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwinfolevel = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* lpbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t cbbufsize = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* pcbbytesneeded = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetEventLogInformation")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(heventlog, dwinfolevel, lpbuffer, cbbufsize, pcbbytesneeded) : -1;
#else
    (void)heventlog;
    (void)dwinfolevel;
    (void)lpbuffer;
    (void)cbbufsize;
    (void)pcbbytesneeded;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_eventlog_GetNumberOfEventLogRecords_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* heventlog = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* numberofrecords = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetNumberOfEventLogRecords")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(heventlog, numberofrecords) : -1;
#else
    (void)heventlog;
    (void)numberofrecords;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_eventlog_GetOldestEventLogRecord_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* heventlog = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* oldestrecord = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetOldestEventLogRecord")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(heventlog, oldestrecord) : -1;
#else
    (void)heventlog;
    (void)oldestrecord;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_eventlog_NotifyChangeEventLog_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* heventlog = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* hevent = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NotifyChangeEventLog")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(heventlog, hevent) : -1;
#else
    (void)heventlog;
    (void)hevent;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_eventlog_OpenBackupEventLogA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpuncservername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpfilename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "OpenBackupEventLogA")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpuncservername, lpfilename) : NULL;
#else
    (void)lpuncservername;
    (void)lpfilename;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_eventlog_OpenBackupEventLogW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpuncservername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpfilename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "OpenBackupEventLogW")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpuncservername, lpfilename) : NULL;
#else
    (void)lpuncservername;
    (void)lpfilename;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_eventlog_OpenEventLogA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpuncservername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpsourcename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "OpenEventLogA")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpuncservername, lpsourcename) : NULL;
#else
    (void)lpuncservername;
    (void)lpsourcename;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_eventlog_OpenEventLogW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpuncservername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpsourcename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "OpenEventLogW")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpuncservername, lpsourcename) : NULL;
#else
    (void)lpuncservername;
    (void)lpsourcename;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_eventlog_ReadEventLogA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* heventlog = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwreadflags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t dwrecordoffset = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* lpbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t nnumberofbytestoread = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* pnbytesread = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* pnminnumberofbytesneeded = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ReadEventLogA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(heventlog, dwreadflags, dwrecordoffset, lpbuffer, nnumberofbytestoread, pnbytesread, pnminnumberofbytesneeded) : -1;
#else
    (void)heventlog;
    (void)dwreadflags;
    (void)dwrecordoffset;
    (void)lpbuffer;
    (void)nnumberofbytestoread;
    (void)pnbytesread;
    (void)pnminnumberofbytesneeded;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_eventlog_ReadEventLogW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* heventlog = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwreadflags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t dwrecordoffset = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* lpbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t nnumberofbytestoread = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* pnbytesread = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* pnminnumberofbytesneeded = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ReadEventLogW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(heventlog, dwreadflags, dwrecordoffset, lpbuffer, nnumberofbytestoread, pnbytesread, pnminnumberofbytesneeded) : -1;
#else
    (void)heventlog;
    (void)dwreadflags;
    (void)dwrecordoffset;
    (void)lpbuffer;
    (void)nnumberofbytestoread;
    (void)pnbytesread;
    (void)pnminnumberofbytesneeded;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_eventlog_RegisterEventSourceA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpuncservername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpsourcename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RegisterEventSourceA")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpuncservername, lpsourcename) : NULL;
#else
    (void)lpuncservername;
    (void)lpsourcename;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_eventlog_RegisterEventSourceW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpuncservername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpsourcename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RegisterEventSourceW")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpuncservername, lpsourcename) : NULL;
#else
    (void)lpuncservername;
    (void)lpsourcename;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_eventlog_ReportEventA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* heventlog = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint16_t wtype = static_cast<uint16_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint16_t wcategory = static_cast<uint16_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t dweventid = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* lpusersid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint16_t wnumstrings = static_cast<uint16_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    uint32_t dwdatasize = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    void* lpstrings = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    void* lprawdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint16_t, uint16_t, uint32_t, void*, uint16_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ReportEventA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(heventlog, wtype, wcategory, dweventid, lpusersid, wnumstrings, dwdatasize, lpstrings, lprawdata) : -1;
#else
    (void)heventlog;
    (void)wtype;
    (void)wcategory;
    (void)dweventid;
    (void)lpusersid;
    (void)wnumstrings;
    (void)dwdatasize;
    (void)lpstrings;
    (void)lprawdata;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_eventlog_ReportEventW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* heventlog = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint16_t wtype = static_cast<uint16_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint16_t wcategory = static_cast<uint16_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t dweventid = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* lpusersid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint16_t wnumstrings = static_cast<uint16_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    uint32_t dwdatasize = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    void* lpstrings = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    void* lprawdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint16_t, uint16_t, uint32_t, void*, uint16_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ReportEventW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(heventlog, wtype, wcategory, dweventid, lpusersid, wnumstrings, dwdatasize, lpstrings, lprawdata) : -1;
#else
    (void)heventlog;
    (void)wtype;
    (void)wcategory;
    (void)dweventid;
    (void)lpusersid;
    (void)wnumstrings;
    (void)dwdatasize;
    (void)lpstrings;
    (void)lprawdata;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static void register_windows_win32_system_eventlog_napi(Napi::Env env, Napi::Object exports) {
    exports.Set("windowssys_windows_win32_system_eventlog_BackupEventLogA", Napi::Function::New(env, windowssys_windows_win32_system_eventlog_BackupEventLogA_napi));
    exports.Set("windowssys_windows_win32_system_eventlog_BackupEventLogW", Napi::Function::New(env, windowssys_windows_win32_system_eventlog_BackupEventLogW_napi));
    exports.Set("windowssys_windows_win32_system_eventlog_ClearEventLogA", Napi::Function::New(env, windowssys_windows_win32_system_eventlog_ClearEventLogA_napi));
    exports.Set("windowssys_windows_win32_system_eventlog_ClearEventLogW", Napi::Function::New(env, windowssys_windows_win32_system_eventlog_ClearEventLogW_napi));
    exports.Set("windowssys_windows_win32_system_eventlog_CloseEventLog", Napi::Function::New(env, windowssys_windows_win32_system_eventlog_CloseEventLog_napi));
    exports.Set("windowssys_windows_win32_system_eventlog_DeregisterEventSource", Napi::Function::New(env, windowssys_windows_win32_system_eventlog_DeregisterEventSource_napi));
    exports.Set("windowssys_windows_win32_system_eventlog_EvtArchiveExportedLog", Napi::Function::New(env, windowssys_windows_win32_system_eventlog_EvtArchiveExportedLog_napi));
    exports.Set("windowssys_windows_win32_system_eventlog_EvtCancel", Napi::Function::New(env, windowssys_windows_win32_system_eventlog_EvtCancel_napi));
    exports.Set("windowssys_windows_win32_system_eventlog_EvtClearLog", Napi::Function::New(env, windowssys_windows_win32_system_eventlog_EvtClearLog_napi));
    exports.Set("windowssys_windows_win32_system_eventlog_EvtClose", Napi::Function::New(env, windowssys_windows_win32_system_eventlog_EvtClose_napi));
    exports.Set("windowssys_windows_win32_system_eventlog_EvtCreateBookmark", Napi::Function::New(env, windowssys_windows_win32_system_eventlog_EvtCreateBookmark_napi));
    exports.Set("windowssys_windows_win32_system_eventlog_EvtCreateRenderContext", Napi::Function::New(env, windowssys_windows_win32_system_eventlog_EvtCreateRenderContext_napi));
    exports.Set("windowssys_windows_win32_system_eventlog_EvtExportLog", Napi::Function::New(env, windowssys_windows_win32_system_eventlog_EvtExportLog_napi));
    exports.Set("windowssys_windows_win32_system_eventlog_EvtFormatMessage", Napi::Function::New(env, windowssys_windows_win32_system_eventlog_EvtFormatMessage_napi));
    exports.Set("windowssys_windows_win32_system_eventlog_EvtGetChannelConfigProperty", Napi::Function::New(env, windowssys_windows_win32_system_eventlog_EvtGetChannelConfigProperty_napi));
    exports.Set("windowssys_windows_win32_system_eventlog_EvtGetEventInfo", Napi::Function::New(env, windowssys_windows_win32_system_eventlog_EvtGetEventInfo_napi));
    exports.Set("windowssys_windows_win32_system_eventlog_EvtGetEventMetadataProperty", Napi::Function::New(env, windowssys_windows_win32_system_eventlog_EvtGetEventMetadataProperty_napi));
    exports.Set("windowssys_windows_win32_system_eventlog_EvtGetExtendedStatus", Napi::Function::New(env, windowssys_windows_win32_system_eventlog_EvtGetExtendedStatus_napi));
    exports.Set("windowssys_windows_win32_system_eventlog_EvtGetLogInfo", Napi::Function::New(env, windowssys_windows_win32_system_eventlog_EvtGetLogInfo_napi));
    exports.Set("windowssys_windows_win32_system_eventlog_EvtGetObjectArrayProperty", Napi::Function::New(env, windowssys_windows_win32_system_eventlog_EvtGetObjectArrayProperty_napi));
    exports.Set("windowssys_windows_win32_system_eventlog_EvtGetObjectArraySize", Napi::Function::New(env, windowssys_windows_win32_system_eventlog_EvtGetObjectArraySize_napi));
    exports.Set("windowssys_windows_win32_system_eventlog_EvtGetPublisherMetadataProperty", Napi::Function::New(env, windowssys_windows_win32_system_eventlog_EvtGetPublisherMetadataProperty_napi));
    exports.Set("windowssys_windows_win32_system_eventlog_EvtGetQueryInfo", Napi::Function::New(env, windowssys_windows_win32_system_eventlog_EvtGetQueryInfo_napi));
    exports.Set("windowssys_windows_win32_system_eventlog_EvtNext", Napi::Function::New(env, windowssys_windows_win32_system_eventlog_EvtNext_napi));
    exports.Set("windowssys_windows_win32_system_eventlog_EvtNextChannelPath", Napi::Function::New(env, windowssys_windows_win32_system_eventlog_EvtNextChannelPath_napi));
    exports.Set("windowssys_windows_win32_system_eventlog_EvtNextEventMetadata", Napi::Function::New(env, windowssys_windows_win32_system_eventlog_EvtNextEventMetadata_napi));
    exports.Set("windowssys_windows_win32_system_eventlog_EvtNextPublisherId", Napi::Function::New(env, windowssys_windows_win32_system_eventlog_EvtNextPublisherId_napi));
    exports.Set("windowssys_windows_win32_system_eventlog_EvtOpenChannelConfig", Napi::Function::New(env, windowssys_windows_win32_system_eventlog_EvtOpenChannelConfig_napi));
    exports.Set("windowssys_windows_win32_system_eventlog_EvtOpenChannelEnum", Napi::Function::New(env, windowssys_windows_win32_system_eventlog_EvtOpenChannelEnum_napi));
    exports.Set("windowssys_windows_win32_system_eventlog_EvtOpenEventMetadataEnum", Napi::Function::New(env, windowssys_windows_win32_system_eventlog_EvtOpenEventMetadataEnum_napi));
    exports.Set("windowssys_windows_win32_system_eventlog_EvtOpenLog", Napi::Function::New(env, windowssys_windows_win32_system_eventlog_EvtOpenLog_napi));
    exports.Set("windowssys_windows_win32_system_eventlog_EvtOpenPublisherEnum", Napi::Function::New(env, windowssys_windows_win32_system_eventlog_EvtOpenPublisherEnum_napi));
    exports.Set("windowssys_windows_win32_system_eventlog_EvtOpenPublisherMetadata", Napi::Function::New(env, windowssys_windows_win32_system_eventlog_EvtOpenPublisherMetadata_napi));
    exports.Set("windowssys_windows_win32_system_eventlog_EvtOpenSession", Napi::Function::New(env, windowssys_windows_win32_system_eventlog_EvtOpenSession_napi));
    exports.Set("windowssys_windows_win32_system_eventlog_EvtQuery", Napi::Function::New(env, windowssys_windows_win32_system_eventlog_EvtQuery_napi));
    exports.Set("windowssys_windows_win32_system_eventlog_EvtRender", Napi::Function::New(env, windowssys_windows_win32_system_eventlog_EvtRender_napi));
    exports.Set("windowssys_windows_win32_system_eventlog_EvtSaveChannelConfig", Napi::Function::New(env, windowssys_windows_win32_system_eventlog_EvtSaveChannelConfig_napi));
    exports.Set("windowssys_windows_win32_system_eventlog_EvtSeek", Napi::Function::New(env, windowssys_windows_win32_system_eventlog_EvtSeek_napi));
    exports.Set("windowssys_windows_win32_system_eventlog_EvtSetChannelConfigProperty", Napi::Function::New(env, windowssys_windows_win32_system_eventlog_EvtSetChannelConfigProperty_napi));
    exports.Set("windowssys_windows_win32_system_eventlog_EvtSubscribe", Napi::Function::New(env, windowssys_windows_win32_system_eventlog_EvtSubscribe_napi));
    exports.Set("windowssys_windows_win32_system_eventlog_EvtUpdateBookmark", Napi::Function::New(env, windowssys_windows_win32_system_eventlog_EvtUpdateBookmark_napi));
    exports.Set("windowssys_windows_win32_system_eventlog_GetEventLogInformation", Napi::Function::New(env, windowssys_windows_win32_system_eventlog_GetEventLogInformation_napi));
    exports.Set("windowssys_windows_win32_system_eventlog_GetNumberOfEventLogRecords", Napi::Function::New(env, windowssys_windows_win32_system_eventlog_GetNumberOfEventLogRecords_napi));
    exports.Set("windowssys_windows_win32_system_eventlog_GetOldestEventLogRecord", Napi::Function::New(env, windowssys_windows_win32_system_eventlog_GetOldestEventLogRecord_napi));
    exports.Set("windowssys_windows_win32_system_eventlog_NotifyChangeEventLog", Napi::Function::New(env, windowssys_windows_win32_system_eventlog_NotifyChangeEventLog_napi));
    exports.Set("windowssys_windows_win32_system_eventlog_OpenBackupEventLogA", Napi::Function::New(env, windowssys_windows_win32_system_eventlog_OpenBackupEventLogA_napi));
    exports.Set("windowssys_windows_win32_system_eventlog_OpenBackupEventLogW", Napi::Function::New(env, windowssys_windows_win32_system_eventlog_OpenBackupEventLogW_napi));
    exports.Set("windowssys_windows_win32_system_eventlog_OpenEventLogA", Napi::Function::New(env, windowssys_windows_win32_system_eventlog_OpenEventLogA_napi));
    exports.Set("windowssys_windows_win32_system_eventlog_OpenEventLogW", Napi::Function::New(env, windowssys_windows_win32_system_eventlog_OpenEventLogW_napi));
    exports.Set("windowssys_windows_win32_system_eventlog_ReadEventLogA", Napi::Function::New(env, windowssys_windows_win32_system_eventlog_ReadEventLogA_napi));
    exports.Set("windowssys_windows_win32_system_eventlog_ReadEventLogW", Napi::Function::New(env, windowssys_windows_win32_system_eventlog_ReadEventLogW_napi));
    exports.Set("windowssys_windows_win32_system_eventlog_RegisterEventSourceA", Napi::Function::New(env, windowssys_windows_win32_system_eventlog_RegisterEventSourceA_napi));
    exports.Set("windowssys_windows_win32_system_eventlog_RegisterEventSourceW", Napi::Function::New(env, windowssys_windows_win32_system_eventlog_RegisterEventSourceW_napi));
    exports.Set("windowssys_windows_win32_system_eventlog_ReportEventA", Napi::Function::New(env, windowssys_windows_win32_system_eventlog_ReportEventA_napi));
    exports.Set("windowssys_windows_win32_system_eventlog_ReportEventW", Napi::Function::New(env, windowssys_windows_win32_system_eventlog_ReportEventW_napi));
}

static KmNapiRegistrarNode registrar_node = { &register_windows_win32_system_eventlog_napi, nullptr };
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
