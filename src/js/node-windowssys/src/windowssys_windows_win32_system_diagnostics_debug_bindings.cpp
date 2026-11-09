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

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_AddVectoredContinueHandler_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t first = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* handler = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "AddVectoredContinueHandler")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(first, handler) : NULL;
#else
    (void)first;
    (void)handler;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_AddVectoredExceptionHandler_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t first = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* handler = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "AddVectoredExceptionHandler")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(first, handler) : NULL;
#else
    (void)first;
    (void)handler;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_Beep_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwfreq = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t dwduration = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "Beep")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwfreq, dwduration) : -1;
#else
    (void)dwfreq;
    (void)dwduration;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_BindImage_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* imagename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* dllpath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* symbolpath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("imagehlp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "BindImage")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(imagename, dllpath, symbolpath) : -1;
#else
    (void)imagename;
    (void)dllpath;
    (void)symbolpath;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_BindImageEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* imagename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* dllpath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* symbolpath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* statusroutine = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("imagehlp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "BindImageEx")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(flags, imagename, dllpath, symbolpath, statusroutine) : -1;
#else
    (void)flags;
    (void)imagename;
    (void)dllpath;
    (void)symbolpath;
    (void)statusroutine;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_CheckRemoteDebuggerPresent_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pbdebuggerpresent = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CheckRemoteDebuggerPresent")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, pbdebuggerpresent) : -1;
#else
    (void)hprocess;
    (void)pbdebuggerpresent;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_CheckSumMappedFile_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* baseaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t filelength = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* headersum = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* checksum = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("imagehlp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CheckSumMappedFile")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(baseaddress, filelength, headersum, checksum) : NULL;
#else
    (void)baseaddress;
    (void)filelength;
    (void)headersum;
    (void)checksum;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_CloseThreadWaitChainSession_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* wcthandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CloseThreadWaitChainSession")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(wcthandle);
#else
    (void)wcthandle;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_ContinueDebugEvent_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwprocessid = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t dwthreadid = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t dwcontinuestatus = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ContinueDebugEvent")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwprocessid, dwthreadid, dwcontinuestatus) : -1;
#else
    (void)dwprocessid;
    (void)dwthreadid;
    (void)dwcontinuestatus;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_CopyContext_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* destination = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t contextflags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* source = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CopyContext")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(destination, contextflags, source) : -1;
#else
    (void)destination;
    (void)contextflags;
    (void)source;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_DbgHelpCreateUserDump_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* filename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* callback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* userdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DbgHelpCreateUserDump")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(filename, callback, userdata) : -1;
#else
    (void)filename;
    (void)callback;
    (void)userdata;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_DbgHelpCreateUserDumpW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* filename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* callback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* userdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DbgHelpCreateUserDumpW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(filename, callback, userdata) : -1;
#else
    (void)filename;
    (void)callback;
    (void)userdata;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_DebugActiveProcess_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwprocessid = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DebugActiveProcess")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwprocessid) : -1;
#else
    (void)dwprocessid;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_DebugActiveProcessStop_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwprocessid = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DebugActiveProcessStop")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwprocessid) : -1;
#else
    (void)dwprocessid;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_DebugBreak_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DebugBreak")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr();
#else
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_DebugBreakProcess_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* process = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DebugBreakProcess")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(process) : -1;
#else
    (void)process;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_DebugSetProcessKillOnExit_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t killonexit = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DebugSetProcessKillOnExit")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(killonexit) : -1;
#else
    (void)killonexit;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_DecodePointer_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ptr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DecodePointer")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(ptr) : NULL;
#else
    (void)ptr;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_DecodeRemotePointer_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* processhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ptr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* decodedptr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-util-l1-1-1.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DecodeRemotePointer")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(processhandle, ptr, decodedptr) : -1;
#else
    (void)processhandle;
    (void)ptr;
    (void)decodedptr;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_DecodeSystemPointer_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ptr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DecodeSystemPointer")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(ptr) : NULL;
#else
    (void)ptr;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_EncodePointer_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ptr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "EncodePointer")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(ptr) : NULL;
#else
    (void)ptr;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_EncodeRemotePointer_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* processhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ptr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* encodedptr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-util-l1-1-1.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "EncodeRemotePointer")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(processhandle, ptr, encodedptr) : -1;
#else
    (void)processhandle;
    (void)ptr;
    (void)encodedptr;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_EncodeSystemPointer_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ptr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "EncodeSystemPointer")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(ptr) : NULL;
#else
    (void)ptr;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_EnumDirTree_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* rootpath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* inputpathname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* outputpathbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* cb = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* data = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "EnumDirTree")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, rootpath, inputpathname, outputpathbuffer, cb, data) : -1;
#else
    (void)hprocess;
    (void)rootpath;
    (void)inputpathname;
    (void)outputpathbuffer;
    (void)cb;
    (void)data;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_EnumDirTreeW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* rootpath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* inputpathname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* outputpathbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* cb = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* data = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "EnumDirTreeW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, rootpath, inputpathname, outputpathbuffer, cb, data) : -1;
#else
    (void)hprocess;
    (void)rootpath;
    (void)inputpathname;
    (void)outputpathbuffer;
    (void)cb;
    (void)data;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_EnumerateLoadedModules64_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* enumloadedmodulescallback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* usercontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "EnumerateLoadedModules64")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, enumloadedmodulescallback, usercontext) : -1;
#else
    (void)hprocess;
    (void)enumloadedmodulescallback;
    (void)usercontext;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_EnumerateLoadedModulesEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* enumloadedmodulescallback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* usercontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "EnumerateLoadedModulesEx")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, enumloadedmodulescallback, usercontext) : -1;
#else
    (void)hprocess;
    (void)enumloadedmodulescallback;
    (void)usercontext;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_EnumerateLoadedModulesExW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* enumloadedmodulescallback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* usercontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "EnumerateLoadedModulesExW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, enumloadedmodulescallback, usercontext) : -1;
#else
    (void)hprocess;
    (void)enumloadedmodulescallback;
    (void)usercontext;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_EnumerateLoadedModulesW64_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* enumloadedmodulescallback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* usercontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "EnumerateLoadedModulesW64")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, enumloadedmodulescallback, usercontext) : -1;
#else
    (void)hprocess;
    (void)enumloadedmodulescallback;
    (void)usercontext;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_FatalAppExitA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t uaction = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* lpmessagetext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FatalAppExitA")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(uaction, lpmessagetext);
#else
    (void)uaction;
    (void)lpmessagetext;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_FatalAppExitW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t uaction = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* lpmessagetext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FatalAppExitW")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(uaction, lpmessagetext);
#else
    (void)uaction;
    (void)lpmessagetext;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_FatalExit_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t exitcode = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FatalExit")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(exitcode);
#else
    (void)exitcode;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_FindDebugInfoFile_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* filename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* symbolpath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* debugfilepath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FindDebugInfoFile")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(filename, symbolpath, debugfilepath) : NULL;
#else
    (void)filename;
    (void)symbolpath;
    (void)debugfilepath;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_FindDebugInfoFileEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* filename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* symbolpath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* debugfilepath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* callback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* callerdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FindDebugInfoFileEx")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(filename, symbolpath, debugfilepath, callback, callerdata) : NULL;
#else
    (void)filename;
    (void)symbolpath;
    (void)debugfilepath;
    (void)callback;
    (void)callerdata;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_FindDebugInfoFileExW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* filename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* symbolpath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* debugfilepath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* callback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* callerdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FindDebugInfoFileExW")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(filename, symbolpath, debugfilepath, callback, callerdata) : NULL;
#else
    (void)filename;
    (void)symbolpath;
    (void)debugfilepath;
    (void)callback;
    (void)callerdata;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_FindExecutableImage_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* filename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* symbolpath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* imagefilepath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FindExecutableImage")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(filename, symbolpath, imagefilepath) : NULL;
#else
    (void)filename;
    (void)symbolpath;
    (void)imagefilepath;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_FindExecutableImageEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* filename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* symbolpath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* imagefilepath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* callback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* callerdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FindExecutableImageEx")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(filename, symbolpath, imagefilepath, callback, callerdata) : NULL;
#else
    (void)filename;
    (void)symbolpath;
    (void)imagefilepath;
    (void)callback;
    (void)callerdata;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_FindExecutableImageExW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* filename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* symbolpath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* imagefilepath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* callback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* callerdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FindExecutableImageExW")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(filename, symbolpath, imagefilepath, callback, callerdata) : NULL;
#else
    (void)filename;
    (void)symbolpath;
    (void)imagefilepath;
    (void)callback;
    (void)callerdata;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_FindFileInPath_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* searchpatha = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* filename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* id = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t two = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    uint32_t three = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    void* filepath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FindFileInPath")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, searchpatha, filename, id, two, three, flags, filepath) : -1;
#else
    (void)hprocess;
    (void)searchpatha;
    (void)filename;
    (void)id;
    (void)two;
    (void)three;
    (void)flags;
    (void)filepath;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_FindFileInSearchPath_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* searchpatha = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* filename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t one = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t two = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    uint32_t three = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* filepath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FindFileInSearchPath")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, searchpatha, filename, one, two, three, filepath) : -1;
#else
    (void)hprocess;
    (void)searchpatha;
    (void)filename;
    (void)one;
    (void)two;
    (void)three;
    (void)filepath;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_FlushInstructionCache_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpbaseaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint64_t dwsize = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FlushInstructionCache")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, lpbaseaddress, dwsize) : -1;
#else
    (void)hprocess;
    (void)lpbaseaddress;
    (void)dwsize;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_FormatMessageA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* lpsource = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwmessageid = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t dwlanguageid = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* lpbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t nsize = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* arguments = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FormatMessageA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwflags, lpsource, dwmessageid, dwlanguageid, lpbuffer, nsize, arguments) : 0;
#else
    (void)dwflags;
    (void)lpsource;
    (void)dwmessageid;
    (void)dwlanguageid;
    (void)lpbuffer;
    (void)nsize;
    (void)arguments;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_FormatMessageW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* lpsource = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwmessageid = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t dwlanguageid = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* lpbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t nsize = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* arguments = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FormatMessageW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwflags, lpsource, dwmessageid, dwlanguageid, lpbuffer, nsize, arguments) : 0;
#else
    (void)dwflags;
    (void)lpsource;
    (void)dwmessageid;
    (void)dwlanguageid;
    (void)lpbuffer;
    (void)nsize;
    (void)arguments;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_GetEnabledXStateFeatures_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetEnabledXStateFeatures")));
    }
    uint64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr() : 0;
#else
    uint64_t km_res = 0;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<uint64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_GetErrorMode_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetErrorMode")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr() : 0;
#else
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_GetImageConfigInformation_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* loadedimage = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* imageconfiginformation = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("imagehlp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetImageConfigInformation")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(loadedimage, imageconfiginformation) : -1;
#else
    (void)loadedimage;
    (void)imageconfiginformation;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_GetImageUnusedHeaderBytes_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* loadedimage = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* sizeunusedheaderbytes = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("imagehlp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetImageUnusedHeaderBytes")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(loadedimage, sizeunusedheaderbytes) : 0;
#else
    (void)loadedimage;
    (void)sizeunusedheaderbytes;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_GetSymLoadError_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetSymLoadError")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr() : 0;
#else
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_GetThreadContext_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hthread = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetThreadContext")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hthread, lpcontext) : -1;
#else
    (void)hthread;
    (void)lpcontext;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_GetThreadErrorMode_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetThreadErrorMode")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr() : 0;
#else
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_GetThreadSelectorEntry_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hthread = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwselector = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* lpselectorentry = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetThreadSelectorEntry")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hthread, dwselector, lpselectorentry) : -1;
#else
    (void)hthread;
    (void)dwselector;
    (void)lpselectorentry;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_GetThreadWaitChain_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* wcthandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t context = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t threadid = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* nodecount = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* nodeinfoarray = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* iscycle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetThreadWaitChain")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(wcthandle, context, flags, threadid, nodecount, nodeinfoarray, iscycle) : -1;
#else
    (void)wcthandle;
    (void)context;
    (void)flags;
    (void)threadid;
    (void)nodecount;
    (void)nodeinfoarray;
    (void)iscycle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_GetTimestampForLoadedLibrary_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* module = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetTimestampForLoadedLibrary")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(module) : 0;
