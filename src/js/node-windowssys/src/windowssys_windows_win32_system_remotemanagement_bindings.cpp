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

static Napi::Value windowssys_windows_win32_system_remotemanagement_WSManCloseCommand_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t commandhandle = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* async = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wsmsvc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSManCloseCommand")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(commandhandle, flags, async);
#else
    (void)commandhandle;
    (void)flags;
    (void)async;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_remotemanagement_WSManCloseOperation_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t operationhandle = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wsmsvc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSManCloseOperation")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(operationhandle, flags) : 0;
#else
    (void)operationhandle;
    (void)flags;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_remotemanagement_WSManCloseSession_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t session = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wsmsvc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSManCloseSession")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(session, flags) : 0;
#else
    (void)session;
    (void)flags;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_remotemanagement_WSManCloseShell_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t shellhandle = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* async = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wsmsvc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSManCloseShell")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(shellhandle, flags, async);
#else
    (void)shellhandle;
    (void)flags;
    (void)async;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_remotemanagement_WSManConnectShell_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t session = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* resourceuri = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* shellid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* options = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* connectxml = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* async = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* shell = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, uint32_t, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wsmsvc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSManConnectShell")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(session, flags, resourceuri, shellid, options, connectxml, async, shell);
#else
    (void)session;
    (void)flags;
    (void)resourceuri;
    (void)shellid;
    (void)options;
    (void)connectxml;
    (void)async;
    (void)shell;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_remotemanagement_WSManConnectShellCommand_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t shell = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* commandid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* options = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* connectxml = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* async = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* command = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wsmsvc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSManConnectShellCommand")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(shell, flags, commandid, options, connectxml, async, command);
#else
    (void)shell;
    (void)flags;
    (void)commandid;
    (void)options;
    (void)connectxml;
    (void)async;
    (void)command;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_remotemanagement_WSManCreateSession_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t apihandle = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* connection = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* serverauthenticationcredentials = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* proxyinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* session = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wsmsvc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSManCreateSession")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(apihandle, connection, flags, serverauthenticationcredentials, proxyinfo, session) : 0;
#else
    (void)apihandle;
    (void)connection;
    (void)flags;
    (void)serverauthenticationcredentials;
    (void)proxyinfo;
    (void)session;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_remotemanagement_WSManCreateShell_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t session = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* resourceuri = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* startupinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* options = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* createxml = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* async = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* shell = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, uint32_t, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wsmsvc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSManCreateShell")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(session, flags, resourceuri, startupinfo, options, createxml, async, shell);
#else
    (void)session;
    (void)flags;
    (void)resourceuri;
    (void)startupinfo;
    (void)options;
    (void)createxml;
    (void)async;
    (void)shell;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_remotemanagement_WSManCreateShellEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t session = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* resourceuri = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* shellid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* startupinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* options = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* createxml = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* async = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    void* shell = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, uint32_t, void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wsmsvc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSManCreateShellEx")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(session, flags, resourceuri, shellid, startupinfo, options, createxml, async, shell);
#else
    (void)session;
    (void)flags;
    (void)resourceuri;
    (void)shellid;
    (void)startupinfo;
    (void)options;
    (void)createxml;
    (void)async;
    (void)shell;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_remotemanagement_WSManDeinitialize_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t apihandle = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wsmsvc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSManDeinitialize")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(apihandle, flags) : 0;
#else
    (void)apihandle;
    (void)flags;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_remotemanagement_WSManDisconnectShell_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t shell = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* disconnectinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* async = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wsmsvc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSManDisconnectShell")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(shell, flags, disconnectinfo, async);
#else
    (void)shell;
    (void)flags;
    (void)disconnectinfo;
    (void)async;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_remotemanagement_WSManGetErrorMessage_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t apihandle = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* languagecode = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t errorcode = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t messagelength = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* message = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* messagelengthused = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wsmsvc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSManGetErrorMessage")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(apihandle, flags, languagecode, errorcode, messagelength, message, messagelengthused) : 0;
#else
    (void)apihandle;
    (void)flags;
    (void)languagecode;
    (void)errorcode;
    (void)messagelength;
    (void)message;
    (void)messagelengthused;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_remotemanagement_WSManGetSessionOptionAsDword_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t session = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int32_t option = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* value = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wsmsvc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSManGetSessionOptionAsDword")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(session, option, value) : 0;
#else
    (void)session;
    (void)option;
    (void)value;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_remotemanagement_WSManGetSessionOptionAsString_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t session = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int32_t option = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t stringlength = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* string = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* stringlengthused = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wsmsvc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSManGetSessionOptionAsString")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(session, option, stringlength, string, stringlengthused) : 0;