#else
    (void)module;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_GetXStateFeaturesMask_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* context = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* featuremask = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetXStateFeaturesMask")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(context, featuremask) : -1;
#else
    (void)context;
    (void)featuremask;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_ImageAddCertificate_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* filehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* certificate = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* arg_2_index = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("imagehlp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ImageAddCertificate")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(filehandle, certificate, arg_2_index) : -1;
#else
    (void)filehandle;
    (void)certificate;
    (void)arg_2_index;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_ImageDirectoryEntryToData_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* base = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    bool mappedasimage = km_info.Length() > 1 ? km_info[1].ToBoolean().Value() : false;
    uint16_t directoryentry = static_cast<uint16_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* size = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, bool, uint16_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ImageDirectoryEntryToData")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(base, mappedasimage, directoryentry, size) : NULL;
#else
    (void)base;
    (void)mappedasimage;
    (void)directoryentry;
    (void)size;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_ImageDirectoryEntryToDataEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* base = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    bool mappedasimage = km_info.Length() > 1 ? km_info[1].ToBoolean().Value() : false;
    uint16_t directoryentry = static_cast<uint16_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* size = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* foundheader = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, bool, uint16_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ImageDirectoryEntryToDataEx")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(base, mappedasimage, directoryentry, size, foundheader) : NULL;
#else
    (void)base;
    (void)mappedasimage;
    (void)directoryentry;
    (void)size;
    (void)foundheader;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_ImageEnumerateCertificates_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* filehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint16_t typefilter = static_cast<uint16_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* certificatecount = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* indices = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t indexcount = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint16_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("imagehlp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ImageEnumerateCertificates")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(filehandle, typefilter, certificatecount, indices, indexcount) : -1;
#else
    (void)filehandle;
    (void)typefilter;
    (void)certificatecount;
    (void)indices;
    (void)indexcount;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_ImageGetCertificateData_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* filehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t certificateindex = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* certificate = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* requiredlength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("imagehlp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ImageGetCertificateData")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(filehandle, certificateindex, certificate, requiredlength) : -1;
#else
    (void)filehandle;
    (void)certificateindex;
    (void)certificate;
    (void)requiredlength;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_ImageGetCertificateHeader_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* filehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t certificateindex = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* certificateheader = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("imagehlp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ImageGetCertificateHeader")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(filehandle, certificateindex, certificateheader) : -1;
#else
    (void)filehandle;
    (void)certificateindex;
    (void)certificateheader;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_ImageGetDigestStream_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* filehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t digestlevel = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* digestfunction = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* digesthandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("imagehlp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ImageGetDigestStream")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(filehandle, digestlevel, digestfunction, digesthandle) : -1;
#else
    (void)filehandle;
    (void)digestlevel;
    (void)digestfunction;
    (void)digesthandle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_ImageLoad_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* dllname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* dllpath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("imagehlp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ImageLoad")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dllname, dllpath) : NULL;
#else
    (void)dllname;
    (void)dllpath;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_ImageNtHeader_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* base = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ImageNtHeader")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(base) : NULL;
#else
    (void)base;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_ImageRemoveCertificate_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* filehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t arg_1_index = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("imagehlp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ImageRemoveCertificate")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(filehandle, arg_1_index) : -1;
#else
    (void)filehandle;
    (void)arg_1_index;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_ImageRvaToSection_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ntheaders = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* base = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t rva = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ImageRvaToSection")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(ntheaders, base, rva) : NULL;
#else
    (void)ntheaders;
    (void)base;
    (void)rva;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_ImageRvaToVa_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ntheaders = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* base = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t rva = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* lastrvasection = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ImageRvaToVa")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(ntheaders, base, rva, lastrvasection) : NULL;
#else
    (void)ntheaders;
    (void)base;
    (void)rva;
    (void)lastrvasection;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_ImageUnload_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* loadedimage = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("imagehlp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ImageUnload")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(loadedimage) : -1;
#else
    (void)loadedimage;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_ImagehlpApiVersion_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ImagehlpApiVersion")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr() : NULL;
#else
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_ImagehlpApiVersionEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* appversion = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ImagehlpApiVersionEx")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(appversion) : NULL;
#else
    (void)appversion;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_InitializeContext_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t contextflags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* context = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* contextlength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "InitializeContext")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(buffer, contextflags, context, contextlength) : -1;
#else
    (void)buffer;
    (void)contextflags;
    (void)context;
    (void)contextlength;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_InitializeContext2_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t contextflags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* context = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* contextlength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint64_t xstatecompactionmask = km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "InitializeContext2")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(buffer, contextflags, context, contextlength, xstatecompactionmask) : -1;
#else
    (void)buffer;
    (void)contextflags;
    (void)context;
    (void)contextlength;
    (void)xstatecompactionmask;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_IsDebuggerPresent_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IsDebuggerPresent")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_LocateXStateFeature_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* context = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t featureid = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* length = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "LocateXStateFeature")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(context, featureid, length) : NULL;
#else
    (void)context;
    (void)featureid;
    (void)length;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_MakeSureDirectoryPathExists_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* dirpath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MakeSureDirectoryPathExists")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dirpath) : -1;
#else
    (void)dirpath;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_MapAndLoad_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* imagename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* dllpath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* loadedimage = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int32_t dotdll = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    int32_t readonly = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("imagehlp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MapAndLoad")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(imagename, dllpath, loadedimage, dotdll, readonly) : -1;
#else
    (void)imagename;
    (void)dllpath;
    (void)loadedimage;
    (void)dotdll;
    (void)readonly;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_MapFileAndCheckSumA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* filename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* headersum = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* checksum = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("imagehlp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MapFileAndCheckSumA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(filename, headersum, checksum) : 0;
#else
    (void)filename;
    (void)headersum;
    (void)checksum;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_MapFileAndCheckSumW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* filename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* headersum = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* checksum = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("imagehlp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MapFileAndCheckSumW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(filename, headersum, checksum) : 0;
#else
    (void)filename;
    (void)headersum;
    (void)checksum;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_MessageBeep_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t utype = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MessageBeep")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(utype) : -1;
#else
    (void)utype;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_MiniDumpReadDumpStream_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* baseofdump = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t streamnumber = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* dir = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* streampointer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* streamsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MiniDumpReadDumpStream")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(baseofdump, streamnumber, dir, streampointer, streamsize) : -1;
#else
    (void)baseofdump;
    (void)streamnumber;
    (void)dir;
    (void)streampointer;
    (void)streamsize;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_MiniDumpWriteDump_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t processid = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* hfile = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int32_t dumptype = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* exceptionparam = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* userstreamparam = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* callbackparam = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MiniDumpWriteDump")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, processid, hfile, dumptype, exceptionparam, userstreamparam, callbackparam) : -1;
#else
    (void)hprocess;
    (void)processid;
    (void)hfile;
    (void)dumptype;
    (void)exceptionparam;
    (void)userstreamparam;
    (void)callbackparam;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_OpenThreadWaitChainSession_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* callback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "OpenThreadWaitChainSession")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(flags, callback) : NULL;
#else
    (void)flags;
    (void)callback;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_OutputDebugStringA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpoutputstring = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "OutputDebugStringA")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(lpoutputstring);
#else
    (void)lpoutputstring;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_OutputDebugStringW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpoutputstring = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "OutputDebugStringW")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(lpoutputstring);
#else
    (void)lpoutputstring;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_RaiseException_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwexceptioncode = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t dwexceptionflags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t nnumberofarguments = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* lparguments = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RaiseException")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(dwexceptioncode, dwexceptionflags, nnumberofarguments, lparguments);
#else
    (void)dwexceptioncode;
    (void)dwexceptionflags;
    (void)nnumberofarguments;
    (void)lparguments;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_RaiseFailFastException_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pexceptionrecord = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pcontextrecord = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RaiseFailFastException")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(pexceptionrecord, pcontextrecord, dwflags);
#else
    (void)pexceptionrecord;
    (void)pcontextrecord;
    (void)dwflags;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_RangeMapAddPeImageSections_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* rmaphandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* imagename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* mappedimage = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t mappingbytes = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint64_t imagebase = km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0;
    uint64_t usertag = km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0;
    uint32_t mappingflags = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint64_t, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RangeMapAddPeImageSections")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(rmaphandle, imagename, mappedimage, mappingbytes, imagebase, usertag, mappingflags) : -1;
#else
    (void)rmaphandle;
    (void)imagename;
    (void)mappedimage;
    (void)mappingbytes;
    (void)imagebase;
    (void)usertag;
    (void)mappingflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_RangeMapCreate_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RangeMapCreate")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr() : NULL;
#else
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_RangeMapFree_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* rmaphandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RangeMapFree")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(rmaphandle);
#else
    (void)rmaphandle;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_RangeMapRead_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* rmaphandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t offset = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t requestbytes = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* donebytes = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RangeMapRead")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(rmaphandle, offset, buffer, requestbytes, flags, donebytes) : -1;
#else
    (void)rmaphandle;
    (void)offset;
    (void)buffer;
    (void)requestbytes;
    (void)flags;
    (void)donebytes;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_RangeMapRemove_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* rmaphandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t usertag = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RangeMapRemove")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(rmaphandle, usertag) : -1;
#else
    (void)rmaphandle;
    (void)usertag;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_RangeMapWrite_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* rmaphandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t offset = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t requestbytes = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* donebytes = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RangeMapWrite")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(rmaphandle, offset, buffer, requestbytes, flags, donebytes) : -1;
#else
    (void)rmaphandle;
    (void)offset;
    (void)buffer;
    (void)requestbytes;
    (void)flags;
    (void)donebytes;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_ReBaseImage_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* currentimagename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* symbolpath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t frebase = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t frebasesysfileok = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    int32_t fgoingdown = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    uint32_t checkimagesize = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* oldimagesize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* oldimagebase = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    void* newimagesize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
    void* newimagebase = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 9 ? km_napi_arg_u64(km_info[9]) : 0));
    uint32_t timestamp = static_cast<uint32_t>(km_info.Length() > 10 ? km_info[10].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t, int32_t, uint32_t, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("imagehlp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ReBaseImage")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(currentimagename, symbolpath, frebase, frebasesysfileok, fgoingdown, checkimagesize, oldimagesize, oldimagebase, newimagesize, newimagebase, timestamp) : -1;
#else
    (void)currentimagename;
    (void)symbolpath;
    (void)frebase;
    (void)frebasesysfileok;
    (void)fgoingdown;
    (void)checkimagesize;
    (void)oldimagesize;
    (void)oldimagebase;
    (void)newimagesize;
    (void)newimagebase;
    (void)timestamp;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_ReBaseImage64_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* currentimagename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* symbolpath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t frebase = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t frebasesysfileok = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    int32_t fgoingdown = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    uint32_t checkimagesize = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* oldimagesize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* oldimagebase = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    void* newimagesize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
    void* newimagebase = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 9 ? km_napi_arg_u64(km_info[9]) : 0));
    uint32_t timestamp = static_cast<uint32_t>(km_info.Length() > 10 ? km_info[10].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t, int32_t, uint32_t, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("imagehlp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ReBaseImage64")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(currentimagename, symbolpath, frebase, frebasesysfileok, fgoingdown, checkimagesize, oldimagesize, oldimagebase, newimagesize, newimagebase, timestamp) : -1;
#else
    (void)currentimagename;
    (void)symbolpath;
    (void)frebase;
    (void)frebasesysfileok;
    (void)fgoingdown;
    (void)checkimagesize;
    (void)oldimagesize;
    (void)oldimagebase;
    (void)newimagesize;
    (void)newimagebase;
    (void)timestamp;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_ReadProcessMemory_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpbaseaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* lpbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint64_t nsize = km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0;
    void* lpnumberofbytesread = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ReadProcessMemory")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, lpbaseaddress, lpbuffer, nsize, lpnumberofbytesread) : -1;
#else
    (void)hprocess;
    (void)lpbaseaddress;
    (void)lpbuffer;
    (void)nsize;
    (void)lpnumberofbytesread;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_RegisterWaitChainCOMCallback_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* callstatecallback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* activationstatecallback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RegisterWaitChainCOMCallback")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(callstatecallback, activationstatecallback);
#else
    (void)callstatecallback;
    (void)activationstatecallback;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_RemoveInvalidModuleList_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RemoveInvalidModuleList")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(hprocess);
#else
    (void)hprocess;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_RemoveVectoredContinueHandler_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* handle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RemoveVectoredContinueHandler")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(handle) : 0;
#else
    (void)handle;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_RemoveVectoredExceptionHandler_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* handle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RemoveVectoredExceptionHandler")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(handle) : 0;
#else
    (void)handle;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_ReportSymbolLoadSummary_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ploadmodule = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* psymboldata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ReportSymbolLoadSummary")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, ploadmodule, psymboldata) : -1;
#else
    (void)hprocess;
    (void)ploadmodule;
    (void)psymboldata;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_RtlAddFunctionTable_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* functiontable = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t entrycount = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint64_t baseaddress = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtlAddFunctionTable")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(functiontable, entrycount, baseaddress) : false;
#else
    (void)functiontable;
    (void)entrycount;
    (void)baseaddress;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_RtlAddGrowableFunctionTable_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* dynamictable = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* functiontable = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t entrycount = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t maximumentrycount = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint64_t rangebase = km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0;
    uint64_t rangeend = km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, uint64_t, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtlAddGrowableFunctionTable")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dynamictable, functiontable, entrycount, maximumentrycount, rangebase, rangeend) : 0;
#else
    (void)dynamictable;
    (void)functiontable;
    (void)entrycount;
    (void)maximumentrycount;
    (void)rangebase;
    (void)rangeend;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_RtlCaptureContext_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* contextrecord = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtlCaptureContext")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(contextrecord);
#else
    (void)contextrecord;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_RtlCaptureContext2_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* contextrecord = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtlCaptureContext2")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(contextrecord);
#else
    (void)contextrecord;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_RtlCaptureStackBackTrace_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t framestoskip = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t framestocapture = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* backtrace = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* backtracehash = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint16_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtlCaptureStackBackTrace")));
    }
    uint16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(framestoskip, framestocapture, backtrace, backtracehash) : 0;
#else
    (void)framestoskip;
    (void)framestocapture;
    (void)backtrace;
    (void)backtracehash;
    uint16_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_RtlDeleteFunctionTable_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* functiontable = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtlDeleteFunctionTable")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(functiontable) : false;
#else
    (void)functiontable;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_RtlDeleteGrowableFunctionTable_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* dynamictable = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtlDeleteGrowableFunctionTable")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(dynamictable);
#else
    (void)dynamictable;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_RtlGrowFunctionTable_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* dynamictable = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t newentrycount = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtlGrowFunctionTable")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(dynamictable, newentrycount);
#else
    (void)dynamictable;
    (void)newentrycount;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_RtlInstallFunctionTableCallback_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t tableidentifier = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint64_t baseaddress = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    uint32_t length = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* callback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* context = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* outofprocesscallbackdll = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(uint64_t, uint64_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtlInstallFunctionTableCallback")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(tableidentifier, baseaddress, length, callback, context, outofprocesscallbackdll) : false;
#else
    (void)tableidentifier;
    (void)baseaddress;
    (void)length;
    (void)callback;
    (void)context;
    (void)outofprocesscallbackdll;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_RtlLookupFunctionEntry_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t controlpc = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* imagebase = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* historytable = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtlLookupFunctionEntry")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(controlpc, imagebase, historytable) : NULL;
#else
    (void)controlpc;
    (void)imagebase;
    (void)historytable;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_RtlPcToFileHeader_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pcvalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* baseofimage = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtlPcToFileHeader")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pcvalue, baseofimage) : NULL;
#else
    (void)pcvalue;
    (void)baseofimage;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_RtlRaiseException_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* exceptionrecord = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtlRaiseException")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(exceptionrecord);
#else
    (void)exceptionrecord;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_RtlRestoreContext_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* contextrecord = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* exceptionrecord = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtlRestoreContext")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(contextrecord, exceptionrecord);
#else
    (void)contextrecord;
    (void)exceptionrecord;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_RtlUnwind_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* targetframe = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* targetip = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* exceptionrecord = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* returnvalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtlUnwind")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(targetframe, targetip, exceptionrecord, returnvalue);
#else
    (void)targetframe;
    (void)targetip;
    (void)exceptionrecord;
    (void)returnvalue;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_RtlUnwindEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* targetframe = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* targetip = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* exceptionrecord = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* returnvalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* contextrecord = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* historytable = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtlUnwindEx")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(targetframe, targetip, exceptionrecord, returnvalue, contextrecord, historytable);
#else
    (void)targetframe;
    (void)targetip;
    (void)exceptionrecord;
    (void)returnvalue;
    (void)contextrecord;
    (void)historytable;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_SearchTreeForFile_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* rootpath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* inputpathname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* outputpathbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SearchTreeForFile")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(rootpath, inputpathname, outputpathbuffer) : -1;
#else
    (void)rootpath;
    (void)inputpathname;
    (void)outputpathbuffer;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_SearchTreeForFileW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* rootpath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* inputpathname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* outputpathbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SearchTreeForFileW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(rootpath, inputpathname, outputpathbuffer) : -1;
#else
    (void)rootpath;
    (void)inputpathname;
    (void)outputpathbuffer;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_SetCheckUserInterruptShared_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpstartaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetCheckUserInterruptShared")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(lpstartaddress);
#else
    (void)lpstartaddress;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_SetErrorMode_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t umode = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetErrorMode")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(umode) : 0;
#else
    (void)umode;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_SetImageConfigInformation_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* loadedimage = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* imageconfiginformation = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("imagehlp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetImageConfigInformation")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(loadedimage, imageconfiginformation) : -1;
#else
    (void)loadedimage;
    (void)imageconfiginformation;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_SetSymLoadError_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t error = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetSymLoadError")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(error);
#else
    (void)error;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_SetThreadContext_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hthread = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetThreadContext")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hthread, lpcontext) : -1;
#else
    (void)hthread;
    (void)lpcontext;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_SetThreadErrorMode_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwnewmode = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* lpoldmode = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetThreadErrorMode")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwnewmode, lpoldmode) : -1;
#else
    (void)dwnewmode;
    (void)lpoldmode;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_SetUnhandledExceptionFilter_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lptoplevelexceptionfilter = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetUnhandledExceptionFilter")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lptoplevelexceptionfilter) : NULL;
#else
    (void)lptoplevelexceptionfilter;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_SetXStateFeaturesMask_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* context = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t featuremask = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetXStateFeaturesMask")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(context, featuremask) : -1;
#else
    (void)context;
    (void)featuremask;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_StackWalk2_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t machinetype = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* hthread = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* stackframe = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* contextrecord = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* readmemoryroutine = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* functiontableaccessroutine = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* getmodulebaseroutine = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    void* translateaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
    void* gettargetattributevalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 9 ? km_napi_arg_u64(km_info[9]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 10 ? km_info[10].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*, void*, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "StackWalk2")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(machinetype, hprocess, hthread, stackframe, contextrecord, readmemoryroutine, functiontableaccessroutine, getmodulebaseroutine, translateaddress, gettargetattributevalue, flags) : -1;
#else
    (void)machinetype;
    (void)hprocess;
    (void)hthread;
    (void)stackframe;
    (void)contextrecord;
    (void)readmemoryroutine;
    (void)functiontableaccessroutine;
    (void)getmodulebaseroutine;
    (void)translateaddress;
    (void)gettargetattributevalue;
    (void)flags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_StackWalk64_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t machinetype = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* hthread = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* stackframe = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* contextrecord = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* readmemoryroutine = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* functiontableaccessroutine = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* getmodulebaseroutine = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    void* translateaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "StackWalk64")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(machinetype, hprocess, hthread, stackframe, contextrecord, readmemoryroutine, functiontableaccessroutine, getmodulebaseroutine, translateaddress) : -1;
#else
    (void)machinetype;
    (void)hprocess;
    (void)hthread;
    (void)stackframe;
    (void)contextrecord;
    (void)readmemoryroutine;
    (void)functiontableaccessroutine;
    (void)getmodulebaseroutine;
    (void)translateaddress;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_StackWalkEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t machinetype = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* hthread = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* stackframe = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* contextrecord = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* readmemoryroutine = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* functiontableaccessroutine = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* getmodulebaseroutine = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    void* translateaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 9 ? km_info[9].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "StackWalkEx")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(machinetype, hprocess, hthread, stackframe, contextrecord, readmemoryroutine, functiontableaccessroutine, getmodulebaseroutine, translateaddress, flags) : -1;
#else
    (void)machinetype;
    (void)hprocess;
    (void)hthread;
    (void)stackframe;
    (void)contextrecord;
    (void)readmemoryroutine;
    (void)functiontableaccessroutine;
    (void)getmodulebaseroutine;
    (void)translateaddress;
    (void)flags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_SymAddSourceStream_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t base = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* streamfile = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint64_t size = km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SymAddSourceStream")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, base, streamfile, buffer, size) : -1;
#else
    (void)hprocess;
    (void)base;
    (void)streamfile;
    (void)buffer;
    (void)size;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_SymAddSourceStreamA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t base = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* streamfile = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint64_t size = km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SymAddSourceStreamA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, base, streamfile, buffer, size) : -1;
#else
    (void)hprocess;
    (void)base;
    (void)streamfile;
    (void)buffer;
    (void)size;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_SymAddSourceStreamW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t base = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* filespec = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint64_t size = km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SymAddSourceStreamW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, base, filespec, buffer, size) : -1;
#else
    (void)hprocess;
    (void)base;
    (void)filespec;
    (void)buffer;
    (void)size;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_SymAddSymbol_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t baseofdll = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* name = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint64_t address = km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0;
    uint32_t size = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, uint64_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SymAddSymbol")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, baseofdll, name, address, size, flags) : -1;
#else
    (void)hprocess;
    (void)baseofdll;
    (void)name;
    (void)address;
    (void)size;
    (void)flags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_SymAddSymbolW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t baseofdll = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* name = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint64_t address = km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0;
    uint32_t size = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, uint64_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SymAddSymbolW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, baseofdll, name, address, size, flags) : -1;
#else
    (void)hprocess;
    (void)baseofdll;
    (void)name;
    (void)address;
    (void)size;
    (void)flags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_SymAddrIncludeInlineTrace_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t address = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SymAddrIncludeInlineTrace")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, address) : 0;
#else
    (void)hprocess;
    (void)address;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_SymCleanup_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SymCleanup")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess) : -1;
#else
    (void)hprocess;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_SymCompareInlineTrace_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t address1 = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    uint32_t inlinecontext1 = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint64_t retaddress1 = km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0;
    uint64_t address2 = km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0;
    uint64_t retaddress2 = km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t, uint64_t, uint64_t, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SymCompareInlineTrace")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, address1, inlinecontext1, retaddress1, address2, retaddress2) : 0;
#else
    (void)hprocess;
    (void)address1;
    (void)inlinecontext1;
    (void)retaddress1;
    (void)address2;
    (void)retaddress2;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_SymDeleteSymbol_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t baseofdll = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* name = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint64_t address = km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0;
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SymDeleteSymbol")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, baseofdll, name, address, flags) : -1;
#else
    (void)hprocess;
    (void)baseofdll;
    (void)name;
    (void)address;
    (void)flags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_SymDeleteSymbolW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t baseofdll = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* name = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint64_t address = km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0;
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SymDeleteSymbolW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, baseofdll, name, address, flags) : -1;
#else
    (void)hprocess;
    (void)baseofdll;
    (void)name;
    (void)address;
    (void)flags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_SymEnumLines_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t base = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* obj = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* file = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* enumlinescallback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* usercontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SymEnumLines")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, base, obj, file, enumlinescallback, usercontext) : -1;
#else
    (void)hprocess;
    (void)base;
    (void)obj;
    (void)file;
    (void)enumlinescallback;
    (void)usercontext;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_SymEnumLinesW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t base = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* obj = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* file = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* enumlinescallback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* usercontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SymEnumLinesW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, base, obj, file, enumlinescallback, usercontext) : -1;
#else
    (void)hprocess;
    (void)base;
    (void)obj;
    (void)file;
    (void)enumlinescallback;
    (void)usercontext;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_SymEnumProcesses_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enumprocessescallback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* usercontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SymEnumProcesses")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enumprocessescallback, usercontext) : -1;