#else
    (void)session;
    (void)option;
    (void)stringlength;
    (void)string;
    (void)stringlengthused;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_remotemanagement_WSManInitialize_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* apihandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wsmsvc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSManInitialize")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(flags, apihandle) : 0;
#else
    (void)flags;
    (void)apihandle;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_remotemanagement_WSManPluginAuthzOperationComplete_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* senderdetails = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* userauthorizationcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t errorcode = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* extendederrorinformation = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wsmsvc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSManPluginAuthzOperationComplete")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(senderdetails, flags, userauthorizationcontext, errorcode, extendederrorinformation) : 0;
#else
    (void)senderdetails;
    (void)flags;
    (void)userauthorizationcontext;
    (void)errorcode;
    (void)extendederrorinformation;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_remotemanagement_WSManPluginAuthzQueryQuotaComplete_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* senderdetails = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* quota = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t errorcode = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* extendederrorinformation = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wsmsvc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSManPluginAuthzQueryQuotaComplete")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(senderdetails, flags, quota, errorcode, extendederrorinformation) : 0;
#else
    (void)senderdetails;
    (void)flags;
    (void)quota;
    (void)errorcode;
    (void)extendederrorinformation;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_remotemanagement_WSManPluginAuthzUserComplete_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* senderdetails = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* userauthorizationcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* impersonationtoken = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    int32_t userisadministrator = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    uint32_t errorcode = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* extendederrorinformation = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, int32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wsmsvc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSManPluginAuthzUserComplete")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(senderdetails, flags, userauthorizationcontext, impersonationtoken, userisadministrator, errorcode, extendederrorinformation) : 0;
#else
    (void)senderdetails;
    (void)flags;
    (void)userauthorizationcontext;
    (void)impersonationtoken;
    (void)userisadministrator;
    (void)errorcode;
    (void)extendederrorinformation;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_remotemanagement_WSManPluginFreeRequestDetails_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* requestdetails = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wsmsvc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSManPluginFreeRequestDetails")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(requestdetails) : 0;
#else
    (void)requestdetails;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_remotemanagement_WSManPluginGetConfiguration_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* plugincontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* data = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wsmsvc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSManPluginGetConfiguration")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(plugincontext, flags, data) : 0;
#else
    (void)plugincontext;
    (void)flags;
    (void)data;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_remotemanagement_WSManPluginGetOperationParameters_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* requestdetails = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* data = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wsmsvc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSManPluginGetOperationParameters")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(requestdetails, flags, data) : 0;
#else
    (void)requestdetails;
    (void)flags;
    (void)data;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_remotemanagement_WSManPluginOperationComplete_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* requestdetails = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t errorcode = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* extendedinformation = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wsmsvc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSManPluginOperationComplete")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(requestdetails, flags, errorcode, extendedinformation) : 0;
#else
    (void)requestdetails;
    (void)flags;
    (void)errorcode;
    (void)extendedinformation;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_remotemanagement_WSManPluginReceiveResult_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* requestdetails = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* stream = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* streamresult = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* commandstate = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t exitcode = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wsmsvc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSManPluginReceiveResult")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(requestdetails, flags, stream, streamresult, commandstate, exitcode) : 0;
#else
    (void)requestdetails;
    (void)flags;
    (void)stream;
    (void)streamresult;
    (void)commandstate;
    (void)exitcode;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_remotemanagement_WSManPluginReportCompletion_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* plugincontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wsmsvc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSManPluginReportCompletion")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(plugincontext, flags) : 0;
#else
    (void)plugincontext;
    (void)flags;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_remotemanagement_WSManPluginReportContext_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* requestdetails = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* context = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wsmsvc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSManPluginReportContext")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(requestdetails, flags, context) : 0;
#else
    (void)requestdetails;
    (void)flags;
    (void)context;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_remotemanagement_WSManReceiveShellOutput_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t shell = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t command = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* desiredstreamset = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* async = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* receiveoperation = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, int64_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wsmsvc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSManReceiveShellOutput")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(shell, command, flags, desiredstreamset, async, receiveoperation);
#else
    (void)shell;
    (void)command;
    (void)flags;
    (void)desiredstreamset;
    (void)async;
    (void)receiveoperation;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_remotemanagement_WSManReconnectShell_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t shell = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* async = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wsmsvc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSManReconnectShell")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(shell, flags, async);
#else
    (void)shell;
    (void)flags;
    (void)async;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_remotemanagement_WSManReconnectShellCommand_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t commandhandle = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* async = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wsmsvc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSManReconnectShellCommand")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(commandhandle, flags, async);