#else
    (void)enumprocessescallback;
    (void)usercontext;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_SymEnumSourceFileTokens_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t base = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* callback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SymEnumSourceFileTokens")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, base, callback) : -1;
#else
    (void)hprocess;
    (void)base;
    (void)callback;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_SymEnumSourceFiles_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t modbase = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* mask = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* cbsrcfiles = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* usercontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SymEnumSourceFiles")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, modbase, mask, cbsrcfiles, usercontext) : -1;
#else
    (void)hprocess;
    (void)modbase;
    (void)mask;
    (void)cbsrcfiles;
    (void)usercontext;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_SymEnumSourceFilesW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t modbase = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* mask = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* cbsrcfiles = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* usercontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SymEnumSourceFilesW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, modbase, mask, cbsrcfiles, usercontext) : -1;
#else
    (void)hprocess;
    (void)modbase;
    (void)mask;
    (void)cbsrcfiles;
    (void)usercontext;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_SymEnumSourceLines_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t base = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* obj = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* file = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t line = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* enumlinescallback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* usercontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SymEnumSourceLines")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, base, obj, file, line, flags, enumlinescallback, usercontext) : -1;
#else
    (void)hprocess;
    (void)base;
    (void)obj;
    (void)file;
    (void)line;
    (void)flags;
    (void)enumlinescallback;
    (void)usercontext;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_SymEnumSourceLinesW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t base = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* obj = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* file = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t line = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* enumlinescallback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* usercontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SymEnumSourceLinesW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, base, obj, file, line, flags, enumlinescallback, usercontext) : -1;
#else
    (void)hprocess;
    (void)base;
    (void)obj;
    (void)file;
    (void)line;
    (void)flags;
    (void)enumlinescallback;
    (void)usercontext;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_SymEnumSym_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t baseofdll = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* enumsymbolscallback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* usercontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SymEnumSym")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, baseofdll, enumsymbolscallback, usercontext) : -1;
#else
    (void)hprocess;
    (void)baseofdll;
    (void)enumsymbolscallback;
    (void)usercontext;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_SymEnumSymbols_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t baseofdll = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* mask = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* enumsymbolscallback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* usercontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SymEnumSymbols")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, baseofdll, mask, enumsymbolscallback, usercontext) : -1;
#else
    (void)hprocess;
    (void)baseofdll;
    (void)mask;
    (void)enumsymbolscallback;
    (void)usercontext;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_SymEnumSymbolsEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t baseofdll = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* mask = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* enumsymbolscallback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* usercontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t options = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SymEnumSymbolsEx")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, baseofdll, mask, enumsymbolscallback, usercontext, options) : -1;
#else
    (void)hprocess;
    (void)baseofdll;
    (void)mask;
    (void)enumsymbolscallback;
    (void)usercontext;
    (void)options;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_SymEnumSymbolsExW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t baseofdll = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* mask = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* enumsymbolscallback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* usercontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t options = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SymEnumSymbolsExW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, baseofdll, mask, enumsymbolscallback, usercontext, options) : -1;
#else
    (void)hprocess;
    (void)baseofdll;
    (void)mask;
    (void)enumsymbolscallback;
    (void)usercontext;
    (void)options;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_SymEnumSymbolsForAddr_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t address = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* enumsymbolscallback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* usercontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SymEnumSymbolsForAddr")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, address, enumsymbolscallback, usercontext) : -1;
#else
    (void)hprocess;
    (void)address;
    (void)enumsymbolscallback;
    (void)usercontext;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_SymEnumSymbolsForAddrW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t address = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* enumsymbolscallback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* usercontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SymEnumSymbolsForAddrW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, address, enumsymbolscallback, usercontext) : -1;
#else
    (void)hprocess;
    (void)address;
    (void)enumsymbolscallback;
    (void)usercontext;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_SymEnumSymbolsW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t baseofdll = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* mask = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* enumsymbolscallback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* usercontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SymEnumSymbolsW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, baseofdll, mask, enumsymbolscallback, usercontext) : -1;
#else
    (void)hprocess;
    (void)baseofdll;
    (void)mask;
    (void)enumsymbolscallback;
    (void)usercontext;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_SymEnumTypes_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t baseofdll = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* enumsymbolscallback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* usercontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SymEnumTypes")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, baseofdll, enumsymbolscallback, usercontext) : -1;
#else
    (void)hprocess;
    (void)baseofdll;
    (void)enumsymbolscallback;
    (void)usercontext;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_SymEnumTypesByName_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t baseofdll = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* mask = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* enumsymbolscallback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* usercontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SymEnumTypesByName")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, baseofdll, mask, enumsymbolscallback, usercontext) : -1;
#else
    (void)hprocess;
    (void)baseofdll;
    (void)mask;
    (void)enumsymbolscallback;
    (void)usercontext;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_SymEnumTypesByNameW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t baseofdll = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* mask = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* enumsymbolscallback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* usercontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SymEnumTypesByNameW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, baseofdll, mask, enumsymbolscallback, usercontext) : -1;
#else
    (void)hprocess;
    (void)baseofdll;
    (void)mask;
    (void)enumsymbolscallback;
    (void)usercontext;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_SymEnumTypesW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t baseofdll = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* enumsymbolscallback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* usercontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SymEnumTypesW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, baseofdll, enumsymbolscallback, usercontext) : -1;
#else
    (void)hprocess;
    (void)baseofdll;
    (void)enumsymbolscallback;
    (void)usercontext;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_SymEnumerateModules64_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* enummodulescallback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* usercontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SymEnumerateModules64")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, enummodulescallback, usercontext) : -1;
#else
    (void)hprocess;
    (void)enummodulescallback;
    (void)usercontext;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_SymEnumerateModulesW64_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* enummodulescallback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* usercontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SymEnumerateModulesW64")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, enummodulescallback, usercontext) : -1;
#else
    (void)hprocess;
    (void)enummodulescallback;
    (void)usercontext;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_SymEnumerateSymbols64_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t baseofdll = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* enumsymbolscallback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* usercontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SymEnumerateSymbols64")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, baseofdll, enumsymbolscallback, usercontext) : -1;
#else
    (void)hprocess;
    (void)baseofdll;
    (void)enumsymbolscallback;
    (void)usercontext;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_SymEnumerateSymbolsW64_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t baseofdll = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* enumsymbolscallback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* usercontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SymEnumerateSymbolsW64")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, baseofdll, enumsymbolscallback, usercontext) : -1;
#else
    (void)hprocess;
    (void)baseofdll;
    (void)enumsymbolscallback;
    (void)usercontext;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_SymFindDebugInfoFile_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* filename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* debugfilepath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* callback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* callerdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SymFindDebugInfoFile")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, filename, debugfilepath, callback, callerdata) : NULL;
#else
    (void)hprocess;
    (void)filename;
    (void)debugfilepath;
    (void)callback;
    (void)callerdata;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_SymFindDebugInfoFileW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* filename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* debugfilepath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* callback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* callerdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SymFindDebugInfoFileW")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, filename, debugfilepath, callback, callerdata) : NULL;
#else
    (void)hprocess;
    (void)filename;
    (void)debugfilepath;
    (void)callback;
    (void)callerdata;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_SymFindExecutableImage_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* filename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* imagefilepath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* callback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* callerdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SymFindExecutableImage")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, filename, imagefilepath, callback, callerdata) : NULL;
#else
    (void)hprocess;
    (void)filename;
    (void)imagefilepath;
    (void)callback;
    (void)callerdata;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_SymFindExecutableImageW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* filename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* imagefilepath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* callback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* callerdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SymFindExecutableImageW")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, filename, imagefilepath, callback, callerdata) : NULL;
#else
    (void)hprocess;
    (void)filename;
    (void)imagefilepath;
    (void)callback;
    (void)callerdata;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_SymFindFileInPath_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* searchpatha = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* filename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* id = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t two = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    uint32_t three = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    void* foundfile = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    void* callback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
    void* context = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 9 ? km_napi_arg_u64(km_info[9]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SymFindFileInPath")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, searchpatha, filename, id, two, three, flags, foundfile, callback, context) : -1;
#else
    (void)hprocess;
    (void)searchpatha;
    (void)filename;
    (void)id;
    (void)two;
    (void)three;
    (void)flags;
    (void)foundfile;
    (void)callback;
    (void)context;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_SymFindFileInPathW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* searchpatha = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* filename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* id = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t two = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    uint32_t three = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    void* foundfile = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    void* callback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
    void* context = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 9 ? km_napi_arg_u64(km_info[9]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SymFindFileInPathW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, searchpatha, filename, id, two, three, flags, foundfile, callback, context) : -1;
#else
    (void)hprocess;
    (void)searchpatha;
    (void)filename;
    (void)id;
    (void)two;
    (void)three;
    (void)flags;
    (void)foundfile;
    (void)callback;
    (void)context;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_SymFromAddr_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t address = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* displacement = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* symbol = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SymFromAddr")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, address, displacement, symbol) : -1;
#else
    (void)hprocess;
    (void)address;
    (void)displacement;
    (void)symbol;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_SymFromAddrW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t address = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* displacement = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* symbol = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SymFromAddrW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, address, displacement, symbol) : -1;
#else
    (void)hprocess;
    (void)address;
    (void)displacement;
    (void)symbol;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_SymFromIndex_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t baseofdll = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    uint32_t arg_2_index = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* symbol = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SymFromIndex")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, baseofdll, arg_2_index, symbol) : -1;
#else
    (void)hprocess;
    (void)baseofdll;
    (void)arg_2_index;
    (void)symbol;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_SymFromIndexW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t baseofdll = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    uint32_t arg_2_index = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* symbol = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SymFromIndexW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, baseofdll, arg_2_index, symbol) : -1;
#else
    (void)hprocess;
    (void)baseofdll;
    (void)arg_2_index;
    (void)symbol;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_SymFromInlineContext_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t address = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    uint32_t inlinecontext = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* displacement = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* symbol = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SymFromInlineContext")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, address, inlinecontext, displacement, symbol) : -1;
#else
    (void)hprocess;
    (void)address;
    (void)inlinecontext;
    (void)displacement;
    (void)symbol;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_SymFromInlineContextW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t address = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    uint32_t inlinecontext = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* displacement = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* symbol = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SymFromInlineContextW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, address, inlinecontext, displacement, symbol) : -1;
#else
    (void)hprocess;
    (void)address;
    (void)inlinecontext;
    (void)displacement;
    (void)symbol;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_SymFromName_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* name = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* symbol = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SymFromName")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, name, symbol) : -1;
#else
    (void)hprocess;
    (void)name;
    (void)symbol;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_SymFromNameW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* name = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* symbol = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SymFromNameW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, name, symbol) : -1;
#else
    (void)hprocess;
    (void)name;
    (void)symbol;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_SymFromToken_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t base = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    uint32_t token = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* symbol = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SymFromToken")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, base, token, symbol) : -1;
#else
    (void)hprocess;
    (void)base;
    (void)token;
    (void)symbol;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_SymFromTokenW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t base = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    uint32_t token = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* symbol = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SymFromTokenW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, base, token, symbol) : -1;
#else
    (void)hprocess;
    (void)base;
    (void)token;
    (void)symbol;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_SymFunctionTableAccess64_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t addrbase = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SymFunctionTableAccess64")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, addrbase) : NULL;
#else
    (void)hprocess;
    (void)addrbase;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_SymFunctionTableAccess64AccessRoutines_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t addrbase = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* readmemoryroutine = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* getmodulebaseroutine = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SymFunctionTableAccess64AccessRoutines")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, addrbase, readmemoryroutine, getmodulebaseroutine) : NULL;
#else
    (void)hprocess;
    (void)addrbase;
    (void)readmemoryroutine;
    (void)getmodulebaseroutine;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_SymGetExtendedOption_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t option = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SymGetExtendedOption")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(option) : -1;
#else
    (void)option;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_SymGetFileLineOffsets64_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* modulename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* filename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t bufferlines = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SymGetFileLineOffsets64")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, modulename, filename, buffer, bufferlines) : 0;
#else
    (void)hprocess;
    (void)modulename;
    (void)filename;
    (void)buffer;
    (void)bufferlines;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_SymGetHomeDirectory_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t type = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* dir = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint64_t size = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, void*, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SymGetHomeDirectory")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(type, dir, size) : NULL;