#else
    (void)commandhandle;
    (void)flags;
    (void)async;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_remotemanagement_WSManRunShellCommand_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t shell = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* commandline = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* args = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* options = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* async = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* command = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wsmsvc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSManRunShellCommand")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(shell, flags, commandline, args, options, async, command);
#else
    (void)shell;
    (void)flags;
    (void)commandline;
    (void)args;
    (void)options;
    (void)async;
    (void)command;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_remotemanagement_WSManRunShellCommandEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t shell = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* commandid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* commandline = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* args = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* options = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* async = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* command = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, uint32_t, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wsmsvc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSManRunShellCommandEx")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(shell, flags, commandid, commandline, args, options, async, command);
#else
    (void)shell;
    (void)flags;
    (void)commandid;
    (void)commandline;
    (void)args;
    (void)options;
    (void)async;
    (void)command;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_remotemanagement_WSManSendShellInput_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t shell = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t command = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* streamid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* streamdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    int32_t endofstream = static_cast<int32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* async = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* sendoperation = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, int64_t, uint32_t, void*, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wsmsvc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSManSendShellInput")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(shell, command, flags, streamid, streamdata, endofstream, async, sendoperation);
#else
    (void)shell;
    (void)command;
    (void)flags;
    (void)streamid;
    (void)streamdata;
    (void)endofstream;
    (void)async;
    (void)sendoperation;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_remotemanagement_WSManSetSessionOption_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t session = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int32_t option = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* data = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wsmsvc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSManSetSessionOption")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(session, option, data) : 0;
#else
    (void)session;
    (void)option;
    (void)data;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_remotemanagement_WSManSignalShell_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t shell = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t command = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* code = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* async = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* signaloperation = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, int64_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wsmsvc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSManSignalShell")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(shell, command, flags, code, async, signaloperation);
#else
    (void)shell;
    (void)command;
    (void)flags;
    (void)code;
    (void)async;
    (void)signaloperation;
#endif
    return km_env.Undefined();
}