#else
    (void)type;
    (void)dir;
    (void)size;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_SymGetHomeDirectoryW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t type = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* dir = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint64_t size = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, void*, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SymGetHomeDirectoryW")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(type, dir, size) : NULL;
#else
    (void)type;
    (void)dir;
    (void)size;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_SymGetLineFromAddr64_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t qwaddr = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* pdwdisplacement = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* line64 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SymGetLineFromAddr64")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, qwaddr, pdwdisplacement, line64) : -1;
#else
    (void)hprocess;
    (void)qwaddr;
    (void)pdwdisplacement;
    (void)line64;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_SymGetLineFromAddrW64_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t dwaddr = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* pdwdisplacement = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* line = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SymGetLineFromAddrW64")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, dwaddr, pdwdisplacement, line) : -1;
#else
    (void)hprocess;
    (void)dwaddr;
    (void)pdwdisplacement;
    (void)line;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_SymGetLineFromInlineContext_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t qwaddr = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    uint32_t inlinecontext = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint64_t qwmodulebaseaddress = km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0;
    void* pdwdisplacement = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* line64 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SymGetLineFromInlineContext")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, qwaddr, inlinecontext, qwmodulebaseaddress, pdwdisplacement, line64) : -1;
#else
    (void)hprocess;
    (void)qwaddr;
    (void)inlinecontext;
    (void)qwmodulebaseaddress;
    (void)pdwdisplacement;
    (void)line64;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_SymGetLineFromInlineContextW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t dwaddr = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    uint32_t inlinecontext = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint64_t qwmodulebaseaddress = km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0;
    void* pdwdisplacement = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* line = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SymGetLineFromInlineContextW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, dwaddr, inlinecontext, qwmodulebaseaddress, pdwdisplacement, line) : -1;
#else
    (void)hprocess;
    (void)dwaddr;
    (void)inlinecontext;
    (void)qwmodulebaseaddress;
    (void)pdwdisplacement;
    (void)line;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_SymGetLineFromName64_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* modulename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* filename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t dwlinenumber = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* pldisplacement = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* line = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SymGetLineFromName64")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, modulename, filename, dwlinenumber, pldisplacement, line) : -1;
#else
    (void)hprocess;
    (void)modulename;
    (void)filename;
    (void)dwlinenumber;
    (void)pldisplacement;
    (void)line;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_SymGetLineFromNameW64_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* modulename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* filename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t dwlinenumber = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* pldisplacement = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* line = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SymGetLineFromNameW64")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, modulename, filename, dwlinenumber, pldisplacement, line) : -1;
#else
    (void)hprocess;
    (void)modulename;
    (void)filename;
    (void)dwlinenumber;
    (void)pldisplacement;
    (void)line;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_SymGetLineNext64_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* line = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SymGetLineNext64")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, line) : -1;
#else
    (void)hprocess;
    (void)line;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_SymGetLineNextW64_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* line = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SymGetLineNextW64")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, line) : -1;
#else
    (void)hprocess;
    (void)line;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_SymGetLinePrev64_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* line = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SymGetLinePrev64")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, line) : -1;
#else
    (void)hprocess;
    (void)line;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_SymGetLinePrevW64_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* line = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SymGetLinePrevW64")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, line) : -1;
#else
    (void)hprocess;
    (void)line;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_SymGetModuleBase64_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t qwaddr = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SymGetModuleBase64")));
    }
    uint64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, qwaddr) : 0;
#else
    (void)hprocess;
    (void)qwaddr;
    uint64_t km_res = 0;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<uint64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_SymGetModuleInfo64_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t qwaddr = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* moduleinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SymGetModuleInfo64")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, qwaddr, moduleinfo) : -1;
#else
    (void)hprocess;
    (void)qwaddr;
    (void)moduleinfo;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_SymGetModuleInfoW64_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t qwaddr = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* moduleinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SymGetModuleInfoW64")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, qwaddr, moduleinfo) : -1;
#else
    (void)hprocess;
    (void)qwaddr;
    (void)moduleinfo;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_SymGetOmaps_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t baseofdll = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* omapto = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* comapto = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* omapfrom = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* comapfrom = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SymGetOmaps")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, baseofdll, omapto, comapto, omapfrom, comapfrom) : -1;
#else
    (void)hprocess;
    (void)baseofdll;
    (void)omapto;
    (void)comapto;
    (void)omapfrom;
    (void)comapfrom;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_SymGetOptions_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SymGetOptions")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr() : 0;
#else
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_SymGetScope_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t baseofdll = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    uint32_t arg_2_index = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* symbol = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SymGetScope")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, baseofdll, arg_2_index, symbol) : -1;
#else
    (void)hprocess;
    (void)baseofdll;
    (void)arg_2_index;
    (void)symbol;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_SymGetScopeW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t baseofdll = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    uint32_t arg_2_index = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* symbol = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SymGetScopeW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, baseofdll, arg_2_index, symbol) : -1;
#else
    (void)hprocess;
    (void)baseofdll;
    (void)arg_2_index;
    (void)symbol;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_SymGetSearchPath_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* searchpatha = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t searchpathlength = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SymGetSearchPath")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, searchpatha, searchpathlength) : -1;
#else
    (void)hprocess;
    (void)searchpatha;
    (void)searchpathlength;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_SymGetSearchPathW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* searchpatha = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t searchpathlength = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SymGetSearchPathW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, searchpatha, searchpathlength) : -1;
#else
    (void)hprocess;
    (void)searchpatha;
    (void)searchpathlength;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_SymGetSourceFile_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t base = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* params = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* filespec = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* filepath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t size = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SymGetSourceFile")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, base, params, filespec, filepath, size) : -1;
#else
    (void)hprocess;
    (void)base;
    (void)params;
    (void)filespec;
    (void)filepath;
    (void)size;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_SymGetSourceFileChecksum_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t base = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* filespec = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pchecksumtype = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pchecksum = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t checksumsize = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* pactualbyteswritten = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SymGetSourceFileChecksum")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, base, filespec, pchecksumtype, pchecksum, checksumsize, pactualbyteswritten) : -1;
#else
    (void)hprocess;
    (void)base;
    (void)filespec;
    (void)pchecksumtype;
    (void)pchecksum;
    (void)checksumsize;
    (void)pactualbyteswritten;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_SymGetSourceFileChecksumW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t base = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* filespec = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pchecksumtype = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pchecksum = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t checksumsize = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* pactualbyteswritten = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SymGetSourceFileChecksumW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, base, filespec, pchecksumtype, pchecksum, checksumsize, pactualbyteswritten) : -1;
#else
    (void)hprocess;
    (void)base;
    (void)filespec;
    (void)pchecksumtype;
    (void)pchecksum;
    (void)checksumsize;
    (void)pactualbyteswritten;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_SymGetSourceFileFromToken_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* token = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* params = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* filepath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t size = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SymGetSourceFileFromToken")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, token, params, filepath, size) : -1;
#else
    (void)hprocess;
    (void)token;
    (void)params;
    (void)filepath;
    (void)size;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_SymGetSourceFileFromTokenByTokenName_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* token = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* tokenname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* params = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* filepath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t size = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SymGetSourceFileFromTokenByTokenName")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, token, tokenname, params, filepath, size) : -1;
#else
    (void)hprocess;
    (void)token;
    (void)tokenname;
    (void)params;
    (void)filepath;
    (void)size;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_SymGetSourceFileFromTokenByTokenNameW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* token = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* tokenname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* params = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* filepath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t size = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SymGetSourceFileFromTokenByTokenNameW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, token, tokenname, params, filepath, size) : -1;
#else
    (void)hprocess;
    (void)token;
    (void)tokenname;
    (void)params;
    (void)filepath;
    (void)size;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_SymGetSourceFileFromTokenW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* token = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* params = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* filepath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t size = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SymGetSourceFileFromTokenW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, token, params, filepath, size) : -1;
#else
    (void)hprocess;
    (void)token;
    (void)params;
    (void)filepath;
    (void)size;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_SymGetSourceFileToken_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t base = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* filespec = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* token = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* size = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SymGetSourceFileToken")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, base, filespec, token, size) : -1;
#else
    (void)hprocess;
    (void)base;
    (void)filespec;
    (void)token;
    (void)size;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_SymGetSourceFileTokenByTokenName_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t base = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* filespec = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* tokenname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* tokenparameters = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* token = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* size = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SymGetSourceFileTokenByTokenName")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, base, filespec, tokenname, tokenparameters, token, size) : -1;
#else
    (void)hprocess;
    (void)base;
    (void)filespec;
    (void)tokenname;
    (void)tokenparameters;
    (void)token;
    (void)size;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_SymGetSourceFileTokenByTokenNameW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t base = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* filespec = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* tokenname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* tokenparameters = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* token = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* size = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SymGetSourceFileTokenByTokenNameW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, base, filespec, tokenname, tokenparameters, token, size) : -1;
#else
    (void)hprocess;
    (void)base;
    (void)filespec;
    (void)tokenname;
    (void)tokenparameters;
    (void)token;
    (void)size;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_SymGetSourceFileTokenW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t base = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* filespec = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* token = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* size = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SymGetSourceFileTokenW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, base, filespec, token, size) : -1;
#else
    (void)hprocess;
    (void)base;
    (void)filespec;
    (void)token;
    (void)size;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_SymGetSourceFileW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t base = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* params = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* filespec = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* filepath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t size = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SymGetSourceFileW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, base, params, filespec, filepath, size) : -1;
#else
    (void)hprocess;
    (void)base;
    (void)params;
    (void)filespec;
    (void)filepath;
    (void)size;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_SymGetSourceVarFromToken_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* token = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* params = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* varname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* value = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t size = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SymGetSourceVarFromToken")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, token, params, varname, value, size) : -1;
#else
    (void)hprocess;
    (void)token;
    (void)params;
    (void)varname;
    (void)value;
    (void)size;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_SymGetSourceVarFromTokenW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* token = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* params = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* varname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* value = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t size = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SymGetSourceVarFromTokenW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, token, params, varname, value, size) : -1;
#else
    (void)hprocess;
    (void)token;
    (void)params;
    (void)varname;
    (void)value;
    (void)size;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_SymGetSymFromAddr64_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t qwaddr = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* pdwdisplacement = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* symbol = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SymGetSymFromAddr64")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, qwaddr, pdwdisplacement, symbol) : -1;
#else
    (void)hprocess;
    (void)qwaddr;
    (void)pdwdisplacement;
    (void)symbol;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_SymGetSymFromName64_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* name = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* symbol = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SymGetSymFromName64")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, name, symbol) : -1;
#else
    (void)hprocess;
    (void)name;
    (void)symbol;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_SymGetSymNext64_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* symbol = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SymGetSymNext64")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, symbol) : -1;
#else
    (void)hprocess;
    (void)symbol;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_SymGetSymPrev64_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* symbol = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SymGetSymPrev64")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, symbol) : -1;
#else
    (void)hprocess;
    (void)symbol;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_SymGetSymbolFile_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* sympath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* imagefile = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t type = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* symbolfile = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint64_t csymbolfile = km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0;
    void* dbgfile = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    uint64_t cdbgfile = km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, uint64_t, void*, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SymGetSymbolFile")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, sympath, imagefile, type, symbolfile, csymbolfile, dbgfile, cdbgfile) : -1;
#else
    (void)hprocess;
    (void)sympath;
    (void)imagefile;
    (void)type;
    (void)symbolfile;
    (void)csymbolfile;
    (void)dbgfile;
    (void)cdbgfile;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_SymGetSymbolFileW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* sympath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* imagefile = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t type = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* symbolfile = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint64_t csymbolfile = km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0;
    void* dbgfile = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    uint64_t cdbgfile = km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, uint64_t, void*, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SymGetSymbolFileW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, sympath, imagefile, type, symbolfile, csymbolfile, dbgfile, cdbgfile) : -1;
#else
    (void)hprocess;
    (void)sympath;
    (void)imagefile;
    (void)type;
    (void)symbolfile;
    (void)csymbolfile;
    (void)dbgfile;
    (void)cdbgfile;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_SymGetTypeFromName_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t baseofdll = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* name = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* symbol = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SymGetTypeFromName")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, baseofdll, name, symbol) : -1;