static void register_windows_win32_system_remotemanagement_napi(Napi::Env env, Napi::Object exports) {
    exports.Set("windowssys_windows_win32_system_remotemanagement_WSManCloseCommand", Napi::Function::New(env, windowssys_windows_win32_system_remotemanagement_WSManCloseCommand_napi));
    exports.Set("windowssys_windows_win32_system_remotemanagement_WSManCloseOperation", Napi::Function::New(env, windowssys_windows_win32_system_remotemanagement_WSManCloseOperation_napi));
    exports.Set("windowssys_windows_win32_system_remotemanagement_WSManCloseSession", Napi::Function::New(env, windowssys_windows_win32_system_remotemanagement_WSManCloseSession_napi));
    exports.Set("windowssys_windows_win32_system_remotemanagement_WSManCloseShell", Napi::Function::New(env, windowssys_windows_win32_system_remotemanagement_WSManCloseShell_napi));
    exports.Set("windowssys_windows_win32_system_remotemanagement_WSManConnectShell", Napi::Function::New(env, windowssys_windows_win32_system_remotemanagement_WSManConnectShell_napi));
    exports.Set("windowssys_windows_win32_system_remotemanagement_WSManConnectShellCommand", Napi::Function::New(env, windowssys_windows_win32_system_remotemanagement_WSManConnectShellCommand_napi));
    exports.Set("windowssys_windows_win32_system_remotemanagement_WSManCreateSession", Napi::Function::New(env, windowssys_windows_win32_system_remotemanagement_WSManCreateSession_napi));
    exports.Set("windowssys_windows_win32_system_remotemanagement_WSManCreateShell", Napi::Function::New(env, windowssys_windows_win32_system_remotemanagement_WSManCreateShell_napi));
    exports.Set("windowssys_windows_win32_system_remotemanagement_WSManCreateShellEx", Napi::Function::New(env, windowssys_windows_win32_system_remotemanagement_WSManCreateShellEx_napi));
    exports.Set("windowssys_windows_win32_system_remotemanagement_WSManDeinitialize", Napi::Function::New(env, windowssys_windows_win32_system_remotemanagement_WSManDeinitialize_napi));
    exports.Set("windowssys_windows_win32_system_remotemanagement_WSManDisconnectShell", Napi::Function::New(env, windowssys_windows_win32_system_remotemanagement_WSManDisconnectShell_napi));
    exports.Set("windowssys_windows_win32_system_remotemanagement_WSManGetErrorMessage", Napi::Function::New(env, windowssys_windows_win32_system_remotemanagement_WSManGetErrorMessage_napi));
    exports.Set("windowssys_windows_win32_system_remotemanagement_WSManGetSessionOptionAsDword", Napi::Function::New(env, windowssys_windows_win32_system_remotemanagement_WSManGetSessionOptionAsDword_napi));
    exports.Set("windowssys_windows_win32_system_remotemanagement_WSManGetSessionOptionAsString", Napi::Function::New(env, windowssys_windows_win32_system_remotemanagement_WSManGetSessionOptionAsString_napi));
    exports.Set("windowssys_windows_win32_system_remotemanagement_WSManInitialize", Napi::Function::New(env, windowssys_windows_win32_system_remotemanagement_WSManInitialize_napi));
    exports.Set("windowssys_windows_win32_system_remotemanagement_WSManPluginAuthzOperationComplete", Napi::Function::New(env, windowssys_windows_win32_system_remotemanagement_WSManPluginAuthzOperationComplete_napi));
    exports.Set("windowssys_windows_win32_system_remotemanagement_WSManPluginAuthzQueryQuotaComplete", Napi::Function::New(env, windowssys_windows_win32_system_remotemanagement_WSManPluginAuthzQueryQuotaComplete_napi));
    exports.Set("windowssys_windows_win32_system_remotemanagement_WSManPluginAuthzUserComplete", Napi::Function::New(env, windowssys_windows_win32_system_remotemanagement_WSManPluginAuthzUserComplete_napi));
    exports.Set("windowssys_windows_win32_system_remotemanagement_WSManPluginFreeRequestDetails", Napi::Function::New(env, windowssys_windows_win32_system_remotemanagement_WSManPluginFreeRequestDetails_napi));
    exports.Set("windowssys_windows_win32_system_remotemanagement_WSManPluginGetConfiguration", Napi::Function::New(env, windowssys_windows_win32_system_remotemanagement_WSManPluginGetConfiguration_napi));
    exports.Set("windowssys_windows_win32_system_remotemanagement_WSManPluginGetOperationParameters", Napi::Function::New(env, windowssys_windows_win32_system_remotemanagement_WSManPluginGetOperationParameters_napi));
    exports.Set("windowssys_windows_win32_system_remotemanagement_WSManPluginOperationComplete", Napi::Function::New(env, windowssys_windows_win32_system_remotemanagement_WSManPluginOperationComplete_napi));
    exports.Set("windowssys_windows_win32_system_remotemanagement_WSManPluginReceiveResult", Napi::Function::New(env, windowssys_windows_win32_system_remotemanagement_WSManPluginReceiveResult_napi));
    exports.Set("windowssys_windows_win32_system_remotemanagement_WSManPluginReportCompletion", Napi::Function::New(env, windowssys_windows_win32_system_remotemanagement_WSManPluginReportCompletion_napi));
    exports.Set("windowssys_windows_win32_system_remotemanagement_WSManPluginReportContext", Napi::Function::New(env, windowssys_windows_win32_system_remotemanagement_WSManPluginReportContext_napi));
    exports.Set("windowssys_windows_win32_system_remotemanagement_WSManReceiveShellOutput", Napi::Function::New(env, windowssys_windows_win32_system_remotemanagement_WSManReceiveShellOutput_napi));
    exports.Set("windowssys_windows_win32_system_remotemanagement_WSManReconnectShell", Napi::Function::New(env, windowssys_windows_win32_system_remotemanagement_WSManReconnectShell_napi));
    exports.Set("windowssys_windows_win32_system_remotemanagement_WSManReconnectShellCommand", Napi::Function::New(env, windowssys_windows_win32_system_remotemanagement_WSManReconnectShellCommand_napi));
    exports.Set("windowssys_windows_win32_system_remotemanagement_WSManRunShellCommand", Napi::Function::New(env, windowssys_windows_win32_system_remotemanagement_WSManRunShellCommand_napi));
    exports.Set("windowssys_windows_win32_system_remotemanagement_WSManRunShellCommandEx", Napi::Function::New(env, windowssys_windows_win32_system_remotemanagement_WSManRunShellCommandEx_napi));
    exports.Set("windowssys_windows_win32_system_remotemanagement_WSManSendShellInput", Napi::Function::New(env, windowssys_windows_win32_system_remotemanagement_WSManSendShellInput_napi));
    exports.Set("windowssys_windows_win32_system_remotemanagement_WSManSetSessionOption", Napi::Function::New(env, windowssys_windows_win32_system_remotemanagement_WSManSetSessionOption_napi));
    exports.Set("windowssys_windows_win32_system_remotemanagement_WSManSignalShell", Napi::Function::New(env, windowssys_windows_win32_system_remotemanagement_WSManSignalShell_napi));
}

static KmNapiRegistrarNode registrar_node = { &register_windows_win32_system_remotemanagement_napi, nullptr };
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