#else
    (void)hprocess;
    (void)baseofdll;
    (void)name;
    (void)symbol;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_SymGetTypeFromNameW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t baseofdll = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* name = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* symbol = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SymGetTypeFromNameW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, baseofdll, name, symbol) : -1;
#else
    (void)hprocess;
    (void)baseofdll;
    (void)name;
    (void)symbol;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_SymGetTypeInfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t modbase = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    uint32_t arg_2_typeid = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t gettype = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* pinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SymGetTypeInfo")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, modbase, arg_2_typeid, gettype, pinfo) : -1;
#else
    (void)hprocess;
    (void)modbase;
    (void)arg_2_typeid;
    (void)gettype;
    (void)pinfo;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_SymGetTypeInfoEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t modbase = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* params = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SymGetTypeInfoEx")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, modbase, params) : -1;
#else
    (void)hprocess;
    (void)modbase;
    (void)params;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_SymGetUnwindInfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t address = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* size = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SymGetUnwindInfo")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, address, buffer, size) : -1;
#else
    (void)hprocess;
    (void)address;
    (void)buffer;
    (void)size;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_SymInitialize_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* usersearchpath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t finvadeprocess = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SymInitialize")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, usersearchpath, finvadeprocess) : -1;
#else
    (void)hprocess;
    (void)usersearchpath;
    (void)finvadeprocess;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_SymInitializeW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* usersearchpath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t finvadeprocess = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SymInitializeW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, usersearchpath, finvadeprocess) : -1;
#else
    (void)hprocess;
    (void)usersearchpath;
    (void)finvadeprocess;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_SymLoadModule64_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* hfile = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* imagename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* modulename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint64_t baseofdll = km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0;
    uint32_t sizeofdll = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SymLoadModule64")));
    }
    uint64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, hfile, imagename, modulename, baseofdll, sizeofdll) : 0;
#else
    (void)hprocess;
    (void)hfile;
    (void)imagename;
    (void)modulename;
    (void)baseofdll;
    (void)sizeofdll;
    uint64_t km_res = 0;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<uint64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_SymLoadModuleEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* hfile = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* imagename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* modulename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint64_t baseofdll = km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0;
    uint32_t dllsize = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* data = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 7 ? km_info[7].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint64_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SymLoadModuleEx")));
    }
    uint64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, hfile, imagename, modulename, baseofdll, dllsize, data, flags) : 0;
#else
    (void)hprocess;
    (void)hfile;
    (void)imagename;
    (void)modulename;
    (void)baseofdll;
    (void)dllsize;
    (void)data;
    (void)flags;
    uint64_t km_res = 0;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<uint64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_SymLoadModuleExW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* hfile = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* imagename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* modulename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint64_t baseofdll = km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0;
    uint32_t dllsize = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* data = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 7 ? km_info[7].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint64_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SymLoadModuleExW")));
    }
    uint64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, hfile, imagename, modulename, baseofdll, dllsize, data, flags) : 0;
#else
    (void)hprocess;
    (void)hfile;
    (void)imagename;
    (void)modulename;
    (void)baseofdll;
    (void)dllsize;
    (void)data;
    (void)flags;
    uint64_t km_res = 0;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<uint64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_SymMatchFileName_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* filename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* match = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* filenamestop = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* matchstop = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SymMatchFileName")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(filename, match, filenamestop, matchstop) : -1;
#else
    (void)filename;
    (void)match;
    (void)filenamestop;
    (void)matchstop;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_SymMatchFileNameW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* filename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* match = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* filenamestop = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* matchstop = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SymMatchFileNameW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(filename, match, filenamestop, matchstop) : -1;
#else
    (void)filename;
    (void)match;
    (void)filenamestop;
    (void)matchstop;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_SymMatchString_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* string = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* expression = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t fcase = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SymMatchString")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(string, expression, fcase) : -1;
#else
    (void)string;
    (void)expression;
    (void)fcase;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_SymMatchStringA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* string = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* expression = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t fcase = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SymMatchStringA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(string, expression, fcase) : -1;
#else
    (void)string;
    (void)expression;
    (void)fcase;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_SymMatchStringW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* string = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* expression = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t fcase = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SymMatchStringW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(string, expression, fcase) : -1;
#else
    (void)string;
    (void)expression;
    (void)fcase;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_SymNext_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* si = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SymNext")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, si) : -1;
#else
    (void)hprocess;
    (void)si;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_SymNextW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* siw = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SymNextW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, siw) : -1;
#else
    (void)hprocess;
    (void)siw;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_SymPrev_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* si = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SymPrev")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, si) : -1;
#else
    (void)hprocess;
    (void)si;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_SymPrevW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* siw = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SymPrevW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, siw) : -1;
#else
    (void)hprocess;
    (void)siw;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_SymQueryInlineTrace_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t startaddress = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    uint32_t startcontext = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint64_t startretaddress = km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0;
    uint64_t curaddress = km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0;
    void* curcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* curframeindex = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t, uint64_t, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SymQueryInlineTrace")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, startaddress, startcontext, startretaddress, curaddress, curcontext, curframeindex) : -1;
#else
    (void)hprocess;
    (void)startaddress;
    (void)startcontext;
    (void)startretaddress;
    (void)curaddress;
    (void)curcontext;
    (void)curframeindex;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_SymRefreshModuleList_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SymRefreshModuleList")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess) : -1;
#else
    (void)hprocess;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_SymRegisterCallback64_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* callbackfunction = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint64_t usercontext = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SymRegisterCallback64")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, callbackfunction, usercontext) : -1;
#else
    (void)hprocess;
    (void)callbackfunction;
    (void)usercontext;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_SymRegisterCallbackW64_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* callbackfunction = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint64_t usercontext = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SymRegisterCallbackW64")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, callbackfunction, usercontext) : -1;
#else
    (void)hprocess;
    (void)callbackfunction;
    (void)usercontext;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_SymRegisterFunctionEntryCallback64_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* callbackfunction = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint64_t usercontext = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SymRegisterFunctionEntryCallback64")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, callbackfunction, usercontext) : -1;
#else
    (void)hprocess;
    (void)callbackfunction;
    (void)usercontext;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_SymSearch_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t baseofdll = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    uint32_t arg_2_index = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t symtag = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* mask = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint64_t address = km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0;
    void* enumsymbolscallback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* usercontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    uint32_t options = static_cast<uint32_t>(km_info.Length() > 8 ? km_info[8].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t, uint32_t, void*, uint64_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SymSearch")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, baseofdll, arg_2_index, symtag, mask, address, enumsymbolscallback, usercontext, options) : -1;
#else
    (void)hprocess;
    (void)baseofdll;
    (void)arg_2_index;
    (void)symtag;
    (void)mask;
    (void)address;
    (void)enumsymbolscallback;
    (void)usercontext;
    (void)options;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_SymSearchW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t baseofdll = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    uint32_t arg_2_index = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t symtag = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* mask = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint64_t address = km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0;
    void* enumsymbolscallback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* usercontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    uint32_t options = static_cast<uint32_t>(km_info.Length() > 8 ? km_info[8].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t, uint32_t, void*, uint64_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SymSearchW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, baseofdll, arg_2_index, symtag, mask, address, enumsymbolscallback, usercontext, options) : -1;
#else
    (void)hprocess;
    (void)baseofdll;
    (void)arg_2_index;
    (void)symtag;
    (void)mask;
    (void)address;
    (void)enumsymbolscallback;
    (void)usercontext;
    (void)options;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_SymSetContext_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* stackframe = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* context = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SymSetContext")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, stackframe, context) : -1;
#else
    (void)hprocess;
    (void)stackframe;
    (void)context;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_SymSetExtendedOption_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t option = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    int32_t value = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SymSetExtendedOption")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(option, value) : -1;
#else
    (void)option;
    (void)value;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_SymSetHomeDirectory_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* dir = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SymSetHomeDirectory")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, dir) : NULL;
#else
    (void)hprocess;
    (void)dir;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_SymSetHomeDirectoryW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* dir = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SymSetHomeDirectoryW")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, dir) : NULL;
#else
    (void)hprocess;
    (void)dir;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_SymSetOptions_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t symoptions = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SymSetOptions")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(symoptions) : 0;
#else
    (void)symoptions;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_SymSetParentWindow_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hwnd = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SymSetParentWindow")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hwnd) : -1;
#else
    (void)hwnd;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_SymSetScopeFromAddr_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t address = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SymSetScopeFromAddr")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, address) : -1;
#else
    (void)hprocess;
    (void)address;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_SymSetScopeFromIndex_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t baseofdll = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    uint32_t arg_2_index = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SymSetScopeFromIndex")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, baseofdll, arg_2_index) : -1;
#else
    (void)hprocess;
    (void)baseofdll;
    (void)arg_2_index;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_SymSetScopeFromInlineContext_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t address = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    uint32_t inlinecontext = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SymSetScopeFromInlineContext")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, address, inlinecontext) : -1;
#else
    (void)hprocess;
    (void)address;
    (void)inlinecontext;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_SymSetSearchPath_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* searchpatha = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SymSetSearchPath")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, searchpatha) : -1;
#else
    (void)hprocess;
    (void)searchpatha;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_SymSetSearchPathW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* searchpatha = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SymSetSearchPathW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, searchpatha) : -1;
#else
    (void)hprocess;
    (void)searchpatha;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_SymSrvDeltaName_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* sympath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* type = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* file1 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* file2 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SymSrvDeltaName")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, sympath, type, file1, file2) : NULL;
#else
    (void)hprocess;
    (void)sympath;
    (void)type;
    (void)file1;
    (void)file2;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_SymSrvDeltaNameW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* sympath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* type = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* file1 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* file2 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SymSrvDeltaNameW")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, sympath, type, file1, file2) : NULL;
#else
    (void)hprocess;
    (void)sympath;
    (void)type;
    (void)file1;
    (void)file2;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_SymSrvGetFileIndexInfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* file = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* info = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SymSrvGetFileIndexInfo")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(file, info, flags) : -1;
#else
    (void)file;
    (void)info;
    (void)flags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_SymSrvGetFileIndexInfoW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* file = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* info = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SymSrvGetFileIndexInfoW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(file, info, flags) : -1;
#else
    (void)file;
    (void)info;
    (void)flags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_SymSrvGetFileIndexString_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* srvpath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* file = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* arg_3_index = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint64_t size = km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0;
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SymSrvGetFileIndexString")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, srvpath, file, arg_3_index, size, flags) : -1;
#else
    (void)hprocess;
    (void)srvpath;
    (void)file;
    (void)arg_3_index;
    (void)size;
    (void)flags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_SymSrvGetFileIndexStringW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* srvpath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* file = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* arg_3_index = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint64_t size = km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0;
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SymSrvGetFileIndexStringW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, srvpath, file, arg_3_index, size, flags) : -1;
#else
    (void)hprocess;
    (void)srvpath;
    (void)file;
    (void)arg_3_index;
    (void)size;
    (void)flags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_SymSrvGetFileIndexes_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* file = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* id = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* val1 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* val2 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SymSrvGetFileIndexes")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(file, id, val1, val2, flags) : -1;
#else
    (void)file;
    (void)id;
    (void)val1;
    (void)val2;
    (void)flags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_SymSrvGetFileIndexesW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* file = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* id = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* val1 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* val2 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SymSrvGetFileIndexesW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(file, id, val1, val2, flags) : -1;
#else
    (void)file;
    (void)id;
    (void)val1;
    (void)val2;
    (void)flags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_SymSrvGetSupplement_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* sympath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* node = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* file = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SymSrvGetSupplement")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, sympath, node, file) : NULL;
#else
    (void)hprocess;
    (void)sympath;
    (void)node;
    (void)file;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_SymSrvGetSupplementW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* sympath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* node = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* file = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SymSrvGetSupplementW")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, sympath, node, file) : NULL;
#else
    (void)hprocess;
    (void)sympath;
    (void)node;
    (void)file;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_SymSrvIsStore_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* path = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SymSrvIsStore")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, path) : -1;
#else
    (void)hprocess;
    (void)path;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_SymSrvIsStoreW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* path = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SymSrvIsStoreW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, path) : -1;
#else
    (void)hprocess;
    (void)path;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_SymSrvStoreFile_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* srvpath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* file = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SymSrvStoreFile")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, srvpath, file, flags) : NULL;
#else
    (void)hprocess;
    (void)srvpath;
    (void)file;
    (void)flags;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_SymSrvStoreFileW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* srvpath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* file = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SymSrvStoreFileW")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, srvpath, file, flags) : NULL;
#else
    (void)hprocess;
    (void)srvpath;
    (void)file;
    (void)flags;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_SymSrvStoreSupplement_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* srvpath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* node = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* file = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SymSrvStoreSupplement")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, srvpath, node, file, flags) : NULL;
#else
    (void)hprocess;
    (void)srvpath;
    (void)node;
    (void)file;
    (void)flags;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_SymSrvStoreSupplementW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* sympath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* node = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* file = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SymSrvStoreSupplementW")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, sympath, node, file, flags) : NULL;
#else
    (void)hprocess;
    (void)sympath;
    (void)node;
    (void)file;
    (void)flags;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_SymUnDName64_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* sym = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* undecname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t undecnamelength = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SymUnDName64")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sym, undecname, undecnamelength) : -1;
#else
    (void)sym;
    (void)undecname;
    (void)undecnamelength;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_SymUnloadModule64_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t baseofdll = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SymUnloadModule64")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, baseofdll) : -1;
#else
    (void)hprocess;
    (void)baseofdll;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_TerminateProcessOnMemoryExhaustion_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t failedallocationsize = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-errorhandling-l1-1-3.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "TerminateProcessOnMemoryExhaustion")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(failedallocationsize);
#else
    (void)failedallocationsize;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_TouchFileTimes_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* filehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* psystemtime = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("imagehlp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "TouchFileTimes")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(filehandle, psystemtime) : -1;
#else
    (void)filehandle;
    (void)psystemtime;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_UnDecorateSymbolName_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* name = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* outputstring = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t maxstringlength = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "UnDecorateSymbolName")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(name, outputstring, maxstringlength, flags) : 0;
#else
    (void)name;
    (void)outputstring;
    (void)maxstringlength;
    (void)flags;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_UnDecorateSymbolNameW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* name = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* outputstring = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t maxstringlength = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "UnDecorateSymbolNameW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(name, outputstring, maxstringlength, flags) : 0;
#else
    (void)name;
    (void)outputstring;
    (void)maxstringlength;
    (void)flags;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_UnMapAndLoad_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* loadedimage = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("imagehlp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "UnMapAndLoad")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(loadedimage) : -1;
#else
    (void)loadedimage;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_UnhandledExceptionFilter_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* exceptioninfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "UnhandledExceptionFilter")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(exceptioninfo) : -1;
#else
    (void)exceptioninfo;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_UpdateDebugInfoFile_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* imagefilename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* symbolpath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* debugfilepath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* ntheaders = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("imagehlp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "UpdateDebugInfoFile")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(imagefilename, symbolpath, debugfilepath, ntheaders) : -1;
#else
    (void)imagefilename;
    (void)symbolpath;
    (void)debugfilepath;
    (void)ntheaders;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_UpdateDebugInfoFileEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* imagefilename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* symbolpath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* debugfilepath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* ntheaders = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t oldchecksum = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("imagehlp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "UpdateDebugInfoFileEx")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(imagefilename, symbolpath, debugfilepath, ntheaders, oldchecksum) : -1;
#else
    (void)imagefilename;
    (void)symbolpath;
    (void)debugfilepath;
    (void)ntheaders;
    (void)oldchecksum;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_WaitForDebugEvent_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpdebugevent = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwmilliseconds = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WaitForDebugEvent")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpdebugevent, dwmilliseconds) : -1;
#else
    (void)lpdebugevent;
    (void)dwmilliseconds;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_WaitForDebugEventEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpdebugevent = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwmilliseconds = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WaitForDebugEventEx")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpdebugevent, dwmilliseconds) : -1;
#else
    (void)lpdebugevent;
    (void)dwmilliseconds;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_Wow64GetThreadContext_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hthread = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "Wow64GetThreadContext")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hthread, lpcontext) : -1;
#else
    (void)hthread;
    (void)lpcontext;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_Wow64GetThreadSelectorEntry_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hthread = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwselector = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* lpselectorentry = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "Wow64GetThreadSelectorEntry")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hthread, dwselector, lpselectorentry) : -1;
#else
    (void)hthread;
    (void)dwselector;
    (void)lpselectorentry;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_Wow64SetThreadContext_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hthread = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "Wow64SetThreadContext")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hthread, lpcontext) : -1;
#else
    (void)hthread;
    (void)lpcontext;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_diagnostics_debug_WriteProcessMemory_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpbaseaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* lpbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint64_t nsize = km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0;
    void* lpnumberofbyteswritten = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WriteProcessMemory")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprocess, lpbaseaddress, lpbuffer, nsize, lpnumberofbyteswritten) : -1;
#else
    (void)hprocess;
    (void)lpbaseaddress;
    (void)lpbuffer;
    (void)nsize;
    (void)lpnumberofbyteswritten;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static void register_windows_win32_system_diagnostics_debug_napi(Napi::Env env, Napi::Object exports) {
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_AddVectoredContinueHandler", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_AddVectoredContinueHandler_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_AddVectoredExceptionHandler", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_AddVectoredExceptionHandler_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_Beep", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_Beep_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_BindImage", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_BindImage_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_BindImageEx", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_BindImageEx_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_CheckRemoteDebuggerPresent", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_CheckRemoteDebuggerPresent_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_CheckSumMappedFile", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_CheckSumMappedFile_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_CloseThreadWaitChainSession", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_CloseThreadWaitChainSession_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_ContinueDebugEvent", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_ContinueDebugEvent_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_CopyContext", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_CopyContext_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_DbgHelpCreateUserDump", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_DbgHelpCreateUserDump_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_DbgHelpCreateUserDumpW", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_DbgHelpCreateUserDumpW_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_DebugActiveProcess", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_DebugActiveProcess_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_DebugActiveProcessStop", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_DebugActiveProcessStop_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_DebugBreak", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_DebugBreak_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_DebugBreakProcess", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_DebugBreakProcess_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_DebugSetProcessKillOnExit", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_DebugSetProcessKillOnExit_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_DecodePointer", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_DecodePointer_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_DecodeRemotePointer", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_DecodeRemotePointer_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_DecodeSystemPointer", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_DecodeSystemPointer_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_EncodePointer", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_EncodePointer_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_EncodeRemotePointer", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_EncodeRemotePointer_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_EncodeSystemPointer", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_EncodeSystemPointer_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_EnumDirTree", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_EnumDirTree_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_EnumDirTreeW", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_EnumDirTreeW_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_EnumerateLoadedModules64", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_EnumerateLoadedModules64_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_EnumerateLoadedModulesEx", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_EnumerateLoadedModulesEx_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_EnumerateLoadedModulesExW", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_EnumerateLoadedModulesExW_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_EnumerateLoadedModulesW64", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_EnumerateLoadedModulesW64_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_FatalAppExitA", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_FatalAppExitA_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_FatalAppExitW", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_FatalAppExitW_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_FatalExit", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_FatalExit_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_FindDebugInfoFile", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_FindDebugInfoFile_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_FindDebugInfoFileEx", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_FindDebugInfoFileEx_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_FindDebugInfoFileExW", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_FindDebugInfoFileExW_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_FindExecutableImage", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_FindExecutableImage_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_FindExecutableImageEx", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_FindExecutableImageEx_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_FindExecutableImageExW", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_FindExecutableImageExW_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_FindFileInPath", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_FindFileInPath_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_FindFileInSearchPath", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_FindFileInSearchPath_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_FlushInstructionCache", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_FlushInstructionCache_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_FormatMessageA", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_FormatMessageA_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_FormatMessageW", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_FormatMessageW_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_GetEnabledXStateFeatures", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_GetEnabledXStateFeatures_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_GetErrorMode", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_GetErrorMode_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_GetImageConfigInformation", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_GetImageConfigInformation_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_GetImageUnusedHeaderBytes", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_GetImageUnusedHeaderBytes_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_GetSymLoadError", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_GetSymLoadError_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_GetThreadContext", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_GetThreadContext_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_GetThreadErrorMode", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_GetThreadErrorMode_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_GetThreadSelectorEntry", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_GetThreadSelectorEntry_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_GetThreadWaitChain", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_GetThreadWaitChain_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_GetTimestampForLoadedLibrary", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_GetTimestampForLoadedLibrary_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_GetXStateFeaturesMask", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_GetXStateFeaturesMask_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_ImageAddCertificate", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_ImageAddCertificate_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_ImageDirectoryEntryToData", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_ImageDirectoryEntryToData_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_ImageDirectoryEntryToDataEx", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_ImageDirectoryEntryToDataEx_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_ImageEnumerateCertificates", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_ImageEnumerateCertificates_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_ImageGetCertificateData", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_ImageGetCertificateData_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_ImageGetCertificateHeader", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_ImageGetCertificateHeader_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_ImageGetDigestStream", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_ImageGetDigestStream_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_ImageLoad", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_ImageLoad_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_ImageNtHeader", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_ImageNtHeader_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_ImageRemoveCertificate", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_ImageRemoveCertificate_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_ImageRvaToSection", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_ImageRvaToSection_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_ImageRvaToVa", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_ImageRvaToVa_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_ImageUnload", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_ImageUnload_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_ImagehlpApiVersion", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_ImagehlpApiVersion_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_ImagehlpApiVersionEx", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_ImagehlpApiVersionEx_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_InitializeContext", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_InitializeContext_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_InitializeContext2", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_InitializeContext2_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_IsDebuggerPresent", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_IsDebuggerPresent_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_LocateXStateFeature", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_LocateXStateFeature_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_MakeSureDirectoryPathExists", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_MakeSureDirectoryPathExists_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_MapAndLoad", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_MapAndLoad_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_MapFileAndCheckSumA", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_MapFileAndCheckSumA_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_MapFileAndCheckSumW", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_MapFileAndCheckSumW_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_MessageBeep", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_MessageBeep_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_MiniDumpReadDumpStream", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_MiniDumpReadDumpStream_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_MiniDumpWriteDump", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_MiniDumpWriteDump_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_OpenThreadWaitChainSession", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_OpenThreadWaitChainSession_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_OutputDebugStringA", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_OutputDebugStringA_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_OutputDebugStringW", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_OutputDebugStringW_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_RaiseException", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_RaiseException_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_RaiseFailFastException", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_RaiseFailFastException_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_RangeMapAddPeImageSections", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_RangeMapAddPeImageSections_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_RangeMapCreate", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_RangeMapCreate_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_RangeMapFree", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_RangeMapFree_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_RangeMapRead", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_RangeMapRead_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_RangeMapRemove", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_RangeMapRemove_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_RangeMapWrite", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_RangeMapWrite_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_ReBaseImage", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_ReBaseImage_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_ReBaseImage64", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_ReBaseImage64_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_ReadProcessMemory", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_ReadProcessMemory_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_RegisterWaitChainCOMCallback", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_RegisterWaitChainCOMCallback_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_RemoveInvalidModuleList", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_RemoveInvalidModuleList_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_RemoveVectoredContinueHandler", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_RemoveVectoredContinueHandler_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_RemoveVectoredExceptionHandler", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_RemoveVectoredExceptionHandler_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_ReportSymbolLoadSummary", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_ReportSymbolLoadSummary_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_RtlAddFunctionTable", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_RtlAddFunctionTable_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_RtlAddGrowableFunctionTable", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_RtlAddGrowableFunctionTable_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_RtlCaptureContext", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_RtlCaptureContext_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_RtlCaptureContext2", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_RtlCaptureContext2_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_RtlCaptureStackBackTrace", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_RtlCaptureStackBackTrace_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_RtlDeleteFunctionTable", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_RtlDeleteFunctionTable_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_RtlDeleteGrowableFunctionTable", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_RtlDeleteGrowableFunctionTable_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_RtlGrowFunctionTable", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_RtlGrowFunctionTable_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_RtlInstallFunctionTableCallback", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_RtlInstallFunctionTableCallback_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_RtlLookupFunctionEntry", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_RtlLookupFunctionEntry_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_RtlPcToFileHeader", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_RtlPcToFileHeader_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_RtlRaiseException", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_RtlRaiseException_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_RtlRestoreContext", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_RtlRestoreContext_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_RtlUnwind", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_RtlUnwind_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_RtlUnwindEx", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_RtlUnwindEx_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_SearchTreeForFile", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_SearchTreeForFile_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_SearchTreeForFileW", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_SearchTreeForFileW_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_SetCheckUserInterruptShared", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_SetCheckUserInterruptShared_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_SetErrorMode", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_SetErrorMode_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_SetImageConfigInformation", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_SetImageConfigInformation_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_SetSymLoadError", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_SetSymLoadError_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_SetThreadContext", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_SetThreadContext_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_SetThreadErrorMode", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_SetThreadErrorMode_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_SetUnhandledExceptionFilter", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_SetUnhandledExceptionFilter_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_SetXStateFeaturesMask", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_SetXStateFeaturesMask_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_StackWalk2", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_StackWalk2_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_StackWalk64", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_StackWalk64_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_StackWalkEx", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_StackWalkEx_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_SymAddSourceStream", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_SymAddSourceStream_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_SymAddSourceStreamA", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_SymAddSourceStreamA_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_SymAddSourceStreamW", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_SymAddSourceStreamW_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_SymAddSymbol", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_SymAddSymbol_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_SymAddSymbolW", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_SymAddSymbolW_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_SymAddrIncludeInlineTrace", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_SymAddrIncludeInlineTrace_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_SymCleanup", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_SymCleanup_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_SymCompareInlineTrace", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_SymCompareInlineTrace_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_SymDeleteSymbol", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_SymDeleteSymbol_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_SymDeleteSymbolW", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_SymDeleteSymbolW_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_SymEnumLines", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_SymEnumLines_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_SymEnumLinesW", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_SymEnumLinesW_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_SymEnumProcesses", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_SymEnumProcesses_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_SymEnumSourceFileTokens", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_SymEnumSourceFileTokens_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_SymEnumSourceFiles", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_SymEnumSourceFiles_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_SymEnumSourceFilesW", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_SymEnumSourceFilesW_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_SymEnumSourceLines", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_SymEnumSourceLines_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_SymEnumSourceLinesW", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_SymEnumSourceLinesW_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_SymEnumSym", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_SymEnumSym_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_SymEnumSymbols", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_SymEnumSymbols_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_SymEnumSymbolsEx", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_SymEnumSymbolsEx_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_SymEnumSymbolsExW", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_SymEnumSymbolsExW_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_SymEnumSymbolsForAddr", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_SymEnumSymbolsForAddr_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_SymEnumSymbolsForAddrW", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_SymEnumSymbolsForAddrW_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_SymEnumSymbolsW", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_SymEnumSymbolsW_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_SymEnumTypes", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_SymEnumTypes_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_SymEnumTypesByName", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_SymEnumTypesByName_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_SymEnumTypesByNameW", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_SymEnumTypesByNameW_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_SymEnumTypesW", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_SymEnumTypesW_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_SymEnumerateModules64", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_SymEnumerateModules64_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_SymEnumerateModulesW64", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_SymEnumerateModulesW64_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_SymEnumerateSymbols64", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_SymEnumerateSymbols64_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_SymEnumerateSymbolsW64", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_SymEnumerateSymbolsW64_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_SymFindDebugInfoFile", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_SymFindDebugInfoFile_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_SymFindDebugInfoFileW", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_SymFindDebugInfoFileW_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_SymFindExecutableImage", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_SymFindExecutableImage_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_SymFindExecutableImageW", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_SymFindExecutableImageW_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_SymFindFileInPath", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_SymFindFileInPath_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_SymFindFileInPathW", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_SymFindFileInPathW_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_SymFromAddr", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_SymFromAddr_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_SymFromAddrW", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_SymFromAddrW_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_SymFromIndex", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_SymFromIndex_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_SymFromIndexW", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_SymFromIndexW_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_SymFromInlineContext", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_SymFromInlineContext_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_SymFromInlineContextW", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_SymFromInlineContextW_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_SymFromName", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_SymFromName_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_SymFromNameW", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_SymFromNameW_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_SymFromToken", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_SymFromToken_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_SymFromTokenW", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_SymFromTokenW_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_SymFunctionTableAccess64", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_SymFunctionTableAccess64_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_SymFunctionTableAccess64AccessRoutines", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_SymFunctionTableAccess64AccessRoutines_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_SymGetExtendedOption", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_SymGetExtendedOption_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_SymGetFileLineOffsets64", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_SymGetFileLineOffsets64_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_SymGetHomeDirectory", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_SymGetHomeDirectory_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_SymGetHomeDirectoryW", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_SymGetHomeDirectoryW_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_SymGetLineFromAddr64", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_SymGetLineFromAddr64_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_SymGetLineFromAddrW64", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_SymGetLineFromAddrW64_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_SymGetLineFromInlineContext", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_SymGetLineFromInlineContext_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_SymGetLineFromInlineContextW", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_SymGetLineFromInlineContextW_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_SymGetLineFromName64", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_SymGetLineFromName64_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_SymGetLineFromNameW64", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_SymGetLineFromNameW64_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_SymGetLineNext64", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_SymGetLineNext64_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_SymGetLineNextW64", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_SymGetLineNextW64_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_SymGetLinePrev64", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_SymGetLinePrev64_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_SymGetLinePrevW64", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_SymGetLinePrevW64_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_SymGetModuleBase64", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_SymGetModuleBase64_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_SymGetModuleInfo64", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_SymGetModuleInfo64_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_SymGetModuleInfoW64", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_SymGetModuleInfoW64_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_SymGetOmaps", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_SymGetOmaps_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_SymGetOptions", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_SymGetOptions_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_SymGetScope", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_SymGetScope_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_SymGetScopeW", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_SymGetScopeW_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_SymGetSearchPath", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_SymGetSearchPath_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_SymGetSearchPathW", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_SymGetSearchPathW_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_SymGetSourceFile", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_SymGetSourceFile_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_SymGetSourceFileChecksum", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_SymGetSourceFileChecksum_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_SymGetSourceFileChecksumW", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_SymGetSourceFileChecksumW_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_SymGetSourceFileFromToken", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_SymGetSourceFileFromToken_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_SymGetSourceFileFromTokenByTokenName", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_SymGetSourceFileFromTokenByTokenName_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_SymGetSourceFileFromTokenByTokenNameW", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_SymGetSourceFileFromTokenByTokenNameW_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_SymGetSourceFileFromTokenW", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_SymGetSourceFileFromTokenW_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_SymGetSourceFileToken", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_SymGetSourceFileToken_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_SymGetSourceFileTokenByTokenName", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_SymGetSourceFileTokenByTokenName_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_SymGetSourceFileTokenByTokenNameW", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_SymGetSourceFileTokenByTokenNameW_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_SymGetSourceFileTokenW", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_SymGetSourceFileTokenW_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_SymGetSourceFileW", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_SymGetSourceFileW_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_SymGetSourceVarFromToken", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_SymGetSourceVarFromToken_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_SymGetSourceVarFromTokenW", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_SymGetSourceVarFromTokenW_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_SymGetSymFromAddr64", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_SymGetSymFromAddr64_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_SymGetSymFromName64", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_SymGetSymFromName64_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_SymGetSymNext64", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_SymGetSymNext64_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_SymGetSymPrev64", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_SymGetSymPrev64_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_SymGetSymbolFile", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_SymGetSymbolFile_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_SymGetSymbolFileW", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_SymGetSymbolFileW_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_SymGetTypeFromName", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_SymGetTypeFromName_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_SymGetTypeFromNameW", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_SymGetTypeFromNameW_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_SymGetTypeInfo", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_SymGetTypeInfo_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_SymGetTypeInfoEx", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_SymGetTypeInfoEx_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_SymGetUnwindInfo", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_SymGetUnwindInfo_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_SymInitialize", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_SymInitialize_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_SymInitializeW", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_SymInitializeW_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_SymLoadModule64", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_SymLoadModule64_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_SymLoadModuleEx", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_SymLoadModuleEx_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_SymLoadModuleExW", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_SymLoadModuleExW_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_SymMatchFileName", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_SymMatchFileName_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_SymMatchFileNameW", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_SymMatchFileNameW_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_SymMatchString", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_SymMatchString_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_SymMatchStringA", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_SymMatchStringA_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_SymMatchStringW", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_SymMatchStringW_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_SymNext", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_SymNext_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_SymNextW", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_SymNextW_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_SymPrev", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_SymPrev_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_SymPrevW", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_SymPrevW_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_SymQueryInlineTrace", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_SymQueryInlineTrace_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_SymRefreshModuleList", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_SymRefreshModuleList_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_SymRegisterCallback64", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_SymRegisterCallback64_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_SymRegisterCallbackW64", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_SymRegisterCallbackW64_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_SymRegisterFunctionEntryCallback64", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_SymRegisterFunctionEntryCallback64_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_SymSearch", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_SymSearch_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_SymSearchW", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_SymSearchW_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_SymSetContext", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_SymSetContext_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_SymSetExtendedOption", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_SymSetExtendedOption_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_SymSetHomeDirectory", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_SymSetHomeDirectory_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_SymSetHomeDirectoryW", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_SymSetHomeDirectoryW_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_SymSetOptions", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_SymSetOptions_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_SymSetParentWindow", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_SymSetParentWindow_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_SymSetScopeFromAddr", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_SymSetScopeFromAddr_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_SymSetScopeFromIndex", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_SymSetScopeFromIndex_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_SymSetScopeFromInlineContext", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_SymSetScopeFromInlineContext_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_SymSetSearchPath", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_SymSetSearchPath_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_SymSetSearchPathW", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_SymSetSearchPathW_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_SymSrvDeltaName", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_SymSrvDeltaName_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_SymSrvDeltaNameW", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_SymSrvDeltaNameW_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_SymSrvGetFileIndexInfo", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_SymSrvGetFileIndexInfo_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_SymSrvGetFileIndexInfoW", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_SymSrvGetFileIndexInfoW_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_SymSrvGetFileIndexString", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_SymSrvGetFileIndexString_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_SymSrvGetFileIndexStringW", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_SymSrvGetFileIndexStringW_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_SymSrvGetFileIndexes", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_SymSrvGetFileIndexes_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_SymSrvGetFileIndexesW", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_SymSrvGetFileIndexesW_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_SymSrvGetSupplement", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_SymSrvGetSupplement_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_SymSrvGetSupplementW", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_SymSrvGetSupplementW_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_SymSrvIsStore", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_SymSrvIsStore_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_SymSrvIsStoreW", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_SymSrvIsStoreW_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_SymSrvStoreFile", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_SymSrvStoreFile_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_SymSrvStoreFileW", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_SymSrvStoreFileW_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_SymSrvStoreSupplement", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_SymSrvStoreSupplement_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_SymSrvStoreSupplementW", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_SymSrvStoreSupplementW_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_SymUnDName64", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_SymUnDName64_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_SymUnloadModule64", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_SymUnloadModule64_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_TerminateProcessOnMemoryExhaustion", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_TerminateProcessOnMemoryExhaustion_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_TouchFileTimes", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_TouchFileTimes_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_UnDecorateSymbolName", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_UnDecorateSymbolName_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_UnDecorateSymbolNameW", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_UnDecorateSymbolNameW_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_UnMapAndLoad", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_UnMapAndLoad_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_UnhandledExceptionFilter", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_UnhandledExceptionFilter_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_UpdateDebugInfoFile", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_UpdateDebugInfoFile_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_UpdateDebugInfoFileEx", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_UpdateDebugInfoFileEx_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_WaitForDebugEvent", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_WaitForDebugEvent_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_WaitForDebugEventEx", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_WaitForDebugEventEx_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_Wow64GetThreadContext", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_Wow64GetThreadContext_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_Wow64GetThreadSelectorEntry", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_Wow64GetThreadSelectorEntry_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_Wow64SetThreadContext", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_Wow64SetThreadContext_napi));
    exports.Set("windowssys_windows_win32_system_diagnostics_debug_WriteProcessMemory", Napi::Function::New(env, windowssys_windows_win32_system_diagnostics_debug_WriteProcessMemory_napi));
}

static KmNapiRegistrarNode registrar_node = { &register_windows_win32_system_diagnostics_debug_napi, nullptr };
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
